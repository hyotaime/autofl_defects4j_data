{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/statistics/DefaultBoxAndWhiskerXYDataset.java",
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
      "begin_line": 77,
      "end_line": 556,
      "comment": "\r\n * A simple implementation of the {@link BoxAndWhiskerXYDataset} interface.\r\n * This dataset implementation can hold only one series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "dates"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Storage for the dates. "
    },
    {
      "type": "field",
      "varNames": [
        "items"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Storage for the box and whisker statistics. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The minimum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The maximum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeBounds"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The range of values. "
    },
    {
      "type": "field",
      "varNames": [
        "outlierCoefficient"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\r\n     * The coefficient used to calculate outliers. Tukey\u0027s default value is\r\n     * 1.5 (see EDA) Any value which is greater than Q3 + (interquartile range\r\n     * * outlier coefficient) is considered to be an outlier.  Can be altered\r\n     * if the data is particularly skewed.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "faroutCoefficient"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\r\n     * The coefficient used to calculate farouts. Tukey\u0027s default value is 2\r\n     * (see EDA) Any value which is greater than Q3 + (interquartile range *\r\n     * farout coefficient) is considered to be a farout.  Can be altered if the\r\n     * data is particularly skewed.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.DefaultBoxAndWhiskerXYDataset(java.lang.Comparable)",
      "begin_line": 122,
      "end_line": 129,
      "comment": "\r\n     * Constructs a new box and whisker dataset.\r\n     * \u003cp\u003e\r\n     * The current implementation allows only one series in the dataset.\r\n     * This may be extended in a future version.\r\n     *\r\n     * @param seriesKey  the key for the series.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 37)",
        "(line 125,col 9)-(line 125,col 37)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getOutlierCoefficient()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the value used as the outlier coefficient. The outlier\r\n     * coefficient gives an indication of the degree of certainty in an\r\n     * unskewed distribution.  Increasing the coefficient increases the number\r\n     * of values included. Currently only used to ensure farout coefficient is\r\n     * greater than the outlier coefficient\r\n     *\r\n     * @return A \u003ccode\u003edouble\u003c/code\u003e representing the value used to calculate\r\n     *         outliers.\r\n     *\r\n     * @see #setOutlierCoefficient(double)\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.setOutlierCoefficient(double)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Sets the value used as the outlier coefficient\r\n     *\r\n     * @param outlierCoefficient  being a \u003ccode\u003edouble\u003c/code\u003e representing the\r\n     *                            value used to calculate outliers.\r\n     *\r\n     * @see #getOutlierCoefficient()\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getFaroutCoefficient()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the value used as the farout coefficient. The farout coefficient\r\n     * allows the calculation of which values will be off the graph.\r\n     *\r\n     * @return A \u003ccode\u003edouble\u003c/code\u003e representing the value used to calculate\r\n     *         farouts.\r\n     *\r\n     * @see #setFaroutCoefficient(double)\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.setFaroutCoefficient(double)",
      "begin_line": 181,
      "end_line": 191,
      "comment": "\r\n     * Sets the value used as the farouts coefficient. The farout coefficient\r\n     * must b greater than the outlier coefficient.\r\n     *\r\n     * @param faroutCoefficient being a \u003ccode\u003edouble\u003c/code\u003e representing the\r\n     *                          value used to calculate farouts.\r\n     *\r\n     * @see #getFaroutCoefficient()\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getSeriesCount()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     * \u003cp\u003e\r\n     * This implementation only allows one series.\r\n     *\r\n     * @return The number of series.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getItemCount(int)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the index (zero-based) of the series.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.add(java.util.Date, org.jfree.data.statistics.BoxAndWhiskerItem)",
      "begin_line": 222,
      "end_line": 246,
      "comment": "\r\n     * Adds an item to the dataset and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param date  the date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param item  the item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 29)",
        "(line 224,col 9)-(line 224,col 29)",
        "(line 225,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 244,col 54)",
        "(line 245,col 9)-(line 245,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getSeriesKey(int)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\r\n     * Returns the name of the series stored in this dataset.\r\n     *\r\n     * @param i  the index of the series. Currently ignored.\r\n     *\r\n     * @return The name of this series.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getItem(int, int)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Return an item from within the dataset.\r\n     *\r\n     * @param series  the series index (ignored, since this dataset contains\r\n     *                only one series).\r\n     * @param item  the item within the series (zero-based index)\r\n     *\r\n     * @return The item.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getX(int, int)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Returns the x-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * The value returned is a Long object generated from the underlying Date\r\n     * object.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getXDate(int, int)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Returns the x-value for one item in a series, as a Date.\r\n     * \u003cp\u003e\r\n     * This method is provided for convenience only.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value as a Date.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getY(int, int)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\r\n     * Returns the y-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * This method (from the XYDataset interface) is mapped to the\r\n     * getMeanValue() method.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMeanValue(int, int)",
      "begin_line": 324,
      "end_line": 331,
      "comment": "\r\n     * Returns the mean for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The mean for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 29)",
        "(line 326,col 9)-(line 326,col 75)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMedianValue(int, int)",
      "begin_line": 341,
      "end_line": 348,
      "comment": "\r\n     * Returns the median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 29)",
        "(line 343,col 9)-(line 343,col 75)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getQ1Value(int, int)",
      "begin_line": 358,
      "end_line": 365,
      "comment": "\r\n     * Returns the Q1 median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The Q1 median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 29)",
        "(line 360,col 9)-(line 360,col 75)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getQ3Value(int, int)",
      "begin_line": 375,
      "end_line": 382,
      "comment": "\r\n     * Returns the Q3 median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The Q3 median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 29)",
        "(line 377,col 9)-(line 377,col 75)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMinRegularValue(int, int)",
      "begin_line": 392,
      "end_line": 399,
      "comment": "\r\n     * Returns the min-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The min-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 29)",
        "(line 394,col 9)-(line 394,col 75)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMaxRegularValue(int, int)",
      "begin_line": 409,
      "end_line": 416,
      "comment": "\r\n     * Returns the max-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The max-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 29)",
        "(line 411,col 9)-(line 411,col 75)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMinOutlier(int, int)",
      "begin_line": 425,
      "end_line": 432,
      "comment": "\r\n     * Returns the minimum value which is not a farout.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A \u003ccode\u003eNumber\u003c/code\u003e representing the maximum non-farout value.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 29)",
        "(line 427,col 9)-(line 427,col 75)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMaxOutlier(int, int)",
      "begin_line": 443,
      "end_line": 450,
      "comment": "\r\n     * Returns the maximum value which is not a farout, ie Q3 + (interquartile\r\n     * range * farout coefficient).\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A \u003ccode\u003eNumber\u003c/code\u003e representing the maximum non-farout value.\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 29)",
        "(line 445,col 9)-(line 445,col 75)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getOutliers(int, int)",
      "begin_line": 460,
      "end_line": 467,
      "comment": "\r\n     * Returns an array of outliers for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The array of outliers for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 27)",
        "(line 462,col 9)-(line 462,col 75)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeLowerBound(boolean)",
      "begin_line": 477,
      "end_line": 483,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 35)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeUpperBound(boolean)",
      "begin_line": 493,
      "end_line": 499,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 35)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeBounds(boolean)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.equals(java.lang.Object)",
      "begin_line": 520,
      "end_line": 539,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 528,col 54)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.clone()",
      "begin_line": 548,
      "end_line": 554,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 550,col 64)",
        "(line 551,col 9)-(line 551,col 58)",
        "(line 552,col 9)-(line 552,col 58)",
        "(line 553,col 9)-(line 553,col 21)"
      ]
    }
  ]
}