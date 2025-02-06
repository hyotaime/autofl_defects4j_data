{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/OutlierList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OutlierList",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 66,
      "end_line": 186,
      "comment": "\r\n * A collection of outliers for a single entity in a box and whisker plot.\r\n *\r\n * Outliers are grouped in lists for each entity. Lists contain\r\n * one or more outliers, determined by whether overlaps have\r\n * occured. Overlapping outliers are grouped in the same list.\r\n *\r\n * Each list contains an averaged outlier, which is the same as a single\r\n * outlier if there is only one outlier in the list, but the average of\r\n * all the outliers in the list if there is more than one.\r\n *\r\n * NB This is simply my scheme for displaying outliers, and might not be\r\n * acceptable by the wider community.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "outliers"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Storage for the outliers. "
    },
    {
      "type": "field",
      "varNames": [
        "averagedOutlier"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The averaged outlier. "
    },
    {
      "type": "field",
      "varNames": [
        "multiple"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\r\n     * A flag that indicates whether or not there are multiple outliers in the\r\n     * list.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.OutlierList.OutlierList(org.jfree.chart.renderer.Outlier)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\r\n     * Creates a new list containing a single outlier.\r\n     *\r\n     * @param outlier  the outlier.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 40)",
        "(line 87,col 9)-(line 87,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierList.add(org.jfree.chart.renderer.Outlier)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Adds an outlier to the list.\r\n     *\r\n     * @param outlier  the outlier.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierList.getItemCount()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns the number of outliers in the list.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierList.getAveragedOutlier()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the averaged outlier.\r\n     *\r\n     * @return The averaged outlier.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierList.setAveragedOutlier(org.jfree.chart.renderer.Outlier)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Sets the averaged outlier.\r\n     *\r\n     * @param averagedOutlier  the averaged outlier.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierList.isMultiple()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the list contains multiple outliers, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierList.setMultiple(boolean)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Sets the flag that indicates whether or not this list represents\r\n     * multiple outliers.\r\n     *\r\n     * @param multiple  the flag.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierList.isOverlapped(org.jfree.chart.renderer.Outlier)",
      "begin_line": 156,
      "end_line": 165,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the outlier overlaps, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param other  the outlier.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 62)",
        "(line 163,col 9)-(line 163,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.OutlierList.updateAveragedOutlier()",
      "begin_line": 171,
      "end_line": 184,
      "comment": "\r\n     * Updates the averaged outlier.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 34)",
        "(line 173,col 9)-(line 173,col 34)",
        "(line 174,col 9)-(line 174,col 34)",
        "(line 175,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 10)"
      ]
    }
  ]
}