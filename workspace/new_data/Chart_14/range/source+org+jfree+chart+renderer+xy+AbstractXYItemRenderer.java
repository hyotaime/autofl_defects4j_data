{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/AbstractXYItemRenderer.java",
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
      "begin_line": 168,
      "end_line": 1759,
      "comment": "\r\n * A base class that can be used to create new {@link XYItemRenderer}\r\n * implementations.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The plot. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelGeneratorList"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " A list of item label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelGenerator"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " The base item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGeneratorList"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " A list of tool tip generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseToolTipGenerator"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " The base tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGeneratorList"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " A list of URL generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseURLGenerator"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " The URL text generator. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAnnotations"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": "\r\n     * Annotations to be drawn in the background layer (\u0027underneath\u0027 the data\r\n     * items).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAnnotations"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": "\r\n     * Annotations to be drawn in the foreground layer (\u0027on top\u0027 of the data\r\n     * items).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultEntityRadius"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " The default radius for the entity \u0027hotspot\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemLabelGenerator"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " The legend item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemToolTipGenerator"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " The legend item tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemURLGenerator"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " The legend item URL generator. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.AbstractXYItemRenderer()",
      "begin_line": 225,
      "end_line": 236,
      "comment": "\r\n     * Creates a renderer where the tooltip generator and the URL generator are\r\n     * both \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 16)",
        "(line 227,col 9)-(line 227,col 55)",
        "(line 228,col 9)-(line 228,col 53)",
        "(line 229,col 9)-(line 229,col 49)",
        "(line 230,col 9)-(line 230,col 37)",
        "(line 231,col 9)-(line 231,col 63)",
        "(line 232,col 9)-(line 232,col 63)",
        "(line 233,col 9)-(line 233,col 37)",
        "(line 234,col 9)-(line 235,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getPassCount()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\r\n     * Returns the number of passes through the data that the renderer requires\r\n     * in order to draw the chart.  Most charts will require a single pass, but\r\n     * some require two passes.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getPlot()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\r\n     * Returns the plot that the renderer is assigned to.\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setPlot(org.jfree.chart.plot.XYPlot)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\r\n     * Sets the plot that the renderer is assigned to.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 284,
      "end_line": 293,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be\r\n     * passed to all subsequent calls to the drawItem() method.\r\n     * \u003cP\u003e\r\n     * This method will be called before the first item is rendered, giving the\r\n     * renderer an opportunity to initialise any state information it wants to\r\n     * maintain.  The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return The renderer state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 66)",
        "(line 291,col 9)-(line 291,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getItemLabelGenerator(int, int)",
      "begin_line": 308,
      "end_line": 315,
      "comment": "\r\n     * Returns the label generator for a data item.  This implementation simply\r\n     * passes control to the {@link #getSeriesItemLabelGenerator(int)} method.\r\n     * If, for some reason, you want a different generator for individual\r\n     * items, you can override this method.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 310,col 81)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelGenerator(int, XYItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 339,
      "end_line": 343,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 59)",
        "(line 342,col 9)-(line 342,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 358,
      "end_line": 364,
      "comment": "\r\n     * Sets the item label generator for the specified series and, if \r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the label generator (\u003ccode\u003enull\u003c/code\u003e permitted);\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 59)",
        "(line 361,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 396,
      "end_line": 402,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 48)",
        "(line 399,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getToolTipGenerator(int, int)",
      "begin_line": 416,
      "end_line": 423,
      "comment": "\r\n     * Returns the tool tip generator for a data item.  If, for some reason, \r\n     * you want a different generator for individual items, you can override \r\n     * this method.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 418,col 77)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\r\n     * Returns the tool tip generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesToolTipGenerator(int, XYToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 460,
      "end_line": 466,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 57)",
        "(line 463,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\r\n     * Returns the base tool tip generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseToolTipGenerator(XYToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 502,
      "end_line": 508,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseToolTipGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 46)",
        "(line 505,col 9)-(line 507,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getURLGenerator(int, int)",
      "begin_line": 522,
      "end_line": 529,
      "comment": "\r\n     * Returns the URL generator for the specified item.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 524,col 69)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\r\n     * Returns the URL generator for the specified series, if one is defined.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesURLGenerator(int, XYURLGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\r\n     * Sets the URL generator for the specified series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * \r\n     * @see #getSeriesURLGenerator(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 573,
      "end_line": 579,
      "comment": "\r\n     * Sets the URL generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesURLGenerator(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 57)",
        "(line 576,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseURLGenerator()",
      "begin_line": 590,
      "end_line": 592,
      "comment": "\r\n     * Returns the default URL generator.\r\n     * \r\n     * @return The default URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseURLGenerator(XYURLGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\r\n     * Sets the default URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 619,
      "end_line": 624,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listener?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 42)",
        "(line 621,col 9)-(line 623,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 635,
      "end_line": 638,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 647,
      "end_line": 663,
      "comment": "\r\n     * Adds an annotation to the specified layer and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 662,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 674,
      "end_line": 679,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 72)",
        "(line 676,col 9)-(line 676,col 74)",
        "(line 677,col 9)-(line 677,col 26)",
        "(line 678,col 9)-(line 678,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.removeAnnotations()",
      "begin_line": 685,
      "end_line": 689,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 43)",
        "(line 687,col 9)-(line 687,col 43)",
        "(line 688,col 9)-(line 688,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getDefaultEntityRadius()",
      "begin_line": 699,
      "end_line": 701,
      "comment": "\r\n     * Returns the radius of the circle used for the default entity area\r\n     * when no area is specified.\r\n     *\r\n     * @return A radius.\r\n     * \r\n     * @see #setDefaultEntityRadius(int)\r\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setDefaultEntityRadius(int)",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\r\n     * Sets the radius of the circle used for the default entity area\r\n     * when no area is specified.\r\n     *\r\n     * @param radius  the radius.\r\n     * \r\n     * @see #getDefaultEntityRadius()\r\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 734,
      "end_line": 740,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 50)",
        "(line 739,col 9)-(line 739,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 749,
      "end_line": 751,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 761,
      "end_line": 765,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 52)",
        "(line 764,col 9)-(line 764,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 786,
      "end_line": 789,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 48)",
        "(line 788,col 9)-(line 788,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 802,
      "end_line": 809,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the\r\n     * specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *         \r\n     * @see #findRangeBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 808,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 822,
      "end_line": 829,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *         \r\n     * @see #findDomainBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 828,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItems()",
      "begin_line": 837,
      "end_line": 857,
      "comment": "\r\n     * Returns a (possibly empty) collection of legend items for the series\r\n     * that this renderer is responsible for drawing.\r\n     *\r\n     * @return The legend item collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 65)",
        "(line 842,col 9)-(line 842,col 47)",
        "(line 843,col 9)-(line 843,col 56)",
        "(line 844,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItem(int, int)",
      "begin_line": 868,
      "end_line": 900,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses\r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 33)",
        "(line 870,col 9)-(line 870,col 34)",
        "(line 871,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.fillDomainGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 913,
      "end_line": 936,
      "comment": "\r\n     * Fills a band between two values on the axis.  This can be used to color\r\n     * bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the domain axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 917,col 42)",
        "(line 918,col 9)-(line 919,col 42)",
        "(line 920,col 9)-(line 920,col 25)",
        "(line 921,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 929,col 52)",
        "(line 931,col 9)-(line 934,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.fillRangeGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 949,
      "end_line": 971,
      "comment": "\r\n     * Fills a band between two values on the range axis.  This can be used to\r\n     * color bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the range axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 953,col 41)",
        "(line 954,col 9)-(line 954,col 79)",
        "(line 955,col 9)-(line 955,col 25)",
        "(line 956,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 964,col 51)",
        "(line 966,col 9)-(line 969,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 987,
      "end_line": 1012,
      "comment": "\r\n     * Draws a line perpendicular to the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 38)",
        "(line 991,col 9)-(line 993,col 9)",
        "(line 995,col 9)-(line 995,col 60)",
        "(line 996,col 9)-(line 996,col 27)",
        "(line 997,col 9)-(line 998,col 42)",
        "(line 999,col 9)-(line 1006,col 9)",
        "(line 1008,col 9)-(line 1008,col 27)",
        "(line 1009,col 9)-(line 1009,col 29)",
        "(line 1010,col 9)-(line 1010,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1026,
      "end_line": 1055,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 38)",
        "(line 1035,col 9)-(line 1037,col 9)",
        "(line 1039,col 9)-(line 1039,col 60)",
        "(line 1040,col 9)-(line 1040,col 27)",
        "(line 1041,col 9)-(line 1041,col 80)",
        "(line 1042,col 9)-(line 1049,col 9)",
        "(line 1051,col 9)-(line 1051,col 27)",
        "(line 1052,col 9)-(line 1052,col 29)",
        "(line 1053,col 9)-(line 1053,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1066,
      "end_line": 1221,
      "comment": "\r\n     * Draws a vertical line on the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1236,
      "end_line": 1255,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker area.\r\n     * @param markerOffset  the marker label offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1244,col 9)-(line 1244,col 38)",
        "(line 1245,col 9)-(line 1252,col 9)",
        "(line 1253,col 9)-(line 1253,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1266,
      "end_line": 1418,
      "comment": "\r\n     * Draws a horizontal line across the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param rangeAxis  the range axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1432,
      "end_line": 1451,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the marker area.\r\n     * @param markerOffset  the marker offset.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1440,col 9)-(line 1440,col 38)",
        "(line 1441,col 9)-(line 1448,col 9)",
        "(line 1449,col 9)-(line 1449,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.clone()",
      "begin_line": 1461,
      "end_line": 1513,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the renderer does not support\r\n     *         cloning.\r\n     ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1462,col 78)",
        "(line 1465,col 9)-(line 1466,col 67)",
        "(line 1467,col 9)-(line 1471,col 9)",
        "(line 1473,col 9)-(line 1474,col 65)",
        "(line 1475,col 9)-(line 1479,col 9)",
        "(line 1481,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1488,col 9)",
        "(line 1489,col 9)-(line 1492,col 9)",
        "(line 1494,col 9)-(line 1495,col 44)",
        "(line 1496,col 9)-(line 1497,col 44)",
        "(line 1499,col 9)-(line 1502,col 9)",
        "(line 1503,col 9)-(line 1506,col 9)",
        "(line 1507,col 9)-(line 1510,col 9)",
        "(line 1512,col 9)-(line 1512,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.equals(java.lang.Object)",
      "begin_line": 1522,
      "end_line": 1573,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1523,col 9)-(line 1525,col 9)",
        "(line 1526,col 9)-(line 1528,col 9)",
        "(line 1529,col 9)-(line 1529,col 67)",
        "(line 1530,col 9)-(line 1532,col 9)",
        "(line 1533,col 9)-(line 1536,col 9)",
        "(line 1537,col 9)-(line 1539,col 9)",
        "(line 1540,col 9)-(line 1543,col 9)",
        "(line 1544,col 9)-(line 1546,col 9)",
        "(line 1547,col 9)-(line 1550,col 9)",
        "(line 1551,col 9)-(line 1553,col 9)",
        "(line 1554,col 9)-(line 1556,col 9)",
        "(line 1557,col 9)-(line 1559,col 9)",
        "(line 1560,col 9)-(line 1563,col 9)",
        "(line 1564,col 9)-(line 1567,col 9)",
        "(line 1568,col 9)-(line 1571,col 9)",
        "(line 1572,col 9)-(line 1572,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getDrawingSupplier()",
      "begin_line": 1580,
      "end_line": 1587,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 38)",
        "(line 1582,col 9)-(line 1582,col 29)",
        "(line 1583,col 9)-(line 1585,col 9)",
        "(line 1586,col 9)-(line 1586,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.updateCrosshairValues(org.jfree.chart.plot.CrosshairState, double, double, int, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1607,
      "end_line": 1636,
      "comment": "\r\n     * Considers the current (x, y) coordinate and updates the crosshair point\r\n     * if it meets the criteria (usually means the (x, y) coordinate is the\r\n     * closest to the anchor point so far).\r\n     *\r\n     * @param crosshairState  the crosshair state (\u003ccode\u003enull\u003c/code\u003e permitted,\r\n     *                        but the method does nothing in that case).\r\n     * @param x  the x-value (in data space).\r\n     * @param y  the y-value (in data space).\r\n     * @param domainAxisIndex  the index of the domain axis for the point.\r\n     * @param rangeAxisIndex  the index of the range axis for the point.\r\n     * @param transX  the x-value translated to Java2D space.\r\n     * @param transY  the y-value translated to Java2D space.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1613,col 9)",
        "(line 1615,col 9)-(line 1634,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.xy.XYDataset, int, int, double, double, boolean)",
      "begin_line": 1651,
      "end_line": 1681,
      "comment": "\r\n     * Draws an item label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the orientation.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param negative  indicates a negative value (which affects the item\r\n     *                  label position).\r\n     ",
      "child_ranges": [
        "(line 1655,col 9)-(line 1655,col 77)",
        "(line 1656,col 9)-(line 1679,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1693,
      "end_line": 1717,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 1700,col 9)-(line 1700,col 33)",
        "(line 1701,col 9)-(line 1710,col 9)",
        "(line 1711,col 9)-(line 1715,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.xy.XYDataset, int, int, double, double)",
      "begin_line": 1733,
      "end_line": 1757,
      "comment": "\r\n     * Adds an entity to the collection.\r\n     *\r\n     * @param entities  the entity collection being populated.\r\n     * @param area  the entity area (if \u003ccode\u003enull\u003c/code\u003e a default will be\r\n     *              used).\r\n     * @param dataset  the dataset.\r\n     * @param series  the series.\r\n     * @param item  the item.\r\n     * @param entityX  the entity\u0027s center x-coordinate in user space (only \r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param entityY  the entity\u0027s center y-coordinate in user space (only \r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1736,col 9)-(line 1738,col 9)",
        "(line 1739,col 9)-(line 1743,col 9)",
        "(line 1744,col 9)-(line 1744,col 26)",
        "(line 1745,col 9)-(line 1745,col 73)",
        "(line 1746,col 9)-(line 1748,col 9)",
        "(line 1749,col 9)-(line 1749,col 26)",
        "(line 1750,col 9)-(line 1750,col 63)",
        "(line 1751,col 9)-(line 1753,col 9)",
        "(line 1754,col 9)-(line 1755,col 26)",
        "(line 1756,col 9)-(line 1756,col 29)"
      ]
    }
  ]
}