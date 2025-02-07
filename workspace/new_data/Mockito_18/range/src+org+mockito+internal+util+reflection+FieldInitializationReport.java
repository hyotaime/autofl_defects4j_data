{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/reflection/FieldInitializationReport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldInitializationReport",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 57,
      "comment": "\n * Report on field initialization\n "
    },
    {
      "type": "field",
      "varNames": [
        "fieldInstance"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wasInitialized"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wasInitializedUsingConstructorArgs"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializationReport.FieldInitializationReport(java.lang.Object, boolean, boolean)",
      "begin_line": 16,
      "end_line": 20,
      "comment": "",
      "child_ranges": [
        "(line 17,col 9)-(line 17,col 43)",
        "(line 18,col 9)-(line 18,col 45)",
        "(line 19,col 9)-(line 19,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializationReport.fieldInstance()",
      "begin_line": 27,
      "end_line": 29,
      "comment": "\n     * Returns the actual field instance.\n     *\n     * @return the actual instance\n     ",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializationReport.fieldWasInitialized()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Indicate wether the field was created during the process or not.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if created, \u003ccode\u003efalse\u003c/code\u003e if the field did already hold an instance.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializationReport.fieldWasInitializedUsingContructorArgs()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Indicate wether the field was created using constructor args.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if field was created using constructor parameters.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializationReport.fieldClass()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Returns the class of the actual instance in the field.\n     *\n     * @return Class of the instance\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 71)"
      ]
    }
  ]
}