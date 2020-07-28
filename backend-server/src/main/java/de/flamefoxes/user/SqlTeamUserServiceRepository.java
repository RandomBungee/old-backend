package de.flamefoxes.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public final class SqlTeamUserServiceRepository implements TeamUserRepository {
  private final Connection connection;

  private SqlTeamUserServiceRepository(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void create(TeamUser teamUser) {
    try {
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "INSERT INTO team_user "
                  + "(unique_id,total_bans,total_mutes,total_wrongbans,total_wrongmutes,total_reports,"
                  + "total_reports_accept,total_reports_denied,admission)"
                  + " VALUES (?,?,?,?,?,?,?,?,?,?)"
          );
      createTeamUserStatement(preparedStatement, teamUser);
    } catch (SQLException statementCreateFail) {
      System.err.println(
          "Can´t create TeamUser: " + statementCreateFail.getMessage());
    }
  }

  private void createTeamUserStatement(
      PreparedStatement preparedStatement,
      TeamUser teamUser
  ) throws SQLException {
    preparedStatement.setString(1, teamUser.getUniqueId());
    preparedStatement.setLong(2, teamUser.getTotalBans());
    preparedStatement.setLong(3, teamUser.getTotalMutes());
    preparedStatement.setLong(4, teamUser.getTotalWrongbans());
    preparedStatement.setLong(5, teamUser.getTotalWrongmutes());
    preparedStatement.setLong(6, teamUser.getTotalReports());
    preparedStatement.setLong(7, teamUser.getTotalReportAccept());
    preparedStatement.setLong(8, teamUser.getTotalReportDenied());
    preparedStatement.setInt(9, teamUser.getAdmission());
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public void update(TeamUser teamUser) {
    try {
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "UPDATE team_user"
                  + " SET totoal_bans = ?, total_mutes = ?, total_wrongbans = ?, total_wrongmutes = ?, total_reports = ?,"
                  + " total_reports_accept = ?, total_reports_denied = ?, admission = ?"
                  + " WHERE unique_id = ?"
          );
      updateStatement(preparedStatement, teamUser);
    } catch (SQLException updateUserFail) {
      System.err.println("Can´t update User: " + updateUserFail.getMessage());
    }
  }

  private void updateStatement(
      PreparedStatement preparedStatement,
      TeamUser teamUser
  ) throws SQLException {
    preparedStatement.setLong(1, teamUser.getTotalBans());
    preparedStatement.setLong(2, teamUser.getTotalMutes());
    preparedStatement.setLong(3, teamUser.getTotalWrongbans());
    preparedStatement.setLong(4, teamUser.getTotalWrongmutes());
    preparedStatement.setLong(5, teamUser.getTotalReports());
    preparedStatement.setLong(6, teamUser.getTotalReportAccept());
    preparedStatement.setLong(7, teamUser.getTotalReportDenied());
    preparedStatement.setInt(8, teamUser.getAdmission());
    preparedStatement.setString(9, teamUser.getUniqueId());
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public Optional<TeamUser> find(String uniqueId) {
    try {
      PreparedStatement preparedStatement =
          connection.prepareStatement("SELECT * FROM team_user WHERE unique_id = ?");
      return findStatement(preparedStatement, uniqueId);
    } catch (SQLException cantFindUser) {
      System.err.println("Can´t find User: " + cantFindUser.getMessage());
    }
    return Optional.empty();
  }

  private Optional<TeamUser> findStatement(
      PreparedStatement preparedStatement,
      String uniqueId
  ) throws SQLException {
    preparedStatement.setString(1, uniqueId);
    ResultSet resultSet = preparedStatement.executeQuery();
    if(resultSet.next()) {
      TeamUser user = TeamUser.newBuilder()
          .setUniqueId(uniqueId)
          .setTotalBans(resultSet.getLong("total_bans"))
          .setTotalMutes(resultSet.getLong("total_mutes"))
          .setTotalWrongbans(resultSet.getLong("total_wrongbans"))
          .setTotalWrongmutes(resultSet.getLong("total_wrongmutes"))
          .setTotalReports(resultSet.getLong("total_reports"))
          .setTotalReportAccept(resultSet.getLong("total_reports_accept"))
          .setTotalReportDenied(resultSet.getLong("total_reports_denied"))
          .setAdmission(resultSet.getInt("admission"))
          .build();
      return Optional.of(user);
    }
    return Optional.empty();
  }

  private void updateAndCloseStatement(PreparedStatement preparedStatement)
      throws SQLException {
    preparedStatement.executeUpdate();
    preparedStatement.close();
  }

  public static SqlTeamUserServiceRepository create(Connection connection) {
    return new SqlTeamUserServiceRepository(connection);
  }
}
