{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/TypeAdapterPrecedenceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeAdapterPrecedenceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.testNonstreamingFollowedByNonstreaming()",
      "begin_line": 35,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 41,col 18)",
        "(line 42,col 5)-(line 42,col 74)",
        "(line 43,col 5)-(line 43,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.testStreamingFollowedByStreaming()",
      "begin_line": 46,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 50,col 18)",
        "(line 51,col 5)-(line 51,col 76)",
        "(line 52,col 5)-(line 52,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.testSerializeNonstreamingTypeAdapterFollowedByStreamingTypeAdapter()",
      "begin_line": 55,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 60,col 18)",
        "(line 61,col 5)-(line 61,col 74)",
        "(line 62,col 5)-(line 62,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.testStreamingFollowedByNonstreaming()",
      "begin_line": 65,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 70,col 18)",
        "(line 71,col 5)-(line 71,col 72)",
        "(line 72,col 5)-(line 72,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.testStreamingHierarchicalFollowedByNonstreaming()",
      "begin_line": 75,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 80,col 18)",
        "(line 81,col 5)-(line 81,col 72)",
        "(line 82,col 5)-(line 82,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.testStreamingFollowedByNonstreamingHierarchical()",
      "begin_line": 85,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 90,col 18)",
        "(line 91,col 5)-(line 91,col 74)",
        "(line 92,col 5)-(line 92,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.testStreamingHierarchicalFollowedByNonstreamingHierarchical()",
      "begin_line": 95,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 100,col 18)",
        "(line 101,col 5)-(line 101,col 74)",
        "(line 102,col 5)-(line 102,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.testNonstreamingHierarchicalFollowedByNonstreaming()",
      "begin_line": 105,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 111,col 18)",
        "(line 112,col 5)-(line 112,col 78)",
        "(line 113,col 5)-(line 113,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Foo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 116,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.Foo(java.lang.String)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 7)-(line 119,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.newSerializer(java.lang.String)",
      "begin_line": 123,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 129,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.Anonymous-0bf6ce2d-96f5-43e6-9d65-a5f816061f22.serialize(com.google.gson.functional.TypeAdapterPrecedenceTest.Foo, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.newDeserializer(java.lang.String)",
      "begin_line": 132,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 138,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.Anonymous-f7f8c7bf-4c2f-46cd-bb1f-f424abc52863.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.newTypeAdapter(java.lang.String)",
      "begin_line": 141,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 149,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.Anonymous-cd84bc72-c455-4ab9-9dee-4bf305a2fd67.read(com.google.gson.stream.JsonReader)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeAdapterPrecedenceTest.Anonymous-07ec48b6-128c-4f4b-bab0-babf48e14fba.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.TypeAdapterPrecedenceTest.Foo)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 47)"
      ]
    }
  ]
}