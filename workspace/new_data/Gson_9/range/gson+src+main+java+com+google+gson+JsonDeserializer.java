{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/JsonDeserializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonDeserializer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 91,
      "comment": "\n * \u003cp\u003eInterface representing a custom deserializer for Json. You should write a custom\n * deserializer, if you are not happy with the default deserialization done by Gson. You will\n * also need to register this deserializer through\n * {@link GsonBuilder#registerTypeAdapter(Type, Object)}.\u003c/p\u003e\n *\n * \u003cp\u003eLet us look at example where defining a deserializer will be useful. The {@code Id} class\n * defined below has two fields: {@code clazz} and {@code value}.\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class Id\u0026lt;T\u0026gt; {\n *   private final Class\u0026lt;T\u0026gt; clazz;\n *   private final long value;\n *   public Id(Class\u0026lt;T\u0026gt; clazz, long value) {\n *     this.clazz \u003d clazz;\n *     this.value \u003d value;\n *   }\n *   public long getValue() {\n *     return value;\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eThe default deserialization of {@code Id(com.foo.MyObject.class, 20L)} will require the\n * Json string to be \u003ccode\u003e{\"clazz\":com.foo.MyObject,\"value\":20}\u003c/code\u003e. Suppose, you already know\n * the type of the field that the {@code Id} will be deserialized into, and hence just want to\n * deserialize it from a Json string {@code 20}. You can achieve that by writing a custom\n * deserializer:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * class IdDeserializer implements JsonDeserializer\u0026lt;Id\u0026gt;() {\n *   public Id deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)\n *       throws JsonParseException {\n *     return new Id((Class)typeOfT, id.getValue());\n *   }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eYou will also need to register {@code IdDeserializer} with Gson as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Gson gson \u003d new GsonBuilder().registerTypeAdapter(Id.class, new IdDeserializer()).create();\n * \u003c/pre\u003e\n *\n * \u003cp\u003eNew applications should prefer {@link TypeAdapter}, whose streaming API\n * is more efficient than this interface\u0027s tree API.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n *\n * @param \u003cT\u003e type for which the deserializer is being registered. It is possible that a\n * deserializer may be asked to deserialize a specific generic type of the T.\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonDeserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n   * Gson invokes this call-back method during deserialization when it encounters a field of the\n   * specified type.\n   * \u003cp\u003eIn the implementation of this call-back method, you should consider invoking\n   * {@link JsonDeserializationContext#deserialize(JsonElement, Type)} method to create objects\n   * for any non-trivial field of the returned object. However, you should never invoke it on the\n   * the same type passing {@code json} since that will cause an infinite loop (Gson will call your\n   * call-back method again).\n   *\n   * @param json The Json data being deserialized\n   * @param typeOfT The type of the Object to deserialize to\n   * @return a deserialized object of the specified type typeOfT which is a subclass of {@code T}\n   * @throws JsonParseException if json is not in the expected format of {@code typeofT}\n   ",
      "child_ranges": []
    }
  ]
}