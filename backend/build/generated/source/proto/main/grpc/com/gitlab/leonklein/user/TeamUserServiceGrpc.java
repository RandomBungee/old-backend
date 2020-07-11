package com.gitlab.leonklein.user;

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
    comments = "Source: user/team_user_service.proto")
public class TeamUserServiceGrpc {

  private TeamUserServiceGrpc() {}

  public static final String SERVICE_NAME = "user.TeamUserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.user.CreateTeamUserRequest,
      com.gitlab.leonklein.user.CreateTeamUserResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user.TeamUserService", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.CreateTeamUserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.CreateTeamUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.user.UpdateTeamUserRequest,
      com.gitlab.leonklein.user.UpdateTeamUserResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user.TeamUserService", "Update"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.UpdateTeamUserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.UpdateTeamUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.user.FindTeamUserRequest,
      com.gitlab.leonklein.user.FindTeamUserResponse> METHOD_FIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user.TeamUserService", "Find"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.FindTeamUserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.FindTeamUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.user.DeleteTeamUserRequest,
      com.gitlab.leonklein.user.DeleteTeamUserResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user.TeamUserService", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.DeleteTeamUserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.DeleteTeamUserResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeamUserServiceStub newStub(io.grpc.Channel channel) {
    return new TeamUserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeamUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TeamUserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TeamUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TeamUserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TeamUserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.gitlab.leonklein.user.CreateTeamUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.CreateTeamUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void update(com.gitlab.leonklein.user.UpdateTeamUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.UpdateTeamUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void find(com.gitlab.leonklein.user.FindTeamUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.FindTeamUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND, responseObserver);
    }

    /**
     */
    public void delete(com.gitlab.leonklein.user.DeleteTeamUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.DeleteTeamUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.user.CreateTeamUserRequest,
                com.gitlab.leonklein.user.CreateTeamUserResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.user.UpdateTeamUserRequest,
                com.gitlab.leonklein.user.UpdateTeamUserResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_FIND,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.user.FindTeamUserRequest,
                com.gitlab.leonklein.user.FindTeamUserResponse>(
                  this, METHODID_FIND)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.user.DeleteTeamUserRequest,
                com.gitlab.leonklein.user.DeleteTeamUserResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class TeamUserServiceStub extends io.grpc.stub.AbstractStub<TeamUserServiceStub> {
    private TeamUserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamUserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamUserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamUserServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.gitlab.leonklein.user.CreateTeamUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.CreateTeamUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.gitlab.leonklein.user.UpdateTeamUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.UpdateTeamUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void find(com.gitlab.leonklein.user.FindTeamUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.FindTeamUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.gitlab.leonklein.user.DeleteTeamUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.DeleteTeamUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeamUserServiceBlockingStub extends io.grpc.stub.AbstractStub<TeamUserServiceBlockingStub> {
    private TeamUserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamUserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamUserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamUserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gitlab.leonklein.user.CreateTeamUserResponse create(com.gitlab.leonklein.user.CreateTeamUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.user.UpdateTeamUserResponse update(com.gitlab.leonklein.user.UpdateTeamUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.user.FindTeamUserResponse find(com.gitlab.leonklein.user.FindTeamUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.user.DeleteTeamUserResponse delete(com.gitlab.leonklein.user.DeleteTeamUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeamUserServiceFutureStub extends io.grpc.stub.AbstractStub<TeamUserServiceFutureStub> {
    private TeamUserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamUserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamUserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamUserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.user.CreateTeamUserResponse> create(
        com.gitlab.leonklein.user.CreateTeamUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.user.UpdateTeamUserResponse> update(
        com.gitlab.leonklein.user.UpdateTeamUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.user.FindTeamUserResponse> find(
        com.gitlab.leonklein.user.FindTeamUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.user.DeleteTeamUserResponse> delete(
        com.gitlab.leonklein.user.DeleteTeamUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_FIND = 2;
  private static final int METHODID_DELETE = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeamUserServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(TeamUserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.gitlab.leonklein.user.CreateTeamUserRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.CreateTeamUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.gitlab.leonklein.user.UpdateTeamUserRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.UpdateTeamUserResponse>) responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find((com.gitlab.leonklein.user.FindTeamUserRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.FindTeamUserResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.gitlab.leonklein.user.DeleteTeamUserRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.DeleteTeamUserResponse>) responseObserver);
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
        METHOD_FIND,
        METHOD_DELETE);
  }

}
