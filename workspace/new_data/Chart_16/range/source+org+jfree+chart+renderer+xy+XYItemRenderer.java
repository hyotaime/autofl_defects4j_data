{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/XYItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYItemRenderer",
      "is_interface": true,
      "parent_types": [
        "org.jfree.chart.LegendItemSource"
      ],
      "begin_line": 125,
      "end_line": 1887,
      "comment": "\r\n * Interface for rendering the visual representation of a single (x, y) item on\r\n * an {@link XYPlot}.\r\n * \u003cp\u003e\r\n * To support cloning charts, it is recommended that renderers implement both \r\n * the {@link Cloneable} and \u003ccode\u003ePublicCloneable\u003c/code\u003e interfaces.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getPlot()",
      "begin_line": 132,
      "end_line": 132,
      "comment": "\r\n     * Returns the plot that this renderer has been assigned to.\r\n     *\r\n     * @return The plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setPlot(org.jfree.chart.plot.XYPlot)",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\r\n     * Sets the plot that this renderer is assigned to.  This method will be \r\n     * called by the plot class...you do not need to call it yourself.\r\n     *\r\n     * @param plot  the plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getPassCount()",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\r\n     * Returns the number of passes through the data required by the renderer.\r\n     * \r\n     * @return The pass count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 157,
      "end_line": 157,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the \r\n     * specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 171,
      "end_line": 171,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the y-values in the\r\n     * specified dataset.  The implementation of this method will take \r\n     * into account the presentation used by the renderers (for example,\r\n     * a renderer that \"stacks\" values will return a bigger range than\r\n     * a renderer that doesn\u0027t.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is \r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 180,
      "end_line": 180,
      "comment": "\r\n     * Add a renderer change listener.\r\n     * \r\n     * @param listener  the listener.\r\n     * \r\n     * @see #removeChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 189,
      "end_line": 189,
      "comment": "\r\n     * Removes a change listener.\r\n     * \r\n     * @param listener  the listener.\r\n     * \r\n     * @see #addChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemVisible(int, int)",
      "begin_line": 203,
      "end_line": 203,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item \r\n     * should be drawn (this is typically used to hide an entire series).\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.isSeriesVisible(int)",
      "begin_line": 213,
      "end_line": 213,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified series \r\n     * should be drawn (this is typically used to hide an entire series).\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesVisible(int)",
      "begin_line": 224,
      "end_line": 224,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesVisible(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesVisible(int, java.lang.Boolean)",
      "begin_line": 235,
      "end_line": 235,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 248,
      "end_line": 248,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and, if \r\n     * requested, sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseSeriesVisible()",
      "begin_line": 257,
      "end_line": 257,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     * \r\n     * @see #setBaseSeriesVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseSeriesVisible(boolean)",
      "begin_line": 267,
      "end_line": 267,
      "comment": "\r\n     * Sets the base visibility and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseSeriesVisible(boolean, boolean)",
      "begin_line": 278,
      "end_line": 278,
      "comment": "\r\n     * Sets the base visibility and, if requested, sends \r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.isSeriesVisibleInLegend(int)",
      "begin_line": 291,
      "end_line": 291,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series should be shown in the legend,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesVisibleInLegend(int)",
      "begin_line": 305,
      "end_line": 305,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible in the \r\n     * legend.  This method returns only the \"per series\" settings - to \r\n     * incorporate the override and base settings as well, you need to use the \r\n     * {@link #isSeriesVisibleInLegend(int)} method.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesVisibleInLegend(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean)",
      "begin_line": 316,
      "end_line": 316,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend \r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean, boolean)",
      "begin_line": 329,
      "end_line": 330,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseSeriesVisibleInLegend()",
      "begin_line": 339,
      "end_line": 339,
      "comment": "\r\n     * Returns the base visibility in the legend for all series.\r\n     *\r\n     * @return The base visibility.\r\n     * \r\n     * @see #setBaseSeriesVisibleInLegend(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseSeriesVisibleInLegend(boolean)",
      "begin_line": 349,
      "end_line": 349,
      "comment": "\r\n     * Sets the base visibility in the legend and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseSeriesVisibleInLegend(boolean, boolean)",
      "begin_line": 360,
      "end_line": 360,
      "comment": "\r\n     * Sets the base visibility in the legend and, if requested, sends \r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemPaint(int, int)",
      "begin_line": 373,
      "end_line": 373,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesPaint(int)",
      "begin_line": 384,
      "end_line": 384,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 395,
      "end_line": 395,
      "comment": "\r\n     * Sets the paint used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesPaint(int, java.awt.Paint, boolean)",
      "begin_line": 409,
      "end_line": 409,
      "comment": "\r\n     * Sets the paint for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBasePaint()",
      "begin_line": 418,
      "end_line": 418,
      "comment": "\r\n     * Returns the base paint.\r\n     *\r\n     * @return The base paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBasePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBasePaint(java.awt.Paint)",
      "begin_line": 428,
      "end_line": 428,
      "comment": "\r\n     * Sets the base paint and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBasePaint(java.awt.Paint, boolean)",
      "begin_line": 441,
      "end_line": 441,
      "comment": "\r\n     * Sets the default paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBasePaint()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemFillPaint(int, int)",
      "begin_line": 456,
      "end_line": 456,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesFillPaint(int)",
      "begin_line": 469,
      "end_line": 469,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesFillPaint(int, Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesFillPaint(int, java.awt.Paint)",
      "begin_line": 482,
      "end_line": 482,
      "comment": "\r\n     * Sets the fill paint for the specified series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesFillPaint(int, java.awt.Paint, boolean)",
      "begin_line": 496,
      "end_line": 496,
      "comment": "\r\n     * Sets the fill paint for the specified series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseFillPaint()",
      "begin_line": 507,
      "end_line": 507,
      "comment": "\r\n     * Returns the base fill paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseFillPaint(Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseFillPaint(java.awt.Paint)",
      "begin_line": 519,
      "end_line": 519,
      "comment": "\r\n     * Sets the default fill paint and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseFillPaint(java.awt.Paint, boolean)",
      "begin_line": 532,
      "end_line": 532,
      "comment": "\r\n     * Sets the default fill paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemOutlinePaint(int, int)",
      "begin_line": 545,
      "end_line": 545,
      "comment": "\r\n     * Returns the paint used to outline data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesOutlinePaint(int)",
      "begin_line": 556,
      "end_line": 556,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 567,
      "end_line": 567,
      "comment": "\r\n     * Sets the paint used for a series outline and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint, boolean)",
      "begin_line": 581,
      "end_line": 581,
      "comment": "\r\n     * Sets the outline paint for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesOutlinePaint(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseOutlinePaint()",
      "begin_line": 590,
      "end_line": 590,
      "comment": "\r\n     * Returns the base outline paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseOutlinePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseOutlinePaint(java.awt.Paint)",
      "begin_line": 600,
      "end_line": 600,
      "comment": "\r\n     * Sets the base outline paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseOutlinePaint(java.awt.Paint, boolean)",
      "begin_line": 613,
      "end_line": 613,
      "comment": "\r\n     * Sets the default outline paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseOutlinePaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemStroke(int, int)",
      "begin_line": 626,
      "end_line": 626,
      "comment": "\r\n     * Returns the stroke used to draw data items.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesStroke(int)",
      "begin_line": 637,
      "end_line": 637,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesStroke(int, java.awt.Stroke)",
      "begin_line": 648,
      "end_line": 648,
      "comment": "\r\n     * Sets the stroke used for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 662,
      "end_line": 662,
      "comment": "\r\n     * Sets the stroke for the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesStroke(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseStroke()",
      "begin_line": 671,
      "end_line": 671,
      "comment": "\r\n     * Returns the base stroke.\r\n     *\r\n     * @return The base stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseStroke(java.awt.Stroke)",
      "begin_line": 681,
      "end_line": 681,
      "comment": "\r\n     * Sets the base stroke and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseStroke(java.awt.Stroke, boolean)",
      "begin_line": 694,
      "end_line": 694,
      "comment": "\r\n     * Sets the default stroke and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseStroke()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemOutlineStroke(int, int)",
      "begin_line": 709,
      "end_line": 709,
      "comment": "\r\n     * Returns the stroke used to outline data items.  The default \r\n     * implementation passes control to the lookupSeriesOutlineStroke method.\r\n     * You can override this method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesOutlineStroke(int)",
      "begin_line": 720,
      "end_line": 720,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesOutlineStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 731,
      "end_line": 731,
      "comment": "\r\n     * Sets the outline stroke used for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 745,
      "end_line": 746,
      "comment": "\r\n     * Sets the outline stroke for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesOutlineStroke(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseOutlineStroke()",
      "begin_line": 755,
      "end_line": 755,
      "comment": "\r\n     * Returns the base outline stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseOutlineStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseOutlineStroke(java.awt.Stroke)",
      "begin_line": 765,
      "end_line": 765,
      "comment": "\r\n     * Sets the base outline stroke and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseOutlineStroke(java.awt.Stroke, boolean)",
      "begin_line": 778,
      "end_line": 778,
      "comment": "\r\n     * Sets the default outline stroke and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseOutlineStroke()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemShape(int, int)",
      "begin_line": 791,
      "end_line": 791,
      "comment": "\r\n     * Returns a shape used to represent a data item.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesShape(int)",
      "begin_line": 802,
      "end_line": 802,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesShape(int, Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesShape(int, java.awt.Shape)",
      "begin_line": 813,
      "end_line": 813,
      "comment": "\r\n     * Sets the shape used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesShape(int, java.awt.Shape, boolean)",
      "begin_line": 827,
      "end_line": 827,
      "comment": "\r\n     * Sets the shape for the specified series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesShape(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseShape()",
      "begin_line": 836,
      "end_line": 836,
      "comment": "\r\n     * Returns the base shape.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseShape(Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseShape(java.awt.Shape)",
      "begin_line": 846,
      "end_line": 846,
      "comment": "\r\n     * Sets the base shape and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseShape(java.awt.Shape, boolean)",
      "begin_line": 859,
      "end_line": 859,
      "comment": "\r\n     * Sets the default shape and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *  \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseShape()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getLegendItem(int, int)",
      "begin_line": 872,
      "end_line": 872,
      "comment": "\r\n     * Returns a legend item for a series from a dataset.\r\n     *\r\n     * @param datasetIndex  the dataset index.\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 884,
      "end_line": 884,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     * \r\n     * @return The legend item label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendItemLabelGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 892,
      "end_line": 892,
      "comment": "\r\n     * Sets the legend item label generator and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 903,
      "end_line": 903,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(XYSeriesLabelGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 915,
      "end_line": 915,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemToolTipGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 926,
      "end_line": 926,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(XYSeriesLabelGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 938,
      "end_line": 938,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getToolTipGenerator(int, int)",
      "begin_line": 951,
      "end_line": 951,
      "comment": "\r\n     * Returns the tool tip generator for a data item.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 962,
      "end_line": 962,
      "comment": "\r\n     * Returns the tool tip generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesToolTipGenerator(int, XYToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 973,
      "end_line": 974,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 986,
      "end_line": 987,
      "comment": "\r\n     * Sets the tool tip generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 996,
      "end_line": 996,
      "comment": "\r\n     * Returns the base tool tip generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseToolTipGenerator(XYToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 1006,
      "end_line": 1006,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 1019,
      "end_line": 1020,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseToolTipGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getURLGenerator(int, int)",
      "begin_line": 1036,
      "end_line": 1036,
      "comment": "\r\n     * Returns the URL generator for the specified item.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 1049,
      "end_line": 1049,
      "comment": "\r\n     * Returns the URL generator for the specified series, if one is defined.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesURLGenerator(int, XYURLGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 1062,
      "end_line": 1062,
      "comment": "\r\n     * Sets the URL generator for the specified series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * \r\n     * @see #getSeriesURLGenerator(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 1076,
      "end_line": 1077,
      "comment": "\r\n     * Sets the URL generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesURLGenerator(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseURLGenerator()",
      "begin_line": 1088,
      "end_line": 1088,
      "comment": "\r\n     * Returns the default URL generator.\r\n     * \r\n     * @return The default URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseURLGenerator(XYURLGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 1100,
      "end_line": 1100,
      "comment": "\r\n     * Sets the default URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 1113,
      "end_line": 1113,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listener?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.isItemLabelVisible(int, int)",
      "begin_line": 1127,
      "end_line": 1127,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if an item label is visible, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.isSeriesItemLabelsVisible(int)",
      "begin_line": 1137,
      "end_line": 1137,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the item labels for a series are visible,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesItemLabelsVisible(int)",
      "begin_line": 1151,
      "end_line": 1151,
      "comment": "\r\n     * Returns the flag that controls whether or not item labels are displayed\r\n     * for the specified series.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelsVisible(int, Boolean)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelsVisible(int, boolean)",
      "begin_line": 1163,
      "end_line": 1163,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a \r\n     * series and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean)",
      "begin_line": 1173,
      "end_line": 1173,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 1186,
      "end_line": 1187,
      "comment": "\r\n     * Sets the visibility of item labels for a series and, if requested, \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the visible flag.\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseItemLabelsVisible()",
      "begin_line": 1196,
      "end_line": 1196,
      "comment": "\r\n     * Returns the base setting for item label visibility.\r\n     * \r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseItemLabelsVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelsVisible(boolean)",
      "begin_line": 1205,
      "end_line": 1205,
      "comment": "\r\n     * Sets the base flag that controls whether or not item labels are visible.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelsVisible(boolean, boolean)",
      "begin_line": 1217,
      "end_line": 1217,
      "comment": "\r\n     * Sets the base visibility for item labels and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the visibility flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *                \r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemLabelGenerator(int, int)",
      "begin_line": 1230,
      "end_line": 1230,
      "comment": "\r\n     * Returns the item label generator for a data item.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 1241,
      "end_line": 1241,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelGenerator(int, XYItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 1252,
      "end_line": 1253,
      "comment": "\r\n     * Sets the item label generator for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 1267,
      "end_line": 1268,
      "comment": "\r\n     * Sets the item label generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 1277,
      "end_line": 1277,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseItemLabelGenerator(XYItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 1287,
      "end_line": 1287,
      "comment": "\r\n     * Sets the base item label generator and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 1300,
      "end_line": 1301,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseItemLabelGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemLabelFont(int, int)",
      "begin_line": 1314,
      "end_line": 1314,
      "comment": "\r\n     * Returns the font for an item label.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesItemLabelFont(int)",
      "begin_line": 1323,
      "end_line": 1323,
      "comment": "\r\n     * Returns the font for all the item labels in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelFont(int, java.awt.Font)",
      "begin_line": 1334,
      "end_line": 1334,
      "comment": "\r\n     * Sets the item label font for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.  \r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelFont(int, java.awt.Font, boolean)",
      "begin_line": 1348,
      "end_line": 1348,
      "comment": "\r\n     * Sets the item label font for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesItemLabelFont(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseItemLabelFont()",
      "begin_line": 1358,
      "end_line": 1358,
      "comment": "\r\n     * Returns the base item label font (this is used when no other font \r\n     * setting is available).\r\n     * \r\n     * @return The font (\u003ccode\u003enever\u003c/code\u003e null).\r\n     * \r\n     * @see #setBaseItemLabelFont(Font)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelFont(java.awt.Font)",
      "begin_line": 1368,
      "end_line": 1368,
      "comment": "\r\n     * Sets the base item label font and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.  \r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelFont(java.awt.Font, boolean)",
      "begin_line": 1379,
      "end_line": 1379,
      "comment": "\r\n     * Sets the default item label font and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemLabelPaint(int, int)",
      "begin_line": 1392,
      "end_line": 1392,
      "comment": "\r\n     * Returns the paint used to draw an item label.\r\n     * \r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesItemLabelPaint(int)",
      "begin_line": 1403,
      "end_line": 1403,
      "comment": "\r\n     * Returns the paint used to draw the item labels for a series.\r\n     * \r\n     * @param series  the series index (zero based).\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint)",
      "begin_line": 1414,
      "end_line": 1414,
      "comment": "\r\n     * Sets the item label paint for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series (zero based index).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint, boolean)",
      "begin_line": 1428,
      "end_line": 1429,
      "comment": "\r\n     * Sets the item label paint for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesItemLabelPaint(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseItemLabelPaint()",
      "begin_line": 1436,
      "end_line": 1436,
      "comment": "\r\n     * Returns the base item label paint.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelPaint(java.awt.Paint)",
      "begin_line": 1444,
      "end_line": 1444,
      "comment": "\r\n     * Sets the base item label paint and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseItemLabelPaint(java.awt.Paint, boolean)",
      "begin_line": 1455,
      "end_line": 1455,
      "comment": "\r\n     * Sets the base item label paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getPositiveItemLabelPosition(int, int)",
      "begin_line": 1468,
      "end_line": 1468,
      "comment": "\r\n     * Returns the item label position for positive values.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesPositiveItemLabelPosition(int)",
      "begin_line": 1477,
      "end_line": 1477,
      "comment": "\r\n     * Returns the item label position for all positive values in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1486,
      "end_line": 1487,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1498,
      "end_line": 1500,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBasePositiveItemLabelPosition()",
      "begin_line": 1507,
      "end_line": 1507,
      "comment": "\r\n     * Returns the base positive item label position.\r\n     * \r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1514,
      "end_line": 1514,
      "comment": "\r\n     * Sets the base positive item label position.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1523,
      "end_line": 1524,
      "comment": "\r\n     * Sets the base positive item label position and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getNegativeItemLabelPosition(int, int)",
      "begin_line": 1539,
      "end_line": 1539,
      "comment": "\r\n     * Returns the item label position for negative values.  This method can be\r\n     * overridden to provide customisation of the item label position for \r\n     * individual data items.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesNegativeItemLabelPosition(int)",
      "begin_line": 1548,
      "end_line": 1548,
      "comment": "\r\n     * Returns the item label position for all negative values in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1557,
      "end_line": 1558,
      "comment": "\r\n     * Sets the item label position for negative values in a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1569,
      "end_line": 1571,
      "comment": "\r\n     * Sets the item label position for negative values in a series and (if \r\n     * requested) sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseNegativeItemLabelPosition()",
      "begin_line": 1578,
      "end_line": 1578,
      "comment": "\r\n     * Returns the base item label position for negative values.\r\n     * \r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1586,
      "end_line": 1586,
      "comment": "\r\n     * Sets the base item label position for negative values and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1595,
      "end_line": 1596,
      "comment": "\r\n     * Sets the base negative item label position and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getItemCreateEntity(int, int)",
      "begin_line": 1612,
      "end_line": 1612,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should create an item entity\r\n     * for the specified data item, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getSeriesCreateEntities(int)",
      "begin_line": 1624,
      "end_line": 1624,
      "comment": "\r\n     * Returns a flag that controls whether or not chart entities are \r\n     * generated for the data items in the specified series.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean)",
      "begin_line": 1636,
      "end_line": 1636,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean, boolean)",
      "begin_line": 1649,
      "end_line": 1650,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.getBaseCreateEntities()",
      "begin_line": 1660,
      "end_line": 1660,
      "comment": "\r\n     * Returns the default flag that controls whether or not chart entities\r\n     * are generated for the data items drawn by this renderer.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseCreateEntities(boolean)",
      "begin_line": 1670,
      "end_line": 1670,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer.\r\n     * \r\n     * @param create  the flag default.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.setBaseCreateEntities(boolean, boolean)",
      "begin_line": 1682,
      "end_line": 1682,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param create  the flag default.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 1694,
      "end_line": 1694,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     * \r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 1702,
      "end_line": 1702,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     * \r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 1714,
      "end_line": 1714,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                    permitted).\r\n     * \r\n     * @return A boolean to indicate whether or not the annotation was \r\n     *         successfully removed.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.removeAnnotations()",
      "begin_line": 1720,
      "end_line": 1720,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1732,
      "end_line": 1737,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1757,
      "end_line": 1761,
      "comment": "\r\n     * Initialises the renderer then returns the number of \u0027passes\u0027 through the\r\n     * data that the renderer will require (usually just one).  This method \r\n     * will be called before the first item is rendered, giving the renderer \r\n     * an opportunity to initialise any state information it wants to maintain.\r\n     * The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param dataset  the dataset.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return The number of passes the renderer requires.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 1784,
      "end_line": 1795,
      "comment": "\r\n     * Called for each item to be plotted.\r\n     * \u003cp\u003e\r\n     * The {@link XYPlot} can make multiple passes through the dataset, \r\n     * depending on the value returned by the renderer\u0027s initialise() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being rendered.\r\n     * @param info  collects drawing info.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.fillDomainGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1809,
      "end_line": 1813,
      "comment": "\r\n     * Fills a band between two values on the axis.  This can be used to color \r\n     * bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the domain axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.fillRangeGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1826,
      "end_line": 1830,
      "comment": "\r\n     * Fills a band between two values on the range axis.  This can be used to \r\n     * color bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the range axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1845,
      "end_line": 1846,
      "comment": "\r\n     * Draws a line perpendicular to the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data.\r\n     * @param value  the data value.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1859,
      "end_line": 1860,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data.\r\n     * @param value  the data value.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1871,
      "end_line": 1872,
      "comment": "\r\n     * Draws the specified \u003ccode\u003emarker\u003c/code\u003e against the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1883,
      "end_line": 1884,
      "comment": "\r\n     * Draws a horizontal line across the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": []
    }
  ]
}