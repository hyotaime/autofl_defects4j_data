{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/handler/MockHandlerImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockHandlerImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InternalMockHandler\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 134,
      "comment": "\n * Invocation handler set on mock objects.\n *\n * @param \u003cT\u003e type of mock object to handle\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocationContainerImpl"
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
        "mockSettings"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.handler.MockHandlerImpl.MockHandlerImpl(org.mockito.mock.MockCreationSettings)",
      "begin_line": 44,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 41)",
        "(line 46,col 9)-(line 46,col 63)",
        "(line 47,col 9)-(line 47,col 51)",
        "(line 48,col 9)-(line 48,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.MockHandlerImpl.handle(org.mockito.invocation.Invocation)",
      "begin_line": 51,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 83)",
        "(line 63,col 9)-(line 66,col 10)",
        "(line 68,col 9)-(line 68,col 40)",
        "(line 71,col 9)-(line 83,col 9)",
        "(line 86,col 9)-(line 86,col 85)",
        "(line 87,col 9)-(line 87,col 101)",
        "(line 88,col 9)-(line 88,col 63)",
        "(line 91,col 9)-(line 91,col 103)",
        "(line 93,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.MockHandlerImpl.voidMethodStubbable(T)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.MockHandlerImpl.getMockSettings()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.MockHandlerImpl.setAnswersForStubbing(java.util.List\u003corg.mockito.stubbing.Answer\u003e)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.MockHandlerImpl.getInvocationContainer()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.MockHandlerImpl.createVerificationData(org.mockito.internal.stubbing.InvocationContainerImpl, org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 127,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 84)"
      ]
    }
  ]
}