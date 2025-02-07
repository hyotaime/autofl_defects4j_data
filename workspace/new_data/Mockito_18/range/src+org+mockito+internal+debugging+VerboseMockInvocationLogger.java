{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/debugging/VerboseMockInvocationLogger.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerboseMockInvocationLogger",
      "is_interface": false,
      "parent_types": [
        "org.mockito.listeners.InvocationListener"
      ],
      "begin_line": 18,
      "end_line": 76,
      "comment": "\n * Logs all invocations to standard output.\n * \n * Used for debugging interactions with a mock. \n "
    },
    {
      "type": "field",
      "varNames": [
        "printStream"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " visible for testing"
    },
    {
      "type": "field",
      "varNames": [
        "mockInvocationsCounter"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.VerboseMockInvocationLogger()",
      "begin_line": 25,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.VerboseMockInvocationLogger(java.io.PrintStream)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.reportInvocation(org.mockito.listeners.MethodInvocationReport)",
      "begin_line": 33,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 22)",
        "(line 35,col 9)-(line 35,col 46)",
        "(line 36,col 9)-(line 36,col 64)",
        "(line 37,col 9)-(line 37,col 62)",
        "(line 38,col 9)-(line 38,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.printReturnedValueOrThrowable(org.mockito.listeners.MethodInvocationReport)",
      "begin_line": 41,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 48,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.printStubInfo(org.mockito.listeners.MethodInvocationReport)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.printHeader()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 33)",
        "(line 59,col 9)-(line 59,col 123)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.printInvocation(org.mockito.invocation.DescribedInvocation)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 51)",
        "(line 65,col 9)-(line 65,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.printFooter()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.debugging.VerboseMockInvocationLogger.printlnIndented(java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 45)"
      ]
    }
  ]
}