{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/ConcurrentModificationExceptionOnMultiThreadedVerificationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentModificationExceptionOnMultiThreadedVerificationTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 86,
      "comment": " Linux2.6.32-220.4.2.el6.x86_64 #1SMP Mon Feb 6 16:39:28EST 2012x86_64 x86_64 x86_64 GNU/Linux"
    },
    {
      "type": "field",
      "varNames": [
        "nThreads"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TIMES"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERVAL_MILLIS"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fixedThreadPool"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ConcurrentModificationExceptionOnMultiThreadedVerificationTest.setUp()",
      "begin_line": 35,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 45)",
        "(line 38,col 9)-(line 38,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ConcurrentModificationExceptionOnMultiThreadedVerificationTest.shouldSuccessfullyVerifyConcurrentInvocationsWithTimeout()",
      "begin_line": 41,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 37)",
        "(line 44,col 9)-(line 44,col 80)",
        "(line 46,col 9)-(line 46,col 22)",
        "(line 47,col 9)-(line 47,col 27)",
        "(line 49,col 9)-(line 49,col 99)",
        "(line 50,col 9)-(line 50,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ConcurrentModificationExceptionOnMultiThreadedVerificationTest.startInvocations()",
      "begin_line": 53,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TargetInvoker",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Callable\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 62,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "seq"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.bugs.ConcurrentModificationExceptionOnMultiThreadedVerificationTest.TargetInvoker.TargetInvoker(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ConcurrentModificationExceptionOnMultiThreadedVerificationTest.TargetInvoker.call()",
      "begin_line": 69,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 49)",
        "(line 71,col 13)-(line 75,col 13)",
        "(line 76,col 13)-(line 76,col 49)",
        "(line 77,col 13)-(line 77,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ITarget",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 82,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ConcurrentModificationExceptionOnMultiThreadedVerificationTest.ITarget.targetMethod(java.lang.String)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "",
      "child_ranges": []
    }
  ]
}