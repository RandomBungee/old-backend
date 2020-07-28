package de.flamefoxes.punishment;

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
    comments = "Source: punishment/punish_service.proto")
public class PunishServiceGrpc {

  private PunishServiceGrpc() {}

  public static final String SERVICE_NAME = "punishment.PunishService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.punishment.CreatePunishRequest,
      de.flamefoxes.punishment.CreatePunishResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "punishment.PunishService", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.CreatePunishRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.CreatePunishResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.punishment.FindPunishRequest,
      de.flamefoxes.punishment.FindPunishResponse> METHOD_FIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "punishment.PunishService", "Find"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.FindPunishRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.FindPunishResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.punishment.DeletePunishRequest,
      de.flamefoxes.punishment.DeletePunishResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "punishment.PunishService", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.DeletePunishRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.DeletePunishResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.punishment.ChangePunishRequest,
      de.flamefoxes.punishment.ChangePunishResponse> METHOD_CHANGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "punishment.PunishService", "Change"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.ChangePunishRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.ChangePunishResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PunishServiceStub newStub(io.grpc.Channel channel) {
    return new PunishServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PunishServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PunishServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PunishServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PunishServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PunishServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(de.flamefoxes.punishment.CreatePunishRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.CreatePunishResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void find(de.flamefoxes.punishment.FindPunishRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.FindPunishResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND, responseObserver);
    }

    /**
     */
    public void delete(de.flamefoxes.punishment.DeletePunishRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.DeletePunishResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void change(de.flamefoxes.punishment.ChangePunishRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.ChangePunishResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHANGE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.punishment.CreatePunishRequest,
                de.flamefoxes.punishment.CreatePunishResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_FIND,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.punishment.FindPunishRequest,
                de.flamefoxes.punishment.FindPunishResponse>(
                  this, METHODID_FIND)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.punishment.DeletePunishRequest,
                de.flamefoxes.punishment.DeletePunishResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_CHANGE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.punishment.ChangePunishRequest,
                de.flamefoxes.punishment.ChangePunishResponse>(
                  this, METHODID_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class PunishServiceStub extends io.grpc.stub.AbstractStub<PunishServiceStub> {
    private PunishServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PunishServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PunishServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PunishServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(de.flamefoxes.punishment.CreatePunishRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.CreatePunishResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void find(de.flamefoxes.punishment.FindPunishRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.FindPunishResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(de.flamefoxes.punishment.DeletePunishRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.DeletePunishResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void change(de.flamefoxes.punishment.ChangePunishRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.ChangePunishResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHANGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PunishServiceBlockingStub extends io.grpc.stub.AbstractStub<PunishServiceBlockingStub> {
    private PunishServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PunishServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PunishServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PunishServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.flamefoxes.punishment.CreatePunishResponse create(de.flamefoxes.punishment.CreatePunishRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.punishment.FindPunishResponse find(de.flamefoxes.punishment.FindPunishRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.punishment.DeletePunishResponse delete(de.flamefoxes.punishment.DeletePunishRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.punishment.ChangePunishResponse change(de.flamefoxes.punishment.ChangePunishRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHANGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PunishServiceFutureStub extends io.grpc.stub.AbstractStub<PunishServiceFutureStub> {
    private PunishServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PunishServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PunishServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PunishServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.punishment.CreatePunishResponse> create(
        de.flamefoxes.punishment.CreatePunishRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.punishment.FindPunishResponse> find(
        de.flamefoxes.punishment.FindPunishRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.punishment.DeletePunishResponse> delete(
        de.flamefoxes.punishment.DeletePunishRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.punishment.ChangePunishResponse> change(
        de.flamefoxes.punishment.ChangePunishRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHANGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_FIND = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_CHANGE = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PunishServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(PunishServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((de.flamefoxes.punishment.CreatePunishRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.punishment.CreatePunishResponse>) responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find((de.flamefoxes.punishment.FindPunishRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.punishment.FindPunishResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((de.flamefoxes.punishment.DeletePunishRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.punishment.DeletePunishResponse>) responseObserver);
          break;
        case METHODID_CHANGE:
          serviceImpl.change((de.flamefoxes.punishment.ChangePunishRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.punishment.ChangePunishResponse>) responseObserver);
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
        METHOD_FIND,
        METHOD_DELETE,
        METHOD_CHANGE);
  }

}
