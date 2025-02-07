{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsMoreEmptyValues",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 75,
      "comment": "\n * It\u0027s likely this implementation will be used by default by every Mockito 2.0 mock.\n * \u003cp\u003e\n * Currently \u003cb\u003eused only\u003c/b\u003e by {@link Mockito#RETURNS_SMART_NULLS}\n * \u003cp\u003e\n * Current version of Mockito mocks by deafult use {@link ReturnsEmptyValues}  \n * \u003cul\u003e\n * \u003cli\u003e\n *  Returns appropriate primitive for primitive-returning methods\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns consistent values for primitive wrapper classes (e.g. int-returning method retuns 0 \u003cb\u003eand\u003c/b\u003e Integer-returning method returns 0, too)\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns empty collection for collection-returning methods (works for most commonly used collection types)\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns empty array for array-returning methods\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns \"\" for String-returning method\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns description of mock for toString() method\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns non-zero for Comparable#compareTo(T other) method (see issue 184)\n * \u003c/li\u003e\n * \u003cli\u003e\n *  Returns null for everything else\n * \u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 56,
      "end_line": 64,
      "comment": " (non-Javadoc)\n     * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 49)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 62,col 9)-(line 62,col 69)",
        "(line 63,col 9)-(line 63,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues.returnValueFor(java.lang.Class\u003c?\u003e)",
      "begin_line": 66,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 20)"
      ]
    }
  ]
}