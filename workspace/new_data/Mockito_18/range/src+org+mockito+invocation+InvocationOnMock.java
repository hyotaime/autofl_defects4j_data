{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/invocation/InvocationOnMock.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationOnMock",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 16,
      "end_line": 57,
      "comment": "\n * An invocation on a mock\n * \u003cp\u003e\n * A placeholder for mock, the method that was called and the arguments that were passed.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.InvocationOnMock.getMock()",
      "begin_line": 23,
      "end_line": 23,
      "comment": "\n     * returns the mock object \n     * \n     * @return mock object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.InvocationOnMock.getMethod()",
      "begin_line": 30,
      "end_line": 30,
      "comment": "\n     * returns the method\n     * \n     * @return method\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.InvocationOnMock.getArguments()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * returns arguments passed to the method\n     * \n     * @return arguments\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.InvocationOnMock.getArgumentAt(int, java.lang.Class\u003cT\u003e)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n    * Returns casted argument using position\n    * @param index argument position\n    * @param clazz argument type\n    * @return casted argument on position\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.InvocationOnMock.callRealMethod()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * calls real method\n     * \u003cp\u003e\n     * \u003cb\u003eWarning:\u003c/b\u003e depending on the real implementation it might throw exceptions  \n     *\n     * @return whatever the real method returns / throws\n     * @throws Throwable in case real method throws \n     ",
      "child_ranges": []
    }
  ]
}