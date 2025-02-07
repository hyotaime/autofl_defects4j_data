{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/handler/InvocationNotifierHandlerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationNotifierHandlerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SOME_LOCATION"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SOME_EXCEPTION"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SOME_ERROR"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SOME_ANSWER"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listener1"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listener2"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "customListener"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocation"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockHandler"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "notifier"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandlerTest.setUp()",
      "begin_line": 53,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 58,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandlerTest.should_notify_all_listeners_when_calling_delegate_handler()",
      "begin_line": 61,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 75)",
        "(line 67,col 9)-(line 67,col 36)",
        "(line 70,col 9)-(line 70,col 109)",
        "(line 71,col 9)-(line 71,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandlerTest.should_notify_all_listeners_when_called_delegate_handler_returns_ex()",
      "begin_line": 74,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 64)",
        "(line 78,col 9)-(line 78,col 76)",
        "(line 81,col 9)-(line 81,col 36)",
        "(line 84,col 9)-(line 84,col 119)",
        "(line 85,col 9)-(line 85,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandlerTest.should_notify_all_listeners_when_called_delegate_handler_throws_exception_and_rethrow_it()",
      "begin_line": 88,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 66)",
        "(line 92,col 9)-(line 92,col 72)",
        "(line 95,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandlerTest.should_report_listener_exception()",
      "begin_line": 105,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 120)",
        "(line 109,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandlerTest.should_delegate_all_MockHandlerInterface_to_the_parameterized_MockHandler()",
      "begin_line": 121,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 42)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 59)",
        "(line 126,col 9)-(line 126,col 64)",
        "(line 128,col 9)-(line 128,col 53)",
        "(line 129,col 9)-(line 129,col 46)",
        "(line 130,col 9)-(line 130,col 55)",
        "(line 131,col 9)-(line 131,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CustomListener",
      "is_interface": false,
      "parent_types": [
        "org.mockito.listeners.InvocationListener"
      ],
      "begin_line": 134,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.handler.InvocationNotifierHandlerTest.CustomListener.reportInvocation(org.mockito.listeners.MethodInvocationReport)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": []
    }
  ]
}