{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/LazilyParsedNumber.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LazilyParsedNumber",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number"
      ],
      "begin_line": 26,
      "end_line": 96,
      "comment": "\n * This class holds a number value that is lazily converted to a specific number type\n *\n * @author Inderjeet Singh\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LazilyParsedNumber.LazilyParsedNumber(java.lang.String)",
      "begin_line": 30,
      "end_line": 32,
      "comment": " @param value must not be null ",
      "child_ranges": [
        "(line 31,col 5)-(line 31,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LazilyParsedNumber.intValue()",
      "begin_line": 34,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 44,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LazilyParsedNumber.longValue()",
      "begin_line": 47,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 53,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LazilyParsedNumber.floatValue()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LazilyParsedNumber.doubleValue()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LazilyParsedNumber.toString()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LazilyParsedNumber.writeReplace()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n   * If somebody is unlucky enough to have to serialize one of these, serialize\n   * it as a BigDecimal so that they won\u0027t need Gson on the other side to\n   * deserialize it.\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LazilyParsedNumber.hashCode()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LazilyParsedNumber.equals(java.lang.Object)",
      "begin_line": 85,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 89,col 5)",
        "(line 90,col 5)-(line 93,col 5)",
        "(line 94,col 5)-(line 94,col 17)"
      ]
    }
  ]
}