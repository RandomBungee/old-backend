package de.flamefoxes.group;

import java.util.List;
import java.util.Optional;

public interface GroupRepository {
  void create(Group group);

  void update(Group group);

  Optional<Group> findGroup(String name);

  List<Group> list();
}
