{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/JsonAdapterAnnotationOnClassesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonAdapterAnnotationOnClassesTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 252,
      "comment": "\n * Functional tests for the {@link com.google.gson.annotations.JsonAdapter} annotation on classes.\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterInvoked()",
      "begin_line": 44,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 27)",
        "(line 46,col 5)-(line 46,col 44)",
        "(line 47,col 5)-(line 47,col 42)",
        "(line 50,col 5)-(line 50,col 55)",
        "(line 51,col 5)-(line 51,col 57)",
        "(line 52,col 5)-(line 52,col 68)",
        "(line 53,col 5)-(line 53,col 41)",
        "(line 54,col 5)-(line 54,col 42)",
        "(line 56,col 5)-(line 56,col 32)",
        "(line 57,col 5)-(line 57,col 34)",
        "(line 58,col 5)-(line 58,col 50)",
        "(line 59,col 5)-(line 59,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterFactoryInvoked()",
      "begin_line": 62,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 27)",
        "(line 64,col 5)-(line 64,col 44)",
        "(line 65,col 5)-(line 65,col 49)",
        "(line 66,col 5)-(line 66,col 44)",
        "(line 67,col 5)-(line 67,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testRegisteredAdapterOverridesJsonAdapter()",
      "begin_line": 70,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 78,col 6)",
        "(line 79,col 5)-(line 81,col 16)",
        "(line 82,col 5)-(line 82,col 45)",
        "(line 83,col 5)-(line 83,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Anonymous-2fd35f0a-b029-4724-a3da-9964567d9219.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.A)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Anonymous-76db6a00-11fe-4661-afa3-475340bbced9.read(com.google.gson.stream.JsonReader)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testRegisteredSerializerOverridesJsonAdapter()",
      "begin_line": 89,
      "end_line": 103,
      "comment": "\n   * The serializer overrides field adapter, but for deserializer the fieldAdapter is used.\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 95,col 6)",
        "(line 96,col 5)-(line 98,col 16)",
        "(line 99,col 5)-(line 99,col 45)",
        "(line 100,col 5)-(line 100,col 51)",
        "(line 101,col 5)-(line 101,col 46)",
        "(line 102,col 5)-(line 102,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Anonymous-1421a2d8-67ba-40bf-b079-1653302315e4.serialize(com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.A, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testRegisteredDeserializerOverridesJsonAdapter()",
      "begin_line": 108,
      "end_line": 122,
      "comment": "\n   * The deserializer overrides Json adapter, but for serializer the jsonAdapter is used.\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 114,col 6)",
        "(line 115,col 5)-(line 117,col 16)",
        "(line 118,col 5)-(line 118,col 45)",
        "(line 119,col 5)-(line 119,col 42)",
        "(line 120,col 5)-(line 120,col 46)",
        "(line 121,col 5)-(line 121,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Anonymous-163cd580-55aa-4ea8-8c38-dccc392995d3.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testIncorrectTypeAdapterFails()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 128,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testSuperclassTypeAdapterNotInvoked()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 50)",
        "(line 133,col 5)-(line 133,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testNullSafeObjectFromJson()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 27)",
        "(line 138,col 5)-(line 138,col 72)",
        "(line 139,col 5)-(line 139,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "A",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 142,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.A.A(java.lang.String)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 7)-(line 146,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JsonAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003ccom.google.gson.functional.JsonAdapterAnnotationOnClassesTest.A\u003e"
      ],
      "begin_line": 148,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.A.JsonAdapter.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.A)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.A.JsonAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 24)",
        "(line 154,col 9)-(line 154,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "C",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 159,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.C.C(java.lang.String)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 7)-(line 163,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JsonAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 165,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.C.JsonAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 166,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 176,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.C.JsonAdapterFactory.Anonymous-9c9a1284-b7da-4a5b-b591-e65371ae0194.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.C.JsonAdapterFactory.Anonymous-5bd4dd40-b39f-4a79-8215-46ca694d1d7f.read(com.google.gson.stream.JsonReader)",
      "begin_line": 171,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 173,col 13)-(line 173,col 28)",
        "(line 174,col 13)-(line 174,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "B",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.A"
      ],
      "begin_line": 181,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.B.B(java.lang.String)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 7)-(line 183,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithIncorrectJsonAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 188,
      "end_line": 194,
      "comment": " should cause error"
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.ClassWithIncorrectJsonAdapter.ClassWithIncorrectJsonAdapter(java.lang.String)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 7)-(line 192,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "User",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 197,
      "end_line": 204,
      "comment": " This class is used in JsonAdapter Javadoc as an example"
    },
    {
      "type": "field",
      "varNames": [
        "firstName",
        "lastName"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.User.User(java.lang.String, java.lang.String)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 201,col 7)-(line 201,col 33)",
        "(line 202,col 7)-(line 202,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UserJsonAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003ccom.google.gson.functional.JsonAdapterAnnotationOnClassesTest.User\u003e"
      ],
      "begin_line": 205,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.UserJsonAdapter.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.User)",
      "begin_line": 206,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 7)-(line 208,col 24)",
        "(line 209,col 7)-(line 209,col 23)",
        "(line 210,col 7)-(line 210,col 54)",
        "(line 211,col 7)-(line 211,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.UserJsonAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 214,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 216,col 7)-(line 216,col 23)",
        "(line 217,col 7)-(line 217,col 20)",
        "(line 218,col 7)-(line 218,col 54)",
        "(line 219,col 7)-(line 219,col 21)",
        "(line 220,col 7)-(line 220,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NullableClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 224,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "NullableClassJsonAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003ccom.google.gson.functional.JsonAdapterAnnotationOnClassesTest.NullableClass\u003e"
      ],
      "begin_line": 228,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.NullableClassJsonAdapter.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.NullableClass)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 7)-(line 231,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.NullableClassJsonAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 234,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 236,col 7)-(line 236,col 22)",
        "(line 237,col 7)-(line 237,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FooJsonAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003ccom.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Foo\u003e"
      ],
      "begin_line": 243,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.FooJsonAdapter.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Foo)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 7)-(line 245,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.FooJsonAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 65)"
      ]
    }
  ]
}