{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/bind/CollectionTypeAdapterFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionTypeAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 36,
      "end_line": 102,
      "comment": "\n * Adapt a homogeneous collection of objects.\n "
    },
    {
      "type": "field",
      "varNames": [
        "constructorConstructor"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.CollectionTypeAdapterFactory.CollectionTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.CollectionTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 43,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 36)",
        "(line 47,col 5)-(line 47,col 54)",
        "(line 48,col 5)-(line 50,col 5)",
        "(line 52,col 5)-(line 52,col 75)",
        "(line 53,col 5)-(line 53,col 84)",
        "(line 54,col 5)-(line 54,col 77)",
        "(line 56,col 5)-(line 57,col 92)",
        "(line 58,col 5)-(line 58,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Adapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cjava.util.Collection\u003cE\u003e\u003e"
      ],
      "begin_line": 61,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elementTypeAdapter"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructor"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.CollectionTypeAdapterFactory.Adapter.Adapter(com.google.gson.Gson, java.lang.reflect.Type, com.google.gson.TypeAdapter\u003cE\u003e, com.google.gson.internal.ObjectConstructor\u003c? extends java.util.Collection\u003cE\u003e\u003e)",
      "begin_line": 65,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 68,col 7)-(line 69,col 89)",
        "(line 70,col 7)-(line 70,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.CollectionTypeAdapterFactory.Adapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 73,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 74,col 7)-(line 77,col 7)",
        "(line 79,col 7)-(line 79,col 57)",
        "(line 80,col 7)-(line 80,col 22)",
        "(line 81,col 7)-(line 84,col 7)",
        "(line 85,col 7)-(line 85,col 20)",
        "(line 86,col 7)-(line 86,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.CollectionTypeAdapterFactory.Adapter.write(com.google.gson.stream.JsonWriter, java.util.Collection\u003cE\u003e)",
      "begin_line": 89,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 90,col 7)-(line 93,col 7)",
        "(line 95,col 7)-(line 95,col 23)",
        "(line 96,col 7)-(line 98,col 7)",
        "(line 99,col 7)-(line 99,col 21)"
      ]
    }
  ]
}