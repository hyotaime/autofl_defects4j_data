{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/JsMessageDefinition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsMessageDefinition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 77,
      "comment": "\n * Container class that holds information about JS message source.\n *\n * This class is specific to our JsMessage syntax. Allows you to use the\n * new-style or the old-style messages.\n *\n * Old-style:\n * \u003ccode\u003e\n * var MSG_LEOPARD \u003d \u0027Leopard\u0027;\n * var MSG_LEOPARD_HELP \u003d \u0027The Leopard operating system\u0027;\n * \u003c/code\u003e\n *\n * New-style:\n * \u003ccode\u003e\n * /** @desc The leopard operating system * /\n * var MSG_LEOPARD \u003d goog.getMsg(\u0027Leopard\u0027);\n * \u003c/code\u003e\n *\n * @author anatol@google.com (Anatol Pomazau)\n "
    },
    {
      "type": "field",
      "varNames": [
        "messageNode"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "messageParentNode"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "visitingNode"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageDefinition.JsMessageDefinition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 58,
      "end_line": 64,
      "comment": "\n   * Constructs JS message definition.\n   *\n   * @param visitingNode Node that is visited by\n   *     {@link JsMessageVisitor}. Take into\n   *     account that visiting node could differ from the node the message\n   *     was found.\n   * @param messageNode A node that contains the message. It could be node with\n   *     goog.getMsg() call or string/function for old-style messages.\n   * @param messageParentNode The parent of the message node.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 35)",
        "(line 62,col 5)-(line 62,col 37)",
        "(line 63,col 5)-(line 63,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageDefinition.getMessageNode()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageDefinition.getVisitingNode()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageDefinition.getMessageParentNode()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 29)"
      ]
    }
  ]
}