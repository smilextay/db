// Code generated by mojo. DO NOT EDIT.
// Rerunning mojo will overwrite this file.
//
// Copyright 2021 Mojo-lang.org
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package sql

import (
	"fmt"
	"strconv"
	"strings"

	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

var CompoundSelectOperatorNames = map[int32]string{
	0: "unspecified",
	1: "union",
	2: "intersect",
	3: "except",
}

var CompoundSelectOperatorValues = map[string]CompoundSelect_Operator{
	"unspecified": CompoundSelect_OPERATOR_UNSPECIFIED,
	"union":       CompoundSelect_OPERATOR_UNION,
	"intersect":   CompoundSelect_OPERATOR_INTERSECT,
	"except":      CompoundSelect_OPERATOR_EXCEPT,
}

func (x CompoundSelect_Operator) Format() string {
	v := int32(x)
	if s, ok := CompoundSelectOperatorNames[v]; ok {
		if v == 0 && "unspecified" == strings.ToLower(s) {
			return ""
		}
		return s
	}
	if v == 0 {
		return ""
	}
	return strconv.Itoa(int(v))
}

func (x CompoundSelect_Operator) ToString() string {
	return x.Format()
}

func (x *CompoundSelect_Operator) Parse(value string) error {
	if x != nil && len(value) > 0 {
		if s, ok := CompoundSelectOperatorValues[value]; ok {
			*x = s
		} else {
			v := core.CaseStyler("snake")(value)
			if s, ok = CompoundSelectOperatorValues[v]; ok {
				*x = s
			} else {
				return fmt.Errorf("invalid CompoundSelect_Operator: %s", value)
			}
		}
	}
	return nil
}

func ParseCompoundSelect_Operator(value string) (CompoundSelect_Operator, error) {
	var v CompoundSelect_Operator
	if err := (&v).Parse(value); err != nil {
		return v, err
	}
	return v, nil
}
