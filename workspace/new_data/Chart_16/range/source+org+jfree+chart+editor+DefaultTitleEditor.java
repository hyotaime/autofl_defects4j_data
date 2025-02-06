{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/editor/DefaultTitleEditor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTitleEditor",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel",
        "java.awt.event.ActionListener"
      ],
      "begin_line": 73,
      "end_line": 300,
      "comment": "\r\n * A panel for editing the properties of a chart title.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "showTitle"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Whether or not to display the title on the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "showTitleCheckBox"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The checkbox to indicate whether or not to display the title. "
    },
    {
      "type": "field",
      "varNames": [
        "titleField"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A field for displaying/editing the title text. "
    },
    {
      "type": "field",
      "varNames": [
        "titleFont"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The font used to draw the title. "
    },
    {
      "type": "field",
      "varNames": [
        "fontfield"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " A field for displaying a description of the title font. "
    },
    {
      "type": "field",
      "varNames": [
        "selectFontButton"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The button to use to select a new title font. "
    },
    {
      "type": "field",
      "varNames": [
        "titlePaint"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The paint (color) used to draw the title. "
    },
    {
      "type": "field",
      "varNames": [
        "selectPaintButton"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The button to use to select a new paint (color) to draw the title. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 100,
      "end_line": 101,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.DefaultTitleEditor(org.jfree.chart.title.Title)",
      "begin_line": 109,
      "end_line": 171,
      "comment": "\r\n     * Standard constructor: builds a panel for displaying/editing the\r\n     * properties of the specified title.\r\n     *\r\n     * @param title  the title, which should be changed.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 112,col 75)",
        "(line 113,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 114,col 37)",
        "(line 115,col 9)-(line 115,col 54)",
        "(line 116,col 9)-(line 116,col 56)",
        "(line 118,col 9)-(line 118,col 38)",
        "(line 120,col 9)-(line 120,col 56)",
        "(line 121,col 9)-(line 126,col 10)",
        "(line 128,col 9)-(line 128,col 55)",
        "(line 129,col 9)-(line 129,col 72)",
        "(line 131,col 9)-(line 131,col 80)",
        "(line 132,col 9)-(line 132,col 49)",
        "(line 133,col 9)-(line 133,col 59)",
        "(line 134,col 9)-(line 134,col 61)",
        "(line 135,col 9)-(line 135,col 55)",
        "(line 136,col 9)-(line 136,col 35)",
        "(line 137,col 9)-(line 137,col 45)",
        "(line 139,col 9)-(line 139,col 80)",
        "(line 140,col 9)-(line 140,col 33)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 142,col 35)",
        "(line 144,col 9)-(line 144,col 79)",
        "(line 145,col 9)-(line 145,col 62)",
        "(line 146,col 9)-(line 148,col 10)",
        "(line 149,col 9)-(line 149,col 61)",
        "(line 150,col 9)-(line 150,col 54)",
        "(line 151,col 9)-(line 151,col 32)",
        "(line 152,col 9)-(line 152,col 37)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 155,col 9)-(line 157,col 10)",
        "(line 158,col 9)-(line 160,col 10)",
        "(line 161,col 9)-(line 161,col 63)",
        "(line 162,col 9)-(line 162,col 55)",
        "(line 163,col 9)-(line 163,col 33)",
        "(line 164,col 9)-(line 164,col 38)",
        "(line 165,col 9)-(line 165,col 45)",
        "(line 167,col 9)-(line 167,col 39)",
        "(line 169,col 9)-(line 169,col 30)",
        "(line 170,col 9)-(line 170,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.getTitleText()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the title text entered in the panel.\r\n     *\r\n     * @return The title text entered in the panel.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.getTitleFont()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\r\n     * Returns the font selected in the panel.\r\n     *\r\n     * @return The font selected in the panel.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.getTitlePaint()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the paint selected in the panel.\r\n     *\r\n     * @return The paint selected in the panel.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 206,
      "end_line": 219,
      "comment": "\r\n     * Handles button clicks by passing control to an appropriate handler \r\n     * method.\r\n     *\r\n     * @param event  the event\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 50)",
        "(line 210,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.attemptFontSelection()",
      "begin_line": 224,
      "end_line": 239,
      "comment": "\r\n     * Presents a font selection dialog to the user.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 70)",
        "(line 227,col 9)-(line 231,col 14)",
        "(line 233,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.attemptPaintSelection()",
      "begin_line": 247,
      "end_line": 256,
      "comment": "\r\n     * Allow the user the opportunity to select a Paint object.  For now, we\r\n     * just use the standard color chooser - all colors are Paint objects, but\r\n     * not all Paint objects are colors (later we can implement a more general\r\n     * Paint chooser).\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 45)",
        "(line 249,col 9)-(line 249,col 75)",
        "(line 250,col 9)-(line 252,col 10)",
        "(line 253,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.attemptModifyShowTitle()",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\r\n     * Allow the user the opportunity to change whether the title is\r\n     * displayed on the chart or not.\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 61)",
        "(line 264,col 9)-(line 264,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.enableOrDisableControls()",
      "begin_line": 271,
      "end_line": 276,
      "comment": "\r\n     * If we are supposed to show the title, the controls are enabled.\r\n     * If we are not supposed to show the title, the controls are disabled.\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 51)",
        "(line 273,col 9)-(line 273,col 44)",
        "(line 274,col 9)-(line 274,col 50)",
        "(line 275,col 9)-(line 275,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.setTitleProperties(org.jfree.chart.JFreeChart)",
      "begin_line": 284,
      "end_line": 298,
      "comment": "\r\n     * Sets the properties of the specified title to match the properties\r\n     * defined on this panel.\r\n     *\r\n     * @param chart  the chart whose title is to be modified.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 297,col 9)"
      ]
    }
  ]
}