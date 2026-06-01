package com.nukive.renderprotocol.api.v1

import com.nukive.renderprotocol.api.v1.RPEventServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for proto.renderprotocol.api.v1.RPEventService.
 */
public object RPEventServiceGrpcKt {
  public const val SERVICE_NAME: String = RPEventServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val rPSubmitEventMethod: MethodDescriptor<RPSubmitEventRequest, RPSubmitEventResponse>
    @JvmStatic
    get() = RPEventServiceGrpc.getRPSubmitEventMethod()

  public val rPSubmitBatchEventsMethod:
      MethodDescriptor<RPSubmitBatchEventsRequest, RPSubmitBatchEventsResponse>
    @JvmStatic
    get() = RPEventServiceGrpc.getRPSubmitBatchEventsMethod()

  /**
   * A stub for issuing RPCs to a(n) proto.renderprotocol.api.v1.RPEventService service as suspending coroutines.
   */
  @StubFor(RPEventServiceGrpc::class)
  public class RPEventServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<RPEventServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): RPEventServiceCoroutineStub = RPEventServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun rPSubmitEvent(request: RPSubmitEventRequest, headers: Metadata = Metadata()): RPSubmitEventResponse = unaryRpc(
      channel,
      RPEventServiceGrpc.getRPSubmitEventMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun rPSubmitBatchEvents(request: RPSubmitBatchEventsRequest, headers: Metadata = Metadata()): RPSubmitBatchEventsResponse = unaryRpc(
      channel,
      RPEventServiceGrpc.getRPSubmitBatchEventsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the proto.renderprotocol.api.v1.RPEventService service based on Kotlin coroutines.
   */
  public abstract class RPEventServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for proto.renderprotocol.api.v1.RPEventService.RPSubmitEvent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rPSubmitEvent(request: RPSubmitEventRequest): RPSubmitEventResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method proto.renderprotocol.api.v1.RPEventService.RPSubmitEvent is unimplemented"))

    /**
     * Returns the response to an RPC for proto.renderprotocol.api.v1.RPEventService.RPSubmitBatchEvents.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rPSubmitBatchEvents(request: RPSubmitBatchEventsRequest): RPSubmitBatchEventsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method proto.renderprotocol.api.v1.RPEventService.RPSubmitBatchEvents is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RPEventServiceGrpc.getRPSubmitEventMethod(),
      implementation = ::rPSubmitEvent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RPEventServiceGrpc.getRPSubmitBatchEventsMethod(),
      implementation = ::rPSubmitBatchEvents
    )).build()
  }
}
