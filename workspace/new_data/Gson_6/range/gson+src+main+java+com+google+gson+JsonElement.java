{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/JsonElement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonElement",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 330,
      "comment": "\n * A class representing an element of Json. It could either be a {@link JsonObject}, a\n * {@link JsonArray}, a {@link JsonPrimitive} or a {@link JsonNull}.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.deepCopy()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n   * Returns a deep copy of this element. Immutable elements like primitives\n   * and nulls are not copied.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.isJsonArray()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n   * provides check for verifying if this element is an array or not.\n   *\n   * @return true if this element is of type {@link JsonArray}, false otherwise.\n   ",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.isJsonObject()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n   * provides check for verifying if this element is a Json object or not.\n   *\n   * @return true if this element is of type {@link JsonObject}, false otherwise.\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.isJsonPrimitive()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n   * provides check for verifying if this element is a primitive or not.\n   *\n   * @return true if this element is of type {@link JsonPrimitive}, false otherwise.\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.isJsonNull()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n   * provides check for verifying if this element represents a null value or not.\n   *\n   * @return true if this element is of type {@link JsonNull}, false otherwise.\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsJsonObject()",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\n   * convenience method to get this element as a {@link JsonObject}. If the element is of some\n   * other type, a {@link IllegalStateException} will result. Hence it is best to use this method\n   * after ensuring that this element is of the desired type by calling {@link #isJsonObject()}\n   * first.\n   *\n   * @return get this element as a {@link JsonObject}.\n   * @throws IllegalStateException if the element is of another type.\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 89,col 5)",
        "(line 90,col 5)-(line 90,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsJsonArray()",
      "begin_line": 102,
      "end_line": 107,
      "comment": "\n   * convenience method to get this element as a {@link JsonArray}. If the element is of some\n   * other type, a {@link IllegalStateException} will result. Hence it is best to use this method\n   * after ensuring that this element is of the desired type by calling {@link #isJsonArray()}\n   * first.\n   *\n   * @return get this element as a {@link JsonArray}.\n   * @throws IllegalStateException if the element is of another type.\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 105,col 5)",
        "(line 106,col 5)-(line 106,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsJsonPrimitive()",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n   * convenience method to get this element as a {@link JsonPrimitive}. If the element is of some\n   * other type, a {@link IllegalStateException} will result. Hence it is best to use this method\n   * after ensuring that this element is of the desired type by calling {@link #isJsonPrimitive()}\n   * first.\n   *\n   * @return get this element as a {@link JsonPrimitive}.\n   * @throws IllegalStateException if the element is of another type.\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 121,col 5)",
        "(line 122,col 5)-(line 122,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsJsonNull()",
      "begin_line": 135,
      "end_line": 140,
      "comment": "\n   * convenience method to get this element as a {@link JsonNull}. If the element is of some\n   * other type, a {@link IllegalStateException} will result. Hence it is best to use this method\n   * after ensuring that this element is of the desired type by calling {@link #isJsonNull()}\n   * first.\n   *\n   * @return get this element as a {@link JsonNull}.\n   * @throws IllegalStateException if the element is of another type.\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 138,col 5)",
        "(line 139,col 5)-(line 139,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsBoolean()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n   * convenience method to get this element as a boolean value.\n   *\n   * @return get this element as a primitive boolean value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * boolean value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsBooleanWrapper()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n   * convenience method to get this element as a {@link Boolean} value.\n   *\n   * @return get this element as a {@link Boolean} value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * boolean value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsNumber()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n   * convenience method to get this element as a {@link Number}.\n   *\n   * @return get this element as a {@link Number}.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * number.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsString()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n   * convenience method to get this element as a string value.\n   *\n   * @return get this element as a string value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * string value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsDouble()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n   * convenience method to get this element as a primitive double value.\n   *\n   * @return get this element as a primitive double value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * double value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsFloat()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n   * convenience method to get this element as a primitive float value.\n   *\n   * @return get this element as a primitive float value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * float value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsLong()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n   * convenience method to get this element as a primitive long value.\n   *\n   * @return get this element as a primitive long value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * long value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsInt()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n   * convenience method to get this element as a primitive integer value.\n   *\n   * @return get this element as a primitive integer value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * integer value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 243,col 5)-(line 243,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsByte()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n   * convenience method to get this element as a primitive byte value.\n   *\n   * @return get this element as a primitive byte value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * byte value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsCharacter()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n   * convenience method to get this element as a primitive character value.\n   *\n   * @return get this element as a primitive char value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * char value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsBigDecimal()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n   * convenience method to get this element as a {@link BigDecimal}.\n   *\n   * @return get this element as a {@link BigDecimal}.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive}.\n   * * @throws NumberFormatException if the element is not a valid {@link BigDecimal}.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsBigInteger()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n   * convenience method to get this element as a {@link BigInteger}.\n   *\n   * @return get this element as a {@link BigInteger}.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive}.\n   * @throws NumberFormatException if the element is not a valid {@link BigInteger}.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.getAsShort()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n   * convenience method to get this element as a primitive short value.\n   *\n   * @return get this element as a primitive short value.\n   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid\n   * short value.\n   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains\n   * more than a single element.\n   ",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonElement.toString()",
      "begin_line": 318,
      "end_line": 329,
      "comment": "\n   * Returns a String representation of this element.\n   ",
      "child_ranges": [
        "(line 320,col 5)-(line 328,col 5)"
      ]
    }
  ]
}