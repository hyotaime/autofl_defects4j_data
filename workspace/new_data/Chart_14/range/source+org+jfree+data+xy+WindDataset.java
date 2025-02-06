{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/WindDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WindDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.xy.XYDataset"
      ],
      "begin_line": 48,
      "end_line": 77,
      "comment": "\r\n * Interface for a dataset that supplies wind intensity and direction values\r\n * observed at various points in time.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataset.getWindDirection(int, int)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\r\n     * Returns the wind direction (should be in the range 0 to 12, \r\n     * corresponding to the positions on an upside-down clock face).\r\n     * \r\n     * @param series  the series (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series) - 1\u003c/code\u003e).\r\n     * \r\n     * @return The wind direction.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataset.getWindForce(int, int)",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\r\n     * Returns the wind force on the Beaufort scale (0 to 12).  See:\r\n     * \u003cp\u003e\r\n     * http://en.wikipedia.org/wiki/Beaufort_scale\r\n     * \r\n     * @param series  the series (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series) - 1\u003c/code\u003e).\r\n     *     \r\n     * @return The wind force.\r\n     ",
      "child_ranges": []
    }
  ]
}