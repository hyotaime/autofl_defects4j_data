{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/CategoryLineAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryLineAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractAnnotation",
        "org.jfree.chart.annotations.CategoryAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 78,
      "end_line": 443,
      "comment": "\r\n * A line annotation that can be placed on a {@link CategoryPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "category1"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The category for the start of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "value1"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The value for the start of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "category2"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The category for the end of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "value2"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The value for the end of the line. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The line color. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The line stroke. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.CategoryLineAnnotation(java.lang.Comparable, double, java.lang.Comparable, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 114,
      "end_line": 136,
      "comment": "\r\n     * Creates a new annotation that draws a line between (category1, value1)\r\n     * and (category2, value2).\r\n     *\r\n     * @param category1  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value1  the value.\r\n     * @param category2  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value2  the value.\r\n     * @param paint  the line color (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 16)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 131,col 29)",
        "(line 132,col 9)-(line 132,col 35)",
        "(line 133,col 9)-(line 133,col 29)",
        "(line 134,col 9)-(line 134,col 27)",
        "(line 135,col 9)-(line 135,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getCategory1()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\r\n     * Returns the category for the start of the line.\r\n     *\r\n     * @return The category for the start of the line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setCategory1(Comparable)\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setCategory1(java.lang.Comparable)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\r\n     * Sets the category for the start of the line and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getCategory1()\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getValue1()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns the y-value for the start of the line.\r\n     *\r\n     * @return The y-value for the start of the line.\r\n     *\r\n     * @see #setValue1(double)\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setValue1(double)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\r\n     * Sets the y-value for the start of the line and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @see #getValue1()\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 28)",
        "(line 186,col 9)-(line 186,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getCategory2()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the category for the end of the line.\r\n     *\r\n     * @return The category for the end of the line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setCategory2(Comparable)\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setCategory2(java.lang.Comparable)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "\r\n     * Sets the category for the end of the line and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getCategory2()\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 34)",
        "(line 213,col 9)-(line 213,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getValue2()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Returns the y-value for the end of the line.\r\n     *\r\n     * @return The y-value for the end of the line.\r\n     *\r\n     * @see #setValue2(double)\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setValue2(double)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\r\n     * Sets the y-value for the end of the line and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @see #getValue2()\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 28)",
        "(line 237,col 9)-(line 237,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getPaint()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\r\n     * Returns the paint used to draw the connecting line.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\r\n     * Sets the paint used to draw the connecting line and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 27)",
        "(line 264,col 9)-(line 264,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.getStroke()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\r\n     * Returns the stroke used to draw the connecting line.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.setStroke(java.awt.Stroke)",
      "begin_line": 286,
      "end_line": 292,
      "comment": "\r\n     * Sets the stroke used to draw the connecting line and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getStroke()\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 29)",
        "(line 291,col 9)-(line 291,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 305,
      "end_line": 347,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 52)",
        "(line 310,col 9)-(line 310,col 63)",
        "(line 311,col 9)-(line 311,col 63)",
        "(line 312,col 9)-(line 312,col 48)",
        "(line 314,col 9)-(line 314,col 29)",
        "(line 315,col 9)-(line 315,col 29)",
        "(line 316,col 9)-(line 316,col 29)",
        "(line 317,col 9)-(line 317,col 29)",
        "(line 318,col 9)-(line 318,col 60)",
        "(line 319,col 9)-(line 320,col 55)",
        "(line 321,col 9)-(line 322,col 54)",
        "(line 324,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 32)",
        "(line 345,col 9)-(line 345,col 34)",
        "(line 346,col 9)-(line 346,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.equals(java.lang.Object)",
      "begin_line": 356,
      "end_line": 383,
      "comment": "\r\n     * Tests this object for equality with another.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 67)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.hashCode()",
      "begin_line": 390,
      "end_line": 401,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 25)",
        "(line 392,col 9)-(line 392,col 57)",
        "(line 393,col 9)-(line 393,col 57)",
        "(line 394,col 9)-(line 394,col 60)",
        "(line 395,col 9)-(line 395,col 57)",
        "(line 396,col 9)-(line 396,col 52)",
        "(line 397,col 9)-(line 397,col 60)",
        "(line 398,col 9)-(line 398,col 74)",
        "(line 399,col 9)-(line 399,col 54)",
        "(line 400,col 9)-(line 400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.clone()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 422,
      "end_line": 426,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 36)",
        "(line 424,col 9)-(line 424,col 55)",
        "(line 425,col 9)-(line 425,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryLineAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 436,
      "end_line": 441,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 35)",
        "(line 439,col 9)-(line 439,col 55)",
        "(line 440,col 9)-(line 440,col 57)"
      ]
    }
  ]
}