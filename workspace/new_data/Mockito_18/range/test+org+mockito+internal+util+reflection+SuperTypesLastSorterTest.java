{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/util/reflection/SuperTypesLastSorterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SuperTypesLastSorterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cmp"
      ],
      "begin_line": 24,
      "end_line": 40,
      "comment": "\n     * A Comparator that behaves like the old one, so the existing tests\n     * continue to work.\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.Anonymous-109bda7d-3444-416e-a308-777c31c9fed5.compare(java.lang.reflect.Field, java.lang.reflect.Field)",
      "begin_line": 26,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 28,col 13)-(line 30,col 13)",
        "(line 32,col 13)-(line 32,col 83)",
        "(line 34,col 13)-(line 38,col 13)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "objectA"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "objectB"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numberA"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numberB"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "integerA"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "integerB"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableA"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xNumber"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "yIterable"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zInteger"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.when_same_type_the_order_is_based_on_field_name()",
      "begin_line": 58,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 82)",
        "(line 61,col 9)-(line 61,col 81)",
        "(line 62,col 9)-(line 62,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.when_type_is_different_the_supertype_comes_last()",
      "begin_line": 65,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 82)",
        "(line 68,col 9)-(line 68,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.using_Collections_dot_sort()",
      "begin_line": 71,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 80,col 10)",
        "(line 82,col 9)-(line 82,col 83)",
        "(line 84,col 9)-(line 91,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.issue_352_order_was_different_between_JDK6_and_JDK7()",
      "begin_line": 95,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 100,col 10)",
        "(line 102,col 9)-(line 102,col 46)",
        "(line 104,col 9)-(line 107,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.fields_sort_consistently_when_interfaces_are_included()",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.fields_sort_consistently_when_names_and_type_indicate_different_order()",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.assertSortConsistently(java.lang.reflect.Field, java.lang.reflect.Field, java.lang.reflect.Field)",
      "begin_line": 126,
      "end_line": 144,
      "comment": "\n     * Assert that these fields sort in the same order no matter which order\n     * they start in.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 135,col 10)",
        "(line 137,col 9)-(line 137,col 62)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorterTest.field(java.lang.String)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 50)"
      ]
    }
  ]
}