{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/urls/StandardCategoryURLGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardCategoryURLGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.urls.CategoryURLGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 217,
      "comment": "\r\n * A URL generator that can be assigned to a\r\n * {@link org.jfree.chart.renderer.category.CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Prefix to the URL "
    },
    {
      "type": "field",
      "varNames": [
        "seriesParameterName"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Series parameter name to go in each URL "
    },
    {
      "type": "field",
      "varNames": [
        "categoryParameterName"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Category parameter name to go in each URL "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardCategoryURLGenerator.StandardCategoryURLGenerator()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Creates a new generator with default settings.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardCategoryURLGenerator.StandardCategoryURLGenerator(java.lang.String)",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\r\n     * Constructor that overrides default prefix to the URL.\r\n     *\r\n     * @param prefix  the prefix to the URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.urls.StandardCategoryURLGenerator.StandardCategoryURLGenerator(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 113,
      "end_line": 132,
      "comment": "\r\n     * Constructor that overrides all the defaults.\r\n     *\r\n     * @param prefix  the prefix to the URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesParameterName  the name of the series parameter to go in\r\n     *                             each URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param categoryParameterName  the name of the category parameter to go in\r\n     *                               each URL (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 29)",
        "(line 129,col 9)-(line 129,col 55)",
        "(line 130,col 9)-(line 130,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.StandardCategoryURLGenerator.generateURL(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 143,
      "end_line": 168,
      "comment": "\r\n     * Generates a URL for a particular item within a series.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param category  the category index (zero-based).\r\n     *\r\n     * @return The generated URL.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)",
        "(line 146,col 9)-(line 146,col 57)",
        "(line 147,col 9)-(line 147,col 64)",
        "(line 148,col 9)-(line 148,col 56)",
        "(line 149,col 9)-(line 149,col 46)",
        "(line 150,col 9)-(line 150,col 46)",
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 37)",
        "(line 159,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 166,col 33)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.StandardCategoryURLGenerator.equals(java.lang.Object)",
      "begin_line": 177,
      "end_line": 198,
      "comment": "\r\n     * Tests the generator for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 79)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.urls.StandardCategoryURLGenerator.hashCode()",
      "begin_line": 205,
      "end_line": 215,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 19)",
        "(line 207,col 9)-(line 207,col 68)",
        "(line 208,col 9)-(line 210,col 63)",
        "(line 211,col 9)-(line 213,col 65)",
        "(line 214,col 9)-(line 214,col 22)"
      ]
    }
  ]
}