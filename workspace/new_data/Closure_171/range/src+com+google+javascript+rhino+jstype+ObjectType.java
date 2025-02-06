{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/ObjectType.java",
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
      "end_line": 636,
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
      "signature": "com.google.javascript.rhino.jstype.ObjectType.ObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getRootNode()",
      "begin_line": 95,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 96,col 31)-(line 96,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getParentScope()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertyMap()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n   * Returns the property map that manages the set of properties for an object.\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getSlot(java.lang.String)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n   * Default getSlot implementation. This gets overridden by FunctionType\n   * for lazily-resolved prototypes.\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getOwnSlot(java.lang.String)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getTypeOfThis()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getTemplateTypes()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n   * Gets the declared default element type.\n   * @see TemplatizedType\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getJSDocInfo()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n   * Gets the docInfo for this type.\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.setJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n   * Sets the docInfo for this type from the given\n   * {@link JSDocInfo}. The {@code JSDocInfo} may be {@code null}.\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.detectImplicitPrototypeCycle()",
      "begin_line": 161,
      "end_line": 181,
      "comment": "\n   * Detects a cycle in the implicit prototype chain. This method accesses\n   * the {@link #getImplicitPrototype()} method and must therefore be\n   * invoked only after the object is sufficiently initialized to respond to\n   * calls to this method.\u003cp\u003e\n   *\n   * @return True iff an implicit prototype cycle was detected.\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 24)",
        "(line 164,col 5)-(line 164,col 42)",
        "(line 165,col 5)-(line 172,col 5)",
        "(line 175,col 5)-(line 175,col 13)",
        "(line 176,col 5)-(line 179,col 24)",
        "(line 180,col 5)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.detectInheritanceCycle()",
      "begin_line": 189,
      "end_line": 197,
      "comment": "\n   * Detects cycles in either the implicit prototype chain, or the implemented/extended\n   * interfaces.\u003cp\u003e\n   *\n   * @return True iff a cycle was detected.\n   ",
      "child_ranges": [
        "(line 194,col 5)-(line 196,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getReferenceName()",
      "begin_line": 206,
      "end_line": 206,
      "comment": "\n   * Gets the reference name for this object. This includes named types\n   * like constructors, prototypes, and enums. It notably does not include\n   * literal types like strings and booleans and structural types.\n   * @return the object\u0027s name or {@code null} if this is an anonymous\n   *         object\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getNormalizedReferenceName()",
      "begin_line": 217,
      "end_line": 226,
      "comment": "\n   * Due to the complexity of some of our internal type systems, sometimes\n   * we have different types constructed by the same constructor.\n   * In other parts of the type system, these are called delegates.\n   * We construct these types by appending suffixes to the constructor name.\n   *\n   * The normalized reference name does not have these suffixes, and as such,\n   * recollapses these implicit types back to their real type.\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 37)",
        "(line 219,col 5)-(line 224,col 5)",
        "(line 225,col 5)-(line 225,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getDisplayName()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix(java.lang.String)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n   * Creates a suffix for a proxy delegate.\n   * @see #getNormalizedReferenceName\n   ",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasReferenceName()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n   * Returns true if the object is named.\n   * @return true if the object is named, false if it is anonymous\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 249,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 54)",
        "(line 253,col 5)-(line 255,col 5)",
        "(line 257,col 5)-(line 262,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getConstructor()",
      "begin_line": 270,
      "end_line": 270,
      "comment": "\n   * Gets this object\u0027s constructor.\n   * @return this object\u0027s constructor or {@code null} if it is a native\n   * object (constructed natively v.s. by instantiation of a function)\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getImplicitPrototype()",
      "begin_line": 275,
      "end_line": 275,
      "comment": "\n   * Gets the implicit prototype (a.k.a. the {@code [[Prototype]]} property).\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 284,
      "end_line": 293,
      "comment": "\n   * Defines a property whose type is explicitly declared by the programmer.\n   * @param propertyName the property\u0027s name\n   * @param type the type\n   * @param propertyNode the node corresponding to the declaration of property\n   *        which might later be accessed using {@code getPropertyNode}.\n   ",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 77)",
        "(line 291,col 5)-(line 291,col 56)",
        "(line 292,col 5)-(line 292,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.defineSynthesizedProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n   * Defines a property whose type is on a synthesized object. These objects\n   * don\u0027t actually exist in the user\u0027s program. They\u0027re just used for\n   * bookkeeping in the type system.\n   ",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.defineInferredProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 312,
      "end_line": 335,
      "comment": "\n   * Defines a property whose type is inferred.\n   * @param propertyName the property\u0027s name\n   * @param type the type\n   * @param propertyNode the node corresponding to the inferred definition of\n   *        property that might later be accessed using {@code getPropertyNode}.\n   ",
      "child_ranges": [
        "(line 314,col 5)-(line 314,col 60)",
        "(line 315,col 5)-(line 323,col 5)",
        "(line 325,col 5)-(line 326,col 22)",
        "(line 332,col 5)-(line 332,col 56)",
        "(line 334,col 5)-(line 334,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 353,
      "end_line": 354,
      "comment": "\n   * Defines a property.\u003cp\u003e\n   *\n   * For clarity, callers should prefer {@link #defineDeclaredProperty} and\n   * {@link #defineInferredProperty}.\n   *\n   * @param propertyName the property\u0027s name\n   * @param type the type\n   * @param inferred {@code true} if this property\u0027s type is inferred\n   * @param propertyNode the node that represents the definition of property.\n   *        Depending on the actual sub-type the node type might be different.\n   *        The general idea is to have an estimate of where in the source code\n   *        this property is defined.\n   * @return True if the property was registered successfully, false if this\n   *        conflicts with a previous property type declaration.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.removeProperty(java.lang.String)",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n   * Removes the declared or inferred property from this ObjectType.\n   *\n   * @param propertyName the property\u0027s name\n   * @return true if the property was removed successfully. False if the\n   *         property did not exist, or could not be removed.\n   ",
      "child_ranges": [
        "(line 364,col 5)-(line 364,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertyNode(java.lang.String)",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\n   * Gets the node corresponding to the definition of the specified property.\n   * This could be the node corresponding to declaration of the property or the\n   * node corresponding to the first reference to this property, e.g.,\n   * \"this.propertyName\" in a constructor. Note this is mainly intended to be\n   * an estimate of where in the source code a property is defined. Sometime\n   * the returned node is not even part of the global AST but in the AST of the\n   * JsDoc that defines a type.\n   *\n   * @param propertyName the name of the property\n   * @return the {@code Node} corresponding to the property or null.\n   ",
      "child_ranges": [
        "(line 380,col 5)-(line 380,col 39)",
        "(line 381,col 5)-(line 381,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyJSDocInfo(java.lang.String)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "\n   * Gets the docInfo on the specified property on this type.  This should not\n   * be implemented recursively, as you generally need to know exactly on\n   * which type in the prototype chain the JSDocInfo exists.\n   ",
      "child_ranges": [
        "(line 390,col 5)-(line 390,col 42)",
        "(line 391,col 5)-(line 391,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n   * Sets the docInfo for the specified property from the\n   * {@link JSDocInfo} on its definition.\n   * @param info {@code JSDocInfo} for the property definition. May be\n   *        {@code null}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.findPropertyType(java.lang.String)",
      "begin_line": 404,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 406,col 5)-(line 407,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertyType(java.lang.String)",
      "begin_line": 421,
      "end_line": 432,
      "comment": "\n   * Gets the property type of the property whose name is given. If the\n   * underlying object does not have this property, the Unknown type is\n   * returned to indicate that no information is available on this property.\n   *\n   * This gets overridden by FunctionType for lazily-resolved call() and\n   * bind() functions.\n   *\n   * @return the property\u0027s type or {@link UnknownType}. This method never\n   *         returns {@code null}.\n   ",
      "child_ranges": [
        "(line 422,col 5)-(line 422,col 52)",
        "(line 423,col 5)-(line 430,col 5)",
        "(line 431,col 5)-(line 431,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasProperty(java.lang.String)",
      "begin_line": 434,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 437,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasOwnProperty(java.lang.String)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n   * Checks whether the property whose name is given is present directly on\n   * the object.  Returns false even if it is declared on a supertype.\n   ",
      "child_ranges": [
        "(line 445,col 5)-(line 445,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyNames()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n   * Returns the names of all the properties directly on this type.\n   *\n   * Overridden by FunctionType to add \"prototype\".\n   ",
      "child_ranges": [
        "(line 454,col 5)-(line 454,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isPropertyTypeInferred(java.lang.String)",
      "begin_line": 460,
      "end_line": 463,
      "comment": "\n   * Checks whether the property\u0027s type is inferred.\n   ",
      "child_ranges": [
        "(line 461,col 5)-(line 461,col 52)",
        "(line 462,col 5)-(line 462,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isPropertyTypeDeclared(java.lang.String)",
      "begin_line": 468,
      "end_line": 471,
      "comment": "\n   * Checks whether the property\u0027s type is declared.\n   ",
      "child_ranges": [
        "(line 469,col 5)-(line 469,col 52)",
        "(line 470,col 5)-(line 470,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasOwnDeclaredProperty(java.lang.String)",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\n   * Whether the given property is declared on this object.\n   ",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isPropertyInExterns(java.lang.String)",
      "begin_line": 481,
      "end_line": 484,
      "comment": " Checks whether the property was defined in the externs. ",
      "child_ranges": [
        "(line 482,col 5)-(line 482,col 39)",
        "(line 483,col 5)-(line 483,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertiesCount()",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\n   * Gets the number of properties of this object.\n   ",
      "child_ranges": [
        "(line 490,col 5)-(line 490,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPropertyNames()",
      "begin_line": 497,
      "end_line": 501,
      "comment": "\n   * Returns a list of properties defined or inferred on this type and any of\n   * its supertypes.\n   ",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 42)",
        "(line 499,col 5)-(line 499,col 32)",
        "(line 500,col 5)-(line 500,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.collectPropertyNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n   * Adds any properties defined on this type or its supertypes to the set.\n   ",
      "child_ranges": [
        "(line 507,col 5)-(line 507,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 510,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 5)-(line 512,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 5)-(line 516,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 529,
      "end_line": 541,
      "comment": "\n   * Checks that the prototype is an implicit prototype of this object. Since\n   * each object has an implicit prototype, an implicit prototype\u0027s\n   * implicit prototype is also this implicit prototype\u0027s.\n   *\n   * @param prototype any prototype based object\n   *\n   * @return {@code true} if {@code prototype} is {@code equal} to any\n   *         object in this object\u0027s implicit prototype chain.\n   ",
      "child_ranges": [
        "(line 530,col 5)-(line 539,col 5)",
        "(line 540,col 5)-(line 540,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getPossibleToBooleanOutcomes()",
      "begin_line": 543,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 5)-(line 545,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isUnknownType()",
      "begin_line": 552,
      "end_line": 572,
      "comment": "\n   * We treat this as the unknown type if any of its implicit prototype\n   * properties is unknown.\n   ",
      "child_ranges": [
        "(line 556,col 5)-(line 570,col 5)",
        "(line 571,col 5)-(line 571,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isObject()",
      "begin_line": 574,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 576,col 5)-(line 576,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.hasCachedValues()",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n   * Returns true if any cached values have been set for this type.  If true,\n   * then the prototype chain should not be changed, as it might invalidate the\n   * cached values.\n   ",
      "child_ranges": [
        "(line 585,col 5)-(line 585,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.clearCachedValues()",
      "begin_line": 592,
      "end_line": 594,
      "comment": "\n   * Clear cached values. Should be called before making changes to a prototype\n   * that may have been changed since creation.\n   ",
      "child_ranges": [
        "(line 593,col 5)-(line 593,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isNativeObjectType()",
      "begin_line": 597,
      "end_line": 599,
      "comment": " Whether this is a built-in object. ",
      "child_ranges": [
        "(line 598,col 5)-(line 598,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.cast(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n   * A null-safe version of JSType#toObjectType.\n   ",
      "child_ranges": [
        "(line 605,col 5)-(line 605,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.isFunctionPrototypeType()",
      "begin_line": 608,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 610,col 5)-(line 610,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getOwnerFunction()",
      "begin_line": 614,
      "end_line": 616,
      "comment": " Gets the owner of this if it\u0027s a function prototype. ",
      "child_ranges": [
        "(line 615,col 5)-(line 615,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 619,
      "end_line": 619,
      "comment": " Sets the owner function. By default, does nothing. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getCtorImplementedInterfaces()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\n   * Gets the interfaces implemented by the ctor associated with this type.\n   * Intended to be overridden by subclasses.\n   ",
      "child_ranges": [
        "(line 626,col 5)-(line 626,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ObjectType.getCtorExtendedInterfaces()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\n   * Gets the interfaces extended by the interface associated with this type.\n   * Intended to be overridden by subclasses.\n   ",
      "child_ranges": [
        "(line 634,col 5)-(line 634,col 29)"
      ]
    }
  ]
}