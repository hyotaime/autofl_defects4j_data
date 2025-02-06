{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/XYBarDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBarDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.general.DatasetChangeListener",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 61,
      "end_line": 382,
      "comment": "\r\n * A dataset wrapper class that converts a standard {@link XYDataset} into an\r\n * {@link IntervalXYDataset} suitable for use in creating XY bar charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "underlying"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The underlying dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "barWidth"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The bar width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYBarDataset.XYBarDataset(org.jfree.data.xy.XYDataset, double)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\r\n     * Creates a new dataset.\r\n     *\r\n     * @param underlying  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param barWidth  the width of the bars.\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)",
        "(line 79,col 9)-(line 79,col 48)",
        "(line 80,col 9)-(line 80,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getUnderlyingDataset()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Returns the underlying dataset that was specified via the constructor.\r\n     *\r\n     * @return The underlying dataset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getBarWidth()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Returns the bar width.\r\n     *\r\n     * @return The bar width.\r\n     *\r\n     * @see #setBarWidth(double)\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.setBarWidth(double)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\r\n     * Sets the bar width and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param barWidth  the bar width.\r\n     *\r\n     * @see #getBarWidth()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 33)",
        "(line 117,col 9)-(line 117,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getSeriesCount()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getSeriesKey(int)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The series key.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getItemCount(int)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getX(int, int)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getXValue(int, int)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getY(int, int)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getYValue(int, int)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getY(int, int)\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartX(int, int)",
      "begin_line": 216,
      "end_line": 223,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 29)",
        "(line 218,col 9)-(line 218,col 57)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartXValue(int, int)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the starting x-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndX(int, int)",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 29)",
        "(line 250,col 9)-(line 250,col 57)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndXValue(int, int)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Returns the ending x-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartY(int, int)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartYValue(int, int)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Returns the starting y-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndY(int, int)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndYValue(int, int)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Returns the ending y-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\r\n     * Receives notification of an dataset change event.\r\n     *\r\n     * @param event  information about the event.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.equals(java.lang.Object)",
      "begin_line": 342,
      "end_line": 357,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 47)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.clone()",
      "begin_line": 373,
      "end_line": 380,
      "comment": "\r\n     * Returns an independent copy of the dataset.  Note that:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003ethe underlying dataset is only cloned if it implements the\r\n     * {@link PublicCloneable} interface;\u003c/li\u003e\r\n     * \u003cli\u003ethe listeners registered with this dataset are not carried over to\r\n     * the cloned dataset.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return An independent copy of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned for\r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 58)",
        "(line 375,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 21)"
      ]
    }
  ]
}