{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/InOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InOrder",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 90,
      "comment": "\n * Allows verification in order. E.g:\n * \n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * InOrder inOrder \u003d inOrder(firstMock, secondMock);\n * \n * inOrder.verify(firstMock).add(\"was called first\");\n * inOrder.verify(secondMock).add(\"was called second\");\n * \u003c/code\u003e\u003c/pre\u003e\n * \n * As of Mockito 1.8.4 you can verifyNoMoreInvocations() in order-sensitive way. Read more: {@link InOrder#verifyNoMoreInteractions()}\n * \u003cp\u003e\n * \n * See examples in javadoc for {@link Mockito} class\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.InOrder.verify(T)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Verifies interaction \u003cb\u003ehappened once\u003c/b\u003e in order.\n     * \u003cp\u003e\n     * Alias to \u003ccode\u003einOrder.verify(mock, times(1))\u003c/code\u003e\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * InOrder inOrder \u003d inOrder(firstMock, secondMock);\n     * \n     * inOrder.verify(firstMock).someMethod(\"was called first\");\n     * inOrder.verify(secondMock).someMethod(\"was called second\");\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \n     * See examples in javadoc for {@link Mockito} class\n     * \n     * @param mock to be verified\n     * \n     * @return mock object itself\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.InOrder.verify(T, org.mockito.verification.VerificationMode)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Verifies interaction in order. E.g:\n     * \n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * InOrder inOrder \u003d inOrder(firstMock, secondMock);\n     * \n     * inOrder.verify(firstMock, times(2)).someMethod(\"was called first two times\");\n     * inOrder.verify(secondMock, atLeastOnce()).someMethod(\"was called second at least once\");\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \n     * See examples in javadoc for {@link Mockito} class\n     * \n     * @param mock to be verified\n     * @param mode for example times(x) or atLeastOnce()\n     * \n     * @return mock object itself\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.InOrder.verifyNoMoreInteractions()",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Verifies that no more interactions happened \u003cb\u003ein order\u003c/b\u003e. \n     * Different from {@link Mockito#verifyNoMoreInteractions(Object...)} because the order of verification matters.\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * mock.foo(); //1st\n     * mock.bar(); //2nd\n     * mock.baz(); //3rd\n     * \n     * InOrder inOrder \u003d inOrder(mock);\n     * \n     * inOrder.verify(mock).bar(); //2n\n     * inOrder.verify(mock).baz(); //3rd (last method)\n     * \n     * //passes because there are no more interactions after last method:\n     * inOrder.verifyNoMoreInteractions();\n     * \n     * //however this fails because 1st method was not verified:\n     * Mockito.verifyNoMoreInteractions(mock);\n     * \u003c/code\u003e\u003c/pre\u003e\n     ",
      "child_ranges": []
    }
  ]
}