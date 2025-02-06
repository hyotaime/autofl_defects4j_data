{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/XYTitleAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYTitleAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 393,
      "comment": "\n * An annotation that allows any {@link Title} to be placed at a location on\n * an {@link XYPlot}.\n *\n * @since 1.0.11\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "coordinateType"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The coordinate type. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The x-coordinate (in data space). "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The y-coordinate (in data space). "
    },
    {
      "type": "field",
      "varNames": [
        "maxWidth"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The maximum width. "
    },
    {
      "type": "field",
      "varNames": [
        "maxHeight"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The maximum height. "
    },
    {
      "type": "field",
      "varNames": [
        "title"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The title. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * The title anchor point.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.XYTitleAnnotation(double, double, org.jfree.chart.title.Title)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Creates a new annotation to be displayed at the specified (x, y)\n     * location.\n     *\n     * @param x  the x-coordinate (in data space).\n     * @param y  the y-coordinate (in data space).\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.XYTitleAnnotation(double, double, org.jfree.chart.title.Title, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 126,
      "end_line": 141,
      "comment": "\n     * Creates a new annotation to be displayed at the specified (x, y)\n     * location.\n     *\n     * @param x  the x-coordinate (in data space).\n     * @param y  the y-coordinate (in data space).\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param anchor  the title anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 56)",
        "(line 135,col 9)-(line 135,col 19)",
        "(line 136,col 9)-(line 136,col 19)",
        "(line 137,col 9)-(line 137,col 28)",
        "(line 138,col 9)-(line 138,col 29)",
        "(line 139,col 9)-(line 139,col 27)",
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getCoordinateType()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Returns the coordinate type (set in the constructor).\n     *\n     * @return The coordinate type (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getX()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Returns the x-coordinate for the annotation.\n     *\n     * @return The x-coordinate.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getY()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Returns the y-coordinate for the annotation.\n     *\n     * @return The y-coordinate.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getTitle()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Returns the title for the annotation.\n     *\n     * @return The title.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getTitleAnchor()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Returns the title anchor for the annotation.\n     *\n     * @return The title anchor.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getMaxWidth()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Returns the maximum width.\n     *\n     * @return The maximum width.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.setMaxWidth(double)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Sets the maximum width.\n     *\n     * @param max  the maximum width (0.0 or less means no maximum).\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getMaxHeight()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Returns the maximum height.\n     *\n     * @return The maximum height.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.setMaxHeight(double)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Sets the maximum height.\n     *\n     * @param max  the maximum height.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 238,
      "end_line": 324,
      "comment": "\n     * Draws the annotation.  This method is called by the drawing code in the\n     * {@link XYPlot} class, you don\u0027t normally need to call this method\n     * directly.\n     *\n     * @param g2  the graphics device.\n     * @param plot  the plot.\n     * @param dataArea  the data area.\n     * @param domainAxis  the domain axis.\n     * @param rangeAxis  the range axis.\n     * @param rendererIndex  the renderer index.\n     * @param info  if supplied, this info object will be populated with\n     *              entity information.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 60)",
        "(line 244,col 9)-(line 244,col 71)",
        "(line 245,col 9)-(line 245,col 69)",
        "(line 246,col 9)-(line 247,col 49)",
        "(line 248,col 9)-(line 249,col 48)",
        "(line 250,col 9)-(line 250,col 45)",
        "(line 251,col 9)-(line 251,col 44)",
        "(line 252,col 9)-(line 252,col 29)",
        "(line 253,col 9)-(line 253,col 29)",
        "(line 254,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 264,col 28)",
        "(line 265,col 9)-(line 266,col 27)",
        "(line 267,col 9)-(line 267,col 24)",
        "(line 268,col 9)-(line 268,col 24)",
        "(line 269,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 279,col 43)",
        "(line 280,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 293,col 56)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 296,col 9)-(line 297,col 29)",
        "(line 298,col 9)-(line 299,col 29)",
        "(line 300,col 9)-(line 300,col 45)",
        "(line 301,col 9)-(line 301,col 45)",
        "(line 302,col 9)-(line 302,col 79)",
        "(line 303,col 9)-(line 303,col 42)",
        "(line 304,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 58)",
        "(line 310,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.equals(java.lang.Object)",
      "begin_line": 333,
      "end_line": 363,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 57)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.hashCode()",
      "begin_line": 370,
      "end_line": 380,
      "comment": "\n     * Returns a hash code for this object.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 25)",
        "(line 372,col 9)-(line 372,col 61)",
        "(line 373,col 9)-(line 373,col 69)",
        "(line 374,col 9)-(line 374,col 56)",
        "(line 375,col 9)-(line 375,col 56)",
        "(line 376,col 9)-(line 376,col 63)",
        "(line 377,col 9)-(line 377,col 64)",
        "(line 378,col 9)-(line 378,col 60)",
        "(line 379,col 9)-(line 379,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.clone()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Returns a clone of the annotation.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 29)"
      ]
    }
  ]
}