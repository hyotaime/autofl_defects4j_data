{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/SerialUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerialUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 570,
      "comment": "\n * A class containing useful utility methods relating to serialization.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.SerialUtilities.SerialUtilities()",
      "begin_line": 79,
      "end_line": 80,
      "comment": "\n     * Private constructor prevents object creation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.isSerializable(java.lang.Class)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a class implements \u003ccode\u003eSerializable\u003c/code\u003e\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * \n     * @param c  the class.\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readPaint(java.io.ObjectInputStream)",
      "begin_line": 105,
      "end_line": 131,
      "comment": "\n     * Reads a \u003ccode\u003ePaint\u003c/code\u003e object that has been serialised by the\n     * {@link SerialUtilities#writePaint(Paint, ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The paint object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     * @throws ClassNotFoundException  if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 28)",
        "(line 112,col 9)-(line 112,col 46)",
        "(line 113,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writePaint(java.awt.Paint, java.io.ObjectOutputStream)",
      "begin_line": 141,
      "end_line": 168,
      "comment": "\n     * Serialises a \u003ccode\u003ePaint\u003c/code\u003e object.\n     *\n     * @param paint  the paint object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readStroke(java.io.ObjectInputStream)",
      "begin_line": 181,
      "end_line": 207,
      "comment": "\n     * Reads a \u003ccode\u003eStroke\u003c/code\u003e object that has been serialised by the\n     * {@link SerialUtilities#writeStroke(Stroke, ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The stroke object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     * @throws ClassNotFoundException  if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 29)",
        "(line 188,col 9)-(line 188,col 46)",
        "(line 189,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writeStroke(java.awt.Stroke, java.io.ObjectOutputStream)",
      "begin_line": 220,
      "end_line": 246,
      "comment": "\n     * Serialises a \u003ccode\u003eStroke\u003c/code\u003e object.  This code handles the\n     * \u003ccode\u003eBasicStroke\u003c/code\u003e class which is the only \u003ccode\u003eStroke\u003c/code\u003e \n     * implementation provided by the JDK (and isn\u0027t directly \n     * \u003ccode\u003eSerializable\u003c/code\u003e).\n     *\n     * @param stroke  the stroke object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readShape(java.io.ObjectInputStream)",
      "begin_line": 259,
      "end_line": 344,
      "comment": "\n     * Reads a \u003ccode\u003eShape\u003c/code\u003e object that has been serialised by the \n     * {@link #writeShape(Shape, ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The shape object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     * @throws ClassNotFoundException  if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 28)",
        "(line 266,col 9)-(line 266,col 46)",
        "(line 267,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writeShape(java.awt.Shape, java.io.ObjectOutputStream)",
      "begin_line": 354,
      "end_line": 423,
      "comment": "\n     * Serialises a \u003ccode\u003eShape\u003c/code\u003e object.\n     *\n     * @param shape  the shape object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 422,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readPoint2D(java.io.ObjectInputStream)",
      "begin_line": 435,
      "end_line": 450,
      "comment": "\n     * Reads a \u003ccode\u003ePoint2D\u003c/code\u003e object that has been serialised by the \n     * {@link #writePoint2D(Point2D, ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The point object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 30)",
        "(line 442,col 9)-(line 442,col 46)",
        "(line 443,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writePoint2D(java.awt.geom.Point2D, java.io.ObjectOutputStream)",
      "begin_line": 460,
      "end_line": 474,
      "comment": "\n     * Serialises a \u003ccode\u003ePoint2D\u003c/code\u003e object.\n     *\n     * @param p  the point object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readAttributedString(java.io.ObjectInputStream)",
      "begin_line": 488,
      "end_line": 512,
      "comment": "\n     * Reads a \u003ccode\u003eAttributedString\u003c/code\u003e object that has been serialised by \n     * the {@link SerialUtilities#writeAttributedString(AttributedString, \n     * ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The attributed string object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     * @throws ClassNotFoundException  if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 39)",
        "(line 496,col 9)-(line 496,col 46)",
        "(line 497,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writeAttributedString(java.text.AttributedString, java.io.ObjectOutputStream)",
      "begin_line": 522,
      "end_line": 568,
      "comment": "\n     * Serialises an \u003ccode\u003eAttributedString\u003c/code\u003e object.\n     *\n     * @param as  the attributed string object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 566,col 9)"
      ]
    }
  ]
}