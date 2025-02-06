{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/editor/DefaultChartEditor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultChartEditor",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel",
        "java.awt.event.ActionListener",
        "org.jfree.chart.editor.ChartEditor"
      ],
      "begin_line": 71,
      "end_line": 269,
      "comment": "\r\n * A panel for editing chart properties (includes subpanels for the title,\r\n * legend and plot).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "titleEditor"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " A panel for displaying/editing the properties of the title. "
    },
    {
      "type": "field",
      "varNames": [
        "plotEditor"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " A panel for displaying/editing the properties of the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "antialias"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\r\n     * A checkbox indicating whether or not the chart is drawn with\r\n     * anti-aliasing.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "background"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The chart background color. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 89,
      "end_line": 91,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.DefaultChartEditor(org.jfree.chart.JFreeChart)",
      "begin_line": 99,
      "end_line": 190,
      "comment": "\r\n     * Standard constructor - the property panel is made up of a number of\r\n     * sub-panels that are displayed in the tabbed pane.\r\n     *\r\n     * @param chart  the chart, whichs properties should be changed.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 38)",
        "(line 102,col 9)-(line 102,col 54)",
        "(line 103,col 9)-(line 103,col 69)",
        "(line 105,col 9)-(line 105,col 56)",
        "(line 106,col 9)-(line 108,col 57)",
        "(line 110,col 9)-(line 110,col 55)",
        "(line 111,col 9)-(line 111,col 72)",
        "(line 113,col 9)-(line 114,col 38)",
        "(line 115,col 9)-(line 115,col 57)",
        "(line 116,col 9)-(line 116,col 37)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 120,col 38)",
        "(line 121,col 9)-(line 121,col 70)",
        "(line 122,col 9)-(line 122,col 38)",
        "(line 123,col 9)-(line 124,col 30)",
        "(line 125,col 9)-(line 125,col 51)",
        "(line 126,col 9)-(line 126,col 39)",
        "(line 127,col 9)-(line 127,col 29)",
        "(line 129,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 133,col 31)",
        "(line 134,col 9)-(line 134,col 27)",
        "(line 135,col 9)-(line 135,col 73)",
        "(line 136,col 9)-(line 136,col 33)",
        "(line 137,col 9)-(line 137,col 29)",
        "(line 139,col 9)-(line 140,col 35)",
        "(line 141,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 31)",
        "(line 144,col 9)-(line 144,col 27)",
        "(line 145,col 9)-(line 145,col 73)",
        "(line 146,col 9)-(line 146,col 33)",
        "(line 147,col 9)-(line 147,col 29)",
        "(line 149,col 9)-(line 150,col 42)",
        "(line 151,col 9)-(line 152,col 42)",
        "(line 153,col 9)-(line 153,col 31)",
        "(line 154,col 9)-(line 154,col 27)",
        "(line 155,col 9)-(line 155,col 73)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 29)",
        "(line 159,col 9)-(line 160,col 43)",
        "(line 161,col 9)-(line 162,col 42)",
        "(line 163,col 9)-(line 163,col 31)",
        "(line 164,col 9)-(line 164,col 27)",
        "(line 165,col 9)-(line 165,col 73)",
        "(line 166,col 9)-(line 166,col 33)",
        "(line 167,col 9)-(line 167,col 29)",
        "(line 169,col 9)-(line 169,col 50)",
        "(line 170,col 9)-(line 170,col 47)",
        "(line 172,col 9)-(line 172,col 54)",
        "(line 174,col 9)-(line 174,col 39)",
        "(line 175,col 9)-(line 175,col 36)",
        "(line 177,col 9)-(line 177,col 45)",
        "(line 179,col 9)-(line 179,col 57)",
        "(line 180,col 9)-(line 180,col 80)",
        "(line 181,col 9)-(line 181,col 80)",
        "(line 183,col 9)-(line 183,col 54)",
        "(line 184,col 9)-(line 184,col 79)",
        "(line 185,col 9)-(line 185,col 78)",
        "(line 187,col 9)-(line 187,col 66)",
        "(line 188,col 9)-(line 188,col 44)",
        "(line 189,col 9)-(line 189,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.getTitleEditor()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\r\n     * Returns a reference to the title editor.\r\n     *\r\n     * @return A panel for editing the title.\r\n     ",
      "child_ranges": [
        "(line 198,col 7)-(line 198,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.getPlotEditor()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns a reference to the plot property sub-panel.\r\n     *\r\n     * @return A panel for editing the plot properties.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.getAntiAlias()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns the current setting of the anti-alias flag.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if anti-aliasing is enabled.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.getBackgroundPaint()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the current background paint.\r\n     *\r\n     * @return The current background paint.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\r\n     * Handles user interactions with the panel.\r\n     *\r\n     * @param event  a BackgroundPaint action.\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 50)",
        "(line 235,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.attemptModifyBackgroundPaint()",
      "begin_line": 245,
      "end_line": 252,
      "comment": "\r\n     * Allows the user the opportunity to select a new background paint.  Uses\r\n     * JColorChooser, so we are only allowing a subset of all Paint objects to\r\n     * be selected (fix later).\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 16)",
        "(line 247,col 9)-(line 248,col 49)",
        "(line 249,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.updateChart(org.jfree.chart.JFreeChart)",
      "begin_line": 260,
      "end_line": 267,
      "comment": "\r\n     * Updates the properties of a chart to match the properties defined on the\r\n     * panel.\r\n     *\r\n     * @param chart  the chart.\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 51)",
        "(line 263,col 9)-(line 263,col 62)",
        "(line 265,col 9)-(line 265,col 43)",
        "(line 266,col 9)-(line 266,col 55)"
      ]
    }
  ]
}