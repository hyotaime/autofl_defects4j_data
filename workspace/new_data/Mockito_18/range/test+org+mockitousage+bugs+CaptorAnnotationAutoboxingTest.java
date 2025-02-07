{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/CaptorAnnotationAutoboxingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CaptorAnnotationAutoboxingTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 17,
      "end_line": 43,
      "comment": "see issue 188"
    },
    {
      "type": "class_interface",
      "name": "Fun",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 19,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CaptorAnnotationAutoboxingTest.Fun.doFun(double)",
      "begin_line": 20,
      "end_line": 20,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CaptorAnnotationAutoboxingTest.Fun.moreFun(int)",
      "begin_line": 21,
      "end_line": 21,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "fun"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "captor"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CaptorAnnotationAutoboxingTest.shouldAutoboxSafely()",
      "begin_line": 27,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 23)",
        "(line 33,col 9)-(line 33,col 44)",
        "(line 34,col 9)-(line 34,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "intCaptor"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CaptorAnnotationAutoboxingTest.shouldAutoboxAllPrimitives()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 58)"
      ]
    }
  ]
}