{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/TypeAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 119,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n   * Writes one JSON value (an array, object, string, number, boolean or null)\n   * for {@code value}.\n   *\n   * @param value the Java object to write. May be null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.toJson(java.io.Writer, T)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n   * Converts {@code value} to a JSON document and writes it to {@code out}.\n   * Unlike Gson\u0027s similar {@link Gson#toJson(JsonElement, Appendable) toJson}\n   * method, this write is strict. Create a {@link\n   * JsonWriter#setLenient(boolean) lenient} {@code JsonWriter} and call\n   * {@link #write(com.google.gson.stream.JsonWriter, Object)} for lenient\n   * writing.\n   *\n   * @param value the Java object to convert. May be null.\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 44)",
        "(line 142,col 5)-(line 142,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.nullSafe()",
      "begin_line": 185,
      "end_line": 202,
      "comment": "\n   * This wrapper method is used to make a type adapter null tolerant. In general, a\n   * type adapter is required to handle nulls in write and read methods. Here is how this\n   * is typically done:\u003cbr\u003e\n   * \u003cpre\u003e   {@code\n   *\n   * Gson gson \u003d new GsonBuilder().registerTypeAdapter(Foo.class,\n   *   new TypeAdapter\u003cFoo\u003e() {\n   *     public Foo read(JsonReader in) throws IOException {\n   *       if (in.peek() \u003d\u003d JsonToken.NULL) {\n   *         in.nextNull();\n   *         return null;\n   *       }\n   *       // read a Foo from in and return it\n   *     }\n   *     public void write(JsonWriter out, Foo src) throws IOException {\n   *       if (src \u003d\u003d null) {\n   *         out.nullValue();\n   *         return;\n   *       }\n   *       // write src as JSON to out\n   *     }\n   *   }).create();\n   * }\u003c/pre\u003e\n   * You can avoid this boilerplate handling of nulls by wrapping your type adapter with\n   * this method. Here is how we will rewrite the above example:\n   * \u003cpre\u003e   {@code\n   *\n   * Gson gson \u003d new GsonBuilder().registerTypeAdapter(Foo.class,\n   *   new TypeAdapter\u003cFoo\u003e() {\n   *     public Foo read(JsonReader in) throws IOException {\n   *       // read a Foo from in and return it\n   *     }\n   *     public void write(JsonWriter out, Foo src) throws IOException {\n   *       // write src as JSON to out\n   *     }\n   *   }.nullSafe()).create();\n   * }\u003c/pre\u003e\n   * Note that we didn\u0027t need to check for nulls in our type adapter after we used nullSafe.\n   ",
      "child_ranges": [
        "(line 186,col 5)-(line 201,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.Anonymous-e812bdfe-ff91-46ac-9a51-80cbe2f7d68f.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 187,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.Anonymous-5db619c8-e010-487a-9bdf-f124f0872989.read(com.google.gson.stream.JsonReader)",
      "begin_line": 194,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.toJson(T)",
      "begin_line": 214,
      "end_line": 222,
      "comment": "\n   * Converts {@code value} to a JSON document. Unlike Gson\u0027s similar {@link\n   * Gson#toJson(Object) toJson} method, this write is strict. Create a {@link\n   * JsonWriter#setLenient(boolean) lenient} {@code JsonWriter} and call\n   * {@link #write(com.google.gson.stream.JsonWriter, Object)} for lenient\n   * writing.\n   *\n   * @param value the Java object to convert. May be null.\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 215,col 5)-(line 215,col 51)",
        "(line 216,col 5)-(line 220,col 5)",
        "(line 221,col 5)-(line 221,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.toJsonTree(T)",
      "begin_line": 231,
      "end_line": 239,
      "comment": "\n   * Converts {@code value} to a JSON tree.\n   *\n   * @param value the Java object to convert. May be null.\n   * @return the converted JSON tree. May be {@link JsonNull}.\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 238,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 247,
      "end_line": 247,
      "comment": "\n   * Reads one JSON value (an array, object, string, number, boolean or null)\n   * and converts it to a Java object. Returns the converted object.\n   *\n   * @return the converted Java object. May be null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.fromJson(java.io.Reader)",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n   * Converts the JSON document in {@code in} to a Java object. Unlike Gson\u0027s\n   * similar {@link Gson#fromJson(java.io.Reader, Class) fromJson} method, this\n   * read is strict. Create a {@link JsonReader#setLenient(boolean) lenient}\n   * {@code JsonReader} and call {@link #read(JsonReader)} for lenient reading.\n   *\n   * @return the converted Java object. May be null.\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 43)",
        "(line 260,col 5)-(line 260,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.fromJson(java.lang.String)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n   * Converts the JSON document in {@code json} to a Java object. Unlike Gson\u0027s\n   * similar {@link Gson#fromJson(String, Class) fromJson} method, this read is\n   * strict. Create a {@link JsonReader#setLenient(boolean) lenient} {@code\n   * JsonReader} and call {@link #read(JsonReader)} for lenient reading.\n   *\n   * @return the converted Java object. May be null.\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 273,col 5)-(line 273,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TypeAdapter.fromJsonTree(com.google.gson.JsonElement)",
      "begin_line": 282,
      "end_line": 289,
      "comment": "\n   * Converts {@code jsonTree} to a Java object.\n   *\n   * @param jsonTree the Java object to convert. May be {@link JsonNull}.\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 283,col 5)-(line 288,col 5)"
      ]
    }
  ]
}