{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/JsonDeserializationContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonDeserializationContext",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 44,
      "comment": "\n * Context for deserialization that is passed to a custom deserializer during invocation of its\n * {@link JsonDeserializer#deserialize(JsonElement, Type, JsonDeserializationContext)}\n * method.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonDeserializationContext.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n   * Invokes default deserialization on the specified object. It should never be invoked on\n   * the element received as a parameter of the\n   * {@link JsonDeserializer#deserialize(JsonElement, Type, JsonDeserializationContext)} method. Doing\n   * so will result in an infinite loop since Gson will in-turn call the custom deserializer again.\n   *\n   * @param json the parse tree.\n   * @param typeOfT type of the expected return value.\n   * @param \u003cT\u003e The type of the deserialized object.\n   * @return An object of type typeOfT.\n   * @throws JsonParseException if the parse tree does not contain expected data.\n   ",
      "child_ranges": []
    }
  ]
}