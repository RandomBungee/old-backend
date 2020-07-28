package de.flamefoxes.client.group;

import de.flamefoxes.group.Group;
import java.util.List;

public interface GroupRepository {
  void create(
      String name,
      List<String> permissions
  );

  void update(
      String name,
      List<String> permissions
  );

  @Deprecated
  List<GroupRepository> list();

  Group find(String name);
}
