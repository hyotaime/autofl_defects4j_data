{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/statistics/DefaultBoxAndWhiskerXYDataset.java",
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
      "begin_line": 78,
      "end_line": 558,
      "comment": "\r\n * A simple implementation of the {@link BoxAndWhiskerXYDataset} interface.\r\n * This dataset implementation can hold only one series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "dates"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Storage for the dates. "
    },
    {
      "type": "field",
      "varNames": [
        "items"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Storage for the box and whisker statistics. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The minimum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The maximum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeBounds"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The range of values. "
    },
    {
      "type": "field",
      "varNames": [
        "outlierCoefficient"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\r\n     * The coefficient used to calculate outliers. Tukey\u0027s default value is\r\n     * 1.5 (see EDA) Any value which is greater than Q3 + (interquartile range\r\n     * * outlier coefficient) is considered to be an outlier.  Can be altered\r\n     * if the data is particularly skewed.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "faroutCoefficient"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\r\n     * The coefficient used to calculate farouts. Tukey\u0027s default value is 2\r\n     * (see EDA) Any value which is greater than Q3 + (interquartile range *\r\n     * farout coefficient) is considered to be a farout.  Can be altered if the\r\n     * data is particularly skewed.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.DefaultBoxAndWhiskerXYDataset(java.lang.Comparable)",
      "begin_line": 123,
      "end_line": 130,
      "comment": "\r\n     * Constructs a new box and whisker dataset.\r\n     * \u003cp\u003e\r\n     * The current implementation allows only one series in the dataset.\r\n     * This may be extended in a future version.\r\n     *\r\n     * @param seriesKey  the key for the series.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 37)",
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 128,col 38)",
        "(line 129,col 9)-(line 129,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getOutlierCoefficient()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Returns the value used as the outlier coefficient. The outlier\r\n     * coefficient gives an indication of the degree of certainty in an\r\n     * unskewed distribution.  Increasing the coefficient increases the number\r\n     * of values included. Currently only used to ensure farout coefficient is\r\n     * greater than the outlier coefficient\r\n     *\r\n     * @return A \u003ccode\u003edouble\u003c/code\u003e representing the value used to calculate\r\n     *         outliers.\r\n     *\r\n     * @see #setOutlierCoefficient(double)\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.setOutlierCoefficient(double)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Sets the value used as the outlier coefficient\r\n     *\r\n     * @param outlierCoefficient  being a \u003ccode\u003edouble\u003c/code\u003e representing the\r\n     *                            value used to calculate outliers.\r\n     *\r\n     * @see #getOutlierCoefficient()\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getFaroutCoefficient()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the value used as the farout coefficient. The farout coefficient\r\n     * allows the calculation of which values will be off the graph.\r\n     *\r\n     * @return A \u003ccode\u003edouble\u003c/code\u003e representing the value used to calculate\r\n     *         farouts.\r\n     *\r\n     * @see #setFaroutCoefficient(double)\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.setFaroutCoefficient(double)",
      "begin_line": 182,
      "end_line": 192,
      "comment": "\r\n     * Sets the value used as the farouts coefficient. The farout coefficient\r\n     * must b greater than the outlier coefficient.\r\n     *\r\n     * @param faroutCoefficient being a \u003ccode\u003edouble\u003c/code\u003e representing the\r\n     *                          value used to calculate farouts.\r\n     *\r\n     * @see #getFaroutCoefficient()\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getSeriesCount()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     * \u003cp\u003e\r\n     * This implementation only allows one series.\r\n     *\r\n     * @return The number of series.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getItemCount(int)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the index (zero-based) of the series.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.add(java.util.Date, org.jfree.data.statistics.BoxAndWhiskerItem)",
      "begin_line": 223,
      "end_line": 248,
      "comment": "\r\n     * Adds an item to the dataset and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param date  the date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param item  the item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 29)",
        "(line 225,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 245,col 54)",
        "(line 246,col 9)-(line 246,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getSeriesKey(int)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Returns the name of the series stored in this dataset.\r\n     *\r\n     * @param i  the index of the series. Currently ignored.\r\n     *\r\n     * @return The name of this series.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getItem(int, int)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\r\n     * Return an item from within the dataset.\r\n     *\r\n     * @param series  the series index (ignored, since this dataset contains\r\n     *                only one series).\r\n     * @param item  the item within the series (zero-based index)\r\n     *\r\n     * @return The item.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getX(int, int)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\r\n     * Returns the x-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * The value returned is a Long object generated from the underlying Date\r\n     * object.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getXDate(int, int)",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\r\n     * Returns the x-value for one item in a series, as a Date.\r\n     * \u003cp\u003e\r\n     * This method is provided for convenience only.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value as a Date.\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getY(int, int)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\r\n     * Returns the y-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * This method (from the XYDataset interface) is mapped to the\r\n     * getMeanValue() method.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMeanValue(int, int)",
      "begin_line": 326,
      "end_line": 333,
      "comment": "\r\n     * Returns the mean for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The mean for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 29)",
        "(line 328,col 9)-(line 328,col 75)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMedianValue(int, int)",
      "begin_line": 343,
      "end_line": 350,
      "comment": "\r\n     * Returns the median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 29)",
        "(line 345,col 9)-(line 345,col 75)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getQ1Value(int, int)",
      "begin_line": 360,
      "end_line": 367,
      "comment": "\r\n     * Returns the Q1 median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The Q1 median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 29)",
        "(line 362,col 9)-(line 362,col 75)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getQ3Value(int, int)",
      "begin_line": 377,
      "end_line": 384,
      "comment": "\r\n     * Returns the Q3 median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The Q3 median-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 29)",
        "(line 379,col 9)-(line 379,col 75)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMinRegularValue(int, int)",
      "begin_line": 394,
      "end_line": 401,
      "comment": "\r\n     * Returns the min-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The min-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 29)",
        "(line 396,col 9)-(line 396,col 75)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMaxRegularValue(int, int)",
      "begin_line": 411,
      "end_line": 418,
      "comment": "\r\n     * Returns the max-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The max-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 29)",
        "(line 413,col 9)-(line 413,col 75)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMinOutlier(int, int)",
      "begin_line": 427,
      "end_line": 434,
      "comment": "\r\n     * Returns the minimum value which is not a farout.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A \u003ccode\u003eNumber\u003c/code\u003e representing the maximum non-farout value.\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 29)",
        "(line 429,col 9)-(line 429,col 75)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getMaxOutlier(int, int)",
      "begin_line": 445,
      "end_line": 452,
      "comment": "\r\n     * Returns the maximum value which is not a farout, ie Q3 + (interquartile\r\n     * range * farout coefficient).\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A \u003ccode\u003eNumber\u003c/code\u003e representing the maximum non-farout value.\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 29)",
        "(line 447,col 9)-(line 447,col 75)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getOutliers(int, int)",
      "begin_line": 462,
      "end_line": 469,
      "comment": "\r\n     * Returns an array of outliers for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The array of outliers for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 27)",
        "(line 464,col 9)-(line 464,col 75)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeLowerBound(boolean)",
      "begin_line": 479,
      "end_line": 485,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 35)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeUpperBound(boolean)",
      "begin_line": 495,
      "end_line": 501,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 35)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.getRangeBounds(boolean)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.equals(java.lang.Object)",
      "begin_line": 522,
      "end_line": 541,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 530,col 54)",
        "(line 531,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.clone()",
      "begin_line": 550,
      "end_line": 556,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 552,col 64)",
        "(line 553,col 9)-(line 553,col 58)",
        "(line 554,col 9)-(line 554,col 58)",
        "(line 555,col 9)-(line 555,col 21)"
      ]
    }
  ]
}