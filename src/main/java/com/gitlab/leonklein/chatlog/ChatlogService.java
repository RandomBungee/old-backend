package com.gitlab.leonklein.chatlog;

import com.gitlab.leonklein.sql.Mysql;
import io.grpc.stub.StreamObserver;

public class ChatlogService extends ChatlogServiceGrpc.ChatlogServiceImplBase {
  private final ChatlogRepository CHATLOG_REPOSITORY;

  private ChatlogService() { CHATLOG_REPOSITORY = SqlChatlogRepository.create(Mysql.connection); }

  @Override
  public void create(
      CreateChatlogRequest request,
      StreamObserver<CreateChatlogResponse> responseObserver
  ) {

  }

  @Override
  public void delete(
      DeleteChatlogRequest request,
      StreamObserver<DeleteChatlogResponse> responseObserver
  ) {

  }

  @Override
  public void list(
      ListChatlogRequest request,
      StreamObserver<ListChatlogResponse> responseObserver
  ) {

  }

  public static ChatlogService create() {
    return new ChatlogService();
  }
}
