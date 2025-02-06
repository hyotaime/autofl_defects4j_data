{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/UnionType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnionType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.JSType"
      ],
      "begin_line": 68,
      "end_line": 634,
      "comment": "\n * The {@code UnionType} implements a common JavaScript idiom in which the\n * code is specifically designed to work with multiple input types.  Because\n * JavaScript always knows the run-time type of an object value, this is safer\n * than a C union.\u003cp\u003e\n *\n * For instance, values of the union type {@code (String,boolean)} can be of\n * type {@code String} or of type {@code boolean}. The commutativity of the\n * statement is captured by making {@code (String,boolean)} and\n * {@code (boolean,String)} equal.\u003cp\u003e\n *\n * The implementation of this class prevents the creation of nested\n * unions.\u003cp\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternates"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashcode"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.UnionType.UnionType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.util.Collection\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n   * Creates a union type.\n   *\n   * @param alternates the alternates of the union\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 20)",
        "(line 81,col 5)-(line 81,col 33)",
        "(line 82,col 5)-(line 82,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getAlternates()",
      "begin_line": 90,
      "end_line": 98,
      "comment": "\n   * Gets the alternate types of this union type.\n   * @return The alternate types of this union type. The returned set is\n   *     immutable.\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 96,col 5)",
        "(line 97,col 5)-(line 97,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.rebuildAlternates()",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n   * Use UnionTypeBuilder to rebuild the list of alternates and hashcode\n   * of the current UnionType.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 62)",
        "(line 106,col 5)-(line 108,col 5)",
        "(line 109,col 5)-(line 109,col 41)",
        "(line 110,col 5)-(line 110,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.matchesNumberContext()",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * numeric context, such as an operand of a multiply operator.\n   *\n   * @return true if the type can appear in a numeric context.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 126,col 5)",
        "(line 127,col 5)-(line 127,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.matchesStringContext()",
      "begin_line": 141,
      "end_line": 150,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * {@code String} context, such as an operand of a string concat ({@code +})\n   * operator.\u003cp\u003e\n   *\n   * All types have at least the potential for converting to {@code String}.\n   * When we add externally defined types, such as a browser OM, we may choose\n   * to add types that do not automatically convert to {@code String}.\n   *\n   * @return {@code true} if not {@link VoidType}\n   ",
      "child_ranges": [
        "(line 144,col 5)-(line 148,col 5)",
        "(line 149,col 5)-(line 149,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.matchesObjectContext()",
      "begin_line": 168,
      "end_line": 177,
      "comment": "\n   * This predicate is used to test whether a given type can appear in an\n   * {@code Object} context, such as the expression in a {@code with}\n   * statement.\u003cp\u003e\n   *\n   * Most types we will encounter, except notably {@code null}, have at least\n   * the potential for converting to {@code Object}.  Host defined objects can\n   * get peculiar.\u003cp\u003e\n   *\n   * VOID type is included here because while it is not part of the JavaScript\n   * language, functions returning \u0027void\u0027 type can\u0027t be used as operands of\n   * any operator or statement.\u003cp\u003e\n   *\n   * @return {@code true} if the type is not {@link NullType} or\n   *         {@link VoidType}\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 175,col 5)",
        "(line 176,col 5)-(line 176,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.findPropertyType(java.lang.String)",
      "begin_line": 179,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 31)",
        "(line 183,col 5)-(line 199,col 5)",
        "(line 201,col 5)-(line 201,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.canBeCalled()",
      "begin_line": 204,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 210,col 5)",
        "(line 211,col 5)-(line 211,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.autobox()",
      "begin_line": 214,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 65)",
        "(line 217,col 5)-(line 219,col 5)",
        "(line 220,col 5)-(line 220,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined()",
      "begin_line": 223,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 65)",
        "(line 226,col 5)-(line 228,col 5)",
        "(line 229,col 5)-(line 229,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 232,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 31)",
        "(line 235,col 5)-(line 242,col 5)",
        "(line 243,col 5)-(line 243,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isNullable()",
      "begin_line": 254,
      "end_line": 262,
      "comment": "\n   * This predicate determines whether objects of this type can have the\n   * {@code null} value, and therefore can appear in contexts where\n   * {@code null} is expected.\n   *\n   * @return {@code true} for everything but {@code Number} and\n   *         {@code Boolean} types.\n   ",
      "child_ranges": [
        "(line 256,col 5)-(line 260,col 5)",
        "(line 261,col 5)-(line 261,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isUnknownType()",
      "begin_line": 264,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 270,col 5)",
        "(line 271,col 5)-(line 271,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isStruct()",
      "begin_line": 274,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 280,col 5)",
        "(line 281,col 5)-(line 281,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isDict()",
      "begin_line": 284,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 290,col 5)",
        "(line 291,col 5)-(line 291,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 294,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 296,col 5)-(line 302,col 5)",
        "(line 304,col 5)-(line 304,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.meet(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 307,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 308,col 5)-(line 308,col 62)",
        "(line 309,col 5)-(line 313,col 5)",
        "(line 315,col 5)-(line 323,col 5)",
        "(line 324,col 5)-(line 324,col 36)",
        "(line 325,col 5)-(line 331,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 338,
      "end_line": 351,
      "comment": "\n   * Two union types are equal if, after flattening nested union types,\n   * they have the same number of alternates and all alternates are equal.\n   ",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 61)",
        "(line 341,col 5)-(line 344,col 5)",
        "(line 345,col 5)-(line 349,col 5)",
        "(line 350,col 5)-(line 350,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.hasAlternate(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 353,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 358,col 5)",
        "(line 359,col 5)-(line 359,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.hasProperty(java.lang.String)",
      "begin_line": 362,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 364,col 5)-(line 368,col 5)",
        "(line 369,col 5)-(line 369,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.hashCode()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.toMaybeUnionType()",
      "begin_line": 377,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 379,col 5)-(line 379,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isObject()",
      "begin_line": 382,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 384,col 5)-(line 388,col 5)",
        "(line 389,col 5)-(line 389,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.contains(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 400,
      "end_line": 407,
      "comment": "\n   * A {@link UnionType} contains a given type (alternate) iff the member\n   * vector contains it.\n   *\n   * @param type The alternate which might be in this union.\n   *\n   * @return {@code true} if the alternate is in the union\n   ",
      "child_ranges": [
        "(line 401,col 5)-(line 405,col 5)",
        "(line 406,col 5)-(line 406,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 423,
      "end_line": 432,
      "comment": "\n   * Returns a more restricted union type than {@code this} one, in which all\n   * subtypes of {@code type} have been removed.\u003cp\u003e\n   *\n   * Examples:\n   * \u003cul\u003e\n   * \u003cli\u003e{@code (number,string)} restricted by {@code number} is\n   *     {@code string}\u003c/li\u003e\n   * \u003cli\u003e{@code (null, EvalError, URIError)} restricted by\n   *     {@code Error} is {@code null}\u003c/li\u003e\n   * \u003c/ul\u003e\n   *\n   * @param type the supertype of the types to remove from this union type\n   ",
      "child_ranges": [
        "(line 424,col 5)-(line 424,col 65)",
        "(line 425,col 5)-(line 430,col 5)",
        "(line 431,col 5)-(line 431,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.toStringHelper(boolean)",
      "begin_line": 434,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 435,col 5)-(line 435,col 47)",
        "(line 436,col 5)-(line 436,col 34)",
        "(line 438,col 5)-(line 438,col 23)",
        "(line 439,col 5)-(line 439,col 58)",
        "(line 440,col 5)-(line 440,col 30)",
        "(line 441,col 5)-(line 447,col 5)",
        "(line 448,col 5)-(line 448,col 23)",
        "(line 449,col 5)-(line 449,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 452,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 455,col 5)-(line 457,col 5)",
        "(line 459,col 5)-(line 461,col 5)",
        "(line 462,col 5)-(line 466,col 5)",
        "(line 467,col 5)-(line 467,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome(boolean)",
      "begin_line": 470,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 473,col 5)-(line 473,col 65)",
        "(line 474,col 5)-(line 477,col 5)",
        "(line 478,col 5)-(line 478,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getPossibleToBooleanOutcomes()",
      "begin_line": 481,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 483,col 5)-(line 483,col 57)",
        "(line 484,col 5)-(line 489,col 5)",
        "(line 490,col 5)-(line 490,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)",
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
      "signature": "com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)",
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
      "signature": "com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 529,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 531,col 5)-(line 531,col 69)",
        "(line 532,col 5)-(line 532,col 69)",
        "(line 533,col 5)-(line 541,col 5)",
        "(line 542,col 5)-(line 544,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 547,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 5)-(line 549,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 552,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 5)-(line 553,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 556,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 558,col 5)-(line 558,col 34)",
        "(line 562,col 5)-(line 564,col 5)",
        "(line 566,col 5)-(line 566,col 24)",
        "(line 567,col 5)-(line 567,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.toDebugHashCodeString()",
      "begin_line": 570,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 572,col 5)-(line 572,col 50)",
        "(line 573,col 5)-(line 575,col 5)",
        "(line 576,col 5)-(line 576,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.setValidator(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 579,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 581,col 5)-(line 583,col 5)",
        "(line 584,col 5)-(line 584,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.collapseUnion()",
      "begin_line": 587,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 589,col 31)",
        "(line 590,col 5)-(line 590,col 41)",
        "(line 591,col 5)-(line 614,col 5)",
        "(line 615,col 5)-(line 615,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.matchConstraint(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 618,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 620,col 5)-(line 622,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionType.hasAnyTemplateTypesInternal()",
      "begin_line": 625,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 627,col 5)-(line 631,col 5)",
        "(line 632,col 5)-(line 632,col 17)"
      ]
    }
  ]
}