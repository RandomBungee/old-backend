package com.gitlab.leonklein.client.group;

import com.gitlab.leonklein.group.CreateGroupRequest;
import com.gitlab.leonklein.group.CreateGroupResponse;
import com.gitlab.leonklein.group.FindGroupRequest;
import com.gitlab.leonklein.group.FindGroupResponse;
import com.gitlab.leonklein.group.Group;
import com.gitlab.leonklein.group.GroupServiceGrpc.GroupServiceBlockingStub;
import com.gitlab.leonklein.group.UpdateGroupRequest;
import com.gitlab.leonklein.group.UpdateGroupResponse;
import java.util.List;

public class InMemoryGroupRepository implements GroupRepository {
  private final GroupServiceBlockingStub GROUP_SERVICE;

  private InMemoryGroupRepository(GroupServiceBlockingStub blockingStub) { this.GROUP_SERVICE = blockingStub; }

  @Override
  public void create(
      String name,
      List<String> permissions
  ) {
    CreateGroupRequest request = createGroupRequest(name, permissions);
    CreateGroupResponse response = GROUP_SERVICE.create(request);
    System.out.println("Group was created: " + response.getGroup().getName());
  }

  private CreateGroupRequest createGroupRequest(
      String name,
      List<String> permissions
  ) {
    return CreateGroupRequest.newBuilder()
        .setGroup(createGroup(name, permissions))
        .build();
  }

  private Group createGroup(
      String name,
      List<String> permissions
  ) {
    return Group.newBuilder()
        .setName(name)
        .addAllPermissions(permissions)
        .build();
  }

  @Override
  public void update(
      String name,
      List<String> permissions
  ) {
    Group group = updateGroup(name, permissions);
    UpdateGroupRequest request = updateGroupRequest(group);
    UpdateGroupResponse response = GROUP_SERVICE.update(request);
    System.out.println("Updated Group:" + response.getGroup().getName());
  }

  private UpdateGroupRequest updateGroupRequest(Group group) {
    return UpdateGroupRequest.newBuilder()
        .setGroup(group)
        .build();
  }

  private Group updateGroup(
      String name,
      List<String> permissions
  ) {
    return Group.newBuilder()
        .setName(name)
        .addAllPermissions(permissions)
        .build();
  }

  @Deprecated
  @Override
  public List<GroupRepository> list() {
    return null;
  }

  @Override
  public Group find(String name) {
    FindGroupRequest request = findGroupRequest(name);
    FindGroupResponse response = GROUP_SERVICE.find(request);
    return response.getGroup();
  }

  private FindGroupRequest findGroupRequest(String name) {
    return FindGroupRequest.newBuilder()
        .setName(name)
        .build();
  }

  public static InMemoryGroupRepository create(GroupServiceBlockingStub blockingStub) {
    return new InMemoryGroupRepository(blockingStub);
  }
}
