package com.nukive.renderprotocol.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class RPEventServiceGrpc {

  private RPEventServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.renderprotocol.api.v1.RPEventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubmitEventRequest,
      com.nukive.renderprotocol.api.v1.RPSubmitEventResponse> getRPSubmitEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPSubmitEvent",
      requestType = com.nukive.renderprotocol.api.v1.RPSubmitEventRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPSubmitEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubmitEventRequest,
      com.nukive.renderprotocol.api.v1.RPSubmitEventResponse> getRPSubmitEventMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubmitEventRequest, com.nukive.renderprotocol.api.v1.RPSubmitEventResponse> getRPSubmitEventMethod;
    if ((getRPSubmitEventMethod = RPEventServiceGrpc.getRPSubmitEventMethod) == null) {
      synchronized (RPEventServiceGrpc.class) {
        if ((getRPSubmitEventMethod = RPEventServiceGrpc.getRPSubmitEventMethod) == null) {
          RPEventServiceGrpc.getRPSubmitEventMethod = getRPSubmitEventMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPSubmitEventRequest, com.nukive.renderprotocol.api.v1.RPSubmitEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPSubmitEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPSubmitEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPSubmitEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPEventServiceMethodDescriptorSupplier("RPSubmitEvent"))
              .build();
        }
      }
    }
    return getRPSubmitEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest,
      com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse> getRPSubmitBatchEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPSubmitBatchEvents",
      requestType = com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest.class,
      responseType = com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest,
      com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse> getRPSubmitBatchEventsMethod() {
    io.grpc.MethodDescriptor<com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest, com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse> getRPSubmitBatchEventsMethod;
    if ((getRPSubmitBatchEventsMethod = RPEventServiceGrpc.getRPSubmitBatchEventsMethod) == null) {
      synchronized (RPEventServiceGrpc.class) {
        if ((getRPSubmitBatchEventsMethod = RPEventServiceGrpc.getRPSubmitBatchEventsMethod) == null) {
          RPEventServiceGrpc.getRPSubmitBatchEventsMethod = getRPSubmitBatchEventsMethod =
              io.grpc.MethodDescriptor.<com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest, com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPSubmitBatchEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RPEventServiceMethodDescriptorSupplier("RPSubmitBatchEvents"))
              .build();
        }
      }
    }
    return getRPSubmitBatchEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RPEventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPEventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPEventServiceStub>() {
        @java.lang.Override
        public RPEventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPEventServiceStub(channel, callOptions);
        }
      };
    return RPEventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RPEventServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPEventServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPEventServiceBlockingV2Stub>() {
        @java.lang.Override
        public RPEventServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPEventServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RPEventServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RPEventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPEventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPEventServiceBlockingStub>() {
        @java.lang.Override
        public RPEventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPEventServiceBlockingStub(channel, callOptions);
        }
      };
    return RPEventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RPEventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPEventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPEventServiceFutureStub>() {
        @java.lang.Override
        public RPEventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPEventServiceFutureStub(channel, callOptions);
        }
      };
    return RPEventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void rPSubmitEvent(com.nukive.renderprotocol.api.v1.RPSubmitEventRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubmitEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPSubmitEventMethod(), responseObserver);
    }

    /**
     */
    default void rPSubmitBatchEvents(com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPSubmitBatchEventsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RPEventService.
   */
  public static abstract class RPEventServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RPEventServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RPEventService.
   */
  public static final class RPEventServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RPEventServiceStub> {
    private RPEventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPEventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPEventServiceStub(channel, callOptions);
    }

    /**
     */
    public void rPSubmitEvent(com.nukive.renderprotocol.api.v1.RPSubmitEventRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubmitEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPSubmitEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPSubmitBatchEvents(com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest request,
        io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPSubmitBatchEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RPEventService.
   */
  public static final class RPEventServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RPEventServiceBlockingV2Stub> {
    private RPEventServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPEventServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPEventServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPSubmitEventResponse rPSubmitEvent(com.nukive.renderprotocol.api.v1.RPSubmitEventRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRPSubmitEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse rPSubmitBatchEvents(com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRPSubmitBatchEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RPEventService.
   */
  public static final class RPEventServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RPEventServiceBlockingStub> {
    private RPEventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPEventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPEventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPSubmitEventResponse rPSubmitEvent(com.nukive.renderprotocol.api.v1.RPSubmitEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPSubmitEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse rPSubmitBatchEvents(com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPSubmitBatchEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RPEventService.
   */
  public static final class RPEventServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RPEventServiceFutureStub> {
    private RPEventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPEventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPEventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nukive.renderprotocol.api.v1.RPSubmitEventResponse> rPSubmitEvent(
        com.nukive.renderprotocol.api.v1.RPSubmitEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPSubmitEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse> rPSubmitBatchEvents(
        com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPSubmitBatchEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RPSUBMIT_EVENT = 0;
  private static final int METHODID_RPSUBMIT_BATCH_EVENTS = 1;

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
        case METHODID_RPSUBMIT_EVENT:
          serviceImpl.rPSubmitEvent((com.nukive.renderprotocol.api.v1.RPSubmitEventRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubmitEventResponse>) responseObserver);
          break;
        case METHODID_RPSUBMIT_BATCH_EVENTS:
          serviceImpl.rPSubmitBatchEvents((com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse>) responseObserver);
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
          getRPSubmitEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPSubmitEventRequest,
              com.nukive.renderprotocol.api.v1.RPSubmitEventResponse>(
                service, METHODID_RPSUBMIT_EVENT)))
        .addMethod(
          getRPSubmitBatchEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsRequest,
              com.nukive.renderprotocol.api.v1.RPSubmitBatchEventsResponse>(
                service, METHODID_RPSUBMIT_BATCH_EVENTS)))
        .build();
  }

  private static abstract class RPEventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RPEventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nukive.renderprotocol.api.v1.RpApiEventServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RPEventService");
    }
  }

  private static final class RPEventServiceFileDescriptorSupplier
      extends RPEventServiceBaseDescriptorSupplier {
    RPEventServiceFileDescriptorSupplier() {}
  }

  private static final class RPEventServiceMethodDescriptorSupplier
      extends RPEventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RPEventServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RPEventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RPEventServiceFileDescriptorSupplier())
              .addMethod(getRPSubmitEventMethod())
              .addMethod(getRPSubmitBatchEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
