{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/urls/PieURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieURLGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 65,
      "end_line": 80,
      "comment": "\r\n * Interface for a URL generator for plots that use data from a\r\n * {@link PieDataset}.  Classes that implement this interface:\r\n * \u003cul\u003e\r\n * \u003cli\u003eare responsible for correctly escaping any text that is derived from the\r\n *     dataset, as this may be user-specified and could pose a security\r\n *     risk;\u003c/li\u003e\r\n * \u003cli\u003eshould be either (a) immutable, or (b) cloneable via the\r\n *     \u003ccode\u003ePublicCloneable\u003c/code\u003e interface (defined in the JCommon class\r\n *     library).  This provides a mechanism for the referring plot to clone\r\n *     the generator if necessary.\u003c/li\u003e\r\n * \u003c/ul\u003e\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.PieURLGenerator.generateURL(org.jfree.data.general.PieDataset, java.lang.Comparable, int)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\r\n     * Generates a URL for one item in a {@link PieDataset}. As a guideline,\r\n     * the URL should be valid within the context of an XHTML 1.0 document.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the item key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param pieIndex  the pie index (differentiates between pies in a\r\n     *                  \u0027multi\u0027 pie chart).\r\n     *\r\n     * @return A string containing the URL.\r\n     ",
      "child_ranges": []
    }
  ]
}