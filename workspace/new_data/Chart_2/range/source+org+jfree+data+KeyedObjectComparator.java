{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/KeyedObjectComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyedObjectComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 51,
      "end_line": 157,
      "comment": "\n * A utility class that can compare and order two {@link KeyedObject} instances\n * and sort them into ascending or descending order by key or by object.\n "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The comparator type. "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The sort order. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyedObjectComparator.KeyedObjectComparator(org.jfree.data.KeyedObjectComparatorType, org.jfree.chart.util.SortOrder)",
      "begin_line": 66,
      "end_line": 73,
      "comment": "\n     * Creates a new comparator.\n     *\n     * @param type  the type (\u003ccode\u003eBY_KEY\u003c/code\u003e or \u003ccode\u003eBY_OBJECT\u003c/code\u003e,\n     *              \u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjectComparator.getType()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns the type.\n     *\n     * @return The type (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjectComparator.getOrder()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns the sort order.\n     *\n     * @return The sort order (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjectComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 102,
      "end_line": 155,
      "comment": "\n     * Compares two {@link KeyedValue} instances and returns an\n     * \u003ccode\u003eint\u003c/code\u003e that indicates the relative order of the two objects.\n     *\n     * @param o1  object 1.\n     * @param o2  object 2.\n     *\n     * @return An int indicating the relative order of the objects.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 43)",
        "(line 112,col 9)-(line 112,col 43)",
        "(line 114,col 9)-(line 154,col 9)"
      ]
    }
  ]
}