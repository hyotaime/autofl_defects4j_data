{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/stubbing/Answer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Answer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 39,
      "comment": "\n * Generic interface to be used for configuring mock\u0027s answer. \n * Answer specifies an action that is executed and a return value that is returned when you interact with the mock.   \n * \u003cp\u003e\n * Example of stubbing a mock with custom answer: \n * \n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * when(mock.someMethod(anyString())).thenAnswer(new Answer() {\n *     Object answer(InvocationOnMock invocation) {\n *         Object[] args \u003d invocation.getArguments();\n *         Object mock \u003d invocation.getMock();\n *         return \"called with arguments: \" + Arrays.toString(args);\n *     }\n * });\n * \n * //Following prints \"called with arguments: [foo]\"\n * System.out.println(mock.someMethod(\"foo\"));\n * \u003c/code\u003e\u003c/pre\u003e\n * \n * @param \u003cT\u003e the type to return.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Answer.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * @param invocation the invocation on the mock.\n     *\n     * @return the value to be returned\n     *\n     * @throws Throwable the throwable to be thrown\n     ",
      "child_ranges": []
    }
  ]
}