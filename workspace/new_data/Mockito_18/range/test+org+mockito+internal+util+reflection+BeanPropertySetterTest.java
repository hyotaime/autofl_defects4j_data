{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/util/reflection/BeanPropertySetterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeanPropertySetterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.use_the_correct_setter_on_the_target()",
      "begin_line": 20,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 43)",
        "(line 24,col 9)-(line 24,col 74)",
        "(line 25,col 9)-(line 25,col 46)",
        "(line 28,col 9)-(line 28,col 95)",
        "(line 31,col 9)-(line 31,col 29)",
        "(line 32,col 9)-(line 32,col 51)",
        "(line 33,col 9)-(line 33,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.use_the_setter_on_the_target_when_field_name_begins_by_at_least_2_caps()",
      "begin_line": 36,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 65)",
        "(line 40,col 9)-(line 40,col 70)",
        "(line 41,col 9)-(line 41,col 46)",
        "(line 44,col 9)-(line 44,col 95)",
        "(line 47,col 9)-(line 47,col 29)",
        "(line 48,col 9)-(line 48,col 51)",
        "(line 49,col 9)-(line 49,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.should_not_fail_if_bean_class_declares_only_the_setter_for_the_property()",
      "begin_line": 52,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 73)",
        "(line 56,col 9)-(line 56,col 74)",
        "(line 57,col 9)-(line 57,col 46)",
        "(line 60,col 9)-(line 60,col 95)",
        "(line 63,col 9)-(line 63,col 29)",
        "(line 64,col 9)-(line 64,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.should_fail_if_matching_setter_cannot_be_found_and_if_report_failure_is_true()",
      "begin_line": 67,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 97)",
        "(line 71,col 9)-(line 71,col 70)",
        "(line 72,col 9)-(line 72,col 46)",
        "(line 74,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.return_false_if_no_setter_was_found()",
      "begin_line": 84,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 69)",
        "(line 88,col 9)-(line 88,col 70)",
        "(line 89,col 9)-(line 89,col 46)",
        "(line 92,col 9)-(line 92,col 85)",
        "(line 95,col 9)-(line 95,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.return_false_if_no_setter_was_found_and_if_reportNoSetterFound_is_false()",
      "begin_line": 98,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 97)",
        "(line 102,col 9)-(line 102,col 70)",
        "(line 103,col 9)-(line 103,col 46)",
        "(line 106,col 9)-(line 106,col 92)",
        "(line 109,col 9)-(line 109,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SomeBean",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 112,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theField"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theFieldSetterWasUsed"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.SomeBean.setTheField(java.io.File)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 41)",
        "(line 118,col 13)-(line 118,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.SomeBean.getTheField()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SomeBeanWithJustASetter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 126,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theField"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theFieldSetterWasUsed"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.SomeBeanWithJustASetter.setTheField(java.io.File)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 41)",
        "(line 132,col 13)-(line 132,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SomeBeanWithJustAGetter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 135,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theField"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.SomeBeanWithJustAGetter.getTheField()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SomeBeanWithNoSetterMatchingFieldType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 143,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theField"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theFieldSetterWasUsed"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.SomeBeanWithNoSetterMatchingFieldType.setTheField(java.io.FileOutputStream)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BeanWithWeirdFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 152,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UUID"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theFieldSetterWasUSed"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetterTest.BeanWithWeirdFields.setUUID(java.util.UUID)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 41)",
        "(line 158,col 13)-(line 158,col 29)"
      ]
    }
  ]
}