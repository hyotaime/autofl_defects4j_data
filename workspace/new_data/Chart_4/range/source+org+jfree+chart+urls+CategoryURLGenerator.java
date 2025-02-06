{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/urls/CategoryURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryURLGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 78,
      "comment": "\r\n * A URL generator for items in a {@link CategoryDataset}.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CategoryURLGenerator.generateURL(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 75,
      "end_line": 76,
      "comment": "\r\n     * Returns a URL for one item in a dataset. As a guideline, the URL\r\n     * should be valid within the context of an XHTML 1.0 document.  Classes\r\n     * that implement this interface are responsible for correctly escaping\r\n     * any text that is derived from the dataset, as this may be user-specified\r\n     * and could pose a security risk.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category.\r\n     *\r\n     * @return A string containing the URL.\r\n     ",
      "child_ranges": []
    }
  ]
}