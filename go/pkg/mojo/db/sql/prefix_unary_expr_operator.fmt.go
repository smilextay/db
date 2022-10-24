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

var PrefixUnaryExprOperatorNames = map[int32]string{
	0:  "unspecified",
	1:  "minus",
	2:  "plus",
	3:  "tilde",
	4:  "not",
	5:  "bit_not",
	99: "extended",
}

var PrefixUnaryExprOperatorValues = map[string]PrefixUnaryExpr_Operator{
	"unspecified": PrefixUnaryExpr_OPERATOR_UNSPECIFIED,
	"minus":       PrefixUnaryExpr_OPERATOR_MINUS,
	"plus":        PrefixUnaryExpr_OPERATOR_PLUS,
	"tilde":       PrefixUnaryExpr_OPERATOR_TILDE,
	"not":         PrefixUnaryExpr_OPERATOR_NOT,
	"bit_not":     PrefixUnaryExpr_OPERATOR_BIT_NOT,
	"extended":    PrefixUnaryExpr_OPERATOR_EXTENDED,
}

func (x PrefixUnaryExpr_Operator) Format() string {
	v := int32(x)
	if s, ok := PrefixUnaryExprOperatorNames[v]; ok {
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

func (x PrefixUnaryExpr_Operator) ToString() string {
	return x.Format()
}

func (x *PrefixUnaryExpr_Operator) Parse(value string) error {
	if x != nil && len(value) > 0 {
		if s, ok := PrefixUnaryExprOperatorValues[value]; ok {
			*x = s
		} else {
			v := core.CaseStyler("snake")(value)
			if s, ok = PrefixUnaryExprOperatorValues[v]; ok {
				*x = s
			} else {
				return fmt.Errorf("invalid PrefixUnaryExpr_Operator: %s", value)
			}
		}
	}
	return nil
}

func ParsePrefixUnaryExpr_Operator(value string) (PrefixUnaryExpr_Operator, error) {
	var v PrefixUnaryExpr_Operator
	if err := (&v).Parse(value); err != nil {
		return v, err
	}
	return v, nil
}
