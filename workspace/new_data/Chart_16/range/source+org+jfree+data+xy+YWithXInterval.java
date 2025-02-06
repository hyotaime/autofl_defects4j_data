{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/YWithXInterval.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "YWithXInterval",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 133,
      "comment": "\r\n * A y-value plus the bounds for the related x-interval.  This curious \r\n * combination exists as an implementation detail, to fit into the structure\r\n * of the ComparableObjectSeries class.  It would have been possible to \r\n * simply reuse the {@link YInterval} class by assuming that the y-interval\r\n * in fact represents the x-interval, however I decided it was better to\r\n * duplicate some code in order to document the real intent.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The y-value. "
    },
    {
      "type": "field",
      "varNames": [
        "xLow"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The lower bound of the x-interval. "
    },
    {
      "type": "field",
      "varNames": [
        "xHigh"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The upper bound of the x-interval. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.YWithXInterval.YWithXInterval(double, double, double)",
      "begin_line": 73,
      "end_line": 77,
      "comment": " \r\n     * Creates a new instance of \u003ccode\u003eYWithXInterval\u003c/code\u003e.\r\n     *\r\n     * @param y  the y-value.\r\n     * @param xLow  the lower bound of the x-interval.\r\n     * @param xHigh  the upper bound of the x-interval.  \r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 19)",
        "(line 75,col 9)-(line 75,col 25)",
        "(line 76,col 9)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YWithXInterval.getY()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YWithXInterval.getXLow()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the lower bound of the x-interval.\r\n     *\r\n     * @return The lower bound of the x-interval.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YWithXInterval.getXHigh()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Returns the upper bound of the x-interval.\r\n     *\r\n     * @return The upper bound of the x-interval.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YWithXInterval.equals(java.lang.Object)",
      "begin_line": 113,
      "end_line": 131,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 51)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 20)"
      ]
    }
  ]
}