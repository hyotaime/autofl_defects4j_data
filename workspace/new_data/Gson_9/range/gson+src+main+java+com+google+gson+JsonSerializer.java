{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/JsonSerializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonSerializer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 72,
      "end_line": 89,
      "comment": "\n * Interface representing a custom serializer for Json. You should write a custom serializer, if\n * you are not happy with the default serialization done by Gson. You will also need to register\n * this serializer through {@link com.google.gson.GsonBuilder#registerTypeAdapter(Type, Object)}.\n *\n * \u003cp\u003eLet us look at example where defining a serializer will be useful. The {@code Id} class\n * defined below has two fields: {@code clazz} and {@code value}.\u003c/p\u003e\n *\n * \u003cp\u003e\u003cpre\u003e\n * public class Id\u0026lt;T\u0026gt; {\n *   private final Class\u0026lt;T\u0026gt; clazz;\n *   private final long value;\n *\n *   public Id(Class\u0026lt;T\u0026gt; clazz, long value) {\n *     this.clazz \u003d clazz;\n *     this.value \u003d value;\n *   }\n *\n *   public long getValue() {\n *     return value;\n *   }\n * }\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe default serialization of {@code Id(com.foo.MyObject.class, 20L)} will be\n * \u003ccode\u003e{\"clazz\":com.foo.MyObject,\"value\":20}\u003c/code\u003e. Suppose, you just want the output to be\n * the value instead, which is {@code 20} in this case. You can achieve that by writing a custom\n * serializer:\u003c/p\u003e\n *\n * \u003cp\u003e\u003cpre\u003e\n * class IdSerializer implements JsonSerializer\u0026lt;Id\u0026gt;() {\n *   public JsonElement serialize(Id id, Type typeOfId, JsonSerializationContext context) {\n *     return new JsonPrimitive(id.getValue());\n *   }\n * }\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eYou will also need to register {@code IdSerializer} with Gson as follows:\u003c/p\u003e\n * \u003cpre\u003e\n * Gson gson \u003d new GsonBuilder().registerTypeAdapter(Id.class, new IdSerializer()).create();\n * \u003c/pre\u003e\n *\n * \u003cp\u003eNew applications should prefer {@link TypeAdapter}, whose streaming API\n * is more efficient than this interface\u0027s tree API.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n *\n * @param \u003cT\u003e type for which the serializer is being registered. It is possible that a serializer\n *        may be asked to serialize a specific generic type of the T.\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonSerializer.serialize(T, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * Gson invokes this call-back method during serialization when it encounters a field of the\n   * specified type.\n   *\n   * \u003cp\u003eIn the implementation of this call-back method, you should consider invoking\n   * {@link JsonSerializationContext#serialize(Object, Type)} method to create JsonElements for any\n   * non-trivial field of the {@code src} object. However, you should never invoke it on the\n   * {@code src} object itself since that will cause an infinite loop (Gson will call your\n   * call-back method again).\u003c/p\u003e\n   *\n   * @param src the object that needs to be converted to Json.\n   * @param typeOfSrc the actual type (fully genericized version) of the source object.\n   * @return a JsonElement corresponding to the specified object.\n   ",
      "child_ranges": []
    }
  ]
}