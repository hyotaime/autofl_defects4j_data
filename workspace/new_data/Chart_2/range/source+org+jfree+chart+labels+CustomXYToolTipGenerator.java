{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/CustomXYToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CustomXYToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.XYToolTipGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 202,
      "comment": "\r\n * A tool tip generator that stores custom tooltips. The dataset passed into\r\n * the generateToolTip method is ignored.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipSeries"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Storage for the tooltip lists. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.CustomXYToolTipGenerator()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.getListCount()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Returns the number of tool tip lists stored by the renderer.\r\n     *\r\n     * @return The list count.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.getToolTipCount(int)",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\r\n     * Returns the number of tool tips in a given list.\r\n     *\r\n     * @param list  the list index (zero based).\r\n     *\r\n     * @return The tooltip count.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 23)",
        "(line 95,col 9)-(line 95,col 60)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.getToolTipText(int, int)",
      "begin_line": 110,
      "end_line": 124,
      "comment": "\r\n     * Returns the tool tip text for an item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The tool tip text.\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 29)",
        "(line 114,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.addToolTipSeries(java.util.List)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Adds a list of tooltips for a series.\r\n     *\r\n     * @param toolTips  the list of tool tips.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.generateToolTip(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\r\n     * Generates a tool tip text item for a particular item within a series.\r\n     *\r\n     * @param data  the dataset (ignored in this implementation).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The tooltip text.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.clone()",
      "begin_line": 157,
      "end_line": 166,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 160,col 55)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 174,
      "end_line": 200,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 21)"
      ]
    }
  ]
}