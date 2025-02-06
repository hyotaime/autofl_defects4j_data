{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/XYDrawableAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDrawableAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 259,
      "comment": "\r\n * A general annotation that can be placed on an {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "drawScaleFactor"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The scaling factor. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "displayWidth"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The width. "
    },
    {
      "type": "field",
      "varNames": [
        "displayHeight"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The height. "
    },
    {
      "type": "field",
      "varNames": [
        "drawable"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The drawable object. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.XYDrawableAnnotation(double, double, double, double, org.jfree.chart.Drawable)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\r\n     * Creates a new annotation to be displayed within the given area.\r\n     *\r\n     * @param x  the x-coordinate for the area.\r\n     * @param y  the y-coordinate for the area.\r\n     * @param width  the width of the area.\r\n     * @param height  the height of the area.\r\n     * @param drawable  the drawable object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.XYDrawableAnnotation(double, double, double, double, double, org.jfree.chart.Drawable)",
      "begin_line": 118,
      "end_line": 132,
      "comment": "\r\n     * Creates a new annotation to be displayed within the given area.  If you\r\n     * specify a \u003ccode\u003edrawScaleFactor\u003c/code\u003e of 2.0, the \u003ccode\u003edrawable\u003c/code\u003e\r\n     * will be drawn at twice the requested display size then scaled down to\r\n     * fit the space.\r\n     *\r\n     * @param x  the x-coordinate for the area.\r\n     * @param y  the y-coordinate for the area.\r\n     * @param displayWidth  the width of the area.\r\n     * @param displayHeight  the height of the area.\r\n     * @param drawScaleFactor  the scaling factor for drawing.\r\n     * @param drawable  the drawable object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 16)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 19)",
        "(line 126,col 9)-(line 126,col 19)",
        "(line 127,col 9)-(line 127,col 41)",
        "(line 128,col 9)-(line 128,col 43)",
        "(line 129,col 9)-(line 129,col 47)",
        "(line 130,col 9)-(line 130,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 146,
      "end_line": 184,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 60)",
        "(line 152,col 9)-(line 153,col 59)",
        "(line 154,col 9)-(line 155,col 58)",
        "(line 156,col 9)-(line 157,col 28)",
        "(line 158,col 9)-(line 159,col 27)",
        "(line 160,col 9)-(line 163,col 36)",
        "(line 168,col 9)-(line 168,col 59)",
        "(line 169,col 9)-(line 171,col 59)",
        "(line 173,col 9)-(line 173,col 69)",
        "(line 174,col 9)-(line 175,col 74)",
        "(line 176,col 9)-(line 176,col 41)",
        "(line 177,col 9)-(line 177,col 40)",
        "(line 178,col 9)-(line 178,col 42)",
        "(line 179,col 9)-(line 179,col 30)",
        "(line 180,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.equals(java.lang.Object)",
      "begin_line": 193,
      "end_line": 227,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 63)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.hashCode()",
      "begin_line": 234,
      "end_line": 246,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 19)",
        "(line 236,col 9)-(line 236,col 18)",
        "(line 237,col 9)-(line 237,col 47)",
        "(line 238,col 9)-(line 238,col 46)",
        "(line 239,col 9)-(line 239,col 47)",
        "(line 240,col 9)-(line 240,col 60)",
        "(line 241,col 9)-(line 241,col 58)",
        "(line 242,col 9)-(line 242,col 60)",
        "(line 243,col 9)-(line 243,col 59)",
        "(line 244,col 9)-(line 244,col 60)",
        "(line 245,col 9)-(line 245,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.clone()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 29)"
      ]
    }
  ]
}