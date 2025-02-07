{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/basicapi/ReplacingObjectMethodsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplacingObjectMethodsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 14,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DummyInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DummyClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.shouldProvideMockyImplementationOfToString()",
      "begin_line": 19,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 63)",
        "(line 22,col 9)-(line 22,col 103)",
        "(line 23,col 9)-(line 23,col 75)",
        "(line 24,col 9)-(line 24,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.shouldReplaceObjectMethods()",
      "begin_line": 27,
      "end_line": 28,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.shouldReplaceObjectMethodsWhenOverridden()",
      "begin_line": 43,
      "end_line": 44,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ObjectMethodsOverridden",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.ObjectMethodsOverridden.equals(java.lang.Object)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.ObjectMethodsOverridden.hashCode()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.ReplacingObjectMethodsTest.ObjectMethodsOverridden.toString()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 112)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectMethodsOverriddenSubclass",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.basicapi.ReplacingObjectMethodsTest.ObjectMethodsOverridden"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": ""
    }
  ]
}