{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/PaintUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PaintUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 176,
      "comment": "\n * Utility code that relates to \u003ccode\u003ePaint\u003c/code\u003e objects.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.PaintUtilities.PaintUtilities()",
      "begin_line": 60,
      "end_line": 61,
      "comment": "\n     * Private constructor prevents object creation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintUtilities.equal(java.awt.Paint, java.awt.Paint)",
      "begin_line": 73,
      "end_line": 100,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the two \u003ccode\u003ePaint\u003c/code\u003e objects are equal\n     * OR both \u003ccode\u003enull\u003c/code\u003e.  This method handles\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e as a special case.\n     *\n     * @param p1  paint 1 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param p2  paint 2 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 83,col 31)",
        "(line 85,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintUtilities.colorToString(java.awt.Color)",
      "begin_line": 110,
      "end_line": 145,
      "comment": "\n     * Converts a color into a string. If the color is equal to one of the\n     * defined constant colors, that name is returned instead. Otherwise the\n     * color is returned as hex-string.\n     *\n     * @param c the color.\n     * @return the string for this color.\n     ",
      "child_ranges": [
        "(line 112,col 7)-(line 131,col 7)",
        "(line 134,col 7)-(line 134,col 66)",
        "(line 135,col 7)-(line 135,col 48)",
        "(line 136,col 7)-(line 136,col 25)",
        "(line 138,col 7)-(line 138,col 38)",
        "(line 139,col 7)-(line 141,col 7)",
        "(line 143,col 7)-(line 143,col 27)",
        "(line 144,col 7)-(line 144,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintUtilities.stringToColor(java.lang.String)",
      "begin_line": 153,
      "end_line": 175,
      "comment": "\n     * Converts a given string into a color.\n     *\n     * @param value the string, either a name or a hex-string.\n     * @return the color.\n     ",
      "child_ranges": [
        "(line 155,col 7)-(line 157,col 7)",
        "(line 158,col 7)-(line 174,col 7)"
      ]
    }
  ]
}