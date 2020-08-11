package de.flamefoxes.punishment;

import java.util.Optional;

public interface MuteRepository {
  void create(Mute punish);

  void delete(String uniqueId);

  void change(Mute punish);

  Optional<Mute> find(String uniqueId);
}
