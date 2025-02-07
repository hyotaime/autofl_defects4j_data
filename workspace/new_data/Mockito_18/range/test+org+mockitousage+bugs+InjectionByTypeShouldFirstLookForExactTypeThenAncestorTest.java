{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/InjectionByTypeShouldFirstLookForExactTypeThenAncestorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InjectionByTypeShouldFirstLookForExactTypeThenAncestorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 19,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REFERENCE"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockedBean"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "illegalInjectionExample"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reversedOrderService"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withNullObjectField"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InjectionByTypeShouldFirstLookForExactTypeThenAncestorTest.just_for_information_fields_are_read_in_declaration_order_see_Service()",
      "begin_line": 30,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 67)",
        "(line 34,col 9)-(line 34,col 75)",
        "(line 35,col 9)-(line 35,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InjectionByTypeShouldFirstLookForExactTypeThenAncestorTest.mock_should_be_injected_once_and_in_the_best_matching_type()",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 77)",
        "(line 41,col 9)-(line 41,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InjectionByTypeShouldFirstLookForExactTypeThenAncestorTest.should_match_be_consistent_regardless_of_order()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 74)",
        "(line 47,col 9)-(line 47,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InjectionByTypeShouldFirstLookForExactTypeThenAncestorTest.should_inject_the_mock_only_once_and_in_the_correct_type()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 51)",
        "(line 53,col 9)-(line 53,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bean",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Service",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockShouldNotGoInHere"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockShouldGoInHere"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ServiceWithReversedOrder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockShouldGoInHere"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockShouldNotGoInHere"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WithNullObjectField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 68,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injectMePlease"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keepMeNull"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    }
  ]
}