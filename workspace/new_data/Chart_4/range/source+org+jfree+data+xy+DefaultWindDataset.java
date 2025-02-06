{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/DefaultWindDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultWindDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.WindDataset",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 60,
      "end_line": 323,
      "comment": "\r\n * A default implementation of the {@link WindDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The keys for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "allSeriesData"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Storage for the series data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultWindDataset.DefaultWindDataset()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\r\n     * Constructs a new, empty, dataset.  Since there are currently no methods\r\n     * to add data to an existing dataset, you should probably use a different\r\n     * constructor.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 52)",
        "(line 76,col 9)-(line 76,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultWindDataset.DefaultWindDataset(java.lang.Object[][][])",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Constructs a dataset based on the specified data array.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultWindDataset.DefaultWindDataset(java.lang.String[], java.lang.Object[][][])",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Constructs a dataset based on the specified data array.\r\n     *\r\n     * @param seriesNames  the names of the series (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param data  the wind data.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003eseriesNames\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultWindDataset.DefaultWindDataset(java.util.List, java.lang.Object[][][])",
      "begin_line": 128,
      "end_line": 169,
      "comment": "\r\n     * Constructs a dataset based on the specified data array.  The array\r\n     * can contain multiple series, each series can contain multiple items,\r\n     * and each item is as follows:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003edata[series][item][0]\u003c/code\u003e - the date (either a\r\n     *   \u003ccode\u003eDate\u003c/code\u003e or a \u003ccode\u003eNumber\u003c/code\u003e that is the milliseconds\r\n     *   since 1-Jan-1970);\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003edata[series][item][1]\u003c/code\u003e - the wind direction (1 - 12,\r\n     *   like the numbers on a clock face);\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003edata[series][item][2]\u003c/code\u003e - the wind force (1 - 12 on the\r\n     *   Beaufort scale)\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param seriesKeys  the names of the series (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param data  the wind dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseriesKeys\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * @throws IllegalArgumentException if the number of series keys does not\r\n     *     match the number of series in the array.\r\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 37)",
        "(line 137,col 9)-(line 137,col 38)",
        "(line 138,col 9)-(line 138,col 66)",
        "(line 140,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getSeriesCount()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getItemCount(int)",
      "begin_line": 187,
      "end_line": 194,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 67)",
        "(line 193,col 9)-(line 193,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getSeriesKey(int)",
      "begin_line": 203,
      "end_line": 209,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The series key.\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getX(int, int)",
      "begin_line": 221,
      "end_line": 225,
      "comment": "\r\n     * Returns the x-value for one item within a series.  This should represent\r\n     * a point in time, encoded as milliseconds in the same way as\r\n     * java.util.Date.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value for the item within the series.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 67)",
        "(line 223,col 9)-(line 223,col 71)",
        "(line 224,col 9)-(line 224,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getY(int, int)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the y-value for one item within a series.  This maps to the\r\n     * {@link #getWindForce(int, int)} method and is implemented because\r\n     * \u003ccode\u003eWindDataset\u003c/code\u003e is an extension of {@link XYDataset}.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value for the item within the series.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getWindDirection(int, int)",
      "begin_line": 250,
      "end_line": 254,
      "comment": "\r\n     * Returns the wind direction for one item within a series.  This is a\r\n     * number between 0 and 12, like the numbers on an upside-down clock face.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The wind direction for the item within the series.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 67)",
        "(line 252,col 9)-(line 252,col 71)",
        "(line 253,col 9)-(line 253,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getWindForce(int, int)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "\r\n     * Returns the wind force for one item within a series.  This is a number\r\n     * between 0 and 12, as defined by the Beaufort scale.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The wind force for the item within the series.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 67)",
        "(line 267,col 9)-(line 267,col 71)",
        "(line 268,col 9)-(line 268,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(java.lang.Object[][])",
      "begin_line": 280,
      "end_line": 289,
      "comment": "\r\n     * Utility method for automatically generating series names.\r\n     *\r\n     * @param data  the wind data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return An array of \u003ci\u003eSeries N\u003c/i\u003e with N \u003d { 1 .. data.length }.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 283,col 67)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.equals(java.lang.Object)",
      "begin_line": 306,
      "end_line": 321,
      "comment": "\r\n     * Checks this \u003ccode\u003eWindDataset\u003c/code\u003e for equality with an arbitrary\r\n     * object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     *   \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of\r\n     *       \u003ccode\u003eDefaultWindDataset\u003c/code\u003e;\u003c/li\u003e\r\n     *   \u003cli\u003eboth datasets have the same number of series containing identical\r\n     *       values.\u003c/li\u003e\r\n     * \u003cul\u003e\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 59)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WindDataItem",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 328,
      "end_line": 432,
      "comment": "\r\n * A wind data item.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " The x-value. "
    },
    {
      "type": "field",
      "varNames": [
        "windDir"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " The wind direction. "
    },
    {
      "type": "field",
      "varNames": [
        "windForce"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": " The wind force. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.WindDataItem.WindDataItem(java.lang.Number, java.lang.Number, java.lang.Number)",
      "begin_line": 346,
      "end_line": 350,
      "comment": "\r\n     * Creates a new wind data item.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param windDir  the direction.\r\n     * @param windForce  the force.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 19)",
        "(line 348,col 9)-(line 348,col 31)",
        "(line 349,col 9)-(line 349,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.getX()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\r\n     * Returns the x-value.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.getWindDirection()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the wind direction.\r\n     *\r\n     * @return The wind direction.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.getWindForce()",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\r\n     * Returns the wind force.\r\n     *\r\n     * @return The wind force.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.compareTo(java.lang.Object)",
      "begin_line": 386,
      "end_line": 402,
      "comment": "\r\n     * Compares this item to another object.\r\n     *\r\n     * @param object  the other object.\r\n     *\r\n     * @return An int that indicates the relative comparison.\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.equals(java.lang.Object)",
      "begin_line": 412,
      "end_line": 430,
      "comment": "\r\n     * Tests this \u003ccode\u003eWindDataItem\u003c/code\u003e for equality with an arbitrary\r\n     * object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 47)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 20)"
      ]
    }
  ]
}