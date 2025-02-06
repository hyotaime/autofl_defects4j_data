{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/ArgumentCaptor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArgumentCaptor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 91,
      "comment": "\r\n * Use it to capture argument values for further assertions.\r\n * \u003cp\u003e\r\n * Mockito verifies argument values in natural java style: by using an equals() method.\r\n * This is also the recommended way of matching arguments because it makes tests clean \u0026 simple.\r\n * In some situations though, it is helpful to assert on certain arguments after the actual verification.\r\n * For example:\r\n * \u003cpre\u003e\r\n *   ArgumentCaptor\u0026lt;Person\u0026gt; argument \u003d new ArgumentCaptor\u0026lt;Person\u0026gt;();\r\n *   verify(mock).doSomething(argument.capture());\r\n *   assertEquals(\"John\", argument.getValue().getName());\r\n * \u003c/pre\u003e\r\n *\r\n * \u003cp\u003e\r\n * \u003cb\u003eWarning:\u003c/b\u003e it is recommended to use ArgumentCaptor with verification \u003cb\u003ebut not\u003c/b\u003e with stubbing.\r\n * Using ArgumentCaptor with stubbing may decrease test readability because captor is created outside of assert (aka verify or \u0027then\u0027) block.\r\n * Also it may reduce defect localization because if stubbed method was not called then no argument is captured.\r\n * \u003cp\u003e\r\n * In a way ArgumentCaptor is related to custom argument matchers (see javadoc for {@link ArgumentMatcher} class).\r\n * Both techniques can be used for making sure certain arguments where passed to mocks. \r\n * However, ArgumentCaptor may be a better fit if:\r\n * \u003cul\u003e  \r\n * \u003cli\u003ecustom argument matcher is not likely to be reused\u003c/li\u003e\r\n * \u003cli\u003eyou just need it to assert on argument values to complete verification\u003c/li\u003e\r\n * \u003c/ul\u003e\r\n * Custom argument matchers via {@link ArgumentMatcher} are usually better for stubbing.\r\n * \u003cp\u003e\r\n * See the full documentation on Mockito in javadoc for {@link Mockito} class.    \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "capturingMatcher"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentCaptor.capture()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\r\n     * Use it to capture the argument. This method \u003cb\u003emust be used inside of verification\u003c/b\u003e.\r\n     * \u003cp\u003e\r\n     * Internally, this method registers a special implementation of an {@link ArgumentMatcher}.\r\n     * This argument matcher stores the argument value so that you can use it later to perform assertions.  \r\n     * \u003cp\u003e\r\n     * See examples in javadoc for {@link ArgumentCaptor} class.\r\n     * \r\n     * @return null\r\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 42)",
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentCaptor.getValue()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Returns the captured value of the argument.\r\n     * \u003cp\u003e\r\n     * If the method was called multiple times then it returns the latest captured value\r\n     * \u003cp\u003e\r\n     * See examples in javadoc for {@link ArgumentCaptor} class.\r\n     * \r\n     * @return captured argument value\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentCaptor.getAllValues()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Returns all captured values. Use it in case the verified method was called multiple times.\r\n     * \u003cp\u003e\r\n     * Example: \r\n     * \u003cpre\u003e\r\n     *   ArgumentCaptor\u0026lt;Person\u0026gt; peopleCaptor \u003d new ArgumentCaptor\u0026lt;Person\u0026gt;();\r\n     *   verify(mock, times(2)).doSomething(peopleCaptor.capture());\r\n     *   \r\n     *   List\u0026lt;Person\u0026gt; capturedPeople \u003d peopleCaptor.getAllValues();\r\n     *   assertEquals(\"John\", capturedPeople.get(0).getName());\r\n     *   assertEquals(\"Jane\", capturedPeople.get(1).getName());\r\n     * \u003c/pre\u003e\r\n     * See more examples in javadoc for {@link ArgumentCaptor} class.\r\n     * \r\n     * @return captured argument value\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 52)"
      ]
    }
  ]
}