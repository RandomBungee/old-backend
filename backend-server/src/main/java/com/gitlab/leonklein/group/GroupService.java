package com.gitlab.leonklein.group;

import com.gitlab.leonklein.sql.Mysql;
import io.grpc.stub.StreamObserver;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GroupService extends GroupServiceGrpc.GroupServiceImplBase {
  private final GroupRepository groupRepository;

  private GroupService() { this.groupRepository = SqlGroupRepository.create(Mysql.connection); }

  @Override
  public void create(
      CreateGroupRequest request,
      StreamObserver<CreateGroupResponse> responseObserver
  ) {
    Group group = request.getGroup();
    groupRepository.create(group);
    CreateGroupResponse response = createGroupResponse(group);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private CreateGroupResponse createGroupResponse(Group group) {
    return CreateGroupResponse.newBuilder()
        .setGroup(group)
        .build();
  }

  @Override
  public void update(
      UpdateGroupRequest request,
      StreamObserver<UpdateGroupResponse> responseObserver
  ) {
    Group group = request.getGroup();
    groupRepository.update(group);
    UpdateGroupResponse response = updateUserResponse(group);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private UpdateGroupResponse updateUserResponse(Group group) {
    return UpdateGroupResponse.newBuilder()
        .setGroup(group)
        .build();
  }

  @Override
  public void list(
      ListGroupRequest request,
      StreamObserver<ListGroupResponse> responseObserver
  ) {
    List<Group> groupList = groupRepository.list();
    ListGroupResponse listGroupResponse = listGroupResponse(groupList);
    responseObserver.onNext(listGroupResponse);
    responseObserver.onCompleted();
  }

  private ListGroupResponse listGroupResponse(List<Group> groups) {
    return ListGroupResponse.newBuilder()
        .addAllGroup(groups)
        .build();
  }

  @Override
  public void find(
      FindGroupRequest request,
      StreamObserver<FindGroupResponse> responseObserver
  ) {
    String name = request.getName();
    Optional<Group> optionalGroup = groupRepository.findGroup(name);
    Group group = optionalGroup.orElse(noSuchGroup());
    FindGroupResponse findGroupResponse = findGroupResponse(group);
    responseObserver.onNext(findGroupResponse);
    responseObserver.onCompleted();
  }

  FindGroupResponse findGroupResponse(Group group) {
    return FindGroupResponse.newBuilder()
        .setGroup(group)
        .build();
  }

  private Group noSuchGroup() {
    return Group.newBuilder()
        .setName("")
        .addAllPermissions(Arrays.asList("", ""))
        .build();
  }

  public static GroupService create() { return new GroupService(); }
}
