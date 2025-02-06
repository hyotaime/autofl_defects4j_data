{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/AxisLocation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AxisLocation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 185,
      "comment": "\r\n * Used to indicate the location of an axis on a 2D plot, prior to knowing the \r\n * orientation of the plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_OR_LEFT"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " Axis at the top or left. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_OR_RIGHT"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " Axis at the top or right. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_OR_LEFT"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": " Axis at the bottom or left. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_OR_RIGHT"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": " Axis at the bottom or right. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.AxisLocation.AxisLocation(java.lang.String)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisLocation.getOpposite()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Returns the location that is opposite to this location.\r\n     *\r\n     * @return The opposite location.\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisLocation.toString()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisLocation.equals(java.lang.Object)",
      "begin_line": 116,
      "end_line": 130,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 51)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisLocation.getOpposite(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 139,
      "end_line": 160,
      "comment": "\r\n     * Returns the location that is opposite to the supplied location.\r\n     * \r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The opposite location.\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisLocation.readResolve()",
      "begin_line": 169,
      "end_line": 183,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     * \r\n     * @return The object.\r\n     * \r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 20)"
      ]
    }
  ]
}