package com.nukive.renderprotocol.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class RPRenderServiceGrpc {

  private RPRenderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.renderprotocol.api.v1.RPRenderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest,
      com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse> getRPFetchRenderTreeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPFetchRenderTree",
      requestType = com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest,
      com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse> getRPFetchRenderTreeMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest, com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse> getRPFetchRenderTreeMethod;
    if ((getRPFetchRenderTreeMethod = RPRenderServiceGrpc.getRPFetchRenderTreeMethod) == null) {
      synchronized (RPRenderServiceGrpc.class) {
        if ((getRPFetchRenderTreeMethod = RPRenderServiceGrpc.getRPFetchRenderTreeMethod) == null) {
          RPRenderServiceGrpc.getRPFetchRenderTreeMethod = getRPFetchRenderTreeMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest, com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPFetchRenderTree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPRenderServiceMethodDescriptorSupplier("RPFetchRenderTree"))
              .build();
        }
      }
    }
    return getRPFetchRenderTreeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPFetchComponentRequest,
      com.nukive.renderprotocol.api.v1.RPFetchComponentResponse> getRPFetchComponentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPFetchComponent",
      requestType = com.nukive.renderprotocol.api.v1.RPFetchComponentRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPFetchComponentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPFetchComponentRequest,
      com.nukive.renderprotocol.api.v1.RPFetchComponentResponse> getRPFetchComponentMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPFetchComponentRequest, com.nukive.renderprotocol.api.v1.RPFetchComponentResponse> getRPFetchComponentMethod;
    if ((getRPFetchComponentMethod = RPRenderServiceGrpc.getRPFetchComponentMethod) == null) {
      synchronized (RPRenderServiceGrpc.class) {
        if ((getRPFetchComponentMethod = RPRenderServiceGrpc.getRPFetchComponentMethod) == null) {
          RPRenderServiceGrpc.getRPFetchComponentMethod = getRPFetchComponentMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPFetchComponentRequest, com.nukive.renderprotocol.api.v1.RPFetchComponentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPFetchComponent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPFetchComponentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPFetchComponentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPRenderServiceMethodDescriptorSupplier("RPFetchComponent"))
              .build();
        }
      }
    }
    return getRPFetchComponentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest,
      com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse> getRPSubscribeRenderTreeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPSubscribeRenderTree",
      requestType = com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest,
      com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse> getRPSubscribeRenderTreeMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest, com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse> getRPSubscribeRenderTreeMethod;
    if ((getRPSubscribeRenderTreeMethod = RPRenderServiceGrpc.getRPSubscribeRenderTreeMethod) == null) {
      synchronized (RPRenderServiceGrpc.class) {
        if ((getRPSubscribeRenderTreeMethod = RPRenderServiceGrpc.getRPSubscribeRenderTreeMethod) == null) {
          RPRenderServiceGrpc.getRPSubscribeRenderTreeMethod = getRPSubscribeRenderTreeMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest, com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPSubscribeRenderTree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPRenderServiceMethodDescriptorSupplier("RPSubscribeRenderTree"))
              .build();
        }
      }
    }
    return getRPSubscribeRenderTreeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RPRenderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPRenderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPRenderServiceStub>() {
        @java.lang.Override
        public RPRenderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPRenderServiceStub(channel, callOptions);
        }
      };
    return RPRenderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RPRenderServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPRenderServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPRenderServiceBlockingV2Stub>() {
        @java.lang.Override
        public RPRenderServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPRenderServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RPRenderServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RPRenderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPRenderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPRenderServiceBlockingStub>() {
        @java.lang.Override
        public RPRenderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPRenderServiceBlockingStub(channel, callOptions);
        }
      };
    return RPRenderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RPRenderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPRenderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPRenderServiceFutureStub>() {
        @java.lang.Override
        public RPRenderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPRenderServiceFutureStub(channel, callOptions);
        }
      };
    return RPRenderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void rPFetchRenderTree(com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPFetchRenderTreeMethod(), responseObserver);
    }

    /**
     */
    default void rPFetchComponent(com.nukive.renderprotocol.api.v1.RPFetchComponentRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPFetchComponentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPFetchComponentMethod(), responseObserver);
    }

    /**
     */
    default void rPSubscribeRenderTree(com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPSubscribeRenderTreeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RPRenderService.
   */
  public static abstract class RPRenderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RPRenderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RPRenderService.
   */
  public static final class RPRenderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RPRenderServiceStub> {
    private RPRenderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPRenderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPRenderServiceStub(channel, callOptions);
    }

    /**
     */
    public void rPFetchRenderTree(com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPFetchRenderTreeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPFetchComponent(com.nukive.renderprotocol.api.v1.RPFetchComponentRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPFetchComponentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPFetchComponentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPSubscribeRenderTree(com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRPSubscribeRenderTreeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RPRenderService.
   */
  public static final class RPRenderServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RPRenderServiceBlockingV2Stub> {
    private RPRenderServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPRenderServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPRenderServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse rPFetchRenderTree(com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRPFetchRenderTreeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPFetchComponentResponse rPFetchComponent(com.nukive.renderprotocol.api.v1.RPFetchComponentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRPFetchComponentMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse>
        rPSubscribeRenderTree(com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getRPSubscribeRenderTreeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RPRenderService.
   */
  public static final class RPRenderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RPRenderServiceBlockingStub> {
    private RPRenderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPRenderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPRenderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse rPFetchRenderTree(com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPFetchRenderTreeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPFetchComponentResponse rPFetchComponent(com.nukive.renderprotocol.api.v1.RPFetchComponentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPFetchComponentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse> rPSubscribeRenderTree(
        com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRPSubscribeRenderTreeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RPRenderService.
   */
  public static final class RPRenderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RPRenderServiceFutureStub> {
    private RPRenderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPRenderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPRenderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse> rPFetchRenderTree(
        com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPFetchRenderTreeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nukive.renderprotocol.api.v1.RPFetchComponentResponse> rPFetchComponent(
        com.nukive.renderprotocol.api.v1.RPFetchComponentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPFetchComponentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RPFETCH_RENDER_TREE = 0;
  private static final int METHODID_RPFETCH_COMPONENT = 1;
  private static final int METHODID_RPSUBSCRIBE_RENDER_TREE = 2;

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
        case METHODID_RPFETCH_RENDER_TREE:
          serviceImpl.rPFetchRenderTree((com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse>) responseObserver);
          break;
        case METHODID_RPFETCH_COMPONENT:
          serviceImpl.rPFetchComponent((com.nukive.renderprotocol.api.v1.RPFetchComponentRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPFetchComponentResponse>) responseObserver);
          break;
        case METHODID_RPSUBSCRIBE_RENDER_TREE:
          serviceImpl.rPSubscribeRenderTree((com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse>) responseObserver);
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
          getRPFetchRenderTreeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPFetchRenderTreeRequest,
              com.nukive.renderprotocol.api.v1.RPFetchRenderTreeResponse>(
                service, METHODID_RPFETCH_RENDER_TREE)))
        .addMethod(
          getRPFetchComponentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPFetchComponentRequest,
              com.nukive.renderprotocol.api.v1.RPFetchComponentResponse>(
                service, METHODID_RPFETCH_COMPONENT)))
        .addMethod(
          getRPSubscribeRenderTreeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeRequest,
              com.nukive.renderprotocol.api.v1.RPSubscribeRenderTreeResponse>(
                service, METHODID_RPSUBSCRIBE_RENDER_TREE)))
        .build();
  }

  private static abstract class RPRenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RPRenderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nukive.renderprotocol.api.v1.RpApiRenderServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RPRenderService");
    }
  }

  private static final class RPRenderServiceFileDescriptorSupplier
      extends RPRenderServiceBaseDescriptorSupplier {
    RPRenderServiceFileDescriptorSupplier() {}
  }

  private static final class RPRenderServiceMethodDescriptorSupplier
      extends RPRenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RPRenderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RPRenderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RPRenderServiceFileDescriptorSupplier())
              .addMethod(getRPFetchRenderTreeMethod())
              .addMethod(getRPFetchComponentMethod())
              .addMethod(getRPSubscribeRenderTreeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
