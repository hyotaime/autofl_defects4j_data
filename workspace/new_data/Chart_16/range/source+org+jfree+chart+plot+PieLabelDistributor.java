{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/PieLabelDistributor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieLabelDistributor",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.AbstractPieLabelDistributor"
      ],
      "begin_line": 51,
      "end_line": 221,
      "comment": "\r\n * This class distributes the section labels for one side of a pie chart so \r\n * that they do not overlap.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "minGap"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The minimum gap. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.PieLabelDistributor(int)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\r\n     * Creates a new distributor.\r\n     * \r\n     * @param labelCount  the number of labels (ignored).\r\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.distributeLabels(double, double)",
      "begin_line": 71,
      "end_line": 90,
      "comment": "\r\n     * Distributes the labels.\r\n     * \r\n     * @param minY  the minimum y-coordinate in Java2D-space.\r\n     * @param height  the available height (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 15)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.isOverlap()",
      "begin_line": 98,
      "end_line": 108,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if there are overlapping labels in the list, \r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 23)",
        "(line 100,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.adjustInwards()",
      "begin_line": 114,
      "end_line": 136,
      "comment": "\r\n     * Adjusts the y-coordinate for the labels in towards the center in an \r\n     * attempt to fix overlapping.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 22)",
        "(line 116,col 9)-(line 116,col 43)",
        "(line 117,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.adjustDownwards(double, double)",
      "begin_line": 145,
      "end_line": 155,
      "comment": "\r\n     * Any labels that are overlapping are moved down in an attempt to \r\n     * eliminate the overlaps.\r\n     * \r\n     * @param minY  the minimum y value (in Java2D coordinate space).\r\n     * @param height  the height available for all labels.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.adjustUpwards(double, double)",
      "begin_line": 164,
      "end_line": 173,
      "comment": "\r\n     * Any labels that are overlapping are moved up in an attempt to eliminate \r\n     * the overlaps.\r\n     * \r\n     * @param minY  the minimum y value (in Java2D coordinate space).\r\n     * @param height  the height available for all labels.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.spreadEvenly(double, double)",
      "begin_line": 182,
      "end_line": 198,
      "comment": "\r\n     * Labels are spaced evenly in the available space in an attempt to \r\n     * eliminate the overlaps.\r\n     * \r\n     * @param minY  the minimum y value (in Java2D coordinate space).\r\n     * @param height  the height available for all labels.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 24)",
        "(line 184,col 9)-(line 184,col 39)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 61)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.sort()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Sorts the label records into ascending order by y-value.\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.toString()",
      "begin_line": 213,
      "end_line": 219,
      "comment": "\r\n     * Returns a string containing a description of the object for \r\n     * debugging purposes.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 49)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 33)"
      ]
    }
  ]
}