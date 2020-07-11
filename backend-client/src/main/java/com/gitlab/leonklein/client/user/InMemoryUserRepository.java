package com.gitlab.leonklein.client.user;

import com.gitlab.leonklein.report.CreateReportResponse;
import com.gitlab.leonklein.user.CreateUserRequest;
import com.gitlab.leonklein.user.CreateUserResponse;
import com.gitlab.leonklein.user.FindUserRequest;
import com.gitlab.leonklein.user.FindUserResponde;
import com.gitlab.leonklein.user.UpdateUserRequest;
import com.gitlab.leonklein.user.UpdateUserResponse;
import com.gitlab.leonklein.user.User;
import com.gitlab.leonklein.user.UserServiceGrpc.UserServiceBlockingStub;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class InMemoryUserRepository implements UserRepository {
  private final UserServiceBlockingStub USER_SERVICE;
  ExecutorService executorService;

  private InMemoryUserRepository(UserServiceBlockingStub blockingStub) {
    USER_SERVICE = blockingStub;
  }

  @Override
  public void create(
      String uniqueId,
      String rank,
      long coins,
      long wins,
      long banPoints,
      List<String> banHistory
  ) {
    User user = createUser(uniqueId, rank, coins, wins, banPoints, banHistory);
    CreateUserRequest request = createUserRequest(user);
    CreateUserResponse response = USER_SERVICE.create(request);
    System.out.println("User was created: " + response.getUser().getUniqueId());
  }

  private CreateUserRequest createUserRequest(User user) {
    return CreateUserRequest.newBuilder()
        .setUser(user)
        .build();
  }

  private User createUser(
      String uniqueId,
      String rank,
      long coins,
      long wins,
      long banPoints,
      List<String> banHistory
  ) {
    return User.newBuilder()
        .setUniqueId(uniqueId)
        .setRank(rank)
        .setCoins(coins)
        .setWins(wins)
        .setBanPoints(banPoints)
        .addAllBanHistory(banHistory)
        .build();
  }

  @Override
  public void update(
      String uniqueId,
      String rank,
      long coins,
      long wins,
      long banPoints,
      List<String> banHistory
  ) {
    User user = updateUser(uniqueId, rank, coins, wins, banPoints, banHistory);
    UpdateUserRequest request = updateUserRequest(user);
    UpdateUserResponse response = USER_SERVICE.update(request);
    System.out.println("User was updated: " + response.getUser().getUniqueId());
  }

  private UpdateUserRequest updateUserRequest(User user) {
    return UpdateUserRequest.newBuilder()
        .setUser(user)
        .build();
  }

  private User updateUser(
      String uniqueId,
      String rank,
      long coins,
      long wins,
      long banPoints,
      List<String> banHistory
  ) {
    return User.newBuilder()
        .setUniqueId(uniqueId)
        .setRank(rank)
        .setCoins(coins)
        .setWins(wins)
        .setBanPoints(banPoints)
        .addAllBanHistory(banHistory)
        .build();
  }

  @Override
  public User find(String uniqueId) {
    FindUserRequest request = findUserRequest(uniqueId);
    FindUserResponde responde = USER_SERVICE.find(request);
    return responde.getUser();
  }

  private FindUserRequest findUserRequest(String uniqueId) {
    return FindUserRequest.newBuilder()
        .setUniqueId(uniqueId)
        .build();
  }

  public static InMemoryUserRepository create(UserServiceBlockingStub blockingStub) {
    return new InMemoryUserRepository(blockingStub);
  }
}
