package de.flamefoxes.punishment;

import de.flamefoxes.sql.Mysql;
import io.grpc.stub.StreamObserver;

public class MuteService extends MuteServiceGrpc.MuteServiceImplBase {
  private final MuteRepository muteRepository;

  private MuteService() {
    muteRepository = SqlMuteRepository.create(Mysql.connection);
  }

  @Override
  public void create(
      CreateMuteRequest request,
      StreamObserver<CreateMuteResponse> responseObserver
  ) {

  }

  @Override
  public void find(
      FindMuteRequest request,
      StreamObserver<FindMuteResponse> responseObserver
  ) {

  }

  @Override
  public void delete(
      DeleteMuteRequest request,
      StreamObserver<DeleteMuteResponse> responseObserver
  ) {

  }

  @Override
  public void change(
      ChangeMuteRequest request,
      StreamObserver<ChangeMuteResponse> responseObserver
  ) {

  }

  public static MuteService create() {
    return new MuteService();
  }
}
