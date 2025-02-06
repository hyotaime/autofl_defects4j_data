{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/XYDataImageAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDataImageAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "org.jfree.chart.annotations.XYAnnotationBoundsInfo"
      ],
      "begin_line": 69,
      "end_line": 373,
      "comment": "\n * An annotation that allows an image to be placed within a rectangle specified\n * in data coordinates on an {@link XYPlot}.  Note that this annotation\n * is not currently serializable, so don\u0027t use it if you plan on serializing\n * your chart(s).\n *\n * @since 1.0.11\n "
    },
    {
      "type": "field",
      "varNames": [
        "image"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The image. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * The x-coordinate (in data space).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * The y-coordinate (in data space).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * The image display area width in data coordinates.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * The image display area height in data coordinates.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "includeInDataBounds"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * A flag indicating whether or not the annotation should contribute to\n     * the data range for a plot/renderer.\n     *\n     * @since 1.0.13\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.XYDataImageAnnotation(java.awt.Image, double, double, double, double)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * Creates a new annotation to be displayed within the specified rectangle.\n     *\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param x  the x-coordinate (in data space).\n     * @param y  the y-coordinate (in data space).\n     * @param w  the image display area width.\n     * @param h  the image display area height.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.XYDataImageAnnotation(java.awt.Image, double, double, double, double, boolean)",
      "begin_line": 130,
      "end_line": 142,
      "comment": "\n     * Creates a new annotation to be displayed within the specified rectangle.\n     *\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param x  the x-coordinate (in data space).\n     * @param y  the y-coordinate (in data space).\n     * @param w  the image display area width.\n     * @param h  the image display area height.\n     * @param includeInDataBounds  a flag that controls whether or not the\n     *     annotation is included in the data bounds for the axis autoRange.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 27)",
        "(line 137,col 9)-(line 137,col 19)",
        "(line 138,col 9)-(line 138,col 19)",
        "(line 139,col 9)-(line 139,col 19)",
        "(line 140,col 9)-(line 140,col 19)",
        "(line 141,col 9)-(line 141,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getImage()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Returns the image for the annotation.\n     *\n     * @return The image.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getX()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Returns the x-coordinate (in data space) for the annotation.\n     *\n     * @return The x-coordinate.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getY()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Returns the y-coordinate (in data space) for the annotation.\n     *\n     * @return The y-coordinate.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getWidth()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Returns the width (in data space) of the data rectangle into which the\n     * image will be drawn.\n     *\n     * @return The width.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getHeight()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Returns the height (in data space) of the data rectangle into which the\n     * image will be drawn.\n     *\n     * @return The height.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getIncludeInDataBounds()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns the flag that controls whether or not the annotation should\n     * contribute to the autoRange for the axis it is plotted against.\n     *\n     * @return A boolean.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getXRange()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Returns the x-range for the annotation.\n     *\n     * @return The range.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getYRange()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * Returns the y-range for the annotation.\n     *\n     * @return The range.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 239,
      "end_line": 282,
      "comment": "\n     * Draws the annotation.  This method is called by the drawing code in the\n     * {@link XYPlot} class, you don\u0027t normally need to call this method\n     * directly.\n     *\n     * @param g2  the graphics device.\n     * @param plot  the plot.\n     * @param dataArea  the data area.\n     * @param domainAxis  the domain axis.\n     * @param rangeAxis  the range axis.\n     * @param rendererIndex  the renderer index.\n     * @param info  if supplied, this info object will be populated with\n     *              entity information.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 60)",
        "(line 245,col 9)-(line 245,col 66)",
        "(line 246,col 9)-(line 246,col 65)",
        "(line 247,col 9)-(line 248,col 29)",
        "(line 249,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 251,col 80)",
        "(line 252,col 9)-(line 252,col 79)",
        "(line 253,col 9)-(line 254,col 33)",
        "(line 255,col 9)-(line 256,col 33)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 258,col 9)-(line 258,col 25)",
        "(line 259,col 9)-(line 259,col 25)",
        "(line 260,col 9)-(line 260,col 25)",
        "(line 261,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 275,col 68)",
        "(line 276,col 9)-(line 276,col 42)",
        "(line 277,col 9)-(line 277,col 30)",
        "(line 278,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.equals(java.lang.Object)",
      "begin_line": 291,
      "end_line": 323,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 65)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.hashCode()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * Returns a hash code for this object.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.clone()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Returns a clone of the annotation.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 352,
      "end_line": 356,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 366,
      "end_line": 371,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 35)"
      ]
    }
  ]
}