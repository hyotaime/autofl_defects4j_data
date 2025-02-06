{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/TypedScopeCreatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypedScopeCreatorTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 49,
      "end_line": 1916,
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
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.Anonymous-a484ae5a-143c-492b-a423-980d790848f9.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
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
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.Anonymous-89ca0968-c72f-4d03-b73d-9fc51634721a.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
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
      "end_line": 552,
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
        "(line 551,col 5)-(line 551,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubsInExterns()",
      "begin_line": 556,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 557,col 5)-(line 563,col 43)",
        "(line 565,col 5)-(line 565,col 66)",
        "(line 566,col 5)-(line 566,col 59)",
        "(line 567,col 5)-(line 567,col 59)",
        "(line 569,col 5)-(line 569,col 66)",
        "(line 570,col 5)-(line 570,col 59)",
        "(line 571,col 5)-(line 571,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubsInExterns2()",
      "begin_line": 574,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 575,col 5)-(line 579,col 18)",
        "(line 581,col 5)-(line 581,col 56)",
        "(line 582,col 5)-(line 582,col 48)",
        "(line 584,col 5)-(line 584,col 74)",
        "(line 585,col 5)-(line 586,col 42)",
        "(line 587,col 5)-(line 587,col 57)",
        "(line 588,col 5)-(line 588,col 73)",
        "(line 589,col 5)-(line 589,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubsInExterns3()",
      "begin_line": 592,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 593,col 5)-(line 597,col 18)",
        "(line 599,col 5)-(line 599,col 56)",
        "(line 600,col 5)-(line 600,col 48)",
        "(line 602,col 5)-(line 602,col 74)",
        "(line 603,col 5)-(line 604,col 42)",
        "(line 605,col 5)-(line 605,col 57)",
        "(line 606,col 5)-(line 606,col 73)",
        "(line 607,col 5)-(line 607,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testStubsInExterns4()",
      "begin_line": 610,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 611,col 5)-(line 614,col 18)",
        "(line 616,col 5)-(line 616,col 54)",
        "(line 617,col 5)-(line 617,col 59)",
        "(line 619,col 5)-(line 619,col 63)",
        "(line 620,col 5)-(line 621,col 43)",
        "(line 622,col 5)-(line 622,col 58)",
        "(line 623,col 5)-(line 623,col 69)",
        "(line 624,col 5)-(line 624,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyInExterns1()",
      "begin_line": 627,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 628,col 5)-(line 634,col 53)",
        "(line 636,col 5)-(line 636,col 54)",
        "(line 637,col 5)-(line 637,col 69)",
        "(line 638,col 5)-(line 638,col 53)",
        "(line 639,col 5)-(line 639,col 61)",
        "(line 640,col 5)-(line 641,col 58)",
        "(line 643,col 5)-(line 643,col 54)",
        "(line 644,col 5)-(line 644,col 69)",
        "(line 645,col 5)-(line 645,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyInExterns2()",
      "begin_line": 648,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 649,col 5)-(line 653,col 53)",
        "(line 655,col 5)-(line 655,col 54)",
        "(line 656,col 5)-(line 656,col 55)",
        "(line 658,col 5)-(line 658,col 59)",
        "(line 659,col 5)-(line 659,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyInExterns3()",
      "begin_line": 662,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 663,col 5)-(line 665,col 55)",
        "(line 667,col 5)-(line 667,col 74)",
        "(line 668,col 5)-(line 668,col 42)",
        "(line 669,col 5)-(line 669,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTypedStubsInExterns()",
      "begin_line": 672,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 673,col 5)-(line 677,col 41)",
        "(line 679,col 5)-(line 679,col 66)",
        "(line 683,col 5)-(line 685,col 47)",
        "(line 689,col 5)-(line 689,col 80)",
        "(line 690,col 5)-(line 691,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTypesInExterns()",
      "begin_line": 694,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 695,col 5)-(line 697,col 18)",
        "(line 699,col 5)-(line 699,col 41)",
        "(line 700,col 5)-(line 700,col 50)",
        "(line 701,col 5)-(line 701,col 65)",
        "(line 702,col 5)-(line 702,col 31)",
        "(line 703,col 5)-(line 703,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyDeclarationOnInstanceType()",
      "begin_line": 706,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 707,col 5)-(line 709,col 45)",
        "(line 711,col 5)-(line 711,col 78)",
        "(line 713,col 5)-(line 713,col 68)",
        "(line 714,col 5)-(line 714,col 39)",
        "(line 715,col 5)-(line 715,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testPropertyDeclarationOnRecordType()",
      "begin_line": 718,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 719,col 5)-(line 721,col 45)",
        "(line 723,col 5)-(line 723,col 78)",
        "(line 725,col 5)-(line 725,col 68)",
        "(line 726,col 5)-(line 726,col 48)",
        "(line 727,col 5)-(line 727,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testGlobalThis1()",
      "begin_line": 730,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 731,col 5)-(line 734,col 25)",
        "(line 736,col 5)-(line 736,col 68)",
        "(line 737,col 5)-(line 738,col 64)",
        "(line 739,col 5)-(line 739,col 46)",
        "(line 740,col 5)-(line 740,col 58)",
        "(line 741,col 5)-(line 741,col 64)",
        "(line 742,col 5)-(line 742,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testGlobalThis2()",
      "begin_line": 745,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 746,col 5)-(line 749,col 25)",
        "(line 751,col 5)-(line 751,col 68)",
        "(line 752,col 5)-(line 753,col 64)",
        "(line 754,col 5)-(line 754,col 46)",
        "(line 755,col 5)-(line 755,col 58)",
        "(line 756,col 5)-(line 756,col 64)",
        "(line 757,col 5)-(line 757,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testObjectLiteralCast()",
      "begin_line": 760,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 763,col 5)-(line 766,col 47)",
        "(line 768,col 5)-(line 769,col 64)",
        "(line 770,col 5)-(line 771,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadObjectLiteralCast1()",
      "begin_line": 774,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 775,col 5)-(line 777,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadObjectLiteralCast2()",
      "begin_line": 780,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 781,col 5)-(line 782,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testConstructorNode()",
      "begin_line": 785,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 786,col 5)-(line 786,col 77)",
        "(line 788,col 5)-(line 788,col 75)",
        "(line 789,col 5)-(line 789,col 24)",
        "(line 790,col 5)-(line 790,col 37)",
        "(line 791,col 5)-(line 791,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testForLoopIntegration()",
      "begin_line": 794,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 795,col 5)-(line 795,col 59)",
        "(line 797,col 5)-(line 797,col 36)",
        "(line 798,col 5)-(line 798,col 35)",
        "(line 799,col 5)-(line 799,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testConstructorAlias()",
      "begin_line": 802,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 803,col 5)-(line 805,col 51)",
        "(line 806,col 5)-(line 806,col 65)",
        "(line 807,col 5)-(line 807,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testNamespacedConstructorAlias()",
      "begin_line": 810,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 811,col 5)-(line 814,col 57)",
        "(line 815,col 5)-(line 815,col 75)",
        "(line 816,col 5)-(line 817,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType1()",
      "begin_line": 820,
      "end_line": 835,
      "comment": "",
      "child_ranges": [
        "(line 821,col 5)-(line 832,col 78)",
        "(line 833,col 5)-(line 833,col 70)",
        "(line 834,col 5)-(line 834,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType2()",
      "begin_line": 837,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 838,col 5)-(line 849,col 32)",
        "(line 850,col 5)-(line 850,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType2a()",
      "begin_line": 853,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 854,col 5)-(line 865,col 32)",
        "(line 866,col 5)-(line 867,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType2b()",
      "begin_line": 870,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 871,col 5)-(line 882,col 32)",
        "(line 883,col 5)-(line 884,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType3()",
      "begin_line": 887,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 888,col 5)-(line 902,col 34)",
        "(line 904,col 5)-(line 904,col 76)",
        "(line 905,col 5)-(line 905,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType4()",
      "begin_line": 908,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 909,col 5)-(line 920,col 51)",
        "(line 922,col 5)-(line 922,col 63)",
        "(line 923,col 5)-(line 923,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType4a()",
      "begin_line": 926,
      "end_line": 942,
      "comment": "",
      "child_ranges": [
        "(line 927,col 5)-(line 938,col 49)",
        "(line 940,col 5)-(line 940,col 63)",
        "(line 941,col 5)-(line 941,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType4b()",
      "begin_line": 944,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 945,col 5)-(line 956,col 49)",
        "(line 958,col 5)-(line 958,col 63)",
        "(line 959,col 5)-(line 959,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType5()",
      "begin_line": 962,
      "end_line": 977,
      "comment": "",
      "child_ranges": [
        "(line 963,col 5)-(line 974,col 32)",
        "(line 976,col 5)-(line 976,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType6()",
      "begin_line": 979,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 980,col 5)-(line 991,col 32)",
        "(line 993,col 5)-(line 993,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType7()",
      "begin_line": 997,
      "end_line": 1031,
      "comment": "",
      "child_ranges": [
        "(line 998,col 5)-(line 1022,col 59)",
        "(line 1024,col 5)-(line 1024,col 73)",
        "(line 1025,col 5)-(line 1025,col 73)",
        "(line 1026,col 5)-(line 1026,col 73)",
        "(line 1027,col 5)-(line 1028,col 54)",
        "(line 1029,col 5)-(line 1030,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType7b()",
      "begin_line": 1033,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1034,col 5)-(line 1058,col 59)",
        "(line 1060,col 5)-(line 1060,col 73)",
        "(line 1061,col 5)-(line 1061,col 73)",
        "(line 1062,col 5)-(line 1062,col 73)",
        "(line 1063,col 5)-(line 1064,col 54)",
        "(line 1065,col 5)-(line 1066,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType7c()",
      "begin_line": 1069,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1070,col 5)-(line 1094,col 59)",
        "(line 1096,col 5)-(line 1096,col 73)",
        "(line 1097,col 5)-(line 1097,col 73)",
        "(line 1098,col 5)-(line 1098,col 73)",
        "(line 1099,col 5)-(line 1100,col 54)",
        "(line 1101,col 5)-(line 1102,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.disable_testTemplateType8()",
      "begin_line": 1105,
      "end_line": 1132,
      "comment": "",
      "child_ranges": [
        "(line 1107,col 5)-(line 1127,col 78)",
        "(line 1128,col 5)-(line 1128,col 68)",
        "(line 1129,col 5)-(line 1130,col 34)",
        "(line 1131,col 5)-(line 1131,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType9()",
      "begin_line": 1134,
      "end_line": 1152,
      "comment": "",
      "child_ranges": [
        "(line 1135,col 5)-(line 1150,col 41)",
        "(line 1151,col 5)-(line 1151,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType10()",
      "begin_line": 1154,
      "end_line": 1169,
      "comment": "",
      "child_ranges": [
        "(line 1158,col 5)-(line 1167,col 64)",
        "(line 1168,col 5)-(line 1168,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType11()",
      "begin_line": 1171,
      "end_line": 1187,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 5)-(line 1184,col 47)",
        "(line 1186,col 5)-(line 1186,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testTemplateType12()",
      "begin_line": 1189,
      "end_line": 1202,
      "comment": "",
      "child_ranges": [
        "(line 1190,col 5)-(line 1199,col 64)",
        "(line 1200,col 5)-(line 1201,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.disable_testTemplateType13()",
      "begin_line": 1204,
      "end_line": 1217,
      "comment": "",
      "child_ranges": [
        "(line 1206,col 5)-(line 1214,col 32)",
        "(line 1215,col 5)-(line 1216,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateType1()",
      "begin_line": 1219,
      "end_line": 1234,
      "comment": "",
      "child_ranges": [
        "(line 1221,col 5)-(line 1232,col 38)",
        "(line 1233,col 5)-(line 1233,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateType2()",
      "begin_line": 1236,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1239,col 5)-(line 1251,col 38)",
        "(line 1252,col 5)-(line 1252,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateType3()",
      "begin_line": 1255,
      "end_line": 1270,
      "comment": "",
      "child_ranges": [
        "(line 1257,col 5)-(line 1268,col 33)",
        "(line 1269,col 5)-(line 1269,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateType4()",
      "begin_line": 1272,
      "end_line": 1288,
      "comment": "",
      "child_ranges": [
        "(line 1274,col 5)-(line 1286,col 33)",
        "(line 1287,col 5)-(line 1287,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateType5()",
      "begin_line": 1290,
      "end_line": 1307,
      "comment": "",
      "child_ranges": [
        "(line 1293,col 5)-(line 1305,col 33)",
        "(line 1306,col 5)-(line 1306,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateType6()",
      "begin_line": 1309,
      "end_line": 1326,
      "comment": "",
      "child_ranges": [
        "(line 1312,col 5)-(line 1324,col 33)",
        "(line 1325,col 5)-(line 1325,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateType7()",
      "begin_line": 1328,
      "end_line": 1341,
      "comment": "",
      "child_ranges": [
        "(line 1330,col 5)-(line 1339,col 15)",
        "(line 1340,col 5)-(line 1340,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateType8()",
      "begin_line": 1343,
      "end_line": 1356,
      "comment": "",
      "child_ranges": [
        "(line 1345,col 5)-(line 1354,col 15)",
        "(line 1355,col 5)-(line 1355,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateInheritance1()",
      "begin_line": 1358,
      "end_line": 1385,
      "comment": "",
      "child_ranges": [
        "(line 1360,col 5)-(line 1382,col 34)",
        "(line 1383,col 5)-(line 1383,col 76)",
        "(line 1384,col 5)-(line 1384,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateInheritance2()",
      "begin_line": 1387,
      "end_line": 1414,
      "comment": "",
      "child_ranges": [
        "(line 1389,col 5)-(line 1411,col 40)",
        "(line 1412,col 5)-(line 1412,col 76)",
        "(line 1413,col 5)-(line 1413,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateInheritance3()",
      "begin_line": 1416,
      "end_line": 1444,
      "comment": "",
      "child_ranges": [
        "(line 1419,col 5)-(line 1441,col 34)",
        "(line 1442,col 5)-(line 1442,col 71)",
        "(line 1443,col 5)-(line 1443,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateInheritance4()",
      "begin_line": 1446,
      "end_line": 1471,
      "comment": "",
      "child_ranges": [
        "(line 1448,col 5)-(line 1469,col 38)",
        "(line 1470,col 5)-(line 1470,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClassTemplateInheritance5()",
      "begin_line": 1473,
      "end_line": 1504,
      "comment": "",
      "child_ranges": [
        "(line 1475,col 5)-(line 1500,col 40)",
        "(line 1501,col 5)-(line 1501,col 76)",
        "(line 1502,col 5)-(line 1502,col 77)",
        "(line 1503,col 5)-(line 1503,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClosureParameterTypesWithoutJSDoc()",
      "begin_line": 1506,
      "end_line": 1514,
      "comment": "",
      "child_ranges": [
        "(line 1507,col 5)-(line 1512,col 49)",
        "(line 1513,col 5)-(line 1513,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testClosureParameterTypesWithJSDoc()",
      "begin_line": 1516,
      "end_line": 1525,
      "comment": "",
      "child_ranges": [
        "(line 1517,col 5)-(line 1523,col 49)",
        "(line 1524,col 5)-(line 1524,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDuplicateExternProperty1()",
      "begin_line": 1527,
      "end_line": 1534,
      "comment": "",
      "child_ranges": [
        "(line 1528,col 5)-(line 1532,col 14)",
        "(line 1533,col 5)-(line 1533,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDuplicateExternProperty2()",
      "begin_line": 1536,
      "end_line": 1542,
      "comment": "",
      "child_ranges": [
        "(line 1537,col 5)-(line 1540,col 59)",
        "(line 1541,col 5)-(line 1541,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAbstractMethod()",
      "begin_line": 1544,
      "end_line": 1562,
      "comment": "",
      "child_ranges": [
        "(line 1545,col 5)-(line 1548,col 72)",
        "(line 1549,col 5)-(line 1550,col 76)",
        "(line 1552,col 5)-(line 1552,col 72)",
        "(line 1553,col 5)-(line 1553,col 49)",
        "(line 1554,col 5)-(line 1554,col 45)",
        "(line 1556,col 5)-(line 1556,col 55)",
        "(line 1557,col 5)-(line 1557,col 52)",
        "(line 1559,col 5)-(line 1561,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAbstractMethod2()",
      "begin_line": 1564,
      "end_line": 1574,
      "comment": "",
      "child_ranges": [
        "(line 1565,col 5)-(line 1567,col 60)",
        "(line 1568,col 5)-(line 1570,col 51)",
        "(line 1571,col 5)-(line 1573,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAbstractMethod3()",
      "begin_line": 1576,
      "end_line": 1583,
      "comment": "",
      "child_ranges": [
        "(line 1577,col 5)-(line 1579,col 63)",
        "(line 1580,col 5)-(line 1582,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testAbstractMethod4()",
      "begin_line": 1585,
      "end_line": 1604,
      "comment": "",
      "child_ranges": [
        "(line 1586,col 5)-(line 1589,col 75)",
        "(line 1590,col 5)-(line 1591,col 76)",
        "(line 1593,col 5)-(line 1593,col 72)",
        "(line 1594,col 5)-(line 1594,col 49)",
        "(line 1595,col 5)-(line 1595,col 45)",
        "(line 1597,col 5)-(line 1597,col 55)",
        "(line 1598,col 5)-(line 1598,col 52)",
        "(line 1600,col 5)-(line 1603,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testActiveXObject()",
      "begin_line": 1606,
      "end_line": 1613,
      "comment": "",
      "child_ranges": [
        "(line 1607,col 5)-(line 1609,col 46)",
        "(line 1610,col 5)-(line 1612,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference1()",
      "begin_line": 1615,
      "end_line": 1620,
      "comment": "",
      "child_ranges": [
        "(line 1616,col 5)-(line 1616,col 32)",
        "(line 1617,col 5)-(line 1619,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference2()",
      "begin_line": 1622,
      "end_line": 1627,
      "comment": "",
      "child_ranges": [
        "(line 1623,col 5)-(line 1623,col 51)",
        "(line 1624,col 5)-(line 1626,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference3()",
      "begin_line": 1629,
      "end_line": 1634,
      "comment": "",
      "child_ranges": [
        "(line 1630,col 5)-(line 1630,col 44)",
        "(line 1631,col 5)-(line 1633,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference4()",
      "begin_line": 1636,
      "end_line": 1641,
      "comment": "",
      "child_ranges": [
        "(line 1637,col 5)-(line 1637,col 48)",
        "(line 1638,col 5)-(line 1640,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testReturnTypeInference5()",
      "begin_line": 1643,
      "end_line": 1648,
      "comment": "",
      "child_ranges": [
        "(line 1644,col 5)-(line 1644,col 57)",
        "(line 1645,col 5)-(line 1647,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testLiteralTypesInferred()",
      "begin_line": 1650,
      "end_line": 1664,
      "comment": "",
      "child_ranges": [
        "(line 1651,col 5)-(line 1651,col 50)",
        "(line 1652,col 5)-(line 1653,col 67)",
        "(line 1654,col 5)-(line 1655,col 70)",
        "(line 1656,col 5)-(line 1657,col 71)",
        "(line 1658,col 5)-(line 1659,col 71)",
        "(line 1660,col 5)-(line 1661,col 71)",
        "(line 1662,col 5)-(line 1663,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testGlobalQualifiedNameInLocalScope()",
      "begin_line": 1666,
      "end_line": 1676,
      "comment": "",
      "child_ranges": [
        "(line 1667,col 5)-(line 1671,col 42)",
        "(line 1672,col 5)-(line 1672,col 48)",
        "(line 1673,col 5)-(line 1675,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty1()",
      "begin_line": 1678,
      "end_line": 1687,
      "comment": "",
      "child_ranges": [
        "(line 1679,col 5)-(line 1679,col 54)",
        "(line 1680,col 5)-(line 1680,col 74)",
        "(line 1681,col 5)-(line 1683,col 48)",
        "(line 1684,col 5)-(line 1686,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty2()",
      "begin_line": 1689,
      "end_line": 1698,
      "comment": "",
      "child_ranges": [
        "(line 1690,col 5)-(line 1690,col 69)",
        "(line 1691,col 5)-(line 1691,col 74)",
        "(line 1692,col 5)-(line 1694,col 48)",
        "(line 1695,col 5)-(line 1697,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty3()",
      "begin_line": 1700,
      "end_line": 1711,
      "comment": "",
      "child_ranges": [
        "(line 1701,col 5)-(line 1703,col 13)",
        "(line 1704,col 5)-(line 1704,col 77)",
        "(line 1705,col 5)-(line 1707,col 48)",
        "(line 1708,col 5)-(line 1710,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty4()",
      "begin_line": 1713,
      "end_line": 1723,
      "comment": "",
      "child_ranges": [
        "(line 1714,col 5)-(line 1714,col 60)",
        "(line 1715,col 5)-(line 1715,col 74)",
        "(line 1716,col 5)-(line 1717,col 57)",
        "(line 1718,col 5)-(line 1718,col 51)",
        "(line 1719,col 5)-(line 1719,col 50)",
        "(line 1720,col 5)-(line 1722,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty5()",
      "begin_line": 1725,
      "end_line": 1730,
      "comment": "",
      "child_ranges": [
        "(line 1726,col 5)-(line 1727,col 49)",
        "(line 1728,col 5)-(line 1728,col 56)",
        "(line 1729,col 5)-(line 1729,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredObjectLitProperty6()",
      "begin_line": 1732,
      "end_line": 1741,
      "comment": "",
      "child_ranges": [
        "(line 1733,col 5)-(line 1733,col 67)",
        "(line 1734,col 5)-(line 1734,col 44)",
        "(line 1735,col 5)-(line 1735,col 37)",
        "(line 1736,col 5)-(line 1736,col 64)",
        "(line 1737,col 5)-(line 1737,col 39)",
        "(line 1738,col 5)-(line 1740,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredObjectLitProperty1()",
      "begin_line": 1743,
      "end_line": 1752,
      "comment": "",
      "child_ranges": [
        "(line 1744,col 5)-(line 1744,col 35)",
        "(line 1745,col 5)-(line 1745,col 44)",
        "(line 1746,col 5)-(line 1746,col 37)",
        "(line 1747,col 5)-(line 1747,col 48)",
        "(line 1748,col 5)-(line 1748,col 38)",
        "(line 1749,col 5)-(line 1751,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testInferredObjectLitProperty2()",
      "begin_line": 1754,
      "end_line": 1763,
      "comment": "",
      "child_ranges": [
        "(line 1755,col 5)-(line 1755,col 46)",
        "(line 1756,col 5)-(line 1756,col 44)",
        "(line 1757,col 5)-(line 1757,col 37)",
        "(line 1758,col 5)-(line 1758,col 64)",
        "(line 1759,col 5)-(line 1759,col 38)",
        "(line 1760,col 5)-(line 1762,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType1()",
      "begin_line": 1765,
      "end_line": 1771,
      "comment": "",
      "child_ranges": [
        "(line 1766,col 5)-(line 1768,col 39)",
        "(line 1769,col 5)-(line 1769,col 56)",
        "(line 1770,col 5)-(line 1770,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType2()",
      "begin_line": 1773,
      "end_line": 1779,
      "comment": "",
      "child_ranges": [
        "(line 1774,col 5)-(line 1776,col 39)",
        "(line 1777,col 5)-(line 1777,col 56)",
        "(line 1778,col 5)-(line 1778,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType3()",
      "begin_line": 1781,
      "end_line": 1788,
      "comment": "",
      "child_ranges": [
        "(line 1782,col 5)-(line 1785,col 41)",
        "(line 1786,col 5)-(line 1786,col 56)",
        "(line 1787,col 5)-(line 1787,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType4()",
      "begin_line": 1790,
      "end_line": 1801,
      "comment": "",
      "child_ranges": [
        "(line 1791,col 5)-(line 1794,col 51)",
        "(line 1795,col 5)-(line 1795,col 56)",
        "(line 1796,col 5)-(line 1796,col 45)",
        "(line 1798,col 5)-(line 1799,col 79)",
        "(line 1800,col 5)-(line 1800,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredConstType5()",
      "begin_line": 1803,
      "end_line": 1813,
      "comment": "",
      "child_ranges": [
        "(line 1804,col 5)-(line 1807,col 55)",
        "(line 1808,col 5)-(line 1808,col 56)",
        "(line 1809,col 5)-(line 1809,col 41)",
        "(line 1811,col 5)-(line 1811,col 56)",
        "(line 1812,col 5)-(line 1812,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadCtorInit1()",
      "begin_line": 1815,
      "end_line": 1817,
      "comment": "",
      "child_ranges": [
        "(line 1816,col 5)-(line 1816,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadCtorInit2()",
      "begin_line": 1819,
      "end_line": 1821,
      "comment": "",
      "child_ranges": [
        "(line 1820,col 5)-(line 1820,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadIfaceInit1()",
      "begin_line": 1823,
      "end_line": 1825,
      "comment": "",
      "child_ranges": [
        "(line 1824,col 5)-(line 1824,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testBadIfaceInit2()",
      "begin_line": 1827,
      "end_line": 1829,
      "comment": "",
      "child_ranges": [
        "(line 1828,col 5)-(line 1828,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testFunctionInHook()",
      "begin_line": 1831,
      "end_line": 1835,
      "comment": "",
      "child_ranges": [
        "(line 1832,col 5)-(line 1833,col 44)",
        "(line 1834,col 5)-(line 1834,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testFunctionInAnd()",
      "begin_line": 1837,
      "end_line": 1841,
      "comment": "",
      "child_ranges": [
        "(line 1838,col 5)-(line 1839,col 27)",
        "(line 1840,col 5)-(line 1840,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testFunctionInOr()",
      "begin_line": 1843,
      "end_line": 1847,
      "comment": "",
      "child_ranges": [
        "(line 1844,col 5)-(line 1845,col 27)",
        "(line 1846,col 5)-(line 1846,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testFunctionInComma()",
      "begin_line": 1849,
      "end_line": 1853,
      "comment": "",
      "child_ranges": [
        "(line 1850,col 5)-(line 1851,col 28)",
        "(line 1852,col 5)-(line 1852,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredCatchExpression1()",
      "begin_line": 1855,
      "end_line": 1861,
      "comment": "",
      "child_ranges": [
        "(line 1856,col 5)-(line 1857,col 31)",
        "(line 1860,col 5)-(line 1860,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.testDeclaredCatchExpression2()",
      "begin_line": 1863,
      "end_line": 1869,
      "comment": "",
      "child_ranges": [
        "(line 1864,col 5)-(line 1865,col 53)",
        "(line 1868,col 5)-(line 1868,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.findNameType(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 1871,
      "end_line": 1877,
      "comment": "",
      "child_ranges": [
        "(line 1872,col 5)-(line 1876,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.Anonymous-0a3ca10f-4bca-41ac-904e-c9ca0e6e6785.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1873,
      "end_line": 1875,
      "comment": "",
      "child_ranges": [
        "(line 1874,col 9)-(line 1874,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.findNameTypeStr(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 1879,
      "end_line": 1881,
      "comment": "",
      "child_ranges": [
        "(line 1880,col 5)-(line 1880,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.findTokenType(int, com.google.javascript.jscomp.Scope)",
      "begin_line": 1883,
      "end_line": 1889,
      "comment": "",
      "child_ranges": [
        "(line 1884,col 5)-(line 1888,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.Anonymous-74260f53-536e-4211-a835-93a6681f469d.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1885,
      "end_line": 1887,
      "comment": "",
      "child_ranges": [
        "(line 1886,col 9)-(line 1886,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.findTypeOnMatchedNode(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.Scope)",
      "begin_line": 1891,
      "end_line": 1907,
      "comment": "",
      "child_ranges": [
        "(line 1892,col 5)-(line 1892,col 36)",
        "(line 1893,col 5)-(line 1893,col 46)",
        "(line 1894,col 5)-(line 1894,col 21)",
        "(line 1895,col 5)-(line 1905,col 5)",
        "(line 1906,col 5)-(line 1906,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1909,
      "end_line": 1911,
      "comment": "",
      "child_ranges": [
        "(line 1910,col 5)-(line 1910,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreatorTest.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1913,
      "end_line": 1915,
      "comment": "",
      "child_ranges": [
        "(line 1914,col 5)-(line 1914,col 53)"
      ]
    }
  ]
}