{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/type/ClosureReverseAbstractInterpreter.java",
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
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-a83353b9-09bf-47cc-a137-f0679078658d.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 52,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 11)-(line 56,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-181f8078-a57f-472b-89a4-51f91362d5c1.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
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
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-8067e0b2-1b71-46ca-af12-ec3ec5a0d019.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
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
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-55294308-b8bb-454c-9439-a031593726c9.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 11)-(line 85,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-9346ce49-0295-4d75-9aea-ab84e559edb3.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 11)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-fc5fe40e-0c27-437a-bb23-3e5e425b3868.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
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
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-cab542f7-9557-411f-b72e-d50fbd7baa9e.caseAllType()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 11)-(line 108,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-db5ad721-ad8b-48eb-b99a-c2159cc7d6b6.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 11)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-d3d23301-41be-43d4-86e9-1edf41bb40f6.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
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
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-e7ba3323-5533-46e4-be84-93b7a957e042.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
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
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-5726cffe-b4cb-498d-9974-ffd071ccad1a.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
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
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-ba1d52f4-1f05-414b-b4cc-211783239430.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 11)-(line 188,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-d7aa747c-416e-48dd-8ec9-2a9da5a90bc2.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 11)-(line 182,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-1b094ac0-8842-4049-9d4f-19b927a6787e.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 11)-(line 176,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-6fb5ed2b-16b8-4c4f-b66d-8e92dd014f97.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 11)-(line 170,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-938c0e1f-abc5-464e-a295-85ef86acd294.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 156,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 158,col 11)-(line 164,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-c46c6416-1451-4876-aa1f-bddca7c84437.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
      "begin_line": 145,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 147,col 11)-(line 152,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.Anonymous-209501bf-7cd8-4cd7-84e4-08e899789ab0.apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction)",
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