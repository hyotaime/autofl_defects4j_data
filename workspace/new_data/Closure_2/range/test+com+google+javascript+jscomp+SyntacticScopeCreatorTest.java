{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/SyntacticScopeCreatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SyntacticScopeCreatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 142,
      "comment": "\n * Tests for {@link SyntacticScopeCreator}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.getScope(java.lang.String)",
      "begin_line": 33,
      "end_line": 40,
      "comment": "\n   * Helper to create a top-level scope from a JavaScript string\n   ",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 39)",
        "(line 35,col 5)-(line 35,col 43)",
        "(line 36,col 5)-(line 36,col 46)",
        "(line 37,col 5)-(line 38,col 68)",
        "(line 39,col 5)-(line 39,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.testScopes(java.lang.String, int)",
      "begin_line": 45,
      "end_line": 57,
      "comment": "\n   * Helper to traverse the tree creating the Scope object everywhere.\n   ",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 39)",
        "(line 47,col 5)-(line 47,col 43)",
        "(line 48,col 5)-(line 55,col 11)",
        "(line 56,col 5)-(line 56,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.Anonymous-14b160f9-453b-42e7-ada6-7d69184d8ac5.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.testFunctionScope()",
      "begin_line": 59,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 64,col 29)",
        "(line 65,col 5)-(line 65,col 47)",
        "(line 66,col 5)-(line 66,col 45)",
        "(line 67,col 5)-(line 67,col 45)",
        "(line 70,col 5)-(line 70,col 47)",
        "(line 71,col 5)-(line 71,col 48)",
        "(line 72,col 5)-(line 72,col 49)",
        "(line 73,col 5)-(line 73,col 46)",
        "(line 74,col 5)-(line 74,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.testScopeRootNode()",
      "begin_line": 77,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 80,col 12)",
        "(line 81,col 5)-(line 81,col 39)",
        "(line 82,col 5)-(line 82,col 43)",
        "(line 83,col 5)-(line 83,col 46)",
        "(line 85,col 5)-(line 86,col 68)",
        "(line 87,col 5)-(line 87,col 50)",
        "(line 89,col 5)-(line 89,col 40)",
        "(line 90,col 5)-(line 90,col 52)",
        "(line 91,col 5)-(line 92,col 71)",
        "(line 93,col 5)-(line 93,col 50)",
        "(line 94,col 5)-(line 94,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.testRedeclaration1()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 98,col 6)-(line 98,col 33)",
        "(line 99,col 6)-(line 99,col 46)",
        "(line 100,col 6)-(line 100,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.testRedeclaration2()",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 61)",
        "(line 105,col 5)-(line 105,col 45)",
        "(line 106,col 5)-(line 106,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.testRedeclaration3()",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 63)",
        "(line 111,col 5)-(line 111,col 45)",
        "(line 112,col 5)-(line 112,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.testFunctionScopeArguments()",
      "begin_line": 116,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 50)",
        "(line 120,col 5)-(line 120,col 53)",
        "(line 121,col 5)-(line 121,col 53)",
        "(line 122,col 5)-(line 122,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreatorTest.createGlobalScopeHelper(java.lang.String)",
      "begin_line": 129,
      "end_line": 141,
      "comment": "\n   * Parse the supplied JS and create the global SyntaticScope object.\n   * @return The error count.\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 39)",
        "(line 131,col 5)-(line 131,col 52)",
        "(line 132,col 5)-(line 132,col 32)",
        "(line 133,col 5)-(line 133,col 34)",
        "(line 135,col 5)-(line 135,col 43)",
        "(line 136,col 5)-(line 136,col 46)",
        "(line 137,col 5)-(line 138,col 66)",
        "(line 139,col 5)-(line 139,col 50)",
        "(line 140,col 5)-(line 140,col 36)"
      ]
    }
  ]
}