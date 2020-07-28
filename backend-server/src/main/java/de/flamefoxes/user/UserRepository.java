package de.flamefoxes.user;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
  void create(User user);

  void update(User user);

  Optional<User> find(String uniqueId);

  List<User> list();
}
