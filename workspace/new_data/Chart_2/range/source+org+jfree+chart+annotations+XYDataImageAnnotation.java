{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/XYDataImageAnnotation.java",
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
      "begin_line": 70,
      "end_line": 375,
      "comment": "\n * An annotation that allows an image to be placed within a rectangle specified\n * in data coordinates on an {@link XYPlot}.  Note that this annotation\n * is not currently serializable, so don\u0027t use it if you plan on serializing\n * your chart(s).\n *\n * @since 1.0.11\n "
    },
    {
      "type": "field",
      "varNames": [
        "image"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The image. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The x-coordinate (in data space).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * The y-coordinate (in data space).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * The image display area width in data coordinates.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * The image display area height in data coordinates.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "includeInDataBounds"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * A flag indicating whether or not the annotation should contribute to\n     * the data range for a plot/renderer.\n     *\n     * @since 1.0.13\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.XYDataImageAnnotation(java.awt.Image, double, double, double, double)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Creates a new annotation to be displayed within the specified rectangle.\n     *\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param x  the x-coordinate (in data space).\n     * @param y  the y-coordinate (in data space).\n     * @param w  the image display area width.\n     * @param h  the image display area height.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.XYDataImageAnnotation(java.awt.Image, double, double, double, double, boolean)",
      "begin_line": 131,
      "end_line": 144,
      "comment": "\n     * Creates a new annotation to be displayed within the specified rectangle.\n     *\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param x  the x-coordinate (in data space).\n     * @param y  the y-coordinate (in data space).\n     * @param w  the image display area width.\n     * @param h  the image display area height.\n     * @param includeInDataBounds  a flag that controls whether or not the\n     *     annotation is included in the data bounds for the axis autoRange.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 16)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 19)",
        "(line 140,col 9)-(line 140,col 19)",
        "(line 141,col 9)-(line 141,col 19)",
        "(line 142,col 9)-(line 142,col 19)",
        "(line 143,col 9)-(line 143,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getImage()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns the image for the annotation.\n     *\n     * @return The image.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getX()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns the x-coordinate (in data space) for the annotation.\n     *\n     * @return The x-coordinate.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getY()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns the y-coordinate (in data space) for the annotation.\n     *\n     * @return The y-coordinate.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getWidth()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Returns the width (in data space) of the data rectangle into which the\n     * image will be drawn.\n     *\n     * @return The width.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getHeight()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Returns the height (in data space) of the data rectangle into which the\n     * image will be drawn.\n     *\n     * @return The height.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getIncludeInDataBounds()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Returns the flag that controls whether or not the annotation should\n     * contribute to the autoRange for the axis it is plotted against.\n     *\n     * @return A boolean.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getXRange()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Returns the x-range for the annotation.\n     *\n     * @return The range.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.getYRange()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns the y-range for the annotation.\n     *\n     * @return The range.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 241,
      "end_line": 284,
      "comment": "\n     * Draws the annotation.  This method is called by the drawing code in the\n     * {@link XYPlot} class, you don\u0027t normally need to call this method\n     * directly.\n     *\n     * @param g2  the graphics device.\n     * @param plot  the plot.\n     * @param dataArea  the data area.\n     * @param domainAxis  the domain axis.\n     * @param rangeAxis  the range axis.\n     * @param rendererIndex  the renderer index.\n     * @param info  if supplied, this info object will be populated with\n     *              entity information.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 60)",
        "(line 247,col 9)-(line 247,col 66)",
        "(line 248,col 9)-(line 248,col 65)",
        "(line 249,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 252,col 29)",
        "(line 253,col 9)-(line 253,col 80)",
        "(line 254,col 9)-(line 254,col 79)",
        "(line 255,col 9)-(line 256,col 33)",
        "(line 257,col 9)-(line 258,col 33)",
        "(line 259,col 9)-(line 259,col 25)",
        "(line 260,col 9)-(line 260,col 25)",
        "(line 261,col 9)-(line 261,col 25)",
        "(line 262,col 9)-(line 262,col 25)",
        "(line 263,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 277,col 68)",
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 279,col 30)",
        "(line 280,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.equals(java.lang.Object)",
      "begin_line": 293,
      "end_line": 325,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 65)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.hashCode()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Returns a hash code for this object.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.clone()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Returns a clone of the annotation.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 354,
      "end_line": 358,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDataImageAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 368,
      "end_line": 373,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 35)"
      ]
    }
  ]
}