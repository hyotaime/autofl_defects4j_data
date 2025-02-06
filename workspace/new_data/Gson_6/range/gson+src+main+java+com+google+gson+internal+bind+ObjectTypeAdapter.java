{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/bind/ObjectTypeAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 37,
      "end_line": 109,
      "comment": "\n * Adapts types whose static type is only \u0027Object\u0027. Uses getClass() on\n * serialization and a primitive/Map/List on deserialization.\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 38,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ObjectTypeAdapter.Anonymous-ada5dd98-60d6-4974-b27c-4a542e483b44.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 39,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 41,col 7)-(line 43,col 7)",
        "(line 44,col 7)-(line 44,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.ObjectTypeAdapter.ObjectTypeAdapter(com.google.gson.Gson)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ObjectTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 54,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 32)",
        "(line 56,col 5)-(line 90,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ObjectTypeAdapter.write(com.google.gson.stream.JsonWriter, java.lang.Object)",
      "begin_line": 93,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 98,col 5)",
        "(line 100,col 5)-(line 100,col 94)",
        "(line 101,col 5)-(line 105,col 5)",
        "(line 107,col 5)-(line 107,col 34)"
      ]
    }
  ]
}