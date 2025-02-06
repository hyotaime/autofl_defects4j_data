{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/Zoomable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Zoomable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 180,
      "comment": "\r\n * A plot that is zoomable must implement this interface to provide a\r\n * mechanism for the {@link ChartPanel} to control the zooming.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.isDomainZoomable()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the plot\u0027s domain is zoomable, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #isRangeZoomable()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.isRangeZoomable()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the plot\u0027s range is zoomable, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #isDomainZoomable()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.getOrientation()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     * \r\n     * @return The orientation.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 98,
      "end_line": 99,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     * The \u003ccode\u003esource\u003c/code\u003e point can be used in some cases to identify a \r\n     * subplot, or to determine the center of zooming (refer to the \r\n     * documentation of the implementing class for details).\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 116,
      "end_line": 117,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     * The \u003ccode\u003esource\u003c/code\u003e point can be used in some cases to identify a \r\n     * subplot, or to determine the center of zooming (refer to the \r\n     * documentation of the implementing class for details).\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 130,
      "end_line": 131,
      "comment": "\r\n     * Zooms in on the domain axes.  The \u003ccode\u003esource\u003c/code\u003e point can be used \r\n     * in some cases to identify a subplot for zooming.\r\n     * \r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * \r\n     * @see #zoomRangeAxes(double, double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 145,
      "end_line": 146,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     * The \u003ccode\u003esource\u003c/code\u003e point can be used in some cases to identify a \r\n     * subplot, or to determine the center of zooming (refer to the \r\n     * documentation of the implementing class for details).\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 163,
      "end_line": 164,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     * The \u003ccode\u003esource\u003c/code\u003e point can be used in some cases to identify a \r\n     * subplot, or to determine the center of zooming (refer to the \r\n     * documentation of the implementing class for details).\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Zoomable.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 177,
      "end_line": 178,
      "comment": "\r\n     * Zooms in on the range axes.  The \u003ccode\u003esource\u003c/code\u003e point can be used \r\n     * in some cases to identify a subplot for zooming.\r\n     * \r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * \r\n     * @see #zoomDomainAxes(double, double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": []
    }
  ]
}