{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/pie/PieDatasetChangeType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieDatasetChangeType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 161,
      "comment": "\n * An enumeration of the pie dataset change types.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "NEW"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n     * Represents a new dataset.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ADD"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": "\n     * Represents the addition of one or more data items to the series in a\n     * contiguous range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVE"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": "\n     * Represents the removal of one or more data items in a contiguous\n     * range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ADD_AND_REMOVE"
      ],
      "begin_line": 75,
      "end_line": 76,
      "comment": " Add one item and remove one other item. "
    },
    {
      "type": "field",
      "varNames": [
        "UPDATE"
      ],
      "begin_line": 82,
      "end_line": 83,
      "comment": "\n     * Represents a change of value for one or more data items in a contiguous\n     * range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHANGE_KEY"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": " Represents a change to an item key. "
    },
    {
      "type": "field",
      "varNames": [
        "CLEAR"
      ],
      "begin_line": 90,
      "end_line": 91,
      "comment": " Represents the clearing of all values in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.pie.PieDatasetChangeType.PieDatasetChangeType(java.lang.String)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetChangeType.toString()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetChangeType.equals(java.lang.Object)",
      "begin_line": 122,
      "end_line": 134,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 63)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetChangeType.hashCode()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.PieDatasetChangeType.readResolve()",
      "begin_line": 152,
      "end_line": 159,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     *\n     * @return The object.\n     *\n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 29)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 22)"
      ]
    }
  ]
}