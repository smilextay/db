// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/dialect.proto

package org.mojolang.mojo.db.sql;

/**
 * Protobuf enum {@code mojo.db.sql.Dialect}
 */
public enum Dialect
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DIALECT_UNSPECIFIED = 0;</code>
   */
  DIALECT_UNSPECIFIED(0),
  /**
   * <code>DIALECT_SQLITE = 1;</code>
   */
  DIALECT_SQLITE(1),
  /**
   * <code>DIALECT_MYSQL = 2;</code>
   */
  DIALECT_MYSQL(2),
  /**
   * <code>DIALECT_POSTGRESQL = 3;</code>
   */
  DIALECT_POSTGRESQL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DIALECT_UNSPECIFIED = 0;</code>
   */
  public static final int DIALECT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DIALECT_SQLITE = 1;</code>
   */
  public static final int DIALECT_SQLITE_VALUE = 1;
  /**
   * <code>DIALECT_MYSQL = 2;</code>
   */
  public static final int DIALECT_MYSQL_VALUE = 2;
  /**
   * <code>DIALECT_POSTGRESQL = 3;</code>
   */
  public static final int DIALECT_POSTGRESQL_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Dialect valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Dialect forNumber(int value) {
    switch (value) {
      case 0: return DIALECT_UNSPECIFIED;
      case 1: return DIALECT_SQLITE;
      case 2: return DIALECT_MYSQL;
      case 3: return DIALECT_POSTGRESQL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Dialect>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Dialect> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Dialect>() {
          public Dialect findValueByNumber(int number) {
            return Dialect.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.mojolang.mojo.db.sql.DialectProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Dialect[] VALUES = values();

  public static Dialect valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Dialect(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:mojo.db.sql.Dialect)
}

