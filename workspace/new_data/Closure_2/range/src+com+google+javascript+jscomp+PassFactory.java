{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PassFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PassFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 73,
      "comment": "\n * A factory for creating JSCompiler passes based on the Options\n * injected.  Contains all meta-data about compiler passes (like\n * whether it can be run multiple times, a human-readable name for\n * logging, etc.).\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isOneTimePass"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PassFactory.PassFactory(java.lang.String, boolean)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n   * @param name The name of the pass that this factory creates.\n   * @param isOneTimePass If true, the pass produced by this factory can\n   *     only be run once.\n   ",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 21)",
        "(line 39,col 5)-(line 39,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassFactory.getName()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n   * @return The name of this pass.\n   ",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassFactory.isOneTimePass()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n   * @return Whether the pass produced by this factory can only be run once.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassFactory.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n   * Creates a new compiler pass to be run.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassFactory.getHotSwapPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n   * Any factory whose CompilerPass has a corresponding hot-swap version should\n   * override this.\n   *\n   * @param compiler The compiler that can has been used to do the full compile.\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 16)"
      ]
    }
  ]
}