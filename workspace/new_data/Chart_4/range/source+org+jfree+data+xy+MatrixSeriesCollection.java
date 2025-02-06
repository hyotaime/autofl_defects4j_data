{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/MatrixSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYZDataset",
        "org.jfree.data.xy.XYZDataset",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 341,
      "comment": "\r\n * Represents a collection of {@link MatrixSeries} that can be used as a\r\n * dataset.\r\n *\r\n * @see org.jfree.data.xy.MatrixSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesList"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The series that are included in the collection. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.MatrixSeriesCollection()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\r\n     * Constructs an empty dataset.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.MatrixSeriesCollection(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\r\n     * Constructs a dataset and populates it with a single matrix series.\r\n     *\r\n     * @param series the time series.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 52)",
        "(line 87,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getItemCount(int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeries(int)",
      "begin_line": 114,
      "end_line": 122,
      "comment": "\r\n     * Returns the series having the specified index.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 78)",
        "(line 121,col 9)-(line 121,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeriesCount()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The number of series in the collection.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeriesKey(int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getX(int, int)",
      "begin_line": 158,
      "end_line": 163,
      "comment": "\r\n     * Returns the j index value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The j index value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYDataset#getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 78)",
        "(line 160,col 9)-(line 160,col 48)",
        "(line 162,col 9)-(line 162,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getY(int, int)",
      "begin_line": 177,
      "end_line": 182,
      "comment": "\r\n     * Returns the i index value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The i index value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYDataset#getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 78)",
        "(line 179,col 9)-(line 179,col 45)",
        "(line 181,col 9)-(line 181,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getZ(int, int)",
      "begin_line": 196,
      "end_line": 200,
      "comment": "\r\n     * Returns the Mij item value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex the series (zero-based index).\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The Mij item value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYZDataset#getZValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 78)",
        "(line 198,col 9)-(line 198,col 45)",
        "(line 199,col 9)-(line 199,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.addSeries(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 213,
      "end_line": 224,
      "comment": "\r\n     * Adds a series to the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     *\r\n     * @param series the series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 221,col 9)-(line 221,col 36)",
        "(line 222,col 9)-(line 222,col 39)",
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.equals(java.lang.Object)",
      "begin_line": 234,
      "end_line": 250,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj the object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.hashCode()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.clone()",
      "begin_line": 268,
      "end_line": 272,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 78)",
        "(line 270,col 9)-(line 270,col 77)",
        "(line 271,col 9)-(line 271,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeAllSeries()",
      "begin_line": 280,
      "end_line": 291,
      "comment": "\r\n     * Removes all the series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 286,col 9)",
        "(line 289,col 9)-(line 289,col 32)",
        "(line 290,col 9)-(line 290,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeSeries(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 304,
      "end_line": 316,
      "comment": "\r\n     * Removes a series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     *\r\n     * @param series the series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 311,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeSeries(int)",
      "begin_line": 328,
      "end_line": 339,
      "comment": "\r\n     * Removes a series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     *\r\n     * @param seriesIndex the series (zero based index).\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 335,col 9)-(line 335,col 78)",
        "(line 336,col 9)-(line 336,col 42)",
        "(line 337,col 9)-(line 337,col 44)",
        "(line 338,col 9)-(line 338,col 29)"
      ]
    }
  ]
}