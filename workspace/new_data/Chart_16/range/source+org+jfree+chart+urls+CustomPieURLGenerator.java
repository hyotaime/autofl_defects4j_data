{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/urls/CustomPieURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CustomPieURLGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.urls.PieURLGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 226,
      "comment": "\r\n * A custom URL generator for pie charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "urls"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Storage for the URLs. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.CustomPieURLGenerator.CustomPieURLGenerator()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\r\n     * Creates a new \u003ccode\u003eCustomPieURLGenerator\u003c/code\u003e instance, initially\r\n     * empty.  Call {@link #addURLs(Map)} to specify the URL fragments to be\r\n     * used.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomPieURLGenerator.generateURL(org.jfree.data.general.PieDataset, java.lang.Comparable, int)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\r\n     * Generates a URL fragment.\r\n     *\r\n     * @param dataset  the dataset (ignored).\r\n     * @param key  the item key.\r\n     * @param pieIndex  the pie index.\r\n     *\r\n     * @return A string containing the generated URL.\r\n     * \r\n     * @see #getURL(Comparable, int)\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomPieURLGenerator.getListCount()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Returns the number of URL maps stored by the renderer.\r\n     * \r\n     * @return The list count.\r\n     * \r\n     * @see #addURLs(Map)\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomPieURLGenerator.getURLCount(int)",
      "begin_line": 116,
      "end_line": 123,
      "comment": "\r\n     * Returns the number of URLs in a given map (specified by its position \r\n     * in the map list).\r\n     * \r\n     * @param list  the list index (zero based).\r\n     * \r\n     * @return The URL count.\r\n     * \r\n     * @see #getListCount()\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 23)",
        "(line 118,col 9)-(line 118,col 47)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomPieURLGenerator.getURL(java.lang.Comparable, int)",
      "begin_line": 133,
      "end_line": 142,
      "comment": "\r\n     * Returns the URL for a section in the specified map.\r\n     * \r\n     * @param key  the key.\r\n     * @param mapIndex  the map index.\r\n     * \r\n     * @return The URL.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)",
        "(line 135,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomPieURLGenerator.addURLs(java.util.Map)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Adds a map containing \u003ccode\u003e(key, URL)\u003c/code\u003e mappings where each\r\n     * \u003ccode\u003ekey\u003c/code\u003e is an instance of \u003ccode\u003eComparable\u003c/code\u003e \r\n     * (corresponding to the key for an item in a pie dataset) and each \r\n     * \u003ccode\u003eURL\u003c/code\u003e is a \u003ccode\u003eString\u003c/code\u003e representing a URL fragment.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * The map is appended to an internal list...you can add multiple maps\r\n     * if you are working with, say, a {@link MultiplePiePlot}.\r\n     * \r\n     * @param urlMap  the URLs (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomPieURLGenerator.equals(java.lang.Object)",
      "begin_line": 166,
      "end_line": 195,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     * \r\n     * @param o  the other object.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomPieURLGenerator.clone()",
      "begin_line": 204,
      "end_line": 224,
      "comment": "\r\n     * Returns a clone of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 67)",
        "(line 206,col 9)-(line 206,col 16)",
        "(line 207,col 9)-(line 207,col 19)",
        "(line 208,col 9)-(line 208,col 19)",
        "(line 210,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 22)"
      ]
    }
  ]
}