{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/GsonBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GsonBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 78,
      "end_line": 590,
      "comment": "\n * \u003cp\u003eUse this builder to construct a {@link Gson} instance when you need to set configuration\n * options other than the default. For {@link Gson} with default configuration, it is simpler to\n * use {@code new Gson()}. {@code GsonBuilder} is best used by creating it, and then invoking its\n * various configuration methods, and finally calling create.\u003c/p\u003e\n *\n * \u003cp\u003eThe following is an example shows how to use the {@code GsonBuilder} to construct a Gson\n * instance:\n *\n * \u003cpre\u003e\n * Gson gson \u003d new GsonBuilder()\n *     .registerTypeAdapter(Id.class, new IdTypeAdapter())\n *     .enableComplexMapKeySerialization()\n *     .serializeNulls()\n *     .setDateFormat(DateFormat.LONG)\n *     .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)\n *     .setPrettyPrinting()\n *     .setVersion(1.0)\n *     .create();\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eNOTES:\n * \u003cul\u003e\n * \u003cli\u003e the order of invocation of configuration methods does not matter.\u003c/li\u003e\n * \u003cli\u003e The default serialization of {@link Date} and its subclasses in Gson does\n *  not contain time-zone information. So, if you are using date/time instances,\n *  use {@code GsonBuilder} and its {@code setDateFormat} methods.\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n * @author Jesse Wilson\n "
    },
    {
      "type": "field",
      "varNames": [
        "excluder"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longSerializationPolicy"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldNamingPolicy"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceCreators"
      ],
      "begin_line": 82,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factories"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hierarchyFactories"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " tree-style hierarchy factories. These come after factories for backwards compatibility. "
    },
    {
      "type": "field",
      "varNames": [
        "serializeNulls"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "datePattern"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateStyle"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeStyle"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "complexMapKeySerialization"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializeSpecialFloatingPointValues"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escapeHtmlChars"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrinting"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generateNonExecutableJson"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lenient"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.GsonBuilder.GsonBuilder()",
      "begin_line": 104,
      "end_line": 105,
      "comment": "\n   * Creates a GsonBuilder instance that can be used to build Gson with various configuration\n   * settings. GsonBuilder follows the builder pattern, and it is typically used by first\n   * invoking various configuration methods to set desired options, and finally calling\n   * {@link #create()}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setVersion(double)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n   * Configures Gson to enable versioning support.\n   *\n   * @param ignoreVersionsAfter any field or type marked with a version higher than this value\n   * are ignored during serialization or deserialization.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 57)",
        "(line 116,col 5)-(line 116,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.excludeFieldsWithModifiers(int...)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n   * Configures Gson to excludes all class fields that have the specified modifiers. By default,\n   * Gson will exclude all fields marked transient or static. This method will override that\n   * behavior.\n   *\n   * @param modifiers the field modifiers. You must use the modifiers specified in the\n   * {@link java.lang.reflect.Modifier} class. For example,\n   * {@link java.lang.reflect.Modifier#TRANSIENT},\n   * {@link java.lang.reflect.Modifier#STATIC}.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 49)",
        "(line 132,col 5)-(line 132,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.generateNonExecutableJson()",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n   * Makes the output JSON non-executable in Javascript by prefixing the generated JSON with some\n   * special text. This prevents attacks from third-party sites through script sourcing. See\n   * \u003ca href\u003d\"http://code.google.com/p/google-gson/issues/detail?id\u003d42\"\u003eGson Issue 42\u003c/a\u003e\n   * for details.\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 42)",
        "(line 146,col 5)-(line 146,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.excludeFieldsWithoutExposeAnnotation()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "\n   * Configures Gson to exclude all fields from consideration for serialization or deserialization\n   * that do not have the {@link com.google.gson.annotations.Expose} annotation.\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 63)",
        "(line 157,col 5)-(line 157,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.serializeNulls()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n   * Configure Gson to serialize null fields. By default, Gson omits all fields that are null\n   * during serialization.\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 31)",
        "(line 169,col 5)-(line 169,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.enableComplexMapKeySerialization()",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n   * Enabling this feature will only change the serialized form if the map key is\n   * a complex type (i.e. non-primitive) in its \u003cstrong\u003eserialized\u003c/strong\u003e JSON\n   * form. The default implementation of map serialization uses {@code toString()}\n   * on the key; however, when this is called then one of the following cases\n   * apply:\n   *\n   * \u003ch3\u003eMaps as JSON objects\u003c/h3\u003e\n   * For this case, assume that a type adapter is registered to serialize and\n   * deserialize some {@code Point} class, which contains an x and y coordinate,\n   * to/from the JSON Primitive string value {@code \"(x,y)\"}. The Java map would\n   * then be serialized as a {@link JsonObject}.\n   *\n   * \u003cp\u003eBelow is an example:\n   * \u003cpre\u003e  {@code\n   *   Gson gson \u003d new GsonBuilder()\n   *       .register(Point.class, new MyPointTypeAdapter())\n   *       .enableComplexMapKeySerialization()\n   *       .create();\n   *\n   *   Map\u003cPoint, String\u003e original \u003d new LinkedHashMap\u003cPoint, String\u003e();\n   *   original.put(new Point(5, 6), \"a\");\n   *   original.put(new Point(8, 8), \"b\");\n   *   System.out.println(gson.toJson(original, type));\n   * }\u003c/pre\u003e\n   * The above code prints this JSON object:\u003cpre\u003e  {@code\n   *   {\n   *     \"(5,6)\": \"a\",\n   *     \"(8,8)\": \"b\"\n   *   }\n   * }\u003c/pre\u003e\n   *\n   * \u003ch3\u003eMaps as JSON arrays\u003c/h3\u003e\n   * For this case, assume that a type adapter was NOT registered for some\n   * {@code Point} class, but rather the default Gson serialization is applied.\n   * In this case, some {@code new Point(2,3)} would serialize as {@code\n   * {\"x\":2,\"y\":5}}.\n   *\n   * \u003cp\u003eGiven the assumption above, a {@code Map\u003cPoint, String\u003e} will be\n   * serialize as an array of arrays (can be viewed as an entry set of pairs).\n   *\n   * \u003cp\u003eBelow is an example of serializing complex types as JSON arrays:\n   * \u003cpre\u003e {@code\n   *   Gson gson \u003d new GsonBuilder()\n   *       .enableComplexMapKeySerialization()\n   *       .create();\n   *\n   *   Map\u003cPoint, String\u003e original \u003d new LinkedHashMap\u003cPoint, String\u003e();\n   *   original.put(new Point(5, 6), \"a\");\n   *   original.put(new Point(8, 8), \"b\");\n   *   System.out.println(gson.toJson(original, type));\n   * }\n   *\n   * The JSON output would look as follows:\n   * \u003cpre\u003e   {@code\n   *   [\n   *     [\n   *       {\n   *         \"x\": 5,\n   *         \"y\": 6\n   *       },\n   *       \"a\"\n   *     ],\n   *     [\n   *       {\n   *         \"x\": 8,\n   *         \"y\": 8\n   *       },\n   *       \"b\"\n   *     ]\n   *   ]\n   * }\u003c/pre\u003e\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.7\n   ",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 38)",
        "(line 250,col 5)-(line 250,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.disableInnerClassSerialization()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n   * Configures Gson to exclude inner classes during serialization.\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 57)",
        "(line 261,col 5)-(line 261,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setLongSerializationPolicy(com.google.gson.LongSerializationPolicy)",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\n   * Configures Gson to apply a specific serialization policy for {@code Long} and {@code long}\n   * objects.\n   *\n   * @param serializationPolicy the particular policy to use for serializing longs.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 273,col 5)-(line 273,col 55)",
        "(line 274,col 5)-(line 274,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n   * Configures Gson to apply a specific naming policy to an object\u0027s field during serialization\n   * and deserialization.\n   *\n   * @param namingConvention the JSON field naming convention to use for serialization and\n   * deserialization.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   ",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 46)",
        "(line 287,col 5)-(line 287,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setFieldNamingStrategy(com.google.gson.FieldNamingStrategy)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\n   * Configures Gson to apply a specific naming policy strategy to an object\u0027s field during\n   * serialization and deserialization.\n   *\n   * @param fieldNamingStrategy the actual naming strategy to apply to the fields\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 49)",
        "(line 300,col 5)-(line 300,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setExclusionStrategies(com.google.gson.ExclusionStrategy...)",
      "begin_line": 313,
      "end_line": 318,
      "comment": "\n   * Configures Gson to apply a set of exclusion strategies during both serialization and\n   * deserialization. Each of the {@code strategies} will be applied as a disjunction rule.\n   * This means that if one of the {@code strategies} suggests that a field (or class) should be\n   * skipped then that field (or object) is skipped during serialization/deserialization.\n   *\n   * @param strategies the set of strategy object to apply during object (de)serialization.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 314,col 5)-(line 316,col 5)",
        "(line 317,col 5)-(line 317,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.addSerializationExclusionStrategy(com.google.gson.ExclusionStrategy)",
      "begin_line": 332,
      "end_line": 335,
      "comment": "\n   * Configures Gson to apply the passed in exclusion strategy during serialization.\n   * If this method is invoked numerous times with different exclusion strategy objects\n   * then the exclusion strategies that were added will be applied as a disjunction rule.\n   * This means that if one of the added exclusion strategies suggests that a field (or\n   * class) should be skipped then that field (or object) is skipped during its\n   * serialization.\n   *\n   * @param strategy an exclusion strategy to apply during serialization.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.7\n   ",
      "child_ranges": [
        "(line 333,col 5)-(line 333,col 69)",
        "(line 334,col 5)-(line 334,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.addDeserializationExclusionStrategy(com.google.gson.ExclusionStrategy)",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\n   * Configures Gson to apply the passed in exclusion strategy during deserialization.\n   * If this method is invoked numerous times with different exclusion strategy objects\n   * then the exclusion strategies that were added will be applied as a disjunction rule.\n   * This means that if one of the added exclusion strategies suggests that a field (or\n   * class) should be skipped then that field (or object) is skipped during its\n   * deserialization.\n   *\n   * @param strategy an exclusion strategy to apply during deserialization.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.7\n   ",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 69)",
        "(line 351,col 5)-(line 351,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setPrettyPrinting()",
      "begin_line": 360,
      "end_line": 363,
      "comment": "\n   * Configures Gson to output Json that fits in a page for pretty printing. This option only\n   * affects Json serialization.\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   ",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 26)",
        "(line 362,col 5)-(line 362,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setLenient()",
      "begin_line": 373,
      "end_line": 376,
      "comment": "\n   * By default, Gson is strict and only accepts JSON as specified by\n   * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc4627.txt\"\u003eRFC 4627\u003c/a\u003e. This option makes the parser\n   * liberal in what it accepts.\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @see JsonReader#setLenient(boolean)\n   ",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 19)",
        "(line 375,col 5)-(line 375,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.disableHtmlEscaping()",
      "begin_line": 385,
      "end_line": 388,
      "comment": "\n   * By default, Gson escapes HTML characters such as \u0026lt; \u0026gt; etc. Use this option to configure\n   * Gson to pass-through HTML characters as is.\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 33)",
        "(line 387,col 5)-(line 387,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setDateFormat(java.lang.String)",
      "begin_line": 406,
      "end_line": 410,
      "comment": "\n   * Configures Gson to serialize {@code Date} objects according to the pattern provided. You can\n   * call this method or {@link #setDateFormat(int)} multiple times, but only the last invocation\n   * will be used to decide the serialization format.\n   *\n   * \u003cp\u003eThe date format will be used to serialize and deserialize {@link java.util.Date}, {@link\n   * java.sql.Timestamp} and {@link java.sql.Date}.\n   *\n   * \u003cp\u003eNote that this pattern must abide by the convention provided by {@code SimpleDateFormat}\n   * class. See the documentation in {@link java.text.SimpleDateFormat} for more information on\n   * valid date and time patterns.\u003c/p\u003e\n   *\n   * @param pattern the pattern that dates will be serialized/deserialized to/from\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 408,col 5)-(line 408,col 31)",
        "(line 409,col 5)-(line 409,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setDateFormat(int)",
      "begin_line": 426,
      "end_line": 430,
      "comment": "\n   * Configures Gson to to serialize {@code Date} objects according to the style value provided.\n   * You can call this method or {@link #setDateFormat(String)} multiple times, but only the last\n   * invocation will be used to decide the serialization format.\n   *\n   * \u003cp\u003eNote that this style value should be one of the predefined constants in the\n   * {@code DateFormat} class. See the documentation in {@link java.text.DateFormat} for more\n   * information on the valid style constants.\u003c/p\u003e\n   *\n   * @param style the predefined date style that date objects will be serialized/deserialized\n   * to/from\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 27)",
        "(line 428,col 5)-(line 428,col 28)",
        "(line 429,col 5)-(line 429,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.setDateFormat(int, int)",
      "begin_line": 447,
      "end_line": 452,
      "comment": "\n   * Configures Gson to to serialize {@code Date} objects according to the style value provided.\n   * You can call this method or {@link #setDateFormat(String)} multiple times, but only the last\n   * invocation will be used to decide the serialization format.\n   *\n   * \u003cp\u003eNote that this style value should be one of the predefined constants in the\n   * {@code DateFormat} class. See the documentation in {@link java.text.DateFormat} for more\n   * information on the valid style constants.\u003c/p\u003e\n   *\n   * @param dateStyle the predefined date style that date objects will be serialized/deserialized\n   * to/from\n   * @param timeStyle the predefined style for the time portion of the date objects\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.2\n   ",
      "child_ranges": [
        "(line 448,col 5)-(line 448,col 31)",
        "(line 449,col 5)-(line 449,col 31)",
        "(line 450,col 5)-(line 450,col 28)",
        "(line 451,col 5)-(line 451,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.registerTypeAdapter(java.lang.reflect.Type, java.lang.Object)",
      "begin_line": 470,
      "end_line": 487,
      "comment": "\n   * Configures Gson for custom serialization or deserialization. This method combines the\n   * registration of an {@link TypeAdapter}, {@link InstanceCreator}, {@link JsonSerializer}, and a\n   * {@link JsonDeserializer}. It is best used when a single object {@code typeAdapter} implements\n   * all the required interfaces for custom serialization with Gson. If a type adapter was\n   * previously registered for the specified {@code type}, it is overwritten.\n   *\n   * \u003cp\u003eThis registers the type specified and no other types: you must manually register related\n   * types! For example, applications registering {@code boolean.class} should also register {@code\n   * Boolean.class}.\n   *\n   * @param type the type definition for the type adapter being registered\n   * @param typeAdapter This object must implement at least one of the {@link TypeAdapter},\n   * {@link InstanceCreator}, {@link JsonSerializer}, and a {@link JsonDeserializer} interfaces.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   ",
      "child_ranges": [
        "(line 472,col 5)-(line 475,col 50)",
        "(line 476,col 5)-(line 478,col 5)",
        "(line 479,col 5)-(line 482,col 5)",
        "(line 483,col 5)-(line 485,col 5)",
        "(line 486,col 5)-(line 486,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.registerTypeAdapterFactory(com.google.gson.TypeAdapterFactory)",
      "begin_line": 497,
      "end_line": 500,
      "comment": "\n   * Register a factory for type adapters. Registering a factory is useful when the type\n   * adapter needs to be configured based on the type of the field being processed. Gson\n   * is designed to handle a large number of factories, so you should consider registering\n   * them to be at par with registering an individual type adapter.\n   *\n   * @since 2.1\n   ",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 27)",
        "(line 499,col 5)-(line 499,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.registerTypeHierarchyAdapter(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 516,
      "end_line": 529,
      "comment": "\n   * Configures Gson for custom serialization or deserialization for an inheritance type hierarchy.\n   * This method combines the registration of a {@link TypeAdapter}, {@link JsonSerializer} and\n   * a {@link JsonDeserializer}. If a type adapter was previously registered for the specified\n   * type hierarchy, it is overridden. If a type adapter is registered for a specific type in\n   * the type hierarchy, it will be invoked instead of the one registered for the type hierarchy.\n   *\n   * @param baseType the class definition for the type adapter being registered for the base class\n   *        or interface\n   * @param typeAdapter This object must implement at least one of {@link TypeAdapter},\n   *        {@link JsonSerializer} or {@link JsonDeserializer} interfaces.\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.7\n   ",
      "child_ranges": [
        "(line 518,col 5)-(line 520,col 50)",
        "(line 521,col 5)-(line 524,col 5)",
        "(line 525,col 5)-(line 527,col 5)",
        "(line 528,col 5)-(line 528,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.serializeSpecialFloatingPointValues()",
      "begin_line": 551,
      "end_line": 554,
      "comment": "\n   * Section 2.4 of \u003ca href\u003d\"http://www.ietf.org/rfc/rfc4627.txt\"\u003eJSON specification\u003c/a\u003e disallows\n   * special double values (NaN, Infinity, -Infinity). However,\n   * \u003ca href\u003d\"http://www.ecma-international.org/publications/files/ECMA-ST/Ecma-262.pdf\"\u003eJavascript\n   * specification\u003c/a\u003e (see section 4.3.20, 4.3.22, 4.3.23) allows these values as valid Javascript\n   * values. Moreover, most JavaScript engines will accept these special values in JSON without\n   * problem. So, at a practical level, it makes sense to accept these values as valid JSON even\n   * though JSON specification disallows them.\n   *\n   * \u003cp\u003eGson always accepts these special values during deserialization. However, it outputs\n   * strictly compliant JSON. Hence, if it encounters a float value {@link Float#NaN},\n   * {@link Float#POSITIVE_INFINITY}, {@link Float#NEGATIVE_INFINITY}, or a double value\n   * {@link Double#NaN}, {@link Double#POSITIVE_INFINITY}, {@link Double#NEGATIVE_INFINITY}, it\n   * will throw an {@link IllegalArgumentException}. This method provides a way to override the\n   * default behavior when you know that the JSON receiver will be able to handle these special\n   * values.\n   *\n   * @return a reference to this {@code GsonBuilder} object to fulfill the \"Builder\" pattern\n   * @since 1.3\n   ",
      "child_ranges": [
        "(line 552,col 5)-(line 552,col 52)",
        "(line 553,col 5)-(line 553,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.create()",
      "begin_line": 562,
      "end_line": 573,
      "comment": "\n   * Creates a {@link Gson} instance based on the current configuration. This method is free of\n   * side-effects to this {@code GsonBuilder} instance and hence can be called multiple times.\n   *\n   * @return an instance of Gson configured with the options currently set in this builder\n   ",
      "child_ranges": [
        "(line 563,col 5)-(line 563,col 77)",
        "(line 564,col 5)-(line 564,col 37)",
        "(line 565,col 5)-(line 565,col 35)",
        "(line 566,col 5)-(line 566,col 46)",
        "(line 567,col 5)-(line 567,col 73)",
        "(line 569,col 5)-(line 572,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonBuilder.addTypeAdaptersForDate(java.lang.String, int, int, java.util.List\u003ccom.google.gson.TypeAdapterFactory\u003e)",
      "begin_line": 575,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 577,col 5)-(line 577,col 43)",
        "(line 578,col 5)-(line 584,col 5)",
        "(line 586,col 5)-(line 586,col 90)",
        "(line 587,col 5)-(line 587,col 95)",
        "(line 588,col 5)-(line 588,col 99)"
      ]
    }
  ]
}