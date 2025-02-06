{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/AbstractSeriesDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSeriesDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.general.SeriesDataset",
        "org.jfree.data.event.SeriesChangeListener",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 118,
      "comment": "\r\n * An abstract implementation of the {@link SeriesDataset} interface,\r\n * containing a mechanism for registering change listeners.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.AbstractSeriesDataset()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\r\n     * Creates a new dataset.\r\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.getSeriesCount()",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.getSeriesKey(int)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\r\n     * Returns the key for a series.\r\n     * \u003cp\u003e\r\n     * If \u003ccode\u003eseries\u003c/code\u003e is not within the specified range, the\r\n     * implementing method should throw an {@link IndexOutOfBoundsException}\r\n     * (preferred) or an {@link IllegalArgumentException}.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The series key.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.indexOf(java.lang.Comparable)",
      "begin_line": 97,
      "end_line": 105,
      "comment": "\r\n     * Returns the index of the named series, or -1.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 43)",
        "(line 99,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractSeriesDataset.seriesChanged(org.jfree.data.event.SeriesChangeEvent)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\r\n     * Called when a series belonging to the dataset changes.\r\n     *\r\n     * @param event  information about the change.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 52)"
      ]
    }
  ]
}