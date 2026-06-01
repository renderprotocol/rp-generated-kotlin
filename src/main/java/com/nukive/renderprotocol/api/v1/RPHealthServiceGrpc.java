package com.nukive.renderprotocol.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class RPHealthServiceGrpc {

  private RPHealthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.renderprotocol.api.v1.RPHealthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPHealthCheckRequest,
      com.nukive.renderprotocol.api.v1.RPHealthCheckResponse> getRPHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPHealthCheck",
      requestType = com.nukive.renderprotocol.api.v1.RPHealthCheckRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPHealthCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPHealthCheckRequest,
      com.nukive.renderprotocol.api.v1.RPHealthCheckResponse> getRPHealthCheckMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPHealthCheckRequest, com.nukive.renderprotocol.api.v1.RPHealthCheckResponse> getRPHealthCheckMethod;
    if ((getRPHealthCheckMethod = RPHealthServiceGrpc.getRPHealthCheckMethod) == null) {
      synchronized (RPHealthServiceGrpc.class) {
        if ((getRPHealthCheckMethod = RPHealthServiceGrpc.getRPHealthCheckMethod) == null) {
          RPHealthServiceGrpc.getRPHealthCheckMethod = getRPHealthCheckMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPHealthCheckRequest, com.nukive.renderprotocol.api.v1.RPHealthCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPHealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPHealthCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPHealthCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPHealthServiceMethodDescriptorSupplier("RPHealthCheck"))
              .build();
        }
      }
    }
    return getRPHealthCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RPHealthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPHealthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPHealthServiceStub>() {
        @java.lang.Override
        public RPHealthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPHealthServiceStub(channel, callOptions);
        }
      };
    return RPHealthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RPHealthServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPHealthServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPHealthServiceBlockingV2Stub>() {
        @java.lang.Override
        public RPHealthServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPHealthServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RPHealthServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RPHealthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPHealthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPHealthServiceBlockingStub>() {
        @java.lang.Override
        public RPHealthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPHealthServiceBlockingStub(channel, callOptions);
        }
      };
    return RPHealthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RPHealthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPHealthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPHealthServiceFutureStub>() {
        @java.lang.Override
        public RPHealthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPHealthServiceFutureStub(channel, callOptions);
        }
      };
    return RPHealthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void rPHealthCheck(com.nukive.renderprotocol.api.v1.RPHealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPHealthCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPHealthCheckMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RPHealthService.
   */
  public static abstract class RPHealthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RPHealthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RPHealthService.
   */
  public static final class RPHealthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RPHealthServiceStub> {
    private RPHealthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPHealthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPHealthServiceStub(channel, callOptions);
    }

    /**
     */
    public void rPHealthCheck(com.nukive.renderprotocol.api.v1.RPHealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPHealthCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RPHealthService.
   */
  public static final class RPHealthServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RPHealthServiceBlockingV2Stub> {
    private RPHealthServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPHealthServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPHealthServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPHealthCheckResponse rPHealthCheck(com.nukive.renderprotocol.api.v1.RPHealthCheckRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRPHealthCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RPHealthService.
   */
  public static final class RPHealthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RPHealthServiceBlockingStub> {
    private RPHealthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPHealthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPHealthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPHealthCheckResponse rPHealthCheck(com.nukive.renderprotocol.api.v1.RPHealthCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPHealthCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RPHealthService.
   */
  public static final class RPHealthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RPHealthServiceFutureStub> {
    private RPHealthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPHealthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPHealthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nukive.renderprotocol.api.v1.RPHealthCheckResponse> rPHealthCheck(
        com.nukive.renderprotocol.api.v1.RPHealthCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPHealthCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RPHEALTH_CHECK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RPHEALTH_CHECK:
          serviceImpl.rPHealthCheck((com.nukive.renderprotocol.api.v1.RPHealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPHealthCheckResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRPHealthCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPHealthCheckRequest,
              com.nukive.renderprotocol.api.v1.RPHealthCheckResponse>(
                service, METHODID_RPHEALTH_CHECK)))
        .build();
  }

  private static abstract class RPHealthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RPHealthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nukive.renderprotocol.api.v1.RpApiHealthServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RPHealthService");
    }
  }

  private static final class RPHealthServiceFileDescriptorSupplier
      extends RPHealthServiceBaseDescriptorSupplier {
    RPHealthServiceFileDescriptorSupplier() {}
  }

  private static final class RPHealthServiceMethodDescriptorSupplier
      extends RPHealthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RPHealthServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RPHealthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RPHealthServiceFileDescriptorSupplier())
              .addMethod(getRPHealthCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
