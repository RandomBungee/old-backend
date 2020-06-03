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
import com.gitlab.leonklein.client.user.InMemoryUserRepository;
import com.gitlab.leonklein.client.user.UserRepository;
import com.gitlab.leonklein.group.GroupServiceGrpc;
import com.gitlab.leonklein.group.GroupServiceGrpc.GroupServiceBlockingStub;
import com.gitlab.leonklein.punishment.PunishServiceGrpc;
import com.gitlab.leonklein.punishment.PunishServiceGrpc.PunishServiceBlockingStub;
import com.gitlab.leonklein.report.ReportServiceGrpc;
import com.gitlab.leonklein.report.ReportServiceGrpc.ReportServiceBlockingStub;
import com.gitlab.leonklein.user.UserServiceGrpc;
import com.gitlab.leonklein.user.UserServiceGrpc.UserServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
  private Client() {}

  private static final String GRPC_ADRESS = "127.0.0.1";
  private static final int GRPC_PORT = 8891;
  private static GroupRepository groupRepository;
  private static ChatlogRepository chatlogRepository;
  private static PunishRepository punishRepository;
  private static ReportRepository reportRepository;
  private static UserRepository userRepository;

  public static void main(String[] args) {
    ManagedChannel managedChannel = createManagedChannel();
    System.out.println("Client connected to Service!");

    groupRepository = InMemoryGroupRepository.create(GroupServiceGrpc.newBlockingStub(managedChannel));
    chatlogRepository = InMemoryChatlogRepository.create(ChatlogServiceGrpc.newBlockingStub(managedChannel));
    punishRepository = InMemoryPunishRepository.create(PunishServiceGrpc.newBlockingStub(managedChannel));
    reportRepository = InMemoryReportRepository.create(ReportServiceGrpc.newBlockingStub(managedChannel));
    userRepository = InMemoryUserRepository.create(UserServiceGrpc.newBlockingStub(managedChannel));
  }

  public static ManagedChannel createManagedChannel() {
    return ManagedChannelBuilder.forAddress(GRPC_ADRESS, GRPC_PORT)
        .usePlaintext()
        .build();
  }

  public static GroupRepository groupRepository() {
    return groupRepository;
  }

  public static ChatlogRepository chatlogRepository() {
    return chatlogRepository;
  }

  public static PunishRepository punishRepository() {
    return punishRepository;
  }

  public static ReportRepository reportRepository() {
    return reportRepository;
  }

  public static UserRepository userRepository() {
    return userRepository;
  }
}
