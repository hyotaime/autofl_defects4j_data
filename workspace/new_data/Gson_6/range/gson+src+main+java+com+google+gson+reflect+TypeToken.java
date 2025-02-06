{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/reflect/TypeToken.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeToken",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 305,
      "comment": "\n * Represents a generic type {@code T}. Java doesn\u0027t yet provide a way to\n * represent generic types, so this class does. Forces clients to create a\n * subclass of this class which enables retrieval the type information even at\n * runtime.\n *\n * \u003cp\u003eFor example, to create a type literal for {@code List\u003cString\u003e}, you can\n * create an empty anonymous inner class:\n *\n * \u003cp\u003e\n * {@code TypeToken\u003cList\u003cString\u003e\u003e list \u003d new TypeToken\u003cList\u003cString\u003e\u003e() {};}\n *\n * \u003cp\u003eThis syntax cannot be used to create type literals that have wildcard\n * parameters, such as {@code Class\u003c?\u003e} or {@code List\u003c? extends CharSequence\u003e}.\n *\n * @author Bob Lee\n * @author Sven Mawson\n * @author Jesse Wilson\n "
    },
    {
      "type": "field",
      "varNames": [
        "rawType"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.reflect.TypeToken.TypeToken()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n   * Constructs a new type literal. Derives represented class from type\n   * parameter.\n   *\n   * \u003cp\u003eClients create an empty anonymous subclass. Doing so embeds the type\n   * parameter in the anonymous class\u0027s type hierarchy so we can reconstitute it\n   * at runtime despite erasure.\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 55)",
        "(line 63,col 5)-(line 63,col 67)",
        "(line 64,col 5)-(line 64,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.reflect.TypeToken.TypeToken(java.lang.reflect.Type)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n   * Unsafe. Constructs a type literal manually.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 81)",
        "(line 73,col 5)-(line 73,col 72)",
        "(line 74,col 5)-(line 74,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.getSuperclassTypeParameter(java.lang.Class\u003c?\u003e)",
      "begin_line": 81,
      "end_line": 88,
      "comment": "\n   * Returns the type from super class\u0027s type parameter in {@link $Gson$Types#canonicalize\n   * canonical form}.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 54)",
        "(line 83,col 5)-(line 85,col 5)",
        "(line 86,col 5)-(line 86,col 69)",
        "(line 87,col 5)-(line 87,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.getRawType()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n   * Returns the raw (non-generic) type for this type.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.getType()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n   * Gets underlying {@code Type} instance.\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.isAssignableFrom(java.lang.Class\u003c?\u003e)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n   * Check if this type is assignable from the given class object.\n   *\n   * @deprecated this implementation may be inconsistent with javac for types\n   *     with wildcards.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.isAssignableFrom(java.lang.reflect.Type)",
      "begin_line": 121,
      "end_line": 143,
      "comment": "\n   * Check if this type is assignable from the given Type.\n   *\n   * @deprecated this implementation may be inconsistent with javac for types\n   *     with wildcards.\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 125,col 5)",
        "(line 127,col 5)-(line 129,col 5)",
        "(line 131,col 5)-(line 142,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.isAssignableFrom(com.google.gson.reflect.TypeToken\u003c?\u003e)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n   * Check if this type is assignable from the given type token.\n   *\n   * @deprecated this implementation may be inconsistent with javac for types\n   *     with wildcards.\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.isAssignableFrom(java.lang.reflect.Type, java.lang.reflect.GenericArrayType)",
      "begin_line": 160,
      "end_line": 179,
      "comment": "\n   * Private helper function that performs some assignability checks for\n   * the provided GenericArrayType.\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 63)",
        "(line 162,col 5)-(line 175,col 5)",
        "(line 178,col 5)-(line 178,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.isAssignableFrom(java.lang.reflect.Type, java.lang.reflect.ParameterizedType, java.util.Map\u003cjava.lang.String, java.lang.reflect.Type\u003e)",
      "begin_line": 185,
      "end_line": 232,
      "comment": "\n   * Private recursive helper function to actually do the type-safe checking\n   * of assignability.\n   ",
      "child_ranges": [
        "(line 188,col 5)-(line 190,col 5)",
        "(line 192,col 5)-(line 194,col 5)",
        "(line 197,col 5)-(line 197,col 50)",
        "(line 198,col 5)-(line 198,col 35)",
        "(line 199,col 5)-(line 201,col 5)",
        "(line 204,col 5)-(line 221,col 5)",
        "(line 223,col 5)-(line 227,col 5)",
        "(line 230,col 5)-(line 230,col 46)",
        "(line 231,col 5)-(line 231,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.typeEquals(java.lang.reflect.ParameterizedType, java.lang.reflect.ParameterizedType, java.util.Map\u003cjava.lang.String, java.lang.reflect.Type\u003e)",
      "begin_line": 238,
      "end_line": 251,
      "comment": "\n   * Checks if two parameterized types are exactly equal, under the variable\n   * replacement described in the typeVarMap.\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 249,col 5)",
        "(line 250,col 5)-(line 250,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.buildUnexpectedTypeError(java.lang.reflect.Type, java.lang.Class\u003c?\u003e...)",
      "begin_line": 253,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 257,col 5)-(line 258,col 64)",
        "(line 259,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 263,col 75)",
        "(line 265,col 5)-(line 265,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.matches(java.lang.reflect.Type, java.lang.reflect.Type, java.util.Map\u003cjava.lang.String, java.lang.reflect.Type\u003e)",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\n   * Checks if two types are the same or are equivalent under a variable mapping\n   * given in the type map that was provided.\n   ",
      "child_ranges": [
        "(line 273,col 5)-(line 275,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.hashCode()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 5)-(line 280,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.equals(java.lang.Object)",
      "begin_line": 283,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 284,col 5)-(line 285,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.toString()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 5)-(line 289,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.get(java.lang.reflect.Type)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n   * Gets type literal for the given {@code Type} instance.\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.reflect.TypeToken.get(java.lang.Class\u003cT\u003e)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n   * Gets type literal for the given {@code Class} instance.\n   ",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 34)"
      ]
    }
  ]
}