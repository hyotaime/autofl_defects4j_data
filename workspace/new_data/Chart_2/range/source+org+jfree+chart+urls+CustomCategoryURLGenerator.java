{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/urls/CustomCategoryURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CustomCategoryURLGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.urls.CategoryURLGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 197,
      "comment": "\r\n * A custom URL generator.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "urlSeries"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Storage for the URLs. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.CustomCategoryURLGenerator.CustomCategoryURLGenerator()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomCategoryURLGenerator.getListCount()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Returns the number of URL lists stored by the renderer.\r\n     *\r\n     * @return The list count.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomCategoryURLGenerator.getURLCount(int)",
      "begin_line": 83,
      "end_line": 90,
      "comment": "\r\n     * Returns the number of URLs in a given list.\r\n     *\r\n     * @param list  the list index (zero based).\r\n     *\r\n     * @return The URL count.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 23)",
        "(line 85,col 9)-(line 85,col 52)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomCategoryURLGenerator.getURL(int, int)",
      "begin_line": 100,
      "end_line": 111,
      "comment": "\r\n     * Returns the URL for an item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomCategoryURLGenerator.generateURL(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Generates a URL.\r\n     *\r\n     * @param dataset  the dataset (ignored in this implementation).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A string containing the URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomCategoryURLGenerator.addURLSeries(java.util.List)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\r\n     * Adds a list of URLs.\r\n     *\r\n     * @param urls  the list of URLs (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 30)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomCategoryURLGenerator.equals(java.lang.Object)",
      "begin_line": 146,
      "end_line": 180,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 80)",
        "(line 154,col 9)-(line 154,col 39)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomCategoryURLGenerator.clone()",
      "begin_line": 190,
      "end_line": 195,
      "comment": "\r\n     * Returns a new generator that is a copy of, and independent from, this\r\n     * generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem with cloning.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 192,col 61)",
        "(line 193,col 9)-(line 193,col 66)",
        "(line 194,col 9)-(line 194,col 21)"
      ]
    }
  ]
}