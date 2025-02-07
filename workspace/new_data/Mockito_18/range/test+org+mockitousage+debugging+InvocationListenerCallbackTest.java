{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/debugging/InvocationListenerCallbackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationListenerCallbackTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 98,
      "comment": "\n * Ensures that custom listeners can be registered and will be called every time\n * a method on a mock is invoked.\n "
    },
    {
      "type": "field",
      "varNames": [
        "listener1"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " and mockito will confuse the mocks."
    },
    {
      "type": "field",
      "varNames": [
        "listener2"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.InvocationListenerCallbackTest.should_call_single_listener_when_mock_return_normally()",
      "begin_line": 31,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 81)",
        "(line 35,col 9)-(line 35,col 64)",
        "(line 38,col 9)-(line 38,col 37)",
        "(line 41,col 9)-(line 41,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.InvocationListenerCallbackTest.should_call_all_listener_when_mock_return_normally()",
      "begin_line": 44,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 92)",
        "(line 48,col 9)-(line 48,col 67)",
        "(line 51,col 9)-(line 51,col 37)",
        "(line 54,col 9)-(line 54,col 85)",
        "(line 55,col 9)-(line 55,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.InvocationListenerCallbackTest.should_call_all_listener_when_mock_throws_exception()",
      "begin_line": 59,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 83)",
        "(line 63,col 9)-(line 63,col 83)",
        "(line 64,col 9)-(line 64,col 92)",
        "(line 65,col 9)-(line 65,col 68)",
        "(line 68,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OvenNotWorking",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.InvocationListenerCallbackTest.assertThatHasBeenNotified(org.mockitousage.debugging.InvocationListenerCallbackTest.RememberingListener, java.lang.Object, java.lang.String)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 61)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 84,col 85)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RememberingListener",
      "is_interface": false,
      "parent_types": [
        "org.mockito.listeners.InvocationListener"
      ],
      "begin_line": 87,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocation"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnValue"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locationOfStubbing"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.InvocationListenerCallbackTest.RememberingListener.reportInvocation(org.mockito.listeners.MethodInvocationReport)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 50)",
        "(line 94,col 13)-(line 94,col 54)",
        "(line 95,col 13)-(line 95,col 66)"
      ]
    }
  ]
}