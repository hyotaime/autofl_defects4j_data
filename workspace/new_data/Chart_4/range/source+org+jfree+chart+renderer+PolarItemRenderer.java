{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/PolarItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolarItemRenderer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 145,
      "comment": "\r\n * The interface for a renderer that can be used by the {@link PolarPlot} class.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PolarItemRenderer.drawSeries(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.PolarPlot, org.jfree.data.xy.XYDataset, int)",
      "begin_line": 69,
      "end_line": 74,
      "comment": "\r\n     * Plots the data for a given series.\r\n     *\r\n     * @param g2  the drawing surface.\r\n     * @param dataArea  the data area.\r\n     * @param info  collects plot rendering info.\r\n     * @param plot  the plot.\r\n     * @param dataset  the dataset.\r\n     * @param seriesIndex  the series index.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PolarItemRenderer.drawAngularGridLines(java.awt.Graphics2D, org.jfree.chart.plot.PolarPlot, java.util.List, java.awt.geom.Rectangle2D)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\r\n     * Draw the angular gridlines - the spokes.\r\n     *\r\n     * @param g2  the drawing surface.\r\n     * @param plot  the plot.\r\n     * @param ticks  the ticks.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PolarItemRenderer.drawRadialGridLines(java.awt.Graphics2D, org.jfree.chart.plot.PolarPlot, org.jfree.chart.axis.ValueAxis, java.util.List, java.awt.geom.Rectangle2D)",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\r\n     * Draw the radial gridlines - the rings.\r\n     *\r\n     * @param g2  the drawing surface.\r\n     * @param plot  the plot.\r\n     * @param radialAxis  the radial axis.\r\n     * @param ticks  the ticks.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PolarItemRenderer.getLegendItem(int)",
      "begin_line": 111,
      "end_line": 111,
      "comment": "\r\n     * Return the legend for the given series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The legend item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PolarItemRenderer.getPlot()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\r\n     * Returns the plot that this renderer has been assigned to.\r\n     *\r\n     * @return The plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PolarItemRenderer.setPlot(org.jfree.chart.plot.PolarPlot)",
      "begin_line": 128,
      "end_line": 128,
      "comment": "\r\n     * Sets the plot that this renderer is assigned to.\r\n     * \u003cP\u003e\r\n     * This method will be called by the plot class...you do not need to call\r\n     * it yourself.\r\n     *\r\n     * @param plot  the plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PolarItemRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 135,
      "end_line": 135,
      "comment": "\r\n     * Adds a change listener.\r\n     *\r\n     * @param listener  the listener.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PolarItemRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 142,
      "end_line": 142,
      "comment": "\r\n     * Removes a change listener.\r\n     *\r\n     * @param listener  the listener.\r\n     ",
      "child_ranges": []
    }
  ]
}