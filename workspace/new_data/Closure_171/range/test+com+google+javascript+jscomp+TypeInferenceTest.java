{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/TypeInferenceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeInferenceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 59,
      "end_line": 1129,
      "comment": "\n * Tests {@link TypeInference}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumptions"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumedThisType"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnScope"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASSERTION_FUNCTION_MAP"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.setUp()",
      "begin_line": 75,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 30)",
        "(line 78,col 5)-(line 78,col 52)",
        "(line 79,col 5)-(line 79,col 33)",
        "(line 80,col 5)-(line 80,col 52)",
        "(line 81,col 5)-(line 81,col 34)",
        "(line 82,col 5)-(line 82,col 42)",
        "(line 83,col 5)-(line 83,col 36)",
        "(line 84,col 5)-(line 84,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.assumingThisType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.assuming(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.assuming(java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.inFunction(java.lang.String)",
      "begin_line": 99,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 103,col 51)",
        "(line 104,col 5)-(line 105,col 56)",
        "(line 106,col 5)-(line 108,col 37)",
        "(line 110,col 5)-(line 110,col 50)",
        "(line 112,col 5)-(line 112,col 69)",
        "(line 113,col 5)-(line 114,col 49)",
        "(line 115,col 5)-(line 117,col 5)",
        "(line 119,col 5)-(line 119,col 78)",
        "(line 120,col 5)-(line 120,col 25)",
        "(line 121,col 5)-(line 121,col 46)",
        "(line 123,col 5)-(line 123,col 78)",
        "(line 125,col 5)-(line 126,col 32)",
        "(line 127,col 5)-(line 127,col 18)",
        "(line 129,col 5)-(line 130,col 48)",
        "(line 131,col 5)-(line 131,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.getType(java.lang.String)",
      "begin_line": 134,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 76)",
        "(line 136,col 5)-(line 136,col 55)",
        "(line 137,col 5)-(line 138,col 21)",
        "(line 139,col 5)-(line 139,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.verify(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.verify(java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.verifySubtypeOf(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 150,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 35)",
        "(line 152,col 5)-(line 152,col 80)",
        "(line 153,col 5)-(line 154,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.verifySubtypeOf(java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createEnumType(java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createEnumType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createUndefinableType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 171,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createNullableType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createNullableType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 184,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssumption()",
      "begin_line": 187,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 31)",
        "(line 189,col 5)-(line 189,col 19)",
        "(line 190,col 5)-(line 190,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testVar()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 29)",
        "(line 195,col 5)-(line 195,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEmptyVar()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 25)",
        "(line 200,col 5)-(line 200,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssignment()",
      "begin_line": 203,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 31)",
        "(line 205,col 5)-(line 205,col 25)",
        "(line 206,col 5)-(line 206,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testExprWithinCast()",
      "begin_line": 209,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 31)",
        "(line 211,col 5)-(line 211,col 49)",
        "(line 212,col 5)-(line 212,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testGetProp()",
      "begin_line": 215,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 51)",
        "(line 217,col 5)-(line 217,col 25)",
        "(line 218,col 5)-(line 218,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testGetElemDereference()",
      "begin_line": 221,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 54)",
        "(line 223,col 5)-(line 223,col 30)",
        "(line 224,col 5)-(line 224,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIf1()",
      "begin_line": 227,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 51)",
        "(line 229,col 5)-(line 229,col 48)",
        "(line 230,col 5)-(line 230,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIf1a()",
      "begin_line": 233,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 51)",
        "(line 235,col 5)-(line 235,col 56)",
        "(line 236,col 5)-(line 236,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIf2()",
      "begin_line": 239,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 51)",
        "(line 241,col 5)-(line 241,col 64)",
        "(line 242,col 5)-(line 242,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIf3()",
      "begin_line": 245,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 51)",
        "(line 247,col 5)-(line 247,col 47)",
        "(line 248,col 5)-(line 248,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testPropertyInference1()",
      "begin_line": 251,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 67)",
        "(line 253,col 5)-(line 254,col 50)",
        "(line 255,col 5)-(line 255,col 31)",
        "(line 256,col 5)-(line 256,col 61)",
        "(line 257,col 5)-(line 257,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testPropertyInference2()",
      "begin_line": 260,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 67)",
        "(line 262,col 5)-(line 263,col 50)",
        "(line 264,col 5)-(line 264,col 31)",
        "(line 265,col 5)-(line 265,col 59)",
        "(line 266,col 5)-(line 266,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testPropertyInference3()",
      "begin_line": 269,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 67)",
        "(line 271,col 5)-(line 272,col 50)",
        "(line 273,col 5)-(line 273,col 31)",
        "(line 274,col 5)-(line 274,col 57)",
        "(line 275,col 5)-(line 275,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert1()",
      "begin_line": 278,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 55)",
        "(line 280,col 5)-(line 280,col 29)",
        "(line 281,col 5)-(line 281,col 62)",
        "(line 282,col 5)-(line 282,col 30)",
        "(line 283,col 5)-(line 283,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert1a()",
      "begin_line": 286,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 55)",
        "(line 288,col 5)-(line 288,col 29)",
        "(line 289,col 5)-(line 289,col 71)",
        "(line 290,col 5)-(line 290,col 30)",
        "(line 291,col 5)-(line 291,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert2()",
      "begin_line": 294,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 55)",
        "(line 296,col 5)-(line 296,col 29)",
        "(line 297,col 5)-(line 297,col 55)",
        "(line 298,col 5)-(line 298,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert3()",
      "begin_line": 301,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 55)",
        "(line 303,col 5)-(line 303,col 29)",
        "(line 304,col 5)-(line 304,col 29)",
        "(line 305,col 5)-(line 305,col 77)",
        "(line 306,col 5)-(line 306,col 30)",
        "(line 307,col 5)-(line 307,col 32)",
        "(line 308,col 5)-(line 308,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert4()",
      "begin_line": 311,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 55)",
        "(line 313,col 5)-(line 313,col 29)",
        "(line 314,col 5)-(line 314,col 29)",
        "(line 315,col 5)-(line 315,col 78)",
        "(line 316,col 5)-(line 316,col 30)",
        "(line 317,col 5)-(line 317,col 32)",
        "(line 318,col 5)-(line 318,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert5()",
      "begin_line": 321,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 322,col 55)",
        "(line 323,col 5)-(line 323,col 29)",
        "(line 324,col 5)-(line 324,col 29)",
        "(line 325,col 5)-(line 325,col 67)",
        "(line 326,col 5)-(line 326,col 30)",
        "(line 327,col 5)-(line 327,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert6()",
      "begin_line": 330,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 55)",
        "(line 332,col 5)-(line 332,col 31)",
        "(line 333,col 5)-(line 333,col 68)",
        "(line 334,col 5)-(line 334,col 30)",
        "(line 335,col 5)-(line 335,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert7()",
      "begin_line": 338,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 55)",
        "(line 340,col 5)-(line 340,col 29)",
        "(line 341,col 5)-(line 341,col 59)",
        "(line 342,col 5)-(line 342,col 30)",
        "(line 343,col 5)-(line 343,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert8()",
      "begin_line": 346,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 55)",
        "(line 348,col 5)-(line 348,col 29)",
        "(line 349,col 5)-(line 349,col 67)",
        "(line 350,col 5)-(line 350,col 30)",
        "(line 351,col 5)-(line 351,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert9()",
      "begin_line": 354,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 55)",
        "(line 356,col 5)-(line 356,col 29)",
        "(line 357,col 5)-(line 357,col 63)",
        "(line 358,col 5)-(line 358,col 30)",
        "(line 359,col 5)-(line 359,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert10()",
      "begin_line": 362,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 363,col 5)-(line 363,col 55)",
        "(line 364,col 5)-(line 364,col 29)",
        "(line 365,col 5)-(line 365,col 29)",
        "(line 366,col 5)-(line 366,col 74)",
        "(line 367,col 5)-(line 367,col 30)",
        "(line 368,col 5)-(line 368,col 32)",
        "(line 369,col 5)-(line 369,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert11()",
      "begin_line": 372,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 55)",
        "(line 374,col 5)-(line 374,col 29)",
        "(line 375,col 5)-(line 375,col 29)",
        "(line 376,col 5)-(line 376,col 55)",
        "(line 377,col 5)-(line 377,col 27)",
        "(line 378,col 5)-(line 378,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertNumber()",
      "begin_line": 381,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 382,col 52)",
        "(line 383,col 5)-(line 383,col 29)",
        "(line 384,col 5)-(line 384,col 68)",
        "(line 385,col 5)-(line 385,col 30)",
        "(line 386,col 5)-(line 386,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertNumber2()",
      "begin_line": 389,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 391,col 5)-(line 391,col 52)",
        "(line 392,col 5)-(line 392,col 29)",
        "(line 393,col 5)-(line 393,col 62)",
        "(line 394,col 5)-(line 394,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertNumber3()",
      "begin_line": 397,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 399,col 5)-(line 399,col 52)",
        "(line 400,col 5)-(line 400,col 29)",
        "(line 401,col 5)-(line 401,col 69)",
        "(line 402,col 5)-(line 402,col 30)",
        "(line 403,col 5)-(line 403,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertString()",
      "begin_line": 406,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 407,col 52)",
        "(line 408,col 5)-(line 408,col 29)",
        "(line 409,col 5)-(line 409,col 68)",
        "(line 410,col 5)-(line 410,col 30)",
        "(line 411,col 5)-(line 411,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertFunction()",
      "begin_line": 414,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 52)",
        "(line 416,col 5)-(line 416,col 29)",
        "(line 417,col 5)-(line 417,col 70)",
        "(line 418,col 5)-(line 418,col 30)",
        "(line 419,col 5)-(line 419,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject()",
      "begin_line": 422,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 423,col 52)",
        "(line 424,col 5)-(line 424,col 29)",
        "(line 425,col 5)-(line 425,col 68)",
        "(line 426,col 5)-(line 426,col 30)",
        "(line 427,col 5)-(line 427,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject2()",
      "begin_line": 430,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 431,col 5)-(line 431,col 54)",
        "(line 432,col 5)-(line 432,col 29)",
        "(line 433,col 5)-(line 433,col 68)",
        "(line 434,col 5)-(line 434,col 30)",
        "(line 435,col 5)-(line 435,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject3()",
      "begin_line": 438,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 55)",
        "(line 440,col 5)-(line 440,col 31)",
        "(line 441,col 5)-(line 441,col 74)",
        "(line 442,col 5)-(line 442,col 30)",
        "(line 443,col 5)-(line 443,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject4()",
      "begin_line": 446,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 447,col 5)-(line 447,col 54)",
        "(line 448,col 5)-(line 448,col 29)",
        "(line 449,col 5)-(line 449,col 65)",
        "(line 450,col 5)-(line 450,col 30)",
        "(line 451,col 5)-(line 451,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject5()",
      "begin_line": 454,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 455,col 5)-(line 455,col 52)",
        "(line 456,col 5)-(line 456,col 29)",
        "(line 457,col 5)-(line 459,col 72)",
        "(line 460,col 5)-(line 460,col 30)",
        "(line 461,col 5)-(line 461,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertArray()",
      "begin_line": 464,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 52)",
        "(line 466,col 5)-(line 466,col 29)",
        "(line 467,col 5)-(line 467,col 67)",
        "(line 468,col 5)-(line 468,col 30)",
        "(line 469,col 5)-(line 469,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof1()",
      "begin_line": 472,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 473,col 5)-(line 473,col 52)",
        "(line 474,col 5)-(line 474,col 29)",
        "(line 475,col 5)-(line 475,col 72)",
        "(line 476,col 5)-(line 476,col 30)",
        "(line 477,col 5)-(line 477,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof2()",
      "begin_line": 480,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 481,col 5)-(line 481,col 52)",
        "(line 482,col 5)-(line 482,col 29)",
        "(line 483,col 5)-(line 483,col 80)",
        "(line 484,col 5)-(line 484,col 30)",
        "(line 485,col 5)-(line 485,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof3()",
      "begin_line": 488,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 489,col 5)-(line 489,col 60)",
        "(line 490,col 5)-(line 490,col 29)",
        "(line 491,col 5)-(line 491,col 80)",
        "(line 492,col 5)-(line 492,col 30)",
        "(line 493,col 5)-(line 493,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof4()",
      "begin_line": 496,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 497,col 5)-(line 497,col 66)",
        "(line 498,col 5)-(line 498,col 29)",
        "(line 499,col 5)-(line 499,col 80)",
        "(line 500,col 5)-(line 500,col 30)",
        "(line 501,col 5)-(line 501,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof5()",
      "begin_line": 504,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 505,col 5)-(line 505,col 56)",
        "(line 506,col 5)-(line 506,col 29)",
        "(line 507,col 5)-(line 508,col 74)",
        "(line 509,col 5)-(line 509,col 30)",
        "(line 510,col 5)-(line 510,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertWithIsDefAndNotNull()",
      "begin_line": 513,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 514,col 5)-(line 514,col 55)",
        "(line 515,col 5)-(line 515,col 29)",
        "(line 516,col 5)-(line 519,col 21)",
        "(line 520,col 5)-(line 520,col 30)",
        "(line 521,col 5)-(line 521,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIsDefAndNoResolvedType()",
      "begin_line": 524,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 525,col 5)-(line 525,col 63)",
        "(line 526,col 5)-(line 526,col 29)",
        "(line 527,col 5)-(line 531,col 44)",
        "(line 532,col 5)-(line 532,col 30)",
        "(line 533,col 5)-(line 533,col 38)",
        "(line 534,col 5)-(line 534,col 42)",
        "(line 535,col 5)-(line 535,col 38)",
        "(line 536,col 5)-(line 536,col 30)",
        "(line 537,col 5)-(line 537,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertWithNotIsNull()",
      "begin_line": 540,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 541,col 5)-(line 541,col 55)",
        "(line 542,col 5)-(line 542,col 29)",
        "(line 543,col 5)-(line 546,col 21)",
        "(line 547,col 5)-(line 547,col 30)",
        "(line 548,col 5)-(line 548,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testReturn1()",
      "begin_line": 551,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 552,col 5)-(line 552,col 51)",
        "(line 553,col 5)-(line 553,col 59)",
        "(line 554,col 5)-(line 554,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testReturn2()",
      "begin_line": 557,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 558,col 5)-(line 558,col 51)",
        "(line 559,col 5)-(line 559,col 48)",
        "(line 560,col 5)-(line 560,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testWhile1()",
      "begin_line": 563,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 564,col 5)-(line 564,col 51)",
        "(line 565,col 5)-(line 565,col 75)",
        "(line 566,col 5)-(line 566,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testWhile2()",
      "begin_line": 569,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 570,col 5)-(line 570,col 51)",
        "(line 571,col 5)-(line 571,col 41)",
        "(line 572,col 5)-(line 572,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testDo()",
      "begin_line": 575,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 576,col 5)-(line 576,col 51)",
        "(line 577,col 5)-(line 577,col 44)",
        "(line 578,col 5)-(line 578,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor1()",
      "begin_line": 581,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 582,col 5)-(line 582,col 31)",
        "(line 583,col 5)-(line 583,col 76)",
        "(line 584,col 5)-(line 584,col 49)",
        "(line 585,col 5)-(line 585,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor2()",
      "begin_line": 588,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 589,col 31)",
        "(line 590,col 5)-(line 590,col 70)",
        "(line 591,col 5)-(line 591,col 49)",
        "(line 592,col 5)-(line 592,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor3()",
      "begin_line": 595,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 596,col 5)-(line 596,col 31)",
        "(line 597,col 5)-(line 597,col 74)",
        "(line 598,col 5)-(line 598,col 49)",
        "(line 599,col 5)-(line 599,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor4()",
      "begin_line": 602,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 603,col 5)-(line 603,col 51)",
        "(line 604,col 5)-(line 605,col 69)",
        "(line 606,col 5)-(line 606,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor5()",
      "begin_line": 609,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 610,col 5)-(line 612,col 55)",
        "(line 613,col 5)-(line 614,col 74)",
        "(line 615,col 5)-(line 615,col 49)",
        "(line 616,col 5)-(line 616,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor6()",
      "begin_line": 619,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 620,col 5)-(line 620,col 51)",
        "(line 621,col 5)-(line 625,col 13)",
        "(line 626,col 5)-(line 626,col 45)",
        "(line 627,col 5)-(line 627,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testSwitch1()",
      "begin_line": 630,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 631,col 5)-(line 631,col 31)",
        "(line 632,col 5)-(line 636,col 28)",
        "(line 637,col 5)-(line 637,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testSwitch2()",
      "begin_line": 640,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 641,col 5)-(line 641,col 28)",
        "(line 642,col 5)-(line 648,col 13)",
        "(line 649,col 5)-(line 649,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testSwitch3()",
      "begin_line": 652,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 653,col 5)-(line 654,col 71)",
        "(line 655,col 5)-(line 664,col 13)",
        "(line 665,col 5)-(line 665,col 29)",
        "(line 666,col 5)-(line 666,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testSwitch4()",
      "begin_line": 669,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 670,col 5)-(line 670,col 28)",
        "(line 671,col 5)-(line 678,col 15)",
        "(line 679,col 5)-(line 679,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCall1()",
      "begin_line": 682,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 683,col 5)-(line 685,col 79)",
        "(line 686,col 5)-(line 686,col 31)",
        "(line 687,col 5)-(line 687,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testNew1()",
      "begin_line": 690,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 691,col 5)-(line 693,col 72)",
        "(line 694,col 5)-(line 694,col 35)",
        "(line 695,col 5)-(line 695,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testNew2()",
      "begin_line": 698,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 699,col 5)-(line 707,col 34)",
        "(line 709,col 5)-(line 709,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testNew3()",
      "begin_line": 712,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 713,col 5)-(line 725,col 38)",
        "(line 727,col 5)-(line 727,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInnerFunction1()",
      "begin_line": 730,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 731,col 5)-(line 731,col 57)",
        "(line 732,col 5)-(line 732,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInnerFunction2()",
      "begin_line": 735,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 736,col 5)-(line 736,col 63)",
        "(line 737,col 5)-(line 737,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testHook()",
      "begin_line": 740,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 741,col 5)-(line 741,col 51)",
        "(line 742,col 5)-(line 742,col 38)",
        "(line 743,col 5)-(line 743,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testThrow()",
      "begin_line": 746,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 747,col 5)-(line 747,col 51)",
        "(line 748,col 5)-(line 750,col 18)",
        "(line 751,col 5)-(line 751,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testTry1()",
      "begin_line": 754,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 755,col 5)-(line 755,col 31)",
        "(line 756,col 5)-(line 756,col 69)",
        "(line 757,col 5)-(line 757,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testTry2()",
      "begin_line": 760,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 761,col 5)-(line 761,col 31)",
        "(line 762,col 5)-(line 763,col 63)",
        "(line 764,col 5)-(line 764,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testTry3()",
      "begin_line": 767,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 768,col 5)-(line 768,col 31)",
        "(line 769,col 5)-(line 769,col 61)",
        "(line 770,col 5)-(line 770,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCatch1()",
      "begin_line": 773,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 774,col 5)-(line 774,col 68)",
        "(line 775,col 5)-(line 775,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCatch2()",
      "begin_line": 778,
      "end_line": 781,
      "comment": "",
      "child_ranges": [
        "(line 779,col 5)-(line 779,col 79)",
        "(line 780,col 5)-(line 780,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testUnknownType1()",
      "begin_line": 783,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 784,col 5)-(line 784,col 36)",
        "(line 785,col 5)-(line 785,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testUnknownType2()",
      "begin_line": 788,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 789,col 5)-(line 789,col 30)",
        "(line 790,col 5)-(line 790,col 39)",
        "(line 791,col 5)-(line 791,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInfiniteLoop1()",
      "begin_line": 794,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 795,col 5)-(line 795,col 51)",
        "(line 796,col 5)-(line 796,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInfiniteLoop2()",
      "begin_line": 799,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 800,col 5)-(line 800,col 51)",
        "(line 801,col 5)-(line 801,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testJoin1()",
      "begin_line": 804,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 805,col 5)-(line 805,col 68)",
        "(line 806,col 5)-(line 806,col 32)",
        "(line 807,col 5)-(line 807,col 45)",
        "(line 808,col 5)-(line 808,col 66)",
        "(line 809,col 5)-(line 809,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testJoin2()",
      "begin_line": 812,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 813,col 5)-(line 813,col 68)",
        "(line 814,col 5)-(line 814,col 32)",
        "(line 815,col 5)-(line 815,col 45)",
        "(line 816,col 5)-(line 816,col 66)",
        "(line 817,col 5)-(line 817,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testArrayLit()",
      "begin_line": 820,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 821,col 5)-(line 821,col 51)",
        "(line 822,col 5)-(line 822,col 53)",
        "(line 823,col 5)-(line 823,col 56)",
        "(line 824,col 5)-(line 824,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testGetElem()",
      "begin_line": 827,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 828,col 5)-(line 828,col 51)",
        "(line 829,col 5)-(line 829,col 54)",
        "(line 830,col 5)-(line 830,col 30)",
        "(line 831,col 5)-(line 831,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEnumRAI1()",
      "begin_line": 834,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 835,col 5)-(line 835,col 77)",
        "(line 836,col 5)-(line 836,col 28)",
        "(line 837,col 5)-(line 837,col 46)",
        "(line 838,col 5)-(line 838,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEnumRAI2()",
      "begin_line": 841,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 842,col 5)-(line 842,col 78)",
        "(line 843,col 5)-(line 843,col 28)",
        "(line 844,col 5)-(line 844,col 65)",
        "(line 845,col 5)-(line 845,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEnumRAI3()",
      "begin_line": 848,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 849,col 5)-(line 849,col 78)",
        "(line 850,col 5)-(line 850,col 28)",
        "(line 851,col 5)-(line 851,col 70)",
        "(line 852,col 5)-(line 852,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEnumRAI4()",
      "begin_line": 855,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 856,col 5)-(line 857,col 69)",
        "(line 858,col 5)-(line 858,col 28)",
        "(line 859,col 5)-(line 859,col 65)",
        "(line 860,col 5)-(line 860,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testShortCircuitingAnd()",
      "begin_line": 863,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 864,col 5)-(line 864,col 31)",
        "(line 865,col 5)-(line 865,col 54)",
        "(line 866,col 5)-(line 866,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testShortCircuitingAnd2()",
      "begin_line": 869,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 870,col 5)-(line 870,col 31)",
        "(line 871,col 5)-(line 871,col 72)",
        "(line 872,col 5)-(line 872,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testShortCircuitingOr()",
      "begin_line": 875,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 876,col 5)-(line 876,col 31)",
        "(line 877,col 5)-(line 877,col 54)",
        "(line 878,col 5)-(line 878,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testShortCircuitingOr2()",
      "begin_line": 881,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 882,col 5)-(line 882,col 31)",
        "(line 883,col 5)-(line 883,col 72)",
        "(line 884,col 5)-(line 884,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssignInCondition()",
      "begin_line": 887,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 888,col 5)-(line 888,col 51)",
        "(line 889,col 5)-(line 889,col 50)",
        "(line 890,col 5)-(line 890,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf1()",
      "begin_line": 893,
      "end_line": 897,
      "comment": "",
      "child_ranges": [
        "(line 894,col 5)-(line 894,col 31)",
        "(line 895,col 5)-(line 895,col 64)",
        "(line 896,col 5)-(line 896,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf2()",
      "begin_line": 899,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 900,col 5)-(line 900,col 51)",
        "(line 901,col 5)-(line 901,col 61)",
        "(line 902,col 5)-(line 902,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf3()",
      "begin_line": 905,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 906,col 5)-(line 906,col 75)",
        "(line 907,col 5)-(line 907,col 64)",
        "(line 908,col 5)-(line 908,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf4()",
      "begin_line": 911,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 912,col 5)-(line 912,col 75)",
        "(line 913,col 5)-(line 913,col 70)",
        "(line 914,col 5)-(line 914,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf5()",
      "begin_line": 917,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 918,col 5)-(line 918,col 31)",
        "(line 919,col 5)-(line 919,col 70)",
        "(line 920,col 5)-(line 920,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf6()",
      "begin_line": 923,
      "end_line": 936,
      "comment": "",
      "child_ranges": [
        "(line 931,col 5)-(line 931,col 60)",
        "(line 932,col 5)-(line 932,col 29)",
        "(line 933,col 5)-(line 933,col 63)",
        "(line 934,col 5)-(line 934,col 30)",
        "(line 935,col 5)-(line 935,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFlattening()",
      "begin_line": 938,
      "end_line": 963,
      "comment": "",
      "child_ranges": [
        "(line 939,col 5)-(line 941,col 5)",
        "(line 942,col 5)-(line 942,col 45)",
        "(line 943,col 5)-(line 943,col 45)",
        "(line 944,col 5)-(line 944,col 28)",
        "(line 945,col 5)-(line 949,col 5)",
        "(line 950,col 5)-(line 950,col 30)",
        "(line 951,col 5)-(line 955,col 5)",
        "(line 956,col 5)-(line 956,col 21)",
        "(line 957,col 5)-(line 957,col 70)",
        "(line 958,col 5)-(line 958,col 32)",
        "(line 960,col 5)-(line 962,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testUnary()",
      "begin_line": 965,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 966,col 5)-(line 966,col 31)",
        "(line 967,col 5)-(line 967,col 30)",
        "(line 968,col 5)-(line 968,col 29)",
        "(line 969,col 5)-(line 969,col 30)",
        "(line 970,col 5)-(line 970,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAdd1()",
      "begin_line": 973,
      "end_line": 977,
      "comment": "",
      "child_ranges": [
        "(line 974,col 5)-(line 974,col 31)",
        "(line 975,col 5)-(line 975,col 33)",
        "(line 976,col 5)-(line 976,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAdd2()",
      "begin_line": 979,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 980,col 5)-(line 980,col 31)",
        "(line 981,col 5)-(line 981,col 35)",
        "(line 982,col 5)-(line 982,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAdd3()",
      "begin_line": 985,
      "end_line": 989,
      "comment": "",
      "child_ranges": [
        "(line 986,col 5)-(line 986,col 31)",
        "(line 987,col 5)-(line 987,col 35)",
        "(line 988,col 5)-(line 988,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssignAdd()",
      "begin_line": 991,
      "end_line": 995,
      "comment": "",
      "child_ranges": [
        "(line 992,col 5)-(line 992,col 31)",
        "(line 993,col 5)-(line 993,col 28)",
        "(line 994,col 5)-(line 994,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testComparison()",
      "begin_line": 997,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 998,col 5)-(line 998,col 54)",
        "(line 999,col 5)-(line 999,col 29)",
        "(line 1000,col 5)-(line 1000,col 54)",
        "(line 1001,col 5)-(line 1001,col 29)",
        "(line 1002,col 5)-(line 1002,col 55)",
        "(line 1003,col 5)-(line 1003,col 29)",
        "(line 1004,col 5)-(line 1004,col 55)",
        "(line 1005,col 5)-(line 1005,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testThrownExpression()",
      "begin_line": 1008,
      "end_line": 1012,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 5)-(line 1010,col 66)",
        "(line 1011,col 5)-(line 1011,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testObjectLit()",
      "begin_line": 1014,
      "end_line": 1042,
      "comment": "",
      "child_ranges": [
        "(line 1015,col 5)-(line 1015,col 45)",
        "(line 1016,col 5)-(line 1016,col 32)",
        "(line 1018,col 5)-(line 1018,col 48)",
        "(line 1019,col 5)-(line 1019,col 31)",
        "(line 1021,col 5)-(line 1021,col 80)",
        "(line 1022,col 5)-(line 1022,col 31)",
        "(line 1023,col 5)-(line 1023,col 32)",
        "(line 1025,col 5)-(line 1025,col 65)",
        "(line 1026,col 5)-(line 1026,col 32)",
        "(line 1028,col 5)-(line 1032,col 26)",
        "(line 1033,col 5)-(line 1033,col 31)",
        "(line 1035,col 5)-(line 1035,col 58)",
        "(line 1036,col 5)-(line 1036,col 32)",
        "(line 1038,col 5)-(line 1040,col 30)",
        "(line 1041,col 5)-(line 1041,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCast1()",
      "begin_line": 1044,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1045,col 5)-(line 1045,col 56)",
        "(line 1046,col 5)-(line 1046,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCast2()",
      "begin_line": 1049,
      "end_line": 1060,
      "comment": "",
      "child_ranges": [
        "(line 1050,col 5)-(line 1053,col 56)",
        "(line 1054,col 5)-(line 1059,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testBackwardsInferenceCall()",
      "begin_line": 1062,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1063,col 5)-(line 1067,col 17)",
        "(line 1069,col 5)-(line 1069,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testBackwardsInferenceNew()",
      "begin_line": 1072,
      "end_line": 1083,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 5)-(line 1080,col 21)",
        "(line 1082,col 5)-(line 1082,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testNoThisInference()",
      "begin_line": 1085,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1086,col 5)-(line 1086,col 54)",
        "(line 1087,col 5)-(line 1087,col 31)",
        "(line 1088,col 5)-(line 1088,col 66)",
        "(line 1089,col 5)-(line 1089,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testRecordInference()",
      "begin_line": 1092,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 5)-(line 1097,col 19)",
        "(line 1098,col 5)-(line 1099,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIssue785()",
      "begin_line": 1102,
      "end_line": 1108,
      "comment": "",
      "child_ranges": [
        "(line 1103,col 5)-(line 1106,col 26)",
        "(line 1107,col 5)-(line 1107,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertTypeofProp()",
      "begin_line": 1110,
      "end_line": 1116,
      "comment": "",
      "child_ranges": [
        "(line 1111,col 5)-(line 1111,col 51)",
        "(line 1112,col 5)-(line 1114,col 25)",
        "(line 1115,col 5)-(line 1115,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1118,
      "end_line": 1120,
      "comment": "",
      "child_ranges": [
        "(line 1119,col 5)-(line 1119,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1122,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1123,col 5)-(line 1123,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.templatize(com.google.javascript.rhino.jstype.ObjectType, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1126,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1127,col 5)-(line 1127,col 54)"
      ]
    }
  ]
}