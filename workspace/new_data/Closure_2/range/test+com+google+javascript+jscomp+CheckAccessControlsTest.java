{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/CheckAccessControlsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckAccessControlsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 41,
      "end_line": 813,
      "comment": "\n * Tests for {@link CheckAccessControls}.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.CheckAccessControlsTest()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 25)",
        "(line 45,col 5)-(line 45,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.getOptions()",
      "begin_line": 53,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 49)",
        "(line 56,col 5)-(line 56,col 80)",
        "(line 57,col 5)-(line 58,col 26)",
        "(line 59,col 5)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testDep(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 75,
      "end_line": 84,
      "comment": "\n   * Tests that the given JavaScript code has a @deprecated marker\n   * somewhere in it which raises an error. Also tests that the\n   * deprecated marker works with a message. The JavaScript should\n   * have a JsDoc of the form \"@deprecated %s\\n\".\n   *\n   * @param js The JavaScript code to parse and test.\n   * @param reason A simple deprecation reason string, used for testing\n   *    the addition of a deprecation reason to the @deprecated tag.\n   * @param error The deprecation error expected when no reason is given.\n   * @param errorWithMessage The deprecation error expected when a reason\n   *    message is given.\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 45)",
        "(line 83,col 5)-(line 83,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testDeprecatedFunction()",
      "begin_line": 86,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 89,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningOnDeprecatedConstVariable()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 95,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testThatNumbersArentDeprecated()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 100,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testDeprecatedFunctionVariable()",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 106,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInGlobalScope()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 111,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInGlobalScopeForCall()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 116,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInDeprecatedFunction()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 121,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningInNormalClass()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 128,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForProperty1()",
      "begin_line": 131,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 136,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForProperty2()",
      "begin_line": 139,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 145,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForDeprecatedClass()",
      "begin_line": 148,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 153,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningForDeprecatedClassInstance()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 158,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForDeprecatedSuperClass()",
      "begin_line": 161,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 167,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForDeprecatedSuperClass2()",
      "begin_line": 170,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 178,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForPrototypeProperty()",
      "begin_line": 181,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 187,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningForNumbers()",
      "begin_line": 190,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 193,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForMethod1()",
      "begin_line": 196,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 202,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForMethod2()",
      "begin_line": 205,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 211,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInDeprecatedClass()",
      "begin_line": 214,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 215,col 5)-(line 218,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInDeprecatedClass2()",
      "begin_line": 221,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 225,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningInDeprecatedStaticMethod()",
      "begin_line": 228,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 232,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningInStaticMethod()",
      "begin_line": 235,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 242,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testDeprecatedObjLitKey()",
      "begin_line": 245,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 250,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForSubclassMethod()",
      "begin_line": 253,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 261,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForSuperClassWithDeprecatedSubclassMethod()",
      "begin_line": 264,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 270,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForSuperclassMethod()",
      "begin_line": 273,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 281,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForSuperclassMethod2()",
      "begin_line": 284,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 293,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForBind()",
      "begin_line": 296,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 297,col 5)-(line 301,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testWarningForDeprecatedClassInGlobalScope()",
      "begin_line": 304,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 305,col 5)-(line 309,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningForPrototypeCopying()",
      "begin_line": 312,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 316,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoWarningOnDeprecatedPrototype()",
      "begin_line": 319,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 321,col 5)-(line 323,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForNames()",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 60)",
        "(line 328,col 5)-(line 331,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForProperties1()",
      "begin_line": 334,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 337,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForProperties2()",
      "begin_line": 340,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 341,col 5)-(line 345,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForProperties3()",
      "begin_line": 348,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 349,col 5)-(line 353,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testPrivateAccessForProperties4()",
      "begin_line": 356,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 357,col 5)-(line 361,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties1()",
      "begin_line": 364,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 369,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties2()",
      "begin_line": 372,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 373,col 5)-(line 378,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties3()",
      "begin_line": 381,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 386,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties4()",
      "begin_line": 389,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 395,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties5()",
      "begin_line": 398,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 399,col 5)-(line 405,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties6()",
      "begin_line": 408,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 411,col 5)-(line 417,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties7()",
      "begin_line": 420,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 430,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoPrivateAccessForProperties8()",
      "begin_line": 433,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 438,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties1()",
      "begin_line": 441,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 442,col 5)-(line 447,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties2()",
      "begin_line": 450,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 451,col 5)-(line 457,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties3()",
      "begin_line": 460,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 461,col 5)-(line 468,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties4()",
      "begin_line": 471,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 472,col 5)-(line 477,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties5()",
      "begin_line": 480,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 481,col 5)-(line 487,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testProtectedAccessForProperties6()",
      "begin_line": 490,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 491,col 5)-(line 497,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties1()",
      "begin_line": 500,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 501,col 5)-(line 505,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties2()",
      "begin_line": 508,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 509,col 5)-(line 513,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties3()",
      "begin_line": 516,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 517,col 5)-(line 524,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties4()",
      "begin_line": 527,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 528,col 5)-(line 533,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoProtectedAccessForProperties5()",
      "begin_line": 536,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 537,col 5)-(line 543,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoExceptionsWithBadConstructors1()",
      "begin_line": 546,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 547,col 5)-(line 551,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNoExceptionsWithBadConstructors2()",
      "begin_line": 554,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 555,col 5)-(line 562,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testGoodOverrideOfProtectedProperty()",
      "begin_line": 565,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 566,col 5)-(line 572,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testBadOverrideOfProtectedProperty()",
      "begin_line": 575,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 576,col 5)-(line 582,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testBadOverrideOfPrivateProperty()",
      "begin_line": 585,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 586,col 5)-(line 592,col 31)",
        "(line 594,col 5)-(line 601,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testAccessOfStaticMethodOnPrivateConstructor()",
      "begin_line": 604,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 605,col 5)-(line 609,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testAccessOfStaticMethodOnPrivateQualifiedConstructor()",
      "begin_line": 612,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 613,col 5)-(line 618,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testInstanceofOfPrivateConstructor()",
      "begin_line": 621,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 622,col 5)-(line 627,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testOkAssignmentOfDeprecatedProperty()",
      "begin_line": 630,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 631,col 5)-(line 634,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testBadReadOfDeprecatedProperty()",
      "begin_line": 637,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 638,col 5)-(line 645,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testAutoboxedDeprecatedProperty()",
      "begin_line": 648,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 649,col 5)-(line 655,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testAutoboxedPrivateProperty()",
      "begin_line": 658,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 659,col 5)-(line 663,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNullableDeprecatedProperty()",
      "begin_line": 666,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 667,col 5)-(line 673,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testNullablePrivateProperty()",
      "begin_line": 676,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 677,col 5)-(line 681,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty1()",
      "begin_line": 684,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 685,col 5)-(line 689,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty2()",
      "begin_line": 692,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 693,col 5)-(line 697,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty3()",
      "begin_line": 700,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 701,col 5)-(line 702,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty4()",
      "begin_line": 705,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 706,col 5)-(line 709,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty5()",
      "begin_line": 712,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 713,col 5)-(line 716,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty6()",
      "begin_line": 719,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 720,col 5)-(line 722,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty7()",
      "begin_line": 725,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 726,col 5)-(line 731,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty8()",
      "begin_line": 734,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 735,col 5)-(line 736,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty9()",
      "begin_line": 739,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 740,col 5)-(line 743,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty10()",
      "begin_line": 746,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 747,col 5)-(line 748,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty11()",
      "begin_line": 751,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 752,col 5)-(line 758,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty12()",
      "begin_line": 761,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 762,col 5)-(line 771,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty13()",
      "begin_line": 774,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 775,col 5)-(line 785,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testConstantProperty14()",
      "begin_line": 788,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 789,col 5)-(line 791,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testSuppressConstantProperty()",
      "begin_line": 794,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 795,col 5)-(line 801,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControlsTest.testSuppressConstantProperty2()",
      "begin_line": 804,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 805,col 5)-(line 811,col 54)"
      ]
    }
  ]
}