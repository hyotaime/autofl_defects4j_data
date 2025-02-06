{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/LegendItemCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendItemCollection",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 149,
      "comment": "\r\n * A collection of legend items.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "items"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Storage for the legend items. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItemCollection.LegendItemCollection()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\r\n     * Constructs a new legend item collection, initially empty.\r\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.add(org.jfree.chart.LegendItem)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\r\n     * Adds a legend item to the collection.\r\n     *\r\n     * @param item  the item to add.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.addAll(org.jfree.chart.LegendItemCollection)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Adds the legend items from another collection to this collection.\r\n     *\r\n     * @param collection  the other collection.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.get(int)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Returns a legend item from the collection.\r\n     *\r\n     * @param index  the legend item index (zero-based).\r\n     *\r\n     * @return The legend item.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.getItemCount()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Returns the number of legend items in the collection.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.iterator()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns an iterator that provides access to all the legend items.\r\n     *\r\n     * @return An iterator.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.equals(java.lang.Object)",
      "begin_line": 123,
      "end_line": 135,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 63)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.clone()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\r\n     * Returns a clone of the collection.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if an item in the collection is not\r\n     *         cloneable.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 29)"
      ]
    }
  ]
}