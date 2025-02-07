{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/BridgeMethodsHitAgainTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BridgeMethodsHitAgainTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 18,
      "end_line": 47,
      "comment": "see issue 101"
    },
    {
      "type": "class_interface",
      "name": "Factory",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ExtendedFactory",
      "is_interface": true,
      "parent_types": [
        "org.mockitousage.bugs.BridgeMethodsHitAgainTest.Factory"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SomeInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.BridgeMethodsHitAgainTest.SomeInterface.factory()",
      "begin_line": 24,
      "end_line": 24,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "SomeSubInterface",
      "is_interface": true,
      "parent_types": [
        "org.mockitousage.bugs.BridgeMethodsHitAgainTest.SomeInterface"
      ],
      "begin_line": 27,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.BridgeMethodsHitAgainTest.SomeSubInterface.factory()",
      "begin_line": 28,
      "end_line": 28,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "someSubInterface"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extendedFactory"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.BridgeMethodsHitAgainTest.basicCheck()",
      "begin_line": 34,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 75)",
        "(line 37,col 5)-(line 37,col 40)",
        "(line 38,col 5)-(line 38,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.BridgeMethodsHitAgainTest.checkWithExtraCast()",
      "begin_line": 41,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 91)",
        "(line 44,col 5)-(line 44,col 40)",
        "(line 45,col 5)-(line 45,col 37)"
      ]
    }
  ]
}