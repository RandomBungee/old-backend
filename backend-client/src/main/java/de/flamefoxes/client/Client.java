package de.flamefoxes.client;

import de.flamefoxes.chatlog.ChatlogServiceGrpc;
import de.flamefoxes.client.chatlog.ChatlogRepository;
import de.flamefoxes.client.chatlog.InMemoryChatlogRepository;
import de.flamefoxes.client.group.GroupRepository;
import de.flamefoxes.client.group.InMemoryGroupRepository;
import de.flamefoxes.client.punishment.InMemoryMuteRepository;
import de.flamefoxes.client.punishment.InMemoryPunishRepository;
import de.flamefoxes.client.punishment.MuteRepository;
import de.flamefoxes.client.punishment.PunishRepository;
import de.flamefoxes.client.report.InMemoryReportRepository;
import de.flamefoxes.client.report.ReportRepository;
import de.flamefoxes.client.user.InMemoryTeamUserRepository;
import de.flamefoxes.client.user.InMemoryUserRepository;
import de.flamefoxes.client.user.TeamUserRepository;
import de.flamefoxes.client.user.UserRepository;
import de.flamefoxes.group.GroupServiceGrpc;
import de.flamefoxes.punishment.MuteServiceGrpc;
import de.flamefoxes.punishment.PunishServiceGrpc;
import de.flamefoxes.report.ReportServiceGrpc;
import de.flamefoxes.user.TeamUserServiceGrpc;
import de.flamefoxes.user.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.okhttp.OkHttpChannelBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
  private static final String GRPC_ADRESS = "127.0.0.1";
  private static final int GRPC_PORT = 8891;
  private static GroupRepository groupRepository;
  private static ChatlogRepository chatlogRepository;
  private static PunishRepository punishRepository;
  private static ReportRepository reportRepository;
  private static UserRepository userRepository;
  private static TeamUserRepository teamUserRepository;
  private static MuteRepository muteRepository;

  public Client() {
    ManagedChannel managedChannel = createManagedChannel();
    groupRepository = InMemoryGroupRepository.create(GroupServiceGrpc.newBlockingStub
        (managedChannel));
    chatlogRepository = InMemoryChatlogRepository.create(ChatlogServiceGrpc.newBlockingStub
        (managedChannel));
    punishRepository = InMemoryPunishRepository.create(PunishServiceGrpc.newBlockingStub
        (managedChannel));
    reportRepository = InMemoryReportRepository.create(ReportServiceGrpc.newBlockingStub
        (managedChannel));
    userRepository = InMemoryUserRepository.create(UserServiceGrpc.newBlockingStub
        (managedChannel));
    teamUserRepository = InMemoryTeamUserRepository.create(TeamUserServiceGrpc.newBlockingStub
        (managedChannel));
    muteRepository = InMemoryMuteRepository.create(MuteServiceGrpc.newBlockingStub
        (managedChannel));
  }

  public static void main(String[] args) {
    System.out.println("Client connected to Service!");
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String line;
      while (true) {
        if((line = bufferedReader.readLine()) == null) break;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static ManagedChannel createManagedChannel() {
    return OkHttpChannelBuilder.forAddress(GRPC_ADRESS, GRPC_PORT)
        .usePlaintext()
        .build();
  }

  public GroupRepository groupRepository() {
    return groupRepository;
  }

  public ChatlogRepository chatlogRepository() {
    return chatlogRepository;
  }

  public PunishRepository punishRepository() {
    return punishRepository;
  }

  public ReportRepository reportRepository() {
    return reportRepository;
  }

  public UserRepository userRepository() {
    return userRepository;
  }

  public TeamUserRepository teamUserRepository() { return teamUserRepository; }

  public MuteRepository muteRepository() {
    return muteRepository;
  }
}
