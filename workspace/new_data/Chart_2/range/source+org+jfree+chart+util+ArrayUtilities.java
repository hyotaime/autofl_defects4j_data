{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/ArrayUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 206,
      "comment": "\n * Utility methods for working with arrays.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ArrayUtilities.ArrayUtilities()",
      "begin_line": 55,
      "end_line": 56,
      "comment": "\n     * Private constructor prevents object creation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ArrayUtilities.clone(float[][])",
      "begin_line": 65,
      "end_line": 82,
      "comment": "\n     * Clones a two dimensional array of floats.\n     *\n     * @param array  the array.\n     *\n     * @return A clone of the array.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 53)",
        "(line 71,col 9)-(line 71,col 60)",
        "(line 73,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ArrayUtilities.equalReferencesInArrays(java.lang.Object[], java.lang.Object[])",
      "begin_line": 94,
      "end_line": 121,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if all the references in \u003ccode\u003earray1\u003c/code\u003e\n     * are equal to all the references in \u003ccode\u003earray2\u003c/code\u003e (two\n     * \u003ccode\u003enull\u003c/code\u003e references are considered equal for this test).\n     *\n     * @param array1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param array2  the second array (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ArrayUtilities.equal(float[][], float[][])",
      "begin_line": 131,
      "end_line": 150,
      "comment": "\n     * Tests two float arrays for equality.\n     *\n     * @param array1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param array2  the second arrray (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ArrayUtilities.hasDuplicateItems(java.lang.Object[])",
      "begin_line": 160,
      "end_line": 173,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if any two items in the array are equal to\n     * one another.  Any \u003ccode\u003enull\u003c/code\u003e values in the array are ignored.\n     *\n     * @param array  the array to check.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ArrayUtilities.compareVersionArrays(java.lang.Comparable[], java.lang.Comparable[])",
      "begin_line": 183,
      "end_line": 204,
      "comment": "\n     * Compares version arrays.\n     *\n     * @param a1  array 1.\n     * @param a2  array 2.\n     *\n     * @return A code for the comparison.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 53)",
        "(line 185,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 17)"
      ]
    }
  ]
}