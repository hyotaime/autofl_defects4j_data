{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/ExternExportsPassTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExternExportsPassTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 488,
      "comment": "\n * Tests for {@link ExternExportsPass}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "runCheckTypes"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.setRunCheckTypes(boolean)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n   * ExternExportsPass relies on type information to emit JSDoc annotations for\n   * exported externs. However, the user can disable type checking and still\n   * ask for externs to be exported. Set this flag to enable or disable checking\n   * of types during a test.\n   ",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.setUp()",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 18)",
        "(line 49,col 5)-(line 49,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbol()",
      "begin_line": 52,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 61,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolDefinedInVar()",
      "begin_line": 64,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 73,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportProperty()",
      "begin_line": 76,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 87,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportMultiple()",
      "begin_line": 90,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 117,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportMultiple2()",
      "begin_line": 120,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 144,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportMultiple3()",
      "begin_line": 147,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 165,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportNonStaticSymbol()",
      "begin_line": 168,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 171,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportNonStaticSymbol2()",
      "begin_line": 174,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 177,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportNonexistentProperty()",
      "begin_line": 180,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 185,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithTypeAnnotation()",
      "begin_line": 188,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 205,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithoutTypeCheck()",
      "begin_line": 208,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 28)",
        "(line 213,col 5)-(line 223,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithConstructor()",
      "begin_line": 226,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 227,col 5)-(line 238,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportSymbolWithConstructorWithoutTypeCheck()",
      "begin_line": 241,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 28)",
        "(line 250,col 5)-(line 257,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportFunctionWithOptionalArguments()",
      "begin_line": 260,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 272,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportFunctionWithVariableArguments()",
      "begin_line": 275,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 289,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportEnum()",
      "begin_line": 295,
      "end_line": 305,
      "comment": "\n   * Enums are not currently handled.\n   ",
      "child_ranges": [
        "(line 300,col 6)-(line 304,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testExportDontEmitPrototypePathPrefix()",
      "begin_line": 311,
      "end_line": 333,
      "comment": " If we export a property with \"prototype\" as a path component, there\n    * is no need to emit the initializer for prototype because every namespace\n    * has one automatically.\n    ",
      "child_ranges": [
        "(line 312,col 5)-(line 332,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testUseExportsAsExterns()",
      "begin_line": 343,
      "end_line": 372,
      "comment": "\n   * Test the workflow of creating an externs file for a library\n   * via the export pass and then using that externs file in a client.\n   *\n   * There should be no warnings in the client if the library includes\n   * type information for the exported functions and the client uses them\n   * correctly.\n   ",
      "child_ranges": [
        "(line 344,col 5)-(line 351,col 54)",
        "(line 353,col 5)-(line 358,col 32)",
        "(line 360,col 5)-(line 360,col 73)",
        "(line 362,col 5)-(line 362,col 58)",
        "(line 363,col 5)-(line 363,col 56)",
        "(line 365,col 5)-(line 365,col 64)",
        "(line 367,col 5)-(line 368,col 26)",
        "(line 370,col 5)-(line 370,col 57)",
        "(line 371,col 5)-(line 371,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testWarnOnExportFunctionWithUnknownReturnType()",
      "begin_line": 374,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 379,col 56)",
        "(line 381,col 7)-(line 381,col 75)",
        "(line 383,col 7)-(line 383,col 60)",
        "(line 384,col 7)-(line 384,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testDontWarnOnExportConstructorWithUnknownReturnType()",
      "begin_line": 387,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 388,col 5)-(line 394,col 56)",
        "(line 396,col 7)-(line 396,col 75)",
        "(line 398,col 7)-(line 398,col 60)",
        "(line 399,col 7)-(line 399,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testTypedef()",
      "begin_line": 402,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 403,col 5)-(line 415,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.compileAndCheck(java.lang.String, java.lang.String)",
      "begin_line": 418,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 48)",
        "(line 421,col 5)-(line 421,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.testWarnOnExportFunctionWithUnknownParameterTypes()",
      "begin_line": 424,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 426,col 5)-(line 434,col 56)",
        "(line 436,col 7)-(line 436,col 75)",
        "(line 438,col 7)-(line 438,col 60)",
        "(line 439,col 7)-(line 439,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.compileAndExportExterns(java.lang.String)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 443,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPassTest.compileAndExportExterns(java.lang.String, java.lang.String)",
      "begin_line": 454,
      "end_line": 487,
      "comment": "\n   * Compiles the passed in JavaScript with the passed in externs and returns\n   * the new externs exported by the this pass.\n   *\n   * @param js the source to be compiled\n   * @param externs the externs the {@code js} source needs\n   * @return the externs generated from {@code js}\n   ",
      "child_ranges": [
        "(line 455,col 5)-(line 455,col 39)",
        "(line 456,col 5)-(line 456,col 52)",
        "(line 457,col 5)-(line 457,col 45)",
        "(line 460,col 5)-(line 460,col 27)",
        "(line 465,col 5)-(line 465,col 32)",
        "(line 466,col 5)-(line 466,col 39)",
        "(line 468,col 5)-(line 473,col 33)",
        "(line 475,col 5)-(line 476,col 49)",
        "(line 478,col 5)-(line 478,col 67)",
        "(line 480,col 5)-(line 484,col 5)",
        "(line 486,col 5)-(line 486,col 18)"
      ]
    }
  ]
}