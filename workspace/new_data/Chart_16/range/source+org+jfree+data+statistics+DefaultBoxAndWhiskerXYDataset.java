{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/statistics/DefaultBoxAndWhiskerXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultBoxAndWhiskerXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.statistics.BoxAndWhiskerXYDataset",
        "org.jfree.data.RangeInfo"
      ],
      "begin_line": 74,
      "end_line": 503,
      "comment": "\r\n * A simple implementation of the {@link BoxAndWhiskerXYDataset}.  The dataset\r\n * can hold only one series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "dates"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Storage for the dates. "
    },
    {
      "type": "field",
      "varNames": [
        "items"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Storage for the box and whisker statistics. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The minimum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The maximum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeBounds"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The range of values. "
    },
    {
      "type": "field",
      "varNames": [
        "outlierCoefficient"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " \r\n     * The coefficient used to calculate outliers. Tukey\u0027s default value is \r\n     * 1.5 (see EDA) Any value which is greater than Q3 + (interquartile range \r\n     * * outlier coefficient) is considered to be an outlier.  Can be altered \r\n     * if the data is particularly skewed.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "faroutCoefficient"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " \r\n     * The coefficient used to calculate farouts. Tukey\u0027s default value is 2 \r\n     * (see EDA) Any value which is greater than Q3 + (interquartile range * \r\n     * farout coefficient) is considered to be a farout.  Can be altered if the \r\n     * data is particularly skewed.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.DefaultBoxAndWhiskerXYDataset(java.lang.Comparable)",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\r\n     * Constructs a new box and whisker dataset.\r\n     * \u003cp\u003e\r\n     * The current implementation allows only one series in the dataset.\r\n     * This may be extended in a future version.\r\n     *\r\n     * @param seriesKey  the key for the series.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 37)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.add(java.util.Date, org.jfree.data.statistics.BoxAndWhiskerItem)",
      "begin_line": 135,
      "end_line": 160,
      "comment": "\r\n     * Adds an item to the dataset.\r\n     * \r\n     * @param date  the date.\r\n     * @param item  the item.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 29)",
        "(line 137,col 9)-(line 137,col 29)",
        "(line 138,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 159,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getSeriesKey(int)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the name of the series stored in this dataset.\r\n     *\r\n     * @param i  the index of the series. Currently ignored.\r\n     * \r\n     * @return The name of this series.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getItem(int, int)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Return an item from within the dataset.\r\n     * \r\n     * @param series  the series index (ignored, since this dataset contains\r\n     *                only one series).\r\n     * @param item  the item within the series (zero-based index)\r\n     * \r\n     * @return The item.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getX(int, int)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\r\n     * Returns the x-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * The value returned is a Long object generated from the underlying Date \r\n     * object.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getXDate(int, int)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns the x-value for one item in a series, as a Date.\r\n     * \u003cp\u003e\r\n     * This method is provided for convenience only.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value as a Date.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getY(int, int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Returns the y-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * This method (from the XYDataset interface) is mapped to the \r\n     * getMaxNonOutlierValue() method.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMeanValue(int, int)",
      "begin_line": 238,
      "end_line": 245,
      "comment": "\r\n     * Returns the mean for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The mean for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 29)",
        "(line 240,col 9)-(line 240,col 75)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMedianValue(int, int)",
      "begin_line": 255,
      "end_line": 262,
      "comment": "\r\n     * Returns the median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 29)",
        "(line 257,col 9)-(line 257,col 75)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getQ1Value(int, int)",
      "begin_line": 272,
      "end_line": 279,
      "comment": "\r\n     * Returns the Q1 median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The Q1 median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 29)",
        "(line 274,col 9)-(line 274,col 75)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getQ3Value(int, int)",
      "begin_line": 289,
      "end_line": 296,
      "comment": "\r\n     * Returns the Q3 median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The Q3 median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 29)",
        "(line 291,col 9)-(line 291,col 75)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMinRegularValue(int, int)",
      "begin_line": 306,
      "end_line": 313,
      "comment": "\r\n     * Returns the min-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The min-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 29)",
        "(line 308,col 9)-(line 308,col 75)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMaxRegularValue(int, int)",
      "begin_line": 323,
      "end_line": 330,
      "comment": "\r\n     * Returns the max-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The max-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 29)",
        "(line 325,col 9)-(line 325,col 75)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMinOutlier(int, int)",
      "begin_line": 339,
      "end_line": 346,
      "comment": "\r\n     * Returns the minimum value which is not a farout.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A \u003ccode\u003eNumber\u003c/code\u003e representing the maximum non-farout value.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 29)",
        "(line 341,col 9)-(line 341,col 75)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMaxOutlier(int, int)",
      "begin_line": 357,
      "end_line": 364,
      "comment": "\r\n     * Returns the maximum value which is not a farout, ie Q3 + (interquartile \r\n     * range * farout coefficient).\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A \u003ccode\u003eNumber\u003c/code\u003e representing the maximum non-farout value.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 29)",
        "(line 359,col 9)-(line 359,col 75)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getOutliers(int, int)",
      "begin_line": 374,
      "end_line": 381,
      "comment": "\r\n     * Returns an array of outliers for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The array of outliers for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 27)",
        "(line 376,col 9)-(line 376,col 75)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getOutlierCoefficient()",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\r\n     * Returns the value used as the outlier coefficient. The outlier \r\n     * coefficient gives an indication of the degree of certainty in an \r\n     * unskewed distribution.  Increasing the coefficient increases the number \r\n     * of values included. Currently only used to ensure farout coefficient is \r\n     * greater than the outlier coefficient\r\n     *\r\n     * @return A \u003ccode\u003edouble\u003c/code\u003e representing the value used to calculate \r\n     *         outliers.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getFaroutCoefficient()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\r\n     * Returns the value used as the farout coefficient. The farout coefficient\r\n     * allows the calculation of which values will be off the graph.\r\n     *\r\n     * @return A \u003ccode\u003edouble\u003c/code\u003e representing the value used to calculate \r\n     *         farouts.\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getSeriesCount()",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     * \u003cp\u003e\r\n     * This implementation only allows one series.\r\n     *\r\n     * @return The number of series.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getItemCount(int)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the index (zero-based) of the series.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.setOutlierCoefficient(double)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\r\n     * Sets the value used as the outlier coefficient\r\n     *\r\n     * @param outlierCoefficient  being a \u003ccode\u003edouble\u003c/code\u003e representing the \r\n     *                            value used to calculate outliers.\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.setFaroutCoefficient(double)",
      "begin_line": 447,
      "end_line": 457,
      "comment": "\r\n     * Sets the value used as the farouts coefficient. The farout coefficient \r\n     * must b greater than the outlier coefficient.\r\n     * \r\n     * @param faroutCoefficient being a \u003ccode\u003edouble\u003c/code\u003e representing the \r\n     *                          value used to calculate farouts.\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeLowerBound(boolean)",
      "begin_line": 467,
      "end_line": 473,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 35)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeUpperBound(boolean)",
      "begin_line": 483,
      "end_line": 489,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 35)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeBounds(boolean)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 32)"
      ]
    }
  ]
}