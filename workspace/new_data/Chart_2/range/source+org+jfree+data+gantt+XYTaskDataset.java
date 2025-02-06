{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/gantt/XYTaskDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYTaskDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.event.DatasetChangeListener"
      ],
      "begin_line": 64,
      "end_line": 465,
      "comment": "\r\n * A dataset implementation that wraps a {@link TaskSeriesCollection} and\r\n * presents it as an {@link IntervalXYDataset}, allowing a set of tasks to\r\n * be displayed using an {@link XYBarRenderer} (and usually a\r\n * {@link SymbolAxis}).  This is a very specialised dataset implementation\r\n * ---before using it, you should take some time to understand the use-cases\r\n * that it is designed for.\r\n *\r\n * @since 1.0.11\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "underlying"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The underlying tasks. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesWidth"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The series interval width (typically 0.0 \u003c w \u003c\u003d 1.0). "
    },
    {
      "type": "field",
      "varNames": [
        "transposed"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " A flag that controls whether or not the data values are transposed. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.XYTaskDataset.XYTaskDataset(org.jfree.data.gantt.TaskSeriesCollection)",
      "begin_line": 81,
      "end_line": 88,
      "comment": "\r\n     * Creates a new dataset based on the supplied collection of tasks.\r\n     *\r\n     * @param tasks  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 32)",
        "(line 86,col 9)-(line 86,col 31)",
        "(line 87,col 9)-(line 87,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getTasks()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the underlying task series collection that was supplied to the\r\n     * constructor.\r\n     *\r\n     * @return The underlying collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesWidth()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the width of the interval for each series this dataset.\r\n     *\r\n     * @return The width of the series interval.\r\n     *\r\n     * @see #setSeriesWidth(double)\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.setSeriesWidth(double)",
      "begin_line": 119,
      "end_line": 126,
      "comment": "\r\n     * Sets the series interval width and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param w  the width.\r\n     *\r\n     * @see #getSeriesWidth()\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 29)",
        "(line 124,col 9)-(line 124,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.isTransposed()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\r\n     * Returns a flag that indicates whether or not the dataset is transposed.\r\n     * The default is \u003ccode\u003efalse\u003c/code\u003e which means the x-values are integers\r\n     * corresponding to the series indices, and the y-values are millisecond\r\n     * values corresponding to the task date/time intervals.  If the flag\r\n     * is set to \u003ccode\u003etrue\u003c/code\u003e, the x and y-values are reversed.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setTransposed(boolean)\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.setTransposed(boolean)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\r\n     * Sets the flag that controls whether or not the dataset is transposed\r\n     * and sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param transposed  the new flag value.\r\n     *\r\n     * @see #isTransposed()\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)",
        "(line 153,col 9)-(line 153,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesCount()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesKey(int)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the name of a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The name of a series.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getItemCount(int)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the number of items (tasks) in the specified series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getXValue(int, int)",
      "begin_line": 196,
      "end_line": 203,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getStartXValue(int, int)",
      "begin_line": 215,
      "end_line": 222,
      "comment": "\r\n     * Returns the starting date/time for the specified item (task) in the\r\n     * given series, measured in milliseconds since 1-Jan-1970 (as in\r\n     * java.util.Date).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The start date/time.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getEndXValue(int, int)",
      "begin_line": 234,
      "end_line": 241,
      "comment": "\r\n     * Returns the ending date/time for the specified item (task) in the\r\n     * given series, measured in milliseconds since 1-Jan-1970 (as in\r\n     * java.util.Date).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The end date/time.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getX(int, int)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Returns the x-value for the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value (in milliseconds).\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getStartX(int, int)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\r\n     * Returns the starting date/time for the specified item (task) in the\r\n     * given series, measured in milliseconds since 1-Jan-1970 (as in\r\n     * java.util.Date).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The start date/time.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getEndX(int, int)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns the ending date/time for the specified item (task) in the\r\n     * given series, measured in milliseconds since 1-Jan-1970 (as in\r\n     * java.util.Date).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The end date/time.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getYValue(int, int)",
      "begin_line": 291,
      "end_line": 298,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getStartYValue(int, int)",
      "begin_line": 309,
      "end_line": 316,
      "comment": "\r\n     * Returns the starting value of the y-interval for an item in the\r\n     * given series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The y-interval start.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getEndYValue(int, int)",
      "begin_line": 327,
      "end_line": 334,
      "comment": "\r\n     * Returns the ending value of the y-interval for an item in the\r\n     * given series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The y-interval end.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getY(int, int)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\r\n     * Returns the y-value for the specified series/item.  In this\r\n     * implementation, we return the series index as the y-value (this means\r\n     * that every item in the series has a constant integer value).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getStartY(int, int)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\r\n     * Returns the starting value of the y-interval for an item in the\r\n     * given series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The y-interval start.\r\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getEndY(int, int)",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\r\n     * Returns the ending value of the y-interval for an item in the\r\n     * given series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The y-interval end.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesValue(int)",
      "begin_line": 376,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesStartValue(int)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesEndValue(int)",
      "begin_line": 384,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getItemValue(int, int)",
      "begin_line": 388,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 57)",
        "(line 390,col 9)-(line 390,col 29)",
        "(line 391,col 9)-(line 391,col 46)",
        "(line 392,col 9)-(line 392,col 41)",
        "(line 393,col 9)-(line 393,col 37)",
        "(line 394,col 9)-(line 394,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getItemStartValue(int, int)",
      "begin_line": 397,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 57)",
        "(line 399,col 9)-(line 399,col 29)",
        "(line 400,col 9)-(line 400,col 46)",
        "(line 401,col 9)-(line 401,col 41)",
        "(line 402,col 9)-(line 402,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getItemEndValue(int, int)",
      "begin_line": 405,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 57)",
        "(line 407,col 9)-(line 407,col 29)",
        "(line 408,col 9)-(line 408,col 46)",
        "(line 409,col 9)-(line 409,col 37)",
        "(line 410,col 9)-(line 410,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.datasetChanged(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 420,
      "end_line": 423,
      "comment": "\r\n     * Receives a change event from the underlying dataset and responds by\r\n     * firing a change event for this dataset.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.equals(java.lang.Object)",
      "begin_line": 432,
      "end_line": 450,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 49)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.clone()",
      "begin_line": 459,
      "end_line": 463,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone of this dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 60)",
        "(line 461,col 9)-(line 461,col 74)",
        "(line 462,col 9)-(line 462,col 21)"
      ]
    }
  ]
}