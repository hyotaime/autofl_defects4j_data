{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/TypedScopeCreatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypedScopeCreatorTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 49,
      "end_line": 1616,
      "comment": "\n * Tests for {@link TypedScopeCreator} and {@link TypeInference}. Admittedly,\n * the name is a bit of a misnomer.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalScope"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastLocalScope"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.getNumRepetitions()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 13)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 60,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.Anonymous-f80e8d65-91c6-4bce-bc00-fb10aaaf80a5.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 61,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 63,col 7)-(line 63,col 29)",
        "(line 64,col 7)-(line 68,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 72,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 42)",
        "(line 75,col 5)-(line 88,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.Anonymous-68379cbd-229c-45dd-bd78-02d8407ef348.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 76,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 79,col 70)",
        "(line 80,col 9)-(line 80,col 74)",
        "(line 81,col 9)-(line 83,col 60)",
        "(line 84,col 9)-(line 85,col 46)",
        "(line 86,col 9)-(line 86,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubProperty()",
      "begin_line": 91,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 44)",
        "(line 93,col 5)-(line 93,col 70)",
        "(line 94,col 5)-(line 94,col 40)",
        "(line 95,col 5)-(line 96,col 36)",
        "(line 97,col 5)-(line 98,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testConstructorProperty()",
      "begin_line": 101,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 75)",
        "(line 103,col 5)-(line 103,col 67)",
        "(line 104,col 5)-(line 104,col 39)",
        "(line 105,col 5)-(line 105,col 51)",
        "(line 107,col 5)-(line 107,col 47)",
        "(line 108,col 5)-(line 108,col 73)",
        "(line 109,col 5)-(line 110,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPrototypePropertyMethodWithoutAnnotation()",
      "begin_line": 113,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 119,col 63)",
        "(line 120,col 5)-(line 120,col 67)",
        "(line 121,col 5)-(line 121,col 45)",
        "(line 123,col 5)-(line 123,col 72)",
        "(line 124,col 5)-(line 124,col 44)",
        "(line 125,col 5)-(line 126,col 52)",
        "(line 128,col 5)-(line 128,col 44)",
        "(line 129,col 5)-(line 130,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testEnumProperty()",
      "begin_line": 133,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 67)",
        "(line 135,col 5)-(line 135,col 67)",
        "(line 136,col 5)-(line 136,col 39)",
        "(line 137,col 5)-(line 137,col 51)",
        "(line 138,col 5)-(line 138,col 50)",
        "(line 140,col 5)-(line 140,col 47)",
        "(line 141,col 5)-(line 141,col 53)",
        "(line 142,col 5)-(line 143,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty1()",
      "begin_line": 146,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 43)",
        "(line 148,col 5)-(line 148,col 67)",
        "(line 149,col 5)-(line 149,col 55)",
        "(line 150,col 5)-(line 150,col 66)",
        "(line 151,col 5)-(line 151,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty1a()",
      "begin_line": 154,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 65)",
        "(line 156,col 5)-(line 156,col 67)",
        "(line 157,col 5)-(line 157,col 55)",
        "(line 158,col 5)-(line 158,col 66)",
        "(line 159,col 5)-(line 159,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty2()",
      "begin_line": 162,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 38)",
        "(line 164,col 5)-(line 164,col 67)",
        "(line 165,col 5)-(line 165,col 55)",
        "(line 166,col 5)-(line 166,col 66)",
        "(line 167,col 5)-(line 167,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty2b()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 60)",
        "(line 172,col 5)-(line 172,col 67)",
        "(line 173,col 5)-(line 173,col 55)",
        "(line 174,col 5)-(line 174,col 66)",
        "(line 175,col 5)-(line 175,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty2c()",
      "begin_line": 178,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 62)",
        "(line 180,col 5)-(line 180,col 67)",
        "(line 181,col 5)-(line 181,col 55)",
        "(line 182,col 5)-(line 182,col 79)",
        "(line 183,col 5)-(line 183,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty3()",
      "begin_line": 186,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 76)",
        "(line 188,col 5)-(line 188,col 67)",
        "(line 189,col 5)-(line 189,col 55)",
        "(line 190,col 5)-(line 190,col 61)",
        "(line 191,col 5)-(line 191,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty4()",
      "begin_line": 194,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 67)",
        "(line 196,col 5)-(line 196,col 67)",
        "(line 197,col 5)-(line 197,col 55)",
        "(line 198,col 5)-(line 198,col 61)",
        "(line 199,col 5)-(line 199,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty5()",
      "begin_line": 202,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 78)",
        "(line 204,col 5)-(line 204,col 67)",
        "(line 205,col 5)-(line 205,col 55)",
        "(line 206,col 5)-(line 206,col 66)",
        "(line 207,col 5)-(line 207,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredProperty6()",
      "begin_line": 210,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 70)",
        "(line 212,col 5)-(line 212,col 67)",
        "(line 213,col 5)-(line 213,col 55)",
        "(line 214,col 5)-(line 214,col 66)",
        "(line 215,col 5)-(line 215,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPrototypeInit()",
      "begin_line": 218,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 220,col 58)",
        "(line 221,col 5)-(line 221,col 67)",
        "(line 222,col 5)-(line 222,col 39)",
        "(line 223,col 5)-(line 223,col 66)",
        "(line 224,col 5)-(line 224,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBogusPrototypeInit()",
      "begin_line": 227,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 231,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredPrototypeProperty1()",
      "begin_line": 234,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 236,col 53)",
        "(line 238,col 5)-(line 238,col 63)",
        "(line 239,col 5)-(line 239,col 37)",
        "(line 240,col 5)-(line 240,col 64)",
        "(line 241,col 5)-(line 241,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredPrototypeProperty2()",
      "begin_line": 244,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 246,col 56)",
        "(line 248,col 5)-(line 248,col 63)",
        "(line 249,col 5)-(line 249,col 37)",
        "(line 250,col 5)-(line 250,col 64)",
        "(line 251,col 5)-(line 251,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testEnum()",
      "begin_line": 254,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 62)",
        "(line 256,col 5)-(line 256,col 63)",
        "(line 257,col 5)-(line 257,col 37)",
        "(line 258,col 5)-(line 258,col 70)",
        "(line 259,col 5)-(line 259,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testEnumElement()",
      "begin_line": 262,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 263,col 62)",
        "(line 264,col 5)-(line 264,col 44)",
        "(line 265,col 5)-(line 265,col 23)",
        "(line 266,col 5)-(line 266,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testNamespacedEnum()",
      "begin_line": 269,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 274,col 51)",
        "(line 276,col 5)-(line 276,col 63)",
        "(line 277,col 5)-(line 277,col 31)",
        "(line 278,col 5)-(line 278,col 40)",
        "(line 279,col 5)-(line 279,col 72)",
        "(line 281,col 5)-(line 281,col 63)",
        "(line 282,col 5)-(line 282,col 56)",
        "(line 283,col 5)-(line 283,col 38)",
        "(line 284,col 5)-(line 284,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testEnumAlias()",
      "begin_line": 287,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 289,col 62)",
        "(line 291,col 5)-(line 292,col 49)",
        "(line 293,col 5)-(line 294,col 33)",
        "(line 296,col 5)-(line 296,col 63)",
        "(line 297,col 5)-(line 297,col 37)",
        "(line 298,col 5)-(line 298,col 70)",
        "(line 299,col 5)-(line 299,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testNamespacesEnumAlias()",
      "begin_line": 302,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 304,col 50)",
        "(line 306,col 5)-(line 307,col 54)",
        "(line 308,col 5)-(line 309,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testCollectedFunctionStub()",
      "begin_line": 312,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 317,col 28)",
        "(line 318,col 5)-(line 318,col 63)",
        "(line 319,col 5)-(line 319,col 36)",
        "(line 320,col 5)-(line 320,col 37)",
        "(line 321,col 5)-(line 322,col 45)",
        "(line 323,col 5)-(line 323,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testCollectedFunctionStubLocal()",
      "begin_line": 326,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 333,col 15)",
        "(line 334,col 5)-(line 334,col 66)",
        "(line 335,col 5)-(line 335,col 36)",
        "(line 336,col 5)-(line 336,col 37)",
        "(line 337,col 5)-(line 338,col 45)",
        "(line 339,col 5)-(line 339,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testNamespacedFunctionStub()",
      "begin_line": 342,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 343,col 5)-(line 345,col 46)",
        "(line 347,col 5)-(line 347,col 69)",
        "(line 348,col 5)-(line 348,col 40)",
        "(line 349,col 5)-(line 350,col 48)",
        "(line 351,col 5)-(line 351,col 51)",
        "(line 353,col 5)-(line 354,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testNamespacedFunctionStubLocal()",
      "begin_line": 357,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 362,col 15)",
        "(line 364,col 5)-(line 364,col 72)",
        "(line 365,col 5)-(line 365,col 40)",
        "(line 366,col 5)-(line 367,col 48)",
        "(line 368,col 5)-(line 368,col 51)",
        "(line 370,col 5)-(line 371,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testCollectedCtorProperty()",
      "begin_line": 374,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 379,col 28)",
        "(line 380,col 5)-(line 380,col 63)",
        "(line 381,col 5)-(line 381,col 36)",
        "(line 382,col 5)-(line 382,col 37)",
        "(line 383,col 5)-(line 383,col 64)",
        "(line 384,col 5)-(line 384,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyOnUnknownSuperClass1()",
      "begin_line": 387,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 388,col 5)-(line 394,col 45)",
        "(line 395,col 5)-(line 395,col 63)",
        "(line 396,col 5)-(line 396,col 38)",
        "(line 397,col 5)-(line 397,col 63)",
        "(line 398,col 5)-(line 398,col 59)",
        "(line 399,col 5)-(line 399,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyOnUnknownSuperClass2()",
      "begin_line": 402,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 403,col 5)-(line 409,col 45)",
        "(line 410,col 5)-(line 410,col 63)",
        "(line 411,col 5)-(line 411,col 38)",
        "(line 412,col 5)-(line 412,col 71)",
        "(line 413,col 5)-(line 413,col 63)",
        "(line 414,col 5)-(line 414,col 59)",
        "(line 415,col 5)-(line 415,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testMethodBeforeFunction1()",
      "begin_line": 418,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 424,col 27)",
        "(line 425,col 5)-(line 425,col 63)",
        "(line 426,col 5)-(line 426,col 41)",
        "(line 427,col 5)-(line 427,col 65)",
        "(line 428,col 5)-(line 429,col 47)",
        "(line 430,col 5)-(line 430,col 50)",
        "(line 432,col 5)-(line 432,col 63)",
        "(line 433,col 5)-(line 434,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testMethodBeforeFunction2()",
      "begin_line": 437,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 443,col 27)",
        "(line 444,col 5)-(line 444,col 63)",
        "(line 445,col 5)-(line 445,col 41)",
        "(line 446,col 5)-(line 446,col 65)",
        "(line 447,col 5)-(line 448,col 47)",
        "(line 449,col 5)-(line 449,col 51)",
        "(line 451,col 5)-(line 451,col 63)",
        "(line 452,col 5)-(line 453,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAddMethodsPrototypeTwoWays()",
      "begin_line": 456,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 457,col 5)-(line 461,col 28)",
        "(line 463,col 5)-(line 463,col 74)",
        "(line 464,col 5)-(line 466,col 43)",
        "(line 467,col 5)-(line 468,col 44)",
        "(line 469,col 5)-(line 470,col 44)",
        "(line 471,col 5)-(line 472,col 44)",
        "(line 477,col 5)-(line 477,col 51)",
        "(line 478,col 5)-(line 478,col 51)",
        "(line 479,col 5)-(line 479,col 51)",
        "(line 481,col 5)-(line 481,col 60)",
        "(line 482,col 5)-(line 482,col 44)",
        "(line 483,col 5)-(line 483,col 44)",
        "(line 484,col 5)-(line 484,col 44)",
        "(line 486,col 5)-(line 486,col 54)",
        "(line 487,col 5)-(line 487,col 42)",
        "(line 488,col 5)-(line 488,col 42)",
        "(line 489,col 5)-(line 489,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredVar()",
      "begin_line": 492,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 493,col 5)-(line 493,col 46)",
        "(line 495,col 5)-(line 495,col 36)",
        "(line 496,col 5)-(line 496,col 68)",
        "(line 497,col 5)-(line 497,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredVar()",
      "begin_line": 500,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 501,col 5)-(line 501,col 61)",
        "(line 503,col 5)-(line 503,col 36)",
        "(line 504,col 5)-(line 504,col 58)",
        "(line 505,col 5)-(line 505,col 36)",
        "(line 507,col 5)-(line 507,col 46)",
        "(line 508,col 5)-(line 508,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertiesOnInterface()",
      "begin_line": 511,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 512,col 5)-(line 514,col 43)",
        "(line 516,col 5)-(line 516,col 36)",
        "(line 517,col 5)-(line 517,col 65)",
        "(line 518,col 5)-(line 518,col 42)",
        "(line 520,col 5)-(line 521,col 64)",
        "(line 522,col 5)-(line 522,col 55)",
        "(line 523,col 5)-(line 523,col 53)",
        "(line 525,col 5)-(line 525,col 73)",
        "(line 526,col 5)-(line 527,col 54)",
        "(line 529,col 5)-(line 529,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertiesOnInterface2()",
      "begin_line": 532,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 533,col 5)-(line 535,col 50)",
        "(line 537,col 5)-(line 537,col 36)",
        "(line 538,col 5)-(line 538,col 65)",
        "(line 539,col 5)-(line 539,col 42)",
        "(line 541,col 5)-(line 542,col 64)",
        "(line 543,col 5)-(line 543,col 55)",
        "(line 544,col 5)-(line 544,col 53)",
        "(line 546,col 5)-(line 546,col 73)",
        "(line 548,col 5)-(line 549,col 54)",
        "(line 552,col 5)-(line 552,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubsInExterns()",
      "begin_line": 558,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 559,col 5)-(line 565,col 43)",
        "(line 567,col 5)-(line 567,col 66)",
        "(line 568,col 5)-(line 568,col 59)",
        "(line 569,col 5)-(line 569,col 59)",
        "(line 571,col 5)-(line 571,col 66)",
        "(line 572,col 5)-(line 572,col 59)",
        "(line 573,col 5)-(line 573,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubsInExterns2()",
      "begin_line": 576,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 577,col 5)-(line 581,col 18)",
        "(line 583,col 5)-(line 583,col 56)",
        "(line 584,col 5)-(line 584,col 48)",
        "(line 586,col 5)-(line 586,col 74)",
        "(line 587,col 5)-(line 588,col 42)",
        "(line 589,col 5)-(line 589,col 57)",
        "(line 590,col 5)-(line 590,col 73)",
        "(line 591,col 5)-(line 591,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubsInExterns3()",
      "begin_line": 594,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 595,col 5)-(line 599,col 18)",
        "(line 601,col 5)-(line 601,col 56)",
        "(line 602,col 5)-(line 602,col 48)",
        "(line 604,col 5)-(line 604,col 74)",
        "(line 605,col 5)-(line 606,col 42)",
        "(line 607,col 5)-(line 607,col 57)",
        "(line 608,col 5)-(line 608,col 73)",
        "(line 609,col 5)-(line 609,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubsInExterns4()",
      "begin_line": 612,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 613,col 5)-(line 616,col 18)",
        "(line 618,col 5)-(line 618,col 54)",
        "(line 619,col 5)-(line 619,col 59)",
        "(line 621,col 5)-(line 621,col 63)",
        "(line 622,col 5)-(line 623,col 43)",
        "(line 624,col 5)-(line 624,col 58)",
        "(line 625,col 5)-(line 625,col 69)",
        "(line 626,col 5)-(line 626,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyInExterns1()",
      "begin_line": 629,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 630,col 5)-(line 636,col 53)",
        "(line 638,col 5)-(line 638,col 54)",
        "(line 639,col 5)-(line 639,col 69)",
        "(line 640,col 5)-(line 640,col 53)",
        "(line 641,col 5)-(line 641,col 61)",
        "(line 642,col 5)-(line 643,col 58)",
        "(line 645,col 5)-(line 645,col 54)",
        "(line 646,col 5)-(line 646,col 69)",
        "(line 647,col 5)-(line 647,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyInExterns2()",
      "begin_line": 650,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 651,col 5)-(line 655,col 53)",
        "(line 657,col 5)-(line 657,col 54)",
        "(line 658,col 5)-(line 658,col 55)",
        "(line 660,col 5)-(line 660,col 59)",
        "(line 661,col 5)-(line 661,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyInExterns3()",
      "begin_line": 664,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 665,col 5)-(line 667,col 55)",
        "(line 669,col 5)-(line 669,col 74)",
        "(line 670,col 5)-(line 670,col 42)",
        "(line 671,col 5)-(line 671,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTypedStubsInExterns()",
      "begin_line": 674,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 675,col 5)-(line 679,col 41)",
        "(line 681,col 5)-(line 681,col 66)",
        "(line 685,col 5)-(line 687,col 47)",
        "(line 691,col 5)-(line 691,col 80)",
        "(line 692,col 5)-(line 693,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTypesInExterns()",
      "begin_line": 696,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 697,col 5)-(line 699,col 18)",
        "(line 701,col 5)-(line 701,col 41)",
        "(line 702,col 5)-(line 702,col 50)",
        "(line 703,col 5)-(line 703,col 65)",
        "(line 704,col 5)-(line 704,col 31)",
        "(line 705,col 5)-(line 705,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyDeclarationOnInstanceType()",
      "begin_line": 708,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 709,col 5)-(line 711,col 45)",
        "(line 713,col 5)-(line 713,col 78)",
        "(line 715,col 5)-(line 715,col 68)",
        "(line 716,col 5)-(line 716,col 39)",
        "(line 717,col 5)-(line 717,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyDeclarationOnRecordType()",
      "begin_line": 720,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 721,col 5)-(line 723,col 45)",
        "(line 725,col 5)-(line 725,col 78)",
        "(line 727,col 5)-(line 727,col 68)",
        "(line 728,col 5)-(line 728,col 48)",
        "(line 729,col 5)-(line 729,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testGlobalThis1()",
      "begin_line": 732,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 733,col 5)-(line 736,col 25)",
        "(line 738,col 5)-(line 738,col 68)",
        "(line 739,col 5)-(line 740,col 64)",
        "(line 741,col 5)-(line 741,col 46)",
        "(line 742,col 5)-(line 742,col 58)",
        "(line 743,col 5)-(line 743,col 64)",
        "(line 744,col 5)-(line 744,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testGlobalThis2()",
      "begin_line": 747,
      "end_line": 760,
      "comment": "",
      "child_ranges": [
        "(line 748,col 5)-(line 751,col 25)",
        "(line 753,col 5)-(line 753,col 68)",
        "(line 754,col 5)-(line 755,col 64)",
        "(line 756,col 5)-(line 756,col 46)",
        "(line 757,col 5)-(line 757,col 58)",
        "(line 758,col 5)-(line 758,col 64)",
        "(line 759,col 5)-(line 759,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testObjectLiteralCast()",
      "begin_line": 762,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 765,col 5)-(line 768,col 47)",
        "(line 770,col 5)-(line 771,col 64)",
        "(line 772,col 5)-(line 773,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadObjectLiteralCast1()",
      "begin_line": 776,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 777,col 5)-(line 779,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadObjectLiteralCast2()",
      "begin_line": 782,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 783,col 5)-(line 784,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testConstructorNode()",
      "begin_line": 787,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 788,col 5)-(line 788,col 77)",
        "(line 790,col 5)-(line 790,col 75)",
        "(line 791,col 5)-(line 791,col 24)",
        "(line 792,col 5)-(line 792,col 37)",
        "(line 793,col 5)-(line 793,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testForLoopIntegration()",
      "begin_line": 796,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 797,col 5)-(line 797,col 59)",
        "(line 799,col 5)-(line 799,col 36)",
        "(line 800,col 5)-(line 800,col 35)",
        "(line 801,col 5)-(line 801,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testConstructorAlias()",
      "begin_line": 804,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 805,col 5)-(line 807,col 51)",
        "(line 808,col 5)-(line 808,col 65)",
        "(line 809,col 5)-(line 809,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testNamespacedConstructorAlias()",
      "begin_line": 812,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 813,col 5)-(line 816,col 57)",
        "(line 817,col 5)-(line 817,col 75)",
        "(line 818,col 5)-(line 819,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType1()",
      "begin_line": 822,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 823,col 5)-(line 834,col 78)",
        "(line 835,col 5)-(line 835,col 70)",
        "(line 836,col 5)-(line 836,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType2()",
      "begin_line": 839,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 840,col 5)-(line 851,col 32)",
        "(line 852,col 5)-(line 852,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType2a()",
      "begin_line": 855,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 856,col 5)-(line 867,col 32)",
        "(line 868,col 5)-(line 869,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType2b()",
      "begin_line": 872,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 873,col 5)-(line 884,col 32)",
        "(line 885,col 5)-(line 886,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType3()",
      "begin_line": 889,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 890,col 5)-(line 904,col 34)",
        "(line 906,col 5)-(line 906,col 76)",
        "(line 907,col 5)-(line 907,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType4()",
      "begin_line": 910,
      "end_line": 926,
      "comment": "",
      "child_ranges": [
        "(line 911,col 5)-(line 922,col 51)",
        "(line 924,col 5)-(line 924,col 63)",
        "(line 925,col 5)-(line 925,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType4a()",
      "begin_line": 928,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 929,col 5)-(line 940,col 49)",
        "(line 942,col 5)-(line 942,col 63)",
        "(line 943,col 5)-(line 943,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType4b()",
      "begin_line": 946,
      "end_line": 962,
      "comment": "",
      "child_ranges": [
        "(line 947,col 5)-(line 958,col 49)",
        "(line 960,col 5)-(line 960,col 63)",
        "(line 961,col 5)-(line 961,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType5()",
      "begin_line": 964,
      "end_line": 979,
      "comment": "",
      "child_ranges": [
        "(line 965,col 5)-(line 976,col 32)",
        "(line 978,col 5)-(line 978,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType6()",
      "begin_line": 981,
      "end_line": 996,
      "comment": "",
      "child_ranges": [
        "(line 982,col 5)-(line 993,col 32)",
        "(line 995,col 5)-(line 995,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType7()",
      "begin_line": 999,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1000,col 5)-(line 1024,col 59)",
        "(line 1026,col 5)-(line 1026,col 73)",
        "(line 1027,col 5)-(line 1027,col 73)",
        "(line 1028,col 5)-(line 1028,col 73)",
        "(line 1029,col 5)-(line 1030,col 54)",
        "(line 1031,col 5)-(line 1032,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType7b()",
      "begin_line": 1035,
      "end_line": 1069,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 5)-(line 1060,col 59)",
        "(line 1062,col 5)-(line 1062,col 73)",
        "(line 1063,col 5)-(line 1063,col 73)",
        "(line 1064,col 5)-(line 1064,col 73)",
        "(line 1065,col 5)-(line 1066,col 54)",
        "(line 1067,col 5)-(line 1068,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType7c()",
      "begin_line": 1071,
      "end_line": 1105,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 5)-(line 1096,col 59)",
        "(line 1098,col 5)-(line 1098,col 73)",
        "(line 1099,col 5)-(line 1099,col 73)",
        "(line 1100,col 5)-(line 1100,col 73)",
        "(line 1101,col 5)-(line 1102,col 54)",
        "(line 1103,col 5)-(line 1104,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.disable_testTemplateType8()",
      "begin_line": 1107,
      "end_line": 1134,
      "comment": "",
      "child_ranges": [
        "(line 1109,col 5)-(line 1129,col 78)",
        "(line 1130,col 5)-(line 1130,col 68)",
        "(line 1131,col 5)-(line 1132,col 34)",
        "(line 1133,col 5)-(line 1133,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType9()",
      "begin_line": 1136,
      "end_line": 1154,
      "comment": "",
      "child_ranges": [
        "(line 1137,col 5)-(line 1152,col 41)",
        "(line 1153,col 5)-(line 1153,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType10()",
      "begin_line": 1156,
      "end_line": 1171,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 5)-(line 1169,col 64)",
        "(line 1170,col 5)-(line 1170,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType11()",
      "begin_line": 1173,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1174,col 5)-(line 1186,col 47)",
        "(line 1188,col 5)-(line 1188,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType12()",
      "begin_line": 1191,
      "end_line": 1204,
      "comment": "",
      "child_ranges": [
        "(line 1192,col 5)-(line 1201,col 64)",
        "(line 1202,col 5)-(line 1203,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClosureParameterTypesWithoutJSDoc()",
      "begin_line": 1206,
      "end_line": 1214,
      "comment": "",
      "child_ranges": [
        "(line 1207,col 5)-(line 1212,col 49)",
        "(line 1213,col 5)-(line 1213,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClosureParameterTypesWithJSDoc()",
      "begin_line": 1216,
      "end_line": 1225,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 5)-(line 1223,col 46)",
        "(line 1224,col 5)-(line 1224,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDuplicateExternProperty1()",
      "begin_line": 1227,
      "end_line": 1234,
      "comment": "",
      "child_ranges": [
        "(line 1228,col 5)-(line 1232,col 14)",
        "(line 1233,col 5)-(line 1233,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDuplicateExternProperty2()",
      "begin_line": 1236,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1237,col 5)-(line 1240,col 59)",
        "(line 1241,col 5)-(line 1241,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAbstractMethod()",
      "begin_line": 1244,
      "end_line": 1262,
      "comment": "",
      "child_ranges": [
        "(line 1245,col 5)-(line 1248,col 72)",
        "(line 1249,col 5)-(line 1250,col 76)",
        "(line 1252,col 5)-(line 1252,col 72)",
        "(line 1253,col 5)-(line 1253,col 49)",
        "(line 1254,col 5)-(line 1254,col 45)",
        "(line 1256,col 5)-(line 1256,col 55)",
        "(line 1257,col 5)-(line 1257,col 52)",
        "(line 1259,col 5)-(line 1261,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAbstractMethod2()",
      "begin_line": 1264,
      "end_line": 1274,
      "comment": "",
      "child_ranges": [
        "(line 1265,col 5)-(line 1267,col 60)",
        "(line 1268,col 5)-(line 1270,col 51)",
        "(line 1271,col 5)-(line 1273,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAbstractMethod3()",
      "begin_line": 1276,
      "end_line": 1283,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 5)-(line 1279,col 63)",
        "(line 1280,col 5)-(line 1282,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAbstractMethod4()",
      "begin_line": 1285,
      "end_line": 1304,
      "comment": "",
      "child_ranges": [
        "(line 1286,col 5)-(line 1289,col 75)",
        "(line 1290,col 5)-(line 1291,col 76)",
        "(line 1293,col 5)-(line 1293,col 72)",
        "(line 1294,col 5)-(line 1294,col 49)",
        "(line 1295,col 5)-(line 1295,col 45)",
        "(line 1297,col 5)-(line 1297,col 55)",
        "(line 1298,col 5)-(line 1298,col 52)",
        "(line 1300,col 5)-(line 1303,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testActiveXObject()",
      "begin_line": 1306,
      "end_line": 1313,
      "comment": "",
      "child_ranges": [
        "(line 1307,col 5)-(line 1309,col 46)",
        "(line 1310,col 5)-(line 1312,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference1()",
      "begin_line": 1315,
      "end_line": 1320,
      "comment": "",
      "child_ranges": [
        "(line 1316,col 5)-(line 1316,col 32)",
        "(line 1317,col 5)-(line 1319,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference2()",
      "begin_line": 1322,
      "end_line": 1327,
      "comment": "",
      "child_ranges": [
        "(line 1323,col 5)-(line 1323,col 51)",
        "(line 1324,col 5)-(line 1326,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference3()",
      "begin_line": 1329,
      "end_line": 1334,
      "comment": "",
      "child_ranges": [
        "(line 1330,col 5)-(line 1330,col 44)",
        "(line 1331,col 5)-(line 1333,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference4()",
      "begin_line": 1336,
      "end_line": 1341,
      "comment": "",
      "child_ranges": [
        "(line 1337,col 5)-(line 1337,col 48)",
        "(line 1338,col 5)-(line 1340,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference5()",
      "begin_line": 1343,
      "end_line": 1348,
      "comment": "",
      "child_ranges": [
        "(line 1344,col 5)-(line 1344,col 57)",
        "(line 1345,col 5)-(line 1347,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testLiteralTypesInferred()",
      "begin_line": 1350,
      "end_line": 1364,
      "comment": "",
      "child_ranges": [
        "(line 1351,col 5)-(line 1351,col 50)",
        "(line 1352,col 5)-(line 1353,col 67)",
        "(line 1354,col 5)-(line 1355,col 70)",
        "(line 1356,col 5)-(line 1357,col 71)",
        "(line 1358,col 5)-(line 1359,col 71)",
        "(line 1360,col 5)-(line 1361,col 71)",
        "(line 1362,col 5)-(line 1363,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testGlobalQualifiedNameInLocalScope()",
      "begin_line": 1366,
      "end_line": 1376,
      "comment": "",
      "child_ranges": [
        "(line 1367,col 5)-(line 1371,col 42)",
        "(line 1372,col 5)-(line 1372,col 48)",
        "(line 1373,col 5)-(line 1375,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty1()",
      "begin_line": 1378,
      "end_line": 1387,
      "comment": "",
      "child_ranges": [
        "(line 1379,col 5)-(line 1379,col 54)",
        "(line 1380,col 5)-(line 1380,col 74)",
        "(line 1381,col 5)-(line 1383,col 48)",
        "(line 1384,col 5)-(line 1386,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty2()",
      "begin_line": 1389,
      "end_line": 1398,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 5)-(line 1390,col 69)",
        "(line 1391,col 5)-(line 1391,col 74)",
        "(line 1392,col 5)-(line 1394,col 48)",
        "(line 1395,col 5)-(line 1397,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty3()",
      "begin_line": 1400,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1401,col 5)-(line 1403,col 13)",
        "(line 1404,col 5)-(line 1404,col 77)",
        "(line 1405,col 5)-(line 1407,col 48)",
        "(line 1408,col 5)-(line 1410,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty4()",
      "begin_line": 1413,
      "end_line": 1423,
      "comment": "",
      "child_ranges": [
        "(line 1414,col 5)-(line 1414,col 60)",
        "(line 1415,col 5)-(line 1415,col 74)",
        "(line 1416,col 5)-(line 1417,col 57)",
        "(line 1418,col 5)-(line 1418,col 51)",
        "(line 1419,col 5)-(line 1419,col 50)",
        "(line 1420,col 5)-(line 1422,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty5()",
      "begin_line": 1425,
      "end_line": 1430,
      "comment": "",
      "child_ranges": [
        "(line 1426,col 5)-(line 1427,col 49)",
        "(line 1428,col 5)-(line 1428,col 56)",
        "(line 1429,col 5)-(line 1429,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty6()",
      "begin_line": 1432,
      "end_line": 1441,
      "comment": "",
      "child_ranges": [
        "(line 1433,col 5)-(line 1433,col 67)",
        "(line 1434,col 5)-(line 1434,col 44)",
        "(line 1435,col 5)-(line 1435,col 37)",
        "(line 1436,col 5)-(line 1436,col 64)",
        "(line 1437,col 5)-(line 1437,col 39)",
        "(line 1438,col 5)-(line 1440,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredObjectLitProperty1()",
      "begin_line": 1443,
      "end_line": 1452,
      "comment": "",
      "child_ranges": [
        "(line 1444,col 5)-(line 1444,col 35)",
        "(line 1445,col 5)-(line 1445,col 44)",
        "(line 1446,col 5)-(line 1446,col 37)",
        "(line 1447,col 5)-(line 1447,col 48)",
        "(line 1448,col 5)-(line 1448,col 38)",
        "(line 1449,col 5)-(line 1451,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredObjectLitProperty2()",
      "begin_line": 1454,
      "end_line": 1463,
      "comment": "",
      "child_ranges": [
        "(line 1455,col 5)-(line 1455,col 46)",
        "(line 1456,col 5)-(line 1456,col 44)",
        "(line 1457,col 5)-(line 1457,col 37)",
        "(line 1458,col 5)-(line 1458,col 64)",
        "(line 1459,col 5)-(line 1459,col 38)",
        "(line 1460,col 5)-(line 1462,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType1()",
      "begin_line": 1465,
      "end_line": 1471,
      "comment": "",
      "child_ranges": [
        "(line 1466,col 5)-(line 1468,col 39)",
        "(line 1469,col 5)-(line 1469,col 56)",
        "(line 1470,col 5)-(line 1470,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType2()",
      "begin_line": 1473,
      "end_line": 1479,
      "comment": "",
      "child_ranges": [
        "(line 1474,col 5)-(line 1476,col 39)",
        "(line 1477,col 5)-(line 1477,col 56)",
        "(line 1478,col 5)-(line 1478,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType3()",
      "begin_line": 1481,
      "end_line": 1488,
      "comment": "",
      "child_ranges": [
        "(line 1482,col 5)-(line 1485,col 41)",
        "(line 1486,col 5)-(line 1486,col 56)",
        "(line 1487,col 5)-(line 1487,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType4()",
      "begin_line": 1490,
      "end_line": 1501,
      "comment": "",
      "child_ranges": [
        "(line 1491,col 5)-(line 1494,col 51)",
        "(line 1495,col 5)-(line 1495,col 56)",
        "(line 1496,col 5)-(line 1496,col 45)",
        "(line 1498,col 5)-(line 1499,col 79)",
        "(line 1500,col 5)-(line 1500,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType5()",
      "begin_line": 1503,
      "end_line": 1513,
      "comment": "",
      "child_ranges": [
        "(line 1504,col 5)-(line 1507,col 55)",
        "(line 1508,col 5)-(line 1508,col 56)",
        "(line 1509,col 5)-(line 1509,col 41)",
        "(line 1511,col 5)-(line 1511,col 56)",
        "(line 1512,col 5)-(line 1512,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadCtorInit1()",
      "begin_line": 1515,
      "end_line": 1517,
      "comment": "",
      "child_ranges": [
        "(line 1516,col 5)-(line 1516,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadCtorInit2()",
      "begin_line": 1519,
      "end_line": 1521,
      "comment": "",
      "child_ranges": [
        "(line 1520,col 5)-(line 1520,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadIfaceInit1()",
      "begin_line": 1523,
      "end_line": 1525,
      "comment": "",
      "child_ranges": [
        "(line 1524,col 5)-(line 1524,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadIfaceInit2()",
      "begin_line": 1527,
      "end_line": 1529,
      "comment": "",
      "child_ranges": [
        "(line 1528,col 5)-(line 1528,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testFunctionInHook()",
      "begin_line": 1531,
      "end_line": 1535,
      "comment": "",
      "child_ranges": [
        "(line 1532,col 5)-(line 1533,col 44)",
        "(line 1534,col 5)-(line 1534,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testFunctionInAnd()",
      "begin_line": 1537,
      "end_line": 1541,
      "comment": "",
      "child_ranges": [
        "(line 1538,col 5)-(line 1539,col 27)",
        "(line 1540,col 5)-(line 1540,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testFunctionInOr()",
      "begin_line": 1543,
      "end_line": 1547,
      "comment": "",
      "child_ranges": [
        "(line 1544,col 5)-(line 1545,col 27)",
        "(line 1546,col 5)-(line 1546,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testFunctionInComma()",
      "begin_line": 1549,
      "end_line": 1553,
      "comment": "",
      "child_ranges": [
        "(line 1550,col 5)-(line 1551,col 28)",
        "(line 1552,col 5)-(line 1552,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredCatchExpression1()",
      "begin_line": 1555,
      "end_line": 1561,
      "comment": "",
      "child_ranges": [
        "(line 1556,col 5)-(line 1557,col 31)",
        "(line 1560,col 5)-(line 1560,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredCatchExpression2()",
      "begin_line": 1563,
      "end_line": 1569,
      "comment": "",
      "child_ranges": [
        "(line 1564,col 5)-(line 1565,col 53)",
        "(line 1568,col 5)-(line 1568,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.findNameType(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 1571,
      "end_line": 1577,
      "comment": "",
      "child_ranges": [
        "(line 1572,col 5)-(line 1576,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.Anonymous-dcf1b5b0-9f67-4fd2-9e13-7c5f75586f35.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1573,
      "end_line": 1575,
      "comment": "",
      "child_ranges": [
        "(line 1574,col 9)-(line 1574,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.findNameTypeStr(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 1579,
      "end_line": 1581,
      "comment": "",
      "child_ranges": [
        "(line 1580,col 5)-(line 1580,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.findTokenType(int, com.google.javascript.jscomp.Scope)",
      "begin_line": 1583,
      "end_line": 1589,
      "comment": "",
      "child_ranges": [
        "(line 1584,col 5)-(line 1588,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.Anonymous-79189209-03e9-4eb0-909c-d3917aef9b20.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1585,
      "end_line": 1587,
      "comment": "",
      "child_ranges": [
        "(line 1586,col 9)-(line 1586,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.findTypeOnMatchedNode(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.Scope)",
      "begin_line": 1591,
      "end_line": 1607,
      "comment": "",
      "child_ranges": [
        "(line 1592,col 5)-(line 1592,col 36)",
        "(line 1593,col 5)-(line 1593,col 46)",
        "(line 1594,col 5)-(line 1594,col 21)",
        "(line 1595,col 5)-(line 1605,col 5)",
        "(line 1606,col 5)-(line 1606,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1609,
      "end_line": 1611,
      "comment": "",
      "child_ranges": [
        "(line 1610,col 5)-(line 1610,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1613,
      "end_line": 1615,
      "comment": "",
      "child_ranges": [
        "(line 1614,col 5)-(line 1614,col 53)"
      ]
    }
  ]
}