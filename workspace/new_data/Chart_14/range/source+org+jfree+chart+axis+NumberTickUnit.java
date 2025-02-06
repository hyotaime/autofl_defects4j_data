{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/NumberTickUnit.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberTickUnit",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.TickUnit",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 164,
      "comment": "\r\n * A numerical tick unit.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " A formatter for the tick unit. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberTickUnit.NumberTickUnit(double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\r\n     * Creates a new number tick unit.\r\n     *\r\n     * @param size  the size of the tick unit.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberTickUnit.NumberTickUnit(double, java.text.NumberFormat)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\r\n     * Creates a new number tick unit.\r\n     *\r\n     * @param size  the size of the tick unit.\r\n     * @param formatter  a number formatter for the tick unit (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberTickUnit.NumberTickUnit(double, java.text.NumberFormat, int)",
      "begin_line": 99,
      "end_line": 106,
      "comment": "\r\n     * Creates a new number tick unit.\r\n     *\r\n     * @param size  the size of the tick unit.\r\n     * @param formatter  a number formatter for the tick unit (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     * @param minorTickCount  the number of minor ticks.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 36)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberTickUnit.valueToString(double)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Converts a value to a string.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The formatted string.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberTickUnit.equals(java.lang.Object)",
      "begin_line": 126,
      "end_line": 141,
      "comment": "\r\n     * Tests this formatter for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 51)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberTickUnit.toString()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Returns a string representing this unit.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberTickUnit.hashCode()",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 38)",
        "(line 159,col 9)-(line 160,col 49)",
        "(line 161,col 9)-(line 161,col 22)"
      ]
    }
  ]
}