{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CheckAccessControlsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckAccessControlsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 39,
      "end_line": 838,
      "comment": "\n * Tests for {@link CheckAccessControls}.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.CheckAccessControlsTest()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 48)",
        "(line 43,col 5)-(line 43,col 25)",
        "(line 44,col 5)-(line 44,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.getOptions()",
      "begin_line": 52,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 49)",
        "(line 55,col 5)-(line 55,col 80)",
        "(line 56,col 5)-(line 57,col 26)",
        "(line 58,col 5)-(line 58,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testDep(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 74,
      "end_line": 83,
      "comment": "\n   * Tests that the given JavaScript code has a @deprecated marker\n   * somewhere in it which raises an error. Also tests that the\n   * deprecated marker works with a message. The JavaScript should\n   * have a JsDoc of the form \"@deprecated %s\\n\".\n   *\n   * @param js The JavaScript code to parse and test.\n   * @param reason A simple deprecation reason string, used for testing\n   *    the addition of a deprecation reason to the @deprecated tag.\n   * @param error The deprecation error expected when no reason is given.\n   * @param errorWithMessage The deprecation error expected when a reason\n   *    message is given.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 45)",
        "(line 82,col 5)-(line 82,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testDeprecatedFunction()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 88,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningOnDeprecatedConstVariable()",
      "begin_line": 91,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 94,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testThatNumbersArentDeprecated()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 99,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testDeprecatedFunctionVariable()",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 105,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInGlobalScope()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 110,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInGlobalScopeForCall()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 115,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInDeprecatedFunction()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 120,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningInNormalClass()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 127,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForProperty1()",
      "begin_line": 130,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 135,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForProperty2()",
      "begin_line": 138,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 144,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForDeprecatedClass()",
      "begin_line": 147,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningForDeprecatedClassInstance()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 157,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForDeprecatedSuperClass()",
      "begin_line": 160,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 161,col 5)-(line 166,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForDeprecatedSuperClass2()",
      "begin_line": 169,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 177,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForPrototypeProperty()",
      "begin_line": 180,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 186,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningForNumbers()",
      "begin_line": 189,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 192,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForMethod1()",
      "begin_line": 195,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 201,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForMethod2()",
      "begin_line": 204,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 210,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInDeprecatedClass()",
      "begin_line": 213,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 217,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInDeprecatedClass2()",
      "begin_line": 220,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 224,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInDeprecatedStaticMethod()",
      "begin_line": 227,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 231,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningInStaticMethod()",
      "begin_line": 234,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 241,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testDeprecatedObjLitKey()",
      "begin_line": 244,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 249,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForSubclassMethod()",
      "begin_line": 252,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 260,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForSuperClassWithDeprecatedSubclassMethod()",
      "begin_line": 263,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 264,col 5)-(line 269,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForSuperclassMethod()",
      "begin_line": 272,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 273,col 5)-(line 280,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForSuperclassMethod2()",
      "begin_line": 283,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 284,col 5)-(line 292,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForBind()",
      "begin_line": 295,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 296,col 5)-(line 300,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForDeprecatedClassInGlobalScope()",
      "begin_line": 303,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 304,col 5)-(line 308,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningForPrototypeCopying()",
      "begin_line": 311,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 315,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningOnDeprecatedPrototype()",
      "begin_line": 318,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 322,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForNames()",
      "begin_line": 325,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 60)",
        "(line 327,col 5)-(line 330,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForProperties1()",
      "begin_line": 333,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 336,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForProperties2()",
      "begin_line": 339,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 344,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForProperties3()",
      "begin_line": 347,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 352,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForProperties4()",
      "begin_line": 355,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 360,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties1()",
      "begin_line": 363,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 364,col 5)-(line 368,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties2()",
      "begin_line": 371,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 372,col 5)-(line 377,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties3()",
      "begin_line": 380,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 381,col 5)-(line 385,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties4()",
      "begin_line": 388,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 389,col 5)-(line 394,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties5()",
      "begin_line": 397,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 398,col 5)-(line 404,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties6()",
      "begin_line": 407,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 410,col 5)-(line 416,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties7()",
      "begin_line": 419,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 422,col 5)-(line 429,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties8()",
      "begin_line": 432,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 433,col 5)-(line 437,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties1()",
      "begin_line": 440,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 441,col 5)-(line 446,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties2()",
      "begin_line": 449,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 456,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties3()",
      "begin_line": 459,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 467,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties4()",
      "begin_line": 470,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 471,col 5)-(line 476,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties5()",
      "begin_line": 479,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 480,col 5)-(line 486,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties6()",
      "begin_line": 489,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 496,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties1()",
      "begin_line": 499,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 500,col 5)-(line 504,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties2()",
      "begin_line": 507,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 508,col 5)-(line 512,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties3()",
      "begin_line": 515,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 516,col 5)-(line 523,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties4()",
      "begin_line": 526,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 527,col 5)-(line 532,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties5()",
      "begin_line": 535,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 536,col 5)-(line 542,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoExceptionsWithBadConstructors1()",
      "begin_line": 545,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 546,col 5)-(line 550,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoExceptionsWithBadConstructors2()",
      "begin_line": 553,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 554,col 5)-(line 561,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testGoodOverrideOfProtectedProperty()",
      "begin_line": 564,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 565,col 5)-(line 571,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testBadOverrideOfProtectedProperty()",
      "begin_line": 574,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 575,col 5)-(line 581,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testBadOverrideOfPrivateProperty()",
      "begin_line": 584,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 585,col 5)-(line 591,col 31)",
        "(line 593,col 5)-(line 600,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testAccessOfStaticMethodOnPrivateConstructor()",
      "begin_line": 603,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 604,col 5)-(line 608,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testAccessOfStaticMethodOnPrivateQualifiedConstructor()",
      "begin_line": 611,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 612,col 5)-(line 617,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testInstanceofOfPrivateConstructor()",
      "begin_line": 620,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 621,col 5)-(line 626,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testOkAssignmentOfDeprecatedProperty()",
      "begin_line": 629,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 630,col 5)-(line 633,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testBadReadOfDeprecatedProperty()",
      "begin_line": 636,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 637,col 5)-(line 644,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testAutoboxedDeprecatedProperty()",
      "begin_line": 647,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 648,col 5)-(line 655,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testAutoboxedPrivateProperty()",
      "begin_line": 658,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 659,col 5)-(line 665,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNullableDeprecatedProperty()",
      "begin_line": 668,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 669,col 5)-(line 675,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNullablePrivateProperty()",
      "begin_line": 678,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 679,col 5)-(line 683,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty1()",
      "begin_line": 686,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 687,col 5)-(line 691,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty2()",
      "begin_line": 694,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 695,col 5)-(line 699,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty3()",
      "begin_line": 702,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 703,col 5)-(line 704,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty4()",
      "begin_line": 707,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 708,col 5)-(line 711,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty5()",
      "begin_line": 714,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 715,col 5)-(line 718,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty6()",
      "begin_line": 721,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 722,col 5)-(line 724,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty7()",
      "begin_line": 727,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 728,col 5)-(line 733,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty8()",
      "begin_line": 736,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 737,col 5)-(line 738,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty9()",
      "begin_line": 741,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 742,col 5)-(line 745,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty10()",
      "begin_line": 748,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 749,col 5)-(line 750,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty11()",
      "begin_line": 753,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 754,col 5)-(line 760,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty12()",
      "begin_line": 763,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 764,col 5)-(line 773,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty13()",
      "begin_line": 776,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 777,col 5)-(line 787,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty14()",
      "begin_line": 790,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 791,col 5)-(line 793,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testSuppressConstantProperty()",
      "begin_line": 796,
      "end_line": 804,
      "comment": "",
      "child_ranges": [
        "(line 797,col 5)-(line 803,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testSuppressConstantProperty2()",
      "begin_line": 806,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 807,col 5)-(line 813,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testFinalClassCannotBeSubclassed()",
      "begin_line": 816,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 817,col 5)-(line 826,col 34)",
        "(line 827,col 5)-(line 836,col 34)"
      ]
    }
  ]
}