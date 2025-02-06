{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/internal/bind/MapTypeAdapterFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MapTypeAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 105,
      "end_line": 264,
      "comment": "\n * Adapts maps to either JSON objects or JSON arrays.\n *\n * \u003ch3\u003eMaps as JSON objects\u003c/h3\u003e\n * For primitive keys or when complex map key serialization is not enabled, this\n * converts Java {@link Map Maps} to JSON Objects. This requires that map keys\n * can be serialized as strings; this is insufficient for some key types. For\n * example, consider a map whose keys are points on a grid. The default JSON\n * form encodes reasonably: \u003cpre\u003e   {@code\n *   Map\u003cPoint, String\u003e original \u003d new LinkedHashMap\u003cPoint, String\u003e();\n *   original.put(new Point(5, 6), \"a\");\n *   original.put(new Point(8, 8), \"b\");\n *   System.out.println(gson.toJson(original, type));\n * }\u003c/pre\u003e\n * The above code prints this JSON object:\u003cpre\u003e   {@code\n *   {\n *     \"(5,6)\": \"a\",\n *     \"(8,8)\": \"b\"\n *   }\n * }\u003c/pre\u003e\n * But GSON is unable to deserialize this value because the JSON string name is\n * just the {@link Object#toString() toString()} of the map key. Attempting to\n * convert the above JSON to an object fails with a parse exception:\n * \u003cpre\u003ecom.google.gson.JsonParseException: Expecting object found: \"(5,6)\"\n *   at com.google.gson.JsonObjectDeserializationVisitor.visitFieldUsingCustomHandler\n *   at com.google.gson.ObjectNavigator.navigateClassFields\n *   ...\u003c/pre\u003e\n *\n * \u003ch3\u003eMaps as JSON arrays\u003c/h3\u003e\n * An alternative approach taken by this type adapter when it is required and\n * complex map key serialization is enabled is to encode maps as arrays of map\n * entries. Each map entry is a two element array containing a key and a value.\n * This approach is more flexible because any type can be used as the map\u0027s key;\n * not just strings. But it\u0027s also less portable because the receiver of such\n * JSON must be aware of the map entry convention.\n *\n * \u003cp\u003eRegister this adapter when you are creating your GSON instance.\n * \u003cpre\u003e   {@code\n *   Gson gson \u003d new GsonBuilder()\n *     .registerTypeAdapter(Map.class, new MapAsArrayTypeAdapter())\n *     .create();\n * }\u003c/pre\u003e\n * This will change the structure of the JSON emitted by the code above. Now we\n * get an array. In this case the arrays elements are map entries:\n * \u003cpre\u003e   {@code\n *   [\n *     [\n *       {\n *         \"x\": 5,\n *         \"y\": 6\n *       },\n *       \"a\",\n *     ],\n *     [\n *       {\n *         \"x\": 8,\n *         \"y\": 8\n *       },\n *       \"b\"\n *     ]\n *   ]\n * }\u003c/pre\u003e\n * This format will serialize and deserialize just fine as long as this adapter\n * is registered.\n "
    },
    {
      "type": "field",
      "varNames": [
        "constructorConstructor"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "complexMapKeySerialization"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.MapTypeAdapterFactory.MapTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor, boolean)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 57)",
        "(line 112,col 5)-(line 112,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.MapTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 115,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 36)",
        "(line 118,col 5)-(line 118,col 54)",
        "(line 119,col 5)-(line 121,col 5)",
        "(line 123,col 5)-(line 123,col 57)",
        "(line 124,col 5)-(line 124,col 85)",
        "(line 125,col 5)-(line 125,col 73)",
        "(line 126,col 5)-(line 126,col 86)",
        "(line 127,col 5)-(line 127,col 77)",
        "(line 129,col 5)-(line 132,col 56)",
        "(line 133,col 5)-(line 133,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.MapTypeAdapterFactory.getKeyAdapter(com.google.gson.Gson, java.lang.reflect.Type)",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\n   * Returns a type adapter that writes the value as a string.\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 142,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Adapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cjava.util.Map\u003cK, V\u003e\u003e"
      ],
      "begin_line": 145,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyTypeAdapter"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueTypeAdapter"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructor"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.MapTypeAdapterFactory.Adapter.Adapter(com.google.gson.Gson, java.lang.reflect.Type, com.google.gson.TypeAdapter\u003cK\u003e, java.lang.reflect.Type, com.google.gson.TypeAdapter\u003cV\u003e, com.google.gson.internal.ObjectConstructor\u003c? extends java.util.Map\u003cK, V\u003e\u003e)",
      "begin_line": 150,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 153,col 7)-(line 154,col 79)",
        "(line 155,col 7)-(line 156,col 83)",
        "(line 157,col 7)-(line 157,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.MapTypeAdapterFactory.Adapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 160,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 161,col 7)-(line 161,col 33)",
        "(line 162,col 7)-(line 165,col 7)",
        "(line 167,col 7)-(line 167,col 46)",
        "(line 169,col 7)-(line 194,col 7)",
        "(line 195,col 7)-(line 195,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.MapTypeAdapterFactory.Adapter.write(com.google.gson.stream.JsonWriter, java.util.Map\u003cK, V\u003e)",
      "begin_line": 198,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 199,col 7)-(line 202,col 7)",
        "(line 204,col 7)-(line 212,col 7)",
        "(line 214,col 7)-(line 214,col 37)",
        "(line 215,col 7)-(line 215,col 70)",
        "(line 217,col 7)-(line 217,col 52)",
        "(line 218,col 7)-(line 223,col 7)",
        "(line 225,col 7)-(line 242,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.MapTypeAdapterFactory.Adapter.keyToString(com.google.gson.JsonElement)",
      "begin_line": 245,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 246,col 7)-(line 261,col 7)"
      ]
    }
  ]
}