{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/UnionType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnionType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.JSType"
      ],
      "begin_line": 70,
      "end_line": 622,
      "comment": "\n * The {@code UnionType} implements a common JavaScript idiom in which the\n * code is specifically designed to work with multiple input types.  Because\n * JavaScript always knows the run-time type of an object value, this is safer\n * than a C union.\u003cp\u003e\n *\n * For instance, values of the union type {@code (String,boolean)} can be of\n * type {@code String} or of type {@code boolean}. The commutativity of the\n * statement is captured by making {@code (String,boolean)} and\n * {@code (boolean,String)} equal.\u003cp\u003e\n *\n * The implementation of this class prevents the creation of nested\n * unions.\u003cp\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternates"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashcode"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.UnionType.UnionType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.util.Collection\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n   * Creates a union type.\n   *\n   * @param alternates the alternates of the union\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 20)",
        "(line 83,col 5)-(line 83,col 33)",
        "(line 84,col 5)-(line 84,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getAlternates()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n   * Gets the alternate types of this union type.\n   * @return The alternate types of this union type. The returned set is\n   *     immutable.\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.matchesNumberContext()",
      "begin_line": 102,
      "end_line": 111,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * numeric context, such as an operand of a multiply operator.\n   *\n   * @return true if the type can appear in a numeric context.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 109,col 5)",
        "(line 110,col 5)-(line 110,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.matchesStringContext()",
      "begin_line": 124,
      "end_line": 133,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * {@code String} context, such as an operand of a string concat ({@code +})\n   * operator.\u003cp\u003e\n   *\n   * All types have at least the potential for converting to {@code String}.\n   * When we add externally defined types, such as a browser OM, we may choose\n   * to add types that do not automatically convert to {@code String}.\n   *\n   * @return {@code true} if not {@link VoidType}\n   ",
      "child_ranges": [
        "(line 127,col 5)-(line 131,col 5)",
        "(line 132,col 5)-(line 132,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.matchesObjectContext()",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n   * This predicate is used to test whether a given type can appear in an\n   * {@code Object} context, such as the expression in a {@code with}\n   * statement.\u003cp\u003e\n   *\n   * Most types we will encounter, except notably {@code null}, have at least\n   * the potential for converting to {@code Object}.  Host defined objects can\n   * get peculiar.\u003cp\u003e\n   *\n   * VOID type is included here because while it is not part of the JavaScript\n   * language, functions returning \u0027void\u0027 type can\u0027t be used as operands of\n   * any operator or statement.\u003cp\u003e\n   *\n   * @return {@code true} if the type is not {@link NullType} or\n   *         {@link VoidType}\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 158,col 5)",
        "(line 159,col 5)-(line 159,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.findPropertyType(java.lang.String)",
      "begin_line": 162,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 31)",
        "(line 166,col 5)-(line 182,col 5)",
        "(line 184,col 5)-(line 184,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.canBeCalled()",
      "begin_line": 187,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 193,col 5)",
        "(line 194,col 5)-(line 194,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.autobox()",
      "begin_line": 197,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 65)",
        "(line 200,col 5)-(line 202,col 5)",
        "(line 203,col 5)-(line 203,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined()",
      "begin_line": 206,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 65)",
        "(line 209,col 5)-(line 211,col 5)",
        "(line 212,col 5)-(line 212,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 215,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 31)",
        "(line 218,col 5)-(line 225,col 5)",
        "(line 226,col 5)-(line 226,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isNullable()",
      "begin_line": 237,
      "end_line": 245,
      "comment": "\n   * This predicate determines whether objects of this type can have the\n   * {@code null} value, and therefore can appear in contexts where\n   * {@code null} is expected.\n   *\n   * @return {@code true} for everything but {@code Number} and\n   *         {@code Boolean} types.\n   ",
      "child_ranges": [
        "(line 239,col 5)-(line 243,col 5)",
        "(line 244,col 5)-(line 244,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isUnknownType()",
      "begin_line": 247,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 253,col 5)",
        "(line 254,col 5)-(line 254,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isStruct()",
      "begin_line": 257,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 263,col 5)",
        "(line 264,col 5)-(line 264,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isDict()",
      "begin_line": 267,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 269,col 5)-(line 273,col 5)",
        "(line 274,col 5)-(line 274,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 277,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 279,col 5)-(line 285,col 5)",
        "(line 287,col 5)-(line 287,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.meet(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 290,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 291,col 62)",
        "(line 292,col 5)-(line 296,col 5)",
        "(line 298,col 5)-(line 306,col 5)",
        "(line 307,col 5)-(line 307,col 36)",
        "(line 308,col 5)-(line 314,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 321,
      "end_line": 333,
      "comment": "\n   * Two union types are equal if they have the same number of alternates\n   * and all alternates are equal.\n   ",
      "child_ranges": [
        "(line 323,col 5)-(line 326,col 5)",
        "(line 327,col 5)-(line 331,col 5)",
        "(line 332,col 5)-(line 332,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.hasAlternate(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 335,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 336,col 5)-(line 340,col 5)",
        "(line 341,col 5)-(line 341,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.hasProperty(java.lang.String)",
      "begin_line": 344,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 350,col 5)",
        "(line 351,col 5)-(line 351,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.hashCode()",
      "begin_line": 354,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 356,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.toMaybeUnionType()",
      "begin_line": 359,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isObject()",
      "begin_line": 364,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 370,col 5)",
        "(line 371,col 5)-(line 371,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.contains(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 382,
      "end_line": 389,
      "comment": "\n   * A {@link UnionType} contains a given type (alternate) iff the member\n   * vector contains it.\n   *\n   * @param type The alternate which might be in this union.\n   *\n   * @return {@code true} if the alternate is in the union\n   ",
      "child_ranges": [
        "(line 383,col 5)-(line 387,col 5)",
        "(line 388,col 5)-(line 388,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 405,
      "end_line": 414,
      "comment": "\n   * Returns a more restricted union type than {@code this} one, in which all\n   * subtypes of {@code type} have been removed.\u003cp\u003e\n   *\n   * Examples:\n   * \u003cul\u003e\n   * \u003cli\u003e{@code (number,string)} restricted by {@code number} is\n   *     {@code string}\u003c/li\u003e\n   * \u003cli\u003e{@code (null, EvalError, URIError)} restricted by\n   *     {@code Error} is {@code null}\u003c/li\u003e\n   * \u003c/ul\u003e\n   *\n   * @param type the supertype of the types to remove from this union type\n   ",
      "child_ranges": [
        "(line 406,col 5)-(line 406,col 65)",
        "(line 407,col 5)-(line 412,col 5)",
        "(line 413,col 5)-(line 413,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.toStringHelper(boolean)",
      "begin_line": 416,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 417,col 5)-(line 417,col 47)",
        "(line 418,col 5)-(line 418,col 34)",
        "(line 420,col 5)-(line 420,col 23)",
        "(line 421,col 5)-(line 421,col 58)",
        "(line 422,col 5)-(line 422,col 30)",
        "(line 423,col 5)-(line 429,col 5)",
        "(line 430,col 5)-(line 430,col 23)",
        "(line 431,col 5)-(line 431,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 434,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 439,col 5)",
        "(line 441,col 5)-(line 443,col 5)",
        "(line 444,col 5)-(line 448,col 5)",
        "(line 449,col 5)-(line 449,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome(boolean)",
      "begin_line": 452,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 455,col 5)-(line 455,col 65)",
        "(line 456,col 5)-(line 459,col 5)",
        "(line 460,col 5)-(line 460,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getPossibleToBooleanOutcomes()",
      "begin_line": 463,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 57)",
        "(line 466,col 5)-(line 471,col 5)",
        "(line 472,col 5)-(line 472,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 475,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 69)",
        "(line 478,col 5)-(line 478,col 69)",
        "(line 479,col 5)-(line 487,col 5)",
        "(line 488,col 5)-(line 490,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 493,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 495,col 5)-(line 495,col 69)",
        "(line 496,col 5)-(line 496,col 69)",
        "(line 497,col 5)-(line 505,col 5)",
        "(line 506,col 5)-(line 508,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 511,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 513,col 5)-(line 513,col 69)",
        "(line 514,col 5)-(line 514,col 69)",
        "(line 515,col 5)-(line 523,col 5)",
        "(line 524,col 5)-(line 526,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 529,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 531,col 5)-(line 531,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 5)-(line 535,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 538,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 540,col 5)-(line 540,col 34)",
        "(line 542,col 5)-(line 542,col 28)",
        "(line 543,col 5)-(line 543,col 74)",
        "(line 544,col 5)-(line 548,col 5)",
        "(line 549,col 5)-(line 554,col 5)",
        "(line 555,col 5)-(line 555,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.toDebugHashCodeString()",
      "begin_line": 558,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 560,col 5)-(line 560,col 50)",
        "(line 561,col 5)-(line 563,col 5)",
        "(line 564,col 5)-(line 564,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.setValidator(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 567,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 569,col 5)-(line 571,col 5)",
        "(line 572,col 5)-(line 572,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.collapseUnion()",
      "begin_line": 575,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 577,col 5)-(line 577,col 31)",
        "(line 578,col 5)-(line 578,col 41)",
        "(line 579,col 5)-(line 602,col 5)",
        "(line 603,col 5)-(line 603,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.matchConstraint(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 606,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 608,col 5)-(line 610,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.hasAnyTemplateTypesInternal()",
      "begin_line": 613,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 615,col 5)-(line 619,col 5)",
        "(line 620,col 5)-(line 620,col 17)"
      ]
    }
  ]
}