{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/stubbing/answers/CallsRealMethods.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CallsRealMethods",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 42,
      "comment": "\n * Optional Answer that adds partial mocking support\n * \u003cp\u003e\n * {@link Answer} can be used to define the return values of unstubbed invocations.\n * \u003cp\u003e\n * This implementation can be helpful when working with legacy code.\n * When this implementation is used, unstubbed methods will delegate to the real implementation.\n * This is a way to create a partial mock object that calls real methods by default.\n * \u003cp\u003e\n * As usual you are going to read \u003cb\u003ethe partial mock warning\u003c/b\u003e:\n * Object oriented programming is more less tackling complexity by dividing the complexity into separate, specific, SRPy objects.\n * How does partial mock fit into this paradigm? Well, it just doesn\u0027t... \n * Partial mock usually means that the complexity has been moved to a different method on the same object.\n * In most cases, this is not the way you want to design your application.\n * \u003cp\u003e\n * However, there are rare cases when partial mocks come handy: \n * dealing with code you cannot change easily (3rd party interfaces, interim refactoring of legacy code etc.)\n * However, I wouldn\u0027t use partial mocks for new, test-driven \u0026 well-designed code.\n * \u003cp\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.CallsRealMethods.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 36,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 39,col 9)",
        "(line 40,col 9)-(line 40,col 43)"
      ]
    }
  ]
}