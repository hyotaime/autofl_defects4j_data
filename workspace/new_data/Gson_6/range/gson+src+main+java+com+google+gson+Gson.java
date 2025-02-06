{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/Gson.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gson",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 102,
      "end_line": 981,
      "comment": "\n * This is the main class for using Gson. Gson is typically used by first constructing a\n * Gson instance and then invoking {@link #toJson(Object)} or {@link #fromJson(String, Class)}\n * methods on it. Gson instances are Thread-safe so you can reuse them freely across multiple\n * threads.\n *\n * \u003cp\u003eYou can create a Gson instance by invoking {@code new Gson()} if the default configuration\n * is all you need. You can also use {@link GsonBuilder} to build a Gson instance with various\n * configuration options such as versioning support, pretty printing, custom\n * {@link JsonSerializer}s, {@link JsonDeserializer}s, and {@link InstanceCreator}s.\u003c/p\u003e\n *\n * \u003cp\u003eHere is an example of how Gson is used for a simple Class:\n *\n * \u003cpre\u003e\n * Gson gson \u003d new Gson(); // Or use new GsonBuilder().create();\n * MyType target \u003d new MyType();\n * String json \u003d gson.toJson(target); // serializes target to Json\n * MyType target2 \u003d gson.fromJson(json, MyType.class); // deserializes json into target2\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eIf the object that your are serializing/deserializing is a {@code ParameterizedType}\n * (i.e. contains at least one type parameter and may be an array) then you must use the\n * {@link #toJson(Object, Type)} or {@link #fromJson(String, Type)} method.  Here is an\n * example for serializing and deserializing a {@code ParameterizedType}:\n *\n * \u003cpre\u003e\n * Type listType \u003d new TypeToken\u0026lt;List\u0026lt;String\u0026gt;\u0026gt;() {}.getType();\n * List\u0026lt;String\u0026gt; target \u003d new LinkedList\u0026lt;String\u0026gt;();\n * target.add(\"blah\");\n *\n * Gson gson \u003d new Gson();\n * String json \u003d gson.toJson(target, listType);\n * List\u0026lt;String\u0026gt; target2 \u003d gson.fromJson(json, listType);\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eSee the \u003ca href\u003d\"https://sites.google.com/site/gson/gson-user-guide\"\u003eGson User Guide\u003c/a\u003e\n * for a more complete set of examples.\u003c/p\u003e\n *\n * @see com.google.gson.reflect.TypeToken\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n * @author Jesse Wilson\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_JSON_NON_EXECUTABLE"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LENIENT"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PRETTY_PRINT"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ESCAPE_HTML"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SERIALIZE_NULLS"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPLEX_MAP_KEYS"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SPECIALIZE_FLOAT_VALUES"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JSON_NON_EXECUTABLE_PREFIX"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calls"
      ],
      "begin_line": 120,
      "end_line": 121,
      "comment": "\n   * This thread local guards against reentrant calls to getAdapter(). In\n   * certain object graphs, creating an adapter for a type may recursively\n   * require an adapter for the same type! Without intervention, the recursive\n   * lookup would stack overflow. We cheat by returning a proxy type adapter.\n   * The proxy is wired up once the initial adapter has been created.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeTokenCache"
      ],
      "begin_line": 123,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factories"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructorConstructor"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializeNulls"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "htmlSafe"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generateNonExecutableJson"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrinting"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lenient"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deserializationContext"
      ],
      "begin_line": 135,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-964fae58-36ed-44c8-bad5-68774981ad24.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serializationContext"
      ],
      "begin_line": 142,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-cd61c6a9-eb96-4f34-b3c6-8564549fb079.serialize(java.lang.Object)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-ba6c0c25-8650-4362-a03e-ba76f4fd510d.serialize(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.Gson.Gson()",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n   * Constructs a Gson object with default configuration. The default configuration has the\n   * following settings:\n   * \u003cul\u003e\n   *   \u003cli\u003eThe JSON generated by \u003ccode\u003etoJson\u003c/code\u003e methods is in compact representation. This\n   *   means that all the unneeded white-space is removed. You can change this behavior with\n   *   {@link GsonBuilder#setPrettyPrinting()}. \u003c/li\u003e\n   *   \u003cli\u003eThe generated JSON omits all the fields that are null. Note that nulls in arrays are\n   *   kept as is since an array is an ordered list. Moreover, if a field is not null, but its\n   *   generated JSON is empty, the field is kept. You can configure Gson to serialize null values\n   *   by setting {@link GsonBuilder#serializeNulls()}.\u003c/li\u003e\n   *   \u003cli\u003eGson provides default serialization and deserialization for Enums, {@link Map},\n   *   {@link java.net.URL}, {@link java.net.URI}, {@link java.util.Locale}, {@link java.util.Date},\n   *   {@link java.math.BigDecimal}, and {@link java.math.BigInteger} classes. If you would prefer\n   *   to change the default representation, you can do so by registering a type adapter through\n   *   {@link GsonBuilder#registerTypeAdapter(Type, Object)}. \u003c/li\u003e\n   *   \u003cli\u003eThe default Date format is same as {@link java.text.DateFormat#DEFAULT}. This format\n   *   ignores the millisecond portion of the date during serialization. You can change\n   *   this by invoking {@link GsonBuilder#setDateFormat(int)} or\n   *   {@link GsonBuilder#setDateFormat(String)}. \u003c/li\u003e\n   *   \u003cli\u003eBy default, Gson ignores the {@link com.google.gson.annotations.Expose} annotation.\n   *   You can enable Gson to serialize/deserialize only those fields marked with this annotation\n   *   through {@link GsonBuilder#excludeFieldsWithoutExposeAnnotation()}. \u003c/li\u003e\n   *   \u003cli\u003eBy default, Gson ignores the {@link com.google.gson.annotations.Since} annotation. You\n   *   can enable Gson to use this annotation through {@link GsonBuilder#setVersion(double)}.\u003c/li\u003e\n   *   \u003cli\u003eThe default field naming policy for the output Json is same as in Java. So, a Java class\n   *   field \u003ccode\u003eversionNumber\u003c/code\u003e will be output as \u003ccode\u003e\u0026quot;versionNumber\u0026quot;\u003c/code\u003e in\n   *   Json. The same rules are applied for mapping incoming Json to the Java classes. You can\n   *   change this policy through {@link GsonBuilder#setFieldNamingPolicy(FieldNamingPolicy)}.\u003c/li\u003e\n   *   \u003cli\u003eBy default, Gson excludes \u003ccode\u003etransient\u003c/code\u003e or \u003ccode\u003estatic\u003c/code\u003e fields from\n   *   consideration for serialization and deserialization. You can change this behavior through\n   *   {@link GsonBuilder#excludeFieldsWithModifiers(int...)}.\u003c/li\u003e\n   * \u003c/ul\u003e\n   ",
      "child_ranges": [
        "(line 186,col 5)-(line 190,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.Gson.Gson(com.google.gson.internal.Excluder, com.google.gson.FieldNamingStrategy, java.util.Map\u003cjava.lang.reflect.Type, com.google.gson.InstanceCreator\u003c?\u003e\u003e, boolean, boolean, boolean, boolean, boolean, boolean, boolean, com.google.gson.LongSerializationPolicy, java.util.List\u003ccom.google.gson.TypeAdapterFactory\u003e)",
      "begin_line": 193,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 79)",
        "(line 200,col 5)-(line 200,col 41)",
        "(line 201,col 5)-(line 201,col 63)",
        "(line 202,col 5)-(line 202,col 29)",
        "(line 203,col 5)-(line 203,col 41)",
        "(line 204,col 5)-(line 204,col 27)",
        "(line 206,col 5)-(line 206,col 77)",
        "(line 209,col 5)-(line 209,col 53)",
        "(line 210,col 5)-(line 210,col 45)",
        "(line 213,col 5)-(line 213,col 28)",
        "(line 216,col 5)-(line 216,col 43)",
        "(line 219,col 5)-(line 219,col 47)",
        "(line 220,col 5)-(line 220,col 48)",
        "(line 221,col 5)-(line 221,col 48)",
        "(line 222,col 5)-(line 222,col 45)",
        "(line 223,col 5)-(line 223,col 46)",
        "(line 224,col 5)-(line 224,col 75)",
        "(line 225,col 5)-(line 225,col 80)",
        "(line 226,col 5)-(line 227,col 65)",
        "(line 228,col 5)-(line 229,col 64)",
        "(line 230,col 5)-(line 230,col 47)",
        "(line 231,col 5)-(line 231,col 55)",
        "(line 232,col 5)-(line 232,col 55)",
        "(line 233,col 5)-(line 233,col 93)",
        "(line 234,col 5)-(line 234,col 103)",
        "(line 235,col 5)-(line 235,col 61)",
        "(line 236,col 5)-(line 236,col 50)",
        "(line 237,col 5)-(line 237,col 55)",
        "(line 238,col 5)-(line 238,col 54)",
        "(line 239,col 5)-(line 239,col 87)",
        "(line 240,col 5)-(line 240,col 87)",
        "(line 241,col 5)-(line 241,col 44)",
        "(line 242,col 5)-(line 242,col 44)",
        "(line 243,col 5)-(line 243,col 45)",
        "(line 244,col 5)-(line 244,col 49)",
        "(line 245,col 5)-(line 245,col 47)",
        "(line 246,col 5)-(line 246,col 53)",
        "(line 247,col 5)-(line 247,col 48)",
        "(line 248,col 5)-(line 248,col 43)",
        "(line 249,col 5)-(line 249,col 49)",
        "(line 250,col 5)-(line 250,col 43)",
        "(line 251,col 5)-(line 251,col 46)",
        "(line 252,col 5)-(line 252,col 50)",
        "(line 253,col 5)-(line 253,col 44)",
        "(line 254,col 5)-(line 254,col 46)",
        "(line 257,col 5)-(line 257,col 76)",
        "(line 258,col 5)-(line 258,col 97)",
        "(line 259,col 5)-(line 259,col 87)",
        "(line 260,col 5)-(line 260,col 45)",
        "(line 261,col 5)-(line 262,col 62)",
        "(line 264,col 5)-(line 264,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.doubleAdapter(boolean)",
      "begin_line": 267,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 270,col 5)",
        "(line 271,col 5)-(line 288,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-1ad902f4-1e1d-4669-b4df-89ad0372c4c2.read(com.google.gson.stream.JsonReader)",
      "begin_line": 272,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-464a2dc1-f095-4e1f-b96c-1dbf09a44ce1.write(com.google.gson.stream.JsonWriter, java.lang.Number)",
      "begin_line": 279,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 49)",
        "(line 285,col 9)-(line 285,col 45)",
        "(line 286,col 9)-(line 286,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.floatAdapter(boolean)",
      "begin_line": 291,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 292,col 5)-(line 294,col 5)",
        "(line 295,col 5)-(line 312,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-a625b4ac-33f7-4fce-a9cb-daab4d11fb97.read(com.google.gson.stream.JsonReader)",
      "begin_line": 296,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-c8754110-81c5-4d27-a4b8-42d3d7b70c52.write(com.google.gson.stream.JsonWriter, java.lang.Number)",
      "begin_line": 303,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 46)",
        "(line 309,col 9)-(line 309,col 44)",
        "(line 310,col 9)-(line 310,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.checkValidFloatingPoint(double)",
      "begin_line": 315,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 316,col 5)-(line 320,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.longAdapter(com.google.gson.LongSerializationPolicy)",
      "begin_line": 323,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 324,col 5)-(line 326,col 5)",
        "(line 327,col 5)-(line 342,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-e983264b-1e8e-40c8-80ab-f7fc802d4ca0.read(com.google.gson.stream.JsonReader)",
      "begin_line": 328,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-6ea0cce2-a872-4fe9-a41d-cef1d8f34ef0.write(com.google.gson.stream.JsonWriter, java.lang.Number)",
      "begin_line": 335,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.atomicLongAdapter(com.google.gson.TypeAdapter\u003cjava.lang.Number\u003e)",
      "begin_line": 345,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 354,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-a6721377-3a7c-490b-8a80-bad6eaeaa773.write(com.google.gson.stream.JsonWriter, java.util.concurrent.atomic.AtomicLong)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-9fd40c50-0fa8-4daf-9aaf-21ca11e4bad6.read(com.google.gson.stream.JsonReader)",
      "begin_line": 350,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 44)",
        "(line 352,col 9)-(line 352,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.atomicLongArrayAdapter(com.google.gson.TypeAdapter\u003cjava.lang.Number\u003e)",
      "begin_line": 357,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 381,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-271ac8d6-5ac8-4f7e-84ee-e6551b68da5e.write(com.google.gson.stream.JsonWriter, java.util.concurrent.atomic.AtomicLongArray)",
      "begin_line": 359,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 25)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-5e12b8b5-8403-4451-8978-19a3af143296.read(com.google.gson.stream.JsonReader)",
      "begin_line": 366,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 48)",
        "(line 368,col 9)-(line 368,col 24)",
        "(line 369,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 22)",
        "(line 374,col 9)-(line 374,col 33)",
        "(line 375,col 9)-(line 375,col 60)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.getAdapter(com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 390,
      "end_line": 431,
      "comment": "\n   * Returns the type adapter for {@code} type.\n   *\n   * @throws IllegalArgumentException if this GSON cannot serialize and\n   *     deserialize {@code type}.\n   ",
      "child_ranges": [
        "(line 392,col 5)-(line 392,col 53)",
        "(line 393,col 5)-(line 395,col 5)",
        "(line 397,col 5)-(line 397,col 70)",
        "(line 398,col 5)-(line 398,col 47)",
        "(line 399,col 5)-(line 403,col 5)",
        "(line 406,col 5)-(line 406,col 84)",
        "(line 407,col 5)-(line 409,col 5)",
        "(line 411,col 5)-(line 430,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.getDelegateAdapter(com.google.gson.TypeAdapterFactory, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 483,
      "end_line": 504,
      "comment": "\n   * This method is used to get an alternate type adapter for the specified type. This is used\n   * to access a type adapter that is overridden by a {@link TypeAdapterFactory} that you\n   * may have registered. This features is typically used when you want to register a type\n   * adapter that does a little bit of work but then delegates further processing to the Gson\n   * default type adapter. Here is an example:\n   * \u003cp\u003eLet\u0027s say we want to write a type adapter that counts the number of objects being read\n   *  from or written to JSON. We can achieve this by writing a type adapter factory that uses\n   *  the \u003ccode\u003egetDelegateAdapter\u003c/code\u003e method:\n   *  \u003cpre\u003e {@code\n   *  class StatsTypeAdapterFactory implements TypeAdapterFactory {\n   *    public int numReads \u003d 0;\n   *    public int numWrites \u003d 0;\n   *    public \u0026lt;T\u0026gt; TypeAdapter\u0026lt;T\u0026gt; create(Gson gson, TypeToken\u0026lt;T\u0026gt; type) {\n   *      final TypeAdapter\u0026lt;T\u0026gt; delegate \u003d gson.getDelegateAdapter(this, type);\n   *      return new TypeAdapter\u0026lt;T\u0026gt;() {\n   *        public void write(JsonWriter out, T value) throws IOException {\n   *          ++numWrites;\n   *          delegate.write(out, value);\n   *        }\n   *        public T read(JsonReader in) throws IOException {\n   *          ++numReads;\n   *          return delegate.read(in);\n   *        }\n   *      };\n   *    }\n   *  }\n   *  } \u003c/pre\u003e\n   *  This factory can now be used like this:\n   *  \u003cpre\u003e {@code\n   *  StatsTypeAdapterFactory stats \u003d new StatsTypeAdapterFactory();\n   *  Gson gson \u003d new GsonBuilder().registerTypeAdapterFactory(stats).create();\n   *  // Call gson.toJson() and fromJson methods on objects\n   *  System.out.println(\"Num JSON reads\" + stats.numReads);\n   *  System.out.println(\"Num JSON writes\" + stats.numWrites);\n   *  }\u003c/pre\u003e\n   *  Note that this call will skip all factories registered before {@code skipPast}. In case of\n   *  multiple TypeAdapterFactories registered it is up to the caller of this function to insure\n   *  that the order of registration does not prevent this method from reaching a factory they\n   *  would expect to reply from this call.\n   *  Note that since you can not override type adapter factories for String and Java primitive\n   *  types, our stats factory will not count the number of String or primitives that will be\n   *  read or written.\n   * @param skipPast The type adapter factory that needs to be skipped while searching for\n   *   a matching type adapter. In most cases, you should just pass \u003ci\u003ethis\u003c/i\u003e (the type adapter\n   *   factory from where {@link #getDelegateAdapter} method is being invoked).\n   * @param type Type for which the delegate adapter is being searched for.\n   *\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 484,col 5)-(line 484,col 34)",
        "(line 488,col 5)-(line 488,col 60)",
        "(line 490,col 5)-(line 502,col 5)",
        "(line 503,col 5)-(line 503,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.getAdapter(java.lang.Class\u003cT\u003e)",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\n   * Returns the type adapter for {@code} type.\n   *\n   * @throws IllegalArgumentException if this GSON cannot serialize and\n   *     deserialize {@code type}.\n   ",
      "child_ranges": [
        "(line 513,col 5)-(line 513,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJsonTree(java.lang.Object)",
      "begin_line": 529,
      "end_line": 534,
      "comment": "\n   * This method serializes the specified object into its equivalent representation as a tree of\n   * {@link JsonElement}s. This method should be used when the specified object is not a generic\n   * type. This method uses {@link Class#getClass()} to get the type for the specified object, but\n   * the {@code getClass()} loses the generic type information because of the Type Erasure feature\n   * of Java. Note that this method works fine if the any of the object fields are of generic type,\n   * just the object itself should not be of a generic type. If the object is of generic type, use\n   * {@link #toJsonTree(Object, Type)} instead.\n   *\n   * @param src the object for which Json representation is to be created setting for Gson\n   * @return Json representation of {@code src}.\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 530,col 5)-(line 532,col 5)",
        "(line 533,col 5)-(line 533,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJsonTree(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 552,
      "end_line": 556,
      "comment": "\n   * This method serializes the specified object, including those of generic types, into its\n   * equivalent representation as a tree of {@link JsonElement}s. This method must be used if the\n   * specified object is a generic type. For non-generic objects, use {@link #toJsonTree(Object)}\n   * instead.\n   *\n   * @param src the object for which JSON representation is to be created\n   * @param typeOfSrc The specific genericized type of src. You can obtain\n   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,\n   * to get the type for {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfSrc \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return Json representation of {@code src}\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 553,col 5)-(line 553,col 49)",
        "(line 554,col 5)-(line 554,col 35)",
        "(line 555,col 5)-(line 555,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object)",
      "begin_line": 571,
      "end_line": 576,
      "comment": "\n   * This method serializes the specified object into its equivalent Json representation.\n   * This method should be used when the specified object is not a generic type. This method uses\n   * {@link Class#getClass()} to get the type for the specified object, but the\n   * {@code getClass()} loses the generic type information because of the Type Erasure feature\n   * of Java. Note that this method works fine if the any of the object fields are of generic type,\n   * just the object itself should not be of a generic type. If the object is of generic type, use\n   * {@link #toJson(Object, Type)} instead. If you want to write out the object to a\n   * {@link Writer}, use {@link #toJson(Object, Appendable)} instead.\n   *\n   * @param src the object for which Json representation is to be created setting for Gson\n   * @return Json representation of {@code src}.\n   ",
      "child_ranges": [
        "(line 572,col 5)-(line 574,col 5)",
        "(line 575,col 5)-(line 575,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 593,
      "end_line": 597,
      "comment": "\n   * This method serializes the specified object, including those of generic types, into its\n   * equivalent Json representation. This method must be used if the specified object is a generic\n   * type. For non-generic objects, use {@link #toJson(Object)} instead. If you want to write out\n   * the object to a {@link Appendable}, use {@link #toJson(Object, Type, Appendable)} instead.\n   *\n   * @param src the object for which JSON representation is to be created\n   * @param typeOfSrc The specific genericized type of src. You can obtain\n   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,\n   * to get the type for {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfSrc \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return Json representation of {@code src}\n   ",
      "child_ranges": [
        "(line 594,col 5)-(line 594,col 45)",
        "(line 595,col 5)-(line 595,col 35)",
        "(line 596,col 5)-(line 596,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object, java.lang.Appendable)",
      "begin_line": 613,
      "end_line": 619,
      "comment": "\n   * This method serializes the specified object into its equivalent Json representation.\n   * This method should be used when the specified object is not a generic type. This method uses\n   * {@link Class#getClass()} to get the type for the specified object, but the\n   * {@code getClass()} loses the generic type information because of the Type Erasure feature\n   * of Java. Note that this method works fine if the any of the object fields are of generic type,\n   * just the object itself should not be of a generic type. If the object is of generic type, use\n   * {@link #toJson(Object, Type, Appendable)} instead.\n   *\n   * @param src the object for which Json representation is to be created setting for Gson\n   * @param writer Writer to which the Json representation needs to be written\n   * @throws JsonIOException if there was a problem writing to the writer\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 614,col 5)-(line 618,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object, java.lang.reflect.Type, java.lang.Appendable)",
      "begin_line": 637,
      "end_line": 644,
      "comment": "\n   * This method serializes the specified object, including those of generic types, into its\n   * equivalent Json representation. This method must be used if the specified object is a generic\n   * type. For non-generic objects, use {@link #toJson(Object, Appendable)} instead.\n   *\n   * @param src the object for which JSON representation is to be created\n   * @param typeOfSrc The specific genericized type of src. You can obtain\n   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,\n   * to get the type for {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfSrc \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @param writer Writer to which the Json representation of src needs to be written.\n   * @throws JsonIOException if there was a problem writing to the writer\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 643,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object, java.lang.reflect.Type, com.google.gson.stream.JsonWriter)",
      "begin_line": 651,
      "end_line": 669,
      "comment": "\n   * Writes the JSON representation of {@code src} of type {@code typeOfSrc} to\n   * {@code writer}.\n   * @throws JsonIOException if there was a problem writing to the writer\n   ",
      "child_ranges": [
        "(line 653,col 5)-(line 653,col 66)",
        "(line 654,col 5)-(line 654,col 44)",
        "(line 655,col 5)-(line 655,col 28)",
        "(line 656,col 5)-(line 656,col 46)",
        "(line 657,col 5)-(line 657,col 33)",
        "(line 658,col 5)-(line 658,col 59)",
        "(line 659,col 5)-(line 659,col 45)",
        "(line 660,col 5)-(line 668,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(com.google.gson.JsonElement)",
      "begin_line": 678,
      "end_line": 682,
      "comment": "\n   * Converts a tree of {@link JsonElement}s into its equivalent JSON representation.\n   *\n   * @param jsonElement root of a tree of {@link JsonElement}s\n   * @return JSON String representation of the tree\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 679,col 5)-(line 679,col 45)",
        "(line 680,col 5)-(line 680,col 32)",
        "(line 681,col 5)-(line 681,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(com.google.gson.JsonElement, java.lang.Appendable)",
      "begin_line": 692,
      "end_line": 699,
      "comment": "\n   * Writes out the equivalent JSON for a tree of {@link JsonElement}s.\n   *\n   * @param jsonElement root of a tree of {@link JsonElement}s\n   * @param writer Writer to which the Json representation needs to be written\n   * @throws JsonIOException if there was a problem writing to the writer\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 693,col 5)-(line 698,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.newJsonWriter(java.io.Writer)",
      "begin_line": 704,
      "end_line": 714,
      "comment": "\n   * Returns a new JSON writer configured for the settings on this Gson instance.\n   ",
      "child_ranges": [
        "(line 705,col 5)-(line 707,col 5)",
        "(line 708,col 5)-(line 708,col 51)",
        "(line 709,col 5)-(line 711,col 5)",
        "(line 712,col 5)-(line 712,col 49)",
        "(line 713,col 5)-(line 713,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.newJsonReader(java.io.Reader)",
      "begin_line": 719,
      "end_line": 723,
      "comment": "\n   * Returns a new JSON writer configured for the settings on this Gson instance.\n   ",
      "child_ranges": [
        "(line 720,col 5)-(line 720,col 51)",
        "(line 721,col 5)-(line 721,col 35)",
        "(line 722,col 5)-(line 722,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(com.google.gson.JsonElement, com.google.gson.stream.JsonWriter)",
      "begin_line": 729,
      "end_line": 745,
      "comment": "\n   * Writes the JSON for {@code jsonElement} to {@code writer}.\n   * @throws JsonIOException if there was a problem writing to the writer\n   ",
      "child_ranges": [
        "(line 730,col 5)-(line 730,col 44)",
        "(line 731,col 5)-(line 731,col 28)",
        "(line 732,col 5)-(line 732,col 46)",
        "(line 733,col 5)-(line 733,col 33)",
        "(line 734,col 5)-(line 734,col 59)",
        "(line 735,col 5)-(line 735,col 45)",
        "(line 736,col 5)-(line 744,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(java.lang.String, java.lang.Class\u003cT\u003e)",
      "begin_line": 764,
      "end_line": 767,
      "comment": "\n   * This method deserializes the specified Json into an object of the specified class. It is not\n   * suitable to use if the specified class is a generic type since it will not have the generic\n   * type information because of the Type Erasure feature of Java. Therefore, this method should not\n   * be used if the desired type is a generic type. Note that this method works fine if the any of\n   * the fields of the specified object are generics, just the object itself should not be a\n   * generic type. For the cases when the object is of generic type, invoke\n   * {@link #fromJson(String, Type)}. If you have the Json in a {@link Reader} instead of\n   * a String, use {@link #fromJson(Reader, Class)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the string from which the object is to be deserialized\n   * @param classOfT the class of T\n   * @return an object of type T from the string. Returns {@code null} if {@code json} is {@code null}.\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   * classOfT\n   ",
      "child_ranges": [
        "(line 765,col 5)-(line 765,col 52)",
        "(line 766,col 5)-(line 766,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(java.lang.String, java.lang.reflect.Type)",
      "begin_line": 787,
      "end_line": 795,
      "comment": "\n   * This method deserializes the specified Json into an object of the specified type. This method\n   * is useful if the specified object is a generic type. For non-generic objects, use\n   * {@link #fromJson(String, Class)} instead. If you have the Json in a {@link Reader} instead of\n   * a String, use {@link #fromJson(Reader, Type)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the string from which the object is to be deserialized\n   * @param typeOfT The specific genericized type of src. You can obtain this type by using the\n   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for\n   * {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfT \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return an object of type T from the string. Returns {@code null} if {@code json} is {@code null}.\n   * @throws JsonParseException if json is not a valid representation for an object of type typeOfT\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   ",
      "child_ranges": [
        "(line 789,col 5)-(line 791,col 5)",
        "(line 792,col 5)-(line 792,col 49)",
        "(line 793,col 5)-(line 793,col 45)",
        "(line 794,col 5)-(line 794,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(java.io.Reader, java.lang.Class\u003cT\u003e)",
      "begin_line": 815,
      "end_line": 820,
      "comment": "\n   * This method deserializes the Json read from the specified reader into an object of the\n   * specified class. It is not suitable to use if the specified class is a generic type since it\n   * will not have the generic type information because of the Type Erasure feature of Java.\n   * Therefore, this method should not be used if the desired type is a generic type. Note that\n   * this method works fine if the any of the fields of the specified object are generics, just the\n   * object itself should not be a generic type. For the cases when the object is of generic type,\n   * invoke {@link #fromJson(Reader, Type)}. If you have the Json in a String form instead of a\n   * {@link Reader}, use {@link #fromJson(String, Class)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the reader producing the Json from which the object is to be deserialized.\n   * @param classOfT the class of T\n   * @return an object of type T from the string. Returns {@code null} if {@code json} is at EOF.\n   * @throws JsonIOException if there was a problem reading from the Reader\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 816,col 5)-(line 816,col 48)",
        "(line 817,col 5)-(line 817,col 51)",
        "(line 818,col 5)-(line 818,col 46)",
        "(line 819,col 5)-(line 819,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(java.io.Reader, java.lang.reflect.Type)",
      "begin_line": 841,
      "end_line": 847,
      "comment": "\n   * This method deserializes the Json read from the specified reader into an object of the\n   * specified type. This method is useful if the specified object is a generic type. For\n   * non-generic objects, use {@link #fromJson(Reader, Class)} instead. If you have the Json in a\n   * String form instead of a {@link Reader}, use {@link #fromJson(String, Type)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the reader producing Json from which the object is to be deserialized\n   * @param typeOfT The specific genericized type of src. You can obtain this type by using the\n   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for\n   * {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfT \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return an object of type T from the json. Returns {@code null} if {@code json} is at EOF.\n   * @throws JsonIOException if there was a problem reading from the Reader\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 843,col 5)-(line 843,col 48)",
        "(line 844,col 5)-(line 844,col 49)",
        "(line 845,col 5)-(line 845,col 46)",
        "(line 846,col 5)-(line 846,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.assertFullConsumption(java.lang.Object, com.google.gson.stream.JsonReader)",
      "begin_line": 849,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 850,col 5)-(line 858,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(com.google.gson.stream.JsonReader, java.lang.reflect.Type)",
      "begin_line": 869,
      "end_line": 898,
      "comment": "\n   * Reads the next JSON value from {@code reader} and convert it to an object\n   * of type {@code typeOfT}. Returns {@code null}, if the {@code reader} is at EOF.\n   * Since Type is not parameterized by T, this method is type unsafe and should be used carefully\n   *\n   * @throws JsonIOException if there was a problem writing to the Reader\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   ",
      "child_ranges": [
        "(line 871,col 5)-(line 871,col 27)",
        "(line 872,col 5)-(line 872,col 44)",
        "(line 873,col 5)-(line 873,col 28)",
        "(line 874,col 5)-(line 897,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(com.google.gson.JsonElement, java.lang.Class\u003cT\u003e)",
      "begin_line": 916,
      "end_line": 919,
      "comment": "\n   * This method deserializes the Json read from the specified parse tree into an object of the\n   * specified type. It is not suitable to use if the specified class is a generic type since it\n   * will not have the generic type information because of the Type Erasure feature of Java.\n   * Therefore, this method should not be used if the desired type is a generic type. Note that\n   * this method works fine if the any of the fields of the specified object are generics, just the\n   * object itself should not be a generic type. For the cases when the object is of generic type,\n   * invoke {@link #fromJson(JsonElement, Type)}.\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the root of the parse tree of {@link JsonElement}s from which the object is to\n   * be deserialized\n   * @param classOfT The class of T\n   * @return an object of type T from the json. Returns {@code null} if {@code json} is {@code null}.\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type typeOfT\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 917,col 5)-(line 917,col 52)",
        "(line 918,col 5)-(line 918,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(com.google.gson.JsonElement, java.lang.reflect.Type)",
      "begin_line": 939,
      "end_line": 945,
      "comment": "\n   * This method deserializes the Json read from the specified parse tree into an object of the\n   * specified type. This method is useful if the specified object is a generic type. For\n   * non-generic objects, use {@link #fromJson(JsonElement, Class)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the root of the parse tree of {@link JsonElement}s from which the object is to\n   * be deserialized\n   * @param typeOfT The specific genericized type of src. You can obtain this type by using the\n   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for\n   * {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfT \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return an object of type T from the json. Returns {@code null} if {@code json} is {@code null}.\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type typeOfT\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 941,col 5)-(line 943,col 5)",
        "(line 944,col 5)-(line 944,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FutureTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cT\u003e"
      ],
      "begin_line": 947,
      "end_line": 970,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 948,
      "end_line": 948,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.FutureTypeAdapter.setDelegate(com.google.gson.TypeAdapter\u003cT\u003e)",
      "begin_line": 950,
      "end_line": 955,
      "comment": "",
      "child_ranges": [
        "(line 951,col 7)-(line 953,col 7)",
        "(line 954,col 7)-(line 954,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.FutureTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 957,
      "end_line": 962,
      "comment": "",
      "child_ranges": [
        "(line 958,col 7)-(line 960,col 7)",
        "(line 961,col 7)-(line 961,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.FutureTypeAdapter.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 964,
      "end_line": 969,
      "comment": "",
      "child_ranges": [
        "(line 965,col 7)-(line 967,col 7)",
        "(line 968,col 7)-(line 968,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toString()",
      "begin_line": 972,
      "end_line": 980,
      "comment": "",
      "child_ranges": [
        "(line 974,col 5)-(line 979,col 20)"
      ]
    }
  ]
}