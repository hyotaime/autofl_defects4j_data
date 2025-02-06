{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/LegendItem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendItem",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 96,
      "end_line": 1182,
      "comment": "\r\n * A temporary storage object for recording the properties of a legend item,\r\n * without any consideration for layout issues.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\r\n     * The dataset.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\r\n     * The series key.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasetIndex"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The dataset index. "
    },
    {
      "type": "field",
      "varNames": [
        "series"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The series index. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\r\n     * The label font (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\r\n     * The label paint (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "attributedLabel"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The attributed label (if null, fall back to the regular label). "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\r\n     * The description (not currently used - could be displayed as a tool tip).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The tool tip text. "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The url text. "
    },
    {
      "type": "field",
      "varNames": [
        "shapeVisible"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " A flag that controls whether or not the shape is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The shape. "
    },
    {
      "type": "field",
      "varNames": [
        "shapeFilled"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " A flag that controls whether or not the shape is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintTransformer"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": "\r\n     * A gradient paint transformer.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeOutlineVisible"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " A flag that controls whether or not the shape outline is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " The outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "lineVisible"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " A flag that controls whether or not the line is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " The line. "
    },
    {
      "type": "field",
      "varNames": [
        "lineStroke"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " The stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "linePaint"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " The line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "UNUSED_SHAPE"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\r\n     * The shape must be non-null for a LegendItem - if no shape is required,\r\n     * use this.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNUSED_STROKE"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": "\r\n     * The stroke must be non-null for a LegendItem - if no stroke is required,\r\n     * use this.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Creates a legend item with the specified label.  The remaining\r\n     * attributes take default values.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.awt.Paint)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\r\n     * Creates a legend item with the specified label and fill paint.  The\r\n     * remaining attributes take default values.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 227,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Paint)",
      "begin_line": 242,
      "end_line": 253,
      "comment": "\r\n     * Creates a legend item with a filled shape.  The shape is not outlined,\r\n     * and no line is visible.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 251,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Paint, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 270,
      "end_line": 282,
      "comment": "\r\n     * Creates a legend item with a filled and outlined shape.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                       permitted).\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 280,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 295,
      "end_line": 304,
      "comment": "\r\n     * Creates a legend item using a line.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lineStroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param linePaint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 303,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.awt.Shape, boolean, java.awt.Paint, boolean, java.awt.Paint, java.awt.Stroke, boolean, java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 331,
      "end_line": 374,
      "comment": "\r\n     * Creates a new legend item.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (not currently used,\r\n     *        \u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shapeVisible  a flag that controls whether or not the shape is\r\n     *                      displayed.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shapeFilled  a flag that controls whether or not the shape is\r\n     *                     filled.\r\n     * @param fillPaint  the fill paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param shapeOutlineVisible  a flag that controls whether or not the\r\n     *                             shape is outlined.\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                       permitted).\r\n     * @param lineVisible  a flag that controls whether or not the line is\r\n     *                     visible.\r\n     * @param line  the line.\r\n     * @param lineStroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param linePaint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 27)",
        "(line 357,col 9)-(line 357,col 31)",
        "(line 358,col 9)-(line 358,col 36)",
        "(line 359,col 9)-(line 359,col 39)",
        "(line 360,col 9)-(line 360,col 41)",
        "(line 361,col 9)-(line 361,col 27)",
        "(line 362,col 9)-(line 362,col 39)",
        "(line 363,col 9)-(line 363,col 35)",
        "(line 364,col 9)-(line 364,col 75)",
        "(line 365,col 9)-(line 365,col 55)",
        "(line 366,col 9)-(line 366,col 41)",
        "(line 367,col 9)-(line 367,col 43)",
        "(line 368,col 9)-(line 368,col 39)",
        "(line 369,col 9)-(line 369,col 25)",
        "(line 370,col 9)-(line 370,col 37)",
        "(line 371,col 9)-(line 371,col 35)",
        "(line 372,col 9)-(line 372,col 39)",
        "(line 373,col 9)-(line 373,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.text.AttributedString, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Paint)",
      "begin_line": 388,
      "end_line": 399,
      "comment": "\r\n     * Creates a legend item with a filled shape.  The shape is not outlined,\r\n     * and no line is visible.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 397,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.text.AttributedString, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Paint, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 416,
      "end_line": 427,
      "comment": "\r\n     * Creates a legend item with a filled and outlined shape.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the paint used to fill the shape (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   not permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                       permitted).\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 426,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.text.AttributedString, java.lang.String, java.lang.String, java.lang.String, java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 440,
      "end_line": 449,
      "comment": "\r\n     * Creates a legend item using a line.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lineStroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param linePaint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 448,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendItem.LegendItem(java.text.AttributedString, java.lang.String, java.lang.String, java.lang.String, boolean, java.awt.Shape, boolean, java.awt.Paint, boolean, java.awt.Paint, java.awt.Stroke, boolean, java.awt.Shape, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 476,
      "end_line": 524,
      "comment": "\r\n     * Creates a new legend item.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param description  the description (not currently used,\r\n     *        \u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shapeVisible  a flag that controls whether or not the shape is\r\n     *                      displayed.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param shapeFilled  a flag that controls whether or not the shape is\r\n     *                     filled.\r\n     * @param fillPaint  the fill paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param shapeOutlineVisible  a flag that controls whether or not the\r\n     *                             shape is outlined.\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                       permitted).\r\n     * @param lineVisible  a flag that controls whether or not the line is\r\n     *                     visible.\r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lineStroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param linePaint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 68)",
        "(line 508,col 9)-(line 508,col 37)",
        "(line 509,col 9)-(line 509,col 39)",
        "(line 510,col 9)-(line 510,col 41)",
        "(line 511,col 9)-(line 511,col 27)",
        "(line 512,col 9)-(line 512,col 39)",
        "(line 513,col 9)-(line 513,col 35)",
        "(line 514,col 9)-(line 514,col 75)",
        "(line 515,col 9)-(line 515,col 55)",
        "(line 516,col 9)-(line 516,col 41)",
        "(line 517,col 9)-(line 517,col 43)",
        "(line 518,col 9)-(line 518,col 39)",
        "(line 519,col 9)-(line 519,col 25)",
        "(line 520,col 9)-(line 520,col 37)",
        "(line 521,col 9)-(line 521,col 35)",
        "(line 522,col 9)-(line 522,col 39)",
        "(line 523,col 9)-(line 523,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.characterIteratorToString(java.text.CharacterIterator)",
      "begin_line": 533,
      "end_line": 549,
      "comment": "\r\n     * Returns a string containing the characters from the given iterator.\r\n     *\r\n     * @param iterator  the iterator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 46)",
        "(line 535,col 9)-(line 535,col 50)",
        "(line 536,col 9)-(line 536,col 42)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 39)",
        "(line 541,col 9)-(line 541,col 18)",
        "(line 542,col 9)-(line 542,col 34)",
        "(line 543,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getDataset()",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setDatasetIndex(int)\r\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setDataset(org.jfree.data.general.Dataset)",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\r\n     * Sets the dataset.\r\n     *\r\n     * @param dataset  the dataset.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getDatasetIndex()",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\r\n     * Returns the dataset index for this legend item.\r\n     *\r\n     * @return The dataset index.\r\n     *\r\n     * @since 1.0.2\r\n     *\r\n     * @see #setDatasetIndex(int)\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setDatasetIndex(int)",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\r\n     * Sets the dataset index for this legend item.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @since 1.0.2\r\n     *\r\n     * @see #getDatasetIndex()\r\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getSeriesKey()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\r\n     * Returns the series key.\r\n     *\r\n     * @return The series key.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setSeriesKey(Comparable)\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setSeriesKey(java.lang.Comparable)",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\r\n     * Sets the series key.\r\n     *\r\n     * @param key  the series key.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getSeriesIndex()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\r\n     * Returns the series index for this legend item.\r\n     *\r\n     * @return The series index.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setSeriesIndex(int)",
      "begin_line": 644,
      "end_line": 646,
      "comment": "\r\n     * Sets the series index for this legend item.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLabel()",
      "begin_line": 653,
      "end_line": 655,
      "comment": "\r\n     * Returns the label.\r\n     *\r\n     * @return The label (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLabelFont()",
      "begin_line": 664,
      "end_line": 666,
      "comment": "\r\n     * Returns the label font.\r\n     *\r\n     * @return The label font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setLabelFont(java.awt.Font)",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\r\n     * Sets the label font.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLabelPaint()",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\r\n     * Returns the paint used to draw the label.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setLabelPaint(java.awt.Paint)",
      "begin_line": 697,
      "end_line": 699,
      "comment": "\r\n     * Sets the paint used to draw the label.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getAttributedLabel()",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\r\n     * Returns the attributed label.\r\n     *\r\n     * @return The attributed label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getDescription()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\r\n     * Returns the description for the legend item.\r\n     *\r\n     * @return The description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDescription(java.lang.String)\r\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setDescription(java.lang.String)",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\r\n     * Sets the description for this legend item.\r\n     *\r\n     * @param text  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDescription()\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getToolTipText()",
      "begin_line": 740,
      "end_line": 742,
      "comment": "\r\n     * Returns the tool tip text.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setToolTipText(java.lang.String)\r\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setToolTipText(java.lang.String)",
      "begin_line": 752,
      "end_line": 754,
      "comment": "\r\n     * Sets the tool tip text for this legend item.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getToolTipText()\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getURLText()",
      "begin_line": 763,
      "end_line": 765,
      "comment": "\r\n     * Returns the URL text.\r\n     *\r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setURLText(java.lang.String)\r\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setURLText(java.lang.String)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\r\n     * Sets the URL text.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getURLText()\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.isShapeVisible()",
      "begin_line": 787,
      "end_line": 789,
      "comment": "\r\n     * Returns a flag that indicates whether or not the shape is visible.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setShapeVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setShapeVisible(boolean)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\r\n     * Sets the flag that controls whether or not the shape is visible.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @see #isShapeVisible()\r\n     * @see #isLineVisible()\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getShape()",
      "begin_line": 813,
      "end_line": 815,
      "comment": "\r\n     * Returns the shape used to label the series represented by this legend\r\n     * item.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setShape(java.awt.Shape)\r\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setShape(java.awt.Shape)",
      "begin_line": 825,
      "end_line": 830,
      "comment": "\r\n     * Sets the shape for the legend item.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getShape()\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.isShapeFilled()",
      "begin_line": 837,
      "end_line": 839,
      "comment": "\r\n     * Returns a flag that controls whether or not the shape is filled.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getFillPaint()",
      "begin_line": 846,
      "end_line": 848,
      "comment": "\r\n     * Returns the fill paint.\r\n     *\r\n     * @return The fill paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setFillPaint(java.awt.Paint)",
      "begin_line": 857,
      "end_line": 862,
      "comment": "\r\n     * Sets the fill paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 861,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.isShapeOutlineVisible()",
      "begin_line": 870,
      "end_line": 872,
      "comment": "\r\n     * Returns the flag that controls whether or not the shape outline\r\n     * is visible.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLineStroke()",
      "begin_line": 879,
      "end_line": 881,
      "comment": "\r\n     * Returns the line stroke for the series.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLinePaint()",
      "begin_line": 888,
      "end_line": 890,
      "comment": "\r\n     * Returns the paint used for lines.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setLinePaint(java.awt.Paint)",
      "begin_line": 899,
      "end_line": 904,
      "comment": "\r\n     * Sets the line paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getOutlinePaint()",
      "begin_line": 911,
      "end_line": 913,
      "comment": "\r\n     * Returns the outline paint.\r\n     *\r\n     * @return The outline paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setOutlinePaint(java.awt.Paint)",
      "begin_line": 922,
      "end_line": 927,
      "comment": "\r\n     * Sets the outline paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 926,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getOutlineStroke()",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\r\n     * Returns the outline stroke.\r\n     *\r\n     * @return The outline stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlineStroke(java.awt.Stroke)\r\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 949,
      "end_line": 951,
      "comment": "\r\n     * Sets the outline stroke.\r\n     *\r\n     * @param stroke  the stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getOutlineStroke()\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.isLineVisible()",
      "begin_line": 960,
      "end_line": 962,
      "comment": "\r\n     * Returns a flag that indicates whether or not the line is visible.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setLineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setLineVisible(boolean)",
      "begin_line": 973,
      "end_line": 975,
      "comment": "\r\n     * Sets the flag that controls whether or not the line shape is visible for\r\n     * this legend item.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @see #isLineVisible()\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getLine()",
      "begin_line": 985,
      "end_line": 987,
      "comment": "\r\n     * Returns the line.\r\n     *\r\n     * @return The line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLine(java.awt.Shape)\r\n     * @see #isLineVisible()\r\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setLine(java.awt.Shape)",
      "begin_line": 997,
      "end_line": 1002,
      "comment": "\r\n     * Sets the line.\r\n     *\r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLine()\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 1000,col 9)",
        "(line 1001,col 9)-(line 1001,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.getFillPaintTransformer()",
      "begin_line": 1014,
      "end_line": 1016,
      "comment": "\r\n     * Returns the transformer used when the fill paint is an instance of\r\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\r\n     *\r\n     * @return The transformer (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.4\r\n     *\r\n     * @see #setFillPaintTransformer(GradientPaintTransformer)\r\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.setFillPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 1028,
      "end_line": 1033,
      "comment": "\r\n     * Sets the transformer used when the fill paint is an instance of\r\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\r\n     *\r\n     * @param transformer  the transformer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.4\r\n     *\r\n     * @see #getFillPaintTransformer()\r\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.equals(java.lang.Object)",
      "begin_line": 1042,
      "end_line": 1110,
      "comment": "\r\n     * Tests this item for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 43)",
        "(line 1050,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1055,col 9)",
        "(line 1056,col 9)-(line 1058,col 9)",
        "(line 1059,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1068,col 9)",
        "(line 1069,col 9)-(line 1071,col 9)",
        "(line 1072,col 9)-(line 1074,col 9)",
        "(line 1075,col 9)-(line 1077,col 9)",
        "(line 1078,col 9)-(line 1081,col 9)",
        "(line 1082,col 9)-(line 1084,col 9)",
        "(line 1085,col 9)-(line 1087,col 9)",
        "(line 1088,col 9)-(line 1090,col 9)",
        "(line 1091,col 9)-(line 1093,col 9)",
        "(line 1094,col 9)-(line 1096,col 9)",
        "(line 1097,col 9)-(line 1099,col 9)",
        "(line 1100,col 9)-(line 1102,col 9)",
        "(line 1103,col 9)-(line 1105,col 9)",
        "(line 1106,col 9)-(line 1108,col 9)",
        "(line 1109,col 9)-(line 1109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.clone()",
      "begin_line": 1123,
      "end_line": 1138,
      "comment": "\r\n     * Returns an independent copy of this object (except that the clone will\r\n     * still reference the same dataset as the original\r\n     * \u003ccode\u003eLegendItem\u003c/code\u003e).\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the legend item cannot be cloned.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 54)",
        "(line 1125,col 9)-(line 1128,col 9)",
        "(line 1130,col 9)-(line 1130,col 55)",
        "(line 1131,col 9)-(line 1135,col 9)",
        "(line 1136,col 9)-(line 1136,col 53)",
        "(line 1137,col 9)-(line 1137,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1147,
      "end_line": 1158,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1148,col 36)",
        "(line 1149,col 9)-(line 1149,col 76)",
        "(line 1150,col 9)-(line 1150,col 55)",
        "(line 1151,col 9)-(line 1151,col 59)",
        "(line 1152,col 9)-(line 1152,col 64)",
        "(line 1153,col 9)-(line 1153,col 62)",
        "(line 1154,col 9)-(line 1154,col 54)",
        "(line 1155,col 9)-(line 1155,col 61)",
        "(line 1156,col 9)-(line 1156,col 59)",
        "(line 1157,col 9)-(line 1157,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendItem.readObject(java.io.ObjectInputStream)",
      "begin_line": 1168,
      "end_line": 1180,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 35)",
        "(line 1171,col 9)-(line 1171,col 76)",
        "(line 1172,col 9)-(line 1172,col 55)",
        "(line 1173,col 9)-(line 1173,col 59)",
        "(line 1174,col 9)-(line 1174,col 64)",
        "(line 1175,col 9)-(line 1175,col 62)",
        "(line 1176,col 9)-(line 1176,col 54)",
        "(line 1177,col 9)-(line 1177,col 61)",
        "(line 1178,col 9)-(line 1178,col 59)",
        "(line 1179,col 9)-(line 1179,col 60)"
      ]
    }
  ]
}