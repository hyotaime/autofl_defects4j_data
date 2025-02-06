{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/function/LineFunction2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LineFunction2D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.function.Function2D",
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 135,
      "comment": "\r\n * A function in the form y \u003d a + bx.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The intercept. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The slope of the line. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.function.LineFunction2D.LineFunction2D(double, double)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\r\n     * Constructs a new line function.\r\n     *\r\n     * @param a  the intercept.\r\n     * @param b  the slope.\r\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 19)",
        "(line 67,col 9)-(line 67,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.LineFunction2D.getIntercept()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Returns the \u0027a\u0027 coefficient that was specified in the constructor.\r\n     *\r\n     * @return The \u0027a\u0027 coefficient.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.LineFunction2D.getSlope()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Returns the \u0027b\u0027 coefficient that was specified in the constructor.\r\n     *\r\n     * @return The \u0027b\u0027 coefficient.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.LineFunction2D.getValue(double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Returns the function value.\r\n     *\r\n     * @param x  the x-value.\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.LineFunction2D.equals(java.lang.Object)",
      "begin_line": 110,
      "end_line": 122,
      "comment": "\r\n     * Tests this function for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 51)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.LineFunction2D.hashCode()",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 24)",
        "(line 131,col 9)-(line 131,col 56)",
        "(line 132,col 9)-(line 132,col 56)",
        "(line 133,col 9)-(line 133,col 22)"
      ]
    }
  ]
}