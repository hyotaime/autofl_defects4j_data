{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/editor/DefaultPlotEditor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultPlotEditor",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel",
        "java.awt.event.ActionListener"
      ],
      "begin_line": 88,
      "end_line": 614,
      "comment": "\r\n * A panel for editing the properties of a {@link Plot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "orientationNames"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Orientation constants. "
    },
    {
      "type": "field",
      "varNames": [
        "ORIENTATION_VERTICAL"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ORIENTATION_HORIZONTAL"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaintSample"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The paint (color) used to fill the background of the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStrokeSample"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The stroke used to draw the outline of the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaintSample"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The paint (color) used to draw the outline of the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisPropertyPanel"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\r\n     * A panel used to display/edit the properties of the domain axis (if any).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisPropertyPanel"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\r\n     * A panel used to display/edit the properties of the range axis (if any).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "availableStrokeSamples"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " An array of stroke samples to choose from. "
    },
    {
      "type": "field",
      "varNames": [
        "plotInsets"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The insets for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "plotOrientation"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\r\n     * The orientation for the plot (for \u003ctt\u003eCategoryPlot\u003c/tt\u003es and\r\n     * \u003ctt\u003eXYPlot\u003c/tt\u003es).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "orientationCombo"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\r\n     * The orientation combo box (for \u003ctt\u003eCategoryPlot\u003c/tt\u003es and\r\n     * \u003ctt\u003eXYPlot\u003c/tt\u003es).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawLines"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Whether or not to draw lines between each data point (for\r\n     * \u003ctt\u003eLineAndShapeRenderer\u003c/tt\u003es and \u003ctt\u003eStandardXYItemRenderer\u003c/tt\u003es).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawLinesCheckBox"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\r\n     * The checkbox for whether or not to draw lines between each data point.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawShapes"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Whether or not to draw shapes at each data point (for\r\n     * \u003ctt\u003eLineAndShapeRenderer\u003c/tt\u003es and \u003ctt\u003eStandardXYItemRenderer\u003c/tt\u003es).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawShapesCheckBox"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\r\n     * The checkbox for whether or not to draw shapes at each data point.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 153,
      "end_line": 155,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.DefaultPlotEditor(org.jfree.chart.plot.Plot)",
      "begin_line": 168,
      "end_line": 339,
      "comment": "\r\n     * Standard constructor - constructs a panel for editing the properties of\r\n     * the specified plot.\r\n     * \u003cP\u003e\r\n     * In designing the panel, we need to be aware that subclasses of Plot will\r\n     * need to implement subclasses of PlotPropertyEditPanel - so we need to\r\n     * leave one or two \u0027slots\u0027 where the subclasses can extend the user\r\n     * interface.\r\n     *\r\n     * @param plot  the plot, which should be changed.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 43)",
        "(line 170,col 9)-(line 170,col 80)",
        "(line 171,col 9)-(line 171,col 77)",
        "(line 172,col 9)-(line 172,col 74)",
        "(line 173,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 38)",
        "(line 198,col 9)-(line 198,col 58)",
        "(line 199,col 9)-(line 199,col 64)",
        "(line 200,col 9)-(line 201,col 39)",
        "(line 202,col 9)-(line 203,col 39)",
        "(line 204,col 9)-(line 205,col 39)",
        "(line 208,col 9)-(line 208,col 54)",
        "(line 209,col 9)-(line 211,col 57)",
        "(line 213,col 9)-(line 213,col 56)",
        "(line 214,col 9)-(line 215,col 61)",
        "(line 217,col 9)-(line 217,col 55)",
        "(line 218,col 9)-(line 218,col 72)",
        "(line 232,col 9)-(line 233,col 36)",
        "(line 234,col 9)-(line 235,col 30)",
        "(line 236,col 9)-(line 236,col 49)",
        "(line 237,col 9)-(line 237,col 39)",
        "(line 238,col 9)-(line 238,col 47)",
        "(line 239,col 9)-(line 239,col 29)",
        "(line 241,col 9)-(line 242,col 35)",
        "(line 243,col 9)-(line 243,col 75)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 39)",
        "(line 246,col 9)-(line 246,col 46)",
        "(line 247,col 9)-(line 247,col 29)",
        "(line 249,col 9)-(line 250,col 38)",
        "(line 251,col 9)-(line 251,col 75)",
        "(line 252,col 9)-(line 252,col 51)",
        "(line 253,col 9)-(line 253,col 39)",
        "(line 254,col 9)-(line 254,col 49)",
        "(line 255,col 9)-(line 255,col 29)",
        "(line 257,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 294,col 50)",
        "(line 296,col 9)-(line 296,col 59)",
        "(line 297,col 9)-(line 297,col 74)",
        "(line 298,col 9)-(line 298,col 52)",
        "(line 300,col 9)-(line 300,col 45)",
        "(line 301,col 9)-(line 301,col 68)",
        "(line 303,col 9)-(line 303,col 31)",
        "(line 304,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 311,col 28)",
        "(line 312,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 30)",
        "(line 320,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 79)",
        "(line 328,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 76)",
        "(line 336,col 9)-(line 336,col 24)",
        "(line 338,col 9)-(line 338,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getPlotInsets()",
      "begin_line": 346,
      "end_line": 351,
      "comment": "\r\n     * Returns the current plot insets.\r\n     *\r\n     * @return The current plot insets.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getBackgroundPaint()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\r\n     * Returns the current background paint.\r\n     *\r\n     * @return The current background paint.\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getOutlineStroke()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\r\n     * Returns the current outline stroke.\r\n     *\r\n     * @return The current outline stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getOutlinePaint()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\r\n     * Returns the current outline paint.\r\n     *\r\n     * @return The current outline paint.\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getDomainAxisPropertyEditPanel()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\r\n     * Returns a reference to the panel for editing the properties of the\r\n     * domain axis.\r\n     *\r\n     * @return A reference to a panel.\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getRangeAxisPropertyEditPanel()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\r\n     * Returns a reference to the panel for editing the properties of the\r\n     * range axis.\r\n     *\r\n     * @return A reference to a panel.\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 404,
      "end_line": 427,
      "comment": "\r\n     * Handles user actions generated within the panel.\r\n     * @param event     the event\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 50)",
        "(line 406,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptBackgroundPaintSelection()",
      "begin_line": 432,
      "end_line": 439,
      "comment": "\r\n     * Allow the user to change the background paint.\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 16)",
        "(line 434,col 9)-(line 435,col 49)",
        "(line 436,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptOutlineStrokeSelection()",
      "begin_line": 444,
      "end_line": 454,
      "comment": "\r\n     * Allow the user to change the outline stroke.\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 446,col 71)",
        "(line 447,col 9)-(line 449,col 69)",
        "(line 451,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptOutlinePaintSelection()",
      "begin_line": 460,
      "end_line": 467,
      "comment": "\r\n     * Allow the user to change the outline paint.  We use JColorChooser, so\r\n     * the user can only choose colors (a subset of all possible paints).\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 16)",
        "(line 462,col 9)-(line 463,col 46)",
        "(line 464,col 9)-(line 466,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptOrientationSelection()",
      "begin_line": 490,
      "end_line": 500,
      "comment": "\r\n     * Allow the user to modify the plot orientation if this is an editor for a\r\n     * \u003ctt\u003eCategoryPlot\u003c/tt\u003e or a \u003ctt\u003eXYPlot\u003c/tt\u003e.\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 61)",
        "(line 494,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptDrawLinesSelection()",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\r\n     * Allow the user to modify whether or not lines are drawn between data\r\n     * points by \u003ctt\u003eLineAndShapeRenderer\u003c/tt\u003es and\r\n     * \u003ctt\u003eStandardXYItemRenderer\u003c/tt\u003es.\r\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptDrawShapesSelection()",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\r\n     * Allow the user to modify whether or not shapes are drawn at data points\r\n     * by \u003ctt\u003eLineAndShapeRenderer\u003c/tt\u003es and \u003ctt\u003eStandardXYItemRenderer\u003c/tt\u003es.\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.updatePlotProperties(org.jfree.chart.plot.Plot)",
      "begin_line": 524,
      "end_line": 612,
      "comment": "\r\n     * Updates the plot properties to match the properties defined on the panel.\r\n     *\r\n     * @param plot  The plot.\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 48)",
        "(line 528,col 9)-(line 528,col 50)",
        "(line 529,col 9)-(line 529,col 54)",
        "(line 530,col 9)-(line 530,col 40)",
        "(line 533,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 561,col 9)",
        "(line 563,col 9)-(line 572,col 9)",
        "(line 574,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 610,col 9)"
      ]
    }
  ]
}