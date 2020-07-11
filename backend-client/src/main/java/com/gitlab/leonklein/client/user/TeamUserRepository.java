package com.gitlab.leonklein.client.user;

import com.gitlab.leonklein.user.TeamUser;

public interface TeamUserRepository {
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
