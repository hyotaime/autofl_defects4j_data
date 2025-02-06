{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/xy/AbstractXYItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractXYItemRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.AbstractRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 179,
      "end_line": 1914,
      "comment": "\r\n * A base class that can be used to create new {@link XYItemRenderer}\r\n * implementations.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " The plot. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelGeneratorList"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " A list of item label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelGenerator"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " The base item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGeneratorList"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " A list of tool tip generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseToolTipGenerator"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The base tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGeneratorList"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " A list of URL generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseURLGenerator"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " The URL text generator. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAnnotations"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\r\n     * Annotations to be drawn in the background layer (\u0027underneath\u0027 the data\r\n     * items).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAnnotations"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": "\r\n     * Annotations to be drawn in the foreground layer (\u0027on top\u0027 of the data\r\n     * items).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemLabelGenerator"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " The legend item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemToolTipGenerator"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " The legend item tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemURLGenerator"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " The legend item URL generator. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.AbstractXYItemRenderer()",
      "begin_line": 231,
      "end_line": 241,
      "comment": "\r\n     * Creates a renderer where the tooltip generator and the URL generator are\r\n     * both \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 16)",
        "(line 233,col 9)-(line 233,col 55)",
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 235,col 49)",
        "(line 236,col 9)-(line 236,col 37)",
        "(line 237,col 9)-(line 237,col 63)",
        "(line 238,col 9)-(line 238,col 63)",
        "(line 239,col 9)-(line 240,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getPassCount()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\r\n     * Returns the number of passes through the data that the renderer requires\r\n     * in order to draw the chart.  Most charts will require a single pass, but\r\n     * some require two passes.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getPlot()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\r\n     * Returns the plot that the renderer is assigned to.\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setPlot(org.jfree.chart.plot.XYPlot)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Sets the plot that the renderer is assigned to.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 289,
      "end_line": 298,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be\r\n     * passed to all subsequent calls to the drawItem() method.\r\n     * \u003cP\u003e\r\n     * This method will be called before the first item is rendered, giving the\r\n     * renderer an opportunity to initialise any state information it wants to\r\n     * maintain.  The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return The renderer state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 66)",
        "(line 296,col 9)-(line 296,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getItemLabelGenerator(int, int, boolean)",
      "begin_line": 316,
      "end_line": 324,
      "comment": "\r\n     * Returns the label generator for a data item.  This implementation simply\r\n     * passes control to the {@link #getSeriesItemLabelGenerator(int)} method.\r\n     * If, for some reason, you want a different generator for individual\r\n     * items, you can override this method.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 319,col 56)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, XYItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 348,
      "end_line": 352,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 59)",
        "(line 351,col 9)-(line 351,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 367,
      "end_line": 373,
      "comment": "\r\n     * Sets the item label generator for the specified series and, if\r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the label generator (\u003ccode\u003enull\u003c/code\u003e permitted);\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 59)",
        "(line 370,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 405,
      "end_line": 411,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 48)",
        "(line 408,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getToolTipGenerator(int, int, boolean)",
      "begin_line": 428,
      "end_line": 436,
      "comment": "\r\n     * Returns the tool tip generator for a data item.  If, for some reason,\r\n     * you want a different generator for individual items, you can override\r\n     * this method.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 431,col 77)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\r\n     * Returns the tool tip generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, XYToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 458,
      "end_line": 461,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 473,
      "end_line": 479,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 57)",
        "(line 476,col 9)-(line 478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\r\n     * Returns the base tool tip generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(XYToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 515,
      "end_line": 521,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 46)",
        "(line 518,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getURLGenerator(int, int, boolean)",
      "begin_line": 536,
      "end_line": 544,
      "comment": "\r\n     * Returns the URL generator for the specified item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 539,col 69)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\r\n     * Returns the URL generator for the specified series, if one is defined.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesURLGenerator(int, XYURLGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\r\n     * Sets the URL generator for the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 588,
      "end_line": 594,
      "comment": "\r\n     * Sets the URL generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 57)",
        "(line 591,col 9)-(line 593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseURLGenerator()",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\r\n     * Returns the default URL generator.\r\n     *\r\n     * @return The default URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseURLGenerator(XYURLGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\r\n     * Sets the default URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 634,
      "end_line": 639,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listener?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 42)",
        "(line 636,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 650,
      "end_line": 653,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 662,
      "end_line": 678,
      "comment": "\r\n     * Adds an annotation to the specified layer and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 677,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 689,
      "end_line": 694,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 72)",
        "(line 691,col 9)-(line 691,col 74)",
        "(line 692,col 9)-(line 692,col 26)",
        "(line 693,col 9)-(line 693,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.removeAnnotations()",
      "begin_line": 700,
      "end_line": 704,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 43)",
        "(line 702,col 9)-(line 702,col 43)",
        "(line 703,col 9)-(line 703,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getAnnotations()",
      "begin_line": 715,
      "end_line": 719,
      "comment": "\r\n     * Returns a collection of the annotations that are assigned to the\r\n     * renderer.\r\n     *\r\n     * @return A collection of annotations (possibly empty but never\r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 74)",
        "(line 717,col 9)-(line 717,col 50)",
        "(line 718,col 9)-(line 718,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 728,
      "end_line": 730,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 740,
      "end_line": 746,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 50)",
        "(line 745,col 9)-(line 745,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 767,
      "end_line": 771,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 52)",
        "(line 770,col 9)-(line 770,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 780,
      "end_line": 782,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 792,
      "end_line": 795,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 48)",
        "(line 794,col 9)-(line 794,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 808,
      "end_line": 810,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the\r\n     * specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @see #findRangeBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 824,
      "end_line": 843,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the\r\n     * specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param includeInterval  include the interval (if any) for the dataset?\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 842,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @see #findDomainBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 872,
      "end_line": 909,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param includeInterval  include the interval (if any) for the dataset?\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 908,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItems()",
      "begin_line": 917,
      "end_line": 937,
      "comment": "\r\n     * Returns a (possibly empty) collection of legend items for the series\r\n     * that this renderer is responsible for drawing.\r\n     *\r\n     * @return The legend item collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 921,col 65)",
        "(line 922,col 9)-(line 922,col 47)",
        "(line 923,col 9)-(line 923,col 56)",
        "(line 924,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItem(int, int)",
      "begin_line": 948,
      "end_line": 998,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses\r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 34)",
        "(line 950,col 9)-(line 952,col 9)",
        "(line 953,col 9)-(line 953,col 60)",
        "(line 954,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 958,col 24)",
        "(line 959,col 9)-(line 959,col 35)",
        "(line 960,col 9)-(line 960,col 34)",
        "(line 961,col 9)-(line 964,col 9)",
        "(line 965,col 9)-(line 965,col 30)",
        "(line 966,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 970,col 48)",
        "(line 971,col 9)-(line 971,col 48)",
        "(line 972,col 9)-(line 972,col 55)",
        "(line 973,col 9)-(line 973,col 41)",
        "(line 974,col 9)-(line 974,col 33)",
        "(line 975,col 9)-(line 975,col 56)",
        "(line 976,col 9)-(line 976,col 57)",
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 56)",
        "(line 981,col 9)-(line 981,col 36)",
        "(line 982,col 9)-(line 982,col 33)",
        "(line 983,col 9)-(line 983,col 43)",
        "(line 985,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 997,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.fillDomainGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1011,
      "end_line": 1034,
      "comment": "\r\n     * Fills a band between two values on the axis.  This can be used to color\r\n     * bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the domain axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1015,col 42)",
        "(line 1016,col 9)-(line 1017,col 42)",
        "(line 1018,col 9)-(line 1018,col 25)",
        "(line 1019,col 9)-(line 1026,col 9)",
        "(line 1027,col 9)-(line 1027,col 52)",
        "(line 1029,col 9)-(line 1032,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.fillRangeGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1047,
      "end_line": 1069,
      "comment": "\r\n     * Fills a band between two values on the range axis.  This can be used to\r\n     * color bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the range axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1051,col 41)",
        "(line 1052,col 9)-(line 1052,col 79)",
        "(line 1053,col 9)-(line 1053,col 25)",
        "(line 1054,col 9)-(line 1061,col 9)",
        "(line 1062,col 9)-(line 1062,col 51)",
        "(line 1064,col 9)-(line 1067,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainGridLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1081,
      "end_line": 1111,
      "comment": "\r\n     * Draws a grid line against the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 38)",
        "(line 1088,col 9)-(line 1090,col 9)",
        "(line 1092,col 9)-(line 1092,col 60)",
        "(line 1093,col 9)-(line 1094,col 42)",
        "(line 1095,col 9)-(line 1095,col 27)",
        "(line 1096,col 9)-(line 1103,col 9)",
        "(line 1105,col 9)-(line 1105,col 52)",
        "(line 1106,col 9)-(line 1106,col 55)",
        "(line 1107,col 9)-(line 1107,col 72)",
        "(line 1108,col 9)-(line 1108,col 76)",
        "(line 1109,col 9)-(line 1109,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1127,
      "end_line": 1152,
      "comment": "\r\n     * Draws a line perpendicular to the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 38)",
        "(line 1131,col 9)-(line 1133,col 9)",
        "(line 1135,col 9)-(line 1135,col 60)",
        "(line 1136,col 9)-(line 1136,col 27)",
        "(line 1137,col 9)-(line 1138,col 42)",
        "(line 1139,col 9)-(line 1146,col 9)",
        "(line 1148,col 9)-(line 1148,col 27)",
        "(line 1149,col 9)-(line 1149,col 29)",
        "(line 1150,col 9)-(line 1150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1166,
      "end_line": 1195,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 38)",
        "(line 1175,col 9)-(line 1177,col 9)",
        "(line 1179,col 9)-(line 1179,col 60)",
        "(line 1180,col 9)-(line 1180,col 27)",
        "(line 1181,col 9)-(line 1181,col 80)",
        "(line 1182,col 9)-(line 1189,col 9)",
        "(line 1191,col 9)-(line 1191,col 27)",
        "(line 1192,col 9)-(line 1192,col 29)",
        "(line 1193,col 9)-(line 1193,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1206,
      "end_line": 1361,
      "comment": "\r\n     * Draws a vertical line on the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1376,
      "end_line": 1395,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker area.\r\n     * @param markerOffset  the marker label offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 38)",
        "(line 1385,col 9)-(line 1392,col 9)",
        "(line 1393,col 9)-(line 1393,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1406,
      "end_line": 1558,
      "comment": "\r\n     * Draws a horizontal line across the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param rangeAxis  the range axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1573,
      "end_line": 1592,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the marker area.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetForRange  the label offset.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 38)",
        "(line 1582,col 9)-(line 1589,col 9)",
        "(line 1590,col 9)-(line 1590,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.clone()",
      "begin_line": 1602,
      "end_line": 1654,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the renderer does not support\r\n     *         cloning.\r\n     ",
      "child_ranges": [
        "(line 1603,col 9)-(line 1603,col 78)",
        "(line 1606,col 9)-(line 1607,col 67)",
        "(line 1608,col 9)-(line 1612,col 9)",
        "(line 1614,col 9)-(line 1615,col 65)",
        "(line 1616,col 9)-(line 1620,col 9)",
        "(line 1622,col 9)-(line 1625,col 9)",
        "(line 1626,col 9)-(line 1629,col 9)",
        "(line 1630,col 9)-(line 1633,col 9)",
        "(line 1635,col 9)-(line 1636,col 44)",
        "(line 1637,col 9)-(line 1638,col 44)",
        "(line 1640,col 9)-(line 1643,col 9)",
        "(line 1644,col 9)-(line 1647,col 9)",
        "(line 1648,col 9)-(line 1651,col 9)",
        "(line 1653,col 9)-(line 1653,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.equals(java.lang.Object)",
      "begin_line": 1663,
      "end_line": 1711,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1664,col 9)-(line 1666,col 9)",
        "(line 1667,col 9)-(line 1669,col 9)",
        "(line 1670,col 9)-(line 1670,col 67)",
        "(line 1671,col 9)-(line 1673,col 9)",
        "(line 1674,col 9)-(line 1677,col 9)",
        "(line 1678,col 9)-(line 1680,col 9)",
        "(line 1681,col 9)-(line 1684,col 9)",
        "(line 1685,col 9)-(line 1687,col 9)",
        "(line 1688,col 9)-(line 1691,col 9)",
        "(line 1692,col 9)-(line 1694,col 9)",
        "(line 1695,col 9)-(line 1697,col 9)",
        "(line 1698,col 9)-(line 1701,col 9)",
        "(line 1702,col 9)-(line 1705,col 9)",
        "(line 1706,col 9)-(line 1709,col 9)",
        "(line 1710,col 9)-(line 1710,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getDrawingSupplier()",
      "begin_line": 1718,
      "end_line": 1725,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1719,col 9)-(line 1719,col 38)",
        "(line 1720,col 9)-(line 1720,col 29)",
        "(line 1721,col 9)-(line 1723,col 9)",
        "(line 1724,col 9)-(line 1724,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.updateCrosshairValues(org.jfree.chart.plot.CrosshairState, double, double, int, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1745,
      "end_line": 1774,
      "comment": "\r\n     * Considers the current (x, y) coordinate and updates the crosshair point\r\n     * if it meets the criteria (usually means the (x, y) coordinate is the\r\n     * closest to the anchor point so far).\r\n     *\r\n     * @param crosshairState  the crosshair state (\u003ccode\u003enull\u003c/code\u003e permitted,\r\n     *                        but the method does nothing in that case).\r\n     * @param x  the x-value (in data space).\r\n     * @param y  the y-value (in data space).\r\n     * @param domainAxisIndex  the index of the domain axis for the point.\r\n     * @param rangeAxisIndex  the index of the range axis for the point.\r\n     * @param transX  the x-value translated to Java2D space.\r\n     * @param transY  the y-value translated to Java2D space.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 1749,col 9)-(line 1751,col 9)",
        "(line 1753,col 9)-(line 1772,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.xy.XYDataset, int, int, boolean, double, double, boolean)",
      "begin_line": 1792,
      "end_line": 1825,
      "comment": "\r\n     * Draws an item label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the orientation.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param negative  indicates a negative value (which affects the item\r\n     *                  label position).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1796,col 9)-(line 1797,col 26)",
        "(line 1798,col 9)-(line 1823,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1837,
      "end_line": 1861,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 1844,col 9)-(line 1844,col 33)",
        "(line 1845,col 9)-(line 1854,col 9)",
        "(line 1855,col 9)-(line 1859,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.xy.XYDataset, int, int, boolean, double, double)",
      "begin_line": 1880,
      "end_line": 1912,
      "comment": "\r\n     * Adds an entity to the collection.\r\n     *\r\n     * @param entities  the entity collection being populated.\r\n     * @param area  the entity area (if \u003ccode\u003enull\u003c/code\u003e a default will be\r\n     *              used).\r\n     * @param dataset  the dataset.\r\n     * @param series  the series.\r\n     * @param item  the item.\r\n     * @param selected  is the item selected?\r\n     * @param entityX  the entity\u0027s center x-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param entityY  the entity\u0027s center y-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1884,col 9)-(line 1886,col 9)",
        "(line 1887,col 9)-(line 1887,col 29)",
        "(line 1888,col 9)-(line 1897,col 9)",
        "(line 1898,col 9)-(line 1898,col 26)",
        "(line 1899,col 9)-(line 1900,col 26)",
        "(line 1901,col 9)-(line 1903,col 9)",
        "(line 1904,col 9)-(line 1904,col 26)",
        "(line 1905,col 9)-(line 1905,col 73)",
        "(line 1906,col 9)-(line 1908,col 9)",
        "(line 1909,col 9)-(line 1910,col 26)",
        "(line 1911,col 9)-(line 1911,col 29)"
      ]
    }
  ]
}