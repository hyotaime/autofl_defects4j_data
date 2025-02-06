{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/IntervalXYDelegate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalXYDelegate",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.DatasetChangeListener",
        "org.jfree.data.DomainInfo",
        "java.io.Serializable",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 84,
      "end_line": 482,
      "comment": "\r\n * A delegate that handles the specification or automatic calculation of the\r\n * interval surrounding the x-values in a dataset.  This is used to extend\r\n * a regular {@link XYDataset} to support the {@link IntervalXYDataset}\r\n * interface.\r\n * \u003cp\u003e\r\n * The decorator pattern was not used because of the several possibly\r\n * implemented interfaces of the decorated instance (e.g.\r\n * {@link TableXYDataset}, {@link RangeInfo}, {@link DomainInfo} etc.).\r\n * \u003cp\u003e\r\n * The width can be set manually or calculated automatically. The switch\r\n * autoWidth allows to determine which behavior is used. The auto width\r\n * calculation tries to find the smallest gap between two x-values in the\r\n * dataset.  If there is only one item in the series, the auto width\r\n * calculation fails and falls back on the manually set interval width (which\r\n * is itself defaulted to 1.0).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * The dataset to enhance.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoWidth"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\r\n     * A flag to indicate whether the width should be calculated automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "intervalPositionFactor"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\r\n     * A value between 0.0 and 1.0 that indicates the position of the x-value\r\n     * within the interval.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedIntervalWidth"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\r\n     * The fixed interval width (defaults to 1.0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoIntervalWidth"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\r\n     * The automatically calculated interval width.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.IntervalXYDelegate(org.jfree.data.xy.XYDataset)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Creates a new delegate that.\r\n     *\r\n     * @param dataset  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.IntervalXYDelegate(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 132,
      "end_line": 141,
      "comment": "\r\n     * Creates a new delegate for the specified dataset.\r\n     *\r\n     * @param dataset  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoWidth  a flag that controls whether the interval width is\r\n     *                   calculated automatically.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 31)",
        "(line 137,col 9)-(line 137,col 35)",
        "(line 138,col 9)-(line 138,col 42)",
        "(line 139,col 9)-(line 139,col 58)",
        "(line 140,col 9)-(line 140,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.isAutoWidth()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the interval width is automatically\r\n     * calculated, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.setAutoWidth(boolean)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\r\n     * Sets the flag that indicates whether the interval width is automatically\r\n     * calculated.  If the flag is set to \u003ccode\u003etrue\u003c/code\u003e, the interval is\r\n     * recalculated.\r\n     * \u003cp\u003e\r\n     * Note: recalculating the interval amounts to changing the data values\r\n     * represented by the dataset.  The calling dataset must fire an\r\n     * appropriate {@link DatasetChangeEvent}.\r\n     *\r\n     * @param b  a boolean.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 27)",
        "(line 166,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getIntervalPositionFactor()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the interval position factor.\r\n     *\r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.setIntervalPositionFactor(double)",
      "begin_line": 196,
      "end_line": 202,
      "comment": "\r\n     * Sets the interval position factor.  This controls how the interval is\r\n     * aligned to the x-value.  For a value of 0.5, the interval is aligned\r\n     * with the x-value in the center.  For a value of 0.0, the interval is\r\n     * aligned with the x-value at the lower end of the interval, and for a\r\n     * value of 1.0, the interval is aligned with the x-value at the upper\r\n     * end of the interval.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that changing the interval position factor amounts to changing the\r\n     * data values represented by the dataset.  Therefore, the dataset that is\r\n     * using this delegate is responsible for generating the\r\n     * appropriate {@link DatasetChangeEvent}.\r\n     *\r\n     * @param d  the new interval position factor (in the range\r\n     *           \u003ccode\u003e0.0\u003c/code\u003e to \u003ccode\u003e1.0\u003c/code\u003e inclusive).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getFixedIntervalWidth()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns the fixed interval width.\r\n     *\r\n     * @return The fixed interval width.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.setFixedIntervalWidth(double)",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\r\n     * Sets the fixed interval width and, as a side effect, sets the\r\n     * \u003ccode\u003eautoWidth\u003c/code\u003e flag to \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * Note that changing the interval width amounts to changing the data\r\n     * values represented by the dataset.  Therefore, the dataset\r\n     * that is using this delegate is responsible for generating the\r\n     * appropriate {@link DatasetChangeEvent}.\r\n     *\r\n     * @param w  the width (negative values not permitted).\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 36)",
        "(line 229,col 9)-(line 229,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getIntervalWidth()",
      "begin_line": 239,
      "end_line": 249,
      "comment": "\r\n     * Returns the interval width.  This method will return either the\r\n     * auto calculated interval width or the manually specified interval\r\n     * width, depending on the {@link #isAutoWidth()} result.\r\n     *\r\n     * @return The interval width to use.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getStartX(int, int)",
      "begin_line": 261,
      "end_line": 269,
      "comment": "\r\n     * Returns the start value of the x-interval for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start value of the x-interval (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 29)",
        "(line 263,col 9)-(line 263,col 51)",
        "(line 264,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getStartXValue(int, int)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\r\n     * Returns the start value of the x-interval for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start value of the x-interval.\r\n     *\r\n     * @see #getStartX(int, int)\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 283,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getEndX(int, int)",
      "begin_line": 296,
      "end_line": 304,
      "comment": "\r\n     * Returns the end value of the x-interval for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end value of the x-interval (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 27)",
        "(line 298,col 9)-(line 298,col 51)",
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getEndXValue(int, int)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\r\n     * Returns the end value of the x-interval for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end value of the x-interval.\r\n     *\r\n     * @see #getEndX(int, int)\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 318,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getDomainLowerBound(boolean)",
      "begin_line": 329,
      "end_line": 336,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 35)",
        "(line 331,col 9)-(line 331,col 51)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getDomainUpperBound(boolean)",
      "begin_line": 346,
      "end_line": 353,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 35)",
        "(line 348,col 9)-(line 348,col 51)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getDomainBounds(boolean)",
      "begin_line": 364,
      "end_line": 375,
      "comment": "\r\n     * Returns the range of the values in the dataset\u0027s domain, including\r\n     * or excluding the interval around each x-value as specified.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval should be taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 77)",
        "(line 368,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 383,
      "end_line": 392,
      "comment": "\r\n     * Handles events from the dataset by recalculating the interval if\r\n     * necessary.\r\n     *\r\n     * @param e  the event.\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.recalculateInterval()",
      "begin_line": 399,
      "end_line": 406,
      "comment": "\r\n     * Recalculate the minimum width \"from scratch\".\r\n     *\r\n     * @return The minimum width.\r\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 49)",
        "(line 401,col 9)-(line 401,col 56)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.calculateIntervalForSeries(int)",
      "begin_line": 415,
      "end_line": 427,
      "comment": "\r\n     * Calculates the interval width for a given series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The interval width.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 49)",
        "(line 417,col 9)-(line 417,col 58)",
        "(line 418,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.equals(java.lang.Object)",
      "begin_line": 440,
      "end_line": 458,
      "comment": "\r\n     * Tests the delegate for equality with an arbitrary object.  The\r\n     * equality test considers two delegates to be equal if they would\r\n     * calculate the same intervals for any given dataset (for this reason, the\r\n     * dataset itself is NOT included in the equality test, because it is just\r\n     * a reference back to the current \u0027owner\u0027 of the delegate).\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 59)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.clone()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\r\n     * @return A clone of this delegate.\r\n     *\r\n     * @throws CloneNotSupportedException if the object cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.hashCode()",
      "begin_line": 474,
      "end_line": 480,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 21)",
        "(line 476,col 9)-(line 476,col 60)",
        "(line 477,col 9)-(line 477,col 73)",
        "(line 478,col 9)-(line 478,col 69)",
        "(line 479,col 9)-(line 479,col 20)"
      ]
    }
  ]
}