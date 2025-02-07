{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/annotation/MockInjectionUsingConstructorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockInjectionUsingConstructorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockUtil"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calculator"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "database"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "articleManager"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spiedArticleManager"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.shouldNotFailWhenNotInitialized()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.innerMockShouldRaiseAnExceptionThatChangesOuterMockBehavior()",
      "begin_line": 49,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 88)",
        "(line 53,col 9)-(line 53,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.mockJustWorks()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.constructor_is_called_for_each_test_in_test_class()",
      "begin_line": 61,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 46)",
        "(line 65,col 9)-(line 65,col 60)",
        "(line 68,col 9)-(line 68,col 61)",
        "(line 71,col 9)-(line 71,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.objects_created_with_constructor_initialization_can_be_spied()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 53)",
        "(line 77,col 9)-(line 77,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.should_report_failure_only_when_object_initialization_throws_exception()",
      "begin_line": 80,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "junit_test_with_3_tests_methods",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 93,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructor_instantiation"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "some_collaborator"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "should_be_initialized_3_times"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.junit_test_with_3_tests_methods.test_1()",
      "begin_line": 100,
      "end_line": 100,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.junit_test_with_3_tests_methods.test_2()",
      "begin_line": 101,
      "end_line": 101,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.junit_test_with_3_tests_methods.test_3()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "some_class_with_parametered_constructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 104,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.junit_test_with_3_tests_methods.some_class_with_parametered_constructor.some_class_with_parametered_constructor(java.util.List)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 17)-(line 106,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FailingConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 111,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.MockInjectionUsingConstructorTest.FailingConstructor.FailingConstructor(java.util.Set)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ATest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 117,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "set"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "failingConstructor"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    }
  ]
}