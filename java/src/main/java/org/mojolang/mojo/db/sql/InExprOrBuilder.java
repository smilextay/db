// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojolang.mojo.db.sql;

public interface InExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.InExpr)
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
   * <code>.mojo.db.sql.Expression target = 11;</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <code>.mojo.db.sql.Expression target = 11;</code>
   * @return The target.
   */
  org.mojolang.mojo.db.sql.Expression getTarget();
  /**
   * <code>.mojo.db.sql.Expression target = 11;</code>
   */
  org.mojolang.mojo.db.sql.ExpressionOrBuilder getTargetOrBuilder();

  /**
   * <code>.mojo.db.sql.SelectStmt select_stmt = 15;</code>
   * @return Whether the selectStmt field is set.
   */
  boolean hasSelectStmt();
  /**
   * <code>.mojo.db.sql.SelectStmt select_stmt = 15;</code>
   * @return The selectStmt.
   */
  org.mojolang.mojo.db.sql.SelectStmt getSelectStmt();
  /**
   * <code>.mojo.db.sql.SelectStmt select_stmt = 15;</code>
   */
  org.mojolang.mojo.db.sql.SelectStmtOrBuilder getSelectStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.Expressions expressions = 16;</code>
   * @return Whether the expressions field is set.
   */
  boolean hasExpressions();
  /**
   * <code>.mojo.db.sql.Expressions expressions = 16;</code>
   * @return The expressions.
   */
  org.mojolang.mojo.db.sql.Expressions getExpressions();
  /**
   * <code>.mojo.db.sql.Expressions expressions = 16;</code>
   */
  org.mojolang.mojo.db.sql.ExpressionsOrBuilder getExpressionsOrBuilder();

  /**
   * <code>.mojo.db.sql.TableName table_name = 17;</code>
   * @return Whether the tableName field is set.
   */
  boolean hasTableName();
  /**
   * <code>.mojo.db.sql.TableName table_name = 17;</code>
   * @return The tableName.
   */
  org.mojolang.mojo.db.sql.TableName getTableName();
  /**
   * <code>.mojo.db.sql.TableName table_name = 17;</code>
   */
  org.mojolang.mojo.db.sql.TableNameOrBuilder getTableNameOrBuilder();

  /**
   * <code>.mojo.db.sql.TableFunctionName table_function_name = 18;</code>
   * @return Whether the tableFunctionName field is set.
   */
  boolean hasTableFunctionName();
  /**
   * <code>.mojo.db.sql.TableFunctionName table_function_name = 18;</code>
   * @return The tableFunctionName.
   */
  org.mojolang.mojo.db.sql.TableFunctionName getTableFunctionName();
  /**
   * <code>.mojo.db.sql.TableFunctionName table_function_name = 18;</code>
   */
  org.mojolang.mojo.db.sql.TableFunctionNameOrBuilder getTableFunctionNameOrBuilder();

  public org.mojolang.mojo.db.sql.InExpr.InCase getInCase();
}
