{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/PieLabelDistributor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieLabelDistributor",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.AbstractPieLabelDistributor"
      ],
      "begin_line": 52,
      "end_line": 222,
      "comment": "\r\n * This class distributes the section labels for one side of a pie chart so \r\n * that they do not overlap.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "minGap"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The minimum gap. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.PieLabelDistributor(int)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\r\n     * Creates a new distributor.\r\n     * \r\n     * @param labelCount  the number of labels (ignored).\r\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.distributeLabels(double, double)",
      "begin_line": 72,
      "end_line": 89,
      "comment": "\r\n     * Distributes the labels.\r\n     * \r\n     * @param minY  the minimum y-coordinate in Java2D-space.\r\n     * @param height  the available height (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 15)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.isOverlap()",
      "begin_line": 97,
      "end_line": 107,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if there are overlapping labels in the list, \r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 23)",
        "(line 99,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.adjustInwards()",
      "begin_line": 113,
      "end_line": 135,
      "comment": "\r\n     * Adjusts the y-coordinate for the labels in towards the center in an \r\n     * attempt to fix overlapping.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 22)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 116,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.adjustDownwards(double, double)",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\r\n     * Any labels that are overlapping are moved down in an attempt to \r\n     * eliminate the overlaps.\r\n     * \r\n     * @param minY  the minimum y value (in Java2D coordinate space).\r\n     * @param height  the height available for all labels.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.adjustUpwards(double, double)",
      "begin_line": 164,
      "end_line": 174,
      "comment": "\r\n     * Any labels that are overlapping are moved up in an attempt to eliminate \r\n     * the overlaps.\r\n     * \r\n     * @param minY  the minimum y value (in Java2D coordinate space).\r\n     * @param height  the height available for all labels.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.spreadEvenly(double, double)",
      "begin_line": 183,
      "end_line": 199,
      "comment": "\r\n     * Labels are spaced evenly in the available space in an attempt to \r\n     * eliminate the overlaps.\r\n     * \r\n     * @param minY  the minimum y value (in Java2D coordinate space).\r\n     * @param height  the height available for all labels.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 24)",
        "(line 185,col 9)-(line 185,col 39)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 48)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.sort()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Sorts the label records into ascending order by y-value.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelDistributor.toString()",
      "begin_line": 214,
      "end_line": 220,
      "comment": "\r\n     * Returns a string containing a description of the object for \r\n     * debugging purposes.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 49)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 33)"
      ]
    }
  ]
}