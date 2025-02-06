{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/NodeTraversalTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeTraversalTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 237,
      "comment": "\n * Tests for {@link NodeTraversal}.\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.testPruningCallbackShouldTraverse1()",
      "begin_line": 34,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 36,col 74)",
        "(line 38,col 5)-(line 38,col 41)",
        "(line 39,col 5)-(line 39,col 59)",
        "(line 40,col 5)-(line 40,col 72)",
        "(line 41,col 5)-(line 41,col 74)",
        "(line 42,col 5)-(line 42,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.testPruningCallbackShouldTraverse2()",
      "begin_line": 45,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 47,col 75)",
        "(line 49,col 5)-(line 49,col 41)",
        "(line 50,col 5)-(line 50,col 60)",
        "(line 51,col 5)-(line 51,col 73)",
        "(line 52,col 5)-(line 52,col 73)",
        "(line 53,col 5)-(line 53,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PruningCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback"
      ],
      "begin_line": 60,
      "end_line": 69,
      "comment": "\n   * Concrete implementation of AbstractPrunedCallback to test the\n   * AbstractNodeTypePruningCallback shouldTraverse method.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.PruningCallback.PruningCallback(java.util.Set\u003cjava.lang.Integer\u003e, boolean)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 7)-(line 62,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.PruningCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 7)-(line 67,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.testReport()",
      "begin_line": 71,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 58)",
        "(line 74,col 5)-(line 85,col 7)",
        "(line 86,col 5)-(line 86,col 44)",
        "(line 88,col 5)-(line 88,col 56)",
        "(line 89,col 5)-(line 89,col 72)",
        "(line 91,col 5)-(line 91,col 46)",
        "(line 92,col 5)-(line 92,col 35)",
        "(line 93,col 5)-(line 93,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.Anonymous-9e2bb240-3316-46bb-891b-171cd4172ceb.report(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.Anonymous-40e53b3b-c13e-4564-afa5-f2512edb800b.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 80,
      "end_line": 81,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.Anonymous-dcd5c21b-7967-4eea-9f32-4cede5f7d059.printSummary()",
      "begin_line": 83,
      "end_line": 84,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.testUnexpectedException()",
      "begin_line": 96,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 44)",
        "(line 99,col 5)-(line 104,col 6)",
        "(line 106,col 5)-(line 106,col 39)",
        "(line 107,col 5)-(line 107,col 54)",
        "(line 108,col 5)-(line 108,col 38)",
        "(line 109,col 5)-(line 109,col 38)",
        "(line 111,col 5)-(line 119,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.Anonymous-f4d013be-8bde-4535-86d8-962b6d5c59d9.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.testGetScopeRoot()",
      "begin_line": 123,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 39)",
        "(line 125,col 5)-(line 148,col 6)",
        "(line 150,col 5)-(line 154,col 16)",
        "(line 155,col 5)-(line 155,col 38)",
        "(line 156,col 5)-(line 156,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.Anonymous-fb24d9ba-caee-4a21-bcfc-30679bc24904.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 128,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 42)",
        "(line 131,col 13)-(line 131,col 52)",
        "(line 132,col 13)-(line 132,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.Anonymous-7081f469-16ed-43d7-ab9f-bc32a98f2683.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.Anonymous-a51fbf45-4ee5-4d1e-965e-20258c8ae271.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.Anonymous-d81e5ffd-cdad-42aa-af92-8a4c3820eb38.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.testGetCurrentNode()",
      "begin_line": 159,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 39)",
        "(line 161,col 5)-(line 161,col 63)",
        "(line 162,col 5)-(line 162,col 67)",
        "(line 163,col 5)-(line 163,col 69)",
        "(line 165,col 5)-(line 169,col 16)",
        "(line 171,col 5)-(line 171,col 38)",
        "(line 172,col 5)-(line 172,col 53)",
        "(line 176,col 5)-(line 176,col 48)",
        "(line 177,col 5)-(line 177,col 56)",
        "(line 178,col 5)-(line 178,col 29)",
        "(line 181,col 5)-(line 181,col 64)",
        "(line 182,col 5)-(line 182,col 37)",
        "(line 183,col 5)-(line 183,col 29)",
        "(line 186,col 5)-(line 186,col 45)",
        "(line 187,col 5)-(line 187,col 54)",
        "(line 188,col 5)-(line 188,col 28)",
        "(line 189,col 5)-(line 189,col 31)",
        "(line 190,col 5)-(line 190,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpectNodeOnEnterScope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 195,
      "end_line": 230,
      "comment": " Helper class used to test getCurrentNode"
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopeRoot"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entered"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.ExpectNodeOnEnterScope.expect(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 202,col 7)-(line 202,col 23)",
        "(line 203,col 7)-(line 203,col 33)",
        "(line 204,col 7)-(line 204,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.ExpectNodeOnEnterScope.assertEntered()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 7)-(line 208,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.ExpectNodeOnEnterScope.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 211,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 213,col 7)-(line 213,col 45)",
        "(line 214,col 7)-(line 214,col 48)",
        "(line 215,col 7)-(line 215,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.ExpectNodeOnEnterScope.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.ExpectNodeOnEnterScope.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 7)-(line 224,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.ExpectNodeOnEnterScope.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversalTest.parse(com.google.javascript.jscomp.Compiler, java.lang.String)",
      "begin_line": 232,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 40)",
        "(line 234,col 5)-(line 234,col 46)",
        "(line 235,col 5)-(line 235,col 13)"
      ]
    }
  ]
}