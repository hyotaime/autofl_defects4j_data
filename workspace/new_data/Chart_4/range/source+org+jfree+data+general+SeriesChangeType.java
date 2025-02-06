{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/SeriesChangeType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SeriesChangeType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 152,
      "comment": "\n * An enumeration of the series change types.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHANGE_KEY"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " Represents a change to the series key. "
    },
    {
      "type": "field",
      "varNames": [
        "ADD"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": "\n     * Represents the addition of one or more data items to the series in a\n     * contiguous range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVE"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": "\n     * Represents the removal of one or more data items in a contiguous\n     * range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ADD_AND_REMOVE"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": " Add one item and remove one other item. "
    },
    {
      "type": "field",
      "varNames": [
        "UPDATE"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": "\n     * Represents a change of value for one or more data items in a contiguous\n     * range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.SeriesChangeType.SeriesChangeType(java.lang.String)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeType.toString()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeType.equals(java.lang.Object)",
      "begin_line": 113,
      "end_line": 125,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 56)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeType.hashCode()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeType.readResolve()",
      "begin_line": 143,
      "end_line": 150,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     *\n     * @return The object.\n     *\n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 29)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 22)"
      ]
    }
  ]
}