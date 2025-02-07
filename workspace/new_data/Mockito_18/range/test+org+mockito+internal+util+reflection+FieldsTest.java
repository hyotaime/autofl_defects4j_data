{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/util/reflection/FieldsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldsTest.fields_should_return_all_declared_fields_in_hierarchy()",
      "begin_line": 15,
      "end_line": 19,
      "comment": "",
      "child_ranges": [
        "(line 17,col 9)-(line 18,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldsTest.fields_should_return_declared_fields()",
      "begin_line": 21,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 23,col 9)-(line 24,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldsTest.can_filter_not_null_fields()",
      "begin_line": 27,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 30,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldsTest.can_get_values_of_instance_fields()",
      "begin_line": 33,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 36,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldsTest.can_get_list_of_InstanceField()",
      "begin_line": 40,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 51)",
        "(line 44,col 9)-(line 47,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldsTest.field(java.lang.String, java.lang.Object)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "someStaticInInterface"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ParentClass",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.FieldsTest.AnInterface"
      ],
      "begin_line": 59,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "static_a"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "HierarchyOfClasses",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.FieldsTest.ParentClass"
      ],
      "begin_line": 64,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "static_b"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "NullOrNotNullFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 69,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "static_b"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ValuedFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 75,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    }
  ]
}