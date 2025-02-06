{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/urls/StandardXYURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardXYURLGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.urls.XYURLGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 178,
      "comment": "\r\n * A URL generator.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The default prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SERIES_PARAMETER"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The default series parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ITEM_PARAMETER"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The default item parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Prefix to the URL "
    },
    {
      "type": "field",
      "varNames": [
        "seriesParameterName"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Series parameter name to go in each URL "
    },
    {
      "type": "field",
      "varNames": [
        "itemParameterName"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Item parameter name to go in each URL "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardXYURLGenerator.StandardXYURLGenerator()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Creates a new default generator.  This constructor is equivalent to\r\n     * calling \u003ccode\u003eStandardXYURLGenerator(\"index.html\", \"series\", \"item\");\r\n     * \u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardXYURLGenerator.StandardXYURLGenerator(java.lang.String)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Creates a new generator with the specified prefix.  This constructor \r\n     * is equivalent to calling \r\n     * \u003ccode\u003eStandardXYURLGenerator(prefix, \"series\", \"item\");\u003c/code\u003e.\r\n     *\r\n     * @param prefix  the prefix to the URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardXYURLGenerator.StandardXYURLGenerator(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 112,
      "end_line": 129,
      "comment": "\r\n     * Constructor that overrides all the defaults\r\n     *\r\n     * @param prefix  the prefix to the URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesParameterName  the name of the series parameter to go in \r\n     *                             each URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param itemParameterName  the name of the item parameter to go in each\r\n     *                           URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 29)",
        "(line 127,col 9)-(line 127,col 55)",
        "(line 128,col 9)-(line 128,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.StandardXYURLGenerator.generateURL(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 140,
      "end_line": 147,
      "comment": "\r\n     * Generates a URL for a particular item within a series.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series number (zero-based index).\r\n     * @param item  the item number (zero-based index).\r\n     *\r\n     * @return The generated URL.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 33)",
        "(line 142,col 9)-(line 142,col 56)",
        "(line 143,col 9)-(line 143,col 46)",
        "(line 144,col 9)-(line 145,col 64)",
        "(line 146,col 9)-(line 146,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.StandardXYURLGenerator.equals(java.lang.Object)",
      "begin_line": 156,
      "end_line": 176,
      "comment": "\r\n     * Tests this generator for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 67)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 20)"
      ]
    }
  ]
}