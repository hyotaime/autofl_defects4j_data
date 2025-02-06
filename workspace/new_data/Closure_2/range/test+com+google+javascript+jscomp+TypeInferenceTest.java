{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/TypeInferenceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeInferenceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 59,
      "end_line": 1091,
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
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.getNoResolvedType()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createNullableType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createNullableType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 188,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssumption()",
      "begin_line": 191,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 31)",
        "(line 193,col 5)-(line 193,col 19)",
        "(line 194,col 5)-(line 194,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testVar()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 29)",
        "(line 199,col 5)-(line 199,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEmptyVar()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 25)",
        "(line 204,col 5)-(line 204,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssignment()",
      "begin_line": 207,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 31)",
        "(line 209,col 5)-(line 209,col 25)",
        "(line 210,col 5)-(line 210,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testExprWithinCast()",
      "begin_line": 213,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 31)",
        "(line 215,col 5)-(line 215,col 49)",
        "(line 216,col 5)-(line 216,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testGetProp()",
      "begin_line": 219,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 51)",
        "(line 221,col 5)-(line 221,col 25)",
        "(line 222,col 5)-(line 222,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testGetElemDereference()",
      "begin_line": 225,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 226,col 54)",
        "(line 227,col 5)-(line 227,col 30)",
        "(line 228,col 5)-(line 228,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIf1()",
      "begin_line": 231,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 51)",
        "(line 233,col 5)-(line 233,col 48)",
        "(line 234,col 5)-(line 234,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIf1a()",
      "begin_line": 237,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 51)",
        "(line 239,col 5)-(line 239,col 56)",
        "(line 240,col 5)-(line 240,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIf2()",
      "begin_line": 243,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 51)",
        "(line 245,col 5)-(line 245,col 64)",
        "(line 246,col 5)-(line 246,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIf3()",
      "begin_line": 249,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 51)",
        "(line 251,col 5)-(line 251,col 47)",
        "(line 252,col 5)-(line 252,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testPropertyInference1()",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 67)",
        "(line 257,col 5)-(line 258,col 50)",
        "(line 259,col 5)-(line 259,col 31)",
        "(line 260,col 5)-(line 260,col 61)",
        "(line 261,col 5)-(line 261,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testPropertyInference2()",
      "begin_line": 264,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 67)",
        "(line 266,col 5)-(line 267,col 50)",
        "(line 268,col 5)-(line 268,col 31)",
        "(line 269,col 5)-(line 269,col 59)",
        "(line 270,col 5)-(line 270,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testPropertyInference3()",
      "begin_line": 273,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 67)",
        "(line 275,col 5)-(line 276,col 50)",
        "(line 277,col 5)-(line 277,col 31)",
        "(line 278,col 5)-(line 278,col 57)",
        "(line 279,col 5)-(line 279,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert1()",
      "begin_line": 282,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 55)",
        "(line 284,col 5)-(line 284,col 29)",
        "(line 285,col 5)-(line 285,col 62)",
        "(line 286,col 5)-(line 286,col 30)",
        "(line 287,col 5)-(line 287,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert1a()",
      "begin_line": 290,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 291,col 55)",
        "(line 292,col 5)-(line 292,col 29)",
        "(line 293,col 5)-(line 293,col 71)",
        "(line 294,col 5)-(line 294,col 30)",
        "(line 295,col 5)-(line 295,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert2()",
      "begin_line": 298,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 55)",
        "(line 300,col 5)-(line 300,col 29)",
        "(line 301,col 5)-(line 301,col 55)",
        "(line 302,col 5)-(line 302,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert3()",
      "begin_line": 305,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 306,col 55)",
        "(line 307,col 5)-(line 307,col 29)",
        "(line 308,col 5)-(line 308,col 29)",
        "(line 309,col 5)-(line 309,col 77)",
        "(line 310,col 5)-(line 310,col 30)",
        "(line 311,col 5)-(line 311,col 32)",
        "(line 312,col 5)-(line 312,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert4()",
      "begin_line": 315,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 316,col 5)-(line 316,col 55)",
        "(line 317,col 5)-(line 317,col 29)",
        "(line 318,col 5)-(line 318,col 29)",
        "(line 319,col 5)-(line 319,col 78)",
        "(line 320,col 5)-(line 320,col 30)",
        "(line 321,col 5)-(line 321,col 32)",
        "(line 322,col 5)-(line 322,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert5()",
      "begin_line": 325,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 55)",
        "(line 327,col 5)-(line 327,col 29)",
        "(line 328,col 5)-(line 328,col 29)",
        "(line 329,col 5)-(line 329,col 67)",
        "(line 330,col 5)-(line 330,col 30)",
        "(line 331,col 5)-(line 331,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert6()",
      "begin_line": 334,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 55)",
        "(line 336,col 5)-(line 336,col 31)",
        "(line 337,col 5)-(line 337,col 68)",
        "(line 338,col 5)-(line 338,col 30)",
        "(line 339,col 5)-(line 339,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert7()",
      "begin_line": 342,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 343,col 5)-(line 343,col 55)",
        "(line 344,col 5)-(line 344,col 29)",
        "(line 345,col 5)-(line 345,col 59)",
        "(line 346,col 5)-(line 346,col 30)",
        "(line 347,col 5)-(line 347,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert8()",
      "begin_line": 350,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 55)",
        "(line 352,col 5)-(line 352,col 29)",
        "(line 353,col 5)-(line 353,col 67)",
        "(line 354,col 5)-(line 354,col 30)",
        "(line 355,col 5)-(line 355,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert9()",
      "begin_line": 358,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 55)",
        "(line 360,col 5)-(line 360,col 29)",
        "(line 361,col 5)-(line 361,col 63)",
        "(line 362,col 5)-(line 362,col 30)",
        "(line 363,col 5)-(line 363,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssert10()",
      "begin_line": 366,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 55)",
        "(line 368,col 5)-(line 368,col 29)",
        "(line 369,col 5)-(line 369,col 29)",
        "(line 370,col 5)-(line 370,col 74)",
        "(line 371,col 5)-(line 371,col 30)",
        "(line 372,col 5)-(line 372,col 32)",
        "(line 373,col 5)-(line 373,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertNumber()",
      "begin_line": 376,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 377,col 5)-(line 377,col 52)",
        "(line 378,col 5)-(line 378,col 29)",
        "(line 379,col 5)-(line 379,col 68)",
        "(line 380,col 5)-(line 380,col 30)",
        "(line 381,col 5)-(line 381,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertNumber2()",
      "begin_line": 384,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 52)",
        "(line 387,col 5)-(line 387,col 29)",
        "(line 388,col 5)-(line 388,col 62)",
        "(line 389,col 5)-(line 389,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertNumber3()",
      "begin_line": 392,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 394,col 5)-(line 394,col 52)",
        "(line 395,col 5)-(line 395,col 29)",
        "(line 396,col 5)-(line 396,col 69)",
        "(line 397,col 5)-(line 397,col 30)",
        "(line 398,col 5)-(line 398,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertString()",
      "begin_line": 401,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 402,col 5)-(line 402,col 52)",
        "(line 403,col 5)-(line 403,col 29)",
        "(line 404,col 5)-(line 404,col 68)",
        "(line 405,col 5)-(line 405,col 30)",
        "(line 406,col 5)-(line 406,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertFunction()",
      "begin_line": 409,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 410,col 5)-(line 410,col 52)",
        "(line 411,col 5)-(line 411,col 29)",
        "(line 412,col 5)-(line 412,col 70)",
        "(line 413,col 5)-(line 413,col 30)",
        "(line 414,col 5)-(line 414,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject()",
      "begin_line": 417,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 418,col 5)-(line 418,col 52)",
        "(line 419,col 5)-(line 419,col 29)",
        "(line 420,col 5)-(line 420,col 68)",
        "(line 421,col 5)-(line 421,col 30)",
        "(line 422,col 5)-(line 422,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject2()",
      "begin_line": 425,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 426,col 5)-(line 426,col 54)",
        "(line 427,col 5)-(line 427,col 29)",
        "(line 428,col 5)-(line 428,col 68)",
        "(line 429,col 5)-(line 429,col 30)",
        "(line 430,col 5)-(line 430,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject3()",
      "begin_line": 433,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 434,col 55)",
        "(line 435,col 5)-(line 435,col 31)",
        "(line 436,col 5)-(line 436,col 74)",
        "(line 437,col 5)-(line 437,col 30)",
        "(line 438,col 5)-(line 438,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject4()",
      "begin_line": 441,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 442,col 5)-(line 442,col 54)",
        "(line 443,col 5)-(line 443,col 29)",
        "(line 444,col 5)-(line 444,col 65)",
        "(line 445,col 5)-(line 445,col 30)",
        "(line 446,col 5)-(line 446,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertObject5()",
      "begin_line": 449,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 52)",
        "(line 451,col 5)-(line 451,col 29)",
        "(line 452,col 5)-(line 454,col 72)",
        "(line 455,col 5)-(line 455,col 30)",
        "(line 456,col 5)-(line 456,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertArray()",
      "begin_line": 459,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 52)",
        "(line 461,col 5)-(line 461,col 29)",
        "(line 462,col 5)-(line 462,col 67)",
        "(line 463,col 5)-(line 463,col 30)",
        "(line 464,col 5)-(line 464,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof1()",
      "begin_line": 467,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 468,col 5)-(line 468,col 52)",
        "(line 469,col 5)-(line 469,col 29)",
        "(line 470,col 5)-(line 470,col 72)",
        "(line 471,col 5)-(line 471,col 30)",
        "(line 472,col 5)-(line 472,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof2()",
      "begin_line": 475,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 476,col 5)-(line 476,col 52)",
        "(line 477,col 5)-(line 477,col 29)",
        "(line 478,col 5)-(line 478,col 80)",
        "(line 479,col 5)-(line 479,col 30)",
        "(line 480,col 5)-(line 480,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof3()",
      "begin_line": 483,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 484,col 5)-(line 484,col 60)",
        "(line 485,col 5)-(line 485,col 29)",
        "(line 486,col 5)-(line 486,col 80)",
        "(line 487,col 5)-(line 487,col 30)",
        "(line 488,col 5)-(line 488,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof4()",
      "begin_line": 491,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 66)",
        "(line 493,col 5)-(line 493,col 29)",
        "(line 494,col 5)-(line 494,col 80)",
        "(line 495,col 5)-(line 495,col 30)",
        "(line 496,col 5)-(line 496,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertInstanceof5()",
      "begin_line": 499,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 500,col 5)-(line 500,col 56)",
        "(line 501,col 5)-(line 501,col 29)",
        "(line 502,col 5)-(line 503,col 74)",
        "(line 504,col 5)-(line 504,col 30)",
        "(line 505,col 5)-(line 505,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertWithIsDefAndNotNull()",
      "begin_line": 508,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 509,col 5)-(line 509,col 55)",
        "(line 510,col 5)-(line 510,col 29)",
        "(line 511,col 5)-(line 514,col 21)",
        "(line 515,col 5)-(line 515,col 30)",
        "(line 516,col 5)-(line 516,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIsDefAndNoResolvedType()",
      "begin_line": 519,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 520,col 5)-(line 520,col 63)",
        "(line 521,col 5)-(line 521,col 29)",
        "(line 522,col 5)-(line 526,col 44)",
        "(line 527,col 5)-(line 527,col 30)",
        "(line 528,col 5)-(line 528,col 38)",
        "(line 529,col 5)-(line 529,col 42)",
        "(line 530,col 5)-(line 530,col 38)",
        "(line 531,col 5)-(line 531,col 30)",
        "(line 532,col 5)-(line 532,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertWithNotIsNull()",
      "begin_line": 535,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 536,col 5)-(line 536,col 55)",
        "(line 537,col 5)-(line 537,col 29)",
        "(line 538,col 5)-(line 541,col 21)",
        "(line 542,col 5)-(line 542,col 30)",
        "(line 543,col 5)-(line 543,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testReturn1()",
      "begin_line": 546,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 547,col 5)-(line 547,col 51)",
        "(line 548,col 5)-(line 548,col 59)",
        "(line 549,col 5)-(line 549,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testReturn2()",
      "begin_line": 552,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 553,col 5)-(line 553,col 51)",
        "(line 554,col 5)-(line 554,col 48)",
        "(line 555,col 5)-(line 555,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testWhile1()",
      "begin_line": 558,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 559,col 5)-(line 559,col 51)",
        "(line 560,col 5)-(line 560,col 75)",
        "(line 561,col 5)-(line 561,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testWhile2()",
      "begin_line": 564,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 565,col 5)-(line 565,col 51)",
        "(line 566,col 5)-(line 566,col 41)",
        "(line 567,col 5)-(line 567,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testDo()",
      "begin_line": 570,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 571,col 5)-(line 571,col 51)",
        "(line 572,col 5)-(line 572,col 44)",
        "(line 573,col 5)-(line 573,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor1()",
      "begin_line": 576,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 577,col 5)-(line 577,col 31)",
        "(line 578,col 5)-(line 578,col 76)",
        "(line 579,col 5)-(line 579,col 49)",
        "(line 580,col 5)-(line 580,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor2()",
      "begin_line": 583,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 584,col 5)-(line 584,col 31)",
        "(line 585,col 5)-(line 585,col 70)",
        "(line 586,col 5)-(line 586,col 49)",
        "(line 587,col 5)-(line 587,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor3()",
      "begin_line": 590,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 591,col 5)-(line 591,col 31)",
        "(line 592,col 5)-(line 592,col 74)",
        "(line 593,col 5)-(line 593,col 49)",
        "(line 594,col 5)-(line 594,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor4()",
      "begin_line": 597,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 598,col 5)-(line 598,col 51)",
        "(line 599,col 5)-(line 600,col 69)",
        "(line 601,col 5)-(line 601,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor5()",
      "begin_line": 604,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 605,col 5)-(line 606,col 70)",
        "(line 607,col 5)-(line 608,col 74)",
        "(line 609,col 5)-(line 609,col 49)",
        "(line 610,col 5)-(line 610,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFor6()",
      "begin_line": 613,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 614,col 5)-(line 614,col 51)",
        "(line 615,col 5)-(line 619,col 13)",
        "(line 620,col 5)-(line 620,col 45)",
        "(line 621,col 5)-(line 621,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testSwitch1()",
      "begin_line": 624,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 625,col 5)-(line 625,col 31)",
        "(line 626,col 5)-(line 630,col 28)",
        "(line 631,col 5)-(line 631,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testSwitch2()",
      "begin_line": 634,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 635,col 5)-(line 635,col 28)",
        "(line 636,col 5)-(line 642,col 13)",
        "(line 643,col 5)-(line 643,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testSwitch3()",
      "begin_line": 646,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 647,col 5)-(line 648,col 71)",
        "(line 649,col 5)-(line 658,col 13)",
        "(line 659,col 5)-(line 659,col 29)",
        "(line 660,col 5)-(line 660,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testSwitch4()",
      "begin_line": 663,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 664,col 5)-(line 664,col 28)",
        "(line 665,col 5)-(line 672,col 15)",
        "(line 673,col 5)-(line 673,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCall1()",
      "begin_line": 676,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 677,col 5)-(line 679,col 79)",
        "(line 680,col 5)-(line 680,col 31)",
        "(line 681,col 5)-(line 681,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testNew1()",
      "begin_line": 684,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 685,col 5)-(line 687,col 72)",
        "(line 688,col 5)-(line 688,col 35)",
        "(line 689,col 5)-(line 689,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInnerFunction1()",
      "begin_line": 692,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 693,col 5)-(line 693,col 57)",
        "(line 694,col 5)-(line 694,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInnerFunction2()",
      "begin_line": 697,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 698,col 5)-(line 698,col 63)",
        "(line 699,col 5)-(line 699,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testHook()",
      "begin_line": 702,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 703,col 5)-(line 703,col 51)",
        "(line 704,col 5)-(line 704,col 38)",
        "(line 705,col 5)-(line 705,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testThrow()",
      "begin_line": 708,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 709,col 5)-(line 709,col 51)",
        "(line 710,col 5)-(line 712,col 18)",
        "(line 713,col 5)-(line 713,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testTry1()",
      "begin_line": 716,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 717,col 5)-(line 717,col 31)",
        "(line 718,col 5)-(line 718,col 69)",
        "(line 719,col 5)-(line 719,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testTry2()",
      "begin_line": 722,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 723,col 5)-(line 723,col 31)",
        "(line 724,col 5)-(line 725,col 63)",
        "(line 726,col 5)-(line 726,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testTry3()",
      "begin_line": 729,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 730,col 5)-(line 730,col 31)",
        "(line 731,col 5)-(line 731,col 61)",
        "(line 732,col 5)-(line 732,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCatch1()",
      "begin_line": 735,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 736,col 5)-(line 736,col 68)",
        "(line 737,col 5)-(line 737,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCatch2()",
      "begin_line": 740,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 741,col 5)-(line 741,col 79)",
        "(line 742,col 5)-(line 742,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testUnknownType1()",
      "begin_line": 745,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 746,col 5)-(line 746,col 36)",
        "(line 747,col 5)-(line 747,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testUnknownType2()",
      "begin_line": 750,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 751,col 5)-(line 751,col 30)",
        "(line 752,col 5)-(line 752,col 39)",
        "(line 753,col 5)-(line 753,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInfiniteLoop1()",
      "begin_line": 756,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 757,col 5)-(line 757,col 51)",
        "(line 758,col 5)-(line 758,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInfiniteLoop2()",
      "begin_line": 761,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 762,col 5)-(line 762,col 51)",
        "(line 763,col 5)-(line 763,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testJoin1()",
      "begin_line": 766,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 767,col 5)-(line 767,col 68)",
        "(line 768,col 5)-(line 768,col 32)",
        "(line 769,col 5)-(line 769,col 45)",
        "(line 770,col 5)-(line 770,col 66)",
        "(line 771,col 5)-(line 771,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testJoin2()",
      "begin_line": 774,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 775,col 5)-(line 775,col 68)",
        "(line 776,col 5)-(line 776,col 32)",
        "(line 777,col 5)-(line 777,col 45)",
        "(line 778,col 5)-(line 778,col 66)",
        "(line 779,col 5)-(line 779,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testArrayLit()",
      "begin_line": 782,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 783,col 5)-(line 783,col 51)",
        "(line 784,col 5)-(line 784,col 53)",
        "(line 785,col 5)-(line 785,col 56)",
        "(line 786,col 5)-(line 786,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testGetElem()",
      "begin_line": 789,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 790,col 5)-(line 790,col 51)",
        "(line 791,col 5)-(line 791,col 54)",
        "(line 792,col 5)-(line 792,col 30)",
        "(line 793,col 5)-(line 793,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEnumRAI1()",
      "begin_line": 796,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 797,col 5)-(line 797,col 77)",
        "(line 798,col 5)-(line 798,col 28)",
        "(line 799,col 5)-(line 799,col 46)",
        "(line 800,col 5)-(line 800,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEnumRAI2()",
      "begin_line": 803,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 804,col 5)-(line 804,col 78)",
        "(line 805,col 5)-(line 805,col 28)",
        "(line 806,col 5)-(line 806,col 65)",
        "(line 807,col 5)-(line 807,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEnumRAI3()",
      "begin_line": 810,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 811,col 5)-(line 811,col 78)",
        "(line 812,col 5)-(line 812,col 28)",
        "(line 813,col 5)-(line 813,col 70)",
        "(line 814,col 5)-(line 814,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testEnumRAI4()",
      "begin_line": 817,
      "end_line": 823,
      "comment": "",
      "child_ranges": [
        "(line 818,col 5)-(line 819,col 69)",
        "(line 820,col 5)-(line 820,col 28)",
        "(line 821,col 5)-(line 821,col 65)",
        "(line 822,col 5)-(line 822,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testShortCircuitingAnd()",
      "begin_line": 825,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 826,col 5)-(line 826,col 31)",
        "(line 827,col 5)-(line 827,col 54)",
        "(line 828,col 5)-(line 828,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testShortCircuitingAnd2()",
      "begin_line": 831,
      "end_line": 835,
      "comment": "",
      "child_ranges": [
        "(line 832,col 5)-(line 832,col 31)",
        "(line 833,col 5)-(line 833,col 72)",
        "(line 834,col 5)-(line 834,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testShortCircuitingOr()",
      "begin_line": 837,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 838,col 5)-(line 838,col 31)",
        "(line 839,col 5)-(line 839,col 54)",
        "(line 840,col 5)-(line 840,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testShortCircuitingOr2()",
      "begin_line": 843,
      "end_line": 847,
      "comment": "",
      "child_ranges": [
        "(line 844,col 5)-(line 844,col 31)",
        "(line 845,col 5)-(line 845,col 72)",
        "(line 846,col 5)-(line 846,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssignInCondition()",
      "begin_line": 849,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 850,col 5)-(line 850,col 51)",
        "(line 851,col 5)-(line 851,col 50)",
        "(line 852,col 5)-(line 852,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf1()",
      "begin_line": 855,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 856,col 5)-(line 856,col 31)",
        "(line 857,col 5)-(line 857,col 64)",
        "(line 858,col 5)-(line 858,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf2()",
      "begin_line": 861,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 862,col 5)-(line 862,col 51)",
        "(line 863,col 5)-(line 863,col 61)",
        "(line 864,col 5)-(line 864,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf3()",
      "begin_line": 867,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 868,col 5)-(line 868,col 75)",
        "(line 869,col 5)-(line 869,col 64)",
        "(line 870,col 5)-(line 870,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf4()",
      "begin_line": 873,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 874,col 5)-(line 874,col 75)",
        "(line 875,col 5)-(line 875,col 70)",
        "(line 876,col 5)-(line 876,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf5()",
      "begin_line": 879,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 880,col 5)-(line 880,col 31)",
        "(line 881,col 5)-(line 881,col 70)",
        "(line 882,col 5)-(line 882,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testInstanceOf6()",
      "begin_line": 885,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 893,col 5)-(line 893,col 60)",
        "(line 894,col 5)-(line 894,col 29)",
        "(line 895,col 5)-(line 895,col 63)",
        "(line 896,col 5)-(line 896,col 30)",
        "(line 897,col 5)-(line 897,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testFlattening()",
      "begin_line": 900,
      "end_line": 925,
      "comment": "",
      "child_ranges": [
        "(line 901,col 5)-(line 903,col 5)",
        "(line 904,col 5)-(line 904,col 45)",
        "(line 905,col 5)-(line 905,col 45)",
        "(line 906,col 5)-(line 906,col 28)",
        "(line 907,col 5)-(line 911,col 5)",
        "(line 912,col 5)-(line 912,col 30)",
        "(line 913,col 5)-(line 917,col 5)",
        "(line 918,col 5)-(line 918,col 21)",
        "(line 919,col 5)-(line 919,col 70)",
        "(line 920,col 5)-(line 920,col 32)",
        "(line 922,col 5)-(line 924,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testUnary()",
      "begin_line": 927,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 928,col 5)-(line 928,col 31)",
        "(line 929,col 5)-(line 929,col 30)",
        "(line 930,col 5)-(line 930,col 29)",
        "(line 931,col 5)-(line 931,col 30)",
        "(line 932,col 5)-(line 932,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAdd1()",
      "begin_line": 935,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 936,col 5)-(line 936,col 31)",
        "(line 937,col 5)-(line 937,col 33)",
        "(line 938,col 5)-(line 938,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAdd2()",
      "begin_line": 941,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 942,col 5)-(line 942,col 31)",
        "(line 943,col 5)-(line 943,col 35)",
        "(line 944,col 5)-(line 944,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAdd3()",
      "begin_line": 947,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 948,col 5)-(line 948,col 31)",
        "(line 949,col 5)-(line 949,col 35)",
        "(line 950,col 5)-(line 950,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssignAdd()",
      "begin_line": 953,
      "end_line": 957,
      "comment": "",
      "child_ranges": [
        "(line 954,col 5)-(line 954,col 31)",
        "(line 955,col 5)-(line 955,col 28)",
        "(line 956,col 5)-(line 956,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testComparison()",
      "begin_line": 959,
      "end_line": 968,
      "comment": "",
      "child_ranges": [
        "(line 960,col 5)-(line 960,col 54)",
        "(line 961,col 5)-(line 961,col 29)",
        "(line 962,col 5)-(line 962,col 54)",
        "(line 963,col 5)-(line 963,col 29)",
        "(line 964,col 5)-(line 964,col 55)",
        "(line 965,col 5)-(line 965,col 29)",
        "(line 966,col 5)-(line 966,col 55)",
        "(line 967,col 5)-(line 967,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testThrownExpression()",
      "begin_line": 970,
      "end_line": 974,
      "comment": "",
      "child_ranges": [
        "(line 971,col 5)-(line 972,col 66)",
        "(line 973,col 5)-(line 973,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testObjectLit()",
      "begin_line": 976,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 977,col 5)-(line 977,col 45)",
        "(line 978,col 5)-(line 978,col 32)",
        "(line 980,col 5)-(line 980,col 48)",
        "(line 981,col 5)-(line 981,col 31)",
        "(line 983,col 5)-(line 983,col 80)",
        "(line 984,col 5)-(line 984,col 31)",
        "(line 985,col 5)-(line 985,col 32)",
        "(line 987,col 5)-(line 987,col 65)",
        "(line 988,col 5)-(line 988,col 32)",
        "(line 990,col 5)-(line 994,col 26)",
        "(line 995,col 5)-(line 995,col 31)",
        "(line 997,col 5)-(line 997,col 58)",
        "(line 998,col 5)-(line 998,col 32)",
        "(line 1000,col 5)-(line 1002,col 30)",
        "(line 1003,col 5)-(line 1003,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCast1()",
      "begin_line": 1006,
      "end_line": 1009,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 5)-(line 1007,col 56)",
        "(line 1008,col 5)-(line 1008,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testCast2()",
      "begin_line": 1011,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 5)-(line 1015,col 56)",
        "(line 1016,col 5)-(line 1021,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testBackwardsInferenceCall()",
      "begin_line": 1024,
      "end_line": 1032,
      "comment": "",
      "child_ranges": [
        "(line 1025,col 5)-(line 1029,col 17)",
        "(line 1031,col 5)-(line 1031,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testBackwardsInferenceNew()",
      "begin_line": 1034,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1035,col 5)-(line 1042,col 21)",
        "(line 1044,col 5)-(line 1044,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testNoThisInference()",
      "begin_line": 1047,
      "end_line": 1052,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 5)-(line 1048,col 54)",
        "(line 1049,col 5)-(line 1049,col 31)",
        "(line 1050,col 5)-(line 1050,col 66)",
        "(line 1051,col 5)-(line 1051,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testRecordInference()",
      "begin_line": 1054,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 5)-(line 1059,col 19)",
        "(line 1060,col 5)-(line 1061,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testIssue785()",
      "begin_line": 1064,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 5)-(line 1068,col 26)",
        "(line 1069,col 5)-(line 1069,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.testAssertTypeofProp()",
      "begin_line": 1072,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 5)-(line 1073,col 51)",
        "(line 1074,col 5)-(line 1076,col 25)",
        "(line 1077,col 5)-(line 1077,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1081,col 5)-(line 1081,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1084,
      "end_line": 1086,
      "comment": "",
      "child_ranges": [
        "(line 1085,col 5)-(line 1085,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferenceTest.parameterize(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1089,col 5)-(line 1089,col 56)"
      ]
    }
  ]
}