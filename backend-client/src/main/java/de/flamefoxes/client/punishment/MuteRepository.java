package de.flamefoxes.client.punishment;

import de.flamefoxes.punishment.Mute;

public interface MuteRepository {
  void create(
      String name,
      String uniqueId,
      String reason,
      String bannedBy,
      long end
  );

  void delete(String uniqueId);

  void change(
      String uniqueId,
      long end
  );

  Mute find(String uniqueId);
}
