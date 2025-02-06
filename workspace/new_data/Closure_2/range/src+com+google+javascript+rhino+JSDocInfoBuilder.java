{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/JSDocInfoBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSDocInfoBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 1045,
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
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.shouldParseDocumentation()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isPopulated()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n   * Returns whether this builder is populated with information that can be\n   * used to {@link #build} a {@link JSDocInfo} object.\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isPopulatedWithFileOverview()",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n   * Returns whether this builder is populated with information that can be\n   * used to {@link #build} a {@link JSDocInfo} object that has a\n   * fileoverview tag.\n   ",
      "child_ranges": [
        "(line 102,col 5)-(line 104,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isDescriptionRecorded()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n   * Returns whether this builder recorded a description.\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.build(com.google.javascript.rhino.Node)",
      "begin_line": 124,
      "end_line": 135,
      "comment": "\n   * Builds a {@link JSDocInfo} object based on the populated information and\n   * returns it. Once this method is called, the builder can be reused to build\n   * another {@link JSDocInfo} object.\n   *\n   * @param associatedNode The source node containing the JSDoc.\n   * @return a {@link JSDocInfo} object populated with the values given to this\n   *     builder. If no value was populated, this method simply returns\n   *     {@code null}\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 134,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.populateDefaults(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 138,
      "end_line": 142,
      "comment": " Generate defaults when certain parameters are not specified. ",
      "child_ranges": [
        "(line 139,col 5)-(line 141,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation(java.lang.String, int, int)",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\n   * Adds a marker to the current JSDocInfo and populates the marker with the\n   * annotation information.\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 54)",
        "(line 151,col 5)-(line 159,col 5)",
        "(line 161,col 5)-(line 161,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markText(java.lang.String, int, int, int, int)",
      "begin_line": 167,
      "end_line": 176,
      "comment": "\n   * Adds a textual block to the current marker.\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 175,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markTypeNode(com.google.javascript.rhino.Node, int, int, int, int, boolean)",
      "begin_line": 181,
      "end_line": 191,
      "comment": "\n   * Adds a type declaration to the current marker.\n   ",
      "child_ranges": [
        "(line 183,col 5)-(line 190,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markName(java.lang.String, int, int)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n   * Adds a name declaration to the current marker.\n   * @deprecated Use #markName(String, StaticSourceFile, int, int)\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.markName(java.lang.String, com.google.javascript.rhino.jstype.StaticSourceFile, int, int)",
      "begin_line": 205,
      "end_line": 232,
      "comment": "\n   * Adds a name declaration to the current marker.\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 231,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordBlockDescription(java.lang.String)",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n   * Records a block-level description.\n   *\n   * @return {@code true} if the description was recorded.\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 21)",
        "(line 241,col 5)-(line 241,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)",
      "begin_line": 250,
      "end_line": 258,
      "comment": "\n   * Records a visibility.\n   *\n   * @return {@code true} if the visibility was recorded and {@code false}\n   *     if it was already defined\n   ",
      "child_ranges": [
        "(line 251,col 5)-(line 257,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordParameter(java.lang.String, com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 266,
      "end_line": 274,
      "comment": "\n   * Records a typed parameter.\n   *\n   * @return {@code true} if the typed parameter was recorded and\n   *     {@code false} if a parameter with the same name was already defined\n   ",
      "child_ranges": [
        "(line 267,col 5)-(line 273,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordParameterDescription(java.lang.String, java.lang.String)",
      "begin_line": 282,
      "end_line": 290,
      "comment": "\n   * Records a parameter\u0027s description.\n   *\n   * @return {@code true} if the parameter\u0027s description was recorded and\n   *     {@code false} if a parameter with the same name was already defined\n   ",
      "child_ranges": [
        "(line 284,col 5)-(line 289,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordTemplateTypeNames(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 298,
      "end_line": 305,
      "comment": "\n   * Records a template type name.\n   *\n   * @return {@code true} if the template type name was recorded and\n   *     {@code false} if a template type name was already defined.\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 304,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordThrowType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 310,
      "end_line": 317,
      "comment": "\n   * Records a thrown type.\n   ",
      "child_ranges": [
        "(line 311,col 5)-(line 315,col 5)",
        "(line 316,col 5)-(line 316,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(com.google.javascript.rhino.JSTypeExpression, java.lang.String)",
      "begin_line": 325,
      "end_line": 333,
      "comment": "\n   * Records a throw type\u0027s description.\n   *\n   * @return {@code true} if the type\u0027s description was recorded and\n   *     {@code false} if a description with the same type was already defined\n   ",
      "child_ranges": [
        "(line 327,col 5)-(line 332,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.addAuthor(java.lang.String)",
      "begin_line": 339,
      "end_line": 346,
      "comment": "\n   * Adds an author to the current information.\n   ",
      "child_ranges": [
        "(line 340,col 5)-(line 345,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.addReference(java.lang.String)",
      "begin_line": 352,
      "end_line": 359,
      "comment": "\n   * Adds a reference (\"@see\") to the current information.\n   ",
      "child_ranges": [
        "(line 353,col 5)-(line 358,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordConsistentIdGenerator()",
      "begin_line": 369,
      "end_line": 377,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isConsistentIdGenerator()} flag set to\n   * {@code true}.\n   *\n   * @return {@code true} if the consistentIdGenerator flag was recorded and\n   *     {@code false} if it was already recorded\n   ",
      "child_ranges": [
        "(line 370,col 5)-(line 376,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordStableIdGenerator()",
      "begin_line": 386,
      "end_line": 394,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its {@link\n   * JSDocInfo#isStableIdGenerator()} flag set to {@code true}.\n   *\n   * @return {@code true} if the stableIdGenerator flag was recorded and {@code false} if it was\n   *     already recorded.\n   ",
      "child_ranges": [
        "(line 387,col 5)-(line 393,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordVersion(java.lang.String)",
      "begin_line": 399,
      "end_line": 406,
      "comment": "\n   * Records the version.\n   ",
      "child_ranges": [
        "(line 400,col 5)-(line 405,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecationReason(java.lang.String)",
      "begin_line": 411,
      "end_line": 418,
      "comment": "\n   * Records the deprecation reason.\n   ",
      "child_ranges": [
        "(line 412,col 5)-(line 417,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordSuppressions(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 423,
      "end_line": 430,
      "comment": "\n   * Records the list of suppressed warnings.\n   ",
      "child_ranges": [
        "(line 424,col 5)-(line 429,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordModifies(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 435,
      "end_line": 443,
      "comment": "\n   * Records the list of modifies warnings.\n   ",
      "child_ranges": [
        "(line 436,col 5)-(line 442,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 451,
      "end_line": 459,
      "comment": "\n   * Records a type.\n   *\n   * @return {@code true} if the type was recorded and {@code false} if\n   *     it is invalid or was already defined\n   ",
      "child_ranges": [
        "(line 452,col 5)-(line 458,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordTypedef(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 465,
      "end_line": 472,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should be populated\n   * with a {@code typedef}\u0027d type.\n   ",
      "child_ranges": [
        "(line 466,col 5)-(line 470,col 5)",
        "(line 471,col 5)-(line 471,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordIdGenerator()",
      "begin_line": 482,
      "end_line": 490,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isIdGenerator()} flag set to\n   * {@code true}.\n   *\n   * @return {@code true} if the idGenerator flag was recorded and {@code false}\n   *     if it was already recorded\n   ",
      "child_ranges": [
        "(line 483,col 5)-(line 489,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordReturnType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 498,
      "end_line": 507,
      "comment": "\n   * Records a return type.\n   *\n   * @return {@code true} if the return type was recorded and {@code false} if\n   *     it is invalid or was already defined\n   ",
      "child_ranges": [
        "(line 499,col 5)-(line 506,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordReturnDescription(java.lang.String)",
      "begin_line": 515,
      "end_line": 522,
      "comment": "\n   * Records a return description\n   *\n   * @return {@code true} if the return description was recorded and\n   *     {@code false} if it is invalid or was already defined\n   ",
      "child_ranges": [
        "(line 516,col 5)-(line 521,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDefineType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 531,
      "end_line": 542,
      "comment": "\n   * Records the type of a define.\n   *\n   * \u0027Define\u0027 values are special constants that may be manipulated by\n   * the compiler. They are designed to mimic the #define command in\n   * the C preprocessor.\n   ",
      "child_ranges": [
        "(line 532,col 5)-(line 541,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 550,
      "end_line": 558,
      "comment": "\n   * Records a parameter type to an enum.\n   *\n   * @return {@code true} if the enum\u0027s parameter type was recorded and\n   *     {@code false} if it was invalid or already defined\n   ",
      "child_ranges": [
        "(line 551,col 5)-(line 557,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordThisType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 567,
      "end_line": 576,
      "comment": "\n   * Records a type for {@code @this} annotation.\n   *\n   * @return {@code true} if the type was recorded and\n   *     {@code false} if it is invalid or if it collided with {@code @enum} or\n   *     {@code @type} annotations\n   ",
      "child_ranges": [
        "(line 568,col 5)-(line 575,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordBaseType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 584,
      "end_line": 593,
      "comment": "\n   * Records a base type.\n   *\n   * @return {@code true} if the base type was recorded and {@code false}\n   *     if it was already defined\n   ",
      "child_ranges": [
        "(line 585,col 5)-(line 592,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordConstancy()",
      "begin_line": 602,
      "end_line": 610,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isConstant()} flag set to {@code true}.\n   *\n   * @return {@code true} if the constancy was recorded and {@code false}\n   *     if it was already defined\n   ",
      "child_ranges": [
        "(line 603,col 5)-(line 609,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDescription(java.lang.String)",
      "begin_line": 618,
      "end_line": 626,
      "comment": "\n   * Records a description giving context for translation (i18n).\n   *\n   * @return {@code true} if the description was recorded and {@code false}\n   *     if the description was invalid or was already defined\n   ",
      "child_ranges": [
        "(line 619,col 5)-(line 625,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordMeaning(java.lang.String)",
      "begin_line": 634,
      "end_line": 642,
      "comment": "\n   * Records a meaning giving context for translation (i18n). Different\n   * meanings will result in different translations.\n   *\n   * @return {@code true} If the meaning was successfully updated.\n   ",
      "child_ranges": [
        "(line 635,col 5)-(line 641,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordFileOverview(java.lang.String)",
      "begin_line": 650,
      "end_line": 657,
      "comment": "\n   * Records a fileoverview description.\n   *\n   * @return {@code true} if the description was recorded and {@code false}\n   *     if the description was invalid or was already defined.\n   ",
      "child_ranges": [
        "(line 651,col 5)-(line 656,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordHiddenness()",
      "begin_line": 666,
      "end_line": 674,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isHidden()} flag set to {@code true}.\n   *\n   * @return {@code true} if the hiddenness was recorded and {@code false}\n   *     if it was already defined\n   ",
      "child_ranges": [
        "(line 667,col 5)-(line 673,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoCompile()",
      "begin_line": 683,
      "end_line": 691,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoCompile()} flag set to {@code true}.\n   *\n   * @return {@code true} if the no compile flag was recorded and {@code false}\n   *     if it was already recorded\n   ",
      "child_ranges": [
        "(line 684,col 5)-(line 690,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoTypeCheck()",
      "begin_line": 700,
      "end_line": 708,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoTypeCheck()} flag set to {@code true}.\n   *\n   * @return {@code true} if the no check flag was recorded and {@code false}\n   *     if it was already recorded\n   ",
      "child_ranges": [
        "(line 701,col 5)-(line 707,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordConstructor()",
      "begin_line": 718,
      "end_line": 727,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isConstructor()} flag set to {@code true}.\n   *\n   * @return {@code true} if the constructor was recorded and {@code false}\n   *     if it was already defined or it was incompatible with the existing\n   *     flags\n   ",
      "child_ranges": [
        "(line 719,col 5)-(line 726,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isConstructorRecorded()",
      "begin_line": 733,
      "end_line": 735,
      "comment": "\n   * Whether the {@link JSDocInfo} being built will have its\n   * {@link JSDocInfo#isConstructor()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 734,col 5)-(line 734,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordStruct()",
      "begin_line": 744,
      "end_line": 752,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#makesStructs()} flag set to {@code true}.\n   *\n   * @return {@code true} if the struct was recorded and {@code false}\n   * if it was already defined or it was incompatible with the existing flags\n   ",
      "child_ranges": [
        "(line 745,col 5)-(line 748,col 5)",
        "(line 749,col 5)-(line 749,col 28)",
        "(line 750,col 5)-(line 750,col 21)",
        "(line 751,col 5)-(line 751,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDict()",
      "begin_line": 761,
      "end_line": 769,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#makesDicts()} flag set to {@code true}.\n   *\n   * @return {@code true} if the dict was recorded and {@code false}\n   * if it was already defined or it was incompatible with the existing flags\n   ",
      "child_ranges": [
        "(line 762,col 5)-(line 765,col 5)",
        "(line 766,col 5)-(line 766,col 26)",
        "(line 767,col 5)-(line 767,col 21)",
        "(line 768,col 5)-(line 768,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordJavaDispatch()",
      "begin_line": 779,
      "end_line": 787,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isJavaDispatch()} flag set to {@code true}.\n   *\n   * @return {@code true} if the javadispatch was recorded and {@code false}\n   *     if it was already defined or it was incompatible with the existing\n   *     flags\n   ",
      "child_ranges": [
        "(line 780,col 5)-(line 786,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isJavaDispatch()",
      "begin_line": 793,
      "end_line": 795,
      "comment": "\n   * Whether the {@link JSDocInfo} being built will have its\n   * {@link JSDocInfo#isJavaDispatch()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 794,col 5)-(line 794,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordPreserveTry()",
      "begin_line": 801,
      "end_line": 809,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#shouldPreserveTry()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 802,col 5)-(line 808,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordOverride()",
      "begin_line": 815,
      "end_line": 823,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isOverride()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 816,col 5)-(line 822,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoAlias()",
      "begin_line": 829,
      "end_line": 837,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoAlias()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 830,col 5)-(line 836,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecated()",
      "begin_line": 843,
      "end_line": 851,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isDeprecated()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 844,col 5)-(line 850,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordInterface()",
      "begin_line": 860,
      "end_line": 869,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isInterface()} flag set to {@code true}.\n   *\n   * @return {@code true} if the flag was recorded and {@code false}\n   * if it was already defined or it was incompatible with the existing flags\n   ",
      "child_ranges": [
        "(line 861,col 5)-(line 865,col 5)",
        "(line 866,col 5)-(line 866,col 35)",
        "(line 867,col 5)-(line 867,col 21)",
        "(line 868,col 5)-(line 868,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordExport()",
      "begin_line": 875,
      "end_line": 883,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isExport()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 876,col 5)-(line 882,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordExpose()",
      "begin_line": 889,
      "end_line": 897,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isExpose()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 890,col 5)-(line 896,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoShadow()",
      "begin_line": 903,
      "end_line": 911,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoShadow()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 904,col 5)-(line 910,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordImplicitCast()",
      "begin_line": 917,
      "end_line": 925,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isImplicitCast()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 918,col 5)-(line 924,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordNoSideEffects()",
      "begin_line": 931,
      "end_line": 940,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isNoSideEffects()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 932,col 5)-(line 939,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordExterns()",
      "begin_line": 946,
      "end_line": 954,
      "comment": "\n   * Records that the {@link JSDocInfo} being built should have its\n   * {@link JSDocInfo#isExterns()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 947,col 5)-(line 953,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.isInterfaceRecorded()",
      "begin_line": 960,
      "end_line": 962,
      "comment": "\n   * Whether the {@link JSDocInfo} being built will have its\n   * {@link JSDocInfo#isInterface()} flag set to {@code true}.\n   ",
      "child_ranges": [
        "(line 961,col 5)-(line 961,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.hasParameter(java.lang.String)",
      "begin_line": 967,
      "end_line": 969,
      "comment": "\n   * @return Whether a parameter of the given name has already been recorded.\n   ",
      "child_ranges": [
        "(line 968,col 5)-(line 968,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 974,
      "end_line": 981,
      "comment": "\n   * Records an implemented interface.\n   ",
      "child_ranges": [
        "(line 975,col 5)-(line 980,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordExtendedInterface(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 986,
      "end_line": 993,
      "comment": "\n   * Records an extended interface type.\n   ",
      "child_ranges": [
        "(line 987,col 5)-(line 992,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.recordLends(java.lang.String)",
      "begin_line": 998,
      "end_line": 1006,
      "comment": "\n   * Records that we\u0027re lending to another name.\n   ",
      "child_ranges": [
        "(line 999,col 5)-(line 1005,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.hasAnyTypeRelatedTags()",
      "begin_line": 1012,
      "end_line": 1022,
      "comment": "\n   * Whether the current doc info has other type tags, like\n   * {@code @param} or {@code @return} or {@code @type} or etc.\n   ",
      "child_ranges": [
        "(line 1013,col 5)-(line 1021,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags()",
      "begin_line": 1029,
      "end_line": 1033,
      "comment": "\n   * Whether the current doc info has any of the singleton type\n   * tags that may not appear with other type tags, like\n   * {@code @type} or {@code @typedef}.\n   ",
      "child_ranges": [
        "(line 1030,col 5)-(line 1032,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonSideEffectTags()",
      "begin_line": 1040,
      "end_line": 1043,
      "comment": "\n   * Whether the current doc info has any of the singleton type\n   * tags that may not appear with other type tags, like\n   * {@code @type} or {@code @typedef}.\n   ",
      "child_ranges": [
        "(line 1041,col 5)-(line 1042,col 34)"
      ]
    }
  ]
}