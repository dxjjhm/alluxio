// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: key_value_master.proto

package alluxio.grpc;

public interface CompletePartitionPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.CompletePartitionPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string path = 1;</code>
   */
  boolean hasPath();
  /**
   * <code>optional string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <code>optional string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>optional .alluxio.grpc.PartitionInfo partitionInfo = 2;</code>
   */
  boolean hasPartitionInfo();
  /**
   * <code>optional .alluxio.grpc.PartitionInfo partitionInfo = 2;</code>
   */
  alluxio.grpc.PartitionInfo getPartitionInfo();
  /**
   * <code>optional .alluxio.grpc.PartitionInfo partitionInfo = 2;</code>
   */
  alluxio.grpc.PartitionInfoOrBuilder getPartitionInfoOrBuilder();

  /**
   * <code>optional .alluxio.grpc.CompletePartitionPOptions options = 3;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.CompletePartitionPOptions options = 3;</code>
   */
  alluxio.grpc.CompletePartitionPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.CompletePartitionPOptions options = 3;</code>
   */
  alluxio.grpc.CompletePartitionPOptionsOrBuilder getOptionsOrBuilder();
}