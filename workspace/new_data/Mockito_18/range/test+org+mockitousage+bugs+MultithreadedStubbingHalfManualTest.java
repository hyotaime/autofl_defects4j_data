{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/MultithreadedStubbingHalfManualTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultithreadedStubbingHalfManualTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ToMock",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 31,
      "comment": "\n     * Class with two methods, one of them is repeatedly mocked while another is repeatedly called.\n     "
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.MultithreadedStubbingHalfManualTest.ToMock.getValue(java.lang.Integer)",
      "begin_line": 28,
      "end_line": 28,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.MultithreadedStubbingHalfManualTest.ToMock.getValues(java.lang.Integer)",
      "begin_line": 30,
      "end_line": 30,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "executor"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Thread pool for concurrent invocations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "exceptions"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.MultithreadedStubbingHalfManualTest.setUp()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.MultithreadedStubbingHalfManualTest.getConflictingRunnable(org.mockitousage.bugs.MultithreadedStubbingHalfManualTest.ToMock)",
      "begin_line": 51,
      "end_line": 65,
      "comment": "\n     * The returned runnable simply calls ToMock.getValues(int).\n     *\n     * @param toMock The mocked object\n     * @return The runnable.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 64,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.MultithreadedStubbingHalfManualTest.Anonymous-69cdf46e-6b87-4888-9d59-8fb248935bec.run()",
      "begin_line": 53,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 54,col 17)-(line 62,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.MultithreadedStubbingHalfManualTest.tryToRevealTheProblem()",
      "begin_line": 67,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)",
        "(line 73,col 9)-(line 95,col 9)"
      ]
    }
  ]
}