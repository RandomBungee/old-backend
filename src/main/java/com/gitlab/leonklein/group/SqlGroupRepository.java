package com.gitlab.leonklein.group;

import com.google.protobuf.ProtocolStringList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SqlGroupRepository implements GroupRepository {
  private final Connection CONNECTION;
  private List<Group> groups;

  private SqlGroupRepository(Connection connection) {
    this.CONNECTION = connection;
    this.groups = new ArrayList<>();
  }

  @Override
  public void create(Group group) {
    try {
      PreparedStatement preparedStatement
          = CONNECTION.prepareStatement("INSERT INTO permission_group (name,permissions) VALUES (?,?);");
      insertStatement(preparedStatement, group);
      updateAndCloseStatement(preparedStatement);
    } catch (SQLException statementCreateFail) {
      System.err.println("Can´t create Group: " + statementCreateFail.getMessage());
    }
  }

  private void insertStatement(
      PreparedStatement preparedStatement,
      Group group
  ) throws SQLException {
    preparedStatement.setString(1, group.getName());
    preparedStatement.setString(2, getPermissions(group));
  }

  @Override
  public void update(Group group) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("UPDATE permission_group SET permissions = ? WHERE name = ?");
      updateStatement(preparedStatement, group);
    } catch (SQLException updateStatementFail) {
      System.err.println("Can´t update Group: " + updateStatementFail.getMessage());
    }
  }

  private void updateStatement(
      PreparedStatement preparedStatement,
      Group group
  ) throws SQLException {
    preparedStatement.setString(1, getPermissions(group));
    preparedStatement.setString(2, group.getName());
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public Optional<Group> findGroup(String name) {
    try {
      PreparedStatement preparedStatement
          = CONNECTION.prepareStatement("SELECT * FROM permission_group WHERE name = ?");
      return findStatement(preparedStatement, name);
    } catch (SQLException statementFindFail) {
      System.err.println("Can´t find Group: " + statementFindFail.getMessage());
    }
    return Optional.empty();
  }

  @Override
  public List<Group> list() {
    return groups;
  }

  private Optional<Group> findStatement(
      PreparedStatement preparedStatement,
      String name
  ) throws SQLException {
    preparedStatement.setString(1, name);
    ResultSet resultSet = preparedStatement.executeQuery();
    if(resultSet.next()) {
      String permissions = resultSet.getString("permissions");
      Group group = Group.newBuilder()
          .setName(name)
          .addAllPermissions(Arrays.asList(permissions.split(", ")))
          .build();
      return Optional.of(group);
    }
    return Optional.empty();
  }

  public static SqlGroupRepository create(Connection connection) {
    return new SqlGroupRepository(connection);
  }

  private String getPermissions(Group group) {
    ProtocolStringList permissionsList = group.getPermissionsList();
    StringBuilder stringPermissionBuilder = new StringBuilder();
    for(String permissions : permissionsList) {
      stringPermissionBuilder.append(permissions);
      stringPermissionBuilder.append(", ");
    }
    return stringPermissionBuilder.toString();
  }

  private void updateAndCloseStatement(PreparedStatement preparedStatement) throws SQLException {
    preparedStatement.executeUpdate();
    preparedStatement.close();
    System.err.println("Can´t finish Statement because of an error in SQL-Statement");
  }
}
