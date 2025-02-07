{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/util/MockCreationValidatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockCreationValidatorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 20,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FinalClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.MockCreationValidatorTest.should_not_allow_extra_interface_that_is_the_same_as_the_mocked_type()",
      "begin_line": 26,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 35,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.MockCreationValidatorTest.should_not_allow_inconsistent_types()",
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.MockCreationValidatorTest.should_allow_only_consistent_types()",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.MockCreationValidatorTest.should_validation_be_safe_when_nulls_passed()",
      "begin_line": 52,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 60)",
        "(line 57,col 9)-(line 57,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.MockCreationValidatorTest.should_not_allow_serializable_with_Object_that_dont_implement_Serializable()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 74)",
        "(line 64,col 9)-(line 64,col 36)",
        "(line 65,col 9)-(line 65,col 118)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NonSerializableInnerClassThatHaveAHiddenOneArgConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.MockCreationValidatorTest.should_allow_serializable_with_interfaces_or_Serializable_objects()",
      "begin_line": 68,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 36)",
        "(line 71,col 9)-(line 71,col 69)",
        "(line 72,col 9)-(line 72,col 68)"
      ]
    }
  ]
}