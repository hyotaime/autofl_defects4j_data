{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/category/CategoryItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryItemRenderer",
      "is_interface": true,
      "parent_types": [
        "org.jfree.chart.LegendItemSource"
      ],
      "begin_line": 150,
      "end_line": 2073,
      "comment": "\r\n * A plug-in object that is used by the {@link CategoryPlot} class to display\r\n * individual data items from a {@link CategoryDataset}.\r\n * \u003cp\u003e\r\n * This interface defines the methods that must be provided by all renderers.\r\n * If you are implementing a custom renderer, you should consider extending the\r\n * {@link AbstractCategoryItemRenderer} class.\r\n * \u003cp\u003e\r\n * Most renderer attributes are defined using a \"per-series\" approach with\r\n * a base (default) value to cover cases where no per-series value is\r\n * defined.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPlot()",
      "begin_line": 161,
      "end_line": 161,
      "comment": "\r\n     * Returns the plot that the renderer has been assigned to (where\r\n     * \u003ccode\u003enull\u003c/code\u003e indicates that the renderer is not currently assigned\r\n     * to a plot).\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlot(CategoryPlot)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setPlot(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 172,
      "end_line": 172,
      "comment": "\r\n     * Sets the plot that the renderer has been assigned to.  This method is\r\n     * usually called by the {@link CategoryPlot}, in normal usage you\r\n     * shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPassCount()",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\r\n     * Returns the number of passes through the dataset required by the\r\n     * renderer.  Usually this will be one, but some renderers may use\r\n     * a second or third pass to overlay items on top of things that were\r\n     * drawn in an earlier pass.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 193,
      "end_line": 193,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is\r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 202,
      "end_line": 202,
      "comment": "\r\n     * Adds a change listener.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @see #removeChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 211,
      "end_line": 211,
      "comment": "\r\n     * Removes a change listener.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @see #addChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemVisible(int, int)",
      "begin_line": 224,
      "end_line": 224,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item\r\n     * should be drawn (this is typically used to hide an entire series).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesVisible(int)",
      "begin_line": 234,
      "end_line": 234,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified series\r\n     * should be drawn (this is typically used to hide an entire series).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesVisible(int)",
      "begin_line": 245,
      "end_line": 245,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisible(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisible(int, java.lang.Boolean)",
      "begin_line": 256,
      "end_line": 256,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 269,
      "end_line": 269,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and, if\r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseSeriesVisible()",
      "begin_line": 278,
      "end_line": 278,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisible(boolean)",
      "begin_line": 288,
      "end_line": 288,
      "comment": "\r\n     * Sets the base visibility and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisible(boolean, boolean)",
      "begin_line": 299,
      "end_line": 299,
      "comment": "\r\n     * Sets the base visibility and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesVisibleInLegend(int)",
      "begin_line": 312,
      "end_line": 312,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series should be shown in the legend,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesVisibleInLegend(int)",
      "begin_line": 326,
      "end_line": 326,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible in the\r\n     * legend.  This method returns only the \"per series\" settings - to\r\n     * do a lookup that falls back to the default value, you need to use the\r\n     * {@link #isSeriesVisibleInLegend(int)} method.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisibleInLegend(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean)",
      "begin_line": 337,
      "end_line": 337,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean, boolean)",
      "begin_line": 350,
      "end_line": 351,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseSeriesVisibleInLegend()",
      "begin_line": 360,
      "end_line": 360,
      "comment": "\r\n     * Returns the base visibility in the legend for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisibleInLegend(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisibleInLegend(boolean)",
      "begin_line": 370,
      "end_line": 370,
      "comment": "\r\n     * Sets the base visibility in the legend and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisibleInLegend(boolean, boolean)",
      "begin_line": 381,
      "end_line": 381,
      "comment": "\r\n     * Sets the base visibility in the legend and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemPaint(int, int, boolean)",
      "begin_line": 397,
      "end_line": 397,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesPaint(int)",
      "begin_line": 408,
      "end_line": 408,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 419,
      "end_line": 419,
      "comment": "\r\n     * Sets the paint used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPaint(int, java.awt.Paint, boolean)",
      "begin_line": 431,
      "end_line": 431,
      "comment": "\r\n     * Sets the paint used for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBasePaint()",
      "begin_line": 440,
      "end_line": 440,
      "comment": "\r\n     * Returns the base paint.\r\n     *\r\n     * @return The base paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBasePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePaint(java.awt.Paint)",
      "begin_line": 450,
      "end_line": 450,
      "comment": "\r\n     * Sets the base paint and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePaint(java.awt.Paint, boolean)",
      "begin_line": 461,
      "end_line": 461,
      "comment": "\r\n     * Sets the base paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemFillPaint(int, int, boolean)",
      "begin_line": 477,
      "end_line": 477,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesFillPaint(int)",
      "begin_line": 490,
      "end_line": 490,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesFillPaint(int, Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesFillPaint(int, java.awt.Paint)",
      "begin_line": 503,
      "end_line": 503,
      "comment": "\r\n     * Sets the fill paint for the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesFillPaint(int, java.awt.Paint, boolean)",
      "begin_line": 517,
      "end_line": 517,
      "comment": "\r\n     * Sets the fill paint for the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseFillPaint()",
      "begin_line": 528,
      "end_line": 528,
      "comment": "\r\n     * Returns the base fill paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseFillPaint(Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseFillPaint(java.awt.Paint)",
      "begin_line": 540,
      "end_line": 540,
      "comment": "\r\n     * Sets the default fill paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseFillPaint(java.awt.Paint, boolean)",
      "begin_line": 553,
      "end_line": 553,
      "comment": "\r\n     * Sets the default fill paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemOutlinePaint(int, int, boolean)",
      "begin_line": 569,
      "end_line": 569,
      "comment": "\r\n     * Returns the paint used to outline data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesOutlinePaint(int)",
      "begin_line": 580,
      "end_line": 580,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 591,
      "end_line": 591,
      "comment": "\r\n     * Sets the paint used for a series outline and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint, boolean)",
      "begin_line": 605,
      "end_line": 605,
      "comment": "\r\n     * Sets the paint used for a series outline and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseOutlinePaint()",
      "begin_line": 614,
      "end_line": 614,
      "comment": "\r\n     * Returns the base outline paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlinePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlinePaint(java.awt.Paint)",
      "begin_line": 624,
      "end_line": 624,
      "comment": "\r\n     * Sets the default outline paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlinePaint(java.awt.Paint, boolean)",
      "begin_line": 637,
      "end_line": 637,
      "comment": "\r\n     * Sets the default outline paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemStroke(int, int, boolean)",
      "begin_line": 653,
      "end_line": 653,
      "comment": "\r\n     * Returns the stroke used to draw data items.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesStroke(int)",
      "begin_line": 664,
      "end_line": 664,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesStroke(int, java.awt.Stroke)",
      "begin_line": 675,
      "end_line": 675,
      "comment": "\r\n     * Sets the stroke used for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 689,
      "end_line": 689,
      "comment": "\r\n     * Sets the stroke used for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseStroke()",
      "begin_line": 698,
      "end_line": 698,
      "comment": "\r\n     * Returns the default stroke.\r\n     *\r\n     * @return The default stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseStroke(java.awt.Stroke)",
      "begin_line": 708,
      "end_line": 708,
      "comment": "\r\n     * Sets the default stroke and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseStroke(java.awt.Stroke, boolean)",
      "begin_line": 721,
      "end_line": 721,
      "comment": "\r\n     * Sets the default stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseStroke()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemOutlineStroke(int, int, boolean)",
      "begin_line": 741,
      "end_line": 741,
      "comment": "\r\n     * Returns the stroke used to outline data items.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the\r\n     * lookupSeriesOutlineStroke method.  You can override this method if you\r\n     * require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesOutlineStroke(int)",
      "begin_line": 752,
      "end_line": 752,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlineStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 763,
      "end_line": 763,
      "comment": "\r\n     * Sets the outline stroke used for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 777,
      "end_line": 778,
      "comment": "\r\n     * Sets the outline stroke for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseOutlineStroke()",
      "begin_line": 787,
      "end_line": 787,
      "comment": "\r\n     * Returns the base outline stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlineStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlineStroke(java.awt.Stroke)",
      "begin_line": 797,
      "end_line": 797,
      "comment": "\r\n     * Sets the default outline stroke and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlineStroke(java.awt.Stroke, boolean)",
      "begin_line": 810,
      "end_line": 810,
      "comment": "\r\n     * Sets the default outline stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemShape(int, int, boolean)",
      "begin_line": 826,
      "end_line": 826,
      "comment": "\r\n     * Returns a shape used to represent a data item.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesShape(int)",
      "begin_line": 837,
      "end_line": 837,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesShape(int, Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesShape(int, java.awt.Shape)",
      "begin_line": 848,
      "end_line": 848,
      "comment": "\r\n     * Sets the shape used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesShape(int, java.awt.Shape, boolean)",
      "begin_line": 862,
      "end_line": 862,
      "comment": "\r\n     * Sets the shape for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseShape()",
      "begin_line": 871,
      "end_line": 871,
      "comment": "\r\n     * Returns the base shape.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseShape(Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseShape(java.awt.Shape)",
      "begin_line": 881,
      "end_line": 881,
      "comment": "\r\n     * Sets the default shape for the renderer and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseShape(java.awt.Shape, boolean)",
      "begin_line": 894,
      "end_line": 894,
      "comment": "\r\n     * Sets the default shape for the renderer and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItem(int, int)",
      "begin_line": 909,
      "end_line": 909,
      "comment": "\r\n     * Returns a legend item for a series.  This method can return\r\n     * \u003ccode\u003enull\u003c/code\u003e, in which case the series will have no entry in the\r\n     * legend.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 920,
      "end_line": 920,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(CategorySeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 932,
      "end_line": 933,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 944,
      "end_line": 944,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 956,
      "end_line": 957,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 968,
      "end_line": 968,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(CategorySeriesLabelGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 980,
      "end_line": 981,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getToolTipGenerator(int, int, boolean)",
      "begin_line": 999,
      "end_line": 1000,
      "comment": "\r\n     * Returns the tool tip generator that should be used for the specified\r\n     * item.  This method looks up the generator using the \"three-layer\"\r\n     * approach outlined in the general description of this interface.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 1012,
      "end_line": 1012,
      "comment": "\r\n     * Returns the tool tip generator for the specified series (a \"layer 1\"\r\n     * generator).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, CategoryToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 1024,
      "end_line": 1025,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 1039,
      "end_line": 1040,
      "comment": "\r\n     * Sets the tool tip generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 1049,
      "end_line": 1049,
      "comment": "\r\n     * Returns the base tool tip generator (the \"layer 2\" generator).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(CategoryToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 1060,
      "end_line": 1060,
      "comment": "\r\n     * Sets the base tool tip generator and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 1073,
      "end_line": 1074,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getURLGenerator(int, int, boolean)",
      "begin_line": 1090,
      "end_line": 1091,
      "comment": "\r\n     * Returns the URL generator for an item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item URL generator.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 1102,
      "end_line": 1102,
      "comment": "\r\n     * Returns the URL generator for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The URL generator.\r\n     *\r\n     * @see #setSeriesURLGenerator(int, CategoryURLGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1113,
      "end_line": 1114,
      "comment": "\r\n     * Sets the URL generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator.\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 1126,
      "end_line": 1127,
      "comment": "\r\n     * Sets the URL generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseURLGenerator()",
      "begin_line": 1136,
      "end_line": 1136,
      "comment": "\r\n     * Returns the base URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseURLGenerator(CategoryURLGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1146,
      "end_line": 1146,
      "comment": "\r\n     * Sets the base URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 1157,
      "end_line": 1158,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isItemLabelVisible(int, int, boolean)",
      "begin_line": 1175,
      "end_line": 1175,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if an item label is visible, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesItemLabelsVisible(int)",
      "begin_line": 1187,
      "end_line": 1187,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the item labels for a series are visible,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setSeriesItemLabelsVisible(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelsVisible(int)",
      "begin_line": 1201,
      "end_line": 1201,
      "comment": "\r\n     * Returns a flag that controls whether or not item labels are displayed\r\n     * for the data items in the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, boolean)",
      "begin_line": 1211,
      "end_line": 1211,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean)",
      "begin_line": 1221,
      "end_line": 1221,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 1234,
      "end_line": 1235,
      "comment": "\r\n     * Sets the visibility of item labels for a series and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the visible flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelsVisible()",
      "begin_line": 1244,
      "end_line": 1244,
      "comment": "\r\n     * Returns the base setting for item label visibility.\r\n     *\r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelsVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelsVisible(boolean)",
      "begin_line": 1253,
      "end_line": 1253,
      "comment": "\r\n     * Sets the base flag that controls whether or not item labels are visible.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelsVisible(boolean, boolean)",
      "begin_line": 1265,
      "end_line": 1265,
      "comment": "\r\n     * Sets the base visibility for item labels and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelGenerator(int, int, boolean)",
      "begin_line": 1281,
      "end_line": 1282,
      "comment": "\r\n     * Returns the item label generator for the specified data item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 1293,
      "end_line": 1293,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The label generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1304,
      "end_line": 1305,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator.\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 1319,
      "end_line": 1320,
      "comment": "\r\n     * Sets the item label generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 1329,
      "end_line": 1329,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1339,
      "end_line": 1339,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 1350,
      "end_line": 1351,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelFont(int, int, boolean)",
      "begin_line": 1367,
      "end_line": 1367,
      "comment": "\r\n     * Returns the font for an item label.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelFont(int)",
      "begin_line": 1378,
      "end_line": 1378,
      "comment": "\r\n     * Returns the font for all the item labels in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelFont(int, Font)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelFont(int, java.awt.Font)",
      "begin_line": 1389,
      "end_line": 1389,
      "comment": "\r\n     * Sets the item label font for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelFont(int, java.awt.Font, boolean)",
      "begin_line": 1403,
      "end_line": 1403,
      "comment": "\r\n     * Sets the item label font for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelFont()",
      "begin_line": 1413,
      "end_line": 1413,
      "comment": "\r\n     * Returns the base item label font (this is used when no other font\r\n     * setting is available).\r\n     *\r\n     * @return The font (\u003ccode\u003enever\u003c/code\u003e null).\r\n     *\r\n     * @see #setBaseItemLabelFont(Font)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelFont(java.awt.Font)",
      "begin_line": 1423,
      "end_line": 1423,
      "comment": "\r\n     * Sets the base item label font and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelFont(java.awt.Font, boolean)",
      "begin_line": 1436,
      "end_line": 1436,
      "comment": "\r\n     * Sets the default item label font and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelPaint(int, int, boolean)",
      "begin_line": 1452,
      "end_line": 1452,
      "comment": "\r\n     * Returns the paint used to draw an item label.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelPaint(int)",
      "begin_line": 1463,
      "end_line": 1463,
      "comment": "\r\n     * Returns the paint used to draw the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint)",
      "begin_line": 1474,
      "end_line": 1474,
      "comment": "\r\n     * Sets the item label paint for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint, boolean)",
      "begin_line": 1488,
      "end_line": 1489,
      "comment": "\r\n     * Sets the item label paint for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelPaint()",
      "begin_line": 1498,
      "end_line": 1498,
      "comment": "\r\n     * Returns the base item label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setBaseItemLabelPaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelPaint(java.awt.Paint)",
      "begin_line": 1508,
      "end_line": 1508,
      "comment": "\r\n     * Sets the base item label paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelPaint(java.awt.Paint, boolean)",
      "begin_line": 1521,
      "end_line": 1521,
      "comment": "\r\n     * Sets the default item label paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPositiveItemLabelPosition(int, int, boolean)",
      "begin_line": 1537,
      "end_line": 1538,
      "comment": "\r\n     * Returns the item label position for positive values.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesPositiveItemLabelPosition(int)",
      "begin_line": 1549,
      "end_line": 1549,
      "comment": "\r\n     * Returns the item label position for all positive values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position.\r\n     *\r\n     * @see #setSeriesPositiveItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1560,
      "end_line": 1561,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1574,
      "end_line": 1575,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBasePositiveItemLabelPosition()",
      "begin_line": 1584,
      "end_line": 1584,
      "comment": "\r\n     * Returns the base positive item label position.\r\n     *\r\n     * @return The position.\r\n     *\r\n     * @see #setBasePositiveItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1593,
      "end_line": 1593,
      "comment": "\r\n     * Sets the base positive item label position.\r\n     *\r\n     * @param position  the position.\r\n     *\r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1604,
      "end_line": 1605,
      "comment": "\r\n     * Sets the base positive item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position.\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getNegativeItemLabelPosition(int, int, boolean)",
      "begin_line": 1623,
      "end_line": 1624,
      "comment": "\r\n     * Returns the item label position for negative values.  This method can be\r\n     * overridden to provide customisation of the item label position for\r\n     * individual data items.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesNegativeItemLabelPosition(int)",
      "begin_line": 1635,
      "end_line": 1635,
      "comment": "\r\n     * Returns the item label position for all negative values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position.\r\n     *\r\n     * @see #setSeriesNegativeItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1646,
      "end_line": 1647,
      "comment": "\r\n     * Sets the item label position for negative values in a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1660,
      "end_line": 1662,
      "comment": "\r\n     * Sets the item label position for negative values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseNegativeItemLabelPosition()",
      "begin_line": 1671,
      "end_line": 1671,
      "comment": "\r\n     * Returns the base item label position for negative values.\r\n     *\r\n     * @return The position.\r\n     *\r\n     * @see #setBaseNegativeItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1681,
      "end_line": 1681,
      "comment": "\r\n     * Sets the base item label position for negative values and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position.\r\n     *\r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1692,
      "end_line": 1693,
      "comment": "\r\n     * Sets the base negative item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position.\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemCreateEntity(int, int, boolean)",
      "begin_line": 1710,
      "end_line": 1710,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should create an item entity\r\n     * for the specified data item, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesCreateEntities(int)",
      "begin_line": 1722,
      "end_line": 1722,
      "comment": "\r\n     * Returns a flag that controls whether or not chart entities are\r\n     * generated for the data items in the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean)",
      "begin_line": 1734,
      "end_line": 1734,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean, boolean)",
      "begin_line": 1747,
      "end_line": 1748,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseCreateEntities()",
      "begin_line": 1758,
      "end_line": 1758,
      "comment": "\r\n     * Returns the default flag that controls whether or not chart entities\r\n     * are generated for the data items drawn by this renderer.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseCreateEntities(boolean)",
      "begin_line": 1768,
      "end_line": 1768,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer.\r\n     *\r\n     * @param create  the flag default.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseCreateEntities(boolean, boolean)",
      "begin_line": 1780,
      "end_line": 1780,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param create  the flag default.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 1794,
      "end_line": 1794,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 1804,
      "end_line": 1804,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 1818,
      "end_line": 1818,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeAnnotations()",
      "begin_line": 1826,
      "end_line": 1826,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1840,
      "end_line": 1842,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1862,
      "end_line": 1864,
      "comment": "\r\n     * Initialises the renderer.  This method will be called before the first\r\n     * item is rendered, giving the renderer an opportunity to initialise any\r\n     * state information it wants to maintain. The renderer can do nothing if\r\n     * it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param dataset  the dataset.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     *\r\n     * @return A state object (maintains state information relevant to one\r\n     *         chart drawing).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 1873,
      "end_line": 1874,
      "comment": "\r\n     * Draws a background for the data area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 1883,
      "end_line": 1884,
      "comment": "\r\n     * Draws an outline for the data area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 1901,
      "end_line": 1904,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  state information for one chart.\r\n     * @param dataArea  the data plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1921,
      "end_line": 1922,
      "comment": "\r\n     * Draws a line perpendicular to the specified domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the value.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawRangeLine\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1940,
      "end_line": 1941,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the range axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawDomainLine\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.plot.CategoryMarker, java.awt.geom.Rectangle2D)",
      "begin_line": 1956,
      "end_line": 1957,
      "comment": "\r\n     * Draws a line (or some other marker) to indicate a particular category on\r\n     * the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the category axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     *\r\n     * @see #drawRangeMarker(Graphics2D, CategoryPlot, ValueAxis, Marker,\r\n     *     Rectangle2D)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1972,
      "end_line": 1973,
      "comment": "\r\n     * Draws a line (or some other marker) to indicate a particular value on\r\n     * the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     *\r\n     * @see #drawDomainMarker(Graphics2D, CategoryPlot, CategoryAxis,\r\n     *     CategoryMarker, Rectangle2D)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1989,
      "end_line": 1991,
      "comment": "\r\n     * Returns the Java2D coordinate for the middle of the specified data item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param dataset  the dataset.\r\n     * @param axis  the axis.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate for the middle of the item.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSelectedItemAttributes()",
      "begin_line": 2000,
      "end_line": 2000,
      "comment": "\r\n     * Returns the selected item attributes.\r\n     * \r\n     * @return The selected item attributes (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.createHotSpotShape(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 2019,
      "end_line": 2022,
      "comment": "\r\n     * Returns a shape that can be used for hit testing on a data item drawn\r\n     * by the renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area within which the data is being rendered.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A shape equal to the hot spot for a data item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.createHotSpotBounds(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D)",
      "begin_line": 2042,
      "end_line": 2045,
      "comment": "\r\n     * Returns the rectangular bounds for the hot spot for an item drawn by\r\n     * this renderer.  This is intended to provide a quick test for\r\n     * eliminating data points before more accurate testing against the\r\n     * shape returned by createHotSpotShape().\r\n     *\r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param series\r\n     * @param item\r\n     * @param selected\r\n     * @param result\r\n     * @return\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.hitTest(double, double, java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 2068,
      "end_line": 2071,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified point (xx, yy) in Java2D\r\n     * space falls within the \"hot spot\" for the specified data item, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param xx\r\n     * @param yy\r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param series\r\n     * @param item\r\n     * @param selected\r\n     *\r\n     * @return\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    }
  ]
}