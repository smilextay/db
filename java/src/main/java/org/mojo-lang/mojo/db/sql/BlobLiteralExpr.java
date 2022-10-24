// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/blob_literal_expr.proto

package org.mojo-lang.mojo.db.sql;

/**
 * Protobuf type {@code mojo.db.sql.BlobLiteralExpr}
 */
public final class BlobLiteralExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.db.sql.BlobLiteralExpr)
    BlobLiteralExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlobLiteralExpr.newBuilder() to construct.
  private BlobLiteralExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlobLiteralExpr() {
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlobLiteralExpr();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlobLiteralExpr(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.mojolang.mojo.lang.Position.Builder subBuilder = null;
            if (startPosition_ != null) {
              subBuilder = startPosition_.toBuilder();
            }
            startPosition_ = input.readMessage(org.mojolang.mojo.lang.Position.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(startPosition_);
              startPosition_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.mojolang.mojo.lang.Position.Builder subBuilder = null;
            if (endPosition_ != null) {
              subBuilder = endPosition_.toBuilder();
            }
            endPosition_ = input.readMessage(org.mojolang.mojo.lang.Position.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(endPosition_);
              endPosition_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            kind_ = input.readInt32();
            break;
          }
          case 40: {

            implicit_ = input.readBool();
            break;
          }
          case 162: {
            java.lang.String s = input.readStringRequireUtf8();

            value_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojo-lang.mojo.db.sql.BlobLiteralExprProto.internal_static_mojo_db_sql_BlobLiteralExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojo-lang.mojo.db.sql.BlobLiteralExprProto.internal_static_mojo_db_sql_BlobLiteralExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojo-lang.mojo.db.sql.BlobLiteralExpr.class, org.mojo-lang.mojo.db.sql.BlobLiteralExpr.Builder.class);
  }

  public static final int START_POSITION_FIELD_NUMBER = 1;
  private org.mojolang.mojo.lang.Position startPosition_;
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   * @return Whether the startPosition field is set.
   */
  @java.lang.Override
  public boolean hasStartPosition() {
    return startPosition_ != null;
  }
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   * @return The startPosition.
   */
  @java.lang.Override
  public org.mojolang.mojo.lang.Position getStartPosition() {
    return startPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : startPosition_;
  }
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.lang.PositionOrBuilder getStartPositionOrBuilder() {
    return getStartPosition();
  }

  public static final int END_POSITION_FIELD_NUMBER = 2;
  private org.mojolang.mojo.lang.Position endPosition_;
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   * @return Whether the endPosition field is set.
   */
  @java.lang.Override
  public boolean hasEndPosition() {
    return endPosition_ != null;
  }
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   * @return The endPosition.
   */
  @java.lang.Override
  public org.mojolang.mojo.lang.Position getEndPosition() {
    return endPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : endPosition_;
  }
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.lang.PositionOrBuilder getEndPositionOrBuilder() {
    return getEndPosition();
  }

  public static final int KIND_FIELD_NUMBER = 4;
  private int kind_;
  /**
   * <code>int32 kind = 4;</code>
   * @return The kind.
   */
  @java.lang.Override
  public int getKind() {
    return kind_;
  }

  public static final int IMPLICIT_FIELD_NUMBER = 5;
  private boolean implicit_;
  /**
   * <code>bool implicit = 5;</code>
   * @return The implicit.
   */
  @java.lang.Override
  public boolean getImplicit() {
    return implicit_;
  }

  public static final int VALUE_FIELD_NUMBER = 20;
  private volatile java.lang.Object value_;
  /**
   * <code>string value = 20;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 20;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (startPosition_ != null) {
      output.writeMessage(1, getStartPosition());
    }
    if (endPosition_ != null) {
      output.writeMessage(2, getEndPosition());
    }
    if (kind_ != 0) {
      output.writeInt32(4, kind_);
    }
    if (implicit_ != false) {
      output.writeBool(5, implicit_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 20, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startPosition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStartPosition());
    }
    if (endPosition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndPosition());
    }
    if (kind_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, kind_);
    }
    if (implicit_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, implicit_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(20, value_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojo-lang.mojo.db.sql.BlobLiteralExpr)) {
      return super.equals(obj);
    }
    org.mojo-lang.mojo.db.sql.BlobLiteralExpr other = (org.mojo-lang.mojo.db.sql.BlobLiteralExpr) obj;

    if (hasStartPosition() != other.hasStartPosition()) return false;
    if (hasStartPosition()) {
      if (!getStartPosition()
          .equals(other.getStartPosition())) return false;
    }
    if (hasEndPosition() != other.hasEndPosition()) return false;
    if (hasEndPosition()) {
      if (!getEndPosition()
          .equals(other.getEndPosition())) return false;
    }
    if (getKind()
        != other.getKind()) return false;
    if (getImplicit()
        != other.getImplicit()) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStartPosition()) {
      hash = (37 * hash) + START_POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getStartPosition().hashCode();
    }
    if (hasEndPosition()) {
      hash = (37 * hash) + END_POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getEndPosition().hashCode();
    }
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind();
    hash = (37 * hash) + IMPLICIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getImplicit());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mojo-lang.mojo.db.sql.BlobLiteralExpr prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code mojo.db.sql.BlobLiteralExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.db.sql.BlobLiteralExpr)
      org.mojo-lang.mojo.db.sql.BlobLiteralExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojo-lang.mojo.db.sql.BlobLiteralExprProto.internal_static_mojo_db_sql_BlobLiteralExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojo-lang.mojo.db.sql.BlobLiteralExprProto.internal_static_mojo_db_sql_BlobLiteralExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojo-lang.mojo.db.sql.BlobLiteralExpr.class, org.mojo-lang.mojo.db.sql.BlobLiteralExpr.Builder.class);
    }

    // Construct using org.mojo-lang.mojo.db.sql.BlobLiteralExpr.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (startPositionBuilder_ == null) {
        startPosition_ = null;
      } else {
        startPosition_ = null;
        startPositionBuilder_ = null;
      }
      if (endPositionBuilder_ == null) {
        endPosition_ = null;
      } else {
        endPosition_ = null;
        endPositionBuilder_ = null;
      }
      kind_ = 0;

      implicit_ = false;

      value_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojo-lang.mojo.db.sql.BlobLiteralExprProto.internal_static_mojo_db_sql_BlobLiteralExpr_descriptor;
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.BlobLiteralExpr getDefaultInstanceForType() {
      return org.mojo-lang.mojo.db.sql.BlobLiteralExpr.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.BlobLiteralExpr build() {
      org.mojo-lang.mojo.db.sql.BlobLiteralExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.BlobLiteralExpr buildPartial() {
      org.mojo-lang.mojo.db.sql.BlobLiteralExpr result = new org.mojo-lang.mojo.db.sql.BlobLiteralExpr(this);
      if (startPositionBuilder_ == null) {
        result.startPosition_ = startPosition_;
      } else {
        result.startPosition_ = startPositionBuilder_.build();
      }
      if (endPositionBuilder_ == null) {
        result.endPosition_ = endPosition_;
      } else {
        result.endPosition_ = endPositionBuilder_.build();
      }
      result.kind_ = kind_;
      result.implicit_ = implicit_;
      result.value_ = value_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mojo-lang.mojo.db.sql.BlobLiteralExpr) {
        return mergeFrom((org.mojo-lang.mojo.db.sql.BlobLiteralExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojo-lang.mojo.db.sql.BlobLiteralExpr other) {
      if (other == org.mojo-lang.mojo.db.sql.BlobLiteralExpr.getDefaultInstance()) return this;
      if (other.hasStartPosition()) {
        mergeStartPosition(other.getStartPosition());
      }
      if (other.hasEndPosition()) {
        mergeEndPosition(other.getEndPosition());
      }
      if (other.getKind() != 0) {
        setKind(other.getKind());
      }
      if (other.getImplicit() != false) {
        setImplicit(other.getImplicit());
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.mojo-lang.mojo.db.sql.BlobLiteralExpr parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojo-lang.mojo.db.sql.BlobLiteralExpr) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.mojolang.mojo.lang.Position startPosition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder> startPositionBuilder_;
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     * @return Whether the startPosition field is set.
     */
    public boolean hasStartPosition() {
      return startPositionBuilder_ != null || startPosition_ != null;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     * @return The startPosition.
     */
    public org.mojolang.mojo.lang.Position getStartPosition() {
      if (startPositionBuilder_ == null) {
        return startPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : startPosition_;
      } else {
        return startPositionBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public Builder setStartPosition(org.mojolang.mojo.lang.Position value) {
      if (startPositionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startPosition_ = value;
        onChanged();
      } else {
        startPositionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public Builder setStartPosition(
        org.mojolang.mojo.lang.Position.Builder builderForValue) {
      if (startPositionBuilder_ == null) {
        startPosition_ = builderForValue.build();
        onChanged();
      } else {
        startPositionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public Builder mergeStartPosition(org.mojolang.mojo.lang.Position value) {
      if (startPositionBuilder_ == null) {
        if (startPosition_ != null) {
          startPosition_ =
            org.mojolang.mojo.lang.Position.newBuilder(startPosition_).mergeFrom(value).buildPartial();
        } else {
          startPosition_ = value;
        }
        onChanged();
      } else {
        startPositionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public Builder clearStartPosition() {
      if (startPositionBuilder_ == null) {
        startPosition_ = null;
        onChanged();
      } else {
        startPosition_ = null;
        startPositionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public org.mojolang.mojo.lang.Position.Builder getStartPositionBuilder() {
      
      onChanged();
      return getStartPositionFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public org.mojolang.mojo.lang.PositionOrBuilder getStartPositionOrBuilder() {
      if (startPositionBuilder_ != null) {
        return startPositionBuilder_.getMessageOrBuilder();
      } else {
        return startPosition_ == null ?
            org.mojolang.mojo.lang.Position.getDefaultInstance() : startPosition_;
      }
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder> 
        getStartPositionFieldBuilder() {
      if (startPositionBuilder_ == null) {
        startPositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder>(
                getStartPosition(),
                getParentForChildren(),
                isClean());
        startPosition_ = null;
      }
      return startPositionBuilder_;
    }

    private org.mojolang.mojo.lang.Position endPosition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder> endPositionBuilder_;
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     * @return Whether the endPosition field is set.
     */
    public boolean hasEndPosition() {
      return endPositionBuilder_ != null || endPosition_ != null;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     * @return The endPosition.
     */
    public org.mojolang.mojo.lang.Position getEndPosition() {
      if (endPositionBuilder_ == null) {
        return endPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : endPosition_;
      } else {
        return endPositionBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public Builder setEndPosition(org.mojolang.mojo.lang.Position value) {
      if (endPositionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endPosition_ = value;
        onChanged();
      } else {
        endPositionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public Builder setEndPosition(
        org.mojolang.mojo.lang.Position.Builder builderForValue) {
      if (endPositionBuilder_ == null) {
        endPosition_ = builderForValue.build();
        onChanged();
      } else {
        endPositionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public Builder mergeEndPosition(org.mojolang.mojo.lang.Position value) {
      if (endPositionBuilder_ == null) {
        if (endPosition_ != null) {
          endPosition_ =
            org.mojolang.mojo.lang.Position.newBuilder(endPosition_).mergeFrom(value).buildPartial();
        } else {
          endPosition_ = value;
        }
        onChanged();
      } else {
        endPositionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public Builder clearEndPosition() {
      if (endPositionBuilder_ == null) {
        endPosition_ = null;
        onChanged();
      } else {
        endPosition_ = null;
        endPositionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public org.mojolang.mojo.lang.Position.Builder getEndPositionBuilder() {
      
      onChanged();
      return getEndPositionFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public org.mojolang.mojo.lang.PositionOrBuilder getEndPositionOrBuilder() {
      if (endPositionBuilder_ != null) {
        return endPositionBuilder_.getMessageOrBuilder();
      } else {
        return endPosition_ == null ?
            org.mojolang.mojo.lang.Position.getDefaultInstance() : endPosition_;
      }
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder> 
        getEndPositionFieldBuilder() {
      if (endPositionBuilder_ == null) {
        endPositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder>(
                getEndPosition(),
                getParentForChildren(),
                isClean());
        endPosition_ = null;
      }
      return endPositionBuilder_;
    }

    private int kind_ ;
    /**
     * <code>int32 kind = 4;</code>
     * @return The kind.
     */
    @java.lang.Override
    public int getKind() {
      return kind_;
    }
    /**
     * <code>int32 kind = 4;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(int value) {
      
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 kind = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      
      kind_ = 0;
      onChanged();
      return this;
    }

    private boolean implicit_ ;
    /**
     * <code>bool implicit = 5;</code>
     * @return The implicit.
     */
    @java.lang.Override
    public boolean getImplicit() {
      return implicit_;
    }
    /**
     * <code>bool implicit = 5;</code>
     * @param value The implicit to set.
     * @return This builder for chaining.
     */
    public Builder setImplicit(boolean value) {
      
      implicit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool implicit = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearImplicit() {
      
      implicit_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 20;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 20;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 20;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 20;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>string value = 20;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:mojo.db.sql.BlobLiteralExpr)
  }

  // @@protoc_insertion_point(class_scope:mojo.db.sql.BlobLiteralExpr)
  private static final org.mojo-lang.mojo.db.sql.BlobLiteralExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojo-lang.mojo.db.sql.BlobLiteralExpr();
  }

  public static org.mojo-lang.mojo.db.sql.BlobLiteralExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlobLiteralExpr>
      PARSER = new com.google.protobuf.AbstractParser<BlobLiteralExpr>() {
    @java.lang.Override
    public BlobLiteralExpr parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlobLiteralExpr(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlobLiteralExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlobLiteralExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojo-lang.mojo.db.sql.BlobLiteralExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

