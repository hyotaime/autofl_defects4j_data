{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/IntervalXYDelegate.java",
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
      "begin_line": 82,
      "end_line": 458,
      "comment": "\r\n * A delegate that handles the specification or automatic calculation of the\r\n * interval surrounding the x-values in a dataset.  This is used to extend\r\n * a regular {@link XYDataset} to support the {@link IntervalXYDataset} \r\n * interface.\r\n * \u003cp\u003e \r\n * The decorator pattern was not used because of the several possibly \r\n * implemented interfaces of the decorated instance (e.g. \r\n * {@link TableXYDataset}, {@link RangeInfo}, {@link DomainInfo} etc.).\r\n * \u003cp\u003e\r\n * The width can be set manually or calculated automatically. The switch\r\n * autoWidth allows to determine which behavior is used. The auto width \r\n * calculation tries to find the smallest gap between two x-values in the\r\n * dataset.  If there is only one item in the series, the auto width \r\n * calculation fails and falls back on the manually set interval width (which \r\n * is itself defaulted to 1.0). \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\r\n     * The dataset to enhance. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoWidth"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\r\n     * A flag to indicate whether the width should be calculated automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "intervalPositionFactor"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\r\n     * A value between 0.0 and 1.0 that indicates the position of the x-value\r\n     * within the interval.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedIntervalWidth"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\r\n     * The fixed interval width (defaults to 1.0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoIntervalWidth"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\r\n     * The automatically calculated interval width.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.IntervalXYDelegate(org.jfree.data.xy.XYDataset)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Creates a new delegate that.\r\n     * \r\n     * @param dataset  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.IntervalXYDelegate(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 131,
      "end_line": 140,
      "comment": "\r\n     * Creates a new delegate for the specified dataset.\r\n     * \r\n     * @param dataset  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoWidth  a flag that controls whether the interval width is \r\n     *                   calculated automatically.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 31)",
        "(line 136,col 9)-(line 136,col 35)",
        "(line 137,col 9)-(line 137,col 42)",
        "(line 138,col 9)-(line 138,col 58)",
        "(line 139,col 9)-(line 139,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.isAutoWidth()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the interval width is automatically \r\n     * calculated, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.setAutoWidth(boolean)",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\r\n     * Sets the flag that indicates whether the interval width is automatically\r\n     * calculated.  If the flag is set to \u003ccode\u003etrue\u003c/code\u003e, the interval is\r\n     * recalculated.\r\n     * \u003cp\u003e\r\n     * Note: recalculating the interval amounts to changing the data values\r\n     * represented by the dataset.  The calling dataset must fire an\r\n     * appropriate {@link DatasetChangeEvent}.\r\n     * \r\n     * @param b  a boolean.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 27)",
        "(line 165,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getIntervalPositionFactor()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Returns the interval position factor.\r\n     * \r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.setIntervalPositionFactor(double)",
      "begin_line": 195,
      "end_line": 201,
      "comment": "\r\n     * Sets the interval position factor.  This controls how the interval is\r\n     * aligned to the x-value.  For a value of 0.5, the interval is aligned\r\n     * with the x-value in the center.  For a value of 0.0, the interval is\r\n     * aligned with the x-value at the lower end of the interval, and for a \r\n     * value of 1.0, the interval is aligned with the x-value at the upper\r\n     * end of the interval.\r\n     * \r\n     * Note that changing the interval position factor amounts to changing the \r\n     * data values represented by the dataset.  Therefore, the dataset that is \r\n     * using this delegate is responsible for generating the \r\n     * appropriate {@link DatasetChangeEvent}.     \r\n     * \r\n     * @param d  the new interval position factor (in the range \r\n     *           \u003ccode\u003e0.0\u003c/code\u003e to \u003ccode\u003e1.0\u003c/code\u003e inclusive).\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getFixedIntervalWidth()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\r\n     * Returns the fixed interval width.\r\n     * \r\n     * @return The fixed interval width.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.setFixedIntervalWidth(double)",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\r\n     * Sets the fixed interval width and, as a side effect, sets the\r\n     * \u003ccode\u003eautoWidth\u003c/code\u003e flag to \u003ccode\u003efalse\u003c/code\u003e.  \r\n     * \r\n     * Note that changing the interval width amounts to changing the data \r\n     * values represented by the dataset.  Therefore, the dataset\r\n     * that is using this delegate is responsible for generating the \r\n     * appropriate {@link DatasetChangeEvent}.\r\n     * \r\n     * @param w  the width (negative values not permitted).\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 36)",
        "(line 228,col 9)-(line 228,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getIntervalWidth()",
      "begin_line": 238,
      "end_line": 248,
      "comment": "\r\n     * Returns the interval width.  This method will return either the \r\n     * auto calculated interval width or the manually specified interval\r\n     * width, depending on the {@link #isAutoWidth()} result.\r\n     * \r\n     * @return The interval width to use.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getStartX(int, int)",
      "begin_line": 260,
      "end_line": 268,
      "comment": "\r\n     * Returns the start value of the x-interval for an item within a series.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The start value of the x-interval (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getStartXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 29)",
        "(line 262,col 9)-(line 262,col 51)",
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getStartXValue(int, int)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\r\n     * Returns the start value of the x-interval for an item within a series.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The start value of the x-interval.\r\n     * \r\n     * @see #getStartX(int, int)\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 282,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getEndX(int, int)",
      "begin_line": 295,
      "end_line": 303,
      "comment": "\r\n     * Returns the end value of the x-interval for an item within a series.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The end value of the x-interval (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getEndXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 27)",
        "(line 297,col 9)-(line 297,col 51)",
        "(line 298,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getEndXValue(int, int)",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\r\n     * Returns the end value of the x-interval for an item within a series.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The end value of the x-interval.\r\n     * \r\n     * @see #getEndX(int, int)\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 317,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getDomainLowerBound(boolean)",
      "begin_line": 328,
      "end_line": 335,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 51)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getDomainUpperBound(boolean)",
      "begin_line": 345,
      "end_line": 352,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 35)",
        "(line 347,col 9)-(line 347,col 51)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.getDomainBounds(boolean)",
      "begin_line": 363,
      "end_line": 374,
      "comment": "\r\n     * Returns the range of the values in the dataset\u0027s domain, including\r\n     * or excluding the interval around each x-value as specified.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the \r\n     *                         x-interval should be taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 77)",
        "(line 367,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 382,
      "end_line": 389,
      "comment": "\r\n     * Handles events from the dataset by recalculating the interval if \r\n     * necessary.\r\n     * \r\n     * @param e  the event.\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.recalculateInterval()",
      "begin_line": 394,
      "end_line": 401,
      "comment": "\r\n     * Recalculate the minimum width \"from scratch\".\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 49)",
        "(line 396,col 9)-(line 396,col 56)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.calculateIntervalForSeries(int)",
      "begin_line": 408,
      "end_line": 420,
      "comment": "\r\n     * Calculates the interval width for a given series.\r\n     *  \r\n     * @param series  the series index.\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 49)",
        "(line 410,col 9)-(line 410,col 58)",
        "(line 411,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.equals(java.lang.Object)",
      "begin_line": 429,
      "end_line": 447,
      "comment": "\r\n     * Tests the delegate for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 59)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDelegate.clone()",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\r\n     * @return A clone of this delegate.\r\n     * \r\n     * @throws CloneNotSupportedException if the object cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 29)"
      ]
    }
  ]
}