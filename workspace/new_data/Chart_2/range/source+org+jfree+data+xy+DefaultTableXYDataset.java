{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/DefaultTableXYDataset.java",
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
      "begin_line": 84,
      "end_line": 670,
      "comment": "\r\n * An {@link XYDataset} where every series shares the same x-values (required\r\n * for generating stacked area charts).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\r\n     * Storage for the data - this list will contain zero, one or many\r\n     * XYSeries objects.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xPoints"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Storage for the x values. "
    },
    {
      "type": "field",
      "varNames": [
        "propagateEvents"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " A flag that controls whether or not events are propogated. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPrune"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " A flag that controls auto pruning. "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The delegate used to control the interval width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.DefaultTableXYDataset()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Creates a new empty dataset.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.DefaultTableXYDataset(boolean)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\r\n     * Creates a new empty dataset.\r\n     *\r\n     * @param autoPrune  a flag that controls whether or not x-values are\r\n     *                   removed whenever the corresponding y-values are all\r\n     *                   \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 124,col 9)-(line 124,col 68)",
        "(line 125,col 9)-(line 125,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.isAutoPrune()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Returns the flag that controls whether or not x-values are removed from\r\n     * the dataset when the corresponding y-values are all \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.addSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 145,
      "end_line": 160,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.  The series should be configured to NOT\r\n     * allow duplicate x-values.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 30)",
        "(line 156,col 9)-(line 156,col 30)",
        "(line 157,col 9)-(line 157,col 39)",
        "(line 158,col 9)-(line 158,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.updateXPoints(org.jfree.data.xy.XYSeries)",
      "begin_line": 168,
      "end_line": 197,
      "comment": "\r\n     * Adds any unique x-values from \u0027series\u0027 to the dataset, and also adds any\r\n     * x-values that are in the dataset but not in \u0027series\u0027 to the series.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 50)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 52)",
        "(line 190,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.updateXPoints()",
      "begin_line": 202,
      "end_line": 211,
      "comment": "\r\n     * Updates the x-values for all the series in the dataset.\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 37)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeriesCount()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getItemCount()",
      "begin_line": 227,
      "end_line": 234,
      "comment": "\r\n     * Returns the number of x values in the dataset.\r\n     *\r\n     * @return The number of x values in the dataset.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeries(int)",
      "begin_line": 243,
      "end_line": 248,
      "comment": "\r\n     * Returns a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The series (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeriesKey(int)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getItemCount(int)",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getX(int, int)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 54)",
        "(line 284,col 9)-(line 284,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getStartX(int, int)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getEndX(int, int)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getY(int, int)",
      "begin_line": 320,
      "end_line": 323,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param index  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The y-value for the specified series and item (possibly\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 54)",
        "(line 322,col 9)-(line 322,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getStartY(int, int)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getEndY(int, int)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeAllSeries()",
      "begin_line": 353,
      "end_line": 367,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 360,col 9)",
        "(line 363,col 9)-(line 363,col 26)",
        "(line 364,col 9)-(line 364,col 29)",
        "(line 365,col 9)-(line 365,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 375,
      "end_line": 393,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 383,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeSeries(int)",
      "begin_line": 401,
      "end_line": 421,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 409,col 9)-(line 409,col 54)",
        "(line 410,col 9)-(line 410,col 37)",
        "(line 411,col 9)-(line 411,col 33)",
        "(line 412,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeAllValuesForX(java.lang.Number)",
      "begin_line": 428,
      "end_line": 442,
      "comment": "\r\n     * Removes the items from all series for a given x value.\r\n     *\r\n     * @param x  the x-value.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 50)",
        "(line 433,col 9)-(line 433,col 37)",
        "(line 434,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 42)",
        "(line 439,col 9)-(line 439,col 31)",
        "(line 440,col 9)-(line 440,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.canPrune(java.lang.Number)",
      "begin_line": 452,
      "end_line": 460,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if all the y-values for the specified x-value\r\n     * are \u003ccode\u003enull\u003c/code\u003e and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param x  the x-value.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.prune()",
      "begin_line": 465,
      "end_line": 474,
      "comment": "\r\n     * Removes all x-values for which all the y-values are \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 52)",
        "(line 467,col 9)-(line 467,col 42)",
        "(line 468,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.seriesChanged(org.jfree.data.event.SeriesChangeEvent)",
      "begin_line": 483,
      "end_line": 489,
      "comment": "\r\n     * This method receives notification when a series belonging to the dataset\r\n     * changes.  It responds by updating the x-points for the entire dataset\r\n     * and sending a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param event  information about the change.\r\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.equals(java.lang.Object)",
      "begin_line": 498,
      "end_line": 519,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 65)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.hashCode()",
      "begin_line": 526,
      "end_line": 534,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 19)",
        "(line 528,col 9)-(line 528,col 64)",
        "(line 529,col 9)-(line 530,col 72)",
        "(line 531,col 9)-(line 531,col 62)",
        "(line 532,col 9)-(line 532,col 56)",
        "(line 533,col 9)-(line 533,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.clone()",
      "begin_line": 544,
      "end_line": 561,
      "comment": "\r\n     * Returns an independent copy of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some reason that cloning\r\n     *     cannot be performed.\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 76)",
        "(line 546,col 9)-(line 546,col 43)",
        "(line 547,col 9)-(line 547,col 58)",
        "(line 548,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 553,col 63)",
        "(line 555,col 9)-(line 555,col 73)",
        "(line 556,col 9)-(line 556,col 59)",
        "(line 557,col 9)-(line 558,col 45)",
        "(line 559,col 9)-(line 559,col 30)",
        "(line 560,col 9)-(line 560,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 595,
      "end_line": 602,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 601,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getIntervalPositionFactor()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\r\n     * Returns the interval position factor.\r\n     *\r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setIntervalPositionFactor(double)",
      "begin_line": 621,
      "end_line": 625,
      "comment": "\r\n     * Sets the interval position factor. Must be between 0.0 and 1.0 inclusive.\r\n     * If the factor is 0.5, the gap is in the middle of the x values. If it\r\n     * is lesser than 0.5, the gap is farther to the left and if greater than\r\n     * 0.5 it gets farther to the right.\r\n     *\r\n     * @param d the new interval position factor.\r\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 59)",
        "(line 623,col 9)-(line 623,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getIntervalWidth()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\r\n     * returns the full interval width.\r\n     *\r\n     * @return The interval width to use.\r\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setIntervalWidth(double)",
      "begin_line": 642,
      "end_line": 646,
      "comment": "\r\n     * Sets the interval width to a fixed value, and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param d  the new interval width (must be \u003e 0).\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 55)",
        "(line 644,col 9)-(line 644,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.isAutoWidth()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     *\r\n     * @return A flag that determines whether or not the interval width is\r\n     *         automatically calculated.\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setAutoWidth(boolean)",
      "begin_line": 664,
      "end_line": 668,
      "comment": "\r\n     * Sets the flag that indicates whether the interval width is automatically\r\n     * calculated or not.\r\n     *\r\n     * @param b  a boolean.\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 46)",
        "(line 666,col 9)-(line 666,col 52)"
      ]
    }
  ]
}