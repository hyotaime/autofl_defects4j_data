{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/pie/PieDatasetSelectionState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieDatasetSelectionState",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.general.DatasetSelectionState"
      ],
      "begin_line": 60,
      "end_line": 108,
      "comment": "\n * Returns information about the selection state of items in an\n * {@link PieDataset}.  Classes that implement this interface must also\n * implement {@link PublicCloneable} to ensure that charts and datasets can be\n * correctly cloned.  Likewise, classes implementing this interface must also\n * implement {@link Serializable}.\n * \u003cbr\u003e\u003cbr\u003e\n * The selection state might be part of a dataset implementation, or it could\n * be maintained in parallel with a dataset implementation that doesn\u0027t\n * directly support selection state.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetSelectionState.getItemCount()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Returns the number of items in the dataset.\n     *\n     * @return The number of items.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetSelectionState.isSelected(java.lang.Comparable)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified item is selected, and\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param key  the item key.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetSelectionState.setSelected(java.lang.Comparable, boolean)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Sets the selection state for an item in the dataset.\n     *\n     * @param key  the item key.\n     * @param selected  the selection state.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetSelectionState.setSelected(java.lang.Comparable, boolean, boolean)",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Sets the selection state for the specified item and, if requested,\n     * fires a change event.\n     *\n     * @param key  the item key.\n     * @param selected  the selection state.\n     * @param notify  notify listeners?\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetSelectionState.clearSelection()",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Clears all selected items.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetSelectionState.fireSelectionEvent()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Send an event to registered listeners to indicate that the selection\n     * has changed.\n     ",
      "child_ranges": []
    }
  ]
}