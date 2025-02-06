{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/AbstractXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractSeriesDataset",
        "org.jfree.data.xy.XYDataset"
      ],
      "begin_line": 55,
      "end_line": 133,
      "comment": "\r\n * An base class that you can use to create new implementations of the\r\n * {@link XYDataset} interface.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.getDomainOrder()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\r\n     * Returns the order of the domain (X) values.\r\n     *\r\n     * @return The domain order.\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.getXValue(int, int)",
      "begin_line": 75,
      "end_line": 82,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 35)",
        "(line 77,col 9)-(line 77,col 38)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.getYValue(int, int)",
      "begin_line": 92,
      "end_line": 99,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 35)",
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "selectionState"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\r\n     * The dataset selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.getSelectionState()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Returns the selection state for this dataset, if any.  The default\r\n     * value is \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.AbstractXYDataset.setSelectionState(org.jfree.data.xy.XYDatasetSelectionState)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "\r\n     * Sets the selection state for this dataset.\r\n     *\r\n     * @param state  the selection state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 52)"
      ]
    }
  ]
}