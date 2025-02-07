{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/serialization/DeepStubsSerializableTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeepStubsSerializableTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.should_serialize_and_deserialize_mock_created_with_deep_stubs()",
      "begin_line": 17,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 20,col 9)-(line 20,col 123)",
        "(line 21,col 9)-(line 21,col 65)",
        "(line 22,col 9)-(line 22,col 63)",
        "(line 25,col 9)-(line 25,col 71)",
        "(line 28,col 9)-(line 28,col 77)",
        "(line 29,col 9)-(line 29,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.should_serialize_and_deserialize_parameterized_class_mocked_with_deep_stubs()",
      "begin_line": 32,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 128)",
        "(line 36,col 9)-(line 36,col 73)",
        "(line 39,col 9)-(line 39,col 78)",
        "(line 42,col 9)-(line 42,col 134)",
        "(line 43,col 9)-(line 43,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.should_discard_generics_metadata_when_serialized_then_disabling_deep_stubs_with_generics()",
      "begin_line": 46,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 128)",
        "(line 50,col 9)-(line 50,col 65)",
        "(line 52,col 9)-(line 52,col 78)",
        "(line 55,col 9)-(line 55,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SampleClass",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.SampleClass.getSample()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 62,col 36)-(line 62,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SampleClass2",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.SampleClass2.isFalse()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 66,col 29)-(line 66,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.SampleClass2.number()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 67,col 24)-(line 67,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Container",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.Container.Container(E)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 72,col 33)-(line 72,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.Container.get()",
      "begin_line": 73,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 73,col 26)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.Container.iterator()",
      "begin_line": 75,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 80,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.Container.Anonymous-79539ad2-1d4b-46cb-b69e-dcbf5646c880.hasNext()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 77,col 44)-(line 77,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.Container.Anonymous-830716b8-99cc-4913-bddb-63c176f7b8cb.next()",
      "begin_line": 78,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 78,col 35)-(line 78,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.Container.Anonymous-6e58885f-07be-4452-8500-f2809ceefdde.remove()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ListContainer",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.serialization.DeepStubsSerializableTest.Container\u003cjava.util.List\u003cjava.lang.String\u003e\u003e"
      ],
      "begin_line": 84,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.serialization.DeepStubsSerializableTest.ListContainer.ListContainer(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 85,col 51)-(line 85,col 62)"
      ]
    }
  ]
}