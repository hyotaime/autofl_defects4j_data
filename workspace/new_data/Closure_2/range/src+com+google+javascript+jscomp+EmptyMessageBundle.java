{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/EmptyMessageBundle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmptyMessageBundle",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MessageBundle"
      ],
      "begin_line": 27,
      "end_line": 52,
      "comment": "\n * An implementation of MessageBundle that has no translations.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.EmptyMessageBundle.idGenerator()",
      "begin_line": 32,
      "end_line": 35,
      "comment": "\n   * Gets a dummy message ID generator.\n   ",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.EmptyMessageBundle.getMessage(java.lang.String)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n   * Returns null, to indicate it has no message replacements.\n   ",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.EmptyMessageBundle.getAllMessages()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n   * Returns an empty list of messages.\n   ",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 30)"
      ]
    }
  ]
}