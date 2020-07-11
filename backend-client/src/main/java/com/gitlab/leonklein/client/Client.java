package com.gitlab.leonklein.client;

import com.gitlab.leonklein.chatlog.Chatlog;
import com.gitlab.leonklein.chatlog.ChatlogServiceGrpc;
import com.gitlab.leonklein.chatlog.ChatlogServiceGrpc.ChatlogServiceBlockingStub;
import com.gitlab.leonklein.client.chatlog.ChatlogRepository;
import com.gitlab.leonklein.client.chatlog.InMemoryChatlogRepository;
import com.gitlab.leonklein.client.group.GroupRepository;
import com.gitlab.leonklein.client.group.InMemoryGroupRepository;
import com.gitlab.leonklein.client.punishment.InMemoryPunishRepository;
import com.gitlab.leonklein.client.punishment.PunishRepository;
import com.gitlab.leonklein.client.report.InMemoryReportRepository;
import com.gitlab.leonklein.client.report.ReportRepository;
import com.gitlab.leonklein.client.user.InMemoryTeamUserRepository;
import com.gitlab.leonklein.client.user.InMemoryUserRepository;
import com.gitlab.leonklein.client.user.TeamUserRepository;
import com.gitlab.leonklein.client.user.UserRepository;
import com.gitlab.leonklein.group.GroupServiceGrpc;
import com.gitlab.leonklein.group.GroupServiceGrpc.GroupServiceBlockingStub;
import com.gitlab.leonklein.punishment.PunishServiceGrpc;
import com.gitlab.leonklein.punishment.PunishServiceGrpc.PunishServiceBlockingStub;
import com.gitlab.leonklein.report.ReportServiceGrpc;
import com.gitlab.leonklein.report.ReportServiceGrpc.ReportServiceBlockingStub;
import com.gitlab.leonklein.user.TeamUserServiceGrpc;
import com.gitlab.leonklein.user.UserServiceGrpc;
import com.gitlab.leonklein.user.UserServiceGrpc.UserServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.okhttp.OkHttpChannelBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
  private static final String GRPC_ADRESS = "127.0.0.1";
  private static final int GRPC_PORT = 8891;
  private static GroupRepository groupRepository;
  private static ChatlogRepository chatlogRepository;
  private static PunishRepository punishRepository;
  private static ReportRepository reportRepository;
  private static UserRepository userRepository;
  private static TeamUserRepository teamUserRepository;

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
}
