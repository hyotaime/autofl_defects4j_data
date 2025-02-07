{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/annotation/SpyAnnotationInitializedInBaseClassTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpyAnnotationInitializedInBaseClassTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 16,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BaseClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 19,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SubClass",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.SpyAnnotationInitializedInBaseClassTest.BaseClass"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationInitializedInBaseClassTest.shouldInitSpiesInBaseClass()",
      "begin_line": 25,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 43)",
        "(line 30,col 9)-(line 30,col 47)",
        "(line 32,col 9)-(line 32,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationInitializedInBaseClassTest.init()",
      "begin_line": 35,
      "end_line": 39,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationInitializedInBaseClassTest.before()",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "spyInBaseclass"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SubTest",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.SpyAnnotationInitializedInBaseClassTest"
      ],
      "begin_line": 48,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spyInSubclass"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationInitializedInBaseClassTest.SubTest.shouldInitSpiesInHierarchy()",
      "begin_line": 52,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 46)",
        "(line 55,col 13)-(line 55,col 47)"
      ]
    }
  ]
}