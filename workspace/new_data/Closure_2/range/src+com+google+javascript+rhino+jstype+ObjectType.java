{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/ObjectType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.JSType",
        "com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 82,
      "end_line": 648,
      "comment": "\n * Object type.\n *\n * In JavaScript, all object types have properties, and each of those\n * properties has a type. Property types may be DECLARED, INFERRED, or\n * UNKNOWN.\n *\n * DECLARED properties have an explicit type annotation, as in:\n * \u003ccode\u003e\n * /xx @type {number} x/\n * Foo.prototype.bar \u003d 1;\n * \u003c/code\u003e\n * This property may only hold number values, and an assignment to any\n * other type of value is an error.\n *\n * INFERRED properties do not have an explicit type annotation. Rather,\n * we try to find all the possible types that this property can hold.\n * \u003ccode\u003e\n * Foo.prototype.bar \u003d 1;\n * \u003c/code\u003e\n * If the programmer assigns other types of values to this property,\n * the property will take on the union of all these types.\n *\n * UNKNOWN properties are properties on the UNKNOWN type. The UNKNOWN\n * type has all properties, but we do not know whether they are\n * declared or inferred.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "docInfo"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unknown"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.ObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.ObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.common.collect.ImmutableList\u003cjava.lang.String\u003e, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getRootNode()",
      "begin_line": 96,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 97,col 31)-(line 97,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getParentScope()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertyMap()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n   * Returns the property map that manages the set of properties for an object.\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getSlot(java.lang.String)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n   * Default getSlot implementation. This gets overridden by FunctionType\n   * for lazily-resolved prototypes.\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getOwnSlot(java.lang.String)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getTypeOfThis()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getParameterType()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n   * Gets the declared default element type.\n   * @see ParameterizedType\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getIndexType()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n   * Gets the declared default index type.\n   * @see IndexedType\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getJSDocInfo()",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\n   * Gets the docInfo for this type.\n   ",
      "child_ranges": [
        "(line 151,col 5)-(line 157,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.setJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n   * Sets the docInfo for this type from the given\n   * {@link JSDocInfo}. The {@code JSDocInfo} may be {@code null}.\n   ",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.detectImplicitPrototypeCycle()",
      "begin_line": 176,
      "end_line": 196,
      "comment": "\n   * Detects a cycle in the implicit prototype chain. This method accesses\n   * the {@link #getImplicitPrototype()} method and must therefore be\n   * invoked only after the object is sufficiently initialized to respond to\n   * calls to this method.\u003cp\u003e\n   *\n   * @return True iff an implicit prototype cycle was detected.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 24)",
        "(line 179,col 5)-(line 179,col 42)",
        "(line 180,col 5)-(line 187,col 5)",
        "(line 190,col 5)-(line 190,col 13)",
        "(line 191,col 5)-(line 194,col 24)",
        "(line 195,col 5)-(line 195,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.detectInheritanceCycle()",
      "begin_line": 204,
      "end_line": 212,
      "comment": "\n   * Detects cycles in either the implicit prototype chain, or the implemented/extended\n   * interfaces.\u003cp\u003e\n   *\n   * @return True iff a cycle was detected.\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 211,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getReferenceName()",
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n   * Gets the reference name for this object. This includes named types\n   * like constructors, prototypes, and enums. It notably does not include\n   * literal types like strings and booleans and structural types.\n   * @return the object\u0027s name or {@code null} if this is an anonymous\n   *         object\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getNormalizedReferenceName()",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\n   * Due to the complexity of some of our internal type systems, sometimes\n   * we have different types constructed by the same constructor.\n   * In other parts of the type system, these are called delegates.\n   * We construct these types by appending suffixes to the constructor name.\n   *\n   * The normalized reference name does not have these suffixes, and as such,\n   * recollapses these implicit types back to their real type.\n   ",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 37)",
        "(line 234,col 5)-(line 239,col 5)",
        "(line 240,col 5)-(line 240,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getDisplayName()",
      "begin_line": 243,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix(java.lang.String)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n   * Creates a suffix for a proxy delegate.\n   * @see #getNormalizedReferenceName\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasReferenceName()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n   * Returns true if the object is named.\n   * @return true if the object is named, false if it is anonymous\n   ",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 264,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 54)",
        "(line 268,col 5)-(line 270,col 5)",
        "(line 272,col 5)-(line 277,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getConstructor()",
      "begin_line": 285,
      "end_line": 285,
      "comment": "\n   * Gets this object\u0027s constructor.\n   * @return this object\u0027s constructor or {@code null} if it is a native\n   * object (constructed natively v.s. by instantiation of a function)\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getImplicitPrototype()",
      "begin_line": 290,
      "end_line": 290,
      "comment": "\n   * Gets the implicit prototype (a.k.a. the {@code [[Prototype]]} property).\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 299,
      "end_line": 308,
      "comment": "\n   * Defines a property whose type is explicitly declared by the programmer.\n   * @param propertyName the property\u0027s name\n   * @param type the type\n   * @param propertyNode the node corresponding to the declaration of property\n   *        which might later be accessed using {@code getPropertyNode}.\n   ",
      "child_ranges": [
        "(line 301,col 5)-(line 301,col 77)",
        "(line 306,col 5)-(line 306,col 56)",
        "(line 307,col 5)-(line 307,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.defineSynthesizedProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n   * Defines a property whose type is on a synthesized object. These objects\n   * don\u0027t actually exist in the user\u0027s program. They\u0027re just used for\n   * bookkeeping in the type system.\n   ",
      "child_ranges": [
        "(line 317,col 5)-(line 317,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.defineInferredProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 327,
      "end_line": 350,
      "comment": "\n   * Defines a property whose type is inferred.\n   * @param propertyName the property\u0027s name\n   * @param type the type\n   * @param propertyNode the node corresponding to the inferred definition of\n   *        property that might later be accessed using {@code getPropertyNode}.\n   ",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 60)",
        "(line 330,col 5)-(line 338,col 5)",
        "(line 340,col 5)-(line 341,col 22)",
        "(line 347,col 5)-(line 347,col 56)",
        "(line 349,col 5)-(line 349,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 368,
      "end_line": 369,
      "comment": "\n   * Defines a property.\u003cp\u003e\n   *\n   * For clarity, callers should prefer {@link #defineDeclaredProperty} and\n   * {@link #defineInferredProperty}.\n   *\n   * @param propertyName the property\u0027s name\n   * @param type the type\n   * @param inferred {@code true} if this property\u0027s type is inferred\n   * @param propertyNode the node that represents the definition of property.\n   *        Depending on the actual sub-type the node type might be different.\n   *        The general idea is to have an estimate of where in the source code\n   *        this property is defined.\n   * @return True if the property was registered successfully, false if this\n   *        conflicts with a previous property type declaration.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.removeProperty(java.lang.String)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n   * Removes the declared or inferred property from this ObjectType.\n   *\n   * @param propertyName the property\u0027s name\n   * @return true if the property was removed successfully. False if the\n   *         property did not exist, or could not be removed.\n   ",
      "child_ranges": [
        "(line 379,col 5)-(line 379,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertyNode(java.lang.String)",
      "begin_line": 394,
      "end_line": 397,
      "comment": "\n   * Gets the node corresponding to the definition of the specified property.\n   * This could be the node corresponding to declaration of the property or the\n   * node corresponding to the first reference to this property, e.g.,\n   * \"this.propertyName\" in a constructor. Note this is mainly intended to be\n   * an estimate of where in the source code a property is defined. Sometime\n   * the returned node is not even part of the global AST but in the AST of the\n   * JsDoc that defines a type.\n   *\n   * @param propertyName the name of the property\n   * @return the {@code Node} corresponding to the property or null.\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 39)",
        "(line 396,col 5)-(line 396,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyJSDocInfo(java.lang.String)",
      "begin_line": 404,
      "end_line": 407,
      "comment": "\n   * Gets the docInfo on the specified property on this type.  This should not\n   * be implemented recursively, as you generally need to know exactly on\n   * which type in the prototype chain the JSDocInfo exists.\n   ",
      "child_ranges": [
        "(line 405,col 5)-(line 405,col 42)",
        "(line 406,col 5)-(line 406,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n   * Sets the docInfo for the specified property from the\n   * {@link JSDocInfo} on its definition.\n   * @param info {@code JSDocInfo} for the property definition. May be\n   *        {@code null}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.findPropertyType(java.lang.String)",
      "begin_line": 419,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 421,col 5)-(line 422,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertyType(java.lang.String)",
      "begin_line": 436,
      "end_line": 447,
      "comment": "\n   * Gets the property type of the property whose name is given. If the\n   * underlying object does not have this property, the Unknown type is\n   * returned to indicate that no information is available on this property.\n   *\n   * This gets overridden by FunctionType for lazily-resolved call() and\n   * bind() functions.\n   *\n   * @return the property\u0027s type or {@link UnknownType}. This method never\n   *         returns {@code null}.\n   ",
      "child_ranges": [
        "(line 437,col 5)-(line 437,col 52)",
        "(line 438,col 5)-(line 445,col 5)",
        "(line 446,col 5)-(line 446,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasProperty(java.lang.String)",
      "begin_line": 449,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 452,col 5)-(line 452,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasOwnProperty(java.lang.String)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n   * Checks whether the property whose name is given is present directly on\n   * the object.  Returns false even if it is declared on a supertype.\n   ",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyNames()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n   * Returns the names of all the properties directly on this type.\n   *\n   * Overridden by FunctionType to add \"prototype\".\n   ",
      "child_ranges": [
        "(line 469,col 5)-(line 469,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isPropertyTypeInferred(java.lang.String)",
      "begin_line": 475,
      "end_line": 478,
      "comment": "\n   * Checks whether the property\u0027s type is inferred.\n   ",
      "child_ranges": [
        "(line 476,col 5)-(line 476,col 52)",
        "(line 477,col 5)-(line 477,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isPropertyTypeDeclared(java.lang.String)",
      "begin_line": 483,
      "end_line": 486,
      "comment": "\n   * Checks whether the property\u0027s type is declared.\n   ",
      "child_ranges": [
        "(line 484,col 5)-(line 484,col 52)",
        "(line 485,col 5)-(line 485,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasOwnDeclaredProperty(java.lang.String)",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\n   * Whether the given property is declared on this object.\n   ",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isPropertyInExterns(java.lang.String)",
      "begin_line": 496,
      "end_line": 499,
      "comment": " Checks whether the property was defined in the externs. ",
      "child_ranges": [
        "(line 497,col 5)-(line 497,col 39)",
        "(line 498,col 5)-(line 498,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertiesCount()",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n   * Gets the number of properties of this object.\n   ",
      "child_ranges": [
        "(line 505,col 5)-(line 505,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertyNames()",
      "begin_line": 512,
      "end_line": 516,
      "comment": "\n   * Returns a list of properties defined or inferred on this type and any of\n   * its supertypes.\n   ",
      "child_ranges": [
        "(line 513,col 5)-(line 513,col 42)",
        "(line 514,col 5)-(line 514,col 32)",
        "(line 515,col 5)-(line 515,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.collectPropertyNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n   * Adds any properties defined on this type or its supertypes to the set.\n   ",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 525,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 527,col 5)-(line 527,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 530,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 531,col 5)-(line 531,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 544,
      "end_line": 553,
      "comment": "\n   * Checks that the prototype is an implicit prototype of this object. Since\n   * each object has an implicit prototype, an implicit prototype\u0027s\n   * implicit prototype is also this implicit prototype\u0027s.\n   *\n   * @param prototype any prototype based object\n   *\n   * @return {@code true} if {@code prototype} is {@code equal} to any\n   *         object in this object\u0027s implicit prototype chain.\n   ",
      "child_ranges": [
        "(line 545,col 5)-(line 551,col 5)",
        "(line 552,col 5)-(line 552,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPossibleToBooleanOutcomes()",
      "begin_line": 555,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 557,col 5)-(line 557,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isUnknownType()",
      "begin_line": 564,
      "end_line": 584,
      "comment": "\n   * We treat this as the unknown type if any of its implicit prototype\n   * properties is unknown.\n   ",
      "child_ranges": [
        "(line 568,col 5)-(line 582,col 5)",
        "(line 583,col 5)-(line 583,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isObject()",
      "begin_line": 586,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 588,col 5)-(line 588,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasCachedValues()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n   * Returns true if any cached values have been set for this type.  If true,\n   * then the prototype chain should not be changed, as it might invalidate the\n   * cached values.\n   ",
      "child_ranges": [
        "(line 597,col 5)-(line 597,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.clearCachedValues()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n   * Clear cached values. Should be called before making changes to a prototype\n   * that may have been changed since creation.\n   ",
      "child_ranges": [
        "(line 605,col 5)-(line 605,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isNativeObjectType()",
      "begin_line": 609,
      "end_line": 611,
      "comment": " Whether this is a built-in object. ",
      "child_ranges": [
        "(line 610,col 5)-(line 610,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.cast(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 616,
      "end_line": 618,
      "comment": "\n   * A null-safe version of JSType#toObjectType.\n   ",
      "child_ranges": [
        "(line 617,col 5)-(line 617,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isFunctionPrototypeType()",
      "begin_line": 620,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 622,col 5)-(line 622,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getOwnerFunction()",
      "begin_line": 626,
      "end_line": 628,
      "comment": " Gets the owner of this if it\u0027s a function prototype. ",
      "child_ranges": [
        "(line 627,col 5)-(line 627,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 631,
      "end_line": 631,
      "comment": " Sets the owner function. By default, does nothing. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getCtorImplementedInterfaces()",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\n   * Gets the interfaces implemented by the ctor associated with this type.\n   * Intended to be overridden by subclasses.\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getCtorExtendedInterfaces()",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n   * Gets the interfaces extended by the interface associated with this type.\n   * Intended to be overridden by subclasses.\n   ",
      "child_ranges": [
        "(line 646,col 5)-(line 646,col 29)"
      ]
    }
  ]
}