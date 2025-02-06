{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CodingConvention.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodingConvention",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 414,
      "comment": "\n * CodingConvention defines a set of hooks to customize the behavior of the\n * Compiler for a specific team/company.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isConstant(java.lang.String)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n   * This checks whether a given variable name, such as a name in all-caps\n   * should be treated as if it had the @const annotation.\n   *\n   * @param variableName potentially constant variable name\n   * @return {@code true} if the name should be treated as a constant.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isConstantKey(java.lang.String)",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n   * This checks whether a given key of an object literal, such as a\n   * name in all-caps should be treated as if it had the @const\n   * annotation.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isValidEnumKey(java.lang.String)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n   * This checks that a given {@code key} may be used as a key for an enum.\n   *\n   * @param key the potential key to an enum\n   * @return {@code true} if the {@code key} may be used as an enum key,\n   *     {@code false} otherwise\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isOptionalParameter(com.google.javascript.rhino.Node)",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n   * This checks whether a given parameter name should be treated as an\n   * optional parameter as far as type checking or function call arg count\n   * checking is concerned. Note that an optional function parameter may be\n   * declared as a simple type and is automatically converted to a union of the\n   * declared type and Undefined.\n   *\n   * @param parameter The parameter\u0027s node.\n   * @return {@code true} if the parameter should be treated as an optional\n   * parameter.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isVarArgsParameter(com.google.javascript.rhino.Node)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n   * This checks whether a given parameter should be treated as a marker\n   * for a variable argument list function. A VarArgs parameter must be the\n   * last parameter in a function declaration.\n   *\n   * @param parameter The parameter\u0027s node.\n   * @return {@code true} if the parameter should be treated as a variable\n   * length parameter.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isExported(java.lang.String, boolean)",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n   * Checks whether a global variable or function name should be treated as\n   * exported, or externally referenceable.\n   *\n   * @param name A global variable or function name.\n   * @param local {@code true} if the name is a local variable.\n   * @return {@code true} if the name should be considered exported.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isExported(java.lang.String)",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n   * Should be isExported(name, true) || isExported(name, false);\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isPrivate(java.lang.String)",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n   * Checks whether a name should be considered private. Private global\n   * variables and functions can only be referenced within the source file in\n   * which they are declared. Private properties and methods should only be\n   * accessed by the class that defines them.\n   *\n   * @param name The name of a global variable or function, or a method or\n   *     property.\n   * @return {@code true} if the name should be considered private.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getClassesDefinedByCall(com.google.javascript.rhino.Node)",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n   * Checks if the given method defines a subclass relationship,\n   * and if it does, returns information on that relationship. By default,\n   * always returns null. Meant to be overridden by subclasses.\n   *\n   * @param callNode A CALL node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isSuperClassReference(java.lang.String)",
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n   * Returns true if passed a string referring to the superclass.  The string\n   * will usually be from the string node at the right of a GETPROP, e.g.\n   * this.superClass_.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n   * Convenience method for determining provided dependencies amongst different\n   * JS scripts.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n   * Convenience method for determining required dependencies amongst different\n   * JS scripts.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getExportPropertyFunction()",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n   * Function name used when exporting properties.\n   * Signature: fn(object, publicName, symbol).\n   * @return function name.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getExportSymbolFunction()",
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n   * Function name used when exporting symbols.\n   * Signature: fn(publicPath, object).\n   * @return function name.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.identifyTypeDeclarationCall(com.google.javascript.rhino.Node)",
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n   * Checks if the given CALL node is forward-declaring any types,\n   * and returns the name of the types if it is.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.CodingConvention.SubclassType)",
      "begin_line": 166,
      "end_line": 167,
      "comment": "\n   * In many JS libraries, the function that produces inheritance also\n   * adds properties to the superclass and/or subclass.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getAbstractMethodName()",
      "begin_line": 176,
      "end_line": 176,
      "comment": "\n   * Function name for abstract methods. An abstract method can be assigned to\n   * an interface method instead of an function expression in order to avoid\n   * linter warnings produced by assigning a function without a return value\n   * where a return value is expected.\n   * @return function name.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getSingletonGetterClassName(com.google.javascript.rhino.Node)",
      "begin_line": 189,
      "end_line": 189,
      "comment": "\n   * Checks if the given method defines a singleton getter, and if it does,\n   * returns the name of the class with the singleton getter. By default, always\n   * returns null. Meant to be overridden by subclasses.\n   *\n   * addSingletonGetter needs a coding convention because in the general case,\n   * it can\u0027t be inlined. The function inliner sees that it creates an alias\n   * to the given class in an inner closure, and bails out.\n   *\n   * @param callNode A CALL node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 195,
      "end_line": 196,
      "comment": "\n   * In many JS libraries, the function that adds a singleton getter to a class\n   * adds properties to the class.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isInlinableFunction(com.google.javascript.rhino.Node)",
      "begin_line": 201,
      "end_line": 201,
      "comment": "\n   * @return Whether the function is inlinable by convention.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getDelegateRelationship(com.google.javascript.rhino.Node)",
      "begin_line": 206,
      "end_line": 206,
      "comment": "\n   * @return the delegate relationship created by the call or null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.applyDelegateRelationship(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n   * In many JS libraries, the function that creates a delegate relationship\n   * also adds properties to the delegator and delegate base.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getDelegateSuperclassName()",
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n   * @return the name of the delegate superclass.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.checkForCallingConventionDefiningCalls(com.google.javascript.rhino.Node, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 226,
      "end_line": 227,
      "comment": "\n   * Checks for function calls that set the calling conventions on delegate\n   * methods.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.defineDelegateProxyPrototypeProperties(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e, java.util.List\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n   * Defines the delegate proxy prototype properties. Their types depend on\n   * properties of the delegate base methods.\n   *\n   * @param delegateProxyPrototypes List of delegate proxy prototypes.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getGlobalObject()",
      "begin_line": 243,
      "end_line": 243,
      "comment": "\n   * Gets the name of the global object.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.describeFunctionBind(com.google.javascript.rhino.Node)",
      "begin_line": 248,
      "end_line": 248,
      "comment": "\n   * A Bind instance or null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.describeFunctionBind(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n   * A Bind instance or null.\n   * @param useTypeInfo If we believe type information is reliable enough\n   *     to use to figure out what the bind function is.\n   ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Bind",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 257,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": " The target of the bind action"
    },
    {
      "type": "field",
      "varNames": [
        "thisValue"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " The node representing the \"this\" value, maybe null"
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " The head of a Node list representing the parameters"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodingConvention.Bind.Bind(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 266,col 7)-(line 266,col 27)",
        "(line 267,col 7)-(line 267,col 33)",
        "(line 268,col 7)-(line 268,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.Bind.getBoundParameterCount()",
      "begin_line": 274,
      "end_line": 281,
      "comment": "\n     * The number of parameters bound (not including the \u0027this\u0027 value).\n     ",
      "child_ranges": [
        "(line 275,col 7)-(line 277,col 7)",
        "(line 278,col 7)-(line 278,col 48)",
        "(line 279,col 7)-(line 280,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isPropertyTestFunction(com.google.javascript.rhino.Node)",
      "begin_line": 287,
      "end_line": 287,
      "comment": "\n   * Whether this CALL function is testing for the existence of a property.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.isPrototypeAlias(com.google.javascript.rhino.Node)",
      "begin_line": 292,
      "end_line": 292,
      "comment": "\n   * Whether this GETPROP node is an alias for an object prototype.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getObjectLiteralCast(com.google.javascript.rhino.Node)",
      "begin_line": 301,
      "end_line": 301,
      "comment": "\n   * Checks if the given method performs a object literal cast, and if it does,\n   * returns information on the cast. By default, always returns null. Meant\n   * to be overridden by subclasses.\n   *\n   * @param callNode A CALL node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getIndirectlyDeclaredProperties()",
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n   * Gets a collection of all properties that are defined indirectly on global\n   * objects. (For example, Closure defines superClass_ in the goog.inherits\n   * call).\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.getAssertionFunctions()",
      "begin_line": 313,
      "end_line": 313,
      "comment": "\n   * Returns the set of AssertionFunction.\n   ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "SubclassRelationship",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 320,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subclassName"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "superclassName"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodingConvention.SubclassRelationship.SubclassRelationship(com.google.javascript.jscomp.CodingConvention.SubclassType, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 325,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 23)",
        "(line 328,col 7)-(line 328,col 58)",
        "(line 329,col 7)-(line 329,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DelegateRelationship",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 339,
      "end_line": 350,
      "comment": "\n   * Delegates provides a mechanism and structure for identifying where classes\n   * can call out to optional code to augment their functionality. The optional\n   * code is isolated from the base code through the use of a subclass in the\n   * optional code derived from the delegate class in the base code.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "delegateBase"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " The subclass in the base code. "
    },
    {
      "type": "field",
      "varNames": [
        "delegator"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " The class in the base code. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodingConvention.DelegateRelationship.DelegateRelationship(java.lang.String, java.lang.String)",
      "begin_line": 346,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 347,col 7)-(line 347,col 39)",
        "(line 348,col 7)-(line 348,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectLiteralCast",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 356,
      "end_line": 372,
      "comment": "\n   * An object literal cast provides a mechanism to cast object literals to\n   * other types without a warning.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeName"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " Type to cast to. "
    },
    {
      "type": "field",
      "varNames": [
        "objectNode"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " Object to cast. "
    },
    {
      "type": "field",
      "varNames": [
        "diagnosticType"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " Error message "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast.ObjectLiteralCast(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 366,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 368,col 7)-(line 368,col 31)",
        "(line 369,col 7)-(line 369,col 35)",
        "(line 370,col 7)-(line 370,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AssertionFunctionSpec",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 379,
      "end_line": 413,
      "comment": "\n   * A function that will throw an exception when either:\n   *   -One or more of its parameters evaluate to false.\n   *   -One or more of its parameters are not of a certain type.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "functionName"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertedType"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec.AssertionFunctionSpec(java.lang.String)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 384,col 7)-(line 384,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec.AssertionFunctionSpec(java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 387,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 389,col 7)-(line 389,col 39)",
        "(line 390,col 7)-(line 390,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec.getFunctionName()",
      "begin_line": 394,
      "end_line": 396,
      "comment": " Returns the name of the function. ",
      "child_ranges": [
        "(line 395,col 7)-(line 395,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec.getAssertedParam(com.google.javascript.rhino.Node)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Returns the parameter of the assertion function that is being checked.\n     * @param firstParam The first parameter of the function call.\n     ",
      "child_ranges": [
        "(line 403,col 7)-(line 403,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec.getAssertedType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * Returns the type for a type assertion, or null if the function asserts\n     * that the node must not be null or undefined.\n     ",
      "child_ranges": [
        "(line 411,col 7)-(line 411,col 80)"
      ]
    }
  ]
}