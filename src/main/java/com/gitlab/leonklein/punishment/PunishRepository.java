package com.gitlab.leonklein.punishment;

import java.util.Optional;

public interface PunishRepository {
  void create(Punish punish);

  void delete(String uniqueId);

  void change(Punish punish);

  Optional<Punish> find(String uniqueId);
}
