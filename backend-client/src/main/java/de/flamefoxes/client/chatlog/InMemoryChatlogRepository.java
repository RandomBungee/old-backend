package de.flamefoxes.client.chatlog;

import de.flamefoxes.chatlog.Chatlog;
import de.flamefoxes.chatlog.ChatlogServiceGrpc.ChatlogServiceBlockingStub;
import de.flamefoxes.chatlog.CreateChatlogRequest;
import de.flamefoxes.chatlog.CreateChatlogResponse;
import de.flamefoxes.chatlog.DeleteChatlogRequest;
import de.flamefoxes.chatlog.DeleteChatlogResponse;
import de.flamefoxes.chatlog.ListChatlogRequest;
import de.flamefoxes.chatlog.ListChatlogResponse;
import java.util.List;

public class InMemoryChatlogRepository implements ChatlogRepository {
  private final ChatlogServiceBlockingStub CHATLOG_SERVICE;

  private InMemoryChatlogRepository(ChatlogServiceBlockingStub blockingStub) {
    this.CHATLOG_SERVICE = blockingStub;
  }

  @Override
  public void create(
      String creator,
      String reported,
      String gameServer,
      List<String> messages
  ) {
    CreateChatlogRequest request = createChatlogRequest
        (creator, reported, gameServer, messages);
    CreateChatlogResponse response = CHATLOG_SERVICE.create(request);
    System.out.println("Chatlog was created: " + response.getChatlog().getCreator());
  }

  private CreateChatlogRequest createChatlogRequest(
      String creator,
      String reported,
      String gameServer,
      List<String> messages
  ) {
    return CreateChatlogRequest.newBuilder()
        .setChatlog(createChatlog(
            creator,
            reported,
            gameServer,
            messages
        ))
        .build();
  }

  private Chatlog createChatlog(
      String creator,
      String reported,
      String gameServer,
      List<String> messages
  ) {
    return Chatlog.newBuilder()
        .setCreator(creator)
        .setReported(reported)
        .setServer(gameServer)
        .addAllMessages(messages)
        .build();
  }

  @Override
  public void delete(String server) {
    DeleteChatlogRequest request = deleteChatlogRequest(server);
    DeleteChatlogResponse response = CHATLOG_SERVICE.delete(request);
    System.out.println("Chatlog was deleted: " + response.getServer());
  }

  private DeleteChatlogRequest deleteChatlogRequest(String server) {
    return DeleteChatlogRequest.newBuilder()
        .setServer(server)
        .build();
  }

  @Override
  public List<String> list(String server) {
    ListChatlogRequest request = listChatlogRequest(server);
    ListChatlogResponse response = CHATLOG_SERVICE.list(request);
    return response.getMessagesList();
  }

  private ListChatlogRequest listChatlogRequest(String server) {
    return ListChatlogRequest.newBuilder()
        .setServer(server)
        .build();
  }

  public static InMemoryChatlogRepository create(ChatlogServiceBlockingStub blockingStub) {
    return new InMemoryChatlogRepository(blockingStub);
  }
}
