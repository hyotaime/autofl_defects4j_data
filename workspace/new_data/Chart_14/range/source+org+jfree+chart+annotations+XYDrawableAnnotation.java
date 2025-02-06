{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/annotations/XYDrawableAnnotation.java",
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
      "begin_line": 63,
      "end_line": 215,
      "comment": "\r\n * A general annotation that can be placed on an {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "width"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The width. "
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The height. "
    },
    {
      "type": "field",
      "varNames": [
        "drawable"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The drawable object. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.XYDrawableAnnotation(double, double, double, double, org.jfree.chart.Drawable)",
      "begin_line": 94,
      "end_line": 106,
      "comment": "\r\n     * Creates a new annotation to be displayed within the given area.\r\n     *\r\n     * @param x  the x-coordinate for the area.\r\n     * @param y  the y-coordinate for the area.\r\n     * @param width  the width of the area.\r\n     * @param height  the height of the area.\r\n     * @param drawable  the drawable object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 19)",
        "(line 101,col 9)-(line 101,col 19)",
        "(line 102,col 9)-(line 102,col 27)",
        "(line 103,col 9)-(line 103,col 29)",
        "(line 104,col 9)-(line 104,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 120,
      "end_line": 143,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 60)",
        "(line 126,col 9)-(line 127,col 59)",
        "(line 128,col 9)-(line 129,col 58)",
        "(line 130,col 9)-(line 131,col 28)",
        "(line 132,col 9)-(line 133,col 27)",
        "(line 134,col 9)-(line 135,col 67)",
        "(line 136,col 9)-(line 136,col 37)",
        "(line 137,col 9)-(line 137,col 42)",
        "(line 138,col 9)-(line 138,col 30)",
        "(line 139,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.equals(java.lang.Object)",
      "begin_line": 152,
      "end_line": 183,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against.\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 63)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.hashCode()",
      "begin_line": 190,
      "end_line": 202,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 19)",
        "(line 192,col 9)-(line 192,col 18)",
        "(line 193,col 9)-(line 193,col 47)",
        "(line 194,col 9)-(line 194,col 46)",
        "(line 195,col 9)-(line 195,col 47)",
        "(line 196,col 9)-(line 196,col 60)",
        "(line 197,col 9)-(line 197,col 51)",
        "(line 198,col 9)-(line 198,col 60)",
        "(line 199,col 9)-(line 199,col 52)",
        "(line 200,col 9)-(line 200,col 60)",
        "(line 201,col 9)-(line 201,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYDrawableAnnotation.clone()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 29)"
      ]
    }
  ]
}