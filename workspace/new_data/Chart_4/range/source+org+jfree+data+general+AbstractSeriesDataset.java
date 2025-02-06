{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/AbstractSeriesDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSeriesDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.general.SeriesDataset",
        "org.jfree.data.general.SeriesChangeListener",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 113,
      "comment": "\r\n * An abstract implementation of the {@link SeriesDataset} interface,\r\n * containing a mechanism for registering change listeners.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.AbstractSeriesDataset()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\r\n     * Creates a new dataset.\r\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.getSeriesCount()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.getSeriesKey(int)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\r\n     * Returns the key for a series.\r\n     * \u003cp\u003e\r\n     * If \u003ccode\u003eseries\u003c/code\u003e is not within the specified range, the\r\n     * implementing method should throw an {@link IndexOutOfBoundsException}\r\n     * (preferred) or an {@link IllegalArgumentException}.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The series key.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.indexOf(java.lang.Comparable)",
      "begin_line": 94,
      "end_line": 102,
      "comment": "\r\n     * Returns the index of the named series, or -1.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 43)",
        "(line 96,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.seriesChanged(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Called when a series belonging to the dataset changes.\r\n     *\r\n     * @param event  information about the change.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 29)"
      ]
    }
  ]
}