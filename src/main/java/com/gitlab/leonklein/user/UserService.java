package com.gitlab.leonklein.user;

import io.grpc.stub.StreamObserver;

public class UserService extends UserServiceGrpc.UserServiceImplBase {
  private final UserRepository userRepository;

  private UserService() { this.userRepository = InMemoryUserRepository.create(); }

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
        .build();
  }

  @Override
  public void find(
      FindUserRequest request,
      StreamObserver<FindUserResponde> responseObserver
  ) {

  }

  private FindUserResponde findUserResponde(User user) {
    return FindUserResponde.newBuilder()
        .setUser(user)
        .build();
  }

  public static UserService create() {
    return new UserService();
  }
}
