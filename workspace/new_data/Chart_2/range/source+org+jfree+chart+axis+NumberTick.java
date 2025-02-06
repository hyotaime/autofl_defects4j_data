{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/NumberTick.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberTick",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.ValueTick"
      ],
      "begin_line": 50,
      "end_line": 105,
      "comment": "\r\n * A numerical tick.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "number"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The number. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberTick.NumberTick(java.lang.Number, java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 65,
      "end_line": 72,
      "comment": "\r\n     * Creates a new tick.\r\n     *\r\n     * @param number  the number (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param label  the label.\r\n     * @param textAnchor  the part of the label that is aligned with the anchor\r\n     *                    point.\r\n     * @param rotationAnchor  defines the rotation point relative to the text.\r\n     * @param angle  the rotation angle (in radians).\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 78)",
        "(line 70,col 9)-(line 70,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberTick.NumberTick(org.jfree.chart.axis.TickType, double, java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\r\n     * Creates a new tick.\r\n     *\r\n     * @param tickType  the tick type.\r\n     * @param value  the value.\r\n     * @param label  the label.\r\n     * @param textAnchor  the part of the label that is aligned with the anchor\r\n     *                    point.\r\n     * @param rotationAnchor  defines the rotation point relative to the text.\r\n     * @param angle  the rotation angle (in radians).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 73)",
        "(line 92,col 9)-(line 92,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberTick.getNumber()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Returns the number.\r\n     *\r\n     * @return The number.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 27)"
      ]
    }
  ]
}