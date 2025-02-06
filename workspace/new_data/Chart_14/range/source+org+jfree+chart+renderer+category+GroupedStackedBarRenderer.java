{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/GroupedStackedBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GroupedStackedBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.StackedBarRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 364,
      "comment": "\r\n * A renderer that draws stacked bars within groups.  This will probably be \r\n * merged with the {@link StackedBarRenderer} class at some point.\r\n "
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
        "seriesToGroupMap"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " A map used to assign each series to a group. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.GroupedStackedBarRenderer.GroupedStackedBarRenderer()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 16)",
        "(line 90,col 9)-(line 90,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GroupedStackedBarRenderer.setSeriesToGroupMap(org.jfree.data.KeyToGroupMap)",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\r\n     * Updates the map used to assign each series to a group, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param map  the map (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 36)",
        "(line 104,col 9)-(line 104,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GroupedStackedBarRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is \r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 118,col 48)",
        "(line 119,col 9)-(line 119,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GroupedStackedBarRenderer.calculateBarWidth(org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, int, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 132,
      "end_line": 173,
      "comment": "\r\n     * Calculates the bar width and stores it in the renderer state.  We \r\n     * override the method in the base class to take account of the \r\n     * series-to-group mapping.\r\n     * \r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param state  the renderer state.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 73)",
        "(line 139,col 9)-(line 139,col 62)",
        "(line 140,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GroupedStackedBarRenderer.calculateBarW0(org.jfree.chart.plot.CategoryPlot, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.renderer.category.CategoryItemRendererState, int, int)",
      "begin_line": 190,
      "end_line": 226,
      "comment": "\r\n     * Calculates the coordinate of the first \"side\" of a bar.  This will be \r\n     * the minimum x-coordinate for a vertical bar, and the minimum \r\n     * y-coordinate for a horizontal bar.\r\n     * \r\n     * @param plot  the plot.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param state  the renderer state (has the bar width precalculated).\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * \r\n     * @return The coordinate.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 27)",
        "(line 199,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 206,col 46)",
        "(line 207,col 9)-(line 207,col 63)",
        "(line 208,col 9)-(line 210,col 52)",
        "(line 211,col 9)-(line 211,col 45)",
        "(line 212,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GroupedStackedBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 242,
      "end_line": 341,
      "comment": "\r\n     * Draws a stacked bar for a specific item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain (category) axis.\r\n     * @param rangeAxis  the range (value) axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 57)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 47)",
        "(line 260,col 9)-(line 261,col 34)",
        "(line 262,col 9)-(line 262,col 60)",
        "(line 263,col 9)-(line 264,col 36)",
        "(line 266,col 9)-(line 266,col 34)",
        "(line 267,col 9)-(line 267,col 34)",
        "(line 269,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 30)",
        "(line 286,col 9)-(line 286,col 31)",
        "(line 287,col 9)-(line 287,col 57)",
        "(line 288,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 65)",
        "(line 301,col 9)-(line 302,col 39)",
        "(line 304,col 9)-(line 304,col 31)",
        "(line 305,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 52)",
        "(line 314,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 31)",
        "(line 320,col 9)-(line 320,col 21)",
        "(line 321,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 329,col 24)",
        "(line 330,col 9)-(line 333,col 9)",
        "(line 336,col 9)-(line 336,col 64)",
        "(line 337,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GroupedStackedBarRenderer.equals(java.lang.Object)",
      "begin_line": 350,
      "end_line": 362,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 73)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 33)"
      ]
    }
  ]
}