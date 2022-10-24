// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/set_clause.proto

package org.mojo-lang.mojo.db.sql;

/**
 * Protobuf type {@code mojo.db.sql.UpdateItem}
 */
public final class UpdateItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.db.sql.UpdateItem)
    UpdateItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateItem.newBuilder() to construct.
  private UpdateItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateItem() {
    columnName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateItem(
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
            java.lang.String s = input.readStringRequireUtf8();

            columnName_ = s;
            break;
          }
          case 18: {
            org.mojo-lang.mojo.db.sql.Expression.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(org.mojo-lang.mojo.db.sql.Expression.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }

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
    return org.mojo-lang.mojo.db.sql.SetClauseProto.internal_static_mojo_db_sql_UpdateItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojo-lang.mojo.db.sql.SetClauseProto.internal_static_mojo_db_sql_UpdateItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojo-lang.mojo.db.sql.UpdateItem.class, org.mojo-lang.mojo.db.sql.UpdateItem.Builder.class);
  }

  public static final int COLUMN_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object columnName_;
  /**
   * <code>string column_name = 1;</code>
   * @return The columnName.
   */
  @java.lang.Override
  public java.lang.String getColumnName() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      columnName_ = s;
      return s;
    }
  }
  /**
   * <code>string column_name = 1;</code>
   * @return The bytes for columnName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getColumnNameBytes() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      columnName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private org.mojo-lang.mojo.db.sql.Expression value_;
  /**
   * <code>.mojo.db.sql.Expression value = 2;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <code>.mojo.db.sql.Expression value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public org.mojo-lang.mojo.db.sql.Expression getValue() {
    return value_ == null ? org.mojo-lang.mojo.db.sql.Expression.getDefaultInstance() : value_;
  }
  /**
   * <code>.mojo.db.sql.Expression value = 2;</code>
   */
  @java.lang.Override
  public org.mojo-lang.mojo.db.sql.ExpressionOrBuilder getValueOrBuilder() {
    return getValue();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, columnName_);
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, columnName_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
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
    if (!(obj instanceof org.mojo-lang.mojo.db.sql.UpdateItem)) {
      return super.equals(obj);
    }
    org.mojo-lang.mojo.db.sql.UpdateItem other = (org.mojo-lang.mojo.db.sql.UpdateItem) obj;

    if (!getColumnName()
        .equals(other.getColumnName())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
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
    hash = (37 * hash) + COLUMN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getColumnName().hashCode();
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.db.sql.UpdateItem parseFrom(
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
  public static Builder newBuilder(org.mojo-lang.mojo.db.sql.UpdateItem prototype) {
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
   * Protobuf type {@code mojo.db.sql.UpdateItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.db.sql.UpdateItem)
      org.mojo-lang.mojo.db.sql.UpdateItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojo-lang.mojo.db.sql.SetClauseProto.internal_static_mojo_db_sql_UpdateItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojo-lang.mojo.db.sql.SetClauseProto.internal_static_mojo_db_sql_UpdateItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojo-lang.mojo.db.sql.UpdateItem.class, org.mojo-lang.mojo.db.sql.UpdateItem.Builder.class);
    }

    // Construct using org.mojo-lang.mojo.db.sql.UpdateItem.newBuilder()
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
      columnName_ = "";

      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojo-lang.mojo.db.sql.SetClauseProto.internal_static_mojo_db_sql_UpdateItem_descriptor;
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.UpdateItem getDefaultInstanceForType() {
      return org.mojo-lang.mojo.db.sql.UpdateItem.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.UpdateItem build() {
      org.mojo-lang.mojo.db.sql.UpdateItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojo-lang.mojo.db.sql.UpdateItem buildPartial() {
      org.mojo-lang.mojo.db.sql.UpdateItem result = new org.mojo-lang.mojo.db.sql.UpdateItem(this);
      result.columnName_ = columnName_;
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
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
      if (other instanceof org.mojo-lang.mojo.db.sql.UpdateItem) {
        return mergeFrom((org.mojo-lang.mojo.db.sql.UpdateItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojo-lang.mojo.db.sql.UpdateItem other) {
      if (other == org.mojo-lang.mojo.db.sql.UpdateItem.getDefaultInstance()) return this;
      if (!other.getColumnName().isEmpty()) {
        columnName_ = other.columnName_;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
      org.mojo-lang.mojo.db.sql.UpdateItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojo-lang.mojo.db.sql.UpdateItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object columnName_ = "";
    /**
     * <code>string column_name = 1;</code>
     * @return The columnName.
     */
    public java.lang.String getColumnName() {
      java.lang.Object ref = columnName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        columnName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string column_name = 1;</code>
     * @return The bytes for columnName.
     */
    public com.google.protobuf.ByteString
        getColumnNameBytes() {
      java.lang.Object ref = columnName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        columnName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string column_name = 1;</code>
     * @param value The columnName to set.
     * @return This builder for chaining.
     */
    public Builder setColumnName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      columnName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string column_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearColumnName() {
      
      columnName_ = getDefaultInstance().getColumnName();
      onChanged();
      return this;
    }
    /**
     * <code>string column_name = 1;</code>
     * @param value The bytes for columnName to set.
     * @return This builder for chaining.
     */
    public Builder setColumnNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      columnName_ = value;
      onChanged();
      return this;
    }

    private org.mojo-lang.mojo.db.sql.Expression value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojo-lang.mojo.db.sql.Expression, org.mojo-lang.mojo.db.sql.Expression.Builder, org.mojo-lang.mojo.db.sql.ExpressionOrBuilder> valueBuilder_;
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     * @return The value.
     */
    public org.mojo-lang.mojo.db.sql.Expression getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? org.mojo-lang.mojo.db.sql.Expression.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     */
    public Builder setValue(org.mojo-lang.mojo.db.sql.Expression value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     */
    public Builder setValue(
        org.mojo-lang.mojo.db.sql.Expression.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     */
    public Builder mergeValue(org.mojo-lang.mojo.db.sql.Expression value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            org.mojo-lang.mojo.db.sql.Expression.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     */
    public org.mojo-lang.mojo.db.sql.Expression.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     */
    public org.mojo-lang.mojo.db.sql.ExpressionOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            org.mojo-lang.mojo.db.sql.Expression.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>.mojo.db.sql.Expression value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojo-lang.mojo.db.sql.Expression, org.mojo-lang.mojo.db.sql.Expression.Builder, org.mojo-lang.mojo.db.sql.ExpressionOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojo-lang.mojo.db.sql.Expression, org.mojo-lang.mojo.db.sql.Expression.Builder, org.mojo-lang.mojo.db.sql.ExpressionOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.db.sql.UpdateItem)
  }

  // @@protoc_insertion_point(class_scope:mojo.db.sql.UpdateItem)
  private static final org.mojo-lang.mojo.db.sql.UpdateItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojo-lang.mojo.db.sql.UpdateItem();
  }

  public static org.mojo-lang.mojo.db.sql.UpdateItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateItem>
      PARSER = new com.google.protobuf.AbstractParser<UpdateItem>() {
    @java.lang.Override
    public UpdateItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojo-lang.mojo.db.sql.UpdateItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

