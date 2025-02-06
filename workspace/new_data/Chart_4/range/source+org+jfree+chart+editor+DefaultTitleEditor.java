{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/editor/DefaultTitleEditor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTitleEditor",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel",
        "java.awt.event.ActionListener"
      ],
      "begin_line": 74,
      "end_line": 302,
      "comment": "\r\n * A panel for editing the properties of a chart title.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "showTitle"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Whether or not to display the title on the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "showTitleCheckBox"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The checkbox to indicate whether or not to display the title. "
    },
    {
      "type": "field",
      "varNames": [
        "titleField"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " A field for displaying/editing the title text. "
    },
    {
      "type": "field",
      "varNames": [
        "titleFont"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The font used to draw the title. "
    },
    {
      "type": "field",
      "varNames": [
        "fontfield"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " A field for displaying a description of the title font. "
    },
    {
      "type": "field",
      "varNames": [
        "selectFontButton"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The button to use to select a new title font. "
    },
    {
      "type": "field",
      "varNames": [
        "titlePaint"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The paint (color) used to draw the title. "
    },
    {
      "type": "field",
      "varNames": [
        "selectPaintButton"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The button to use to select a new paint (color) to draw the title. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 101,
      "end_line": 103,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.DefaultTitleEditor(org.jfree.chart.title.Title)",
      "begin_line": 111,
      "end_line": 173,
      "comment": "\r\n     * Standard constructor: builds a panel for displaying/editing the\r\n     * properties of the specified title.\r\n     *\r\n     * @param title  the title, which should be changed.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 114,col 75)",
        "(line 115,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 116,col 37)",
        "(line 117,col 9)-(line 117,col 54)",
        "(line 118,col 9)-(line 118,col 56)",
        "(line 120,col 9)-(line 120,col 38)",
        "(line 122,col 9)-(line 122,col 56)",
        "(line 123,col 9)-(line 128,col 10)",
        "(line 130,col 9)-(line 130,col 55)",
        "(line 131,col 9)-(line 131,col 72)",
        "(line 133,col 9)-(line 133,col 80)",
        "(line 134,col 9)-(line 134,col 49)",
        "(line 135,col 9)-(line 135,col 59)",
        "(line 136,col 9)-(line 136,col 61)",
        "(line 137,col 9)-(line 137,col 55)",
        "(line 138,col 9)-(line 138,col 35)",
        "(line 139,col 9)-(line 139,col 45)",
        "(line 141,col 9)-(line 141,col 80)",
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 144,col 9)-(line 144,col 35)",
        "(line 146,col 9)-(line 146,col 79)",
        "(line 147,col 9)-(line 147,col 62)",
        "(line 148,col 9)-(line 150,col 10)",
        "(line 151,col 9)-(line 151,col 61)",
        "(line 152,col 9)-(line 152,col 54)",
        "(line 153,col 9)-(line 153,col 32)",
        "(line 154,col 9)-(line 154,col 37)",
        "(line 155,col 9)-(line 155,col 44)",
        "(line 157,col 9)-(line 159,col 10)",
        "(line 160,col 9)-(line 162,col 10)",
        "(line 163,col 9)-(line 163,col 63)",
        "(line 164,col 9)-(line 164,col 55)",
        "(line 165,col 9)-(line 165,col 33)",
        "(line 166,col 9)-(line 166,col 38)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 169,col 9)-(line 169,col 39)",
        "(line 171,col 9)-(line 171,col 30)",
        "(line 172,col 9)-(line 172,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.getTitleText()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns the title text entered in the panel.\r\n     *\r\n     * @return The title text entered in the panel.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.getTitleFont()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the font selected in the panel.\r\n     *\r\n     * @return The font selected in the panel.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.getTitlePaint()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the paint selected in the panel.\r\n     *\r\n     * @return The paint selected in the panel.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 208,
      "end_line": 221,
      "comment": "\r\n     * Handles button clicks by passing control to an appropriate handler\r\n     * method.\r\n     *\r\n     * @param event  the event\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 50)",
        "(line 212,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.attemptFontSelection()",
      "begin_line": 226,
      "end_line": 241,
      "comment": "\r\n     * Presents a font selection dialog to the user.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 70)",
        "(line 229,col 9)-(line 233,col 14)",
        "(line 235,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.attemptPaintSelection()",
      "begin_line": 249,
      "end_line": 258,
      "comment": "\r\n     * Allow the user the opportunity to select a Paint object.  For now, we\r\n     * just use the standard color chooser - all colors are Paint objects, but\r\n     * not all Paint objects are colors (later we can implement a more general\r\n     * Paint chooser).\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 45)",
        "(line 251,col 9)-(line 251,col 75)",
        "(line 252,col 9)-(line 254,col 10)",
        "(line 255,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.attemptModifyShowTitle()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\r\n     * Allow the user the opportunity to change whether the title is\r\n     * displayed on the chart or not.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 61)",
        "(line 266,col 9)-(line 266,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.enableOrDisableControls()",
      "begin_line": 273,
      "end_line": 278,
      "comment": "\r\n     * If we are supposed to show the title, the controls are enabled.\r\n     * If we are not supposed to show the title, the controls are disabled.\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 51)",
        "(line 275,col 9)-(line 275,col 44)",
        "(line 276,col 9)-(line 276,col 50)",
        "(line 277,col 9)-(line 277,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultTitleEditor.setTitleProperties(org.jfree.chart.JFreeChart)",
      "begin_line": 286,
      "end_line": 300,
      "comment": "\r\n     * Sets the properties of the specified title to match the properties\r\n     * defined on this panel.\r\n     *\r\n     * @param chart  the chart whose title is to be modified.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 299,col 9)"
      ]
    }
  ]
}