// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package io.grpc.xds.shaded.validate;

public interface AnyRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:validate.AnyRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required specifies that this field must be set
   * </pre>
   *
   * <code>optional bool required = 1;</code>
   */
  boolean hasRequired();
  /**
   * <pre>
   * Required specifies that this field must be set
   * </pre>
   *
   * <code>optional bool required = 1;</code>
   */
  boolean getRequired();

  /**
   * <pre>
   * In specifies that this field's `type_url` must be equal to one of the
   * specified values.
   * </pre>
   *
   * <code>repeated string in = 2;</code>
   */
  java.util.List<java.lang.String>
      getInList();
  /**
   * <pre>
   * In specifies that this field's `type_url` must be equal to one of the
   * specified values.
   * </pre>
   *
   * <code>repeated string in = 2;</code>
   */
  int getInCount();
  /**
   * <pre>
   * In specifies that this field's `type_url` must be equal to one of the
   * specified values.
   * </pre>
   *
   * <code>repeated string in = 2;</code>
   */
  java.lang.String getIn(int index);
  /**
   * <pre>
   * In specifies that this field's `type_url` must be equal to one of the
   * specified values.
   * </pre>
   *
   * <code>repeated string in = 2;</code>
   */
  com.google.protobuf.ByteString
      getInBytes(int index);

  /**
   * <pre>
   * NotIn specifies that this field's `type_url` must not be equal to any of
   * the specified values.
   * </pre>
   *
   * <code>repeated string not_in = 3;</code>
   */
  java.util.List<java.lang.String>
      getNotInList();
  /**
   * <pre>
   * NotIn specifies that this field's `type_url` must not be equal to any of
   * the specified values.
   * </pre>
   *
   * <code>repeated string not_in = 3;</code>
   */
  int getNotInCount();
  /**
   * <pre>
   * NotIn specifies that this field's `type_url` must not be equal to any of
   * the specified values.
   * </pre>
   *
   * <code>repeated string not_in = 3;</code>
   */
  java.lang.String getNotIn(int index);
  /**
   * <pre>
   * NotIn specifies that this field's `type_url` must not be equal to any of
   * the specified values.
   * </pre>
   *
   * <code>repeated string not_in = 3;</code>
   */
  com.google.protobuf.ByteString
      getNotInBytes(int index);
}
