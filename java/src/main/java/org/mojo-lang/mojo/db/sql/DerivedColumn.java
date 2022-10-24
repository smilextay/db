// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojo-lang.mojo.db.sql;

/**
 * Protobuf type {@code mojo.db.sql.DerivedColumn}
 */
public final class DerivedColumn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.db.sql.DerivedColumn)
    DerivedColumnOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DerivedColumn.newBuilder() to construct.
  private DerivedColumn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DerivedColumn() {
    as_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DerivedColumn();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DerivedColumn(
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
            org.mojo-lang.mojo.db.sql.Expression.Builder subBuilder = null;
            if (expr_ != null) {
              subBuilder = expr_.toBuilder();
            }
            expr_ = input.readMessage(org.mojo-lang.mojo.db.sql.Expression.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expr_);
              expr_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            as_ = s;
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
    return org.mojo-lang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_DerivedColumn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojo-lang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_DerivedColumn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojo-lang.mojo.db.sql.DerivedColumn.class, org.mojo-lang.mojo.db.sql.DerivedColumn.Builder.class);
  }

  public static final int EXPR_FIELD_NUMBER = 1;
  private org.mojo-lang.mojo.db.sql.Expression expr_;
  /**
   * <code>.mojo.db.sql.Expression expr = 1;</code>
   * @return Whether the expr field is set.
   */
  @java.lang.Override
  public boolean hasExpr() {
    return expr_ != null;
  }
  /**
   * <code>.mojo.db.sql.Expression expr = 1;</code>
   * @return The expr.
   */
  @java.lang.Override
  public org.mojo-lang.mojo.db.sql.Expression getExpr() {
    return expr_ == null ? org.mojo-lang.mojo.db.sql.Expression.getDefaultInstance() : expr_;
  }
  /**
   * <code>.mojo.db.sql.Expression expr = 1;</code>
   */
  @java.lang.Override
  public org.mojo-lang.mojo.db.sql.ExpressionOrBuilder getExprOrBuilder() {
    return getExpr();
  }

  public static final int AS_FIELD_NUMBER = 2;
  private volatile java.lang.Object as_;
  /**
   * <code>string as = 2;</code>
   * @return The as.
   */
  @java.lang.Override
  public java.lang.String getAs() {
    java.lang.Object ref = as_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      as_ = s;
      return s;
    }
  }
  /**
   * <code>string as = 2;</code>
   * @return The bytes for as.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAsBytes() {
    java.lang.Object ref = as_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      as_ = b;
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
    if (expr_ != null) {
      output.writeMessage(1, getExpr());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(as_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, as_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (expr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExpr());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(as_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, as_);
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
    if (!(obj instanceof org.mojo-lang.mojo.db.sql.DerivedColumn)) {
      return super.equals(obj);
    }
    org.mojo-lang.mojo.db.sql.DerivedColumn other = (org.mojo-lang.mojo.db.sql.DerivedColumn) obj;

    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
    }
    if (!getAs()
        .equals(other.getAs())) return false;
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
    if (hasExpr()) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExpr().hashCode();
    }
    hash = (37 * hash) + AS_FIELD_NUMBER;
    hash = (53 * hash) + getAs().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.DerivedColumn parseFrom(
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
  public static Builder newBuilder(org.mojo-lang.mojo.db.sql.DerivedColumn prototype) {
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
   * Protobuf type {@code mojo.db.sql.DerivedColumn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.db.sql.DerivedColumn)
      org.mojo-lang.mojo.db.sql.DerivedColumnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojo-lang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_DerivedColumn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojo-lang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_DerivedColumn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojo-lang.mojo.db.sql.DerivedColumn.class, org.mojo-lang.mojo.db.sql.DerivedColumn.Builder.class);
    }

    // Construct using org.mojo-lang.mojo.db.sql.DerivedColumn.newBuilder()
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
      if (exprBuilder_ == null) {
        expr_ = null;
      } else {
        expr_ = null;
        exprBuilder_ = null;
      }
      as_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojo-lang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_DerivedColumn_descriptor;
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.DerivedColumn getDefaultInstanceForType() {
      return org.mojo-lang.mojo.db.sql.DerivedColumn.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.DerivedColumn build() {
      org.mojo-lang.mojo.db.sql.DerivedColumn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.DerivedColumn buildPartial() {
      org.mojo-lang.mojo.db.sql.DerivedColumn result = new org.mojo-lang.mojo.db.sql.DerivedColumn(this);
      if (exprBuilder_ == null) {
        result.expr_ = expr_;
      } else {
        result.expr_ = exprBuilder_.build();
      }
      result.as_ = as_;
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
      if (other instanceof org.mojo-lang.mojo.db.sql.DerivedColumn) {
        return mergeFrom((org.mojo-lang.mojo.db.sql.DerivedColumn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojo-lang.mojo.db.sql.DerivedColumn other) {
      if (other == org.mojo-lang.mojo.db.sql.DerivedColumn.getDefaultInstance()) return this;
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
      }
      if (!other.getAs().isEmpty()) {
        as_ = other.as_;
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
      org.mojo-lang.mojo.db.sql.DerivedColumn parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojo-lang.mojo.db.sql.DerivedColumn) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.mojo-lang.mojo.db.sql.Expression expr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojo-lang.mojo.db.sql.Expression, org.mojo-lang.mojo.db.sql.Expression.Builder, org.mojo-lang.mojo.db.sql.ExpressionOrBuilder> exprBuilder_;
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     * @return Whether the expr field is set.
     */
    public boolean hasExpr() {
      return exprBuilder_ != null || expr_ != null;
    }
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     * @return The expr.
     */
    public org.mojo-lang.mojo.db.sql.Expression getExpr() {
      if (exprBuilder_ == null) {
        return expr_ == null ? org.mojo-lang.mojo.db.sql.Expression.getDefaultInstance() : expr_;
      } else {
        return exprBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     */
    public Builder setExpr(org.mojo-lang.mojo.db.sql.Expression value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
        onChanged();
      } else {
        exprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     */
    public Builder setExpr(
        org.mojo-lang.mojo.db.sql.Expression.Builder builderForValue) {
      if (exprBuilder_ == null) {
        expr_ = builderForValue.build();
        onChanged();
      } else {
        exprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     */
    public Builder mergeExpr(org.mojo-lang.mojo.db.sql.Expression value) {
      if (exprBuilder_ == null) {
        if (expr_ != null) {
          expr_ =
            org.mojo-lang.mojo.db.sql.Expression.newBuilder(expr_).mergeFrom(value).buildPartial();
        } else {
          expr_ = value;
        }
        onChanged();
      } else {
        exprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     */
    public Builder clearExpr() {
      if (exprBuilder_ == null) {
        expr_ = null;
        onChanged();
      } else {
        expr_ = null;
        exprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     */
    public org.mojo-lang.mojo.db.sql.Expression.Builder getExprBuilder() {
      
      onChanged();
      return getExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     */
    public org.mojo-lang.mojo.db.sql.ExpressionOrBuilder getExprOrBuilder() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilder();
      } else {
        return expr_ == null ?
            org.mojo-lang.mojo.db.sql.Expression.getDefaultInstance() : expr_;
      }
    }
    /**
     * <code>.mojo.db.sql.Expression expr = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojo-lang.mojo.db.sql.Expression, org.mojo-lang.mojo.db.sql.Expression.Builder, org.mojo-lang.mojo.db.sql.ExpressionOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojo-lang.mojo.db.sql.Expression, org.mojo-lang.mojo.db.sql.Expression.Builder, org.mojo-lang.mojo.db.sql.ExpressionOrBuilder>(
                getExpr(),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
    }

    private java.lang.Object as_ = "";
    /**
     * <code>string as = 2;</code>
     * @return The as.
     */
    public java.lang.String getAs() {
      java.lang.Object ref = as_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        as_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string as = 2;</code>
     * @return The bytes for as.
     */
    public com.google.protobuf.ByteString
        getAsBytes() {
      java.lang.Object ref = as_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        as_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string as = 2;</code>
     * @param value The as to set.
     * @return This builder for chaining.
     */
    public Builder setAs(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      as_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string as = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAs() {
      
      as_ = getDefaultInstance().getAs();
      onChanged();
      return this;
    }
    /**
     * <code>string as = 2;</code>
     * @param value The bytes for as to set.
     * @return This builder for chaining.
     */
    public Builder setAsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      as_ = value;
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


    // @@protoc_insertion_point(builder_scope:mojo.db.sql.DerivedColumn)
  }

  // @@protoc_insertion_point(class_scope:mojo.db.sql.DerivedColumn)
  private static final org.mojo-lang.mojo.db.sql.DerivedColumn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojo-lang.mojo.db.sql.DerivedColumn();
  }

  public static org.mojo-lang.mojo.db.sql.DerivedColumn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DerivedColumn>
      PARSER = new com.google.protobuf.AbstractParser<DerivedColumn>() {
    @java.lang.Override
    public DerivedColumn parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DerivedColumn(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DerivedColumn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DerivedColumn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojo-lang.mojo.db.sql.DerivedColumn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

