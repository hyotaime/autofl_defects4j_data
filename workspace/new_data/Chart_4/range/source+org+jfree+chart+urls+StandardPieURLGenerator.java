{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/urls/StandardPieURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardPieURLGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.urls.PieURLGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 190,
      "comment": "\r\n * A URL generator for pie charts.  Instances of this class are immutable.\r\n "
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
        "prefix"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryParameterName"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The category parameter name. "
    },
    {
      "type": "field",
      "varNames": [
        "indexParameterName"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The pie index parameter name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardPieURLGenerator.StandardPieURLGenerator()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardPieURLGenerator.StandardPieURLGenerator(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Creates a new generator.\r\n     *\r\n     * @param prefix  the prefix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardPieURLGenerator.StandardPieURLGenerator(java.lang.String, java.lang.String)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\r\n     * Creates a new generator.\r\n     *\r\n     * @param prefix  the prefix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param categoryParameterName  the category parameter name\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardPieURLGenerator.StandardPieURLGenerator(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 116,
      "end_line": 129,
      "comment": "\r\n     * Creates a new generator.\r\n     *\r\n     * @param prefix  the prefix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param categoryParameterName  the category parameter name\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param indexParameterName  the index parameter name (\u003ccode\u003enull\u003c/code\u003e\r\n     *     permitted).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 29)",
        "(line 127,col 9)-(line 127,col 59)",
        "(line 128,col 9)-(line 128,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.StandardPieURLGenerator.generateURL(org.jfree.data.general.PieDataset, java.lang.Comparable, int)",
      "begin_line": 140,
      "end_line": 161,
      "comment": "\r\n     * Generates a URL.\r\n     *\r\n     * @param dataset  the dataset (ignored).\r\n     * @param key  the item key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param pieIndex  the pie index.\r\n     *\r\n     * @return A string containing the generated URL.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.StandardPieURLGenerator.equals(java.lang.Object)",
      "begin_line": 170,
      "end_line": 189,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 69)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 20)"
      ]
    }
  ]
}