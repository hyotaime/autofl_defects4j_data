{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/stubbing/answers/ReturnsElementsOf.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsElementsOf",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 32,
      "end_line": 50,
      "comment": "\n * Returns elements of the collection. Keeps returning the last element forever.\n * Might be useful on occasion when you have a collection of elements to return.\n * \u003cp\u003e\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   //this:\n *   when(mock.foo()).thenReturn(1, 2, 3);\n *   //is equivalent to:\n *   when(mock.foo()).thenAnswer(new ReturnsElementsOf(Arrays.asList(1, 2, 3)));\n * \u003c/code\u003e\u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Also you might better want to use the static factory there\n * {@link org.mockito.AdditionalAnswers#returnsElementsOf(java.util.Collection)}\n * \u003c/p\u003e\n *\n * @see org.mockito.AdditionalAnswers\n "
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsElementsOf.ReturnsElementsOf(java.util.Collection\u003c?\u003e)",
      "begin_line": 36,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 40,col 9)",
        "(line 41,col 9)-(line 41,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsElementsOf.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 44,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 48,col 35)"
      ]
    }
  ]
}