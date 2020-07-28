package de.flamefoxes.chatlog;

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
    comments = "Source: chatlog/chatlog_service.proto")
public class ChatlogServiceGrpc {

  private ChatlogServiceGrpc() {}

  public static final String SERVICE_NAME = "group.ChatlogService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.chatlog.CreateChatlogRequest,
      de.flamefoxes.chatlog.CreateChatlogResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.ChatlogService", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.chatlog.CreateChatlogRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.chatlog.CreateChatlogResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.chatlog.DeleteChatlogRequest,
      de.flamefoxes.chatlog.DeleteChatlogResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.ChatlogService", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.chatlog.DeleteChatlogRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.chatlog.DeleteChatlogResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.chatlog.ListChatlogRequest,
      de.flamefoxes.chatlog.ListChatlogResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "group.ChatlogService", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.chatlog.ListChatlogRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.chatlog.ListChatlogResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatlogServiceStub newStub(io.grpc.Channel channel) {
    return new ChatlogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatlogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatlogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ChatlogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatlogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChatlogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(de.flamefoxes.chatlog.CreateChatlogRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.CreateChatlogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void delete(de.flamefoxes.chatlog.DeleteChatlogRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.DeleteChatlogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void list(de.flamefoxes.chatlog.ListChatlogRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.ListChatlogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.chatlog.CreateChatlogRequest,
                de.flamefoxes.chatlog.CreateChatlogResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.chatlog.DeleteChatlogRequest,
                de.flamefoxes.chatlog.DeleteChatlogResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.chatlog.ListChatlogRequest,
                de.flamefoxes.chatlog.ListChatlogResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ChatlogServiceStub extends io.grpc.stub.AbstractStub<ChatlogServiceStub> {
    private ChatlogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatlogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatlogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatlogServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(de.flamefoxes.chatlog.CreateChatlogRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.CreateChatlogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(de.flamefoxes.chatlog.DeleteChatlogRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.DeleteChatlogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(de.flamefoxes.chatlog.ListChatlogRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.ListChatlogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChatlogServiceBlockingStub extends io.grpc.stub.AbstractStub<ChatlogServiceBlockingStub> {
    private ChatlogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatlogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatlogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatlogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.flamefoxes.chatlog.CreateChatlogResponse create(de.flamefoxes.chatlog.CreateChatlogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.chatlog.DeleteChatlogResponse delete(de.flamefoxes.chatlog.DeleteChatlogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.chatlog.ListChatlogResponse list(de.flamefoxes.chatlog.ListChatlogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatlogServiceFutureStub extends io.grpc.stub.AbstractStub<ChatlogServiceFutureStub> {
    private ChatlogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatlogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatlogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatlogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.chatlog.CreateChatlogResponse> create(
        de.flamefoxes.chatlog.CreateChatlogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.chatlog.DeleteChatlogResponse> delete(
        de.flamefoxes.chatlog.DeleteChatlogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.chatlog.ListChatlogResponse> list(
        de.flamefoxes.chatlog.ListChatlogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_LIST = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatlogServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ChatlogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((de.flamefoxes.chatlog.CreateChatlogRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.CreateChatlogResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((de.flamefoxes.chatlog.DeleteChatlogRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.DeleteChatlogResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((de.flamefoxes.chatlog.ListChatlogRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.chatlog.ListChatlogResponse>) responseObserver);
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
        METHOD_DELETE,
        METHOD_LIST);
  }

}
