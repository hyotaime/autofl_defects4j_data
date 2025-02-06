{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/CategoryItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryItemRenderer",
      "is_interface": true,
      "parent_types": [
        "org.jfree.chart.LegendItemSource"
      ],
      "begin_line": 149,
      "end_line": 1992,
      "comment": "\r\n * A plug-in object that is used by the {@link CategoryPlot} class to display\r\n * individual data items from a {@link CategoryDataset}.\r\n * \u003cp\u003e\r\n * This interface defines the methods that must be provided by all renderers.\r\n * If you are implementing a custom renderer, you should consider extending the\r\n * {@link AbstractCategoryItemRenderer} class.\r\n * \u003cp\u003e\r\n * Most renderer attributes are defined using a \"per-series\" approach with\r\n * a base (default) value to cover cases where no per-series value is\r\n * defined.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPlot()",
      "begin_line": 160,
      "end_line": 160,
      "comment": "\r\n     * Returns the plot that the renderer has been assigned to (where\r\n     * \u003ccode\u003enull\u003c/code\u003e indicates that the renderer is not currently assigned\r\n     * to a plot).\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlot(CategoryPlot)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setPlot(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 171,
      "end_line": 171,
      "comment": "\r\n     * Sets the plot that the renderer has been assigned to.  This method is\r\n     * usually called by the {@link CategoryPlot}, in normal usage you\r\n     * shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPassCount()",
      "begin_line": 181,
      "end_line": 181,
      "comment": "\r\n     * Returns the number of passes through the dataset required by the\r\n     * renderer.  Usually this will be one, but some renderers may use\r\n     * a second or third pass to overlay items on top of things that were\r\n     * drawn in an earlier pass.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 192,
      "end_line": 192,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is\r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 201,
      "end_line": 201,
      "comment": "\r\n     * Adds a change listener.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @see #removeChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 210,
      "end_line": 210,
      "comment": "\r\n     * Removes a change listener.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @see #addChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemVisible(int, int)",
      "begin_line": 223,
      "end_line": 223,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item\r\n     * should be drawn (this is typically used to hide an entire series).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesVisible(int)",
      "begin_line": 233,
      "end_line": 233,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified series\r\n     * should be drawn (this is typically used to hide an entire series).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesVisible(int)",
      "begin_line": 244,
      "end_line": 244,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisible(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisible(int, java.lang.Boolean)",
      "begin_line": 255,
      "end_line": 255,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 268,
      "end_line": 268,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and, if\r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseSeriesVisible()",
      "begin_line": 277,
      "end_line": 277,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisible(boolean)",
      "begin_line": 287,
      "end_line": 287,
      "comment": "\r\n     * Sets the base visibility and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisible(boolean, boolean)",
      "begin_line": 298,
      "end_line": 298,
      "comment": "\r\n     * Sets the base visibility and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesVisibleInLegend(int)",
      "begin_line": 311,
      "end_line": 311,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series should be shown in the legend,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesVisibleInLegend(int)",
      "begin_line": 325,
      "end_line": 325,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible in the\r\n     * legend.  This method returns only the \"per series\" settings - to\r\n     * do a lookup that falls back to the default value, you need to use the\r\n     * {@link #isSeriesVisibleInLegend(int)} method.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisibleInLegend(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean)",
      "begin_line": 336,
      "end_line": 336,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean, boolean)",
      "begin_line": 349,
      "end_line": 350,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseSeriesVisibleInLegend()",
      "begin_line": 359,
      "end_line": 359,
      "comment": "\r\n     * Returns the base visibility in the legend for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisibleInLegend(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisibleInLegend(boolean)",
      "begin_line": 369,
      "end_line": 369,
      "comment": "\r\n     * Sets the base visibility in the legend and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisibleInLegend(boolean, boolean)",
      "begin_line": 380,
      "end_line": 380,
      "comment": "\r\n     * Sets the base visibility in the legend and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemPaint(int, int, boolean)",
      "begin_line": 396,
      "end_line": 396,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesPaint(int)",
      "begin_line": 407,
      "end_line": 407,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 418,
      "end_line": 418,
      "comment": "\r\n     * Sets the paint used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPaint(int, java.awt.Paint, boolean)",
      "begin_line": 430,
      "end_line": 430,
      "comment": "\r\n     * Sets the paint used for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBasePaint()",
      "begin_line": 439,
      "end_line": 439,
      "comment": "\r\n     * Returns the base paint.\r\n     *\r\n     * @return The base paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBasePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePaint(java.awt.Paint)",
      "begin_line": 449,
      "end_line": 449,
      "comment": "\r\n     * Sets the base paint and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePaint(java.awt.Paint, boolean)",
      "begin_line": 460,
      "end_line": 460,
      "comment": "\r\n     * Sets the base paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemFillPaint(int, int, boolean)",
      "begin_line": 476,
      "end_line": 476,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesFillPaint(int)",
      "begin_line": 489,
      "end_line": 489,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesFillPaint(int, Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesFillPaint(int, java.awt.Paint)",
      "begin_line": 502,
      "end_line": 502,
      "comment": "\r\n     * Sets the fill paint for the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesFillPaint(int, java.awt.Paint, boolean)",
      "begin_line": 516,
      "end_line": 516,
      "comment": "\r\n     * Sets the fill paint for the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseFillPaint()",
      "begin_line": 527,
      "end_line": 527,
      "comment": "\r\n     * Returns the base fill paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseFillPaint(Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseFillPaint(java.awt.Paint)",
      "begin_line": 539,
      "end_line": 539,
      "comment": "\r\n     * Sets the default fill paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseFillPaint(java.awt.Paint, boolean)",
      "begin_line": 552,
      "end_line": 552,
      "comment": "\r\n     * Sets the default fill paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemOutlinePaint(int, int, boolean)",
      "begin_line": 568,
      "end_line": 568,
      "comment": "\r\n     * Returns the paint used to outline data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesOutlinePaint(int)",
      "begin_line": 579,
      "end_line": 579,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 590,
      "end_line": 590,
      "comment": "\r\n     * Sets the paint used for a series outline and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint, boolean)",
      "begin_line": 604,
      "end_line": 604,
      "comment": "\r\n     * Sets the paint used for a series outline and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseOutlinePaint()",
      "begin_line": 613,
      "end_line": 613,
      "comment": "\r\n     * Returns the base outline paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlinePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlinePaint(java.awt.Paint)",
      "begin_line": 623,
      "end_line": 623,
      "comment": "\r\n     * Sets the default outline paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlinePaint(java.awt.Paint, boolean)",
      "begin_line": 636,
      "end_line": 636,
      "comment": "\r\n     * Sets the default outline paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemStroke(int, int, boolean)",
      "begin_line": 652,
      "end_line": 652,
      "comment": "\r\n     * Returns the stroke used to draw data items.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesStroke(int)",
      "begin_line": 663,
      "end_line": 663,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesStroke(int, java.awt.Stroke)",
      "begin_line": 674,
      "end_line": 674,
      "comment": "\r\n     * Sets the stroke used for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 688,
      "end_line": 688,
      "comment": "\r\n     * Sets the stroke used for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseStroke()",
      "begin_line": 697,
      "end_line": 697,
      "comment": "\r\n     * Returns the default stroke.\r\n     *\r\n     * @return The default stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseStroke(java.awt.Stroke)",
      "begin_line": 707,
      "end_line": 707,
      "comment": "\r\n     * Sets the default stroke and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseStroke(java.awt.Stroke, boolean)",
      "begin_line": 720,
      "end_line": 720,
      "comment": "\r\n     * Sets the default stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseStroke()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemOutlineStroke(int, int, boolean)",
      "begin_line": 740,
      "end_line": 740,
      "comment": "\r\n     * Returns the stroke used to outline data items.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the\r\n     * lookupSeriesOutlineStroke method.  You can override this method if you\r\n     * require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesOutlineStroke(int)",
      "begin_line": 751,
      "end_line": 751,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlineStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 762,
      "end_line": 762,
      "comment": "\r\n     * Sets the outline stroke used for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 776,
      "end_line": 777,
      "comment": "\r\n     * Sets the outline stroke for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseOutlineStroke()",
      "begin_line": 786,
      "end_line": 786,
      "comment": "\r\n     * Returns the base outline stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlineStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlineStroke(java.awt.Stroke)",
      "begin_line": 796,
      "end_line": 796,
      "comment": "\r\n     * Sets the default outline stroke and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlineStroke(java.awt.Stroke, boolean)",
      "begin_line": 809,
      "end_line": 809,
      "comment": "\r\n     * Sets the default outline stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemShape(int, int, boolean)",
      "begin_line": 825,
      "end_line": 825,
      "comment": "\r\n     * Returns a shape used to represent a data item.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesShape(int)",
      "begin_line": 836,
      "end_line": 836,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesShape(int, Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesShape(int, java.awt.Shape)",
      "begin_line": 847,
      "end_line": 847,
      "comment": "\r\n     * Sets the shape used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesShape(int, java.awt.Shape, boolean)",
      "begin_line": 861,
      "end_line": 861,
      "comment": "\r\n     * Sets the shape for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseShape()",
      "begin_line": 870,
      "end_line": 870,
      "comment": "\r\n     * Returns the base shape.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseShape(Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseShape(java.awt.Shape)",
      "begin_line": 880,
      "end_line": 880,
      "comment": "\r\n     * Sets the default shape for the renderer and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseShape(java.awt.Shape, boolean)",
      "begin_line": 893,
      "end_line": 893,
      "comment": "\r\n     * Sets the default shape for the renderer and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItem(int, int)",
      "begin_line": 908,
      "end_line": 908,
      "comment": "\r\n     * Returns a legend item for a series.  This method can return\r\n     * \u003ccode\u003enull\u003c/code\u003e, in which case the series will have no entry in the\r\n     * legend.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 919,
      "end_line": 919,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(CategorySeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 931,
      "end_line": 932,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 943,
      "end_line": 943,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 955,
      "end_line": 956,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 967,
      "end_line": 967,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(CategorySeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 979,
      "end_line": 980,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getToolTipGenerator(int, int, boolean)",
      "begin_line": 998,
      "end_line": 999,
      "comment": "\r\n     * Returns the tool tip generator that should be used for the specified\r\n     * item.  This method looks up the generator using the \"three-layer\"\r\n     * approach outlined in the general description of this interface.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 1011,
      "end_line": 1011,
      "comment": "\r\n     * Returns the tool tip generator for the specified series (a \"layer 1\"\r\n     * generator).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, CategoryToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 1023,
      "end_line": 1024,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 1038,
      "end_line": 1039,
      "comment": "\r\n     * Sets the tool tip generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 1048,
      "end_line": 1048,
      "comment": "\r\n     * Returns the base tool tip generator (the \"layer 2\" generator).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(CategoryToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 1059,
      "end_line": 1059,
      "comment": "\r\n     * Sets the base tool tip generator and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 1072,
      "end_line": 1073,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getURLGenerator(int, int, boolean)",
      "begin_line": 1089,
      "end_line": 1090,
      "comment": "\r\n     * Returns the URL generator for an item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item URL generator.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 1101,
      "end_line": 1101,
      "comment": "\r\n     * Returns the URL generator for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The URL generator.\r\n     *\r\n     * @see #setSeriesURLGenerator(int, CategoryURLGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1112,
      "end_line": 1113,
      "comment": "\r\n     * Sets the URL generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator.\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 1125,
      "end_line": 1126,
      "comment": "\r\n     * Sets the URL generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseURLGenerator()",
      "begin_line": 1135,
      "end_line": 1135,
      "comment": "\r\n     * Returns the base URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseURLGenerator(CategoryURLGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1145,
      "end_line": 1145,
      "comment": "\r\n     * Sets the base URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 1156,
      "end_line": 1157,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isItemLabelVisible(int, int, boolean)",
      "begin_line": 1174,
      "end_line": 1174,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if an item label is visible, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesItemLabelsVisible(int)",
      "begin_line": 1186,
      "end_line": 1186,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the item labels for a series are visible,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setSeriesItemLabelsVisible(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelsVisible(int)",
      "begin_line": 1200,
      "end_line": 1200,
      "comment": "\r\n     * Returns a flag that controls whether or not item labels are displayed\r\n     * for the data items in the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, boolean)",
      "begin_line": 1210,
      "end_line": 1210,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean)",
      "begin_line": 1220,
      "end_line": 1220,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 1233,
      "end_line": 1234,
      "comment": "\r\n     * Sets the visibility of item labels for a series and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the visible flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelsVisible()",
      "begin_line": 1243,
      "end_line": 1243,
      "comment": "\r\n     * Returns the base setting for item label visibility.\r\n     *\r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelsVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelsVisible(boolean)",
      "begin_line": 1252,
      "end_line": 1252,
      "comment": "\r\n     * Sets the base flag that controls whether or not item labels are visible.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelsVisible(boolean, boolean)",
      "begin_line": 1264,
      "end_line": 1264,
      "comment": "\r\n     * Sets the base visibility for item labels and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelGenerator(int, int, boolean)",
      "begin_line": 1280,
      "end_line": 1281,
      "comment": "\r\n     * Returns the item label generator for the specified data item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 1292,
      "end_line": 1292,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The label generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1303,
      "end_line": 1304,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator.\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 1318,
      "end_line": 1319,
      "comment": "\r\n     * Sets the item label generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 1328,
      "end_line": 1328,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1338,
      "end_line": 1338,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 1349,
      "end_line": 1350,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelFont(int, int, boolean)",
      "begin_line": 1366,
      "end_line": 1366,
      "comment": "\r\n     * Returns the font for an item label.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelFont(int)",
      "begin_line": 1377,
      "end_line": 1377,
      "comment": "\r\n     * Returns the font for all the item labels in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelFont(int, Font)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelFont(int, java.awt.Font)",
      "begin_line": 1388,
      "end_line": 1388,
      "comment": "\r\n     * Sets the item label font for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelFont(int, java.awt.Font, boolean)",
      "begin_line": 1402,
      "end_line": 1402,
      "comment": "\r\n     * Sets the item label font for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelFont()",
      "begin_line": 1412,
      "end_line": 1412,
      "comment": "\r\n     * Returns the base item label font (this is used when no other font\r\n     * setting is available).\r\n     *\r\n     * @return The font (\u003ccode\u003enever\u003c/code\u003e null).\r\n     *\r\n     * @see #setBaseItemLabelFont(Font)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelFont(java.awt.Font)",
      "begin_line": 1422,
      "end_line": 1422,
      "comment": "\r\n     * Sets the base item label font and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelFont(java.awt.Font, boolean)",
      "begin_line": 1435,
      "end_line": 1435,
      "comment": "\r\n     * Sets the default item label font and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelPaint(int, int, boolean)",
      "begin_line": 1451,
      "end_line": 1451,
      "comment": "\r\n     * Returns the paint used to draw an item label.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelPaint(int)",
      "begin_line": 1462,
      "end_line": 1462,
      "comment": "\r\n     * Returns the paint used to draw the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint)",
      "begin_line": 1473,
      "end_line": 1473,
      "comment": "\r\n     * Sets the item label paint for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint, boolean)",
      "begin_line": 1487,
      "end_line": 1488,
      "comment": "\r\n     * Sets the item label paint for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelPaint()",
      "begin_line": 1497,
      "end_line": 1497,
      "comment": "\r\n     * Returns the base item label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setBaseItemLabelPaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelPaint(java.awt.Paint)",
      "begin_line": 1507,
      "end_line": 1507,
      "comment": "\r\n     * Sets the base item label paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelPaint(java.awt.Paint, boolean)",
      "begin_line": 1520,
      "end_line": 1520,
      "comment": "\r\n     * Sets the default item label paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPositiveItemLabelPosition(int, int, boolean)",
      "begin_line": 1536,
      "end_line": 1537,
      "comment": "\r\n     * Returns the item label position for positive values.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesPositiveItemLabelPosition(int)",
      "begin_line": 1548,
      "end_line": 1548,
      "comment": "\r\n     * Returns the item label position for all positive values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position.\r\n     *\r\n     * @see #setSeriesPositiveItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1559,
      "end_line": 1560,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1573,
      "end_line": 1574,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBasePositiveItemLabelPosition()",
      "begin_line": 1583,
      "end_line": 1583,
      "comment": "\r\n     * Returns the base positive item label position.\r\n     *\r\n     * @return The position.\r\n     *\r\n     * @see #setBasePositiveItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1592,
      "end_line": 1592,
      "comment": "\r\n     * Sets the base positive item label position.\r\n     *\r\n     * @param position  the position.\r\n     *\r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1603,
      "end_line": 1604,
      "comment": "\r\n     * Sets the base positive item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position.\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getNegativeItemLabelPosition(int, int, boolean)",
      "begin_line": 1622,
      "end_line": 1623,
      "comment": "\r\n     * Returns the item label position for negative values.  This method can be\r\n     * overridden to provide customisation of the item label position for\r\n     * individual data items.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesNegativeItemLabelPosition(int)",
      "begin_line": 1634,
      "end_line": 1634,
      "comment": "\r\n     * Returns the item label position for all negative values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position.\r\n     *\r\n     * @see #setSeriesNegativeItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1645,
      "end_line": 1646,
      "comment": "\r\n     * Sets the item label position for negative values in a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1659,
      "end_line": 1661,
      "comment": "\r\n     * Sets the item label position for negative values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseNegativeItemLabelPosition()",
      "begin_line": 1670,
      "end_line": 1670,
      "comment": "\r\n     * Returns the base item label position for negative values.\r\n     *\r\n     * @return The position.\r\n     *\r\n     * @see #setBaseNegativeItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1680,
      "end_line": 1680,
      "comment": "\r\n     * Sets the base item label position for negative values and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position.\r\n     *\r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1691,
      "end_line": 1692,
      "comment": "\r\n     * Sets the base negative item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position.\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemCreateEntity(int, int, boolean)",
      "begin_line": 1709,
      "end_line": 1709,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should create an item entity\r\n     * for the specified data item, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesCreateEntities(int)",
      "begin_line": 1721,
      "end_line": 1721,
      "comment": "\r\n     * Returns a flag that controls whether or not chart entities are\r\n     * generated for the data items in the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean)",
      "begin_line": 1733,
      "end_line": 1733,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean, boolean)",
      "begin_line": 1746,
      "end_line": 1747,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseCreateEntities()",
      "begin_line": 1757,
      "end_line": 1757,
      "comment": "\r\n     * Returns the default flag that controls whether or not chart entities\r\n     * are generated for the data items drawn by this renderer.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseCreateEntities(boolean)",
      "begin_line": 1767,
      "end_line": 1767,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer.\r\n     *\r\n     * @param create  the flag default.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseCreateEntities(boolean, boolean)",
      "begin_line": 1779,
      "end_line": 1779,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param create  the flag default.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 1793,
      "end_line": 1793,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 1803,
      "end_line": 1803,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 1817,
      "end_line": 1817,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeAnnotations()",
      "begin_line": 1825,
      "end_line": 1825,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1839,
      "end_line": 1841,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1861,
      "end_line": 1863,
      "comment": "\r\n     * Initialises the renderer.  This method will be called before the first\r\n     * item is rendered, giving the renderer an opportunity to initialise any\r\n     * state information it wants to maintain. The renderer can do nothing if\r\n     * it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     *\r\n     * @return A state object (maintains state information relevant to one\r\n     *         chart drawing).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 1872,
      "end_line": 1873,
      "comment": "\r\n     * Draws a background for the data area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 1882,
      "end_line": 1883,
      "comment": "\r\n     * Draws an outline for the data area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 1900,
      "end_line": 1903,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  state information for one chart.\r\n     * @param dataArea  the data plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1920,
      "end_line": 1921,
      "comment": "\r\n     * Draws a line perpendicular to the specified domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the value.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawRangeLine\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1939,
      "end_line": 1940,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the range axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawDomainLine\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.plot.CategoryMarker, java.awt.geom.Rectangle2D)",
      "begin_line": 1955,
      "end_line": 1956,
      "comment": "\r\n     * Draws a line (or some other marker) to indicate a particular category on\r\n     * the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the category axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     *\r\n     * @see #drawRangeMarker(Graphics2D, CategoryPlot, ValueAxis, Marker,\r\n     *     Rectangle2D)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1971,
      "end_line": 1972,
      "comment": "\r\n     * Draws a line (or some other marker) to indicate a particular value on\r\n     * the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     *\r\n     * @see #drawDomainMarker(Graphics2D, CategoryPlot, CategoryAxis,\r\n     *     CategoryMarker, Rectangle2D)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1988,
      "end_line": 1990,
      "comment": "\r\n     * Returns the Java2D coordinate for the middle of the specified data item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param dataset  the dataset.\r\n     * @param axis  the axis.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate for the middle of the item.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": []
    }
  ]
}