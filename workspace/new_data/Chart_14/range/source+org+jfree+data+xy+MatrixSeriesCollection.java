{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/MatrixSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYZDataset",
        "org.jfree.data.xy.XYZDataset",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 339,
      "comment": "\r\n * Represents a collection of {@link MatrixSeries} that can be used as a \r\n * dataset.\r\n *\r\n * @see org.jfree.data.xy.MatrixSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesList"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The series that are included in the collection. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.MatrixSeriesCollection()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Constructs an empty dataset.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.MatrixSeriesCollection(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "\r\n     * Constructs a dataset and populates it with a single matrix series.\r\n     *\r\n     * @param series the time series.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 52)",
        "(line 85,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getItemCount(int)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeries(int)",
      "begin_line": 112,
      "end_line": 120,
      "comment": "\r\n     * Returns the series having the specified index.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 78)",
        "(line 119,col 9)-(line 119,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeriesCount()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The number of series in the collection.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeriesKey(int)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getX(int, int)",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\r\n     * Returns the j index value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The j index value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYDataset#getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 78)",
        "(line 158,col 9)-(line 158,col 48)",
        "(line 160,col 9)-(line 160,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getY(int, int)",
      "begin_line": 175,
      "end_line": 180,
      "comment": "\r\n     * Returns the i index value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The i index value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYDataset#getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 78)",
        "(line 177,col 9)-(line 177,col 45)",
        "(line 179,col 9)-(line 179,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getZ(int, int)",
      "begin_line": 194,
      "end_line": 198,
      "comment": "\r\n     * Returns the Mij item value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex the series (zero-based index).\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The Mij item value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYZDataset#getZValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 78)",
        "(line 196,col 9)-(line 196,col 45)",
        "(line 197,col 9)-(line 197,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.addSeries(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 211,
      "end_line": 222,
      "comment": "\r\n     * Adds a series to the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     *\r\n     * @param series the series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 219,col 9)-(line 219,col 36)",
        "(line 220,col 9)-(line 220,col 39)",
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.equals(java.lang.Object)",
      "begin_line": 232,
      "end_line": 248,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj the object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.hashCode()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.clone()",
      "begin_line": 266,
      "end_line": 270,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 78)",
        "(line 268,col 9)-(line 268,col 77)",
        "(line 269,col 9)-(line 269,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeAllSeries()",
      "begin_line": 278,
      "end_line": 289,
      "comment": "\r\n     * Removes all the series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 284,col 9)",
        "(line 287,col 9)-(line 287,col 32)",
        "(line 288,col 9)-(line 288,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeSeries(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 302,
      "end_line": 314,
      "comment": "\r\n     * Removes a series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     *\r\n     * @param series the series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 309,col 9)-(line 313,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeSeries(int)",
      "begin_line": 326,
      "end_line": 337,
      "comment": "\r\n     * Removes a series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     *\r\n     * @param seriesIndex the series (zero based index).\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 333,col 9)-(line 333,col 78)",
        "(line 334,col 9)-(line 334,col 42)",
        "(line 335,col 9)-(line 335,col 44)",
        "(line 336,col 9)-(line 336,col 29)"
      ]
    }
  ]
}