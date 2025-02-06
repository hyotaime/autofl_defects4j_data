{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/editor/DefaultPlotEditor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultPlotEditor",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel",
        "java.awt.event.ActionListener"
      ],
      "begin_line": 85,
      "end_line": 634,
      "comment": "\r\n * A panel for editing the properties of a {@link Plot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "orientationNames"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Orientation constants. "
    },
    {
      "type": "field",
      "varNames": [
        "ORIENTATION_VERTICAL"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ORIENTATION_HORIZONTAL"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaintSample"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The paint (color) used to fill the background of the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStrokeSample"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The stroke (pen) used to draw the outline of the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaintSample"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The paint (color) used to draw the outline of the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisPropertyPanel"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " \r\n     * A panel used to display/edit the properties of the domain axis (if any). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisPropertyPanel"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " \r\n     * A panel used to display/edit the properties of the range axis (if any).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "availableStrokeSamples"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " An array of stroke samples to choose from. "
    },
    {
      "type": "field",
      "varNames": [
        "plotInsets"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The insets for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "plotOrientation"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " \r\n     * The orientation for the plot (for \u003ctt\u003eCategoryPlot\u003c/tt\u003es and \r\n     * \u003ctt\u003eXYPlot\u003c/tt\u003es). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "orientationCombo"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " \r\n     * The orientation combo box (for \u003ctt\u003eCategoryPlot\u003c/tt\u003es and \r\n     * \u003ctt\u003eXYPlot\u003c/tt\u003es). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawLines"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Whether or not to draw lines between each data point (for\r\n     * \u003ctt\u003eLineAndShapeRenderer\u003c/tt\u003es and \u003ctt\u003eStandardXYItemRenderer\u003c/tt\u003es).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawLinesCheckBox"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\r\n     * The checkbox for whether or not to draw lines between each data point.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawShapes"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Whether or not to draw shapes at each data point (for\r\n     * \u003ctt\u003eLineAndShapeRenderer\u003c/tt\u003es and \u003ctt\u003eStandardXYItemRenderer\u003c/tt\u003es).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawShapesCheckBox"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\r\n     * The checkbox for whether or not to draw shapes at each data point.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 150,
      "end_line": 151,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.DefaultPlotEditor(org.jfree.chart.plot.Plot)",
      "begin_line": 164,
      "end_line": 353,
      "comment": "\r\n     * Standard constructor - constructs a panel for editing the properties of\r\n     * the specified plot.\r\n     * \u003cP\u003e\r\n     * In designing the panel, we need to be aware that subclasses of Plot will\r\n     * need to implement subclasses of PlotPropertyEditPanel - so we need to\r\n     * leave one or two \u0027slots\u0027 where the subclasses can extend the user\r\n     * interface.\r\n     *\r\n     * @param plot  the plot, which should be changed.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 43)",
        "(line 167,col 9)-(line 167,col 80)",
        "(line 168,col 9)-(line 168,col 77)",
        "(line 169,col 9)-(line 169,col 74)",
        "(line 170,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 38)",
        "(line 195,col 9)-(line 195,col 58)",
        "(line 196,col 9)-(line 197,col 58)",
        "(line 198,col 9)-(line 199,col 58)",
        "(line 200,col 9)-(line 201,col 58)",
        "(line 204,col 9)-(line 204,col 54)",
        "(line 205,col 9)-(line 210,col 10)",
        "(line 212,col 9)-(line 212,col 56)",
        "(line 213,col 9)-(line 217,col 10)",
        "(line 219,col 9)-(line 219,col 55)",
        "(line 220,col 9)-(line 220,col 72)",
        "(line 234,col 9)-(line 236,col 10)",
        "(line 237,col 9)-(line 237,col 83)",
        "(line 238,col 9)-(line 238,col 49)",
        "(line 239,col 9)-(line 239,col 39)",
        "(line 240,col 9)-(line 240,col 47)",
        "(line 241,col 9)-(line 241,col 29)",
        "(line 243,col 9)-(line 245,col 10)",
        "(line 246,col 9)-(line 246,col 75)",
        "(line 247,col 9)-(line 247,col 48)",
        "(line 248,col 9)-(line 248,col 39)",
        "(line 249,col 9)-(line 249,col 46)",
        "(line 250,col 9)-(line 250,col 29)",
        "(line 252,col 9)-(line 254,col 10)",
        "(line 255,col 9)-(line 255,col 75)",
        "(line 256,col 9)-(line 256,col 51)",
        "(line 257,col 9)-(line 257,col 39)",
        "(line 258,col 9)-(line 258,col 49)",
        "(line 259,col 9)-(line 259,col 29)",
        "(line 261,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 50)",
        "(line 303,col 9)-(line 303,col 59)",
        "(line 304,col 9)-(line 304,col 74)",
        "(line 305,col 9)-(line 305,col 52)",
        "(line 307,col 9)-(line 307,col 45)",
        "(line 308,col 9)-(line 308,col 68)",
        "(line 310,col 9)-(line 310,col 31)",
        "(line 311,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 318,col 56)",
        "(line 319,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 30)",
        "(line 330,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 338,col 55)",
        "(line 339,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 76)",
        "(line 350,col 9)-(line 350,col 24)",
        "(line 352,col 9)-(line 352,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getPlotInsets()",
      "begin_line": 360,
      "end_line": 365,
      "comment": "\r\n     * Returns the current plot insets.\r\n     * \r\n     * @return The current plot insets.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getBackgroundPaint()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\r\n     * Returns the current background paint.\r\n     * \r\n     * @return The current background paint.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getOutlineStroke()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\r\n     * Returns the current outline stroke.\r\n     * \r\n     * @return The current outline stroke.\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getOutlinePaint()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\r\n     * Returns the current outline paint.\r\n     * \r\n     * @return The current outline paint.\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getDomainAxisPropertyEditPanel()",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\r\n     * Returns a reference to the panel for editing the properties of the\r\n     * domain axis.\r\n     *\r\n     * @return A reference to a panel.\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.getRangeAxisPropertyEditPanel()",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\r\n     * Returns a reference to the panel for editing the properties of the\r\n     * range axis.\r\n     *\r\n     * @return A reference to a panel.\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 418,
      "end_line": 441,
      "comment": "\r\n     * Handles user actions generated within the panel.\r\n     * @param event     the event\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 50)",
        "(line 420,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptBackgroundPaintSelection()",
      "begin_line": 446,
      "end_line": 455,
      "comment": "\r\n     * Allow the user to change the background paint.\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 16)",
        "(line 448,col 9)-(line 451,col 10)",
        "(line 452,col 9)-(line 454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptOutlineStrokeSelection()",
      "begin_line": 460,
      "end_line": 470,
      "comment": "\r\n     * Allow the user to change the outline stroke.\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 462,col 72)",
        "(line 463,col 9)-(line 465,col 69)",
        "(line 467,col 9)-(line 469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptOutlinePaintSelection()",
      "begin_line": 476,
      "end_line": 484,
      "comment": "\r\n     * Allow the user to change the outline paint.  We use JColorChooser, so\r\n     * the user can only choose colors (a subset of all possible paints).\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 16)",
        "(line 478,col 9)-(line 480,col 10)",
        "(line 481,col 9)-(line 483,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptOrientationSelection()",
      "begin_line": 507,
      "end_line": 517,
      "comment": "\r\n     * Allow the user to modify the plot orientation if this is an editor for a\r\n     * \u003ctt\u003eCategoryPlot\u003c/tt\u003e or a \u003ctt\u003eXYPlot\u003c/tt\u003e.\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 61)",
        "(line 511,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptDrawLinesSelection()",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\r\n     * Allow the user to modify whether or not lines are drawn between data \r\n     * points by \u003ctt\u003eLineAndShapeRenderer\u003c/tt\u003es and \r\n     * \u003ctt\u003eStandardXYItemRenderer\u003c/tt\u003es.\r\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.attemptDrawShapesSelection()",
      "begin_line": 532,
      "end_line": 534,
      "comment": "\r\n     * Allow the user to modify whether or not shapes are drawn at data points\r\n     * by \u003ctt\u003eLineAndShapeRenderer\u003c/tt\u003es and \u003ctt\u003eStandardXYItemRenderer\u003c/tt\u003es.\r\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultPlotEditor.updatePlotProperties(org.jfree.chart.plot.Plot)",
      "begin_line": 541,
      "end_line": 632,
      "comment": "\r\n     * Updates the plot properties to match the properties defined on the panel.\r\n     *\r\n     * @param plot  The plot.\r\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 48)",
        "(line 545,col 9)-(line 545,col 50)",
        "(line 546,col 9)-(line 546,col 54)",
        "(line 547,col 9)-(line 547,col 40)",
        "(line 550,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 578,col 9)",
        "(line 580,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 610,col 9)",
        "(line 612,col 9)-(line 630,col 9)"
      ]
    }
  ]
}