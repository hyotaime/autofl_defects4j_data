{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/JsonSerializationContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonSerializationContext",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 49,
      "comment": "\n * Context for serialization that is passed to a custom serializer during invocation of its\n * {@link JsonSerializer#serialize(Object, Type, JsonSerializationContext)} method.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonSerializationContext.serialize(java.lang.Object)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n   * Invokes default serialization on the specified object.\n   *\n   * @param src the object that needs to be serialized.\n   * @return a tree of {@link JsonElement}s corresponding to the serialized form of {@code src}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonSerializationContext.serialize(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n   * Invokes default serialization on the specified object passing the specific type information.\n   * It should never be invoked on the element received as a parameter of the\n   * {@link JsonSerializer#serialize(Object, Type, JsonSerializationContext)} method. Doing\n   * so will result in an infinite loop since Gson will in-turn call the custom serializer again.\n   *\n   * @param src the object that needs to be serialized.\n   * @param typeOfSrc the actual genericized type of src object.\n   * @return a tree of {@link JsonElement}s corresponding to the serialized form of {@code src}.\n   ",
      "child_ranges": []
    }
  ]
}