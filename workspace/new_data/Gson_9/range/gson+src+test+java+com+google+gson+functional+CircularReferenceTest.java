{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/CircularReferenceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircularReferenceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 126,
      "comment": "\n * Functional tests related to circular reference detection and error reporting.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CircularReferenceTest.setUp()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 18)",
        "(line 44,col 5)-(line 44,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CircularReferenceTest.testCircularSerialization()",
      "begin_line": 47,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 70)",
        "(line 49,col 5)-(line 49,col 70)",
        "(line 50,col 5)-(line 50,col 22)",
        "(line 51,col 5)-(line 51,col 22)",
        "(line 52,col 5)-(line 56,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CircularReferenceTest.testSelfReferenceIgnoredInSerialization()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 61)",
        "(line 61,col 5)-(line 61,col 20)",
        "(line 63,col 5)-(line 63,col 36)",
        "(line 64,col 5)-(line 64,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CircularReferenceTest.testSelfReferenceArrayFieldSerialization()",
      "begin_line": 67,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 73)",
        "(line 69,col 5)-(line 69,col 60)",
        "(line 71,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CircularReferenceTest.testSelfReferenceCustomHandlerSerialization()",
      "begin_line": 78,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 62)",
        "(line 80,col 5)-(line 80,col 20)",
        "(line 81,col 5)-(line 89,col 16)",
        "(line 90,col 5)-(line 94,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CircularReferenceTest.Anonymous-c796fb03-0fd3-418e-b22f-d69ad0ab86e6.serialize(com.google.gson.functional.CircularReferenceTest.ClassWithSelfReference, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 42)",
        "(line 85,col 9)-(line 85,col 45)",
        "(line 86,col 9)-(line 86,col 55)",
        "(line 87,col 9)-(line 87,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CircularReferenceTest.testDirectedAcyclicGraphSerialization()",
      "begin_line": 97,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 70)",
        "(line 99,col 5)-(line 99,col 70)",
        "(line 100,col 5)-(line 100,col 70)",
        "(line 101,col 5)-(line 101,col 22)",
        "(line 102,col 5)-(line 102,col 22)",
        "(line 103,col 5)-(line 103,col 22)",
        "(line 104,col 5)-(line 104,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CircularReferenceTest.testDirectedAcyclicGraphDeserialization()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 90)",
        "(line 109,col 5)-(line 109,col 96)",
        "(line 110,col 5)-(line 110,col 26)",
        "(line 111,col 5)-(line 111,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContainsReferenceToSelfType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 114,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "children"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ClassWithSelfReference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 118,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "child"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ClassWithSelfReferenceArray",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 122,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "children"
      ],
      "begin_line": 123,
      "end_line": 124,
      "comment": ""
    }
  ]
}