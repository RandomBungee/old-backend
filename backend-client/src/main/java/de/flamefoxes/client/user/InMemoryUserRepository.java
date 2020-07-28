package de.flamefoxes.client.user;

import de.flamefoxes.user.CreateUserRequest;
import de.flamefoxes.user.CreateUserResponse;
import de.flamefoxes.user.FindUserRequest;
import de.flamefoxes.user.FindUserResponde;
import de.flamefoxes.user.UpdateUserRequest;
import de.flamefoxes.user.UpdateUserResponse;
import de.flamefoxes.user.User;
import de.flamefoxes.user.UserServiceGrpc.UserServiceBlockingStub;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class InMemoryUserRepository implements UserRepository {
  private final UserServiceBlockingStub USER_SERVICE;

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
      boolean isBanned,
      List<String> banHistory
  ) {
    User user = createUser(uniqueId, rank, coins, wins, banPoints, isBanned, banHistory);
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
      boolean isBanned,
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
      boolean isBanned,
      List<String> banHistory
  ) {
    User user = updateUser(uniqueId, rank, coins, wins, banPoints, isBanned, banHistory);
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
      boolean isBanned,
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
    FindUserResponde response = USER_SERVICE.find(request);
    return response.getUser();
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
