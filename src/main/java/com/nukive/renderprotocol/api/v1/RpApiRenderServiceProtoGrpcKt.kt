package com.nukive.renderprotocol.api.v1

import com.nukive.renderprotocol.api.v1.RPRenderServiceGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for proto.renderprotocol.api.v1.RPRenderService.
 */
public object RPRenderServiceGrpcKt {
  public const val SERVICE_NAME: String = RPRenderServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val rPFetchRenderTreeMethod:
      MethodDescriptor<RPFetchRenderTreeRequest, RPFetchRenderTreeResponse>
    @JvmStatic
    get() = RPRenderServiceGrpc.getRPFetchRenderTreeMethod()

  public val rPFetchComponentMethod:
      MethodDescriptor<RPFetchComponentRequest, RPFetchComponentResponse>
    @JvmStatic
    get() = RPRenderServiceGrpc.getRPFetchComponentMethod()

  public val rPSubscribeRenderTreeMethod:
      MethodDescriptor<RPSubscribeRenderTreeRequest, RPSubscribeRenderTreeResponse>
    @JvmStatic
    get() = RPRenderServiceGrpc.getRPSubscribeRenderTreeMethod()

  /**
   * A stub for issuing RPCs to a(n) proto.renderprotocol.api.v1.RPRenderService service as suspending coroutines.
   */
  @StubFor(RPRenderServiceGrpc::class)
  public class RPRenderServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<RPRenderServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): RPRenderServiceCoroutineStub = RPRenderServiceCoroutineStub(channel, callOptions)

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
    public suspend fun rPFetchRenderTree(request: RPFetchRenderTreeRequest, headers: Metadata = Metadata()): RPFetchRenderTreeResponse = unaryRpc(
      channel,
      RPRenderServiceGrpc.getRPFetchRenderTreeMethod(),
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
    public suspend fun rPFetchComponent(request: RPFetchComponentRequest, headers: Metadata = Metadata()): RPFetchComponentResponse = unaryRpc(
      channel,
      RPRenderServiceGrpc.getRPFetchComponentMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun rPSubscribeRenderTree(request: RPSubscribeRenderTreeRequest, headers: Metadata = Metadata()): Flow<RPSubscribeRenderTreeResponse> = serverStreamingRpc(
      channel,
      RPRenderServiceGrpc.getRPSubscribeRenderTreeMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the proto.renderprotocol.api.v1.RPRenderService service based on Kotlin coroutines.
   */
  public abstract class RPRenderServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for proto.renderprotocol.api.v1.RPRenderService.RPFetchRenderTree.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rPFetchRenderTree(request: RPFetchRenderTreeRequest): RPFetchRenderTreeResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method proto.renderprotocol.api.v1.RPRenderService.RPFetchRenderTree is unimplemented"))

    /**
     * Returns the response to an RPC for proto.renderprotocol.api.v1.RPRenderService.RPFetchComponent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rPFetchComponent(request: RPFetchComponentRequest): RPFetchComponentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method proto.renderprotocol.api.v1.RPRenderService.RPFetchComponent is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for proto.renderprotocol.api.v1.RPRenderService.RPSubscribeRenderTree.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun rPSubscribeRenderTree(request: RPSubscribeRenderTreeRequest): Flow<RPSubscribeRenderTreeResponse> = throw StatusException(UNIMPLEMENTED.withDescription("Method proto.renderprotocol.api.v1.RPRenderService.RPSubscribeRenderTree is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RPRenderServiceGrpc.getRPFetchRenderTreeMethod(),
      implementation = ::rPFetchRenderTree
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RPRenderServiceGrpc.getRPFetchComponentMethod(),
      implementation = ::rPFetchComponent
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = RPRenderServiceGrpc.getRPSubscribeRenderTreeMethod(),
      implementation = ::rPSubscribeRenderTree
    )).build()
  }
}
