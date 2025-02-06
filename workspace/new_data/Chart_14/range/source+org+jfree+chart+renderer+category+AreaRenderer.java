{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/AreaRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AreaRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 97,
      "end_line": 343,
      "comment": "\r\n * A category item renderer that draws area charts.  You can use this renderer \r\n * with the {@link org.jfree.chart.plot.CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "endType"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " A flag that controls how the ends of the areas are drawn. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.AreaRenderer()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)",
        "(line 111,col 9)-(line 111,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.getEndType()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Returns a token that controls how the renderer draws the end points.\r\n     * The default value is {@link AreaRendererEndType#TAPER}.\r\n     * \r\n     * @return The end type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setEndType\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.setEndType(org.jfree.chart.renderer.AreaRendererEndType)",
      "begin_line": 134,
      "end_line": 140,
      "comment": "\r\n     * Sets a token that controls how the renderer draws the end points, and \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param type  the end type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getEndType()\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 28)",
        "(line 139,col 9)-(line 139,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.getLegendItem(int, int)",
      "begin_line": 150,
      "end_line": 190,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item.\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 36)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 62)",
        "(line 164,col 9)-(line 165,col 24)",
        "(line 166,col 9)-(line 166,col 35)",
        "(line 167,col 9)-(line 167,col 34)",
        "(line 168,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 30)",
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 67)",
        "(line 178,col 9)-(line 178,col 48)",
        "(line 179,col 9)-(line 179,col 62)",
        "(line 180,col 9)-(line 180,col 65)",
        "(line 182,col 9)-(line 183,col 68)",
        "(line 184,col 9)-(line 184,col 35)",
        "(line 185,col 9)-(line 185,col 45)",
        "(line 186,col 9)-(line 186,col 55)",
        "(line 187,col 9)-(line 187,col 38)",
        "(line 188,col 9)-(line 188,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 206,
      "end_line": 309,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 53)",
        "(line 224,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.equals(java.lang.Object)",
      "begin_line": 318,
      "end_line": 330,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 47)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.clone()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\r\n     * Returns an independent copy of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 29)"
      ]
    }
  ]
}