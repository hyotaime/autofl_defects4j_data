{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/LegendItem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendItem",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 88,
      "end_line": 882,
      "comment": "\r\n * A temporary storage object for recording the properties of a legend item, \r\n * without any consideration for layout issues. \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\r\n     * The dataset.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\r\n     * The series key.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasetIndex"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The dataset index. "
    },
    {
      "type": "field",
      "varNames": [
        "series"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The series index. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The label. "
    },
    {
      "type": "field",
      "varNames": [
        "attributedLabel"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The attributed label (if null, fall back to the regular label). "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " \r\n     * The description (not currently used - could be displayed as a tool tip). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " The tool tip text. "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " The url text. "
    },
    {
      "type": "field",
      "varNames": [
        "shapeVisible"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " A flag that controls whether or not the shape is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The shape. "
    },
    {
      "type": "field",
      "varNames": [
        "shapeFilled"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " A flag that controls whether or not the shape is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintTransformer"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " \r\n     * A gradient paint transformer. \r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeOutlineVisible"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " A flag that controls whether or not the shape outline is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "lineVisible"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " A flag that controls whether or not the line is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The line. "
    },
    {
      "type": "field",
      "varNames": [
        "lineStroke"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "linePaint"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "UNUSED_SHAPE"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\r\n     * The shape must be non-null for a LegendItem - if no shape is required,\r\n     * use this.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNUSED_STROKE"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\r\n     * The stroke must be non-null for a LegendItem - if no stroke is required,\r\n     * use this.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Paint)",
      "begin_line": 194,
      "end_line": 205,
      "comment": "\r\n     * Creates a legend item with a filled shape.  The shape is not outlined,\r\n     * and no line is visible.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 203,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Paint, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 222,
      "end_line": 234,
      "comment": "\r\n     * Creates a legend item with a filled and outlined shape.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                       permitted).\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                      permitted).\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 232,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 247,
      "end_line": 256,
      "comment": "\r\n     * Creates a legend item using a line.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lineStroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param linePaint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 255,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.awt.Shape, boolean, java.awt.Paint, boolean, java.awt.Paint, java.awt.Stroke, boolean, java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 283,
      "end_line": 325,
      "comment": "\r\n     * Creates a new legend item.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (not currently used, \r\n     *        \u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shapeVisible  a flag that controls whether or not the shape is \r\n     *                      displayed.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shapeFilled  a flag that controls whether or not the shape is \r\n     *                     filled.\r\n     * @param fillPaint  the fill paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param shapeOutlineVisible  a flag that controls whether or not the \r\n     *                             shape is outlined.\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                       permitted).\r\n     * @param lineVisible  a flag that controls whether or not the line is \r\n     *                     visible.\r\n     * @param line  the line.\r\n     * @param lineStroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param linePaint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 27)",
        "(line 309,col 9)-(line 309,col 36)",
        "(line 310,col 9)-(line 310,col 39)",
        "(line 311,col 9)-(line 311,col 41)",
        "(line 312,col 9)-(line 312,col 27)",
        "(line 313,col 9)-(line 313,col 39)",
        "(line 314,col 9)-(line 314,col 35)",
        "(line 315,col 9)-(line 315,col 75)",
        "(line 316,col 9)-(line 316,col 55)",
        "(line 317,col 9)-(line 317,col 41)",
        "(line 318,col 9)-(line 318,col 43)",
        "(line 319,col 9)-(line 319,col 39)",
        "(line 320,col 9)-(line 320,col 25)",
        "(line 321,col 9)-(line 321,col 37)",
        "(line 322,col 9)-(line 322,col 35)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.text.AttributedString, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Paint)",
      "begin_line": 339,
      "end_line": 350,
      "comment": "\r\n     * Creates a legend item with a filled shape.  The shape is not outlined,\r\n     * and no line is visible.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 348,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.text.AttributedString, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Paint, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 367,
      "end_line": 378,
      "comment": "\r\n     * Creates a legend item with a filled and outlined shape.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                       permitted).\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                      permitted).\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 377,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.text.AttributedString, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 391,
      "end_line": 401,
      "comment": "\r\n     * Creates a legend item using a line.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lineStroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param linePaint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 400,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.text.AttributedString, java.lang.String, java.lang.String, java.lang.String, boolean, java.awt.Shape, boolean, java.awt.Paint, boolean, java.awt.Paint, java.awt.Stroke, boolean, java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 428,
      "end_line": 470,
      "comment": "\r\n     * Creates a new legend item.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (not currently used, \r\n     *        \u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shapeVisible  a flag that controls whether or not the shape is \r\n     *                      displayed.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shapeFilled  a flag that controls whether or not the shape is \r\n     *                     filled.\r\n     * @param fillPaint  the fill paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param shapeOutlineVisible  a flag that controls whether or not the \r\n     *                             shape is outlined.\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                       permitted).\r\n     * @param lineVisible  a flag that controls whether or not the line is \r\n     *                     visible.\r\n     * @param line  the line.\r\n     * @param lineStroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param linePaint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 68)",
        "(line 454,col 9)-(line 454,col 37)",
        "(line 455,col 9)-(line 455,col 39)",
        "(line 456,col 9)-(line 456,col 41)",
        "(line 457,col 9)-(line 457,col 27)",
        "(line 458,col 9)-(line 458,col 39)",
        "(line 459,col 9)-(line 459,col 35)",
        "(line 460,col 9)-(line 460,col 75)",
        "(line 461,col 9)-(line 461,col 55)",
        "(line 462,col 9)-(line 462,col 41)",
        "(line 463,col 9)-(line 463,col 43)",
        "(line 464,col 9)-(line 464,col 39)",
        "(line 465,col 9)-(line 465,col 25)",
        "(line 466,col 9)-(line 466,col 37)",
        "(line 467,col 9)-(line 467,col 35)",
        "(line 468,col 9)-(line 468,col 39)",
        "(line 469,col 9)-(line 469,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.characterIteratorToString(java.text.CharacterIterator)",
      "begin_line": 479,
      "end_line": 495,
      "comment": "\r\n     * Returns a string containing the characters from the given iterator.\r\n     * \r\n     * @param iterator  the iterator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 46)",
        "(line 481,col 9)-(line 481,col 50)",
        "(line 482,col 9)-(line 482,col 42)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 39)",
        "(line 487,col 9)-(line 487,col 18)",
        "(line 488,col 9)-(line 488,col 34)",
        "(line 489,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getDataset()",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\r\n     * Returns the dataset.\r\n     * \r\n     * @return The dataset.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setDatasetIndex(int)\r\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setDataset(org.jfree.data.general.Dataset)",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\r\n     * Sets the dataset.\r\n     * \r\n     * @param dataset  the dataset.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getDatasetIndex()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\r\n     * Returns the dataset index for this legend item.\r\n     * \r\n     * @return The dataset index.\r\n     * \r\n     * @since 1.0.2\r\n     * \r\n     * @see #setDatasetIndex(int)\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setDatasetIndex(int)",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\r\n     * Sets the dataset index for this legend item.\r\n     * \r\n     * @param index  the index.\r\n     * \r\n     * @since 1.0.2\r\n     * \r\n     * @see #getDatasetIndex()\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getSeriesKey()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\r\n     * Returns the series key.\r\n     * \r\n     * @return The series key.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setSeriesKey(Comparable)\r\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setSeriesKey(java.lang.Comparable)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\r\n     * Sets the series key.\r\n     * \r\n     * @param key  the series key.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getSeriesIndex()",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\r\n     * Returns the series index for this legend item.\r\n     * \r\n     * @return The series index.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setSeriesIndex(int)",
      "begin_line": 590,
      "end_line": 592,
      "comment": "\r\n     * Sets the series index for this legend item.\r\n     * \r\n     * @param index  the index.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLabel()",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\r\n     * Returns the label.\r\n     *\r\n     * @return The label (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getAttributedLabel()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\r\n     * Returns the attributed label.\r\n     *\r\n     * @return The attributed label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getDescription()",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\r\n     * Returns the description for the legend item.\r\n     * \r\n     * @return The description.\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getToolTipText()",
      "begin_line": 626,
      "end_line": 628,
      "comment": "\r\n     * Returns the tool tip text.\r\n     * \r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getURLText()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\r\n     * Returns the URL text.\r\n     * \r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.isShapeVisible()",
      "begin_line": 644,
      "end_line": 646,
      "comment": "\r\n     * Returns a flag that indicates whether or not the shape is visible.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getShape()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\r\n     * Returns the shape used to label the series represented by this legend \r\n     * item.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.isShapeFilled()",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\r\n     * Returns a flag that controls whether or not the shape is filled.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getFillPaint()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\r\n     * Returns the fill paint.\r\n     *\r\n     * @return The fill paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.isShapeOutlineVisible()",
      "begin_line": 682,
      "end_line": 684,
      "comment": "\r\n     * Returns the flag that controls whether or not the shape outline\r\n     * is visible.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLineStroke()",
      "begin_line": 691,
      "end_line": 693,
      "comment": "\r\n     * Returns the line stroke for the series.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLinePaint()",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\r\n     * Returns the paint used for lines.\r\n     * \r\n     * @return The paint.\r\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getOutlinePaint()",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\r\n     * Returns the outline paint.\r\n     *\r\n     * @return The outline paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getOutlineStroke()",
      "begin_line": 718,
      "end_line": 720,
      "comment": "\r\n     * Returns the outline stroke.\r\n     *\r\n     * @return The outline stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.isLineVisible()",
      "begin_line": 727,
      "end_line": 729,
      "comment": "\r\n     * Returns a flag that indicates whether or not the line is visible.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLine()",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\r\n     * Returns the line.\r\n     * \r\n     * @return The line.\r\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getFillPaintTransformer()",
      "begin_line": 750,
      "end_line": 752,
      "comment": "\r\n     * Returns the transformer used when the fill paint is an instance of \r\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\r\n     * \r\n     * @return The transformer (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.4\r\n     * \r\n     * @see #setFillPaintTransformer(GradientPaintTransformer)\r\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setFillPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 764,
      "end_line": 769,
      "comment": "\r\n     * Sets the transformer used when the fill paint is an instance of \r\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\r\n     * \r\n     * @param transformer  the transformer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.4\r\n     * \r\n     * @see #getFillPaintTransformer()\r\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.equals(java.lang.Object)",
      "begin_line": 778,
      "end_line": 840,
      "comment": "\r\n     * Tests this item for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 43)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 849,
      "end_line": 859,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 36)",
        "(line 851,col 9)-(line 851,col 76)",
        "(line 852,col 9)-(line 852,col 55)",
        "(line 853,col 9)-(line 853,col 59)",
        "(line 854,col 9)-(line 854,col 64)",
        "(line 855,col 9)-(line 855,col 62)",
        "(line 856,col 9)-(line 856,col 54)",
        "(line 857,col 9)-(line 857,col 61)",
        "(line 858,col 9)-(line 858,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.readObject(java.io.ObjectInputStream)",
      "begin_line": 869,
      "end_line": 880,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 35)",
        "(line 872,col 9)-(line 872,col 76)",
        "(line 873,col 9)-(line 873,col 55)",
        "(line 874,col 9)-(line 874,col 59)",
        "(line 875,col 9)-(line 875,col 64)",
        "(line 876,col 9)-(line 876,col 62)",
        "(line 877,col 9)-(line 877,col 54)",
        "(line 878,col 9)-(line 878,col 61)",
        "(line 879,col 9)-(line 879,col 59)"
      ]
    }
  ]
}