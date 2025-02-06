{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/CategoryStepRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryStepRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 365,
      "comment": "\r\n * A \"step\" renderer similar to {@link XYStepRenderer} but\r\n * that can be used with the {@link CategoryPlot} class.\r\n "
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.CategoryItemRendererState"
      ],
      "begin_line": 84,
      "end_line": 103,
      "comment": "\r\n     * State information for the renderer.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " \r\n         * A working line for re-use to avoid creating large numbers of\r\n         * objects.\r\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.State.State(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\r\n         * Creates a new state instance.\r\n         * \r\n         * @param info  collects plot rendering information (\u003ccode\u003enull\u003c/code\u003e \r\n         *              permitted).\r\n         ",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 24)",
        "(line 100,col 13)-(line 100,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "STAGGER_WIDTH"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " could make this configurable"
    },
    {
      "type": "field",
      "varNames": [
        "stagger"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " \r\n     * A flag that controls whether or not the steps for multiple series are \r\n     * staggered. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.CategoryStepRenderer()",
      "begin_line": 120,
      "end_line": 122,
      "comment": " \r\n     * Creates a new renderer (stagger defaults to \u003ccode\u003efalse\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.CategoryStepRenderer(boolean)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Creates a new renderer.\r\n     *  \r\n     * @param stagger  should the horizontal part of the step be staggered by \r\n     *                 series? \r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.getStagger()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\r\n     * Returns the flag that controls whether the series steps are staggered.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.setStagger(boolean)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\r\n     * Sets the flag that controls whether or not the series steps are \r\n     * staggered and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param shouldStagger  a boolean.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 37)",
        "(line 152,col 9)-(line 152,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.getLegendItem(int, int)",
      "begin_line": 163,
      "end_line": 199,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 35)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 61)",
        "(line 176,col 9)-(line 177,col 24)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 34)",
        "(line 180,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 30)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 67)",
        "(line 190,col 9)-(line 190,col 48)",
        "(line 192,col 9)-(line 193,col 39)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 36)",
        "(line 196,col 9)-(line 196,col 33)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 198,col 9)-(line 198,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.createState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Creates a new state instance.  This method is called from \r\n     * {@link #initialise(Graphics2D, Rectangle2D, CategoryPlot, int, \r\n     * PlotRenderingInfo)}, and we override it to ensure that the state\r\n     * contains a working Line2D instance.\r\n     * \r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     * \r\n     * @return A new state instance.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.drawLine(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryStepRenderer.State, org.jfree.chart.plot.PlotOrientation, double, double, double, double)",
      "begin_line": 232,
      "end_line": 245,
      "comment": "\r\n     * Draws a line taking into account the specified orientation.\r\n     * \u003cp\u003e\r\n     * In version 1.0.5, the signature of this method was changed by the \r\n     * addition of the \u0027state\u0027 parameter.  This is an incompatible change, but\r\n     * is considered a low risk because it is unlikely that anyone has \r\n     * subclassed this renderer.  If this *does* cause trouble for you, please\r\n     * report it as a bug.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param orientation  the plot orientation.\r\n     * @param x0  the x-coordinate for the start of the line.\r\n     * @param y0  the y-coordinate for the start of the line.\r\n     * @param x1  the x-coordinate for the end of the line.\r\n     * @param y1  the y-coordinate for the end of the line.\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 261,
      "end_line": 342,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 53)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 60)",
        "(line 284,col 9)-(line 285,col 52)",
        "(line 286,col 9)-(line 287,col 52)",
        "(line 288,col 9)-(line 288,col 34)",
        "(line 289,col 9)-(line 290,col 41)",
        "(line 291,col 9)-(line 291,col 47)",
        "(line 292,col 9)-(line 292,col 49)",
        "(line 294,col 9)-(line 319,col 8)",
        "(line 320,col 8)-(line 320,col 66)",
        "(line 324,col 8)-(line 327,col 8)",
        "(line 330,col 8)-(line 330,col 63)",
        "(line 331,col 8)-(line 340,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryStepRenderer.equals(java.lang.Object)",
      "begin_line": 351,
      "end_line": 363,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 63)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 33)"
      ]
    }
  ]
}