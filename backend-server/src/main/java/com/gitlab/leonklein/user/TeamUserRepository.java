package com.gitlab.leonklein.user;

import java.util.Optional;

public interface TeamUserRepository {
  void create(TeamUser teamUser);

  void update(TeamUser teamUser);

  Optional<TeamUser> find(String uniqueId);
}
