{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/CompassFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompassFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat"
      ],
      "begin_line": 50,
      "end_line": 136,
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
      "comment": "\r\n     * Returns a string representing the direction.\r\n     *\r\n     * @param direction  the direction.\r\n     *\r\n     * @return A string.\r\n     ",
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
      "begin_line": 104,
      "end_line": 107,
      "comment": "\r\n     * Formats a number into the specified string buffer.\r\n     *\r\n     * @param number  the number to format.\r\n     * @param toAppendTo  the string buffer.\r\n     * @param pos  the field position (ignored here).\r\n     *\r\n     * @return The string buffer.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CompassFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\r\n     * Formats a number into the specified string buffer.\r\n     *\r\n     * @param number  the number to format.\r\n     * @param toAppendTo  the string buffer.\r\n     * @param pos  the field position (ignored here).\r\n     *\r\n     * @return The string buffer.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CompassFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * This method returns \u003ccode\u003enull\u003c/code\u003e for all inputs.  This class cannot\r\n     * be used for parsing.\r\n     *\r\n     * @param source  the source string.\r\n     * @param parsePosition  the parse position.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 20)"
      ]
    }
  ]
}