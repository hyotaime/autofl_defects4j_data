{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/stream/JsonScope.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonScope",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 71,
      "comment": "\n * Lexical scoping elements within a JSON reader or writer.\n *\n * @author Jesse Wilson\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ARRAY"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n     * An array with no elements requires no separators or newlines before\n     * it is closed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NONEMPTY_ARRAY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * A array with at least one value requires a comma and newline before\n     * the next element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_OBJECT"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * An object with no name/value pairs requires no separators or newlines\n     * before it is closed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DANGLING_NAME"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * An object whose most recent element is a key. The next element must\n     * be a value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NONEMPTY_OBJECT"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * An object with at least one name/value pair requires a comma and\n     * newline before the next element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOCUMENT"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * No object or array has been started.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NONEMPTY_DOCUMENT"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * A document with at an array or object.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CLOSED"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * A document that\u0027s been closed and cannot be accessed.\n     "
    }
  ]
}