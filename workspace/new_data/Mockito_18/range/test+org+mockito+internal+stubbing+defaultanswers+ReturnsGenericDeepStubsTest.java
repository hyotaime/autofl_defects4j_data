{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/stubbing/defaultanswers/ReturnsGenericDeepStubsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsGenericDeepStubsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ListOfInteger",
      "is_interface": true,
      "parent_types": [
        "java.util.List\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "GenericsNest",
      "is_interface": true,
      "parent_types": [
        "java.util.Map\u003cK, java.util.Set\u003cjava.lang.Number\u003e\u003e"
      ],
      "begin_line": 22,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.GenericsNest.remove(java.lang.Object)",
      "begin_line": 23,
      "end_line": 23,
      "comment": " override with fixed ParameterizedType",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.GenericsNest.returningWildcard()",
      "begin_line": 24,
      "end_line": 24,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.GenericsNest.returningNonMockableNestedGeneric()",
      "begin_line": 25,
      "end_line": 25,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.GenericsNest.returningK()",
      "begin_line": 26,
      "end_line": 26,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.GenericsNest.paramTypeWithTypeParams()",
      "begin_line": 27,
      "end_line": 27,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.GenericsNest.twoTypeParams(S)",
      "begin_line": 28,
      "end_line": 28,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.GenericsNest.typeVarWithTypeParams()",
      "begin_line": 29,
      "end_line": 29,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.GenericsNest.returnsNormalType()",
      "begin_line": 30,
      "end_line": 30,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.generic_deep_mock_frenzy__look_at_these_chained_calls()",
      "begin_line": 33,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 76)",
        "(line 37,col 9)-(line 37,col 93)",
        "(line 38,col 9)-(line 38,col 116)",
        "(line 39,col 9)-(line 39,col 98)",
        "(line 41,col 9)-(line 41,col 76)",
        "(line 42,col 9)-(line 42,col 81)",
        "(line 44,col 9)-(line 44,col 73)",
        "(line 45,col 9)-(line 45,col 99)",
        "(line 46,col 9)-(line 46,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.can_create_mock_from_multiple_type_variable_bounds_when_return_type_of_parameterized_method_is_a_parameterizedtype_that_is_referencing_a_typevar_on_class()",
      "begin_line": 49,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 76)",
        "(line 53,col 9)-(line 54,col 54)",
        "(line 55,col 9)-(line 56,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.can_create_mock_from_multiple_type_variable_bounds_when_method_return_type_is_referencing_a_typevar_on_class()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 76)",
        "(line 63,col 9)-(line 63,col 67)",
        "(line 64,col 9)-(line 64,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.can_create_mock_from_multiple_type_variable_bounds_when_return_type_of_parameterized_method_is_a_typevar_that_is_referencing_a_typevar_on_class()",
      "begin_line": 67,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 76)",
        "(line 71,col 9)-(line 71,col 114)",
        "(line 72,col 9)-(line 72,col 120)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.can_create_mock_from_return_types_declared_with_a_bounded_wildcard()",
      "begin_line": 75,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 76)",
        "(line 79,col 9)-(line 79,col 65)",
        "(line 80,col 9)-(line 80,col 104)",
        "(line 81,col 9)-(line 81,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.can_still_work_with_raw_type_in_the_return_type()",
      "begin_line": 84,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 76)",
        "(line 88,col 9)-(line 88,col 79)",
        "(line 89,col 9)-(line 89,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.will_return_default_value_on_non_mockable_nested_generic()",
      "begin_line": 92,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 84)",
        "(line 95,col 9)-(line 95,col 84)",
        "(line 97,col 9)-(line 97,col 105)",
        "(line 98,col 9)-(line 98,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsGenericDeepStubsTest.as_expected_fail_with_a_CCE_on_callsite_when_erasure_takes_place_for_example___StringBuilder_is_subject_to_erasure()",
      "begin_line": 101,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 76)",
        "(line 106,col 9)-(line 107,col 76)"
      ]
    }
  ]
}