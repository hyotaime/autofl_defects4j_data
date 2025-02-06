{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/stubbing/Stubber.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Stubber",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 124,
      "comment": "\r\n * Allows to choose a method when stubbing in doThrow()|doAnswer()|doNothing()|doReturn() style\r\n * \u003cp\u003e \r\n * Example:\r\n * \u003cpre\u003e\r\n *   doThrow(new RuntimeException()).when(mockedList).clear();\r\n *   \r\n *   //following throws RuntimeException:\r\n *   mockedList.clear();\r\n * \u003c/pre\u003e\r\n * \r\n * Also useful when stubbing consecutive calls:\r\n * \r\n * \u003cpre\u003e\r\n *   doThrow(new RuntimeException(\"one\")).\r\n *   doThrow(new RuntimeException(\"two\"))\r\n *   .when(mock).someVoidMethod();\r\n * \u003c/pre\u003e\r\n * \r\n * Read more about those methods:\r\n * \u003cp\u003e\r\n * {@link Mockito#doThrow(Throwable)}\r\n * \u003cp\u003e\r\n * {@link Mockito#doAnswer(Answer)}\r\n * \u003cp\u003e\r\n * {@link Mockito#doNothing()}\r\n * \u003cp\u003e\r\n * {@link Mockito#doReturn(Object)}\r\n * \u003cp\u003e\r\n * \r\n * See examples in javadoc for {@link Mockito}\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.when(T)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * Allows to choose a method when stubbing in doThrow()|doAnswer()|doNothing()|doReturn() style\r\n     * \u003cp\u003e \r\n     * Example:\r\n     * \u003cpre\u003e\r\n     *   doThrow(new RuntimeException())\r\n     *   .when(mockedList).clear();\r\n     *   \r\n     *   //following throws RuntimeException:\r\n     *   mockedList.clear();\r\n     * \u003c/pre\u003e\r\n     * \r\n     * Read more about those methods:\r\n     * \u003cp\u003e\r\n     * {@link Mockito#doThrow(Throwable)}\r\n     * \u003cp\u003e\r\n     * {@link Mockito#doAnswer(Answer)}\r\n     * \u003cp\u003e\r\n     * {@link Mockito#doNothing()}\r\n     * \u003cp\u003e\r\n     * {@link Mockito#doReturn(Object)}\r\n     * \u003cp\u003e\r\n     * \r\n     *  See examples in javadoc for {@link Mockito}\r\n     * \r\n     * @param mock\r\n     * @return select method for stubbing\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doThrow(java.lang.Throwable)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * Use it for stubbing consecutive calls in {@link Mockito#doThrow(Throwable)} style:\r\n     * \u003cpre\u003e\r\n     *   doThrow(new RuntimeException(\"one\")).\r\n     *   doThrow(new RuntimeException(\"two\"))\r\n     *   .when(mock).someVoidMethod();\r\n     * \u003c/pre\u003e\r\n     * See javadoc for {@link Mockito#doThrow(Throwable)}\r\n     * \r\n     * @param toBeThrown to be thrown when the stubbed method is called\r\n     * @return stubber - to select a method for stubbing\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\r\n     * Use it for stubbing consecutive calls in {@link Mockito#doAnswer(Answer)} style:\r\n     * \u003cpre\u003e\r\n     *   doAnswer(answerOne).\r\n     *   doAnswer(answerTwo)\r\n     *   .when(mock).someVoidMethod();\r\n     * \u003c/pre\u003e\r\n     * See javadoc for {@link Mockito#doAnswer(Answer)}\r\n     * \r\n     * @param answer to answer when the stubbed method is called\r\n     * @return stubber - to select a method for stubbing\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doNothing()",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\r\n     * Use it for stubbing consecutive calls in {@link Mockito#doNothing()} style:\r\n     * \u003cpre\u003e\r\n     *   doNothing().\r\n     *   doThrow(new RuntimeException(\"two\"))\r\n     *   .when(mock).someVoidMethod();\r\n     * \u003c/pre\u003e\r\n     * See javadoc for {@link Mockito#doNothing()}\r\n     * \r\n     * @return stubber - to select a method for stubbing\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doReturn(java.lang.Object)",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\r\n     * Use it for stubbing consecutive calls in {@link Mockito#doReturn(Object)} style.\r\n     * \u003cp\u003e\r\n     * See javadoc for {@link Mockito#doReturn(Object)}\r\n     * \r\n     * @param toBeReturned to be returned when the stubbed method is called\r\n     * @return stubber - to select a method for stubbing\r\n     ",
      "child_ranges": []
    }
  ]
}