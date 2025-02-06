{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/FunctionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 165,
      "comment": "\n * A builder class for function and arrow types.\n *\n * If you need to build an interface constructor,\n * use {@link JSTypeRegistry#createInterfaceType}.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceNode"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parametersNode"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnType"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeOfThis"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateTypeMap"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inferredReturnType"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isConstructor"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isNativeType"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.FunctionBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withName(java.lang.String)",
      "begin_line": 70,
      "end_line": 73,
      "comment": " Set the name of the function type. ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 21)",
        "(line 72,col 5)-(line 72,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withSourceNode(com.google.javascript.rhino.Node)",
      "begin_line": 76,
      "end_line": 79,
      "comment": " Set the source node of the function type. ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 33)",
        "(line 78,col 5)-(line 78,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withParams(com.google.javascript.rhino.jstype.FunctionParamBuilder)",
      "begin_line": 82,
      "end_line": 85,
      "comment": " Set the parameters of the function type from a FunctionParamBuilder. ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 41)",
        "(line 84,col 5)-(line 84,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withParamsNode(com.google.javascript.rhino.Node)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n   * Set the parameters of the function type with a specially-formatted node.\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 41)",
        "(line 92,col 5)-(line 92,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withReturnType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 96,
      "end_line": 99,
      "comment": " Set the return type. ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 33)",
        "(line 98,col 5)-(line 98,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withReturnType(com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 102,
      "end_line": 106,
      "comment": " Set the return type and whether it\u0027s inferred. ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 33)",
        "(line 104,col 5)-(line 104,col 39)",
        "(line 105,col 5)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withInferredReturnType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 109,
      "end_line": 113,
      "comment": " Sets an inferred return type. ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 33)",
        "(line 111,col 5)-(line 111,col 35)",
        "(line 112,col 5)-(line 112,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withTypeOfThis(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 116,
      "end_line": 119,
      "comment": " Set the \"this\" type. ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 33)",
        "(line 118,col 5)-(line 118,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.withTemplateKeys(com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.TemplateType\u003e)",
      "begin_line": 122,
      "end_line": 126,
      "comment": " Set the template name. ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 78)",
        "(line 125,col 5)-(line 125,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.forConstructor()",
      "begin_line": 129,
      "end_line": 132,
      "comment": " Make this a constructor. ",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 30)",
        "(line 131,col 5)-(line 131,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.setIsConstructor(boolean)",
      "begin_line": 135,
      "end_line": 138,
      "comment": " Set whether this is a constructor. ",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 39)",
        "(line 137,col 5)-(line 137,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.forNativeType()",
      "begin_line": 141,
      "end_line": 144,
      "comment": " Make this a native type. ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 29)",
        "(line 143,col 5)-(line 143,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 147,
      "end_line": 157,
      "comment": " Copies all the information from another function type. ",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 45)",
        "(line 149,col 5)-(line 149,col 44)",
        "(line 150,col 5)-(line 150,col 56)",
        "(line 151,col 5)-(line 151,col 48)",
        "(line 152,col 5)-(line 152,col 48)",
        "(line 153,col 5)-(line 153,col 58)",
        "(line 154,col 5)-(line 154,col 51)",
        "(line 155,col 5)-(line 155,col 55)",
        "(line 156,col 5)-(line 156,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionBuilder.build()",
      "begin_line": 160,
      "end_line": 164,
      "comment": " Construct a new function type. ",
      "child_ranges": [
        "(line 161,col 5)-(line 163,col 66)"
      ]
    }
  ]
}