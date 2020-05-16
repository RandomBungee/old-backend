package com.gitlab.leonklein.group;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0-pre2)",
    comments = "Source: group/group_service.proto")
public class RoleServiceGrpc {

  private RoleServiceGrpc() {}

  public static final String SERVICE_NAME = "group.RoleService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.group.CreateGroupRequest,
      com.gitlab.leonklein.group.CreateGroupResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.RoleService", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.group.CreateGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.group.CreateGroupResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.group.UpdateGroupRequest,
      com.gitlab.leonklein.group.UpdateGroupResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.RoleService", "Update"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.group.UpdateGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.group.UpdateGroupResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.group.ListRoleRequest,
      com.gitlab.leonklein.group.ListRoleResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.RoleService", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.group.ListRoleRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.group.ListRoleResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.group.FindRoleRequest,
      com.gitlab.leonklein.group.FindRoleResponse> METHOD_FIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.RoleService", "Find"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.group.FindRoleRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.group.FindRoleResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleServiceStub newStub(io.grpc.Channel channel) {
    return new RoleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RoleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RoleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RoleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RoleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.gitlab.leonklein.group.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.CreateGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void update(com.gitlab.leonklein.group.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.UpdateGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void list(com.gitlab.leonklein.group.ListRoleRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.ListRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void find(com.gitlab.leonklein.group.FindRoleRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.FindRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.group.CreateGroupRequest,
                com.gitlab.leonklein.group.CreateGroupResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.group.UpdateGroupRequest,
                com.gitlab.leonklein.group.UpdateGroupResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.group.ListRoleRequest,
                com.gitlab.leonklein.group.ListRoleResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_FIND,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.group.FindRoleRequest,
                com.gitlab.leonklein.group.FindRoleResponse>(
                  this, METHODID_FIND)))
          .build();
    }
  }

  /**
   */
  public static final class RoleServiceStub extends io.grpc.stub.AbstractStub<RoleServiceStub> {
    private RoleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.gitlab.leonklein.group.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.CreateGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.gitlab.leonklein.group.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.UpdateGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.gitlab.leonklein.group.ListRoleRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.ListRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void find(com.gitlab.leonklein.group.FindRoleRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.FindRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoleServiceBlockingStub extends io.grpc.stub.AbstractStub<RoleServiceBlockingStub> {
    private RoleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gitlab.leonklein.group.CreateGroupResponse create(com.gitlab.leonklein.group.CreateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.group.UpdateGroupResponse update(com.gitlab.leonklein.group.UpdateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.group.ListRoleResponse list(com.gitlab.leonklein.group.ListRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.group.FindRoleResponse find(com.gitlab.leonklein.group.FindRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoleServiceFutureStub extends io.grpc.stub.AbstractStub<RoleServiceFutureStub> {
    private RoleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.group.CreateGroupResponse> create(
        com.gitlab.leonklein.group.CreateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.group.UpdateGroupResponse> update(
        com.gitlab.leonklein.group.UpdateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.group.ListRoleResponse> list(
        com.gitlab.leonklein.group.ListRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.group.FindRoleResponse> find(
        com.gitlab.leonklein.group.FindRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_FIND = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoleServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(RoleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.gitlab.leonklein.group.CreateGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.CreateGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.gitlab.leonklein.group.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.UpdateGroupResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.gitlab.leonklein.group.ListRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.ListRoleResponse>) responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find((com.gitlab.leonklein.group.FindRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.group.FindRoleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE,
        METHOD_UPDATE,
        METHOD_LIST,
        METHOD_FIND);
  }

}
