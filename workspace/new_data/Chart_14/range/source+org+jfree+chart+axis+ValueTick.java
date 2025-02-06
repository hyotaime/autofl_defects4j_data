{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/ValueTick.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueTick",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.Tick"
      ],
      "begin_line": 51,
      "end_line": 148,
      "comment": "\r\n * A value tick.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The value. "
    },
    {
      "type": "field",
      "varNames": [
        "tickType"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " \r\n     * The tick type (major or minor). \r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.ValueTick.ValueTick(double, java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "\r\n     * Creates a new value tick.\r\n     * \r\n     * @param value  the value.\r\n     * @param label  the label.\r\n     * @param textAnchor  the part of the label that is aligned to the anchor \r\n     *                    point.\r\n     * @param rotationAnchor  defines the rotation point relative to the label.\r\n     * @param angle  the rotation angle (in radians).\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 78)",
        "(line 78,col 9)-(line 78,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.ValueTick.ValueTick(org.jfree.chart.axis.TickType, double, java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\r\n     * Creates a new value tick.\r\n     * \r\n     * @param tickType  the tick type (major or minor).\r\n     * @param value  the value.\r\n     * @param label  the label.\r\n     * @param textAnchor  the part of the label that is aligned to the anchor \r\n     *                    point.\r\n     * @param rotationAnchor  defines the rotation point relative to the label.\r\n     * @param angle  the rotation angle (in radians).\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 56)",
        "(line 100,col 9)-(line 100,col 27)",
        "(line 101,col 9)-(line 101,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueTick.getValue()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Returns the value.\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueTick.getTickType()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Returns the tick type (major or minor).\r\n     * \r\n     * @return The tick type.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueTick.equals(java.lang.Object)",
      "begin_line": 131,
      "end_line": 146,
      "comment": "\r\n     * Tests this tick for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 41)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 33)"
      ]
    }
  ]
}