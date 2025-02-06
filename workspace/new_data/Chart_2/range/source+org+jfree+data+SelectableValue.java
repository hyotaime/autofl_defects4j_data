{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/SelectableValue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SelectableValue",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.Value",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 106,
      "comment": "\n * A data structure for a numerical value along with selection status.\n * \n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The value (\u003ccode\u003enull\u003c/code\u003e is permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Is the item selected? "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.SelectableValue.SelectableValue(java.lang.Number)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Creates a new instance with the specified value and the selection\n     * state set to \u003ccode\u003efalse\u003c/code\u003e.\n     *\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.SelectableValue.SelectableValue(java.lang.Number, boolean)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Creates a new instance with the specified value and selection state.\n     *\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param selected  the selection state.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.SelectableValue.getValue()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns the value for this data item.\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.SelectableValue.isSelected()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Returns the selection state.\n     *\n     * @return The selection state.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.SelectableValue.setSelected(boolean)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Sets the selection state.\n     *\n     * @param selected  selected?\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)"
      ]
    }
  ]
}