{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SourceInformationAnnotator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceInformationAnnotator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 42,
      "end_line": 96,
      "comment": "\n * Annotates nodes with information from their original input file\n * before the compiler performs work that changes this information (such\n * as its original location, its original name, etc).\n *\n * Information saved:\n *\n * - Annotates all NAME nodes with an ORIGINALNAME_PROP indicating its original\n *   name.\n *\n * - Annotates all string GET_PROP nodes with an ORIGINALNAME_PROP.\n *\n * - Annotates all OBJECT_LITERAL unquoted string key nodes with an\n *   ORIGINALNAME_PROP.\n *\n * - Annotates all FUNCTION nodes with an ORIGINALNAME_PROP indicating its\n *   nearest original name.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "sourceFile"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doSanityChecks"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SourceInformationAnnotator.SourceInformationAnnotator(java.lang.String, boolean)",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 33)",
        "(line 50,col 5)-(line 50,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceInformationAnnotator.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 53,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 59,col 5)",
        "(line 62,col 5)-(line 88,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceInformationAnnotator.setOriginalName(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 94,col 5)"
      ]
    }
  ]
}