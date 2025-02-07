{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/stubbing/Stubber.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Stubber",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 147,
      "comment": "\n * Allows to choose a method when stubbing in doThrow()|doAnswer()|doNothing()|doReturn() style\n * \u003cp\u003e \n * Example:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   doThrow(new RuntimeException()).when(mockedList).clear();\n *   \n *   //following throws RuntimeException:\n *   mockedList.clear();\n * \u003c/code\u003e\u003c/pre\u003e\n * \n * Also useful when stubbing consecutive calls:\n * \n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   doThrow(new RuntimeException(\"one\")).\n *   doThrow(new RuntimeException(\"two\"))\n *   .when(mock).someVoidMethod();\n * \u003c/code\u003e\u003c/pre\u003e\n * \n * Read more about those methods:\n * \u003cp\u003e\n * {@link Mockito#doThrow(Throwable)}\n * \u003cp\u003e\n * {@link Mockito#doAnswer(Answer)}\n * \u003cp\u003e\n * {@link Mockito#doNothing()}\n * \u003cp\u003e\n * {@link Mockito#doReturn(Object)}\n * \u003cp\u003e\n * \n * See examples in javadoc for {@link Mockito}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.when(T)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Allows to choose a method when stubbing in doThrow()|doAnswer()|doNothing()|doReturn() style\n     * \u003cp\u003e \n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   doThrow(new RuntimeException())\n     *   .when(mockedList).clear();\n     *   \n     *   //following throws RuntimeException:\n     *   mockedList.clear();\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \n     * Read more about those methods:\n     * \u003cp\u003e\n     * {@link Mockito#doThrow(Throwable)}\n     * \u003cp\u003e\n     * {@link Mockito#doAnswer(Answer)}\n     * \u003cp\u003e\n     * {@link Mockito#doNothing()}\n     * \u003cp\u003e\n     * {@link Mockito#doReturn(Object)}\n     * \u003cp\u003e\n     * \n     *  See examples in javadoc for {@link Mockito}\n     * \n     * @param mock The mock\n     * @return select method for stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doThrow(java.lang.Throwable)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Use it for stubbing consecutive calls in {@link Mockito#doThrow(Throwable)} style:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   doThrow(new RuntimeException(\"one\")).\n     *   doThrow(new RuntimeException(\"two\"))\n     *   .when(mock).someVoidMethod();\n     * \u003c/code\u003e\u003c/pre\u003e\n     * See javadoc for {@link Mockito#doThrow(Throwable)}\n     * \n     * @param toBeThrown to be thrown when the stubbed method is called\n     * @return stubber - to select a method for stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doThrow(java.lang.Class\u003c? extends java.lang.Throwable\u003e)",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Use it for stubbing consecutive calls in {@link Mockito#doThrow(Class)} style:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   doThrow(RuntimeException.class).\n     *   doThrow(IllegalArgumentException.class)\n     *   .when(mock).someVoidMethod();\n     * \u003c/code\u003e\u003c/pre\u003e\n     * See javadoc for {@link Mockito#doThrow(Class)}\n     *\n     * @param toBeThrown exception class to be thrown when the stubbed method is called\n     * @return stubber - to select a method for stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Use it for stubbing consecutive calls in {@link Mockito#doAnswer(Answer)} style:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   doAnswer(answerOne).\n     *   doAnswer(answerTwo)\n     *   .when(mock).someVoidMethod();\n     * \u003c/code\u003e\u003c/pre\u003e\n     * See javadoc for {@link Mockito#doAnswer(Answer)}\n     * \n     * @param answer to answer when the stubbed method is called\n     * @return stubber - to select a method for stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doNothing()",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Use it for stubbing consecutive calls in {@link Mockito#doNothing()} style:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   doNothing().\n     *   doThrow(new RuntimeException(\"two\"))\n     *   .when(mock).someVoidMethod();\n     * \u003c/code\u003e\u003c/pre\u003e\n     * See javadoc for {@link Mockito#doNothing()}\n     * \n     * @return stubber - to select a method for stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doReturn(java.lang.Object)",
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Use it for stubbing consecutive calls in {@link Mockito#doReturn(Object)} style.\n     * \u003cp\u003e\n     * See javadoc for {@link Mockito#doReturn(Object)}\n     * \n     * @param toBeReturned to be returned when the stubbed method is called\n     * @return stubber - to select a method for stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.Stubber.doCallRealMethod()",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Use it for stubbing consecutive calls in {@link Mockito#doCallRealMethod()} style.\n     * \u003cp\u003e\n     * See javadoc for {@link Mockito#doCallRealMethod()}\n     *\n     * @return stubber - to select a method for stubbing\n     ",
      "child_ranges": []
    }
  ]
}