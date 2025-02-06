{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/HeatMapDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HeatMapDataset",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 154,
      "comment": "\n * A dataset that represents a rectangular grid of (x, y, z) values.  The x\n * and y values appear at regular intervals in the dataset, while the z-values\n * can take any value (including \u003ccode\u003enull\u003c/code\u003e for unknown values).\n *\n * @since 1.0.13\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getXSampleCount()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Returns the number of x values across the width of the dataset.  The\n     * values are evenly spaced between {@link #getMinimumXValue()} and\n     * {@link #getMaximumXValue()}.\n     *\n     * @return The number of x-values (always \u003e 0).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getYSampleCount()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Returns the number of y values (or samples) for the dataset.  The\n     * values are evenly spaced between {@link #getMinimumYValue()} and\n     * {@link #getMaximumYValue()}.\n     *\n     * @return The number of y-values (always \u003e 0).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getMinimumXValue()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Returns the lowest x-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The lowest x-value represented in this dataset.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getMaximumXValue()",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Returns the highest x-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The highest x-value represented in this dataset.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getMinimumYValue()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Returns the lowest y-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The lowest y-value represented in this dataset.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getMaximumYValue()",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Returns the highest y-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The highest y-value represented in this dataset.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getXValue(int)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * A convenience method that returns the x-value for the given index.\n     *\n     * @param xIndex  the xIndex.\n     *\n     * @return The x-value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getYValue(int)",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * A convenience method that returns the y-value for the given index.\n     *\n     * @param yIndex  the yIndex.\n     *\n     * @return The y-value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getZValue(int, int)",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Returns the z-value at the specified sample position in the dataset.\n     * For a missing or unknown value, this method should return Double.NAN.\n     *\n     * @param xIndex  the position of the x sample in the dataset.\n     * @param yIndex  the position of the y sample in the dataset.\n     *\n     * @return The z-value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.HeatMapDataset.getZ(int, int)",
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * Returns the z-value at the specified sample position in the dataset.\n     * This method can return \u003ccode\u003enull\u003c/code\u003e to indicate a missing/unknown\n     * value.\n     * \u003cbr\u003e\u003cbr\u003e\n     * Bear in mind that the class implementing this interface may\n     * store its data using primitives rather than objects, so calling this\n     * method may require a new \u003ccode\u003eNumber\u003c/code\u003e object to be allocated...\n     * for this reason, it is generally preferable to use the\n     * {@link #getZValue(int, int)} method unless you *know* that the dataset\n     * implementation stores the z-values using objects.\n     *\n     * @param xIndex  the position of the x sample in the dataset.\n     * @param yIndex  the position of the y sample in the dataset.\n     *\n     * @return The z-value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": []
    }
  ]
}