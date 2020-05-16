package com.gitlab.leonklein.user;

public interface UserRepository {
  void create(User user);

  void update(User user);

  User find(String uniqueId);
}
