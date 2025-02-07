{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/exceptions/base/MockitoException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 21,
      "end_line": 48,
      "comment": "\n * Raised by mockito to emit an error either due to Mockito, or due to the User.\n *\n * \u003cp\u003e\n *     The stack trace is filtered from mockito calls if you are using {@link #getStackTrace()}.\n *     For debugging purpose though you can still access the full stacktrace using {@link #getUnfilteredStackTrace()}.\n *     However note that other calls related to the stackTrace will refer to the filter stacktrace.\n * \u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
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
      "signature": "org.mockito.exceptions.base.MockitoException.MockitoException(java.lang.String, java.lang.Throwable)",
      "begin_line": 28,
      "end_line": 31,
      "comment": " TODO lazy filtered stacktrace initialization",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 26)",
        "(line 30,col 9)-(line 30,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.exceptions.base.MockitoException.MockitoException(java.lang.String)",
      "begin_line": 33,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 23)",
        "(line 35,col 9)-(line 35,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.base.MockitoException.filterStackTrace()",
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 47)",
        "(line 41,col 9)-(line 41,col 79)",
        "(line 42,col 9)-(line 42,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.base.MockitoException.getUnfilteredStackTrace()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 36)"
      ]
    }
  ]
}