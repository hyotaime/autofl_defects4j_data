{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYSplineAndShapeRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYSplineAndShapeRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer"
      ],
      "begin_line": 68,
      "end_line": 364,
      "comment": "\n * A renderer that connects data points with natural cubic splines and/or \n * draws shapes at each data point.  This renderer is designed for use with \n * the {@link XYPlot} class.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * To collect data points for later splining.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "precision"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Resolution of splines (number of line segments between points)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.XYSplineAndShapeRenderer()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Creates a new instance with the \u0027precision\u0027 attribute defaulting to \n     * 5.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.XYSplineAndShapeRenderer(int)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * Creates a new renderer with the specified precision.\n     * \n     * @param precision  the number of points between data items.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 16)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.getPrecision()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Get the resolution of splines.\n     *\n     * @return Number of line segments between points.\n     * \n     * @see #setPrecision(int)\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.setPrecision(int)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * Set the resolution of splines and sends a {@link RendererChangeEvent}\n     * to all registered listeners.\n     *\n     * @param p  number of line segments between points (must be \u003e 0).\n     * \n     * @see #getPrecision()\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 27)",
        "(line 125,col 9)-(line 125,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 144,
      "end_line": 152,
      "comment": "\n     * Initialises the renderer.\n     * \u003cP\u003e\n     * This method will be called before the first item is rendered, giving the\n     * renderer an opportunity to initialise any state information it wants to\n     * maintain.  The renderer can do nothing if it chooses.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area inside the axes.\n     * @param plot  the plot.\n     * @param data  the data.\n     * @param info  an optional info collection object to return data back to\n     *              the caller.\n     *\n     * @return The renderer state.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 79)",
        "(line 148,col 9)-(line 148,col 48)",
        "(line 149,col 9)-(line 149,col 35)",
        "(line 150,col 9)-(line 150,col 38)",
        "(line 151,col 9)-(line 151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.drawPrimaryLineAsPath(org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, int, int, int, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D)",
      "begin_line": 172,
      "end_line": 273,
      "comment": "\n     * Draws the item (first pass). This method draws the lines\n     * connecting the items. Instead of drawing separate lines,\n     * a GeneralPath is constructed and drawn at the end of\n     * the series painting.\n     *\n     * @param g2  the graphics device.\n     * @param state  the renderer state.\n     * @param plot  the plot (can be used to obtain standard color information\n     *              etc).\n     * @param dataset  the dataset.\n     * @param pass  the pass.\n     * @param series  the series index (zero-based).\n     * @param item  the item index (zero-based).\n     * @param domainAxis  the domain axis.\n     * @param rangeAxis  the range axis.\n     * @param dataArea  the area within which the data is being drawn.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 63)",
        "(line 178,col 9)-(line 178,col 62)",
        "(line 181,col 9)-(line 181,col 52)",
        "(line 182,col 9)-(line 182,col 52)",
        "(line 183,col 9)-(line 183,col 79)",
        "(line 184,col 9)-(line 184,col 78)",
        "(line 187,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.solveTridiag(float[], float[], float[], float[], int)",
      "begin_line": 275,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 14)",
        "(line 287,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 30)",
        "(line 293,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.equals(java.lang.Object)",
      "begin_line": 305,
      "end_line": 317,
      "comment": "\n     * Tests this renderer for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 71)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ControlPoint",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 322,
      "end_line": 363,
      "comment": "\n     * Represents a control point.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " The y-coordinate. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint.ControlPoint(float, float)",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\n         * Creates a new control point.\n         * \n         * @param x  the x-coordinate.\n         * @param y  the y-coordinate.\n         ",
      "child_ranges": [
        "(line 337,col 13)-(line 337,col 23)",
        "(line 338,col 13)-(line 338,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint.equals(java.lang.Object)",
      "begin_line": 348,
      "end_line": 361,
      "comment": "\n         * Tests this point for equality with an arbitrary object.\n         * \n         * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted.\n         * \n         * @return A boolean.\n         ",
      "child_ranges": [
        "(line 349,col 13)-(line 351,col 13)",
        "(line 352,col 13)-(line 354,col 13)",
        "(line 355,col 13)-(line 355,col 51)",
        "(line 356,col 13)-(line 358,col 13)",
        "(line 359,col 47)-(line 359,col 47)",
        "(line 360,col 13)-(line 360,col 24)"
      ]
    }
  ]
}