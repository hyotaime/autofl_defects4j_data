{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/MockHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockHandler",
      "is_interface": false,
      "parent_types": [
        "org.mockito.cglib.proxy.MethodInterceptor"
      ],
      "begin_line": 35,
      "end_line": 124,
      "comment": "\r\n * Invocation handler set on mock objects.\r\n *\r\n * @param \u003cT\u003e type of mock object to handle\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "registeredInvocations"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockitoStubber"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "matchersBinder"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockingProgress"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockName"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockSettings"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.MockHandler.MockHandler(org.mockito.internal.util.MockName, org.mockito.internal.progress.MockingProgress, org.mockito.internal.invocation.MatchersBinder, org.mockito.internal.creation.MockSettingsImpl)",
      "begin_line": 44,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 33)",
        "(line 46,col 9)-(line 46,col 47)",
        "(line 47,col 9)-(line 47,col 45)",
        "(line 48,col 9)-(line 48,col 41)",
        "(line 49,col 9)-(line 49,col 66)",
        "(line 50,col 9)-(line 50,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.MockHandler.MockHandler(org.mockito.internal.MockHandler\u003cT\u003e)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 130)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.MockHandler.intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.mockito.cglib.proxy.MethodProxy)",
      "begin_line": 57,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 83)",
        "(line 67,col 9)-(line 67,col 138)",
        "(line 68,col 9)-(line 68,col 131)",
        "(line 70,col 9)-(line 70,col 40)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 69)",
        "(line 79,col 9)-(line 79,col 76)",
        "(line 80,col 9)-(line 80,col 115)",
        "(line 81,col 9)-(line 81,col 63)",
        "(line 83,col 9)-(line 83,col 75)",
        "(line 84,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.MockHandler.verifyNoMoreInteractions()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 99)",
        "(line 105,col 9)-(line 105,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.MockHandler.voidMethodStubbable(T)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.MockHandler.getRegisteredInvocations()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.MockHandler.getMockName()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.MockHandler.setAnswersForStubbing(java.util.List\u003corg.mockito.stubbing.Answer\u003e)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 54)"
      ]
    }
  ]
}