package com.gitlab.leonklein.chatlog;

import com.gitlab.leonklein.sql.Mysql;
import io.grpc.stub.StreamObserver;
import java.util.List;

public class ChatlogService extends ChatlogServiceGrpc.ChatlogServiceImplBase {
  private final ChatlogRepository CHATLOG_REPOSITORY;

  private ChatlogService() {
    CHATLOG_REPOSITORY = SqlChatlogRepository.create(Mysql.connection);
  }

  @Override
  public void create(
      CreateChatlogRequest request,
      StreamObserver<CreateChatlogResponse> responseObserver
  ) {
    Chatlog chatlog = request.getChatlog();
    CHATLOG_REPOSITORY.create(chatlog);
    CreateChatlogResponse response = createChatlogResponse(chatlog);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private CreateChatlogResponse createChatlogResponse(Chatlog chatlog) {
    return CreateChatlogResponse.newBuilder()
        .setChatlog(chatlog)
        .build();
  }

  @Override
  public void delete(
      DeleteChatlogRequest request,
      StreamObserver<DeleteChatlogResponse> responseObserver
  ) {
    String server = request.getServer();
    DeleteChatlogResponse response = deleteChatlogResponse(server);
    CHATLOG_REPOSITORY.delete(server);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private DeleteChatlogResponse deleteChatlogResponse(String server) {
    return DeleteChatlogResponse.newBuilder()
        .setServer(server)
        .build();
  }

  @Override
  public void list(
      ListChatlogRequest request,
      StreamObserver<ListChatlogResponse> responseObserver
  ) {
    String server = request.getServer();
    List<String> messages = CHATLOG_REPOSITORY.list(server);
    ListChatlogResponse response = listChatlogResponse(messages);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private ListChatlogResponse listChatlogResponse(List<String> messages) {
    return ListChatlogResponse.newBuilder()
        .addAllMessages(messages)
        .build();
  }

  public static ChatlogService create() {
    return new ChatlogService();
  }
}
