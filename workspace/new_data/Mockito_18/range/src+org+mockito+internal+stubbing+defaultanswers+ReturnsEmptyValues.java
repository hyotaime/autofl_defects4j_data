{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsEmptyValues",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 120,
      "comment": "\n * Default answer of every Mockito mock.\n * \u003cul\u003e\n * \u003cli\u003e\n *  Returns appropriate primitive for primitive-returning methods\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns consistent values for primitive wrapper classes (e.g. int-returning method returns 0 \u003cb\u003eand\u003c/b\u003e Integer-returning method returns 0, too)\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns empty collection for collection-returning methods (works for most commonly used collection types)\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns description of mock for toString() method\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns zero if references are equals otherwise non-zero for Comparable#compareTo(T other) method (see issue 184)\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns null for everything else\n * \u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodsGuru"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockUtil"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 62,
      "end_line": 80,
      "comment": " (non-Javadoc)\n     * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 69)",
        "(line 79,col 9)-(line 79,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues.returnValueFor(java.lang.Class\u003c?\u003e)",
      "begin_line": 82,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    }
  ]
}