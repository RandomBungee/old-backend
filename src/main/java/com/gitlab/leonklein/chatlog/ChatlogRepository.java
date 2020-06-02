package com.gitlab.leonklein.chatlog;

import java.util.List;
import java.util.Optional;

public interface ChatlogRepository {
  void create(Chatlog chatlog);

  void delete(String reported);

  List<String> list(String server);
}
