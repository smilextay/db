// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/db/sql/delete_stmt.proto

package sql

import (
	lang "github.com/mojo-lang/lang/go/pkg/mojo/lang"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type DeleteStmt struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	StartPosition *lang.Position      `protobuf:"bytes,1,opt,name=start_position,json=startPosition,proto3" json:"startPosition,omitempty"`
	EndPosition   *lang.Position      `protobuf:"bytes,2,opt,name=end_position,json=endPosition,proto3" json:"endPosition,omitempty"`
	Kind          int64               `protobuf:"varint,4,opt,name=kind,proto3" json:"kind,omitempty"`
	Implicit      bool                `protobuf:"varint,5,opt,name=implicit,proto3" json:"implicit,omitempty"`
	With          *WithClause         `protobuf:"bytes,10,opt,name=with,proto3" json:"with,omitempty"`
	TableName     *QualifiedTableName `protobuf:"bytes,11,opt,name=table_name,json=tableName,proto3" json:"tableName,omitempty"`
	Where         *WhereClause        `protobuf:"bytes,12,opt,name=where,proto3" json:"where,omitempty"`
	Returning     *ReturningClause    `protobuf:"bytes,15,opt,name=returning,proto3" json:"returning,omitempty"`
}

func (x *DeleteStmt) Reset() {
	*x = DeleteStmt{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_delete_stmt_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteStmt) ToText() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteStmt) ProtoMessage() {}

func (x *DeleteStmt) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_delete_stmt_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteStmt.ProtoReflect.Descriptor instead.
func (*DeleteStmt) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_delete_stmt_proto_rawDescGZIP(), []int{0}
}

func (x *DeleteStmt) GetStartPosition() *lang.Position {
	if x != nil {
		return x.StartPosition
	}
	return nil
}

func (x *DeleteStmt) GetEndPosition() *lang.Position {
	if x != nil {
		return x.EndPosition
	}
	return nil
}

func (x *DeleteStmt) GetKind() int64 {
	if x != nil {
		return x.Kind
	}
	return 0
}

func (x *DeleteStmt) GetImplicit() bool {
	if x != nil {
		return x.Implicit
	}
	return false
}

func (x *DeleteStmt) GetWith() *WithClause {
	if x != nil {
		return x.With
	}
	return nil
}

func (x *DeleteStmt) GetTableName() *QualifiedTableName {
	if x != nil {
		return x.TableName
	}
	return nil
}

func (x *DeleteStmt) GetWhere() *WhereClause {
	if x != nil {
		return x.Where
	}
	return nil
}

func (x *DeleteStmt) GetReturning() *ReturningClause {
	if x != nil {
		return x.Returning
	}
	return nil
}

var File_mojo_db_sql_delete_stmt_proto protoreflect.FileDescriptor

var file_mojo_db_sql_delete_stmt_proto_rawDesc = []byte{
	0x0a, 0x1d, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x64, 0x65,
	0x6c, 0x65, 0x74, 0x65, 0x5f, 0x73, 0x74, 0x6d, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x0b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x1a, 0x28, 0x6d, 0x6f,
	0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x6d,
	0x61, 0x6e, 0x69, 0x70, 0x75, 0x6c, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x74, 0x6d, 0x74,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x26, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f,
	0x73, 0x71, 0x6c, 0x2f, 0x71, 0x75, 0x61, 0x6c, 0x69, 0x66, 0x69, 0x65, 0x64, 0x5f, 0x74, 0x61,
	0x62, 0x6c, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x22,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x72, 0x65, 0x74, 0x75,
	0x72, 0x6e, 0x69, 0x6e, 0x67, 0x5f, 0x63, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x15, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f,
	0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x14, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f,
	0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0x89, 0x03, 0x0a, 0x0a, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x53, 0x74, 0x6d, 0x74, 0x12, 0x3a,
	0x0a, 0x0e, 0x73, 0x74, 0x61, 0x72, 0x74, 0x5f, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6c, 0x61,
	0x6e, 0x67, 0x2e, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0d, 0x73, 0x74, 0x61,
	0x72, 0x74, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x36, 0x0a, 0x0c, 0x65, 0x6e,
	0x64, 0x5f, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x13, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x50, 0x6f, 0x73,
	0x69, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0b, 0x65, 0x6e, 0x64, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69,
	0x6f, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x6b, 0x69, 0x6e, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x04, 0x6b, 0x69, 0x6e, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x69, 0x6d, 0x70, 0x6c, 0x69, 0x63,
	0x69, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x08, 0x69, 0x6d, 0x70, 0x6c, 0x69, 0x63,
	0x69, 0x74, 0x12, 0x2b, 0x0a, 0x04, 0x77, 0x69, 0x74, 0x68, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x57,
	0x69, 0x74, 0x68, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x52, 0x04, 0x77, 0x69, 0x74, 0x68, 0x12,
	0x3e, 0x0a, 0x0a, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x0b, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71,
	0x6c, 0x2e, 0x51, 0x75, 0x61, 0x6c, 0x69, 0x66, 0x69, 0x65, 0x64, 0x54, 0x61, 0x62, 0x6c, 0x65,
	0x4e, 0x61, 0x6d, 0x65, 0x52, 0x09, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12,
	0x2e, 0x0a, 0x05, 0x77, 0x68, 0x65, 0x72, 0x65, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x18,
	0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x57, 0x68, 0x65,
	0x72, 0x65, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x52, 0x05, 0x77, 0x68, 0x65, 0x72, 0x65, 0x12,
	0x3a, 0x0a, 0x09, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6e, 0x69, 0x6e, 0x67, 0x18, 0x0f, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c,
	0x2e, 0x52, 0x65, 0x74, 0x75, 0x72, 0x6e, 0x69, 0x6e, 0x67, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65,
	0x52, 0x09, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6e, 0x69, 0x6e, 0x67, 0x42, 0x5d, 0x0a, 0x18, 0x6f,
	0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x42, 0x0f, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x53,
	0x74, 0x6d, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67,
	0x2f, 0x64, 0x62, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f,
	0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x3b, 0x73, 0x71, 0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_mojo_db_sql_delete_stmt_proto_rawDescOnce sync.Once
	file_mojo_db_sql_delete_stmt_proto_rawDescData = file_mojo_db_sql_delete_stmt_proto_rawDesc
)

