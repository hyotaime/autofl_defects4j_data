{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/stubbing/Answer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Answer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 39,
      "comment": "\r\n * Generic interface to be used for configuring mock\u0027s answer. \r\n * Answer specifies an action that is executed and a return value that is returned when you interact with the mock.   \r\n * \u003cp\u003e\r\n * Example of stubbing a mock with custom answer: \r\n * \r\n * \u003cpre\u003e\r\n * when(mock.someMethod(anyString())).thenAnswer(new Answer() {\r\n *     Object answer(InvocationOnMock invocation) {\r\n *         Object[] args \u003d invocation.getArguments();\r\n *         Object mock \u003d invocation.getMock();\r\n *         return \"called with arguments: \" + args;\r\n *     }\r\n * });\r\n * \r\n * //Following prints \"called with arguments: foo\"\r\n * System.out.println(mock.someMethod(\"foo\"));\r\n * \u003c/pre\u003e\r\n * \r\n * @param \u003cT\u003e the type to return.\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Answer.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\r\n     * @param invocation the invocation on the mock.\r\n     *\r\n     * @return the value to be returned\r\n     *\r\n     * @throws Throwable the throwable to be thrown\r\n     ",
      "child_ranges": []
    }
  ]
}