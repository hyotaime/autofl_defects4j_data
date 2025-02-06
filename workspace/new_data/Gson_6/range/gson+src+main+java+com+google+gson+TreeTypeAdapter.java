{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/TreeTypeAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cT\u003e"
      ],
      "begin_line": 31,
      "end_line": 141,
      "comment": "\n * Adapts a Gson 1.x tree-style adapter as a streaming TypeAdapter. Since the\n * tree adapter may be serialization-only or deserialization-only, this class\n * has a facility to lookup a delegate type adapter on demand.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serializer"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deserializer"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeToken"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "skipPast"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The delegate is lazily created because it may not be needed, and creating it may fail. "
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.TreeTypeAdapter.TreeTypeAdapter(com.google.gson.JsonSerializer\u003cT\u003e, com.google.gson.JsonDeserializer\u003cT\u003e, com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e, com.google.gson.TypeAdapterFactory)",
      "begin_line": 41,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 33)",
        "(line 44,col 5)-(line 44,col 37)",
        "(line 45,col 5)-(line 45,col 21)",
        "(line 46,col 5)-(line 46,col 31)",
        "(line 47,col 5)-(line 47,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TreeTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 50,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 53,col 5)",
        "(line 54,col 5)-(line 54,col 42)",
        "(line 55,col 5)-(line 57,col 5)",
        "(line 58,col 5)-(line 58,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TreeTypeAdapter.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 61,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 65,col 5)",
        "(line 66,col 5)-(line 69,col 5)",
        "(line 70,col 5)-(line 70,col 99)",
        "(line 71,col 5)-(line 71,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TreeTypeAdapter.delegate()",
      "begin_line": 74,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 32)",
        "(line 76,col 5)-(line 78,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TreeTypeAdapter.newFactory(com.google.gson.reflect.TypeToken\u003c?\u003e, java.lang.Object)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n   * Returns a new factory that will match each type against {@code exactType}.\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TreeTypeAdapter.newFactoryWithMatchRawType(com.google.gson.reflect.TypeToken\u003c?\u003e, java.lang.Object)",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\n   * Returns a new factory that will match each type and its raw type against\n   * {@code exactType}.\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 73)",
        "(line 96,col 5)-(line 96,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TreeTypeAdapter.newTypeHierarchyFactory(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n   * Returns a new factory that will match each type\u0027s raw type for assignability\n   * to {@code hierarchyType}.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SingleTypeFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 108,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exactType"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "matchRawType"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hierarchyType"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializer"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deserializer"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.TreeTypeAdapter.SingleTypeFactory.SingleTypeFactory(java.lang.Object, com.google.gson.reflect.TypeToken\u003c?\u003e, boolean, java.lang.Class\u003c?\u003e)",
      "begin_line": 115,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 117,col 7)-(line 119,col 17)",
        "(line 120,col 7)-(line 122,col 17)",
        "(line 123,col 7)-(line 123,col 84)",
        "(line 124,col 7)-(line 124,col 33)",
        "(line 125,col 7)-(line 125,col 39)",
        "(line 126,col 7)-(line 126,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.TreeTypeAdapter.SingleTypeFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 129,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 134,col 62)",
        "(line 135,col 7)-(line 138,col 17)"
      ]
    }
  ]
}