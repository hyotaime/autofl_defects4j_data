{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/reflection/Fields.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 130,
      "comment": "\n * Small fluent reflection tools to work with fields.\n *\n * Code is very new and might need rework.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.allDeclaredFieldsOf(java.lang.Object)",
      "begin_line": 29,
      "end_line": 35,
      "comment": "\n     * Instance fields declared in the class and superclasses of the given instance.\n     *\n     * @param instance Instance from which declared fields will be retrieved.\n     * @return InstanceFields of this object instance.\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 76)",
        "(line 31,col 9)-(line 33,col 9)",
        "(line 34,col 9)-(line 34,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.declaredFieldsOf(java.lang.Object)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "\n     * Instance fields declared in the class of the given instance.\n     *\n     * @param instance Instance from which declared fields will be retrieved.\n     * @return InstanceFields of this object instance.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 76)",
        "(line 45,col 9)-(line 45,col 99)",
        "(line 46,col 9)-(line 46,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.instanceFieldsIn(java.lang.Object, java.lang.reflect.Field[])",
      "begin_line": 49,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 84)",
        "(line 51,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.annotatedBy(java.lang.Class\u003c? extends java.lang.annotation.Annotation\u003e...)",
      "begin_line": 64,
      "end_line": 77,
      "comment": "\n     * Accept fields annotated by the given annotations.\n     *\n     * @param annotations Annotation types to check.\n     * @return The filter.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 76,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.Anonymous-5d6158ae-7b73-4dda-ace1-a42d186cb85a.isOut(org.mockito.internal.util.reflection.InstanceField)",
      "begin_line": 66,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 67,col 17)-(line 67,col 90)",
        "(line 69,col 17)-(line 73,col 17)",
        "(line 74,col 17)-(line 74,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.nullField()",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * Accept fields with non null value.\n     *\n     * @return The filter.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 89,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.Anonymous-02effa61-de15-4116-9bba-a8f1f5c620c3.isOut(org.mockito.internal.util.reflection.InstanceField)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 17)-(line 87,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InstanceFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 92,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceFields"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.Fields.InstanceFields.InstanceFields(java.lang.Object, java.util.List\u003corg.mockito.internal.util.reflection.InstanceField\u003e)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 37)",
        "(line 99,col 13)-(line 99,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.InstanceFields.filter(org.mockito.internal.util.collections.ListUtil.Filter\u003corg.mockito.internal.util.reflection.InstanceField\u003e)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.InstanceFields.notNull()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.InstanceFields.instanceFields()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.InstanceFields.assignedValues()",
      "begin_line": 114,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 79)",
        "(line 116,col 13)-(line 118,col 13)",
        "(line 119,col 13)-(line 119,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.Fields.InstanceFields.names()",
      "begin_line": 122,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 83)",
        "(line 124,col 13)-(line 126,col 13)",
        "(line 127,col 13)-(line 127,col 30)"
      ]
    }
  ]
}