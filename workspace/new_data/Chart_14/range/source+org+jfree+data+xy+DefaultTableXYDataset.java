{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/DefaultTableXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTableXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.TableXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo"
      ],
      "begin_line": 80,
      "end_line": 632,
      "comment": "\r\n * An {@link XYDataset} where every series shares the same x-values (required \r\n * for generating stacked area charts).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " \r\n     * Storage for the data - this list will contain zero, one or many \r\n     * XYSeries objects. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xPoints"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Storage for the x values. "
    },
    {
      "type": "field",
      "varNames": [
        "propagateEvents"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " A flag that controls whether or not events are propogated. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPrune"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " A flag that controls auto pruning. "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The delegate used to control the interval width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.DefaultTableXYDataset()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Creates a new empty dataset.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.DefaultTableXYDataset(boolean)",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\r\n     * Creates a new empty dataset.\r\n     * \r\n     * @param autoPrune  a flag that controls whether or not x-values are \r\n     *                   removed whenever the corresponding y-values are all \r\n     *                   \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 35)",
        "(line 118,col 9)-(line 118,col 36)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 68)",
        "(line 121,col 9)-(line 121,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.isAutoPrune()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the flag that controls whether or not x-values are removed from \r\n     * the dataset when the corresponding y-values are all \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.addSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 141,
      "end_line": 155,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.  The series should be configured to NOT \r\n     * allow duplicate x-values.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 30)",
        "(line 152,col 9)-(line 152,col 30)",
        "(line 153,col 9)-(line 153,col 39)",
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.updateXPoints(org.jfree.data.xy.XYSeries)",
      "begin_line": 163,
      "end_line": 192,
      "comment": "\r\n     * Adds any unique x-values from \u0027series\u0027 to the dataset, and also adds any\r\n     * x-values that are in the dataset but not in \u0027series\u0027 to the series.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 46)",
        "(line 168,col 9)-(line 168,col 50)",
        "(line 169,col 9)-(line 169,col 37)",
        "(line 170,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 52)",
        "(line 185,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.updateXPoints()",
      "begin_line": 197,
      "end_line": 206,
      "comment": "\r\n     * Updates the x-values for all the series in the dataset.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 37)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeriesCount()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getItemCount()",
      "begin_line": 222,
      "end_line": 229,
      "comment": "\r\n     * Returns the number of x values in the dataset.\r\n     *\r\n     * @return The number of x values in the dataset.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeries(int)",
      "begin_line": 238,
      "end_line": 243,
      "comment": "\r\n     * Returns a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The series (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getSeriesKey(int)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getItemCount(int)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getX(int, int)",
      "begin_line": 277,
      "end_line": 281,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 54)",
        "(line 279,col 9)-(line 279,col 50)",
        "(line 280,col 9)-(line 280,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getStartX(int, int)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getEndX(int, int)",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getY(int, int)",
      "begin_line": 316,
      "end_line": 320,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param index  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The y-value for the specified series and item (possibly \r\n     *         \u003ccode\u003enull\u003c/code\u003e). \r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 55)",
        "(line 318,col 9)-(line 318,col 52)",
        "(line 319,col 9)-(line 319,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getStartY(int, int)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getEndY(int, int)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeAllSeries()",
      "begin_line": 350,
      "end_line": 363,
      "comment": "\r\n     * Removes all the series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 360,col 26)",
        "(line 361,col 9)-(line 361,col 29)",
        "(line 362,col 9)-(line 362,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 371,
      "end_line": 388,
      "comment": "\r\n     * Removes a series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 379,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeSeries(int)",
      "begin_line": 396,
      "end_line": 415,
      "comment": "\r\n     * Removes a series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 404,col 9)-(line 404,col 54)",
        "(line 405,col 9)-(line 405,col 37)",
        "(line 406,col 9)-(line 406,col 33)",
        "(line 407,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.removeAllValuesForX(java.lang.Number)",
      "begin_line": 422,
      "end_line": 435,
      "comment": "\r\n     * Removes the items from all series for a given x value.\r\n     *\r\n     * @param x  the x-value.\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 50)",
        "(line 427,col 9)-(line 427,col 37)",
        "(line 428,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 42)",
        "(line 433,col 9)-(line 433,col 31)",
        "(line 434,col 9)-(line 434,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.canPrune(java.lang.Number)",
      "begin_line": 445,
      "end_line": 453,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if all the y-values for the specified x-value\r\n     * are \u003ccode\u003enull\u003c/code\u003e and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param x  the x-value.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.prune()",
      "begin_line": 458,
      "end_line": 467,
      "comment": "\r\n     * Removes all x-values for which all the y-values are \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 52)",
        "(line 460,col 9)-(line 460,col 42)",
        "(line 461,col 9)-(line 466,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.seriesChanged(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 476,
      "end_line": 481,
      "comment": "\r\n     * This method receives notification when a series belonging to the dataset\r\n     * changes.  It responds by updating the x-points for the entire dataset \r\n     * and sending a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param event  information about the change.\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 480,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.equals(java.lang.Object)",
      "begin_line": 490,
      "end_line": 511,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 65)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.hashCode()",
      "begin_line": 518,
      "end_line": 526,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 19)",
        "(line 520,col 9)-(line 520,col 64)",
        "(line 521,col 9)-(line 522,col 72)",
        "(line 523,col 9)-(line 523,col 62)",
        "(line 524,col 9)-(line 524,col 56)",
        "(line 525,col 9)-(line 525,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 536,
      "end_line": 538,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 560,
      "end_line": 567,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getIntervalPositionFactor()",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\r\n     * Returns the interval position factor. \r\n     * \r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setIntervalPositionFactor(double)",
      "begin_line": 586,
      "end_line": 589,
      "comment": "\r\n     * Sets the interval position factor. Must be between 0.0 and 1.0 inclusive.\r\n     * If the factor is 0.5, the gap is in the middle of the x values. If it\r\n     * is lesser than 0.5, the gap is farther to the left and if greater than\r\n     * 0.5 it gets farther to the right.\r\n     *  \r\n     * @param d the new interval position factor.\r\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 59)",
        "(line 588,col 9)-(line 588,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.getIntervalWidth()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\r\n     * returns the full interval width. \r\n     * \r\n     * @return The interval width to use.\r\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setIntervalWidth(double)",
      "begin_line": 606,
      "end_line": 609,
      "comment": "\r\n     * Sets the interval width to a fixed value, and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners. \r\n     * \r\n     * @param d  the new interval width (must be \u003e 0).\r\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 55)",
        "(line 608,col 9)-(line 608,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.isAutoWidth()",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     * \r\n     * @return A flag that determines whether or not the interval width is \r\n     *         automatically calculated.\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultTableXYDataset.setAutoWidth(boolean)",
      "begin_line": 627,
      "end_line": 630,
      "comment": "\r\n     * Sets the flag that indicates whether the interval width is automatically\r\n     * calculated or not. \r\n     * \r\n     * @param b  a boolean.\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 46)",
        "(line 629,col 9)-(line 629,col 29)"
      ]
    }
  ]
}