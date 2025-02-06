{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/CategoryLineAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryLineAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.CategoryAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 428,
      "comment": "\r\n * A line annotation that can be placed on a {@link CategoryPlot}.\r\n "
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
        "category1"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The category for the start of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "value1"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The value for the start of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "category2"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The category for the end of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "value2"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The value for the end of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The line color. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The line stroke. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.CategoryLineAnnotation(java.lang.Comparable, double, java.lang.Comparable, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 112,
      "end_line": 133,
      "comment": "\r\n     * Creates a new annotation that draws a line between (category1, value1)\r\n     * and (category2, value2).\r\n     *\r\n     * @param category1  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value1  the value.\r\n     * @param category2  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value2  the value.\r\n     * @param paint  the line color (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 29)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 29)",
        "(line 131,col 9)-(line 131,col 27)",
        "(line 132,col 9)-(line 132,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getCategory1()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Returns the category for the start of the line.\r\n     *\r\n     * @return The category for the start of the line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setCategory1(Comparable)\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setCategory1(java.lang.Comparable)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\r\n     * Sets the category for the start of the line.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getCategory1()\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getValue1()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the y-value for the start of the line.\r\n     *\r\n     * @return The y-value for the start of the line.\r\n     *\r\n     * @see #setValue1(double)\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setValue1(double)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Sets the y-value for the start of the line.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @see #getValue1()\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getCategory2()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the category for the end of the line.\r\n     *\r\n     * @return The category for the end of the line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setCategory2(Comparable)\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setCategory2(java.lang.Comparable)",
      "begin_line": 200,
      "end_line": 205,
      "comment": "\r\n     * Sets the category for the end of the line.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getCategory2()\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getValue2()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the y-value for the end of the line.\r\n     *\r\n     * @return The y-value for the end of the line.\r\n     *\r\n     * @see #setValue2(double)\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setValue2(double)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\r\n     * Sets the y-value for the end of the line.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @see #getValue2()\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getPaint()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the paint used to draw the connecting line.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\r\n     * Sets the paint used to draw the connecting line.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getStroke()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\r\n     * Returns the stroke used to draw the connecting line.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setStroke(java.awt.Stroke)",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\r\n     * Sets the stroke used to draw the connecting line.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getStroke()\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 290,
      "end_line": 332,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 52)",
        "(line 295,col 9)-(line 295,col 63)",
        "(line 296,col 9)-(line 296,col 63)",
        "(line 297,col 9)-(line 297,col 48)",
        "(line 299,col 9)-(line 299,col 29)",
        "(line 300,col 9)-(line 300,col 29)",
        "(line 301,col 9)-(line 301,col 29)",
        "(line 302,col 9)-(line 302,col 29)",
        "(line 303,col 9)-(line 303,col 60)",
        "(line 304,col 9)-(line 305,col 55)",
        "(line 306,col 9)-(line 307,col 54)",
        "(line 309,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 32)",
        "(line 330,col 9)-(line 330,col 34)",
        "(line 331,col 9)-(line 331,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.equals(java.lang.Object)",
      "begin_line": 341,
      "end_line": 368,
      "comment": "\r\n     * Tests this object for equality with another.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 67)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.hashCode()",
      "begin_line": 375,
      "end_line": 386,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 25)",
        "(line 377,col 9)-(line 377,col 57)",
        "(line 378,col 9)-(line 378,col 57)",
        "(line 379,col 9)-(line 379,col 60)",
        "(line 380,col 9)-(line 380,col 57)",
        "(line 381,col 9)-(line 381,col 52)",
        "(line 382,col 9)-(line 382,col 60)",
        "(line 383,col 9)-(line 383,col 74)",
        "(line 384,col 9)-(line 384,col 54)",
        "(line 385,col 9)-(line 385,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.clone()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 407,
      "end_line": 411,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 36)",
        "(line 409,col 9)-(line 409,col 55)",
        "(line 410,col 9)-(line 410,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 421,
      "end_line": 426,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 35)",
        "(line 424,col 9)-(line 424,col 55)",
        "(line 425,col 9)-(line 425,col 57)"
      ]
    }
  ]
}