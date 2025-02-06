{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CompilerTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompilerTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 1147,
      "comment": "\n * \u003cp\u003eBase class for testing JS compiler classes that change\n * the node tree of a compiled JS input.\u003c/p\u003e\n *\n * \u003cp\u003ePulls in shared functionality from different test cases. Also supports\n * node tree comparison for input and output (instead of string comparison),\n * which makes it easier to write tests b/c you don\u0027t have to get the syntax\n * exactly correct to the spacing.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "externsInputs"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Externs for the test "
    },
    {
      "type": "field",
      "varNames": [
        "compareAsTree"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Whether to compare input and output as trees instead of strings "
    },
    {
      "type": "field",
      "varNames": [
        "parseTypeInfo"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Whether to parse type info from JSDoc comments "
    },
    {
      "type": "field",
      "varNames": [
        "allowSourcelessWarnings"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Whether we check warnings without source information. "
    },
    {
      "type": "field",
      "varNames": [
        "closurePassEnabled"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " True iff closure pass runs before pass being tested. "
    },
    {
      "type": "field",
      "varNames": [
        "typeCheckEnabled"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " True iff type checking pass runs before pass being tested. "
    },
    {
      "type": "field",
      "varNames": [
        "typeCheckLevel"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Error level reported by type checker. "
    },
    {
      "type": "field",
      "varNames": [
        "runTypeCheckAfterProcessing"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Whether to the test compiler pass before the type check. "
    },
    {
      "type": "field",
      "varNames": [
        "normalizeEnabled"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Whether the Normalize pass runs before pass being tested. "
    },
    {
      "type": "field",
      "varNames": [
        "normalizeExpected"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Whether the expected JS strings should be normalized. "
    },
    {
      "type": "field",
      "varNames": [
        "checkLineNumbers"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Whether to check that all line number information is preserved. "
    },
    {
      "type": "field",
      "varNames": [
        "expectParseWarningsThisTest"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Whether we expect parse warnings in the current test. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedSymbolTableError"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * An expected symbol table error. Only useful for testing the\n   * symbol table error-handling.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "markNoSideEffects"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n   * Whether the MarkNoSideEffectsCalls pass runs before the pass being tested\n   "
    },
    {
      "type": "field",
      "varNames": [
        "computeSideEffects"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n   * Whether the PureFunctionIdentifier pass runs before the pass being tested\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lastCompiler"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The most recently used Compiler instance. "
    },
    {
      "type": "field",
      "varNames": [
        "acceptES5"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n   * Whether to acceptES5 source.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "allowExternsChanges"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n   * Whether externs changes should be allowed for this pass.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "astValidationEnabled"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n   * Whether the AST should be validated.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "filename"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.CompilerTestCase(java.lang.String, boolean)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n   * Constructs a test.\n   *\n   * @param externs Externs JS as a string\n   * @param compareAsTree True to compare output \u0026 expected as a node tree.\n   *     99% of the time you want to compare as a tree. There are a few\n   *     special cases where you don\u0027t, like if you want to test the code\n   *     printing of \"unnatural\" syntax trees. For example,\n   *\n   * \u003cpre\u003e\n   * IF\n   *   IF\n   *     STATEMENT\n   * ELSE\n   *   STATEMENT\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 139,col 49)",
        "(line 140,col 5)-(line 140,col 39)",
        "(line 141,col 5)-(line 141,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.CompilerTestCase(java.lang.String)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n   * Constructs a test. Uses AST comparison.\n   * @param externs Externs JS as a string\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.CompilerTestCase()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n   * Constructs a test. Uses AST comparison and no externs.\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.tearDown()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 21)",
        "(line 161,col 5)-(line 161,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n   * Gets the compiler pass instance to use for a test.\n   *\n   * @param compiler The compiler\n   * @return The pass to test\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getOptions()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n   * Gets the compiler options to use for this test. Use getProcessor to\n   * determine what passes should be run.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 185,
      "end_line": 200,
      "comment": "\n   * Gets the compiler options to use for this test. Use getProcessor to\n   * determine what passes should be run.\n   ",
      "child_ranges": [
        "(line 186,col 5)-(line 188,col 5)",
        "(line 192,col 5)-(line 192,col 32)",
        "(line 194,col 5)-(line 195,col 65)",
        "(line 196,col 5)-(line 197,col 60)",
        "(line 198,col 5)-(line 198,col 55)",
        "(line 199,col 5)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getCodingConvention()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.setFilename(java.lang.String)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getNumRepetitions()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n   * Returns the number of times the pass should be run before results are\n   * verified.\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.allowSourcelessWarnings()",
      "begin_line": 221,
      "end_line": 223,
      "comment": " Expect warnings without source information. ",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getLastCompiler()",
      "begin_line": 226,
      "end_line": 228,
      "comment": " The most recently used JSComp instance. ",
      "child_ranges": [
        "(line 227,col 5)-(line 227,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableEcmaScript5(boolean)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n   * Whether to allow ECMASCRIPT5 source parsing.\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.allowExternsChanges(boolean)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n   * Whether to allow externs changes.\n   ",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableTypeCheck(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n   * Perform type checking before running the test pass. This will check\n   * for type errors and annotate nodes with type information.\n   *\n   * @param level the level of severity to report for type errors\n   *\n   * @see TypeCheck\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 29)",
        "(line 254,col 5)-(line 254,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableLineNumberCheck(boolean)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n   * Check to make sure that line numbers were preserved.\n   ",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.disableTypeCheck()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n   * Do not run type checking before running the test pass.\n   *\n   * @see TypeCheck\n   ",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableClosurePass()",
      "begin_line": 277,
      "end_line": 279,
      "comment": " TODO(nicksantos): Fix other passes to use this when appropriate.",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableNormalize()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n   * Perform AST normalization before running the test pass, and anti-normalize\n   * after running it.\n   *\n   * @see Normalize\n   ",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableNormalize(boolean)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n   * Perform AST normalization before running the test pass, and anti-normalize\n   * after running it.\n   *\n   * @param normalizeExpected Whether to perform normalization on the\n   * expected JS result.\n   * @see Normalize\n   ",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 28)",
        "(line 301,col 5)-(line 301,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.disableNormalize()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n   * Don\u0027t perform AST normalization before running the test pass.\n   * @see Normalize\n   ",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableMarkNoSideEffects()",
      "begin_line": 318,
      "end_line": 320,
      "comment": " TODO(nicksantos): This pass doesn\u0027t get run anymore. It should be removed.",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableComputeSideEffects()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n   * Run the PureFunctionIdentifier pass before running the test pass.\n   *\n   * @see MarkNoSideEffectCalls\n   ",
      "child_ranges": [
        "(line 328,col 5)-(line 328,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableAstValidation(boolean)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n   * Whether to allow Validate the AST after each run of the pass.\n   ",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.setExpectParseWarningsThisTest()",
      "begin_line": 339,
      "end_line": 341,
      "comment": " Whether we should ignore parse warnings for the current test method. ",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createTypeCheck(com.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 344,
      "end_line": 351,
      "comment": " Returns a newly created TypeCheck. ",
      "child_ranges": [
        "(line 346,col 5)-(line 348,col 40)",
        "(line 350,col 5)-(line 350,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output.\n   *\n   * @param js Input\n   * @param expected Expected JS output\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output,\n   * or that an expected error is encountered.\n   *\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   ",
      "child_ranges": [
        "(line 372,col 5)-(line 372,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 386,
      "end_line": 389,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output,\n   * or that an expected error is encountered.\n   *\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The content of the error expected\n   ",
      "child_ranges": [
        "(line 388,col 5)-(line 388,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 401,
      "end_line": 404,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 403,col 5)-(line 403,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 417,
      "end_line": 420,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param externs Externs input\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 436,
      "end_line": 442,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param externs Externs input\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 439,col 5)-(line 440,col 49)",
        "(line 441,col 5)-(line 441,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.util.List\u003ccom.google.javascript.jscomp.SourceFile\u003e, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 458,
      "end_line": 478,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param externs Externs inputs\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 461,col 5)-(line 461,col 41)",
        "(line 462,col 5)-(line 462,col 28)",
        "(line 464,col 5)-(line 464,col 43)",
        "(line 466,col 5)-(line 468,col 5)",
        "(line 471,col 5)-(line 471,col 39)",
        "(line 472,col 5)-(line 473,col 53)",
        "(line 475,col 5)-(line 475,col 71)",
        "(line 477,col 5)-(line 477,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.maybeCreateArray(java.lang.String)",
      "begin_line": 480,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 481,col 5)-(line 483,col 5)",
        "(line 484,col 5)-(line 484,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String[], java.lang.String[])",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output.\n   *\n   * @param js Inputs\n   * @param expected Expected JS output\n   ",
      "child_ranges": [
        "(line 494,col 5)-(line 494,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output,\n   * or that an expected error is encountered.\n   *\n   * @param js Inputs\n   * @param expected Expected JS output\n   * @param error Expected error, or null if no error is expected\n   ",
      "child_ranges": [
        "(line 506,col 5)-(line 506,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 519,
      "end_line": 522,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param js Inputs\n   * @param expected Expected JS output\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 521,col 5)-(line 521,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 537,
      "end_line": 548,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param js Inputs\n   * @param expected Expected JS output\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 539,col 5)-(line 539,col 41)",
        "(line 540,col 5)-(line 540,col 28)",
        "(line 542,col 5)-(line 542,col 51)",
        "(line 543,col 5)-(line 545,col 5)",
        "(line 546,col 5)-(line 546,col 55)",
        "(line 547,col 5)-(line 547,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.JSModule[], java.lang.String[])",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output.\n   *\n   * @param modules Module inputs\n   * @param expected Expected JS outputs (one per module)\n   ",
      "child_ranges": [
        "(line 557,col 5)-(line 557,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.JSModule[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 568,
      "end_line": 571,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output,\n   * or that an expected error is encountered.\n   *\n   * @param modules Module inputs\n   * @param expected Expected JS outputs (one per module)\n   * @param error Expected error, or null if no error is expected\n   ",
      "child_ranges": [
        "(line 570,col 5)-(line 570,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.JSModule[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 583,
      "end_line": 591,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param modules Module inputs\n   * @param expected Expected JS outputs (one per module)\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 585,col 5)-(line 585,col 41)",
        "(line 586,col 5)-(line 586,col 28)",
        "(line 588,col 5)-(line 589,col 66)",
        "(line 590,col 5)-(line 590,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String)",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input.\n   *\n   * @param js Input and output\n   ",
      "child_ranges": [
        "(line 599,col 5)-(line 599,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning is issued.\n   *\n   * @param js Input and output\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 610,col 5)-(line 610,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, com.google.javascript.jscomp.DiagnosticType, boolean)",
      "begin_line": 621,
      "end_line": 627,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning is issued.\n   *\n   * @param js Input and output\n   * @param diag Expected error or warning, or null if none is expected\n   * @param error true if diag is an error, false if it is a warning\n   ",
      "child_ranges": [
        "(line 622,col 5)-(line 626,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning is issued.\n   *\n   * @param externs Externs input\n   * @param js Input and output\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, boolean)",
      "begin_line": 650,
      "end_line": 657,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning is issued.\n   *\n   * @param externs Externs input\n   * @param js Input and output\n   * @param diag Expected error or warning, or null if none is expected\n   * @param error true if diag is an error, false if it is a warning\n   ",
      "child_ranges": [
        "(line 652,col 5)-(line 656,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 670,
      "end_line": 675,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning and description is issued.\n   *\n   * @param externs Externs input\n   * @param js Input and output\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 672,col 5)-(line 673,col 49)",
        "(line 674,col 5)-(line 674,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String[])",
      "begin_line": 682,
      "end_line": 684,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input.\n   *\n   * @param js Inputs and outputs\n   ",
      "child_ranges": [
        "(line 683,col 5)-(line 683,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input,\n   * and emits the given error.\n   *\n   * @param js Inputs and outputs\n   * @param error Expected error, or null if no error is expected\n   ",
      "child_ranges": [
        "(line 694,col 5)-(line 694,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 705,
      "end_line": 708,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input,\n   * and emits the given error and warning.\n   *\n   * @param js Inputs and outputs\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 707,col 5)-(line 707,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(com.google.javascript.jscomp.JSModule[])",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as the input.\n   *\n   * @param modules Module inputs\n   ",
      "child_ranges": [
        "(line 716,col 5)-(line 716,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(com.google.javascript.jscomp.JSModule[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 725,
      "end_line": 738,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as the input.\n   *\n   * @param modules Module inputs\n   * @param warning A warning, or null for no expected warning.\n   ",
      "child_ranges": [
        "(line 726,col 5)-(line 737,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.Compiler, java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 751,
      "end_line": 754,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param compiler A compiler that has been initialized via\n   *     {@link Compiler#init}\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 753,col 5)-(line 753,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.Compiler, java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 770,
      "end_line": 1013,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param compiler A compiler that has been initialized via\n   *     {@link Compiler#init}\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 773,col 5)-(line 773,col 51)",
        "(line 774,col 5)-(line 774,col 44)",
        "(line 776,col 5)-(line 776,col 39)",
        "(line 777,col 5)-(line 778,col 66)",
        "(line 779,col 5)-(line 783,col 5)",
        "(line 785,col 5)-(line 787,col 5)",
        "(line 788,col 5)-(line 788,col 44)",
        "(line 789,col 5)-(line 789,col 40)",
        "(line 792,col 5)-(line 792,col 38)",
        "(line 793,col 5)-(line 793,col 54)",
        "(line 794,col 5)-(line 794,col 50)",
        "(line 795,col 5)-(line 795,col 76)",
        "(line 797,col 5)-(line 797,col 45)",
        "(line 798,col 5)-(line 798,col 68)",
        "(line 799,col 5)-(line 799,col 34)",
        "(line 800,col 5)-(line 800,col 59)",
        "(line 801,col 5)-(line 801,col 35)",
        "(line 803,col 5)-(line 804,col 39)",
        "(line 806,col 5)-(line 868,col 5)",
        "(line 870,col 5)-(line 1012,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.normalizeActualCode(com.google.javascript.jscomp.Compiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1015,
      "end_line": 1019,
      "comment": "",
      "child_ranges": [
        "(line 1017,col 5)-(line 1017,col 57)",
        "(line 1018,col 5)-(line 1018,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.parseExpectedJs(java.lang.String[])",
      "begin_line": 1024,
      "end_line": 1042,
      "comment": "\n   * Parses expected JS inputs and returns the root of the parse tree.\n   ",
      "child_ranges": [
        "(line 1025,col 5)-(line 1025,col 41)",
        "(line 1026,col 5)-(line 1026,col 51)",
        "(line 1027,col 5)-(line 1029,col 5)",
        "(line 1030,col 5)-(line 1030,col 55)",
        "(line 1031,col 5)-(line 1031,col 39)",
        "(line 1032,col 5)-(line 1033,col 66)",
        "(line 1034,col 5)-(line 1034,col 44)",
        "(line 1035,col 5)-(line 1035,col 42)",
        "(line 1037,col 5)-(line 1040,col 5)",
        "(line 1041,col 5)-(line 1041,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.parseExpectedJs(java.lang.String)",
      "begin_line": 1044,
      "end_line": 1046,
      "comment": "",
      "child_ranges": [
        "(line 1045,col 5)-(line 1045,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModuleChain(java.lang.String...)",
      "begin_line": 1052,
      "end_line": 1058,
      "comment": "\n   * Generates a list of modules from a list of inputs, such that each module\n   * depends on the module before it.\n   ",
      "child_ranges": [
        "(line 1053,col 5)-(line 1053,col 47)",
        "(line 1054,col 5)-(line 1056,col 5)",
        "(line 1057,col 5)-(line 1057,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModuleStar(java.lang.String...)",
      "begin_line": 1064,
      "end_line": 1070,
      "comment": "\n   * Generates a list of modules from a list of inputs, such that each module\n   * depends on the first module.\n   ",
      "child_ranges": [
        "(line 1065,col 5)-(line 1065,col 47)",
        "(line 1066,col 5)-(line 1068,col 5)",
        "(line 1069,col 5)-(line 1069,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModuleBush(java.lang.String...)",
      "begin_line": 1077,
      "end_line": 1084,
      "comment": "\n   * Generates a list of modules from a list of inputs, such that modules\n   * form a bush formation. In a bush formation, module 2 depends\n   * on module 1, and all other modules depend on module 2.\n   ",
      "child_ranges": [
        "(line 1078,col 5)-(line 1078,col 48)",
        "(line 1079,col 5)-(line 1079,col 47)",
        "(line 1080,col 5)-(line 1082,col 5)",
        "(line 1083,col 5)-(line 1083,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModuleTree(java.lang.String...)",
      "begin_line": 1091,
      "end_line": 1097,
      "comment": "\n   * Generates a list of modules from a list of inputs, such that modules\n   * form a tree formation. In a tree formation, module N depends on\n   * module `floor(N/2)`, So the modules form a balanced binary tree.\n   ",
      "child_ranges": [
        "(line 1092,col 5)-(line 1092,col 47)",
        "(line 1093,col 5)-(line 1095,col 5)",
        "(line 1096,col 5)-(line 1096,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModules(java.lang.String...)",
      "begin_line": 1103,
      "end_line": 1110,
      "comment": "\n   * Generates a list of modules from a list of inputs. Does not generate any\n   * dependencies between the modules.\n   ",
      "child_ranges": [
        "(line 1104,col 5)-(line 1104,col 53)",
        "(line 1105,col 5)-(line 1108,col 5)",
        "(line 1109,col 5)-(line 1109,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BlackHoleErrorManager",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.BasicErrorManager"
      ],
      "begin_line": 1112,
      "end_line": 1122,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.BlackHoleErrorManager.BlackHoleErrorManager(com.google.javascript.jscomp.Compiler)",
      "begin_line": 1113,
      "end_line": 1115,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 7)-(line 1114,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.BlackHoleErrorManager.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 1117,
      "end_line": 1118,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.BlackHoleErrorManager.printSummary()",
      "begin_line": 1120,
      "end_line": 1121,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createCompiler()",
      "begin_line": 1124,
      "end_line": 1127,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 5)-(line 1125,col 39)",
        "(line 1126,col 5)-(line 1126,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.setExpectedSymbolTableError(com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1129,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 5)-(line 1130,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.findQualifiedNameNode(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 1134,
      "end_line": 1146,
      "comment": " Finds the first matching qualified name node in post-traversal order. ",
      "child_ranges": [
        "(line 1135,col 5)-(line 1135,col 52)",
        "(line 1136,col 5)-(line 1144,col 39)",
        "(line 1145,col 5)-(line 1145,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.Anonymous-2f4eafbe-21c7-4bf4-a373-8cef8e9317ad.visit(com.google.javascript.rhino.Node)",
      "begin_line": 1138,
      "end_line": 1142,
      "comment": "",
      "child_ranges": [
        "(line 1139,col 13)-(line 1141,col 13)"
      ]
    }
  ]
}