{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/event/DatasetChangeEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetChangeEvent",
      "is_interface": false,
      "parent_types": [
        "java.util.EventObject"
      ],
      "begin_line": 58,
      "end_line": 117,
      "comment": "\r\n * A change event that encapsulates information about a change to a dataset.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\r\n     * The dataset that generated the change event.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "info"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\r\n     * Some details of the change.\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.event.DatasetChangeEvent.DatasetChangeEvent(java.lang.Object, org.jfree.data.general.Dataset, org.jfree.chart.event.DatasetChangeInfo)",
      "begin_line": 85,
      "end_line": 93,
      "comment": "\r\n     * Constructs a new event.  The source is either the dataset or the\r\n     * {@link Plot} class.  The dataset can be \u003ccode\u003enull\u003c/code\u003e (in this case\r\n     * the source will be the {@link Plot} class).\r\n     *\r\n     * @param source  the source of the event.\r\n     * @param dataset  the dataset that generated the event (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     * @param info  information about the change (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 22)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 31)",
        "(line 92,col 9)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.event.DatasetChangeEvent.getDataset()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Returns the dataset that generated the event.  Note that the dataset\r\n     * may be \u003ccode\u003enull\u003c/code\u003e since adding a \u003ccode\u003enull\u003c/code\u003e dataset to a\r\n     * plot will generated a change event.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.event.DatasetChangeEvent.getInfo()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Returns the dataset change info.\r\n     *\r\n     * @return The dataset change info.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 25)"
      ]
    }
  ]
}