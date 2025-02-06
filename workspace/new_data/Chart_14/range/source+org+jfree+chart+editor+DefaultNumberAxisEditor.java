{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/editor/DefaultNumberAxisEditor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultNumberAxisEditor",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.editor.DefaultAxisEditor",
        "java.awt.event.FocusListener"
      ],
      "begin_line": 70,
      "end_line": 355,
      "comment": "\r\n * A panel for editing the properties of a value axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "autoRange"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " A flag that indicates whether or not the axis range is determined\r\n     *  automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumValue"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The lowest value in the axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumValue"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The highest value in the axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeCheckBox"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " A checkbox that indicates whether or not the axis range is determined\r\n     *  automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " A text field for entering the minimum value in the axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " A text field for entering the maximum value in the axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "gridPaintSample"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The paint selected for drawing the gridlines. "
    },
    {
      "type": "field",
      "varNames": [
        "gridStrokeSample"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The stroke selected for drawing the gridlines. "
    },
    {
      "type": "field",
      "varNames": [
        "availableStrokeSamples"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " An array of stroke samples to choose from (since I haven\u0027t written a\r\n     *  decent StrokeChooser component yet).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 107,
      "end_line": 108,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.DefaultNumberAxisEditor(org.jfree.chart.axis.NumberAxis)",
      "begin_line": 115,
      "end_line": 176,
      "comment": "\r\n     * Standard constructor: builds a property panel for the specified axis.\r\n     *\r\n     * @param axis  the axis, which should be changed.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 20)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 49)",
        "(line 121,col 9)-(line 121,col 49)",
        "(line 123,col 9)-(line 123,col 59)",
        "(line 124,col 9)-(line 124,col 72)",
        "(line 126,col 9)-(line 126,col 58)",
        "(line 127,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 132,col 39)",
        "(line 134,col 9)-(line 134,col 43)",
        "(line 136,col 9)-(line 136,col 52)",
        "(line 137,col 9)-(line 137,col 69)",
        "(line 139,col 9)-(line 139,col 32)",
        "(line 140,col 9)-(line 142,col 10)",
        "(line 143,col 9)-(line 143,col 66)",
        "(line 144,col 9)-(line 144,col 55)",
        "(line 145,col 9)-(line 145,col 42)",
        "(line 146,col 9)-(line 146,col 32)",
        "(line 148,col 9)-(line 150,col 10)",
        "(line 151,col 9)-(line 153,col 10)",
        "(line 154,col 9)-(line 154,col 59)",
        "(line 155,col 9)-(line 155,col 64)",
        "(line 156,col 9)-(line 156,col 55)",
        "(line 157,col 9)-(line 157,col 54)",
        "(line 158,col 9)-(line 158,col 42)",
        "(line 159,col 9)-(line 159,col 32)",
        "(line 161,col 9)-(line 163,col 10)",
        "(line 164,col 9)-(line 166,col 10)",
        "(line 167,col 9)-(line 167,col 59)",
        "(line 168,col 9)-(line 168,col 64)",
        "(line 169,col 9)-(line 169,col 55)",
        "(line 170,col 9)-(line 170,col 54)",
        "(line 171,col 9)-(line 171,col 42)",
        "(line 172,col 9)-(line 172,col 32)",
        "(line 174,col 9)-(line 174,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.isAutoRange()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns the current setting of the auto-range property.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if auto range is enabled.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.getMinimumValue()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the current setting of the minimum value in the axis range.\r\n     *\r\n     * @return The current setting of the minimum value in the axis range.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.getMaximumValue()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Returns the current setting of the maximum value in the axis range.\r\n     *\r\n     * @return The current setting of the maximum value in the axis range.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 209,
      "end_line": 230,
      "comment": "\r\n     * Handles actions from within the property panel.\r\n     * @param event an event.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 50)",
        "(line 211,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.attemptGridStrokeSelection()",
      "begin_line": 235,
      "end_line": 247,
      "comment": "\r\n     * Handle a grid stroke selection.\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 10)",
        "(line 239,col 9)-(line 242,col 10)",
        "(line 244,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.attemptGridPaintSelection()",
      "begin_line": 252,
      "end_line": 260,
      "comment": "\r\n     * Handle a grid paint selection.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 16)",
        "(line 254,col 9)-(line 256,col 10)",
        "(line 257,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.focusGained(java.awt.event.FocusEvent)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\r\n     * Does nothing.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.focusLost(java.awt.event.FocusEvent)",
      "begin_line": 276,
      "end_line": 283,
      "comment": "\r\n     *  Revalidates minimum/maximum range.\r\n     *\r\n     *  @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.toggleAutoRange()",
      "begin_line": 288,
      "end_line": 300,
      "comment": "\r\n     *  Toggle the auto range setting.\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 61)",
        "(line 290,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.validateMinimum()",
      "begin_line": 305,
      "end_line": 319,
      "comment": "\r\n     * Revalidate the range minimum.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 22)",
        "(line 307,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 35)",
        "(line 318,col 9)-(line 318,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.validateMaximum()",
      "begin_line": 324,
      "end_line": 338,
      "comment": "\r\n     * Revalidate the range maximum.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 22)",
        "(line 326,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 35)",
        "(line 337,col 9)-(line 337,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.editor.DefaultNumberAxisEditor.setAxisProperties(org.jfree.chart.axis.Axis)",
      "begin_line": 346,
      "end_line": 353,
      "comment": "\r\n     * Sets the properties of the specified axis to match the properties\r\n     * defined on this panel.\r\n     *\r\n     * @param axis  the axis.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 38)",
        "(line 348,col 9)-(line 348,col 50)",
        "(line 349,col 9)-(line 349,col 48)",
        "(line 350,col 9)-(line 352,col 9)"
      ]
    }
  ]
}