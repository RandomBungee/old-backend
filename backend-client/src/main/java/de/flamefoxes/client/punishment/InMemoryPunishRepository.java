package de.flamefoxes.client.punishment;

import de.flamefoxes.punishment.ChangePunishRequest;
import de.flamefoxes.punishment.ChangePunishResponse;
import de.flamefoxes.punishment.CreatePunishRequest;
import de.flamefoxes.punishment.CreatePunishResponse;
import de.flamefoxes.punishment.DeletePunishRequest;
import de.flamefoxes.punishment.DeletePunishResponse;
import de.flamefoxes.punishment.FindPunishRequest;
import de.flamefoxes.punishment.FindPunishResponse;
import de.flamefoxes.punishment.Punish;
import de.flamefoxes.punishment.PunishServiceGrpc.PunishServiceBlockingStub;

public class InMemoryPunishRepository implements PunishRepository {
  private final PunishServiceBlockingStub PUNISH_SERVICE;

  private InMemoryPunishRepository(PunishServiceBlockingStub blockingStub) {
    PUNISH_SERVICE =  blockingStub;
  }

  @Override
  public void create(
      String name,
      String uniqueId,
      String reason,
      String bannedBy,
      long end
  ) {
    CreatePunishRequest request = createPunishRequest
        (name, uniqueId, reason, bannedBy, end);
    CreatePunishResponse response = PUNISH_SERVICE.create(request);
    System.out.println("Ban was created: " + response.getPunish().getReason());
  }

  private CreatePunishRequest createPunishRequest(
      String name,
      String uniqueId,
      String reason,
      String bannedBy,
      long end
  ) {
    return CreatePunishRequest.newBuilder()
        .setPunish(createPunish(
            name,
            uniqueId,
            reason,
            bannedBy,
            end
        ))
        .build();
  }

  private Punish createPunish(
      String name,
      String uniqueId,
      String reason,
      String bannedBy,
      long end
  ) {
    return Punish.newBuilder()
        .setName(name)
        .setUniqueId(uniqueId)
        .setReason(reason)
        .setBannedBy(bannedBy)
        .setEnd(end)
        .build();
  }

  @Override
  public void delete(String uniqueId) {
    DeletePunishRequest request = deletePunishRequest(uniqueId);
    DeletePunishResponse response = PUNISH_SERVICE.delete(request);
    System.out.println("Ban was deleted: " + response.getUniqueId());
  }

  private DeletePunishRequest deletePunishRequest(String uniqueId) {
    return DeletePunishRequest.newBuilder()
        .setUniqueId(uniqueId)
        .build();
  }

  @Override
  public void change(
      String uniqueId,
      long end
  ) {
    Punish punish = find(uniqueId);
    ChangePunishRequest request = changePunishRequest
        (punish, uniqueId, end);
    ChangePunishResponse response = PUNISH_SERVICE.change(request);
    System.out.println("Ban was updated: " + response.getPunish().getEnd());
  }

  private ChangePunishRequest changePunishRequest(
      Punish punish,
      String uniqueId,
      long end
  ) {
    return ChangePunishRequest.newBuilder()
        .setPunish(changePunish(punish, uniqueId, end))
        .build();
  }

  private Punish changePunish(
      Punish punish,
      String uniqueId,
      long end
  ) {
    return Punish.newBuilder()
        .setName(punish.getName())
        .setUniqueId(uniqueId)
        .setReason(punish.getReason())
        .setBannedBy(punish.getBannedBy())
        .setEnd(end)
        .build();
  }

  @Override
  public Punish find(String uniqueId) {
    FindPunishRequest request = findPunishRequest(uniqueId);
    FindPunishResponse response = PUNISH_SERVICE.find(request);
    return response.getPunish();
  }

  private FindPunishRequest findPunishRequest(String uniqueId) {
    return FindPunishRequest.newBuilder()
        .setUniqueId(uniqueId)
        .build();
  }

  public static InMemoryPunishRepository create(PunishServiceBlockingStub blockingStub) {
    return new InMemoryPunishRepository(blockingStub);
  }
}
