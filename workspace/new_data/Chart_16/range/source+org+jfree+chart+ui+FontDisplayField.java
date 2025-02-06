{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ui/FontDisplayField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FontDisplayField",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JTextField"
      ],
      "begin_line": 56,
      "end_line": 112,
      "comment": "\n * A field for displaying a font selection.  The display field itself is \n * read-only, to the developer must provide another mechanism to allow the \n * user to change the font.\n "
    },
    {
      "type": "field",
      "varNames": [
        "displayFont"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The current font. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.FontDisplayField.FontDisplayField(java.awt.Font)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Standard constructor - builds a FontDescriptionField initialised with \n     * the specified font.\n     *\n     * @param font  the font.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 18)",
        "(line 73,col 9)-(line 73,col 29)",
        "(line 74,col 9)-(line 74,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontDisplayField.getDisplayFont()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Returns the current font.\n     *\n     * @return the font.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontDisplayField.setDisplayFont(java.awt.Font)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Sets the font.\n     *\n     * @param font  the font.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontDisplayField.fontToString(java.awt.Font)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * Returns a string representation of the specified font.\n     *\n     * @param font  the font.\n     *\n     * @return a string describing the font.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 109,col 9)"
      ]
    }
  ]
}