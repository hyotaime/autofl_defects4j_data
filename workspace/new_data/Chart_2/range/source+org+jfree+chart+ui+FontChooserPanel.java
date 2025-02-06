{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/ui/FontChooserPanel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FontChooserPanel",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel"
      ],
      "begin_line": 67,
      "end_line": 227,
      "comment": "\n * A panel for choosing a font from the available system fonts - still a bit of\n * a hack at the moment, but good enough for demonstration applications.\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIZES"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": " The font sizes that can be selected. "
    },
    {
      "type": "field",
      "varNames": [
        "fontlist"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The list of fonts. "
    },
    {
      "type": "field",
      "varNames": [
        "sizelist"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The list of sizes. "
    },
    {
      "type": "field",
      "varNames": [
        "bold"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The checkbox that indicates whether the font is bold. "
    },
    {
      "type": "field",
      "varNames": [
        "italic"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The checkbox that indicates whether or not the font is italic. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 86,
      "end_line": 88,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.FontChooserPanel.FontChooserPanel(java.awt.Font)",
      "begin_line": 96,
      "end_line": 138,
      "comment": "\n     * Standard constructor - builds a FontChooserPanel initialised with the\n     * specified font.\n     *\n     * @param font  the initial font to display.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 82)",
        "(line 99,col 9)-(line 99,col 57)",
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 102,col 54)",
        "(line 104,col 9)-(line 104,col 58)",
        "(line 105,col 9)-(line 107,col 70)",
        "(line 108,col 9)-(line 108,col 41)",
        "(line 109,col 9)-(line 109,col 62)",
        "(line 110,col 9)-(line 110,col 63)",
        "(line 111,col 9)-(line 111,col 32)",
        "(line 112,col 9)-(line 112,col 23)",
        "(line 114,col 9)-(line 114,col 58)",
        "(line 115,col 9)-(line 117,col 70)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 62)",
        "(line 120,col 9)-(line 120,col 63)",
        "(line 121,col 9)-(line 121,col 32)",
        "(line 123,col 9)-(line 123,col 61)",
        "(line 124,col 9)-(line 124,col 75)",
        "(line 125,col 9)-(line 125,col 79)",
        "(line 126,col 9)-(line 126,col 34)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 130,col 64)",
        "(line 132,col 9)-(line 132,col 50)",
        "(line 133,col 9)-(line 133,col 50)",
        "(line 135,col 9)-(line 135,col 38)",
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.getSelectedFont()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Returns a Font object representing the selection in the panel.\n     *\n     * @return the font.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 147,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.getSelectedName()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Returns the selected name.\n     *\n     * @return the name.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.getSelectedStyle()",
      "begin_line": 164,
      "end_line": 177,
      "comment": "\n     * Returns the selected style.\n     *\n     * @return the style.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.getSelectedSize()",
      "begin_line": 184,
      "end_line": 192,
      "comment": "\n     * Returns the selected size.\n     *\n     * @return the size.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 68)",
        "(line 186,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontChooserPanel.setSelectedFont(java.awt.Font)",
      "begin_line": 200,
      "end_line": 226,
      "comment": "\n     * Initializes the contents of the dialog from the given font\n     * object.\n     *\n     * @param font the font from which to read the properties.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 45)",
        "(line 205,col 9)-(line 205,col 49)",
        "(line 207,col 9)-(line 207,col 41)",
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 39)",
        "(line 210,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 57)",
        "(line 218,col 9)-(line 218,col 41)",
        "(line 219,col 9)-(line 219,col 39)",
        "(line 220,col 9)-(line 225,col 9)"
      ]
    }
  ]
}