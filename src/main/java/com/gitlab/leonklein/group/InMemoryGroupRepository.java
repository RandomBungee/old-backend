package com.gitlab.leonklein.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryGroupRepository implements GroupRepository {
  private final List<Group> groups;

  private InMemoryGroupRepository() { this.groups = new ArrayList<>(); }

  @Override
  public void create(Group group) {
    groups.add(group);
  }

  @Override
  public void update(Group group) {
  }

  @Override
  public Optional<Group> findGroup(Group group) {
    return Optional.empty();
  }

  @Override
  public List<Group> listGroup() {
    return groups;
  }

  public static InMemoryGroupRepository create() {
    return new InMemoryGroupRepository();
  }
}
