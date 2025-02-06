{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/XYShapeAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYShapeAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 87,
      "end_line": 313,
      "comment": "\r\n * A simple \u003ccode\u003eShape\u003c/code\u003e annotation that can be placed on an\r\n * {@link XYPlot}.  The shape coordinates are specified in data space.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The shape. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The stroke used to draw the shape\u0027s outline. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The paint used to draw the shape\u0027s outline. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The paint used to fill the shape. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.XYShapeAnnotation(java.awt.Shape)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Creates a new annotation (where, by default, the shape is drawn\r\n     * with a black outline).\r\n     *\r\n     * @param shape  the shape (coordinates in data space, \u003ccode\u003enull\u003c/code\u003e\r\n     *     not permitted).\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.XYShapeAnnotation(java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Creates a new annotation where the shape is drawn as an outline using\r\n     * the specified \u003ccode\u003estroke\u003c/code\u003e and \u003ccode\u003eoutlinePaint\u003c/code\u003e.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the shape stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlinePaint  the shape color (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.XYShapeAnnotation(java.awt.Shape, java.awt.Stroke, java.awt.Paint, java.awt.Paint)",
      "begin_line": 137,
      "end_line": 147,
      "comment": "\r\n     * Creates a new annotation.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the shape stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlinePaint  the shape color (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 16)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 27)",
        "(line 144,col 9)-(line 144,col 29)",
        "(line 145,col 9)-(line 145,col 41)",
        "(line 146,col 9)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 161,
      "end_line": 216,
      "comment": "\r\n     * Draws the annotation.  This method is usually called by the\r\n     * {@link XYPlot} class, you shouldn\u0027t need to call it directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 60)",
        "(line 167,col 9)-(line 168,col 59)",
        "(line 169,col 9)-(line 170,col 58)",
        "(line 174,col 9)-(line 174,col 54)",
        "(line 175,col 9)-(line 175,col 37)",
        "(line 176,col 9)-(line 176,col 37)",
        "(line 177,col 9)-(line 177,col 72)",
        "(line 178,col 9)-(line 178,col 72)",
        "(line 179,col 9)-(line 179,col 45)",
        "(line 180,col 9)-(line 180,col 36)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 184,col 9)-(line 184,col 70)",
        "(line 185,col 9)-(line 185,col 70)",
        "(line 186,col 9)-(line 186,col 45)",
        "(line 187,col 9)-(line 187,col 36)",
        "(line 190,col 9)-(line 190,col 23)",
        "(line 191,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.equals(java.lang.Object)",
      "begin_line": 225,
      "end_line": 251,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 57)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.hashCode()",
      "begin_line": 258,
      "end_line": 268,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 25)",
        "(line 260,col 9)-(line 260,col 53)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 265,col 35)",
        "(line 266,col 9)-(line 266,col 78)",
        "(line 267,col 9)-(line 267,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.clone()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\r\n     * Returns a clone.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException ???.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 288,
      "end_line": 294,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 36)",
        "(line 290,col 9)-(line 290,col 55)",
        "(line 291,col 9)-(line 291,col 57)",
        "(line 292,col 9)-(line 292,col 62)",
        "(line 293,col 9)-(line 293,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYShapeAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 304,
      "end_line": 311,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 35)",
        "(line 307,col 9)-(line 307,col 55)",
        "(line 308,col 9)-(line 308,col 57)",
        "(line 309,col 9)-(line 309,col 62)",
        "(line 310,col 9)-(line 310,col 59)"
      ]
    }
  ]
}