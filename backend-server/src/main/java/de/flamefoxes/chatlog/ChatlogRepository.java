package de.flamefoxes.chatlog;

import java.util.List;

public interface ChatlogRepository {
  void create(Chatlog chatlog);

  void delete(String server);

  List<String> list(String server);
}
