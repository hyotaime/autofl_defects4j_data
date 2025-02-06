{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/ExclusionStrategy.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExclusionStrategy",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 96,
      "end_line": 109,
      "comment": "\n * A strategy (or policy) definition that is used to decide whether or not a field or top-level\n * class should be serialized or deserialized as part of the JSON output/input. For serialization,\n * if the {@link #shouldSkipClass(Class)} method returns true then that class or field type\n * will not be part of the JSON output.  For deserialization, if {@link #shouldSkipClass(Class)}\n * returns true, then it will not be set as part of the Java object structure.\n *\n * \u003cp\u003eThe following are a few examples that shows how you can use this exclusion mechanism.\n *\n * \u003cp\u003e\u003cstrong\u003eExclude fields and objects based on a particular class type:\u003c/strong\u003e\n * \u003cpre class\u003d\"code\"\u003e\n * private static class SpecificClassExclusionStrategy implements ExclusionStrategy {\n *   private final Class\u0026lt;?\u0026gt; excludedThisClass;\n *\n *   public SpecificClassExclusionStrategy(Class\u0026lt;?\u0026gt; excludedThisClass) {\n *     this.excludedThisClass \u003d excludedThisClass;\n *   }\n *\n *   public boolean shouldSkipClass(Class\u0026lt;?\u0026gt; clazz) {\n *     return excludedThisClass.equals(clazz);\n *   }\n *\n *   public boolean shouldSkipField(FieldAttributes f) {\n *     return excludedThisClass.equals(f.getDeclaredClass());\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\u003cstrong\u003eExcludes fields and objects based on a particular annotation:\u003c/strong\u003e\n * \u003cpre class\u003d\"code\"\u003e\n * public \u0026#64interface FooAnnotation {\n *   // some implementation here\n * }\n *\n * // Excludes any field (or class) that is tagged with an \"\u0026#64FooAnnotation\"\n * private static class FooAnnotationExclusionStrategy implements ExclusionStrategy {\n *   public boolean shouldSkipClass(Class\u0026lt;?\u0026gt; clazz) {\n *     return clazz.getAnnotation(FooAnnotation.class) !\u003d null;\n *   }\n *\n *   public boolean shouldSkipField(FieldAttributes f) {\n *     return f.getAnnotation(FooAnnotation.class) !\u003d null;\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eNow if you want to configure {@code Gson} to use a user defined exclusion strategy, then\n * the {@code GsonBuilder} is required. The following is an example of how you can use the\n * {@code GsonBuilder} to configure Gson to use one of the above sample:\n * \u003cpre class\u003d\"code\"\u003e\n * ExclusionStrategy excludeStrings \u003d new UserDefinedExclusionStrategy(String.class);\n * Gson gson \u003d new GsonBuilder()\n *     .setExclusionStrategies(excludeStrings)\n *     .create();\n * \u003c/pre\u003e\n *\n * \u003cp\u003eFor certain model classes, you may only want to serialize a field, but exclude it for\n * deserialization. To do that, you can write an {@code ExclusionStrategy} as per normal;\n * however, you would register it with the\n * {@link GsonBuilder#addDeserializationExclusionStrategy(ExclusionStrategy)} method.\n * For example:\n * \u003cpre class\u003d\"code\"\u003e\n * ExclusionStrategy excludeStrings \u003d new UserDefinedExclusionStrategy(String.class);\n * Gson gson \u003d new GsonBuilder()\n *     .addDeserializationExclusionStrategy(excludeStrings)\n *     .create();\n * \u003c/pre\u003e\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n *\n * @see GsonBuilder#setExclusionStrategies(ExclusionStrategy...)\n * @see GsonBuilder#addDeserializationExclusionStrategy(ExclusionStrategy)\n * @see GsonBuilder#addSerializationExclusionStrategy(ExclusionStrategy)\n *\n * @since 1.4\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExclusionStrategy.shouldSkipField(com.google.gson.FieldAttributes)",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n   * @param f the field object that is under test\n   * @return true if the field should be ignored; otherwise false\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExclusionStrategy.shouldSkipClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n   * @param clazz the class object that is under test\n   * @return true if the class should be ignored; otherwise false\n   ",
      "child_ranges": []
    }
  ]
}