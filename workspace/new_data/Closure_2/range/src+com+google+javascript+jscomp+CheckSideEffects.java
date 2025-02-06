{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckSideEffects.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckSideEffects",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 40,
      "end_line": 196,
      "comment": "\n * Checks for non side effecting statements such as\n * \u003cpre\u003e\n * var s \u003d \"this string is \"\n *         \"continued on the next line but you forgot the +\";\n * x \u003d\u003d foo();  // should that be \u0027\u003d\u0027?\n * foo();;  // probably just a stray-semicolon. Doesn\u0027t hurt to check though\n * \u003c/p\u003e\n * and generates warnings.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "USELESS_CODE_ERROR"
      ],
      "begin_line": 43,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PROTECTOR_FN"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "problemNodes"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "protectSideEffectFreeCode"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.CheckSideEffects(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel, boolean)",
      "begin_line": 57,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 29)",
        "(line 60,col 5)-(line 60,col 23)",
        "(line 61,col 5)-(line 61,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 49)",
        "(line 73,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 83,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 92,col 5)",
        "(line 94,col 5)-(line 96,col 5)",
        "(line 101,col 5)-(line 103,col 5)",
        "(line 107,col 5)-(line 109,col 5)",
        "(line 111,col 5)-(line 111,col 62)",
        "(line 112,col 5)-(line 112,col 54)",
        "(line 113,col 5)-(line 130,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.protectSideEffects()",
      "begin_line": 138,
      "end_line": 151,
      "comment": "\n   * Protect side-effect free nodes by making them parameters\n   * to a extern function call.  This call will be removed\n   * after all the optimizations passes have run.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 150,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.addExtern()",
      "begin_line": 153,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 38)",
        "(line 155,col 5)-(line 155,col 53)",
        "(line 156,col 5)-(line 156,col 28)",
        "(line 158,col 5)-(line 158,col 59)",
        "(line 159,col 5)-(line 159,col 28)",
        "(line 160,col 5)-(line 160,col 41)",
        "(line 161,col 5)-(line 161,col 64)",
        "(line 162,col 5)-(line 162,col 54)",
        "(line 163,col 5)-(line 163,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StripProtection",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 169,
      "end_line": 195,
      "comment": "\n   * Remove side-effect sync functions.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.StripProtection.StripProtection(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 7)-(line 174,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.StripProtection.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 7)-(line 179,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.StripProtection.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 182,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 184,col 7)-(line 193,col 7)"
      ]
    }
  ]
}