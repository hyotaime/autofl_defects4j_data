{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/stubbing/OngoingStubbing.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OngoingStubbing",
      "is_interface": true,
      "parent_types": [
        "org.mockito.internal.progress.IOngoingStubbing"
      ],
      "begin_line": 35,
      "end_line": 136,
      "comment": "\r\n * Simply put: \"\u003cb\u003eWhen\u003c/b\u003e the x method is called \u003cb\u003ethen\u003c/b\u003e return y\". E.g:\r\n *\r\n * \u003cpre\u003e\r\n * \u003cb\u003ewhen\u003c/b\u003e(mock.someMethod()).\u003cb\u003ethenReturn\u003c/b\u003e(10);\r\n *\r\n * //you can use flexible argument matchers, e.g:\r\n * when(mock.someMethod(\u003cb\u003eanyString()\u003c/b\u003e)).thenReturn(10);\r\n *\r\n * //setting exception to be thrown:\r\n * when(mock.someMethod(\"some arg\")).thenThrow(new RuntimeException());\r\n *\r\n * //you can set different behavior for consecutive method calls.\r\n * //Last stubbing (e.g: thenReturn(\"foo\")) determines the behavior of further consecutive calls.\r\n * when(mock.someMethod(\"some arg\"))\r\n *  .thenThrow(new RuntimeException())\r\n *  .thenReturn(\"foo\");\r\n * \r\n * //There is a shorter way of consecutive stubbing:\r\n * when(mock.someMethod()).thenReturn(1,2,3);\r\n * when(mock.otherMethod()).thenThrow(exc1, exc2);\r\n * \u003c/pre\u003e\r\n *\r\n * See examples in javadoc for {@link Mockito#when}\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenReturn(T)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\r\n     * Sets a return value to be returned when the method is called. E.g:\r\n     * \u003cpre\u003e\r\n     * when(mock.someMethod()).thenReturn(10);\r\n     * \u003c/pre\u003e\r\n     *\r\n     * See examples in javadoc for {@link Mockito#when}\r\n     *\r\n     * @param value return value\r\n     *\r\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenReturn(T, T...)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\r\n     * Sets consecutive return values to be returned when the method is called. E.g:\r\n     * \u003cpre\u003e\r\n     * when(mock.someMethod()).thenReturn(1, 2, 3);\r\n     * \u003c/pre\u003e\r\n     *\r\n     * Last return value in the sequence (in example: 3) determines the behavior of further consecutive calls.\r\n     * \u003cp\u003e\r\n     * See examples in javadoc for {@link Mockito#when}\r\n     *\r\n     * @param value first return value\r\n     * @param values next return values\r\n     *\r\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenThrow(java.lang.Throwable...)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\r\n     * Sets Throwable objects to be thrown when the method is called. E.g:\r\n     * \u003cpre\u003e\r\n     * when(mock.someMethod()).thenThrow(new RuntimeException());\r\n     * \u003c/pre\u003e\r\n     *\r\n     * If throwables contain a checked exception then it has to\r\n     * match one of the checked exceptions of method signature.\r\n     * \u003cp\u003e\r\n     * You can specify throwables to be thrown for consecutive calls. \r\n     * In that case the last throwable determines the behavior of further consecutive calls.\r\n     * \u003cp\u003e\r\n     * if throwable is null then exception will be thrown.\r\n     * \u003cp\u003e\r\n     * See examples in javadoc for {@link Mockito#when}\r\n     *\r\n     * @param throwables to be thrown on method invocation\r\n     *\r\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenCallRealMethod()",
      "begin_line": 119,
      "end_line": 119,
      "comment": "     \r\n     * Sets the real implementation to be called when the method is called on a mock object.\r\n     * \u003cp\u003e\r\n     * As usual you are going to read \u003cb\u003ethe partial mock warning\u003c/b\u003e:\r\n     * Object oriented programming is more less tackling complexity by dividing the complexity into separate, specific, SRPy objects.\r\n     * How does partial mock fit into this paradigm? Well, it just doesn\u0027t... \r\n     * Partial mock usually means that the complexity has been moved to a different method on the same object.\r\n     * In most cases, this is not the way you want to design your application.\r\n     * \u003cp\u003e\r\n     * However, there are rare cases when partial mocks come handy: \r\n     * dealing with code you cannot change easily (3rd party interfaces, interim refactoring of legacy code etc.)\r\n     * However, I wouldn\u0027t use partial mocks for new, test-driven \u0026 well-designed code.\r\n     * \u003cpre\u003e\r\n     *   // someMethod() must be safe (e.g. doesn\u0027t throw, doesn\u0027t have dependencies to the object state, etc.)\r\n     *   // if it isn\u0027t safe then you will have trouble stubbing it using this api. Use Mockito.doCallRealMethod() instead. \r\n     *   when(mock.someMethod()).thenCallRealMethod();\r\n     *   \r\n     *   // calls real method:\r\n     *   mock.someMethod();\r\n     *   \r\n     * \u003c/pre\u003e\r\n     * See also javadoc {@link Mockito#spy(Object)} to find out more about partial mocks. \r\n     * \u003cb\u003eMockito.spy() is a recommended way of creating partial mocks.\u003c/b\u003e \r\n     * The reason is it guarantees real methods are called against correctly constructed object because you\u0027re responsible for constructing the object passed to spy() method.\r\n     * \u003cp\u003e\r\n     * See examples in javadoc for {@link Mockito#when}\r\n     *\r\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 135,
      "end_line": 135,
      "comment": "\r\n     * Sets a generic Answer for the method. E.g:\r\n     * \u003cpre\u003e\r\n     * when(mock.someMethod(10)).thenAnswer(new Answer\u0026lt;Integer\u0026gt;() {\r\n     *     public Integer answer(InvocationOnMock invocation) throws Throwable {\r\n     *         return (Integer) invocation.getArguments()[0];\r\n     *     }\r\n     * }\r\n     * \u003c/pre\u003e\r\n     *\r\n     * @param answer the custom answer to execute.\r\n     *\r\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\r\n     ",
      "child_ranges": []
    }
  ]
}