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
    comments = "Source: punishment/mute_service.proto")
public class MuteServiceGrpc {

  private MuteServiceGrpc() {}

  public static final String SERVICE_NAME = "punishment.MuteService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.punishment.CreateMuteRequest,
      de.flamefoxes.punishment.CreateMuteResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "punishment.MuteService", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.CreateMuteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.CreateMuteResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.punishment.FindMuteRequest,
      de.flamefoxes.punishment.FindMuteResponse> METHOD_FIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "punishment.MuteService", "Find"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.FindMuteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.FindMuteResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.punishment.DeleteMuteRequest,
      de.flamefoxes.punishment.DeleteMuteResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "punishment.MuteService", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.DeleteMuteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.DeleteMuteResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.punishment.ChangeMuteRequest,
      de.flamefoxes.punishment.ChangeMuteResponse> METHOD_CHANGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "punishment.MuteService", "Change"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.ChangeMuteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.punishment.ChangeMuteResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MuteServiceStub newStub(io.grpc.Channel channel) {
    return new MuteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MuteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MuteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MuteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MuteServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MuteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(de.flamefoxes.punishment.CreateMuteRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.CreateMuteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void find(de.flamefoxes.punishment.FindMuteRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.FindMuteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND, responseObserver);
    }

    /**
     */
    public void delete(de.flamefoxes.punishment.DeleteMuteRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.DeleteMuteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void change(de.flamefoxes.punishment.ChangeMuteRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.ChangeMuteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHANGE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.punishment.CreateMuteRequest,
                de.flamefoxes.punishment.CreateMuteResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_FIND,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.punishment.FindMuteRequest,
                de.flamefoxes.punishment.FindMuteResponse>(
                  this, METHODID_FIND)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.punishment.DeleteMuteRequest,
                de.flamefoxes.punishment.DeleteMuteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_CHANGE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.punishment.ChangeMuteRequest,
                de.flamefoxes.punishment.ChangeMuteResponse>(
                  this, METHODID_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class MuteServiceStub extends io.grpc.stub.AbstractStub<MuteServiceStub> {
    private MuteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MuteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MuteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MuteServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(de.flamefoxes.punishment.CreateMuteRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.CreateMuteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void find(de.flamefoxes.punishment.FindMuteRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.FindMuteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(de.flamefoxes.punishment.DeleteMuteRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.DeleteMuteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void change(de.flamefoxes.punishment.ChangeMuteRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.punishment.ChangeMuteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHANGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MuteServiceBlockingStub extends io.grpc.stub.AbstractStub<MuteServiceBlockingStub> {
    private MuteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MuteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MuteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MuteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.flamefoxes.punishment.CreateMuteResponse create(de.flamefoxes.punishment.CreateMuteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.punishment.FindMuteResponse find(de.flamefoxes.punishment.FindMuteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.punishment.DeleteMuteResponse delete(de.flamefoxes.punishment.DeleteMuteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.punishment.ChangeMuteResponse change(de.flamefoxes.punishment.ChangeMuteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHANGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MuteServiceFutureStub extends io.grpc.stub.AbstractStub<MuteServiceFutureStub> {
    private MuteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MuteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MuteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MuteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.punishment.CreateMuteResponse> create(
        de.flamefoxes.punishment.CreateMuteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.punishment.FindMuteResponse> find(
        de.flamefoxes.punishment.FindMuteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.punishment.DeleteMuteResponse> delete(
        de.flamefoxes.punishment.DeleteMuteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.punishment.ChangeMuteResponse> change(
        de.flamefoxes.punishment.ChangeMuteRequest request) {
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
    private final MuteServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(MuteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((de.flamefoxes.punishment.CreateMuteRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.punishment.CreateMuteResponse>) responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find((de.flamefoxes.punishment.FindMuteRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.punishment.FindMuteResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((de.flamefoxes.punishment.DeleteMuteRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.punishment.DeleteMuteResponse>) responseObserver);
          break;
        case METHODID_CHANGE:
          serviceImpl.change((de.flamefoxes.punishment.ChangeMuteRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.punishment.ChangeMuteResponse>) responseObserver);
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
