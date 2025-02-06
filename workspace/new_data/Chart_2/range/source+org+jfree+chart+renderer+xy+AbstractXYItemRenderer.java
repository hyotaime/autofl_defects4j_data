{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/AbstractXYItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractXYItemRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.AbstractRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "org.jfree.chart.event.AnnotationChangeListener",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 191,
      "end_line": 2045,
      "comment": "\r\n * A base class that can be used to create new {@link XYItemRenderer}\r\n * implementations.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " The plot. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelGeneratorList"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " A list of item label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelGenerator"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " The base item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGeneratorList"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " A list of tool tip generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseToolTipGenerator"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The base tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGeneratorList"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " A list of URL generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseURLGenerator"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The URL text generator. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAnnotations"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": "\r\n     * Annotations to be drawn in the background layer (\u0027underneath\u0027 the data\r\n     * items).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAnnotations"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": "\r\n     * Annotations to be drawn in the foreground layer (\u0027on top\u0027 of the data\r\n     * items).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemLabelGenerator"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " The legend item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemToolTipGenerator"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " The legend item tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemURLGenerator"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " The legend item URL generator. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.AbstractXYItemRenderer()",
      "begin_line": 244,
      "end_line": 254,
      "comment": "\r\n     * Creates a renderer where the tooltip generator and the URL generator are\r\n     * both \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 16)",
        "(line 246,col 9)-(line 246,col 55)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 248,col 49)",
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 250,col 63)",
        "(line 251,col 9)-(line 251,col 63)",
        "(line 252,col 9)-(line 253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getPassCount()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\r\n     * Returns the number of passes through the data that the renderer requires\r\n     * in order to draw the chart.  Most charts will require a single pass, but\r\n     * some require two passes.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getPlot()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\r\n     * Returns the plot that the renderer is assigned to.\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setPlot(org.jfree.chart.plot.XYPlot)",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\r\n     * Sets the plot that the renderer is assigned to.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.createState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Creates the renderer state.  This is called by the {@link #initialise()}\r\n     * method.\r\n     *\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @return A new state instance.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 316,
      "end_line": 340,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be\r\n     * passed to all subsequent calls to the drawItem() method.\r\n     * \u003cP\u003e\r\n     * This method will be called before the first item is rendered, giving the\r\n     * renderer an opportunity to initialise any state information it wants to\r\n     * maintain.  The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param dataset  the dataset.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return The renderer state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 54)",
        "(line 322,col 9)-(line 322,col 54)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 329,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 48)",
        "(line 339,col 9)-(line 339,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getItemLabelGenerator(int, int, boolean)",
      "begin_line": 358,
      "end_line": 366,
      "comment": "\r\n     * Returns the label generator for a data item.  This implementation simply\r\n     * passes control to the {@link #getSeriesItemLabelGenerator(int)} method.\r\n     * If, for some reason, you want a different generator for individual\r\n     * items, you can override this method.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 361,col 56)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, XYItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 390,
      "end_line": 394,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 59)",
        "(line 393,col 9)-(line 393,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 409,
      "end_line": 415,
      "comment": "\r\n     * Sets the item label generator for the specified series and, if\r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the label generator (\u003ccode\u003enull\u003c/code\u003e permitted);\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 59)",
        "(line 412,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 48)",
        "(line 450,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getToolTipGenerator(int, int, boolean)",
      "begin_line": 470,
      "end_line": 478,
      "comment": "\r\n     * Returns the tool tip generator for a data item.  If, for some reason,\r\n     * you want a different generator for individual items, you can override\r\n     * this method.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 473,col 77)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\r\n     * Returns the tool tip generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, XYToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 500,
      "end_line": 503,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 515,
      "end_line": 521,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 57)",
        "(line 518,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\r\n     * Returns the base tool tip generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(XYToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 557,
      "end_line": 563,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 46)",
        "(line 560,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getURLGenerator(int, int, boolean)",
      "begin_line": 578,
      "end_line": 586,
      "comment": "\r\n     * Returns the URL generator for the specified item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 581,col 69)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\r\n     * Returns the URL generator for the specified series, if one is defined.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesURLGenerator(int, XYURLGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 614,
      "end_line": 616,
      "comment": "\r\n     * Sets the URL generator for the specified series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 630,
      "end_line": 636,
      "comment": "\r\n     * Sets the URL generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 57)",
        "(line 633,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseURLGenerator()",
      "begin_line": 647,
      "end_line": 649,
      "comment": "\r\n     * Returns the default URL generator.\r\n     *\r\n     * @return The default URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseURLGenerator(XYURLGenerator)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\r\n     * Sets the default URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 676,
      "end_line": 681,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listener?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 42)",
        "(line 678,col 9)-(line 680,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 692,
      "end_line": 695,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 704,
      "end_line": 722,
      "comment": "\r\n     * Adds an annotation to the specified layer and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 721,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 733,
      "end_line": 739,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 72)",
        "(line 735,col 9)-(line 735,col 74)",
        "(line 736,col 9)-(line 736,col 46)",
        "(line 737,col 9)-(line 737,col 26)",
        "(line 738,col 9)-(line 738,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.removeAnnotations()",
      "begin_line": 745,
      "end_line": 759,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 750,col 9)",
        "(line 751,col 10)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 43)",
        "(line 757,col 9)-(line 757,col 43)",
        "(line 758,col 9)-(line 758,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.annotationChanged(org.jfree.chart.event.AnnotationChangeEvent)",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\r\n     * Receives notification of a change to an {@link Annotation} added to\r\n     * this renderer.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getAnnotations()",
      "begin_line": 782,
      "end_line": 786,
      "comment": "\r\n     * Returns a collection of the annotations that are assigned to the\r\n     * renderer.\r\n     *\r\n     * @return A collection of annotations (possibly empty but never\r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 74)",
        "(line 784,col 9)-(line 784,col 50)",
        "(line 785,col 9)-(line 785,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 807,
      "end_line": 813,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 50)",
        "(line 812,col 9)-(line 812,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 822,
      "end_line": 824,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 834,
      "end_line": 838,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 52)",
        "(line 837,col 9)-(line 837,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 847,
      "end_line": 849,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 859,
      "end_line": 862,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 48)",
        "(line 861,col 9)-(line 861,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 875,
      "end_line": 877,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the\r\n     * specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @see #findRangeBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 891,
      "end_line": 910,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the\r\n     * specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param includeInterval  include the interval (if any) for the dataset?\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 909,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 923,
      "end_line": 925,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @see #findDomainBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 939,
      "end_line": 976,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param includeInterval  include the interval (if any) for the dataset?\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 975,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItems()",
      "begin_line": 984,
      "end_line": 1004,
      "comment": "\r\n     * Returns a (possibly empty) collection of legend items for the series\r\n     * that this renderer is responsible for drawing.\r\n     *\r\n     * @return The legend item collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 65)",
        "(line 989,col 9)-(line 989,col 47)",
        "(line 990,col 9)-(line 990,col 56)",
        "(line 991,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1003,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItem(int, int)",
      "begin_line": 1015,
      "end_line": 1065,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses\r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 34)",
        "(line 1017,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1020,col 60)",
        "(line 1021,col 9)-(line 1023,col 9)",
        "(line 1024,col 9)-(line 1025,col 24)",
        "(line 1026,col 9)-(line 1026,col 35)",
        "(line 1027,col 9)-(line 1027,col 34)",
        "(line 1028,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 30)",
        "(line 1033,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1037,col 48)",
        "(line 1038,col 9)-(line 1038,col 48)",
        "(line 1039,col 9)-(line 1039,col 55)",
        "(line 1040,col 9)-(line 1040,col 41)",
        "(line 1041,col 9)-(line 1041,col 33)",
        "(line 1042,col 9)-(line 1042,col 56)",
        "(line 1043,col 9)-(line 1043,col 57)",
        "(line 1044,col 9)-(line 1046,col 9)",
        "(line 1047,col 9)-(line 1047,col 56)",
        "(line 1048,col 9)-(line 1048,col 36)",
        "(line 1049,col 9)-(line 1049,col 33)",
        "(line 1050,col 9)-(line 1050,col 43)",
        "(line 1052,col 9)-(line 1063,col 9)",
        "(line 1064,col 9)-(line 1064,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.createHotSpotBounds(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D)",
      "begin_line": 1067,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1074,col 51)",
        "(line 1075,col 9)-(line 1075,col 51)",
        "(line 1076,col 9)-(line 1077,col 42)",
        "(line 1078,col 9)-(line 1079,col 41)",
        "(line 1080,col 9)-(line 1080,col 45)",
        "(line 1081,col 9)-(line 1081,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.createHotSpotShape(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.renderer.xy.XYItemRendererState, boolean)",
      "begin_line": 1084,
      "end_line": 1091,
      "comment": "",
      "child_ranges": [
        "(line 1089,col 9)-(line 1090,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.hitTest(double, double, java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.renderer.xy.XYItemRendererState, boolean)",
      "begin_line": 1114,
      "end_line": 1128,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified point (xx, yy) in Java2D\r\n     * space falls within the \"hot spot\" for the specified data item, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param xx\r\n     * @param yy\r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param series\r\n     * @param item\r\n     * @param selected\r\n     *\r\n     * @return\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1121,col 29)",
        "(line 1122,col 9)-(line 1124,col 9)",
        "(line 1127,col 9)-(line 1127,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.fillDomainGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1141,
      "end_line": 1164,
      "comment": "\r\n     * Fills a band between two values on the axis.  This can be used to color\r\n     * bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the domain axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1145,col 42)",
        "(line 1146,col 9)-(line 1147,col 42)",
        "(line 1148,col 9)-(line 1148,col 25)",
        "(line 1149,col 9)-(line 1156,col 9)",
        "(line 1157,col 9)-(line 1157,col 52)",
        "(line 1159,col 9)-(line 1162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.fillRangeGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1177,
      "end_line": 1199,
      "comment": "\r\n     * Fills a band between two values on the range axis.  This can be used to\r\n     * color bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the range axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1181,col 41)",
        "(line 1182,col 9)-(line 1182,col 79)",
        "(line 1183,col 9)-(line 1183,col 25)",
        "(line 1184,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1192,col 51)",
        "(line 1194,col 9)-(line 1197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainGridLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1211,
      "end_line": 1241,
      "comment": "\r\n     * Draws a grid line against the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1217,col 38)",
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1222,col 9)-(line 1222,col 60)",
        "(line 1223,col 9)-(line 1224,col 42)",
        "(line 1225,col 9)-(line 1225,col 27)",
        "(line 1226,col 9)-(line 1233,col 9)",
        "(line 1235,col 9)-(line 1235,col 52)",
        "(line 1236,col 9)-(line 1236,col 55)",
        "(line 1237,col 9)-(line 1237,col 72)",
        "(line 1238,col 9)-(line 1238,col 76)",
        "(line 1239,col 9)-(line 1239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1257,
      "end_line": 1282,
      "comment": "\r\n     * Draws a line perpendicular to the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 38)",
        "(line 1261,col 9)-(line 1263,col 9)",
        "(line 1265,col 9)-(line 1265,col 60)",
        "(line 1266,col 9)-(line 1266,col 27)",
        "(line 1267,col 9)-(line 1268,col 42)",
        "(line 1269,col 9)-(line 1276,col 9)",
        "(line 1278,col 9)-(line 1278,col 27)",
        "(line 1279,col 9)-(line 1279,col 29)",
        "(line 1280,col 9)-(line 1280,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1296,
      "end_line": 1325,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 1304,col 9)-(line 1304,col 38)",
        "(line 1305,col 9)-(line 1307,col 9)",
        "(line 1309,col 9)-(line 1309,col 60)",
        "(line 1310,col 9)-(line 1310,col 27)",
        "(line 1311,col 9)-(line 1311,col 80)",
        "(line 1312,col 9)-(line 1319,col 9)",
        "(line 1321,col 9)-(line 1321,col 27)",
        "(line 1322,col 9)-(line 1322,col 29)",
        "(line 1323,col 9)-(line 1323,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1336,
      "end_line": 1491,
      "comment": "\r\n     * Draws a vertical line on the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": [
        "(line 1342,col 9)-(line 1489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1506,
      "end_line": 1525,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker area.\r\n     * @param markerOffset  the marker label offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1514,col 9)-(line 1514,col 38)",
        "(line 1515,col 9)-(line 1522,col 9)",
        "(line 1523,col 9)-(line 1523,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1536,
      "end_line": 1688,
      "comment": "\r\n     * Draws a horizontal line across the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param rangeAxis  the range axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": [
        "(line 1542,col 9)-(line 1687,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1703,
      "end_line": 1722,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the marker area.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetForRange  the label offset.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1711,col 9)-(line 1711,col 38)",
        "(line 1712,col 9)-(line 1719,col 9)",
        "(line 1720,col 9)-(line 1720,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.clone()",
      "begin_line": 1732,
      "end_line": 1784,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the renderer does not support\r\n     *         cloning.\r\n     ",
      "child_ranges": [
        "(line 1733,col 9)-(line 1733,col 78)",
        "(line 1736,col 9)-(line 1737,col 67)",
        "(line 1738,col 9)-(line 1742,col 9)",
        "(line 1744,col 9)-(line 1745,col 65)",
        "(line 1746,col 9)-(line 1750,col 9)",
        "(line 1752,col 9)-(line 1755,col 9)",
        "(line 1756,col 9)-(line 1759,col 9)",
        "(line 1760,col 9)-(line 1763,col 9)",
        "(line 1765,col 9)-(line 1766,col 44)",
        "(line 1767,col 9)-(line 1768,col 44)",
        "(line 1770,col 9)-(line 1773,col 9)",
        "(line 1774,col 9)-(line 1777,col 9)",
        "(line 1778,col 9)-(line 1781,col 9)",
        "(line 1783,col 9)-(line 1783,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.equals(java.lang.Object)",
      "begin_line": 1793,
      "end_line": 1841,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1794,col 9)-(line 1796,col 9)",
        "(line 1797,col 9)-(line 1799,col 9)",
        "(line 1800,col 9)-(line 1800,col 67)",
        "(line 1801,col 9)-(line 1803,col 9)",
        "(line 1804,col 9)-(line 1807,col 9)",
        "(line 1808,col 9)-(line 1810,col 9)",
        "(line 1811,col 9)-(line 1814,col 9)",
        "(line 1815,col 9)-(line 1817,col 9)",
        "(line 1818,col 9)-(line 1821,col 9)",
        "(line 1822,col 9)-(line 1824,col 9)",
        "(line 1825,col 9)-(line 1827,col 9)",
        "(line 1828,col 9)-(line 1831,col 9)",
        "(line 1832,col 9)-(line 1835,col 9)",
        "(line 1836,col 9)-(line 1839,col 9)",
        "(line 1840,col 9)-(line 1840,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getDrawingSupplier()",
      "begin_line": 1848,
      "end_line": 1855,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1849,col 9)-(line 1849,col 38)",
        "(line 1850,col 9)-(line 1850,col 29)",
        "(line 1851,col 9)-(line 1853,col 9)",
        "(line 1854,col 9)-(line 1854,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.updateCrosshairValues(org.jfree.chart.plot.CrosshairState, double, double, int, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1875,
      "end_line": 1904,
      "comment": "\r\n     * Considers the current (x, y) coordinate and updates the crosshair point\r\n     * if it meets the criteria (usually means the (x, y) coordinate is the\r\n     * closest to the anchor point so far).\r\n     *\r\n     * @param crosshairState  the crosshair state (\u003ccode\u003enull\u003c/code\u003e permitted,\r\n     *                        but the method does nothing in that case).\r\n     * @param x  the x-value (in data space).\r\n     * @param y  the y-value (in data space).\r\n     * @param domainAxisIndex  the index of the domain axis for the point.\r\n     * @param rangeAxisIndex  the index of the range axis for the point.\r\n     * @param transX  the x-value translated to Java2D space.\r\n     * @param transY  the y-value translated to Java2D space.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 1879,col 9)-(line 1881,col 9)",
        "(line 1883,col 9)-(line 1902,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.xy.XYDataset, int, int, boolean, double, double, boolean)",
      "begin_line": 1922,
      "end_line": 1955,
      "comment": "\r\n     * Draws an item label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the orientation.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param negative  indicates a negative value (which affects the item\r\n     *                  label position).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1926,col 9)-(line 1927,col 26)",
        "(line 1928,col 9)-(line 1953,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1967,
      "end_line": 1992,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 1974,col 9)-(line 1974,col 33)",
        "(line 1975,col 9)-(line 1984,col 9)",
        "(line 1985,col 9)-(line 1990,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.xy.XYDataset, int, int, boolean, double, double)",
      "begin_line": 2011,
      "end_line": 2043,
      "comment": "\r\n     * Adds an entity to the collection.\r\n     *\r\n     * @param entities  the entity collection being populated.\r\n     * @param area  the entity area (if \u003ccode\u003enull\u003c/code\u003e a default will be\r\n     *              used).\r\n     * @param dataset  the dataset.\r\n     * @param series  the series.\r\n     * @param item  the item.\r\n     * @param selected  is the item selected?\r\n     * @param entityX  the entity\u0027s center x-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param entityY  the entity\u0027s center y-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2015,col 9)-(line 2017,col 9)",
        "(line 2018,col 9)-(line 2018,col 29)",
        "(line 2019,col 9)-(line 2028,col 9)",
        "(line 2029,col 9)-(line 2029,col 26)",
        "(line 2030,col 9)-(line 2031,col 26)",
        "(line 2032,col 9)-(line 2034,col 9)",
        "(line 2035,col 9)-(line 2035,col 26)",
        "(line 2036,col 9)-(line 2036,col 73)",
        "(line 2037,col 9)-(line 2039,col 9)",
        "(line 2040,col 9)-(line 2041,col 26)",
        "(line 2042,col 9)-(line 2042,col 29)"
      ]
    }
  ]
}