{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsEmptyValues",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 50,
      "end_line": 119,
      "comment": "\n * Default answer of every Mockito mock.\n * \u003cul\u003e\n * \u003cli\u003e\n *  Returns appropriate primitive for primitive-returning methods\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns consistent values for primitive wrapper classes (e.g. int-returning method retuns 0 \u003cb\u003eand\u003c/b\u003e Integer-returning method returns 0, too)\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns empty collection for collection-returning methods (works for most commonly used collection types)\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns description of mock for toString() method\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns null for everything else\n * \u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 55,
      "end_line": 68,
      "comment": " (non-Javadoc)\n     * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 66,col 69)",
        "(line 67,col 9)-(line 67,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues.returnValueFor(java.lang.Class\u003c?\u003e)",
      "begin_line": 70,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues.primitiveOf(java.lang.Class\u003c?\u003e)",
      "begin_line": 110,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 117,col 9)"
      ]
    }
  ]
}