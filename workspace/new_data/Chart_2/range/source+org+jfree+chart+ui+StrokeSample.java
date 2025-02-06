{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/ui/StrokeSample.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrokeSample",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JComponent",
        "javax.swing.ListCellRenderer"
      ],
      "begin_line": 65,
      "end_line": 172,
      "comment": "\n * A panel that displays a stroke sample.\n "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The stroke being displayed. "
    },
    {
      "type": "field",
      "varNames": [
        "preferredSize"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The preferred size of the component. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.StrokeSample.StrokeSample(java.awt.Stroke)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Creates a StrokeSample for the specified stroke.\n     *\n     * @param stroke  the sample stroke.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)",
        "(line 80,col 9)-(line 80,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.StrokeSample.getStroke()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns the current Stroke object being displayed.\n     *\n     * @return the stroke.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.StrokeSample.setStroke(java.awt.Stroke)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Sets the Stroke object being displayed.\n     *\n     * @param stroke  the stroke.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 29)",
        "(line 99,col 9)-(line 99,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.StrokeSample.getPreferredSize()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Returns the preferred size of the component.\n     *\n     * @return the preferred size of the component.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.StrokeSample.paintComponent(java.awt.Graphics)",
      "begin_line": 116,
      "end_line": 149,
      "comment": "\n     * Draws a line using the sample stroke.\n     *\n     * @param g  the graphics device.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 39)",
        "(line 119,col 9)-(line 120,col 51)",
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 123,col 32)",
        "(line 124,col 9)-(line 124,col 31)",
        "(line 125,col 9)-(line 125,col 65)",
        "(line 126,col 9)-(line 126,col 66)",
        "(line 128,col 9)-(line 128,col 63)",
        "(line 129,col 9)-(line 129,col 68)",
        "(line 131,col 9)-(line 131,col 89)",
        "(line 132,col 9)-(line 132,col 89)",
        "(line 134,col 9)-(line 134,col 25)",
        "(line 135,col 9)-(line 135,col 25)",
        "(line 136,col 9)-(line 136,col 25)",
        "(line 137,col 9)-(line 137,col 25)",
        "(line 140,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.StrokeSample.getListCellRendererComponent(javax.swing.JList, java.lang.Object, int, boolean, boolean)",
      "begin_line": 163,
      "end_line": 170,
      "comment": "\n     * Returns a list cell renderer for the stroke, so the sample can be\n     * displayed in a list or combo.\n     *\n     * @param list  the list.\n     * @param value  the value.\n     * @param index  the index.\n     * @param isSelected  selected?\n     * @param cellHasFocus  focussed?\n     *\n     * @return the component for rendering.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 20)"
      ]
    }
  ]
}