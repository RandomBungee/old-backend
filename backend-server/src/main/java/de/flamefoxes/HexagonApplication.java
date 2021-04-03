package de.flamefoxes;

import de.flamefoxes.chatlog.ChatlogService;
import de.flamefoxes.group.GroupService;
import de.flamefoxes.punishment.MuteService;
import de.flamefoxes.punishment.PunishService;
import de.flamefoxes.report.ReportService;
import de.flamefoxes.sql.Mysql;
import de.flamefoxes.user.TeamUserService;
import de.flamefoxes.user.UserService;
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
  }

  private static void init() {
    Mysql mysql = new Mysql(
        "http://144.76.112.94",
        "ts",
        "kpXdC0CJ3cipYcSW",
        "ts",
        3306);
    mysql.createTable();
  }
}
