{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/NamedType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NamedType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ProxyObjectType"
      ],
      "begin_line": 82,
      "end_line": 406,
      "comment": "\n * A {@code NamedType} is a named reference to some other type.  This provides\n * a convenient mechanism for implementing forward references to types; a\n * {@code NamedType} can be used as a placeholder until its reference is\n * resolved.  It is also useful for representing type names in JsDoc type\n * annotations, some of which may never be resolved (as they may refer to\n * types in host systems not yet supported by JSCompiler, such as the JVM.)\u003cp\u003e\n *\n * An important distinction: {@code NamedType} is a type name reference,\n * whereas {@link ObjectType} is a named type object, such as an Enum name.\n * The Enum itself is typically used only in a dot operator to name one of its\n * constants, or in a declaration, where its name will appear in a\n * NamedType.\u003cp\u003e\n *\n * A {@code NamedType} is not currently a full-fledged typedef, because it\n * cannot resolve to any JavaScript type.  It can only resolve to a named\n * {@link JSTypeRegistry} type, or to {@link FunctionType} or\n * {@link EnumType}.\u003cp\u003e\n *\n * If full typedefs are to be supported, then each method on each type class\n * needs to be reviewed to make sure that everything works correctly through\n * typedefs.  Alternatively, we would need to walk through the parse tree and\n * unroll each reference to a {@code NamedType} to its resolved type before\n * applying the rest of the analysis.\u003cp\u003e\n *\n * TODO(user): Revisit all of this logic.\u003cp\u003e\n *\n * The existing typing logic is hacky.  Unresolved types should get processed\n * in a more consistent way, but with the Rhino merge coming, there will be\n * much that has to be changed.\u003cp\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineno"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charno"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n   * Validates the type resolution.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "propertyContinuations"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n   * Property-defining continuations.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.NamedType.NamedType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, java.lang.String, int, int)",
      "begin_line": 103,
      "end_line": 112,
      "comment": "\n   * Create a named type based on the reference.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 77)",
        "(line 107,col 5)-(line 107,col 42)",
        "(line 108,col 5)-(line 108,col 31)",
        "(line 109,col 5)-(line 109,col 33)",
        "(line 110,col 5)-(line 110,col 25)",
        "(line 111,col 5)-(line 111,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 114,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 130,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.finishPropertyContinuations()",
      "begin_line": 133,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 66)",
        "(line 135,col 5)-(line 141,col 5)",
        "(line 142,col 5)-(line 142,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.getReferencedType()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " Returns the type to which this refers (which is unknown if unresolved). ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.getReferenceName()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.toStringHelper(boolean)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.hasReferenceName()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.isNamedType()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.isNominalType()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.hashCode()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 183,
      "end_line": 212,
      "comment": "\n   * Resolve the referenced type within the enclosing scope.\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 45)",
        "(line 190,col 5)-(line 192,col 5)",
        "(line 194,col 5)-(line 199,col 5)",
        "(line 201,col 5)-(line 201,col 39)",
        "(line 202,col 5)-(line 204,col 5)",
        "(line 206,col 5)-(line 206,col 40)",
        "(line 207,col 5)-(line 209,col 5)",
        "(line 210,col 5)-(line 211,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.resolveViaRegistry(com.google.javascript.rhino.ErrorReporter)",
      "begin_line": 218,
      "end_line": 225,
      "comment": "\n   * Resolves a named type by looking it up in the registry.\n   * @return True if we resolved successfully.\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 46)",
        "(line 220,col 5)-(line 223,col 5)",
        "(line 224,col 5)-(line 224,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.resolveViaProperties(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 232,
      "end_line": 256,
      "comment": "\n   * Resolves a named type by looking up its first component in the scope, and\n   * subsequent components as properties. The scope must have been fully\n   * parsed and a symbol table constructed.\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 60)",
        "(line 236,col 5)-(line 255,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.lookupViaProperties(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 264,
      "end_line": 298,
      "comment": "\n   * Resolves a type by looking up its first component in the scope, and\n   * subsequent components as properties. The scope must have been fully\n   * parsed and a symbol table constructed.\n   * @return The type of the symbol, or null if the type could not be found.\n   ",
      "child_ranges": [
        "(line 266,col 5)-(line 266,col 57)",
        "(line 267,col 5)-(line 269,col 5)",
        "(line 270,col 5)-(line 270,col 67)",
        "(line 271,col 5)-(line 273,col 5)",
        "(line 277,col 5)-(line 277,col 37)",
        "(line 278,col 5)-(line 280,col 5)",
        "(line 281,col 5)-(line 281,col 50)",
        "(line 282,col 5)-(line 284,col 5)",
        "(line 287,col 5)-(line 296,col 5)",
        "(line 297,col 5)-(line 297,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.ErrorReporter)",
      "begin_line": 300,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 302,col 5)-(line 304,col 5)",
        "(line 305,col 5)-(line 305,col 28)",
        "(line 306,col 5)-(line 306,col 36)",
        "(line 307,col 5)-(line 307,col 30)",
        "(line 308,col 5)-(line 308,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(com.google.javascript.rhino.ErrorReporter)",
      "begin_line": 311,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 313,col 65)",
        "(line 314,col 5)-(line 315,col 36)",
        "(line 316,col 5)-(line 316,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter)",
      "begin_line": 319,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 48)",
        "(line 321,col 5)-(line 324,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.checkProtoCycle(com.google.javascript.rhino.ErrorReporter)",
      "begin_line": 327,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 328,col 5)-(line 328,col 48)",
        "(line 329,col 5)-(line 331,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(com.google.javascript.rhino.ErrorReporter, boolean)",
      "begin_line": 336,
      "end_line": 359,
      "comment": " type name.",
      "child_ranges": [
        "(line 338,col 5)-(line 358,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.getTypedefType(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 361,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 362,col 5)-(line 362,col 33)",
        "(line 363,col 5)-(line 365,col 5)",
        "(line 366,col 5)-(line 366,col 34)",
        "(line 367,col 5)-(line 367,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.setValidator(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 370,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 380,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyContinuation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 384,
      "end_line": 405,
      "comment": " Store enough information to define a property at a later time. "
    },
    {
      "type": "field",
      "varNames": [
        "propertyName"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inferred"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyNode"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.NamedType.PropertyContinuation.PropertyContinuation(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 390,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 395,col 7)-(line 395,col 39)",
        "(line 396,col 7)-(line 396,col 23)",
        "(line 397,col 7)-(line 397,col 31)",
        "(line 398,col 7)-(line 398,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NamedType.PropertyContinuation.commit(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 401,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 402,col 7)-(line 403,col 54)"
      ]
    }
  ]
}