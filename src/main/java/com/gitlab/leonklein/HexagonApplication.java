package com.gitlab.leonklein;

import com.gitlab.leonklein.group.GroupService;
import com.gitlab.leonklein.user.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class HexagonApplication {
  private HexagonApplication() {}

  public static void main(String[] args)
      throws InterruptedException, IOException {
    Server server = ServerBuilder.forPort(8891)
        .addService(GroupService.create())
        .addService(UserService.create())
        .build();
    System.out.println("Service started!");
    server.start();
    server.awaitTermination();
  }
}
