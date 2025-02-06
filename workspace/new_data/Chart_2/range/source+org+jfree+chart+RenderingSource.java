{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/RenderingSource.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenderingSource",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 85,
      "comment": "\n * A \u003ccode\u003eRenderingSource\u003c/code\u003e is an object that calls the\n * \u003ccode\u003edraw(...)\u003c/code\u003e method in the {@link JFreeChart} class.  An example\n * is the {@link ChartPanel} class.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.RenderingSource.createGraphics2D()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Returns a graphics context that a renderer can use to calculate\n     * selection bounds.\n     *\n     * @return A graphics context.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.RenderingSource.getSelectionState(org.jfree.data.general.Dataset)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Returns the selection state, if any, that this source is maintaining\n     * for the specified dataset.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.RenderingSource.putSelectionState(org.jfree.data.general.Dataset, org.jfree.data.general.DatasetSelectionState)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Stores the selection state that is associated with the specified\n     * dataset for this rendering source.  If two rendering sources are\n     * displaying the same dataset, ideally they should have separate selection\n     * states.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param state  the state (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": []
    }
  ]
}