{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/VectorXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorXYDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.xy.XYDataset"
      ],
      "begin_line": 53,
      "end_line": 89,
      "comment": "\r\n * An extension of the {@link XYDataset} interface that allows a vector to be\r\n * defined at a specific (x, y) location.\r\n *\r\n * @since 1.0.6\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorXYDataset.getVectorXValue(int, int)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\r\n     * Returns the x-component of the vector for an item in a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-component of the vector.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorXYDataset.getVectorYValue(int, int)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\r\n     * Returns the y-component of the vector for an item in a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-component of the vector.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorXYDataset.getVector(int, int)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\r\n     * Returns the vector for an item in a series.  Depending on the particular\r\n     * dataset implementation, this may involve creating a new {@link Vector}\r\n     * instance --- if you are just interested in the x and y components,\r\n     * use the {@link #getVectorXValue(int, int)} and\r\n     * {@link #getVectorYValue(int, int)} methods instead.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The vector (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    }
  ]
}