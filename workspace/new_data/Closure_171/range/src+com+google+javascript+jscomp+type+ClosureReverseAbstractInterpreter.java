{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/type/ClosureReverseAbstractInterpreter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureReverseAbstractInterpreter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"
      ],
      "begin_line": 44,
      "end_line": 268,
      "comment": "\n * A reverse abstract interpreter (RAI) for specific closure patterns such as\n * {@code goog.isDef}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToArrayVisitor"
      ],
      "begin_line": 50,
      "end_line": 64,
      "comment": "\n   * For when {@code goog.isArray} returns true.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-dd21b417-cc81-4abc-b310-7e96c70d0070.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 52,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 11)-(line 56,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-1bd93181-e0db-4159-a64c-77db44fadae5.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 61,col 11)-(line 61,col 55)",
        "(line 62,col 11)-(line 62,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNotArrayVisitor"
      ],
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n   * For when {@code goog.isArray} returns false.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-581a0832-00ae-481a-8b4c-3e16a4404824.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 11)-(line 73,col 73)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "restrictToObjectVisitor"
      ],
      "begin_line": 81,
      "end_line": 97,
      "comment": "\n   * For when {@code goog.isObject} returns true. This includes functions, but\n   * not {@code null}.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-8cd10f27-8d86-4529-9cc7-ca43c8c95a9c.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 11)-(line 85,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-6d8883fb-7f83-4c01-8207-864feb47d461.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 11)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-ab04dcc9-bfa3-4972-98ef-b9c2c698e767.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 11)-(line 95,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNotObjectVisitor"
      ],
      "begin_line": 102,
      "end_line": 120,
      "comment": "\n   * For when {@code goog.isObject} returns false.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-dc78973c-a970-4870-8b41-8324a766636a.caseAllType()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 11)-(line 108,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-25d99222-3ce2-4809-a027-132dac5e8aa3.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 11)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-febdf96e-eba3-49f7-8348-498b35a06eb8.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 11)-(line 118,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "restricters"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Functions used to restrict types. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.ClosureReverseAbstractInterpreter(com.google.javascript.jscomp.CodingConvention, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 128,
      "end_line": 216,
      "comment": "\n   * Creates a {@link ClosureReverseAbstractInterpreter}.\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 36)",
        "(line 131,col 5)-(line 215,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-146c5156-5f29-421e-912a-9e93ed5529f3.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 204,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 206,col 11)-(line 208,col 11)",
        "(line 210,col 11)-(line 211,col 41)",
        "(line 212,col 11)-(line 212,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-a8e25217-db08-49a1-a2d5-a99eff741a2c.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 192,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 194,col 11)-(line 196,col 11)",
        "(line 198,col 11)-(line 199,col 40)",
        "(line 200,col 11)-(line 200,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-74e8403e-5b31-4abc-9c7e-ed4437eec6f1.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 11)-(line 188,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-4a277de5-3b60-441d-9a19-dbdf46d18ea9.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 11)-(line 182,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-b87551ad-5119-4db1-974e-0bc3e0d8f034.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 11)-(line 176,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-ed4e7fd4-83ab-4142-8ccd-5710a4fa8a42.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 11)-(line 170,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-485b79b2-1067-410e-a061-7f1f06529134.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 156,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 158,col 11)-(line 164,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-8a3b5c41-8da6-427f-8e8c-5d6d7ec07df4.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 145,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 147,col 11)-(line 152,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-575a55c9-d049-4295-b8ea-7559093a8d24.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 134,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 136,col 11)-(line 141,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 218,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 238,col 5)",
        "(line 239,col 5)-(line 240,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.restrictParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function\u003ccom.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType\u003e, boolean)",
      "begin_line": 243,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 247,col 5)-(line 247,col 65)",
        "(line 250,col 5)-(line 256,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeRestriction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 259,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outcome"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction.TypeRestriction(com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 263,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 264,col 7)-(line 264,col 23)",
        "(line 265,col 7)-(line 265,col 29)"
      ]
    }
  ]
}