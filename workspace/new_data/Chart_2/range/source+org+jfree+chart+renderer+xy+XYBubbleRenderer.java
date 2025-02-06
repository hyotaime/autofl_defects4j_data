{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/XYBubbleRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBubbleRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 95,
      "end_line": 359,
      "comment": "\r\n * A renderer that draws a circle at each data point with a diameter that is\r\n * determined by the z-value in the dataset (the renderer requires the dataset\r\n * to be an instance of {@link XYZDataset}.  The example shown here\r\n * is generated by the \u003ccode\u003eXYBubbleChartDemo1.java\u003c/code\u003e program\r\n * included in the JFreeChart demo collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/XYBubbleRendererSample.png\"\r\n * alt\u003d\"XYBubbleRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "SCALE_ON_BOTH_AXES"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\r\n     * A constant to specify that the bubbles drawn by this renderer should be\r\n     * scaled on both axes (see {@link #XYBubbleRenderer(int)}).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SCALE_ON_DOMAIN_AXIS"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\r\n     * A constant to specify that the bubbles drawn by this renderer should be\r\n     * scaled on the domain axis (see {@link #XYBubbleRenderer(int)}).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SCALE_ON_RANGE_AXIS"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\r\n     * A constant to specify that the bubbles drawn by this renderer should be\r\n     * scaled on the range axis (see {@link #XYBubbleRenderer(int)}).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "scaleType"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Controls how the width and height of the bubble are scaled. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.XYBubbleRenderer()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.XYBubbleRenderer(int)",
      "begin_line": 136,
      "end_line": 143,
      "comment": "\r\n     * Constructs a new renderer with the specified type of scaling.\r\n     *\r\n     * @param scaleType  the type of scaling (must be one of:\r\n     *        {@link #SCALE_ON_BOTH_AXES}, {@link #SCALE_ON_DOMAIN_AXIS},\r\n     *        {@link #SCALE_ON_RANGE_AXIS}).\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 16)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 142,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.getScaleType()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Returns the scale type that was set when the renderer was constructed.\r\n     *\r\n     * @return The scale type (one of: {@link #SCALE_ON_BOTH_AXES},\r\n     *         {@link #SCALE_ON_DOMAIN_AXIS}, {@link #SCALE_ON_RANGE_AXIS}).\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 170,
      "end_line": 273,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain (horizontal) axis.\r\n     * @param rangeAxis  the range (vertical) axis.\r\n     * @param dataset  the dataset (an {@link XYZDataset} is expected).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 60)",
        "(line 183,col 9)-(line 183,col 51)",
        "(line 184,col 9)-(line 184,col 51)",
        "(line 185,col 9)-(line 185,col 30)",
        "(line 186,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.getLegendItem(int, int)",
      "begin_line": 284,
      "end_line": 325,
      "comment": "\r\n     * Returns a legend item for the specified series.  The default method\r\n     * is overridden so that the legend displays circles for all series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 33)",
        "(line 286,col 9)-(line 286,col 32)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 58)",
        "(line 292,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.equals(java.lang.Object)",
      "begin_line": 334,
      "end_line": 346,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 55)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.clone()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 29)"
      ]
    }
  ]
}