package com.gitlab.leonklein;

import com.gitlab.leonklein.chatlog.Chatlog;
import com.gitlab.leonklein.chatlog.ChatlogService;
import com.gitlab.leonklein.group.GroupService;
import com.gitlab.leonklein.punishment.PunishService;
import com.gitlab.leonklein.report.ReportService;
import com.gitlab.leonklein.sql.Mysql;
import com.gitlab.leonklein.user.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class HexagonApplication {
  private HexagonApplication() {}

  private static final int GRPC_PORT = 8891;

  public static void main(String[] arguments)
      throws InterruptedException, IOException {
    System.out.println("Service started!");
    init();
    Server server = ServerBuilder.forPort(GRPC_PORT)
        .addService(GroupService.create())
        .addService(PunishService.create())
        .addService(ReportService.create())
        .addService(UserService.create())
        .addService(ChatlogService.create())
        .build();
    server.start();
    server.awaitTermination();
  }

  private static void init() {
    Mysql mysql = new Mysql(
        "127.0.0.1",
        "testbd123",
        "123456",
        "testbd123",
        3306);
    mysql.createTable();
  }
}
