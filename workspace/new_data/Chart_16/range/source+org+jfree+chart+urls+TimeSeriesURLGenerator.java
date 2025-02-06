{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/urls/TimeSeriesURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeriesURLGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.urls.XYURLGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 239,
      "comment": "\r\n * A URL generator for time series charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormat"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " A formatter for the date. "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Prefix to the URL "
    },
    {
      "type": "field",
      "varNames": [
        "seriesParameterName"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Name to use to identify the series "
    },
    {
      "type": "field",
      "varNames": [
        "itemParameterName"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Name to use to identify the item "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.TimeSeriesURLGenerator.TimeSeriesURLGenerator()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.TimeSeriesURLGenerator.TimeSeriesURLGenerator(java.text.DateFormat, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 100,
      "end_line": 123,
      "comment": "\r\n     * Construct TimeSeriesURLGenerator overriding defaults.\r\n     *\r\n     * @param dateFormat  a formatter for the date (\u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * @param prefix  the prefix of the URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesParameterName  the name of the series parameter in the URL\r\n     *         (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param itemParameterName  the name of the item parameter in the URL \r\n     *         (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 29)",
        "(line 120,col 9)-(line 120,col 55)",
        "(line 121,col 9)-(line 121,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.TimeSeriesURLGenerator.getDateFormat()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns a clone of the date format assigned to this URL generator.\r\n     * \r\n     * @return The date format (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.TimeSeriesURLGenerator.getPrefix()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the prefix string.\r\n     * \r\n     * @return The prefix string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.TimeSeriesURLGenerator.getSeriesParameterName()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Returns the series parameter name.\r\n     * \r\n     * @return The series parameter name (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.TimeSeriesURLGenerator.getItemParameterName()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Returns the item parameter name.\r\n     * \r\n     * @return The item parameter name (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.TimeSeriesURLGenerator.generateURL(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 178,
      "end_line": 207,
      "comment": "\r\n     * Generates a URL for a particular item within a series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series number (zero-based index).\r\n     * @param item  the item number (zero-based index).\r\n     *\r\n     * @return The generated URL.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 36)",
        "(line 180,col 9)-(line 180,col 59)",
        "(line 181,col 9)-(line 181,col 60)",
        "(line 182,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 56)",
        "(line 196,col 9)-(line 196,col 60)",
        "(line 197,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 198,col 24)",
        "(line 199,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 51)",
        "(line 206,col 9)-(line 206,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.TimeSeriesURLGenerator.equals(java.lang.Object)",
      "begin_line": 216,
      "end_line": 237,
      "comment": "\r\n     * Tests this generator for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 67)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 20)"
      ]
    }
  ]
}