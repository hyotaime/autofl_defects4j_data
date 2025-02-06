{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/PrototypeObjectType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrototypeObjectType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ObjectType"
      ],
      "begin_line": 69,
      "end_line": 469,
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
        "(line 105,col 5)-(line 105,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.jstype.ObjectType, boolean, com.google.common.collect.ImmutableList\u003cjava.lang.String\u003e, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 112,
      "end_line": 128,
      "comment": "\n   * Creates an object type, allowing specification of the implicit prototype,\n   * whether the object is native, and any templatized types.\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 52)",
        "(line 117,col 5)-(line 117,col 40)",
        "(line 118,col 5)-(line 118,col 42)",
        "(line 120,col 5)-(line 120,col 31)",
        "(line 121,col 5)-(line 121,col 33)",
        "(line 122,col 5)-(line 127,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyMap()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 135,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 140,col 5)",
        "(line 141,col 5)-(line 142,col 44)",
        "(line 143,col 5)-(line 143,col 42)",
        "(line 144,col 5)-(line 144,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.removeProperty(java.lang.String)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 152,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 169,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext()",
      "begin_line": 172,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 175,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchesStringContext()",
      "begin_line": 178,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 182,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(java.lang.String)",
      "begin_line": 189,
      "end_line": 201,
      "comment": "\n   * Given the name of a native object property, checks whether the property is\n   * present on the object and different from the native one.\n   ",
      "child_ranges": [
        "(line 190,col 5)-(line 192,col 5)",
        "(line 194,col 5)-(line 194,col 56)",
        "(line 195,col 5)-(line 198,col 68)",
        "(line 199,col 5)-(line 199,col 73)",
        "(line 200,col 5)-(line 200,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.unboxesTo()",
      "begin_line": 203,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 213,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchesObjectContext()",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.canBeCalled()",
      "begin_line": 221,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.toStringHelper(boolean)",
      "begin_line": 226,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 269,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.setPrettyPrint(boolean)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 5)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.isPrettyPrint()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 277,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getConstructor()",
      "begin_line": 280,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getImplicitPrototype()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\n   * This should only be reset on the FunctionPrototypeType, only to fix an\n   * incorrectly established prototype chain due to the user having a mismatch\n   * in super class declaration, and only before properties on that type are\n   * processed.\n   ",
      "child_ranges": [
        "(line 297,col 5)-(line 297,col 35)",
        "(line 298,col 5)-(line 298,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getReferenceName()",
      "begin_line": 301,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 309,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.hasReferenceName()",
      "begin_line": 312,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 5)-(line 314,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 317,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 319,col 5)-(line 321,col 5)",
        "(line 324,col 5)-(line 328,col 5)",
        "(line 331,col 5)-(line 333,col 5)",
        "(line 338,col 5)-(line 338,col 45)",
        "(line 339,col 5)-(line 339,col 78)",
        "(line 341,col 5)-(line 354,col 5)",
        "(line 357,col 5)-(line 362,col 5)",
        "(line 363,col 5)-(line 363,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.implicitPrototypeChainIsUnknown()",
      "begin_line": 366,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 42)",
        "(line 368,col 5)-(line 373,col 5)",
        "(line 374,col 5)-(line 374,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.hasCachedValues()",
      "begin_line": 377,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 379,col 5)-(line 379,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.isNativeObjectType()",
      "begin_line": 383,
      "end_line": 386,
      "comment": " Whether this is a built-in object. ",
      "child_ranges": [
        "(line 385,col 5)-(line 385,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 388,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 390,col 68)",
        "(line 391,col 5)-(line 391,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnerFunction()",
      "begin_line": 394,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 396,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces()",
      "begin_line": 399,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 401,col 5)-(line 403,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorExtendedInterfaces()",
      "begin_line": 406,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 408,col 5)-(line 410,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 413,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 34)",
        "(line 417,col 5)-(line 417,col 58)",
        "(line 418,col 5)-(line 421,col 5)",
        "(line 422,col 5)-(line 424,col 5)",
        "(line 425,col 5)-(line 425,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 428,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 431,col 5)-(line 433,col 5)",
        "(line 444,col 5)-(line 452,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 455,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 456,col 5)-(line 466,col 5)"
      ]
    }
  ]
}