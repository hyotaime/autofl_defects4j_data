{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/Pannable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pannable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 97,
      "comment": "\n * An interface that the {@link ChartPanel} class uses to communicate with\n * plots that support panning.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Pannable.getOrientation()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Returns the orientation of the plot.\n     *\n     * @return The orientation (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Pannable.isDomainPannable()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Evaluates if the domain axis can be panned.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the domain axis is pannable.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Pannable.isRangePannable()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Evaluates if the range axis can be panned.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the range axis is pannable.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Pannable.panDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 84,
      "end_line": 85,
      "comment": "\n     * Pans the domain axes by the specified percentage.\n     *\n     * @param percent  the distance to pan (as a percentage of the axis length).\n     * @param info the plot info\n     * @param source the source point where the pan action started.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Pannable.panRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 94,
      "end_line": 95,
      "comment": "\n     * Pans the range axes by the specified percentage.\n     *\n     * @param percent  the distance to pan (as a percentage of the axis length).\n     * @param info the plot info\n     * @param source the source point where the pan action started.\n     ",
      "child_ranges": []
    }
  ]
}