// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/db/sql/create_view_stmt.proto

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

type CreateViewStmt struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	StartPosition *lang.Position `protobuf:"bytes,1,opt,name=start_position,json=startPosition,proto3" json:"startPosition,omitempty"`
	EndPosition   *lang.Position `protobuf:"bytes,2,opt,name=end_position,json=endPosition,proto3" json:"endPosition,omitempty"`
	Kind          int64          `protobuf:"varint,4,opt,name=kind,proto3" json:"kind,omitempty"`
	Implicit      bool           `protobuf:"varint,5,opt,name=implicit,proto3" json:"implicit,omitempty"`
	IfNotExists   bool           `protobuf:"varint,10,opt,name=if_not_exists,json=ifNotExists,proto3" json:"ifNotExists,omitempty"`
	ViewName      *ViewName      `protobuf:"bytes,11,opt,name=view_name,json=viewName,proto3" json:"viewName,omitempty"`
	Columns       []string       `protobuf:"bytes,13,rep,name=columns,proto3" json:"columns,omitempty"`
	Query         *SelectStmt    `protobuf:"bytes,14,opt,name=query,proto3" json:"query,omitempty"`
}

func (x *CreateViewStmt) Reset() {
	*x = CreateViewStmt{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_create_view_stmt_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateViewStmt) ToText() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateViewStmt) ProtoMessage() {}

func (x *CreateViewStmt) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_create_view_stmt_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateViewStmt.ProtoReflect.Descriptor instead.
func (*CreateViewStmt) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_create_view_stmt_proto_rawDescGZIP(), []int{0}
}

func (x *CreateViewStmt) GetStartPosition() *lang.Position {
	if x != nil {
		return x.StartPosition
	}
	return nil
}

func (x *CreateViewStmt) GetEndPosition() *lang.Position {
	if x != nil {
		return x.EndPosition
	}
	return nil
}

func (x *CreateViewStmt) GetKind() int64 {
	if x != nil {
		return x.Kind
	}
	return 0
}

func (x *CreateViewStmt) GetImplicit() bool {
	if x != nil {
		return x.Implicit
	}
	return false
}

func (x *CreateViewStmt) GetIfNotExists() bool {
	if x != nil {
		return x.IfNotExists
	}
	return false
}

func (x *CreateViewStmt) GetViewName() *ViewName {
	if x != nil {
		return x.ViewName
	}
	return nil
}

func (x *CreateViewStmt) GetColumns() []string {
	if x != nil {
		return x.Columns
	}
	return nil
}

func (x *CreateViewStmt) GetQuery() *SelectStmt {
	if x != nil {
		return x.Query
	}
	return nil
}

var File_mojo_db_sql_create_view_stmt_proto protoreflect.FileDescriptor

