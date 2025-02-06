{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/XYBarDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBarDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.general.DatasetChangeListener"
      ],
      "begin_line": 60,
      "end_line": 381,
      "comment": "\r\n * A dataset wrapper class that converts a standard {@link XYDataset} into an\r\n * {@link IntervalXYDataset} suitable for use in creating XY bar charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "underlying"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The underlying dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "barWidth"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The bar width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYBarDataset.XYBarDataset(org.jfree.data.xy.XYDataset, double)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\r\n     * Creates a new dataset.\r\n     * \r\n     * @param underlying  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     * @param barWidth  the width of the bars.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 37)",
        "(line 78,col 9)-(line 78,col 48)",
        "(line 79,col 9)-(line 79,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getUnderlyingDataset()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Returns the underlying dataset that was specified via the constructor.\r\n     * \r\n     * @return The underlying dataset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getBarWidth()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Returns the bar width.\r\n     * \r\n     * @return The bar width.\r\n     * \r\n     * @see #setBarWidth(double)\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.setBarWidth(double)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\r\n     * Sets the bar width and sends a {@link DatasetChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param barWidth  the bar width.\r\n     * \r\n     * @see #getBarWidth()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getSeriesCount()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getSeriesKey(int)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The series key.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getItemCount(int)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getX(int, int)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Returns the x-value for an item within a series. \r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value.\r\n     * \r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getXValue(int, int)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     * \r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getY(int, int)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getYValue(int, int)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     * \r\n     * @see #getY(int, int)\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartX(int, int)",
      "begin_line": 215,
      "end_line": 222,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 29)",
        "(line 217,col 9)-(line 217,col 57)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartXValue(int, int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\r\n     * Returns the starting x-value (as a double primitive) for an item within \r\n     * a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     * \r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndX(int, int)",
      "begin_line": 247,
      "end_line": 254,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 29)",
        "(line 249,col 9)-(line 249,col 57)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndXValue(int, int)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\r\n     * Returns the ending x-value (as a double primitive) for an item within \r\n     * a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     * \r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartY(int, int)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartYValue(int, int)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\r\n     * Returns the starting y-value (as a double primitive) for an item within \r\n     * a series.  \r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     * \r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndY(int, int)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndYValue(int, int)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\r\n     * Returns the ending y-value (as a double primitive) for an item within \r\n     * a series.  \r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     * \r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\r\n     * Receives notification of an dataset change event.\r\n     *\r\n     * @param event  information about the event.\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.equals(java.lang.Object)",
      "begin_line": 341,
      "end_line": 356,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 47)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.clone()",
      "begin_line": 372,
      "end_line": 379,
      "comment": "\r\n     * Returns an independent copy of the dataset.  Note that:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003ethe underlying dataset is only cloned if it implements the \r\n     * {@link PublicCloneable} interface;\u003c/li\u003e\r\n     * \u003cli\u003ethe listeners registered with this dataset are not carried over to\r\n     * the cloned dataset.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @return An independent copy of the dataset.\r\n     * \r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned for \r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 58)",
        "(line 374,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 21)"
      ]
    }
  ]
}