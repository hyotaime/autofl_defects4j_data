{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/CategoryTextAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryTextAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.TextAnnotation",
        "org.jfree.chart.annotations.CategoryAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 288,
      "comment": "\r\n * A text annotation that can be placed on a {@link CategoryPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "category"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The category. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryAnchor"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The category anchor (START, MIDDLE, or END). "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.CategoryTextAnnotation(java.lang.String, java.lang.Comparable, double)",
      "begin_line": 97,
      "end_line": 106,
      "comment": "\r\n     * Creates a new annotation to be displayed at the given location.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 20)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 27)",
        "(line 105,col 9)-(line 105,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.getCategory()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the category.\r\n     *\r\n     * @return The category (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setCategory(Comparable)\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.setCategory(java.lang.Comparable)",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\r\n     * Sets the category that the annotation attaches to.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getCategory()\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.getCategoryAnchor()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the category anchor point.\r\n     *\r\n     * @return The category anchor point.\r\n     *\r\n     * @see #setCategoryAnchor(CategoryAnchor)\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.setCategoryAnchor(org.jfree.chart.axis.CategoryAnchor)",
      "begin_line": 152,
      "end_line": 158,
      "comment": "\r\n     * Sets the category anchor point and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getCategoryAnchor()\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 37)",
        "(line 157,col 9)-(line 157,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.getValue()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the value that the annotation attaches to.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #setValue(double)\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.setValue(double)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\r\n     * Sets the value and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @see #getValue()\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 27)",
        "(line 181,col 9)-(line 181,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 195,
      "end_line": 230,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 52)",
        "(line 200,col 9)-(line 200,col 61)",
        "(line 201,col 9)-(line 201,col 48)",
        "(line 203,col 9)-(line 203,col 29)",
        "(line 204,col 9)-(line 204,col 29)",
        "(line 205,col 9)-(line 205,col 60)",
        "(line 206,col 9)-(line 207,col 59)",
        "(line 208,col 9)-(line 209,col 58)",
        "(line 211,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 30)",
        "(line 226,col 9)-(line 226,col 32)",
        "(line 227,col 9)-(line 228,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.equals(java.lang.Object)",
      "begin_line": 239,
      "end_line": 260,
      "comment": "\r\n     * Tests this object for equality with another.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 67)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.hashCode()",
      "begin_line": 267,
      "end_line": 274,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 38)",
        "(line 269,col 9)-(line 269,col 56)",
        "(line 270,col 9)-(line 270,col 62)",
        "(line 271,col 9)-(line 271,col 56)",
        "(line 272,col 9)-(line 272,col 60)",
        "(line 273,col 9)-(line 273,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.clone()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 29)"
      ]
    }
  ]
}