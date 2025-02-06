{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/DateTick.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateTick",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.ValueTick"
      ],
      "begin_line": 55,
      "end_line": 139,
      "comment": "\r\n * A tick used by the {@link DateAxis} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "date"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The date. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTick.DateTick(java.util.Date, java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\r\n     * Creates a new date tick.\r\n     *\r\n     * @param date  the date.\r\n     * @param label  the label.\r\n     * @param textAnchor  the part of the label that is aligned to the anchor\r\n     *                    point.\r\n     * @param rotationAnchor  defines the rotation point relative to the text.\r\n     * @param angle  the rotation angle (in radians).\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTick.DateTick(org.jfree.chart.axis.TickType, java.util.Date, java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\r\n     * Creates a new date tick.\r\n     *\r\n     * @param tickType the tick type.\r\n     * @param date  the date.\r\n     * @param label  the label.\r\n     * @param textAnchor  the part of the label that is aligned to the anchor\r\n     *                    point.\r\n     * @param rotationAnchor  defines the rotation point relative to the text.\r\n     * @param angle  the rotation angle (in radians).\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 82)",
        "(line 96,col 9)-(line 96,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTick.getDate()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Returns the date.\r\n     *\r\n     * @return The date.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTick.equals(java.lang.Object)",
      "begin_line": 116,
      "end_line": 128,
      "comment": "\r\n     * Tests this tick for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 39)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTick.hashCode()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)"
      ]
    }
  ]
}