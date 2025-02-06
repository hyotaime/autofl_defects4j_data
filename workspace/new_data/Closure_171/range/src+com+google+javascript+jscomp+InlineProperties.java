{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/InlineProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 49,
      "end_line": 302,
      "comment": "\n * InlineProperties attempts to find references to properties that are known to\n * be constants and inline the known value.\n *\n * This pass relies on type information to find these property references and\n * properties are assumed to be constant if either:\n *   - the property is assigned unconditionally in the instance constructor\n *   - the property is assigned unconditionally to the type\u0027s prototype\n *\n * The current implementation only inlines immutable values (as defined by\n * NodeUtil.isImmutableValue).\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PropertyInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineProperties.PropertyInfo.PropertyInfo(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 55,col 7)-(line 55,col 23)",
        "(line 56,col 7)-(line 56,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALIDATED"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "props"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidatingTypes"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineProperties.InlineProperties(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 29)",
        "(line 71,col 5)-(line 71,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.buildInvalidatingTypeSet()",
      "begin_line": 77,
      "end_line": 99,
      "comment": " we should move it to a common location.",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 57)",
        "(line 79,col 5)-(line 93,col 59)",
        "(line 95,col 5)-(line 98,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 104,
      "end_line": 117,
      "comment": "\n   * Invalidates the given type, so that no properties on it will be renamed.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 47)",
        "(line 106,col 5)-(line 110,col 5)",
        "(line 112,col 5)-(line 112,col 32)",
        "(line 113,col 5)-(line 113,col 47)",
        "(line 114,col 5)-(line 116,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.isInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 120,
      "end_line": 140,
      "comment": " Returns true if properties on this type should not be renamed. ",
      "child_ranges": [
        "(line 121,col 5)-(line 131,col 5)",
        "(line 132,col 5)-(line 132,col 47)",
        "(line 133,col 5)-(line 139,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 146,
      "end_line": 154,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 34)",
        "(line 148,col 5)-(line 153,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 156,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 159,col 57)",
        "(line 160,col 5)-(line 161,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherCandidates",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 164,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 166,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 168,col 7)-(line 168,col 42)",
        "(line 169,col 7)-(line 169,col 29)",
        "(line 170,col 7)-(line 198,col 7)",
        "(line 200,col 7)-(line 203,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.maybeCandidateDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 209,
      "end_line": 237,
      "comment": "\n     * @return Whether this is a valid definition for a candidate property.\n     ",
      "child_ranges": [
        "(line 211,col 7)-(line 211,col 67)",
        "(line 212,col 7)-(line 212,col 34)",
        "(line 213,col 7)-(line 213,col 35)",
        "(line 214,col 7)-(line 214,col 53)",
        "(line 216,col 7)-(line 216,col 41)",
        "(line 217,col 7)-(line 235,col 7)",
        "(line 236,col 7)-(line 236,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.maybeGetInstanceTypeFromPrototypeRef(com.google.javascript.rhino.Node)",
      "begin_line": 239,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 240,col 7)-(line 240,col 56)",
        "(line 241,col 7)-(line 244,col 7)",
        "(line 245,col 7)-(line 245,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.invalidateProperty(java.lang.String)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.maybeStoreCandidateValue(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 252,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 254,col 7)-(line 254,col 40)",
        "(line 255,col 7)-(line 261,col 7)",
        "(line 262,col 7)-(line 262,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.inContructor(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 266,col 7)-(line 266,col 35)",
        "(line 267,col 7)-(line 267,col 55)",
        "(line 268,col 7)-(line 268,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReplaceCandidates",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 272,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.ReplaceCandidates.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 273,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 275,col 7)-(line 289,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.ReplaceCandidates.isMatchingType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 292,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 293,col 7)-(line 293,col 47)",
        "(line 294,col 7)-(line 294,col 64)",
        "(line 295,col 7)-(line 298,col 7)",
        "(line 299,col 7)-(line 299,col 19)"
      ]
    }
  ]
}