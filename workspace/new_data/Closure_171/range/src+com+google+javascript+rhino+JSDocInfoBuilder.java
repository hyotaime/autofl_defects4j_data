{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/JSDocInfoBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSDocInfoBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 1111,
      "comment": "\n * A builder for {@link JSDocInfo} objects. This builder abstracts the\n * construction process of {@link JSDocInfo} objects whilst minimizing the\n * number of instances of {@link JSDocInfo} objects. It provides early\n * incompatibility detection among properties stored on the {@code JSDocInfo}\n * object being created.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "currentInfo"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " the current JSDoc which is being populated"
    },
    {
      "type": "field",
      "varNames": [
        "populated"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " whether the current JSDocInfo has valuable information"
    },
    {
      "type": "field",
      "varNames": [
        "parseDocumentation"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " whether to include the documentation itself when parsing the JsDoc"
    },
    {
      "type": "field",
      "varNames": [
        "currentMarker"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " the current marker, if any."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.JSDocInfoBuilder(boolean)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 57)",
        "(line 71,col 5)-(line 71,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordOriginalCommentString(java.lang.String)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n   * Sets the original JSDoc comment string. This is a no-op if the builder\n   * isn\u0027t configured to record documentation.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordOriginalCommentPosition(int)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n   * Sets the position of original JSDoc comment.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 90,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.shouldParseDocumentation()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isPopulated()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n   * Returns whether this builder is populated with information that can be\n   * used to {@link #build} a {@link JSDocInfo} object.\n   ",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isPopulatedWithFileOverview()",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n   * Returns whether this builder is populated with information that can be\n   * used to {@link #build} a {@link JSDocInfo} object that has a\n   * fileoverview tag.\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 113,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isDescriptionRecorded()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n   * Returns whether this builder recorded a description.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.build(com.google.javascript.rhino.Node)",
      "begin_line": 133,
      "end_line": 144,
      "comment": "\n   * Builds a {@link JSDocInfo} object based on the populated information and\n   * returns it. Once this method is called, the builder can be reused to build\n   * another {@link JSDocInfo} object.\n   *\n   * @param associatedNode The source node containing the JSDoc.\n   * @return a {@link JSDocInfo} object populated with the values given to this\n   *     builder. If no value was populated, this method simply returns\n   *     {@code null}\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 143,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.populateDefaults(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 147,
      "end_line": 151,
      "comment": " Generate defaults when certain parameters are not specified. ",
      "child_ranges": [
        "(line 148,col 5)-(line 150,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation(java.lang.String, int, int)",
      "begin_line": 157,
      "end_line": 171,
      "comment": "\n   * Adds a marker to the current JSDocInfo and populates the marker with the\n   * annotation information.\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 54)",
        "(line 160,col 5)-(line 168,col 5)",
        "(line 170,col 5)-(line 170,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markText(java.lang.String, int, int, int, int)",
      "begin_line": 176,
      "end_line": 185,
      "comment": "\n   * Adds a textual block to the current marker.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 184,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markTypeNode(com.google.javascript.rhino.Node, int, int, int, int, boolean)",
      "begin_line": 190,
      "end_line": 200,
      "comment": "\n   * Adds a type declaration to the current marker.\n   ",
      "child_ranges": [
        "(line 192,col 5)-(line 199,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markName(java.lang.String, int, int)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n   * Adds a name declaration to the current marker.\n   * @deprecated Use #markName(String, StaticSourceFile, int, int)\n   ",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markName(java.lang.String, com.google.javascript.rhino.jstype.StaticSourceFile, int, int)",
      "begin_line": 214,
      "end_line": 241,
      "comment": "\n   * Adds a name declaration to the current marker.\n   ",
      "child_ranges": [
        "(line 216,col 5)-(line 240,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordBlockDescription(java.lang.String)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n   * Records a block-level description.\n   *\n   * @return {@code true} if the description was recorded.\n   ",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 21)",
        "(line 250,col 5)-(line 250,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)",
      "begin_line": 259,
      "end_line": 267,
      "comment": "\n   * Records a visibility.\n   *\n   * @return {@code true} if the visibility was recorded and {@code false}\n   *     if it was already defined\n   ",
      "child_ranges": [
        "(line 260,col 5)-(line 266,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordParameter(java.lang.String, com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 275,
      "end_line": 283,
      "comment": "\n   * Records a typed parameter.\n   *\n   * @return {@code true} if the typed parameter was recorded and\n   *     {@code false} if a parameter with the same name was already defined\n   ",
      "child_ranges": [
        "(line 276,col 5)-(line 282,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordParameterDescription(java.lang.String, java.lang.String)",
      "begin_line": 291,
      "end_line": 299,
      "comment": "\n   * Records a parameter\u0027s description.\n   *\n   * @return {@code true} if the parameter\u0027s description was recorded and\n   *     {@code false} if a parameter with the same name was already defined\n   ",
      "child_ranges": [
        "(line 293,col 5)-(line 298,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordTemplateTypeNames(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 307,
      "end_line": 314,
      "comment": "\n   * Records a template type name.\n   *\n   * @return {@code true} if the template type name was recorded and\n   *     {@code false} if a template type name was already defined.\n   ",
      "child_ranges": [
        "(line 308,col 5)-(line 313,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordThrowType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 319,
      "end_line": 326,
      "comment": "\n   * Records a thrown type.\n   ",
      "child_ranges": [
        "(line 320,col 5)-(line 324,col 5)",
        "(line 325,col 5)-(line 325,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(com.google.javascript.rhino.JSTypeExpression, java.lang.String)",
      "begin_line": 334,
      "end_line": 342,
      "comment": "\n   * Records a throw type\u0027s description.\n   *\n   * @return {@code true} if the type\u0027s description was recorded and\n   *     {@code false} if a description with the same type was already defined\n   ",
      "child_ranges": [
        "(line 336,col 5)-(line 341,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.addAuthor(java.lang.String)",
      "begin_line": 348,
      "end_line": 355,
      "comment": "\n   * Adds an author to the current information.\n   ",
      "child_ranges": [
        "(line 349,col 5)-(line 354,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.addReference(java.lang.String)",
      "begin_line": 361,
      "end_line": 368,
      "comment": "\n   * Adds a reference (\"@see\") to the current information.\n   ",
      "child_ranges": [
        "(line 362,col 5)-(line 367,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordConsistentIdGenerator()",
      "begin_line": 378,
      "end_line": 386,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isConsistentIdGenerator()} flag set to\n   * {@code true}.\n   *\n   * @return {@code true} if the consistentIdGenerator flag was recorded and\n   *     {@code false} if it was already recorded\n   ",
      "child_ranges": [
        "(line 379,col 5)-(line 385,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordStableIdGenerator()",
      "begin_line": 395,
      "end_line": 403,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its {@link\n   * JSDocInfo#isStableIdGenerator()} flag set to {@code true}.\n   *\n   * @return {@code true} if the stableIdGenerator flag was recorded and {@code false} if it was\n   *     already recorded.\n   ",
      "child_ranges": [
        "(line 396,col 5)-(line 402,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordMappedIdGenerator()",
      "begin_line": 412,
      "end_line": 420,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its {@link\n   * JSDocInfo#isStableIdGenerator()} flag set to {@code true}.\n   *\n   * @return {@code true} if the stableIdGenerator flag was recorded and {@code false} if it was\n   *     already recorded.\n   ",
      "child_ranges": [
        "(line 413,col 5)-(line 419,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordVersion(java.lang.String)",
      "begin_line": 425,
      "end_line": 432,
      "comment": "\n   * Records the version.\n   ",
      "child_ranges": [
        "(line 426,col 5)-(line 431,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecationReason(java.lang.String)",
      "begin_line": 437,
      "end_line": 444,
      "comment": "\n   * Records the deprecation reason.\n   ",
      "child_ranges": [
        "(line 438,col 5)-(line 443,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordSuppressions(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 449,
      "end_line": 456,
      "comment": "\n   * Records the list of suppressed warnings.\n   ",
      "child_ranges": [
        "(line 450,col 5)-(line 455,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordModifies(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 461,
      "end_line": 469,
      "comment": "\n   * Records the list of modifies warnings.\n   ",
      "child_ranges": [
        "(line 462,col 5)-(line 468,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 477,
      "end_line": 485,
      "comment": "\n   * Records a type.\n   *\n   * @return {@code true} if the type was recorded and {@code false} if\n   *     it is invalid or was already defined\n   ",
      "child_ranges": [
        "(line 478,col 5)-(line 484,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordTypedef(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 491,
      "end_line": 498,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should be populated\n   * with a {@code typedef}\u0027d type.\n   ",
      "child_ranges": [
        "(line 492,col 5)-(line 496,col 5)",
        "(line 497,col 5)-(line 497,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordIdGenerator()",
      "begin_line": 508,
      "end_line": 516,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isIdGenerator()} flag set to\n   * {@code true}.\n   *\n   * @return {@code true} if the idGenerator flag was recorded and {@code false}\n   *     if it was already recorded\n   ",
      "child_ranges": [
        "(line 509,col 5)-(line 515,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordReturnType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 524,
      "end_line": 533,
      "comment": "\n   * Records a return type.\n   *\n   * @return {@code true} if the return type was recorded and {@code false} if\n   *     it is invalid or was already defined\n   ",
      "child_ranges": [
        "(line 525,col 5)-(line 532,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordReturnDescription(java.lang.String)",
      "begin_line": 541,
      "end_line": 548,
      "comment": "\n   * Records a return description\n   *\n   * @return {@code true} if the return description was recorded and\n   *     {@code false} if it is invalid or was already defined\n   ",
      "child_ranges": [
        "(line 542,col 5)-(line 547,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDefineType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 557,
      "end_line": 568,
      "comment": "\n   * Records the type of a define.\n   *\n   * \u0027Define\u0027 values are special constants that may be manipulated by\n   * the compiler. They are designed to mimic the #define command in\n   * the C preprocessor.\n   ",
      "child_ranges": [
        "(line 558,col 5)-(line 567,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 576,
      "end_line": 584,
      "comment": "\n   * Records a parameter type to an enum.\n   *\n   * @return {@code true} if the enum\u0027s parameter type was recorded and\n   *     {@code false} if it was invalid or already defined\n   ",
      "child_ranges": [
        "(line 577,col 5)-(line 583,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordThisType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 593,
      "end_line": 602,
      "comment": "\n   * Records a type for {@code @this} annotation.\n   *\n   * @return {@code true} if the type was recorded and\n   *     {@code false} if it is invalid or if it collided with {@code @enum} or\n   *     {@code @type} annotations\n   ",
      "child_ranges": [
        "(line 594,col 5)-(line 601,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordBaseType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 610,
      "end_line": 619,
      "comment": "\n   * Records a base type.\n   *\n   * @return {@code true} if the base type was recorded and {@code false}\n   *     if it was already defined\n   ",
      "child_ranges": [
        "(line 611,col 5)-(line 618,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordConstancy()",
      "begin_line": 628,
      "end_line": 636,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isConstant()} flag set to {@code true}.\n   *\n   * @return {@code true} if the constancy was recorded and {@code false}\n   *     if it was already defined\n   ",
      "child_ranges": [
        "(line 629,col 5)-(line 635,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDescription(java.lang.String)",
      "begin_line": 644,
      "end_line": 652,
      "comment": "\n   * Records a description giving context for translation (i18n).\n   *\n   * @return {@code true} if the description was recorded and {@code false}\n   *     if the description was invalid or was already defined\n   ",
      "child_ranges": [
        "(line 645,col 5)-(line 651,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordMeaning(java.lang.String)",
      "begin_line": 660,
      "end_line": 668,
      "comment": "\n   * Records a meaning giving context for translation (i18n). Different\n   * meanings will result in different translations.\n   *\n   * @return {@code true} If the meaning was successfully updated.\n   ",
      "child_ranges": [
        "(line 661,col 5)-(line 667,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordFileOverview(java.lang.String)",
      "begin_line": 676,
      "end_line": 683,
      "comment": "\n   * Records a fileoverview description.\n   *\n   * @return {@code true} if the description was recorded and {@code false}\n   *     if the description was invalid or was already defined.\n   ",
      "child_ranges": [
        "(line 677,col 5)-(line 682,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordHiddenness()",
      "begin_line": 692,
      "end_line": 700,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isHidden()} flag set to {@code true}.\n   *\n   * @return {@code true} if the hiddenness was recorded and {@code false}\n   *     if it was already defined\n   ",
      "child_ranges": [
        "(line 693,col 5)-(line 699,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoCompile()",
      "begin_line": 709,
      "end_line": 717,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoCompile()} flag set to {@code true}.\n   *\n   * @return {@code true} if the no compile flag was recorded and {@code false}\n   *     if it was already recorded\n   ",
      "child_ranges": [
        "(line 710,col 5)-(line 716,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoTypeCheck()",
      "begin_line": 726,
      "end_line": 734,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoTypeCheck()} flag set to {@code true}.\n   *\n   * @return {@code true} if the no check flag was recorded and {@code false}\n   *     if it was already recorded\n   ",
      "child_ranges": [
        "(line 727,col 5)-(line 733,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordConstructor()",
      "begin_line": 744,
      "end_line": 753,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isConstructor()} flag set to {@code true}.\n   *\n   * @return {@code true} if the constructor was recorded and {@code false}\n   *     if it was already defined or it was incompatible with the existing\n   *     flags\n   ",
      "child_ranges": [
        "(line 745,col 5)-(line 752,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isConstructorRecorded()",
      "begin_line": 759,
      "end_line": 761,
      "comment": "\n   * Whether the {@link JSDocInfo} being built will have its\n   * {@link JSDocInfo#isConstructor()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 760,col 5)-(line 760,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordStruct()",
      "begin_line": 770,
      "end_line": 778,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#makesStructs()} flag set to {@code true}.\n   *\n   * @return {@code true} if the struct was recorded and {@code false}\n   * if it was already defined or it was incompatible with the existing flags\n   ",
      "child_ranges": [
        "(line 771,col 5)-(line 774,col 5)",
        "(line 775,col 5)-(line 775,col 28)",
        "(line 776,col 5)-(line 776,col 21)",
        "(line 777,col 5)-(line 777,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDict()",
      "begin_line": 787,
      "end_line": 795,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#makesDicts()} flag set to {@code true}.\n   *\n   * @return {@code true} if the dict was recorded and {@code false}\n   * if it was already defined or it was incompatible with the existing flags\n   ",
      "child_ranges": [
        "(line 788,col 5)-(line 791,col 5)",
        "(line 792,col 5)-(line 792,col 26)",
        "(line 793,col 5)-(line 793,col 21)",
        "(line 794,col 5)-(line 794,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordJavaDispatch()",
      "begin_line": 805,
      "end_line": 813,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isJavaDispatch()} flag set to {@code true}.\n   *\n   * @return {@code true} if the javadispatch was recorded and {@code false}\n   *     if it was already defined or it was incompatible with the existing\n   *     flags\n   ",
      "child_ranges": [
        "(line 806,col 5)-(line 812,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isJavaDispatch()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n   * Whether the {@link JSDocInfo} being built will have its\n   * {@link JSDocInfo#isJavaDispatch()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 820,col 5)-(line 820,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordPreserveTry()",
      "begin_line": 827,
      "end_line": 835,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#shouldPreserveTry()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 828,col 5)-(line 834,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordOverride()",
      "begin_line": 841,
      "end_line": 849,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isOverride()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 842,col 5)-(line 848,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoAlias()",
      "begin_line": 855,
      "end_line": 863,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoAlias()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 856,col 5)-(line 862,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecated()",
      "begin_line": 869,
      "end_line": 877,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isDeprecated()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 870,col 5)-(line 876,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordInterface()",
      "begin_line": 886,
      "end_line": 895,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isInterface()} flag set to {@code true}.\n   *\n   * @return {@code true} if the flag was recorded and {@code false}\n   * if it was already defined or it was incompatible with the existing flags\n   ",
      "child_ranges": [
        "(line 887,col 5)-(line 891,col 5)",
        "(line 892,col 5)-(line 892,col 35)",
        "(line 893,col 5)-(line 893,col 21)",
        "(line 894,col 5)-(line 894,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordExport()",
      "begin_line": 901,
      "end_line": 909,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isExport()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 902,col 5)-(line 908,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordExpose()",
      "begin_line": 915,
      "end_line": 923,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isExpose()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 916,col 5)-(line 922,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoShadow()",
      "begin_line": 929,
      "end_line": 937,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoShadow()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 930,col 5)-(line 936,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordImplicitCast()",
      "begin_line": 943,
      "end_line": 951,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isImplicitCast()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 944,col 5)-(line 950,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoSideEffects()",
      "begin_line": 957,
      "end_line": 966,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoSideEffects()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 958,col 5)-(line 965,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordExterns()",
      "begin_line": 972,
      "end_line": 980,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isExterns()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 973,col 5)-(line 979,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isInterfaceRecorded()",
      "begin_line": 986,
      "end_line": 988,
      "comment": "\n   * Whether the {@link JSDocInfo} being built will have its\n   * {@link JSDocInfo#isInterface()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 987,col 5)-(line 987,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.hasParameter(java.lang.String)",
      "begin_line": 993,
      "end_line": 995,
      "comment": "\n   * @return Whether a parameter of the given name has already been recorded.\n   ",
      "child_ranges": [
        "(line 994,col 5)-(line 994,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1000,
      "end_line": 1007,
      "comment": "\n   * Records an implemented interface.\n   ",
      "child_ranges": [
        "(line 1001,col 5)-(line 1006,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordExtendedInterface(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1012,
      "end_line": 1019,
      "comment": "\n   * Records an extended interface type.\n   ",
      "child_ranges": [
        "(line 1013,col 5)-(line 1018,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordLends(java.lang.String)",
      "begin_line": 1024,
      "end_line": 1032,
      "comment": "\n   * Records that we\u0027re lending to another name.\n   ",
      "child_ranges": [
        "(line 1025,col 5)-(line 1031,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isNgInjectRecorded()",
      "begin_line": 1037,
      "end_line": 1039,
      "comment": "\n   * Returns whether current JSDoc is annotated with {@code @ngInject}.\n   ",
      "child_ranges": [
        "(line 1038,col 5)-(line 1038,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNgInject(boolean)",
      "begin_line": 1045,
      "end_line": 1053,
      "comment": "\n   * Records that we\u0027d like to add {@code $inject} property inferred from\n   * parameters.\n   ",
      "child_ranges": [
        "(line 1046,col 5)-(line 1052,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isWizactionRecorded()",
      "begin_line": 1058,
      "end_line": 1060,
      "comment": "\n   * Returns whether current JSDoc is annotated with {@code @wizaction}.\n   ",
      "child_ranges": [
        "(line 1059,col 5)-(line 1059,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordWizaction()",
      "begin_line": 1065,
      "end_line": 1073,
      "comment": "\n   * Records that this method is to be exposed as a wizaction.\n   ",
      "child_ranges": [
        "(line 1066,col 5)-(line 1072,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.hasAnyTypeRelatedTags()",
      "begin_line": 1079,
      "end_line": 1089,
      "comment": "\n   * Whether the current doc info has other type tags, like\n   * {@code @param} or {@code @return} or {@code @type} or etc.\n   ",
      "child_ranges": [
        "(line 1080,col 5)-(line 1088,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags()",
      "begin_line": 1096,
      "end_line": 1100,
      "comment": "\n   * Whether the current doc info has any of the singleton type\n   * tags that may not appear with other type tags, like\n   * {@code @type} or {@code @typedef}.\n   ",
      "child_ranges": [
        "(line 1097,col 5)-(line 1099,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonSideEffectTags()",
      "begin_line": 1107,
      "end_line": 1110,
      "comment": "\n   * Whether the current doc info has any of the singleton type\n   * tags that may not appear with other type tags, like\n   * {@code @type} or {@code @typedef}.\n   ",
      "child_ranges": [
        "(line 1108,col 5)-(line 1109,col 34)"
      ]
    }
  ]
}