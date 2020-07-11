package com.gitlab.leonklein.client.user;

import com.gitlab.leonklein.user.CreateTeamUserRequest;
import com.gitlab.leonklein.user.CreateTeamUserResponse;
import com.gitlab.leonklein.user.FindTeamUserRequest;
import com.gitlab.leonklein.user.FindTeamUserResponse;
import com.gitlab.leonklein.user.TeamUser;
import com.gitlab.leonklein.user.TeamUserServiceGrpc.TeamUserServiceBlockingStub;
import com.gitlab.leonklein.user.UpdateTeamUserRequest;
import com.gitlab.leonklein.user.UpdateTeamUserResponse;

public class InMemoryTeamUserRepository implements TeamUserRepository {
  private final TeamUserServiceBlockingStub blockingStub;

  private InMemoryTeamUserRepository(TeamUserServiceBlockingStub blockingStub) {
    this.blockingStub = blockingStub;
  }

  @Override
  public void create(
      String uniqueId,
      long total_bans,
      long total_mutes,
      long total_reports,
      long total_reports_accept,
      long total_reports_denied,
      long total_wrongbans,
      long total_wrongmutes,
      int admission
  ) {
    TeamUser teamUser = createUser(
        uniqueId,
        total_bans,
        total_mutes,
        total_reports,
        total_reports_accept,
        total_reports_denied,
        total_wrongbans,
        total_wrongmutes,
        admission
    );
    CreateTeamUserRequest userRequest = createTeamUserResponse(teamUser);
    CreateTeamUserResponse userResponse = blockingStub.create(userRequest);
    System.out.println("User was created: " + userResponse.getTeamuser().getUniqueId());
  }

  private CreateTeamUserRequest createTeamUserResponse(TeamUser teamUser) {
    return CreateTeamUserRequest.newBuilder()
        .setTeamuser(teamUser)
        .build();
  }

  private TeamUser createUser(
      String uniqueId,
      long total_bans,
      long total_mutes,
      long total_reports,
      long total_reports_accept,
      long total_reports_denied,
      long total_wrongbans,
      long total_wrongmutes,
      int admission
  ) {
    return TeamUser.newBuilder()
        .setUniqueId(uniqueId)
        .setTotalBans(total_bans)
        .setTotalMutes(total_mutes)
        .setTotalReports(total_reports)
        .setTotalReportAccept(total_reports_accept)
        .setTotalReportDenied(total_reports_denied)
        .setTotalWrongbans(total_wrongbans)
        .setTotalWrongmutes(total_wrongmutes)
        .setAdmission(admission)
        .build();
  }

  @Override
  public void update(
      String uniqueId,
      long total_bans,
      long total_mutes,
      long total_reports,
      long total_reports_accept,
      long total_reports_denied,
      long total_wrongbans,
      long total_wrongmutes,
      int admission)
  {
    TeamUser teamUser = updateUser(
        uniqueId,
        total_bans,
        total_mutes,
        total_reports,
        total_reports_accept,
        total_reports_denied,
        total_wrongbans,
        total_wrongmutes,
        admission
    );
    UpdateTeamUserRequest userRequest = updateTeamUserRequest(teamUser);
    UpdateTeamUserResponse userResponse = blockingStub.update(userRequest);
    System.out.println("Updated User: " + userRequest.getTeamuser().getUniqueId());
  }

  private UpdateTeamUserRequest updateTeamUserRequest(TeamUser teamUser) {
    return UpdateTeamUserRequest.newBuilder()
        .setTeamuser(teamUser)
        .build();
  }

  private TeamUser updateUser(
      String uniqueId,
      long total_bans,
      long total_mutes,
      long total_reports,
      long total_reports_accept,
      long total_reports_denied,
      long total_wrongbans,
      long total_wrongmutes,
      int admission
  ) {
    return TeamUser.newBuilder()
        .setUniqueId(uniqueId)
        .setTotalBans(total_bans)
        .setTotalMutes(total_mutes)
        .setTotalReports(total_reports)
        .setTotalReportAccept(total_reports_accept)
        .setTotalReportDenied(total_reports_denied)
        .setTotalWrongbans(total_wrongbans)
        .setTotalWrongmutes(total_wrongmutes)
        .setAdmission(admission)
        .build();
  }

  @Override
  public TeamUser find(String uniqueId) {
    FindTeamUserRequest teamUserRequest = findTeamUserRequest(uniqueId);
    FindTeamUserResponse userResponse = blockingStub.find(teamUserRequest);
    return userResponse.getTeamuser();
  }

  private FindTeamUserRequest findTeamUserRequest(String uniqueId) {
    return FindTeamUserRequest.newBuilder()
        .setUniqueId(uniqueId)
        .build();
  }

  public static InMemoryTeamUserRepository create(TeamUserServiceBlockingStub blockingStub) {
    return new InMemoryTeamUserRepository(blockingStub);
  }
}
