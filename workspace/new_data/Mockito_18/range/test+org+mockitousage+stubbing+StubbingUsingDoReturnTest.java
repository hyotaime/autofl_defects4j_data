{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/stubbing/StubbingUsingDoReturnTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StubbingUsingDoReturnTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 25,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.resetState()",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldStub()",
      "begin_line": 34,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 50)",
        "(line 37,col 9)-(line 37,col 50)",
        "(line 39,col 9)-(line 39,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldStubWithArgs()",
      "begin_line": 42,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 55)",
        "(line 45,col 9)-(line 45,col 69)",
        "(line 47,col 9)-(line 47,col 54)",
        "(line 48,col 9)-(line 48,col 59)",
        "(line 49,col 9)-(line 49,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FooRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldStubWithThrowable()",
      "begin_line": 54,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 67)",
        "(line 57,col 9)-(line 60,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldAllowSettingValidCheckedException()",
      "begin_line": 63,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 67)",
        "(line 67,col 9)-(line 70,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FooCheckedException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldDetectInvalidCheckedException()",
      "begin_line": 75,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldScreamWhenReturnSetForVoid()",
      "begin_line": 85,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldScreamWhenNotAMockPassed()",
      "begin_line": 96,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldScreamWhenNullPassed()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldAllowChainedStubbing()",
      "begin_line": 116,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 121,col 35)",
        "(line 123,col 9)-(line 123,col 49)",
        "(line 124,col 9)-(line 127,col 39)",
        "(line 129,col 9)-(line 129,col 49)",
        "(line 130,col 9)-(line 130,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldAllowDoCallRealMethodInChainedStubbing()",
      "begin_line": 133,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 54)",
        "(line 136,col 9)-(line 137,col 46)",
        "(line 139,col 9)-(line 139,col 50)",
        "(line 140,col 9)-(line 140,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldAllowChainedStubbingWithExceptionClass()",
      "begin_line": 143,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 95)",
        "(line 147,col 9)-(line 147,col 54)",
        "(line 148,col 9)-(line 148,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldAllowChainedStubbingOnVoidMethods()",
      "begin_line": 151,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 156,col 33)",
        "(line 158,col 9)-(line 158,col 26)",
        "(line 159,col 9)-(line 159,col 26)",
        "(line 160,col 9)-(line 163,col 39)",
        "(line 164,col 9)-(line 167,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldStubWithGenericAnswer()",
      "begin_line": 170,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 177,col 35)",
        "(line 179,col 9)-(line 179,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.Anonymous-000ae016-05fc-486f-8143-e2c43e28d156.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 17)-(line 174,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldNotAllowDoNothingOnNonVoids()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldStubbingBeTreatedAsInteraction()",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 50)",
        "(line 195,col 9)-(line 195,col 28)",
        "(line 196,col 9)-(line 199,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldVerifyStubbedCall()",
      "begin_line": 202,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 50)",
        "(line 205,col 9)-(line 205,col 28)",
        "(line 206,col 9)-(line 206,col 28)",
        "(line 208,col 9)-(line 208,col 46)",
        "(line 209,col 9)-(line 209,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldAllowStubbingToString()",
      "begin_line": 212,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 47)",
        "(line 215,col 9)-(line 215,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldDetectInvalidReturnType()",
      "begin_line": 218,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldDetectWhenNullAssignedToBoolean()",
      "begin_line": 231,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingUsingDoReturnTest.shouldAllowStubbingWhenTypesMatchSignature()",
      "begin_line": 241,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 65)",
        "(line 244,col 9)-(line 244,col 50)",
        "(line 245,col 9)-(line 245,col 52)",
        "(line 246,col 9)-(line 246,col 65)"
      ]
    }
  ]
}