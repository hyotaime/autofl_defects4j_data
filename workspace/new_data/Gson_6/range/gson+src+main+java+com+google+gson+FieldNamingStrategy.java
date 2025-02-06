{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/FieldNamingStrategy.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldNamingStrategy",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 40,
      "comment": "\n * A mechanism for providing custom field naming in Gson.  This allows the client code to translate\n * field names into a particular convention that is not supported as a normal Java field\n * declaration rules.  For example, Java does not support \"-\" characters in a field name.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n * @since 1.3\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldNamingStrategy.translateName(java.lang.reflect.Field)",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n   * Translates the field name into its JSON field name representation.\n   *\n   * @param f the field object that we are translating\n   * @return the translated field name.\n   * @since 1.3\n   ",
      "child_ranges": []
    }
  ]
}