package de.flamefoxes.punishment;

import de.flamefoxes.sql.Mysql;
import io.grpc.stub.StreamObserver;
import java.util.Optional;

public class PunishService extends PunishServiceGrpc.PunishServiceImplBase {
  private final PunishRepository punishRepository;

  private PunishService() { this.punishRepository = SqlPunishRepository.create(
      Mysql.connection); }

  @Override
  public void create(
      CreatePunishRequest request,
      StreamObserver<CreatePunishResponse> responseObserver
  ) {
    Punish punish = request.getPunish();
    punishRepository.create(punish);
    CreatePunishResponse response = createPunishResponse(punish);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private CreatePunishResponse createPunishResponse(Punish punish) {
    return CreatePunishResponse.newBuilder()
        .setPunish(punish)
        .build();
  }

  @Override
  public void find(
      FindPunishRequest request,
      StreamObserver<FindPunishResponse> responseObserver
  ) {
    String uniqueId = request.getUniqueId();
    Optional<Punish> punishOptional = punishRepository.find(uniqueId);
    Punish punish = punishOptional.orElse(noSuchPunish());
    FindPunishResponse response = findPunishResponse(punish);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private FindPunishResponse findPunishResponse(Punish punish) {
    return FindPunishResponse.newBuilder()
        .setPunish(punish)
        .build();
  }

  private Punish noSuchPunish() {
    return Punish.newBuilder()
        .setName("")
        .setUniqueId("")
        .setReason("")
        .setBannedBy("")
        .setEnd(0)
        .build();
  }

  @Override
  public void delete(
      DeletePunishRequest request,
      StreamObserver<DeletePunishResponse> responseObserver
  ) {
    String uniqueId = request.getUniqueId();
    punishRepository.delete(uniqueId);
    DeletePunishResponse response = deletePunishResponse(uniqueId);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private DeletePunishResponse deletePunishResponse(String uniqueId) {
    return DeletePunishResponse.newBuilder()
        .setUniqueId(uniqueId)
        .build();
  }

  @Override
  public void change(
      ChangePunishRequest request,
      StreamObserver<ChangePunishResponse> responseObserver
  ) {
    Punish punish = request.getPunish();
    punishRepository.change(punish);
    ChangePunishResponse changePunishResponse = changePunishResponse(punish);
    responseObserver.onNext(changePunishResponse);
    responseObserver.onCompleted();
  }

  private ChangePunishResponse changePunishResponse(Punish punish) {
    return ChangePunishResponse.newBuilder()
        .setPunish(punish)
        .build();
  }

  public static PunishService create() {
    return new PunishService();
  }
}
