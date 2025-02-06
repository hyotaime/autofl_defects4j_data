{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/LineRenderer3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LineRenderer3D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.LineAndShapeRenderer",
        "org.jfree.chart.Effect3D",
        "java.io.Serializable"
      ],
      "begin_line": 90,
      "end_line": 662,
      "comment": "\r\n * A line renderer with a 3D effect.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_X_OFFSET"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The default x-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_Y_OFFSET"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The default y-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WALL_PAINT"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The default wall paint. "
    },
    {
      "type": "field",
      "varNames": [
        "xOffset"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The size of x-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "yOffset"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The size of y-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "wallPaint"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The paint used to shade the left and lower 3D wall. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.LineRenderer3D()",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 27)",
        "(line 119,col 9)-(line 119,col 40)",
        "(line 120,col 9)-(line 120,col 40)",
        "(line 121,col 9)-(line 121,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.getXOffset()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the x-offset for the 3D effect.\r\n     *\r\n     * @return The x-offset.\r\n     * \r\n     * @see #setXOffset(double)\r\n     * @see #getYOffset()\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.getYOffset()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Returns the y-offset for the 3D effect.\r\n     *\r\n     * @return The y-offset.\r\n     * \r\n     * @see #setYOffset(double)\r\n     * @see #getXOffset()\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.setXOffset(double)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\r\n     * Sets the x-offset and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param xOffset  the x-offset.\r\n     * \r\n     * @see #getXOffset()\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 31)",
        "(line 158,col 9)-(line 158,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.setYOffset(double)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\r\n     * Sets the y-offset and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param yOffset  the y-offset.\r\n     * \r\n     * @see #getYOffset()\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 31)",
        "(line 171,col 9)-(line 171,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.getWallPaint()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns the paint used to highlight the left and bottom wall in the plot\r\n     * background.\r\n     *\r\n     * @return The paint.\r\n     * \r\n     * @see #setWallPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.setWallPaint(java.awt.Paint)",
      "begin_line": 195,
      "end_line": 201,
      "comment": "\r\n     * Sets the paint used to hightlight the left and bottom walls in the plot\r\n     * background, and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getWallPaint()\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 31)",
        "(line 200,col 9)-(line 200,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 210,
      "end_line": 282,
      "comment": "\r\n     * Draws the background for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area inside the axes.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 43)",
        "(line 214,col 9)-(line 214,col 55)",
        "(line 215,col 9)-(line 215,col 46)",
        "(line 216,col 9)-(line 216,col 55)",
        "(line 218,col 9)-(line 218,col 46)",
        "(line 219,col 9)-(line 219,col 55)",
        "(line 220,col 9)-(line 220,col 46)",
        "(line 221,col 9)-(line 221,col 55)",
        "(line 223,col 9)-(line 223,col 45)",
        "(line 224,col 9)-(line 224,col 28)",
        "(line 225,col 9)-(line 225,col 28)",
        "(line 226,col 9)-(line 226,col 28)",
        "(line 227,col 9)-(line 227,col 28)",
        "(line 228,col 9)-(line 228,col 28)",
        "(line 229,col 9)-(line 229,col 28)",
        "(line 230,col 9)-(line 230,col 25)",
        "(line 232,col 9)-(line 232,col 56)",
        "(line 233,col 9)-(line 234,col 44)",
        "(line 237,col 9)-(line 237,col 58)",
        "(line 238,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 49)",
        "(line 244,col 9)-(line 244,col 32)",
        "(line 245,col 9)-(line 245,col 32)",
        "(line 246,col 9)-(line 246,col 32)",
        "(line 247,col 9)-(line 247,col 32)",
        "(line 248,col 9)-(line 248,col 29)",
        "(line 249,col 9)-(line 249,col 36)",
        "(line 250,col 9)-(line 250,col 26)",
        "(line 252,col 9)-(line 252,col 51)",
        "(line 253,col 9)-(line 253,col 34)",
        "(line 254,col 9)-(line 254,col 34)",
        "(line 255,col 9)-(line 255,col 34)",
        "(line 256,col 9)-(line 256,col 34)",
        "(line 257,col 9)-(line 257,col 31)",
        "(line 258,col 9)-(line 258,col 36)",
        "(line 259,col 9)-(line 259,col 28)",
        "(line 262,col 9)-(line 262,col 37)",
        "(line 263,col 9)-(line 263,col 58)",
        "(line 264,col 9)-(line 264,col 24)",
        "(line 265,col 9)-(line 265,col 39)",
        "(line 266,col 9)-(line 266,col 24)",
        "(line 267,col 9)-(line 267,col 39)",
        "(line 268,col 9)-(line 268,col 24)",
        "(line 271,col 9)-(line 271,col 58)",
        "(line 272,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 291,
      "end_line": 322,
      "comment": "\r\n     * Draws the outline for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area inside the axes.\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 43)",
        "(line 295,col 9)-(line 295,col 55)",
        "(line 296,col 9)-(line 296,col 46)",
        "(line 297,col 9)-(line 297,col 55)",
        "(line 299,col 9)-(line 299,col 46)",
        "(line 300,col 9)-(line 300,col 55)",
        "(line 301,col 9)-(line 301,col 46)",
        "(line 302,col 9)-(line 302,col 55)",
        "(line 304,col 9)-(line 304,col 45)",
        "(line 305,col 9)-(line 305,col 28)",
        "(line 306,col 9)-(line 306,col 28)",
        "(line 307,col 9)-(line 307,col 28)",
        "(line 308,col 9)-(line 308,col 28)",
        "(line 309,col 9)-(line 309,col 28)",
        "(line 310,col 9)-(line 310,col 28)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 314,col 9)-(line 314,col 55)",
        "(line 315,col 9)-(line 315,col 52)",
        "(line 316,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.drawDomainGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double)",
      "begin_line": 334,
      "end_line": 365,
      "comment": "\r\n     * Draws a grid line against the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any \r\n     *                  3D effect).\r\n     * @param value  the Java2D value at which the grid line should be drawn.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 28)",
        "(line 340,col 9)-(line 340,col 28)",
        "(line 341,col 9)-(line 341,col 60)",
        "(line 342,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 51)",
        "(line 361,col 9)-(line 361,col 53)",
        "(line 362,col 9)-(line 362,col 23)",
        "(line 363,col 9)-(line 363,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.drawRangeGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double)",
      "begin_line": 378,
      "end_line": 423,
      "comment": "\r\n     * Draws a grid line against the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any \r\n     *                  3D effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 38)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 393,col 53)",
        "(line 395,col 9)-(line 395,col 28)",
        "(line 396,col 9)-(line 396,col 28)",
        "(line 397,col 9)-(line 397,col 60)",
        "(line 398,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 50)",
        "(line 419,col 9)-(line 419,col 52)",
        "(line 420,col 9)-(line 420,col 23)",
        "(line 421,col 9)-(line 421,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 434,
      "end_line": 489,
      "comment": "\r\n     * Draws a range marker.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 443,col 53)",
        "(line 445,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 505,
      "end_line": 607,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 518,col 9)",
        "(line 521,col 9)-(line 521,col 49)",
        "(line 522,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 529,col 53)",
        "(line 531,col 9)-(line 531,col 60)",
        "(line 534,col 9)-(line 535,col 52)",
        "(line 536,col 9)-(line 536,col 39)",
        "(line 537,col 9)-(line 538,col 41)",
        "(line 540,col 9)-(line 540,col 48)",
        "(line 541,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 593,col 9)",
        "(line 596,col 9)-(line 599,col 9)",
        "(line 602,col 9)-(line 602,col 64)",
        "(line 603,col 9)-(line 605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.equals(java.lang.Object)",
      "begin_line": 616,
      "end_line": 634,
      "comment": "\r\n     * Checks this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 51)",
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 643,
      "end_line": 646,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 36)",
        "(line 645,col 9)-(line 645,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineRenderer3D.readObject(java.io.ObjectInputStream)",
      "begin_line": 656,
      "end_line": 660,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 35)",
        "(line 659,col 9)-(line 659,col 59)"
      ]
    }
  ]
}