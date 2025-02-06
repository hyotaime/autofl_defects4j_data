{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/DefaultTableXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTableXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.TableXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 83,
      "end_line": 660,
      "comment": "\r\n * An {@link XYDataset} where every series shares the same x-values (required\r\n * for generating stacked area charts).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\r\n     * Storage for the data - this list will contain zero, one or many\r\n     * XYSeries objects.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xPoints"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Storage for the x values. "
    },
    {
      "type": "field",
      "varNames": [
        "propagateEvents"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " A flag that controls whether or not events are propogated. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPrune"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " A flag that controls auto pruning. "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The delegate used to control the interval width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.DefaultTableXYDataset()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Creates a new empty dataset.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.DefaultTableXYDataset(boolean)",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\r\n     * Creates a new empty dataset.\r\n     *\r\n     * @param autoPrune  a flag that controls whether or not x-values are\r\n     *                   removed whenever the corresponding y-values are all\r\n     *                   \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)",
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 37)",
        "(line 123,col 9)-(line 123,col 68)",
        "(line 124,col 9)-(line 124,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.isAutoPrune()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Returns the flag that controls whether or not x-values are removed from\r\n     * the dataset when the corresponding y-values are all \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.addSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 144,
      "end_line": 158,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.  The series should be configured to NOT\r\n     * allow duplicate x-values.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 30)",
        "(line 155,col 9)-(line 155,col 30)",
        "(line 156,col 9)-(line 156,col 39)",
        "(line 157,col 9)-(line 157,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.updateXPoints(org.jfree.data.xy.XYSeries)",
      "begin_line": 166,
      "end_line": 195,
      "comment": "\r\n     * Adds any unique x-values from \u0027series\u0027 to the dataset, and also adds any\r\n     * x-values that are in the dataset but not in \u0027series\u0027 to the series.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 46)",
        "(line 171,col 9)-(line 171,col 50)",
        "(line 172,col 9)-(line 172,col 37)",
        "(line 173,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 52)",
        "(line 188,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.updateXPoints()",
      "begin_line": 200,
      "end_line": 209,
      "comment": "\r\n     * Updates the x-values for all the series in the dataset.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 37)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeriesCount()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getItemCount()",
      "begin_line": 225,
      "end_line": 232,
      "comment": "\r\n     * Returns the number of x values in the dataset.\r\n     *\r\n     * @return The number of x values in the dataset.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeries(int)",
      "begin_line": 241,
      "end_line": 246,
      "comment": "\r\n     * Returns a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The series (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeriesKey(int)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getItemCount(int)",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getX(int, int)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 54)",
        "(line 282,col 9)-(line 282,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getStartX(int, int)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getEndX(int, int)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getY(int, int)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param index  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The y-value for the specified series and item (possibly\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 54)",
        "(line 320,col 9)-(line 320,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getStartY(int, int)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getEndY(int, int)",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeAllSeries()",
      "begin_line": 351,
      "end_line": 364,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 358,col 9)",
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 362,col 29)",
        "(line 363,col 9)-(line 363,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 372,
      "end_line": 389,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 380,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeSeries(int)",
      "begin_line": 397,
      "end_line": 416,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 402,col 9)",
        "(line 405,col 9)-(line 405,col 54)",
        "(line 406,col 9)-(line 406,col 37)",
        "(line 407,col 9)-(line 407,col 33)",
        "(line 408,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeAllValuesForX(java.lang.Number)",
      "begin_line": 423,
      "end_line": 436,
      "comment": "\r\n     * Removes the items from all series for a given x value.\r\n     *\r\n     * @param x  the x-value.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 50)",
        "(line 428,col 9)-(line 428,col 37)",
        "(line 429,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 42)",
        "(line 434,col 9)-(line 434,col 31)",
        "(line 435,col 9)-(line 435,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.canPrune(java.lang.Number)",
      "begin_line": 446,
      "end_line": 454,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if all the y-values for the specified x-value\r\n     * are \u003ccode\u003enull\u003c/code\u003e and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param x  the x-value.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.prune()",
      "begin_line": 459,
      "end_line": 468,
      "comment": "\r\n     * Removes all x-values for which all the y-values are \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 52)",
        "(line 461,col 9)-(line 461,col 42)",
        "(line 462,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.seriesChanged(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 477,
      "end_line": 482,
      "comment": "\r\n     * This method receives notification when a series belonging to the dataset\r\n     * changes.  It responds by updating the x-points for the entire dataset\r\n     * and sending a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param event  information about the change.\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.equals(java.lang.Object)",
      "begin_line": 491,
      "end_line": 512,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 65)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.hashCode()",
      "begin_line": 519,
      "end_line": 527,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 19)",
        "(line 521,col 9)-(line 521,col 64)",
        "(line 522,col 9)-(line 523,col 72)",
        "(line 524,col 9)-(line 524,col 62)",
        "(line 525,col 9)-(line 525,col 56)",
        "(line 526,col 9)-(line 526,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.clone()",
      "begin_line": 537,
      "end_line": 554,
      "comment": "\r\n     * Returns an independent copy of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some reason that cloning\r\n     *     cannot be performed.\r\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 76)",
        "(line 539,col 9)-(line 539,col 43)",
        "(line 540,col 9)-(line 540,col 58)",
        "(line 541,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 63)",
        "(line 548,col 9)-(line 548,col 73)",
        "(line 549,col 9)-(line 549,col 59)",
        "(line 550,col 9)-(line 551,col 45)",
        "(line 552,col 9)-(line 552,col 30)",
        "(line 553,col 9)-(line 553,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 576,
      "end_line": 578,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 588,
      "end_line": 595,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getIntervalPositionFactor()",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\r\n     * Returns the interval position factor.\r\n     *\r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setIntervalPositionFactor(double)",
      "begin_line": 614,
      "end_line": 617,
      "comment": "\r\n     * Sets the interval position factor. Must be between 0.0 and 1.0 inclusive.\r\n     * If the factor is 0.5, the gap is in the middle of the x values. If it\r\n     * is lesser than 0.5, the gap is farther to the left and if greater than\r\n     * 0.5 it gets farther to the right.\r\n     *\r\n     * @param d the new interval position factor.\r\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 59)",
        "(line 616,col 9)-(line 616,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getIntervalWidth()",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\r\n     * returns the full interval width.\r\n     *\r\n     * @return The interval width to use.\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setIntervalWidth(double)",
      "begin_line": 634,
      "end_line": 637,
      "comment": "\r\n     * Sets the interval width to a fixed value, and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param d  the new interval width (must be \u003e 0).\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 55)",
        "(line 636,col 9)-(line 636,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.isAutoWidth()",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     *\r\n     * @return A flag that determines whether or not the interval width is\r\n     *         automatically calculated.\r\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setAutoWidth(boolean)",
      "begin_line": 655,
      "end_line": 658,
      "comment": "\r\n     * Sets the flag that indicates whether the interval width is automatically\r\n     * calculated or not.\r\n     *\r\n     * @param b  a boolean.\r\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 46)",
        "(line 657,col 9)-(line 657,col 29)"
      ]
    }
  ]
}