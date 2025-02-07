{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/annotation/AnnotationsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 26,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "notAMock"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listTwo"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.AnnotationsTest.setup()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.AnnotationsTest.shouldInitMocks()",
      "begin_line": 45,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 21)",
        "(line 48,col 9)-(line 48,col 20)",
        "(line 49,col 9)-(line 49,col 24)",
        "(line 51,col 9)-(line 51,col 29)",
        "(line 52,col 9)-(line 52,col 28)",
        "(line 53,col 9)-(line 53,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.AnnotationsTest.shouldScreamWhenInitializingMocksForNullClass()",
      "begin_line": 56,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.AnnotationsTest.shouldLookForAnnotatedMocksInSuperClasses()",
      "begin_line": 67,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 28)",
        "(line 70,col 9)-(line 70,col 42)",
        "(line 72,col 9)-(line 72,col 37)",
        "(line 73,col 9)-(line 73,col 41)",
        "(line 74,col 9)-(line 74,col 46)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "namedAndReturningMocks"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returningDefaults"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasExtraInterfaces"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noExtraConfig"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.AnnotationsTest.shouldInitMocksWithGivenSettings()",
      "begin_line": 82,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 73)",
        "(line 85,col 9)-(line 85,col 72)",
        "(line 87,col 9)-(line 87,col 72)",
        "(line 88,col 9)-(line 88,col 64)",
        "(line 90,col 9)-(line 90,col 55)",
        "(line 92,col 9)-(line 92,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SuperBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 95,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.AnnotationsTest.SuperBase.getSuperBaseMock()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.AnnotationsTest.SuperBase"
      ],
      "begin_line": 103,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.AnnotationsTest.Base.getBaseMock()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sub",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.AnnotationsTest.Base"
      ],
      "begin_line": 111,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.AnnotationsTest.Sub.getMock()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 24)"
      ]
    }
  ]
}