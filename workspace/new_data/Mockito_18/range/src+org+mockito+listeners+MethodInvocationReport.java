{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/listeners/MethodInvocationReport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodInvocationReport",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 19,
      "end_line": 48,
      "comment": "\n * Represent a method call on a mock.\n *\n * \u003cp\u003e\n *     Contains the information on the mock, the location of the stub\n *     the return value if it returned something (maybe null), or an\n *     exception if one was thrown when the method was invoked.\n * \u003c/p\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.listeners.MethodInvocationReport.getInvocation()",
      "begin_line": 27,
      "end_line": 27,
      "comment": "\n     * The return type is deprecated, please assign the return value from this method\n     * to the {@link DescribedInvocation} type. Sorry for inconvenience but we had to move\n     * {@link PrintableInvocation} to better place to keep the API consistency.\n     *\n     * @return Information on the method call, never {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.listeners.MethodInvocationReport.getReturnedValue()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * @return The resulting value of the method invocation, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.listeners.MethodInvocationReport.getThrowable()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * @return The throwable raised by the method invocation, maybe \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.listeners.MethodInvocationReport.threwException()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * @return \u003ccode\u003etrue\u003c/code\u003e if an exception was raised, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.listeners.MethodInvocationReport.getLocationOfStubbing()",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * @return Location of the stub invocation\n     ",
      "child_ranges": []
    }
  ]
}