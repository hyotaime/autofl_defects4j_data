{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/ui/ExtensionFileFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtensionFileFilter",
      "is_interface": false,
      "parent_types": [
        "javax.swing.filechooser.FileFilter"
      ],
      "begin_line": 52,
      "end_line": 103,
      "comment": "\n * A filter for JFileChooser that filters files by extension.\n "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " A description for the file type. "
    },
    {
      "type": "field",
      "varNames": [
        "extension"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The extension (for example, \"png\" for *.png files). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.ExtensionFileFilter.ExtensionFileFilter(java.lang.String, java.lang.String)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Standard constructor.\n     *\n     * @param description  a description of the file type;\n     * @param extension  the file extension;\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 39)",
        "(line 68,col 9)-(line 68,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ExtensionFileFilter.accept(java.io.File)",
      "begin_line": 78,
      "end_line": 92,
      "comment": "\n     * Returns true if the file ends with the specified extension.\n     *\n     * @param file  the file to test.\n     *\n     * @return A boolean that indicates whether or not the file is accepted by the filter.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 84,col 51)",
        "(line 85,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ExtensionFileFilter.getDescription()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Returns the description of the filter.\n     *\n     * @return a description of the filter.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 32)"
      ]
    }
  ]
}