// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojo-lang.mojo.db.sql;

public interface WithClauseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.WithClause)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   * @return Whether the startPosition field is set.
   */
  boolean hasStartPosition();
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   * @return The startPosition.
   */
  org.mojolang.mojo.lang.Position getStartPosition();
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   */
  org.mojolang.mojo.lang.PositionOrBuilder getStartPositionOrBuilder();

  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   * @return Whether the endPosition field is set.
   */
  boolean hasEndPosition();
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   * @return The endPosition.
   */
  org.mojolang.mojo.lang.Position getEndPosition();
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   */
  org.mojolang.mojo.lang.PositionOrBuilder getEndPositionOrBuilder();

  /**
   * <code>int64 kind = 4;</code>
   * @return The kind.
   */
  long getKind();

  /**
   * <code>bool implicit = 5;</code>
   * @return The implicit.
   */
  boolean getImplicit();

  /**
   * <code>repeated .mojo.db.sql.TemporaryTable tables = 10;</code>
   */
  java.util.List<org.mojo-lang.mojo.db.sql.TemporaryTable> 
      getTablesList();
  /**
   * <code>repeated .mojo.db.sql.TemporaryTable tables = 10;</code>
   */
  org.mojo-lang.mojo.db.sql.TemporaryTable getTables(int index);
  /**
   * <code>repeated .mojo.db.sql.TemporaryTable tables = 10;</code>
   */
  int getTablesCount();
  /**
   * <code>repeated .mojo.db.sql.TemporaryTable tables = 10;</code>
   */
  java.util.List<? extends org.mojo-lang.mojo.db.sql.TemporaryTableOrBuilder> 
      getTablesOrBuilderList();
  /**
   * <code>repeated .mojo.db.sql.TemporaryTable tables = 10;</code>
   */
  org.mojo-lang.mojo.db.sql.TemporaryTableOrBuilder getTablesOrBuilder(
      int index);

  /**
   * <code>bool recursive = 15;</code>
   * @return The recursive.
   */
  boolean getRecursive();
}
