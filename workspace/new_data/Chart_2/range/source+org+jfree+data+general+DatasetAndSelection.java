{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/DatasetAndSelection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetAndSelection",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 90,
      "comment": "\n * A utility class for pairing up a dataset and a dataset selection state.\n * Once paired, the items can be stored in a collection and retrieved on the\n * basis of the dataset as the key.\n *\n * // if cloning and serialization of a ChartPanel is supported, then this\n * // class will have to support it too.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "selection"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The dataset selection state. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetAndSelection.DatasetAndSelection(org.jfree.data.general.Dataset, org.jfree.data.general.DatasetSelectionState)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Creates a new instance.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param selection  the selection (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 31)",
        "(line 69,col 9)-(line 69,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetAndSelection.getDataset()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Returns the dataset.\n     *\n     * @return The dataset (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetAndSelection.getSelection()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns the selection state.\n     *\n     * @return The selection state (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 30)"
      ]
    }
  ]
}