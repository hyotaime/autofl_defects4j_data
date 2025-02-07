{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsSmartNulls",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 74,
      "comment": "\n * Optional Answer that can be used with\n * {@link Mockito#mock(Class, Answer)}\n * \u003cp\u003e\n * This implementation can be helpful when working with legacy code. Unstubbed\n * methods often return null. If your code uses the object returned by an\n * unstubbed call you get a NullPointerException. This implementation of\n * Answer returns SmartNulls instead of nulls.\n * SmartNull gives nicer exception message than NPE because it points out the\n * line where unstubbed method was called. You just click on the stack trace.\n * \u003cp\u003e\n * ReturnsSmartNulls first tries to return ordinary return values (see\n * {@link ReturnsMoreEmptyValues}) then it tries to return SmartNull. If the\n * return type is not mockable (e.g. final) then ordinary null is returned.\n * \u003cp\u003e\n * ReturnsSmartNulls will be probably the default return values strategy in\n * Mockito 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 42,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 64)",
        "(line 44,col 9)-(line 46,col 9)",
        "(line 47,col 9)-(line 47,col 63)",
        "(line 48,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ThrowsSmartNullPointer",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer"
      ],
      "begin_line": 55,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unstubbedInvocation"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.ThrowsSmartNullPointer.ThrowsSmartNullPointer(org.mockito.invocation.InvocationOnMock, org.mockito.invocation.Location)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 59)",
        "(line 61,col 13)-(line 61,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.ThrowsSmartNullPointer.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 64,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 65,col 13)-(line 68,col 13)",
        "(line 70,col 13)-(line 70,col 95)",
        "(line 71,col 13)-(line 71,col 24)"
      ]
    }
  ]
}