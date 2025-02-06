{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/Primitives.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Primitives",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 119,
      "comment": "\n * Contains static utility methods pertaining to primitive types and their\n * corresponding wrapper types.\n *\n * @author Kevin Bourrillion\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.Primitives.Primitives()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 46)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "PRIMITIVE_TO_WRAPPER_TYPE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " A map from primitive types to their corresponding wrapper types. "
    },
    {
      "type": "field",
      "varNames": [
        "WRAPPER_TO_PRIMITIVE_TYPE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " A map from wrapper types to their corresponding primitive types. "
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Primitives.add(java.util.Map\u003cjava.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e\u003e, java.util.Map\u003cjava.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e\u003e, java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 28)",
        "(line 65,col 5)-(line 65,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Primitives.isPrimitive(java.lang.reflect.Type)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n   * Returns true if this type is a primitive.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Primitives.isWrapperType(java.lang.reflect.Type)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n   * Returns {@code true} if {@code type} is one of the nine\n   * primitive-wrapper types, such as {@link Integer}.\n   *\n   * @see Class#isPrimitive\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 83,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Primitives.wrap(java.lang.Class\u003cT\u003e)",
      "begin_line": 95,
      "end_line": 101,
      "comment": "\n   * Returns the corresponding wrapper type of {@code type} if it is a primitive\n   * type; otherwise returns {@code type} itself. Idempotent.\n   * \u003cpre\u003e\n   *     wrap(int.class) \u003d\u003d Integer.class\n   *     wrap(Integer.class) \u003d\u003d Integer.class\n   *     wrap(String.class) \u003d\u003d String.class\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 99,col 48)",
        "(line 100,col 5)-(line 100,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Primitives.unwrap(java.lang.Class\u003cT\u003e)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\n   * Returns the corresponding primitive type of {@code type} if it is a\n   * wrapper type; otherwise returns {@code type} itself. Idempotent.\n   * \u003cpre\u003e\n   *     unwrap(Integer.class) \u003d\u003d int.class\n   *     unwrap(int.class) \u003d\u003d int.class\n   *     unwrap(String.class) \u003d\u003d String.class\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 116,col 48)",
        "(line 117,col 5)-(line 117,col 50)"
      ]
    }
  ]
}