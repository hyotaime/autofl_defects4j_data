{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/JsonObject.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonObject",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonElement"
      ],
      "begin_line": 32,
      "end_line": 195,
      "comment": "\n * A class representing an object type in Json. An object consists of name-value pairs where names\n * are strings, and values are any other type of {@link JsonElement}. This allows for a creating a\n * tree of JsonElements. The member elements of this object are maintained in order they were added.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "members"
      ],
      "begin_line": 33,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.deepCopy()",
      "begin_line": 36,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 41)",
        "(line 39,col 5)-(line 41,col 5)",
        "(line 42,col 5)-(line 42,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.add(java.lang.String, com.google.gson.JsonElement)",
      "begin_line": 53,
      "end_line": 58,
      "comment": "\n   * Adds a member, which is a name-value pair, to self. The name must be a String, but the value\n   * can be an arbitrary JsonElement, thereby allowing you to build a full tree of JsonElements\n   * rooted at this node.\n   *\n   * @param property name of the member.\n   * @param value the member object.\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 56,col 5)",
        "(line 57,col 5)-(line 57,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.remove(java.lang.String)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n   * Removes the {@code property} from this {@link JsonObject}.\n   *\n   * @param property name of the member that should be removed.\n   * @return the {@link JsonElement} object that is being removed.\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.addProperty(java.lang.String, java.lang.String)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n   * Convenience method to add a primitive member. The specified value is converted to a\n   * JsonPrimitive of String.\n   *\n   * @param property name of the member.\n   * @param value the string value associated with the member.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.addProperty(java.lang.String, java.lang.Number)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n   * Convenience method to add a primitive member. The specified value is converted to a\n   * JsonPrimitive of Number.\n   *\n   * @param property name of the member.\n   * @param value the number value associated with the member.\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.addProperty(java.lang.String, java.lang.Boolean)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n   * Convenience method to add a boolean member. The specified value is converted to a\n   * JsonPrimitive of Boolean.\n   *\n   * @param property name of the member.\n   * @param value the number value associated with the member.\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.addProperty(java.lang.String, java.lang.Character)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n   * Convenience method to add a char member. The specified value is converted to a\n   * JsonPrimitive of Character.\n   *\n   * @param property name of the member.\n   * @param value the number value associated with the member.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.createJsonElement(java.lang.Object)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n   * Creates the proper {@link JsonElement} object from the given {@code value} object.\n   *\n   * @param value the object to generate the {@link JsonElement} for\n   * @return a {@link JsonPrimitive} if the {@code value} is not null, otherwise a {@link JsonNull}\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.entrySet()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n   * Returns a set of members of this object. The set is ordered, and the order is in which the\n   * elements were added.\n   *\n   * @return a set of members of this object.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.has(java.lang.String)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n   * Convenience method to check if a member with the specified name is present in this object.\n   *\n   * @param memberName name of the member that is being checked for presence.\n   * @return true if there is a member with the specified name, false otherwise.\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.get(java.lang.String)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n   * Returns the member with the specified name.\n   *\n   * @param memberName name of the member that is being requested.\n   * @return the member matching the name. Null if no such member exists.\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.getAsJsonPrimitive(java.lang.String)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n   * Convenience method to get the specified member as a JsonPrimitive element.\n   *\n   * @param memberName name of the member being requested.\n   * @return the JsonPrimitive corresponding to the specified member.\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.getAsJsonArray(java.lang.String)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n   * Convenience method to get the specified member as a JsonArray.\n   *\n   * @param memberName name of the member being requested.\n   * @return the JsonArray corresponding to the specified member.\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.getAsJsonObject(java.lang.String)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n   * Convenience method to get the specified member as a JsonObject.\n   *\n   * @param memberName name of the member being requested.\n   * @return the JsonObject corresponding to the specified member.\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.equals(java.lang.Object)",
      "begin_line": 185,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 188,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonObject.hashCode()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 30)"
      ]
    }
  ]
}