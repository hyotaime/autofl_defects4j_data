{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/LegendItemCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendItemCollection",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 154,
      "comment": "\r\n * A collection of legend items.\r\n "
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
        "items"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Storage for the legend items. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItemCollection.LegendItemCollection()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Constructs a new legend item collection, initially empty.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.add(org.jfree.chart.LegendItem)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Adds a legend item to the collection.\r\n     *\r\n     * @param item  the item to add.\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.addAll(org.jfree.chart.LegendItemCollection)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Adds the legend items from another collection to this collection.\r\n     *\r\n     * @param collection  the other collection.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.get(int)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Returns a legend item from the collection.\r\n     *\r\n     * @param index  the legend item index (zero-based).\r\n     *\r\n     * @return The legend item.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.getItemCount()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns the number of legend items in the collection.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.iterator()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns an iterator that provides access to all the legend items.\r\n     *\r\n     * @return An iterator.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.equals(java.lang.Object)",
      "begin_line": 126,
      "end_line": 138,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 63)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItemCollection.clone()",
      "begin_line": 148,
      "end_line": 152,
      "comment": "\r\n     * Returns a clone of the collection.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if an item in the collection is not\r\n     *         cloneable.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 74)",
        "(line 150,col 9)-(line 150,col 67)",
        "(line 151,col 9)-(line 151,col 21)"
      ]
    }
  ]
}