var file_mojo_db_sql_create_view_stmt_proto_rawDesc = []byte{
	0x0a, 0x22, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x63, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x5f, 0x76, 0x69, 0x65, 0x77, 0x5f, 0x73, 0x74, 0x6d, 0x74, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71,
	0x6c, 0x1a, 0x1d, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x63,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x5f, 0x73, 0x74, 0x6d, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x26, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x64, 0x61,
	0x74, 0x61, 0x5f, 0x64, 0x65, 0x66, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x74,
	0x6d, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x15, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64,
	0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x1b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x76, 0x69, 0x65,
	0x77, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x14, 0x6d, 0x6f,
	0x6a, 0x6f, 0x2f, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0xd5, 0x02, 0x0a, 0x0e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x56, 0x69, 0x65,
	0x77, 0x53, 0x74, 0x6d, 0x74, 0x12, 0x3a, 0x0a, 0x0e, 0x73, 0x74, 0x61, 0x72, 0x74, 0x5f, 0x70,
	0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x0d, 0x73, 0x74, 0x61, 0x72, 0x74, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x12, 0x36, 0x0a, 0x0c, 0x65, 0x6e, 0x64, 0x5f, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6c,
	0x61, 0x6e, 0x67, 0x2e, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0b, 0x65, 0x6e,
	0x64, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x6b, 0x69, 0x6e,
	0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x04, 0x6b, 0x69, 0x6e, 0x64, 0x12, 0x1a, 0x0a,
	0x08, 0x69, 0x6d, 0x70, 0x6c, 0x69, 0x63, 0x69, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52,
	0x08, 0x69, 0x6d, 0x70, 0x6c, 0x69, 0x63, 0x69, 0x74, 0x12, 0x22, 0x0a, 0x0d, 0x69, 0x66, 0x5f,
	0x6e, 0x6f, 0x74, 0x5f, 0x65, 0x78, 0x69, 0x73, 0x74, 0x73, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x0b, 0x69, 0x66, 0x4e, 0x6f, 0x74, 0x45, 0x78, 0x69, 0x73, 0x74, 0x73, 0x12, 0x32, 0x0a,
	0x09, 0x76, 0x69, 0x65, 0x77, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x15, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x56,
	0x69, 0x65, 0x77, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x08, 0x76, 0x69, 0x65, 0x77, 0x4e, 0x61, 0x6d,
	0x65, 0x12, 0x18, 0x0a, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x18, 0x0d, 0x20, 0x03,
	0x28, 0x09, 0x52, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x12, 0x2d, 0x0a, 0x05, 0x71,
	0x75, 0x65, 0x72, 0x79, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x53, 0x65, 0x6c, 0x65, 0x63, 0x74, 0x53,
	0x74, 0x6d, 0x74, 0x52, 0x05, 0x71, 0x75, 0x65, 0x72, 0x79, 0x42, 0x61, 0x0a, 0x18, 0x6f, 0x72,
	0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x42, 0x13, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x56, 0x69,
	0x65, 0x77, 0x53, 0x74, 0x6d, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2e, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c,
	0x61, 0x6e, 0x67, 0x2f, 0x64, 0x62, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f,
	0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x3b, 0x73, 0x71, 0x6c, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_db_sql_create_view_stmt_proto_rawDescOnce sync.Once
	file_mojo_db_sql_create_view_stmt_proto_rawDescData = file_mojo_db_sql_create_view_stmt_proto_rawDesc
)

func file_mojo_db_sql_create_view_stmt_proto_rawDescGZIP() []byte {
	file_mojo_db_sql_create_view_stmt_proto_rawDescOnce.Do(func() {
		file_mojo_db_sql_create_view_stmt_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_db_sql_create_view_stmt_proto_rawDescData)
	})
	return file_mojo_db_sql_create_view_stmt_proto_rawDescData
}

var file_mojo_db_sql_create_view_stmt_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_db_sql_create_view_stmt_proto_goTypes = []interface{}{
	(*CreateViewStmt)(nil), // 0: mojo.db.sql.CreateViewStmt
	(*lang.Position)(nil),  // 1: mojo.lang.Position
	(*ViewName)(nil),       // 2: mojo.db.sql.ViewName
	(*SelectStmt)(nil),     // 3: mojo.db.sql.SelectStmt
}
var file_mojo_db_sql_create_view_stmt_proto_depIdxs = []int32{
	1, // 0: mojo.db.sql.CreateViewStmt.start_position:type_name -> mojo.lang.Position
	1, // 1: mojo.db.sql.CreateViewStmt.end_position:type_name -> mojo.lang.Position
	2, // 2: mojo.db.sql.CreateViewStmt.view_name:type_name -> mojo.db.sql.ViewName
	3, // 3: mojo.db.sql.CreateViewStmt.query:type_name -> mojo.db.sql.SelectStmt
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_mojo_db_sql_create_view_stmt_proto_init() }
func file_mojo_db_sql_create_view_stmt_proto_init() {
	if File_mojo_db_sql_create_view_stmt_proto != nil {
		return
	}
	file_mojo_db_sql_create_stmt_proto_init()
	file_mojo_db_sql_data_definition_stmt_proto_init()
	file_mojo_db_sql_sql_proto_init()
	file_mojo_db_sql_view_name_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_db_sql_create_view_stmt_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateViewStmt); i {
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
			RawDescriptor: file_mojo_db_sql_create_view_stmt_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_db_sql_create_view_stmt_proto_goTypes,
		DependencyIndexes: file_mojo_db_sql_create_view_stmt_proto_depIdxs,
		MessageInfos:      file_mojo_db_sql_create_view_stmt_proto_msgTypes,
	}.Build()
	File_mojo_db_sql_create_view_stmt_proto = out.File
	file_mojo_db_sql_create_view_stmt_proto_rawDesc = nil
	file_mojo_db_sql_create_view_stmt_proto_goTypes = nil
	file_mojo_db_sql_create_view_stmt_proto_depIdxs = nil
}
