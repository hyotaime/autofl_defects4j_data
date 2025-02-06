{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/basicapi/AnnotationsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 24,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "notAMock"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listTwo"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.AnnotationsTest.setup()",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.AnnotationsTest.shouldInitMocks()",
      "begin_line": 42,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 21)",
        "(line 45,col 9)-(line 45,col 20)",
        "(line 46,col 9)-(line 46,col 24)",
        "(line 48,col 9)-(line 48,col 29)",
        "(line 49,col 9)-(line 49,col 28)",
        "(line 50,col 9)-(line 50,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.AnnotationsTest.shouldScreamWhenInitializingMocksForNullClass()",
      "begin_line": 53,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.AnnotationsTest.shouldLookForAnnotatedMocksInSuperClasses()",
      "begin_line": 64,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 28)",
        "(line 67,col 9)-(line 67,col 42)",
        "(line 69,col 9)-(line 69,col 37)",
        "(line 70,col 9)-(line 70,col 41)",
        "(line 71,col 9)-(line 71,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SuperBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.AnnotationsTest.SuperBase.getSuperBaseMock()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.basicapi.AnnotationsTest.SuperBase"
      ],
      "begin_line": 82,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.AnnotationsTest.Base.getBaseMock()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sub",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.basicapi.AnnotationsTest.Base"
      ],
      "begin_line": 90,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.basicapi.AnnotationsTest.Sub.getMock()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 24)"
      ]
    }
  ]
}