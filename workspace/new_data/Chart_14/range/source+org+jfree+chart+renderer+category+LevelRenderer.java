{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/LevelRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevelRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 386,
      "comment": "\r\n * A {@link CategoryItemRenderer} that draws individual data items as \r\n * horizontal lines, spaced in the same way as bars in a bar chart.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ITEM_MARGIN"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The default item margin percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "itemMargin"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The margin between items within a category. "
    },
    {
      "type": "field",
      "varNames": [
        "maxItemWidth"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The maximum item width as a percentage of the available space. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.LevelRenderer()",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\r\n     * Creates a new renderer with default settings.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 16)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.getItemMargin()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the item margin.\r\n     *\r\n     * @return The margin.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.setItemMargin(double)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\r\n     * Sets the item margin.  The value is expressed as a percentage of the \r\n     * available width for plotting all the bars, with the resulting amount to \r\n     * be distributed between all the bars evenly.\r\n     *\r\n     * @param percent  the new margin.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.getMaximumItemWidth()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns the maximum width, as a percentage of the available drawing \r\n     * space.\r\n     * \r\n     * @return The maximum width.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.setMaximumItemWidth(double)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\r\n     * Sets the maximum item width, which is specified as a percentage of the \r\n     * available space for all items, and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param percent  the percent.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 139,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 158,
      "end_line": 169,
      "comment": "\r\n     * Initialises the renderer and returns a state object that will be passed \r\n     * to subsequent calls to the drawItem method.\r\n     * \u003cp\u003e\r\n     * This method gets called once at the start of the process of drawing a \r\n     * chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be plotted.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     * \r\n     * @return The renderer state.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 165,col 37)",
        "(line 166,col 9)-(line 166,col 65)",
        "(line 167,col 9)-(line 167,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.calculateItemWidth(org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, int, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 179,
      "end_line": 216,
      "comment": "\r\n     * Calculates the bar width and stores it in the renderer state.\r\n     * \r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param state  the renderer state.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 69)",
        "(line 185,col 9)-(line 185,col 65)",
        "(line 186,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.calculateBarW0(org.jfree.chart.plot.CategoryPlot, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.renderer.category.CategoryItemRendererState, int, int)",
      "begin_line": 233,
      "end_line": 266,
      "comment": "\r\n     * Calculates the coordinate of the first \"side\" of a bar.  This will be \r\n     * the minimum x-coordinate for a vertical bar, and the minimum \r\n     * y-coordinate for a horizontal bar.\r\n     * \r\n     * @param plot  the plot.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param state  the renderer state (has the bar width precalculated).\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * \r\n     * @return The coordinate.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 27)",
        "(line 242,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 249,col 52)",
        "(line 250,col 9)-(line 250,col 40)",
        "(line 251,col 9)-(line 251,col 45)",
        "(line 252,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 282,
      "end_line": 337,
      "comment": "\r\n     * Draws the bar for a single (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 57)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 293,col 47)",
        "(line 295,col 9)-(line 295,col 60)",
        "(line 296,col 9)-(line 297,col 36)",
        "(line 298,col 9)-(line 298,col 53)",
        "(line 299,col 9)-(line 299,col 69)",
        "(line 302,col 9)-(line 302,col 27)",
        "(line 303,col 9)-(line 303,col 23)",
        "(line 304,col 9)-(line 304,col 23)",
        "(line 305,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 55)",
        "(line 318,col 9)-(line 318,col 52)",
        "(line 319,col 9)-(line 319,col 33)",
        "(line 320,col 9)-(line 320,col 31)",
        "(line 321,col 9)-(line 321,col 22)",
        "(line 323,col 9)-(line 324,col 24)",
        "(line 325,col 9)-(line 328,col 9)",
        "(line 331,col 9)-(line 331,col 64)",
        "(line 332,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.calculateSeriesWidth(double, org.jfree.chart.axis.CategoryAxis, int, int)",
      "begin_line": 349,
      "end_line": 357,
      "comment": "\r\n     * Calculates the available space for each series.\r\n     * \r\n     * @param space  the space along the entire axis (in Java2D units).\r\n     * @param axis  the category axis.\r\n     * @param categories  the number of categories.\r\n     * @param series  the number of series.\r\n     * \r\n     * @return The width of one series.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 352,col 48)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LevelRenderer.equals(java.lang.Object)",
      "begin_line": 366,
      "end_line": 384,
      "comment": "\r\n     * Tests an object for equality with this instance.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 49)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 20)"
      ]
    }
  ]
}