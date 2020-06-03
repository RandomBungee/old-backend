package com.gitlab.leonklein.client.user;

import com.gitlab.leonklein.user.UserServiceGrpc.UserServiceBlockingStub;

public class InMemoryUserRepository implements UserRepository {
  private final UserServiceBlockingStub USER_SERVICE;

  private InMemoryUserRepository(UserServiceBlockingStub blockingStub) {
    USER_SERVICE = blockingStub;
  }

  public static InMemoryUserRepository create(UserServiceBlockingStub blockingStub) {
    return new InMemoryUserRepository(blockingStub);
  }
}
