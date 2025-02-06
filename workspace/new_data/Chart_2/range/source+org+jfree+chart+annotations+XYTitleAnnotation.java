{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/XYTitleAnnotation.java",
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
      "begin_line": 78,
      "end_line": 400,
      "comment": "\n * An annotation that allows any {@link Title} to be placed at a location on\n * an {@link XYPlot}.\n *\n * @since 1.0.11\n "
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
        "coordinateType"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The coordinate type. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The x-coordinate (in data space). "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The y-coordinate (in data space). "
    },
    {
      "type": "field",
      "varNames": [
        "maxWidth"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The maximum width. "
    },
    {
      "type": "field",
      "varNames": [
        "maxHeight"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The maximum height. "
    },
    {
      "type": "field",
      "varNames": [
        "title"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The title. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * The title anchor point.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.XYTitleAnnotation(double, double, org.jfree.chart.title.Title)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Creates a new annotation to be displayed at the specified (x, y)\n     * location.\n     *\n     * @param x  the x-coordinate (in data space).\n     * @param y  the y-coordinate (in data space).\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.XYTitleAnnotation(double, double, org.jfree.chart.title.Title, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 128,
      "end_line": 144,
      "comment": "\n     * Creates a new annotation to be displayed at the specified (x, y)\n     * location.\n     *\n     * @param x  the x-coordinate (in data space).\n     * @param y  the y-coordinate (in data space).\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param anchor  the title anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 16)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 56)",
        "(line 138,col 9)-(line 138,col 19)",
        "(line 139,col 9)-(line 139,col 19)",
        "(line 140,col 9)-(line 140,col 28)",
        "(line 141,col 9)-(line 141,col 29)",
        "(line 142,col 9)-(line 142,col 27)",
        "(line 143,col 9)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getCoordinateType()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns the coordinate type (set in the constructor).\n     *\n     * @return The coordinate type (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getX()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns the x-coordinate for the annotation.\n     *\n     * @return The x-coordinate.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getY()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns the y-coordinate for the annotation.\n     *\n     * @return The y-coordinate.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getTitle()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Returns the title for the annotation.\n     *\n     * @return The title.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getTitleAnchor()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Returns the title anchor for the annotation.\n     *\n     * @return The title anchor.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getMaxWidth()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the maximum width.\n     *\n     * @return The maximum width.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.setMaxWidth(double)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * Sets the maximum width and sends an\n     * {@link AnnotationChangeEvent} to all registered listeners.\n     *\n     * @param max  the maximum width (0.0 or less means no maximum).\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 28)",
        "(line 208,col 9)-(line 208,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.getMaxHeight()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Returns the maximum height.\n     *\n     * @return The maximum height.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.setMaxHeight(double)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Sets the maximum height and sends an\n     * {@link AnnotationChangeEvent} to all registered listeners.\n     *\n     * @param max  the maximum height.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 29)",
        "(line 228,col 9)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 245,
      "end_line": 331,
      "comment": "\n     * Draws the annotation.  This method is called by the drawing code in the\n     * {@link XYPlot} class, you don\u0027t normally need to call this method\n     * directly.\n     *\n     * @param g2  the graphics device.\n     * @param plot  the plot.\n     * @param dataArea  the data area.\n     * @param domainAxis  the domain axis.\n     * @param rangeAxis  the range axis.\n     * @param rendererIndex  the renderer index.\n     * @param info  if supplied, this info object will be populated with\n     *              entity information.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 60)",
        "(line 251,col 9)-(line 251,col 71)",
        "(line 252,col 9)-(line 252,col 69)",
        "(line 253,col 9)-(line 254,col 49)",
        "(line 255,col 9)-(line 256,col 48)",
        "(line 257,col 9)-(line 257,col 45)",
        "(line 258,col 9)-(line 258,col 44)",
        "(line 259,col 9)-(line 259,col 29)",
        "(line 260,col 9)-(line 260,col 29)",
        "(line 261,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 271,col 28)",
        "(line 272,col 9)-(line 273,col 27)",
        "(line 274,col 9)-(line 274,col 24)",
        "(line 275,col 9)-(line 275,col 24)",
        "(line 276,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 42)",
        "(line 286,col 9)-(line 286,col 43)",
        "(line 287,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 300,col 56)",
        "(line 302,col 9)-(line 302,col 49)",
        "(line 303,col 9)-(line 304,col 29)",
        "(line 305,col 9)-(line 306,col 29)",
        "(line 307,col 9)-(line 307,col 45)",
        "(line 308,col 9)-(line 308,col 45)",
        "(line 309,col 9)-(line 309,col 79)",
        "(line 310,col 9)-(line 310,col 42)",
        "(line 311,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 58)",
        "(line 317,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.equals(java.lang.Object)",
      "begin_line": 340,
      "end_line": 370,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 57)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.hashCode()",
      "begin_line": 377,
      "end_line": 387,
      "comment": "\n     * Returns a hash code for this object.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 25)",
        "(line 379,col 9)-(line 379,col 61)",
        "(line 380,col 9)-(line 380,col 69)",
        "(line 381,col 9)-(line 381,col 56)",
        "(line 382,col 9)-(line 382,col 56)",
        "(line 383,col 9)-(line 383,col 63)",
        "(line 384,col 9)-(line 384,col 64)",
        "(line 385,col 9)-(line 385,col 60)",
        "(line 386,col 9)-(line 386,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTitleAnnotation.clone()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Returns a clone of the annotation.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 29)"
      ]
    }
  ]
}