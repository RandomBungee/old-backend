package com.gitlab.leonklein.user;

import com.gitlab.leonklein.sql.Mysql;
import io.grpc.stub.StreamObserver;
import java.util.Optional;

public class TeamUserService extends TeamUserServiceGrpc.TeamUserServiceImplBase {
  private final TeamUserRepository teamUserRepository;

  private TeamUserService() {
    this.teamUserRepository = SqlTeamUserServiceRepository
        .create(Mysql.connection);
  }

  @Override
  public void create(
      CreateTeamUserRequest request,
      StreamObserver<CreateTeamUserResponse> responseObserver
  ) {
    TeamUser teamUser = request.getTeamuser();
    CreateTeamUserResponse userRequest = createTeamUserRequest(teamUser);
    teamUserRepository.create(teamUser);
    responseObserver.onNext(userRequest);
    responseObserver.onCompleted();
  }

  private CreateTeamUserResponse createTeamUserRequest(TeamUser teamUser) {
    return CreateTeamUserResponse.newBuilder()
        .setTeamuser(teamUser)
        .build();
  }

  @Override
  public void update(
      UpdateTeamUserRequest request,
      StreamObserver<UpdateTeamUserResponse> responseObserver
  ) {
    TeamUser teamUser = request.getTeamuser();
    UpdateTeamUserResponse userResponse = updateTeamUserResponse(teamUser);
    teamUserRepository.update(teamUser);
    responseObserver.onNext(userResponse);
    responseObserver.onCompleted();
  }

  private UpdateTeamUserResponse updateTeamUserResponse(TeamUser teamUser) {
    return UpdateTeamUserResponse.newBuilder()
        .setTeamuser(teamUser)
        .setTotalBans(teamUser.getTotalBans())
        .setTotalMutes(teamUser.getTotalMutes())
        .setTotalWrongban(teamUser.getTotalWrongbans())
        .setTotalWrongmute(teamUser.getTotalWrongmutes())
        .setTotalReports(teamUser.getTotalReports())
        .setTotalReportsAccept(teamUser.getTotalReportAccept())
        .setTotalReportsDenied(teamUser.getTotalReportDenied())
        .setAdmission(teamUser.getAdmission())
        .build();
  }

  @Override
  public void find(
      FindTeamUserRequest request,
      StreamObserver<FindTeamUserResponse> responseObserver
  ) {
    String uniqueId = request.getUniqueId();
    Optional<TeamUser> optionalTeamUser = teamUserRepository.find(uniqueId);
    TeamUser teamUser = optionalTeamUser.orElse(noSuchUser());
    FindTeamUserResponse userResponse = findTeamUserResponse(teamUser);
    responseObserver.onNext(userResponse);
    responseObserver.onCompleted();
  }

  private FindTeamUserResponse findTeamUserResponse(TeamUser teamUser) {
    return FindTeamUserResponse.newBuilder()
        .setTeamuser(teamUser)
        .build();
  }

  private TeamUser noSuchUser() {
    return TeamUser.newBuilder()
        .setUniqueId("")
        .setTotalBans(0)
        .setTotalMutes(0)
        .setTotalWrongbans(0)
        .setTotalWrongmutes(0)
        .setTotalReports(0)
        .setTotalReportAccept(0)
        .setTotalReportDenied(0)
        .setAdmission(0)
        .build();

  }

  public static TeamUserService create() {
    return new TeamUserService();
  }
}
