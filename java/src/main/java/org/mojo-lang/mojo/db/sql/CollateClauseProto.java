// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/collate_clause.proto

package org.mojo-lang.mojo.db.sql;

public final class CollateClauseProto {
  private CollateClauseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_CollateClause_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_CollateClause_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n mojo/db/sql/collate_clause.proto\022\013mojo" +
      ".db.sql\032\030mojo/db/sql/clause.proto\032\024mojo/" +
      "lang/lang.proto\"\225\001\n\rCollateClause\022+\n\016sta" +
      "rt_position\030\001 \001(\0132\023.mojo.lang.Position\022)" +
      "\n\014end_position\030\002 \001(\0132\023.mojo.lang.Positio" +
      "n\022\014\n\004kind\030\004 \001(\003\022\020\n\010implicit\030\005 \001(\010\022\014\n\004nam" +
      "e\030\n \001(\tBa\n\031org.mojo-lang.mojo.db.sqlB\022Co" +
      "llateClauseProtoP\001Z.github.com/mojo-lang" +
      "/db/go/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor(),
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_CollateClause_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_CollateClause_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_CollateClause_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "Name", });
    org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor();
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
