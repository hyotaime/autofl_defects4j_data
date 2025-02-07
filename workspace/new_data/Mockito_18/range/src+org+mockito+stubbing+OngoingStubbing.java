{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/stubbing/OngoingStubbing.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OngoingStubbing",
      "is_interface": true,
      "parent_types": [
        "org.mockito.internal.progress.IOngoingStubbing"
      ],
      "begin_line": 35,
      "end_line": 203,
      "comment": "\n * Simply put: \"\u003cb\u003eWhen\u003c/b\u003e the x method is called \u003cb\u003ethen\u003c/b\u003e return y\". E.g:\n *\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * \u003cb\u003ewhen\u003c/b\u003e(mock.someMethod()).\u003cb\u003ethenReturn\u003c/b\u003e(10);\n *\n * //you can use flexible argument matchers, e.g:\n * when(mock.someMethod(\u003cb\u003eanyString()\u003c/b\u003e)).thenReturn(10);\n *\n * //setting exception to be thrown:\n * when(mock.someMethod(\"some arg\")).thenThrow(new RuntimeException());\n *\n * //you can set different behavior for consecutive method calls.\n * //Last stubbing (e.g: thenReturn(\"foo\")) determines the behavior of further consecutive calls.\n * when(mock.someMethod(\"some arg\"))\n *  .thenThrow(new RuntimeException())\n *  .thenReturn(\"foo\");\n * \n * //There is a shorter way of consecutive stubbing:\n * when(mock.someMethod()).thenReturn(1,2,3);\n * when(mock.otherMethod()).thenThrow(exc1, exc2);\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * See examples in javadoc for {@link Mockito#when}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenReturn(T)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Sets a return value to be returned when the method is called. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * when(mock.someMethod()).thenReturn(10);\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * See examples in javadoc for {@link Mockito#when}\n     *\n     * @param value return value\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenReturn(T, T...)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Sets consecutive return values to be returned when the method is called. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * when(mock.someMethod()).thenReturn(1, 2, 3);\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * Last return value in the sequence (in example: 3) determines the behavior of further consecutive calls.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link Mockito#when}\n     *\n     * @param value first return value\n     * @param values next return values\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenThrow(java.lang.Throwable...)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Sets Throwable objects to be thrown when the method is called. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * when(mock.someMethod()).thenThrow(new RuntimeException());\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * If throwables contain a checked exception then it has to\n     * match one of the checked exceptions of method signature.\n     * \u003cp\u003e\n     * You can specify throwables to be thrown for consecutive calls. \n     * In that case the last throwable determines the behavior of further consecutive calls.\n     * \u003cp\u003e\n     * if throwable is null then exception will be thrown.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link Mockito#when}\n     *\n     * @param throwables to be thrown on method invocation\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenThrow(java.lang.Class\u003c? extends java.lang.Throwable\u003e...)",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Sets Throwable classes to be thrown when the method is called. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * when(mock.someMethod()).thenThrow(RuntimeException.class);\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Each throwable class will be instantiated for each method invocation.\n     * \u003cp\u003e\n     * If throwableClasses contain a checked exception then it has to\n     * match one of the checked exceptions of method signature.\n     * \u003cp\u003e\n     * You can specify throwableClasses to be thrown for consecutive calls.\n     * In that case the last throwable determines the behavior of further consecutive calls.\n     * \u003cp\u003e\n     * if throwable is null then exception will be thrown.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link Mockito#when}\n     *\n     * @param throwableClasses to be thrown on method invocation\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     * @since 1.9.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenCallRealMethod()",
      "begin_line": 145,
      "end_line": 145,
      "comment": "     \n     * Sets the real implementation to be called when the method is called on a mock object.\n     * \u003cp\u003e\n     * As usual you are going to read \u003cb\u003ethe partial mock warning\u003c/b\u003e:\n     * Object oriented programming is more less tackling complexity by dividing the complexity into separate, specific, SRPy objects.\n     * How does partial mock fit into this paradigm? Well, it just doesn\u0027t... \n     * Partial mock usually means that the complexity has been moved to a different method on the same object.\n     * In most cases, this is not the way you want to design your application.\n     * \u003cp\u003e\n     * However, there are rare cases when partial mocks come handy: \n     * dealing with code you cannot change easily (3rd party interfaces, interim refactoring of legacy code etc.)\n     * However, I wouldn\u0027t use partial mocks for new, test-driven \u0026 well-designed code.\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   // someMethod() must be safe (e.g. doesn\u0027t throw, doesn\u0027t have dependencies to the object state, etc.)\n     *   // if it isn\u0027t safe then you will have trouble stubbing it using this api. Use Mockito.doCallRealMethod() instead. \n     *   when(mock.someMethod()).thenCallRealMethod();\n     *   \n     *   // calls real method:\n     *   mock.someMethod();\n     *   \n     * \u003c/code\u003e\u003c/pre\u003e\n     * See also javadoc {@link Mockito#spy(Object)} to find out more about partial mocks. \n     * \u003cb\u003eMockito.spy() is a recommended way of creating partial mocks.\u003c/b\u003e \n     * The reason is it guarantees real methods are called against correctly constructed object because you\u0027re responsible for constructing the object passed to spy() method.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link Mockito#when}\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.thenAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n     * Sets a generic Answer for the method. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * when(mock.someMethod(10)).thenAnswer(new Answer\u0026lt;Integer\u0026gt;() {\n     *     public Integer answer(InvocationOnMock invocation) throws Throwable {\n     *         return (Integer) invocation.getArguments()[0];\n     *     }\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param answer the custom answer to execute.\n     *\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.then(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * Sets a generic Answer for the method.\n     *\n     * This method is an alias of {@link #thenAnswer(Answer)}. This alias allows\n     * more readable tests on occasion, for example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * //using \u0027then\u0027 alias:\n     * when(mock.foo()).then(returnCoolValue());\n     *\n     * //versus good old \u0027thenAnswer:\n     * when(mock.foo()).thenAnswer(byReturningCoolValue());\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param answer the custom answer to execute.\n     * @return iOngoingStubbing object that allows stubbing consecutive calls\n     *\n     * @see #thenAnswer(Answer)\n     * @since 1.9.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.OngoingStubbing.getMock()",
      "begin_line": 201,
      "end_line": 201,
      "comment": "\n     * Returns the mock that was used for this stub.\n     * \u003cp\u003e\n     * It allows to create a stub in one line of code.\n     * This can be helpful to keep test code clean.\n     * For example, some boring stub can be created \u0026 stubbed at field initialization in a test:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * public class CarTest {\n     *   Car boringStubbedCar \u003d when(mock(Car.class).shiftGear()).thenThrow(EngineNotStarted.class).getMock();\n     *\n     *   \u0026#064;Test public void should... {}\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param \u003cM\u003e The mock type given by the variable type.\n     * @return Mock used in this ongoing stubbing.\n     * @since 1.9.0\n     ",
      "child_ranges": []
    }
  ]
}