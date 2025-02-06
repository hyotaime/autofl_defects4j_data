{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ChartFrame.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartFrame",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JFrame"
      ],
      "begin_line": 52,
      "end_line": 96,
      "comment": "\r\n * A frame for displaying a chart.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "chartPanel"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The chart panel. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartFrame.ChartFrame(java.lang.String, org.jfree.chart.JFreeChart)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\r\n     * Constructs a frame for a chart.\r\n     *\r\n     * @param title  the frame title.\r\n     * @param chart  the chart.\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartFrame.ChartFrame(java.lang.String, org.jfree.chart.JFreeChart, boolean)",
      "begin_line": 75,
      "end_line": 85,
      "comment": "\r\n     * Constructs a frame for a chart.\r\n     *\r\n     * @param title  the frame title.\r\n     * @param chart  the chart.\r\n     * @param scrollPane  if \u003ccode\u003etrue\u003c/code\u003e, put the Chart(Panel) into a \r\n     *                    JScrollPane.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 21)",
        "(line 77,col 9)-(line 77,col 67)",
        "(line 78,col 9)-(line 78,col 48)",
        "(line 79,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFrame.getChartPanel()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the chart panel for the frame.\r\n     *\r\n     * @return The chart panel.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 31)"
      ]
    }
  ]
}