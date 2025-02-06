{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/XYBarDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBarDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.event.DatasetChangeListener",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 62,
      "end_line": 384,
      "comment": "\r\n * A dataset wrapper class that converts a standard {@link XYDataset} into an\r\n * {@link IntervalXYDataset} suitable for use in creating XY bar charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "underlying"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The underlying dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "barWidth"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The bar width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYBarDataset.XYBarDataset(org.jfree.data.xy.XYDataset, double)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\r\n     * Creates a new dataset.\r\n     *\r\n     * @param underlying  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param barWidth  the width of the bars.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 37)",
        "(line 80,col 9)-(line 80,col 48)",
        "(line 81,col 9)-(line 81,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getUnderlyingDataset()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns the underlying dataset that was specified via the constructor.\r\n     *\r\n     * @return The underlying dataset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getBarWidth()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Returns the bar width.\r\n     *\r\n     * @return The bar width.\r\n     *\r\n     * @see #setBarWidth(double)\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.setBarWidth(double)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\r\n     * Sets the bar width and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param barWidth  the bar width.\r\n     *\r\n     * @see #getBarWidth()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 33)",
        "(line 118,col 9)-(line 118,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getSeriesCount()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getSeriesKey(int)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The series key.\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getItemCount(int)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getX(int, int)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getXValue(int, int)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getY(int, int)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getYValue(int, int)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getY(int, int)\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartX(int, int)",
      "begin_line": 218,
      "end_line": 225,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 29)",
        "(line 220,col 9)-(line 220,col 57)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartXValue(int, int)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\r\n     * Returns the starting x-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndX(int, int)",
      "begin_line": 250,
      "end_line": 257,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 57)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndXValue(int, int)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\r\n     * Returns the ending x-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartY(int, int)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getStartYValue(int, int)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Returns the starting y-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndY(int, int)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.getEndYValue(int, int)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns the ending y-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.datasetChanged(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\r\n     * Receives notification of an dataset change event.\r\n     *\r\n     * @param event  information about the event.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.equals(java.lang.Object)",
      "begin_line": 344,
      "end_line": 359,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 47)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYBarDataset.clone()",
      "begin_line": 375,
      "end_line": 382,
      "comment": "\r\n     * Returns an independent copy of the dataset.  Note that:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003ethe underlying dataset is only cloned if it implements the\r\n     * {@link PublicCloneable} interface;\u003c/li\u003e\r\n     * \u003cli\u003ethe listeners registered with this dataset are not carried over to\r\n     * the cloned dataset.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return An independent copy of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned for\r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 58)",
        "(line 377,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 21)"
      ]
    }
  ]
}