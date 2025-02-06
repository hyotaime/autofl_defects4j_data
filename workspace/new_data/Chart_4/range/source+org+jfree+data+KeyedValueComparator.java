{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/KeyedValueComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyedValueComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 54,
      "end_line": 174,
      "comment": "\r\n * A utility class that can compare and order two {@link KeyedValue} instances\r\n * and sort them into ascending or descending order by key or by value.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The comparator type. "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The sort order. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyedValueComparator.KeyedValueComparator(org.jfree.data.KeyedValueComparatorType, org.jfree.chart.util.SortOrder)",
      "begin_line": 69,
      "end_line": 76,
      "comment": "\r\n     * Creates a new comparator.\r\n     *\r\n     * @param type  the type (\u003ccode\u003eBY_KEY\u003c/code\u003e or \u003ccode\u003eBY_VALUE\u003c/code\u003e,\r\n     *              \u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValueComparator.getType()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Returns the type.\r\n     *\r\n     * @return The type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValueComparator.getOrder()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the sort order.\r\n     *\r\n     * @return The sort order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValueComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 105,
      "end_line": 172,
      "comment": "\r\n     * Compares two {@link KeyedValue} instances and returns an\r\n     * \u003ccode\u003eint\u003c/code\u003e that indicates the relative order of the two objects.\r\n     *\r\n     * @param o1  object 1.\r\n     * @param o2  object 2.\r\n     *\r\n     * @return An int indicating the relative order of the objects.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 19)",
        "(line 116,col 9)-(line 116,col 41)",
        "(line 117,col 9)-(line 117,col 41)",
        "(line 119,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 22)"
      ]
    }
  ]
}