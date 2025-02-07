{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/misuse/DetectingMisusedMatchersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectingMisusedMatchersTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 22,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WithFinal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.WithFinal.finalMethod(java.lang.Object)",
      "begin_line": 25,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 26,col 13)-(line 26,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "withFinal"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.resetState()",
      "begin_line": 32,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.misplaced_anyObject_argument_matcher()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.misplaced_anyInt_argument_matcher()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.misplaced_anyBoolean_argument_matcher()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.should_fail_fast_when_argument_matchers_are_abused()",
      "begin_line": 49,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 47)",
        "(line 52,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.should_report_argument_locations_when_argument_matchers_misused()",
      "begin_line": 60,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingMisusedMatchersTest.shouldSayUnfinishedVerificationButNotInvalidUseOfMatchers()",
      "begin_line": 81,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 87,col 54)"
      ]
    }
  ]
}