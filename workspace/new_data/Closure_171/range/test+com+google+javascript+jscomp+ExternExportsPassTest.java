{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ExternExportsPassTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExternExportsPassTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 597,
      "comment": "\n * Tests for {@link ExternExportsPass}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "runCheckTypes"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.setRunCheckTypes(boolean)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n   * ExternExportsPass relies on type information to emit JSDoc annotations for\n   * exported externs. However, the user can disable type checking and still\n   * ask for externs to be exported. Set this flag to enable or disable checking\n   * of types during a test.\n   ",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.setUp()",
      "begin_line": 44,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 18)",
        "(line 48,col 5)-(line 48,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbol()",
      "begin_line": 51,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 60,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolDefinedInVar()",
      "begin_line": 63,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 72,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportProperty()",
      "begin_line": 75,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 86,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportMultiple()",
      "begin_line": 89,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 116,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportMultiple2()",
      "begin_line": 119,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 143,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportMultiple3()",
      "begin_line": 146,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 164,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportNonStaticSymbol()",
      "begin_line": 167,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 170,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportNonStaticSymbol2()",
      "begin_line": 173,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 176,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportNonexistentProperty()",
      "begin_line": 179,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 184,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithTypeAnnotation()",
      "begin_line": 187,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 204,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithTemplateAnnotation()",
      "begin_line": 207,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 224,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithMultipleTemplateAnnotation()",
      "begin_line": 227,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 244,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithoutTypeCheck()",
      "begin_line": 247,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 28)",
        "(line 252,col 5)-(line 262,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithConstructor()",
      "begin_line": 265,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 277,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithConstructorWithoutTypeCheck()",
      "begin_line": 280,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 28)",
        "(line 289,col 5)-(line 296,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportFunctionWithOptionalArguments1()",
      "begin_line": 299,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 311,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportFunctionWithOptionalArguments2()",
      "begin_line": 314,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 327,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportFunctionWithOptionalArguments3()",
      "begin_line": 330,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 343,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportFunctionWithVariableArguments()",
      "begin_line": 346,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 347,col 5)-(line 360,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportEnum()",
      "begin_line": 366,
      "end_line": 376,
      "comment": "\n   * Enums are not currently handled.\n   ",
      "child_ranges": [
        "(line 371,col 6)-(line 375,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportDontEmitPrototypePathPrefix()",
      "begin_line": 382,
      "end_line": 404,
      "comment": " If we export a property with \"prototype\" as a path component, there\n    * is no need to emit the initializer for prototype because every namespace\n    * has one automatically.\n    ",
      "child_ranges": [
        "(line 383,col 5)-(line 403,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testUseExportsAsExterns()",
      "begin_line": 414,
      "end_line": 443,
      "comment": "\n   * Test the workflow of creating an externs file for a library\n   * via the export pass and then using that externs file in a client.\n   *\n   * There should be no warnings in the client if the library includes\n   * type information for the exported functions and the client uses them\n   * correctly.\n   ",
      "child_ranges": [
        "(line 415,col 5)-(line 422,col 54)",
        "(line 424,col 5)-(line 429,col 32)",
        "(line 431,col 5)-(line 431,col 73)",
        "(line 433,col 5)-(line 433,col 58)",
        "(line 434,col 5)-(line 434,col 56)",
        "(line 436,col 5)-(line 436,col 64)",
        "(line 438,col 5)-(line 439,col 26)",
        "(line 441,col 5)-(line 441,col 57)",
        "(line 442,col 5)-(line 442,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testWarnOnExportFunctionWithUnknownReturnType()",
      "begin_line": 445,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 446,col 5)-(line 450,col 56)",
        "(line 452,col 7)-(line 452,col 75)",
        "(line 454,col 7)-(line 454,col 60)",
        "(line 455,col 7)-(line 455,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testDontWarnOnExportConstructorWithUnknownReturnType()",
      "begin_line": 458,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 459,col 5)-(line 465,col 56)",
        "(line 467,col 7)-(line 467,col 75)",
        "(line 469,col 7)-(line 469,col 60)",
        "(line 470,col 7)-(line 470,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testTypedef()",
      "begin_line": 473,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 474,col 5)-(line 486,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportParamWithNull()",
      "begin_line": 489,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 499,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportConstructor()",
      "begin_line": 502,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 503,col 5)-(line 509,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportParamWithSymbolDefinedInFunction()",
      "begin_line": 512,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 513,col 5)-(line 524,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.compileAndCheck(java.lang.String, java.lang.String)",
      "begin_line": 527,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 528,col 5)-(line 528,col 48)",
        "(line 530,col 5)-(line 530,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testWarnOnExportFunctionWithUnknownParameterTypes()",
      "begin_line": 533,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 535,col 5)-(line 543,col 56)",
        "(line 545,col 7)-(line 545,col 75)",
        "(line 547,col 7)-(line 547,col 60)",
        "(line 548,col 7)-(line 548,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.compileAndExportExterns(java.lang.String)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 552,col 5)-(line 552,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.compileAndExportExterns(java.lang.String, java.lang.String)",
      "begin_line": 563,
      "end_line": 596,
      "comment": "\n   * Compiles the passed in JavaScript with the passed in externs and returns\n   * the new externs exported by the this pass.\n   *\n   * @param js the source to be compiled\n   * @param externs the externs the {@code js} source needs\n   * @return the externs generated from {@code js}\n   ",
      "child_ranges": [
        "(line 564,col 5)-(line 564,col 39)",
        "(line 565,col 5)-(line 565,col 52)",
        "(line 566,col 5)-(line 566,col 45)",
        "(line 569,col 5)-(line 569,col 28)",
        "(line 574,col 5)-(line 574,col 32)",
        "(line 575,col 5)-(line 575,col 39)",
        "(line 577,col 5)-(line 582,col 33)",
        "(line 584,col 5)-(line 585,col 49)",
        "(line 587,col 5)-(line 587,col 67)",
        "(line 589,col 5)-(line 593,col 5)",
        "(line 595,col 5)-(line 595,col 18)"
      ]
    }
  ]
}