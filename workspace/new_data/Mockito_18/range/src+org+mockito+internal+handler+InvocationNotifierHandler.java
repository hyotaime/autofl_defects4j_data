{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/handler/InvocationNotifierHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationNotifierHandler",
      "is_interface": false,
      "parent_types": [
        "org.mockito.invocation.MockHandler",
        "org.mockito.internal.InternalMockHandler\u003cT\u003e"
      ],
      "begin_line": 25,
      "end_line": 83,
      "comment": "\n * Handler, that call all listeners wanted for this mock, before delegating it\n * to the parameterized handler.\n *\n * Also imposterize MockHandlerImpl, delegate all call of InternalMockHandler to the real mockHandler\n "
    },
    {
      "type": "field",
      "varNames": [
        "invocationListeners"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockHandler"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandler.InvocationNotifierHandler(org.mockito.internal.InternalMockHandler\u003cT\u003e, org.mockito.mock.MockCreationSettings)",
      "begin_line": 30,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 39)",
        "(line 32,col 9)-(line 32,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandler.handle(org.mockito.invocation.Invocation)",
      "begin_line": 35,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandler.notifyMethodCall(org.mockito.invocation.Invocation, java.lang.Object)",
      "begin_line": 47,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 54,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandler.notifyMethodCallException(org.mockito.invocation.Invocation, java.lang.Throwable)",
      "begin_line": 57,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandler.getMockSettings()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandler.voidMethodStubbable(T)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandler.setAnswersForStubbing(java.util.List\u003corg.mockito.stubbing.Answer\u003e)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandler.getInvocationContainer()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 52)"
      ]
    }
  ]
}