{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/AbstractXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractSeriesDataset",
        "org.jfree.data.xy.XYDataset"
      ],
      "begin_line": 54,
      "end_line": 131,
      "comment": "\r\n * An base class that you can use to create new implementations of the\r\n * {@link XYDataset} interface.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.getDomainOrder()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\r\n     * Returns the order of the domain (X) values.\r\n     *\r\n     * @return The domain order.\r\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.getXValue(int, int)",
      "begin_line": 74,
      "end_line": 81,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 35)",
        "(line 76,col 9)-(line 76,col 38)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.getYValue(int, int)",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 35)",
        "(line 93,col 9)-(line 93,col 38)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "selectionState"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\r\n     * The dataset selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.getSelectionState()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the selection state for this dataset, if any.  The default\r\n     * value is \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.setSelectionState(org.jfree.data.xy.XYDatasetSelectionState)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\r\n     * Sets the selection state for this dataset.\r\n     *\r\n     * @param state  the selection state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 29)"
      ]
    }
  ]
}