{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/misuse/DetectingFinalMethodsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectingFinalMethodsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 15,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WithFinal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingFinalMethodsTest.WithFinal.foo()",
      "begin_line": 18,
      "end_line": 20,
      "comment": "",
      "child_ranges": [
        "(line 19,col 13)-(line 19,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "withFinal"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingFinalMethodsTest.shouldFailWithUnfinishedVerification()",
      "begin_line": 25,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 42)",
        "(line 28,col 9)-(line 28,col 32)",
        "(line 29,col 9)-(line 32,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.misuse.DetectingFinalMethodsTest.shouldFailWithUnfinishedStubbing()",
      "begin_line": 35,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 42)",
        "(line 39,col 9)-(line 42,col 55)"
      ]
    }
  ]
}