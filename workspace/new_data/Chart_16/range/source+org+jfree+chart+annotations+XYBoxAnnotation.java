{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/annotations/XYBoxAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBoxAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 311,
      "comment": "\r\n * A box annotation that can be placed on an {@link XYPlot}.  The \r\n * box coordinates are specified in data space.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "x0"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The lower x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y0"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The lower y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "x1"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The upper x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The upper y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The stroke used to draw the box outline. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The paint used to draw the box outline. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The paint used to fill the box. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.XYBoxAnnotation(double, double, double, double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Creates a new annotation (where, by default, the box is drawn \r\n     * with a black outline).\r\n     * \r\n     * @param x0  the lower x-coordinate of the box (in data space).\r\n     * @param y0  the lower y-coordinate of the box (in data space).\r\n     * @param x1  the upper x-coordinate of the box (in data space).\r\n     * @param y1  the upper y-coordinate of the box (in data space).\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.XYBoxAnnotation(double, double, double, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\r\n     * Creates a new annotation where the box is drawn as an outline using\r\n     * the specified \u003ccode\u003estroke\u003c/code\u003e and \u003ccode\u003eoutlinePaint\u003c/code\u003e.\r\n     *\r\n     * @param x0  the lower x-coordinate of the box (in data space).\r\n     * @param y0  the lower y-coordinate of the box (in data space).\r\n     * @param x1  the upper x-coordinate of the box (in data space).\r\n     * @param y1  the upper y-coordinate of the box (in data space).\r\n     * @param stroke  the shape stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlinePaint  the shape color (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.XYBoxAnnotation(double, double, double, double, java.awt.Stroke, java.awt.Paint, java.awt.Paint)",
      "begin_line": 141,
      "end_line": 150,
      "comment": "\r\n     * Creates a new annotation.\r\n     *\r\n     * @param x0  the lower x-coordinate of the box (in data space).\r\n     * @param y0  the lower y-coordinate of the box (in data space).\r\n     * @param x1  the upper x-coordinate of the box (in data space).\r\n     * @param y1  the upper y-coordinate of the box (in data space).\r\n     * @param stroke  the shape stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlinePaint  the shape color (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e \r\n     *                   permitted).\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 21)",
        "(line 144,col 9)-(line 144,col 21)",
        "(line 145,col 9)-(line 145,col 21)",
        "(line 146,col 9)-(line 146,col 21)",
        "(line 147,col 9)-(line 147,col 29)",
        "(line 148,col 9)-(line 148,col 41)",
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 164,
      "end_line": 203,
      "comment": "\r\n     * Draws the annotation.  This method is usually called by the \r\n     * {@link XYPlot} class, you shouldn\u0027t need to call it directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 60)",
        "(line 169,col 9)-(line 170,col 59)",
        "(line 171,col 9)-(line 172,col 58)",
        "(line 174,col 9)-(line 175,col 28)",
        "(line 176,col 9)-(line 176,col 79)",
        "(line 177,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 179,col 79)",
        "(line 181,col 9)-(line 181,col 31)",
        "(line 182,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.equals(java.lang.Object)",
      "begin_line": 212,
      "end_line": 247,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 53)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.hashCode()",
      "begin_line": 254,
      "end_line": 266,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 19)",
        "(line 256,col 9)-(line 256,col 18)",
        "(line 257,col 9)-(line 257,col 48)",
        "(line 258,col 9)-(line 258,col 46)",
        "(line 259,col 9)-(line 259,col 48)",
        "(line 260,col 9)-(line 260,col 60)",
        "(line 261,col 9)-(line 261,col 48)",
        "(line 262,col 9)-(line 262,col 60)",
        "(line 263,col 9)-(line 263,col 48)",
        "(line 264,col 9)-(line 264,col 60)",
        "(line 265,col 9)-(line 265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.clone()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns a clone.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException not thrown by this class, but may be\r\n     *                                    by subclasses.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 287,
      "end_line": 292,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 36)",
        "(line 289,col 9)-(line 289,col 57)",
        "(line 290,col 9)-(line 290,col 62)",
        "(line 291,col 9)-(line 291,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYBoxAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 302,
      "end_line": 309,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 35)",
        "(line 306,col 9)-(line 306,col 57)",
        "(line 307,col 9)-(line 307,col 62)",
        "(line 308,col 9)-(line 308,col 59)"
      ]
    }
  ]
}