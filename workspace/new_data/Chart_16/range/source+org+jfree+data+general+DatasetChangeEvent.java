{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/general/DatasetChangeEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetChangeEvent",
      "is_interface": false,
      "parent_types": [
        "java.util.EventObject"
      ],
      "begin_line": 53,
      "end_line": 86,
      "comment": "\r\n * A change event that encapsulates information about a change to a dataset.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\r\n     * The dataset that generated the change event.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetChangeEvent.DatasetChangeEvent(java.lang.Object, org.jfree.data.general.Dataset)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\r\n     * Constructs a new event.  The source is either the dataset or the \r\n     * {@link org.jfree.chart.plot.Plot} class.  The dataset can be \r\n     * \u003ccode\u003enull\u003c/code\u003e (in this case the source will be the \r\n     * {@link org.jfree.chart.plot.Plot} class).\r\n     *\r\n     * @param source  the source of the event.\r\n     * @param dataset  the dataset that generated the event (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 22)",
        "(line 72,col 9)-(line 72,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetChangeEvent.getDataset()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Returns the dataset that generated the event.  Note that the dataset\r\n     * may be \u003ccode\u003enull\u003c/code\u003e since adding a \u003ccode\u003enull\u003c/code\u003e dataset to a \r\n     * plot will generated a change event.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 28)"
      ]
    }
  ]
}