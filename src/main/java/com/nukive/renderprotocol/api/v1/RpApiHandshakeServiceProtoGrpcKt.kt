package com.nukive.renderprotocol.api.v1

import com.nukive.renderprotocol.api.v1.RPHandshakeServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for proto.renderprotocol.api.v1.RPHandshakeService.
 */
public object RPHandshakeServiceGrpcKt {
  public const val SERVICE_NAME: String = RPHandshakeServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val rPInitiateMethod: MethodDescriptor<RPInitiateRequest, RPInitiateResponse>
    @JvmStatic
    get() = RPHandshakeServiceGrpc.getRPInitiateMethod()

  public val rPRefreshSessionMethod:
      MethodDescriptor<RPRefreshSessionRequest, RPRefreshSessionResponse>
    @JvmStatic
    get() = RPHandshakeServiceGrpc.getRPRefreshSessionMethod()

  public val rPEndSessionMethod: MethodDescriptor<RPEndSessionRequest, RPEndSessionResponse>
    @JvmStatic
    get() = RPHandshakeServiceGrpc.getRPEndSessionMethod()

  /**
   * A stub for issuing RPCs to a(n) proto.renderprotocol.api.v1.RPHandshakeService service as suspending coroutines.
   */
  @StubFor(RPHandshakeServiceGrpc::class)
  public class RPHandshakeServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<RPHandshakeServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): RPHandshakeServiceCoroutineStub = RPHandshakeServiceCoroutineStub(channel, callOptions)

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
    public suspend fun rPInitiate(request: RPInitiateRequest, headers: Metadata = Metadata()): RPInitiateResponse = unaryRpc(
      channel,
      RPHandshakeServiceGrpc.getRPInitiateMethod(),
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
    public suspend fun rPRefreshSession(request: RPRefreshSessionRequest, headers: Metadata = Metadata()): RPRefreshSessionResponse = unaryRpc(
      channel,
      RPHandshakeServiceGrpc.getRPRefreshSessionMethod(),
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
    public suspend fun rPEndSession(request: RPEndSessionRequest, headers: Metadata = Metadata()): RPEndSessionResponse = unaryRpc(
      channel,
      RPHandshakeServiceGrpc.getRPEndSessionMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the proto.renderprotocol.api.v1.RPHandshakeService service based on Kotlin coroutines.
   */
  public abstract class RPHandshakeServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for proto.renderprotocol.api.v1.RPHandshakeService.RPInitiate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rPInitiate(request: RPInitiateRequest): RPInitiateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method proto.renderprotocol.api.v1.RPHandshakeService.RPInitiate is unimplemented"))

    /**
     * Returns the response to an RPC for proto.renderprotocol.api.v1.RPHandshakeService.RPRefreshSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rPRefreshSession(request: RPRefreshSessionRequest): RPRefreshSessionResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method proto.renderprotocol.api.v1.RPHandshakeService.RPRefreshSession is unimplemented"))

    /**
     * Returns the response to an RPC for proto.renderprotocol.api.v1.RPHandshakeService.RPEndSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rPEndSession(request: RPEndSessionRequest): RPEndSessionResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method proto.renderprotocol.api.v1.RPHandshakeService.RPEndSession is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RPHandshakeServiceGrpc.getRPInitiateMethod(),
      implementation = ::rPInitiate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RPHandshakeServiceGrpc.getRPRefreshSessionMethod(),
      implementation = ::rPRefreshSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RPHandshakeServiceGrpc.getRPEndSessionMethod(),
      implementation = ::rPEndSession
    )).build()
  }
}
