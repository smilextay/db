// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/config.proto

package org.mojo-lang.mojo.db;

public final class ConfigProto {
  private ConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024mojo/db/config.proto\022\007mojo.db\032\024mojo/co" +
      "re/time.proto\"\235\003\n\006Config\022\016\n\006driver\030\001 \001(\t" +
      "\022\013\n\003dsn\030\002 \001(\t\022\r\n\005debug\030\003 \001(\010\022\034\n\024max_idle" +
      "_connections\030\004 \001(\005\022\034\n\024max_open_connectio" +
      "ns\030\005 \001(\005\0222\n\025connection_keep_alive\030\006 \001(\0132" +
      "\023.mojo.core.Duration\022/\n\022slow_log_thresho" +
      "ld\030\007 \001(\0132\023.mojo.core.Duration\022\025\n\renable_" +
      "metric\030\010 \001(\010\022\024\n\014enable_trace\030\t \001(\010\022\031\n\021en" +
      "able_detail_sql\030\n \001(\010\022\031\n\021enable_log_acce" +
      "ss\030\013 \001(\010\022!\n\031enable_log_access_request\030\014 " +
      "\001(\010\022\"\n\032enable_log_access_response\030\r \001(\010\022" +
      "\034\n\024disable_auto_migrate\030\024 \001(\010BQ\n\025org.moj" +
      "o-lang.mojo.dbB\013ConfigProtoP\001Z)github.co" +
      "m/mojo-lang/db/go/pkg/mojo/db;dbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.TimeProto.getDescriptor(),
        });
    internal_static_mojo_db_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_Config_descriptor,
        new java.lang.String[] { "Driver", "Dsn", "Debug", "MaxIdleConnections", "MaxOpenConnections", "ConnectionKeepAlive", "SlowLogThreshold", "EnableMetric", "EnableTrace", "EnableDetailSql", "EnableLogAccess", "EnableLogAccessRequest", "EnableLogAccessResponse", "DisableAutoMigrate", });
    org.mojolang.mojo.core.TimeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
