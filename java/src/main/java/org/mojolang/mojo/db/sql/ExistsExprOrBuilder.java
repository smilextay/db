// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojolang.mojo.db.sql;

public interface ExistsExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.ExistsExpr)
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
   * <code>int32 kind = 4;</code>
   * @return The kind.
   */
  int getKind();

  /**
   * <code>bool implicit = 5;</code>
   * @return The implicit.
   */
  boolean getImplicit();

  /**
   * <code>bool not = 10;</code>
   * @return The not.
   */
  boolean getNot();

  /**
   * <code>bool exists = 11;</code>
   * @return The exists.
   */
  boolean getExists();

  /**
   * <code>.mojo.db.sql.SelectStmt subquery = 15;</code>
   * @return Whether the subquery field is set.
   */
  boolean hasSubquery();
  /**
   * <code>.mojo.db.sql.SelectStmt subquery = 15;</code>
   * @return The subquery.
   */
  org.mojolang.mojo.db.sql.SelectStmt getSubquery();
  /**
   * <code>.mojo.db.sql.SelectStmt subquery = 15;</code>
   */
  org.mojolang.mojo.db.sql.SelectStmtOrBuilder getSubqueryOrBuilder();
}
