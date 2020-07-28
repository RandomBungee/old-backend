package de.flamefoxes.user;

import de.flamefoxes.sql.Mysql;
import io.grpc.stub.StreamObserver;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class UserService extends UserServiceGrpc.UserServiceImplBase {
  private final UserRepository userRepository;

  private UserService() { this.userRepository = SqlUserRepository.create(Mysql.connection); }

  @Override
  public void create(
      CreateUserRequest request,
      StreamObserver<CreateUserResponse> responseObserver
  ) {
    User user = request.getUser();
    userRepository.create(user);
    CreateUserResponse response = createUserResponse(user);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
    System.out.println("User was created!");
  }

  private CreateUserResponse createUserResponse(User user) {
    return CreateUserResponse.newBuilder()
        .setUser(user)
        .build();
  }

  @Override
  public void update(
      UpdateUserRequest request,
      StreamObserver<UpdateUserResponse> responseObserver
  ) {
    User user = request.getUser();
    userRepository.update(user);
    UpdateUserResponse response = updateUserResponse(user);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
    System.out.println("User updated!");
  }

  private UpdateUserResponse updateUserResponse(User user) {
    return UpdateUserResponse.newBuilder()
        .setUser(user)
        .setRank(user.getRank())
        .setCoins(user.getCoins())
        .setWins(user.getWins())
        .setIsBanned(user.getIsBanned())
        .addAllBanHistory(user.getBanHistoryList())
        .build();
  }

  @Override
  public void find(
      FindUserRequest request,
      StreamObserver<FindUserResponde> responseObserver
  ) {
    String uniqueId = request.getUniqueId();
    Optional<User> optionalUser = userRepository.find(uniqueId);
    User user = optionalUser.orElse(noSuchUser());
    FindUserResponde userResponde = findUserResponde(user);
    responseObserver.onNext(userResponde);
    responseObserver.onCompleted();
  }

  private FindUserResponde findUserResponde(User user) {
    return FindUserResponde.newBuilder()
        .setUser(user)
        .build();
  }

  private User noSuchUser() {
    return User.newBuilder()
        .setUniqueId("")
        .setCoins(0)
        .setBanPoints(0)
        .setRank("")
        .setWins(0)
        .setIsBanned(false)
        .addAllBanHistory(Collections.singletonList(""))
        .build();
  }

  @Override
  public void list(
      ListUserRequest request,
      StreamObserver<ListUserResponse> responseObserver
  ) {
    List<User> users = userRepository.list();
    ListUserResponse response = listUserResponse(users);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private ListUserResponse listUserResponse(List<User> users) {
    return ListUserResponse.newBuilder()
        .addAllUser(users)
        .build();
  }

  public static UserService create() {
    return new UserService();
  }
}
