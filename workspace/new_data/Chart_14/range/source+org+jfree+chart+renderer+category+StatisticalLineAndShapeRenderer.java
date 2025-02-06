{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/StatisticalLineAndShapeRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalLineAndShapeRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.LineAndShapeRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 86,
      "end_line": 392,
      "comment": "\r\n * A renderer that draws shapes for each data item, and lines between data\r\n * items.  Each point has a mean value and a standard deviation line. For use\r\n * with the {@link CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "errorIndicatorPaint"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The paint used to show the error indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.StatisticalLineAndShapeRenderer()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Constructs a default renderer (draws shapes and lines).\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.StatisticalLineAndShapeRenderer(boolean, boolean)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\r\n     * Constructs a new renderer.\r\n     *\r\n     * @param linesVisible  draw lines?\r\n     * @param shapesVisible  draw shapes?\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 43)",
        "(line 111,col 9)-(line 111,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.getErrorIndicatorPaint()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Returns the paint used for the error indicators.\r\n     *\r\n     * @return The paint used for the error indicators (possibly\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setErrorIndicatorPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.setErrorIndicatorPaint(java.awt.Paint)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\r\n     * Sets the paint used for the error indicators (if \u003ccode\u003enull\u003c/code\u003e,\r\n     * the item outline paint is used instead) and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getErrorIndicatorPaint()\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 41)",
        "(line 137,col 9)-(line 137,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 155,
      "end_line": 341,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset (a {@link StatisticalCategoryDataset} is\r\n     *                 required).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 172,col 9)-(line 172,col 49)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 179,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 186,col 55)",
        "(line 188,col 9)-(line 188,col 62)",
        "(line 190,col 9)-(line 190,col 60)",
        "(line 193,col 9)-(line 193,col 18)",
        "(line 194,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 205,col 41)",
        "(line 207,col 9)-(line 207,col 48)",
        "(line 208,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 62)",
        "(line 271,col 9)-(line 271,col 47)",
        "(line 274,col 9)-(line 274,col 79)",
        "(line 276,col 9)-(line 276,col 31)",
        "(line 277,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 42)",
        "(line 306,col 9)-(line 321,col 9)",
        "(line 324,col 9)-(line 333,col 9)",
        "(line 336,col 9)-(line 336,col 64)",
        "(line 337,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.equals(java.lang.Object)",
      "begin_line": 350,
      "end_line": 364,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 358,col 56)",
        "(line 359,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 373,
      "end_line": 376,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 36)",
        "(line 375,col 9)-(line 375,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 386,
      "end_line": 390,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 35)",
        "(line 389,col 9)-(line 389,col 69)"
      ]
    }
  ]
}