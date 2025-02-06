{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/urls/CustomXYURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CustomXYURLGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.urls.XYURLGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 208,
      "comment": "\r\n * A custom URL generator.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "urlSeries"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Storage for the URLs. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.CustomXYURLGenerator()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.getListCount()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Returns the number of URL lists stored by the renderer.\r\n     *\r\n     * @return The list count.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.getURLCount(int)",
      "begin_line": 92,
      "end_line": 99,
      "comment": "\r\n     * Returns the number of URLs in a given list.\r\n     *\r\n     * @param list  the list index (zero based).\r\n     *\r\n     * @return The URL count.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 23)",
        "(line 94,col 9)-(line 94,col 52)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.getURL(int, int)",
      "begin_line": 109,
      "end_line": 120,
      "comment": "\r\n     * Returns the URL for an item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 29)",
        "(line 111,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.generateURL(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Generates a URL.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A string containing the URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.addURLSeries(java.util.List)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\r\n     * Adds a list of URLs.\r\n     *\r\n     * @param urls  the list of URLs (\u003ccode\u003enull\u003c/code\u003e permitted, the list\r\n     *     is copied).\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 30)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.equals(java.lang.Object)",
      "begin_line": 156,
      "end_line": 192,
      "comment": "\r\n     * Tests this generator for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 63)",
        "(line 164,col 9)-(line 164,col 39)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.clone()",
      "begin_line": 202,
      "end_line": 206,
      "comment": "\r\n     * Returns a new generator that is a copy of, and independent from, this\r\n     * generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem with cloning.\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 74)",
        "(line 204,col 9)-(line 204,col 66)",
        "(line 205,col 9)-(line 205,col 21)"
      ]
    }
  ]
}