{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/statistics/Statistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Statistics",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 490,
      "comment": "\r\n * A utility class that provides some common statistical functions.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.calculateMean(java.lang.Number[])",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\r\n     * Returns the mean of an array of numbers.  This is equivalent to calling\r\n     * \u003ccode\u003ecalculateMean(values, true)\u003c/code\u003e.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The mean.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.calculateMean(java.lang.Number[], boolean)",
      "begin_line": 87,
      "end_line": 112,
      "comment": "\r\n     * Returns the mean of an array of numbers.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeNullAndNaN  a flag that controls whether or not\r\n     *     \u003ccode\u003enull\u003c/code\u003e and \u003ccode\u003eDouble.NaN\u003c/code\u003e values are included\r\n     *     in the calculation (if either is present in the array, the result is\r\n     *     {@link Double#NaN}).\r\n     *\r\n     * @return The mean.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 25)",
        "(line 94,col 9)-(line 94,col 23)",
        "(line 95,col 9)-(line 95,col 24)",
        "(line 96,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 40)",
        "(line 111,col 9)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.calculateMean(java.util.Collection)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the mean of a collection of \u003ccode\u003eNumber\u003c/code\u003e objects.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The mean.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.calculateMean(java.util.Collection, boolean)",
      "begin_line": 138,
      "end_line": 171,
      "comment": "\r\n     * Returns the mean of a collection of \u003ccode\u003eNumber\u003c/code\u003e objects.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeNullAndNaN  a flag that controls whether or not\r\n     *     \u003ccode\u003enull\u003c/code\u003e and \u003ccode\u003eDouble.NaN\u003c/code\u003e values are included\r\n     *     in the calculation (if either is present in the array, the result is\r\n     *     {@link Double#NaN}).\r\n     *\r\n     * @return The mean.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 22)",
        "(line 145,col 9)-(line 145,col 27)",
        "(line 146,col 9)-(line 146,col 46)",
        "(line 147,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.calculateMedian(java.util.List)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Calculates the median for a list of values (\u003ccode\u003eNumber\u003c/code\u003e objects).\r\n     * The list of values will be copied, and the copy sorted, before\r\n     * calculating the median.  To avoid this step (if your list of values\r\n     * is already sorted), use the {@link #calculateMedian(List, boolean)}\r\n     * method.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The median.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.calculateMedian(java.util.List, boolean)",
      "begin_line": 199,
      "end_line": 233,
      "comment": "\r\n     * Calculates the median for a list of values (\u003ccode\u003eNumber\u003c/code\u003e objects).\r\n     * If \u003ccode\u003ecopyAndSort\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e, the list is assumed\r\n     * to be presorted in ascending order by value.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param copyAndSort  a flag that controls whether the list of values is\r\n     *                     copied and sorted.\r\n     *\r\n     * @return The median.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.calculateMedian(java.util.List, int, int)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n     * Calculates the median for a sublist within a list of values\r\n     * (\u003ccode\u003eNumber\u003c/code\u003e objects).\r\n     *\r\n     * @param values  the values, in any order (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     * @param start  the start index.\r\n     * @param end  the end index.\r\n     *\r\n     * @return The median.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.calculateMedian(java.util.List, int, int, boolean)",
      "begin_line": 263,
      "end_line": 299,
      "comment": "\r\n     * Calculates the median for a sublist within a list of values\r\n     * (\u003ccode\u003eNumber\u003c/code\u003e objects).  The entire list will be sorted if the\r\n     * \u003ccode\u003eascending\u003c/code\u003c argument is \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start index.\r\n     * @param end  the end index.\r\n     * @param copyAndSort  a flag that that controls whether the list of values\r\n     *                     is copied and sorted.\r\n     *\r\n     * @return The median.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 35)",
        "(line 267,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.getStdDev(java.lang.Number[])",
      "begin_line": 309,
      "end_line": 324,
      "comment": "\r\n     * Returns the standard deviation of a set of numbers.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e or zero length array not\r\n     *     permitted).\r\n     *\r\n     * @return The standard deviation of a set of numbers.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 41)",
        "(line 317,col 9)-(line 317,col 25)",
        "(line 319,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.getLinearFit(java.lang.Number[], java.lang.Number[])",
      "begin_line": 335,
      "end_line": 356,
      "comment": "\r\n     * Fits a straight line to a set of (x, y) data, returning the slope and\r\n     * intercept.\r\n     *\r\n     * @param xData  the x-data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param yData  the y-data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A double array with the intercept in [0] and the slope in [1].\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 40)",
        "(line 350,col 9)-(line 350,col 43)",
        "(line 352,col 9)-(line 352,col 76)",
        "(line 354,col 9)-(line 354,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.getSlope(java.lang.Number[], java.lang.Number[])",
      "begin_line": 366,
      "end_line": 398,
      "comment": "\r\n     * Finds the slope of a regression line using least squares.\r\n     *\r\n     * @param xData  the x-values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param yData  the y-values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The slope.\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 387,col 9)-(line 387,col 56)",
        "(line 388,col 9)-(line 388,col 20)",
        "(line 389,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.getCorrelation(java.lang.Number[], java.lang.Number[])",
      "begin_line": 413,
      "end_line": 448,
      "comment": "\r\n     * Calculates the correlation between two datasets.  Both arrays should\r\n     * contain the same number of items.  Null values are treated as zero.\r\n     * \u003cP\u003e\r\n     * Information about the correlation calculation was obtained from:\r\n     *\r\n     * http://trochim.human.cornell.edu/kb/statcorr.htm\r\n     *\r\n     * @param data1  the first dataset.\r\n     * @param data2  the second dataset.\r\n     *\r\n     * @return The correlation.\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 29)",
        "(line 426,col 9)-(line 426,col 26)",
        "(line 427,col 9)-(line 427,col 26)",
        "(line 428,col 9)-(line 428,col 27)",
        "(line 429,col 9)-(line 429,col 27)",
        "(line 430,col 9)-(line 430,col 27)",
        "(line 431,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 447,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Statistics.getMovingAverage(java.lang.Number[], java.lang.Number[], int)",
      "begin_line": 460,
      "end_line": 488,
      "comment": "\r\n     * Returns a data set for a moving average on the data set passed in.\r\n     *\r\n     * @param xData  an array of the x data.\r\n     * @param yData  an array of the y data.\r\n     * @param period  the number of data points to average\r\n     *\r\n     * @return A double[][] the length of the data set in the first dimension,\r\n     *         with two doubles for x and y in the second dimension\r\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 475,col 65)",
        "(line 476,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 22)"
      ]
    }
  ]
}