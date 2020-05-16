package com.gitlab.leonklein.group;

import com.gitlab.leonklein.user.UserServiceGrpc;

public class GroupService extends GroupServiceGrpc.GroupServiceImplBase {
  private final GroupRepository groupRepository;

  private GroupService() { this.groupRepository = InMemoryGroupRepository.create(); }

  public static GroupService create() { return new GroupService(); }
}
