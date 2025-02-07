{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/reflection/InstanceField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstanceField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 124,
      "comment": "\n * Represents an accessible instance field.\n *\n * Contains the instance reference on which the field can be read adn write.\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldReader"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.InstanceField.InstanceField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 29,
      "end_line": 32,
      "comment": "\n     * Create a new InstanceField.\n     *\n     * @param field The field that should be accessed, note that no checks are performed to ensure\n     *              the field belong to this instance class.\n     * @param instance The instance from which the field shall be accessed.\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 57)",
        "(line 31,col 9)-(line 31,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.read()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Safely read the field.\n     *\n     * @return the field value.\n     * @see FieldReader\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.set(java.lang.Object)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Set the given value to the field of this instance.\n     *\n     * @param value The value that should be written to the field.\n     * @see FieldSetter\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.isNull()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Check that the field is not null.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e, else \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.isAnnotatedBy(java.lang.Class\u003c? extends java.lang.annotation.Annotation\u003e)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Check if the field is annotated by the given annotation.\n     *\n     * @param annotationClass The annotation type to check.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the field is annotated by this annotation, else \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.annotation(java.lang.Class\u003cA\u003e)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns the annotation instance for the given annotation type.\n     *\n     * @param annotationClass Tha annotation type to retrieve.\n     * @param \u003cA\u003e Type of the annotation.\n     * @return The annotation instance.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.jdkField()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns the JDK {@link Field} instance.\n     *\n     * @return The actual {@link Field} instance.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.reader()",
      "begin_line": 93,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.name()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Returns the name of the field.\n     *\n     * @return Name of the field.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.equals(java.lang.Object)",
      "begin_line": 109,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 66)",
        "(line 114,col 9)-(line 114,col 47)",
        "(line 115,col 9)-(line 115,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.InstanceField.hashCode()",
      "begin_line": 118,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 38)",
        "(line 121,col 9)-(line 121,col 51)",
        "(line 122,col 9)-(line 122,col 22)"
      ]
    }
  ]
}