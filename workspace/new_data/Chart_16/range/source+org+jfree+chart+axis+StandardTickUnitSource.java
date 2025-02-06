{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/StandardTickUnitSource.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardTickUnitSource",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.TickUnitSource",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 130,
      "comment": "\r\n * A source that can used by the {@link NumberAxis} class to obtain a\r\n * suitable {@link TickUnit}.  Instances of this class are {@link Serializable}\r\n * from version 1.0.7 onwards.  Cloning is not supported, because instances\r\n * are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "LOG_10_VALUE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Constant for log(10.0). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.StandardTickUnitSource.StandardTickUnitSource()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.StandardTickUnitSource.getLargerTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\r\n     * Returns a tick unit that is larger than the supplied unit.\r\n     *\r\n     * @param unit  the unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A tick unit that is larger than the supplied unit.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)",
        "(line 74,col 9)-(line 74,col 48)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 77,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.StandardTickUnitSource.getCeilingTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Returns the tick unit in the collection that is greater than or equal\r\n     * to (in size) the specified unit.\r\n     *\r\n     * @param unit  the unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A unit from the collection.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.StandardTickUnitSource.getCeilingTickUnit(double)",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\r\n     * Returns the tick unit in the collection that is greater than or equal\r\n     * to the specified size.\r\n     *\r\n     * @param size  the size.\r\n     *\r\n     * @return A unit from the collection.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 51)",
        "(line 102,col 9)-(line 102,col 39)",
        "(line 103,col 9)-(line 104,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.StandardTickUnitSource.equals(java.lang.Object)",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.StandardTickUnitSource.hashCode()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 17)"
      ]
    }
  ]
}