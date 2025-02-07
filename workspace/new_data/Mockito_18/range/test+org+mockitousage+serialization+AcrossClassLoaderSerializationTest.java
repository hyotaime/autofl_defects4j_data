{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/serialization/AcrossClassLoaderSerializationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AcrossClassLoaderSerializationTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.reproduce_CCE_by_creating_a_mock_with_IMethods_before()",
      "begin_line": 25,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.check_that_mock_can_be_serialized_in_a_classloader_and_deserialized_in_another()",
      "begin_line": 30,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 72)",
        "(line 34,col 9)-(line 34,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.read_stream_and_deserialize_it_in_class_loader_B(byte[])",
      "begin_line": 37,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 43,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.create_mock_and_serialize_it_in_class_loader_A()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.isolating_test_classes()",
      "begin_line": 52,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 59,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "acceptReloadOf(String)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Corresponding declaration not available for unsolved symbol.\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 54,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 55,col 17)-(line 57,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CreateMockAndSerializeIt",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Callable\u003cbyte[]\u003e"
      ],
      "begin_line": 64,
      "end_line": 75,
      "comment": " see create_mock_and_serialize_it_in_class_loader_A"
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.CreateMockAndSerializeIt.call()",
      "begin_line": 65,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 69,col 14)",
        "(line 71,col 13)-(line 71,col 38)",
        "(line 73,col 13)-(line 73,col 77)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReadStreamAndDeserializeIt",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Callable\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 78,
      "end_line": 92,
      "comment": " see read_stream_and_deserialize_it_in_class_loader_B"
    },
    {
      "type": "field",
      "varNames": [
        "bytes"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.ReadStreamAndDeserializeIt.ReadStreamAndDeserializeIt(byte[])",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.ReadStreamAndDeserializeIt.call()",
      "begin_line": 85,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 82)",
        "(line 87,col 13)-(line 90,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AClassToBeMockedInThisTestOnlyAndInCallablesOnly",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 95,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.serialization.AcrossClassLoaderSerializationTest.AClassToBeMockedInThisTestOnlyAndInCallablesOnly.returningSomething()",
      "begin_line": 96,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 96,col 37)-(line 96,col 67)"
      ]
    }
  ]
}