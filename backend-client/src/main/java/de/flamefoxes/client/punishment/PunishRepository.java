package de.flamefoxes.client.punishment;

import de.flamefoxes.punishment.Punish;

public interface PunishRepository {
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

  Punish find(String uniqueId);
}
