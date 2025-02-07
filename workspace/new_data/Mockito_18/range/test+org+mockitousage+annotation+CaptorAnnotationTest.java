{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/annotation/CaptorAnnotationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CaptorAnnotationTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 24,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finalCaptor"
      ],
      "begin_line": 31,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "genericsCaptor"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nonGenericCaptorIsAllowed"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockInterface"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "notAMock"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MockInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.MockInterface.testMe(java.lang.String, java.util.List\u003cjava.util.List\u003cjava.lang.String\u003e\u003e)",
      "begin_line": 47,
      "end_line": 47,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.testNormalUsage()",
      "begin_line": 50,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 43)",
        "(line 56,col 9)-(line 56,col 35)",
        "(line 57,col 9)-(line 57,col 38)",
        "(line 58,col 9)-(line 58,col 49)",
        "(line 59,col 9)-(line 59,col 29)",
        "(line 62,col 9)-(line 62,col 43)",
        "(line 63,col 9)-(line 63,col 85)",
        "(line 65,col 9)-(line 65,col 70)",
        "(line 67,col 9)-(line 67,col 94)",
        "(line 69,col 9)-(line 69,col 64)",
        "(line 70,col 9)-(line 70,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WrongType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wrongType"
      ],
      "begin_line": 75,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.shouldScreamWhenWrongTypeForCaptor()",
      "begin_line": 79,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 84,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ToManyAnnotations",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 87,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "missingGenericsField"
      ],
      "begin_line": 88,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.shouldScreamWhenMoreThanOneMockitoAnnotaton()",
      "begin_line": 93,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.shouldScreamWhenInitializingCaptorsForNullClass()",
      "begin_line": 104,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.shouldLookForAnnotatedCaptorsInSuperClasses()",
      "begin_line": 113,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 28)",
        "(line 116,col 9)-(line 116,col 42)",
        "(line 118,col 9)-(line 118,col 39)",
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 120,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SuperBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 123,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 124,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.SuperBase.getSuperBaseCaptor()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.CaptorAnnotationTest.SuperBase"
      ],
      "begin_line": 132,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 133,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.Base.getBaseCaptor()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sub",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.CaptorAnnotationTest.Base"
      ],
      "begin_line": 141,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 142,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationTest.Sub.getCaptor()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 13)-(line 146,col 24)"
      ]
    }
  ]
}