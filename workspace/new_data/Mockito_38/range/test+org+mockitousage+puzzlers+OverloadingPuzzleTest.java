{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/puzzlers/OverloadingPuzzleTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OverloadingPuzzleTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 13,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.puzzlers.OverloadingPuzzleTest.setMockWithDowncast(org.mockitousage.puzzlers.OverloadingPuzzleTest.Super)",
      "begin_line": 17,
      "end_line": 19,
      "comment": "",
      "child_ranges": [
        "(line 18,col 9)-(line 18,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Super",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.puzzlers.OverloadingPuzzleTest.Super.say(java.lang.Object)",
      "begin_line": 22,
      "end_line": 22,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Sub",
      "is_interface": true,
      "parent_types": [
        "org.mockitousage.puzzlers.OverloadingPuzzleTest.Super"
      ],
      "begin_line": 25,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.puzzlers.OverloadingPuzzleTest.Sub.say(java.lang.String)",
      "begin_line": 26,
      "end_line": 26,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.puzzlers.OverloadingPuzzleTest.say(java.lang.Object)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.puzzlers.OverloadingPuzzleTest.shouldUseArgumentTypeWhenOverloadingPuzzleDetected()",
      "begin_line": 33,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 34)",
        "(line 36,col 9)-(line 36,col 33)",
        "(line 37,col 9)-(line 37,col 21)",
        "(line 38,col 9)-(line 41,col 42)"
      ]
    }
  ]
}