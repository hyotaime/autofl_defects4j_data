{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/ReturnValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnValues",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 37,
      "comment": "\n * @deprecated\n * \u003cb\u003eInstead, please use {@link Answer} interface\u003c/b\u003e\n * \u003cp\u003e\n * In rare cases your code might not compile with recent deprecation \u0026 changes.\n * Very sorry for inconvenience but it had to be done in order to keep framework consistent.  \n * \u003cp\u003e\n * Why it is deprecated? ReturnValues is being replaced by Answer\n * for better consistency \u0026 interoperability of the framework. \n * Answer interface has been in Mockito for a while and it has the same responsibility as ReturnValues.\n * There\u0027s no point in mainting exactly the same interfaces.\n * \u003cp\u003e\n * Configures return values for an unstubbed invocation\n * \u003cp\u003e\n * Can be used in {@link Mockito#mock(Class, ReturnValues)}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.ReturnValues.valueFor(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * return value for an unstubbed invocation\n     * \n     * @param invocation placeholder for mock and a method\n     * @return the return value\n     ",
      "child_ranges": []
    }
  ]
}