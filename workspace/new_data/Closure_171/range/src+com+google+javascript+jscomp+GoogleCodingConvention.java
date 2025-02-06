{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/GoogleCodingConvention.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GoogleCodingConvention",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodingConventions.Proxy"
      ],
      "begin_line": 31,
      "end_line": 155,
      "comment": "\n * This describes the Google-specific JavaScript coding conventions.\n * Within Google, variable names are semantically significant.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OPTIONAL_ARG_PREFIX"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR_ARGS_NAME"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENUM_KEY_PATTERN"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.GoogleCodingConvention()",
      "begin_line": 43,
      "end_line": 45,
      "comment": " By default, decorate the ClosureCodingConvention. ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.GoogleCodingConvention(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 48,
      "end_line": 50,
      "comment": " Decorates a wrapped CodingConvention. ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.isConstant(java.lang.String)",
      "begin_line": 70,
      "end_line": 87,
      "comment": "\n   * {@inheritDoc}\n   *\n   * \u003cp\u003eThis enforces the Google const name convention, that the first character\n   * after the last $ must be an upper-case letter and all subsequent letters\n   * must be upper case. The name must be at least 2 characters long.\n   *\n   * \u003cp\u003eExamples:\n   * \u003cpre\u003e\n   *      aaa          Not constant - lower-case letters in the name\n   *      A            Not constant - too short\n   *      goog$A       Constant - letters after the $ are upper-case.\n   *      AA17         Constant - digits can appear after the first letter\n   *      goog$7A      Not constant - first character after the $ must be\n   *                   upper case.\n   *      $A           Constant - doesn\u0027t have to be anything in front of the $\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 74,col 5)",
        "(line 78,col 5)-(line 78,col 36)",
        "(line 79,col 5)-(line 84,col 5)",
        "(line 86,col 5)-(line 86,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.isConstantKey(java.lang.String)",
      "begin_line": 89,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 93,col 5)",
        "(line 96,col 5)-(line 96,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.isValidEnumKey(java.lang.String)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n   * {@inheritDoc}\n   *\n   * \u003cp\u003eThis enforces Google\u0027s convention about enum key names. They must match\n   * the regular expression {@code [A-Z0-9][A-Z0-9_]*}.\n   *\n   * \u003cp\u003eExamples:\n   * \u003cul\u003e\n   * \u003cli\u003eA\u003c/li\u003e\n   * \u003cli\u003e213\u003c/li\u003e\n   * \u003cli\u003eFOO_BAR\u003c/li\u003e\n   * \u003c/ul\u003e\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.isOptionalParameter(com.google.javascript.rhino.Node)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n   * {@inheritDoc}\n   *\n   * \u003cp\u003eIn Google code, parameter names beginning with {@code opt_} are\n   * treated as optional arguments.\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.isVarArgsParameter(com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.isExported(java.lang.String, boolean)",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\n   * {@inheritDoc}\n   *\n   * \u003cp\u003eIn Google code, any global name starting with an underscore is\n   * considered exported.\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 142,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleCodingConvention.isPrivate(java.lang.String)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n   * {@inheritDoc}\n   *\n   * \u003cp\u003eIn Google code, private names end with an underscore, and exported\n   * names are never considered private (see {@link #isExported}).\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 51)"
      ]
    }
  ]
}