{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/editor/DefaultChartEditor.java",
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
      "begin_line": 70,
      "end_line": 267,
      "comment": "\r\n * A panel for editing chart properties (includes subpanels for the title,\r\n * legend and plot).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "titleEditor"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " A panel for displaying/editing the properties of the title. "
    },
    {
      "type": "field",
      "varNames": [
        "plotEditor"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " A panel for displaying/editing the properties of the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "antialias"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " \r\n     * A checkbox indicating whether or not the chart is drawn with\r\n     * anti-aliasing.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "background"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The chart background color. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 88,
      "end_line": 89,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.DefaultChartEditor(org.jfree.chart.JFreeChart)",
      "begin_line": 97,
      "end_line": 188,
      "comment": "\r\n     * Standard constructor - the property panel is made up of a number of\r\n     * sub-panels that are displayed in the tabbed pane.\r\n     *\r\n     * @param chart  the chart, whichs properties should be changed.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 38)",
        "(line 100,col 9)-(line 100,col 54)",
        "(line 101,col 9)-(line 101,col 69)",
        "(line 103,col 9)-(line 103,col 56)",
        "(line 104,col 9)-(line 106,col 57)",
        "(line 108,col 9)-(line 108,col 55)",
        "(line 109,col 9)-(line 109,col 72)",
        "(line 111,col 9)-(line 112,col 38)",
        "(line 113,col 9)-(line 113,col 57)",
        "(line 114,col 9)-(line 114,col 37)",
        "(line 115,col 9)-(line 115,col 37)",
        "(line 116,col 9)-(line 116,col 37)",
        "(line 117,col 9)-(line 118,col 38)",
        "(line 119,col 9)-(line 119,col 70)",
        "(line 120,col 9)-(line 120,col 38)",
        "(line 121,col 9)-(line 122,col 30)",
        "(line 123,col 9)-(line 123,col 51)",
        "(line 124,col 9)-(line 124,col 39)",
        "(line 125,col 9)-(line 125,col 29)",
        "(line 127,col 9)-(line 128,col 34)",
        "(line 129,col 9)-(line 130,col 42)",
        "(line 131,col 9)-(line 131,col 31)",
        "(line 132,col 9)-(line 132,col 27)",
        "(line 133,col 9)-(line 133,col 73)",
        "(line 134,col 9)-(line 134,col 33)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 137,col 9)-(line 138,col 35)",
        "(line 139,col 9)-(line 140,col 42)",
        "(line 141,col 9)-(line 141,col 31)",
        "(line 142,col 9)-(line 142,col 27)",
        "(line 143,col 9)-(line 143,col 73)",
        "(line 144,col 9)-(line 144,col 33)",
        "(line 145,col 9)-(line 145,col 29)",
        "(line 147,col 9)-(line 148,col 42)",
        "(line 149,col 9)-(line 150,col 42)",
        "(line 151,col 9)-(line 151,col 31)",
        "(line 152,col 9)-(line 152,col 27)",
        "(line 153,col 9)-(line 153,col 73)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 155,col 9)-(line 155,col 29)",
        "(line 157,col 9)-(line 158,col 43)",
        "(line 159,col 9)-(line 160,col 42)",
        "(line 161,col 9)-(line 161,col 31)",
        "(line 162,col 9)-(line 162,col 27)",
        "(line 163,col 9)-(line 163,col 73)",
        "(line 164,col 9)-(line 164,col 33)",
        "(line 165,col 9)-(line 165,col 29)",
        "(line 167,col 9)-(line 167,col 50)",
        "(line 168,col 9)-(line 168,col 47)",
        "(line 170,col 9)-(line 170,col 54)",
        "(line 172,col 9)-(line 172,col 39)",
        "(line 173,col 9)-(line 173,col 36)",
        "(line 175,col 9)-(line 175,col 45)",
        "(line 177,col 9)-(line 177,col 57)",
        "(line 178,col 9)-(line 178,col 80)",
        "(line 179,col 9)-(line 179,col 80)",
        "(line 181,col 9)-(line 181,col 54)",
        "(line 182,col 9)-(line 182,col 79)",
        "(line 183,col 9)-(line 183,col 78)",
        "(line 185,col 9)-(line 185,col 66)",
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 187,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.getTitleEditor()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns a reference to the title editor.\r\n     *\r\n     * @return A panel for editing the title.\r\n     ",
      "child_ranges": [
        "(line 196,col 7)-(line 196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.getPlotEditor()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns a reference to the plot property sub-panel.\r\n     *\r\n     * @return A panel for editing the plot properties.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.getAntiAlias()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Returns the current setting of the anti-alias flag.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if anti-aliasing is enabled.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.getBackgroundPaint()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the current background paint.\r\n     *\r\n     * @return The current background paint.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 231,
      "end_line": 236,
      "comment": "\r\n     * Handles user interactions with the panel.\r\n     *\r\n     * @param event  a BackgroundPaint action.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 50)",
        "(line 233,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.attemptModifyBackgroundPaint()",
      "begin_line": 243,
      "end_line": 250,
      "comment": "\r\n     * Allows the user the opportunity to select a new background paint.  Uses\r\n     * JColorChooser, so we are only allowing a subset of all Paint objects to\r\n     * be selected (fix later).\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 16)",
        "(line 245,col 9)-(line 246,col 49)",
        "(line 247,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultChartEditor.updateChart(org.jfree.chart.JFreeChart)",
      "begin_line": 258,
      "end_line": 265,
      "comment": "\r\n     * Updates the properties of a chart to match the properties defined on the\r\n     * panel.\r\n     *\r\n     * @param chart  the chart.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 51)",
        "(line 261,col 9)-(line 261,col 62)",
        "(line 263,col 9)-(line 263,col 43)",
        "(line 264,col 9)-(line 264,col 55)"
      ]
    }
  ]
}