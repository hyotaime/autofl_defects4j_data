{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/title/LegendItemBlockContainer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendItemBlockContainer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.BlockContainer"
      ],
      "begin_line": 65,
      "end_line": 200,
      "comment": "\r\n * A container that holds all the pieces of a single legend item.\r\n *\r\n * @since 1.0.2\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * The dataset.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\r\n     * The series key.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The tool tip text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The URL text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.LegendItemBlockContainer.LegendItemBlockContainer(org.jfree.chart.block.Arrangement, org.jfree.data.general.Dataset, java.lang.Comparable)",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\r\n     * Creates a new legend item block.\r\n     *\r\n     * @param arrangement  the arrangement.\r\n     * @param dataset  the dataset.\r\n     * @param seriesKey  the series key.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 27)",
        "(line 99,col 9)-(line 99,col 31)",
        "(line 100,col 9)-(line 100,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendItemBlockContainer.getDataset()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Returns a reference to the dataset for the associated legend item.\r\n     *\r\n     * @return A dataset reference.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendItemBlockContainer.getSeriesKey()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the series key.\r\n     *\r\n     * @return The series key.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendItemBlockContainer.getToolTipText()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the tool tip text.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendItemBlockContainer.setToolTipText(java.lang.String)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Sets the tool tip text.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendItemBlockContainer.getURLText()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Returns the URL text.\r\n     *\r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendItemBlockContainer.setURLText(java.lang.String)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Sets the URL text.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendItemBlockContainer.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 179,
      "end_line": 199,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  passed on to blocks within the container\r\n     *                (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return An instance of {@link EntityBlockResult}, or \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 42)",
        "(line 184,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 17)"
      ]
    }
  ]
}