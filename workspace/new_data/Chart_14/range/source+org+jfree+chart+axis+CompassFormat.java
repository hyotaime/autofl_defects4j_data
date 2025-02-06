{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/CompassFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompassFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat"
      ],
      "begin_line": 50,
      "end_line": 126,
      "comment": "\r\n * A formatter that displays numbers as directions.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " North. "
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " East. "
    },
    {
      "type": "field",
      "varNames": [
        "S"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " South. "
    },
    {
      "type": "field",
      "varNames": [
        "W"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " West. "
    },
    {
      "type": "field",
      "varNames": [
        "DIRECTIONS"
      ],
      "begin_line": 65,
      "end_line": 68,
      "comment": " The directions. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CompassFormat.CompassFormat()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Creates a new formatter.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CompassFormat.getDirectionCode(double)",
      "begin_line": 84,
      "end_line": 93,
      "comment": "\r\n     * Returns a string representing the direction.\r\n     * \r\n     * @param direction  the direction.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 36)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 66)",
        "(line 91,col 9)-(line 91,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CompassFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 99,
      "end_line": 102,
      "comment": " (non-Javadoc)\r\n     * @see java.text.NumberFormat#format(double, java.lang.StringBuffer, \r\n     *      java.text.FieldPosition)\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CompassFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 108,
      "end_line": 111,
      "comment": " (non-Javadoc)\r\n     * @see java.text.NumberFormat#format(long, java.lang.StringBuffer, \r\n     *      java.text.FieldPosition)\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CompassFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * This method returns \u003ccode\u003enull\u003c/code\u003e for all inputs.  This class cannot\r\n     * be used for parsing.\r\n     * \r\n     * @param source  the source string.\r\n     * @param parsePosition  the parse position.\r\n     * \r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 20)"
      ]
    }
  ]
}