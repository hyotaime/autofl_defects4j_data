{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/ArgumentCaptor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArgumentCaptor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 173,
      "comment": "\n * Use it to capture argument values for further assertions.\n *\n * \u003cp\u003e\n * Mockito verifies argument values in natural java style: by using an equals() method.\n * This is also the recommended way of matching arguments because it makes tests clean \u0026 simple.\n * In some situations though, it is helpful to assert on certain arguments after the actual verification.\n * For example:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   ArgumentCaptor\u0026lt;Person\u0026gt; argument \u003d ArgumentCaptor.forClass(Person.class);\n *   verify(mock).doSomething(argument.capture());\n *   assertEquals(\"John\", argument.getValue().getName());\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * Example of capturing varargs:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   //capturing varargs:\n *   ArgumentCaptor\u0026lt;Person\u0026gt; varArgs \u003d ArgumentCaptor.forClass(Person.class);\n *   verify(mock).varArgMethod(varArgs.capture());\n *   List expected \u003d asList(new Person(\"John\"), new Person(\"Jane\"));\n *   assertEquals(expected, varArgs.getAllValues());\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * \u003cp\u003e\n * \u003cstrong\u003eWarning:\u003c/strong\u003e it is recommended to use ArgumentCaptor with verification \u003cstrong\u003ebut not\u003c/strong\u003e with stubbing.\n * Using ArgumentCaptor with stubbing may decrease test readability because captor is created outside of assert (aka verify or \u0027then\u0027) block.\n * Also it may reduce defect localization because if stubbed method was not called then no argument is captured.\n *\n * \u003cp\u003e\n * In a way ArgumentCaptor is related to custom argument matchers (see javadoc for {@link ArgumentMatcher} class).\n * Both techniques can be used for making sure certain arguments where passed to mocks. \n * However, ArgumentCaptor may be a better fit if:\n * \u003cul\u003e  \n * \u003cli\u003ecustom argument matcher is not likely to be reused\u003c/li\u003e\n * \u003cli\u003eyou just need it to assert on argument values to complete verification\u003c/li\u003e\n * \u003c/ul\u003e\n * Custom argument matchers via {@link ArgumentMatcher} are usually better for stubbing.\n *\n * \u003cp\u003e\n * This utility class \u003cstrong\u003e*don\u0027t do any type checks*\u003c/strong\u003e, the generic signatures are only there to avoid casting\n * in your code. If you want specific types, then you should do that the captured values.\n * This behavior might change (type checks could be added) in a\n * future major release.\n * \u003cp\u003e\n * There is an \u003cstrong\u003eannotation\u003c/strong\u003e that you might find useful: \u0026#64;{@link Captor}\n * \u003cp\u003e\n * See the full documentation on Mockito in javadoc for {@link Mockito} class.\n *\n * @see Captor\n * @since 1.8.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "handyReturnValues"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "capturingMatcher"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.ArgumentCaptor.ArgumentCaptor()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * @deprecated\n     * \n     * \u003cb\u003ePlease use factory method {@link ArgumentCaptor#forClass(Class)} to create captors\u003c/b\u003e\n     * \u003cp\u003e\n     * This is required to avoid NullPointerExceptions when autoUnboxing primitive types.\n     * See issue 99.\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   ArgumentCaptor\u0026lt;Person\u0026gt; argument \u003d ArgumentCaptor.forClass(Person.class);\n     *   verify(mock).doSomething(argument.capture());\n     *   assertEquals(\"John\", argument.getValue().getName());\n     * \u003c/code\u003e\u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.ArgumentCaptor.ArgumentCaptor(java.lang.Class\u003c? extends T\u003e)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentCaptor.capture()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Use it to capture the argument. This method \u003cb\u003emust be used inside of verification\u003c/b\u003e.\n     * \u003cp\u003e\n     * Internally, this method registers a special implementation of an {@link ArgumentMatcher}.\n     * This argument matcher stores the argument value so that you can use it later to perform assertions.  \n     * \u003cp\u003e\n     * See examples in javadoc for {@link ArgumentCaptor} class.\n     * \n     * @return null or default values\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 42)",
        "(line 106,col 9)-(line 106,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentCaptor.getValue()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Returns the captured value of the argument. When capturing varargs use {@link #getAllValues()}.\n     * \u003cp\u003e\n     * If verified method was called multiple times then this method it returns the latest captured value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link ArgumentCaptor} class.\n     * \n     * @return captured argument value\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentCaptor.getAllValues()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Returns all captured values. Use it when capturing varargs or when the verified method was called multiple times.\n     * When varargs method was called multiple times, this method returns merged list of all values from all invocations.\n     * \u003cp\u003e\n     * Example: \n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   mock.doSomething(new Person(\"John\");\n     *   mock.doSomething(new Person(\"Jane\");\n     *\n     *   ArgumentCaptor\u0026lt;Person\u0026gt; peopleCaptor \u003d ArgumentCaptor.forClass(Person.class);\n     *   verify(mock, times(2)).doSomething(peopleCaptor.capture());\n     *   \n     *   List\u0026lt;Person\u0026gt; capturedPeople \u003d peopleCaptor.getAllValues();\n     *   assertEquals(\"John\", capturedPeople.get(0).getName());\n     *   assertEquals(\"Jane\", capturedPeople.get(1).getName());\n     * \u003c/pre\u003e\n     *\n     * Example of capturing varargs:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   mock.countPeople(new Person(\"John\"), new Person(\"Jane\"); //vararg method\n     *\n     *   ArgumentCaptor\u0026lt;Person\u0026gt; peopleCaptor \u003d ArgumentCaptor.forClass(Person.class);\n     *\n     *   verify(mock).countPeople(peopleCaptor.capture());\n     *\n     *   List expected \u003d asList(new Person(\"John\"), new Person(\"Jane\"));\n     *   assertEquals(expected, peopleCaptor.getAllValues());\n     * \u003c/code\u003e\u003c/pre\u003e\n     * See more examples in javadoc for {@link ArgumentCaptor} class.\n     * \n     * @return captured argument value\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentCaptor.forClass(java.lang.Class\u003cS\u003e)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Build a new \u003ccode\u003eArgumentCaptor\u003c/code\u003e.\n     * \u003cp\u003e\n     * Note that an \u003ccode\u003eArgumentCaptor\u003c/code\u003e \u003cb\u003e*don\u0027t do any type checks*\u003c/b\u003e, it is only there to avoid casting\n     * in your code. This might however change (type checks could be added) in a\n     * future major release.\n     *\n     * @param clazz Type matching the parameter to be captured.\n     * @param \u003cS\u003e Type of clazz\n     * @param \u003cU\u003e Type of object captured by the newly built ArgumentCaptor\n     * @return A new ArgumentCaptor\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 44)"
      ]
    }
  ]
}