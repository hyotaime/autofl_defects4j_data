{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/Primitives.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Primitives",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIMITIVE_TYPES"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIMITIVE_OR_WRAPPER_DEFAULT_VALUES"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.Primitives.primitiveTypeOf(java.lang.Class\u003cT\u003e)",
      "begin_line": 28,
      "end_line": 33,
      "comment": "\n     * Returns the primitive type of the given class.\n     * \u003cp/\u003e\n     * The passed class can be any class : \u003ccode\u003eboolean.class\u003c/code\u003e, \u003ccode\u003eInteger.class\u003c/code\u003e\n     * in witch case this method will return \u003ccode\u003eboolean.class\u003c/code\u003e, even \u003ccode\u003eSomeObject.class\u003c/code\u003e\n     * in which case \u003ccode\u003enull\u003c/code\u003e will be returned.\n     *\n     * @param clazz The class from which primitive type has to be retrieved\n     * @param \u003cT\u003e   The type\n     * @return The primitive type if relevant, otherwise \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 29,col 9)-(line 31,col 9)",
        "(line 32,col 9)-(line 32,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.Primitives.isPrimitiveOrWrapper(java.lang.Class\u003c?\u003e)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Indicates if the given class is primitive type or a primitive wrapper.\n     *\n     * @param type The type to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if primitive or wrapper, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.Primitives.defaultValueForPrimitiveOrWrapper(java.lang.Class\u003cT\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Returns the boxed default value for a primitive or a primitive wrapper.\n     *\n     * @param primitiveOrWrapperType The type to lookup the default value\n     * @return The boxed default values as defined in Java Language Specification,\n     *         \u003ccode\u003enull\u003c/code\u003e if the type is neither a primitive nor a wrapper\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 83)"
      ]
    }
  ]
}