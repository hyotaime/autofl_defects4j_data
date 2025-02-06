{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/editor/DefaultAxisEditor.java",
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
      "end_line": 517,
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
      "comment": " \r\n     * A field containing a description of the font for displaying tick labels \r\n     * on the axis. \r\n     "
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
      "comment": "\r\n     * An empty sub-panel for extending the user interface to handle more \r\n     * complex axes. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "slot2"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " \r\n     * An empty sub-panel for extending the user interface to handle more \r\n     * complex axes. \r\n     "
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
      "end_line": 136,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getInstance(org.jfree.chart.axis.Axis)",
      "begin_line": 147,
      "end_line": 163,
      "comment": "\r\n     * A static method that returns a panel that is appropriate for the axis\r\n     * type.\r\n     *\r\n     * @param axis  the axis whose properties are to be displayed/edited in \r\n     *              the panel.\r\n     *\r\n     * @return A panel or \u003ccode\u003enull\u003c/code\u003c if axis is \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.DefaultAxisEditor(org.jfree.chart.axis.Axis)",
      "begin_line": 172,
      "end_line": 289,
      "comment": "\r\n     * Standard constructor: builds a panel for displaying/editing the\r\n     * properties of the specified axis.\r\n     *\r\n     * @param axis  the axis whose properties are to be displayed/edited in \r\n     *              the panel.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 45)",
        "(line 175,col 9)-(line 175,col 70)",
        "(line 176,col 9)-(line 176,col 53)",
        "(line 177,col 9)-(line 177,col 78)",
        "(line 180,col 9)-(line 180,col 57)",
        "(line 181,col 9)-(line 181,col 49)",
        "(line 183,col 9)-(line 183,col 38)",
        "(line 185,col 9)-(line 185,col 56)",
        "(line 186,col 9)-(line 191,col 10)",
        "(line 193,col 9)-(line 193,col 55)",
        "(line 194,col 9)-(line 194,col 72)",
        "(line 195,col 9)-(line 195,col 75)",
        "(line 196,col 9)-(line 196,col 53)",
        "(line 197,col 9)-(line 197,col 33)",
        "(line 198,col 9)-(line 198,col 35)",
        "(line 200,col 9)-(line 200,col 74)",
        "(line 201,col 9)-(line 201,col 67)",
        "(line 202,col 9)-(line 202,col 42)",
        "(line 203,col 9)-(line 203,col 78)",
        "(line 204,col 9)-(line 204,col 46)",
        "(line 205,col 9)-(line 205,col 34)",
        "(line 206,col 9)-(line 206,col 24)",
        "(line 208,col 9)-(line 208,col 75)",
        "(line 209,col 9)-(line 209,col 44)",
        "(line 210,col 9)-(line 210,col 70)",
        "(line 211,col 9)-(line 211,col 47)",
        "(line 212,col 9)-(line 212,col 34)",
        "(line 213,col 9)-(line 213,col 24)",
        "(line 236,col 9)-(line 236,col 30)",
        "(line 238,col 9)-(line 238,col 41)",
        "(line 240,col 9)-(line 240,col 52)",
        "(line 242,col 9)-(line 242,col 54)",
        "(line 243,col 9)-(line 245,col 72)",
        "(line 247,col 9)-(line 247,col 43)",
        "(line 248,col 9)-(line 248,col 78)",
        "(line 250,col 9)-(line 250,col 52)",
        "(line 251,col 9)-(line 251,col 69)",
        "(line 253,col 9)-(line 256,col 10)",
        "(line 257,col 9)-(line 257,col 47)",
        "(line 258,col 9)-(line 258,col 32)",
        "(line 259,col 9)-(line 259,col 32)",
        "(line 261,col 9)-(line 263,col 10)",
        "(line 264,col 9)-(line 264,col 75)",
        "(line 265,col 9)-(line 265,col 43)",
        "(line 266,col 9)-(line 266,col 70)",
        "(line 267,col 9)-(line 267,col 50)",
        "(line 268,col 9)-(line 268,col 34)",
        "(line 269,col 9)-(line 269,col 21)",
        "(line 271,col 9)-(line 274,col 10)",
        "(line 275,col 9)-(line 275,col 46)",
        "(line 276,col 9)-(line 276,col 32)",
        "(line 277,col 9)-(line 277,col 32)",
        "(line 279,col 9)-(line 279,col 76)",
        "(line 281,col 9)-(line 281,col 34)",
        "(line 283,col 9)-(line 283,col 30)",
        "(line 285,col 9)-(line 285,col 52)",
        "(line 286,col 9)-(line 286,col 55)",
        "(line 287,col 9)-(line 287,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getLabel()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\r\n     * Returns the current axis label.\r\n     *\r\n     * @return The current axis label.\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getLabelFont()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\r\n     * Returns the current label font.\r\n     *\r\n     * @return The current label font.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getLabelPaint()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\r\n     * Returns the current label paint.\r\n     *\r\n     * @return The current label paint.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.isTickLabelsVisible()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\r\n     * Returns a flag that indicates whether or not the tick labels are visible.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if ick mark labels are visible.\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getTickLabelFont()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\r\n     * Returns the font used to draw the tick labels (if they are showing).\r\n     *\r\n     * @return The font used to draw the tick labels.\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getTickLabelPaint()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\r\n     * Returns the current tick label paint.\r\n     *\r\n     * @return The current tick label paint.\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.isTickMarksVisible()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns the current value of the flag that determines whether or not\r\n     * tick marks are visible.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if tick marks are visible.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getTickLabelInsets()",
      "begin_line": 360,
      "end_line": 364,
      "comment": "\r\n     * Returns the current tick label insets value\r\n     *\r\n     * @return The current tick label insets value.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getLabelInsets()",
      "begin_line": 371,
      "end_line": 374,
      "comment": "\r\n     * Returns the current label insets value\r\n     *\r\n     * @return The current label insets value.\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 373,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.getOtherTabs()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\r\n     * Returns a reference to the tabbed pane.\r\n     *\r\n     * @return A reference to the tabbed pane.\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 391,
      "end_line": 408,
      "comment": "\r\n     * Handles user interaction with the property panel.\r\n     * \r\n     * @param event  information about the event that triggered the call to\r\n     *      this method.\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 50)",
        "(line 393,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.attemptLabelFontSelection()",
      "begin_line": 413,
      "end_line": 427,
      "comment": "\r\n     * Presents a font selection dialog to the user.\r\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 70)",
        "(line 416,col 9)-(line 418,col 69)",
        "(line 420,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.attemptModifyLabelPaint()",
      "begin_line": 432,
      "end_line": 440,
      "comment": "\r\n     * Allows the user the opportunity to change the outline paint.\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 16)",
        "(line 434,col 9)-(line 436,col 10)",
        "(line 437,col 9)-(line 439,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.attemptTickLabelFontSelection()",
      "begin_line": 445,
      "end_line": 460,
      "comment": "\r\n     * Presents a tick label font selection dialog to the user.\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 74)",
        "(line 448,col 9)-(line 450,col 69)",
        "(line 452,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultAxisEditor.setAxisProperties(org.jfree.chart.axis.Axis)",
      "begin_line": 504,
      "end_line": 515,
      "comment": "\r\n     * Sets the properties of the specified axis to match the properties\r\n     * defined on this panel.\r\n     *\r\n     * @param axis  the axis.\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 34)",
        "(line 506,col 9)-(line 506,col 42)",
        "(line 507,col 9)-(line 507,col 44)",
        "(line 508,col 9)-(line 508,col 55)",
        "(line 510,col 9)-(line 510,col 57)",
        "(line 511,col 9)-(line 511,col 50)",
        "(line 512,col 9)-(line 512,col 52)",
        "(line 513,col 9)-(line 513,col 54)",
        "(line 514,col 9)-(line 514,col 46)"
      ]
    }
  ]
}