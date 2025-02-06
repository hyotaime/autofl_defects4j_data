{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/ChartTransferable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartTransferable",
      "is_interface": false,
      "parent_types": [
        "java.awt.datatransfer.Transferable"
      ],
      "begin_line": 59,
      "end_line": 275,
      "comment": "\n * A class used to represent a chart on the clipboard.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "imageFlavor"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " The data flavor. "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The chart. "
    },
    {
      "type": "field",
      "varNames": [
        "width"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The width of the chart on the clipboard. "
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The height of the chart on the clipboard. "
    },
    {
      "type": "field",
      "varNames": [
        "minDrawWidth"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The smallest width at which the chart will be drawn (if necessary, the\n     * chart will then be scaled down to fit the requested width).\n     *\n     * @since 1.0.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minDrawHeight"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * The smallest height at which the chart will be drawn (if necessary, the\n     * chart will then be scaled down to fit the requested height).\n     *\n     * @since 1.0.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxDrawWidth"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * The largest width at which the chart will be drawn (if necessary, the\n     * chart will then be scaled up to fit the requested width).\n     *\n     * @since 1.0.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxDrawHeight"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * The largest height at which the chart will be drawn (if necessary, the\n     * chart will then be scaled up to fit the requested height).\n     *\n     * @since 1.0.14\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartTransferable.ChartTransferable(org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Creates a new chart selection.\n     *\n     * @param chart  the chart.\n     * @param width  the chart width.\n     * @param height  the chart height.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartTransferable.ChartTransferable(org.jfree.chart.JFreeChart, int, int, boolean)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Creates a new chart selection.\n     *\n     * @param chart  the chart.\n     * @param width  the chart width.\n     * @param height  the chart height.\n     * @param cloneData  clone the dataset(s)?\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 128,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartTransferable.ChartTransferable(org.jfree.chart.JFreeChart, int, int, int, int, int, int, boolean)",
      "begin_line": 147,
      "end_line": 168,
      "comment": "\n     * Creates a new chart selection.  The minimum and maximum drawing\n     * dimensions are used to match the scaling behaviour in the\n     * {@link ChartPanel} class.\n     *\n     * @param chart  the chart.\n     * @param width  the chart width.\n     * @param height  the chart height.\n     * @param minDrawW  the minimum drawing width.\n     * @param minDrawH  the minimum drawing height.\n     * @param maxDrawW  the maximum drawing width.\n     * @param maxDrawH  the maximum drawing height.\n     * @param cloneData  clone the dataset(s)?\n     *\n     * @since 1.0.14\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 159,col 9)",
        "(line 162,col 9)-(line 162,col 27)",
        "(line 163,col 9)-(line 163,col 29)",
        "(line 164,col 9)-(line 164,col 37)",
        "(line 165,col 9)-(line 165,col 38)",
        "(line 166,col 9)-(line 166,col 37)",
        "(line 167,col 9)-(line 167,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartTransferable.getTransferDataFlavors()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Returns the data flavors supported.\n     *\n     * @return The data flavors supported.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartTransferable.isDataFlavorSupported(java.awt.datatransfer.DataFlavor)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified flavor is supported.\n     *\n     * @param flavor  the flavor.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartTransferable.getTransferData(java.awt.datatransfer.DataFlavor)",
      "begin_line": 200,
      "end_line": 211,
      "comment": "\n     * Returns the content for the requested flavor, if it is supported.\n     *\n     * @param flavor  the requested flavor.\n     *\n     * @return The content.\n     *\n     * @throws java.awt.datatransfer.UnsupportedFlavorException\n     * @throws java.io.IOException\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartTransferable.createBufferedImage(org.jfree.chart.JFreeChart, int, int, int, int, int, int)",
      "begin_line": 228,
      "end_line": 273,
      "comment": "\n     * A utility method that creates an image of a chart, with scaling.\n     *\n     * @param chart  the chart.\n     * @param w  the image width.\n     * @param h  the image height.\n     * @param minDrawW  the minimum width for chart drawing.\n     * @param minDrawH  the minimum height for chart drawing.\n     * @param maxDrawW  the maximum width for chart drawing.\n     * @param maxDrawH  the maximum height for chart drawing.\n     *\n     * @return  A chart image.\n     *\n     * @since 1.0.14\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 232,col 45)",
        "(line 233,col 9)-(line 233,col 47)",
        "(line 236,col 9)-(line 236,col 30)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 238,col 9)-(line 238,col 30)",
        "(line 239,col 9)-(line 239,col 28)",
        "(line 240,col 9)-(line 240,col 28)",
        "(line 241,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 263,col 28)",
        "(line 264,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 46)",
        "(line 270,col 9)-(line 270,col 21)",
        "(line 271,col 9)-(line 271,col 21)"
      ]
    }
  ]
}