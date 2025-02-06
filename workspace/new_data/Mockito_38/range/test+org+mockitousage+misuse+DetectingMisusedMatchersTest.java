{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/misuse/DetectingMisusedMatchersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectingMisusedMatchersTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 18,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WithFinal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 20,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.WithFinal.finalMethod(java.lang.Object)",
      "begin_line": 21,
      "end_line": 23,
      "comment": "",
      "child_ranges": [
        "(line 22,col 13)-(line 22,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "withFinal"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.resetState()",
      "begin_line": 28,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.misplacedArgumentMatcher()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.shouldFailFastWhenArgumentMatchersAbused()",
      "begin_line": 37,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 35)",
        "(line 40,col 9)-(line 45,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.shouldSayUnfinishedVerificationButNotInvalidUseOfMatchers()",
      "begin_line": 48,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 51)",
        "(line 51,col 9)-(line 54,col 54)"
      ]
    }
  ]
}