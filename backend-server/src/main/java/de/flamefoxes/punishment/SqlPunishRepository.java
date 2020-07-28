package de.flamefoxes.punishment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public final class SqlPunishRepository implements PunishRepository {
  private final Connection connection;

  private SqlPunishRepository(Connection connection) { this.connection = connection; }

  @Override
  public void create(Punish punish) {
    try {
      PreparedStatement preparedStatement =
          connection.prepareStatement(
          "INSERT INTO bans (name,unique_id,reason,banned_by,end) VALUES (?,?,?,?,?)"
      );
    } catch (SQLException createStatementFail) {
      System.err.println("Can´t create Punish: " + createStatementFail.getMessage());
    }
  }

  private void insertStatement(
      PreparedStatement preparedStatement,
      Punish punish
  ) throws SQLException {
    preparedStatement.setString(1, punish.getName());
    preparedStatement.setString(2, punish.getUniqueId());
    preparedStatement.setString(3, punish.getReason());
    preparedStatement.setString(4, punish.getBannedBy());
    preparedStatement.setLong(5, punishTime(punish));
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public void delete(String uniqueId) {
    try {
      PreparedStatement preparedStatement =
          connection.prepareStatement("DELETE FROM bans WHERE unique_id = ?");
      deleteStatement(preparedStatement, uniqueId);
    } catch (SQLException deleteStatementFail) {
      System.err.println("Can´t delete Punish: " + deleteStatementFail.getMessage());
    }
  }

  private void deleteStatement(
      PreparedStatement preparedStatement,
      String uniqueId
  ) throws SQLException {
    preparedStatement.setString(1, uniqueId);
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public void change(Punish punish) {
    try {
      PreparedStatement preparedStatement =
          connection.prepareStatement("UPDATE bans SET end = ? WHERE unique_id = ?");
      changeStatement(preparedStatement, punish);
    } catch (SQLException changeStatementFail) {
      System.err.println("Can´t update Punish: " + changeStatementFail.getMessage());
    }
  }

  private void changeStatement(
      PreparedStatement preparedStatement,
      Punish punish
  ) throws SQLException {
    preparedStatement.setLong(1, punishTime(punish));
    preparedStatement.setString(2, punish.getUniqueId());
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public Optional<Punish> find(String uniqueId) {
    try {
      PreparedStatement preparedStatement =
          connection.prepareStatement("SELECT * FROM bans WHERE unique_id = ?");
      return findStatement(preparedStatement, uniqueId);
    } catch (SQLException findStatementFail) {
      System.err.println("Can´t find Punish: " + findStatementFail.getMessage());
    }
    return Optional.empty();
  }

  private Optional<Punish> findStatement(
      PreparedStatement preparedStatement,
      String uniqueId
  ) throws SQLException {
    preparedStatement.setString(1, uniqueId);
    ResultSet resultSet = preparedStatement.executeQuery();
    if(resultSet.next()) {
      Punish punish = Punish.newBuilder()
          .setName(resultSet.getString("name"))
          .setUniqueId(uniqueId)
          .setReason(resultSet.getString("reason"))
          .setBannedBy(resultSet.getString("banned_by"))
          .setEnd(resultSet.getLong("end"))
          .build();
      return Optional.of(punish);
    }
    return Optional.empty();
  }

  public static SqlPunishRepository create(Connection connection) {
    return new SqlPunishRepository(connection);
  }

  private long punishTime(Punish punish) {
    long end = 0L;
    if(punish.getEnd() == -1) {
      end = -1;
    } else {
      long current = System.currentTimeMillis();
      long millis = punish.getEnd() * 1000;
      end = current + millis;
    }
    return end;
  }

  private void updateAndCloseStatement(PreparedStatement preparedStatement) throws SQLException {
    preparedStatement.executeUpdate();
    preparedStatement.close();
    System.out.println("Statement was updated and closed!");
  }
}
