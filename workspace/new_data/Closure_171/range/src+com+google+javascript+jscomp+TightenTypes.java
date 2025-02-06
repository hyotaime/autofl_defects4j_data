{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/TightenTypes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TightenTypes",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.ConcreteType.Factory"
      ],
      "begin_line": 74,
      "end_line": 1416,
      "comment": "\n * Computes the set of possible concrete types for every variable, property,\n * function argument, and function return value in the program.  Unlike a normal\n * reference type annotation, a concrete type of A indicates that an instance of\n * A -- not a subclass of A -- is a possible value.\n *\n * Also unlike normal type checking, this pass does not assume that all defined\n * functions are actually called.  Instead, it assumes only that the top-level\n * code is executed plus any implicit calls detected, such as calls to functions\n * exported via goog.exportSymbol or Element.addEventListener.  Hence, this pass\n * also performs a very strict form of dead code detection.  Elimination of dead\n * code will occur because the disambiguation pass can rename all uncalled\n * functions to have distinct names, which will then appear to be uncalled to\n * the normal unused property remover.\n *\n * Since concrete types are all reference types, we only care about the limited\n * set of actions that apply to them:  assignments to variables/properties,\n * method calls, and return statements.  To speed up and simplify the\n * implementation, the first time a scope is processed, we make one pass through\n * it {@link CreateScope} to translate it into a list of Actions.  Each Action\n * can translate itself into a list of assignments:  method calls are just\n * assignments to the parameter variables, while return statements are\n * assignments to a special $return slot.  Each time a scope is (re-)processed,\n * we iterate over the assignments produced by the actions and update the types\n * of the target slots.  Once we complete a pass through all scopes with no\n * changes, we are done.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "NON_HALTING_ERROR_MSG"
      ],
      "begin_line": 75,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The compiler that invoked this pass. "
    },
    {
      "type": "field",
      "varNames": [
        "functionFromDeclaration"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": "\n   * Map of function type information to their concrete wrappers.  These must be\n   * reused so that each declaration has only a single concrete type, which will\n   * hold all the known types that flow to its arguments and return value.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "functionFromJSType"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": "\n   * Secondary index of concrete functions by JSType.  This is necessary for\n   * retrieving the concrete type of a superclass, where the actual declaration\n   * is not at hand.  Note that we must use an identity hash map here because\n   * functions are compared using the signature only.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "instanceFromJSType"
      ],
      "begin_line": 103,
      "end_line": 104,
      "comment": "\n   * Map of instance type information to their concrete wrappers.  These must be\n   * reused so that each property has only one variable, which will store all\n   * known types that flow to that variable.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeIntersectionMemos"
      ],
      "begin_line": 109,
      "end_line": 110,
      "comment": "\n   * Memoized results of \"createTypeIntersection\" calls.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "topScope"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Scope storing the top-level variables and functions. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.TightenTypes(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.getTopScope()",
      "begin_line": 120,
      "end_line": 120,
      "comment": " Returns the top scope computed during the pass. ",
      "child_ranges": [
        "(line 120,col 33)-(line 120,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.getTypeRegistry()",
      "begin_line": 123,
      "end_line": 124,
      "comment": " Convenience method to get the type registry of the compiler. ",
      "child_ranges": [
        "(line 124,col 45)-(line 124,col 78)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "allInstantiatedTypes"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " All concrete instance types encountered during flow analysis. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 129,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 39)",
        "(line 133,col 5)-(line 133,col 43)",
        "(line 134,col 5)-(line 134,col 38)",
        "(line 142,col 5)-(line 142,col 30)",
        "(line 143,col 5)-(line 143,col 24)",
        "(line 145,col 5)-(line 145,col 59)",
        "(line 146,col 5)-(line 146,col 64)",
        "(line 148,col 5)-(line 148,col 20)",
        "(line 149,col 5)-(line 168,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteScope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e"
      ],
      "begin_line": 176,
      "end_line": 261,
      "comment": "\n   * Represents a scope in which a set of slots are declared.  The scope also\n   * includes code, which is normalized to a set of actions (which may affect\n   * slots in other scopes as well).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "slots"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actions"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.ConcreteScope(com.google.javascript.jscomp.TightenTypes.ConcreteScope)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 27)",
        "(line 183,col 7)-(line 183,col 37)",
        "(line 184,col 7)-(line 184,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.getRootNode()",
      "begin_line": 187,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 188,col 33)-(line 188,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.getParentScope()",
      "begin_line": 190,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 191,col 57)-(line 191,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.getOwnSlot(java.lang.String)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 7)-(line 195,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.getSlot(java.lang.String)",
      "begin_line": 198,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 200,col 7)-(line 200,col 54)",
        "(line 201,col 7)-(line 207,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.getSlots()",
      "begin_line": 211,
      "end_line": 211,
      "comment": " Returns all the slots in this scope. ",
      "child_ranges": [
        "(line 211,col 43)-(line 211,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.getTypeOfThis()",
      "begin_line": 213,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 217,col 7)-(line 217,col 76)",
        "(line 218,col 7)-(line 218,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.declareSlot(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 222,
      "end_line": 224,
      "comment": " Add a declaration for the given variable. ",
      "child_ranges": [
        "(line 223,col 7)-(line 223,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.declareSlot(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 227,
      "end_line": 231,
      "comment": " Add a declaration for the given variable with the given type. ",
      "child_ranges": [
        "(line 228,col 7)-(line 228,col 54)",
        "(line 229,col 7)-(line 229,col 32)",
        "(line 230,col 7)-(line 230,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.getActions()",
      "begin_line": 234,
      "end_line": 234,
      "comment": " Returns all the actions performed in the code of this scope. ",
      "child_ranges": [
        "(line 234,col 33)-(line 234,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.initForScopeRoot(com.google.javascript.rhino.Node)",
      "begin_line": 237,
      "end_line": 245,
      "comment": " Finds assignments and variables from the function body. ",
      "child_ranges": [
        "(line 238,col 7)-(line 238,col 39)",
        "(line 239,col 7)-(line 241,col 7)",
        "(line 242,col 7)-(line 242,col 50)",
        "(line 244,col 7)-(line 244,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.initForExternRoot(com.google.javascript.rhino.Node)",
      "begin_line": 248,
      "end_line": 253,
      "comment": " Finds assignments and variables from the given externs. ",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 39)",
        "(line 250,col 7)-(line 250,col 50)",
        "(line 252,col 7)-(line 252,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.addAction(com.google.javascript.jscomp.TightenTypes.Action)",
      "begin_line": 256,
      "end_line": 256,
      "comment": " Adds the given action to the list for the code in this scope. ",
      "child_ranges": [
        "(line 256,col 37)-(line 256,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteScope.toString()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteSlot",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.jscomp.ConcreteType\u003e"
      ],
      "begin_line": 264,
      "end_line": 307,
      "comment": " Represents a variable or function declared in a scope. "
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.ConcreteSlot(com.google.javascript.jscomp.TightenTypes.ConcreteScope, java.lang.String)",
      "begin_line": 269,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 270,col 7)-(line 270,col 25)",
        "(line 271,col 7)-(line 271,col 23)",
        "(line 272,col 7)-(line 272,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.getScope()",
      "begin_line": 276,
      "end_line": 276,
      "comment": " Returns the scope in which this slot exists. ",
      "child_ranges": [
        "(line 276,col 32)-(line 276,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.getName()",
      "begin_line": 279,
      "end_line": 279,
      "comment": " Returns the name of this slot in its scope. ",
      "child_ranges": [
        "(line 279,col 41)-(line 279,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.getType()",
      "begin_line": 281,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 281,col 47)-(line 281,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.isTypeInferred()",
      "begin_line": 284,
      "end_line": 284,
      "comment": " Whether this type was inferred rather than declared (always true). ",
      "child_ranges": [
        "(line 284,col 49)-(line 284,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.getDeclaration()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 7)-(line 287,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.getJSDocInfo()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 291,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.addConcreteType(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 298,
      "end_line": 302,
      "comment": "\n     * Adds the given type to the possible concrete types for this slot.\n     * Returns whether the added type was not already known.\n     ",
      "child_ranges": [
        "(line 299,col 7)-(line 299,col 40)",
        "(line 300,col 7)-(line 300,col 43)",
        "(line 301,col 7)-(line 301,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteSlot.toString()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 7)-(line 305,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Action",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n   * Represents a type of action performed in the body of scope that may affect\n   * the concrete types of slot.  Example actions are a function call, a\n   * variable assignment, and a property assignment.  The function call will\n   * create assignments for each of the function parameters, for the \"this\"\n   * slot, and for the \"call\" slot.  Property and variable assignment actions\n   * create assignments for the property or variable they represent.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.Action.getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope)",
      "begin_line": 319,
      "end_line": 319,
      "comment": " Returns all assignments that may occur by this action. ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Assignment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 323,
      "end_line": 334,
      "comment": " Represents an assignment to a variable of a set of possible types. "
    },
    {
      "type": "field",
      "varNames": [
        "slot"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.Assignment.Assignment(com.google.javascript.jscomp.TightenTypes.ConcreteSlot, com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 327,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 328,col 7)-(line 328,col 23)",
        "(line 329,col 7)-(line 329,col 23)",
        "(line 331,col 7)-(line 331,col 39)",
        "(line 332,col 7)-(line 332,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VariableAssignAction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TightenTypes.Action"
      ],
      "begin_line": 337,
      "end_line": 354,
      "comment": " Records an assignment of an expression to a variable. "
    },
    {
      "type": "field",
      "varNames": [
        "slot"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expression"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.VariableAssignAction.VariableAssignAction(com.google.javascript.jscomp.TightenTypes.ConcreteSlot, com.google.javascript.rhino.Node)",
      "begin_line": 341,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 342,col 7)-(line 342,col 23)",
        "(line 343,col 7)-(line 343,col 29)",
        "(line 345,col 7)-(line 345,col 39)",
        "(line 346,col 7)-(line 346,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.VariableAssignAction.getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope)",
      "begin_line": 349,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 351,col 7)-(line 352,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyAssignAction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TightenTypes.Action"
      ],
      "begin_line": 357,
      "end_line": 390,
      "comment": " Records an assignment of an expression to a property of an object. "
    },
    {
      "type": "field",
      "varNames": [
        "receiver"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propName"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expression"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.PropertyAssignAction.PropertyAssignAction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 362,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 363,col 7)-(line 363,col 31)",
        "(line 364,col 7)-(line 364,col 53)",
        "(line 365,col 7)-(line 365,col 29)",
        "(line 367,col 7)-(line 367,col 43)",
        "(line 368,col 7)-(line 368,col 43)",
        "(line 369,col 7)-(line 369,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.PropertyAssignAction.getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope)",
      "begin_line": 378,
      "end_line": 389,
      "comment": "\n     * Returns all assignments that could occur as a result of this property\n     * assign action. Each type in the receiver is checked for a property\n     * {@code propName}, and if that property exists, it is assigned the type\n     * of {@code expression}.\n     ",
      "child_ranges": [
        "(line 380,col 7)-(line 380,col 65)",
        "(line 381,col 7)-(line 381,col 67)",
        "(line 383,col 7)-(line 383,col 54)",
        "(line 384,col 7)-(line 387,col 7)",
        "(line 388,col 7)-(line 388,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionCallBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 393,
      "end_line": 438,
      "comment": " Helper class to build a FunctionCall object. "
    },
    {
      "type": "field",
      "varNames": [
        "isNewCall"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isCallFunction"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "receiver"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstArgument"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propName"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.FunctionCallBuilder(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 401,col 7)-(line 401,col 31)",
        "(line 402,col 7)-(line 402,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.setPropName(java.lang.String)",
      "begin_line": 405,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 406,col 7)-(line 406,col 31)",
        "(line 407,col 7)-(line 407,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.setIsNewCall(boolean)",
      "begin_line": 411,
      "end_line": 417,
      "comment": " Should be called iff this is a new call, e.g. new Object(); ",
      "child_ranges": [
        "(line 412,col 7)-(line 413,col 70)",
        "(line 415,col 7)-(line 415,col 24)",
        "(line 416,col 7)-(line 416,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.setIsCallFunction()",
      "begin_line": 423,
      "end_line": 429,
      "comment": "\n     *  Should be called iff this is a {@code call()} function call,\n     *  e.g. Array.prototype.slice.call(arguments, 0);\n     ",
      "child_ranges": [
        "(line 424,col 7)-(line 425,col 70)",
        "(line 427,col 7)-(line 427,col 28)",
        "(line 428,col 7)-(line 428,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.build()",
      "begin_line": 431,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 432,col 7)-(line 436,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.getFunctionCallAssignments(com.google.javascript.jscomp.ConcreteType, com.google.javascript.jscomp.ConcreteType, java.util.List\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 444,
      "end_line": 460,
      "comment": "\n   * Returns a list of assignments that will result from a function call with\n   * the given concrete types.\n   ",
      "child_ranges": [
        "(line 446,col 5)-(line 446,col 52)",
        "(line 447,col 5)-(line 458,col 5)",
        "(line 459,col 5)-(line 459,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExternFunctionCall",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TightenTypes.Action"
      ],
      "begin_line": 467,
      "end_line": 484,
      "comment": "\n   * Records a call to a function with a given set of concrete types.  This is\n   * used for function calls that originate outside the scope of the user code.\n   * E.g. callbacks from an extern function.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "receiver"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thisType"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "argTypes"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.ExternFunctionCall.ExternFunctionCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ConcreteType, java.util.List\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 472,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 474,col 7)-(line 474,col 31)",
        "(line 475,col 7)-(line 475,col 31)",
        "(line 476,col 7)-(line 476,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ExternFunctionCall.getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope)",
      "begin_line": 479,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 481,col 7)-(line 482,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionCall",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TightenTypes.Action"
      ],
      "begin_line": 487,
      "end_line": 548,
      "comment": " Records a call to a function with a given set of arguments. "
    },
    {
      "type": "field",
      "varNames": [
        "isNewCall"
      ],
      "begin_line": 488,
      "end_line": 488,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "receiver"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propName"
      ],
      "begin_line": 490,
      "end_line": 490,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstArgument"
      ],
      "begin_line": 491,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.FunctionCall.FunctionCall(boolean, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 497,
      "end_line": 505,
      "comment": "\n     * The function called is {@code receiver} or, if {@code propName} is\n     * non-null, the {@propName} field of {@code receiver}.\n     ",
      "child_ranges": [
        "(line 499,col 7)-(line 499,col 33)",
        "(line 500,col 7)-(line 500,col 31)",
        "(line 501,col 7)-(line 501,col 31)",
        "(line 502,col 7)-(line 502,col 41)",
        "(line 504,col 7)-(line 504,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.FunctionCall.getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope)",
      "begin_line": 507,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 509,col 7)-(line 509,col 48)",
        "(line 510,col 7)-(line 510,col 65)",
        "(line 514,col 7)-(line 517,col 7)",
        "(line 519,col 7)-(line 524,col 7)",
        "(line 528,col 7)-(line 539,col 7)",
        "(line 541,col 7)-(line 541,col 57)",
        "(line 542,col 7)-(line 544,col 7)",
        "(line 546,col 7)-(line 546,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NativeCallFunctionCall",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TightenTypes.Action"
      ],
      "begin_line": 551,
      "end_line": 584,
      "comment": " Records a call to the native call() function. "
    },
    {
      "type": "field",
      "varNames": [
        "receiver"
      ],
      "begin_line": 552,
      "end_line": 552,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propName"
      ],
      "begin_line": 553,
      "end_line": 553,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstArgument"
      ],
      "begin_line": 554,
      "end_line": 554,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.NativeCallFunctionCall.NativeCallFunctionCall(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 556,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 557,col 7)-(line 557,col 31)",
        "(line 558,col 7)-(line 558,col 31)",
        "(line 559,col 7)-(line 559,col 41)",
        "(line 561,col 7)-(line 561,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.NativeCallFunctionCall.getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope)",
      "begin_line": 564,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 566,col 7)-(line 568,col 42)",
        "(line 569,col 7)-(line 569,col 65)",
        "(line 571,col 7)-(line 574,col 7)",
        "(line 575,col 7)-(line 575,col 57)",
        "(line 577,col 7)-(line 581,col 7)",
        "(line 582,col 7)-(line 582,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CreateScope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 587,
      "end_line": 977,
      "comment": " Adds all the variables and assignments to a given scope from the code. "
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 588,
      "end_line": 588,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.CreateScope(com.google.javascript.jscomp.TightenTypes.ConcreteScope, boolean)",
      "begin_line": 591,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 592,col 7)-(line 592,col 25)",
        "(line 593,col 7)-(line 593,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 597,
      "end_line": 764,
      "comment": " TODO(user): handle object literals like { a: new Foo };",
      "child_ranges": [
        "(line 599,col 7)-(line 756,col 7)",
        "(line 758,col 7)-(line 758,col 57)",
        "(line 759,col 7)-(line 763,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.addAction(com.google.javascript.jscomp.TightenTypes.Action)",
      "begin_line": 767,
      "end_line": 770,
      "comment": " Adds the given action to the scope (in non-externs only). ",
      "child_ranges": [
        "(line 768,col 7)-(line 768,col 76)",
        "(line 769,col 7)-(line 769,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.addActions(java.util.List\u003ccom.google.javascript.jscomp.TightenTypes.Action\u003e)",
      "begin_line": 773,
      "end_line": 778,
      "comment": " Adds the given action to the scope (in non-externs only). ",
      "child_ranges": [
        "(line 774,col 7)-(line 774,col 76)",
        "(line 775,col 7)-(line 777,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.createAssignmentActions(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 784,
      "end_line": 807,
      "comment": "\n     * Returns an action for assigning the right-hand-side to the left or null\n     * if this assignment should be ignored.\n     ",
      "child_ranges": [
        "(line 786,col 7)-(line 806,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.createExternFunctionCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 809,
      "end_line": 822,
      "comment": "",
      "child_ranges": [
        "(line 811,col 7)-(line 811,col 57)",
        "(line 812,col 7)-(line 812,col 28)",
        "(line 813,col 7)-(line 820,col 7)",
        "(line 821,col 7)-(line 821,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 824,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 825,col 7)-(line 829,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.getImplicitActions(com.google.javascript.rhino.Node)",
      "begin_line": 836,
      "end_line": 861,
      "comment": "\n     * Returns any actions that are implicit in the given code.  This can return\n     * null instead of an empty collection if none are found.\n     ",
      "child_ranges": [
        "(line 837,col 7)-(line 859,col 7)",
        "(line 860,col 7)-(line 860,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.getImplicitActionsFromCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 863,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 865,col 7)-(line 865,col 40)",
        "(line 866,col 7)-(line 874,col 7)",
        "(line 876,col 7)-(line 878,col 43)",
        "(line 879,col 7)-(line 879,col 56)",
        "(line 880,col 7)-(line 902,col 7)",
        "(line 903,col 7)-(line 903,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.getImplicitActionsFromArgument(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 906,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 908,col 7)-(line 921,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.getImplicitActionsFromProp(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 924,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 926,col 7)-(line 926,col 50)",
        "(line 927,col 7)-(line 948,col 7)",
        "(line 952,col 7)-(line 957,col 7)",
        "(line 958,col 7)-(line 958,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.CreateScope.getImplicitActionsFromPropNonUnion(com.google.javascript.rhino.jstype.ObjectType, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 961,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 963,col 7)-(line 964,col 42)",
        "(line 965,col 7)-(line 974,col 7)",
        "(line 975,col 7)-(line 975,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createType(com.google.javascript.rhino.Node, com.google.javascript.jscomp.TightenTypes.ConcreteScope)",
      "begin_line": 980,
      "end_line": 994,
      "comment": " Returns a concrete type from the JSType of the given variable. ",
      "child_ranges": [
        "(line 981,col 5)-(line 981,col 37)",
        "(line 982,col 5)-(line 982,col 47)",
        "(line 984,col 5)-(line 986,col 5)",
        "(line 988,col 5)-(line 991,col 5)",
        "(line 993,col 5)-(line 993,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 997,
      "end_line": 1023,
      "comment": " Returns a concrete type from the given JSType. ",
      "child_ranges": [
        "(line 998,col 5)-(line 1000,col 5)",
        "(line 1002,col 5)-(line 1008,col 5)",
        "(line 1010,col 5)-(line 1016,col 5)",
        "(line 1018,col 5)-(line 1020,col 5)",
        "(line 1022,col 5)-(line 1022,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createTypeWithSubTypes(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1029,
      "end_line": 1052,
      "comment": "\n   * Returns a concrete type from the given JSType that includes the concrete\n   * types for subtypes and implementing types for any interfaces.\n   ",
      "child_ranges": [
        "(line 1030,col 5)-(line 1030,col 41)",
        "(line 1031,col 5)-(line 1050,col 5)",
        "(line 1051,col 5)-(line 1051,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.inferConcreteType(com.google.javascript.jscomp.TightenTypes.ConcreteScope, com.google.javascript.rhino.Node)",
      "begin_line": 1055,
      "end_line": 1187,
      "comment": " Computes the concrete types that can result from the given expression. ",
      "child_ranges": [
        "(line 1056,col 5)-(line 1056,col 38)",
        "(line 1057,col 5)-(line 1057,col 37)",
        "(line 1058,col 5)-(line 1058,col 21)",
        "(line 1059,col 5)-(line 1185,col 5)",
        "(line 1186,col 5)-(line 1186,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createTypeIntersection(com.google.javascript.jscomp.ConcreteType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1189,
      "end_line": 1235,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 5)-(line 1194,col 74)",
        "(line 1195,col 5)-(line 1195,col 54)",
        "(line 1196,col 5)-(line 1198,col 5)",
        "(line 1200,col 5)-(line 1207,col 5)",
        "(line 1208,col 5)-(line 1208,col 79)",
        "(line 1213,col 5)-(line 1215,col 5)",
        "(line 1220,col 5)-(line 1222,col 5)",
        "(line 1226,col 5)-(line 1231,col 5)",
        "(line 1233,col 5)-(line 1233,col 40)",
        "(line 1234,col 5)-(line 1234,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createConcreteFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 1237,
      "end_line": 1249,
      "comment": "",
      "child_ranges": [
        "(line 1240,col 5)-(line 1240,col 69)",
        "(line 1241,col 5)-(line 1247,col 5)",
        "(line 1248,col 5)-(line 1248,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createConcreteInstance(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1251,
      "end_line": 1263,
      "comment": "",
      "child_ranges": [
        "(line 1254,col 5)-(line 1256,col 79)",
        "(line 1257,col 5)-(line 1257,col 73)",
        "(line 1258,col 5)-(line 1261,col 5)",
        "(line 1262,col 5)-(line 1262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.getConcreteFunction(com.google.javascript.rhino.Node)",
      "begin_line": 1266,
      "end_line": 1268,
      "comment": " Returns the (already created) function with the given declaration. ",
      "child_ranges": [
        "(line 1267,col 5)-(line 1267,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.getConcreteFunction(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1271,
      "end_line": 1274,
      "comment": " Returns the function (if any) for the given node. ",
      "child_ranges": [
        "(line 1273,col 5)-(line 1273,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.getConcreteInstance(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1277,
      "end_line": 1280,
      "comment": " Returns the function (if any) for the given node. ",
      "child_ranges": [
        "(line 1279,col 5)-(line 1279,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createFunctionScope(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 1282,
      "end_line": 1298,
      "comment": "",
      "child_ranges": [
        "(line 1285,col 5)-(line 1285,col 68)",
        "(line 1286,col 5)-(line 1286,col 65)",
        "(line 1287,col 5)-(line 1287,col 65)",
        "(line 1288,col 5)-(line 1288,col 67)",
        "(line 1289,col 5)-(line 1293,col 5)",
        "(line 1296,col 5)-(line 1296,col 48)",
        "(line 1297,col 5)-(line 1297,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createInstanceScope(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1300,
      "end_line": 1314,
      "comment": "",
      "child_ranges": [
        "(line 1303,col 5)-(line 1303,col 37)",
        "(line 1304,col 5)-(line 1304,col 67)",
        "(line 1305,col 5)-(line 1308,col 5)",
        "(line 1309,col 5)-(line 1309,col 57)",
        "(line 1310,col 5)-(line 1312,col 5)",
        "(line 1313,col 5)-(line 1313,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.createUnionWithSubTypes(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1322,
      "end_line": 1329,
      "comment": "\n   * Returns a ConcreteType that is the union of the given type and all of its\n   * subtypes.  This assumes that the passed in type is an instance type,\n   * otherwise an empty set is returned. The returned set will be instance\n   * types.\n   ",
      "child_ranges": [
        "(line 1323,col 5)-(line 1323,col 33)",
        "(line 1324,col 5)-(line 1326,col 5)",
        "(line 1328,col 5)-(line 1328,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.getSubTypes(com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType)",
      "begin_line": 1332,
      "end_line": 1340,
      "comment": " Returns the set of subtypes of the given type. ",
      "child_ranges": [
        "(line 1333,col 5)-(line 1335,col 5)",
        "(line 1337,col 5)-(line 1337,col 46)",
        "(line 1338,col 5)-(line 1338,col 60)",
        "(line 1339,col 5)-(line 1339,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.getSubTypes(com.google.javascript.rhino.jstype.FunctionType, java.util.Set\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 1346,
      "end_line": 1370,
      "comment": "\n   * Adds all subtypes of the given type to the provided set.\n   * @return false if the all type was encountered, else true.\n   ",
      "child_ranges": [
        "(line 1347,col 5)-(line 1368,col 5)",
        "(line 1369,col 5)-(line 1369,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteJSTypePair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1376,
      "end_line": 1415,
      "comment": "\n   * A simple class used to pair a concrete type and a JS type.  Used to\n   * memoize the results of a \"createTypeIntersection\" call.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "concrete"
      ],
      "begin_line": 1377,
      "end_line": 1377,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jstype"
      ],
      "begin_line": 1378,
      "end_line": 1378,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashcode"
      ],
      "begin_line": 1379,
      "end_line": 1379,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair.ConcreteJSTypePair(com.google.javascript.jscomp.ConcreteType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1381,
      "end_line": 1385,
      "comment": "",
      "child_ranges": [
        "(line 1382,col 7)-(line 1382,col 31)",
        "(line 1383,col 7)-(line 1383,col 27)",
        "(line 1384,col 7)-(line 1384,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair.getJSTypeHashCode()",
      "begin_line": 1387,
      "end_line": 1389,
      "comment": "",
      "child_ranges": [
        "(line 1388,col 7)-(line 1388,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair.equalsJSType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1391,
      "end_line": 1397,
      "comment": "",
      "child_ranges": [
        "(line 1392,col 7)-(line 1396,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair.equals(java.lang.Object)",
      "begin_line": 1399,
      "end_line": 1409,
      "comment": "",
      "child_ranges": [
        "(line 1401,col 7)-(line 1407,col 7)",
        "(line 1408,col 7)-(line 1408,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair.hashCode()",
      "begin_line": 1411,
      "end_line": 1414,
      "comment": "",
      "child_ranges": [
        "(line 1413,col 7)-(line 1413,col 22)"
      ]
    }
  ]
}