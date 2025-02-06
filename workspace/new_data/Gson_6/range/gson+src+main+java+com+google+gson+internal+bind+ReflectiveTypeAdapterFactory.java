{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectiveTypeAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 48,
      "end_line": 248,
      "comment": "\n * Type adapter that reflects over the fields and methods of a class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "constructorConstructor"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldNamingPolicy"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "excluder"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.ReflectiveTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor, com.google.gson.FieldNamingStrategy, com.google.gson.internal.Excluder)",
      "begin_line": 53,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 57)",
        "(line 56,col 5)-(line 56,col 47)",
        "(line 57,col 5)-(line 57,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField(java.lang.reflect.Field, boolean)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField(java.lang.reflect.Field, boolean, com.google.gson.internal.Excluder)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getFieldNames(java.lang.reflect.Field)",
      "begin_line": 69,
      "end_line": 71,
      "comment": " first element holds the default name ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getFieldName(com.google.gson.FieldNamingStrategy, java.lang.reflect.Field)",
      "begin_line": 74,
      "end_line": 86,
      "comment": " first element holds the default name ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 74)",
        "(line 76,col 5)-(line 76,col 55)",
        "(line 77,col 5)-(line 84,col 5)",
        "(line 85,col 5)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 88,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 45)",
        "(line 91,col 5)-(line 93,col 5)",
        "(line 95,col 5)-(line 95,col 72)",
        "(line 96,col 5)-(line 96,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.createBoundField(com.google.gson.Gson, java.lang.reflect.Field, java.lang.String, com.google.gson.reflect.TypeToken\u003c?\u003e, boolean, boolean)",
      "begin_line": 99,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 79)",
        "(line 104,col 5)-(line 126,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "typeAdapter"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Anonymous-d742385f-10b5-4c77-b3b0-7fd8d9a17e11.write(com.google.gson.stream.JsonWriter, java.lang.Object)",
      "begin_line": 106,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 45)",
        "(line 110,col 9)-(line 111,col 92)",
        "(line 112,col 9)-(line 112,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Anonymous-abb527c5-e660-4cee-951f-ea37ce834e8f.read(com.google.gson.stream.JsonReader, java.lang.Object)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Anonymous-c8eaed97-6ed1-48a9-97b8-a1c8330d83b9.writeField(java.lang.Object)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 38)",
        "(line 123,col 9)-(line 123,col 45)",
        "(line 124,col 9)-(line 124,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getFieldAdapter(com.google.gson.Gson, java.lang.reflect.Field, com.google.gson.reflect.TypeToken\u003c?\u003e)",
      "begin_line": 129,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 68)",
        "(line 131,col 5)-(line 134,col 5)",
        "(line 135,col 5)-(line 135,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 138,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 77)",
        "(line 140,col 5)-(line 142,col 5)",
        "(line 144,col 5)-(line 144,col 39)",
        "(line 145,col 5)-(line 172,col 5)",
        "(line 173,col 5)-(line 173,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 176,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialized"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deserialized"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField.BoundField(java.lang.String, boolean, boolean)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 23)",
        "(line 183,col 7)-(line 183,col 35)",
        "(line 184,col 7)-(line 184,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField.writeField(java.lang.Object)",
      "begin_line": 186,
      "end_line": 186,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField.write(com.google.gson.stream.JsonWriter, java.lang.Object)",
      "begin_line": 187,
      "end_line": 187,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField.read(com.google.gson.stream.JsonReader, java.lang.Object)",
      "begin_line": 188,
      "end_line": 188,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Adapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cT\u003e"
      ],
      "begin_line": 191,
      "end_line": 247,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructor"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "boundFields"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter.Adapter(com.google.gson.internal.ObjectConstructor\u003cT\u003e, java.util.Map\u003cjava.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField\u003e)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 196,col 7)-(line 196,col 37)",
        "(line 197,col 7)-(line 197,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 200,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 201,col 7)-(line 204,col 7)",
        "(line 206,col 7)-(line 206,col 43)",
        "(line 208,col 7)-(line 223,col 7)",
        "(line 224,col 7)-(line 224,col 21)",
        "(line 225,col 7)-(line 225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 228,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 229,col 7)-(line 232,col 7)",
        "(line 234,col 7)-(line 234,col 24)",
        "(line 235,col 7)-(line 244,col 7)",
        "(line 245,col 7)-(line 245,col 22)"
      ]
    }
  ]
}