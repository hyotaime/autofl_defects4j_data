{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/gantt/XYTaskDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYTaskDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.general.DatasetChangeListener"
      ],
      "begin_line": 63,
      "end_line": 461,
      "comment": "\r\n * A dataset implementation that wraps a {@link TaskSeriesCollection} and\r\n * presents it as an {@link IntervalXYDataset}, allowing a set of tasks to\r\n * be displayed using an {@link XYBarRenderer} (and usually a\r\n * {@link SymbolAxis}).  This is a very specialised dataset implementation\r\n * ---before using it, you should take some time to understand the use-cases\r\n * that it is designed for.\r\n *\r\n * @since 1.0.11\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "underlying"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The underlying tasks. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesWidth"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The series interval width (typically 0.0 \u003c w \u003c\u003d 1.0). "
    },
    {
      "type": "field",
      "varNames": [
        "transposed"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " A flag that controls whether or not the data values are transposed. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.XYTaskDataset.XYTaskDataset(org.jfree.data.gantt.TaskSeriesCollection)",
      "begin_line": 80,
      "end_line": 87,
      "comment": "\r\n     * Creates a new dataset based on the supplied collection of tasks.\r\n     *\r\n     * @param tasks  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 32)",
        "(line 85,col 9)-(line 85,col 31)",
        "(line 86,col 9)-(line 86,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getTasks()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Returns the underlying task series collection that was supplied to the\r\n     * constructor.\r\n     *\r\n     * @return The underlying collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesWidth()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns the width of the interval for each series this dataset.\r\n     *\r\n     * @return The width of the series interval.\r\n     *\r\n     * @see #setSeriesWidth(double)\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.setSeriesWidth(double)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\r\n     * Sets the series interval width and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param w  the width.\r\n     *\r\n     * @see #getSeriesWidth()\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 29)",
        "(line 123,col 9)-(line 123,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.isTransposed()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns a flag that indicates whether or not the dataset is transposed.\r\n     * The default is \u003ccode\u003efalse\u003c/code\u003e which means the x-values are integers\r\n     * corresponding to the series indices, and the y-values are millisecond\r\n     * values corresponding to the task date/time intervals.  If the flag\r\n     * is set to \u003ccode\u003etrue\u003c/code\u003e, the x and y-values are reversed.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setTransposed(boolean)\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.setTransposed(boolean)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\r\n     * Sets the flag that controls whether or not the dataset is transposed\r\n     * and sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param transposed  the new flag value.\r\n     *\r\n     * @see #isTransposed()\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 37)",
        "(line 151,col 9)-(line 151,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesCount()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesKey(int)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\r\n     * Returns the name of a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The name of a series.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getItemCount(int)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\r\n     * Returns the number of items (tasks) in the specified series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getXValue(int, int)",
      "begin_line": 193,
      "end_line": 200,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getStartXValue(int, int)",
      "begin_line": 212,
      "end_line": 219,
      "comment": "\r\n     * Returns the starting date/time for the specified item (task) in the\r\n     * given series, measured in milliseconds since 1-Jan-1970 (as in\r\n     * java.util.Date).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The start date/time.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getEndXValue(int, int)",
      "begin_line": 231,
      "end_line": 238,
      "comment": "\r\n     * Returns the ending date/time for the specified item (task) in the\r\n     * given series, measured in milliseconds since 1-Jan-1970 (as in\r\n     * java.util.Date).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The end date/time.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getX(int, int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\r\n     * Returns the x-value for the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value (in milliseconds).\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getStartX(int, int)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\r\n     * Returns the starting date/time for the specified item (task) in the\r\n     * given series, measured in milliseconds since 1-Jan-1970 (as in\r\n     * java.util.Date).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The start date/time.\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getEndX(int, int)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns the ending date/time for the specified item (task) in the\r\n     * given series, measured in milliseconds since 1-Jan-1970 (as in\r\n     * java.util.Date).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The end date/time.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getYValue(int, int)",
      "begin_line": 288,
      "end_line": 295,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getStartYValue(int, int)",
      "begin_line": 306,
      "end_line": 313,
      "comment": "\r\n     * Returns the starting value of the y-interval for an item in the\r\n     * given series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The y-interval start.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getEndYValue(int, int)",
      "begin_line": 324,
      "end_line": 331,
      "comment": "\r\n     * Returns the ending value of the y-interval for an item in the\r\n     * given series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The y-interval end.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getY(int, int)",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Returns the y-value for the specified series/item.  In this\r\n     * implementation, we return the series index as the y-value (this means\r\n     * that every item in the series has a constant integer value).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getStartY(int, int)",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\r\n     * Returns the starting value of the y-interval for an item in the\r\n     * given series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The y-interval start.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getEndY(int, int)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\r\n     * Returns the ending value of the y-interval for an item in the\r\n     * given series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item (or task) index.\r\n     *\r\n     * @return The y-interval end.\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesValue(int)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesStartValue(int)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getSeriesEndValue(int)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getItemValue(int, int)",
      "begin_line": 385,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 57)",
        "(line 387,col 9)-(line 387,col 29)",
        "(line 388,col 9)-(line 388,col 46)",
        "(line 389,col 9)-(line 389,col 41)",
        "(line 390,col 9)-(line 390,col 37)",
        "(line 391,col 9)-(line 391,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getItemStartValue(int, int)",
      "begin_line": 394,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 57)",
        "(line 396,col 9)-(line 396,col 29)",
        "(line 397,col 9)-(line 397,col 46)",
        "(line 398,col 9)-(line 398,col 41)",
        "(line 399,col 9)-(line 399,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.getItemEndValue(int, int)",
      "begin_line": 402,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 57)",
        "(line 404,col 9)-(line 404,col 29)",
        "(line 405,col 9)-(line 405,col 46)",
        "(line 406,col 9)-(line 406,col 37)",
        "(line 407,col 9)-(line 407,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\r\n     * Receives a change event from the underlying dataset and responds by\r\n     * firing a change event for this dataset.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.equals(java.lang.Object)",
      "begin_line": 428,
      "end_line": 446,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 49)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.XYTaskDataset.clone()",
      "begin_line": 455,
      "end_line": 459,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone of this dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 60)",
        "(line 457,col 9)-(line 457,col 74)",
        "(line 458,col 9)-(line 458,col 21)"
      ]
    }
  ]
}