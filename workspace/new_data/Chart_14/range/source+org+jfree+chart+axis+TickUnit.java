{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/TickUnit.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TickUnit",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 197,
      "comment": "\r\n * Base class representing a tick unit.  This determines the spacing of the\r\n * tick marks on an axis.\r\n * \u003cP\u003e\r\n * This class (and any subclasses) should be immutable, the reason being that\r\n * ORDERED collections of tick units are maintained and if one instance can be\r\n * changed, it may destroy the order of the collection that it belongs to.\r\n * In addition, if the implementations are immutable, they can belong to\r\n * multiple collections.\r\n *\r\n * @see ValueAxis\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The size of the tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickCount"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\r\n     * The number of minor ticks.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.TickUnit.TickUnit(double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Constructs a new tick unit.\r\n     *\r\n     * @param size  the tick unit size.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.TickUnit.TickUnit(double, int)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\r\n     * Constructs a new tick unit.\r\n     *\r\n     * @param size  the tick unit size.\r\n     * @param minorTickCount  the minor tick count.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 25)",
        "(line 97,col 9)-(line 97,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnit.getSize()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Returns the size of the tick unit.\r\n     *\r\n     * @return The size of the tick unit.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnit.getMinorTickCount()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Returns the minor tick count.\r\n     * \r\n     * @return The minor tick count.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnit.valueToString(double)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Converts the supplied value to a string.\r\n     * \u003cP\u003e\r\n     * Subclasses may implement special formatting by overriding this method.\r\n     *\r\n     * @param value  the data value.\r\n     *\r\n     * @return Value as string.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnit.compareTo(java.lang.Object)",
      "begin_line": 142,
      "end_line": 160,
      "comment": "\r\n     * Compares this tick unit to an arbitrary object.\r\n     *\r\n     * @param object  the object to compare against.\r\n     *\r\n     * @return \u003ccode\u003e1\u003c/code\u003e if the size of the other object is less than this,\r\n     *      \u003ccode\u003e0\u003c/code\u003e if both have the same size and \u003ccode\u003e-1\u003c/code\u003e this\r\n     *      size is less than the others.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnit.equals(java.lang.Object)",
      "begin_line": 169,
      "end_line": 184,
      "comment": "\r\n     * Tests this unit for equality with another object.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 39)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnit.hashCode()",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 193,col 21)",
        "(line 194,col 9)-(line 194,col 44)"
      ]
    }
  ]
}