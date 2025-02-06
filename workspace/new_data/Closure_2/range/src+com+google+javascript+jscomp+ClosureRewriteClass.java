{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ClosureRewriteClass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureRewriteClass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 34,
      "end_line": 403,
      "comment": "\n * Rewrites \"goog.defineClass\" into a form that is suitable for\n * type checking and dead code elimination.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_CLASS_TARGET_INVALID"
      ],
      "begin_line": 38,
      "end_line": 40,
      "comment": " Errors"
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_CLASS_SUPER_CLASS_NOT_VALID"
      ],
      "begin_line": 42,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_CLASS_DESCRIPTOR_NOT_VALID"
      ],
      "begin_line": 46,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_CLASS_CONSTRUCTOR_MISING"
      ],
      "begin_line": 50,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_CLASS_STATICS_NOT_VALID"
      ],
      "begin_line": 54,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_CLASS_UNEXPECTED_PARAMS"
      ],
      "begin_line": 58,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.ClosureRewriteClass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 79,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 85,col 5)",
        "(line 86,col 5)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.validateUsage(com.google.javascript.rhino.Node)",
      "begin_line": 89,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 32)",
        "(line 95,col 5)-(line 102,col 5)",
        "(line 103,col 5)-(line 103,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.isContainedInGoogDefineClass(com.google.javascript.rhino.Node)",
      "begin_line": 106,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 116,col 5)",
        "(line 117,col 5)-(line 117,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.maybeRewriteClassDefinition(com.google.javascript.rhino.Node)",
      "begin_line": 120,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 130,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.maybeRewriteClassDefinition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 133,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 145,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MemberDefinition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 148,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "info"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition.MemberDefinition(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 23)",
        "(line 155,col 7)-(line 155,col 23)",
        "(line 156,col 7)-(line 156,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassDefinition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 160,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "superClass"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructor"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticProps"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "props"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classModifier"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.ClassDefinition.ClassDefinition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition, java.util.List\u003ccom.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition\u003e, java.util.List\u003ccom.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 168,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 175,col 7)-(line 175,col 23)",
        "(line 176,col 7)-(line 176,col 35)",
        "(line 177,col 7)-(line 177,col 37)",
        "(line 178,col 7)-(line 178,col 37)",
        "(line 179,col 7)-(line 179,col 25)",
        "(line 180,col 7)-(line 180,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.extractClassDefinition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 188,
      "end_line": 259,
      "comment": "\n   * Validates the class definition and if valid, destructively extracts\n   * the class definition from the AST.\n   ",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 68)",
        "(line 193,col 5)-(line 197,col 5)",
        "(line 198,col 5)-(line 200,col 5)",
        "(line 202,col 5)-(line 202,col 69)",
        "(line 203,col 5)-(line 209,col 5)",
        "(line 211,col 5)-(line 211,col 49)",
        "(line 212,col 5)-(line 215,col 5)",
        "(line 217,col 5)-(line 217,col 67)",
        "(line 218,col 5)-(line 222,col 5)",
        "(line 223,col 5)-(line 223,col 60)",
        "(line 225,col 5)-(line 225,col 30)",
        "(line 226,col 5)-(line 226,col 24)",
        "(line 227,col 5)-(line 227,col 63)",
        "(line 228,col 5)-(line 238,col 5)",
        "(line 240,col 5)-(line 242,col 5)",
        "(line 246,col 5)-(line 246,col 41)",
        "(line 247,col 5)-(line 247,col 37)",
        "(line 248,col 5)-(line 250,col 5)",
        "(line 251,col 5)-(line 257,col 36)",
        "(line 258,col 5)-(line 258,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.maybeDetach(com.google.javascript.rhino.Node)",
      "begin_line": 261,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 264,col 5)",
        "(line 265,col 5)-(line 265,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.validateObjLit(com.google.javascript.rhino.Node)",
      "begin_line": 269,
      "end_line": 276,
      "comment": " Only unquoted plain properties are currently supported.",
      "child_ranges": [
        "(line 270,col 5)-(line 274,col 5)",
        "(line 275,col 5)-(line 275,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.extractProperty(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 281,
      "end_line": 288,
      "comment": "\n   * @return The first property in the objlit that matches the key.\n   ",
      "child_ranges": [
        "(line 282,col 5)-(line 286,col 5)",
        "(line 287,col 5)-(line 287,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.objectLitToList(com.google.javascript.rhino.Node)",
      "begin_line": 290,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 292,col 5)-(line 292,col 57)",
        "(line 293,col 5)-(line 299,col 5)",
        "(line 300,col 5)-(line 300,col 28)",
        "(line 301,col 5)-(line 301,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.rewriteGoogDefineClass(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ClosureRewriteClass.ClassDefinition)",
      "begin_line": 304,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 28)",
        "(line 309,col 5)-(line 323,col 5)",
        "(line 325,col 5)-(line 335,col 5)",
        "(line 337,col 5)-(line 348,col 5)",
        "(line 350,col 5)-(line 363,col 5)",
        "(line 365,col 5)-(line 375,col 5)",
        "(line 377,col 5)-(line 377,col 55)",
        "(line 378,col 5)-(line 378,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.fixupSrcref(com.google.javascript.rhino.Node)",
      "begin_line": 381,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 382,col 38)",
        "(line 383,col 5)-(line 383,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.fixupFreeCall(com.google.javascript.rhino.Node)",
      "begin_line": 386,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 44)",
        "(line 388,col 5)-(line 388,col 46)",
        "(line 389,col 5)-(line 389,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureRewriteClass.isGoogDefineClass(com.google.javascript.rhino.Node)",
      "begin_line": 395,
      "end_line": 402,
      "comment": "\n   * @return Whether the call represents a class definition.\n   ",
      "child_ranges": [
        "(line 396,col 5)-(line 400,col 5)",
        "(line 401,col 5)-(line 401,col 17)"
      ]
    }
  ]
}