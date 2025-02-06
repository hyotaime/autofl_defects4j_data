{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ui/ExtensionFileFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtensionFileFilter",
      "is_interface": false,
      "parent_types": [
        "javax.swing.filechooser.FileFilter"
      ],
      "begin_line": 51,
      "end_line": 102,
      "comment": "\n * A filter for JFileChooser that filters files by extension.\n "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " A description for the file type. "
    },
    {
      "type": "field",
      "varNames": [
        "extension"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The extension (for example, \"png\" for *.png files). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.ExtensionFileFilter.ExtensionFileFilter(java.lang.String, java.lang.String)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Standard constructor.\n     *\n     * @param description  a description of the file type;\n     * @param extension  the file extension;\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 39)",
        "(line 67,col 9)-(line 67,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ExtensionFileFilter.accept(java.io.File)",
      "begin_line": 77,
      "end_line": 91,
      "comment": "\n     * Returns true if the file ends with the specified extension.\n     *\n     * @param file  the file to test.\n     *\n     * @return A boolean that indicates whether or not the file is accepted by the filter.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ExtensionFileFilter.getDescription()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns the description of the filter.\n     *\n     * @return a description of the filter.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 32)"
      ]
    }
  ]
}