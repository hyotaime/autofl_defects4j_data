{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/basicapi/ReplacingObjectMethodsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplacingObjectMethodsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 13,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DummyInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DummyClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.shouldProvideMockyImplementationOfToString()",
      "begin_line": 18,
      "end_line": 24,
      "comment": "",
      "child_ranges": [
        "(line 20,col 9)-(line 20,col 63)",
        "(line 21,col 9)-(line 21,col 103)",
        "(line 22,col 9)-(line 22,col 75)",
        "(line 23,col 9)-(line 23,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.shouldReplaceObjectMethods()",
      "begin_line": 26,
      "end_line": 27,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.shouldReplaceObjectMethodsWhenOverridden()",
      "begin_line": 42,
      "end_line": 43,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ObjectMethodsOverridden",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.ObjectMethodsOverridden.equals(java.lang.Object)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.ObjectMethodsOverridden.hashCode()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.ObjectMethodsOverridden.toString()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 112)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectMethodsOverriddenSubclass",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.basicapi.ReplacingObjectMethodsTest.ObjectMethodsOverridden"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": ""
    }
  ]
}