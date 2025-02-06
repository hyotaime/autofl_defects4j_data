{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/stubbing/DeprecatedOngoingStubbing.java",
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
      "comment": "\r\n * Stubs a method call with return value or an exception. E.g:\r\n *\r\n * \u003cpre\u003e\r\n * stub(mock.someMethod()).toReturn(10);\r\n *\r\n * //you can use flexible argument matchers, e.g:\r\n * stub(mock.someMethod(\u003cb\u003eanyString()\u003c/b\u003e)).toReturn(10);\r\n *\r\n * //setting exception to be thrown:\r\n * stub(mock.someMethod(\"some arg\")).toThrow(new RuntimeException());\r\n *\r\n * //you can stub with different behavior for consecutive method calls.\r\n * //Last stubbing (e.g: toReturn(\"foo\")) determines the behavior for further consecutive calls.\r\n * stub(mock.someMethod(\"some arg\"))\r\n *  .toThrow(new RuntimeException())\r\n *  .toReturn(\"foo\");\r\n *\r\n * \u003c/pre\u003e\r\n *\r\n * See examples in javadoc for {@link Mockito#stub}\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.DeprecatedOngoingStubbing.toReturn(T)",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\r\n     * Set a return value for the stubbed method. E.g:\r\n     * \u003cpre\u003e\r\n     * stub(mock.someMethod()).toReturn(10);\r\n     * \u003c/pre\u003e\r\n     *\r\n     * See examples in javadoc for {@link Mockito#stub}\r\n     *\r\n     * @param value return value\r\n     *\r\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.DeprecatedOngoingStubbing.toThrow(java.lang.Throwable)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\r\n     * Set a Throwable to be thrown when the stubbed method is called. E.g:\r\n     * \u003cpre\u003e\r\n     * stub(mock.someMethod()).toThrow(new RuntimeException());\r\n     * \u003c/pre\u003e\r\n     *\r\n     * If throwable is a checked exception then it has to\r\n     * match one of the checked exceptions of method signature.\r\n     *\r\n     * See examples in javadoc for {@link Mockito#stub}\r\n     *\r\n     * @param throwable to be thrown on method invocation\r\n     *\r\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.DeprecatedOngoingStubbing.toAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\r\n     * Set a generic Answer for the stubbed method. E.g:\r\n     * \u003cpre\u003e\r\n     * stub(mock.someMethod(10)).toAnswer(new Answer\u0026lt;Integer\u0026gt;() {\r\n     *     public Integer answer(InvocationOnMock invocation) throws Throwable {\r\n     *         return (Integer) invocation.getArguments()[0];\r\n     *     }\r\n     * }\r\n     * \u003c/pre\u003e\r\n     *\r\n     * @param answer the custom answer to execute.\r\n     *\r\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\r\n     ",
      "child_ranges": []
    }
  ]
}