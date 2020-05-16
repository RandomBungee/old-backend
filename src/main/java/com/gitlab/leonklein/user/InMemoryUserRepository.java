package com.gitlab.leonklein.user;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepository implements UserRepository {
  private final List<User> users;

  private InMemoryUserRepository() { this.users = new ArrayList<>(); }

  @Override
  public void create(User user) {

  }

  @Override
  public void update(User user) {

  }

  @Override
  public User find(String uniqueId) {

  }

  public static InMemoryUserRepository create() {
    return new InMemoryUserRepository();
  }
}
