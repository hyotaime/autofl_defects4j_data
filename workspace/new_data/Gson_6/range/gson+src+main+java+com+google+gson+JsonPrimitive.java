{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/JsonPrimitive.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonPrimitive",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonElement"
      ],
      "begin_line": 33,
      "end_line": 341,
      "comment": "\n * A class representing a Json primitive value. A primitive value\n * is either a String, a Java primitive, or a Java primitive\n * wrapper type.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "PRIMITIVE_TYPES"
      ],
      "begin_line": 35,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonPrimitive.JsonPrimitive(java.lang.Boolean)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n   * Create a primitive containing a boolean value.\n   *\n   * @param bool the value to create the primitive with.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonPrimitive.JsonPrimitive(java.lang.Number)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n   * Create a primitive containing a {@link Number}.\n   *\n   * @param number the value to create the primitive with.\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonPrimitive.JsonPrimitive(java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n   * Create a primitive containing a String value.\n   *\n   * @param string the value to create the primitive with.\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonPrimitive.JsonPrimitive(java.lang.Character)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n   * Create a primitive containing a character. The character is turned into a one character String\n   * since Json only supports String.\n   *\n   * @param c the value to create the primitive with.\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonPrimitive.JsonPrimitive(java.lang.Object)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n   * Create a primitive using the specified Object. It must be an instance of {@link Number}, a\n   * Java primitive type, or a String.\n   *\n   * @param primitive the value to create the primitive with.\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.deepCopy()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.setValue(java.lang.Object)",
      "begin_line": 93,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 103,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.isBoolean()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n   * Check whether this primitive contains a boolean value.\n   *\n   * @return true if this primitive contains a boolean value, false otherwise.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsBooleanWrapper()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n   * convenience method to get this element as a {@link Boolean}.\n   *\n   * @return get this element as a {@link Boolean}.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsBoolean()",
      "begin_line": 130,
      "end_line": 138,
      "comment": "\n   * convenience method to get this element as a boolean value.\n   *\n   * @return get this element as a primitive boolean value.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 137,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.isNumber()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n   * Check whether this primitive contains a Number.\n   *\n   * @return true if this primitive contains a Number, false otherwise.\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsNumber()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "\n   * convenience method to get this element as a Number.\n   *\n   * @return get this element as a Number.\n   * @throws NumberFormatException if the value contained is not a valid Number.\n   ",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.isString()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n   * Check whether this primitive contains a String value.\n   *\n   * @return true if this primitive contains a String value, false otherwise.\n   ",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsString()",
      "begin_line": 174,
      "end_line": 183,
      "comment": "\n   * convenience method to get this element as a String.\n   *\n   * @return get this element as a String.\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 182,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsDouble()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n   * convenience method to get this element as a primitive double.\n   *\n   * @return get this element as a primitive double.\n   * @throws NumberFormatException if the value contained is not a valid double.\n   ",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsBigDecimal()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n   * convenience method to get this element as a {@link BigDecimal}.\n   *\n   * @return get this element as a {@link BigDecimal}.\n   * @throws NumberFormatException if the value contained is not a valid {@link BigDecimal}.\n   ",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsBigInteger()",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\n   * convenience method to get this element as a {@link BigInteger}.\n   *\n   * @return get this element as a {@link BigInteger}.\n   * @throws NumberFormatException if the value contained is not a valid {@link BigInteger}.\n   ",
      "child_ranges": [
        "(line 215,col 5)-(line 216,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsFloat()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n   * convenience method to get this element as a float.\n   *\n   * @return get this element as a float.\n   * @throws NumberFormatException if the value contained is not a valid float.\n   ",
      "child_ranges": [
        "(line 227,col 5)-(line 227,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsLong()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n   * convenience method to get this element as a primitive long.\n   *\n   * @return get this element as a primitive long.\n   * @throws NumberFormatException if the value contained is not a valid long.\n   ",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsShort()",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n   * convenience method to get this element as a primitive short.\n   *\n   * @return get this element as a primitive short.\n   * @throws NumberFormatException if the value contained is not a valid short value.\n   ",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsInt()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n  * convenience method to get this element as a primitive integer.\n  *\n  * @return get this element as a primitive integer.\n  * @throws NumberFormatException if the value contained is not a valid integer.\n  ",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsByte()",
      "begin_line": 263,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.getAsCharacter()",
      "begin_line": 268,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.isPrimitiveOrString(java.lang.Object)",
      "begin_line": 273,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 276,col 5)",
        "(line 278,col 5)-(line 278,col 50)",
        "(line 279,col 5)-(line 283,col 5)",
        "(line 284,col 5)-(line 284,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.hashCode()",
      "begin_line": 287,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 289,col 5)-(line 291,col 5)",
        "(line 293,col 5)-(line 296,col 5)",
        "(line 297,col 5)-(line 300,col 5)",
        "(line 301,col 5)-(line 301,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.equals(java.lang.Object)",
      "begin_line": 304,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 308,col 5)",
        "(line 309,col 5)-(line 311,col 5)",
        "(line 312,col 5)-(line 312,col 45)",
        "(line 313,col 5)-(line 315,col 5)",
        "(line 316,col 5)-(line 318,col 5)",
        "(line 319,col 5)-(line 325,col 5)",
        "(line 326,col 5)-(line 326,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonPrimitive.isIntegral(com.google.gson.JsonPrimitive)",
      "begin_line": 333,
      "end_line": 340,
      "comment": "\n   * Returns true if the specified number is an integral type\n   * (Long, Integer, Short, Byte, BigInteger)\n   ",
      "child_ranges": [
        "(line 334,col 5)-(line 338,col 5)",
        "(line 339,col 5)-(line 339,col 17)"
      ]
    }
  ]
}