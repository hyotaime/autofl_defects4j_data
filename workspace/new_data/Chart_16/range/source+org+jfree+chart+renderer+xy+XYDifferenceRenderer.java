{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/XYDifferenceRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDifferenceRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 117,
      "end_line": 1229,
      "comment": "\r\n * A renderer for an {@link XYPlot} that highlights the differences between two\r\n * series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "positivePaint"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The paint used to highlight positive differences (y(0) \u003e y(1)). "
    },
    {
      "type": "field",
      "varNames": [
        "negativePaint"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The paint used to highlight negative differences (y(0) \u003c y(1)). "
    },
    {
      "type": "field",
      "varNames": [
        "shapesVisible"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Display shapes at each point? "
    },
    {
      "type": "field",
      "varNames": [
        "legendLine"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The shape to display in the legend item. "
    },
    {
      "type": "field",
      "varNames": [
        "roundXCoordinates"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\r\n     * This flag controls whether or not the x-coordinates (in Java2D space) \r\n     * are rounded to integers.  When set to true, this can avoid the vertical\r\n     * striping that anti-aliasing can generate.  However, the rounding may not\r\n     * be appropriate for output in high resolution formats (for example, \r\n     * vector graphics formats such as SVG and PDF).\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.XYDifferenceRenderer()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Creates a new renderer with default attributes.\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.XYDifferenceRenderer(java.awt.Paint, java.awt.Paint, boolean)",
      "begin_line": 165,
      "end_line": 180,
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param positivePaint  the highlight color for positive differences \r\n     *                       (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param negativePaint  the highlight color for negative differences \r\n     *                       (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param shapes  draw shapes?\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 43)",
        "(line 176,col 9)-(line 176,col 43)",
        "(line 177,col 9)-(line 177,col 36)",
        "(line 178,col 9)-(line 178,col 65)",
        "(line 179,col 9)-(line 179,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.getPositivePaint()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the paint used to highlight positive differences.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPositivePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.setPositivePaint(java.awt.Paint)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\r\n     * Sets the paint used to highlight positive differences.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPositivePaint()\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 35)",
        "(line 205,col 9)-(line 205,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.getNegativePaint()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns the paint used to highlight negative differences.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setNegativePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.setNegativePaint(java.awt.Paint)",
      "begin_line": 226,
      "end_line": 232,
      "comment": "\r\n     * Sets the paint used to highlight negative differences.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getNegativePaint()\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 35)",
        "(line 231,col 9)-(line 231,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.getShapesVisible()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Returns a flag that controls whether or not shapes are drawn for each \r\n     * data value.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setShapesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.setShapesVisible(boolean)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\r\n     * Sets a flag that controls whether or not shapes are drawn for each \r\n     * data value.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getShapesVisible()\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 34)",
        "(line 256,col 9)-(line 256,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.getLegendLine()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the shape used to represent a line in the legend.\r\n     * \r\n     * @return The legend line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLine(Shape)\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.setLegendLine(java.awt.Shape)",
      "begin_line": 278,
      "end_line": 284,
      "comment": "\r\n     * Sets the shape used as a line in each legend item and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendLine()\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 31)",
        "(line 283,col 9)-(line 283,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.getRoundXCoordinates()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\r\n     * Returns the flag that controls whether or not the x-coordinates (in\r\n     * Java2D space) are rounded to integer values.\r\n     * \r\n     * @return The flag.\r\n     * \r\n     * @since 1.0.4\r\n     * \r\n     * @see #setRoundXCoordinates(boolean)\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.setRoundXCoordinates(boolean)",
      "begin_line": 311,
      "end_line": 314,
      "comment": "\r\n     * Sets the flag that controls whether or not the x-coordinates (in \r\n     * Java2D space) are rounded to integer values, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param round  the new flag value.\r\n     * \r\n     * @since 1.0.4\r\n     * \r\n     * @see #getRoundXCoordinates()\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 39)",
        "(line 313,col 9)-(line 313,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 332,
      "end_line": 343,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be \r\n     * passed to subsequent calls to the drawItem() method.  This method will \r\n     * be called before the first item is rendered, giving the renderer an \r\n     * opportunity to initialise any state information it wants to maintain.  \r\n     * The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return A state object.\r\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 339,col 22)",
        "(line 340,col 9)-(line 340,col 48)",
        "(line 341,col 9)-(line 341,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.getPassCount()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns \u003ccode\u003e2\u003c/code\u003e, the number of passes required by the renderer.  \r\n     * The {@link XYPlot} will run through the dataset this number of times.\r\n     * \r\n     * @return The number of passes required by the renderer.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 373,
      "end_line": 395,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain (horizontal) axis.\r\n     * @param rangeAxis  the range (vertical) axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.drawItemPass0(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 413,
      "end_line": 837,
      "comment": "\r\n     * Draws the visual representation of a single data item, first pass.\r\n     *\r\n     * @param x_graphics  the graphics device.\r\n     * @param x_dataArea  the area within which the data is being drawn.\r\n     * @param x_info  collects information about the drawing.\r\n     * @param x_plot  the plot (can be used to obtain standard color \r\n     *                information etc).\r\n     * @param x_domainAxis  the domain (horizontal) axis.\r\n     * @param x_rangeAxis  the range (vertical) axis.\r\n     * @param x_dataset  the dataset.\r\n     * @param x_series  the series index (zero-based).\r\n     * @param x_item  the item index (zero-based).\r\n     * @param x_crosshairState  crosshair information for the plot \r\n     *                          (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 76)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 441,col 9)-(line 441,col 53)",
        "(line 442,col 9)-(line 442,col 53)",
        "(line 443,col 9)-(line 443,col 53)",
        "(line 444,col 9)-(line 444,col 53)",
        "(line 445,col 9)-(line 445,col 53)",
        "(line 446,col 9)-(line 446,col 53)",
        "(line 449,col 9)-(line 449,col 35)",
        "(line 450,col 9)-(line 450,col 59)",
        "(line 451,col 9)-(line 451,col 38)",
        "(line 452,col 9)-(line 452,col 38)",
        "(line 453,col 9)-(line 453,col 38)",
        "(line 454,col 9)-(line 454,col 38)",
        "(line 455,col 9)-(line 455,col 58)",
        "(line 456,col 9)-(line 456,col 58)",
        "(line 458,col 9)-(line 458,col 38)",
        "(line 459,col 9)-(line 459,col 38)",
        "(line 460,col 9)-(line 460,col 41)",
        "(line 461,col 9)-(line 461,col 41)",
        "(line 462,col 9)-(line 462,col 41)",
        "(line 463,col 9)-(line 463,col 41)",
        "(line 464,col 9)-(line 464,col 61)",
        "(line 465,col 9)-(line 465,col 61)",
        "(line 468,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 486,col 48)",
        "(line 487,col 9)-(line 487,col 47)",
        "(line 488,col 9)-(line 488,col 48)",
        "(line 489,col 9)-(line 489,col 48)",
        "(line 490,col 9)-(line 490,col 48)",
        "(line 491,col 9)-(line 491,col 47)",
        "(line 492,col 9)-(line 492,col 48)",
        "(line 493,col 9)-(line 493,col 48)",
        "(line 494,col 9)-(line 494,col 48)",
        "(line 496,col 9)-(line 496,col 27)",
        "(line 499,col 9)-(line 499,col 38)",
        "(line 500,col 9)-(line 500,col 38)",
        "(line 501,col 9)-(line 501,col 38)",
        "(line 502,col 9)-(line 502,col 38)",
        "(line 505,col 9)-(line 505,col 42)",
        "(line 506,col 9)-(line 579,col 9)",
        "(line 582,col 9)-(line 786,col 9)",
        "(line 789,col 9)-(line 795,col 9)",
        "(line 797,col 9)-(line 803,col 9)",
        "(line 806,col 9)-(line 807,col 46)",
        "(line 808,col 9)-(line 809,col 49)",
        "(line 810,col 9)-(line 811,col 46)",
        "(line 812,col 9)-(line 813,col 49)",
        "(line 816,col 9)-(line 816,col 40)",
        "(line 817,col 9)-(line 817,col 40)",
        "(line 818,col 9)-(line 818,col 46)",
        "(line 819,col 9)-(line 819,col 46)",
        "(line 823,col 9)-(line 823,col 40)",
        "(line 824,col 9)-(line 824,col 40)",
        "(line 827,col 9)-(line 827,col 44)",
        "(line 828,col 9)-(line 828,col 44)",
        "(line 829,col 9)-(line 829,col 43)",
        "(line 830,col 9)-(line 830,col 43)",
        "(line 833,col 9)-(line 834,col 55)",
        "(line 835,col 9)-(line 836,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.drawItemPass1(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 857,
      "end_line": 958,
      "comment": "\r\n     * Draws the visual representation of a single data item, second pass.  In \r\n     * the second pass, the renderer draws the lines and shapes for the \r\n     * individual points in the two series.\r\n     *\r\n     * @param x_graphics  the graphics device.\r\n     * @param x_dataArea  the area within which the data is being drawn.\r\n     * @param x_info  collects information about the drawing.\r\n     * @param x_plot  the plot (can be used to obtain standard color \r\n     *         information etc).\r\n     * @param x_domainAxis  the domain (horizontal) axis.\r\n     * @param x_rangeAxis  the range (vertical) axis.\r\n     * @param x_dataset  the dataset.\r\n     * @param x_series  the series index (zero-based).\r\n     * @param x_item  the item index (zero-based).\r\n     * @param x_crosshairState  crosshair information for the plot \r\n     *                          (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 34)",
        "(line 869,col 9)-(line 869,col 43)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 874,col 9)-(line 874,col 63)",
        "(line 875,col 9)-(line 875,col 64)",
        "(line 876,col 9)-(line 876,col 43)",
        "(line 877,col 9)-(line 877,col 45)",
        "(line 879,col 9)-(line 879,col 69)",
        "(line 880,col 9)-(line 880,col 72)",
        "(line 881,col 9)-(line 881,col 71)",
        "(line 883,col 9)-(line 883,col 60)",
        "(line 884,col 9)-(line 884,col 60)",
        "(line 885,col 9)-(line 886,col 38)",
        "(line 887,col 9)-(line 888,col 37)",
        "(line 890,col 9)-(line 905,col 9)",
        "(line 908,col 9)-(line 929,col 9)",
        "(line 931,col 9)-(line 931,col 72)",
        "(line 932,col 9)-(line 932,col 70)",
        "(line 933,col 9)-(line 934,col 75)",
        "(line 936,col 9)-(line 938,col 9)",
        "(line 940,col 9)-(line 941,col 65)",
        "(line 942,col 9)-(line 943,col 64)",
        "(line 945,col 9)-(line 945,col 29)",
        "(line 946,col 9)-(line 951,col 9)",
        "(line 953,col 9)-(line 957,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.isEitherSeriesDegenerate(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 969,
      "end_line": 978,
      "comment": "\r\n     * Determines if a dataset is degenerate.  A degenerate dataset is a \r\n     * dataset where either series has less than two (2) points.\r\n     *\r\n     * @param x_dataset  the dataset.\r\n     * @param x_impliedZeroSubtrahend  if false, do not check the subtrahend\r\n     *\r\n     * @return true if the dataset is degenerate.\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 974,col 9)",
        "(line 976,col 9)-(line 977,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.areSeriesDisjoint(org.jfree.data.xy.XYDataset)",
      "begin_line": 988,
      "end_line": 1001,
      "comment": "\r\n     * Determines if the two (2) series are disjoint.\r\n     * Disjoint series do not overlap in the domain space.\r\n     *\r\n     * @param x_dataset  the dataset.\r\n     *\r\n     * @return true if the dataset is degenerate.\r\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 59)",
        "(line 991,col 9)-(line 991,col 59)",
        "(line 992,col 9)-(line 992,col 80)",
        "(line 994,col 9)-(line 994,col 62)",
        "(line 995,col 9)-(line 995,col 62)",
        "(line 996,col 9)-(line 997,col 43)",
        "(line 999,col 9)-(line 1000,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.createPolygon(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, boolean, java.util.LinkedList, java.util.LinkedList)",
      "begin_line": 1019,
      "end_line": 1099,
      "comment": "\r\n     * Draws the visual representation of a polygon\r\n     *\r\n     * @param x_graphics  the graphics device.\r\n     * @param x_dataArea  the area within which the data is being drawn.\r\n     * @param x_plot  the plot (can be used to obtain standard color\r\n     *                information etc).\r\n     * @param x_domainAxis  the domain (horizontal) axis.\r\n     * @param x_rangeAxis  the range (vertical) axis.\r\n     * @param x_positive  indicates if the polygon is positive (true) or \r\n     *                    negative (false).\r\n     * @param x_xValues  a linked list of the x values (expects values to be \r\n     *                   of type Double).\r\n     * @param x_yValues  a linked list of the y values (expects values to be \r\n     *                   of type Double).\r\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 69)",
        "(line 1029,col 9)-(line 1029,col 72)",
        "(line 1030,col 9)-(line 1030,col 71)",
        "(line 1032,col 9)-(line 1032,col 49)",
        "(line 1033,col 9)-(line 1033,col 49)",
        "(line 1035,col 9)-(line 1035,col 47)",
        "(line 1037,col 9)-(line 1092,col 9)",
        "(line 1094,col 9)-(line 1098,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.getLegendItem(int, int)",
      "begin_line": 1110,
      "end_line": 1148,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses \r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 33)",
        "(line 1112,col 9)-(line 1112,col 29)",
        "(line 1113,col 9)-(line 1144,col 9)",
        "(line 1146,col 9)-(line 1146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.equals(java.lang.Object)",
      "begin_line": 1157,
      "end_line": 1184,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1158,col 9)-(line 1160,col 9)",
        "(line 1161,col 9)-(line 1163,col 9)",
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1167,col 63)",
        "(line 1168,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1173,col 9)",
        "(line 1174,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1179,col 9)",
        "(line 1180,col 9)-(line 1182,col 9)",
        "(line 1183,col 9)-(line 1183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.clone()",
      "begin_line": 1193,
      "end_line": 1197,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 1194,col 9)-(line 1194,col 74)",
        "(line 1195,col 9)-(line 1195,col 65)",
        "(line 1196,col 9)-(line 1196,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1206,
      "end_line": 1211,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1207,col 36)",
        "(line 1208,col 9)-(line 1208,col 63)",
        "(line 1209,col 9)-(line 1209,col 63)",
        "(line 1210,col 9)-(line 1210,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDifferenceRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 1221,
      "end_line": 1227,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 35)",
        "(line 1224,col 9)-(line 1224,col 63)",
        "(line 1225,col 9)-(line 1225,col 63)",
        "(line 1226,col 9)-(line 1226,col 60)"
      ]
    }
  ]
}