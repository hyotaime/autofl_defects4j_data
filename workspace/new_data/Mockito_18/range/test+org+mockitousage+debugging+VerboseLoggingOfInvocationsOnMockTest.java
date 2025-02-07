{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/debugging/VerboseLoggingOfInvocationsOnMockTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerboseLoggingOfInvocationsOnMockTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 184,
      "comment": "\n * Tests the verbose logging of invocation on mock methods.\n * \n * BEWARE: These tests rely on mocking the standard output. While in a\n * single-threaded environment the Before/After-contract ensures, that the\n * original output stream is restored, there is no guarantee for this\n * in the parallel setting.\n * Maybe, the test class should be @Ignore\u0027d by default ...\n "
    },
    {
      "type": "field",
      "varNames": [
        "output"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "original"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unrelatedMock"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.setUp()",
      "begin_line": 41,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 30)",
        "(line 44,col 9)-(line 44,col 45)",
        "(line 45,col 9)-(line 45,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.tearDown()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.shouldNotPrintInvocationOnMockWithoutSetting()",
      "begin_line": 53,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 67)",
        "(line 59,col 9)-(line 59,col 40)",
        "(line 60,col 9)-(line 60,col 47)",
        "(line 63,col 9)-(line 66,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.shouldPrintUnstubbedInvocationOnMockToStdOut()",
      "begin_line": 69,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 67)",
        "(line 75,col 9)-(line 75,col 35)",
        "(line 78,col 9)-(line 82,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.shouldPrintStubbedInvocationOnMockToStdOut()",
      "begin_line": 85,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 67)",
        "(line 89,col 9)-(line 89,col 69)",
        "(line 92,col 9)-(line 92,col 40)",
        "(line 95,col 9)-(line 100,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.shouldPrintThrowingInvocationOnMockToStdOut()",
      "begin_line": 103,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 67)",
        "(line 107,col 9)-(line 107,col 76)",
        "(line 109,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.shouldPrintRealInvocationOnSpyToStdOut()",
      "begin_line": 124,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 128,col 78)",
        "(line 129,col 9)-(line 129,col 63)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 135,col 9)-(line 139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.usage()",
      "begin_line": 142,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 67)",
        "(line 146,col 9)-(line 147,col 27)",
        "(line 150,col 9)-(line 150,col 38)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.printed()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.mockName(java.lang.Object)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnrelatedClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 163,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.UnrelatedClass.unrelatedMethod(java.lang.String)",
      "begin_line": 164,
      "end_line": 165,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ThirdPartyException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * An exception that isn\u0027t defined by Mockito or the JDK and therefore does\n     * not appear in the logging result by chance alone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FooImpl",
      "is_interface": false,
      "parent_types": [
        "Foo"
      ],
      "begin_line": 176,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.FooImpl.giveMeSomeString(java.lang.String)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.debugging.VerboseLoggingOfInvocationsOnMockTest.FooImpl.doSomething(java.lang.String)",
      "begin_line": 181,
      "end_line": 182,
      "comment": "",
      "child_ranges": []
    }
  ]
}