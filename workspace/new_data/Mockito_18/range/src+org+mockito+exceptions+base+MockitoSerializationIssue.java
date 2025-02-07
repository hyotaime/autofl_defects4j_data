{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/exceptions/base/MockitoSerializationIssue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoSerializationIssue",
      "is_interface": false,
      "parent_types": [
        "java.io.ObjectStreamException"
      ],
      "begin_line": 23,
      "end_line": 49,
      "comment": "\n * Raised by mockito to emit an error either due to Mockito, or due to the User.\n *\n * \u003cp\u003e\n *     The stack trace is filtered from mockito calls if you are using {@link #getStackTrace()}.\n *     For debugging purpose though you can still access the full stacktrace using {@link #getUnfilteredStackTrace()}.\n *     However note that other calls related to the stackTrace will refer to the filter stacktrace.\n * \u003c/p\u003e\n *\n * @since 1.10.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "unfilteredStackTrace"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.exceptions.base.MockitoSerializationIssue.MockitoSerializationIssue(java.lang.String, java.lang.Exception)",
      "begin_line": 27,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 23)",
        "(line 29,col 9)-(line 29,col 25)",
        "(line 30,col 9)-(line 30,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.base.MockitoSerializationIssue.getStackTrace()",
      "begin_line": 33,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 27)",
        "(line 36,col 9)-(line 36,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.base.MockitoSerializationIssue.filterStackTrace()",
      "begin_line": 39,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 53)",
        "(line 42,col 9)-(line 42,col 79)",
        "(line 43,col 9)-(line 43,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.base.MockitoSerializationIssue.getUnfilteredStackTrace()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 36)"
      ]
    }
  ]
}