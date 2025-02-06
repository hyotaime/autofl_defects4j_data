{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/StripCodeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StripCodeTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 27,
      "end_line": 473,
      "comment": "\n * Tests for {@link StripCode}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StripCodeTest.StripCodeTest()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.createLoggerInstance(com.google.javascript.jscomp.Compiler)",
      "begin_line": 41,
      "end_line": 67,
      "comment": "\n   * Creates an instance for removing logging code.\n   *\n   * @param compiler The Compiler\n   * @return A new {@link StripCode} instance\n   ",
      "child_ranges": [
        "(line 42,col 5)-(line 52,col 29)",
        "(line 54,col 5)-(line 60,col 22)",
        "(line 62,col 5)-(line 62,col 61)",
        "(line 63,col 5)-(line 63,col 65)",
        "(line 65,col 5)-(line 66,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInConstructor()",
      "begin_line": 73,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 77,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInPrototype1()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 83,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInPrototype2()",
      "begin_line": 86,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 90,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInPrototype3()",
      "begin_line": 93,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 99,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInPrototype4()",
      "begin_line": 102,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 108,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInPrototype5()",
      "begin_line": 111,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 121,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedStatically()",
      "begin_line": 124,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 127,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInObjectLiteral1()",
      "begin_line": 130,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 135,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInObjectLiteral2()",
      "begin_line": 138,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 143,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInObjectLiteral3()",
      "begin_line": 146,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInObjectLiteral4()",
      "begin_line": 155,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 165,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedInPrototypeAndUsedInConstructor()",
      "begin_line": 168,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 178,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerDefinedStaticallyAndUsedInConstructor()",
      "begin_line": 181,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 189,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerVarDeclaration()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerMethodCallByVariableType()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 198,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testSubPropertyAccessByVariableName()",
      "begin_line": 201,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 202,col 5)-(line 205,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testPrefixedVariableName()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 210,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testPrefixedPropertyName()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 215,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testPrefixedClassName()",
      "begin_line": 218,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 226,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testLoggerClassDefinition()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testStaticLoggerPropertyDefinition()",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 235,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testStaticLoggerMethodDefinition()",
      "begin_line": 238,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 239,col 5)-(line 241,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testPrototypeFieldDefinition()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testPrototypeFieldDefinitionWithoutAssignment()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testPrototypeMethodDefinition()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 254,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testPublicPropertyAssignment()",
      "begin_line": 257,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 66)",
        "(line 261,col 5)-(line 261,col 40)",
        "(line 262,col 5)-(line 262,col 48)",
        "(line 263,col 5)-(line 263,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testGlobalCallWithStrippedType()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testClassDefiningCallWithStripType1()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testClassDefiningCallWithStripType2()",
      "begin_line": 274,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 277,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testClassDefiningCallWithStripType3()",
      "begin_line": 280,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 283,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testClassDefiningCallWithStripType4()",
      "begin_line": 286,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 289,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testClassDefiningCallWithStripType5()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 294,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testClassDefiningCallWithStripType6()",
      "begin_line": 297,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 300,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testClassDefiningCallWithStripType7()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 304,col 5)-(line 304,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testClassDefiningCallWithStripType8()",
      "begin_line": 307,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 54)",
        "(line 310,col 5)-(line 310,col 59)",
        "(line 314,col 5)-(line 314,col 55)",
        "(line 315,col 5)-(line 315,col 62)",
        "(line 316,col 5)-(line 316,col 42)",
        "(line 317,col 5)-(line 317,col 44)",
        "(line 320,col 5)-(line 320,col 56)",
        "(line 321,col 5)-(line 321,col 63)",
        "(line 322,col 5)-(line 322,col 43)",
        "(line 323,col 5)-(line 323,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testPropertyWithEmptyStringKey()",
      "begin_line": 326,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 328,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testVarinIf()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 5)-(line 332,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testGetElemInIf()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 336,col 5)-(line 336,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testAssignInIf()",
      "begin_line": 339,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 341,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testNamePrefix()",
      "begin_line": 344,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 348,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testTypePrefix()",
      "begin_line": 351,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 353,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testStripCallsToStrippedNames1()",
      "begin_line": 356,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 357,col 5)-(line 359,col 54)",
        "(line 360,col 5)-(line 363,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testStripCallsToStrippedNames2()",
      "begin_line": 366,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 370,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testStripCallsToStrippedNames3()",
      "begin_line": 373,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 376,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testStripCallsToStrippedNames4()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 380,col 5)-(line 381,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testStripVarsInitializedFromStrippedNames1()",
      "begin_line": 384,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 385,col 5)-(line 388,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testStripVarsInitializedFromStrippedNames2()",
      "begin_line": 391,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 392,col 5)-(line 395,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testReportErrorOnStripInNestedAssignment()",
      "begin_line": 398,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 400,col 5)-(line 402,col 43)",
        "(line 405,col 5)-(line 407,col 43)",
        "(line 410,col 5)-(line 412,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testNewOperatior1()",
      "begin_line": 415,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 416,col 5)-(line 417,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testNewOperatior2()",
      "begin_line": 420,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 421,col 5)-(line 422,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testNewOperatior3()",
      "begin_line": 425,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 426,col 5)-(line 427,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testCrazyNesting1()",
      "begin_line": 430,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 431,col 5)-(line 432,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testCrazyNesting2()",
      "begin_line": 435,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 436,col 5)-(line 437,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testCrazyNesting3()",
      "begin_line": 440,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 441,col 5)-(line 442,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testCrazyNesting4()",
      "begin_line": 445,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 446,col 5)-(line 447,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testCrazyNesting5()",
      "begin_line": 450,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 451,col 5)-(line 453,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testNamespace1()",
      "begin_line": 456,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 457,col 5)-(line 459,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testMethodCallTriggersRemoval()",
      "begin_line": 463,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 464,col 5)-(line 465,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCodeTest.testRemoveExpressionByName()",
      "begin_line": 468,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 469,col 5)-(line 470,col 12)"
      ]
    }
  ]
}