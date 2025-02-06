{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/Gson.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gson",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 103,
      "end_line": 966,
      "comment": "\n * This is the main class for using Gson. Gson is typically used by first constructing a\n * Gson instance and then invoking {@link #toJson(Object)} or {@link #fromJson(String, Class)}\n * methods on it. Gson instances are Thread-safe so you can reuse them freely across multiple\n * threads.\n *\n * \u003cp\u003eYou can create a Gson instance by invoking {@code new Gson()} if the default configuration\n * is all you need. You can also use {@link GsonBuilder} to build a Gson instance with various\n * configuration options such as versioning support, pretty printing, custom\n * {@link JsonSerializer}s, {@link JsonDeserializer}s, and {@link InstanceCreator}s.\u003c/p\u003e\n *\n * \u003cp\u003eHere is an example of how Gson is used for a simple Class:\n *\n * \u003cpre\u003e\n * Gson gson \u003d new Gson(); // Or use new GsonBuilder().create();\n * MyType target \u003d new MyType();\n * String json \u003d gson.toJson(target); // serializes target to Json\n * MyType target2 \u003d gson.fromJson(json, MyType.class); // deserializes json into target2\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eIf the object that your are serializing/deserializing is a {@code ParameterizedType}\n * (i.e. contains at least one type parameter and may be an array) then you must use the\n * {@link #toJson(Object, Type)} or {@link #fromJson(String, Type)} method.  Here is an\n * example for serializing and deserializing a {@code ParameterizedType}:\n *\n * \u003cpre\u003e\n * Type listType \u003d new TypeToken\u0026lt;List\u0026lt;String\u0026gt;\u0026gt;() {}.getType();\n * List\u0026lt;String\u0026gt; target \u003d new LinkedList\u0026lt;String\u0026gt;();\n * target.add(\"blah\");\n *\n * Gson gson \u003d new Gson();\n * String json \u003d gson.toJson(target, listType);\n * List\u0026lt;String\u0026gt; target2 \u003d gson.fromJson(json, listType);\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eSee the \u003ca href\u003d\"https://sites.google.com/site/gson/gson-user-guide\"\u003eGson User Guide\u003c/a\u003e\n * for a more complete set of examples.\u003c/p\u003e\n *\n * @see com.google.gson.reflect.TypeToken\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n * @author Jesse Wilson\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_JSON_NON_EXECUTABLE"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LENIENT"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PRETTY_PRINT"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ESCAPE_HTML"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SERIALIZE_NULLS"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPLEX_MAP_KEYS"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SPECIALIZE_FLOAT_VALUES"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NULL_KEY_SURROGATE"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JSON_NON_EXECUTABLE_PREFIX"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calls"
      ],
      "begin_line": 122,
      "end_line": 123,
      "comment": "\n   * This thread local guards against reentrant calls to getAdapter(). In\n   * certain object graphs, creating an adapter for a type may recursively\n   * require an adapter for the same type! Without intervention, the recursive\n   * lookup would stack overflow. We cheat by returning a proxy type adapter.\n   * The proxy is wired up once the initial adapter has been created.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeTokenCache"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factories"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructorConstructor"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializeNulls"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "htmlSafe"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generateNonExecutableJson"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrinting"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lenient"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.Gson.Gson()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n   * Constructs a Gson object with default configuration. The default configuration has the\n   * following settings:\n   * \u003cul\u003e\n   *   \u003cli\u003eThe JSON generated by \u003ccode\u003etoJson\u003c/code\u003e methods is in compact representation. This\n   *   means that all the unneeded white-space is removed. You can change this behavior with\n   *   {@link GsonBuilder#setPrettyPrinting()}. \u003c/li\u003e\n   *   \u003cli\u003eThe generated JSON omits all the fields that are null. Note that nulls in arrays are\n   *   kept as is since an array is an ordered list. Moreover, if a field is not null, but its\n   *   generated JSON is empty, the field is kept. You can configure Gson to serialize null values\n   *   by setting {@link GsonBuilder#serializeNulls()}.\u003c/li\u003e\n   *   \u003cli\u003eGson provides default serialization and deserialization for Enums, {@link Map},\n   *   {@link java.net.URL}, {@link java.net.URI}, {@link java.util.Locale}, {@link java.util.Date},\n   *   {@link java.math.BigDecimal}, and {@link java.math.BigInteger} classes. If you would prefer\n   *   to change the default representation, you can do so by registering a type adapter through\n   *   {@link GsonBuilder#registerTypeAdapter(Type, Object)}. \u003c/li\u003e\n   *   \u003cli\u003eThe default Date format is same as {@link java.text.DateFormat#DEFAULT}. This format\n   *   ignores the millisecond portion of the date during serialization. You can change\n   *   this by invoking {@link GsonBuilder#setDateFormat(int)} or\n   *   {@link GsonBuilder#setDateFormat(String)}. \u003c/li\u003e\n   *   \u003cli\u003eBy default, Gson ignores the {@link com.google.gson.annotations.Expose} annotation.\n   *   You can enable Gson to serialize/deserialize only those fields marked with this annotation\n   *   through {@link GsonBuilder#excludeFieldsWithoutExposeAnnotation()}. \u003c/li\u003e\n   *   \u003cli\u003eBy default, Gson ignores the {@link com.google.gson.annotations.Since} annotation. You\n   *   can enable Gson to use this annotation through {@link GsonBuilder#setVersion(double)}.\u003c/li\u003e\n   *   \u003cli\u003eThe default field naming policy for the output Json is same as in Java. So, a Java class\n   *   field \u003ccode\u003eversionNumber\u003c/code\u003e will be output as \u003ccode\u003e\u0026quot;versionNumber\u0026quot;\u003c/code\u003e in\n   *   Json. The same rules are applied for mapping incoming Json to the Java classes. You can\n   *   change this policy through {@link GsonBuilder#setFieldNamingPolicy(FieldNamingPolicy)}.\u003c/li\u003e\n   *   \u003cli\u003eBy default, Gson excludes \u003ccode\u003etransient\u003c/code\u003e or \u003ccode\u003estatic\u003c/code\u003e fields from\n   *   consideration for serialization and deserialization. You can change this behavior through\n   *   {@link GsonBuilder#excludeFieldsWithModifiers(int...)}.\u003c/li\u003e\n   * \u003c/ul\u003e\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 175,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.Gson.Gson(com.google.gson.internal.Excluder, com.google.gson.FieldNamingStrategy, java.util.Map\u003cjava.lang.reflect.Type, com.google.gson.InstanceCreator\u003c?\u003e\u003e, boolean, boolean, boolean, boolean, boolean, boolean, boolean, com.google.gson.LongSerializationPolicy, java.util.List\u003ccom.google.gson.TypeAdapterFactory\u003e)",
      "begin_line": 178,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 79)",
        "(line 185,col 5)-(line 185,col 41)",
        "(line 186,col 5)-(line 186,col 63)",
        "(line 187,col 5)-(line 187,col 29)",
        "(line 188,col 5)-(line 188,col 41)",
        "(line 189,col 5)-(line 189,col 27)",
        "(line 191,col 5)-(line 191,col 77)",
        "(line 194,col 5)-(line 194,col 53)",
        "(line 195,col 5)-(line 195,col 45)",
        "(line 198,col 5)-(line 198,col 28)",
        "(line 201,col 5)-(line 201,col 43)",
        "(line 204,col 5)-(line 204,col 47)",
        "(line 205,col 5)-(line 205,col 48)",
        "(line 206,col 5)-(line 206,col 48)",
        "(line 207,col 5)-(line 207,col 45)",
        "(line 208,col 5)-(line 208,col 46)",
        "(line 209,col 5)-(line 209,col 75)",
        "(line 210,col 5)-(line 210,col 80)",
        "(line 211,col 5)-(line 212,col 65)",
        "(line 213,col 5)-(line 214,col 64)",
        "(line 215,col 5)-(line 215,col 47)",
        "(line 216,col 5)-(line 216,col 55)",
        "(line 217,col 5)-(line 217,col 55)",
        "(line 218,col 5)-(line 218,col 93)",
        "(line 219,col 5)-(line 219,col 103)",
        "(line 220,col 5)-(line 220,col 61)",
        "(line 221,col 5)-(line 221,col 50)",
        "(line 222,col 5)-(line 222,col 55)",
        "(line 223,col 5)-(line 223,col 54)",
        "(line 224,col 5)-(line 224,col 87)",
        "(line 225,col 5)-(line 225,col 87)",
        "(line 226,col 5)-(line 226,col 44)",
        "(line 227,col 5)-(line 227,col 44)",
        "(line 228,col 5)-(line 228,col 45)",
        "(line 229,col 5)-(line 229,col 49)",
        "(line 230,col 5)-(line 230,col 47)",
        "(line 231,col 5)-(line 231,col 53)",
        "(line 232,col 5)-(line 232,col 48)",
        "(line 233,col 5)-(line 233,col 43)",
        "(line 234,col 5)-(line 234,col 49)",
        "(line 235,col 5)-(line 235,col 43)",
        "(line 236,col 5)-(line 236,col 46)",
        "(line 237,col 5)-(line 237,col 50)",
        "(line 238,col 5)-(line 238,col 44)",
        "(line 239,col 5)-(line 239,col 46)",
        "(line 242,col 5)-(line 242,col 76)",
        "(line 243,col 5)-(line 243,col 97)",
        "(line 244,col 5)-(line 244,col 87)",
        "(line 245,col 5)-(line 245,col 45)",
        "(line 246,col 5)-(line 247,col 62)",
        "(line 249,col 5)-(line 249,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.doubleAdapter(boolean)",
      "begin_line": 252,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 255,col 5)",
        "(line 256,col 5)-(line 273,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-a3e07dc8-c168-44b4-8b06-c421b9cc7a60.read(com.google.gson.stream.JsonReader)",
      "begin_line": 257,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-04dc5623-974a-4d2c-9497-54ae75c5eef4.write(com.google.gson.stream.JsonWriter, java.lang.Number)",
      "begin_line": 264,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 49)",
        "(line 270,col 9)-(line 270,col 45)",
        "(line 271,col 9)-(line 271,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.floatAdapter(boolean)",
      "begin_line": 276,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 279,col 5)",
        "(line 280,col 5)-(line 297,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-19f42ae3-91d4-4ded-8a82-5d27395bd4a0.read(com.google.gson.stream.JsonReader)",
      "begin_line": 281,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-b5d83fcf-de24-4415-a846-cfda669ad361.write(com.google.gson.stream.JsonWriter, java.lang.Number)",
      "begin_line": 288,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 46)",
        "(line 294,col 9)-(line 294,col 44)",
        "(line 295,col 9)-(line 295,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.checkValidFloatingPoint(double)",
      "begin_line": 300,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 305,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.longAdapter(com.google.gson.LongSerializationPolicy)",
      "begin_line": 308,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 311,col 5)",
        "(line 312,col 5)-(line 327,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-4dc3b3c3-a8b6-401b-9ed2-10ed236de98a.read(com.google.gson.stream.JsonReader)",
      "begin_line": 313,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-9019bfbb-a687-4c2a-929d-79f28f77c885.write(com.google.gson.stream.JsonWriter, java.lang.Number)",
      "begin_line": 320,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.atomicLongAdapter(com.google.gson.TypeAdapter\u003cjava.lang.Number\u003e)",
      "begin_line": 330,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 339,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-1746bf47-d263-4eb9-94da-29f02475aaf9.write(com.google.gson.stream.JsonWriter, java.util.concurrent.atomic.AtomicLong)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-b03750b7-ff42-499b-a2b3-1c2f25e54c62.read(com.google.gson.stream.JsonReader)",
      "begin_line": 335,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 44)",
        "(line 337,col 9)-(line 337,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.atomicLongArrayAdapter(com.google.gson.TypeAdapter\u003cjava.lang.Number\u003e)",
      "begin_line": 342,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 343,col 5)-(line 366,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-bb18abc5-cd40-4422-b286-fbfa406211b5.write(com.google.gson.stream.JsonWriter, java.util.concurrent.atomic.AtomicLongArray)",
      "begin_line": 344,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 25)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.Anonymous-895d2831-258a-4873-b51d-dce067bcfa99.read(com.google.gson.stream.JsonReader)",
      "begin_line": 351,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 48)",
        "(line 353,col 9)-(line 353,col 24)",
        "(line 354,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 22)",
        "(line 359,col 9)-(line 359,col 33)",
        "(line 360,col 9)-(line 360,col 60)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.getAdapter(com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 375,
      "end_line": 416,
      "comment": "\n   * Returns the type adapter for {@code} type.\n   *\n   * @throws IllegalArgumentException if this GSON cannot serialize and\n   *     deserialize {@code type}.\n   ",
      "child_ranges": [
        "(line 377,col 5)-(line 377,col 89)",
        "(line 378,col 5)-(line 380,col 5)",
        "(line 382,col 5)-(line 382,col 70)",
        "(line 383,col 5)-(line 383,col 47)",
        "(line 384,col 5)-(line 388,col 5)",
        "(line 391,col 5)-(line 391,col 84)",
        "(line 392,col 5)-(line 394,col 5)",
        "(line 396,col 5)-(line 415,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.getDelegateAdapter(com.google.gson.TypeAdapterFactory, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 468,
      "end_line": 489,
      "comment": "\n   * This method is used to get an alternate type adapter for the specified type. This is used\n   * to access a type adapter that is overridden by a {@link TypeAdapterFactory} that you\n   * may have registered. This features is typically used when you want to register a type\n   * adapter that does a little bit of work but then delegates further processing to the Gson\n   * default type adapter. Here is an example:\n   * \u003cp\u003eLet\u0027s say we want to write a type adapter that counts the number of objects being read\n   *  from or written to JSON. We can achieve this by writing a type adapter factory that uses\n   *  the \u003ccode\u003egetDelegateAdapter\u003c/code\u003e method:\n   *  \u003cpre\u003e {@code\n   *  class StatsTypeAdapterFactory implements TypeAdapterFactory {\n   *    public int numReads \u003d 0;\n   *    public int numWrites \u003d 0;\n   *    public \u003cT\u003e TypeAdapter\u003cT\u003e create(Gson gson, TypeToken\u003cT\u003e type) {\n   *      final TypeAdapter\u003cT\u003e delegate \u003d gson.getDelegateAdapter(this, type);\n   *      return new TypeAdapter\u003cT\u003e() {\n   *        public void write(JsonWriter out, T value) throws IOException {\n   *          ++numWrites;\n   *          delegate.write(out, value);\n   *        }\n   *        public T read(JsonReader in) throws IOException {\n   *          ++numReads;\n   *          return delegate.read(in);\n   *        }\n   *      };\n   *    }\n   *  }\n   *  } \u003c/pre\u003e\n   *  This factory can now be used like this:\n   *  \u003cpre\u003e {@code\n   *  StatsTypeAdapterFactory stats \u003d new StatsTypeAdapterFactory();\n   *  Gson gson \u003d new GsonBuilder().registerTypeAdapterFactory(stats).create();\n   *  // Call gson.toJson() and fromJson methods on objects\n   *  System.out.println(\"Num JSON reads\" + stats.numReads);\n   *  System.out.println(\"Num JSON writes\" + stats.numWrites);\n   *  }\u003c/pre\u003e\n   *  Note that this call will skip all factories registered before {@code skipPast}. In case of\n   *  multiple TypeAdapterFactories registered it is up to the caller of this function to insure\n   *  that the order of registration does not prevent this method from reaching a factory they\n   *  would expect to reply from this call.\n   *  Note that since you can not override type adapter factories for String and Java primitive\n   *  types, our stats factory will not count the number of String or primitives that will be\n   *  read or written.\n   * @param skipPast The type adapter factory that needs to be skipped while searching for\n   *   a matching type adapter. In most cases, you should just pass \u003ci\u003ethis\u003c/i\u003e (the type adapter\n   *   factory from where {@link #getDelegateAdapter} method is being invoked).\n   * @param type Type for which the delegate adapter is being searched for.\n   *\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 469,col 5)-(line 469,col 34)",
        "(line 473,col 5)-(line 473,col 60)",
        "(line 475,col 5)-(line 487,col 5)",
        "(line 488,col 5)-(line 488,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.getAdapter(java.lang.Class\u003cT\u003e)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n   * Returns the type adapter for {@code} type.\n   *\n   * @throws IllegalArgumentException if this GSON cannot serialize and\n   *     deserialize {@code type}.\n   ",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJsonTree(java.lang.Object)",
      "begin_line": 514,
      "end_line": 519,
      "comment": "\n   * This method serializes the specified object into its equivalent representation as a tree of\n   * {@link JsonElement}s. This method should be used when the specified object is not a generic\n   * type. This method uses {@link Class#getClass()} to get the type for the specified object, but\n   * the {@code getClass()} loses the generic type information because of the Type Erasure feature\n   * of Java. Note that this method works fine if the any of the object fields are of generic type,\n   * just the object itself should not be of a generic type. If the object is of generic type, use\n   * {@link #toJsonTree(Object, Type)} instead.\n   *\n   * @param src the object for which Json representation is to be created setting for Gson\n   * @return Json representation of {@code src}.\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 515,col 5)-(line 517,col 5)",
        "(line 518,col 5)-(line 518,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJsonTree(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 537,
      "end_line": 541,
      "comment": "\n   * This method serializes the specified object, including those of generic types, into its\n   * equivalent representation as a tree of {@link JsonElement}s. This method must be used if the\n   * specified object is a generic type. For non-generic objects, use {@link #toJsonTree(Object)}\n   * instead.\n   *\n   * @param src the object for which JSON representation is to be created\n   * @param typeOfSrc The specific genericized type of src. You can obtain\n   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,\n   * to get the type for {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfSrc \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return Json representation of {@code src}\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 49)",
        "(line 539,col 5)-(line 539,col 35)",
        "(line 540,col 5)-(line 540,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object)",
      "begin_line": 556,
      "end_line": 561,
      "comment": "\n   * This method serializes the specified object into its equivalent Json representation.\n   * This method should be used when the specified object is not a generic type. This method uses\n   * {@link Class#getClass()} to get the type for the specified object, but the\n   * {@code getClass()} loses the generic type information because of the Type Erasure feature\n   * of Java. Note that this method works fine if the any of the object fields are of generic type,\n   * just the object itself should not be of a generic type. If the object is of generic type, use\n   * {@link #toJson(Object, Type)} instead. If you want to write out the object to a\n   * {@link Writer}, use {@link #toJson(Object, Appendable)} instead.\n   *\n   * @param src the object for which Json representation is to be created setting for Gson\n   * @return Json representation of {@code src}.\n   ",
      "child_ranges": [
        "(line 557,col 5)-(line 559,col 5)",
        "(line 560,col 5)-(line 560,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 578,
      "end_line": 582,
      "comment": "\n   * This method serializes the specified object, including those of generic types, into its\n   * equivalent Json representation. This method must be used if the specified object is a generic\n   * type. For non-generic objects, use {@link #toJson(Object)} instead. If you want to write out\n   * the object to a {@link Appendable}, use {@link #toJson(Object, Type, Appendable)} instead.\n   *\n   * @param src the object for which JSON representation is to be created\n   * @param typeOfSrc The specific genericized type of src. You can obtain\n   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,\n   * to get the type for {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfSrc \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return Json representation of {@code src}\n   ",
      "child_ranges": [
        "(line 579,col 5)-(line 579,col 45)",
        "(line 580,col 5)-(line 580,col 35)",
        "(line 581,col 5)-(line 581,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object, java.lang.Appendable)",
      "begin_line": 598,
      "end_line": 604,
      "comment": "\n   * This method serializes the specified object into its equivalent Json representation.\n   * This method should be used when the specified object is not a generic type. This method uses\n   * {@link Class#getClass()} to get the type for the specified object, but the\n   * {@code getClass()} loses the generic type information because of the Type Erasure feature\n   * of Java. Note that this method works fine if the any of the object fields are of generic type,\n   * just the object itself should not be of a generic type. If the object is of generic type, use\n   * {@link #toJson(Object, Type, Appendable)} instead.\n   *\n   * @param src the object for which Json representation is to be created setting for Gson\n   * @param writer Writer to which the Json representation needs to be written\n   * @throws JsonIOException if there was a problem writing to the writer\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 599,col 5)-(line 603,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object, java.lang.reflect.Type, java.lang.Appendable)",
      "begin_line": 622,
      "end_line": 629,
      "comment": "\n   * This method serializes the specified object, including those of generic types, into its\n   * equivalent Json representation. This method must be used if the specified object is a generic\n   * type. For non-generic objects, use {@link #toJson(Object, Appendable)} instead.\n   *\n   * @param src the object for which JSON representation is to be created\n   * @param typeOfSrc The specific genericized type of src. You can obtain\n   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,\n   * to get the type for {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfSrc \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @param writer Writer to which the Json representation of src needs to be written.\n   * @throws JsonIOException if there was a problem writing to the writer\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 623,col 5)-(line 628,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(java.lang.Object, java.lang.reflect.Type, com.google.gson.stream.JsonWriter)",
      "begin_line": 636,
      "end_line": 654,
      "comment": "\n   * Writes the JSON representation of {@code src} of type {@code typeOfSrc} to\n   * {@code writer}.\n   * @throws JsonIOException if there was a problem writing to the writer\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 66)",
        "(line 639,col 5)-(line 639,col 44)",
        "(line 640,col 5)-(line 640,col 28)",
        "(line 641,col 5)-(line 641,col 46)",
        "(line 642,col 5)-(line 642,col 33)",
        "(line 643,col 5)-(line 643,col 59)",
        "(line 644,col 5)-(line 644,col 45)",
        "(line 645,col 5)-(line 653,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(com.google.gson.JsonElement)",
      "begin_line": 663,
      "end_line": 667,
      "comment": "\n   * Converts a tree of {@link JsonElement}s into its equivalent JSON representation.\n   *\n   * @param jsonElement root of a tree of {@link JsonElement}s\n   * @return JSON String representation of the tree\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 664,col 5)-(line 664,col 45)",
        "(line 665,col 5)-(line 665,col 32)",
        "(line 666,col 5)-(line 666,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(com.google.gson.JsonElement, java.lang.Appendable)",
      "begin_line": 677,
      "end_line": 684,
      "comment": "\n   * Writes out the equivalent JSON for a tree of {@link JsonElement}s.\n   *\n   * @param jsonElement root of a tree of {@link JsonElement}s\n   * @param writer Writer to which the Json representation needs to be written\n   * @throws JsonIOException if there was a problem writing to the writer\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 678,col 5)-(line 683,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.newJsonWriter(java.io.Writer)",
      "begin_line": 689,
      "end_line": 699,
      "comment": "\n   * Returns a new JSON writer configured for the settings on this Gson instance.\n   ",
      "child_ranges": [
        "(line 690,col 5)-(line 692,col 5)",
        "(line 693,col 5)-(line 693,col 51)",
        "(line 694,col 5)-(line 696,col 5)",
        "(line 697,col 5)-(line 697,col 49)",
        "(line 698,col 5)-(line 698,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.newJsonReader(java.io.Reader)",
      "begin_line": 704,
      "end_line": 708,
      "comment": "\n   * Returns a new JSON writer configured for the settings on this Gson instance.\n   ",
      "child_ranges": [
        "(line 705,col 5)-(line 705,col 51)",
        "(line 706,col 5)-(line 706,col 35)",
        "(line 707,col 5)-(line 707,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toJson(com.google.gson.JsonElement, com.google.gson.stream.JsonWriter)",
      "begin_line": 714,
      "end_line": 730,
      "comment": "\n   * Writes the JSON for {@code jsonElement} to {@code writer}.\n   * @throws JsonIOException if there was a problem writing to the writer\n   ",
      "child_ranges": [
        "(line 715,col 5)-(line 715,col 44)",
        "(line 716,col 5)-(line 716,col 28)",
        "(line 717,col 5)-(line 717,col 46)",
        "(line 718,col 5)-(line 718,col 33)",
        "(line 719,col 5)-(line 719,col 59)",
        "(line 720,col 5)-(line 720,col 45)",
        "(line 721,col 5)-(line 729,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(java.lang.String, java.lang.Class\u003cT\u003e)",
      "begin_line": 749,
      "end_line": 752,
      "comment": "\n   * This method deserializes the specified Json into an object of the specified class. It is not\n   * suitable to use if the specified class is a generic type since it will not have the generic\n   * type information because of the Type Erasure feature of Java. Therefore, this method should not\n   * be used if the desired type is a generic type. Note that this method works fine if the any of\n   * the fields of the specified object are generics, just the object itself should not be a\n   * generic type. For the cases when the object is of generic type, invoke\n   * {@link #fromJson(String, Type)}. If you have the Json in a {@link Reader} instead of\n   * a String, use {@link #fromJson(Reader, Class)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the string from which the object is to be deserialized\n   * @param classOfT the class of T\n   * @return an object of type T from the string. Returns {@code null} if {@code json} is {@code null}.\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   * classOfT\n   ",
      "child_ranges": [
        "(line 750,col 5)-(line 750,col 52)",
        "(line 751,col 5)-(line 751,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(java.lang.String, java.lang.reflect.Type)",
      "begin_line": 772,
      "end_line": 780,
      "comment": "\n   * This method deserializes the specified Json into an object of the specified type. This method\n   * is useful if the specified object is a generic type. For non-generic objects, use\n   * {@link #fromJson(String, Class)} instead. If you have the Json in a {@link Reader} instead of\n   * a String, use {@link #fromJson(Reader, Type)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the string from which the object is to be deserialized\n   * @param typeOfT The specific genericized type of src. You can obtain this type by using the\n   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for\n   * {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfT \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return an object of type T from the string. Returns {@code null} if {@code json} is {@code null}.\n   * @throws JsonParseException if json is not a valid representation for an object of type typeOfT\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   ",
      "child_ranges": [
        "(line 774,col 5)-(line 776,col 5)",
        "(line 777,col 5)-(line 777,col 49)",
        "(line 778,col 5)-(line 778,col 45)",
        "(line 779,col 5)-(line 779,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(java.io.Reader, java.lang.Class\u003cT\u003e)",
      "begin_line": 800,
      "end_line": 805,
      "comment": "\n   * This method deserializes the Json read from the specified reader into an object of the\n   * specified class. It is not suitable to use if the specified class is a generic type since it\n   * will not have the generic type information because of the Type Erasure feature of Java.\n   * Therefore, this method should not be used if the desired type is a generic type. Note that\n   * this method works fine if the any of the fields of the specified object are generics, just the\n   * object itself should not be a generic type. For the cases when the object is of generic type,\n   * invoke {@link #fromJson(Reader, Type)}. If you have the Json in a String form instead of a\n   * {@link Reader}, use {@link #fromJson(String, Class)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the reader producing the Json from which the object is to be deserialized.\n   * @param classOfT the class of T\n   * @return an object of type T from the string. Returns {@code null} if {@code json} is at EOF.\n   * @throws JsonIOException if there was a problem reading from the Reader\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 801,col 5)-(line 801,col 48)",
        "(line 802,col 5)-(line 802,col 51)",
        "(line 803,col 5)-(line 803,col 46)",
        "(line 804,col 5)-(line 804,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(java.io.Reader, java.lang.reflect.Type)",
      "begin_line": 826,
      "end_line": 832,
      "comment": "\n   * This method deserializes the Json read from the specified reader into an object of the\n   * specified type. This method is useful if the specified object is a generic type. For\n   * non-generic objects, use {@link #fromJson(Reader, Class)} instead. If you have the Json in a\n   * String form instead of a {@link Reader}, use {@link #fromJson(String, Type)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the reader producing Json from which the object is to be deserialized\n   * @param typeOfT The specific genericized type of src. You can obtain this type by using the\n   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for\n   * {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfT \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return an object of type T from the json. Returns {@code null} if {@code json} is at EOF.\n   * @throws JsonIOException if there was a problem reading from the Reader\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 828,col 5)-(line 828,col 48)",
        "(line 829,col 5)-(line 829,col 49)",
        "(line 830,col 5)-(line 830,col 46)",
        "(line 831,col 5)-(line 831,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.assertFullConsumption(java.lang.Object, com.google.gson.stream.JsonReader)",
      "begin_line": 834,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 835,col 5)-(line 843,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(com.google.gson.stream.JsonReader, java.lang.reflect.Type)",
      "begin_line": 854,
      "end_line": 883,
      "comment": "\n   * Reads the next JSON value from {@code reader} and convert it to an object\n   * of type {@code typeOfT}. Returns {@code null}, if the {@code reader} is at EOF.\n   * Since Type is not parameterized by T, this method is type unsafe and should be used carefully\n   *\n   * @throws JsonIOException if there was a problem writing to the Reader\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type\n   ",
      "child_ranges": [
        "(line 856,col 5)-(line 856,col 27)",
        "(line 857,col 5)-(line 857,col 44)",
        "(line 858,col 5)-(line 858,col 28)",
        "(line 859,col 5)-(line 882,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(com.google.gson.JsonElement, java.lang.Class\u003cT\u003e)",
      "begin_line": 901,
      "end_line": 904,
      "comment": "\n   * This method deserializes the Json read from the specified parse tree into an object of the\n   * specified type. It is not suitable to use if the specified class is a generic type since it\n   * will not have the generic type information because of the Type Erasure feature of Java.\n   * Therefore, this method should not be used if the desired type is a generic type. Note that\n   * this method works fine if the any of the fields of the specified object are generics, just the\n   * object itself should not be a generic type. For the cases when the object is of generic type,\n   * invoke {@link #fromJson(JsonElement, Type)}.\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the root of the parse tree of {@link JsonElement}s from which the object is to\n   * be deserialized\n   * @param classOfT The class of T\n   * @return an object of type T from the json. Returns {@code null} if {@code json} is {@code null}.\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type typeOfT\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 902,col 5)-(line 902,col 52)",
        "(line 903,col 5)-(line 903,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.fromJson(com.google.gson.JsonElement, java.lang.reflect.Type)",
      "begin_line": 924,
      "end_line": 930,
      "comment": "\n   * This method deserializes the Json read from the specified parse tree into an object of the\n   * specified type. This method is useful if the specified object is a generic type. For\n   * non-generic objects, use {@link #fromJson(JsonElement, Class)} instead.\n   *\n   * @param \u003cT\u003e the type of the desired object\n   * @param json the root of the parse tree of {@link JsonElement}s from which the object is to\n   * be deserialized\n   * @param typeOfT The specific genericized type of src. You can obtain this type by using the\n   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for\n   * {@code Collection\u003cFoo\u003e}, you should use:\n   * \u003cpre\u003e\n   * Type typeOfT \u003d new TypeToken\u0026lt;Collection\u0026lt;Foo\u0026gt;\u0026gt;(){}.getType();\n   * \u003c/pre\u003e\n   * @return an object of type T from the json. Returns {@code null} if {@code json} is {@code null}.\n   * @throws JsonSyntaxException if json is not a valid representation for an object of type typeOfT\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 926,col 5)-(line 928,col 5)",
        "(line 929,col 5)-(line 929,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FutureTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cT\u003e"
      ],
      "begin_line": 932,
      "end_line": 955,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 933,
      "end_line": 933,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.FutureTypeAdapter.setDelegate(com.google.gson.TypeAdapter\u003cT\u003e)",
      "begin_line": 935,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 936,col 7)-(line 938,col 7)",
        "(line 939,col 7)-(line 939,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.FutureTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 942,
      "end_line": 947,
      "comment": "",
      "child_ranges": [
        "(line 943,col 7)-(line 945,col 7)",
        "(line 946,col 7)-(line 946,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.FutureTypeAdapter.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 949,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 950,col 7)-(line 952,col 7)",
        "(line 953,col 7)-(line 953,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.Gson.toString()",
      "begin_line": 957,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 959,col 5)-(line 964,col 20)"
      ]
    }
  ]
}