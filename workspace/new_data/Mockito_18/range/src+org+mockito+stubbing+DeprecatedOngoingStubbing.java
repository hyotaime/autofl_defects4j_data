{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/stubbing/DeprecatedOngoingStubbing.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeprecatedOngoingStubbing",
      "is_interface": true,
      "parent_types": [
        "org.mockito.internal.progress.IOngoingStubbing"
      ],
      "begin_line": 32,
      "end_line": 80,
      "comment": "\n * Stubs a method call with return value or an exception. E.g:\n *\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * stub(mock.someMethod()).toReturn(10);\n *\n * //you can use flexible argument matchers, e.g:\n * stub(mock.someMethod(\u003cb\u003eanyString()\u003c/b\u003e)).toReturn(10);\n *\n * //setting exception to be thrown:\n * stub(mock.someMethod(\"some arg\")).toThrow(new RuntimeException());\n *\n * //you can stub with different behavior for consecutive method calls.\n * //Last stubbing (e.g: toReturn(\"foo\")) determines the behavior for further consecutive calls.\n * stub(mock.someMethod(\"some arg\"))\n *  .toThrow(new RuntimeException())\n *  .toReturn(\"foo\");\n *\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * See examples in javadoc for {@link Mockito#stub}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.DeprecatedOngoingStubbing.toReturn(T)",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Set a return value for the stubbed method. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * stub(mock.someMethod()).toReturn(10);\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * See examples in javadoc for {@link Mockito#stub}\n     *\n     * @param value return value\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.DeprecatedOngoingStubbing.toThrow(java.lang.Throwable)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Set a Throwable to be thrown when the stubbed method is called. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * stub(mock.someMethod()).toThrow(new RuntimeException());\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * If throwable is a checked exception then it has to\n     * match one of the checked exceptions of method signature.\n     *\n     * See examples in javadoc for {@link Mockito#stub}\n     *\n     * @param throwable to be thrown on method invocation\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.DeprecatedOngoingStubbing.toAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Set a generic Answer for the stubbed method. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * stub(mock.someMethod(10)).toAnswer(new Answer\u0026lt;Integer\u0026gt;() {\n     *     public Integer answer(InvocationOnMock invocation) throws Throwable {\n     *         return (Integer) invocation.getArguments()[0];\n     *     }\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param answer the custom answer to execute.\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     ",
      "child_ranges": []
    }
  ]
}