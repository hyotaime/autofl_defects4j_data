{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/VectorSeriesCollection.java",
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
      "begin_line": 60,
      "end_line": 330,
      "comment": "\r\n * A collection of {@link VectorSeries} objects.\r\n *\r\n * @since 1.0.6\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.VectorSeriesCollection()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eVectorSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.addSeries(org.jfree.data.xy.VectorSeries)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 30)",
        "(line 84,col 9)-(line 84,col 39)",
        "(line 85,col 9)-(line 85,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.removeSeries(org.jfree.data.xy.VectorSeries)",
      "begin_line": 97,
      "end_line": 107,
      "comment": "\r\n     * Removes the specified series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean indicating whether the series has actually been\r\n     *         removed.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 51)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.removeAllSeries()",
      "begin_line": 113,
      "end_line": 126,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 120,col 9)",
        "(line 123,col 9)-(line 123,col 26)",
        "(line 124,col 9)-(line 124,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeriesCount()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeries(int)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getSeriesKey(int)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.indexOf(org.jfree.data.xy.VectorSeries)",
      "begin_line": 178,
      "end_line": 183,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series index.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getItemCount(int)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getXValue(int, int)",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 62)",
        "(line 210,col 9)-(line 210,col 65)",
        "(line 211,col 9)-(line 211,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getX(int, int)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the x-value for an item within a series.  Note that this method\r\n     * creates a new {@link Double} instance every time it is called---use\r\n     * {@link #getXValue(int, int)} instead, if possible.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getYValue(int, int)",
      "begin_line": 236,
      "end_line": 240,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 62)",
        "(line 238,col 9)-(line 238,col 65)",
        "(line 239,col 9)-(line 239,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getY(int, int)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns the y-value for an item within a series.  Note that this method\r\n     * creates a new {@link Double} instance every time it is called---use\r\n     * {@link #getYValue(int, int)} instead, if possible.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVector(int, int)",
      "begin_line": 264,
      "end_line": 268,
      "comment": "\r\n     * Returns the vector for an item in a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The vector (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 62)",
        "(line 266,col 9)-(line 266,col 65)",
        "(line 267,col 9)-(line 267,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVectorXValue(int, int)",
      "begin_line": 278,
      "end_line": 282,
      "comment": "\r\n     * Returns the x-component of the vector for an item in a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-component of the vector.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 62)",
        "(line 280,col 9)-(line 280,col 65)",
        "(line 281,col 9)-(line 281,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.getVectorYValue(int, int)",
      "begin_line": 292,
      "end_line": 296,
      "comment": "\r\n     * Returns the y-component of the vector for an item in a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-component of the vector.\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 62)",
        "(line 294,col 9)-(line 294,col 65)",
        "(line 295,col 9)-(line 295,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.equals(java.lang.Object)",
      "begin_line": 305,
      "end_line": 314,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 67)",
        "(line 313,col 9)-(line 313,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeriesCollection.clone()",
      "begin_line": 323,
      "end_line": 328,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 325,col 57)",
        "(line 326,col 9)-(line 326,col 65)",
        "(line 327,col 9)-(line 327,col 21)"
      ]
    }
  ]
}