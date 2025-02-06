{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/SeriesChangeInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SeriesChangeInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 99,
      "comment": "\n * Summarises a change to a series.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "changeType"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The type of change. "
    },
    {
      "type": "field",
      "varNames": [
        "index1"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The index of the first data item affected by the change. "
    },
    {
      "type": "field",
      "varNames": [
        "index2"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The index of the latest data item affected by the change. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.SeriesChangeInfo.SeriesChangeInfo(org.jfree.data.general.SeriesChangeType, int, int)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Creates a new instance.\n     *\n     * @param t  the type of change (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param index1  the index of the first data item affected by the change.\n     * @param index2  the index of the last data item affected by the change.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 28)",
        "(line 68,col 9)-(line 68,col 29)",
        "(line 69,col 9)-(line 69,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeInfo.getChangeType()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Returns the series change type.\n     *\n     * @return The series change type.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeInfo.getIndex1()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns the index of the first item affected by the change.\n     *\n     * @return The index.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeInfo.getIndex2()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Returns the index of the last item affects by the change.\n     *\n     * @return The index.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 27)"
      ]
    }
  ]
}