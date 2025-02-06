{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/misuse/InvalidUsageTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvalidUsageTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 18,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockTwo"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.resetState()",
      "begin_line": 23,
      "end_line": 26,
      "comment": "",
      "child_ranges": [
        "(line 25,col 9)-(line 25,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldRequireArgumentsWhenVerifyingNoMoreInteractions()",
      "begin_line": 28,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldRequireArgumentsWhenVerifyingZeroInteractions()",
      "begin_line": 33,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotCreateInOrderObjectWithoutMocks()",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowVerifyingInOrderUnfamilarMocks()",
      "begin_line": 43,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 40)",
        "(line 46,col 9)-(line 46,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldReportMissingMethodInvocationWhenStubbing()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 107)",
        "(line 52,col 9)-(line 52,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowSettingInvalidCheckedException()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowSettingNullThrowable()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowSettingNullThrowableVararg()",
      "begin_line": 65,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowSettingNullConsecutiveThrowable()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FinalClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowMockingFinalClasses()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowMockingPrimitves()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectLikeInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 88,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.ObjectLikeInterface.equals(java.lang.Object)",
      "begin_line": 89,
      "end_line": 89,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.ObjectLikeInterface.toString()",
      "begin_line": 90,
      "end_line": 90,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.ObjectLikeInterface.hashCode()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotMockObjectMethodsOnInterface()",
      "begin_line": 94,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 68)",
        "(line 98,col 9)-(line 98,col 27)",
        "(line 99,col 9)-(line 99,col 25)",
        "(line 100,col 9)-(line 100,col 25)",
        "(line 102,col 9)-(line 102,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotMockObjectMethodsOnClass()",
      "begin_line": 105,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 55)",
        "(line 108,col 9)-(line 108,col 27)",
        "(line 109,col 9)-(line 109,col 25)",
        "(line 110,col 9)-(line 110,col 25)",
        "(line 112,col 9)-(line 112,col 38)"
      ]
    }
  ]
}