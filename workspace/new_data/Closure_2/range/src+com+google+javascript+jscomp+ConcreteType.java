{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ConcreteType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcreteType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LatticeElement"
      ],
      "begin_line": 47,
      "end_line": 718,
      "comment": "\n * Represents a reference type for which the exact definition in the source is\n * known.  Unlike a {@code JSType} reference type, a concrete instance type of A\n * indicates that an instance of A -- not a subclass of A -- is a possible\n * value.  Other concrete types are functions (whose definitions are known),\n * arrays containing concrete types, and unions of concrete types.\n *\n * These types are computed by {@code TightenTypes}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Static instance of the empty set of concrete types. "
    },
    {
      "type": "field",
      "varNames": [
        "ALL"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Static instance of the set of all concrete types. "
    },
    {
      "type": "field",
      "varNames": [
        "NO_FUNCTIONS"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " Constant empty list of function types. "
    },
    {
      "type": "field",
      "varNames": [
        "NO_INSTANCES"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " Constant empty list of instance types. "
    },
    {
      "type": "field",
      "varNames": [
        "NO_SLOTS"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " Constant empty list of slots. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.createForTypes(java.util.Collection\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 66,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 73,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.isNone()",
      "begin_line": 77,
      "end_line": 77,
      "comment": " Indicates whether this is an empty set of types. ",
      "child_ranges": [
        "(line 77,col 22)-(line 77,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.isFunction()",
      "begin_line": 80,
      "end_line": 80,
      "comment": " Indicates whether this type is a function. ",
      "child_ranges": [
        "(line 80,col 26)-(line 80,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.isInstance()",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n   * Indicates whether this type is an instance of some type (or a prototype\n   * instance of a type).\n   * ",
      "child_ranges": [
        "(line 86,col 26)-(line 86,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.isUnion()",
      "begin_line": 89,
      "end_line": 89,
      "comment": " Indicates whether this type is a union of concrete types. ",
      "child_ranges": [
        "(line 89,col 23)-(line 89,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.isAll()",
      "begin_line": 92,
      "end_line": 92,
      "comment": " Indicates whether this type is the set of all types. ",
      "child_ranges": [
        "(line 92,col 21)-(line 92,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.isSingleton()",
      "begin_line": 95,
      "end_line": 95,
      "comment": " Indicates whether this represents exactly one type. ",
      "child_ranges": [
        "(line 95,col 27)-(line 95,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.toFunction()",
      "begin_line": 98,
      "end_line": 98,
      "comment": " Returns this as a function, if it is one, or null, if not. ",
      "child_ranges": [
        "(line 98,col 39)-(line 98,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.toInstance()",
      "begin_line": 101,
      "end_line": 101,
      "comment": " Returns this as an instance, if it is one, or null, if not. ",
      "child_ranges": [
        "(line 101,col 39)-(line 101,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.toUnion()",
      "begin_line": 104,
      "end_line": 104,
      "comment": " Returns this as a union, if it is one, or null, if not. ",
      "child_ranges": [
        "(line 104,col 33)-(line 104,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getScope()",
      "begin_line": 107,
      "end_line": 107,
      "comment": " Returns the scope for the type, or null if not applicable. ",
      "child_ranges": [
        "(line 107,col 42)-(line 107,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.unionWith(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 110,
      "end_line": 119,
      "comment": " Returns the union of this type with the given one. ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 49)",
        "(line 112,col 5)-(line 118,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.intersectWith(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 122,
      "end_line": 130,
      "comment": " Returns the intersection of this type with the given one. ",
      "child_ranges": [
        "(line 123,col 5)-(line 129,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getMatchingTypes(com.google.javascript.jscomp.ConcreteType.TypeFilter\u003cC\u003e)",
      "begin_line": 136,
      "end_line": 153,
      "comment": "\n   * Calls {@code filter()} on each type, adding it to the returned list if it\n   * is not null.\n   ",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 18)",
        "(line 138,col 5)-(line 152,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeFilter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 160,
      "end_line": 169,
      "comment": "\n   * Provides one function to filter an input, either returning the filtered\n   * version of the input, or null if the input does not have a corresponding\n   * output.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "emptyList"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The empty list for a caller to use if there are no non-null outputs. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConcreteType.TypeFilter.TypeFilter(java.util.List\u003cC\u003e)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.TypeFilter.filter(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 168,
      "end_line": 168,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getFunctions()",
      "begin_line": 172,
      "end_line": 178,
      "comment": " Returns all function types in this set. ",
      "child_ranges": [
        "(line 173,col 5)-(line 177,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Anonymous-95937158-c9ad-4c04-ae8d-88ce99868c57.filter(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getInstances()",
      "begin_line": 181,
      "end_line": 187,
      "comment": " Returns all instance types in this set. ",
      "child_ranges": [
        "(line 182,col 5)-(line 186,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Anonymous-0100f7d9-ea6e-4474-a8f2-d845d4ab79a5.filter(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getFunctionInstanceTypes()",
      "begin_line": 190,
      "end_line": 199,
      "comment": " Returns the (non-null) instance types of all functions in this set. ",
      "child_ranges": [
        "(line 191,col 5)-(line 198,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Anonymous-20bea3a0-c7d8-49a8-adb0-57fb052a27e0.filter(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 192,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getPrototypeTypes()",
      "begin_line": 202,
      "end_line": 212,
      "comment": " Returns all (non-null) function prototype types in this set. ",
      "child_ranges": [
        "(line 203,col 5)-(line 211,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Anonymous-45dd110e-47cf-450b-a0cd-04a72324dca9.filter(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 204,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getSuperclassTypes()",
      "begin_line": 215,
      "end_line": 223,
      "comment": " Returns the (non-null) superclasses of all functions in this set. ",
      "child_ranges": [
        "(line 216,col 5)-(line 222,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Anonymous-03153b2e-d19f-4fe7-bf4c-767db03c637a.filter(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 217,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getParameterSlots(int)",
      "begin_line": 226,
      "end_line": 234,
      "comment": " Returns the (non-null) index-th parameters of functions in this set. ",
      "child_ranges": [
        "(line 227,col 5)-(line 233,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Anonymous-b261aef7-32a5-432b-8953-39ccb18deccc.filter(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 228,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getPropertySlots(java.lang.String)",
      "begin_line": 240,
      "end_line": 250,
      "comment": "\n   * Returns the (non-null) slots for properties with the given name in all\n   * instance types in this set.\n   ",
      "child_ranges": [
        "(line 241,col 5)-(line 249,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Anonymous-9703d99e-d023-4770-bfc2-54fa5a7b517e.filter(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 242,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 45)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.getPropertyType(java.lang.String)",
      "begin_line": 257,
      "end_line": 263,
      "comment": "\n   * Returns the concrete type for the given property from the given type.\n   * If the given type is a union type, returns the union of types for the slots\n   * of the property.\n   ",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 28)",
        "(line 259,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 262,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteNoneType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ConcreteType"
      ],
      "begin_line": 266,
      "end_line": 274,
      "comment": " Implements the empty set of types. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteNoneType.isNone()",
      "begin_line": 267,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 267,col 34)-(line 267,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteNoneType.unionWith(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 269,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 269,col 60)-(line 269,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteNoneType.intersectWith(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 271,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 271,col 64)-(line 271,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteNoneType.toString()",
      "begin_line": 273,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 273,col 42)-(line 273,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteFunctionType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ConcreteType"
      ],
      "begin_line": 285,
      "end_line": 438,
      "comment": "\n   * Represents a specific function in the source code.  Note that we assume the\n   * factory creates only a single instance of this class for a given\n   * declaration, so we do not need to override {@code Object.equals}.\n   *\n   * {@code bodyScope} contains a slot for each local variable in the function\n   * body\u0027s scope as well as special slots to keep track of whether the\n   * function is called, the this type, and the return type.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "CALL_SLOT_NAME"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " Name used for the call slot (see {@code getCallSlot}). "
    },
    {
      "type": "field",
      "varNames": [
        "THIS_SLOT_NAME"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " Name used for the this slot (see {@code getThisSlot}). "
    },
    {
      "type": "field",
      "varNames": [
        "RETURN_SLOT_NAME"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " Name used for the return slot (see {@code getReturnSlot}). "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declaration"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentScope"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bodyScope"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceType"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prototypeType"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.ConcreteFunctionType(com.google.javascript.jscomp.ConcreteType.Factory, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 302,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 305,col 7)-(line 305,col 29)",
        "(line 306,col 7)-(line 306,col 37)",
        "(line 307,col 7)-(line 307,col 37)",
        "(line 309,col 7)-(line 309,col 60)",
        "(line 310,col 7)-(line 310,col 67)",
        "(line 311,col 7)-(line 311,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.isFunction()",
      "begin_line": 314,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 314,col 38)-(line 314,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.toFunction()",
      "begin_line": 316,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 316,col 51)-(line 316,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getCallSlot()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Returns the slot representing that a call to it occurred.  This is\n     * assigned a type if the function is called.  This ensures that the body of\n     * the function is processed even if it has no arguments or if the arguments\n     * do not take any concrete types as arguments.\n     ",
      "child_ranges": [
        "(line 325,col 7)-(line 325,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getThisSlot()",
      "begin_line": 329,
      "end_line": 331,
      "comment": " Returns the slot representing the value of \u0027this\u0027 in the body. ",
      "child_ranges": [
        "(line 330,col 7)-(line 330,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getReturnSlot()",
      "begin_line": 334,
      "end_line": 336,
      "comment": " Returns the slot representing the values returned. ",
      "child_ranges": [
        "(line 335,col 7)-(line 335,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getParameterSlot(int)",
      "begin_line": 339,
      "end_line": 341,
      "comment": " Returns the slot representing the index-th parameter. ",
      "child_ranges": [
        "(line 340,col 7)-(line 340,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getParameterName(int)",
      "begin_line": 344,
      "end_line": 352,
      "comment": " Returns the name for the index-th parameter within the function. ",
      "child_ranges": [
        "(line 345,col 7)-(line 345,col 20)",
        "(line 346,col 7)-(line 350,col 7)",
        "(line 351,col 7)-(line 351,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getFirstParameter()",
      "begin_line": 355,
      "end_line": 357,
      "comment": " Returns the node containing the first parameter\u0027s name. ",
      "child_ranges": [
        "(line 356,col 7)-(line 356,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getJSType()",
      "begin_line": 360,
      "end_line": 362,
      "comment": " Returns the JSType of this function. ",
      "child_ranges": [
        "(line 361,col 7)-(line 361,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getInstanceType()",
      "begin_line": 368,
      "end_line": 376,
      "comment": "\n     * Returns the concrete type representing instances of this type or null if\n     * it has none.\n     ",
      "child_ranges": [
        "(line 369,col 7)-(line 374,col 7)",
        "(line 375,col 7)-(line 375,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getPrototypeType()",
      "begin_line": 379,
      "end_line": 385,
      "comment": " Returns the concrete type representing the prototype of this type. ",
      "child_ranges": [
        "(line 380,col 7)-(line 383,col 7)",
        "(line 384,col 7)-(line 384,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getSuperclassType()",
      "begin_line": 388,
      "end_line": 392,
      "comment": " Returns the type of the superclass (or null if none exists). ",
      "child_ranges": [
        "(line 389,col 7)-(line 389,col 77)",
        "(line 390,col 7)-(line 391,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.getScope()",
      "begin_line": 395,
      "end_line": 400,
      "comment": " Returns the scope for the body of this function. ",
      "child_ranges": [
        "(line 396,col 7)-(line 398,col 7)",
        "(line 399,col 7)-(line 399,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.toString()",
      "begin_line": 408,
      "end_line": 437,
      "comment": "\n     * Informally, a function is represented by\n     * {@code function (params): returnType} where the {@code params} is a comma\n     * separated list of types, the first one being a special\n     * {@code this:T} if the function expects a known type for {@code this}.\n     ",
      "child_ranges": [
        "(line 409,col 7)-(line 409,col 46)",
        "(line 410,col 7)-(line 410,col 29)",
        "(line 411,col 7)-(line 411,col 69)",
        "(line 412,col 7)-(line 415,col 7)",
        "(line 417,col 7)-(line 417,col 35)",
        "(line 418,col 7)-(line 420,col 7)",
        "(line 421,col 7)-(line 429,col 7)",
        "(line 431,col 7)-(line 431,col 20)",
        "(line 432,col 7)-(line 435,col 7)",
        "(line 436,col 7)-(line 436,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteInstanceType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ConcreteType"
      ],
      "begin_line": 449,
      "end_line": 545,
      "comment": "\n   * Represents a specific constructor in the source code.  Note that we assume\n   * the factory creates only a single instance of this class for a given\n   * declaration, so we do not need to override {@code Object.equals}.\n   *\n   * The {@code StaticScope} contains a slot for each property defined on the\n   * instance type and the scope parent chain follows the prototype chain\n   * hierarchy.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": " Factory for creating types and scopes. "
    },
    {
      "type": "field",
      "varNames": [
        "instanceType"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": " Stores the normal type information for this instance. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": " The type information for the implicit prototype of this type, if any. "
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": "\n     * A scope containing the properties of this instance, created on demand.\n     * Its parent scope corresponds to the scope of the implicit prototype.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.ConcreteInstanceType(com.google.javascript.jscomp.ConcreteType.Factory, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 465,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 466,col 7)-(line 466,col 29)",
        "(line 467,col 7)-(line 467,col 39)",
        "(line 469,col 7)-(line 469,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.isInstance()",
      "begin_line": 472,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 472,col 38)-(line 472,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.toInstance()",
      "begin_line": 474,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 474,col 51)-(line 474,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.isFunctionPrototype()",
      "begin_line": 477,
      "end_line": 479,
      "comment": " Determines whether this is a function prototype type. ",
      "child_ranges": [
        "(line 478,col 7)-(line 478,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.getPropertySlot(java.lang.String)",
      "begin_line": 482,
      "end_line": 484,
      "comment": " Returns the slot representing the property with the given name. ",
      "child_ranges": [
        "(line 483,col 7)-(line 483,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.getInstanceTypeWithProperty(java.lang.String)",
      "begin_line": 490,
      "end_line": 511,
      "comment": "\n     * Returns the closest instance type in the prototype chain that contains\n     * the given property.\n     ",
      "child_ranges": [
        "(line 491,col 7)-(line 510,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.getImplicitPrototype()",
      "begin_line": 514,
      "end_line": 523,
      "comment": " Returns the type representing the implicit prototype. ",
      "child_ranges": [
        "(line 515,col 7)-(line 521,col 7)",
        "(line 522,col 7)-(line 522,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.getConstructorType()",
      "begin_line": 526,
      "end_line": 534,
      "comment": " Returns the type of the constructor or null if this has none. ",
      "child_ranges": [
        "(line 527,col 7)-(line 533,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.getScope()",
      "begin_line": 537,
      "end_line": 542,
      "comment": " Returns the scope of this type in the prototype chain. ",
      "child_ranges": [
        "(line 538,col 7)-(line 540,col 7)",
        "(line 541,col 7)-(line 541,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.toString()",
      "begin_line": 544,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 544,col 42)-(line 544,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteUnionType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ConcreteType"
      ],
      "begin_line": 552,
      "end_line": 632,
      "comment": "\n   * Represents a finite set of possible alternatives for this type.  Note that\n   * we make no effort to merge different array types into one array type, so\n   * clients should not assume there is only one array in a set.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "alternatives"
      ],
      "begin_line": 553,
      "end_line": 553,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.ConcreteUnionType(com.google.javascript.jscomp.ConcreteType...)",
      "begin_line": 555,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 556,col 7)-(line 556,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.ConcreteUnionType(java.util.Set\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 559,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 560,col 7)-(line 560,col 59)",
        "(line 561,col 7)-(line 561,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.isUnion()",
      "begin_line": 564,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 564,col 35)-(line 564,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.toUnion()",
      "begin_line": 566,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 566,col 45)-(line 566,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.unionWith(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 568,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 569,col 7)-(line 591,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.intersectWith(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 594,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 595,col 7)-(line 608,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.getAlternatives()",
      "begin_line": 612,
      "end_line": 612,
      "comment": " Returns all of the types in this set of alternatives. ",
      "child_ranges": [
        "(line 612,col 43)-(line 612,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.equals(java.lang.Object)",
      "begin_line": 614,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 615,col 7)-(line 616,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.hashCode()",
      "begin_line": 619,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 620,col 7)-(line 620,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.toString()",
      "begin_line": 623,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 624,col 7)-(line 624,col 48)",
        "(line 625,col 7)-(line 627,col 7)",
        "(line 628,col 7)-(line 628,col 30)",
        "(line 630,col 7)-(line 630,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteAll",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ConcreteType"
      ],
      "begin_line": 635,
      "end_line": 643,
      "comment": " Implements the set of all concrete types. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteAll.isAll()",
      "begin_line": 636,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 636,col 33)-(line 636,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteAll.unionWith(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 638,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 638,col 60)-(line 638,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteAll.intersectWith(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 640,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 640,col 64)-(line 640,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteAll.toString()",
      "begin_line": 642,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 642,col 42)-(line 642,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteUniqueType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ConcreteType"
      ],
      "begin_line": 653,
      "end_line": 672,
      "comment": "\n   * Represents an opaque singleton type that is different from any other.\n   * This is used by DisambiguateProperties to rename GETPROP nodes that are\n   * never reached in the TightenTypes flow analysis. This helps subsequent\n   * passes remove unreferenced properties and functions.  ID passed to the\n   * constructor should be unique per-instance as it is used for generating\n   * nice, unique, names in {@code toString()}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 654,
      "end_line": 654,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType.ConcreteUniqueType(int)",
      "begin_line": 656,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 657,col 7)-(line 657,col 19)",
        "(line 659,col 7)-(line 659,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType.equals(java.lang.Object)",
      "begin_line": 662,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 663,col 7)-(line 664,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType.hashCode()",
      "begin_line": 667,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 668,col 7)-(line 668,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType.toString()",
      "begin_line": 671,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 671,col 42)-(line 671,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Factory",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 680,
      "end_line": 717,
      "comment": "\n   * Factory for function and instance (singleton) types and scopes.  It is\n   * important that both function and instance types are singletons because\n   * callers may try to create the same one multiple times, and if multiple\n   * exist, they will not necessarily all receive the same type information.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Factory.createConcreteFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 682,
      "end_line": 683,
      "comment": " Returns the singleton concrete type for the given function. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Factory.createConcreteInstance(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 686,
      "end_line": 686,
      "comment": " Returns the singleton concrete type for the given instance type. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Factory.getConcreteFunction(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 692,
      "end_line": 692,
      "comment": "\n     * Returns the already created concrete function type for the given type or\n     * null if none exists.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Factory.getConcreteInstance(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 698,
      "end_line": 698,
      "comment": "\n     * Returns the already created concrete instance type for the given type or\n     * null if none exists.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Factory.createFunctionScope(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 705,
      "end_line": 706,
      "comment": "\n     * Returns a (nested) scope for the given function.  This will include\n     * slots for $call, $return, each parameter, and the slots declared in the\n     * body of the function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Factory.createInstanceScope(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 713,
      "end_line": 713,
      "comment": "\n     * Returns a scope for the given instance type, nested inside the given\n     * scope of the prototype.  This will include slots for each of the\n     * properties on our type.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteType.Factory.getTypeRegistry()",
      "begin_line": 716,
      "end_line": 716,
      "comment": " Returns the type registry used by this factory. ",
      "child_ranges": []
    }
  ]
}