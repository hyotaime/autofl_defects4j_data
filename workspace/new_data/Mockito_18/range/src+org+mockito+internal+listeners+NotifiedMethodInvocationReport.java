{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/listeners/NotifiedMethodInvocationReport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NotifiedMethodInvocationReport",
      "is_interface": false,
      "parent_types": [
        "org.mockito.listeners.MethodInvocationReport"
      ],
      "begin_line": 16,
      "end_line": 86,
      "comment": "\n * Report on a method call\n "
    },
    {
      "type": "field",
      "varNames": [
        "invocation"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnedValue"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "throwable"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.NotifiedMethodInvocationReport(org.mockito.invocation.Invocation, java.lang.Object)",
      "begin_line": 29,
      "end_line": 33,
      "comment": "\n     * Build a new {@link org.mockito.listeners.MethodInvocationReport} with a return value.\n     *\n     *\n     * @param invocation Information on the method call\n     * @param returnedValue The value returned by the method invocation\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 37)",
        "(line 31,col 9)-(line 31,col 43)",
        "(line 32,col 9)-(line 32,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.NotifiedMethodInvocationReport(org.mockito.invocation.Invocation, java.lang.Throwable)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "\n     * Build a new {@link org.mockito.listeners.MethodInvocationReport} with a return value.\n     *\n     *\n     * @param invocation Information on the method call\n     * @param throwable Tha throwable raised by the method invocation\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 37)",
        "(line 44,col 9)-(line 44,col 34)",
        "(line 45,col 9)-(line 45,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.getInvocation()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.getReturnedValue()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.getThrowable()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.threwException()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.getLocationOfStubbing()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.equals(java.lang.Object)",
      "begin_line": 69,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 35)",
        "(line 71,col 9)-(line 71,col 66)",
        "(line 73,col 9)-(line 73,col 81)",
        "(line 75,col 9)-(line 77,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.listeners.NotifiedMethodInvocationReport.hashCode()",
      "begin_line": 80,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 68)",
        "(line 82,col 9)-(line 82,col 86)",
        "(line 83,col 9)-(line 83,col 78)",
        "(line 84,col 9)-(line 84,col 22)"
      ]
    }
  ]
}