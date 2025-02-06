{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/NormalizeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalizeTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 30,
      "end_line": 545,
      "comment": "\n * @author johnlenz@google.com (John Lenz)\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NormalizeTest.NormalizeTest()",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 19)",
        "(line 36,col 5)-(line 36,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.getNumRepetitions()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testSplitVar()",
      "begin_line": 50,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 22)",
        "(line 52,col 5)-(line 53,col 25)",
        "(line 54,col 5)-(line 55,col 32)",
        "(line 56,col 5)-(line 56,col 27)",
        "(line 57,col 5)-(line 58,col 37)",
        "(line 59,col 5)-(line 60,col 44)",
        "(line 61,col 5)-(line 62,col 59)",
        "(line 65,col 5)-(line 66,col 75)",
        "(line 69,col 5)-(line 70,col 51)",
        "(line 71,col 5)-(line 72,col 52)",
        "(line 74,col 5)-(line 75,col 64)",
        "(line 76,col 5)-(line 77,col 57)",
        "(line 78,col 5)-(line 79,col 66)",
        "(line 81,col 5)-(line 82,col 72)",
        "(line 84,col 5)-(line 85,col 52)",
        "(line 86,col 5)-(line 87,col 38)",
        "(line 88,col 5)-(line 89,col 42)",
        "(line 90,col 5)-(line 91,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testDuplicateVarInExterns()",
      "begin_line": 94,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 97,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testUnhandled()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testFor()",
      "begin_line": 104,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 107,col 44)",
        "(line 109,col 5)-(line 110,col 48)",
        "(line 113,col 5)-(line 114,col 50)",
        "(line 116,col 5)-(line 117,col 52)",
        "(line 120,col 5)-(line 121,col 55)",
        "(line 124,col 5)-(line 125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testForIn1()",
      "begin_line": 128,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 35)",
        "(line 133,col 5)-(line 134,col 37)",
        "(line 137,col 5)-(line 138,col 39)",
        "(line 140,col 5)-(line 141,col 41)",
        "(line 144,col 5)-(line 145,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testForIn2()",
      "begin_line": 148,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 151,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testWhile()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 157,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testMoveFunctions1()",
      "begin_line": 160,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 161,col 5)-(line 162,col 68)",
        "(line 163,col 5)-(line 174,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testMoveFunctions2()",
      "begin_line": 177,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 51)",
        "(line 179,col 5)-(line 180,col 64)",
        "(line 181,col 5)-(line 182,col 60)",
        "(line 183,col 5)-(line 184,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.inFunction(java.lang.String)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testSameInFunction(java.lang.String)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testInFunction(java.lang.String, java.lang.String)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testNormalizeFunctionDeclarations()",
      "begin_line": 199,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 32)",
        "(line 201,col 5)-(line 201,col 39)",
        "(line 202,col 5)-(line 203,col 39)",
        "(line 204,col 5)-(line 204,col 40)",
        "(line 205,col 5)-(line 206,col 41)",
        "(line 207,col 5)-(line 208,col 37)",
        "(line 209,col 5)-(line 209,col 40)",
        "(line 210,col 5)-(line 211,col 47)",
        "(line 212,col 5)-(line 213,col 55)",
        "(line 214,col 5)-(line 214,col 44)",
        "(line 215,col 5)-(line 216,col 57)",
        "(line 219,col 5)-(line 219,col 42)",
        "(line 220,col 5)-(line 221,col 56)",
        "(line 222,col 5)-(line 223,col 52)",
        "(line 224,col 5)-(line 225,col 62)",
        "(line 226,col 5)-(line 227,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testMakeLocalNamesUnique()",
      "begin_line": 231,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 234,col 5)",
        "(line 237,col 5)-(line 237,col 23)",
        "(line 240,col 5)-(line 240,col 19)",
        "(line 243,col 5)-(line 244,col 49)",
        "(line 245,col 5)-(line 246,col 68)",
        "(line 247,col 5)-(line 250,col 41)",
        "(line 253,col 5)-(line 254,col 79)",
        "(line 257,col 5)-(line 258,col 34)",
        "(line 259,col 5)-(line 260,col 63)",
        "(line 261,col 5)-(line 262,col 65)",
        "(line 265,col 5)-(line 265,col 69)",
        "(line 268,col 5)-(line 269,col 69)",
        "(line 272,col 5)-(line 273,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testRemoveDuplicateVarDeclarations1()",
      "begin_line": 276,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 278,col 36)",
        "(line 279,col 5)-(line 280,col 46)",
        "(line 281,col 5)-(line 282,col 52)",
        "(line 283,col 5)-(line 284,col 54)",
        "(line 285,col 5)-(line 286,col 50)",
        "(line 287,col 5)-(line 288,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testRemoveDuplicateVarDeclarations2()",
      "begin_line": 291,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 292,col 5)-(line 293,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testRemoveDuplicateVarDeclarations3()",
      "begin_line": 296,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 297,col 5)-(line 298,col 34)",
        "(line 299,col 5)-(line 300,col 27)",
        "(line 301,col 5)-(line 302,col 61)",
        "(line 304,col 5)-(line 305,col 34)",
        "(line 306,col 5)-(line 307,col 27)",
        "(line 308,col 5)-(line 309,col 61)",
        "(line 313,col 5)-(line 315,col 60)",
        "(line 316,col 5)-(line 317,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testRenamingConstants()",
      "begin_line": 320,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 321,col 5)-(line 322,col 44)",
        "(line 324,col 5)-(line 325,col 51)",
        "(line 327,col 5)-(line 329,col 28)",
        "(line 331,col 5)-(line 332,col 52)",
        "(line 334,col 5)-(line 334,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testSkipRenamingExterns()",
      "begin_line": 337,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 339,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testIssue166a()",
      "begin_line": 342,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 343,col 5)-(line 345,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testIssue166b()",
      "begin_line": 348,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 349,col 5)-(line 355,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testIssue166c()",
      "begin_line": 358,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 362,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testIssue166d()",
      "begin_line": 365,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 373,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testIssue166e()",
      "begin_line": 376,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 377,col 5)-(line 378,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testIssue166f()",
      "begin_line": 381,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 387,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testIssue()",
      "begin_line": 390,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 391,col 5)-(line 391,col 36)",
        "(line 392,col 5)-(line 392,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testNormalizeSyntheticCode()",
      "begin_line": 395,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 396,col 39)",
        "(line 397,col 5)-(line 399,col 65)",
        "(line 400,col 5)-(line 401,col 66)",
        "(line 402,col 5)-(line 404,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testIsConstant()",
      "begin_line": 407,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 408,col 5)-(line 408,col 46)",
        "(line 409,col 5)-(line 409,col 41)",
        "(line 411,col 5)-(line 411,col 78)",
        "(line 412,col 5)-(line 412,col 42)",
        "(line 413,col 5)-(line 415,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testPropertyIsConstant1()",
      "begin_line": 418,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 57)",
        "(line 420,col 5)-(line 420,col 41)",
        "(line 422,col 5)-(line 422,col 78)",
        "(line 423,col 5)-(line 423,col 42)",
        "(line 424,col 5)-(line 426,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testPropertyIsConstant2()",
      "begin_line": 429,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 53)",
        "(line 431,col 5)-(line 431,col 41)",
        "(line 433,col 5)-(line 433,col 78)",
        "(line 434,col 5)-(line 434,col 42)",
        "(line 435,col 5)-(line 437,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testGetterPropertyIsConstant()",
      "begin_line": 440,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 441,col 5)-(line 442,col 33)",
        "(line 443,col 5)-(line 443,col 41)",
        "(line 445,col 5)-(line 445,col 78)",
        "(line 446,col 5)-(line 446,col 42)",
        "(line 447,col 5)-(line 449,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testSetterPropertyIsConstant()",
      "begin_line": 452,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 454,col 5)-(line 455,col 33)",
        "(line 456,col 5)-(line 456,col 41)",
        "(line 458,col 5)-(line 458,col 78)",
        "(line 459,col 5)-(line 459,col 42)",
        "(line 460,col 5)-(line 462,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testExposeSimple()",
      "begin_line": 465,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 466,col 5)-(line 467,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testExposeComplex()",
      "begin_line": 470,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 471,col 5)-(line 475,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.findNodesWithProperty(com.google.javascript.rhino.Node, int)",
      "begin_line": 478,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 479,col 5)-(line 479,col 44)",
        "(line 480,col 5)-(line 488,col 9)",
        "(line 489,col 5)-(line 489,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.Anonymous-23843783-ca7a-477b-97c2-f17feb9278c0.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 482,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 484,col 11)-(line 486,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.testRenamingConstantProperties()",
      "begin_line": 492,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 496,col 5)-(line 496,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WithCollapse",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 499,
      "end_line": 544,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NormalizeTest.WithCollapse.WithCollapse()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 501,col 7)-(line 501,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.WithCollapse.testConstantProperties()",
      "begin_line": 504,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 505,col 7)-(line 506,col 50)",
        "(line 508,col 7)-(line 509,col 53)",
        "(line 511,col 7)-(line 512,col 44)",
        "(line 514,col 7)-(line 515,col 58)",
        "(line 517,col 7)-(line 518,col 50)",
        "(line 520,col 7)-(line 523,col 43)",
        "(line 525,col 7)-(line 526,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.WithCollapse.getNumRepetitions()",
      "begin_line": 529,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 7)-(line 532,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.WithCollapse.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 535,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 537,col 7)-(line 542,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NormalizeTest.WithCollapse.Anonymous-87027d51-8cdb-47e5-beee-4a839a2cb202.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 538,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 11)-(line 540,col 79)"
      ]
    }
  ]
}