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
    comments = "Source: user/user_service.proto")
public class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.user.CreateUserRequest,
      com.gitlab.leonklein.user.CreateUserResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user.UserService", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.CreateUserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.CreateUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.user.UpdateUserRequest,
      com.gitlab.leonklein.user.UpdateUserResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user.UserService", "Update"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.UpdateUserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.UpdateUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.user.FindUserRequest,
      com.gitlab.leonklein.user.FindUserResponde> METHOD_FIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user.UserService", "Find"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.FindUserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.FindUserResponde.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gitlab.leonklein.user.ListUserRequest,
      com.gitlab.leonklein.user.ListUserResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user.UserService", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.ListUserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gitlab.leonklein.user.ListUserResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.gitlab.leonklein.user.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.CreateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void update(com.gitlab.leonklein.user.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.UpdateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void find(com.gitlab.leonklein.user.FindUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.FindUserResponde> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND, responseObserver);
    }

    /**
     */
    public void list(com.gitlab.leonklein.user.ListUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.ListUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.user.CreateUserRequest,
                com.gitlab.leonklein.user.CreateUserResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.user.UpdateUserRequest,
                com.gitlab.leonklein.user.UpdateUserResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_FIND,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.user.FindUserRequest,
                com.gitlab.leonklein.user.FindUserResponde>(
                  this, METHODID_FIND)))
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.gitlab.leonklein.user.ListUserRequest,
                com.gitlab.leonklein.user.ListUserResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.gitlab.leonklein.user.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.CreateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.gitlab.leonklein.user.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.UpdateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void find(com.gitlab.leonklein.user.FindUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.FindUserResponde> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.gitlab.leonklein.user.ListUserRequest request,
        io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.ListUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gitlab.leonklein.user.CreateUserResponse create(com.gitlab.leonklein.user.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.user.UpdateUserResponse update(com.gitlab.leonklein.user.UpdateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.user.FindUserResponde find(com.gitlab.leonklein.user.FindUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND, getCallOptions(), request);
    }

    /**
     */
    public com.gitlab.leonklein.user.ListUserResponse list(com.gitlab.leonklein.user.ListUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.user.CreateUserResponse> create(
        com.gitlab.leonklein.user.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.user.UpdateUserResponse> update(
        com.gitlab.leonklein.user.UpdateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.user.FindUserResponde> find(
        com.gitlab.leonklein.user.FindUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gitlab.leonklein.user.ListUserResponse> list(
        com.gitlab.leonklein.user.ListUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_FIND = 2;
  private static final int METHODID_LIST = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.gitlab.leonklein.user.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.CreateUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.gitlab.leonklein.user.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find((com.gitlab.leonklein.user.FindUserRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.FindUserResponde>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.gitlab.leonklein.user.ListUserRequest) request,
              (io.grpc.stub.StreamObserver<com.gitlab.leonklein.user.ListUserResponse>) responseObserver);
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
        METHOD_LIST);
  }

}
