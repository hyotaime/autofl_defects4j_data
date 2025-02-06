{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ReplaceMessagesForChrome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceMessagesForChrome",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JsMessageVisitor"
      ],
      "begin_line": 37,
      "end_line": 113,
      "comment": "\n * Replaces user-visible messages with appropriate calls to\n * chrome.i18n.getMessage. The first argument to getMessage is the id of the\n * message, as a string. If the message contains placeholders, the second\n * argument is an array of the values being used for the placeholders, in the\n * order they appear in the source code.\n *\n * @author tbreisacher@google.com (Tyler Breisacher)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceMessagesForChrome.ReplaceMessagesForChrome(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.JsMessage.IdGenerator, boolean, com.google.javascript.jscomp.JsMessage.Style)",
      "begin_line": 39,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessagesForChrome.getChromeI18nGetMessageNode(java.lang.String)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 71)",
        "(line 48,col 5)-(line 48,col 71)",
        "(line 49,col 5)-(line 49,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessagesForChrome.processJsMessage(com.google.javascript.jscomp.JsMessage, com.google.javascript.jscomp.JsMessageDefinition)",
      "begin_line": 52,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 65,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessagesForChrome.getNewValueNode(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JsMessage)",
      "begin_line": 68,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 69)",
        "(line 72,col 5)-(line 98,col 5)",
        "(line 100,col 5)-(line 100,col 54)",
        "(line 101,col 5)-(line 101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessagesForChrome.getPlaceholderValue(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 104,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 110,col 5)",
        "(line 111,col 5)-(line 111,col 16)"
      ]
    }
  ]
}