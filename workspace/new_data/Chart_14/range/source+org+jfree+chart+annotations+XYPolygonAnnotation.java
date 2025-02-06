{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/annotations/XYPolygonAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYPolygonAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 362,
      "comment": "\r\n * A polygon annotation that can be placed on an {@link XYPlot}.  The \r\n * polygon coordinates are specified in data space.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "polygon"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The polygon. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The stroke used to draw the box outline. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The paint used to draw the box outline. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The paint used to fill the box. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.XYPolygonAnnotation(double[])",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Creates a new annotation (where, by default, the polygon is drawn \r\n     * with a black outline).  The array of polygon coordinates must contain\r\n     * an even number of coordinates (each pair is an (x, y) location on the\r\n     * plot) and the last point is automatically joined back to the first point.\r\n     * \r\n     * @param polygon  the coordinates of the polygon\u0027s vertices \r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.XYPolygonAnnotation(double[], java.awt.Stroke, java.awt.Paint)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\r\n     * Creates a new annotation where the box is drawn as an outline using\r\n     * the specified \u003ccode\u003estroke\u003c/code\u003e and \u003ccode\u003eoutlinePaint\u003c/code\u003e.  \r\n     * The array of polygon coordinates must contain an even number of \r\n     * coordinates (each pair is an (x, y) location on the plot) and the last \r\n     * point is automatically joined back to the first point.\r\n     *\r\n     * @param polygon  the coordinates of the polygon\u0027s vertices \r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the shape stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlinePaint  the shape color (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.XYPolygonAnnotation(double[], java.awt.Stroke, java.awt.Paint, java.awt.Paint)",
      "begin_line": 136,
      "end_line": 150,
      "comment": "\r\n     * Creates a new annotation.  The array of polygon coordinates must \r\n     * contain an even number of coordinates (each pair is an (x, y) location \r\n     * on the plot) and the last point is automatically joined back to the \r\n     * first point.\r\n     *\r\n     * @param polygon  the coordinates of the polygon\u0027s vertices \r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the shape stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlinePaint  the shape color (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e \r\n     *                   permitted).\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 50)",
        "(line 147,col 9)-(line 147,col 29)",
        "(line 148,col 9)-(line 148,col 41)",
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.getPolygonCoordinates()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Returns the coordinates of the polygon\u0027s vertices.  The returned array\r\n     * is a copy, so it is safe to modify without altering the annotation\u0027s \r\n     * state.\r\n     * \r\n     * @return The coordinates of the polygon\u0027s vertices.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.getFillPaint()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns the fill paint.\r\n     * \r\n     * @return The fill paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.getOutlineStroke()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns the outline stroke.\r\n     * \r\n     * @return The outline stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.getOutlinePaint()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns the outline paint.\r\n     * \r\n     * @return The outline paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 210,
      "end_line": 265,
      "comment": "\r\n     * Draws the annotation.  This method is usually called by the \r\n     * {@link XYPlot} class, you shouldn\u0027t need to call it directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 60)",
        "(line 219,col 9)-(line 220,col 59)",
        "(line 221,col 9)-(line 222,col 58)",
        "(line 224,col 9)-(line 224,col 45)",
        "(line 225,col 9)-(line 226,col 28)",
        "(line 227,col 9)-(line 228,col 27)",
        "(line 229,col 9)-(line 250,col 8)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.equals(java.lang.Object)",
      "begin_line": 274,
      "end_line": 300,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 61)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.hashCode()",
      "begin_line": 307,
      "end_line": 318,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 25)",
        "(line 309,col 9)-(line 310,col 30)",
        "(line 311,col 9)-(line 311,col 78)",
        "(line 312,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.clone()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\r\n     * Returns a clone.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException not thrown by this class, but may be\r\n     *                                    by subclasses.\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 339,
      "end_line": 344,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 36)",
        "(line 341,col 9)-(line 341,col 57)",
        "(line 342,col 9)-(line 342,col 62)",
        "(line 343,col 9)-(line 343,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPolygonAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 354,
      "end_line": 360,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 35)",
        "(line 357,col 9)-(line 357,col 57)",
        "(line 358,col 9)-(line 358,col 62)",
        "(line 359,col 9)-(line 359,col 59)"
      ]
    }
  ]
}