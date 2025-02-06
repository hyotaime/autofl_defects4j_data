{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/ui/FontDisplayField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FontDisplayField",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JTextField"
      ],
      "begin_line": 58,
      "end_line": 115,
      "comment": "\n * A field for displaying a font selection.  The display field itself is\n * read-only, to the developer must provide another mechanism to allow the\n * user to change the font.\n "
    },
    {
      "type": "field",
      "varNames": [
        "displayFont"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The current font. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 64,
      "end_line": 66,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.FontDisplayField.FontDisplayField(java.awt.Font)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Standard constructor - builds a FontDescriptionField initialised with\n     * the specified font.\n     *\n     * @param font  the font.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 18)",
        "(line 76,col 9)-(line 76,col 29)",
        "(line 77,col 9)-(line 77,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontDisplayField.getDisplayFont()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns the current font.\n     *\n     * @return the font.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontDisplayField.setDisplayFont(java.awt.Font)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Sets the font.\n     *\n     * @param font  the font.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 32)",
        "(line 96,col 9)-(line 96,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.FontDisplayField.fontToString(java.awt.Font)",
      "begin_line": 106,
      "end_line": 113,
      "comment": "\n     * Returns a string representation of the specified font.\n     *\n     * @param font  the font.\n     *\n     * @return a string describing the font.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 112,col 9)"
      ]
    }
  ]
}