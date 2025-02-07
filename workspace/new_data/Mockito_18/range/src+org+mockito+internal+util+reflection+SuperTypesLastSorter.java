{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/reflection/SuperTypesLastSorter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SuperTypesLastSorter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 19,
      "end_line": 64,
      "comment": "\n * Sort fields in an order suitable for injection, by name with superclasses\n * moved after their subclasses.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorter.sort(java.util.Collection\u003c? extends java.lang.reflect.Field\u003e)",
      "begin_line": 25,
      "end_line": 54,
      "comment": "\n     * Return a new collection with the fields sorted first by name,\n     * then with any fields moved after their supertypes.\n     ",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 66)",
        "(line 29,col 9)-(line 29,col 54)",
        "(line 31,col 9)-(line 31,col 18)",
        "(line 33,col 9)-(line 51,col 9)",
        "(line 53,col 9)-(line 53,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "compareFieldsByName"
      ],
      "begin_line": 57,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.SuperTypesLastSorter.Anonymous-b05accb0-1e6c-46ec-b3e0-652064238040.compare(java.lang.reflect.Field, java.lang.reflect.Field)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 56)"
      ]
    }
  ]
}