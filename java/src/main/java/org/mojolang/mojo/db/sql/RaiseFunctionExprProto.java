// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/raise_function_expr.proto

package org.mojolang.mojo.db.sql;

public final class RaiseFunctionExprProto {
  private RaiseFunctionExprProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_RaiseFunctionExpr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_RaiseFunctionExpr_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%mojo/db/sql/raise_function_expr.proto\022" +
      "\013mojo.db.sql\032\024mojo/lang/lang.proto\032\017mojo" +
      "/mojo.proto\"\264\002\n\021RaiseFunctionExpr\022+\n\016sta" +
      "rt_position\030\001 \001(\0132\023.mojo.lang.Position\022)" +
      "\n\014end_position\030\002 \001(\0132\023.mojo.lang.Positio" +
      "n\022\014\n\004kind\030\004 \001(\005\022\020\n\010implicit\030\005 \001(\010\0225\n\006act" +
      "ion\030\013 \001(\0162%.mojo.db.sql.RaiseFunctionExp" +
      "r.Action\022\033\n\rerror_message\030\014 \001(\tB\004\340\325$\001\"S\n" +
      "\006Action\022\021\n\rACTION_IGNORE\020\000\022\023\n\017ACTION_ROL" +
      "LBACK\020\001\022\020\n\014ACTION_ABORT\020\002\022\017\n\013ACTION_FAIL" +
      "\020\003Bd\n\030org.mojolang.mojo.db.sqlB\026RaiseFun" +
      "ctionExprProtoP\001Z.github.com/mojo-lang/d" +
      "b/go/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
          com.google.protobuf.MojoProtos.getDescriptor(),
        });
    internal_static_mojo_db_sql_RaiseFunctionExpr_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_RaiseFunctionExpr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_RaiseFunctionExpr_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "Action", "ErrorMessage", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.MojoProtos.dbIgnore);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.mojolang.mojo.lang.LangProto.getDescriptor();
    com.google.protobuf.MojoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
