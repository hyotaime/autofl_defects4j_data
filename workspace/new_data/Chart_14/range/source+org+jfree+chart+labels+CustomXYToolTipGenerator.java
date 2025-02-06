{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/CustomXYToolTipGenerator.java",
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
      "end_line": 204,
      "comment": "\r\n * A tool tip generator that stores custom tooltips. The dataset passed into \r\n * the generateToolTip method is ignored.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipSeries"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Storage for the tooltip lists. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.CustomXYToolTipGenerator()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.getListCount()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Returns the number of tool tip lists stored by the renderer.\r\n     *\r\n     * @return The list count.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.getToolTipCount(int)",
      "begin_line": 94,
      "end_line": 102,
      "comment": "\r\n     * Returns the number of tool tips in a given list.\r\n     *\r\n     * @param list  the list index (zero based).\r\n     *\r\n     * @return The tooltip count.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 60)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.getToolTipText(int, int)",
      "begin_line": 112,
      "end_line": 126,
      "comment": "\r\n     * Returns the tool tip text for an item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The tool tip text.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 29)",
        "(line 116,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.addToolTipSeries(java.util.List)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Adds a list of tooltips for a series.\r\n     *\r\n     * @param toolTips  the list of tool tips.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.generateToolTip(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 146,
      "end_line": 150,
      "comment": "\r\n     * Generates a tool tip text item for a particular item within a series.\r\n     *\r\n     * @param data  the dataset (ignored in this implementation).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The tooltip text.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.clone()",
      "begin_line": 159,
      "end_line": 168,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 162,col 55)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CustomXYToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 176,
      "end_line": 202,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 21)"
      ]
    }
  ]
}