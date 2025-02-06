{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/AliasExternalsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AliasExternalsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 396,
      "comment": "\n * Tests for {@link AliasExternals}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 25,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unaliasableGlobals"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " if you want to factor them in to the test, otherwise they will be null."
    },
    {
      "type": "field",
      "varNames": [
        "aliasableGlobals"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.AliasExternalsTest()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.getNumRepetitions()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.setUp()",
      "begin_line": 55,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 39)",
        "(line 58,col 5)-(line 58,col 28)",
        "(line 59,col 5)-(line 59,col 30)",
        "(line 60,col 5)-(line 60,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testGlobalAlias()",
      "begin_line": 66,
      "end_line": 82,
      "comment": "\n   * Test standard global aliasing.\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 81,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testUnaliasable()",
      "begin_line": 88,
      "end_line": 124,
      "comment": "\n   * Some globals should not be aliased because they have special meaning\n   * within the language (like arguments).\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 104,col 21)",
        "(line 106,col 5)-(line 118,col 27)",
        "(line 120,col 5)-(line 123,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testAliasableGlobals()",
      "begin_line": 130,
      "end_line": 165,
      "comment": "\n   * Test using a whitelist to explicitly alias only specific\n   * identifiers.\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 40)",
        "(line 132,col 5)-(line 147,col 21)",
        "(line 149,col 5)-(line 149,col 43)",
        "(line 150,col 5)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testAliasableAndUnaliasableGlobals()",
      "begin_line": 170,
      "end_line": 190,
      "comment": "\n   * Test combined usage of aliasable and unaliasable global lists.\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 33)",
        "(line 173,col 5)-(line 173,col 28)",
        "(line 174,col 5)-(line 174,col 29)",
        "(line 177,col 5)-(line 177,col 26)",
        "(line 178,col 5)-(line 178,col 35)",
        "(line 179,col 5)-(line 179,col 29)",
        "(line 182,col 5)-(line 182,col 33)",
        "(line 183,col 5)-(line 183,col 35)",
        "(line 184,col 5)-(line 189,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testGlobalAssigment()",
      "begin_line": 195,
      "end_line": 209,
      "comment": "\n   * Global variables that get re-assigned should not be aliased.\n   ",
      "child_ranges": [
        "(line 196,col 5)-(line 208,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testNewOperator()",
      "begin_line": 211,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 212,col 5)-(line 216,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testGetProp()",
      "begin_line": 222,
      "end_line": 230,
      "comment": "\n   * Test the standard replacement for GETPROP\n   ",
      "child_ranges": [
        "(line 223,col 5)-(line 225,col 76)",
        "(line 226,col 5)-(line 228,col 69)",
        "(line 229,col 5)-(line 229,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testIgnoredOps()",
      "begin_line": 235,
      "end_line": 240,
      "comment": "\n   * Ops that should be ignored\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 49)",
        "(line 237,col 5)-(line 237,col 49)",
        "(line 238,col 5)-(line 238,col 50)",
        "(line 239,col 5)-(line 239,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testSetProp()",
      "begin_line": 245,
      "end_line": 249,
      "comment": "\n   * Test property setting\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 248,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testParentChild()",
      "begin_line": 256,
      "end_line": 260,
      "comment": "\n   * Test for modifying both parent and child, as all replacements\n   * are on a single pass and modifying both involves being careful with\n   * references.\n   ",
      "child_ranges": [
        "(line 257,col 5)-(line 259,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MODULE_SRC_ONE"
      ],
      "begin_line": 262,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODULE_SRC_TWO"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testModulesWithoutDependencies()",
      "begin_line": 270,
      "end_line": 276,
      "comment": "\n   * Test that the code is placed in the first module when there are no\n   * dependencies.\n   ",
      "child_ranges": [
        "(line 271,col 5)-(line 275,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testModulesWithDependencies()",
      "begin_line": 282,
      "end_line": 288,
      "comment": "\n   * Test that the code is placed in the first module when the second module\n   * depends on the first.\n   ",
      "child_ranges": [
        "(line 283,col 5)-(line 287,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testPropAccessorPushedDeeper1()",
      "begin_line": 290,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 294,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testPropAccessorPushedDeeper2()",
      "begin_line": 297,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 303,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testPropAccessorPushedDeeper3()",
      "begin_line": 306,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 312,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testPropAccessorNotPushedDeeper()",
      "begin_line": 315,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 316,col 5)-(line 321,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testPropMutatorPushedDeeper()",
      "begin_line": 324,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 328,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testPropMutatorNotPushedDeeper()",
      "begin_line": 331,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 332,col 5)-(line 336,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testGlobalAliasPushedDeeper()",
      "begin_line": 339,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 346,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testGlobalAliasNotPushedDeeper()",
      "begin_line": 349,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 356,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testNoAliasAnnotationForSingleVar()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testNoAliasAnnotationForMultiVarDeclaration()",
      "begin_line": 363,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 364,col 5)-(line 369,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.testNoAliasAnnotationForFunction()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.formatPropNameDecl(java.lang.String)",
      "begin_line": 376,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 377,col 5)-(line 377,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.formatSetPropFn(java.lang.String)",
      "begin_line": 380,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 43)",
        "(line 382,col 5)-(line 382,col 37)",
        "(line 383,col 5)-(line 383,col 37)",
        "(line 384,col 5)-(line 385,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternalsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 388,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 392,col 46)",
        "(line 393,col 5)-(line 393,col 27)",
        "(line 394,col 5)-(line 394,col 14)"
      ]
    }
  ]
}