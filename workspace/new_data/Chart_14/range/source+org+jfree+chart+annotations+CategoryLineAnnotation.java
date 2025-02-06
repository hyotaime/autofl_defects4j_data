{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/annotations/CategoryLineAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryLineAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.CategoryAnnotation",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 423,
      "comment": "\r\n * A line annotation that can be placed on a {@link CategoryPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "category1"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The category for the start of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "value1"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The value for the start of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "category2"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The category for the end of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "value2"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The value for the end of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The line color. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The line stroke. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.CategoryLineAnnotation(java.lang.Comparable, double, java.lang.Comparable, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 107,
      "end_line": 128,
      "comment": "\r\n     * Creates a new annotation that draws a line between (category1, value1)\r\n     * and (category2, value2).\r\n     *\r\n     * @param category1  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value1  the value.\r\n     * @param category2  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value2  the value.\r\n     * @param paint  the line color (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 35)",
        "(line 123,col 9)-(line 123,col 29)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 29)",
        "(line 126,col 9)-(line 126,col 27)",
        "(line 127,col 9)-(line 127,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getCategory1()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns the category for the start of the line.\r\n     * \r\n     * @return The category for the start of the line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setCategory1(Comparable)\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setCategory1(java.lang.Comparable)",
      "begin_line": 148,
      "end_line": 153,
      "comment": "\r\n     * Sets the category for the start of the line.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getCategory1()\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getValue1()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the y-value for the start of the line.\r\n     * \r\n     * @return The y-value for the start of the line.\r\n     * \r\n     * @see #setValue1(double)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setValue1(double)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Sets the y-value for the start of the line.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @see #getValue1()\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getCategory2()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the category for the end of the line.\r\n     * \r\n     * @return The category for the end of the line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setCategory2(Comparable)\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setCategory2(java.lang.Comparable)",
      "begin_line": 195,
      "end_line": 200,
      "comment": "\r\n     * Sets the category for the end of the line.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getCategory2()\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getValue2()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns the y-value for the end of the line.\r\n     * \r\n     * @return The y-value for the end of the line.\r\n     * \r\n     * @see #setValue2(double)\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setValue2(double)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\r\n     * Sets the y-value for the end of the line.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @see #getValue2()\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getPaint()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Returns the paint used to draw the connecting line.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\r\n     * Sets the paint used to draw the connecting line.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getStroke()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\r\n     * Returns the stroke used to draw the connecting line.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setStroke(java.awt.Stroke)",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\r\n     * Sets the stroke used to draw the connecting line.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getStroke()\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 285,
      "end_line": 327,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 52)",
        "(line 290,col 9)-(line 290,col 63)",
        "(line 291,col 9)-(line 291,col 63)",
        "(line 292,col 9)-(line 292,col 48)",
        "(line 294,col 9)-(line 294,col 29)",
        "(line 295,col 9)-(line 295,col 29)",
        "(line 296,col 9)-(line 296,col 29)",
        "(line 297,col 9)-(line 297,col 29)",
        "(line 298,col 9)-(line 298,col 60)",
        "(line 299,col 9)-(line 300,col 55)",
        "(line 301,col 9)-(line 302,col 54)",
        "(line 304,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 32)",
        "(line 325,col 9)-(line 325,col 34)",
        "(line 326,col 9)-(line 326,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.equals(java.lang.Object)",
      "begin_line": 336,
      "end_line": 363,
      "comment": "\r\n     * Tests this object for equality with another.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 67)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.hashCode()",
      "begin_line": 370,
      "end_line": 381,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 25)",
        "(line 372,col 9)-(line 372,col 57)",
        "(line 373,col 9)-(line 373,col 57)",
        "(line 374,col 9)-(line 374,col 60)",
        "(line 375,col 9)-(line 375,col 57)",
        "(line 376,col 9)-(line 376,col 52)",
        "(line 377,col 9)-(line 377,col 60)",
        "(line 378,col 9)-(line 378,col 74)",
        "(line 379,col 9)-(line 379,col 54)",
        "(line 380,col 9)-(line 380,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.clone()",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 402,
      "end_line": 406,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 36)",
        "(line 404,col 9)-(line 404,col 55)",
        "(line 405,col 9)-(line 405,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 416,
      "end_line": 421,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 35)",
        "(line 419,col 9)-(line 419,col 55)",
        "(line 420,col 9)-(line 420,col 57)"
      ]
    }
  ]
}