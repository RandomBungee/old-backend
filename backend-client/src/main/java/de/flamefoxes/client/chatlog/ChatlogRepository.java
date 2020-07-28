package de.flamefoxes.client.chatlog;

import java.util.List;

public interface ChatlogRepository {
  void create(
      String creator,
      String reported,
      String gameServer,
      List<String> messages
  );

  void delete(String reported);

  List<String> list(String server);
}
