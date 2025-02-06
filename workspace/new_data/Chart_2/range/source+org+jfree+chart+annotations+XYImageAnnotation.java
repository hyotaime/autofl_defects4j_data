{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/XYImageAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYImageAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 78,
      "end_line": 322,
      "comment": "\r\n * An annotation that allows an image to be placed at some location on\r\n * an {@link XYPlot}.\r\n *\r\n * TODO:  implement serialization properly (image is not serializable).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The x-coordinate (in data space). "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The y-coordinate (in data space). "
    },
    {
      "type": "field",
      "varNames": [
        "image"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The image. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\r\n     * The image anchor point.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.XYImageAnnotation(double, double, java.awt.Image)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Creates a new annotation to be displayed at the specified (x, y)\r\n     * location.\r\n     *\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.XYImageAnnotation(double, double, java.awt.Image, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 123,
      "end_line": 136,
      "comment": "\r\n     * Creates a new annotation to be displayed at the specified (x, y)\r\n     * location.\r\n     *\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param anchor  the image anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 16)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 19)",
        "(line 133,col 9)-(line 133,col 19)",
        "(line 134,col 9)-(line 134,col 27)",
        "(line 135,col 9)-(line 135,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getX()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\r\n     * Returns the x-coordinate (in data space) for the annotation.\r\n     *\r\n     * @return The x-coordinate.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getY()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns the y-coordinate (in data space) for the annotation.\r\n     *\r\n     * @return The y-coordinate.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getImage()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the image for the annotation.\r\n     *\r\n     * @return The image.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getImageAnchor()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the image anchor for the annotation.\r\n     *\r\n     * @return The image anchor.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 196,
      "end_line": 238,
      "comment": "\r\n     * Draws the annotation.  This method is called by the drawing code in the\r\n     * {@link XYPlot} class, you don\u0027t normally need to call this method\r\n     * directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 60)",
        "(line 202,col 9)-(line 202,col 71)",
        "(line 203,col 9)-(line 203,col 69)",
        "(line 204,col 9)-(line 205,col 78)",
        "(line 206,col 9)-(line 207,col 76)",
        "(line 208,col 9)-(line 209,col 77)",
        "(line 210,col 9)-(line 211,col 75)",
        "(line 212,col 9)-(line 212,col 24)",
        "(line 213,col 9)-(line 213,col 24)",
        "(line 214,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 42)",
        "(line 223,col 9)-(line 223,col 43)",
        "(line 225,col 9)-(line 225,col 67)",
        "(line 226,col 9)-(line 227,col 29)",
        "(line 228,col 9)-(line 228,col 45)",
        "(line 229,col 9)-(line 229,col 45)",
        "(line 230,col 9)-(line 230,col 59)",
        "(line 232,col 9)-(line 232,col 42)",
        "(line 233,col 9)-(line 233,col 30)",
        "(line 234,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.equals(java.lang.Object)",
      "begin_line": 247,
      "end_line": 273,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 57)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.hashCode()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.clone()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 35)"
      ]
    }
  ]
}