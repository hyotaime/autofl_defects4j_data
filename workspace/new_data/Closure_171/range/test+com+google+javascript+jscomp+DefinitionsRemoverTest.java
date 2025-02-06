{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/DefinitionsRemoverTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefinitionsRemoverTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 32,
      "end_line": 92,
      "comment": "\n * Test for {@link DefinitionsRemover}. Basically test for the simple removal\n * cases. More complicated cases will be tested by the clients of\n * {@link DefinitionsRemover}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemoverTest.testRemoveFunction()",
      "begin_line": 33,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 39)",
        "(line 35,col 5)-(line 35,col 40)",
        "(line 36,col 5)-(line 36,col 57)",
        "(line 37,col 5)-(line 37,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemoverTest.testRemoveAssignment()",
      "begin_line": 40,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 24)",
        "(line 42,col 5)-(line 42,col 27)",
        "(line 43,col 5)-(line 43,col 35)",
        "(line 44,col 5)-(line 44,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemoverTest.testRemoveVarAssignment()",
      "begin_line": 47,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 28)",
        "(line 49,col 5)-(line 49,col 31)",
        "(line 50,col 5)-(line 50,col 41)",
        "(line 51,col 5)-(line 51,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemoverTest.testRemoveLiteral()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 43)",
        "(line 56,col 5)-(line 56,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemoverTest.testRemoveFunctionExpressionName()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemoverTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 63,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 76,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemoverTest.Anonymous-3dfc3fc0-bf04-4a2f-9dec-2134e520f638.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 67,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 58)",
        "(line 70,col 9)-(line 70,col 56)",
        "(line 71,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefinitionsGatherer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 82,
      "end_line": 91,
      "comment": "\n   * Gather all possible definition objects.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "definitions"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemoverTest.DefinitionsGatherer.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 7)-(line 86,col 66)",
        "(line 87,col 7)-(line 89,col 7)"
      ]
    }
  ]
}