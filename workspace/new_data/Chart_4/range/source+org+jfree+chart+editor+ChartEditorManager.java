{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/editor/ChartEditorManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartEditorManager",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 94,
      "comment": "\r\n * The central point for obtaining {@link ChartEditor} instances for editing\r\n * charts.  Right now, the API is minimal - the plan is to extend this class\r\n * to provide customisation options for chart editors (for example, make some\r\n * editor items read-only).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " This factory creates new {@link ChartEditor} instances as required. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.ChartEditorManager.ChartEditorManager()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\r\n     * Private constructor prevents instantiation.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.ChartEditorManager.getChartEditorFactory()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Returns the current factory.\r\n     *\r\n     * @return The current factory (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.ChartEditorManager.setChartEditorFactory(org.jfree.chart.editor.ChartEditorFactory)",
      "begin_line": 77,
      "end_line": 82,
      "comment": "\r\n     * Sets the chart editor factory.\r\n     *\r\n     * @param f  the new factory (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.ChartEditorManager.getChartEditor(org.jfree.chart.JFreeChart)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns a component that can be used to edit the given chart.\r\n     *\r\n     * @param chart  the chart.\r\n     *\r\n     * @return The chart editor.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 43)"
      ]
    }
  ]
}