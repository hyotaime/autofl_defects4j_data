{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/XYItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYItemRenderer",
      "is_interface": true,
      "parent_types": [
        "org.jfree.chart.LegendItemSource"
      ],
      "begin_line": 126,
      "end_line": 2009,
      "comment": "\r\n * Interface for rendering the visual representation of a single (x, y) item on\r\n * an {@link XYPlot}.\r\n * \u003cp\u003e\r\n * To support cloning charts, it is recommended that renderers implement both\r\n * the {@link Cloneable} and \u003ccode\u003ePublicCloneable\u003c/code\u003e interfaces.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getPlot()",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\r\n     * Returns the plot that this renderer has been assigned to.\r\n     *\r\n     * @return The plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setPlot(org.jfree.chart.plot.XYPlot)",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\r\n     * Sets the plot that this renderer is assigned to.  This method will be\r\n     * called by the plot class...you do not need to call it yourself.\r\n     *\r\n     * @param plot  the plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getPassCount()",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\r\n     * Returns the number of passes through the data required by the renderer.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 158,
      "end_line": 158,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the\r\n     * specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 172,
      "end_line": 172,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the y-values in the\r\n     * specified dataset.  The implementation of this method will take\r\n     * into account the presentation used by the renderers (for example,\r\n     * a renderer that \"stacks\" values will return a bigger range than\r\n     * a renderer that doesn\u0027t).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is\r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 181,
      "end_line": 181,
      "comment": "\r\n     * Add a renderer change listener.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @see #removeChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 190,
      "end_line": 190,
      "comment": "\r\n     * Removes a change listener.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @see #addChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemVisible(int, int)",
      "begin_line": 204,
      "end_line": 204,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item\r\n     * should be drawn (this is typically used to hide an entire series).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.isSeriesVisible(int)",
      "begin_line": 214,
      "end_line": 214,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified series\r\n     * should be drawn (this is typically used to hide an entire series).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesVisible(int)",
      "begin_line": 225,
      "end_line": 225,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisible(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesVisible(int, java.lang.Boolean)",
      "begin_line": 236,
      "end_line": 236,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 249,
      "end_line": 249,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and, if\r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseSeriesVisible()",
      "begin_line": 258,
      "end_line": 258,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseSeriesVisible(boolean)",
      "begin_line": 268,
      "end_line": 268,
      "comment": "\r\n     * Sets the base visibility and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseSeriesVisible(boolean, boolean)",
      "begin_line": 279,
      "end_line": 279,
      "comment": "\r\n     * Sets the base visibility and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.isSeriesVisibleInLegend(int)",
      "begin_line": 291,
      "end_line": 291,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series should be shown in the legend,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesVisibleInLegend(int)",
      "begin_line": 305,
      "end_line": 305,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible in the\r\n     * legend.  This method returns only the \"per series\" settings - to\r\n     * incorporate the override and base settings as well, you need to use the\r\n     * {@link #isSeriesVisibleInLegend(int)} method.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisibleInLegend(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean)",
      "begin_line": 316,
      "end_line": 316,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean, boolean)",
      "begin_line": 329,
      "end_line": 330,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseSeriesVisibleInLegend()",
      "begin_line": 339,
      "end_line": 339,
      "comment": "\r\n     * Returns the base visibility in the legend for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisibleInLegend(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseSeriesVisibleInLegend(boolean)",
      "begin_line": 349,
      "end_line": 349,
      "comment": "\r\n     * Sets the base visibility in the legend and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseSeriesVisibleInLegend(boolean, boolean)",
      "begin_line": 360,
      "end_line": 360,
      "comment": "\r\n     * Sets the base visibility in the legend and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemPaint(int, int, boolean)",
      "begin_line": 376,
      "end_line": 376,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesPaint(int)",
      "begin_line": 387,
      "end_line": 387,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 398,
      "end_line": 398,
      "comment": "\r\n     * Sets the paint used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesPaint(int, java.awt.Paint, boolean)",
      "begin_line": 412,
      "end_line": 412,
      "comment": "\r\n     * Sets the paint for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBasePaint()",
      "begin_line": 421,
      "end_line": 421,
      "comment": "\r\n     * Returns the base paint.\r\n     *\r\n     * @return The base paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBasePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBasePaint(java.awt.Paint)",
      "begin_line": 431,
      "end_line": 431,
      "comment": "\r\n     * Sets the base paint and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBasePaint(java.awt.Paint, boolean)",
      "begin_line": 444,
      "end_line": 444,
      "comment": "\r\n     * Sets the default paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBasePaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemFillPaint(int, int, boolean)",
      "begin_line": 460,
      "end_line": 460,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesFillPaint(int)",
      "begin_line": 473,
      "end_line": 473,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesFillPaint(int, Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesFillPaint(int, java.awt.Paint)",
      "begin_line": 486,
      "end_line": 486,
      "comment": "\r\n     * Sets the fill paint for the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesFillPaint(int, java.awt.Paint, boolean)",
      "begin_line": 500,
      "end_line": 500,
      "comment": "\r\n     * Sets the fill paint for the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseFillPaint()",
      "begin_line": 511,
      "end_line": 511,
      "comment": "\r\n     * Returns the base fill paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseFillPaint(Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseFillPaint(java.awt.Paint)",
      "begin_line": 523,
      "end_line": 523,
      "comment": "\r\n     * Sets the default fill paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseFillPaint(java.awt.Paint, boolean)",
      "begin_line": 536,
      "end_line": 536,
      "comment": "\r\n     * Sets the default fill paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemOutlinePaint(int, int, boolean)",
      "begin_line": 552,
      "end_line": 552,
      "comment": "\r\n     * Returns the paint used to outline data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesOutlinePaint(int)",
      "begin_line": 563,
      "end_line": 563,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 574,
      "end_line": 574,
      "comment": "\r\n     * Sets the paint used for a series outline and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint, boolean)",
      "begin_line": 588,
      "end_line": 588,
      "comment": "\r\n     * Sets the outline paint for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseOutlinePaint()",
      "begin_line": 597,
      "end_line": 597,
      "comment": "\r\n     * Returns the base outline paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlinePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseOutlinePaint(java.awt.Paint)",
      "begin_line": 607,
      "end_line": 607,
      "comment": "\r\n     * Sets the base outline paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseOutlinePaint(java.awt.Paint, boolean)",
      "begin_line": 620,
      "end_line": 620,
      "comment": "\r\n     * Sets the default outline paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemStroke(int, int, boolean)",
      "begin_line": 636,
      "end_line": 636,
      "comment": "\r\n     * Returns the stroke used to draw data items.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesStroke(int)",
      "begin_line": 647,
      "end_line": 647,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesStroke(int, java.awt.Stroke)",
      "begin_line": 658,
      "end_line": 658,
      "comment": "\r\n     * Sets the stroke used for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 672,
      "end_line": 672,
      "comment": "\r\n     * Sets the stroke for the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseStroke()",
      "begin_line": 681,
      "end_line": 681,
      "comment": "\r\n     * Returns the base stroke.\r\n     *\r\n     * @return The base stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseStroke(java.awt.Stroke)",
      "begin_line": 691,
      "end_line": 691,
      "comment": "\r\n     * Sets the base stroke and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseStroke(java.awt.Stroke, boolean)",
      "begin_line": 704,
      "end_line": 704,
      "comment": "\r\n     * Sets the default stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseStroke()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemOutlineStroke(int, int, boolean)",
      "begin_line": 722,
      "end_line": 722,
      "comment": "\r\n     * Returns the stroke used to outline data items.  The default\r\n     * implementation passes control to the lookupSeriesOutlineStroke method.\r\n     * You can override this method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesOutlineStroke(int)",
      "begin_line": 733,
      "end_line": 733,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlineStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 744,
      "end_line": 744,
      "comment": "\r\n     * Sets the outline stroke used for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 758,
      "end_line": 759,
      "comment": "\r\n     * Sets the outline stroke for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseOutlineStroke()",
      "begin_line": 768,
      "end_line": 768,
      "comment": "\r\n     * Returns the base outline stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlineStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseOutlineStroke(java.awt.Stroke)",
      "begin_line": 778,
      "end_line": 778,
      "comment": "\r\n     * Sets the base outline stroke and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseOutlineStroke(java.awt.Stroke, boolean)",
      "begin_line": 791,
      "end_line": 791,
      "comment": "\r\n     * Sets the default outline stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemShape(int, int, boolean)",
      "begin_line": 807,
      "end_line": 807,
      "comment": "\r\n     * Returns a shape used to represent a data item.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesShape(int)",
      "begin_line": 818,
      "end_line": 818,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesShape(int, Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesShape(int, java.awt.Shape)",
      "begin_line": 829,
      "end_line": 829,
      "comment": "\r\n     * Sets the shape used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesShape(int, java.awt.Shape, boolean)",
      "begin_line": 843,
      "end_line": 843,
      "comment": "\r\n     * Sets the shape for the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseShape()",
      "begin_line": 852,
      "end_line": 852,
      "comment": "\r\n     * Returns the base shape.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseShape(Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseShape(java.awt.Shape)",
      "begin_line": 862,
      "end_line": 862,
      "comment": "\r\n     * Sets the base shape and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseShape(java.awt.Shape, boolean)",
      "begin_line": 875,
      "end_line": 875,
      "comment": "\r\n     * Sets the default shape and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseShape()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getLegendItem(int, int)",
      "begin_line": 888,
      "end_line": 888,
      "comment": "\r\n     * Returns a legend item for a series from a dataset.\r\n     *\r\n     * @param datasetIndex  the dataset index.\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 900,
      "end_line": 900,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The legend item label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 908,
      "end_line": 908,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 919,
      "end_line": 919,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(XYSeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 931,
      "end_line": 931,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemToolTipGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 942,
      "end_line": 942,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(XYSeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 954,
      "end_line": 954,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getToolTipGenerator(int, int, boolean)",
      "begin_line": 970,
      "end_line": 971,
      "comment": "\r\n     * Returns the tool tip generator for a data item.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 982,
      "end_line": 982,
      "comment": "\r\n     * Returns the tool tip generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, XYToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 993,
      "end_line": 994,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 1006,
      "end_line": 1007,
      "comment": "\r\n     * Sets the tool tip generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 1016,
      "end_line": 1016,
      "comment": "\r\n     * Returns the base tool tip generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(XYToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 1026,
      "end_line": 1026,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 1039,
      "end_line": 1040,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getURLGenerator(int, int, boolean)",
      "begin_line": 1057,
      "end_line": 1058,
      "comment": "\r\n     * Returns the URL generator for the specified item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 1071,
      "end_line": 1071,
      "comment": "\r\n     * Returns the URL generator for the specified series, if one is defined.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesURLGenerator(int, XYURLGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 1084,
      "end_line": 1084,
      "comment": "\r\n     * Sets the URL generator for the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 1098,
      "end_line": 1099,
      "comment": "\r\n     * Sets the URL generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseURLGenerator()",
      "begin_line": 1110,
      "end_line": 1110,
      "comment": "\r\n     * Returns the default URL generator.\r\n     *\r\n     * @return The default URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseURLGenerator(XYURLGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 1122,
      "end_line": 1122,
      "comment": "\r\n     * Sets the default URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 1135,
      "end_line": 1135,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listener?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.isItemLabelVisible(int, int, boolean)",
      "begin_line": 1152,
      "end_line": 1152,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if an item label is visible, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.isSeriesItemLabelsVisible(int)",
      "begin_line": 1162,
      "end_line": 1162,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the item labels for a series are visible,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesItemLabelsVisible(int)",
      "begin_line": 1176,
      "end_line": 1176,
      "comment": "\r\n     * Returns the flag that controls whether or not item labels are displayed\r\n     * for the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelsVisible(int, Boolean)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelsVisible(int, boolean)",
      "begin_line": 1188,
      "end_line": 1188,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a\r\n     * series and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean)",
      "begin_line": 1198,
      "end_line": 1198,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 1211,
      "end_line": 1212,
      "comment": "\r\n     * Sets the visibility of item labels for a series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the visible flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseItemLabelsVisible()",
      "begin_line": 1221,
      "end_line": 1221,
      "comment": "\r\n     * Returns the base setting for item label visibility.\r\n     *\r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelsVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelsVisible(boolean)",
      "begin_line": 1230,
      "end_line": 1230,
      "comment": "\r\n     * Sets the base flag that controls whether or not item labels are visible.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelsVisible(boolean, boolean)",
      "begin_line": 1242,
      "end_line": 1242,
      "comment": "\r\n     * Sets the base visibility for item labels and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemLabelGenerator(int, int, boolean)",
      "begin_line": 1258,
      "end_line": 1259,
      "comment": "\r\n     * Returns the item label generator for a data item.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 1270,
      "end_line": 1270,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, XYItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 1281,
      "end_line": 1282,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 1296,
      "end_line": 1297,
      "comment": "\r\n     * Sets the item label generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 1306,
      "end_line": 1306,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelGenerator(XYItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 1316,
      "end_line": 1316,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 1329,
      "end_line": 1330,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemLabelFont(int, int, boolean)",
      "begin_line": 1345,
      "end_line": 1345,
      "comment": "\r\n     * Returns the font for an item label.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesItemLabelFont(int)",
      "begin_line": 1354,
      "end_line": 1354,
      "comment": "\r\n     * Returns the font for all the item labels in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelFont(int, java.awt.Font)",
      "begin_line": 1365,
      "end_line": 1365,
      "comment": "\r\n     * Sets the item label font for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelFont(int, java.awt.Font, boolean)",
      "begin_line": 1379,
      "end_line": 1379,
      "comment": "\r\n     * Sets the item label font for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseItemLabelFont()",
      "begin_line": 1389,
      "end_line": 1389,
      "comment": "\r\n     * Returns the base item label font (this is used when no other font\r\n     * setting is available).\r\n     *\r\n     * @return The font (\u003ccode\u003enever\u003c/code\u003e null).\r\n     *\r\n     * @see #setBaseItemLabelFont(Font)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelFont(java.awt.Font)",
      "begin_line": 1399,
      "end_line": 1399,
      "comment": "\r\n     * Sets the base item label font and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelFont(java.awt.Font, boolean)",
      "begin_line": 1410,
      "end_line": 1410,
      "comment": "\r\n     * Sets the default item label font and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemLabelPaint(int, int, boolean)",
      "begin_line": 1426,
      "end_line": 1426,
      "comment": "\r\n     * Returns the paint used to draw an item label.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesItemLabelPaint(int)",
      "begin_line": 1437,
      "end_line": 1437,
      "comment": "\r\n     * Returns the paint used to draw the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint)",
      "begin_line": 1448,
      "end_line": 1448,
      "comment": "\r\n     * Sets the item label paint for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint, boolean)",
      "begin_line": 1462,
      "end_line": 1463,
      "comment": "\r\n     * Sets the item label paint for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseItemLabelPaint()",
      "begin_line": 1470,
      "end_line": 1470,
      "comment": "\r\n     * Returns the base item label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelPaint(java.awt.Paint)",
      "begin_line": 1478,
      "end_line": 1478,
      "comment": "\r\n     * Sets the base item label paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelPaint(java.awt.Paint, boolean)",
      "begin_line": 1489,
      "end_line": 1489,
      "comment": "\r\n     * Sets the base item label paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getPositiveItemLabelPosition(int, int, boolean)",
      "begin_line": 1505,
      "end_line": 1506,
      "comment": "\r\n     * Returns the item label position for positive values.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesPositiveItemLabelPosition(int)",
      "begin_line": 1515,
      "end_line": 1515,
      "comment": "\r\n     * Returns the item label position for all positive values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1524,
      "end_line": 1525,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1536,
      "end_line": 1538,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBasePositiveItemLabelPosition()",
      "begin_line": 1545,
      "end_line": 1545,
      "comment": "\r\n     * Returns the base positive item label position.\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1552,
      "end_line": 1552,
      "comment": "\r\n     * Sets the base positive item label position.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1561,
      "end_line": 1562,
      "comment": "\r\n     * Sets the base positive item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getNegativeItemLabelPosition(int, int, boolean)",
      "begin_line": 1580,
      "end_line": 1581,
      "comment": "\r\n     * Returns the item label position for negative values.  This method can be\r\n     * overridden to provide customisation of the item label position for\r\n     * individual data items.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesNegativeItemLabelPosition(int)",
      "begin_line": 1590,
      "end_line": 1590,
      "comment": "\r\n     * Returns the item label position for all negative values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1599,
      "end_line": 1600,
      "comment": "\r\n     * Sets the item label position for negative values in a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1611,
      "end_line": 1613,
      "comment": "\r\n     * Sets the item label position for negative values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseNegativeItemLabelPosition()",
      "begin_line": 1620,
      "end_line": 1620,
      "comment": "\r\n     * Returns the base item label position for negative values.\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1628,
      "end_line": 1628,
      "comment": "\r\n     * Sets the base item label position for negative values and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1637,
      "end_line": 1638,
      "comment": "\r\n     * Sets the base negative item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemCreateEntity(int, int, boolean)",
      "begin_line": 1655,
      "end_line": 1655,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should create an item entity\r\n     * for the specified data item, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesCreateEntities(int)",
      "begin_line": 1667,
      "end_line": 1667,
      "comment": "\r\n     * Returns a flag that controls whether or not chart entities are\r\n     * generated for the data items in the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean)",
      "begin_line": 1679,
      "end_line": 1679,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean, boolean)",
      "begin_line": 1692,
      "end_line": 1693,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseCreateEntities()",
      "begin_line": 1703,
      "end_line": 1703,
      "comment": "\r\n     * Returns the default flag that controls whether or not chart entities\r\n     * are generated for the data items drawn by this renderer.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseCreateEntities(boolean)",
      "begin_line": 1713,
      "end_line": 1713,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer.\r\n     *\r\n     * @param create  the flag default.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseCreateEntities(boolean, boolean)",
      "begin_line": 1725,
      "end_line": 1725,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param create  the flag default.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getAnnotations()",
      "begin_line": 1739,
      "end_line": 1739,
      "comment": "\r\n     * Returns a collection of the annotations that are assigned to the\r\n     * renderer.\r\n     *\r\n     * @return A collection of annotations (possibly empty but never\r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 1748,
      "end_line": 1748,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 1756,
      "end_line": 1756,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 1768,
      "end_line": 1768,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.removeAnnotations()",
      "begin_line": 1774,
      "end_line": 1774,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1786,
      "end_line": 1791,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1811,
      "end_line": 1815,
      "comment": "\r\n     * Initialises the renderer then returns the number of \u0027passes\u0027 through the\r\n     * data that the renderer will require (usually just one).  This method\r\n     * will be called before the first item is rendered, giving the renderer\r\n     * an opportunity to initialise any state information it wants to maintain.\r\n     * The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param dataset  the dataset.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return The number of passes the renderer requires.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 1836,
      "end_line": 1839,
      "comment": "\r\n     * Called for each item to be plotted.\r\n     * \u003cp\u003e\r\n     * The {@link XYPlot} can make multiple passes through the dataset,\r\n     * depending on the value returned by the renderer\u0027s initialise() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being rendered.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.createHotSpotShape(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.renderer.xy.XYItemRendererState, boolean)",
      "begin_line": 1861,
      "end_line": 1864,
      "comment": "\r\n     * Called for each item to be plotted.\r\n     * \u003cp\u003e\r\n     * The {@link XYPlot} can make multiple passes through the dataset,\r\n     * depending on the value returned by the renderer\u0027s initialise() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area within which the data is being rendered.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param state  the renderer state.\r\n     * @param selected  is the item selected?\r\n     * \r\n     * @return A shape equal to the hot spot for a data item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.createHotSpotBounds(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D)",
      "begin_line": 1886,
      "end_line": 1889,
      "comment": "\r\n     * Returns the rectangular bounds for the hot spot for an item drawn by\r\n     * this renderer.  This is intended to provide a quick test for\r\n     * eliminating data points before more accurate testing against the\r\n     * shape returned by createHotSpotShape().\r\n     * \r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param series\r\n     * @param item\r\n     * @param selected\r\n     * @param state\r\n     * @param result\r\n     * \r\n     * @return\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.hitTest(double, double, java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.renderer.xy.XYItemRendererState, boolean)",
      "begin_line": 1912,
      "end_line": 1915,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified point (xx, yy) in Java2D\r\n     * space falls within the \"hot spot\" for the specified data item, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param xx\r\n     * @param yy\r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param series\r\n     * @param item\r\n     * @param selected\r\n     * \r\n     * @return\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1930,
      "end_line": 1931,
      "comment": "\r\n     * Draws a line perpendicular to the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data.\r\n     * @param value  the data value.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1944,
      "end_line": 1945,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data.\r\n     * @param value  the data value.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1956,
      "end_line": 1957,
      "comment": "\r\n     * Draws the specified \u003ccode\u003emarker\u003c/code\u003e against the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1968,
      "end_line": 1969,
      "comment": "\r\n     * Draws a horizontal line across the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.fillDomainGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1982,
      "end_line": 1983,
      "comment": "\r\n     * Fills a band between two values on the axis.  This can be used to color\r\n     * bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the domain axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.fillRangeGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1996,
      "end_line": 1997,
      "comment": "\r\n     * Fills a band between two values on the range axis.  This can be used to\r\n     * color bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the range axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSelectedItemAttributes()",
      "begin_line": 2006,
      "end_line": 2006,
      "comment": "\r\n     * Returns the selected item attributes.\r\n     *\r\n     * @return The selected item attributes (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    }
  ]
}