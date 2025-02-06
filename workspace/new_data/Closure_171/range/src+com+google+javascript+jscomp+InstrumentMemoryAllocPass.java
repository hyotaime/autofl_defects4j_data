{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/InstrumentMemoryAllocPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstrumentMemoryAllocPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 37,
      "end_line": 151,
      "comment": "\n * This code implements the instrumentation pass over the AST\n * to instrument all object allocations. This methodology should help \n * identify allocation hotspots and potential for object reuse, with\n * the goal to reduce memory footprint and GC pressure.\n *\n * We are tracking object allocations via new(), array literals, object\n * literals, and function expressions. This does not cover factory methods\n * like Object.create or document.createElement but could be expanded to\n * track those.\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newSiteId"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " 0 is reserved for \u0027total\u0027"
    },
    {
      "type": "field",
      "varNames": [
        "JS_INSTRUMENT_ALLOCATION_CODE"
      ],
      "begin_line": 43,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPass.InstrumentMemoryAllocPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n   * @param compiler the compiler which generates the AST.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPass.getInstrumentAllocationCode()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n   * Creates the library code for this instrumentation - a compiled\n   * version of above __alloc implementation.\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 92,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 105,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPass.getTypeString(com.google.javascript.rhino.Node)",
      "begin_line": 108,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 113,col 5)",
        "(line 115,col 5)-(line 119,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Traversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 132,
      "end_line": 150,
      "comment": "\n   * Find instances of:\n   *  - calls to new\n   *  - object literals\n   *  - array literals\n   *  - a function (expression)\n   *\n   * All of these are known to result in memory allocations.\n   * \"Intercept\" these with a call to our own __alloc for book keeping.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPass.Traversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 133,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 135,col 7)-(line 148,col 7)"
      ]
    }
  ]
}