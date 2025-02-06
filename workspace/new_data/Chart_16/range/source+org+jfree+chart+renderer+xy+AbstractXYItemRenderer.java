{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/AbstractXYItemRenderer.java",
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
      "begin_line": 166,
      "end_line": 1753,
      "comment": "\r\n * A base class that can be used to create new {@link XYItemRenderer}\r\n * implementations.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The plot. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelGeneratorList"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " A list of item label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelGenerator"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " The base item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGeneratorList"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " A list of tool tip generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseToolTipGenerator"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " The base tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGeneratorList"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " A list of URL generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseURLGenerator"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " The URL text generator. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAnnotations"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": "\r\n     * Annotations to be drawn in the background layer (\u0027underneath\u0027 the data\r\n     * items).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAnnotations"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": "\r\n     * Annotations to be drawn in the foreground layer (\u0027on top\u0027 of the data\r\n     * items).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultEntityRadius"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " The default radius for the entity \u0027hotspot\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemLabelGenerator"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The legend item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemToolTipGenerator"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " The legend item tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemURLGenerator"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The legend item URL generator. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.AbstractXYItemRenderer()",
      "begin_line": 223,
      "end_line": 234,
      "comment": "\r\n     * Creates a renderer where the tooltip generator and the URL generator are\r\n     * both \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 16)",
        "(line 225,col 9)-(line 225,col 55)",
        "(line 226,col 9)-(line 226,col 53)",
        "(line 227,col 9)-(line 227,col 49)",
        "(line 228,col 9)-(line 228,col 37)",
        "(line 229,col 9)-(line 229,col 63)",
        "(line 230,col 9)-(line 230,col 63)",
        "(line 231,col 9)-(line 231,col 37)",
        "(line 232,col 9)-(line 233,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getPassCount()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the number of passes through the data that the renderer requires\r\n     * in order to draw the chart.  Most charts will require a single pass, but\r\n     * some require two passes.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getPlot()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns the plot that the renderer is assigned to.\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setPlot(org.jfree.chart.plot.XYPlot)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\r\n     * Sets the plot that the renderer is assigned to.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 282,
      "end_line": 291,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be\r\n     * passed to all subsequent calls to the drawItem() method.\r\n     * \u003cP\u003e\r\n     * This method will be called before the first item is rendered, giving the\r\n     * renderer an opportunity to initialise any state information it wants to\r\n     * maintain.  The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return The renderer state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 66)",
        "(line 289,col 9)-(line 289,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getItemLabelGenerator(int, int)",
      "begin_line": 306,
      "end_line": 313,
      "comment": "\r\n     * Returns the label generator for a data item.  This implementation simply\r\n     * passes control to the {@link #getSeriesItemLabelGenerator(int)} method.\r\n     * If, for some reason, you want a different generator for individual\r\n     * items, you can override this method.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 308,col 81)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelGenerator(int, XYItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 337,
      "end_line": 341,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 59)",
        "(line 340,col 9)-(line 340,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 356,
      "end_line": 362,
      "comment": "\r\n     * Sets the item label generator for the specified series and, if \r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the label generator (\u003ccode\u003enull\u003c/code\u003e permitted);\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 59)",
        "(line 359,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator)",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator, boolean)",
      "begin_line": 394,
      "end_line": 400,
      "comment": "\r\n     * Sets the default item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 48)",
        "(line 397,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getToolTipGenerator(int, int)",
      "begin_line": 414,
      "end_line": 421,
      "comment": "\r\n     * Returns the tool tip generator for a data item.  If, for some reason, \r\n     * you want a different generator for individual items, you can override \r\n     * this method.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 416,col 77)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Returns the tool tip generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesToolTipGenerator(int, XYToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 443,
      "end_line": 446,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 458,
      "end_line": 464,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 57)",
        "(line 461,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\r\n     * Returns the base tool tip generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseToolTipGenerator(XYToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator, boolean)",
      "begin_line": 500,
      "end_line": 506,
      "comment": "\r\n     * Sets the default tool tip generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseToolTipGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 46)",
        "(line 503,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getURLGenerator(int, int)",
      "begin_line": 520,
      "end_line": 527,
      "comment": "\r\n     * Returns the URL generator for the specified item.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 522,col 69)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\r\n     * Returns the URL generator for the specified series, if one is defined.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesURLGenerator(int, XYURLGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\r\n     * Sets the URL generator for the specified series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted)\r\n     * \r\n     * @see #getSeriesURLGenerator(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 571,
      "end_line": 577,
      "comment": "\r\n     * Sets the URL generator for the specified series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesURLGenerator(int)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 57)",
        "(line 574,col 9)-(line 576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getBaseURLGenerator()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "\r\n     * Returns the default URL generator.\r\n     * \r\n     * @return The default URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseURLGenerator(XYURLGenerator)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\r\n     * Sets the default URL generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBaseURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator, boolean)",
      "begin_line": 617,
      "end_line": 622,
      "comment": "\r\n     * Sets the default URL generator and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listener?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 42)",
        "(line 619,col 9)-(line 621,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 633,
      "end_line": 636,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addAnnotation(org.jfree.chart.annotations.XYAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 644,
      "end_line": 660,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 671,
      "end_line": 676,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 72)",
        "(line 673,col 9)-(line 673,col 74)",
        "(line 674,col 9)-(line 674,col 55)",
        "(line 675,col 9)-(line 675,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.removeAnnotations()",
      "begin_line": 682,
      "end_line": 686,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 43)",
        "(line 684,col 9)-(line 684,col 43)",
        "(line 685,col 9)-(line 685,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getDefaultEntityRadius()",
      "begin_line": 696,
      "end_line": 698,
      "comment": "\r\n     * Returns the radius of the circle used for the default entity area\r\n     * when no area is specified.\r\n     *\r\n     * @return A radius.\r\n     * \r\n     * @see #setDefaultEntityRadius(int)\r\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setDefaultEntityRadius(int)",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\r\n     * Sets the radius of the circle used for the default entity area\r\n     * when no area is specified.\r\n     *\r\n     * @param radius  the radius.\r\n     * \r\n     * @see #getDefaultEntityRadius()\r\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 731,
      "end_line": 737,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 50)",
        "(line 736,col 9)-(line 736,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 746,
      "end_line": 748,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 758,
      "end_line": 762,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 52)",
        "(line 761,col 9)-(line 761,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 771,
      "end_line": 773,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(XYSeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator)",
      "begin_line": 783,
      "end_line": 786,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 48)",
        "(line 785,col 9)-(line 785,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 799,
      "end_line": 806,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the\r\n     * specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *         \r\n     * @see #findRangeBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 805,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 819,
      "end_line": 826,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *         \r\n     * @see #findDomainBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 825,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItems()",
      "begin_line": 834,
      "end_line": 854,
      "comment": "\r\n     * Returns a (possibly empty) collection of legend items for the series\r\n     * that this renderer is responsible for drawing.\r\n     *\r\n     * @return The legend item collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 65)",
        "(line 839,col 9)-(line 839,col 47)",
        "(line 840,col 9)-(line 840,col 56)",
        "(line 841,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getLegendItem(int, int)",
      "begin_line": 865,
      "end_line": 897,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses\r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 33)",
        "(line 867,col 9)-(line 867,col 34)",
        "(line 868,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 896,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.fillDomainGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 910,
      "end_line": 933,
      "comment": "\r\n     * Fills a band between two values on the axis.  This can be used to color\r\n     * bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the domain axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 914,col 42)",
        "(line 915,col 9)-(line 916,col 42)",
        "(line 917,col 9)-(line 917,col 25)",
        "(line 918,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 926,col 52)",
        "(line 928,col 9)-(line 931,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.fillRangeGridBand(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 946,
      "end_line": 968,
      "comment": "\r\n     * Fills a band between two values on the range axis.  This can be used to\r\n     * color bands between the grid lines.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the range axis.\r\n     * @param dataArea  the data area.\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 950,col 41)",
        "(line 951,col 9)-(line 951,col 79)",
        "(line 952,col 9)-(line 952,col 25)",
        "(line 953,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 961,col 51)",
        "(line 963,col 9)-(line 966,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 984,
      "end_line": 1008,
      "comment": "\r\n     * Draws a line perpendicular to the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 38)",
        "(line 988,col 9)-(line 990,col 9)",
        "(line 992,col 9)-(line 992,col 60)",
        "(line 993,col 9)-(line 993,col 27)",
        "(line 994,col 9)-(line 994,col 81)",
        "(line 995,col 9)-(line 1002,col 9)",
        "(line 1004,col 9)-(line 1004,col 27)",
        "(line 1005,col 9)-(line 1005,col 29)",
        "(line 1006,col 9)-(line 1006,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1022,
      "end_line": 1051,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 38)",
        "(line 1031,col 9)-(line 1033,col 9)",
        "(line 1035,col 9)-(line 1035,col 60)",
        "(line 1036,col 9)-(line 1036,col 27)",
        "(line 1037,col 9)-(line 1037,col 80)",
        "(line 1038,col 9)-(line 1045,col 9)",
        "(line 1047,col 9)-(line 1047,col 27)",
        "(line 1048,col 9)-(line 1048,col 29)",
        "(line 1049,col 9)-(line 1049,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1062,
      "end_line": 1217,
      "comment": "\r\n     * Draws a vertical line on the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1232,
      "end_line": 1251,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker area.\r\n     * @param markerOffset  the marker label offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1240,col 38)",
        "(line 1241,col 9)-(line 1248,col 9)",
        "(line 1249,col 9)-(line 1249,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1262,
      "end_line": 1414,
      "comment": "\r\n     * Draws a horizontal line across the chart to represent a \u0027range marker\u0027.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param rangeAxis  the range axis.\r\n     * @param marker  the marker line.\r\n     * @param dataArea  the axis data area.\r\n     ",
      "child_ranges": [
        "(line 1268,col 9)-(line 1413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1428,
      "end_line": 1447,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the marker area.\r\n     * @param markerOffset  the marker offset.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1436,col 9)-(line 1436,col 38)",
        "(line 1437,col 9)-(line 1444,col 9)",
        "(line 1445,col 9)-(line 1445,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.clone()",
      "begin_line": 1457,
      "end_line": 1509,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the renderer does not support\r\n     *         cloning.\r\n     ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 78)",
        "(line 1461,col 9)-(line 1462,col 67)",
        "(line 1463,col 9)-(line 1467,col 9)",
        "(line 1469,col 9)-(line 1470,col 65)",
        "(line 1471,col 9)-(line 1475,col 9)",
        "(line 1477,col 9)-(line 1480,col 9)",
        "(line 1481,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1488,col 9)",
        "(line 1490,col 9)-(line 1491,col 44)",
        "(line 1492,col 9)-(line 1493,col 44)",
        "(line 1495,col 9)-(line 1498,col 9)",
        "(line 1499,col 9)-(line 1502,col 9)",
        "(line 1503,col 9)-(line 1506,col 9)",
        "(line 1508,col 9)-(line 1508,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.equals(java.lang.Object)",
      "begin_line": 1518,
      "end_line": 1569,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1519,col 9)-(line 1521,col 9)",
        "(line 1522,col 9)-(line 1524,col 9)",
        "(line 1525,col 9)-(line 1525,col 67)",
        "(line 1526,col 9)-(line 1528,col 9)",
        "(line 1529,col 9)-(line 1532,col 9)",
        "(line 1533,col 9)-(line 1535,col 9)",
        "(line 1536,col 9)-(line 1539,col 9)",
        "(line 1540,col 9)-(line 1542,col 9)",
        "(line 1543,col 9)-(line 1546,col 9)",
        "(line 1547,col 9)-(line 1549,col 9)",
        "(line 1550,col 9)-(line 1552,col 9)",
        "(line 1553,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1559,col 9)",
        "(line 1560,col 9)-(line 1563,col 9)",
        "(line 1564,col 9)-(line 1567,col 9)",
        "(line 1568,col 9)-(line 1568,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.getDrawingSupplier()",
      "begin_line": 1576,
      "end_line": 1583,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1577,col 9)-(line 1577,col 38)",
        "(line 1578,col 9)-(line 1578,col 29)",
        "(line 1579,col 9)-(line 1581,col 9)",
        "(line 1582,col 9)-(line 1582,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.updateCrosshairValues(org.jfree.chart.plot.CrosshairState, double, double, int, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1603,
      "end_line": 1632,
      "comment": "\r\n     * Considers the current (x, y) coordinate and updates the crosshair point\r\n     * if it meets the criteria (usually means the (x, y) coordinate is the\r\n     * closest to the anchor point so far).\r\n     *\r\n     * @param crosshairState  the crosshair state (\u003ccode\u003enull\u003c/code\u003e permitted,\r\n     *                        but the method does nothing in that case).\r\n     * @param x  the x-value (in data space).\r\n     * @param y  the y-value (in data space).\r\n     * @param domainAxisIndex  the index of the domain axis for the point.\r\n     * @param rangeAxisIndex  the index of the range axis for the point.\r\n     * @param transX  the x-value translated to Java2D space.\r\n     * @param transY  the y-value translated to Java2D space.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 1607,col 9)-(line 1609,col 9)",
        "(line 1611,col 9)-(line 1630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.xy.XYDataset, int, int, double, double, boolean)",
      "begin_line": 1647,
      "end_line": 1677,
      "comment": "\r\n     * Draws an item label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the orientation.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param negative  indicates a negative value (which affects the item\r\n     *                  label position).\r\n     ",
      "child_ranges": [
        "(line 1651,col 9)-(line 1651,col 77)",
        "(line 1652,col 9)-(line 1675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1689,
      "end_line": 1713,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 1696,col 9)-(line 1696,col 33)",
        "(line 1697,col 9)-(line 1706,col 9)",
        "(line 1707,col 9)-(line 1711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.AbstractXYItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.xy.XYDataset, int, int, double, double)",
      "begin_line": 1727,
      "end_line": 1751,
      "comment": "\r\n     * Adds an entity to the collection.\r\n     *\r\n     * @param entities  the entity collection being populated.\r\n     * @param area  the entity area (if \u003ccode\u003enull\u003c/code\u003e a default will be\r\n     *              used).\r\n     * @param dataset  the dataset.\r\n     * @param series  the series.\r\n     * @param item  the item.\r\n     * @param entityX  the entity\u0027s center x-coordinate in user space.\r\n     * @param entityY  the entity\u0027s center y-coordinate in user space.\r\n     ",
      "child_ranges": [
        "(line 1730,col 9)-(line 1732,col 9)",
        "(line 1733,col 9)-(line 1737,col 9)",
        "(line 1738,col 9)-(line 1738,col 26)",
        "(line 1739,col 9)-(line 1739,col 73)",
        "(line 1740,col 9)-(line 1742,col 9)",
        "(line 1743,col 9)-(line 1743,col 26)",
        "(line 1744,col 9)-(line 1744,col 63)",
        "(line 1745,col 9)-(line 1747,col 9)",
        "(line 1748,col 9)-(line 1749,col 26)",
        "(line 1750,col 9)-(line 1750,col 29)"
      ]
    }
  ]
}