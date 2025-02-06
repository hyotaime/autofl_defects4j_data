{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/OutlierListCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OutlierListCollection",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 186,
      "comment": "\r\n * A collection of outlier lists for a box and whisker plot. Each collection is\r\n * associated with a single box and whisker entity.\r\n *\r\n * Outliers are grouped in lists for each entity. Lists contain\r\n * one or more outliers, determined by whether overlaps have\r\n * occurred. Overlapping outliers are grouped in the same list.\r\n *\r\n * @see org.jfree.chart.renderer.OutlierList\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "outlierLists"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Storage for the outlier lists. "
    },
    {
      "type": "field",
      "varNames": [
        "highFarOut"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " \r\n     * Unbelievably, outliers which are more than 2 * interquartile range are\r\n     * called far outs...  See Tukey EDA  (a classic one of a kind...)\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowFarOut"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\r\n     * A flag that indicates whether or not the collection contains low far \r\n     * out values.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.OutlierListCollection.OutlierListCollection()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Creates a new empty collection.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierListCollection.isHighFarOut()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * A flag to indicate the presence of one or more far out values at the \r\n     * top end of the range.\r\n     *\r\n     * @return A \u003ccode\u003eboolean\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierListCollection.setHighFarOut(boolean)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Sets the flag that indicates the presence of one or more far out values \r\n     * at the top end of the range.\r\n     *\r\n     * @param farOut  the flag.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierListCollection.isLowFarOut()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * A flag to indicate the presence of one or more far out values at the \r\n     * bottom end of the range.\r\n     *\r\n     * @return A \u003ccode\u003eboolean\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierListCollection.setLowFarOut(boolean)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Sets the flag that indicates the presence of one or more far out values \r\n     * at the bottom end of the range.\r\n     *\r\n     * @param farOut  the flag.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierListCollection.add(org.jfree.chart.renderer.Outlier)",
      "begin_line": 135,
      "end_line": 156,
      "comment": "\r\n     * Appends the specified element as a new \u003ccode\u003eOutlierList\u003c/code\u003e to the\r\n     * end of this list if it does not overlap an outlier in an existing list.\r\n     *\r\n     * If it does overlap, it is appended to the outlier list which it overlaps\r\n     * and that list is updated.\r\n     *\r\n     * @param outlier  element to be appended to this list.\r\n     * \r\n     * @return \u003ctt\u003etrue\u003c/tt\u003e (as per the general contract of Collection.add).\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierListCollection.iterator()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns an iterator for the outlier lists.\r\n     * \r\n     * @return An iterator.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierListCollection.updateOutlierList(org.jfree.chart.renderer.OutlierList, org.jfree.chart.renderer.Outlier)",
      "begin_line": 178,
      "end_line": 184,
      "comment": " \r\n     * Updates the outlier list by adding the outlier to the end of the list and\r\n     * setting the averaged outlier to the average x and y coordinnate values \r\n     * of the outliers in the list.\r\n     *\r\n     * @param list  the outlier list to be updated.\r\n     * @param outlier  the outlier to be added\r\n     *\r\n     * @return \u003ctt\u003etrue\u003c/tt\u003e (as per the general contract of Collection.add).\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 31)",
        "(line 180,col 9)-(line 180,col 35)",
        "(line 181,col 9)-(line 181,col 37)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 183,col 9)-(line 183,col 22)"
      ]
    }
  ]
}