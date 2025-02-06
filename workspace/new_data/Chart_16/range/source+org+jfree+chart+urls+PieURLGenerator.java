{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/urls/PieURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieURLGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 74,
      "comment": "\r\n * Interface for a URL generator for plots that use data from a \r\n * {@link PieDataset}.\r\n * \u003cP\u003e\r\n * Classes that implement this interface should be either (a) immutable, or\r\n * (b) cloneable via the \u003ccode\u003ePublicCloneable\u003c/code\u003e interface (defined in \r\n * the JCommon class library).  This provides a mechanism for the referring\r\n * plot to clone the generator if necessary.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.PieURLGenerator.generateURL(org.jfree.data.general.PieDataset, java.lang.Comparable, int)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * Generates a URL for one item in a {@link PieDataset}. As a guideline, \r\n     * the URL should be valid within the context of an XHTML 1.0 document.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the item key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param pieIndex  the pie index (differentiates between pies in a \r\n     *                  \u0027multi\u0027 pie chart).\r\n     *\r\n     * @return A string containing the URL.\r\n     ",
      "child_ranges": []
    }
  ]
}