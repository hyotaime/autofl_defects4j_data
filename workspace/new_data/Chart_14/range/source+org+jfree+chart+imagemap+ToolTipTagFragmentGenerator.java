{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/imagemap/ToolTipTagFragmentGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToolTipTagFragmentGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 60,
      "comment": "\r\n * Interface for generating the tooltip fragment of an HTML image map area tag.\r\n * The fragment should be \u003ccode\u003eXHTML 1.0\u003c/code\u003e compliant.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.imagemap.ToolTipTagFragmentGenerator.generateToolTipFragment(java.lang.String)",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\r\n     * Generates a tooltip string to go in an HTML image map.  To allow for\r\n     * varying standards compliance among browsers, this method is expected\r\n     * to return an \u0027alt\u0027 attribute IN ADDITION TO whatever it does to create\r\n     * the tooltip (often a \u0027title\u0027 attribute). \r\n     *\r\n     * @param toolTipText  the tooltip.\r\n     * \r\n     * @return The formatted HTML area tag attribute(s).\r\n     ",
      "child_ranges": []
    }
  ]
}