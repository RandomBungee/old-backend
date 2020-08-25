package de.flamefoxes.client.punishment;


import de.flamefoxes.punishment.ChangeMuteRequest;
import de.flamefoxes.punishment.ChangeMuteResponse;
import de.flamefoxes.punishment.CreateMuteRequest;
import de.flamefoxes.punishment.CreateMuteResponse;
import de.flamefoxes.punishment.DeleteMuteRequest;
import de.flamefoxes.punishment.DeleteMuteResponse;
import de.flamefoxes.punishment.FindMuteRequest;
import de.flamefoxes.punishment.FindMuteResponse;
import de.flamefoxes.punishment.Mute;
import de.flamefoxes.punishment.MuteServiceGrpc.MuteServiceBlockingStub;

public class InMemoryMuteRepository implements MuteRepository {
  private final MuteServiceBlockingStub muteService;

  private InMemoryMuteRepository(MuteServiceBlockingStub muteService) {
    this.muteService = muteService;
  }

  @Override
  public void create(
      String name,
      String uniqueId,
      String reason,
      String bannedBy,
      long end
  ) {
    CreateMuteRequest request = createMutehRequest
        (name, uniqueId, reason, bannedBy, end);
    CreateMuteResponse response = muteService.create(request);
    System.out.println("Ban was created: " + response.getMute().getReason());
  }

  private CreateMuteRequest createMutehRequest(
      String name,
      String uniqueId,
      String reason,
      String bannedBy,
      long end
  ) {
    return CreateMuteRequest.newBuilder()
        .setMute(createMute(
            name,
            uniqueId,
            reason,
            bannedBy,
            end
        ))
        .build();
  }

  private Mute createMute(
      String name,
      String uniqueId,
      String reason,
      String bannedBy,
      long end
  ) {
    return Mute.newBuilder()
        .setName(name)
        .setUniqueId(uniqueId)
        .setReason(reason)
        .setMutedBy(bannedBy)
        .setEnd(end)
        .build();
  }

  @Override
  public void delete(String uniqueId) {
    DeleteMuteRequest request = deleteMuteRequest(uniqueId);
    DeleteMuteResponse response = muteService.delete(request);
    System.out.println("Ban was deleted: " + response.getUniqueId());
  }

  private DeleteMuteRequest deleteMuteRequest(String uniqueId) {
    return DeleteMuteRequest.newBuilder()
        .setUniqueId(uniqueId)
        .build();
  }

  @Override
  public void change(
      String uniqueId,
      long end
  ) {
    Mute mute = find(uniqueId);
    ChangeMuteRequest request = changeMuteRequest
        (mute, uniqueId, end);
    ChangeMuteResponse response = muteService.change(request);
    System.out.println("Ban was updated: " + response.getMute().getEnd());
  }

  private ChangeMuteRequest changeMuteRequest(
      Mute mute,
      String uniqueId,
      long end
  ) {
    return ChangeMuteRequest.newBuilder()
        .setMute(changeMute(mute, uniqueId, end))
        .build();
  }

  private Mute changeMute(
      Mute Mute,
      String uniqueId,
      long end
  ) {
    return Mute.newBuilder()
        .setName(Mute.getName())
        .setUniqueId(uniqueId)
        .setReason(Mute.getReason())
        .setMutedBy(Mute.getMutedBy())
        .setEnd(end)
        .build();
  }

  @Override
  public Mute find(String uniqueId) {
    FindMuteRequest request = findMuteRequest(uniqueId);
    FindMuteResponse response = muteService.find(request);
    return response.getMute();
  }

  private FindMuteRequest findMuteRequest(String uniqueId) {
    return FindMuteRequest.newBuilder()
        .setUniqueId(uniqueId)
        .build();
  }

  public static InMemoryMuteRepository create(MuteServiceBlockingStub muteService) {
    return new InMemoryMuteRepository(muteService);
  }
}
