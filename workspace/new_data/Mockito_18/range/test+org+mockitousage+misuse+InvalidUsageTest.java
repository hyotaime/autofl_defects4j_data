{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/misuse/InvalidUsageTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvalidUsageTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 19,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockTwo"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.resetState()",
      "begin_line": 24,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldRequireArgumentsWhenVerifyingNoMoreInteractions()",
      "begin_line": 29,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldRequireArgumentsWhenVerifyingZeroInteractions()",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotCreateInOrderObjectWithoutMocks()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowVerifyingInOrderUnfamilarMocks()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 40)",
        "(line 47,col 9)-(line 47,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldReportMissingMethodInvocationWhenStubbing()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 107)",
        "(line 53,col 9)-(line 53,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowSettingInvalidCheckedException()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowSettingNullThrowable()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowSettingNullThrowableVararg()",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowSettingNullConsecutiveThrowable()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FinalClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowMockingFinalClasses()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotAllowMockingPrimitves()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectLikeInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 89,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.ObjectLikeInterface.equals(java.lang.Object)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.ObjectLikeInterface.toString()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.ObjectLikeInterface.hashCode()",
      "begin_line": 92,
      "end_line": 92,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotMockObjectMethodsOnInterface()",
      "begin_line": 95,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 68)",
        "(line 99,col 9)-(line 99,col 27)",
        "(line 100,col 9)-(line 100,col 25)",
        "(line 101,col 9)-(line 101,col 25)",
        "(line 103,col 9)-(line 103,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.InvalidUsageTest.shouldNotMockObjectMethodsOnClass()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 55)",
        "(line 109,col 9)-(line 109,col 27)",
        "(line 110,col 9)-(line 110,col 25)",
        "(line 111,col 9)-(line 111,col 25)",
        "(line 113,col 9)-(line 113,col 38)"
      ]
    }
  ]
}