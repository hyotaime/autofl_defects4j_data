{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSTypeRegistry",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 1751,
      "comment": "\n * The type registry is used to resolve named types.\n *\n * \u003cp\u003eThis class is not thread-safe.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PROPERTY_CHECKING_UNION_SIZE"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n   * The UnionTypeBuilder caps the maximum number of alternate types it\n   * remembers and then defaults to \"?\" (unknown type). By default this max\n   * is 20, but it\u0027s very easy for the same property to appear on more than 20\n   * types. Use larger unions for property checking. 3000 was picked\n   * semi-randomly for use by the Google+ FE project.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "reporter"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nativeTypes"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " CPU time on bounds checking inside get()."
    },
    {
      "type": "field",
      "varNames": [
        "namesToTypes"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaces"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Set of namespaces in which types (or other namespaces) exist."
    },
    {
      "type": "field",
      "varNames": [
        "nonNullableTypeNames"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " nullable or not."
    },
    {
      "type": "field",
      "varNames": [
        "forwardDeclaredTypes"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " try to type-check them at all."
    },
    {
      "type": "field",
      "varNames": [
        "typesIndexedByProperty"
      ],
      "begin_line": 128,
      "end_line": 129,
      "comment": " declared."
    },
    {
      "type": "field",
      "varNames": [
        "eachRefTypeIndexedByProperty"
      ],
      "begin_line": 134,
      "end_line": 135,
      "comment": " for de-duping."
    },
    {
      "type": "field",
      "varNames": [
        "greatestSubtypeByProperty"
      ],
      "begin_line": 140,
      "end_line": 141,
      "comment": " typesIndexedByProperty."
    },
    {
      "type": "field",
      "varNames": [
        "interfaceToImplementors"
      ],
      "begin_line": 144,
      "end_line": 145,
      "comment": " A map from interface name to types that implement it."
    },
    {
      "type": "field",
      "varNames": [
        "unresolvedNamedTypes"
      ],
      "begin_line": 148,
      "end_line": 149,
      "comment": " All the unresolved named types."
    },
    {
      "type": "field",
      "varNames": [
        "resolvedNamedTypes"
      ],
      "begin_line": 152,
      "end_line": 153,
      "comment": " All the resolved named types."
    },
    {
      "type": "field",
      "varNames": [
        "lastGeneration"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " NamedType warns about unresolved types in the last generation."
    },
    {
      "type": "field",
      "varNames": [
        "templateTypes"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The template type name."
    },
    {
      "type": "field",
      "varNames": [
        "tolerateUndefinedValues"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resolveMode"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.JSTypeRegistry(com.google.javascript.rhino.ErrorReporter)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n   * Constructs a new type registry populated with the built-in types.\n   ",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.JSTypeRegistry(com.google.javascript.rhino.ErrorReporter, boolean)",
      "begin_line": 203,
      "end_line": 210,
      "comment": "\n   * Constructs a new type registry populated with the built-in types.\n   ",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 29)",
        "(line 206,col 5)-(line 206,col 59)",
        "(line 207,col 5)-(line 207,col 49)",
        "(line 208,col 5)-(line 208,col 24)",
        "(line 209,col 5)-(line 209,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.setResolveMode(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n   * Set the current resolving mode of the type registry.\n   * @see ResolveMode\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getResolveMode()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getErrorReporter()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.shouldTolerateUndefinedValues()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.resetForTypeCheck()",
      "begin_line": 235,
      "end_line": 242,
      "comment": "\n   * Reset to run the TypeCheck pass.\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 35)",
        "(line 237,col 5)-(line 237,col 41)",
        "(line 238,col 5)-(line 238,col 29)",
        "(line 239,col 5)-(line 239,col 25)",
        "(line 240,col 5)-(line 240,col 23)",
        "(line 241,col 5)-(line 241,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.initializeBuiltInTypes()",
      "begin_line": 244,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 53)",
        "(line 247,col 5)-(line 247,col 64)",
        "(line 249,col 5)-(line 249,col 44)",
        "(line 250,col 5)-(line 250,col 58)",
        "(line 252,col 5)-(line 252,col 50)",
        "(line 253,col 5)-(line 253,col 62)",
        "(line 255,col 5)-(line 255,col 50)",
        "(line 256,col 5)-(line 256,col 62)",
        "(line 258,col 5)-(line 258,col 60)",
        "(line 259,col 5)-(line 259,col 64)",
        "(line 260,col 5)-(line 260,col 65)",
        "(line 261,col 5)-(line 262,col 63)",
        "(line 264,col 5)-(line 264,col 44)",
        "(line 265,col 5)-(line 265,col 58)",
        "(line 267,col 5)-(line 267,col 41)",
        "(line 268,col 5)-(line 268,col 56)",
        "(line 274,col 5)-(line 275,col 68)",
        "(line 276,col 5)-(line 276,col 78)",
        "(line 279,col 5)-(line 282,col 36)",
        "(line 284,col 5)-(line 284,col 65)",
        "(line 285,col 5)-(line 285,col 80)",
        "(line 287,col 5)-(line 287,col 68)",
        "(line 288,col 5)-(line 288,col 62)",
        "(line 290,col 5)-(line 290,col 70)",
        "(line 291,col 5)-(line 291,col 72)",
        "(line 294,col 5)-(line 298,col 36)",
        "(line 299,col 5)-(line 299,col 60)",
        "(line 300,col 5)-(line 301,col 69)",
        "(line 303,col 5)-(line 303,col 74)",
        "(line 304,col 5)-(line 304,col 76)",
        "(line 306,col 5)-(line 306,col 38)",
        "(line 307,col 5)-(line 307,col 54)",
        "(line 309,col 5)-(line 309,col 57)",
        "(line 310,col 5)-(line 310,col 68)",
        "(line 312,col 5)-(line 312,col 61)",
        "(line 313,col 5)-(line 313,col 72)",
        "(line 316,col 5)-(line 319,col 34)",
        "(line 320,col 5)-(line 321,col 46)",
        "(line 323,col 5)-(line 323,col 67)",
        "(line 324,col 5)-(line 324,col 78)",
        "(line 326,col 5)-(line 326,col 66)",
        "(line 327,col 5)-(line 327,col 60)",
        "(line 330,col 5)-(line 333,col 36)",
        "(line 334,col 5)-(line 334,col 78)",
        "(line 335,col 5)-(line 337,col 38)",
        "(line 339,col 5)-(line 340,col 55)",
        "(line 341,col 5)-(line 341,col 78)",
        "(line 344,col 5)-(line 350,col 34)",
        "(line 351,col 5)-(line 351,col 65)",
        "(line 352,col 5)-(line 352,col 76)",
        "(line 354,col 5)-(line 354,col 64)",
        "(line 355,col 5)-(line 355,col 58)",
        "(line 358,col 5)-(line 358,col 76)",
        "(line 359,col 5)-(line 359,col 78)",
        "(line 361,col 5)-(line 361,col 66)",
        "(line 362,col 5)-(line 362,col 60)",
        "(line 365,col 5)-(line 366,col 49)",
        "(line 367,col 5)-(line 367,col 61)",
        "(line 368,col 5)-(line 369,col 73)",
        "(line 371,col 5)-(line 371,col 76)",
        "(line 372,col 5)-(line 372,col 70)",
        "(line 375,col 5)-(line 376,col 50)",
        "(line 377,col 5)-(line 377,col 62)",
        "(line 378,col 5)-(line 379,col 75)",
        "(line 381,col 5)-(line 381,col 78)",
        "(line 382,col 5)-(line 382,col 72)",
        "(line 385,col 5)-(line 386,col 54)",
        "(line 387,col 5)-(line 387,col 66)",
        "(line 388,col 5)-(line 390,col 39)",
        "(line 392,col 5)-(line 393,col 56)",
        "(line 394,col 5)-(line 394,col 80)",
        "(line 397,col 5)-(line 398,col 51)",
        "(line 399,col 5)-(line 399,col 63)",
        "(line 400,col 5)-(line 401,col 77)",
        "(line 403,col 5)-(line 403,col 80)",
        "(line 404,col 5)-(line 404,col 74)",
        "(line 407,col 5)-(line 408,col 49)",
        "(line 409,col 5)-(line 409,col 61)",
        "(line 410,col 5)-(line 411,col 73)",
        "(line 413,col 5)-(line 413,col 76)",
        "(line 414,col 5)-(line 414,col 70)",
        "(line 417,col 5)-(line 418,col 48)",
        "(line 419,col 5)-(line 419,col 60)",
        "(line 420,col 5)-(line 421,col 71)",
        "(line 423,col 5)-(line 423,col 74)",
        "(line 424,col 5)-(line 424,col 68)",
        "(line 427,col 5)-(line 430,col 36)",
        "(line 431,col 5)-(line 431,col 76)",
        "(line 432,col 5)-(line 433,col 79)",
        "(line 435,col 5)-(line 436,col 54)",
        "(line 437,col 5)-(line 437,col 76)",
        "(line 440,col 5)-(line 443,col 34)",
        "(line 444,col 5)-(line 445,col 47)",
        "(line 447,col 5)-(line 447,col 69)",
        "(line 448,col 5)-(line 448,col 80)",
        "(line 450,col 5)-(line 450,col 68)",
        "(line 451,col 5)-(line 451,col 62)",
        "(line 454,col 5)-(line 457,col 36)",
        "(line 458,col 5)-(line 458,col 76)",
        "(line 459,col 5)-(line 460,col 79)",
        "(line 462,col 5)-(line 463,col 54)",
        "(line 464,col 5)-(line 465,col 61)",
        "(line 468,col 5)-(line 469,col 46)",
        "(line 470,col 5)-(line 470,col 58)",
        "(line 473,col 5)-(line 474,col 63)",
        "(line 475,col 5)-(line 475,col 80)",
        "(line 478,col 5)-(line 479,col 77)",
        "(line 480,col 5)-(line 481,col 38)",
        "(line 484,col 5)-(line 485,col 64)",
        "(line 486,col 5)-(line 487,col 31)",
        "(line 490,col 5)-(line 490,col 69)",
        "(line 491,col 5)-(line 491,col 66)",
        "(line 496,col 5)-(line 497,col 57)",
        "(line 498,col 5)-(line 499,col 79)",
        "(line 502,col 5)-(line 503,col 57)",
        "(line 504,col 5)-(line 505,col 79)",
        "(line 508,col 5)-(line 509,col 61)",
        "(line 510,col 5)-(line 510,col 74)",
        "(line 514,col 5)-(line 530,col 10)",
        "(line 534,col 5)-(line 534,col 80)",
        "(line 535,col 5)-(line 536,col 67)",
        "(line 538,col 5)-(line 538,col 65)",
        "(line 539,col 5)-(line 539,col 66)",
        "(line 542,col 5)-(line 543,col 63)",
        "(line 544,col 5)-(line 544,col 78)",
        "(line 547,col 5)-(line 550,col 36)",
        "(line 551,col 5)-(line 551,col 64)",
        "(line 552,col 5)-(line 552,col 62)",
        "(line 555,col 5)-(line 556,col 63)",
        "(line 557,col 5)-(line 558,col 32)",
        "(line 562,col 5)-(line 562,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.Anonymous-0b68caba-d0c0-4184-bf65-fa78771a34a8.getConstructor()",
      "begin_line": 526,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 527,col 13)-(line 528,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.initializeRegistry()",
      "begin_line": 565,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 566,col 5)-(line 566,col 53)",
        "(line 567,col 5)-(line 567,col 62)",
        "(line 568,col 5)-(line 568,col 55)",
        "(line 569,col 5)-(line 569,col 52)",
        "(line 570,col 5)-(line 570,col 52)",
        "(line 571,col 5)-(line 571,col 60)",
        "(line 572,col 5)-(line 572,col 61)",
        "(line 573,col 5)-(line 573,col 54)",
        "(line 574,col 5)-(line 574,col 54)",
        "(line 575,col 5)-(line 575,col 53)",
        "(line 576,col 5)-(line 576,col 57)",
        "(line 577,col 5)-(line 577,col 58)",
        "(line 578,col 5)-(line 578,col 58)",
        "(line 579,col 5)-(line 579,col 59)",
        "(line 580,col 5)-(line 580,col 63)",
        "(line 581,col 5)-(line 581,col 60)",
        "(line 582,col 5)-(line 582,col 54)",
        "(line 583,col 5)-(line 583,col 61)",
        "(line 584,col 5)-(line 584,col 54)",
        "(line 585,col 5)-(line 585,col 52)",
        "(line 586,col 5)-(line 586,col 65)",
        "(line 587,col 5)-(line 587,col 60)",
        "(line 588,col 5)-(line 588,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.register(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 591,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 592,col 5)-(line 592,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.register(com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 595,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 596,col 5)-(line 597,col 80)",
        "(line 599,col 5)-(line 599,col 33)",
        "(line 602,col 5)-(line 605,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 608,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 609,col 5)-(line 609,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.registerPropertyOnType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 624,
      "end_line": 636,
      "comment": "\n   * Tells the type system that {@code owner} may have a property named\n   * {@code propertyName}. This allows the registry to keep track of what\n   * types a property is defined upon.\n   *\n   * This is NOT the same as saying that {@code owner} must have a property\n   * named type. ObjectType#hasProperty attempts to minimize false positives\n   * (\"if we\u0027re not sure, then don\u0027t type check this property\"). The type\n   * registry, on the other hand, should attempt to minimize false negatives\n   * (\"if this property is assigned anywhere in the program, it must\n   * show up in the type registry\").\n   ",
      "child_ranges": [
        "(line 625,col 5)-(line 625,col 72)",
        "(line 626,col 5)-(line 629,col 5)",
        "(line 631,col 5)-(line 631,col 31)",
        "(line 632,col 5)-(line 632,col 58)",
        "(line 635,col 5)-(line 635,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.addReferenceTypeIndexedByProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 638,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 640,col 5)-(line 656,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.unregisterPropertyOnType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 667,
      "end_line": 674,
      "comment": "\n   * Removes the index\u0027s reference to a property on the given type (if it is\n   * currently registered). If the property is not registered on the type yet,\n   * this method will not change internal state.\n   *\n   * @param propertyName the name of the property to unregister\n   * @param type the type to unregister the property on.\n   ",
      "child_ranges": [
        "(line 669,col 5)-(line 670,col 55)",
        "(line 671,col 5)-(line 673,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getGreatestSubtypeWithProperty(com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 680,
      "end_line": 692,
      "comment": "\n   * Gets the greatest subtype of the {@code type} that has a property\n   * {@code propertyName} defined on it.\n   ",
      "child_ranges": [
        "(line 682,col 5)-(line 685,col 5)",
        "(line 686,col 5)-(line 690,col 5)",
        "(line 691,col 5)-(line 691,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.canPropertyBeDefined(com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 697,
      "end_line": 715,
      "comment": "\n   * Returns whether the given property can possibly be set on the given type.\n   ",
      "child_ranges": [
        "(line 698,col 5)-(line 713,col 5)",
        "(line 714,col 5)-(line 714,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getTypesWithProperty(java.lang.String)",
      "begin_line": 725,
      "end_line": 731,
      "comment": "\n   * Returns each type that has a property {@code propertyName} defined on it.\n   *\n   * Like most types in our type system, the collection of types returned\n   * will be collapsed. This means that if a type is defined on\n   * {@code Object} and on {@code Array}, it would be reasonable for this\n   * method to return either {@code [Object, Array]} or just {@code [Object]}.\n   ",
      "child_ranges": [
        "(line 726,col 5)-(line 730,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getEachReferenceTypeWithProperty(java.lang.String)",
      "begin_line": 743,
      "end_line": 750,
      "comment": "\n   * Returns each reference type that has a property {@code propertyName}\n   * defined on it.\n   *\n   * Unlike most types in our type system, the collection of types returned\n   * will not be collapsed. This means that if a type is defined on\n   * {@code Object} and on {@code Array}, this method must return\n   * {@code [Object, Array]}. It would not be correct to collapse them to\n   * {@code [Object]}.\n   ",
      "child_ranges": [
        "(line 745,col 5)-(line 749,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.findCommonSuperObject(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 755,
      "end_line": 770,
      "comment": "\n   * Finds the common supertype of the two given object types.\n   ",
      "child_ranges": [
        "(line 756,col 5)-(line 756,col 47)",
        "(line 757,col 5)-(line 757,col 47)",
        "(line 759,col 5)-(line 759,col 70)",
        "(line 760,col 5)-(line 768,col 5)",
        "(line 769,col 5)-(line 769,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getSuperStack(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 772,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 773,col 5)-(line 773,col 67)",
        "(line 774,col 5)-(line 778,col 5)",
        "(line 779,col 5)-(line 779,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.incrementGeneration()",
      "begin_line": 787,
      "end_line": 793,
      "comment": "\n   * Increments the current generation. Clients must call this in order to\n   * move to the next generation of type resolution, allowing types to attempt\n   * resolution again.\n   ",
      "child_ranges": [
        "(line 788,col 5)-(line 790,col 5)",
        "(line 791,col 5)-(line 791,col 52)",
        "(line 792,col 5)-(line 792,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.isLastGeneration()",
      "begin_line": 795,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 796,col 5)-(line 796,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.setLastGeneration(boolean)",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\n   * Sets whether this is the last generation. In the last generation,\n   * {@link NamedType} warns about unresolved types.\n   ",
      "child_ranges": [
        "(line 804,col 5)-(line 804,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 813,
      "end_line": 816,
      "comment": "\n   * Tells the type system that {@code type} implements interface {@code\n   * interfaceInstance}.\n   * {@code inter} must be an ObjectType for the instance of the interface as it\n   * could be a named type and not yet have the constructor.\n   ",
      "child_ranges": [
        "(line 815,col 5)-(line 815,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getDirectImplementors(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 824,
      "end_line": 827,
      "comment": "\n   * Returns a collection of types that directly implement {@code\n   * interfaceInstance}.  Subtypes of implementing types are not guaranteed to\n   * be returned.  {@code interfaceInstance} must be an ObjectType for the\n   * instance of the interface.\n   ",
      "child_ranges": [
        "(line 826,col 5)-(line 826,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.declareType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 837,
      "end_line": 843,
      "comment": "\n   * Records declared global type names. This makes resolution faster\n   * and more robust in the common case.\n   *\n   * @param name The name of the type to be recorded.\n   * @param t The actual type being associated with the name.\n   * @return True if this name is not already defined, false otherwise.\n   ",
      "child_ranges": [
        "(line 838,col 5)-(line 840,col 5)",
        "(line 841,col 5)-(line 841,col 22)",
        "(line 842,col 5)-(line 842,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.overwriteDeclaredType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 849,
      "end_line": 852,
      "comment": "\n   * Overrides a declared global type name. Throws an exception if this\n   * type name hasn\u0027t been declared yet.\n   ",
      "child_ranges": [
        "(line 850,col 5)-(line 850,col 61)",
        "(line 851,col 5)-(line 851,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.forwardDeclareType(java.lang.String)",
      "begin_line": 858,
      "end_line": 860,
      "comment": "\n   * Records a forward-declared type name. We will not emit errors if this\n   * type name never resolves to anything.\n   ",
      "child_ranges": [
        "(line 859,col 5)-(line 859,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.isForwardDeclaredType(java.lang.String)",
      "begin_line": 865,
      "end_line": 867,
      "comment": "\n   * Whether this is a forward-declared type name.\n   ",
      "child_ranges": [
        "(line 866,col 5)-(line 866,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.hasNamespace(java.lang.String)",
      "begin_line": 870,
      "end_line": 872,
      "comment": " Determines whether the given JS package exists. ",
      "child_ranges": [
        "(line 871,col 5)-(line 871,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getType(java.lang.String)",
      "begin_line": 880,
      "end_line": 888,
      "comment": "\n   * Looks up a type by name.\n   *\n   * @param jsTypeName The name string.\n   * @return the corresponding JSType object or {@code null} it cannot be found\n   ",
      "child_ranges": [
        "(line 883,col 5)-(line 883,col 62)",
        "(line 884,col 5)-(line 886,col 5)",
        "(line 887,col 5)-(line 887,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 890,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 891,col 5)-(line 891,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 894,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 895,col 5)-(line 895,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 898,
      "end_line": 900,
      "comment": "",
      "child_ranges": [
        "(line 899,col 5)-(line 899,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getType(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e, java.lang.String, java.lang.String, int, int)",
      "begin_line": 914,
      "end_line": 926,
      "comment": "\n   * Looks up a type by name. To allow for forward references to types, an\n   * unrecognized string has to be bound to a NamedType object that will be\n   * resolved later.\n   *\n   * @param scope A scope for doing type name resolution.\n   * @param jsTypeName The name string.\n   * @param sourceName The name of the source file where this reference appears.\n   * @param lineno The line number of the reference.\n   * @return a NamedType if the string argument is not one of the known types,\n   *     otherwise the corresponding JSType object.\n   ",
      "child_ranges": [
        "(line 916,col 5)-(line 916,col 38)",
        "(line 917,col 5)-(line 924,col 5)",
        "(line 925,col 5)-(line 925,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.clearNamedTypes()",
      "begin_line": 933,
      "end_line": 936,
      "comment": "\n   * Flushes out the current resolved and unresolved Named Types from\n   * the type registry.  This is intended to be used ONLY before a\n   * compile is run.\n   ",
      "child_ranges": [
        "(line 934,col 5)-(line 934,col 31)",
        "(line 935,col 5)-(line 935,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.resolveTypesInScope(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 941,
      "end_line": 965,
      "comment": "\n   * Resolve all the unresolved types in the given scope.\n   ",
      "child_ranges": [
        "(line 942,col 5)-(line 944,col 5)",
        "(line 946,col 5)-(line 946,col 76)",
        "(line 948,col 5)-(line 964,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 971,
      "end_line": 977,
      "comment": "\n   * Creates a type representing optional values of the given type.\n   * @return the union of the type and the void type\n   ",
      "child_ranges": [
        "(line 972,col 5)-(line 976,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createDefaultObjectUnion(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 983,
      "end_line": 993,
      "comment": "\n   * Creates a type representing nullable values of the given type.\n   * @return the union of the type and the Null type\n   ",
      "child_ranges": [
        "(line 984,col 5)-(line 992,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNullableType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "\n   * Creates a type representing nullable values of the given type.\n   * @return the union of the type and the Null type\n   ",
      "child_ranges": [
        "(line 1000,col 5)-(line 1000,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalNullableType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1007,
      "end_line": 1010,
      "comment": "\n   * Creates a nullable and undefine-able value of the given type.\n   * @return The union of the type and null and undefined.\n   ",
      "child_ranges": [
        "(line 1008,col 5)-(line 1009,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1015,
      "end_line": 1021,
      "comment": "\n   * Creates a union type whose variants are the arguments.\n   ",
      "child_ranges": [
        "(line 1016,col 5)-(line 1016,col 58)",
        "(line 1017,col 5)-(line 1019,col 5)",
        "(line 1020,col 5)-(line 1020,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative...)",
      "begin_line": 1027,
      "end_line": 1033,
      "comment": "\n   * Creates a union type whose variants are the built-in types specified\n   * by the arguments.\n   ",
      "child_ranges": [
        "(line 1028,col 5)-(line 1028,col 58)",
        "(line 1029,col 5)-(line 1031,col 5)",
        "(line 1032,col 5)-(line 1032,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createEnumType(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1038,
      "end_line": 1041,
      "comment": "\n   * Creates an enum type.\n   ",
      "child_ranges": [
        "(line 1040,col 5)-(line 1040,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createArrowType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1051,
      "end_line": 1053,
      "comment": "\n   * Creates an arrow type, an abstract representation of the parameters\n   * and return value of a function.\n   *\n   * @param parametersNode the parameters\u0027 types, formatted as a Node with\n   *     param names and optionality info.\n   * @param returnType the function\u0027s return type\n   ",
      "child_ranges": [
        "(line 1052,col 5)-(line 1052,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createArrowType(com.google.javascript.rhino.Node)",
      "begin_line": 1061,
      "end_line": 1063,
      "comment": "\n   * Creates an arrow type with an unknown return type.\n   *\n   * @param parametersNode the parameters\u0027 types, formatted as a Node with\n   *     param names and optionality info.\n   ",
      "child_ranges": [
        "(line 1062,col 5)-(line 1062,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1071,
      "end_line": 1074,
      "comment": "\n   * Creates a function type.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1073,col 5)-(line 1073,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType, java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1083,
      "end_line": 1087,
      "comment": "\n   * Creates a function type. The last parameter type of the function is\n   * considered a variable length argument.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1085,col 5)-(line 1086,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.JSType, java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1095,
      "end_line": 1098,
      "comment": "\n   * Creates a function type.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1097,col 5)-(line 1097,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1107,
      "end_line": 1111,
      "comment": "\n   * Creates a function type. The last parameter type of the function is\n   * considered a variable length argument.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1109,col 5)-(line 1110,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNativeFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1120,
      "end_line": 1124,
      "comment": "\n   * Creates a function type. The last parameter type of the function is\n   * considered a variable length argument.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1122,col 5)-(line 1123,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1132,
      "end_line": 1136,
      "comment": "\n   * Creates a function type which can act as a constructor.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1134,col 5)-(line 1135,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1145,
      "end_line": 1150,
      "comment": "\n   * Creates a function type which can act as a constructor. The last\n   * parameter type of the constructor is considered a variable length argument.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1147,col 5)-(line 1149,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType, java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1159,
      "end_line": 1166,
      "comment": "\n   * Creates a function type in which {@code this} refers to an object instance.\n   *\n   * @param instanceType the type of {@code this}\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1161,col 5)-(line 1165,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType, java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1177,
      "end_line": 1184,
      "comment": "\n   * Creates a function type in which {@code this} refers to an object instance.\n   * The last parameter type of the function is considered a variable length\n   * argument.\n   *\n   * @param instanceType the type of {@code this}\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1179,col 5)-(line 1183,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1192,
      "end_line": 1195,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list.\n   *\n   * @param parameterTypes the parameter types.\n   * @return a tree hierarchy representing a typed argument list.\n   ",
      "child_ranges": [
        "(line 1193,col 5)-(line 1194,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1205,
      "end_line": 1208,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list. The last\n   * parameter type is considered a variable length argument.\n   *\n   * @param parameterTypes the parameter types. The last element of this array\n   *     is considered a variable length argument.\n   * @return a tree hierarchy representing a typed argument list.\n   ",
      "child_ranges": [
        "(line 1206,col 5)-(line 1207,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1216,
      "end_line": 1218,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list.\n   *\n   * @param parameterTypes the parameter types.\n   * @return a tree hierarchy representing a typed argument list.\n   ",
      "child_ranges": [
        "(line 1217,col 5)-(line 1217,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1228,
      "end_line": 1230,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list. The last\n   * parameter type is considered a variable length argument.\n   *\n   * @param parameterTypes the parameter types. The last element of this array\n   *     is considered a variable length argument.\n   * @return a tree hierarchy representing a typed argument list.\n   ",
      "child_ranges": [
        "(line 1229,col 5)-(line 1229,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalParameters(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1236,
      "end_line": 1240,
      "comment": "\n   * Creates a tree hierarchy representing a typed parameter list in which\n   * every parameter is optional.\n   ",
      "child_ranges": [
        "(line 1237,col 5)-(line 1237,col 66)",
        "(line 1238,col 5)-(line 1238,col 46)",
        "(line 1239,col 5)-(line 1239,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(boolean, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1252,
      "end_line": 1263,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list.\n   *\n   * @param lastVarArgs whether the last type should considered as a variable\n   *     length argument.\n   * @param parameterTypes the parameter types. The last element of this array\n   *     is considered a variable length argument is {@code lastVarArgs} is\n   *     {@code true}.\n   * @return a tree hierarchy representing a typed argument list\n   ",
      "child_ranges": [
        "(line 1253,col 5)-(line 1253,col 66)",
        "(line 1254,col 5)-(line 1254,col 40)",
        "(line 1255,col 5)-(line 1261,col 5)",
        "(line 1262,col 5)-(line 1262,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1272,
      "end_line": 1279,
      "comment": "\n   * Creates a function type.\n   * @param returnType the function\u0027s return type\n   * @param lastVarArgs whether the last parameter type should be considered as\n   * an extensible var_args parameter\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1274,col 5)-(line 1278,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithNewReturnType(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1287,
      "end_line": 1293,
      "comment": "\n   * Creates a new function type based on an existing function type but\n   * with a new return type.\n   * @param existingFunctionType the existing function type.\n   * @param returnType the new return type.\n   ",
      "child_ranges": [
        "(line 1289,col 5)-(line 1292,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithNewThisType(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1301,
      "end_line": 1307,
      "comment": "\n   * Creates a new function type based on an existing function type but\n   * with a new {@code this} type.\n   * @param existingFunctionType the existing function type.\n   * @param thisType the new this type.\n   ",
      "child_ranges": [
        "(line 1303,col 5)-(line 1306,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 1315,
      "end_line": 1321,
      "comment": "\n   * @param parameters the function\u0027s parameters or {@code null}\n   *        to indicate that the parameter types are unknown.\n   * @param returnType the function\u0027s return type or {@code null} to indicate\n   *        that the return type is unknown.\n   ",
      "child_ranges": [
        "(line 1317,col 5)-(line 1320,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNativeFunctionType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 1323,
      "end_line": 1330,
      "comment": "",
      "child_ranges": [
        "(line 1325,col 5)-(line 1329,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1339,
      "end_line": 1346,
      "comment": "\n   * Creates a function type which can act as a constructor.\n   * @param returnType the function\u0027s return type\n   * @param lastVarArgs whether the last parameter type should be considered as\n   * an extensible var_args parameter\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1341,col 5)-(line 1345,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1351,
      "end_line": 1353,
      "comment": "\n   * Create an object type.\n   ",
      "child_ranges": [
        "(line 1352,col 5)-(line 1352,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createRecordType(java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty\u003e)",
      "begin_line": 1358,
      "end_line": 1360,
      "comment": "\n   * Creates a record type.\n   ",
      "child_ranges": [
        "(line 1359,col 5)-(line 1359,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createObjectType(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1365,
      "end_line": 1368,
      "comment": "\n   * Create an object type.\n   ",
      "child_ranges": [
        "(line 1367,col 5)-(line 1367,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createAnonymousObjectType(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 1374,
      "end_line": 1379,
      "comment": "\n   * Create an anonymous object type.\n   * @param info Used to mark object literals as structs; can be {@code null}\n   ",
      "child_ranges": [
        "(line 1375,col 5)-(line 1375,col 73)",
        "(line 1376,col 5)-(line 1376,col 30)",
        "(line 1377,col 5)-(line 1377,col 28)",
        "(line 1378,col 5)-(line 1378,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.resetImplicitPrototype(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1389,
      "end_line": 1398,
      "comment": "\n   * Set the implicit prototype if it\u0027s possible to do so.\n   * @return True if we were able to set the implicit prototype successfully,\n   *     false if it was not possible to do so for some reason. There are\n   *     a few different reasons why this could fail: for example, numbers\n   *     can\u0027t be implicit prototypes, and we don\u0027t want to change the implicit\n   *     prototype if other classes have already subclassed this one.\n   ",
      "child_ranges": [
        "(line 1391,col 5)-(line 1396,col 5)",
        "(line 1397,col 5)-(line 1397,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNativeAnonymousObjectType()",
      "begin_line": 1403,
      "end_line": 1408,
      "comment": "\n   * Create an anonymous object type for a native type.\n   ",
      "child_ranges": [
        "(line 1404,col 5)-(line 1405,col 68)",
        "(line 1406,col 5)-(line 1406,col 30)",
        "(line 1407,col 5)-(line 1407,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.common.collect.ImmutableList\u003cjava.lang.String\u003e)",
      "begin_line": 1422,
      "end_line": 1427,
      "comment": "\n   * Creates a constructor function type.\n   * @param name the function\u0027s name or {@code null} to indicate that the\n   *     function is anonymous.\n   * @param source the node defining this function. Its type\n   *     ({@link Node#getType()}) must be {@link Token#FUNCTION}.\n   * @param parameters the function\u0027s parameters or {@code null}\n   *     to indicate that the parameter types are unknown.\n   * @param returnType the function\u0027s return type or {@code null} to indicate\n   *     that the return type is unknown.\n   * @param templateKeys the templatized type keys for the class.\n   ",
      "child_ranges": [
        "(line 1424,col 5)-(line 1426,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createInterfaceType(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 1435,
      "end_line": 1437,
      "comment": "\n   * Creates an interface function type.\n   * @param name the function\u0027s name\n   * @param source the node defining this function. Its type\n   *     ({@link Node#getType()}) must be {@link Token#FUNCTION}.\n   ",
      "child_ranges": [
        "(line 1436,col 5)-(line 1436,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParameterizedType(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1442,
      "end_line": 1445,
      "comment": "\n   * Creates a parameterized type.\n   ",
      "child_ranges": [
        "(line 1444,col 5)-(line 1444,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createTemplatizedType(com.google.javascript.rhino.jstype.JSType, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1453,
      "end_line": 1466,
      "comment": "\n   * Creates a templatized instance of the specified type.\n   * @param baseType the type to be templatized.\n   * @param templatizedTypes a list of the template JSTypes. Will be matched by\n   *     list order to the template keys specified in the constructor function.\n   ",
      "child_ranges": [
        "(line 1457,col 5)-(line 1465,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNamedType(java.lang.String, java.lang.String, int, int)",
      "begin_line": 1471,
      "end_line": 1475,
      "comment": "\n   * Creates a named type.\n   ",
      "child_ranges": [
        "(line 1474,col 5)-(line 1474,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.identifyNonNullableName(java.lang.String)",
      "begin_line": 1480,
      "end_line": 1483,
      "comment": "\n   * Identifies the name of a typedef or enum before we actually declare it.\n   ",
      "child_ranges": [
        "(line 1481,col 5)-(line 1481,col 37)",
        "(line 1482,col 5)-(line 1482,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1491,
      "end_line": 1502,
      "comment": "\n   * Creates a JSType from the nodes representing a type.\n   * @param n The node with type info.\n   * @param sourceName The source file name.\n   * @param scope A scope for doing type name lookups.\n   ",
      "child_ranges": [
        "(line 1493,col 5)-(line 1500,col 5)",
        "(line 1501,col 5)-(line 1501,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.hasTypeName(com.google.javascript.rhino.Node)",
      "begin_line": 1504,
      "end_line": 1517,
      "comment": "",
      "child_ranges": [
        "(line 1505,col 5)-(line 1507,col 5)",
        "(line 1509,col 5)-(line 1514,col 5)",
        "(line 1516,col 5)-(line 1516,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1520,
      "end_line": 1674,
      "comment": " @see #createFromTypeNodes(Node, String, StaticScope) ",
      "child_ranges": [
        "(line 1522,col 5)-(line 1670,col 5)",
        "(line 1672,col 5)-(line 1673,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createRecordTypeFromNodes(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1682,
      "end_line": 1733,
      "comment": "\n   * Creates a RecordType from the nodes representing said record type.\n   * @param n The node with type info.\n   * @param sourceName The source file name.\n   * @param scope A scope for doing type name lookups.\n   ",
      "child_ranges": [
        "(line 1685,col 5)-(line 1685,col 60)",
        "(line 1688,col 5)-(line 1730,col 5)",
        "(line 1732,col 5)-(line 1732,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.setTemplateTypeNames(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1738,
      "end_line": 1743,
      "comment": "\n   * Sets the template type name.\n   ",
      "child_ranges": [
        "(line 1739,col 5)-(line 1739,col 38)",
        "(line 1740,col 5)-(line 1742,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.clearTemplateTypeNames()",
      "begin_line": 1748,
      "end_line": 1750,
      "comment": "\n   * Clears the template type name.\n   ",
      "child_ranges": [
        "(line 1749,col 5)-(line 1749,col 26)"
      ]
    }
  ]
}