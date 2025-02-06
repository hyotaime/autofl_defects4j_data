{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ui/LCBLayout.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LCBLayout",
      "is_interface": false,
      "parent_types": [
        "java.awt.LayoutManager",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 268,
      "comment": "\n * Specialised layout manager for a grid of components.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMNS"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A constant for the number of columns in the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "colWidth"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Tracks the column widths. "
    },
    {
      "type": "field",
      "varNames": [
        "rowHeight"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Tracks the row heights. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGap"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The gap between each label and component. "
    },
    {
      "type": "field",
      "varNames": [
        "buttonGap"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The gap between each component and button. "
    },
    {
      "type": "field",
      "varNames": [
        "vGap"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The gap between rows. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.LCBLayout.LCBLayout(int)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * Creates a new LCBLayout with the specified maximum number of rows.\n     *\n     * @param maxrows  the maximum number of rows.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 27)",
        "(line 84,col 9)-(line 84,col 27)",
        "(line 85,col 9)-(line 85,col 22)",
        "(line 86,col 9)-(line 86,col 41)",
        "(line 87,col 9)-(line 87,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.LCBLayout.preferredLayoutSize(java.awt.Container)",
      "begin_line": 97,
      "end_line": 126,
      "comment": "\n     * Returns the preferred size using this layout manager.\n     *\n     * @param parent  the parent.\n     *\n     * @return the preferred size using this layout manager.\n    ",
      "child_ranges": [
        "(line 99,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.LCBLayout.minimumLayoutSize(java.awt.Container)",
      "begin_line": 135,
      "end_line": 164,
      "comment": "\n     * Returns the minimum size using this layout manager.\n     *\n     * @param parent  the parent.\n     *\n     * @return the minimum size using this layout manager.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.LCBLayout.layoutContainer(java.awt.Container)",
      "begin_line": 171,
      "end_line": 228,
      "comment": "\n     * Lays out the components.\n     *\n     * @param parent  the parent.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.LCBLayout.addLayoutComponent(java.awt.Component)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Not used.\n     *\n     * @param comp  the component.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.LCBLayout.removeLayoutComponent(java.awt.Component)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Not used.\n     *\n     * @param comp  the component.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.LCBLayout.addLayoutComponent(java.lang.String, java.awt.Component)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Not used.\n     *\n     * @param name  the component name.\n     * @param comp  the component.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.LCBLayout.removeLayoutComponent(java.lang.String, java.awt.Component)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Not used.\n     *\n     * @param name  the component name.\n     * @param comp  the component.\n     ",
      "child_ranges": []
    }
  ]
}