{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/ShouldNotDeadlockAnswerExecutionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShouldNotDeadlockAnswerExecutionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 19,
      "end_line": 119,
      "comment": "see bug 190"
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ShouldNotDeadlockAnswerExecutionTest.failIfMockIsSharedBetweenThreads()",
      "begin_line": 21,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 54)",
        "(line 24,col 9)-(line 24,col 66)",
        "(line 25,col 9)-(line 25,col 53)",
        "(line 29,col 9)-(line 29,col 86)",
        "(line 33,col 9)-(line 33,col 52)",
        "(line 34,col 9)-(line 34,col 52)",
        "(line 38,col 9)-(line 38,col 27)",
        "(line 40,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ShouldNotDeadlockAnswerExecutionTest.successIfEveryThreadHasItsOwnMock()",
      "begin_line": 46,
      "end_line": 47,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "LockingAnswer",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.String\u003e"
      ],
      "begin_line": 76,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.bugs.ShouldNotDeadlockAnswerExecutionTest.LockingAnswer.LockingAnswer(java.util.concurrent.atomic.AtomicInteger)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ShouldNotDeadlockAnswerExecutionTest.LockingAnswer.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 87,
      "end_line": 95,
      "comment": "\n         * Decrement counter and wait until counter has value 0\n         ",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 38)",
        "(line 90,col 13)-(line 92,col 13)",
        "(line 94,col 13)-(line 94,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ServiceRunner",
      "is_interface": false,
      "parent_types": [
        "java.lang.Runnable"
      ],
      "begin_line": 99,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "service"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.bugs.ShouldNotDeadlockAnswerExecutionTest.ServiceRunner.ServiceRunner(org.mockitousage.bugs.ShouldNotDeadlockAnswerExecutionTest.Service)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ShouldNotDeadlockAnswerExecutionTest.ServiceRunner.run()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Service",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 113,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ShouldNotDeadlockAnswerExecutionTest.Service.verySlowMethod()",
      "begin_line": 115,
      "end_line": 115,
      "comment": "",
      "child_ranges": []
    }
  ]
}