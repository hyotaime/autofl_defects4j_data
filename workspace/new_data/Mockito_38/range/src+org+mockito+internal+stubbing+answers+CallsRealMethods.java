{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/stubbing/answers/CallsRealMethods.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CallsRealMethods",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 30,
      "end_line": 34,
      "comment": "\r\n * Optional Answer that adds partial mocking support\r\n * \u003cp\u003e\r\n * {@link Answer} can be used to define the return values of unstubbed invocations.\r\n * \u003cp\u003e\r\n * This implementation can be helpful when working with legacy code.\r\n * When this implementation is used, unstubbed methods will delegate to the real implementation.\r\n * This is a way to create a partial mock object that calls real methods by default.\r\n * \u003cp\u003e\r\n * As usual you are going to read \u003cb\u003ethe partial mock warning\u003c/b\u003e:\r\n * Object oriented programming is more less tackling complexity by dividing the complexity into separate, specific, SRPy objects.\r\n * How does partial mock fit into this paradigm? Well, it just doesn\u0027t... \r\n * Partial mock usually means that the complexity has been moved to a different method on the same object.\r\n * In most cases, this is not the way you want to design your application.\r\n * \u003cp\u003e\r\n * However, there are rare cases when partial mocks come handy: \r\n * dealing with code you cannot change easily (3rd party interfaces, interim refactoring of legacy code etc.)\r\n * However, I wouldn\u0027t use partial mocks for new, test-driven \u0026 well-designed code.\r\n * \u003cp\u003e\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.CallsRealMethods.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 43)"
      ]
    }
  ]
}