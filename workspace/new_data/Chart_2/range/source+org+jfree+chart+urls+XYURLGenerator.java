{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/urls/XYURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYURLGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 71,
      "comment": "\r\n * Interface for a URL generator for plots that uses data from an\r\n * {@link XYDataset}.  Classes that implement this interface are responsible\r\n * for correctly escaping any text that is derived from the dataset, as this\r\n * may be user-specified and could pose a security risk.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.XYURLGenerator.generateURL(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\r\n     * Generates a URL for a particular item within a series. As a guideline,\r\n     * the URL should be valid within the context of an XHTML 1.0 document.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A string containing the generated URL (possibly\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    }
  ]
}