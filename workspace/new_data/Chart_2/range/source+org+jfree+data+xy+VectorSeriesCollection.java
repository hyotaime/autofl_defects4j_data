{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/VectorSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.VectorXYDataset",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 334,
      "comment": "\r\n * A collection of {@link VectorSeries} objects.\r\n *\r\n * @since 1.0.6\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.VectorSeriesCollection()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eVectorSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.addSeries(org.jfree.data.xy.VectorSeries)",
      "begin_line": 80,
      "end_line": 88,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 30)",
        "(line 85,col 9)-(line 85,col 39)",
        "(line 86,col 9)-(line 86,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.removeSeries(org.jfree.data.xy.VectorSeries)",
      "begin_line": 99,
      "end_line": 110,
      "comment": "\r\n     * Removes the specified series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean indicating whether the series has actually been\r\n     *         removed.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 51)",
        "(line 104,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.removeAllSeries()",
      "begin_line": 116,
      "end_line": 130,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 123,col 9)",
        "(line 126,col 9)-(line 126,col 26)",
        "(line 127,col 9)-(line 127,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeriesCount()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeries(int)",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeriesKey(int)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.indexOf(org.jfree.data.xy.VectorSeries)",
      "begin_line": 182,
      "end_line": 187,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series index.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getItemCount(int)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getXValue(int, int)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 62)",
        "(line 214,col 9)-(line 214,col 65)",
        "(line 215,col 9)-(line 215,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getX(int, int)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Returns the x-value for an item within a series.  Note that this method\r\n     * creates a new {@link Double} instance every time it is called---use\r\n     * {@link #getXValue(int, int)} instead, if possible.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getYValue(int, int)",
      "begin_line": 240,
      "end_line": 244,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 62)",
        "(line 242,col 9)-(line 242,col 65)",
        "(line 243,col 9)-(line 243,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getY(int, int)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\r\n     * Returns the y-value for an item within a series.  Note that this method\r\n     * creates a new {@link Double} instance every time it is called---use\r\n     * {@link #getYValue(int, int)} instead, if possible.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVector(int, int)",
      "begin_line": 268,
      "end_line": 272,
      "comment": "\r\n     * Returns the vector for an item in a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The vector (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 62)",
        "(line 270,col 9)-(line 270,col 65)",
        "(line 271,col 9)-(line 271,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVectorXValue(int, int)",
      "begin_line": 282,
      "end_line": 286,
      "comment": "\r\n     * Returns the x-component of the vector for an item in a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-component of the vector.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 62)",
        "(line 284,col 9)-(line 284,col 65)",
        "(line 285,col 9)-(line 285,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVectorYValue(int, int)",
      "begin_line": 296,
      "end_line": 300,
      "comment": "\r\n     * Returns the y-component of the vector for an item in a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-component of the vector.\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 62)",
        "(line 298,col 9)-(line 298,col 65)",
        "(line 299,col 9)-(line 299,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.equals(java.lang.Object)",
      "begin_line": 309,
      "end_line": 318,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 67)",
        "(line 317,col 9)-(line 317,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.clone()",
      "begin_line": 327,
      "end_line": 332,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 329,col 57)",
        "(line 330,col 9)-(line 330,col 65)",
        "(line 331,col 9)-(line 331,col 21)"
      ]
    }
  ]
}