{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/internal/bind/TreeTypeAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cT\u003e"
      ],
      "begin_line": 41,
      "end_line": 165,
      "comment": "\n * Adapts a Gson 1.x tree-style adapter as a streaming TypeAdapter. Since the\n * tree adapter may be serialization-only or deserialization-only, this class\n * has a facility to lookup a delegate type adapter on demand.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serializer"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deserializer"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeToken"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "skipPast"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The delegate is lazily created because it may not be needed, and creating it may fail. "
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.TreeTypeAdapter(com.google.gson.JsonSerializer\u003cT\u003e, com.google.gson.JsonDeserializer\u003cT\u003e, com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e, com.google.gson.TypeAdapterFactory)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 33)",
        "(line 55,col 5)-(line 55,col 37)",
        "(line 56,col 5)-(line 56,col 21)",
        "(line 57,col 5)-(line 57,col 31)",
        "(line 58,col 5)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 61,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 64,col 5)",
        "(line 65,col 5)-(line 65,col 42)",
        "(line 66,col 5)-(line 68,col 5)",
        "(line 69,col 5)-(line 69,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 72,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 76,col 5)",
        "(line 77,col 5)-(line 80,col 5)",
        "(line 81,col 5)-(line 81,col 81)",
        "(line 82,col 5)-(line 82,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.delegate()",
      "begin_line": 85,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 32)",
        "(line 87,col 5)-(line 89,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.newFactory(com.google.gson.reflect.TypeToken\u003c?\u003e, java.lang.Object)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n   * Returns a new factory that will match each type against {@code exactType}.\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.newFactoryWithMatchRawType(com.google.gson.reflect.TypeToken\u003c?\u003e, java.lang.Object)",
      "begin_line": 103,
      "end_line": 108,
      "comment": "\n   * Returns a new factory that will match each type and its raw type against\n   * {@code exactType}.\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 73)",
        "(line 107,col 5)-(line 107,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.newTypeHierarchyFactory(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n   * Returns a new factory that will match each type\u0027s raw type for assignability\n   * to {@code hierarchyType}.\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SingleTypeFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 119,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exactType"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "matchRawType"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hierarchyType"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializer"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deserializer"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory.SingleTypeFactory(java.lang.Object, com.google.gson.reflect.TypeToken\u003c?\u003e, boolean, java.lang.Class\u003c?\u003e)",
      "begin_line": 126,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 128,col 7)-(line 130,col 17)",
        "(line 131,col 7)-(line 133,col 17)",
        "(line 134,col 7)-(line 134,col 84)",
        "(line 135,col 7)-(line 135,col 33)",
        "(line 136,col 7)-(line 136,col 39)",
        "(line 137,col 7)-(line 137,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 140,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 143,col 7)-(line 145,col 62)",
        "(line 146,col 7)-(line 149,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GsonContextImpl",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializationContext",
        "com.google.gson.JsonDeserializationContext"
      ],
      "begin_line": 153,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.GsonContextImpl.serialize(java.lang.Object)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 7)-(line 155,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.GsonContextImpl.serialize(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 7)-(line 158,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TreeTypeAdapter.GsonContextImpl.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 162,col 46)"
      ]
    }
  ]
}