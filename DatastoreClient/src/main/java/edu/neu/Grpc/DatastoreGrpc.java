package edu.neu.Grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Datastore.proto")
public final class DatastoreGrpc {

  private DatastoreGrpc() {}

  public static final String SERVICE_NAME = "Datastore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.PutRequest,
      edu.neu.Grpc.DatastoreOuterClass.APIResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = edu.neu.Grpc.DatastoreOuterClass.PutRequest.class,
      responseType = edu.neu.Grpc.DatastoreOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.PutRequest,
      edu.neu.Grpc.DatastoreOuterClass.APIResponse> getPutMethod() {
    io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.PutRequest, edu.neu.Grpc.DatastoreOuterClass.APIResponse> getPutMethod;
    if ((getPutMethod = DatastoreGrpc.getPutMethod) == null) {
      synchronized (DatastoreGrpc.class) {
        if ((getPutMethod = DatastoreGrpc.getPutMethod) == null) {
          DatastoreGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<edu.neu.Grpc.DatastoreOuterClass.PutRequest, edu.neu.Grpc.DatastoreOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Datastore", "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.neu.Grpc.DatastoreOuterClass.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.neu.Grpc.DatastoreOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatastoreMethodDescriptorSupplier("put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.GetRequest,
      edu.neu.Grpc.DatastoreOuterClass.APIResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = edu.neu.Grpc.DatastoreOuterClass.GetRequest.class,
      responseType = edu.neu.Grpc.DatastoreOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.GetRequest,
      edu.neu.Grpc.DatastoreOuterClass.APIResponse> getGetMethod() {
    io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.GetRequest, edu.neu.Grpc.DatastoreOuterClass.APIResponse> getGetMethod;
    if ((getGetMethod = DatastoreGrpc.getGetMethod) == null) {
      synchronized (DatastoreGrpc.class) {
        if ((getGetMethod = DatastoreGrpc.getGetMethod) == null) {
          DatastoreGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<edu.neu.Grpc.DatastoreOuterClass.GetRequest, edu.neu.Grpc.DatastoreOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Datastore", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.neu.Grpc.DatastoreOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.neu.Grpc.DatastoreOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatastoreMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.DeleteRequest,
      edu.neu.Grpc.DatastoreOuterClass.APIResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = edu.neu.Grpc.DatastoreOuterClass.DeleteRequest.class,
      responseType = edu.neu.Grpc.DatastoreOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.DeleteRequest,
      edu.neu.Grpc.DatastoreOuterClass.APIResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<edu.neu.Grpc.DatastoreOuterClass.DeleteRequest, edu.neu.Grpc.DatastoreOuterClass.APIResponse> getDeleteMethod;
    if ((getDeleteMethod = DatastoreGrpc.getDeleteMethod) == null) {
      synchronized (DatastoreGrpc.class) {
        if ((getDeleteMethod = DatastoreGrpc.getDeleteMethod) == null) {
          DatastoreGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<edu.neu.Grpc.DatastoreOuterClass.DeleteRequest, edu.neu.Grpc.DatastoreOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Datastore", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.neu.Grpc.DatastoreOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.neu.Grpc.DatastoreOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatastoreMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatastoreStub newStub(io.grpc.Channel channel) {
    return new DatastoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatastoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatastoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatastoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatastoreFutureStub(channel);
  }

  /**
   */
  public static abstract class DatastoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(edu.neu.Grpc.DatastoreOuterClass.PutRequest request,
        io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(edu.neu.Grpc.DatastoreOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void delete(edu.neu.Grpc.DatastoreOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.neu.Grpc.DatastoreOuterClass.PutRequest,
                edu.neu.Grpc.DatastoreOuterClass.APIResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.neu.Grpc.DatastoreOuterClass.GetRequest,
                edu.neu.Grpc.DatastoreOuterClass.APIResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.neu.Grpc.DatastoreOuterClass.DeleteRequest,
                edu.neu.Grpc.DatastoreOuterClass.APIResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class DatastoreStub extends io.grpc.stub.AbstractStub<DatastoreStub> {
    private DatastoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatastoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatastoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatastoreStub(channel, callOptions);
    }

    /**
     */
    public void put(edu.neu.Grpc.DatastoreOuterClass.PutRequest request,
        io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(edu.neu.Grpc.DatastoreOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(edu.neu.Grpc.DatastoreOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DatastoreBlockingStub extends io.grpc.stub.AbstractStub<DatastoreBlockingStub> {
    private DatastoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatastoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatastoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatastoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public edu.neu.Grpc.DatastoreOuterClass.APIResponse put(edu.neu.Grpc.DatastoreOuterClass.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.neu.Grpc.DatastoreOuterClass.APIResponse get(edu.neu.Grpc.DatastoreOuterClass.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.neu.Grpc.DatastoreOuterClass.APIResponse delete(edu.neu.Grpc.DatastoreOuterClass.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DatastoreFutureStub extends io.grpc.stub.AbstractStub<DatastoreFutureStub> {
    private DatastoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatastoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatastoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatastoreFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.neu.Grpc.DatastoreOuterClass.APIResponse> put(
        edu.neu.Grpc.DatastoreOuterClass.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.neu.Grpc.DatastoreOuterClass.APIResponse> get(
        edu.neu.Grpc.DatastoreOuterClass.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.neu.Grpc.DatastoreOuterClass.APIResponse> delete(
        edu.neu.Grpc.DatastoreOuterClass.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatastoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatastoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((edu.neu.Grpc.DatastoreOuterClass.PutRequest) request,
              (io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((edu.neu.Grpc.DatastoreOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((edu.neu.Grpc.DatastoreOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<edu.neu.Grpc.DatastoreOuterClass.APIResponse>) responseObserver);
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

  private static abstract class DatastoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatastoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.neu.Grpc.DatastoreOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Datastore");
    }
  }

  private static final class DatastoreFileDescriptorSupplier
      extends DatastoreBaseDescriptorSupplier {
    DatastoreFileDescriptorSupplier() {}
  }

  private static final class DatastoreMethodDescriptorSupplier
      extends DatastoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatastoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (DatastoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatastoreFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
