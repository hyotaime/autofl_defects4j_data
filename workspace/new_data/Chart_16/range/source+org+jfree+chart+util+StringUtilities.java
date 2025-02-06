{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/StringUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 104,
      "comment": "\n * String utilities.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.StringUtilities.StringUtilities()",
      "begin_line": 52,
      "end_line": 53,
      "comment": "\n     * Private constructor prevents object creation. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StringUtilities.startsWithIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "\n     * Helper functions to query a strings start portion. The comparison is \n     * case insensitive.\n     *\n     * @param base  the base string.\n     * @param start  the starting text.\n     *\n     * @return true, if the string starts with the given starting text.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StringUtilities.endsWithIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "\n     * Helper functions to query a strings end portion. The comparison is \n     * case insensitive.\n     *\n     * @param base  the base string.\n     * @param end  the ending text.\n     *\n     * @return true, if the string ends with the given ending text.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 85,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StringUtilities.getLineSeparator()",
      "begin_line": 94,
      "end_line": 101,
      "comment": "\n     * Queries the system properties for the line separator. If access\n     * to the System properties is forbidden, the UNIX default is returned.\n     *\n     * @return the line separator.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 100,col 9)"
      ]
    }
  ]
}