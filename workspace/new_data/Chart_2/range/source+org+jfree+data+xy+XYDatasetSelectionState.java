{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/XYDatasetSelectionState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDatasetSelectionState",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.general.DatasetSelectionState"
      ],
      "begin_line": 60,
      "end_line": 121,
      "comment": "\n * Returns information about the selection state of items in an\n * {@link XYDataset}.  Classes that implement this interface must also\n * implement {@link PublicCloneable} to ensure that charts and datasets can be\n * correctly cloned.  Likewise, classes implementing this interface must also\n * implement {@link Serializable}.\n * \u003cbr\u003e\u003cbr\u003e\n * The selection state might be part of a dataset implementation, or it could\n * be maintained in parallel with a dataset implementation that doesn\u0027t\n * directly support selection state.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetSelectionState.getSeriesCount()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Returns the number of series.\n     *\n     * @return The number of series.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetSelectionState.getItemCount(int)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Returns the number of items within the specified series.\n     *\n     * @param series  the series.\n     *\n     * @return The number of items in the series.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetSelectionState.isSelected(int, int)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified item is selected, and\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param series  the series index.\n     * @param item  the item index.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetSelectionState.setSelected(int, int, boolean)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Sets the selection state for an item in the dataset.\n     *\n     * @param series  the series index.\n     * @param item  the item index.\n     * @param selected  the selection state.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetSelectionState.setSelected(int, int, boolean, boolean)",
      "begin_line": 107,
      "end_line": 108,
      "comment": "\n     * Sets the selection state for the specified item and, if requested,\n     * fires a change event.\n     *\n     * @param series  the series index.\n     * @param item  the item index.\n     * @param selected  the selection state.\n     * @param notify  notify listeners?\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetSelectionState.fireSelectionEvent()",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Send an event to registered listeners to indicate that the selection\n     * has changed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetSelectionState.clearSelection()",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Clears all selected items.\n     ",
      "child_ranges": []
    }
  ]
}