{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/pie/PieDatasetChangeInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieDatasetChangeInfo",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.DatasetChangeInfo"
      ],
      "begin_line": 50,
      "end_line": 102,
      "comment": "\n * Summarises a change to a {@link PieDataset}.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "changeType"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The type of change. "
    },
    {
      "type": "field",
      "varNames": [
        "index1"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The index of the first data item affected by the change. "
    },
    {
      "type": "field",
      "varNames": [
        "index2"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The index of the latest data item affected by the change. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.pie.PieDatasetChangeInfo.PieDatasetChangeInfo(org.jfree.data.pie.PieDatasetChangeType, int, int)",
      "begin_line": 68,
      "end_line": 73,
      "comment": "\n     * Creates a new instance.\n     *\n     * @param t  the type of change (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param index1  the index of the first data item affected by the change.\n     * @param index2  the index of the last data item affected by the change.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)",
        "(line 71,col 9)-(line 71,col 29)",
        "(line 72,col 9)-(line 72,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetChangeInfo.getChangeType()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns the series change type.\n     *\n     * @return The series change type.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetChangeInfo.getIndex1()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns the index of the first item affected by the change.\n     *\n     * @return The index.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetChangeInfo.getIndex2()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns the index of the last item affects by the change.\n     *\n     * @return The index.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 27)"
      ]
    }
  ]
}