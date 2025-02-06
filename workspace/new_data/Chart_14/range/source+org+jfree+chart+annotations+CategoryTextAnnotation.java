{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/annotations/CategoryTextAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryTextAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.TextAnnotation",
        "org.jfree.chart.annotations.CategoryAnnotation",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 281,
      "comment": "\r\n * A text annotation that can be placed on a {@link CategoryPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "category"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The category. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryAnchor"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The category anchor (START, MIDDLE, or END). "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.CategoryTextAnnotation(java.lang.String, java.lang.Comparable, double)",
      "begin_line": 94,
      "end_line": 103,
      "comment": "\r\n     * Creates a new annotation to be displayed at the given location.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 33)",
        "(line 101,col 9)-(line 101,col 27)",
        "(line 102,col 9)-(line 102,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.getCategory()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns the category.\r\n     * \r\n     * @return The category (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setCategory(Comparable)\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.setCategory(java.lang.Comparable)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\r\n     * Sets the category that the annotation attaches to.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getCategory()\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.getCategoryAnchor()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns the category anchor point.\r\n     * \r\n     * @return The category anchor point.\r\n     * \r\n     * @see #setCategoryAnchor(CategoryAnchor)\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.setCategoryAnchor(org.jfree.chart.axis.CategoryAnchor)",
      "begin_line": 148,
      "end_line": 153,
      "comment": "\r\n     * Sets the category anchor point.\r\n     * \r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getCategoryAnchor()\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.getValue()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the value that the annotation attaches to.\r\n     * \r\n     * @return The value.\r\n     * \r\n     * @see #setValue(double)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.setValue(double)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Sets the value.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @see #getValue()\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 188,
      "end_line": 223,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 52)",
        "(line 193,col 9)-(line 193,col 61)",
        "(line 194,col 9)-(line 194,col 48)",
        "(line 196,col 9)-(line 196,col 29)",
        "(line 197,col 9)-(line 197,col 29)",
        "(line 198,col 9)-(line 198,col 60)",
        "(line 199,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 202,col 58)",
        "(line 204,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 30)",
        "(line 219,col 9)-(line 219,col 32)",
        "(line 220,col 9)-(line 221,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.equals(java.lang.Object)",
      "begin_line": 232,
      "end_line": 253,
      "comment": "\r\n     * Tests this object for equality with another.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 67)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.hashCode()",
      "begin_line": 260,
      "end_line": 267,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 38)",
        "(line 262,col 9)-(line 262,col 56)",
        "(line 263,col 9)-(line 263,col 62)",
        "(line 264,col 9)-(line 264,col 56)",
        "(line 265,col 9)-(line 265,col 60)",
        "(line 266,col 9)-(line 266,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryTextAnnotation.clone()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 29)"
      ]
    }
  ]
}