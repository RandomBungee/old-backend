package de.flamefoxes.group;

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
public class GroupServiceGrpc {

  private GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "group.GroupService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.group.CreateGroupRequest,
      de.flamefoxes.group.CreateGroupResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.GroupService", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.group.CreateGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.group.CreateGroupResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.group.UpdateGroupRequest,
      de.flamefoxes.group.UpdateGroupResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.GroupService", "Update"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.group.UpdateGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.group.UpdateGroupResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.group.ListGroupRequest,
      de.flamefoxes.group.ListGroupResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.GroupService", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.group.ListGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.group.ListGroupResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.group.FindGroupRequest,
      de.flamefoxes.group.FindGroupResponse> METHOD_FIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.GroupService", "Find"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.group.FindGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.group.FindGroupResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    return new GroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(de.flamefoxes.group.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.group.CreateGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void update(de.flamefoxes.group.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.group.UpdateGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void list(de.flamefoxes.group.ListGroupRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.group.ListGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void find(de.flamefoxes.group.FindGroupRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.group.FindGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.group.CreateGroupRequest,
                de.flamefoxes.group.CreateGroupResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.group.UpdateGroupRequest,
                de.flamefoxes.group.UpdateGroupResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.group.ListGroupRequest,
                de.flamefoxes.group.ListGroupResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_FIND,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.group.FindGroupRequest,
                de.flamefoxes.group.FindGroupResponse>(
                  this, METHODID_FIND)))
          .build();
    }
  }

  /**
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractStub<GroupServiceStub> {
    private GroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(de.flamefoxes.group.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.group.CreateGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(de.flamefoxes.group.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.group.UpdateGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(de.flamefoxes.group.ListGroupRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.group.ListGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void find(de.flamefoxes.group.FindGroupRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.group.FindGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.flamefoxes.group.CreateGroupResponse create(de.flamefoxes.group.CreateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.group.UpdateGroupResponse update(de.flamefoxes.group.UpdateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.group.ListGroupResponse list(de.flamefoxes.group.ListGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.group.FindGroupResponse find(de.flamefoxes.group.FindGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.group.CreateGroupResponse> create(
        de.flamefoxes.group.CreateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.group.UpdateGroupResponse> update(
        de.flamefoxes.group.UpdateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.group.ListGroupResponse> list(
        de.flamefoxes.group.ListGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.group.FindGroupResponse> find(
        de.flamefoxes.group.FindGroupRequest request) {
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
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((de.flamefoxes.group.CreateGroupRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.group.CreateGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((de.flamefoxes.group.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.group.UpdateGroupResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((de.flamefoxes.group.ListGroupRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.group.ListGroupResponse>) responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find((de.flamefoxes.group.FindGroupRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.group.FindGroupResponse>) responseObserver);
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