func file_mojo_db_sql_delete_stmt_proto_rawDescGZIP() []byte {
	file_mojo_db_sql_delete_stmt_proto_rawDescOnce.Do(func() {
		file_mojo_db_sql_delete_stmt_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_db_sql_delete_stmt_proto_rawDescData)
	})
	return file_mojo_db_sql_delete_stmt_proto_rawDescData
}

var file_mojo_db_sql_delete_stmt_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_db_sql_delete_stmt_proto_goTypes = []interface{}{
	(*DeleteStmt)(nil),         // 0: mojo.db.sql.DeleteStmt
	(*lang.Position)(nil),      // 1: mojo.lang.Position
	(*WithClause)(nil),         // 2: mojo.db.sql.WithClause
	(*QualifiedTableName)(nil), // 3: mojo.db.sql.QualifiedTableName
	(*WhereClause)(nil),        // 4: mojo.db.sql.WhereClause
	(*ReturningClause)(nil),    // 5: mojo.db.sql.ReturningClause
}
var file_mojo_db_sql_delete_stmt_proto_depIdxs = []int32{
	1, // 0: mojo.db.sql.DeleteStmt.start_position:type_name -> mojo.lang.Position
	1, // 1: mojo.db.sql.DeleteStmt.end_position:type_name -> mojo.lang.Position
	2, // 2: mojo.db.sql.DeleteStmt.with:type_name -> mojo.db.sql.WithClause
	3, // 3: mojo.db.sql.DeleteStmt.table_name:type_name -> mojo.db.sql.QualifiedTableName
	4, // 4: mojo.db.sql.DeleteStmt.where:type_name -> mojo.db.sql.WhereClause
	5, // 5: mojo.db.sql.DeleteStmt.returning:type_name -> mojo.db.sql.ReturningClause
	6, // [6:6] is the sub-list for method output_type
	6, // [6:6] is the sub-list for method input_type
	6, // [6:6] is the sub-list for extension type_name
	6, // [6:6] is the sub-list for extension extendee
	0, // [0:6] is the sub-list for field type_name
}

func init() { file_mojo_db_sql_delete_stmt_proto_init() }
func file_mojo_db_sql_delete_stmt_proto_init() {
	if File_mojo_db_sql_delete_stmt_proto != nil {
		return
	}
	file_mojo_db_sql_data_manipulation_stmt_proto_init()
	file_mojo_db_sql_qualified_table_name_proto_init()
	file_mojo_db_sql_returning_clause_proto_init()
	file_mojo_db_sql_sql_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_db_sql_delete_stmt_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteStmt); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_mojo_db_sql_delete_stmt_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_db_sql_delete_stmt_proto_goTypes,
		DependencyIndexes: file_mojo_db_sql_delete_stmt_proto_depIdxs,
		MessageInfos:      file_mojo_db_sql_delete_stmt_proto_msgTypes,
	}.Build()
	File_mojo_db_sql_delete_stmt_proto = out.File
	file_mojo_db_sql_delete_stmt_proto_rawDesc = nil
	file_mojo_db_sql_delete_stmt_proto_goTypes = nil
	file_mojo_db_sql_delete_stmt_proto_depIdxs = nil
}
