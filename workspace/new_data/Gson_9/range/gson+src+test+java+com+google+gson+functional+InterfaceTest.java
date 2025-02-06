{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/InterfaceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InterfaceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 72,
      "comment": "\n * Functional tests involving interfaces.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "OBJ_JSON"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "obj"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.InterfaceTest.setUp()",
      "begin_line": 35,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 18)",
        "(line 38,col 5)-(line 38,col 22)",
        "(line 39,col 5)-(line 39,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.InterfaceTest.testSerializingObjectImplementingInterface()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.InterfaceTest.testSerializingInterfaceObjectField()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 62)",
        "(line 48,col 5)-(line 48,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.InterfaceTest.TestObjectInterface"
      ],
      "begin_line": 55,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "someStringValue"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.InterfaceTest.TestObject.TestObject(java.lang.String)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 7)-(line 60,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "obj"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.InterfaceTest.TestObjectWrapper.TestObjectWrapper(com.google.gson.functional.InterfaceTest.TestObjectInterface)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 21)"
      ]
    }
  ]
}