{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/XYImageAnnotation.java",
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
      "end_line": 320,
      "comment": "\r\n * An annotation that allows an image to be placed at some location on\r\n * an {@link XYPlot}.\r\n *\r\n * TODO:  implement serialization properly (image is not serializable).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The x-coordinate (in data space). "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The y-coordinate (in data space). "
    },
    {
      "type": "field",
      "varNames": [
        "image"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The image. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\r\n     * The image anchor point.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.XYImageAnnotation(double, double, java.awt.Image)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Creates a new annotation to be displayed at the specified (x, y)\r\n     * location.\r\n     *\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.XYImageAnnotation(double, double, java.awt.Image, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 122,
      "end_line": 134,
      "comment": "\r\n     * Creates a new annotation to be displayed at the specified (x, y)\r\n     * location.\r\n     *\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param anchor  the image anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 19)",
        "(line 131,col 9)-(line 131,col 19)",
        "(line 132,col 9)-(line 132,col 27)",
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getX()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the x-coordinate (in data space) for the annotation.\r\n     *\r\n     * @return The x-coordinate.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getY()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Returns the y-coordinate (in data space) for the annotation.\r\n     *\r\n     * @return The y-coordinate.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getImage()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Returns the image for the annotation.\r\n     *\r\n     * @return The image.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.getImageAnchor()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the image anchor for the annotation.\r\n     *\r\n     * @return The image anchor.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 194,
      "end_line": 236,
      "comment": "\r\n     * Draws the annotation.  This method is called by the drawing code in the\r\n     * {@link XYPlot} class, you don\u0027t normally need to call this method\r\n     * directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 60)",
        "(line 200,col 9)-(line 200,col 71)",
        "(line 201,col 9)-(line 201,col 69)",
        "(line 202,col 9)-(line 203,col 78)",
        "(line 204,col 9)-(line 205,col 76)",
        "(line 206,col 9)-(line 207,col 77)",
        "(line 208,col 9)-(line 209,col 75)",
        "(line 210,col 9)-(line 210,col 24)",
        "(line 211,col 9)-(line 211,col 24)",
        "(line 212,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 42)",
        "(line 221,col 9)-(line 221,col 43)",
        "(line 223,col 9)-(line 223,col 67)",
        "(line 224,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 226,col 45)",
        "(line 227,col 9)-(line 227,col 45)",
        "(line 228,col 9)-(line 228,col 59)",
        "(line 230,col 9)-(line 230,col 42)",
        "(line 231,col 9)-(line 231,col 30)",
        "(line 232,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.equals(java.lang.Object)",
      "begin_line": 245,
      "end_line": 271,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 57)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.hashCode()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.clone()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYImageAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 313,
      "end_line": 317,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 35)"
      ]
    }
  ]
}