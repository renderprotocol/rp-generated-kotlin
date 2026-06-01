package com.nukive.renderprotocol.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class RPHandshakeServiceGrpc {

  private RPHandshakeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.renderprotocol.api.v1.RPHandshakeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPInitiateRequest,
      com.nukive.renderprotocol.api.v1.RPInitiateResponse> getRPInitiateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPInitiate",
      requestType = com.nukive.renderprotocol.api.v1.RPInitiateRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPInitiateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPInitiateRequest,
      com.nukive.renderprotocol.api.v1.RPInitiateResponse> getRPInitiateMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPInitiateRequest, com.nukive.renderprotocol.api.v1.RPInitiateResponse> getRPInitiateMethod;
    if ((getRPInitiateMethod = RPHandshakeServiceGrpc.getRPInitiateMethod) == null) {
      synchronized (RPHandshakeServiceGrpc.class) {
        if ((getRPInitiateMethod = RPHandshakeServiceGrpc.getRPInitiateMethod) == null) {
          RPHandshakeServiceGrpc.getRPInitiateMethod = getRPInitiateMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPInitiateRequest, com.nukive.renderprotocol.api.v1.RPInitiateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPInitiate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPInitiateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPInitiateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPHandshakeServiceMethodDescriptorSupplier("RPInitiate"))
              .build();
        }
      }
    }
    return getRPInitiateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest,
      com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse> getRPRefreshSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPRefreshSession",
      requestType = com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest,
      com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse> getRPRefreshSessionMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest, com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse> getRPRefreshSessionMethod;
    if ((getRPRefreshSessionMethod = RPHandshakeServiceGrpc.getRPRefreshSessionMethod) == null) {
      synchronized (RPHandshakeServiceGrpc.class) {
        if ((getRPRefreshSessionMethod = RPHandshakeServiceGrpc.getRPRefreshSessionMethod) == null) {
          RPHandshakeServiceGrpc.getRPRefreshSessionMethod = getRPRefreshSessionMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest, com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPRefreshSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPHandshakeServiceMethodDescriptorSupplier("RPRefreshSession"))
              .build();
        }
      }
    }
    return getRPRefreshSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPEndSessionRequest,
      com.nukive.renderprotocol.api.v1.RPEndSessionResponse> getRPEndSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPEndSession",
      requestType = com.nukive.renderprotocol.api.v1.RPEndSessionRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPEndSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPEndSessionRequest,
      com.nukive.renderprotocol.api.v1.RPEndSessionResponse> getRPEndSessionMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPEndSessionRequest, com.nukive.renderprotocol.api.v1.RPEndSessionResponse> getRPEndSessionMethod;
    if ((getRPEndSessionMethod = RPHandshakeServiceGrpc.getRPEndSessionMethod) == null) {
      synchronized (RPHandshakeServiceGrpc.class) {
        if ((getRPEndSessionMethod = RPHandshakeServiceGrpc.getRPEndSessionMethod) == null) {
          RPHandshakeServiceGrpc.getRPEndSessionMethod = getRPEndSessionMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPEndSessionRequest, com.nukive.renderprotocol.api.v1.RPEndSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPEndSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPEndSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPEndSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPHandshakeServiceMethodDescriptorSupplier("RPEndSession"))
              .build();
        }
      }
    }
    return getRPEndSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RPHandshakeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPHandshakeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPHandshakeServiceStub>() {
        @java.lang.Override
        public RPHandshakeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPHandshakeServiceStub(channel, callOptions);
        }
      };
    return RPHandshakeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RPHandshakeServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPHandshakeServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPHandshakeServiceBlockingV2Stub>() {
        @java.lang.Override
        public RPHandshakeServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPHandshakeServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RPHandshakeServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RPHandshakeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPHandshakeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPHandshakeServiceBlockingStub>() {
        @java.lang.Override
        public RPHandshakeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPHandshakeServiceBlockingStub(channel, callOptions);
        }
      };
    return RPHandshakeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RPHandshakeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPHandshakeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPHandshakeServiceFutureStub>() {
        @java.lang.Override
        public RPHandshakeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPHandshakeServiceFutureStub(channel, callOptions);
        }
      };
    return RPHandshakeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void rPInitiate(com.nukive.renderprotocol.api.v1.RPInitiateRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPInitiateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPInitiateMethod(), responseObserver);
    }

    /**
     */
    default void rPRefreshSession(com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPRefreshSessionMethod(), responseObserver);
    }

    /**
     */
    default void rPEndSession(com.nukive.renderprotocol.api.v1.RPEndSessionRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPEndSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPEndSessionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RPHandshakeService.
   */
  public static abstract class RPHandshakeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RPHandshakeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RPHandshakeService.
   */
  public static final class RPHandshakeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RPHandshakeServiceStub> {
    private RPHandshakeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPHandshakeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPHandshakeServiceStub(channel, callOptions);
    }

    /**
     */
    public void rPInitiate(com.nukive.renderprotocol.api.v1.RPInitiateRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPInitiateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPInitiateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPRefreshSession(com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPRefreshSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPEndSession(com.nukive.renderprotocol.api.v1.RPEndSessionRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPEndSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPEndSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RPHandshakeService.
   */
  public static final class RPHandshakeServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RPHandshakeServiceBlockingV2Stub> {
    private RPHandshakeServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPHandshakeServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPHandshakeServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPInitiateResponse rPInitiate(com.nukive.renderprotocol.api.v1.RPInitiateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRPInitiateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse rPRefreshSession(com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRPRefreshSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPEndSessionResponse rPEndSession(com.nukive.renderprotocol.api.v1.RPEndSessionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRPEndSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RPHandshakeService.
   */
  public static final class RPHandshakeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RPHandshakeServiceBlockingStub> {
    private RPHandshakeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPHandshakeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPHandshakeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPInitiateResponse rPInitiate(com.nukive.renderprotocol.api.v1.RPInitiateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPInitiateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse rPRefreshSession(com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPRefreshSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPEndSessionResponse rPEndSession(com.nukive.renderprotocol.api.v1.RPEndSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPEndSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RPHandshakeService.
   */
  public static final class RPHandshakeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RPHandshakeServiceFutureStub> {
    private RPHandshakeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPHandshakeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPHandshakeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nukive.renderprotocol.api.v1.RPInitiateResponse> rPInitiate(
        com.nukive.renderprotocol.api.v1.RPInitiateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPInitiateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse> rPRefreshSession(
        com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPRefreshSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nukive.renderprotocol.api.v1.RPEndSessionResponse> rPEndSession(
        com.nukive.renderprotocol.api.v1.RPEndSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPEndSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RPINITIATE = 0;
  private static final int METHODID_RPREFRESH_SESSION = 1;
  private static final int METHODID_RPEND_SESSION = 2;

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
        case METHODID_RPINITIATE:
          serviceImpl.rPInitiate((com.nukive.renderprotocol.api.v1.RPInitiateRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPInitiateResponse>) responseObserver);
          break;
        case METHODID_RPREFRESH_SESSION:
          serviceImpl.rPRefreshSession((com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse>) responseObserver);
          break;
        case METHODID_RPEND_SESSION:
          serviceImpl.rPEndSession((com.nukive.renderprotocol.api.v1.RPEndSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPEndSessionResponse>) responseObserver);
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
          getRPInitiateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPInitiateRequest,
              com.nukive.renderprotocol.api.v1.RPInitiateResponse>(
                service, METHODID_RPINITIATE)))
        .addMethod(
          getRPRefreshSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPRefreshSessionRequest,
              com.nukive.renderprotocol.api.v1.RPRefreshSessionResponse>(
                service, METHODID_RPREFRESH_SESSION)))
        .addMethod(
          getRPEndSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPEndSessionRequest,
              com.nukive.renderprotocol.api.v1.RPEndSessionResponse>(
                service, METHODID_RPEND_SESSION)))
        .build();
  }

  private static abstract class RPHandshakeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RPHandshakeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nukive.renderprotocol.api.v1.RpApiHandshakeServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RPHandshakeService");
    }
  }

  private static final class RPHandshakeServiceFileDescriptorSupplier
      extends RPHandshakeServiceBaseDescriptorSupplier {
    RPHandshakeServiceFileDescriptorSupplier() {}
  }

  private static final class RPHandshakeServiceMethodDescriptorSupplier
      extends RPHandshakeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RPHandshakeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RPHandshakeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RPHandshakeServiceFileDescriptorSupplier())
              .addMethod(getRPInitiateMethod())
              .addMethod(getRPRefreshSessionMethod())
              .addMethod(getRPEndSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
