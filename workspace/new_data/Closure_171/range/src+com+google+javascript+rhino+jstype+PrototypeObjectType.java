{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/PrototypeObjectType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrototypeObjectType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ObjectType"
      ],
      "begin_line": 69,
      "end_line": 468,
      "comment": "\n * The object type represents instances of JavaScript objects such as\n * {@code Object}, {@code Date}, {@code Function}.\u003cp\u003e\n *\n * Objects in JavaScript are unordered collections of properties.\n * Each property consists of a name, a value and a set of attributes.\u003cp\u003e\n *\n * Each instance has an implicit prototype property ({@code [[Prototype]]})\n * pointing to an object instance, which itself has an implicit property, thus\n * forming a chain.\u003cp\u003e\n *\n * A class begins life with no name.  Later, a name may be provided once it\n * can be inferred.  Note that the name in this case is strictly for\n * debugging purposes.  Looking up type name references goes through the\n * {@link JSTypeRegistry}.\u003cp\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "className"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nativeType"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "implicitPrototypeFallback"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " some subclasses override this to do special resolution handling."
    },
    {
      "type": "field",
      "varNames": [
        "ownerFunction"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " to do this for multiple functions, then we\u0027ll have to create a new one."
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " by printing all properties."
    },
    {
      "type": "field",
      "varNames": [
        "MAX_PRETTY_PRINTED_PROPERTIES"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n   * Creates an object type.\n   *\n   * @param className the name of the class.  May be {@code null} to\n   *        denote an anonymous class.\n   *\n   * @param implicitPrototype the implicit prototype\n   *        (a.k.a. {@code [[Prototype]]}) as defined by ECMA-262. If the\n   *        implicit prototype is {@code null} the implicit prototype will be\n   *        set to the {@link JSTypeNative#OBJECT_TYPE}.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.jstype.ObjectType, boolean, com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 112,
      "end_line": 127,
      "comment": "\n   * Creates an object type, allowing specification of the implicit prototype,\n   * whether the object is native, and any templatized types.\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 37)",
        "(line 116,col 5)-(line 116,col 40)",
        "(line 117,col 5)-(line 117,col 42)",
        "(line 119,col 5)-(line 119,col 31)",
        "(line 120,col 5)-(line 120,col 33)",
        "(line 121,col 5)-(line 126,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyMap()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 134,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 139,col 5)",
        "(line 140,col 5)-(line 141,col 44)",
        "(line 142,col 5)-(line 142,col 42)",
        "(line 143,col 5)-(line 143,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.removeProperty(java.lang.String)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 151,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 168,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext()",
      "begin_line": 171,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 174,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchesStringContext()",
      "begin_line": 177,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 181,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(java.lang.String)",
      "begin_line": 188,
      "end_line": 200,
      "comment": "\n   * Given the name of a native object property, checks whether the property is\n   * present on the object and different from the native one.\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 191,col 5)",
        "(line 193,col 5)-(line 193,col 56)",
        "(line 194,col 5)-(line 197,col 68)",
        "(line 198,col 5)-(line 198,col 73)",
        "(line 199,col 5)-(line 199,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.unboxesTo()",
      "begin_line": 202,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchesObjectContext()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.canBeCalled()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.toStringHelper(boolean)",
      "begin_line": 225,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 227,col 5)-(line 268,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.setPrettyPrint(boolean)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.isPrettyPrint()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getConstructor()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 281,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getImplicitPrototype()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n   * This should only be reset on the FunctionPrototypeType, only to fix an\n   * incorrectly established prototype chain due to the user having a mismatch\n   * in super class declaration, and only before properties on that type are\n   * processed.\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 35)",
        "(line 297,col 5)-(line 297,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getReferenceName()",
      "begin_line": 300,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 302,col 5)-(line 308,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.hasReferenceName()",
      "begin_line": 311,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 316,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 318,col 5)-(line 320,col 5)",
        "(line 323,col 5)-(line 327,col 5)",
        "(line 330,col 5)-(line 332,col 5)",
        "(line 337,col 5)-(line 337,col 45)",
        "(line 338,col 5)-(line 338,col 78)",
        "(line 340,col 5)-(line 353,col 5)",
        "(line 356,col 5)-(line 361,col 5)",
        "(line 362,col 5)-(line 362,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.implicitPrototypeChainIsUnknown()",
      "begin_line": 365,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 42)",
        "(line 367,col 5)-(line 372,col 5)",
        "(line 373,col 5)-(line 373,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.hasCachedValues()",
      "begin_line": 376,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.isNativeObjectType()",
      "begin_line": 382,
      "end_line": 385,
      "comment": " Whether this is a built-in object. ",
      "child_ranges": [
        "(line 384,col 5)-(line 384,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 387,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 389,col 5)-(line 389,col 68)",
        "(line 390,col 5)-(line 390,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnerFunction()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces()",
      "begin_line": 398,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 400,col 5)-(line 402,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorExtendedInterfaces()",
      "begin_line": 405,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 409,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 412,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 414,col 34)",
        "(line 416,col 5)-(line 416,col 58)",
        "(line 417,col 5)-(line 420,col 5)",
        "(line 421,col 5)-(line 423,col 5)",
        "(line 424,col 5)-(line 424,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 427,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 432,col 5)",
        "(line 443,col 5)-(line 451,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 454,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 455,col 5)-(line 465,col 5)"
      ]
    }
  ]
}