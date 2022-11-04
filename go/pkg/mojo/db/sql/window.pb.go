// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: mojo/db/sql/window.proto

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

type Window struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name      string           `protobuf:"bytes,10,opt,name=name,proto3" json:"name,omitempty"`
	Partition *PartitionClause `protobuf:"bytes,13,opt,name=partition,proto3" json:"partition,omitempty"`
	OrderBy   *OrderByClause   `protobuf:"bytes,14,opt,name=order_by,json=orderBy,proto3" json:"orderBy,omitempty"`
	Frame     *Window_Frame    `protobuf:"bytes,15,opt,name=frame,proto3" json:"frame,omitempty"`
}

func (x *Window) Reset() {
	*x = Window{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_window_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Window) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Window) ProtoMessage() {}

func (x *Window) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_window_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Window.ProtoReflect.Descriptor instead.
func (*Window) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_window_proto_rawDescGZIP(), []int{0}
}

func (x *Window) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Window) GetPartition() *PartitionClause {
	if x != nil {
		return x.Partition
	}
	return nil
}

func (x *Window) GetOrderBy() *OrderByClause {
	if x != nil {
		return x.OrderBy
	}
	return nil
}

func (x *Window) GetFrame() *Window_Frame {
	if x != nil {
		return x.Frame
	}
	return nil
}

