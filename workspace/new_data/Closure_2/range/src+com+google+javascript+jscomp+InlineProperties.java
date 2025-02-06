{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/InlineProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 50,
      "end_line": 303,
      "comment": "\n * InlineProperties attempts to find references to properties that are known to\n * be constants and inline the known value.\n *\n * This pass relies on type information to find these property references and\n * properties are assumed to be constant if either:\n *   - the property is assigned unconditionally in the instance constructor\n *   - the property is assigned unconditionally to the type\u0027s prototype\n *\n * The current implementation only inlines immutable values (as defined by\n * NodeUtil.isImmutableValue).\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PropertyInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineProperties.PropertyInfo.PropertyInfo(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 56,col 7)-(line 56,col 23)",
        "(line 57,col 7)-(line 57,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALIDATED"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "props"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidatingTypes"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineProperties.InlineProperties(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 29)",
        "(line 72,col 5)-(line 72,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.buildInvalidatingTypeSet()",
      "begin_line": 78,
      "end_line": 100,
      "comment": " we should move it to a common location.",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 57)",
        "(line 80,col 5)-(line 94,col 59)",
        "(line 96,col 5)-(line 99,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 105,
      "end_line": 118,
      "comment": "\n   * Invalidates the given type, so that no properties on it will be renamed.\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 47)",
        "(line 107,col 5)-(line 111,col 5)",
        "(line 113,col 5)-(line 113,col 32)",
        "(line 114,col 5)-(line 114,col 47)",
        "(line 115,col 5)-(line 117,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.isInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 121,
      "end_line": 141,
      "comment": " Returns true if properties on this type should not be renamed. ",
      "child_ranges": [
        "(line 122,col 5)-(line 132,col 5)",
        "(line 133,col 5)-(line 133,col 47)",
        "(line 134,col 5)-(line 140,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 147,
      "end_line": 155,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 34)",
        "(line 149,col 5)-(line 154,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 160,col 57)",
        "(line 161,col 5)-(line 162,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherCandidates",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 165,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 167,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 169,col 7)-(line 169,col 42)",
        "(line 170,col 7)-(line 170,col 29)",
        "(line 171,col 7)-(line 199,col 7)",
        "(line 201,col 7)-(line 204,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.maybeCandidateDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 210,
      "end_line": 238,
      "comment": "\n     * @return Whether this is a valid definition for a candidate property.\n     ",
      "child_ranges": [
        "(line 212,col 7)-(line 212,col 67)",
        "(line 213,col 7)-(line 213,col 34)",
        "(line 214,col 7)-(line 214,col 35)",
        "(line 215,col 7)-(line 215,col 53)",
        "(line 217,col 7)-(line 217,col 41)",
        "(line 218,col 7)-(line 236,col 7)",
        "(line 237,col 7)-(line 237,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.maybeGetInstanceTypeFromPrototypeRef(com.google.javascript.rhino.Node)",
      "begin_line": 240,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 241,col 7)-(line 241,col 56)",
        "(line 242,col 7)-(line 245,col 7)",
        "(line 246,col 7)-(line 246,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.invalidateProperty(java.lang.String)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 7)-(line 250,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.maybeStoreCandidateValue(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 253,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 255,col 7)-(line 255,col 40)",
        "(line 256,col 7)-(line 262,col 7)",
        "(line 263,col 7)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.GatherCandidates.inContructor(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 267,col 7)-(line 267,col 35)",
        "(line 268,col 7)-(line 268,col 55)",
        "(line 269,col 7)-(line 269,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReplaceCandidates",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 273,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.ReplaceCandidates.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 274,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 276,col 7)-(line 290,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineProperties.ReplaceCandidates.isMatchingType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 293,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 294,col 47)",
        "(line 295,col 7)-(line 295,col 64)",
        "(line 296,col 7)-(line 299,col 7)",
        "(line 300,col 7)-(line 300,col 19)"
      ]
    }
  ]
}