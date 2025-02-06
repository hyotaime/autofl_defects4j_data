{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/annotations/XYImageAnnotation.java",
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
      "begin_line": 77,
      "end_line": 321,
      "comment": "\r\n * An annotation that allows an image to be placed at some location on \r\n * an {@link XYPlot}.\r\n * \r\n * TODO:  implement serialization properly (image is not serializable).\r\n "
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
      "comment": " \r\n     * The image anchor point. \r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.XYImageAnnotation(double, double, java.awt.Image)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Creates a new annotation to be displayed at the specified (x, y) \r\n     * location.\r\n     *\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.XYImageAnnotation(double, double, java.awt.Image, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 123,
      "end_line": 135,
      "comment": "\r\n     * Creates a new annotation to be displayed at the specified (x, y) \r\n     * location.\r\n     *\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param anchor  the image anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 19)",
        "(line 132,col 9)-(line 132,col 19)",
        "(line 133,col 9)-(line 133,col 27)",
        "(line 134,col 9)-(line 134,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getX()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Returns the x-coordinate (in data space) for the annotation.\r\n     * \r\n     * @return The x-coordinate.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getY()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Returns the y-coordinate (in data space) for the annotation.\r\n     * \r\n     * @return The y-coordinate.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getImage()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Returns the image for the annotation.\r\n     * \r\n     * @return The image.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getImageAnchor()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Returns the image anchor for the annotation.\r\n     * \r\n     * @return The image anchor.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 195,
      "end_line": 237,
      "comment": "\r\n     * Draws the annotation.  This method is called by the drawing code in the \r\n     * {@link XYPlot} class, you don\u0027t normally need to call this method \r\n     * directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 60)",
        "(line 201,col 9)-(line 201,col 71)",
        "(line 202,col 9)-(line 202,col 69)",
        "(line 203,col 9)-(line 204,col 78)",
        "(line 205,col 9)-(line 206,col 76)",
        "(line 207,col 9)-(line 208,col 77)",
        "(line 209,col 9)-(line 210,col 75)",
        "(line 211,col 9)-(line 211,col 24)",
        "(line 212,col 9)-(line 212,col 24)",
        "(line 213,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 42)",
        "(line 222,col 9)-(line 222,col 43)",
        "(line 224,col 9)-(line 224,col 67)",
        "(line 225,col 9)-(line 226,col 29)",
        "(line 227,col 9)-(line 227,col 45)",
        "(line 228,col 9)-(line 228,col 45)",
        "(line 229,col 9)-(line 229,col 59)",
        "(line 231,col 9)-(line 231,col 42)",
        "(line 232,col 9)-(line 232,col 30)",
        "(line 233,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.equals(java.lang.Object)",
      "begin_line": 246,
      "end_line": 272,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 57)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.hashCode()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.clone()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 314,
      "end_line": 318,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 35)"
      ]
    }
  ]
}