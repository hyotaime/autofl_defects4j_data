{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/CompilerTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompilerTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 1094,
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
        "normalizeEnabled"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Whether the Normalize pass runs before pass being tested. "
    },
    {
      "type": "field",
      "varNames": [
        "normalizeExpected"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Whether the expected JS strings should be normalized. "
    },
    {
      "type": "field",
      "varNames": [
        "checkLineNumbers"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Whether to check that all line number information is preserved. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedSymbolTableError"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * An expected symbol table error. Only useful for testing the\n   * symbol table error-handling.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "markNoSideEffects"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n   * Whether the MarkNoSideEffectsCalls pass runs before the pass being tested\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lastCompiler"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The most recently used Compiler instance. "
    },
    {
      "type": "field",
      "varNames": [
        "acceptES5"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n   * Whether to acceptES5 source.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "allowExternsChanges"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n   * Whether externs changes should be allowed for this pass.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "astValidationEnabled"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n   * Whether the AST should be validated.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "filename"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.CompilerTestCase(java.lang.String, boolean)",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\n   * Constructs a test.\n   *\n   * @param externs Externs JS as a string\n   * @param compareAsTree True to compare output \u0026 expected as a node tree.\n   *     99% of the time you want to compare as a tree. There are a few\n   *     special cases where you don\u0027t, like if you want to test the code\n   *     printing of \"unnatural\" syntax trees. For example,\n   *\n   * \u003cpre\u003e\n   * IF\n   *   IF\n   *     STATEMENT\n   * ELSE\n   *   STATEMENT\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 127,col 5)-(line 128,col 49)",
        "(line 129,col 5)-(line 129,col 39)",
        "(line 130,col 5)-(line 130,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.CompilerTestCase(java.lang.String)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n   * Constructs a test. Uses AST comparison.\n   * @param externs Externs JS as a string\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.CompilerTestCase()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n   * Constructs a test. Uses AST comparison and no externs.\n   ",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n   * Gets the compiler pass instance to use for a test.\n   *\n   * @param compiler The compiler\n   * @return The pass to test\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getOptions()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n   * Gets the compiler options to use for this test. Use getProcessor to\n   * determine what passes should be run.\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 169,
      "end_line": 184,
      "comment": "\n   * Gets the compiler options to use for this test. Use getProcessor to\n   * determine what passes should be run.\n   ",
      "child_ranges": [
        "(line 170,col 5)-(line 172,col 5)",
        "(line 176,col 5)-(line 176,col 32)",
        "(line 178,col 5)-(line 179,col 65)",
        "(line 180,col 5)-(line 181,col 51)",
        "(line 182,col 5)-(line 182,col 55)",
        "(line 183,col 5)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getCodingConvention()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.setFilename(java.lang.String)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getNumRepetitions()",
      "begin_line": 198,
      "end_line": 202,
      "comment": "\n   * Returns the number of times the pass should be run before results are\n   * verified.\n   ",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.allowSourcelessWarnings()",
      "begin_line": 205,
      "end_line": 207,
      "comment": " Expect warnings without source information. ",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.getLastCompiler()",
      "begin_line": 210,
      "end_line": 212,
      "comment": " The most recently used JSComp instance. ",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableEcmaScript5(boolean)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n   * Whether to allow ECMASCRIPT5 source parsing.\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.allowExternsChanges(boolean)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n   * Whether to allow externs changes.\n   ",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableTypeCheck(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n   * Perform type checking before running the test pass. This will check\n   * for type errors and annotate nodes with type information.\n   *\n   * @param level the level of severity to report for type errors\n   *\n   * @see TypeCheck\n   ",
      "child_ranges": [
        "(line 237,col 5)-(line 237,col 29)",
        "(line 238,col 5)-(line 238,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableLineNumberCheck(boolean)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n   * Check to make sure that line numbers were preserved.\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.disableTypeCheck()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n   * Do not run type checking before running the test pass.\n   *\n   * @see TypeCheck\n   ",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableClosurePass()",
      "begin_line": 261,
      "end_line": 263,
      "comment": " TODO(nicksantos): Fix other passes to use this when appropriate.",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableNormalize()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n   * Perform AST normalization before running the test pass, and anti-normalize\n   * after running it.\n   *\n   * @see Normalize\n   ",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableNormalize(boolean)",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n   * Perform AST normalization before running the test pass, and anti-normalize\n   * after running it.\n   *\n   * @param normalizeExpected Whether to perform normalization on the\n   * expected JS result.\n   * @see Normalize\n   ",
      "child_ranges": [
        "(line 284,col 5)-(line 284,col 28)",
        "(line 285,col 5)-(line 285,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.disableNormalize()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n   * Don\u0027t perform AST normalization before running the test pass.\n   * @see Normalize\n   ",
      "child_ranges": [
        "(line 293,col 5)-(line 293,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableMarkNoSideEffects()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n   * Run the MarkSideEffectCalls pass before running the test pass.\n   *\n   * @see MarkNoSideEffectCalls\n   ",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.enableAstValidation(boolean)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n   * Whether to allow Validate the AST after each run of the pass.\n   ",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createTypeCheck(com.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 313,
      "end_line": 321,
      "comment": " Returns a newly created TypeCheck. ",
      "child_ranges": [
        "(line 315,col 5)-(line 317,col 40)",
        "(line 319,col 5)-(line 320,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output.\n   *\n   * @param js Input\n   * @param expected Expected JS output\n   ",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output,\n   * or that an expected error is encountered.\n   *\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   ",
      "child_ranges": [
        "(line 342,col 5)-(line 342,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output,\n   * or that an expected error is encountered.\n   *\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The content of the error expected\n   ",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 371,
      "end_line": 374,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 387,
      "end_line": 390,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param externs Externs input\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 389,col 5)-(line 389,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 406,
      "end_line": 412,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param externs Externs input\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 409,col 5)-(line 410,col 49)",
        "(line 411,col 5)-(line 411,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.util.List\u003ccom.google.javascript.jscomp.SourceFile\u003e, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 428,
      "end_line": 448,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param externs Externs inputs\n   * @param js Input\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 431,col 5)-(line 431,col 41)",
        "(line 432,col 5)-(line 432,col 28)",
        "(line 434,col 5)-(line 434,col 43)",
        "(line 436,col 5)-(line 438,col 5)",
        "(line 441,col 5)-(line 441,col 39)",
        "(line 442,col 5)-(line 443,col 53)",
        "(line 445,col 5)-(line 445,col 71)",
        "(line 447,col 5)-(line 447,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.maybeCreateArray(java.lang.String)",
      "begin_line": 450,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 451,col 5)-(line 453,col 5)",
        "(line 454,col 5)-(line 454,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String[], java.lang.String[])",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output.\n   *\n   * @param js Inputs\n   * @param expected Expected JS output\n   ",
      "child_ranges": [
        "(line 464,col 5)-(line 464,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output,\n   * or that an expected error is encountered.\n   *\n   * @param js Inputs\n   * @param expected Expected JS output\n   * @param error Expected error, or null if no error is expected\n   ",
      "child_ranges": [
        "(line 476,col 5)-(line 476,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 489,
      "end_line": 492,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param js Inputs\n   * @param expected Expected JS output\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 491,col 5)-(line 491,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 507,
      "end_line": 518,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param js Inputs\n   * @param expected Expected JS output\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 509,col 5)-(line 509,col 41)",
        "(line 510,col 5)-(line 510,col 28)",
        "(line 512,col 5)-(line 512,col 51)",
        "(line 513,col 5)-(line 515,col 5)",
        "(line 516,col 5)-(line 516,col 55)",
        "(line 517,col 5)-(line 517,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.JSModule[], java.lang.String[])",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output.\n   *\n   * @param modules Module inputs\n   * @param expected Expected JS outputs (one per module)\n   ",
      "child_ranges": [
        "(line 527,col 5)-(line 527,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.JSModule[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 538,
      "end_line": 541,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output,\n   * or that an expected error is encountered.\n   *\n   * @param modules Module inputs\n   * @param expected Expected JS outputs (one per module)\n   * @param error Expected error, or null if no error is expected\n   ",
      "child_ranges": [
        "(line 540,col 5)-(line 540,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.JSModule[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 553,
      "end_line": 561,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param modules Module inputs\n   * @param expected Expected JS outputs (one per module)\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 555,col 5)-(line 555,col 41)",
        "(line 556,col 5)-(line 556,col 28)",
        "(line 558,col 5)-(line 559,col 66)",
        "(line 560,col 5)-(line 560,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input.\n   *\n   * @param js Input and output\n   ",
      "child_ranges": [
        "(line 569,col 5)-(line 569,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning is issued.\n   *\n   * @param js Input and output\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 580,col 5)-(line 580,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, com.google.javascript.jscomp.DiagnosticType, boolean)",
      "begin_line": 591,
      "end_line": 597,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning is issued.\n   *\n   * @param js Input and output\n   * @param diag Expected error or warning, or null if none is expected\n   * @param error true if diag is an error, false if it is a warning\n   ",
      "child_ranges": [
        "(line 592,col 5)-(line 596,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 607,
      "end_line": 609,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning is issued.\n   *\n   * @param externs Externs input\n   * @param js Input and output\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 608,col 5)-(line 608,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, boolean)",
      "begin_line": 620,
      "end_line": 627,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning is issued.\n   *\n   * @param externs Externs input\n   * @param js Input and output\n   * @param diag Expected error or warning, or null if none is expected\n   * @param error true if diag is an error, false if it is a warning\n   ",
      "child_ranges": [
        "(line 622,col 5)-(line 626,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 640,
      "end_line": 645,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input\n   * and (optionally) that an expected warning and description is issued.\n   *\n   * @param externs Externs input\n   * @param js Input and output\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 642,col 5)-(line 643,col 49)",
        "(line 644,col 5)-(line 644,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String[])",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input.\n   *\n   * @param js Inputs and outputs\n   ",
      "child_ranges": [
        "(line 653,col 5)-(line 653,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input,\n   * and emits the given error.\n   *\n   * @param js Inputs and outputs\n   * @param error Expected error, or null if no error is expected\n   ",
      "child_ranges": [
        "(line 664,col 5)-(line 664,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 675,
      "end_line": 678,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as its input,\n   * and emits the given error and warning.\n   *\n   * @param js Inputs and outputs\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 677,col 5)-(line 677,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(com.google.javascript.jscomp.JSModule[])",
      "begin_line": 685,
      "end_line": 687,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as the input.\n   *\n   * @param modules Module inputs\n   ",
      "child_ranges": [
        "(line 686,col 5)-(line 686,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.testSame(com.google.javascript.jscomp.JSModule[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 695,
      "end_line": 708,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output is the same as the input.\n   *\n   * @param modules Module inputs\n   * @param warning A warning, or null for no expected warning.\n   ",
      "child_ranges": [
        "(line 696,col 5)-(line 707,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.Compiler, java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 721,
      "end_line": 724,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param compiler A compiler that has been initialized via\n   *     {@link Compiler#init}\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   ",
      "child_ranges": [
        "(line 723,col 5)-(line 723,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.test(com.google.javascript.jscomp.Compiler, java.lang.String[], com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 741,
      "end_line": 960,
      "comment": "\n   * Verifies that the compiler pass\u0027s JS output matches the expected output\n   * and (optionally) that an expected warning is issued. Or, if an error is\n   * expected, this method just verifies that the error is encountered.\n   *\n   * @param compiler A compiler that has been initialized via\n   *     {@link Compiler#init}\n   * @param expected Expected output, or null if an error is expected\n   * @param error Expected error, or null if no error is expected\n   * @param warning Expected warning, or null if no warning is expected\n   * @param description The description of the expected warning,\n   *      or null if no warning is expected or if the warning\u0027s description\n   *      should not be examined\n   ",
      "child_ranges": [
        "(line 744,col 5)-(line 744,col 51)",
        "(line 745,col 5)-(line 745,col 44)",
        "(line 747,col 5)-(line 747,col 39)",
        "(line 748,col 5)-(line 749,col 66)",
        "(line 751,col 5)-(line 753,col 5)",
        "(line 754,col 5)-(line 754,col 44)",
        "(line 755,col 5)-(line 755,col 40)",
        "(line 758,col 5)-(line 758,col 38)",
        "(line 759,col 5)-(line 759,col 54)",
        "(line 760,col 5)-(line 760,col 50)",
        "(line 762,col 5)-(line 762,col 45)",
        "(line 763,col 5)-(line 763,col 68)",
        "(line 764,col 5)-(line 764,col 34)",
        "(line 765,col 5)-(line 765,col 59)",
        "(line 766,col 5)-(line 766,col 35)",
        "(line 768,col 5)-(line 769,col 39)",
        "(line 771,col 5)-(line 822,col 5)",
        "(line 824,col 5)-(line 959,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.normalizeActualCode(com.google.javascript.jscomp.Compiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 962,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 964,col 5)-(line 964,col 57)",
        "(line 965,col 5)-(line 965,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.parseExpectedJs(java.lang.String[])",
      "begin_line": 971,
      "end_line": 989,
      "comment": "\n   * Parses expected JS inputs and returns the root of the parse tree.\n   ",
      "child_ranges": [
        "(line 972,col 5)-(line 972,col 41)",
        "(line 973,col 5)-(line 973,col 51)",
        "(line 974,col 5)-(line 976,col 5)",
        "(line 977,col 5)-(line 977,col 55)",
        "(line 978,col 5)-(line 978,col 39)",
        "(line 979,col 5)-(line 980,col 66)",
        "(line 981,col 5)-(line 981,col 44)",
        "(line 982,col 5)-(line 982,col 42)",
        "(line 984,col 5)-(line 987,col 5)",
        "(line 988,col 5)-(line 988,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.parseExpectedJs(java.lang.String)",
      "begin_line": 991,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 992,col 5)-(line 992,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModuleChain(java.lang.String...)",
      "begin_line": 999,
      "end_line": 1005,
      "comment": "\n   * Generates a list of modules from a list of inputs, such that each module\n   * depends on the module before it.\n   ",
      "child_ranges": [
        "(line 1000,col 5)-(line 1000,col 47)",
        "(line 1001,col 5)-(line 1003,col 5)",
        "(line 1004,col 5)-(line 1004,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModuleStar(java.lang.String...)",
      "begin_line": 1011,
      "end_line": 1017,
      "comment": "\n   * Generates a list of modules from a list of inputs, such that each module\n   * depends on the first module.\n   ",
      "child_ranges": [
        "(line 1012,col 5)-(line 1012,col 47)",
        "(line 1013,col 5)-(line 1015,col 5)",
        "(line 1016,col 5)-(line 1016,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModuleBush(java.lang.String...)",
      "begin_line": 1024,
      "end_line": 1031,
      "comment": "\n   * Generates a list of modules from a list of inputs, such that modules\n   * form a bush formation. In a bush formation, module 2 depends\n   * on module 1, and all other modules depend on module 2.\n   ",
      "child_ranges": [
        "(line 1025,col 5)-(line 1025,col 48)",
        "(line 1026,col 5)-(line 1026,col 47)",
        "(line 1027,col 5)-(line 1029,col 5)",
        "(line 1030,col 5)-(line 1030,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModuleTree(java.lang.String...)",
      "begin_line": 1038,
      "end_line": 1044,
      "comment": "\n   * Generates a list of modules from a list of inputs, such that modules\n   * form a tree formation. In a tree formation, module N depends on\n   * module `floor(N/2)`, So the modules form a balanced binary tree.\n   ",
      "child_ranges": [
        "(line 1039,col 5)-(line 1039,col 47)",
        "(line 1040,col 5)-(line 1042,col 5)",
        "(line 1043,col 5)-(line 1043,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createModules(java.lang.String...)",
      "begin_line": 1050,
      "end_line": 1057,
      "comment": "\n   * Generates a list of modules from a list of inputs. Does not generate any\n   * dependencies between the modules.\n   ",
      "child_ranges": [
        "(line 1051,col 5)-(line 1051,col 53)",
        "(line 1052,col 5)-(line 1055,col 5)",
        "(line 1056,col 5)-(line 1056,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BlackHoleErrorManager",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.BasicErrorManager"
      ],
      "begin_line": 1059,
      "end_line": 1069,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.BlackHoleErrorManager.BlackHoleErrorManager(com.google.javascript.jscomp.Compiler)",
      "begin_line": 1060,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 7)-(line 1061,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.BlackHoleErrorManager.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 1064,
      "end_line": 1065,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.BlackHoleErrorManager.printSummary()",
      "begin_line": 1067,
      "end_line": 1068,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.createCompiler()",
      "begin_line": 1071,
      "end_line": 1074,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 5)-(line 1072,col 39)",
        "(line 1073,col 5)-(line 1073,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.setExpectedSymbolTableError(com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1076,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1077,col 5)-(line 1077,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.findQualifiedNameNode(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 1081,
      "end_line": 1093,
      "comment": " Finds the first matching qualified name node in post-traversal order. ",
      "child_ranges": [
        "(line 1082,col 5)-(line 1082,col 52)",
        "(line 1083,col 5)-(line 1091,col 39)",
        "(line 1092,col 5)-(line 1092,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerTestCase.Anonymous-15f0c809-244d-4a30-96a0-24ba339eeb2b.visit(com.google.javascript.rhino.Node)",
      "begin_line": 1085,
      "end_line": 1089,
      "comment": "",
      "child_ranges": [
        "(line 1086,col 13)-(line 1088,col 13)"
      ]
    }
  ]
}