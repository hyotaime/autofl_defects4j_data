{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/VectorSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.VectorXYDataset",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 328,
      "comment": "\r\n * A collection of {@link VectorSeries} objects.\r\n * \r\n * @since 1.0.6\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.VectorSeriesCollection()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " \r\n     * Creates a new instance of \u003ccode\u003eVectorSeriesCollection\u003c/code\u003e. \r\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.addSeries(org.jfree.data.xy.VectorSeries)",
      "begin_line": 77,
      "end_line": 84,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 30)",
        "(line 82,col 9)-(line 82,col 39)",
        "(line 83,col 9)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.removeSeries(org.jfree.data.xy.VectorSeries)",
      "begin_line": 95,
      "end_line": 105,
      "comment": "\r\n     * Removes the specified series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A boolean indicating whether the series has actually been \r\n     *         removed.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 51)",
        "(line 100,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.removeAllSeries()",
      "begin_line": 111,
      "end_line": 124,
      "comment": "\r\n     * Removes all the series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 118,col 9)",
        "(line 121,col 9)-(line 121,col 26)",
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeriesCount()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeries(int)",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeriesKey(int)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.indexOf(org.jfree.data.xy.VectorSeries)",
      "begin_line": 176,
      "end_line": 181,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     * \r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The series index.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getItemCount(int)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getXValue(int, int)",
      "begin_line": 206,
      "end_line": 210,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 62)",
        "(line 208,col 9)-(line 208,col 65)",
        "(line 209,col 9)-(line 209,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getX(int, int)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the x-value for an item within a series.  Note that this method\r\n     * creates a new {@link Double} instance every time it is called---use\r\n     * {@link #getXValue(int, int)} instead, if possible.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getYValue(int, int)",
      "begin_line": 234,
      "end_line": 238,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 62)",
        "(line 236,col 9)-(line 236,col 65)",
        "(line 237,col 9)-(line 237,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getY(int, int)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\r\n     * Returns the y-value for an item within a series.  Note that this method\r\n     * creates a new {@link Double} instance every time it is called---use\r\n     * {@link #getYValue(int, int)} instead, if possible.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVector(int, int)",
      "begin_line": 262,
      "end_line": 266,
      "comment": "\r\n     * Returns the vector for an item in a series.  \r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The vector (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 62)",
        "(line 264,col 9)-(line 264,col 65)",
        "(line 265,col 9)-(line 265,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVectorXValue(int, int)",
      "begin_line": 276,
      "end_line": 280,
      "comment": "\r\n     * Returns the x-component of the vector for an item in a series.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The x-component of the vector.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 62)",
        "(line 278,col 9)-(line 278,col 65)",
        "(line 279,col 9)-(line 279,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVectorYValue(int, int)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\r\n     * Returns the y-component of the vector for an item in a series.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The y-component of the vector.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 62)",
        "(line 292,col 9)-(line 292,col 65)",
        "(line 293,col 9)-(line 293,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.equals(java.lang.Object)",
      "begin_line": 303,
      "end_line": 312,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean. \r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 67)",
        "(line 311,col 9)-(line 311,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.clone()",
      "begin_line": 321,
      "end_line": 326,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 323,col 57)",
        "(line 324,col 9)-(line 324,col 65)",
        "(line 325,col 9)-(line 325,col 21)"
      ]
    }
  ]
}