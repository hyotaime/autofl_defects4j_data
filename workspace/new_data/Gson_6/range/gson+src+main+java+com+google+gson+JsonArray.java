{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/JsonArray.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonArray",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonElement",
        "java.lang.Iterable\u003ccom.google.gson.JsonElement\u003e"
      ],
      "begin_line": 33,
      "end_line": 373,
      "comment": "\n * A class representing an array type in Json. An array is a list of {@link JsonElement}s each of\n * which can be of a different type. This is an ordered list, meaning that the order in which\n * elements are added is preserved.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonArray.JsonArray()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n   * Creates an empty JsonArray.\n   ",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.deepCopy()",
      "begin_line": 43,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 39)",
        "(line 46,col 5)-(line 48,col 5)",
        "(line 49,col 5)-(line 49,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.add(java.lang.Boolean)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n   * Adds the specified boolean to self.\n   *\n   * @param bool the boolean that needs to be added to the array.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.add(java.lang.Character)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n   * Adds the specified character to self.\n   *\n   * @param character the character that needs to be added to the array.\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.add(java.lang.Number)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n   * Adds the specified number to self.\n   *\n   * @param number the number that needs to be added to the array.\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.add(java.lang.String)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n   * Adds the specified string to self.\n   *\n   * @param string the string that needs to be added to the array.\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.add(com.google.gson.JsonElement)",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\n   * Adds the specified element to self.\n   *\n   * @param element the element that needs to be added to the array.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 96,col 5)",
        "(line 97,col 5)-(line 97,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.addAll(com.google.gson.JsonArray)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n   * Adds all the elements of the specified array to self.\n   *\n   * @param array the array whose elements need to be added to the array.\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.set(int, com.google.gson.JsonElement)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n   * Replaces the element at the specified position in this array with the specified element.\n   *   Element can be null.\n   * @param index index of the element to replace\n   * @param element element to be stored at the specified position\n   * @return the element previously at the specified position\n   * @throws IndexOutOfBoundsException if the specified index is outside the array bounds\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.remove(com.google.gson.JsonElement)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n   * Removes the first occurrence of the specified element from this array, if it is present.\n   * If the array does not contain the element, it is unchanged.\n   * @param element element to be removed from this array, if present\n   * @return true if this array contained the specified element, false otherwise\n   * @since 2.3\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.remove(int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n   * Removes the element at the specified position in this array. Shifts any subsequent elements\n   * to the left (subtracts one from their indices). Returns the element that was removed from\n   * the array.\n   * @param index index the index of the element to be removed\n   * @return the element previously at the specified position\n   * @throws IndexOutOfBoundsException if the specified index is outside the array bounds\n   * @since 2.3\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.contains(com.google.gson.JsonElement)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n   * Returns true if this array contains the specified element.\n   * @return true if this array contains the specified element.\n   * @param element whose presence in this array is to be tested\n   * @since 2.3\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.size()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n   * Returns the number of elements in the array.\n   *\n   * @return the number of elements in the array.\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.iterator()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n   * Returns an iterator to navigate the elements of the array. Since the array is an ordered list,\n   * the iterator navigates the elements in the order they were inserted.\n   *\n   * @return an iterator to navigate the elements of the array.\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.get(int)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n   * Returns the ith element of the array.\n   *\n   * @param i the index of the element that is being sought.\n   * @return the element present at the ith index.\n   * @throws IndexOutOfBoundsException if i is negative or greater than or equal to the\n   * {@link #size()} of the array.\n   ",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsNumber()",
      "begin_line": 194,
      "end_line": 200,
      "comment": "\n   * convenience method to get this array as a {@link Number} if it contains a single element.\n   *\n   * @return get this element as a number if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and\n   * is not a valid Number.\n   * @throws IllegalStateException if the array has more than one element.\n   ",
      "child_ranges": [
        "(line 196,col 5)-(line 198,col 5)",
        "(line 199,col 5)-(line 199,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsString()",
      "begin_line": 210,
      "end_line": 216,
      "comment": "\n   * convenience method to get this array as a {@link String} if it contains a single element.\n   *\n   * @return get this element as a String if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and\n   * is not a valid String.\n   * @throws IllegalStateException if the array has more than one element.\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 214,col 5)",
        "(line 215,col 5)-(line 215,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsDouble()",
      "begin_line": 226,
      "end_line": 232,
      "comment": "\n   * convenience method to get this array as a double if it contains a single element.\n   *\n   * @return get this element as a double if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and\n   * is not a valid double.\n   * @throws IllegalStateException if the array has more than one element.\n   ",
      "child_ranges": [
        "(line 228,col 5)-(line 230,col 5)",
        "(line 231,col 5)-(line 231,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsBigDecimal()",
      "begin_line": 243,
      "end_line": 249,
      "comment": "\n   * convenience method to get this array as a {@link BigDecimal} if it contains a single element.\n   *\n   * @return get this element as a {@link BigDecimal} if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive}.\n   * @throws NumberFormatException if the element at index 0 is not a valid {@link BigDecimal}.\n   * @throws IllegalStateException if the array has more than one element.\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 247,col 5)",
        "(line 248,col 5)-(line 248,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsBigInteger()",
      "begin_line": 260,
      "end_line": 266,
      "comment": "\n   * convenience method to get this array as a {@link BigInteger} if it contains a single element.\n   *\n   * @return get this element as a {@link BigInteger} if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive}.\n   * @throws NumberFormatException if the element at index 0 is not a valid {@link BigInteger}.\n   * @throws IllegalStateException if the array has more than one element.\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 262,col 5)-(line 264,col 5)",
        "(line 265,col 5)-(line 265,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsFloat()",
      "begin_line": 276,
      "end_line": 282,
      "comment": "\n   * convenience method to get this array as a float if it contains a single element.\n   *\n   * @return get this element as a float if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and\n   * is not a valid float.\n   * @throws IllegalStateException if the array has more than one element.\n   ",
      "child_ranges": [
        "(line 278,col 5)-(line 280,col 5)",
        "(line 281,col 5)-(line 281,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsLong()",
      "begin_line": 292,
      "end_line": 298,
      "comment": "\n   * convenience method to get this array as a long if it contains a single element.\n   *\n   * @return get this element as a long if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and\n   * is not a valid long.\n   * @throws IllegalStateException if the array has more than one element.\n   ",
      "child_ranges": [
        "(line 294,col 5)-(line 296,col 5)",
        "(line 297,col 5)-(line 297,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsInt()",
      "begin_line": 308,
      "end_line": 314,
      "comment": "\n   * convenience method to get this array as an integer if it contains a single element.\n   *\n   * @return get this element as an integer if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and\n   * is not a valid integer.\n   * @throws IllegalStateException if the array has more than one element.\n   ",
      "child_ranges": [
        "(line 310,col 5)-(line 312,col 5)",
        "(line 313,col 5)-(line 313,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsByte()",
      "begin_line": 316,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 318,col 5)-(line 320,col 5)",
        "(line 321,col 5)-(line 321,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsCharacter()",
      "begin_line": 324,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 328,col 5)",
        "(line 329,col 5)-(line 329,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsShort()",
      "begin_line": 340,
      "end_line": 346,
      "comment": "\n   * convenience method to get this array as a primitive short if it contains a single element.\n   *\n   * @return get this element as a primitive short if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and\n   * is not a valid short.\n   * @throws IllegalStateException if the array has more than one element.\n   ",
      "child_ranges": [
        "(line 342,col 5)-(line 344,col 5)",
        "(line 345,col 5)-(line 345,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.getAsBoolean()",
      "begin_line": 356,
      "end_line": 362,
      "comment": "\n   * convenience method to get this array as a boolean if it contains a single element.\n   *\n   * @return get this element as a boolean if it is single element array.\n   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and\n   * is not a valid boolean.\n   * @throws IllegalStateException if the array has more than one element.\n   ",
      "child_ranges": [
        "(line 358,col 5)-(line 360,col 5)",
        "(line 361,col 5)-(line 361,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.equals(java.lang.Object)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonArray.hashCode()",
      "begin_line": 369,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 371,col 5)-(line 371,col 31)"
      ]
    }
  ]
}