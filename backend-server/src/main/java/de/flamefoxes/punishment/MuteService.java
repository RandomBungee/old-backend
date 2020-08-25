package de.flamefoxes.punishment;

import de.flamefoxes.sql.Mysql;
import io.grpc.stub.StreamObserver;
import java.util.Optional;

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
    Mute mute = request.getMute();
    muteRepository.create(mute);
    CreateMuteResponse response = createMuteResponse(mute);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private CreateMuteResponse createMuteResponse(Mute mute) {
    return CreateMuteResponse.newBuilder()
        .setMute(mute)
        .build();
  }

  @Override
  public void find(
      FindMuteRequest request,
      StreamObserver<FindMuteResponse> responseObserver
  ) {
    String uniqueId = request.getUniqueId();
    Optional<Mute> optionalMute = muteRepository.find(uniqueId);
    Mute mute = optionalMute.orElse(noSuchPunish());
    FindMuteResponse response = findMuteRequest(mute);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private FindMuteResponse findMuteRequest(Mute mute) {
    return FindMuteResponse.newBuilder()
        .setMute(mute)
        .build();
  }

  private Mute noSuchPunish() {
    return Mute.newBuilder()
        .setName("")
        .setUniqueId("")
        .setReason("")
        .setMutedBy("")
        .setEnd(0)
        .build();
  }

  @Override
  public void delete(
      DeleteMuteRequest request,
      StreamObserver<DeleteMuteResponse> responseObserver
  ) {
    String uniqueId = request.getUniqueId();
    muteRepository.delete(uniqueId);
    DeleteMuteResponse response = deleteMuteResponse(uniqueId);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private DeleteMuteResponse deleteMuteResponse(String uniqueId) {
    return DeleteMuteResponse.newBuilder()
        .setUniqueId(uniqueId)
        .build();
  }

  @Override
  public void change(
      ChangeMuteRequest request,
      StreamObserver<ChangeMuteResponse> responseObserver
  ) {
    Mute mute = request.getMute();
    muteRepository.change(mute);
    ChangeMuteResponse response = changeMuteResponse(mute);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private ChangeMuteResponse changeMuteResponse(Mute mute) {
    return ChangeMuteResponse.newBuilder()
        .setMute(mute)
        .build();
  }

  public static MuteService create() {
    return new MuteService();
  }
}
