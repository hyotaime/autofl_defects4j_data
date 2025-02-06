{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/BufferedImageRenderingSource.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BufferedImageRenderingSource",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.RenderingSource"
      ],
      "begin_line": 56,
      "end_line": 122,
      "comment": "\n * The rendering source for drawing to a buffered image.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "image"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The buffered image. "
    },
    {
      "type": "field",
      "varNames": [
        "selectionStates"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * A list of {@link DatasetAndSelection} objects.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.BufferedImageRenderingSource.BufferedImageRenderingSource(java.awt.image.BufferedImage)",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n     * Creates a new rendering source.\n     *\n     * @param image  the buffered image (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.BufferedImageRenderingSource.createGraphics2D()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns a graphics context that a renderer can use to calculate\n     * selection bounds.\n     *\n     * @return A graphics context.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.BufferedImageRenderingSource.getSelectionState(org.jfree.data.general.Dataset)",
      "begin_line": 96,
      "end_line": 106,
      "comment": "\n     * Returns the selection state, if any, that this source is maintaining\n     * for the specified dataset.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 60)",
        "(line 98,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.BufferedImageRenderingSource.putSelectionState(org.jfree.data.general.Dataset, org.jfree.data.general.DatasetSelectionState)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Stores the selection state that is associated with the specified\n     * dataset for this rendering source.  If two rendering sources are\n     * displaying the same dataset, ideally they should have separate selection\n     * states.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param state  the state (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 74)"
      ]
    }
  ]
}