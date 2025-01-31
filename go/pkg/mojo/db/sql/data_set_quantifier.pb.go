// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/db/sql/data_set_quantifier.proto

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

type DataSetQuantifier int32

const (
	DataSetQuantifier_DATA_SET_QUANTIFIER_UNSPECIFIED DataSetQuantifier = 0
	DataSetQuantifier_DATA_SET_QUANTIFIER_DISTINCT    DataSetQuantifier = 1
	DataSetQuantifier_DATA_SET_QUANTIFIER_ALL         DataSetQuantifier = 2
)

// Enum value maps for DataSetQuantifier.
var (
	DataSetQuantifier_name = map[int32]string{
		0: "DATA_SET_QUANTIFIER_UNSPECIFIED",
		1: "DATA_SET_QUANTIFIER_DISTINCT",
		2: "DATA_SET_QUANTIFIER_ALL",
	}
	DataSetQuantifier_value = map[string]int32{
		"DATA_SET_QUANTIFIER_UNSPECIFIED": 0,
		"DATA_SET_QUANTIFIER_DISTINCT":    1,
		"DATA_SET_QUANTIFIER_ALL":         2,
	}
)

func (x DataSetQuantifier) Enum() *DataSetQuantifier {
	p := new(DataSetQuantifier)
	*p = x
	return p
}

func (x DataSetQuantifier) ToText() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (DataSetQuantifier) Descriptor() protoreflect.EnumDescriptor {
	return file_mojo_db_sql_data_set_quantifier_proto_enumTypes[0].Descriptor()
}

func (DataSetQuantifier) Type() protoreflect.EnumType {
	return &file_mojo_db_sql_data_set_quantifier_proto_enumTypes[0]
}

func (x DataSetQuantifier) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use DataSetQuantifier.Descriptor instead.
func (DataSetQuantifier) EnumDescriptor() ([]byte, []int) {
	return file_mojo_db_sql_data_set_quantifier_proto_rawDescGZIP(), []int{0}
}

var File_mojo_db_sql_data_set_quantifier_proto protoreflect.FileDescriptor

var file_mojo_db_sql_data_set_quantifier_proto_rawDesc = []byte{
	0x0a, 0x25, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x64, 0x61,
	0x74, 0x61, 0x5f, 0x73, 0x65, 0x74, 0x5f, 0x71, 0x75, 0x61, 0x6e, 0x74, 0x69, 0x66, 0x69, 0x65,
	0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62,
	0x2e, 0x73, 0x71, 0x6c, 0x2a, 0x77, 0x0a, 0x11, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x74, 0x51,
	0x75, 0x61, 0x6e, 0x74, 0x69, 0x66, 0x69, 0x65, 0x72, 0x12, 0x23, 0x0a, 0x1f, 0x44, 0x41, 0x54,
	0x41, 0x5f, 0x53, 0x45, 0x54, 0x5f, 0x51, 0x55, 0x41, 0x4e, 0x54, 0x49, 0x46, 0x49, 0x45, 0x52,
	0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x20,
	0x0a, 0x1c, 0x44, 0x41, 0x54, 0x41, 0x5f, 0x53, 0x45, 0x54, 0x5f, 0x51, 0x55, 0x41, 0x4e, 0x54,
	0x49, 0x46, 0x49, 0x45, 0x52, 0x5f, 0x44, 0x49, 0x53, 0x54, 0x49, 0x4e, 0x43, 0x54, 0x10, 0x01,
	0x12, 0x1b, 0x0a, 0x17, 0x44, 0x41, 0x54, 0x41, 0x5f, 0x53, 0x45, 0x54, 0x5f, 0x51, 0x55, 0x41,
	0x4e, 0x54, 0x49, 0x46, 0x49, 0x45, 0x52, 0x5f, 0x41, 0x4c, 0x4c, 0x10, 0x02, 0x42, 0x64, 0x0a,
	0x18, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f,
	0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x42, 0x16, 0x44, 0x61, 0x74, 0x61, 0x53,
	0x65, 0x74, 0x51, 0x75, 0x61, 0x6e, 0x74, 0x69, 0x66, 0x69, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x74,
	0x6f, 0x50, 0x01, 0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x64, 0x62, 0x2f, 0x67, 0x6f, 0x2f,
	0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x3b,
	0x73, 0x71, 0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_db_sql_data_set_quantifier_proto_rawDescOnce sync.Once
	file_mojo_db_sql_data_set_quantifier_proto_rawDescData = file_mojo_db_sql_data_set_quantifier_proto_rawDesc
)

func file_mojo_db_sql_data_set_quantifier_proto_rawDescGZIP() []byte {
	file_mojo_db_sql_data_set_quantifier_proto_rawDescOnce.Do(func() {
		file_mojo_db_sql_data_set_quantifier_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_db_sql_data_set_quantifier_proto_rawDescData)
	})
	return file_mojo_db_sql_data_set_quantifier_proto_rawDescData
}

var file_mojo_db_sql_data_set_quantifier_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_mojo_db_sql_data_set_quantifier_proto_goTypes = []interface{}{
	(DataSetQuantifier)(0), // 0: mojo.db.sql.DataSetQuantifier
}
var file_mojo_db_sql_data_set_quantifier_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_mojo_db_sql_data_set_quantifier_proto_init() }
func file_mojo_db_sql_data_set_quantifier_proto_init() {
	if File_mojo_db_sql_data_set_quantifier_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_mojo_db_sql_data_set_quantifier_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_db_sql_data_set_quantifier_proto_goTypes,
		DependencyIndexes: file_mojo_db_sql_data_set_quantifier_proto_depIdxs,
		EnumInfos:         file_mojo_db_sql_data_set_quantifier_proto_enumTypes,
	}.Build()
	File_mojo_db_sql_data_set_quantifier_proto = out.File
	file_mojo_db_sql_data_set_quantifier_proto_rawDesc = nil
	file_mojo_db_sql_data_set_quantifier_proto_goTypes = nil
	file_mojo_db_sql_data_set_quantifier_proto_depIdxs = nil
}
