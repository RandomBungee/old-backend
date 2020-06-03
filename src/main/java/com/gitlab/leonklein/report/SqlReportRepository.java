package com.gitlab.leonklein.report;

import com.gitlab.leonklein.punishment.Punish;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class SqlReportRepository implements ReportRepository {
  private final Connection CONNECTION;

  private SqlReportRepository(Connection connection) { this.CONNECTION = connection; }

  @Override
  public void create(Report report) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("INSERT INTO reports (reported,server,reason,reported_by) VALUES (?,?,?,?)");
      insertStatement(preparedStatement, report);
    } catch (SQLException statementCreateFail) {
      System.err.println("Can´t create Report: " + statementCreateFail.getMessage());
    }
  }

  private void insertStatement(
      PreparedStatement preparedStatement,
      Report report
  ) throws SQLException {
    preparedStatement.setString(1, report.getReported());
    preparedStatement.setString(2, report.getServer());
    preparedStatement.setString(3, report.getReason());
    preparedStatement.setString(4, report.getReportedBy());
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public void delete(String name) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("DELETE FROM reports WHERE name = ?");
      deleteStatement(preparedStatement, name);
    } catch (SQLException deleteStatementFail) {
      System.err.println("Can´t delete Report: " + deleteStatementFail.getMessage());
    }
  }

  private void deleteStatement(
      PreparedStatement preparedStatement,
      String name
  ) throws SQLException {
    preparedStatement.setString(1, name);
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public void change(Report report) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("UPDATE report SET server = ? WHERE name = ?");
      changeStatement(preparedStatement, report);
    } catch (SQLException changeStatementFail) {
      System.err.println("Can´t update Report: " + changeStatementFail.getMessage());
    }
  }

  private void changeStatement(
      PreparedStatement preparedStatement,
      Report report
  ) throws SQLException {
    preparedStatement.setString(1, report.getServer());
    preparedStatement.setString(2, report.getReported());
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public Optional<Report> find(String name) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("SELECT * FROM report WHERE name = ?");
      return findStatement(preparedStatement, name);
    } catch (SQLException findStatementFail) {
      System.err.println("Can´t find Punish: " + findStatementFail.getMessage());
    }
    return Optional.empty();
  }

  private Optional<Report> findStatement(
      PreparedStatement preparedStatement,
      String name
  ) throws SQLException {
    preparedStatement.setString(1, name);
    ResultSet resultSet = preparedStatement.executeQuery();
    if(resultSet.next()) {
      Report report = Report.newBuilder()
          .setReported(name)
          .setReason(resultSet.getString("reason"))
          .setReportedBy(resultSet.getString("reported_by"))
          .setServer(resultSet.getString("server"))
          .build();
      return Optional.of(report);
    }
    return Optional.empty();
  }

  public static SqlReportRepository create(Connection connection) {
    return new SqlReportRepository(connection);
  }

  private void updateAndCloseStatement(PreparedStatement preparedStatement) throws SQLException {
    preparedStatement.executeUpdate();
    preparedStatement.close();
    System.out.println("Statement was updated and closed!");
  }
}
