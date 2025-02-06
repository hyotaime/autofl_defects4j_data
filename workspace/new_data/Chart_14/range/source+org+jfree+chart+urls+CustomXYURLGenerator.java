{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/urls/CustomXYURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CustomXYURLGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.urls.XYURLGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 190,
      "comment": "\r\n * A custom URL generator.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "urlSeries"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Storage for the URLs. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.CustomXYURLGenerator()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.getListCount()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Returns the number of URL lists stored by the renderer.\r\n     *\r\n     * @return The list count.\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.getURLCount(int)",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\r\n     * Returns the number of URLs in a given list.\r\n     *\r\n     * @param list  the list index (zero based).\r\n     *\r\n     * @return The URL count.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 23)",
        "(line 90,col 9)-(line 90,col 52)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.getURL(int, int)",
      "begin_line": 105,
      "end_line": 116,
      "comment": "\r\n     * Returns the URL for an item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 29)",
        "(line 107,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.generateURL(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Generates a URL.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A string containing the URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.addURLSeries(java.util.List)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Adds a list of URLs.\r\n     *\r\n     * @param urls  the list of URLs.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.CustomXYURLGenerator.equals(java.lang.Object)",
      "begin_line": 147,
      "end_line": 188,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param o  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 66)",
        "(line 160,col 9)-(line 160,col 39)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 20)"
      ]
    }
  ]
}