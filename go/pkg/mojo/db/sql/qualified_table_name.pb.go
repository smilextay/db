// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/db/sql/qualified_table_name.proto

package sql

import (
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

type QualifiedTableName struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Schema     string `protobuf:"bytes,1,opt,name=schema,proto3" json:"schema,omitempty"`
	Name       string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Alias      string `protobuf:"bytes,3,opt,name=alias,proto3" json:"alias,omitempty"`
	Indexed    string `protobuf:"bytes,5,opt,name=indexed,proto3" json:"indexed,omitempty"`
	NotIndexed bool   `protobuf:"varint,6,opt,name=not_indexed,json=notIndexed,proto3" json:"notIndexed,omitempty"`
}

func (x *QualifiedTableName) Reset() {
	*x = QualifiedTableName{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_qualified_table_name_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QualifiedTableName) ToText() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QualifiedTableName) ProtoMessage() {}

func (x *QualifiedTableName) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_qualified_table_name_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QualifiedTableName.ProtoReflect.Descriptor instead.
func (*QualifiedTableName) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_qualified_table_name_proto_rawDescGZIP(), []int{0}
}

func (x *QualifiedTableName) GetSchema() string {
	if x != nil {
		return x.Schema
	}
	return ""
}

func (x *QualifiedTableName) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *QualifiedTableName) GetAlias() string {
	if x != nil {
		return x.Alias
	}
	return ""
}

func (x *QualifiedTableName) GetIndexed() string {
	if x != nil {
		return x.Indexed
	}
	return ""
}

func (x *QualifiedTableName) GetNotIndexed() bool {
	if x != nil {
		return x.NotIndexed
	}
	return false
}

var File_mojo_db_sql_qualified_table_name_proto protoreflect.FileDescriptor

var file_mojo_db_sql_qualified_table_name_proto_rawDesc = []byte{
	0x0a, 0x26, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x71, 0x75,
	0x61, 0x6c, 0x69, 0x66, 0x69, 0x65, 0x64, 0x5f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x6e, 0x61,
	0x6d, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64,
	0x62, 0x2e, 0x73, 0x71, 0x6c, 0x22, 0x91, 0x01, 0x0a, 0x12, 0x51, 0x75, 0x61, 0x6c, 0x69, 0x66,
	0x69, 0x65, 0x64, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x16, 0x0a, 0x06,
	0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x73, 0x63,
	0x68, 0x65, 0x6d, 0x61, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x61, 0x6c, 0x69, 0x61,
	0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x61, 0x6c, 0x69, 0x61, 0x73, 0x12, 0x18,
	0x0a, 0x07, 0x69, 0x6e, 0x64, 0x65, 0x78, 0x65, 0x64, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x07, 0x69, 0x6e, 0x64, 0x65, 0x78, 0x65, 0x64, 0x12, 0x1f, 0x0a, 0x0b, 0x6e, 0x6f, 0x74, 0x5f,
	0x69, 0x6e, 0x64, 0x65, 0x78, 0x65, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0a, 0x6e,
	0x6f, 0x74, 0x49, 0x6e, 0x64, 0x65, 0x78, 0x65, 0x64, 0x42, 0x65, 0x0a, 0x18, 0x6f, 0x72, 0x67,
	0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64,
	0x62, 0x2e, 0x73, 0x71, 0x6c, 0x42, 0x17, 0x51, 0x75, 0x61, 0x6c, 0x69, 0x66, 0x69, 0x65, 0x64,
	0x54, 0x61, 0x62, 0x6c, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01,
	0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x64, 0x62, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67,
	0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x3b, 0x73, 0x71, 0x6c,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_db_sql_qualified_table_name_proto_rawDescOnce sync.Once
	file_mojo_db_sql_qualified_table_name_proto_rawDescData = file_mojo_db_sql_qualified_table_name_proto_rawDesc
)

func file_mojo_db_sql_qualified_table_name_proto_rawDescGZIP() []byte {
	file_mojo_db_sql_qualified_table_name_proto_rawDescOnce.Do(func() {
		file_mojo_db_sql_qualified_table_name_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_db_sql_qualified_table_name_proto_rawDescData)
	})
	return file_mojo_db_sql_qualified_table_name_proto_rawDescData
}

var file_mojo_db_sql_qualified_table_name_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_db_sql_qualified_table_name_proto_goTypes = []interface{}{
	(*QualifiedTableName)(nil), // 0: mojo.db.sql.QualifiedTableName
}
var file_mojo_db_sql_qualified_table_name_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_mojo_db_sql_qualified_table_name_proto_init() }
func file_mojo_db_sql_qualified_table_name_proto_init() {
	if File_mojo_db_sql_qualified_table_name_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_mojo_db_sql_qualified_table_name_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QualifiedTableName); i {
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
			RawDescriptor: file_mojo_db_sql_qualified_table_name_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_db_sql_qualified_table_name_proto_goTypes,
		DependencyIndexes: file_mojo_db_sql_qualified_table_name_proto_depIdxs,
		MessageInfos:      file_mojo_db_sql_qualified_table_name_proto_msgTypes,
	}.Build()
	File_mojo_db_sql_qualified_table_name_proto = out.File
	file_mojo_db_sql_qualified_table_name_proto_rawDesc = nil
	file_mojo_db_sql_qualified_table_name_proto_goTypes = nil
	file_mojo_db_sql_qualified_table_name_proto_depIdxs = nil
}
