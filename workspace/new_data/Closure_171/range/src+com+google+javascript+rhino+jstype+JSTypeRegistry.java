{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSTypeRegistry",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 1887,
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
        "OBJECT_INDEX_TEMPLATE"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n   * The name associated with the template variable corresponding to the\n   * property key type of the built-in Javascript object.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "objectIndexTemplateKey"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OBJECT_ELEMENT_TEMPLATE"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n   * The name associated with the template variable corresponding to the\n   * property value type for Javascript Objects and Arrays.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "objectElementTemplateKey"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PROPERTY_CHECKING_UNION_SIZE"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n   * The UnionTypeBuilder caps the maximum number of alternate types it\n   * remembers and then defaults to \"?\" (unknown type). By default this max\n   * is 20, but it\u0027s very easy for the same property to appear on more than 20\n   * types. Use larger unions for property checking. 3000 was picked\n   * semi-randomly for use by the Google+ FE project.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "reporter"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nativeTypes"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " CPU time on bounds checking inside get()."
    },
    {
      "type": "field",
      "varNames": [
        "namesToTypes"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaces"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Set of namespaces in which types (or other namespaces) exist."
    },
    {
      "type": "field",
      "varNames": [
        "nonNullableTypeNames"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " nullable or not."
    },
    {
      "type": "field",
      "varNames": [
        "forwardDeclaredTypes"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " try to type-check them at all."
    },
    {
      "type": "field",
      "varNames": [
        "typesIndexedByProperty"
      ],
      "begin_line": 144,
      "end_line": 145,
      "comment": " declared."
    },
    {
      "type": "field",
      "varNames": [
        "eachRefTypeIndexedByProperty"
      ],
      "begin_line": 150,
      "end_line": 151,
      "comment": " for de-duping."
    },
    {
      "type": "field",
      "varNames": [
        "greatestSubtypeByProperty"
      ],
      "begin_line": 156,
      "end_line": 157,
      "comment": " typesIndexedByProperty."
    },
    {
      "type": "field",
      "varNames": [
        "interfaceToImplementors"
      ],
      "begin_line": 160,
      "end_line": 161,
      "comment": " A map from interface name to types that implement it."
    },
    {
      "type": "field",
      "varNames": [
        "unresolvedNamedTypes"
      ],
      "begin_line": 164,
      "end_line": 165,
      "comment": " All the unresolved named types."
    },
    {
      "type": "field",
      "varNames": [
        "resolvedNamedTypes"
      ],
      "begin_line": 168,
      "end_line": 169,
      "comment": " All the resolved named types."
    },
    {
      "type": "field",
      "varNames": [
        "lastGeneration"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " NamedType warns about unresolved types in the last generation."
    },
    {
      "type": "field",
      "varNames": [
        "templateTypes"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The template type name."
    },
    {
      "type": "field",
      "varNames": [
        "emptyTemplateTypeMap"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " there are no template types."
    },
    {
      "type": "field",
      "varNames": [
        "tolerateUndefinedValues"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resolveMode"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.JSTypeRegistry(com.google.javascript.rhino.ErrorReporter)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n   * Constructs a new type registry populated with the built-in types.\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.JSTypeRegistry(com.google.javascript.rhino.ErrorReporter, boolean)",
      "begin_line": 223,
      "end_line": 232,
      "comment": "\n   * Constructs a new type registry populated with the built-in types.\n   ",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 29)",
        "(line 226,col 5)-(line 227,col 76)",
        "(line 228,col 5)-(line 228,col 59)",
        "(line 229,col 5)-(line 229,col 49)",
        "(line 230,col 5)-(line 230,col 24)",
        "(line 231,col 5)-(line 231,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getObjectElementKey()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n   * @return The template variable corresponding to the property value type for\n   * Javascript Objects and Arrays.\n   ",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getObjectIndexKey()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n   * @return The template variable corresponding to the\n   * property key type of the built-in Javascript object.\n   ",
      "child_ranges": [
        "(line 247,col 5)-(line 247,col 55)",
        "(line 248,col 5)-(line 248,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.setResolveMode(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n   * Set the current resolving mode of the type registry.\n   * @see ResolveMode\n   ",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getResolveMode()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getErrorReporter()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 5)-(line 264,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.shouldTolerateUndefinedValues()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 268,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.resetForTypeCheck()",
      "begin_line": 274,
      "end_line": 281,
      "comment": "\n   * Reset to run the TypeCheck pass.\n   ",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 35)",
        "(line 276,col 5)-(line 276,col 41)",
        "(line 277,col 5)-(line 277,col 29)",
        "(line 278,col 5)-(line 278,col 25)",
        "(line 279,col 5)-(line 279,col 23)",
        "(line 280,col 5)-(line 280,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.initializeBuiltInTypes()",
      "begin_line": 283,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 284,col 5)-(line 284,col 75)",
        "(line 285,col 5)-(line 285,col 79)",
        "(line 288,col 5)-(line 288,col 53)",
        "(line 289,col 5)-(line 289,col 64)",
        "(line 291,col 5)-(line 291,col 44)",
        "(line 292,col 5)-(line 292,col 58)",
        "(line 294,col 5)-(line 294,col 50)",
        "(line 295,col 5)-(line 295,col 62)",
        "(line 297,col 5)-(line 297,col 50)",
        "(line 298,col 5)-(line 298,col 62)",
        "(line 300,col 5)-(line 300,col 60)",
        "(line 301,col 5)-(line 301,col 64)",
        "(line 302,col 5)-(line 302,col 65)",
        "(line 303,col 5)-(line 304,col 63)",
        "(line 306,col 5)-(line 306,col 44)",
        "(line 307,col 5)-(line 307,col 58)",
        "(line 309,col 5)-(line 309,col 41)",
        "(line 310,col 5)-(line 310,col 56)",
        "(line 316,col 5)-(line 317,col 62)",
        "(line 318,col 5)-(line 318,col 78)",
        "(line 321,col 5)-(line 327,col 24)",
        "(line 329,col 5)-(line 329,col 65)",
        "(line 330,col 5)-(line 330,col 80)",
        "(line 332,col 5)-(line 332,col 68)",
        "(line 333,col 5)-(line 333,col 62)",
        "(line 335,col 5)-(line 335,col 70)",
        "(line 336,col 5)-(line 336,col 72)",
        "(line 339,col 5)-(line 343,col 36)",
        "(line 344,col 5)-(line 344,col 60)",
        "(line 345,col 5)-(line 346,col 69)",
        "(line 348,col 5)-(line 348,col 74)",
        "(line 349,col 5)-(line 349,col 76)",
        "(line 351,col 5)-(line 351,col 38)",
        "(line 352,col 5)-(line 352,col 54)",
        "(line 354,col 5)-(line 354,col 57)",
        "(line 355,col 5)-(line 355,col 68)",
        "(line 357,col 5)-(line 357,col 61)",
        "(line 358,col 5)-(line 358,col 72)",
        "(line 361,col 5)-(line 367,col 22)",
        "(line 368,col 5)-(line 369,col 46)",
        "(line 371,col 5)-(line 371,col 67)",
        "(line 372,col 5)-(line 372,col 78)",
        "(line 374,col 5)-(line 374,col 66)",
        "(line 375,col 5)-(line 375,col 60)",
        "(line 378,col 5)-(line 381,col 36)",
        "(line 382,col 5)-(line 382,col 78)",
        "(line 383,col 5)-(line 385,col 38)",
        "(line 387,col 5)-(line 388,col 55)",
        "(line 389,col 5)-(line 389,col 78)",
        "(line 392,col 5)-(line 398,col 34)",
        "(line 399,col 5)-(line 399,col 65)",
        "(line 400,col 5)-(line 400,col 76)",
        "(line 402,col 5)-(line 402,col 64)",
        "(line 403,col 5)-(line 403,col 58)",
        "(line 406,col 5)-(line 406,col 76)",
        "(line 407,col 5)-(line 407,col 78)",
        "(line 409,col 5)-(line 409,col 66)",
        "(line 410,col 5)-(line 410,col 60)",
        "(line 413,col 5)-(line 414,col 49)",
        "(line 415,col 5)-(line 415,col 61)",
        "(line 416,col 5)-(line 417,col 73)",
        "(line 419,col 5)-(line 419,col 76)",
        "(line 420,col 5)-(line 420,col 70)",
        "(line 423,col 5)-(line 424,col 50)",
        "(line 425,col 5)-(line 425,col 62)",
        "(line 426,col 5)-(line 427,col 75)",
        "(line 429,col 5)-(line 429,col 78)",
        "(line 430,col 5)-(line 430,col 72)",
        "(line 433,col 5)-(line 434,col 54)",
        "(line 435,col 5)-(line 435,col 66)",
        "(line 436,col 5)-(line 438,col 39)",
        "(line 440,col 5)-(line 441,col 56)",
        "(line 442,col 5)-(line 442,col 80)",
        "(line 445,col 5)-(line 446,col 51)",
        "(line 447,col 5)-(line 447,col 63)",
        "(line 448,col 5)-(line 449,col 77)",
        "(line 451,col 5)-(line 451,col 80)",
        "(line 452,col 5)-(line 452,col 74)",
        "(line 455,col 5)-(line 456,col 49)",
        "(line 457,col 5)-(line 457,col 61)",
        "(line 458,col 5)-(line 459,col 73)",
        "(line 461,col 5)-(line 461,col 76)",
        "(line 462,col 5)-(line 462,col 70)",
        "(line 465,col 5)-(line 466,col 48)",
        "(line 467,col 5)-(line 467,col 60)",
        "(line 468,col 5)-(line 469,col 71)",
        "(line 471,col 5)-(line 471,col 74)",
        "(line 472,col 5)-(line 472,col 68)",
        "(line 475,col 5)-(line 478,col 36)",
        "(line 479,col 5)-(line 479,col 76)",
        "(line 480,col 5)-(line 481,col 79)",
        "(line 483,col 5)-(line 484,col 54)",
        "(line 485,col 5)-(line 485,col 76)",
        "(line 488,col 5)-(line 491,col 34)",
        "(line 492,col 5)-(line 493,col 47)",
        "(line 495,col 5)-(line 495,col 69)",
        "(line 496,col 5)-(line 496,col 80)",
        "(line 498,col 5)-(line 498,col 68)",
        "(line 499,col 5)-(line 499,col 62)",
        "(line 502,col 5)-(line 505,col 36)",
        "(line 506,col 5)-(line 506,col 76)",
        "(line 507,col 5)-(line 508,col 79)",
        "(line 510,col 5)-(line 511,col 54)",
        "(line 512,col 5)-(line 513,col 61)",
        "(line 516,col 5)-(line 517,col 46)",
        "(line 518,col 5)-(line 518,col 58)",
        "(line 521,col 5)-(line 522,col 63)",
        "(line 523,col 5)-(line 523,col 80)",
        "(line 526,col 5)-(line 527,col 77)",
        "(line 528,col 5)-(line 529,col 38)",
        "(line 532,col 5)-(line 533,col 64)",
        "(line 534,col 5)-(line 535,col 31)",
        "(line 538,col 5)-(line 538,col 69)",
        "(line 539,col 5)-(line 539,col 66)",
        "(line 544,col 5)-(line 545,col 57)",
        "(line 546,col 5)-(line 547,col 79)",
        "(line 550,col 5)-(line 551,col 57)",
        "(line 552,col 5)-(line 553,col 79)",
        "(line 556,col 5)-(line 557,col 61)",
        "(line 558,col 5)-(line 558,col 74)",
        "(line 562,col 5)-(line 578,col 10)",
        "(line 582,col 5)-(line 582,col 80)",
        "(line 583,col 5)-(line 584,col 67)",
        "(line 586,col 5)-(line 586,col 65)",
        "(line 587,col 5)-(line 587,col 66)",
        "(line 590,col 5)-(line 591,col 63)",
        "(line 592,col 5)-(line 592,col 78)",
        "(line 595,col 5)-(line 598,col 36)",
        "(line 599,col 5)-(line 599,col 64)",
        "(line 600,col 5)-(line 600,col 62)",
        "(line 603,col 5)-(line 604,col 63)",
        "(line 605,col 5)-(line 606,col 32)",
        "(line 610,col 5)-(line 610,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 572,
      "end_line": 572,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.Anonymous-04bb774b-26c0-4b5f-bdd0-edb3b52548c6.getConstructor()",
      "begin_line": 574,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 575,col 13)-(line 576,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.initializeRegistry()",
      "begin_line": 613,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 614,col 5)-(line 614,col 53)",
        "(line 615,col 5)-(line 615,col 62)",
        "(line 616,col 5)-(line 616,col 55)",
        "(line 617,col 5)-(line 617,col 52)",
        "(line 618,col 5)-(line 618,col 52)",
        "(line 619,col 5)-(line 619,col 60)",
        "(line 620,col 5)-(line 620,col 61)",
        "(line 621,col 5)-(line 621,col 54)",
        "(line 622,col 5)-(line 622,col 54)",
        "(line 623,col 5)-(line 623,col 53)",
        "(line 624,col 5)-(line 624,col 57)",
        "(line 625,col 5)-(line 625,col 58)",
        "(line 626,col 5)-(line 626,col 58)",
        "(line 627,col 5)-(line 627,col 59)",
        "(line 628,col 5)-(line 628,col 63)",
        "(line 629,col 5)-(line 629,col 60)",
        "(line 630,col 5)-(line 630,col 54)",
        "(line 631,col 5)-(line 631,col 61)",
        "(line 632,col 5)-(line 632,col 54)",
        "(line 633,col 5)-(line 633,col 52)",
        "(line 634,col 5)-(line 634,col 65)",
        "(line 635,col 5)-(line 635,col 60)",
        "(line 636,col 5)-(line 636,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.register(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 639,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 640,col 5)-(line 640,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.register(com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 643,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 644,col 5)-(line 645,col 80)",
        "(line 647,col 5)-(line 647,col 33)",
        "(line 650,col 5)-(line 653,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 656,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 5)-(line 657,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.registerPropertyOnType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 672,
      "end_line": 684,
      "comment": "\n   * Tells the type system that {@code owner} may have a property named\n   * {@code propertyName}. This allows the registry to keep track of what\n   * types a property is defined upon.\n   *\n   * This is NOT the same as saying that {@code owner} must have a property\n   * named type. ObjectType#hasProperty attempts to minimize false positives\n   * (\"if we\u0027re not sure, then don\u0027t type check this property\"). The type\n   * registry, on the other hand, should attempt to minimize false negatives\n   * (\"if this property is assigned anywhere in the program, it must\n   * show up in the type registry\").\n   ",
      "child_ranges": [
        "(line 673,col 5)-(line 673,col 72)",
        "(line 674,col 5)-(line 677,col 5)",
        "(line 679,col 5)-(line 679,col 31)",
        "(line 680,col 5)-(line 680,col 58)",
        "(line 683,col 5)-(line 683,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.addReferenceTypeIndexedByProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 686,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 688,col 5)-(line 704,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.unregisterPropertyOnType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 715,
      "end_line": 722,
      "comment": "\n   * Removes the index\u0027s reference to a property on the given type (if it is\n   * currently registered). If the property is not registered on the type yet,\n   * this method will not change internal state.\n   *\n   * @param propertyName the name of the property to unregister\n   * @param type the type to unregister the property on.\n   ",
      "child_ranges": [
        "(line 717,col 5)-(line 718,col 55)",
        "(line 719,col 5)-(line 721,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getGreatestSubtypeWithProperty(com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 728,
      "end_line": 740,
      "comment": "\n   * Gets the greatest subtype of the {@code type} that has a property\n   * {@code propertyName} defined on it.\n   ",
      "child_ranges": [
        "(line 730,col 5)-(line 733,col 5)",
        "(line 734,col 5)-(line 738,col 5)",
        "(line 739,col 5)-(line 739,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.canPropertyBeDefined(com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 745,
      "end_line": 763,
      "comment": "\n   * Returns whether the given property can possibly be set on the given type.\n   ",
      "child_ranges": [
        "(line 746,col 5)-(line 761,col 5)",
        "(line 762,col 5)-(line 762,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getTypesWithProperty(java.lang.String)",
      "begin_line": 773,
      "end_line": 779,
      "comment": "\n   * Returns each type that has a property {@code propertyName} defined on it.\n   *\n   * Like most types in our type system, the collection of types returned\n   * will be collapsed. This means that if a type is defined on\n   * {@code Object} and on {@code Array}, it would be reasonable for this\n   * method to return either {@code [Object, Array]} or just {@code [Object]}.\n   ",
      "child_ranges": [
        "(line 774,col 5)-(line 778,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getEachReferenceTypeWithProperty(java.lang.String)",
      "begin_line": 791,
      "end_line": 798,
      "comment": "\n   * Returns each reference type that has a property {@code propertyName}\n   * defined on it.\n   *\n   * Unlike most types in our type system, the collection of types returned\n   * will not be collapsed. This means that if a type is defined on\n   * {@code Object} and on {@code Array}, this method must return\n   * {@code [Object, Array]}. It would not be correct to collapse them to\n   * {@code [Object]}.\n   ",
      "child_ranges": [
        "(line 793,col 5)-(line 797,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.findCommonSuperObject(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 803,
      "end_line": 818,
      "comment": "\n   * Finds the common supertype of the two given object types.\n   ",
      "child_ranges": [
        "(line 804,col 5)-(line 804,col 47)",
        "(line 805,col 5)-(line 805,col 47)",
        "(line 807,col 5)-(line 807,col 70)",
        "(line 808,col 5)-(line 816,col 5)",
        "(line 817,col 5)-(line 817,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getSuperStack(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 820,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 821,col 5)-(line 821,col 67)",
        "(line 822,col 5)-(line 826,col 5)",
        "(line 827,col 5)-(line 827,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.incrementGeneration()",
      "begin_line": 835,
      "end_line": 841,
      "comment": "\n   * Increments the current generation. Clients must call this in order to\n   * move to the next generation of type resolution, allowing types to attempt\n   * resolution again.\n   ",
      "child_ranges": [
        "(line 836,col 5)-(line 838,col 5)",
        "(line 839,col 5)-(line 839,col 52)",
        "(line 840,col 5)-(line 840,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.isLastGeneration()",
      "begin_line": 843,
      "end_line": 845,
      "comment": "",
      "child_ranges": [
        "(line 844,col 5)-(line 844,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.setLastGeneration(boolean)",
      "begin_line": 851,
      "end_line": 853,
      "comment": "\n   * Sets whether this is the last generation. In the last generation,\n   * {@link NamedType} warns about unresolved types.\n   ",
      "child_ranges": [
        "(line 852,col 5)-(line 852,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 861,
      "end_line": 864,
      "comment": "\n   * Tells the type system that {@code type} implements interface {@code\n   * interfaceInstance}.\n   * {@code inter} must be an ObjectType for the instance of the interface as it\n   * could be a named type and not yet have the constructor.\n   ",
      "child_ranges": [
        "(line 863,col 5)-(line 863,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getDirectImplementors(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 872,
      "end_line": 875,
      "comment": "\n   * Returns a collection of types that directly implement {@code\n   * interfaceInstance}.  Subtypes of implementing types are not guaranteed to\n   * be returned.  {@code interfaceInstance} must be an ObjectType for the\n   * instance of the interface.\n   ",
      "child_ranges": [
        "(line 874,col 5)-(line 874,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.declareType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 885,
      "end_line": 891,
      "comment": "\n   * Records declared global type names. This makes resolution faster\n   * and more robust in the common case.\n   *\n   * @param name The name of the type to be recorded.\n   * @param t The actual type being associated with the name.\n   * @return True if this name is not already defined, false otherwise.\n   ",
      "child_ranges": [
        "(line 886,col 5)-(line 888,col 5)",
        "(line 889,col 5)-(line 889,col 22)",
        "(line 890,col 5)-(line 890,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.overwriteDeclaredType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 897,
      "end_line": 900,
      "comment": "\n   * Overrides a declared global type name. Throws an exception if this\n   * type name hasn\u0027t been declared yet.\n   ",
      "child_ranges": [
        "(line 898,col 5)-(line 898,col 61)",
        "(line 899,col 5)-(line 899,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.forwardDeclareType(java.lang.String)",
      "begin_line": 906,
      "end_line": 908,
      "comment": "\n   * Records a forward-declared type name. We will not emit errors if this\n   * type name never resolves to anything.\n   ",
      "child_ranges": [
        "(line 907,col 5)-(line 907,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.isForwardDeclaredType(java.lang.String)",
      "begin_line": 913,
      "end_line": 915,
      "comment": "\n   * Whether this is a forward-declared type name.\n   ",
      "child_ranges": [
        "(line 914,col 5)-(line 914,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.hasNamespace(java.lang.String)",
      "begin_line": 918,
      "end_line": 920,
      "comment": " Determines whether the given JS package exists. ",
      "child_ranges": [
        "(line 919,col 5)-(line 919,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getType(java.lang.String)",
      "begin_line": 928,
      "end_line": 936,
      "comment": "\n   * Looks up a type by name.\n   *\n   * @param jsTypeName The name string.\n   * @return the corresponding JSType object or {@code null} it cannot be found\n   ",
      "child_ranges": [
        "(line 931,col 5)-(line 931,col 62)",
        "(line 932,col 5)-(line 934,col 5)",
        "(line 935,col 5)-(line 935,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 938,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 939,col 5)-(line 939,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 942,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 943,col 5)-(line 943,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 946,
      "end_line": 948,
      "comment": "",
      "child_ranges": [
        "(line 947,col 5)-(line 947,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.getType(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e, java.lang.String, java.lang.String, int, int)",
      "begin_line": 962,
      "end_line": 988,
      "comment": "\n   * Looks up a type by name. To allow for forward references to types, an\n   * unrecognized string has to be bound to a NamedType object that will be\n   * resolved later.\n   *\n   * @param scope A scope for doing type name resolution.\n   * @param jsTypeName The name string.\n   * @param sourceName The name of the source file where this reference appears.\n   * @param lineno The line number of the reference.\n   * @return a NamedType if the string argument is not one of the known types,\n   *     otherwise the corresponding JSType object.\n   ",
      "child_ranges": [
        "(line 965,col 5)-(line 965,col 23)",
        "(line 966,col 5)-(line 966,col 27)",
        "(line 967,col 5)-(line 969,col 5)",
        "(line 970,col 5)-(line 976,col 5)",
        "(line 978,col 5)-(line 978,col 31)",
        "(line 979,col 5)-(line 986,col 5)",
        "(line 987,col 5)-(line 987,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.clearNamedTypes()",
      "begin_line": 995,
      "end_line": 998,
      "comment": "\n   * Flushes out the current resolved and unresolved Named Types from\n   * the type registry.  This is intended to be used ONLY before a\n   * compile is run.\n   ",
      "child_ranges": [
        "(line 996,col 5)-(line 996,col 31)",
        "(line 997,col 5)-(line 997,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.resolveTypesInScope(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1003,
      "end_line": 1027,
      "comment": "\n   * Resolve all the unresolved types in the given scope.\n   ",
      "child_ranges": [
        "(line 1004,col 5)-(line 1006,col 5)",
        "(line 1008,col 5)-(line 1008,col 76)",
        "(line 1010,col 5)-(line 1026,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1033,
      "end_line": 1039,
      "comment": "\n   * Creates a type representing optional values of the given type.\n   * @return the union of the type and the void type\n   ",
      "child_ranges": [
        "(line 1034,col 5)-(line 1038,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createDefaultObjectUnion(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1045,
      "end_line": 1055,
      "comment": "\n   * Creates a type representing nullable values of the given type.\n   * @return the union of the type and the Null type\n   ",
      "child_ranges": [
        "(line 1046,col 5)-(line 1054,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNullableType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1061,
      "end_line": 1063,
      "comment": "\n   * Creates a type representing nullable values of the given type.\n   * @return the union of the type and the Null type\n   ",
      "child_ranges": [
        "(line 1062,col 5)-(line 1062,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalNullableType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1069,
      "end_line": 1072,
      "comment": "\n   * Creates a nullable and undefine-able value of the given type.\n   * @return The union of the type and null and undefined.\n   ",
      "child_ranges": [
        "(line 1070,col 5)-(line 1071,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1077,
      "end_line": 1083,
      "comment": "\n   * Creates a union type whose variants are the arguments.\n   ",
      "child_ranges": [
        "(line 1078,col 5)-(line 1078,col 58)",
        "(line 1079,col 5)-(line 1081,col 5)",
        "(line 1082,col 5)-(line 1082,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative...)",
      "begin_line": 1089,
      "end_line": 1095,
      "comment": "\n   * Creates a union type whose variants are the built-in types specified\n   * by the arguments.\n   ",
      "child_ranges": [
        "(line 1090,col 5)-(line 1090,col 58)",
        "(line 1091,col 5)-(line 1093,col 5)",
        "(line 1094,col 5)-(line 1094,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createEnumType(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1100,
      "end_line": 1103,
      "comment": "\n   * Creates an enum type.\n   ",
      "child_ranges": [
        "(line 1102,col 5)-(line 1102,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createArrowType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1113,
      "end_line": 1115,
      "comment": "\n   * Creates an arrow type, an abstract representation of the parameters\n   * and return value of a function.\n   *\n   * @param parametersNode the parameters\u0027 types, formatted as a Node with\n   *     param names and optionality info.\n   * @param returnType the function\u0027s return type\n   ",
      "child_ranges": [
        "(line 1114,col 5)-(line 1114,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createArrowType(com.google.javascript.rhino.Node)",
      "begin_line": 1123,
      "end_line": 1125,
      "comment": "\n   * Creates an arrow type with an unknown return type.\n   *\n   * @param parametersNode the parameters\u0027 types, formatted as a Node with\n   *     param names and optionality info.\n   ",
      "child_ranges": [
        "(line 1124,col 5)-(line 1124,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1133,
      "end_line": 1136,
      "comment": "\n   * Creates a function type.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1135,col 5)-(line 1135,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType, java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1145,
      "end_line": 1149,
      "comment": "\n   * Creates a function type. The last parameter type of the function is\n   * considered a variable length argument.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1147,col 5)-(line 1148,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.JSType, java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1157,
      "end_line": 1160,
      "comment": "\n   * Creates a function type.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1159,col 5)-(line 1159,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1169,
      "end_line": 1173,
      "comment": "\n   * Creates a function type. The last parameter type of the function is\n   * considered a variable length argument.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1171,col 5)-(line 1172,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNativeFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1182,
      "end_line": 1186,
      "comment": "\n   * Creates a function type. The last parameter type of the function is\n   * considered a variable length argument.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1184,col 5)-(line 1185,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1194,
      "end_line": 1198,
      "comment": "\n   * Creates a function type which can act as a constructor.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1196,col 5)-(line 1197,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1207,
      "end_line": 1212,
      "comment": "\n   * Creates a function type which can act as a constructor. The last\n   * parameter type of the constructor is considered a variable length argument.\n   *\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1209,col 5)-(line 1211,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType, java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1221,
      "end_line": 1228,
      "comment": "\n   * Creates a function type in which {@code this} refers to an object instance.\n   *\n   * @param instanceType the type of {@code this}\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1223,col 5)-(line 1227,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType, java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1239,
      "end_line": 1246,
      "comment": "\n   * Creates a function type in which {@code this} refers to an object instance.\n   * The last parameter type of the function is considered a variable length\n   * argument.\n   *\n   * @param instanceType the type of {@code this}\n   * @param returnType the function\u0027s return type\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1241,col 5)-(line 1245,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1254,
      "end_line": 1257,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list.\n   *\n   * @param parameterTypes the parameter types.\n   * @return a tree hierarchy representing a typed argument list.\n   ",
      "child_ranges": [
        "(line 1255,col 5)-(line 1256,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(java.util.List\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1267,
      "end_line": 1270,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list. The last\n   * parameter type is considered a variable length argument.\n   *\n   * @param parameterTypes the parameter types. The last element of this array\n   *     is considered a variable length argument.\n   * @return a tree hierarchy representing a typed argument list.\n   ",
      "child_ranges": [
        "(line 1268,col 5)-(line 1269,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1278,
      "end_line": 1280,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list.\n   *\n   * @param parameterTypes the parameter types.\n   * @return a tree hierarchy representing a typed argument list.\n   ",
      "child_ranges": [
        "(line 1279,col 5)-(line 1279,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1290,
      "end_line": 1292,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list. The last\n   * parameter type is considered a variable length argument.\n   *\n   * @param parameterTypes the parameter types. The last element of this array\n   *     is considered a variable length argument.\n   * @return a tree hierarchy representing a typed argument list.\n   ",
      "child_ranges": [
        "(line 1291,col 5)-(line 1291,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalParameters(com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1298,
      "end_line": 1302,
      "comment": "\n   * Creates a tree hierarchy representing a typed parameter list in which\n   * every parameter is optional.\n   ",
      "child_ranges": [
        "(line 1299,col 5)-(line 1299,col 66)",
        "(line 1300,col 5)-(line 1300,col 46)",
        "(line 1301,col 5)-(line 1301,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(boolean, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1314,
      "end_line": 1325,
      "comment": "\n   * Creates a tree hierarchy representing a typed argument list.\n   *\n   * @param lastVarArgs whether the last type should considered as a variable\n   *     length argument.\n   * @param parameterTypes the parameter types. The last element of this array\n   *     is considered a variable length argument is {@code lastVarArgs} is\n   *     {@code true}.\n   * @return a tree hierarchy representing a typed argument list\n   ",
      "child_ranges": [
        "(line 1315,col 5)-(line 1315,col 66)",
        "(line 1316,col 5)-(line 1316,col 40)",
        "(line 1317,col 5)-(line 1323,col 5)",
        "(line 1324,col 5)-(line 1324,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1334,
      "end_line": 1341,
      "comment": "\n   * Creates a function type.\n   * @param returnType the function\u0027s return type\n   * @param lastVarArgs whether the last parameter type should be considered as\n   * an extensible var_args parameter\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1336,col 5)-(line 1340,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithNewReturnType(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1349,
      "end_line": 1355,
      "comment": "\n   * Creates a new function type based on an existing function type but\n   * with a new return type.\n   * @param existingFunctionType the existing function type.\n   * @param returnType the new return type.\n   ",
      "child_ranges": [
        "(line 1351,col 5)-(line 1354,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionTypeWithNewThisType(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1363,
      "end_line": 1369,
      "comment": "\n   * Creates a new function type based on an existing function type but\n   * with a new {@code this} type.\n   * @param existingFunctionType the existing function type.\n   * @param thisType the new this type.\n   ",
      "child_ranges": [
        "(line 1365,col 5)-(line 1368,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFunctionType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 1377,
      "end_line": 1383,
      "comment": "\n   * @param parameters the function\u0027s parameters or {@code null}\n   *        to indicate that the parameter types are unknown.\n   * @param returnType the function\u0027s return type or {@code null} to indicate\n   *        that the return type is unknown.\n   ",
      "child_ranges": [
        "(line 1379,col 5)-(line 1382,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNativeFunctionType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 1385,
      "end_line": 1392,
      "comment": "",
      "child_ranges": [
        "(line 1387,col 5)-(line 1391,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1401,
      "end_line": 1408,
      "comment": "\n   * Creates a function type which can act as a constructor.\n   * @param returnType the function\u0027s return type\n   * @param lastVarArgs whether the last parameter type should be considered as\n   * an extensible var_args parameter\n   * @param parameterTypes the parameters\u0027 types\n   ",
      "child_ranges": [
        "(line 1403,col 5)-(line 1407,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1413,
      "end_line": 1415,
      "comment": "\n   * Create an object type.\n   ",
      "child_ranges": [
        "(line 1414,col 5)-(line 1414,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createRecordType(java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty\u003e)",
      "begin_line": 1420,
      "end_line": 1422,
      "comment": "\n   * Creates a record type.\n   ",
      "child_ranges": [
        "(line 1421,col 5)-(line 1421,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createObjectType(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1427,
      "end_line": 1430,
      "comment": "\n   * Create an object type.\n   ",
      "child_ranges": [
        "(line 1429,col 5)-(line 1429,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createAnonymousObjectType(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 1436,
      "end_line": 1441,
      "comment": "\n   * Create an anonymous object type.\n   * @param info Used to mark object literals as structs; can be {@code null}\n   ",
      "child_ranges": [
        "(line 1437,col 5)-(line 1437,col 73)",
        "(line 1438,col 5)-(line 1438,col 30)",
        "(line 1439,col 5)-(line 1439,col 28)",
        "(line 1440,col 5)-(line 1440,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.resetImplicitPrototype(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1451,
      "end_line": 1460,
      "comment": "\n   * Set the implicit prototype if it\u0027s possible to do so.\n   * @return True if we were able to set the implicit prototype successfully,\n   *     false if it was not possible to do so for some reason. There are\n   *     a few different reasons why this could fail: for example, numbers\n   *     can\u0027t be implicit prototypes, and we don\u0027t want to change the implicit\n   *     prototype if other classes have already subclassed this one.\n   ",
      "child_ranges": [
        "(line 1453,col 5)-(line 1458,col 5)",
        "(line 1459,col 5)-(line 1459,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNativeAnonymousObjectType()",
      "begin_line": 1465,
      "end_line": 1470,
      "comment": "\n   * Create an anonymous object type for a native type.\n   ",
      "child_ranges": [
        "(line 1466,col 5)-(line 1467,col 62)",
        "(line 1468,col 5)-(line 1468,col 30)",
        "(line 1469,col 5)-(line 1469,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.TemplateType\u003e)",
      "begin_line": 1484,
      "end_line": 1489,
      "comment": "\n   * Creates a constructor function type.\n   * @param name the function\u0027s name or {@code null} to indicate that the\n   *     function is anonymous.\n   * @param source the node defining this function. Its type\n   *     ({@link Node#getType()}) must be {@link Token#FUNCTION}.\n   * @param parameters the function\u0027s parameters or {@code null}\n   *     to indicate that the parameter types are unknown.\n   * @param returnType the function\u0027s return type or {@code null} to indicate\n   *     that the return type is unknown.\n   * @param templateKeys the templatized types for the class.\n   ",
      "child_ranges": [
        "(line 1486,col 5)-(line 1488,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createTemplateMapKeys(com.google.common.collect.ImmutableList\u003cjava.lang.String\u003e)",
      "begin_line": 1491,
      "end_line": 1499,
      "comment": "",
      "child_ranges": [
        "(line 1492,col 5)-(line 1492,col 74)",
        "(line 1493,col 5)-(line 1497,col 5)",
        "(line 1498,col 5)-(line 1498,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createInterfaceType(java.lang.String, com.google.javascript.rhino.Node, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.TemplateType\u003e)",
      "begin_line": 1508,
      "end_line": 1512,
      "comment": "\n   * Creates an interface function type.\n   * @param name the function\u0027s name\n   * @param source the node defining this function. Its type\n   *     ({@link Node#getType()}) must be {@link Token#FUNCTION}.\n   * @param templateKeys the templatized types for the interface.\n   ",
      "child_ranges": [
        "(line 1510,col 5)-(line 1511,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createTemplateType(java.lang.String)",
      "begin_line": 1514,
      "end_line": 1516,
      "comment": "",
      "child_ranges": [
        "(line 1515,col 5)-(line 1515,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createTemplateTypeMap(com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.TemplateType\u003e, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1522,
      "end_line": 1533,
      "comment": "\n   * Creates a template type map from the specified list of template keys and\n   * template value types.\n   ",
      "child_ranges": [
        "(line 1525,col 5)-(line 1526,col 56)",
        "(line 1527,col 5)-(line 1528,col 52)",
        "(line 1530,col 5)-(line 1532,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createTemplatizedType(com.google.javascript.rhino.jstype.ObjectType, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1543,
      "end_line": 1548,
      "comment": "\n   * Creates a templatized instance of the specified type.  Only ObjectTypes\n   * can currently be templatized; extend the logic in this function when\n   * more types can be templatized.\n   * @param baseType the type to be templatized.\n   * @param templatizedTypes a list of the template JSTypes. Will be matched by\n   *     list order to the template keys on the base type.\n   ",
      "child_ranges": [
        "(line 1547,col 5)-(line 1547,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createTemplatizedType(com.google.javascript.rhino.jstype.ObjectType, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1559,
      "end_line": 1569,
      "comment": "\n   * Creates a templatized instance of the specified type.  Only ObjectTypes\n   * can currently be templatized; extend the logic in this function when\n   * more types can be templatized.\n   * @param baseType the type to be templatized.\n   * @param templatizedTypes a map from TemplateType to corresponding JSType\n   *     value. Any unfilled TemplateTypes on the baseType that are *not*\n   *     contained in this map will have UNKNOWN_TYPE used as their value.\n   ",
      "child_ranges": [
        "(line 1561,col 5)-(line 1561,col 68)",
        "(line 1562,col 5)-(line 1562,col 72)",
        "(line 1563,col 5)-(line 1567,col 5)",
        "(line 1568,col 5)-(line 1568,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createTemplatizedType(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType...)",
      "begin_line": 1579,
      "end_line": 1583,
      "comment": "\n   * Creates a templatized instance of the specified type.  Only ObjectTypes\n   * can currently be templatized; extend the logic in this function when\n   * more types can be templatized.\n   * @param baseType the type to be templatized.\n   * @param templatizedTypes a list of the template JSTypes. Will be matched by\n   *     list order to the template keys on the base type.\n   ",
      "child_ranges": [
        "(line 1581,col 5)-(line 1582,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createNamedType(java.lang.String, java.lang.String, int, int)",
      "begin_line": 1588,
      "end_line": 1592,
      "comment": "\n   * Creates a named type.\n   ",
      "child_ranges": [
        "(line 1591,col 5)-(line 1591,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.identifyNonNullableName(java.lang.String)",
      "begin_line": 1597,
      "end_line": 1600,
      "comment": "\n   * Identifies the name of a typedef or enum before we actually declare it.\n   ",
      "child_ranges": [
        "(line 1598,col 5)-(line 1598,col 37)",
        "(line 1599,col 5)-(line 1599,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1608,
      "end_line": 1619,
      "comment": "\n   * Creates a JSType from the nodes representing a type.\n   * @param n The node with type info.\n   * @param sourceName The source file name.\n   * @param scope A scope for doing type name lookups.\n   ",
      "child_ranges": [
        "(line 1610,col 5)-(line 1617,col 5)",
        "(line 1618,col 5)-(line 1618,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.hasTypeName(com.google.javascript.rhino.Node)",
      "begin_line": 1621,
      "end_line": 1634,
      "comment": "",
      "child_ranges": [
        "(line 1622,col 5)-(line 1624,col 5)",
        "(line 1626,col 5)-(line 1631,col 5)",
        "(line 1633,col 5)-(line 1633,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1637,
      "end_line": 1810,
      "comment": " @see #createFromTypeNodes(Node, String, StaticScope) ",
      "child_ranges": [
        "(line 1639,col 5)-(line 1806,col 5)",
        "(line 1808,col 5)-(line 1809,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.createRecordTypeFromNodes(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1818,
      "end_line": 1869,
      "comment": "\n   * Creates a RecordType from the nodes representing said record type.\n   * @param n The node with type info.\n   * @param sourceName The source file name.\n   * @param scope A scope for doing type name lookups.\n   ",
      "child_ranges": [
        "(line 1821,col 5)-(line 1821,col 60)",
        "(line 1824,col 5)-(line 1866,col 5)",
        "(line 1868,col 5)-(line 1868,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.setTemplateTypeNames(java.util.List\u003ccom.google.javascript.rhino.jstype.TemplateType\u003e)",
      "begin_line": 1874,
      "end_line": 1879,
      "comment": "\n   * Sets the template type name.\n   ",
      "child_ranges": [
        "(line 1875,col 5)-(line 1875,col 37)",
        "(line 1876,col 5)-(line 1878,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSTypeRegistry.clearTemplateTypeNames()",
      "begin_line": 1884,
      "end_line": 1886,
      "comment": "\n   * Clears the template type name.\n   ",
      "child_ranges": [
        "(line 1885,col 5)-(line 1885,col 26)"
      ]
    }
  ]
}