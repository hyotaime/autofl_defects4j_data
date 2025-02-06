{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/HeatMapUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HeatMapUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 134,
      "comment": "\n * A utility class for the {@link HeatMapDataset}.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapUtilities.extractRowFromHeatMapDataset(org.jfree.data.general.HeatMapDataset, int, java.lang.Comparable)",
      "begin_line": 68,
      "end_line": 77,
      "comment": "\n     * Returns a dataset containing one series that holds a copy of the (x, z)\n     * data from one row (y-index) of the specified dataset.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param row  the row (y) index.\n     * @param seriesName  the series name/key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The dataset.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 51)",
        "(line 71,col 9)-(line 71,col 45)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 67)",
        "(line 76,col 9)-(line 76,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapUtilities.extractColumnFromHeatMapDataset(org.jfree.data.general.HeatMapDataset, int, java.lang.Comparable)",
      "begin_line": 89,
      "end_line": 98,
      "comment": "\n     * Returns a dataset containing one series that holds a copy of the (y, z)\n     * data from one column (x-index) of the specified dataset.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param column  the column (x) index.\n     * @param seriesName  the series name (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The dataset.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 51)",
        "(line 92,col 9)-(line 92,col 45)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 67)",
        "(line 97,col 9)-(line 97,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapUtilities.createHeatMapImage(org.jfree.data.general.HeatMapDataset, org.jfree.chart.renderer.PaintScale)",
      "begin_line": 109,
      "end_line": 132,
      "comment": "\n     * Creates an image that displays the values from the specified dataset.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param paintScale  the paint scale for the z-values (\u003ccode\u003enull\u003c/code\u003e\n     *         not permitted).\n     *\n     * @return A buffered image.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 47)",
        "(line 119,col 9)-(line 119,col 47)",
        "(line 120,col 9)-(line 121,col 45)",
        "(line 122,col 9)-(line 122,col 47)",
        "(line 123,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 21)"
      ]
    }
  ]
}