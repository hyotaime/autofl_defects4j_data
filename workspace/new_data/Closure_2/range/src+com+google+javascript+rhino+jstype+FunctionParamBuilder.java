{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/FunctionParamBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionParamBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 155,
      "comment": "\n * A builder for the Rhino Node representing Function parameters.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.FunctionParamBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.addRequiredParams(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 62,
      "end_line": 71,
      "comment": "\n   * Add parameters of the given type to the end of the param list.\n   * @return False if this is called after optional params are added.\n   ",
      "child_ranges": [
        "(line 63,col 5)-(line 65,col 5)",
        "(line 67,col 5)-(line 69,col 5)",
        "(line 70,col 5)-(line 70,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.addOptionalParams(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 79,
      "end_line": 88,
      "comment": "\n   * Add optional parameters of the given type to the end of the param list.\n   * @param types Types for each optional parameter. The builder will make them\n   *     undefine-able.\n   * @return False if this is called after var args are added.\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 82,col 5)",
        "(line 84,col 5)-(line 86,col 5)",
        "(line 87,col 5)-(line 87,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.addVarArgs(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 94,
      "end_line": 109,
      "comment": "\n   * Add variable arguments to the end of the parameter list.\n   * @return False if this is called after var args are added.\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 97,col 5)",
        "(line 104,col 5)-(line 106,col 5)",
        "(line 107,col 5)-(line 107,col 40)",
        "(line 108,col 5)-(line 108,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.newParameterFromNode(com.google.javascript.rhino.Node)",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n   * Copies the parameter specification from the given node.\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 48)",
        "(line 116,col 5)-(line 116,col 39)",
        "(line 117,col 5)-(line 117,col 47)",
        "(line 118,col 5)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.newOptionalParameterFromNode(com.google.javascript.rhino.Node)",
      "begin_line": 125,
      "end_line": 131,
      "comment": "\n   * Copies the parameter specification from the given node,\n   * but makes sure it\u0027s optional.\n   ",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 44)",
        "(line 127,col 5)-(line 129,col 5)",
        "(line 130,col 5)-(line 130,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.newParameter(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 134,
      "end_line": 139,
      "comment": " Add a parameter to the list with the given type.",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 52)",
        "(line 136,col 5)-(line 136,col 30)",
        "(line 137,col 5)-(line 137,col 35)",
        "(line 138,col 5)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.build()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.hasOptionalOrVarArgs()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 41)",
        "(line 147,col 5)-(line 148,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionParamBuilder.hasVarArgs()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 41)",
        "(line 153,col 5)-(line 153,col 54)"
      ]
    }
  ]
}