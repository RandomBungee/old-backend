package de.flamefoxes.report;

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
    comments = "Source: report/report_service.proto")
public class ReportServiceGrpc {

  private ReportServiceGrpc() {}

  public static final String SERVICE_NAME = "report.ReportService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.report.CreateReportRequest,
      de.flamefoxes.report.CreateReportResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "report.ReportService", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.report.CreateReportRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.report.CreateReportResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.report.FindReportRequest,
      de.flamefoxes.report.FindReportResponse> METHOD_FIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "report.ReportService", "Find"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.report.FindReportRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.report.FindReportResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.report.DeleteReportRequest,
      de.flamefoxes.report.DeleteReportResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "report.ReportService", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.report.DeleteReportRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.report.DeleteReportResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<de.flamefoxes.report.ChangeReportRequest,
      de.flamefoxes.report.ChangeReportResponse> METHOD_CHANGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "report.ReportService", "Change"),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.report.ChangeReportRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(de.flamefoxes.report.ChangeReportResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportServiceStub newStub(io.grpc.Channel channel) {
    return new ReportServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReportServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReportServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReportServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(de.flamefoxes.report.CreateReportRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.report.CreateReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void find(de.flamefoxes.report.FindReportRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.report.FindReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND, responseObserver);
    }

    /**
     */
    public void delete(de.flamefoxes.report.DeleteReportRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.report.DeleteReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void change(de.flamefoxes.report.ChangeReportRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.report.ChangeReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHANGE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.report.CreateReportRequest,
                de.flamefoxes.report.CreateReportResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_FIND,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.report.FindReportRequest,
                de.flamefoxes.report.FindReportResponse>(
                  this, METHODID_FIND)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.report.DeleteReportRequest,
                de.flamefoxes.report.DeleteReportResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_CHANGE,
            asyncUnaryCall(
              new MethodHandlers<
                de.flamefoxes.report.ChangeReportRequest,
                de.flamefoxes.report.ChangeReportResponse>(
                  this, METHODID_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class ReportServiceStub extends io.grpc.stub.AbstractStub<ReportServiceStub> {
    private ReportServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(de.flamefoxes.report.CreateReportRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.report.CreateReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void find(de.flamefoxes.report.FindReportRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.report.FindReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(de.flamefoxes.report.DeleteReportRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.report.DeleteReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void change(de.flamefoxes.report.ChangeReportRequest request,
        io.grpc.stub.StreamObserver<de.flamefoxes.report.ChangeReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHANGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReportServiceBlockingStub extends io.grpc.stub.AbstractStub<ReportServiceBlockingStub> {
    private ReportServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.flamefoxes.report.CreateReportResponse create(de.flamefoxes.report.CreateReportRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.report.FindReportResponse find(de.flamefoxes.report.FindReportRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.report.DeleteReportResponse delete(de.flamefoxes.report.DeleteReportRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public de.flamefoxes.report.ChangeReportResponse change(de.flamefoxes.report.ChangeReportRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHANGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReportServiceFutureStub extends io.grpc.stub.AbstractStub<ReportServiceFutureStub> {
    private ReportServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.report.CreateReportResponse> create(
        de.flamefoxes.report.CreateReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.report.FindReportResponse> find(
        de.flamefoxes.report.FindReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.report.DeleteReportResponse> delete(
        de.flamefoxes.report.DeleteReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.flamefoxes.report.ChangeReportResponse> change(
        de.flamefoxes.report.ChangeReportRequest request) {
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
    private final ReportServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((de.flamefoxes.report.CreateReportRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.report.CreateReportResponse>) responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find((de.flamefoxes.report.FindReportRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.report.FindReportResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((de.flamefoxes.report.DeleteReportRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.report.DeleteReportResponse>) responseObserver);
          break;
        case METHODID_CHANGE:
          serviceImpl.change((de.flamefoxes.report.ChangeReportRequest) request,
              (io.grpc.stub.StreamObserver<de.flamefoxes.report.ChangeReportResponse>) responseObserver);
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
