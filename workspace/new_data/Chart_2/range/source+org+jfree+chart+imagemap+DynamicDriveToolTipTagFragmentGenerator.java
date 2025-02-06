{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/imagemap/DynamicDriveToolTipTagFragmentGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicDriveToolTipTagFragmentGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.imagemap.ToolTipTagFragmentGenerator"
      ],
      "begin_line": 50,
      "end_line": 93,
      "comment": "\r\n * Generates tooltips using the Dynamic Drive DHTML Tip Message\r\n * library (http://www.dynamicdrive.com).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "title"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The title, empty string not to display "
    },
    {
      "type": "field",
      "varNames": [
        "style"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The style number "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator.DynamicDriveToolTipTagFragmentGenerator()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\r\n     * Blank constructor.\r\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator.DynamicDriveToolTipTagFragmentGenerator(java.lang.String, int)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\r\n     * Creates a new generator with specific title and style settings.\r\n     *\r\n     * @param title  title for use in all tooltips, use empty String not to\r\n     *               display a title.\r\n     * @param style  style number, see http://www.dynamicdrive.com for more\r\n     *               information.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator.generateToolTipFragment(java.lang.String)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\r\n     * Generates a tooltip string to go in an HTML image map.\r\n     *\r\n     * @param toolTipText  the tooltip.\r\n     *\r\n     * @return The formatted HTML area tag attribute(s).\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 90,col 69)"
      ]
    }
  ]
}