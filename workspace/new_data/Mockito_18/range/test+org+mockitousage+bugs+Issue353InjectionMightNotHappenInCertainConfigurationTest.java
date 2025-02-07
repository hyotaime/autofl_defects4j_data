{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/Issue353InjectionMightNotHappenInCertainConfigurationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Issue353InjectionMightNotHappenInCertainConfigurationTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringString_that_matches_field"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockStringInteger_was_not_injected"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fooService"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.Issue353InjectionMightNotHappenInCertainConfigurationTest.when_identical_types_and_the_correct_mock_name_is_greater_than_the_non_matching_name_then_injection_occurs_only_on_the_named_one()",
      "begin_line": 22,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 128)",
        "(line 26,col 9)-(line 26,col 96)",
        "(line 27,col 9)-(line 27,col 87)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FooService",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringInteger_field"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringString_that_matches_field"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    }
  ]
}