{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/category/CategoryItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryItemRenderer",
      "is_interface": true,
      "parent_types": [
        "org.jfree.chart.LegendItemSource"
      ],
      "begin_line": 144,
      "end_line": 1916,
      "comment": "\r\n * A plug-in object that is used by the {@link CategoryPlot} class to display \r\n * individual data items from a {@link CategoryDataset}.\r\n * \u003cp\u003e\r\n * This interface defines the methods that must be provided by all renderers.  \r\n * If you are implementing a custom renderer, you should consider extending the\r\n * {@link AbstractCategoryItemRenderer} class.\r\n * \u003cp\u003e\r\n * Most renderer attributes are defined using a \"per-series\" approach with\r\n * a base (default) value to cover cases where no per-series value is\r\n * defined.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPlot()",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\r\n     * Returns the plot that the renderer has been assigned to (where \r\n     * \u003ccode\u003enull\u003c/code\u003e indicates that the renderer is not currently assigned \r\n     * to a plot).\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPlot(CategoryPlot)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setPlot(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 166,
      "end_line": 166,
      "comment": "\r\n     * Sets the plot that the renderer has been assigned to.  This method is \r\n     * usually called by the {@link CategoryPlot}, in normal usage you \r\n     * shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPlot()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPassCount()",
      "begin_line": 176,
      "end_line": 176,
      "comment": "\r\n     * Returns the number of passes through the dataset required by the \r\n     * renderer.  Usually this will be one, but some renderers may use\r\n     * a second or third pass to overlay items on top of things that were\r\n     * drawn in an earlier pass.\r\n     * \r\n     * @return The pass count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 187,
      "end_line": 187,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is \r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 196,
      "end_line": 196,
      "comment": "\r\n     * Adds a change listener.\r\n     * \r\n     * @param listener  the listener.\r\n     * \r\n     * @see #removeChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 205,
      "end_line": 205,
      "comment": "\r\n     * Removes a change listener.\r\n     * \r\n     * @param listener  the listener.\r\n     * \r\n     * @see #addChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemVisible(int, int)",
      "begin_line": 218,
      "end_line": 218,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item \r\n     * should be drawn (this is typically used to hide an entire series).\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesVisible(int)",
      "begin_line": 228,
      "end_line": 228,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified series \r\n     * should be drawn (this is typically used to hide an entire series).\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesVisible(int)",
      "begin_line": 239,
      "end_line": 239,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesVisible(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisible(int, java.lang.Boolean)",
      "begin_line": 250,
      "end_line": 250,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 263,
      "end_line": 263,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and, if \r\n     * requested, sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseSeriesVisible()",
      "begin_line": 272,
      "end_line": 272,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     * \r\n     * @see #setBaseSeriesVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisible(boolean)",
      "begin_line": 282,
      "end_line": 282,
      "comment": "\r\n     * Sets the base visibility and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisible(boolean, boolean)",
      "begin_line": 293,
      "end_line": 293,
      "comment": "\r\n     * Sets the base visibility and, if requested, sends \r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesVisibleInLegend(int)",
      "begin_line": 306,
      "end_line": 306,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series should be shown in the legend,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesVisibleInLegend(int)",
      "begin_line": 320,
      "end_line": 320,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible in the \r\n     * legend.  This method returns only the \"per series\" settings - to \r\n     * do a lookup that falls back to the default value, you need to use the \r\n     * {@link #isSeriesVisibleInLegend(int)} method.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesVisibleInLegend(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean)",
      "begin_line": 331,
      "end_line": 331,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend \r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean, boolean)",
      "begin_line": 344,
      "end_line": 345,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseSeriesVisibleInLegend()",
      "begin_line": 354,
      "end_line": 354,
      "comment": "\r\n     * Returns the base visibility in the legend for all series.\r\n     *\r\n     * @return The base visibility.\r\n     * \r\n     * @see #setBaseSeriesVisibleInLegend(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisibleInLegend(boolean)",
      "begin_line": 364,
      "end_line": 364,
      "comment": "\r\n     * Sets the base visibility in the legend and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseSeriesVisibleInLegend(boolean, boolean)",
      "begin_line": 375,
      "end_line": 375,
      "comment": "\r\n     * Sets the base visibility in the legend and, if requested, sends \r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemPaint(int, int)",
      "begin_line": 388,
      "end_line": 388,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesPaint(int)",
      "begin_line": 399,
      "end_line": 399,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 410,
      "end_line": 410,
      "comment": "\r\n     * Sets the paint used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPaint(int, java.awt.Paint, boolean)",
      "begin_line": 422,
      "end_line": 422,
      "comment": "\r\n     * Sets the paint used for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBasePaint()",
      "begin_line": 431,
      "end_line": 431,
      "comment": "\r\n     * Returns the base paint.\r\n     *\r\n     * @return The base paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBasePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePaint(java.awt.Paint)",
      "begin_line": 441,
      "end_line": 441,
      "comment": "\r\n     * Sets the base paint and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePaint(java.awt.Paint, boolean)",
      "begin_line": 452,
      "end_line": 452,
      "comment": "\r\n     * Sets the base paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemFillPaint(int, int)",
      "begin_line": 467,
      "end_line": 467,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesFillPaint(int)",
      "begin_line": 480,
      "end_line": 480,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesFillPaint(int, Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesFillPaint(int, java.awt.Paint)",
      "begin_line": 493,
      "end_line": 493,
      "comment": "\r\n     * Sets the fill paint for the specified series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesFillPaint(int, java.awt.Paint, boolean)",
      "begin_line": 507,
      "end_line": 507,
      "comment": "\r\n     * Sets the fill paint for the specified series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesFillPaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseFillPaint()",
      "begin_line": 518,
      "end_line": 518,
      "comment": "\r\n     * Returns the base fill paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseFillPaint(Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseFillPaint(java.awt.Paint)",
      "begin_line": 530,
      "end_line": 530,
      "comment": "\r\n     * Sets the default fill paint and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseFillPaint(java.awt.Paint, boolean)",
      "begin_line": 543,
      "end_line": 543,
      "comment": "\r\n     * Sets the default fill paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemOutlinePaint(int, int)",
      "begin_line": 556,
      "end_line": 556,
      "comment": "\r\n     * Returns the paint used to outline data items as they are drawn.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesOutlinePaint(int)",
      "begin_line": 567,
      "end_line": 567,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 578,
      "end_line": 578,
      "comment": "\r\n     * Sets the paint used for a series outline and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlinePaint(int, java.awt.Paint, boolean)",
      "begin_line": 592,
      "end_line": 592,
      "comment": "\r\n     * Sets the paint used for a series outline and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesOutlinePaint(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseOutlinePaint()",
      "begin_line": 601,
      "end_line": 601,
      "comment": "\r\n     * Returns the base outline paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseOutlinePaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlinePaint(java.awt.Paint)",
      "begin_line": 611,
      "end_line": 611,
      "comment": "\r\n     * Sets the default outline paint and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlinePaint(java.awt.Paint, boolean)",
      "begin_line": 624,
      "end_line": 624,
      "comment": "\r\n     * Sets the default outline paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseOutlinePaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemStroke(int, int)",
      "begin_line": 637,
      "end_line": 637,
      "comment": "\r\n     * Returns the stroke used to draw data items.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesStroke(int)",
      "begin_line": 648,
      "end_line": 648,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesStroke(int, java.awt.Stroke)",
      "begin_line": 659,
      "end_line": 659,
      "comment": "\r\n     * Sets the stroke used for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 673,
      "end_line": 673,
      "comment": "\r\n     * Sets the stroke used for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesStroke(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseStroke()",
      "begin_line": 682,
      "end_line": 682,
      "comment": "\r\n     * Returns the default stroke.\r\n     *\r\n     * @return The default stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseStroke(java.awt.Stroke)",
      "begin_line": 692,
      "end_line": 692,
      "comment": "\r\n     * Sets the default stroke and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseStroke(java.awt.Stroke, boolean)",
      "begin_line": 705,
      "end_line": 705,
      "comment": "\r\n     * Sets the default stroke and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseStroke()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemOutlineStroke(int, int)",
      "begin_line": 722,
      "end_line": 722,
      "comment": "\r\n     * Returns the stroke used to outline data items.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the \r\n     * lookupSeriesOutlineStroke method.  You can override this method if you \r\n     * require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesOutlineStroke(int)",
      "begin_line": 733,
      "end_line": 733,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesOutlineStroke(int, Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 744,
      "end_line": 744,
      "comment": "\r\n     * Sets the outline stroke used for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesOutlineStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 758,
      "end_line": 759,
      "comment": "\r\n     * Sets the outline stroke for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseOutlineStroke()",
      "begin_line": 768,
      "end_line": 768,
      "comment": "\r\n     * Returns the base outline stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseOutlineStroke(Stroke)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlineStroke(java.awt.Stroke)",
      "begin_line": 778,
      "end_line": 778,
      "comment": "\r\n     * Sets the default outline stroke and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseOutlineStroke(java.awt.Stroke, boolean)",
      "begin_line": 791,
      "end_line": 791,
      "comment": "\r\n     * Sets the default outline stroke and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemShape(int, int)",
      "begin_line": 804,
      "end_line": 804,
      "comment": "\r\n     * Returns a shape used to represent a data item.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesShape(int)",
      "begin_line": 815,
      "end_line": 815,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesShape(int, Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesShape(int, java.awt.Shape)",
      "begin_line": 826,
      "end_line": 826,
      "comment": "\r\n     * Sets the shape used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesShape(int, java.awt.Shape, boolean)",
      "begin_line": 840,
      "end_line": 840,
      "comment": "\r\n     * Sets the shape for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseShape()",
      "begin_line": 849,
      "end_line": 849,
      "comment": "\r\n     * Returns the base shape.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseShape(Shape)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseShape(java.awt.Shape)",
      "begin_line": 859,
      "end_line": 859,
      "comment": "\r\n     * Sets the default shape for the renderer and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseShape(java.awt.Shape, boolean)",
      "begin_line": 872,
      "end_line": 872,
      "comment": "\r\n     * Sets the default shape for the renderer and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItem(int, int)",
      "begin_line": 887,
      "end_line": 887,
      "comment": "\r\n     * Returns a legend item for a series.  This method can return \r\n     * \u003ccode\u003enull\u003c/code\u003e, in which case the series will have no entry in the\r\n     * legend.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 898,
      "end_line": 898,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(CategorySeriesLabelGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 910,
      "end_line": 911,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 922,
      "end_line": 922,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 934,
      "end_line": 935,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 946,
      "end_line": 946,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(CategorySeriesLabelGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 958,
      "end_line": 959,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getToolTipGenerator(int, int)",
      "begin_line": 974,
      "end_line": 974,
      "comment": "\r\n     * Returns the tool tip generator that should be used for the specified \r\n     * item.  This method looks up the generator using the \"three-layer\" \r\n     * approach outlined in the general description of this interface.  \r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 986,
      "end_line": 986,
      "comment": "\r\n     * Returns the tool tip generator for the specified series (a \"layer 1\" \r\n     * generator).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesToolTipGenerator(int, CategoryToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 998,
      "end_line": 999,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a \r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 1013,
      "end_line": 1014,
      "comment": "\r\n     * Sets the tool tip generator for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 1023,
      "end_line": 1023,
      "comment": "\r\n     * Returns the base tool tip generator (the \"layer 2\" generator).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseToolTipGenerator(CategoryToolTipGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 1034,
      "end_line": 1034,
      "comment": "\r\n     * Sets the base tool tip generator and sends a \r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 1047,
      "end_line": 1048,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     * \r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getURLGenerator(int, int)",
      "begin_line": 1061,
      "end_line": 1061,
      "comment": "\r\n     * Returns the URL generator for an item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The item URL generator.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 1072,
      "end_line": 1072,
      "comment": "\r\n     * Returns the URL generator for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The URL generator.\r\n     * \r\n     * @see #setSeriesURLGenerator(int, CategoryURLGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1083,
      "end_line": 1084,
      "comment": "\r\n     * Sets the URL generator for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator.\r\n     * \r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 1096,
      "end_line": 1097,
      "comment": "\r\n     * Sets the URL generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseURLGenerator()",
      "begin_line": 1106,
      "end_line": 1106,
      "comment": "\r\n     * Returns the base URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseURLGenerator(CategoryURLGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1116,
      "end_line": 1116,
      "comment": "\r\n     * Sets the base URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseURLGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 1127,
      "end_line": 1128,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isItemLabelVisible(int, int)",
      "begin_line": 1142,
      "end_line": 1142,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if an item label is visible, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.isSeriesItemLabelsVisible(int)",
      "begin_line": 1154,
      "end_line": 1154,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the item labels for a series are visible, \r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setSeriesItemLabelsVisible(int, Boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelsVisible(int)",
      "begin_line": 1168,
      "end_line": 1168,
      "comment": "\r\n     * Returns a flag that controls whether or not item labels are displayed\r\n     * for the data items in the specified series.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, boolean)",
      "begin_line": 1178,
      "end_line": 1178,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean)",
      "begin_line": 1188,
      "end_line": 1188,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 1201,
      "end_line": 1202,
      "comment": "\r\n     * Sets the visibility of item labels for a series and, if requested, sends \r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the visible flag.\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelsVisible()",
      "begin_line": 1211,
      "end_line": 1211,
      "comment": "\r\n     * Returns the base setting for item label visibility.\r\n     * \r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseItemLabelsVisible(boolean)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelsVisible(boolean)",
      "begin_line": 1220,
      "end_line": 1220,
      "comment": "\r\n     * Sets the base flag that controls whether or not item labels are visible.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelsVisible(boolean, boolean)",
      "begin_line": 1232,
      "end_line": 1232,
      "comment": "\r\n     * Sets the base visibility for item labels and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the visibility flag.\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelGenerator(int, int)",
      "begin_line": 1245,
      "end_line": 1246,
      "comment": "\r\n     * Returns the item label generator for the specified data item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 1257,
      "end_line": 1257,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The label generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelGenerator(int, CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1268,
      "end_line": 1269,
      "comment": "\r\n     * Sets the item label generator for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.  \r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator.\r\n     * \r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 1283,
      "end_line": 1284,
      "comment": "\r\n     * Sets the item label generator for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 1293,
      "end_line": 1293,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseItemLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1303,
      "end_line": 1303,
      "comment": "\r\n     * Sets the base item label generator and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 1314,
      "end_line": 1315,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelFont(int, int)",
      "begin_line": 1328,
      "end_line": 1328,
      "comment": "\r\n     * Returns the font for an item label.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelFont(int)",
      "begin_line": 1339,
      "end_line": 1339,
      "comment": "\r\n     * Returns the font for all the item labels in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelFont(int, Font)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelFont(int, java.awt.Font)",
      "begin_line": 1350,
      "end_line": 1350,
      "comment": "\r\n     * Sets the item label font for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.  \r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelFont(int, java.awt.Font, boolean)",
      "begin_line": 1364,
      "end_line": 1364,
      "comment": "\r\n     * Sets the item label font for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelFont()",
      "begin_line": 1374,
      "end_line": 1374,
      "comment": "\r\n     * Returns the base item label font (this is used when no other font \r\n     * setting is available).\r\n     * \r\n     * @return The font (\u003ccode\u003enever\u003c/code\u003e null).\r\n     * \r\n     * @see #setBaseItemLabelFont(Font)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelFont(java.awt.Font)",
      "begin_line": 1384,
      "end_line": 1384,
      "comment": "\r\n     * Sets the base item label font and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.  \r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelFont(java.awt.Font, boolean)",
      "begin_line": 1397,
      "end_line": 1397,
      "comment": "\r\n     * Sets the default item label font and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemLabelPaint(int, int)",
      "begin_line": 1410,
      "end_line": 1410,
      "comment": "\r\n     * Returns the paint used to draw an item label.\r\n     * \r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesItemLabelPaint(int)",
      "begin_line": 1421,
      "end_line": 1421,
      "comment": "\r\n     * Returns the paint used to draw the item labels for a series.\r\n     * \r\n     * @param series  the series index (zero based).\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelPaint(int, Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint)",
      "begin_line": 1432,
      "end_line": 1432,
      "comment": "\r\n     * Sets the item label paint for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series (zero based index).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesItemLabelPaint(int, java.awt.Paint, boolean)",
      "begin_line": 1446,
      "end_line": 1447,
      "comment": "\r\n     * Sets the item label paint for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseItemLabelPaint()",
      "begin_line": 1456,
      "end_line": 1456,
      "comment": "\r\n     * Returns the base item label paint.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     * \r\n     * @see #setBaseItemLabelPaint(Paint)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelPaint(java.awt.Paint)",
      "begin_line": 1466,
      "end_line": 1466,
      "comment": "\r\n     * Sets the base item label paint and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseItemLabelPaint(java.awt.Paint, boolean)",
      "begin_line": 1479,
      "end_line": 1479,
      "comment": "\r\n     * Sets the default item label paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getPositiveItemLabelPosition(int, int)",
      "begin_line": 1492,
      "end_line": 1492,
      "comment": "\r\n     * Returns the item label position for positive values.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesPositiveItemLabelPosition(int)",
      "begin_line": 1503,
      "end_line": 1503,
      "comment": "\r\n     * Returns the item label position for all positive values in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The item label position.\r\n     * \r\n     * @see #setSeriesPositiveItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1514,
      "end_line": 1515,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1528,
      "end_line": 1529,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     * \r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBasePositiveItemLabelPosition()",
      "begin_line": 1538,
      "end_line": 1538,
      "comment": "\r\n     * Returns the base positive item label position.\r\n     * \r\n     * @return The position.\r\n     * \r\n     * @see #setBasePositiveItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1547,
      "end_line": 1547,
      "comment": "\r\n     * Sets the base positive item label position.\r\n     * \r\n     * @param position  the position.\r\n     * \r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1558,
      "end_line": 1559,
      "comment": "\r\n     * Sets the base positive item label position and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position.\r\n     * @param notify  notify registered listeners?\r\n     * \r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getNegativeItemLabelPosition(int, int)",
      "begin_line": 1574,
      "end_line": 1574,
      "comment": "\r\n     * Returns the item label position for negative values.  This method can be\r\n     * overridden to provide customisation of the item label position for \r\n     * individual data items.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column (zero-based).\r\n     * \r\n     * @return The item label position.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesNegativeItemLabelPosition(int)",
      "begin_line": 1585,
      "end_line": 1585,
      "comment": "\r\n     * Returns the item label position for all negative values in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The item label position.\r\n     * \r\n     * @see #setSeriesNegativeItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1596,
      "end_line": 1597,
      "comment": "\r\n     * Sets the item label position for negative values in a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1610,
      "end_line": 1612,
      "comment": "\r\n     * Sets the item label position for negative values in a series and (if \r\n     * requested) sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     * \r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseNegativeItemLabelPosition()",
      "begin_line": 1621,
      "end_line": 1621,
      "comment": "\r\n     * Returns the base item label position for negative values.\r\n     * \r\n     * @return The position.\r\n     * \r\n     * @see #setBaseNegativeItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1631,
      "end_line": 1631,
      "comment": "\r\n     * Sets the base item label position for negative values and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position.\r\n     * \r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1642,
      "end_line": 1643,
      "comment": "\r\n     * Sets the base negative item label position and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position.\r\n     * @param notify  notify registered listeners?\r\n     * \r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getItemCreateEntity(int, int)",
      "begin_line": 1659,
      "end_line": 1659,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should create an item entity\r\n     * for the specified data item, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getSeriesCreateEntities(int)",
      "begin_line": 1671,
      "end_line": 1671,
      "comment": "\r\n     * Returns a flag that controls whether or not chart entities are \r\n     * generated for the data items in the specified series.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean)",
      "begin_line": 1683,
      "end_line": 1683,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setSeriesCreateEntities(int, java.lang.Boolean, boolean)",
      "begin_line": 1696,
      "end_line": 1697,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are created\r\n     * for the data items in the specified series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param create  the new flag value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.getBaseCreateEntities()",
      "begin_line": 1707,
      "end_line": 1707,
      "comment": "\r\n     * Returns the default flag that controls whether or not chart entities\r\n     * are generated for the data items drawn by this renderer.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseCreateEntities(boolean)",
      "begin_line": 1717,
      "end_line": 1717,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer.\r\n     * \r\n     * @param create  the flag default.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.setBaseCreateEntities(boolean, boolean)",
      "begin_line": 1729,
      "end_line": 1729,
      "comment": "\r\n     * Sets the default flag that controls whether or not chart entities are\r\n     * generated for the data items drawn by this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param create  the flag default.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 1743,
      "end_line": 1743,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     * \r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 1753,
      "end_line": 1753,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     * \r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 1767,
      "end_line": 1767,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                    permitted).\r\n     * \r\n     * @return A boolean to indicate whether or not the annotation was \r\n     *         successfully removed.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.removeAnnotations()",
      "begin_line": 1775,
      "end_line": 1775,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1789,
      "end_line": 1791,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1811,
      "end_line": 1813,
      "comment": "\r\n     * Initialises the renderer.  This method will be called before the first \r\n     * item is rendered, giving the renderer an opportunity to initialise any \r\n     * state information it wants to maintain. The renderer can do nothing if \r\n     * it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     * \r\n     * @return A state object (maintains state information relevant to one \r\n     *         chart drawing).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 1829,
      "end_line": 1832,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  state information for one chart.\r\n     * @param dataArea  the data plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 1841,
      "end_line": 1842,
      "comment": "\r\n     * Draws a background for the data area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 1851,
      "end_line": 1852,
      "comment": "\r\n     * Draws an outline for the data area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawDomainGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1866,
      "end_line": 1867,
      "comment": "\r\n     * Draws a grid line against the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any \r\n     *                  3D effect).\r\n     * @param value  the value.\r\n     * \r\n     * @see #drawRangeGridline(Graphics2D, CategoryPlot, ValueAxis, \r\n     *     Rectangle2D, double)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawRangeGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1881,
      "end_line": 1882,
      "comment": "\r\n     * Draws a grid line against the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any \r\n     *                  3D effect).\r\n     * @param value  the value.\r\n     * \r\n     * @see #drawDomainGridline(Graphics2D, CategoryPlot, Rectangle2D, double)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.plot.CategoryMarker, java.awt.geom.Rectangle2D)",
      "begin_line": 1897,
      "end_line": 1898,
      "comment": "\r\n     * Draws a line (or some other marker) to indicate a particular category on \r\n     * the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the category axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     * \r\n     * @see #drawRangeMarker(Graphics2D, CategoryPlot, ValueAxis, Marker, \r\n     *     Rectangle2D)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1913,
      "end_line": 1914,
      "comment": "\r\n     * Draws a line (or some other marker) to indicate a particular value on \r\n     * the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     * \r\n     * @see #drawDomainMarker(Graphics2D, CategoryPlot, CategoryAxis, \r\n     *     CategoryMarker, Rectangle2D)\r\n     ",
      "child_ranges": []
    }
  ]
}