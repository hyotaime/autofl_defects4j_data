{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/ShouldNotTryToInjectInFinalOrStaticFieldsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShouldNotTryToInjectInFinalOrStaticFieldsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 47,
      "comment": " issue 262"
    },
    {
      "type": "class_interface",
      "name": "ExampleService",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANTS"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aSet"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unrelatedList"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unrelatedSet"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exampleService"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ShouldNotTryToInjectInFinalOrStaticFieldsTest.dont_fail_with_CONSTANTS()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ShouldNotTryToInjectInFinalOrStaticFieldsTest.dont_inject_in_final()",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 57)"
      ]
    }
  ]
}