type Window_Frame struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Type            string              `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	LowerBound      *Window_Frame_Bound `protobuf:"bytes,2,opt,name=lower_bound,json=lowerBound,proto3" json:"lowerBound,omitempty"`
	UpperBound      *Window_Frame_Bound `protobuf:"bytes,3,opt,name=upper_bound,json=upperBound,proto3" json:"upperBound,omitempty"`
	Exclude         bool                `protobuf:"varint,5,opt,name=exclude,proto3" json:"exclude,omitempty"`
	ExcludeNoOthers bool                `protobuf:"varint,6,opt,name=exclude_no_others,json=excludeNoOthers,proto3" json:"excludeNoOthers,omitempty"`
	CurrentRow      bool                `protobuf:"varint,7,opt,name=current_row,json=currentRow,proto3" json:"currentRow,omitempty"`
	Group           bool                `protobuf:"varint,8,opt,name=group,proto3" json:"group,omitempty"`
	Ties            bool                `protobuf:"varint,9,opt,name=ties,proto3" json:"ties,omitempty"`
}

func (x *Window_Frame) Reset() {
	*x = Window_Frame{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_window_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Window_Frame) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Window_Frame) ProtoMessage() {}

func (x *Window_Frame) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_window_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Window_Frame.ProtoReflect.Descriptor instead.
func (*Window_Frame) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_window_proto_rawDescGZIP(), []int{0, 0}
}

func (x *Window_Frame) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *Window_Frame) GetLowerBound() *Window_Frame_Bound {
	if x != nil {
		return x.LowerBound
	}
	return nil
}

func (x *Window_Frame) GetUpperBound() *Window_Frame_Bound {
	if x != nil {
		return x.UpperBound
	}
	return nil
}

func (x *Window_Frame) GetExclude() bool {
	if x != nil {
		return x.Exclude
	}
	return false
}

func (x *Window_Frame) GetExcludeNoOthers() bool {
	if x != nil {
		return x.ExcludeNoOthers
	}
	return false
}

func (x *Window_Frame) GetCurrentRow() bool {
	if x != nil {
		return x.CurrentRow
	}
	return false
}

func (x *Window_Frame) GetGroup() bool {
	if x != nil {
		return x.Group
	}
	return false
}

func (x *Window_Frame) GetTies() bool {
	if x != nil {
		return x.Ties
	}
	return false
}

type Window_Frame_Bound struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Expression *Expression `protobuf:"bytes,1,opt,name=expression,proto3" json:"expression,omitempty"`
	Preceding  bool        `protobuf:"varint,5,opt,name=preceding,proto3" json:"preceding,omitempty"`
	Following  bool        `protobuf:"varint,6,opt,name=following,proto3" json:"following,omitempty"`
}

func (x *Window_Frame_Bound) Reset() {
	*x = Window_Frame_Bound{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_window_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Window_Frame_Bound) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Window_Frame_Bound) ProtoMessage() {}

func (x *Window_Frame_Bound) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_window_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Window_Frame_Bound.ProtoReflect.Descriptor instead.
func (*Window_Frame_Bound) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_window_proto_rawDescGZIP(), []int{0, 0, 0}
}

func (x *Window_Frame_Bound) GetExpression() *Expression {
	if x != nil {
		return x.Expression
	}
	return nil
}

func (x *Window_Frame_Bound) GetPreceding() bool {
	if x != nil {
		return x.Preceding
	}
	return false
}

func (x *Window_Frame_Bound) GetFollowing() bool {
	if x != nil {
		return x.Following
	}
	return false
}

var File_mojo_db_sql_window_proto protoreflect.FileDescriptor

var file_mojo_db_sql_window_proto_rawDesc = []byte{
	0x0a, 0x18, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x77, 0x69,
	0x6e, 0x64, 0x6f, 0x77, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x1a, 0x22, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62,
	0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x70, 0x61, 0x72, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63,
	0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x15, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0xf1, 0x04, 0x0a, 0x06, 0x57, 0x69, 0x6e, 0x64, 0x6f, 0x77, 0x12, 0x12, 0x0a,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d,
	0x65, 0x12, 0x3a, 0x0a, 0x09, 0x70, 0x61, 0x72, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x0d,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73,
	0x71, 0x6c, 0x2e, 0x50, 0x61, 0x72, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6c, 0x61, 0x75,
	0x73, 0x65, 0x52, 0x09, 0x70, 0x61, 0x72, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x35, 0x0a,
	0x08, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x5f, 0x62, 0x79, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1a, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x4f, 0x72,
	0x64, 0x65, 0x72, 0x42, 0x79, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x52, 0x07, 0x6f, 0x72, 0x64,
	0x65, 0x72, 0x42, 0x79, 0x12, 0x2f, 0x0a, 0x05, 0x66, 0x72, 0x61, 0x6d, 0x65, 0x18, 0x0f, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71,
	0x6c, 0x2e, 0x57, 0x69, 0x6e, 0x64, 0x6f, 0x77, 0x2e, 0x46, 0x72, 0x61, 0x6d, 0x65, 0x52, 0x05,
	0x66, 0x72, 0x61, 0x6d, 0x65, 0x1a, 0xae, 0x03, 0x0a, 0x05, 0x46, 0x72, 0x61, 0x6d, 0x65, 0x12,
	0x12, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74,
	0x79, 0x70, 0x65, 0x12, 0x40, 0x0a, 0x0b, 0x6c, 0x6f, 0x77, 0x65, 0x72, 0x5f, 0x62, 0x6f, 0x75,
	0x6e, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x57, 0x69, 0x6e, 0x64, 0x6f, 0x77, 0x2e, 0x46, 0x72,
	0x61, 0x6d, 0x65, 0x2e, 0x42, 0x6f, 0x75, 0x6e, 0x64, 0x52, 0x0a, 0x6c, 0x6f, 0x77, 0x65, 0x72,
	0x42, 0x6f, 0x75, 0x6e, 0x64, 0x12, 0x40, 0x0a, 0x0b, 0x75, 0x70, 0x70, 0x65, 0x72, 0x5f, 0x62,
	0x6f, 0x75, 0x6e, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x57, 0x69, 0x6e, 0x64, 0x6f, 0x77, 0x2e,
	0x46, 0x72, 0x61, 0x6d, 0x65, 0x2e, 0x42, 0x6f, 0x75, 0x6e, 0x64, 0x52, 0x0a, 0x75, 0x70, 0x70,
	0x65, 0x72, 0x42, 0x6f, 0x75, 0x6e, 0x64, 0x12, 0x18, 0x0a, 0x07, 0x65, 0x78, 0x63, 0x6c, 0x75,
	0x64, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x65, 0x78, 0x63, 0x6c, 0x75, 0x64,
	0x65, 0x12, 0x2a, 0x0a, 0x11, 0x65, 0x78, 0x63, 0x6c, 0x75, 0x64, 0x65, 0x5f, 0x6e, 0x6f, 0x5f,
	0x6f, 0x74, 0x68, 0x65, 0x72, 0x73, 0x18, 0x06, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0f, 0x65, 0x78,
	0x63, 0x6c, 0x75, 0x64, 0x65, 0x4e, 0x6f, 0x4f, 0x74, 0x68, 0x65, 0x72, 0x73, 0x12, 0x1f, 0x0a,
	0x0b, 0x63, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x74, 0x5f, 0x72, 0x6f, 0x77, 0x18, 0x07, 0x20, 0x01,
	0x28, 0x08, 0x52, 0x0a, 0x63, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x74, 0x52, 0x6f, 0x77, 0x12, 0x14,
	0x0a, 0x05, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x18, 0x08, 0x20, 0x01, 0x28, 0x08, 0x52, 0x05, 0x67,
	0x72, 0x6f, 0x75, 0x70, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x69, 0x65, 0x73, 0x18, 0x09, 0x20, 0x01,
	0x28, 0x08, 0x52, 0x04, 0x74, 0x69, 0x65, 0x73, 0x1a, 0x7c, 0x0a, 0x05, 0x42, 0x6f, 0x75, 0x6e,
	0x64, 0x12, 0x37, 0x0a, 0x0a, 0x65, 0x78, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e,
	0x73, 0x71, 0x6c, 0x2e, 0x45, 0x78, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x0a,
	0x65, 0x78, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x1c, 0x0a, 0x09, 0x70, 0x72,
	0x65, 0x63, 0x65, 0x64, 0x69, 0x6e, 0x67, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x09, 0x70,
	0x72, 0x65, 0x63, 0x65, 0x64, 0x69, 0x6e, 0x67, 0x12, 0x1c, 0x0a, 0x09, 0x66, 0x6f, 0x6c, 0x6c,
	0x6f, 0x77, 0x69, 0x6e, 0x67, 0x18, 0x06, 0x20, 0x01, 0x28, 0x08, 0x52, 0x09, 0x66, 0x6f, 0x6c,
	0x6c, 0x6f, 0x77, 0x69, 0x6e, 0x67, 0x42, 0x59, 0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f,
	0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73,
	0x71, 0x6c, 0x42, 0x0b, 0x57, 0x69, 0x6e, 0x64, 0x6f, 0x77, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50,
	0x01, 0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f,
	0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x64, 0x62, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b,
	0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x3b, 0x73, 0x71,
	0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_db_sql_window_proto_rawDescOnce sync.Once
	file_mojo_db_sql_window_proto_rawDescData = file_mojo_db_sql_window_proto_rawDesc
)

func file_mojo_db_sql_window_proto_rawDescGZIP() []byte {
	file_mojo_db_sql_window_proto_rawDescOnce.Do(func() {
		file_mojo_db_sql_window_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_db_sql_window_proto_rawDescData)
	})
	return file_mojo_db_sql_window_proto_rawDescData
}

var file_mojo_db_sql_window_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_mojo_db_sql_window_proto_goTypes = []interface{}{
	(*Window)(nil),             // 0: mojo.db.sql.Window
	(*Window_Frame)(nil),       // 1: mojo.db.sql.Window.Frame
	(*Window_Frame_Bound)(nil), // 2: mojo.db.sql.Window.Frame.Bound
	(*PartitionClause)(nil),    // 3: mojo.db.sql.PartitionClause
	(*OrderByClause)(nil),      // 4: mojo.db.sql.OrderByClause
	(*Expression)(nil),         // 5: mojo.db.sql.Expression
}
var file_mojo_db_sql_window_proto_depIdxs = []int32{
	3, // 0: mojo.db.sql.Window.partition:type_name -> mojo.db.sql.PartitionClause
	4, // 1: mojo.db.sql.Window.order_by:type_name -> mojo.db.sql.OrderByClause
	1, // 2: mojo.db.sql.Window.frame:type_name -> mojo.db.sql.Window.Frame
	2, // 3: mojo.db.sql.Window.Frame.lower_bound:type_name -> mojo.db.sql.Window.Frame.Bound
	2, // 4: mojo.db.sql.Window.Frame.upper_bound:type_name -> mojo.db.sql.Window.Frame.Bound
	5, // 5: mojo.db.sql.Window.Frame.Bound.expression:type_name -> mojo.db.sql.Expression
	6, // [6:6] is the sub-list for method output_type
	6, // [6:6] is the sub-list for method input_type
	6, // [6:6] is the sub-list for extension type_name
	6, // [6:6] is the sub-list for extension extendee
	0, // [0:6] is the sub-list for field type_name
}

func init() { file_mojo_db_sql_window_proto_init() }
func file_mojo_db_sql_window_proto_init() {
	if File_mojo_db_sql_window_proto != nil {
		return
	}
	file_mojo_db_sql_partition_clause_proto_init()
	file_mojo_db_sql_sql_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_db_sql_window_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Window); i {
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
		file_mojo_db_sql_window_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Window_Frame); i {
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
		file_mojo_db_sql_window_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Window_Frame_Bound); i {
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
			RawDescriptor: file_mojo_db_sql_window_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_db_sql_window_proto_goTypes,
		DependencyIndexes: file_mojo_db_sql_window_proto_depIdxs,
		MessageInfos:      file_mojo_db_sql_window_proto_msgTypes,
	}.Build()
	File_mojo_db_sql_window_proto = out.File
	file_mojo_db_sql_window_proto_rawDesc = nil
	file_mojo_db_sql_window_proto_goTypes = nil
	file_mojo_db_sql_window_proto_depIdxs = nil
}
