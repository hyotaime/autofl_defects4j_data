{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsSmartNulls",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 37,
      "end_line": 70,
      "comment": "\r\n * Optional Answer that can be used with\r\n * {@link Mockito#mock(Class, Answer)}\r\n * \u003cp\u003e\r\n * This implementation can be helpful when working with legacy code. Unstubbed\r\n * methods often return null. If your code uses the object returned by an\r\n * unstubbed call you get a NullPointerException. This implementation of\r\n * Answer returns SmartNulls instead of nulls.\r\n * SmartNull gives nicer exception message than NPE because it points out the\r\n * line where unstubbed method was called. You just click on the stack trace.\r\n * \u003cp\u003e\r\n * ReturnsSmartNulls first tries to return ordinary return values (see\r\n * {@link ReturnsMoreEmptyValues}) then it tries to return SmartNull. If the\r\n * return type is not mockable (e.g. final) then ordinary null is returned.\r\n * \u003cp\u003e\r\n * ReturnsSmartNulls will be probably the default return values strategy in\r\n * Mockito 2.0\r\n "
    },
    {
      "type": "class_interface",
      "name": "ThrowingInterceptor",
      "is_interface": false,
      "parent_types": [
        "org.mockito.cglib.proxy.MethodInterceptor"
      ],
      "begin_line": 39,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocation"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.ThrowingInterceptor.ThrowingInterceptor(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 13)-(line 44,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.ThrowingInterceptor.intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.mockito.cglib.proxy.MethodProxy)",
      "begin_line": 47,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 48,col 13)-(line 50,col 13)",
        "(line 52,col 13)-(line 52,col 63)",
        "(line 53,col 13)-(line 53,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 59,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 64)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 63)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 20)"
      ]
    }
  ]
}