{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/RefineryUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RefineryUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 96,
      "end_line": 308,
      "comment": "\n * A collection of utility methods relating to user interfaces.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RefineryUtilities.RefineryUtilities()",
      "begin_line": 98,
      "end_line": 99,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.getCenterPoint()",
      "begin_line": 108,
      "end_line": 124,
      "comment": "\n     * Computes the center point of the current screen device. If this method \n     * is called on JDK 1.4, Xinerama-aware results are returned. (See \n     * Sun-Bug-ID 4463949 for details).\n     *\n     * @return the center point of the current screen.\n     ",
      "child_ranges": [
        "(line 110,col 7)-(line 111,col 66)",
        "(line 112,col 7)-(line 120,col 7)",
        "(line 122,col 7)-(line 122,col 64)",
        "(line 123,col 7)-(line 123,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.getMaximumWindowBounds()",
      "begin_line": 133,
      "end_line": 148,
      "comment": "\n   * Computes the maximum bounds of the current screen device. If this method \n   * is called on JDK 1.4, Xinerama-aware results are returned. \n   * (See Sun-Bug-ID 4463949 for details).\n   *\n   * @return the maximum bounds of the current screen.\n   ",
      "child_ranges": [
        "(line 134,col 7)-(line 135,col 66)",
        "(line 136,col 7)-(line 144,col 7)",
        "(line 146,col 7)-(line 146,col 64)",
        "(line 147,col 7)-(line 147,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.centerFrameOnScreen(java.awt.Window)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Positions the specified frame in the middle of the screen.\n     *\n     * @param frame  the frame to be centered on the screen.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.positionFrameOnScreen(java.awt.Window, double, double)",
      "begin_line": 169,
      "end_line": 181,
      "comment": "\n     * Positions the specified frame at a relative position in the screen, \n     * where 50% is considered to be the center of the screen.\n     *\n     * @param frame  the frame.\n     * @param horizontalPercent  the relative horizontal position of the frame \n     *     (0.0 to 1.0, where 0.5 is the center of the screen).\n     * @param verticalPercent  the relative vertical position of the frame \n     *     (0.0 to 1.0, where 0.5 is the center of the screen).\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 47)",
        "(line 174,col 9)-(line 174,col 38)",
        "(line 175,col 9)-(line 175,col 47)",
        "(line 176,col 9)-(line 176,col 49)",
        "(line 177,col 9)-(line 177,col 52)",
        "(line 178,col 9)-(line 178,col 50)",
        "(line 179,col 9)-(line 179,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.positionFrameRandomly(java.awt.Window)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Positions the specified frame at a random location on the screen while ensuring that the\n     * entire frame is visible (provided that the frame is smaller than the screen).\n     *\n     * @param frame  the frame.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.centerDialogInParent(java.awt.Dialog)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Positions the specified dialog within its parent.\n     *\n     * @param dialog  the dialog to be positioned on the screen.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.positionDialogRelativeToParent(java.awt.Dialog, double, double)",
      "begin_line": 209,
      "end_line": 232,
      "comment": "\n     * Positions the specified dialog at a position relative to its parent.\n     *\n     * @param dialog  the dialog to be positioned.\n     * @param horizontalPercent  the relative location.\n     * @param verticalPercent  the relative location.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 39)",
        "(line 213,col 9)-(line 213,col 46)",
        "(line 214,col 9)-(line 214,col 39)",
        "(line 216,col 9)-(line 216,col 44)",
        "(line 217,col 9)-(line 217,col 45)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 219,col 36)",
        "(line 220,col 9)-(line 220,col 54)",
        "(line 221,col 9)-(line 221,col 52)",
        "(line 224,col 9)-(line 224,col 47)",
        "(line 225,col 9)-(line 225,col 45)",
        "(line 226,col 9)-(line 226,col 27)",
        "(line 227,col 9)-(line 227,col 47)",
        "(line 228,col 9)-(line 228,col 27)",
        "(line 230,col 9)-(line 230,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.createTablePanel(javax.swing.table.TableModel)",
      "begin_line": 241,
      "end_line": 256,
      "comment": "\n     * Creates a panel that contains a table based on the specified table model.\n     *\n     * @param model  the table model to use when constructing the table.\n     *\n     * @return The panel.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 54)",
        "(line 244,col 9)-(line 244,col 41)",
        "(line 245,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 42)",
        "(line 254,col 9)-(line 254,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.createJLabel(java.lang.String, java.awt.Font)",
      "begin_line": 266,
      "end_line": 272,
      "comment": "\n     * Creates a label with a specific font.\n     *\n     * @param text  the text for the label.\n     * @param font  the font.\n     *\n     * @return The label.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 41)",
        "(line 269,col 9)-(line 269,col 29)",
        "(line 270,col 9)-(line 270,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.createJLabel(java.lang.String, java.awt.Font, java.awt.Color)",
      "begin_line": 283,
      "end_line": 290,
      "comment": "\n     * Creates a label with a specific font and color.\n     *\n     * @param text  the text for the label.\n     * @param font  the font.\n     * @param color  the color.\n     *\n     * @return The label.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 41)",
        "(line 286,col 9)-(line 286,col 29)",
        "(line 287,col 9)-(line 287,col 36)",
        "(line 288,col 9)-(line 288,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RefineryUtilities.createJButton(java.lang.String, java.awt.Font)",
      "begin_line": 300,
      "end_line": 306,
      "comment": "\n     * Creates a {@link JButton}.\n     *\n     * @param label  the label.\n     * @param font  the font.\n     *\n     * @return The button.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 44)",
        "(line 303,col 9)-(line 303,col 29)",
        "(line 304,col 9)-(line 304,col 22)"
      ]
    }
  ]
}