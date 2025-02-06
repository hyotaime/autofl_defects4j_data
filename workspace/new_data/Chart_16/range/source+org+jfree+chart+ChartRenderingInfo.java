{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ChartRenderingInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartRenderingInfo",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 79,
      "end_line": 256,
      "comment": "\r\n * A structure for storing rendering information from one call to the\r\n * JFreeChart.draw() method.\r\n * \u003cP\u003e\r\n * An instance of the {@link JFreeChart} class can draw itself within an \r\n * arbitrary rectangle on any \u003ccode\u003eGraphics2D\u003c/code\u003e.  It is assumed that \r\n * client code will sometimes render the same chart in more than one view, so \r\n * the {@link JFreeChart} instance does not retain any information about its \r\n * rendered dimensions.  This information can be useful sometimes, so you have \r\n * the option to collect the information at each call to \r\n * \u003ccode\u003eJFreeChart.draw()\u003c/code\u003e, by passing an instance of this\r\n * \u003ccode\u003eChartRenderingInfo\u003c/code\u003e class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "chartArea"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The area in which the chart is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "plotInfo"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Rendering info for the chart\u0027s plot (and subplots, if any). "
    },
    {
      "type": "field",
      "varNames": [
        "entities"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " \r\n     * Storage for the chart entities.  Since retaining entity information for \r\n     * charts with a large number of data points consumes a lot of memory, it \r\n     * is intended that you can set this to \u003ccode\u003enull\u003c/code\u003e to prevent the \r\n     * information being collected.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartRenderingInfo.ChartRenderingInfo()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Constructs a new ChartRenderingInfo structure that can be used to \r\n     * collect information about the dimensions of a rendered chart.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartRenderingInfo.ChartRenderingInfo(org.jfree.chart.entity.EntityCollection)",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\r\n     * Constructs a new instance. If an entity collection is supplied, it will \r\n     * be populated with information about the entities in a chart.  If it is \r\n     * \u003ccode\u003enull\u003c/code\u003e, no entity information (including tool tips) will\r\n     * be collected.\r\n     *\r\n     * @param entities  an entity collection (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 50)",
        "(line 116,col 9)-(line 116,col 52)",
        "(line 117,col 9)-(line 117,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.getChartArea()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns the area in which the chart was drawn.\r\n     *\r\n     * @return The area in which the chart was drawn.\r\n     * \r\n     * @see #setChartArea(Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.setChartArea(java.awt.geom.Rectangle2D)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Sets the area in which the chart was drawn.\r\n     *\r\n     * @param area  the chart area.\r\n     * \r\n     * @see #getChartArea()\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.getEntityCollection()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the collection of entities maintained by this instance.\r\n     *\r\n     * @return The entity collection (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setEntityCollection(EntityCollection)\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.setEntityCollection(org.jfree.chart.entity.EntityCollection)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Sets the entity collection.\r\n     *\r\n     * @param entities  the entity collection (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getEntityCollection()\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.clear()",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\r\n     * Clears the information recorded by this object.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 51)",
        "(line 169,col 9)-(line 169,col 52)",
        "(line 170,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.getPlotInfo()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns the rendering info for the chart\u0027s plot.\r\n     * \r\n     * @return The rendering info for the plot.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.equals(java.lang.Object)",
      "begin_line": 191,
      "end_line": 209,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 59)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.clone()",
      "begin_line": 218,
      "end_line": 228,
      "comment": "\r\n     * Returns a clone of this object.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the object cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 70)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)",
        "(line 239,col 9)-(line 239,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.readObject(java.io.ObjectInputStream)",
      "begin_line": 250,
      "end_line": 254,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 73)"
      ]
    }
  ]
}