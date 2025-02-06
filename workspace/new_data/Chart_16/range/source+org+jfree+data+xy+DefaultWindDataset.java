{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/DefaultWindDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultWindDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.WindDataset"
      ],
      "begin_line": 57,
      "end_line": 320,
      "comment": "\r\n * A default implementation of the {@link WindDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The keys for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "allSeriesData"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Storage for the series data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultWindDataset.DefaultWindDataset()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\r\n     * Constructs a new, empty, dataset.  Since there are currently no methods\r\n     * to add data to an existing dataset, you should probably use a different\r\n     * constructor.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 52)",
        "(line 73,col 9)-(line 73,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultWindDataset.DefaultWindDataset(java.lang.Object[][][])",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Constructs a dataset based on the specified data array.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultWindDataset.DefaultWindDataset(java.lang.String[], java.lang.Object[][][])",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Constructs a dataset based on the specified data array.\r\n     *\r\n     * @param seriesNames  the names of the series (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     * @param data  the wind data.\r\n     * \r\n     * @throws NullPointerException if \u003ccode\u003eseriesNames\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultWindDataset.DefaultWindDataset(java.util.List, java.lang.Object[][][])",
      "begin_line": 125,
      "end_line": 166,
      "comment": "\r\n     * Constructs a dataset based on the specified data array.  The array\r\n     * can contain multiple series, each series can contain multiple items,\r\n     * and each item is as follows:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003edata[series][item][0]\u003c/code\u003e - the date (either a \r\n     *   \u003ccode\u003eDate\u003c/code\u003e or a \u003ccode\u003eNumber\u003c/code\u003e that is the milliseconds \r\n     *   since 1-Jan-1970);\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003edata[series][item][1]\u003c/code\u003e - the wind direction (1 - 12, \r\n     *   like the numbers on a clock face);\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003edata[series][item][2]\u003c/code\u003e - the wind force (1 - 12 on the\r\n     *   Beaufort scale)\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @param seriesKeys  the names of the series (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     * @param data  the wind dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseriesKeys\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * @throws IllegalArgumentException if the number of series keys does not\r\n     *     match the number of series in the array.\r\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 37)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 135,col 66)",
        "(line 137,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getSeriesCount()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     * \r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getItemCount(int)",
      "begin_line": 184,
      "end_line": 191,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * \r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 67)",
        "(line 190,col 9)-(line 190,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getSeriesKey(int)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\r\n     * Returns the key for a series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * \r\n     * @return The series key.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getX(int, int)",
      "begin_line": 218,
      "end_line": 222,
      "comment": "\r\n     * Returns the x-value for one item within a series.  This should represent\r\n     * a point in time, encoded as milliseconds in the same way as\r\n     * java.util.Date.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The x-value for the item within the series.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 67)",
        "(line 220,col 9)-(line 220,col 71)",
        "(line 221,col 9)-(line 221,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getY(int, int)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n     * Returns the y-value for one item within a series.  This maps to the\r\n     * {@link #getWindForce(int, int)} method and is implemented because \r\n     * \u003ccode\u003eWindDataset\u003c/code\u003e is an extension of {@link XYDataset}.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The y-value for the item within the series.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getWindDirection(int, int)",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\r\n     * Returns the wind direction for one item within a series.  This is a\r\n     * number between 0 and 12, like the numbers on an upside-down clock face.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The wind direction for the item within the series.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 67)",
        "(line 249,col 9)-(line 249,col 71)",
        "(line 250,col 9)-(line 250,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.getWindForce(int, int)",
      "begin_line": 262,
      "end_line": 266,
      "comment": "\r\n     * Returns the wind force for one item within a series.  This is a number\r\n     * between 0 and 12, as defined by the Beaufort scale.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The wind force for the item within the series.\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 67)",
        "(line 264,col 9)-(line 264,col 71)",
        "(line 265,col 9)-(line 265,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(java.lang.Object[][])",
      "begin_line": 277,
      "end_line": 286,
      "comment": "\r\n     * Utility method for automatically generating series names.\r\n     * \r\n     * @param data  the wind data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return An array of \u003ci\u003eSeries N\u003c/i\u003e with N \u003d { 1 .. data.length }.\r\n     * \r\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 38)",
        "(line 280,col 9)-(line 280,col 67)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultWindDataset.equals(java.lang.Object)",
      "begin_line": 303,
      "end_line": 318,
      "comment": "\r\n     * Checks this \u003ccode\u003eWindDataset\u003c/code\u003e for equality with an arbitrary\r\n     * object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     *   \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \r\n     *       \u003ccode\u003eDefaultWindDataset\u003c/code\u003e;\u003c/li\u003e\r\n     *   \u003cli\u003eboth datasets have the same number of series containing identical\r\n     *       values.\u003c/li\u003e\r\n     * \u003cul\u003e\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 59)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 20)"
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
      "begin_line": 325,
      "end_line": 429,
      "comment": "\r\n * A wind data item.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " The x-value. "
    },
    {
      "type": "field",
      "varNames": [
        "windDir"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " The wind direction. "
    },
    {
      "type": "field",
      "varNames": [
        "windForce"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " The wind force. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.WindDataItem.WindDataItem(java.lang.Number, java.lang.Number, java.lang.Number)",
      "begin_line": 343,
      "end_line": 347,
      "comment": "\r\n     * Creates a new wind data item.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param windDir  the direction.\r\n     * @param windForce  the force.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 19)",
        "(line 345,col 9)-(line 345,col 31)",
        "(line 346,col 9)-(line 346,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.getX()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\r\n     * Returns the x-value.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.getWindDirection()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\r\n     * Returns the wind direction.\r\n     *\r\n     * @return The wind direction.\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.getWindForce()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\r\n     * Returns the wind force.\r\n     *\r\n     * @return The wind force.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.compareTo(java.lang.Object)",
      "begin_line": 383,
      "end_line": 399,
      "comment": "\r\n     * Compares this item to another object.\r\n     *\r\n     * @param object  the other object.\r\n     *\r\n     * @return An int that indicates the relative comparison.\r\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.WindDataItem.equals(java.lang.Object)",
      "begin_line": 409,
      "end_line": 427,
      "comment": "\r\n     * Tests this \u003ccode\u003eWindDataItem\u003c/code\u003e for equality with an arbitrary\r\n     * object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 47)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 20)"
      ]
    }
  ]
}