// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/create_index_stmt.proto

package org.mojo-lang.mojo.db.sql;

public final class CreateIndexStmtProto {
  private CreateIndexStmtProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_CreateIndexStmt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_CreateIndexStmt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#mojo/db/sql/create_index_stmt.proto\022\013m" +
      "ojo.db.sql\032&mojo/db/sql/data_definition_" +
      "stmt.proto\032\024mojo/lang/lang.proto\"\211\001\n\017Cre" +
      "ateIndexStmt\022+\n\016start_position\030\001 \001(\0132\023.m" +
      "ojo.lang.Position\022)\n\014end_position\030\002 \001(\0132" +
      "\023.mojo.lang.Position\022\014\n\004kind\030\004 \001(\003\022\020\n\010im" +
      "plicit\030\005 \001(\010Bc\n\031org.mojo-lang.mojo.db.sq" +
      "lB\024CreateIndexStmtProtoP\001Z.github.com/mo" +
      "jo-lang/db/go/pkg/mojo/db/sql;sqlb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojo-lang.mojo.db.sql.DataDefinitionStmtProto.getDescriptor(),
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_CreateIndexStmt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_CreateIndexStmt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_CreateIndexStmt_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", });
    org.mojo-lang.mojo.db.sql.DataDefinitionStmtProto.getDescriptor();
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
