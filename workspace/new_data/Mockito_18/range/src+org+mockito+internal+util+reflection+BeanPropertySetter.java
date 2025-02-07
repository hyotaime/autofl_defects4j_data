{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/reflection/BeanPropertySetter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeanPropertySetter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 98,
      "comment": "\n * This utility class will call the setter of the property to inject a new value.\n "
    },
    {
      "type": "field",
      "varNames": [
        "SET_PREFIX"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportNoSetterFound"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetter.BeanPropertySetter(java.lang.Object, java.lang.reflect.Field, boolean)",
      "begin_line": 29,
      "end_line": 33,
      "comment": "\n     * New BeanPropertySetter\n     * @param target The target on which the setter must be invoked\n     * @param propertyField The field that should be accessed with the setter\n     * @param reportNoSetterFound Allow the set method to raise an Exception if the setter cannot be found\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 35)",
        "(line 31,col 9)-(line 31,col 29)",
        "(line 32,col 9)-(line 32,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetter.BeanPropertySetter(java.lang.Object, java.lang.reflect.Field)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * New BeanPropertySetter that don\u0027t report failure\n     * @param target The target on which the setter must be invoked\n     * @param propertyField The propertyField that must be accessed through a setter\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetter.set(java.lang.Object)",
      "begin_line": 51,
      "end_line": 75,
      "comment": "\n     * Set the value to the property represented by this {@link BeanPropertySetter}\n     * @param value the new value to pass to the property setter\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value has been injected, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     * @throws RuntimeException Can be thrown if the setter threw an exception, if the setter is not accessible\n     *          or, if \u003ccode\u003ereportNoSetterFound\u003c/code\u003e and setter could not be found.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 66)",
        "(line 54,col 9)-(line 54,col 34)",
        "(line 55,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetter.setterName(java.lang.String)",
      "begin_line": 85,
      "end_line": 90,
      "comment": "\n     * Retrieve the setter name from the field name.\n     *\n     * \u003cp\u003eImplementation is based on the code of {@link java.beans.Introspector}.\u003c/p\u003e\n     *\n     * @param fieldName the Field name\n     * @return Setter name.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 89,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.BeanPropertySetter.reportNoSetterFound()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)"
      ]
    }
  ]
}