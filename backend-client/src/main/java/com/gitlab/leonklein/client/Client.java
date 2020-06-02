package com.gitlab.leonklein.client;

import com.gitlab.leonklein.user.UserServiceGrpc;
import com.gitlab.leonklein.user.UserServiceGrpc.UserServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
  private Client() {}

  private static final String GRPC_ADRESS = "127.0.0.1";
  private static final int GRPC_PORT = 8891;

  public static void main(String[] args) {
    ManagedChannel managedChannel = createManagedChannel();
    UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(managedChannel);
    System.out.println("Client connected to Service!");
  }

  private static ManagedChannel createManagedChannel() {
    return ManagedChannelBuilder.forAddress(GRPC_ADRESS, GRPC_PORT)
        .usePlaintext()
        .build();
  }
}
