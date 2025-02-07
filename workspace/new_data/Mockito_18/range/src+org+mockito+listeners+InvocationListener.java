{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/listeners/InvocationListener.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationListener",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 28,
      "comment": "\n * This listener can be notified of method invocations on a mock.\n * \n * For this to happen, it must be registered using {@link MockSettings#invocationListeners(InvocationListener...)}.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.listeners.InvocationListener.reportInvocation(org.mockito.listeners.MethodInvocationReport)",
      "begin_line": 27,
      "end_line": 27,
      "comment": "\n     * Called after the invocation of the listener\u0027s mock if it returned normally.\n     *\n     * \u003cp\u003e\n     * Exceptions caused by this invocationListener will raise a {@link org.mockito.exceptions.base.MockitoException}.\n     * \u003c/p\u003e\n     *\n     * @param methodInvocationReport Information about the method call that just happened.\n     *\n     * @see MethodInvocationReport\n     ",
      "child_ranges": []
    }
  ]
}