{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckSideEffects.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckSideEffects",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 39,
      "end_line": 195,
      "comment": "\n * Checks for non side effecting statements such as\n * \u003cpre\u003e\n * var s \u003d \"this string is \"\n *         \"continued on the next line but you forgot the +\";\n * x \u003d\u003d foo();  // should that be \u0027\u003d\u0027?\n * foo();;  // probably just a stray-semicolon. Doesn\u0027t hurt to check though\n * \u003c/p\u003e\n * and generates warnings.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "USELESS_CODE_ERROR"
      ],
      "begin_line": 42,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PROTECTOR_FN"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "problemNodes"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
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
      "type": "field",
      "varNames": [
        "protectSideEffectFreeCode"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.CheckSideEffects(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel, boolean)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 29)",
        "(line 59,col 5)-(line 59,col 23)",
        "(line 60,col 5)-(line 60,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 63,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 49)",
        "(line 72,col 5)-(line 74,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 82,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 91,col 5)",
        "(line 93,col 5)-(line 95,col 5)",
        "(line 100,col 5)-(line 102,col 5)",
        "(line 106,col 5)-(line 108,col 5)",
        "(line 110,col 5)-(line 110,col 62)",
        "(line 111,col 5)-(line 111,col 54)",
        "(line 112,col 5)-(line 129,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.protectSideEffects()",
      "begin_line": 137,
      "end_line": 150,
      "comment": "\n   * Protect side-effect free nodes by making them parameters\n   * to a extern function call.  This call will be removed\n   * after all the optimizations passes have run.\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 149,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.addExtern()",
      "begin_line": 152,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 38)",
        "(line 154,col 5)-(line 154,col 53)",
        "(line 155,col 5)-(line 155,col 28)",
        "(line 157,col 5)-(line 157,col 59)",
        "(line 158,col 5)-(line 158,col 28)",
        "(line 159,col 5)-(line 159,col 41)",
        "(line 160,col 5)-(line 160,col 64)",
        "(line 161,col 5)-(line 161,col 54)",
        "(line 162,col 5)-(line 162,col 32)"
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
      "begin_line": 168,
      "end_line": 194,
      "comment": "\n   * Remove side-effect sync functions.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.StripProtection.StripProtection(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 7)-(line 173,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.StripProtection.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 7)-(line 178,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSideEffects.StripProtection.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 181,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 183,col 7)-(line 192,col 7)"
      ]
    }
  ]
}