{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/SerialUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerialUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 84,
      "end_line": 631,
      "comment": "\n * A class containing useful utility methods relating to serialization.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.SerialUtilities.SerialUtilities()",
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n     * Private constructor prevents object creation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.isSerializable(java.lang.Class)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a class implements \u003ccode\u003eSerializable\u003c/code\u003e\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param c  the class.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readPaint(java.io.ObjectInputStream)",
      "begin_line": 115,
      "end_line": 141,
      "comment": "\n     * Reads a \u003ccode\u003ePaint\u003c/code\u003e object that has been serialised by the\n     * {@link SerialUtilities#writePaint(Paint, ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The paint object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     * @throws ClassNotFoundException  if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 28)",
        "(line 122,col 9)-(line 122,col 46)",
        "(line 123,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writePaint(java.awt.Paint, java.io.ObjectOutputStream)",
      "begin_line": 151,
      "end_line": 178,
      "comment": "\n     * Serialises a \u003ccode\u003ePaint\u003c/code\u003e object.\n     *\n     * @param paint  the paint object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readStroke(java.io.ObjectInputStream)",
      "begin_line": 191,
      "end_line": 217,
      "comment": "\n     * Reads a \u003ccode\u003eStroke\u003c/code\u003e object that has been serialised by the\n     * {@link SerialUtilities#writeStroke(Stroke, ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The stroke object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     * @throws ClassNotFoundException  if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 29)",
        "(line 198,col 9)-(line 198,col 46)",
        "(line 199,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writeStroke(java.awt.Stroke, java.io.ObjectOutputStream)",
      "begin_line": 230,
      "end_line": 256,
      "comment": "\n     * Serialises a \u003ccode\u003eStroke\u003c/code\u003e object.  This code handles the\n     * \u003ccode\u003eBasicStroke\u003c/code\u003e class which is the only \u003ccode\u003eStroke\u003c/code\u003e\n     * implementation provided by the JDK (and isn\u0027t directly\n     * \u003ccode\u003eSerializable\u003c/code\u003e).\n     *\n     * @param stroke  the stroke object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readShape(java.io.ObjectInputStream)",
      "begin_line": 269,
      "end_line": 351,
      "comment": "\n     * Reads a \u003ccode\u003eShape\u003c/code\u003e object that has been serialised by the\n     * {@link #writeShape(Shape, ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The shape object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     * @throws ClassNotFoundException  if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 28)",
        "(line 276,col 9)-(line 276,col 46)",
        "(line 277,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writeShape(java.awt.Shape, java.io.ObjectOutputStream)",
      "begin_line": 361,
      "end_line": 430,
      "comment": "\n     * Serialises a \u003ccode\u003eShape\u003c/code\u003e object.\n     *\n     * @param shape  the shape object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readPoint2D(java.io.ObjectInputStream)",
      "begin_line": 442,
      "end_line": 457,
      "comment": "\n     * Reads a \u003ccode\u003ePoint2D\u003c/code\u003e object that has been serialised by the\n     * {@link #writePoint2D(Point2D, ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The point object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 30)",
        "(line 449,col 9)-(line 449,col 46)",
        "(line 450,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writePoint2D(java.awt.geom.Point2D, java.io.ObjectOutputStream)",
      "begin_line": 467,
      "end_line": 481,
      "comment": "\n     * Serialises a \u003ccode\u003ePoint2D\u003c/code\u003e object.\n     *\n     * @param p  the point object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 480,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readAttributedString(java.io.ObjectInputStream)",
      "begin_line": 495,
      "end_line": 519,
      "comment": "\n     * Reads a \u003ccode\u003eAttributedString\u003c/code\u003e object that has been serialised by\n     * the {@link SerialUtilities#writeAttributedString(AttributedString,\n     * ObjectOutputStream)} method.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The attributed string object (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IOException  if there is an I/O problem.\n     * @throws ClassNotFoundException  if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 39)",
        "(line 503,col 9)-(line 503,col 46)",
        "(line 504,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writeAttributedString(java.text.AttributedString, java.io.ObjectOutputStream)",
      "begin_line": 529,
      "end_line": 575,
      "comment": "\n     * Serialises an \u003ccode\u003eAttributedString\u003c/code\u003e object.\n     *\n     * @param as  the attributed string object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.readImage(java.io.ObjectInputStream)",
      "begin_line": 592,
      "end_line": 603,
      "comment": "\n     * Reads a boolean from the specified stream and, if the boolean is\n     * \u003ccode\u003efalse\u003c/code\u003e, reads a PNG byte stream, then returns  the\n     * corresponding image.  If the boolean is \u003ccode\u003etrue\u003c/code\u003e, this\n     * signifies that the original streamed image was \u003ccode\u003enull\u003c/code\u003e, and\n     * so the method returns \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return An image, or \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @throws IOException if there is an input/output problem.\n     *\n     * @since 1.2.0\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 36)",
        "(line 598,col 9)-(line 598,col 46)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SerialUtilities.writeImage(java.awt.Image, java.io.ObjectOutputStream)",
      "begin_line": 615,
      "end_line": 629,
      "comment": "\n     * Writes an image to the stream in PNG format.\n     *\n     * @param image  the image.\n     * @param stream  the output stream.\n     *\n     * @throws IOException if there is an input/output error.\n     *\n     * @since 1.2.0\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 32)",
        "(line 618,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 68)"
      ]
    }
  ]
}