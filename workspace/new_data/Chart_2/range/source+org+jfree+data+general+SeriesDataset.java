{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/SeriesDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SeriesDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.general.Dataset"
      ],
      "begin_line": 61,
      "end_line": 90,
      "comment": "\r\n * The interface for a dataset consisting of one or many series of data.\r\n *\r\n * @see CategoryDataset\r\n * @see IntervalXYDataset\r\n * @see IntervalXYZDataset\r\n * @see XYDataset\r\n * @see XYZDataset\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesDataset.getSeriesCount()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesDataset.getSeriesKey(int)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for the series.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesDataset.indexOf(java.lang.Comparable)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\r\n     * Returns the index of the series with the specified key, or -1 if there\r\n     * is no such series in the dataset.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The index, or -1.\r\n     ",
      "child_ranges": []
    }
  ]
}