{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/title/LegendTitle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendTitle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.Title",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 101,
      "end_line": 606,
      "comment": "\r\n * A chart title that displays a legend for the data in the chart.\r\n * \u003cP\u003e\r\n * The title can be populated with legend items manually, or you can assign a\r\n * reference to the plot, in which case the legend items will be automatically\r\n * created to match the dataset(s).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ITEM_FONT"
      ],
      "begin_line": 108,
      "end_line": 109,
      "comment": " The default item font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ITEM_PAINT"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The default item paint. "
    },
    {
      "type": "field",
      "varNames": [
        "sources"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The sources for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The background paint (possibly \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemGraphicEdge"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The edge for the legend item graphic relative to the text. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemGraphicAnchor"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The anchor point for the legend item graphic. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemGraphicLocation"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The legend item graphic location. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemGraphicPadding"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The padding for the legend item graphic. "
    },
    {
      "type": "field",
      "varNames": [
        "itemFont"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The item font. "
    },
    {
      "type": "field",
      "varNames": [
        "itemPaint"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The item paint. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelPadding"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The padding for the item labels. "
    },
    {
      "type": "field",
      "varNames": [
        "items"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\r\n     * A container that holds and displays the legend items.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hLayout"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vLayout"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wrapper"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " \r\n     * An optional container for wrapping the legend items (allows for adding\r\n     * a title or other text to the legend). \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.LegendTitle.LegendTitle(org.jfree.chart.LegendItemSource)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Constructs a new (empty) legend for the specified source.\r\n     * \r\n     * @param source  the source.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.LegendTitle.LegendTitle(org.jfree.chart.LegendItemSource, org.jfree.chart.block.Arrangement, org.jfree.chart.block.Arrangement)",
      "begin_line": 174,
      "end_line": 188,
      "comment": "\r\n     * Creates a new legend title with the specified arrangement.\r\n     * \r\n     * @param source  the source.\r\n     * @param hLayout  the horizontal item arrangement (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                 permitted).\r\n     * @param vLayout  the vertical item arrangement (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                 permitted).\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 55)",
        "(line 177,col 9)-(line 177,col 49)",
        "(line 178,col 9)-(line 178,col 31)",
        "(line 179,col 9)-(line 179,col 31)",
        "(line 180,col 9)-(line 180,col 36)",
        "(line 181,col 9)-(line 181,col 56)",
        "(line 182,col 9)-(line 182,col 62)",
        "(line 183,col 9)-(line 183,col 64)",
        "(line 184,col 9)-(line 184,col 80)",
        "(line 185,col 9)-(line 185,col 42)",
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 187,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getSources()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns the legend item sources.\r\n     * \r\n     * @return The sources.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setSources(org.jfree.chart.LegendItemSource[])",
      "begin_line": 205,
      "end_line": 211,
      "comment": "\r\n     * Sets the legend item sources and sends a {@link TitleChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param sources  the sources (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 31)",
        "(line 210,col 9)-(line 210,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getBackgroundPaint()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Returns the background paint.\r\n     * \r\n     * @return The background paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\r\n     * Sets the background paint for the legend and sends a \r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 37)",
        "(line 230,col 9)-(line 230,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getLegendItemGraphicEdge()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\r\n     * Returns the location of the shape within each legend item. \r\n     * \r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setLegendItemGraphicEdge(org.jfree.chart.util.RectangleEdge)",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\r\n     * Sets the location of the shape within each legend item.\r\n     * \r\n     * @param edge  the edge (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 42)",
        "(line 252,col 9)-(line 252,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getLegendItemGraphicAnchor()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Returns the legend item graphic anchor.\r\n     * \r\n     * @return The graphic anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setLegendItemGraphicAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\r\n     * Sets the anchor point used for the graphic in each legend item.\r\n     * \r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getLegendItemGraphicLocation()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\r\n     * Returns the legend item graphic location.\r\n     * \r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setLegendItemGraphicLocation(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\r\n     * Sets the legend item graphic location.\r\n     * \r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getLegendItemGraphicPadding()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\r\n     * Returns the padding that will be applied to each item graphic.\r\n     * \r\n     * @return The padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setLegendItemGraphicPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 309,
      "end_line": 315,
      "comment": "\r\n     * Sets the padding that will be applied to each item graphic in the \r\n     * legend and sends a {@link TitleChangeEvent} to all registered listeners.\r\n     * \r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 48)",
        "(line 314,col 9)-(line 314,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getItemFont()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Returns the item font.\r\n     * \r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setItemFont(java.awt.Font)",
      "begin_line": 332,
      "end_line": 338,
      "comment": "\r\n     * Sets the item font and sends a {@link TitleChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 29)",
        "(line 337,col 9)-(line 337,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getItemPaint()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Returns the item paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setItemPaint(java.awt.Paint)",
      "begin_line": 354,
      "end_line": 360,
      "comment": "\r\n     * Sets the item paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 31)",
        "(line 359,col 9)-(line 359,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getItemLabelPadding()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\r\n     * Returns the padding used for the items labels.\r\n     * \r\n     * @return The padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setItemLabelPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 376,
      "end_line": 382,
      "comment": "\r\n     * Sets the padding used for the item labels in the legend.\r\n     * \r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 40)",
        "(line 381,col 9)-(line 381,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.fetchLegendItems()",
      "begin_line": 387,
      "end_line": 406,
      "comment": "\r\n     * Fetches the latest legend items.\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 27)",
        "(line 389,col 9)-(line 389,col 40)",
        "(line 390,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.createLegendItemBlock(org.jfree.chart.LegendItem)",
      "begin_line": 415,
      "end_line": 448,
      "comment": "\r\n     * Creates a legend item block.\r\n     * \r\n     * @param item  the legend item.\r\n     * \r\n     * @return The block.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 37)",
        "(line 417,col 9)-(line 418,col 37)",
        "(line 419,col 9)-(line 419,col 67)",
        "(line 420,col 9)-(line 420,col 48)",
        "(line 421,col 9)-(line 421,col 35)",
        "(line 422,col 9)-(line 422,col 47)",
        "(line 423,col 9)-(line 423,col 45)",
        "(line 424,col 9)-(line 424,col 48)",
        "(line 425,col 9)-(line 425,col 50)",
        "(line 426,col 9)-(line 426,col 64)",
        "(line 427,col 9)-(line 427,col 51)",
        "(line 428,col 9)-(line 428,col 53)",
        "(line 429,col 9)-(line 429,col 53)",
        "(line 431,col 9)-(line 433,col 37)",
        "(line 434,col 9)-(line 434,col 56)",
        "(line 435,col 9)-(line 435,col 60)",
        "(line 436,col 9)-(line 436,col 55)",
        "(line 437,col 9)-(line 438,col 32)",
        "(line 439,col 9)-(line 439,col 53)",
        "(line 440,col 9)-(line 440,col 35)",
        "(line 441,col 9)-(line 441,col 57)",
        "(line 442,col 9)-(line 442,col 49)",
        "(line 444,col 9)-(line 444,col 61)",
        "(line 445,col 9)-(line 445,col 31)",
        "(line 447,col 9)-(line 447,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.getItemContainer()",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\r\n     * Returns the container that holds the legend items.\r\n     * \r\n     * @return The container for the legend items.\r\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 468,
      "end_line": 483,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and \r\n     * returns the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 37)",
        "(line 470,col 9)-(line 470,col 27)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 48)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 64)",
        "(line 479,col 9)-(line 479,col 47)",
        "(line 480,col 9)-(line 480,col 58)",
        "(line 481,col 9)-(line 481,col 55)",
        "(line 482,col 9)-(line 482,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the available area for the title.\r\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 506,
      "end_line": 522,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return An {@link org.jfree.chart.block.EntityBlockResult} or \r\n     *         \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 56)",
        "(line 508,col 9)-(line 508,col 36)",
        "(line 509,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 39)",
        "(line 514,col 9)-(line 514,col 32)",
        "(line 515,col 9)-(line 515,col 40)",
        "(line 516,col 9)-(line 516,col 48)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 37)",
        "(line 521,col 9)-(line 521,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.setWrapper(org.jfree.chart.block.BlockContainer)",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\r\n     * Sets the wrapper container for the legend.\r\n     * \r\n     * @param wrapper  the wrapper container.\r\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.equals(java.lang.Object)",
      "begin_line": 540,
      "end_line": 576,
      "comment": "\r\n     * Tests this title for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 45)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 585,
      "end_line": 589,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 36)",
        "(line 587,col 9)-(line 587,col 65)",
        "(line 588,col 9)-(line 588,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendTitle.readObject(java.io.ObjectInputStream)",
      "begin_line": 599,
      "end_line": 604,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 35)",
        "(line 602,col 9)-(line 602,col 65)",
        "(line 603,col 9)-(line 603,col 59)"
      ]
    }
  ]
}