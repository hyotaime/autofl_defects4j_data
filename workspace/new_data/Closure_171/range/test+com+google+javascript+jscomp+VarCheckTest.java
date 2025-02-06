{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/VarCheckTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VarCheckTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 399,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strictModuleDepErrorLevel"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheck"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externValidationErrorLevel"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testSetupPass"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VarCheckTest.VarCheckTest()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.setUp()",
      "begin_line": 38,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 18)",
        "(line 42,col 5)-(line 42,col 36)",
        "(line 43,col 5)-(line 43,col 36)",
        "(line 44,col 5)-(line 44,col 47)",
        "(line 45,col 5)-(line 45,col 38)",
        "(line 46,col 5)-(line 46,col 24)",
        "(line 47,col 5)-(line 47,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.getOptions()",
      "begin_line": 50,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 49)",
        "(line 53,col 5)-(line 54,col 35)",
        "(line 55,col 5)-(line 58,col 5)",
        "(line 59,col 5)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 62,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 76,col 5)",
        "(line 77,col 5)-(line 77,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.Anonymous-4f003f2e-9977-4b81-ab11-a537816f80a0.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 66,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 67,col 11)-(line 69,col 11)",
        "(line 70,col 11)-(line 70,col 63)",
        "(line 71,col 11)-(line 73,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.getNumRepetitions()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testBreak()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testContinue()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testReferencedVarNotDefined()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testReferencedVarDefined1()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testReferencedVarDefined2()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testReferencedVarsExternallyDefined()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testMultiplyDeclaredVars1()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 112,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testMultiplyDeclaredVars2()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 118,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testMultiplyDeclaredVars3()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 123,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testMultiplyDeclaredVars4()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 128,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testVarReferenceInExterns()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 133,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testCallInExterns()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 138,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testPropReferenceInExterns1()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 143,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testPropReferenceInExterns2()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 148,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testPropReferenceInExterns3()",
      "begin_line": 151,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 45)",
        "(line 155,col 5)-(line 155,col 50)",
        "(line 156,col 5)-(line 158,col 52)",
        "(line 160,col 5)-(line 160,col 48)",
        "(line 161,col 5)-(line 161,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testVarInWithBlock()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testValidFunctionExpr()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testRecursiveFunction()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testRecursiveFunction2()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testLegalVarReferenceBetweenModules()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testMissingModuleDependencyDefault()",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 186,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testViolatedModuleDependencyDefault()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 191,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testMissingModuleDependencySkipNonStrict()",
      "begin_line": 194,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 23)",
        "(line 196,col 5)-(line 197,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testViolatedModuleDependencySkipNonStrict()",
      "begin_line": 200,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 23)",
        "(line 202,col 5)-(line 203,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testMissingModuleDependencySkipNonStrictNotPromoted()",
      "begin_line": 206,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 23)",
        "(line 208,col 5)-(line 208,col 49)",
        "(line 209,col 5)-(line 209,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testViolatedModuleDependencyNonStrictNotPromoted()",
      "begin_line": 212,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 23)",
        "(line 214,col 5)-(line 214,col 49)",
        "(line 215,col 5)-(line 215,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testDependentStrictModuleDependencyCheck()",
      "begin_line": 218,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 49)",
        "(line 220,col 5)-(line 222,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testIndependentStrictModuleDependencyCheck()",
      "begin_line": 225,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 226,col 49)",
        "(line 227,col 5)-(line 229,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testStarStrictModuleDependencyCheck()",
      "begin_line": 232,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 51)",
        "(line 234,col 5)-(line 236,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testForwardVarReferenceInLocalScope1()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 241,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testForwardVarReferenceInLocalScope2()",
      "begin_line": 244,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 247,col 5)-(line 248,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testDependentModules(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testDependentModules(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 256,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testIndependentModules(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 262,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testTwoModules(java.lang.String, java.lang.String, boolean, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 268,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 37)",
        "(line 271,col 5)-(line 271,col 49)",
        "(line 272,col 5)-(line 272,col 37)",
        "(line 273,col 5)-(line 273,col 49)",
        "(line 274,col 5)-(line 276,col 5)",
        "(line 277,col 5)-(line 278,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testSimple()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 42)",
        "(line 286,col 5)-(line 286,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testSimpleSanityCheck()",
      "begin_line": 289,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 290,col 5)-(line 290,col 23)",
        "(line 291,col 5)-(line 295,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testParameter()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testLocalVar()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testTwoLocalVars()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testInnerFunctionLocalVar()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testNoCreateVarsForLabels()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testVariableInNormalCodeUsedInExterns1()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 319,col 5)-(line 320,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testVariableInNormalCodeUsedInExterns2()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 324,col 5)-(line 325,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testVariableInNormalCodeUsedInExterns3()",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 330,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.testVariableInNormalCodeUsedInExterns4()",
      "begin_line": 333,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 335,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VariableTestCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 338,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VarCheckTest.VariableTestCheck.VariableTestCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 7)-(line 342,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.VariableTestCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 345,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 347,col 7)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.VariableTestCheck.Anonymous-f09c757f-c876-470a-b138-a438801f5a93.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 349,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 351,col 11)-(line 355,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.checkSynthesizedExtern(java.lang.String, java.lang.String)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 5)-(line 363,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheckTest.checkSynthesizedExtern(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 366,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 368,col 5)-(line 368,col 39)",
        "(line 369,col 5)-(line 369,col 52)",
        "(line 370,col 5)-(line 372,col 24)",
        "(line 373,col 5)-(line 376,col 17)",
        "(line 377,col 5)-(line 377,col 27)",
        "(line 378,col 5)-(line 378,col 38)",
        "(line 380,col 5)-(line 380,col 43)",
        "(line 381,col 5)-(line 381,col 44)",
        "(line 383,col 5)-(line 383,col 48)",
        "(line 385,col 5)-(line 385,col 59)",
        "(line 386,col 5)-(line 386,col 38)",
        "(line 388,col 5)-(line 389,col 32)",
        "(line 390,col 5)-(line 392,col 5)",
        "(line 394,col 5)-(line 394,col 52)",
        "(line 395,col 5)-(line 395,col 54)",
        "(line 397,col 5)-(line 397,col 44)"
      ]
    }
  ]
}