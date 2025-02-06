{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/misuse/DetectingFinalMethodsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectingFinalMethodsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 14,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WithFinal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingFinalMethodsTest.WithFinal.foo()",
      "begin_line": 17,
      "end_line": 19,
      "comment": "",
      "child_ranges": [
        "(line 18,col 13)-(line 18,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "withFinal"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingFinalMethodsTest.shouldFailWithUnfinishedVerification()",
      "begin_line": 24,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 42)",
        "(line 27,col 9)-(line 27,col 32)",
        "(line 28,col 9)-(line 31,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingFinalMethodsTest.shouldFailWithUnfinishedStubbing()",
      "begin_line": 34,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 42)",
        "(line 37,col 9)-(line 40,col 55)"
      ]
    }
  ]
}