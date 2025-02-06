{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/MatrixSeriesCollection.java",
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
      "begin_line": 63,
      "end_line": 346,
      "comment": "\r\n * Represents a collection of {@link MatrixSeries} that can be used as a\r\n * dataset.\r\n *\r\n * @see org.jfree.data.xy.MatrixSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesList"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The series that are included in the collection. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.MatrixSeriesCollection()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\r\n     * Constructs an empty dataset.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.MatrixSeriesCollection(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 85,
      "end_line": 92,
      "comment": "\r\n     * Constructs a dataset and populates it with a single matrix series.\r\n     *\r\n     * @param series the time series.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 52)",
        "(line 88,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getItemCount(int)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeries(int)",
      "begin_line": 115,
      "end_line": 123,
      "comment": "\r\n     * Returns the series having the specified index.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 78)",
        "(line 122,col 9)-(line 122,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeriesCount()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The number of series in the collection.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getSeriesKey(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getX(int, int)",
      "begin_line": 159,
      "end_line": 164,
      "comment": "\r\n     * Returns the j index value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The j index value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYDataset#getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 78)",
        "(line 161,col 9)-(line 161,col 48)",
        "(line 163,col 9)-(line 163,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getY(int, int)",
      "begin_line": 178,
      "end_line": 183,
      "comment": "\r\n     * Returns the i index value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex zero-based series index.\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The i index value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYDataset#getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 78)",
        "(line 180,col 9)-(line 180,col 45)",
        "(line 182,col 9)-(line 182,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.getZ(int, int)",
      "begin_line": 197,
      "end_line": 201,
      "comment": "\r\n     * Returns the Mij item value of the specified Mij matrix item in the\r\n     * specified matrix series.\r\n     *\r\n     * @param seriesIndex the series (zero-based index).\r\n     * @param itemIndex zero-based item index.\r\n     *\r\n     * @return The Mij item value for the specified matrix item.\r\n     *\r\n     * @see org.jfree.data.xy.XYZDataset#getZValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 78)",
        "(line 199,col 9)-(line 199,col 45)",
        "(line 200,col 9)-(line 200,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.addSeries(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 214,
      "end_line": 226,
      "comment": "\r\n     * Adds a series to the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     *\r\n     * @param series the series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 222,col 9)-(line 222,col 36)",
        "(line 223,col 9)-(line 223,col 39)",
        "(line 224,col 9)-(line 224,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.equals(java.lang.Object)",
      "begin_line": 236,
      "end_line": 252,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj the object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.hashCode()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.clone()",
      "begin_line": 270,
      "end_line": 274,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 78)",
        "(line 272,col 9)-(line 272,col 77)",
        "(line 273,col 9)-(line 273,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeAllSeries()",
      "begin_line": 282,
      "end_line": 294,
      "comment": "\r\n     * Removes all the series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 288,col 9)",
        "(line 291,col 9)-(line 291,col 32)",
        "(line 292,col 9)-(line 292,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeSeries(org.jfree.data.xy.MatrixSeries)",
      "begin_line": 307,
      "end_line": 320,
      "comment": "\r\n     * Removes a series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     * \u003c/p\u003e\r\n     *\r\n     * @param series the series.\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 314,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeriesCollection.removeSeries(int)",
      "begin_line": 332,
      "end_line": 344,
      "comment": "\r\n     * Removes a series from the collection.\r\n     * \u003cP\u003e\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     *\r\n     * @param seriesIndex the series (zero based index).\r\n     *\r\n     * @throws IllegalArgumentException\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 339,col 9)-(line 339,col 78)",
        "(line 340,col 9)-(line 340,col 42)",
        "(line 341,col 9)-(line 341,col 44)",
        "(line 342,col 9)-(line 342,col 52)"
      ]
    }
  ]
}