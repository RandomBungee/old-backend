package de.flamefoxes.client.user;

import de.flamefoxes.user.TeamUser;

public interface TeamUserRepository {

  /**
   * Create a new TeamUser in Database
   * 
   * @param uniqueId
   * @param total_bans
   * @param total_mutes
   * @param total_reports
   * @param total_reports_accept
   * @param total_reports_denied
   * @param total_wrongbans
   * @param total_wrongmutes
   * @param admission
   */
  void create(
      String uniqueId,
      long total_bans,
      long total_mutes,
      long total_reports,
      long total_reports_accept,
      long total_reports_denied,
      long total_wrongbans,
      long total_wrongmutes,
      int admission
  );

  void update(
      String uniqueId,
      long total_bans,
      long total_mutes,
      long total_reports,
      long total_reports_accept,
      long total_reports_denied,
      long total_wrongbans,
      long total_wrongmutes,
      int admission
  );

  TeamUser find(String uniqueId);
}
