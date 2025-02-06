{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/TickUnits.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TickUnits",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.TickUnitSource",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 210,
      "comment": "\r\n * A collection of tick units, used by the {@link DateAxis} and\r\n * {@link NumberAxis} classes.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "tickUnits"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Storage for the tick units. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.TickUnits.TickUnits()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Constructs a new collection of tick units.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnits.add(org.jfree.chart.axis.TickUnit)",
      "begin_line": 89,
      "end_line": 95,
      "comment": "\r\n     * Adds a tick unit to the collection.  The tick units are maintained in\r\n     * ascending order.\r\n     *\r\n     * @param unit  the tick unit to add (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 94,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnits.size()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the number of tick units in this collection.\r\n     * \u003cP\u003e\r\n     * This method is required for the XML writer.\r\n     *\r\n     * @return The number of units in this collection.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnits.get(int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the tickunit on the given position.\r\n     * \u003cP\u003e\r\n     * This method is required for the XML writer.\r\n     *\r\n     * @param pos the position in the list.\r\n     *\r\n     * @return The tickunit.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnits.getLargerTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 128,
      "end_line": 141,
      "comment": "\r\n     * Returns a tick unit that is larger than the supplied unit.\r\n     *\r\n     * @param unit   the unit.\r\n     *\r\n     * @return A tick unit that is larger than the supplied unit.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 67)",
        "(line 131,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 139,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnits.getCeilingTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 151,
      "end_line": 163,
      "comment": "\r\n     * Returns the tick unit in the collection that is greater than or equal\r\n     * to (in size) the specified unit.\r\n     *\r\n     * @param unit  the unit.\r\n     *\r\n     * @return A unit from the collection.\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 67)",
        "(line 154,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnits.getCeilingTickUnit(double)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\r\n     * Returns the tick unit in the collection that is greater than or equal\r\n     * to the specified size.\r\n     *\r\n     * @param size  the size.\r\n     *\r\n     * @return A unit from the collection.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 175,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnits.clone()",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\r\n     * Returns a clone of the collection.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if an item in the collection does not\r\n     *         support cloning.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 52)",
        "(line 188,col 9)-(line 188,col 66)",
        "(line 189,col 9)-(line 189,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnits.equals(java.lang.Object)",
      "begin_line": 199,
      "end_line": 208,
      "comment": "\r\n     * Tests an object for equality with this instance.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 41)",
        "(line 207,col 9)-(line 207,col 53)"
      ]
    }
  ]
}