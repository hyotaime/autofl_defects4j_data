{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/editor/DefaultAxisEditor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultAxisEditor",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel",
        "java.awt.event.ActionListener"
      ],
      "begin_line": 75,
      "end_line": 519,
      "comment": "\r\n * A panel for editing the properties of an axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The label font. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaintSample"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFontField"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " A field showing a description of the label font. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The font for displaying tick labels on the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFontField"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\r\n     * A field containing a description of the font for displaying tick labels\r\n     * on the axis.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaintSample"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The paint (color) for the tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "slot1"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\r\n     * An empty sub-panel for extending the user interface to handle more\r\n     * complex axes.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "slot2"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\r\n     * An empty sub-panel for extending the user interface to handle more\r\n     * complex axes.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "showTickLabelsCheckBox"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " A flag that indicates whether or not the tick labels are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "showTickMarksCheckBox"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " A flag that indicates whether or not the tick marks are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelInsets"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The tick label insets. "
    },
    {
      "type": "field",
      "varNames": [
        "labelInsets"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The label insets. "
    },
    {
      "type": "field",
      "varNames": [
        "otherTabs"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " A tabbed pane for... "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 135,
      "end_line": 137,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getInstance(org.jfree.chart.axis.Axis)",
      "begin_line": 148,
      "end_line": 164,
      "comment": "\r\n     * A static method that returns a panel that is appropriate for the axis\r\n     * type.\r\n     *\r\n     * @param axis  the axis whose properties are to be displayed/edited in\r\n     *              the panel.\r\n     *\r\n     * @return A panel or \u003ccode\u003enull\u003c/code\u003c if axis is \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.DefaultAxisEditor(org.jfree.chart.axis.Axis)",
      "begin_line": 173,
      "end_line": 290,
      "comment": "\r\n     * Standard constructor: builds a panel for displaying/editing the\r\n     * properties of the specified axis.\r\n     *\r\n     * @param axis  the axis whose properties are to be displayed/edited in\r\n     *              the panel.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 45)",
        "(line 176,col 9)-(line 176,col 70)",
        "(line 177,col 9)-(line 177,col 53)",
        "(line 178,col 9)-(line 178,col 78)",
        "(line 181,col 9)-(line 181,col 57)",
        "(line 182,col 9)-(line 182,col 49)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 186,col 9)-(line 186,col 56)",
        "(line 187,col 9)-(line 192,col 10)",
        "(line 194,col 9)-(line 194,col 55)",
        "(line 195,col 9)-(line 195,col 72)",
        "(line 196,col 9)-(line 196,col 75)",
        "(line 197,col 9)-(line 197,col 53)",
        "(line 198,col 9)-(line 198,col 33)",
        "(line 199,col 9)-(line 199,col 35)",
        "(line 201,col 9)-(line 201,col 74)",
        "(line 202,col 9)-(line 202,col 67)",
        "(line 203,col 9)-(line 203,col 42)",
        "(line 204,col 9)-(line 204,col 78)",
        "(line 205,col 9)-(line 205,col 46)",
        "(line 206,col 9)-(line 206,col 34)",
        "(line 207,col 9)-(line 207,col 24)",
        "(line 209,col 9)-(line 209,col 75)",
        "(line 210,col 9)-(line 210,col 44)",
        "(line 211,col 9)-(line 211,col 70)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 34)",
        "(line 214,col 9)-(line 214,col 24)",
        "(line 237,col 9)-(line 237,col 30)",
        "(line 239,col 9)-(line 239,col 41)",
        "(line 241,col 9)-(line 241,col 52)",
        "(line 243,col 9)-(line 243,col 54)",
        "(line 244,col 9)-(line 246,col 72)",
        "(line 248,col 9)-(line 248,col 43)",
        "(line 249,col 9)-(line 249,col 78)",
        "(line 251,col 9)-(line 251,col 52)",
        "(line 252,col 9)-(line 252,col 69)",
        "(line 254,col 9)-(line 257,col 10)",
        "(line 258,col 9)-(line 258,col 47)",
        "(line 259,col 9)-(line 259,col 32)",
        "(line 260,col 9)-(line 260,col 32)",
        "(line 262,col 9)-(line 264,col 10)",
        "(line 265,col 9)-(line 265,col 75)",
        "(line 266,col 9)-(line 266,col 43)",
        "(line 267,col 9)-(line 267,col 70)",
        "(line 268,col 9)-(line 268,col 50)",
        "(line 269,col 9)-(line 269,col 34)",
        "(line 270,col 9)-(line 270,col 21)",
        "(line 272,col 9)-(line 275,col 10)",
        "(line 276,col 9)-(line 276,col 46)",
        "(line 277,col 9)-(line 277,col 32)",
        "(line 278,col 9)-(line 278,col 32)",
        "(line 280,col 9)-(line 280,col 76)",
        "(line 282,col 9)-(line 282,col 34)",
        "(line 284,col 9)-(line 284,col 30)",
        "(line 286,col 9)-(line 286,col 52)",
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 288,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getLabel()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Returns the current axis label.\r\n     *\r\n     * @return The current axis label.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getLabelFont()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\r\n     * Returns the current label font.\r\n     *\r\n     * @return The current label font.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getLabelPaint()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\r\n     * Returns the current label paint.\r\n     *\r\n     * @return The current label paint.\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.isTickLabelsVisible()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns a flag that indicates whether or not the tick labels are visible.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if ick mark labels are visible.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getTickLabelFont()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\r\n     * Returns the font used to draw the tick labels (if they are showing).\r\n     *\r\n     * @return The font used to draw the tick labels.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getTickLabelPaint()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Returns the current tick label paint.\r\n     *\r\n     * @return The current tick label paint.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.isTickMarksVisible()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\r\n     * Returns the current value of the flag that determines whether or not\r\n     * tick marks are visible.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if tick marks are visible.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getTickLabelInsets()",
      "begin_line": 361,
      "end_line": 365,
      "comment": "\r\n     * Returns the current tick label insets value\r\n     *\r\n     * @return The current tick label insets value.\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getLabelInsets()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "\r\n     * Returns the current label insets value\r\n     *\r\n     * @return The current label insets value.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 374,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getOtherTabs()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Returns a reference to the tabbed pane.\r\n     *\r\n     * @return A reference to the tabbed pane.\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 392,
      "end_line": 409,
      "comment": "\r\n     * Handles user interaction with the property panel.\r\n     *\r\n     * @param event  information about the event that triggered the call to\r\n     *      this method.\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 50)",
        "(line 394,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.attemptLabelFontSelection()",
      "begin_line": 414,
      "end_line": 428,
      "comment": "\r\n     * Presents a font selection dialog to the user.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 70)",
        "(line 417,col 9)-(line 419,col 69)",
        "(line 421,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.attemptModifyLabelPaint()",
      "begin_line": 433,
      "end_line": 441,
      "comment": "\r\n     * Allows the user the opportunity to change the outline paint.\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 16)",
        "(line 435,col 9)-(line 437,col 10)",
        "(line 438,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.attemptTickLabelFontSelection()",
      "begin_line": 446,
      "end_line": 461,
      "comment": "\r\n     * Presents a tick label font selection dialog to the user.\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 74)",
        "(line 449,col 9)-(line 451,col 69)",
        "(line 453,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.setAxisProperties(org.jfree.chart.axis.Axis)",
      "begin_line": 506,
      "end_line": 517,
      "comment": "\r\n     * Sets the properties of the specified axis to match the properties\r\n     * defined on this panel.\r\n     *\r\n     * @param axis  the axis.\r\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 34)",
        "(line 508,col 9)-(line 508,col 42)",
        "(line 509,col 9)-(line 509,col 44)",
        "(line 510,col 9)-(line 510,col 55)",
        "(line 512,col 9)-(line 512,col 57)",
        "(line 513,col 9)-(line 513,col 50)",
        "(line 514,col 9)-(line 514,col 52)",
        "(line 515,col 9)-(line 515,col 54)",
        "(line 516,col 9)-(line 516,col 46)"
      ]
    }
  ]
}