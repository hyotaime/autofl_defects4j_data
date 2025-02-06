{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/MethodCompilerPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodCompilerPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 36,
      "end_line": 260,
      "comment": "\n * Finds all method declarations and pulls them into data structures\n * for use during cleanups such as arity checks or inlining.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "externMethods"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " List of methods defined in externs "
    },
    {
      "type": "field",
      "varNames": [
        "externMethodsWithoutSignatures"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " List of extern methods without signatures that we can\u0027t warn about "
    },
    {
      "type": "field",
      "varNames": [
        "nonMethodProperties"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " List of property names that may not be methods "
    },
    {
      "type": "field",
      "varNames": [
        "methodDefinitions"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": " are found which causes problems in the source maps."
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
      "name": "SignatureStore",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 62,
      "comment": "\n   * The signature storage is provided by the implementing class.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.SignatureStore.reset()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.SignatureStore.addSignature(java.lang.String, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 59,
      "end_line": 60,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.SignatureStore.removeSignature(java.lang.String)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.MethodCompilerPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 26)",
        "(line 71,col 5)-(line 71,col 43)",
        "(line 72,col 5)-(line 72,col 32)",
        "(line 73,col 5)-(line 73,col 30)",
        "(line 75,col 5)-(line 77,col 5)",
        "(line 80,col 5)-(line 80,col 64)",
        "(line 81,col 5)-(line 82,col 77)",
        "(line 83,col 5)-(line 84,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.getActingCallback()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n   * Subclasses should return a callback that does the actual work they\n   * want to perform given the computed list of method signatures\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.getSignatureStore()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n   * Subclasses should return a SignatureStore for storing discovered\n   * signatures.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n   * Adds a node that may represent a function signature (if it\u0027s a function\n   * itself or the name of a function).\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 109,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.addSignature(java.lang.String, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 112,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 115,col 5)",
        "(line 117,col 5)-(line 117,col 67)",
        "(line 118,col 5)-(line 118,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GetExternMethods",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 126,
      "end_line": 175,
      "comment": "\n   * Gathers methods from the externs file. Methods that are listed there but\n   * do not have a signature are flagged to be ignored when doing arity checks.\n   * Methods that do include signatures will be checked.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.GetExternMethods.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 173,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherSignatures",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 180,
      "end_line": 259,
      "comment": "\n   * Gather signatures from the source to be compiled.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.GatherSignatures.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 182,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 184,col 7)-(line 225,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MethodCompilerPass.GatherSignatures.processPrototypeParent(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 233,
      "end_line": 258,
      "comment": "\n     * Processes the parent of a GETPROP prototype, which can either be\n     * another GETPROP (in the case of Foo.prototype.bar), or can be\n     * an assignment (in the case of Foo.prototype \u003d ...).\n     ",
      "child_ranges": [
        "(line 234,col 7)-(line 257,col 7)"
      ]
    }
  ]
}