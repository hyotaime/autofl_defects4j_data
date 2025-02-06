{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/editor/DefaultNumberAxisEditor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultNumberAxisEditor",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.editor.DefaultAxisEditor",
        "java.awt.event.FocusListener"
      ],
      "begin_line": 73,
      "end_line": 351,
      "comment": "\r\n * A panel for editing the properties of a value axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "autoRange"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " A flag that indicates whether or not the axis range is determined\r\n     *  automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumValue"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The lowest value in the axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumValue"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The highest value in the axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeCheckBox"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " A checkbox that indicates whether or not the axis range is determined\r\n     *  automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " A text field for entering the minimum value in the axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " A text field for entering the maximum value in the axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "gridPaintSample"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The paint selected for drawing the gridlines. "
    },
    {
      "type": "field",
      "varNames": [
        "gridStrokeSample"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The stroke selected for drawing the gridlines. "
    },
    {
      "type": "field",
      "varNames": [
        "availableStrokeSamples"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " An array of stroke samples to choose from (since I haven\u0027t written a\r\n     *  decent StrokeChooser component yet).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 110,
      "end_line": 112,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.DefaultNumberAxisEditor(org.jfree.chart.axis.NumberAxis)",
      "begin_line": 119,
      "end_line": 175,
      "comment": "\r\n     * Standard constructor: builds a property panel for the specified axis.\r\n     *\r\n     * @param axis  the axis, which should be changed.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 20)",
        "(line 123,col 9)-(line 123,col 44)",
        "(line 124,col 9)-(line 124,col 49)",
        "(line 125,col 9)-(line 125,col 49)",
        "(line 127,col 9)-(line 127,col 59)",
        "(line 128,col 9)-(line 128,col 72)",
        "(line 130,col 9)-(line 130,col 58)",
        "(line 131,col 9)-(line 132,col 39)",
        "(line 133,col 9)-(line 134,col 39)",
        "(line 135,col 9)-(line 136,col 39)",
        "(line 138,col 9)-(line 138,col 43)",
        "(line 140,col 9)-(line 140,col 52)",
        "(line 141,col 9)-(line 141,col 69)",
        "(line 143,col 9)-(line 143,col 32)",
        "(line 144,col 9)-(line 145,col 54)",
        "(line 146,col 9)-(line 146,col 66)",
        "(line 147,col 9)-(line 147,col 55)",
        "(line 148,col 9)-(line 148,col 42)",
        "(line 149,col 9)-(line 149,col 32)",
        "(line 151,col 9)-(line 152,col 41)",
        "(line 153,col 9)-(line 154,col 36)",
        "(line 155,col 9)-(line 155,col 59)",
        "(line 156,col 9)-(line 156,col 64)",
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 54)",
        "(line 159,col 9)-(line 159,col 42)",
        "(line 160,col 9)-(line 160,col 32)",
        "(line 162,col 9)-(line 163,col 41)",
        "(line 164,col 9)-(line 165,col 36)",
        "(line 166,col 9)-(line 166,col 59)",
        "(line 167,col 9)-(line 167,col 64)",
        "(line 168,col 9)-(line 168,col 55)",
        "(line 169,col 9)-(line 169,col 54)",
        "(line 170,col 9)-(line 170,col 42)",
        "(line 171,col 9)-(line 171,col 32)",
        "(line 173,col 9)-(line 173,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.isAutoRange()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns the current setting of the auto-range property.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if auto range is enabled.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.getMinimumValue()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Returns the current setting of the minimum value in the axis range.\r\n     *\r\n     * @return The current setting of the minimum value in the axis range.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.getMaximumValue()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the current setting of the maximum value in the axis range.\r\n     *\r\n     * @return The current setting of the maximum value in the axis range.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 208,
      "end_line": 229,
      "comment": "\r\n     * Handles actions from within the property panel.\r\n     * @param event an event.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 50)",
        "(line 210,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.attemptGridStrokeSelection()",
      "begin_line": 234,
      "end_line": 244,
      "comment": "\r\n     * Handle a grid stroke selection.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 236,col 45)",
        "(line 237,col 9)-(line 239,col 73)",
        "(line 241,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.attemptGridPaintSelection()",
      "begin_line": 249,
      "end_line": 256,
      "comment": "\r\n     * Handle a grid paint selection.\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 16)",
        "(line 251,col 9)-(line 252,col 43)",
        "(line 253,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.focusGained(java.awt.event.FocusEvent)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\r\n     * Does nothing.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.focusLost(java.awt.event.FocusEvent)",
      "begin_line": 272,
      "end_line": 279,
      "comment": "\r\n     *  Revalidates minimum/maximum range.\r\n     *\r\n     *  @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.toggleAutoRange()",
      "begin_line": 284,
      "end_line": 296,
      "comment": "\r\n     *  Toggle the auto range setting.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 61)",
        "(line 286,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.validateMinimum()",
      "begin_line": 301,
      "end_line": 315,
      "comment": "\r\n     * Revalidate the range minimum.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 22)",
        "(line 303,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.validateMaximum()",
      "begin_line": 320,
      "end_line": 334,
      "comment": "\r\n     * Revalidate the range maximum.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 22)",
        "(line 322,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 35)",
        "(line 333,col 9)-(line 333,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.setAxisProperties(org.jfree.chart.axis.Axis)",
      "begin_line": 342,
      "end_line": 349,
      "comment": "\r\n     * Sets the properties of the specified axis to match the properties\r\n     * defined on this panel.\r\n     *\r\n     * @param axis  the axis.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 38)",
        "(line 344,col 9)-(line 344,col 50)",
        "(line 345,col 9)-(line 345,col 48)",
        "(line 346,col 9)-(line 348,col 9)"
      ]
    }
  ]
}