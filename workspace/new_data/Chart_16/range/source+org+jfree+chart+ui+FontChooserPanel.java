{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ui/FontChooserPanel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FontChooserPanel",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel"
      ],
      "begin_line": 65,
      "end_line": 224,
      "comment": "\n * A panel for choosing a font from the available system fonts - still a bit of\n * a hack at the moment, but good enough for demonstration applications.\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIZES"
      ],
      "begin_line": 68,
      "end_line": 69,
      "comment": " The font sizes that can be selected. "
    },
    {
      "type": "field",
      "varNames": [
        "fontlist"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The list of fonts. "
    },
    {
      "type": "field",
      "varNames": [
        "sizelist"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The list of sizes. "
    },
    {
      "type": "field",
      "varNames": [
        "bold"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The checkbox that indicates whether the font is bold. "
    },
    {
      "type": "field",
      "varNames": [
        "italic"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The checkbox that indicates whether or not the font is italic. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 84,
      "end_line": 85,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.FontChooserPanel.FontChooserPanel(java.awt.Font)",
      "begin_line": 93,
      "end_line": 135,
      "comment": "\n     * Standard constructor - builds a FontChooserPanel initialised with the \n     * specified font.\n     *\n     * @param font  the initial font to display.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 82)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 98,col 9)-(line 98,col 38)",
        "(line 99,col 9)-(line 99,col 54)",
        "(line 101,col 9)-(line 101,col 58)",
        "(line 102,col 9)-(line 104,col 70)",
        "(line 105,col 9)-(line 105,col 41)",
        "(line 106,col 9)-(line 106,col 62)",
        "(line 107,col 9)-(line 107,col 63)",
        "(line 108,col 9)-(line 108,col 32)",
        "(line 109,col 9)-(line 109,col 23)",
        "(line 111,col 9)-(line 111,col 58)",
        "(line 112,col 9)-(line 114,col 70)",
        "(line 115,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 116,col 62)",
        "(line 117,col 9)-(line 117,col 63)",
        "(line 118,col 9)-(line 118,col 32)",
        "(line 120,col 9)-(line 120,col 61)",
        "(line 121,col 9)-(line 121,col 75)",
        "(line 122,col 9)-(line 122,col 79)",
        "(line 123,col 9)-(line 123,col 34)",
        "(line 124,col 9)-(line 124,col 36)",
        "(line 125,col 9)-(line 127,col 64)",
        "(line 129,col 9)-(line 129,col 50)",
        "(line 130,col 9)-(line 130,col 50)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 134,col 9)-(line 134,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.getSelectedFont()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * Returns a Font object representing the selection in the panel.\n     *\n     * @return the font.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 144,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.getSelectedName()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Returns the selected name.\n     *\n     * @return the name.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.getSelectedStyle()",
      "begin_line": 161,
      "end_line": 174,
      "comment": "\n     * Returns the selected style.\n     *\n     * @return the style.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.getSelectedSize()",
      "begin_line": 181,
      "end_line": 189,
      "comment": "\n     * Returns the selected size.\n     *\n     * @return the size.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 68)",
        "(line 183,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.setSelectedFont(java.awt.Font)",
      "begin_line": 197,
      "end_line": 223,
      "comment": "\n     * Initializes the contents of the dialog from the given font\n     * object.\n     *\n     * @param font the font from which to read the properties.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 45)",
        "(line 202,col 9)-(line 202,col 49)",
        "(line 204,col 9)-(line 204,col 41)",
        "(line 205,col 9)-(line 205,col 51)",
        "(line 206,col 9)-(line 206,col 39)",
        "(line 207,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 57)",
        "(line 215,col 9)-(line 215,col 41)",
        "(line 216,col 9)-(line 216,col 39)",
        "(line 217,col 9)-(line 222,col 9)"
      ]
    }
  ]
}