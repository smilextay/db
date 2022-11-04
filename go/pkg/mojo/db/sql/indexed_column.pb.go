// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: mojo/db/sql/indexed_column.proto

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

type IndexedColumn struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Name:
	//	*IndexedColumn_MojoCoreString
	//	*IndexedColumn_Expression
	Name    isIndexedColumn_Name `protobuf_oneof:"name" json:"name,omitempty"`
	Collate *CollateClause       `protobuf:"bytes,5,opt,name=collate,proto3" json:"collate,omitempty"`
	Order   Order                `protobuf:"varint,6,opt,name=order,proto3,enum=mojo.db.sql.Order" json:"order,omitempty"`
}

func (x *IndexedColumn) Reset() {
	*x = IndexedColumn{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_indexed_column_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IndexedColumn) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IndexedColumn) ProtoMessage() {}

func (x *IndexedColumn) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_indexed_column_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IndexedColumn.ProtoReflect.Descriptor instead.
func (*IndexedColumn) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_indexed_column_proto_rawDescGZIP(), []int{0}
}

func (m *IndexedColumn) GetName() isIndexedColumn_Name {
	if m != nil {
		return m.Name
	}
	return nil
}

func (x *IndexedColumn) GetMojoCoreString() string {
	if x, ok := x.GetName().(*IndexedColumn_MojoCoreString); ok {
		return x.MojoCoreString
	}
	return ""
}

func (x *IndexedColumn) GetExpression() *Expression {
	if x, ok := x.GetName().(*IndexedColumn_Expression); ok {
		return x.Expression
	}
	return nil
}

func (x *IndexedColumn) GetCollate() *CollateClause {
	if x != nil {
		return x.Collate
	}
	return nil
}

func (x *IndexedColumn) GetOrder() Order {
	if x != nil {
		return x.Order
	}
	return Order_ORDER_UNSPECIFIED
}

type isIndexedColumn_Name interface {
	isIndexedColumn_Name()
}

type IndexedColumn_MojoCoreString struct {
	MojoCoreString string `protobuf:"bytes,1,opt,name=mojo_core_string,json=mojoCoreString,proto3,oneof" json:"mojoCoreString,omitempty"`
}

type IndexedColumn_Expression struct {
	Expression *Expression `protobuf:"bytes,2,opt,name=expression,proto3,oneof" json:"expression,omitempty"`
}

func (*IndexedColumn_MojoCoreString) isIndexedColumn_Name() {}

func (*IndexedColumn_Expression) isIndexedColumn_Name() {}

var File_mojo_db_sql_indexed_column_proto protoreflect.FileDescriptor

var file_mojo_db_sql_indexed_column_proto_rawDesc = []byte{
	0x0a, 0x20, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x69, 0x6e,
	0x64, 0x65, 0x78, 0x65, 0x64, 0x5f, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x0b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x1a,
	0x20, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x63, 0x6f, 0x6c,
	0x6c, 0x61, 0x74, 0x65, 0x5f, 0x63, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x17, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x6f,
	0x72, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x15, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0xde, 0x01, 0x0a, 0x0d, 0x49, 0x6e, 0x64, 0x65, 0x78, 0x65, 0x64, 0x43, 0x6f, 0x6c,
	0x75, 0x6d, 0x6e, 0x12, 0x2a, 0x0a, 0x10, 0x6d, 0x6f, 0x6a, 0x6f, 0x5f, 0x63, 0x6f, 0x72, 0x65,
	0x5f, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52,
	0x0e, 0x6d, 0x6f, 0x6a, 0x6f, 0x43, 0x6f, 0x72, 0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x12,
	0x39, 0x0a, 0x0a, 0x65, 0x78, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71,
	0x6c, 0x2e, 0x45, 0x78, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x48, 0x00, 0x52, 0x0a,
	0x65, 0x78, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x34, 0x0a, 0x07, 0x63, 0x6f,
	0x6c, 0x6c, 0x61, 0x74, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x6d, 0x6f,
	0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x43, 0x6f, 0x6c, 0x6c, 0x61, 0x74,
	0x65, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x52, 0x07, 0x63, 0x6f, 0x6c, 0x6c, 0x61, 0x74, 0x65,
	0x12, 0x28, 0x0a, 0x05, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x12, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x4f, 0x72,
	0x64, 0x65, 0x72, 0x52, 0x05, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x42, 0x06, 0x0a, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x42, 0x60, 0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61,
	0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x42, 0x12,
	0x49, 0x6e, 0x64, 0x65, 0x78, 0x65, 0x64, 0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x64, 0x62, 0x2f, 0x67, 0x6f,
	0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c,
	0x3b, 0x73, 0x71, 0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_db_sql_indexed_column_proto_rawDescOnce sync.Once
	file_mojo_db_sql_indexed_column_proto_rawDescData = file_mojo_db_sql_indexed_column_proto_rawDesc
)

func file_mojo_db_sql_indexed_column_proto_rawDescGZIP() []byte {
	file_mojo_db_sql_indexed_column_proto_rawDescOnce.Do(func() {
		file_mojo_db_sql_indexed_column_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_db_sql_indexed_column_proto_rawDescData)
	})
	return file_mojo_db_sql_indexed_column_proto_rawDescData
}

var file_mojo_db_sql_indexed_column_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_db_sql_indexed_column_proto_goTypes = []interface{}{
	(*IndexedColumn)(nil), // 0: mojo.db.sql.IndexedColumn
	(*Expression)(nil),    // 1: mojo.db.sql.Expression
	(*CollateClause)(nil), // 2: mojo.db.sql.CollateClause
	(Order)(0),            // 3: mojo.db.sql.Order
}
var file_mojo_db_sql_indexed_column_proto_depIdxs = []int32{
	1, // 0: mojo.db.sql.IndexedColumn.expression:type_name -> mojo.db.sql.Expression
	2, // 1: mojo.db.sql.IndexedColumn.collate:type_name -> mojo.db.sql.CollateClause
	3, // 2: mojo.db.sql.IndexedColumn.order:type_name -> mojo.db.sql.Order
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_mojo_db_sql_indexed_column_proto_init() }
func file_mojo_db_sql_indexed_column_proto_init() {
	if File_mojo_db_sql_indexed_column_proto != nil {
		return
	}
	file_mojo_db_sql_collate_clause_proto_init()
	file_mojo_db_sql_order_proto_init()
	file_mojo_db_sql_sql_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_db_sql_indexed_column_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IndexedColumn); i {
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
	file_mojo_db_sql_indexed_column_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*IndexedColumn_MojoCoreString)(nil),
		(*IndexedColumn_Expression)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_mojo_db_sql_indexed_column_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_db_sql_indexed_column_proto_goTypes,
		DependencyIndexes: file_mojo_db_sql_indexed_column_proto_depIdxs,
		MessageInfos:      file_mojo_db_sql_indexed_column_proto_msgTypes,
	}.Build()
	File_mojo_db_sql_indexed_column_proto = out.File
	file_mojo_db_sql_indexed_column_proto_rawDesc = nil
	file_mojo_db_sql_indexed_column_proto_goTypes = nil
	file_mojo_db_sql_indexed_column_proto_depIdxs = nil
}
