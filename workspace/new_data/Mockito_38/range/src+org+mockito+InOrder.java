{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/InOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InOrder",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 61,
      "comment": "\n * Allows verification in order. E.g:\n * \n * \u003cpre\u003e\n * InOrder inOrder \u003d inOrder(firstMock, secondMock);\n * \n * inOrder.verify(firstMock).add(\"was called first\");\n * inOrder.verify(secondMock).add(\"was called second\");\n * \u003c/pre\u003e\n * \n * See examples in javadoc for {@link Mockito} class\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.InOrder.verify(T)",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Verifies interaction \u003cb\u003ehappened once\u003c/b\u003e in order.\n     * \u003cp\u003e\n     * Alias to \u003ccode\u003einOrder.verify(mock, times(1))\u003c/code\u003e\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre\u003e\n     * InOrder inOrder \u003d inOrder(firstMock, secondMock);\n     * \n     * inOrder.verify(firstMock).someMethod(\"was called first\");\n     * inOrder.verify(secondMock).someMethod(\"was called second\");\n     * \u003c/pre\u003e\n     * \n     * See examples in javadoc for {@link Mockito} class\n     * \n     * @param mock to be verified\n     * \n     * @return mock object itself\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.InOrder.verify(T, org.mockito.internal.verification.api.VerificationMode)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Verifies interaction in order. E.g:\n     * \n     * \u003cpre\u003e\n     * InOrder inOrder \u003d inOrder(firstMock, secondMock);\n     * \n     * inOrder.verify(firstMock, times(2)).someMethod(\"was called first two times\");\n     * inOrder.verify(secondMock, atLeastOnce()).someMethod(\"was called second at least once\");\n     * \u003c/pre\u003e\n     * \n     * See examples in javadoc for {@link Mockito} class\n     * \n     * @param mock to be verified\n     * @param mode for example times(x) or atLeastOnce()\n     * \n     * @return mock object itself\n     ",
      "child_ranges": []
    }
  ]
}