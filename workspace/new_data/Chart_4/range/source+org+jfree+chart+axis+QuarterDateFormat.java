{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/QuarterDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QuarterDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.DateFormat",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 207,
      "comment": "\r\n * A formatter that formats dates to show the year and quarter (for example,\r\n * \u00272004 IV\u0027 for the last quarter of 2004.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "REGULAR_QUARTERS"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": " Symbols for regular quarters. "
    },
    {
      "type": "field",
      "varNames": [
        "ROMAN_QUARTERS"
      ],
      "begin_line": 74,
      "end_line": 75,
      "comment": " Symbols for roman numbered quarters. "
    },
    {
      "type": "field",
      "varNames": [
        "GREEK_QUARTERS"
      ],
      "begin_line": 82,
      "end_line": 83,
      "comment": "\r\n     * Symbols for greek numbered quarters.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "quarters"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The strings. "
    },
    {
      "type": "field",
      "varNames": [
        "quarterFirst"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " A flag that controls whether the quarter or the year goes first. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.QuarterDateFormat.QuarterDateFormat()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Creates a new instance for the default time zone.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.QuarterDateFormat.QuarterDateFormat(java.util.TimeZone)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Creates a new instance for the specified time zone.\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.QuarterDateFormat.QuarterDateFormat(java.util.TimeZone, java.lang.String[])",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Creates a new instance for the specified time zone.\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quarterSymbols  the quarter symbols.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.QuarterDateFormat.QuarterDateFormat(java.util.TimeZone, java.lang.String[], boolean)",
      "begin_line": 127,
      "end_line": 141,
      "comment": "\r\n     * Creates a new instance for the specified time zone.\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quarterSymbols  the quarter symbols.\r\n     * @param quarterFirst  a flag that controls whether the quarter or the\r\n     *         year is displayed first.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 52)",
        "(line 133,col 9)-(line 133,col 39)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 139,col 9)-(line 139,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.QuarterDateFormat.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 152,
      "end_line": 169,
      "comment": "\r\n     * Formats the given date.\r\n     *\r\n     * @param date  the date.\r\n     * @param toAppendTo  the string buffer.\r\n     * @param fieldPosition  the field position.\r\n     *\r\n     * @return The formatted date.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 36)",
        "(line 155,col 9)-(line 155,col 52)",
        "(line 156,col 9)-(line 156,col 54)",
        "(line 157,col 9)-(line 157,col 32)",
        "(line 158,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.QuarterDateFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Parses the given string (not implemented).\r\n     *\r\n     * @param source  the date string.\r\n     * @param pos  the parse position.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e, as this method has not been implemented.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.QuarterDateFormat.equals(java.lang.Object)",
      "begin_line": 190,
      "end_line": 205,
      "comment": "\r\n     * Tests this formatter for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 57)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 33)"
      ]
    }
  ]
}