package com.gitlab.leonklein.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SqlUserRepository implements UserRepository {
  private List<User> users;
  private final Connection CONNECTION;

  private SqlUserRepository(Connection connection) {
    this.CONNECTION = connection;
    this.users = new ArrayList<>();
  }

  @Override
  public void create(User user) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("INSERT INTO dye_user (unique_id,user_rank,coins,global_wins,ban_points) VALUES (?,?,?,?,?)");
      insertStatement(preparedStatement, user);
    } catch (SQLException statementCreateFail) {
      System.err.println("Can´t create User: " + statementCreateFail.getMessage());
    }
  }

  private void insertStatement(
      PreparedStatement preparedStatement,
      User user
  ) throws SQLException {
    preparedStatement.setString(1, user.getUniqueId());
    preparedStatement.setString(2, user.getRank());
    preparedStatement.setLong(3, user.getCoins());
    preparedStatement.setLong(4, user.getWins());
    preparedStatement.setLong(5, user.getBanPoints());
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public void update(User user) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("UPDATE dye_user SET user_rank = ?, coins = ?, global_wins = ?, ban_points = ? WHERE unique_id = ?");
      updateStatement(preparedStatement, user);
    } catch (SQLException updateStatementFail) {
      System.err.println("Can´t update User: " + updateStatementFail.getMessage());
    }
  }

  private void updateStatement(
      PreparedStatement preparedStatement,
      User user
  ) throws SQLException {
    preparedStatement.setString(1, user.getRank());
    preparedStatement.setLong(2, user.getCoins());
    preparedStatement.setLong(3, user.getWins());
    preparedStatement.setLong(4, user.getBanPoints());
    preparedStatement.setString(5, user.getUniqueId());
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public Optional<User> find(String uniqueId) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("SELECT * FROM dye_user WHERE unique_id = ?");
      return findStatement(preparedStatement, uniqueId);
    } catch (SQLException findStatementFail) {
      System.err.println("Can´t find User: " + findStatementFail.getMessage());
    }
    return Optional.empty();
  }

  private Optional<User> findStatement(
      PreparedStatement preparedStatement,
      String uniqueId
  ) throws SQLException {
    preparedStatement.setString(1, uniqueId);
    ResultSet resultSet = preparedStatement.executeQuery();
    if(resultSet.next()) {
      User user = User.newBuilder()
          .setUniqueId(uniqueId)
          .setRank(resultSet.getString("user_rank"))
          .setCoins(resultSet.getLong("coins"))
          .setBanPoints(resultSet.getLong("ban_points"))
          .setWins(resultSet.getLong("global_wins"))
          .build();
      return Optional.of(user);
    }
    return Optional.empty();
  }

  @Override
  public List<User> list() {
    return users;
  }

  public static SqlUserRepository create(Connection connection) {
    return new SqlUserRepository(connection);
  }

  private void updateAndCloseStatement(PreparedStatement preparedStatement) throws SQLException {
    preparedStatement.executeUpdate();
    preparedStatement.close();
    System.out.println("Statement was updated and closed!");
  }
}