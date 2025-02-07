{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/stubbing/answers/ReturnsElementsOf.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsElementsOf",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.stubbing.answers.ReturnsElementsOf"
      ],
      "begin_line": 22,
      "end_line": 29,
      "comment": "\n * Returns elements of the collection. Keeps returning the last element forever.\n * Might be useful on occasion when you have a collection of elements to return.\n * \u003cp\u003e\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   //this:\n *   when(mock.foo()).thenReturn(1, 2, 3);\n *   //is equivalent to:\n *   when(mock.foo()).thenReturn(new ReturnsElementsOf(Arrays.asList(1, 2, 3)));\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * @deprecated Use {@link org.mockito.AdditionalAnswers#returnsElementsOf}\n "
    },
    {
      "type": "constructor",
      "signature": "org.mockito.stubbing.answers.ReturnsElementsOf.ReturnsElementsOf(java.util.Collection\u003c?\u003e)",
      "begin_line": 25,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 24)"
      ]
    }
  ]
}