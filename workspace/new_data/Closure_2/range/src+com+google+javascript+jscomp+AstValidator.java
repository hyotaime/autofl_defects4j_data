{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AstValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AstValidator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 28,
      "end_line": 820,
      "comment": "\n * This class walks the AST and validates that the structure is correct.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "class_interface",
      "name": "ViolationHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.ViolationHandler.handleViolation(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "violationHandler"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstValidator.AstValidator(com.google.javascript.jscomp.AstValidator.ViolationHandler)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstValidator.AstValidator()",
      "begin_line": 47,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 54,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.Anonymous-c11e0666-f316-4a6a-ae87-d1fae5efc947.handleViolation(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 52,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 61,col 5)",
        "(line 62,col 5)-(line 64,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateRoot(com.google.javascript.rhino.Node)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 37)",
        "(line 69,col 5)-(line 69,col 27)",
        "(line 70,col 5)-(line 70,col 29)",
        "(line 71,col 5)-(line 71,col 40)",
        "(line 72,col 5)-(line 72,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateCodeRoot(com.google.javascript.rhino.Node)",
      "begin_line": 75,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 37)",
        "(line 77,col 5)-(line 77,col 27)",
        "(line 78,col 5)-(line 80,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateScript(com.google.javascript.rhino.Node)",
      "begin_line": 83,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 38)",
        "(line 85,col 5)-(line 85,col 29)",
        "(line 86,col 5)-(line 86,col 26)",
        "(line 87,col 5)-(line 89,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateStatement(com.google.javascript.rhino.Node)",
      "begin_line": 92,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 151,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateExpression(com.google.javascript.rhino.Node)",
      "begin_line": 154,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 274,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateBlock(com.google.javascript.rhino.Node)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 37)",
        "(line 279,col 5)-(line 281,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateSyntheticBlock(com.google.javascript.rhino.Node)",
      "begin_line": 284,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 37)",
        "(line 286,col 5)-(line 286,col 27)",
        "(line 287,col 5)-(line 289,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateIsSynthetic(com.google.javascript.rhino.Node)",
      "begin_line": 292,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 295,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateHasSourceName(com.google.javascript.rhino.Node)",
      "begin_line": 298,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 46)",
        "(line 300,col 5)-(line 302,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateHasInputId(com.google.javascript.rhino.Node)",
      "begin_line": 305,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 306,col 37)",
        "(line 307,col 5)-(line 309,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateLabel(com.google.javascript.rhino.Node)",
      "begin_line": 312,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 37)",
        "(line 314,col 5)-(line 314,col 29)",
        "(line 315,col 5)-(line 315,col 41)",
        "(line 316,col 5)-(line 316,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateLabelName(com.google.javascript.rhino.Node)",
      "begin_line": 319,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 42)",
        "(line 321,col 5)-(line 321,col 30)",
        "(line 322,col 5)-(line 322,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNonEmptyString(com.google.javascript.rhino.Node)",
      "begin_line": 325,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 29)",
        "(line 327,col 5)-(line 329,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNonNullString(com.google.javascript.rhino.Node)",
      "begin_line": 332,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 333,col 5)-(line 335,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateName(com.google.javascript.rhino.Node)",
      "begin_line": 338,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 36)",
        "(line 340,col 5)-(line 340,col 30)",
        "(line 341,col 5)-(line 341,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateOptionalName(com.google.javascript.rhino.Node)",
      "begin_line": 344,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 36)",
        "(line 346,col 5)-(line 346,col 29)",
        "(line 347,col 5)-(line 347,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateFunctionStatement(com.google.javascript.rhino.Node)",
      "begin_line": 350,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 40)",
        "(line 352,col 5)-(line 352,col 29)",
        "(line 353,col 5)-(line 353,col 36)",
        "(line 354,col 5)-(line 354,col 45)",
        "(line 355,col 5)-(line 355,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateFunctionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 358,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 40)",
        "(line 360,col 5)-(line 360,col 29)",
        "(line 361,col 5)-(line 361,col 44)",
        "(line 362,col 5)-(line 362,col 45)",
        "(line 363,col 5)-(line 363,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateParameters(com.google.javascript.rhino.Node)",
      "begin_line": 366,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 42)",
        "(line 368,col 5)-(line 370,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateCall(com.google.javascript.rhino.Node)",
      "begin_line": 373,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 36)",
        "(line 375,col 5)-(line 375,col 36)",
        "(line 376,col 5)-(line 378,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNew(com.google.javascript.rhino.Node)",
      "begin_line": 381,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 382,col 35)",
        "(line 383,col 5)-(line 383,col 36)",
        "(line 384,col 5)-(line 386,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateVar(com.google.javascript.rhino.Node)",
      "begin_line": 389,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 390,col 35)",
        "(line 391,col 5)-(line 391,col 41)",
        "(line 392,col 5)-(line 401,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateFor(com.google.javascript.rhino.Node)",
      "begin_line": 404,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 405,col 5)-(line 405,col 35)",
        "(line 406,col 5)-(line 406,col 36)",
        "(line 407,col 5)-(line 407,col 36)",
        "(line 408,col 5)-(line 419,col 5)",
        "(line 420,col 5)-(line 420,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateVarOrOptionalExpression(com.google.javascript.rhino.Node)",
      "begin_line": 423,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 424,col 5)-(line 428,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateVarOrAssignmentTarget(com.google.javascript.rhino.Node)",
      "begin_line": 431,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 432,col 5)-(line 438,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateWith(com.google.javascript.rhino.Node)",
      "begin_line": 441,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 442,col 5)-(line 442,col 36)",
        "(line 443,col 5)-(line 443,col 29)",
        "(line 444,col 5)-(line 444,col 42)",
        "(line 445,col 5)-(line 445,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateWhile(com.google.javascript.rhino.Node)",
      "begin_line": 448,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 449,col 5)-(line 449,col 37)",
        "(line 450,col 5)-(line 450,col 29)",
        "(line 451,col 5)-(line 451,col 42)",
        "(line 452,col 5)-(line 452,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateDo(com.google.javascript.rhino.Node)",
      "begin_line": 455,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 456,col 5)-(line 456,col 34)",
        "(line 457,col 5)-(line 457,col 29)",
        "(line 458,col 5)-(line 458,col 37)",
        "(line 459,col 5)-(line 459,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateIf(com.google.javascript.rhino.Node)",
      "begin_line": 462,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 463,col 5)-(line 463,col 34)",
        "(line 464,col 5)-(line 464,col 36)",
        "(line 465,col 5)-(line 465,col 36)",
        "(line 466,col 5)-(line 466,col 42)",
        "(line 467,col 5)-(line 467,col 40)",
        "(line 468,col 5)-(line 470,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateExprStmt(com.google.javascript.rhino.Node)",
      "begin_line": 473,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 474,col 5)-(line 474,col 43)",
        "(line 475,col 5)-(line 475,col 29)",
        "(line 476,col 5)-(line 476,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateReturn(com.google.javascript.rhino.Node)",
      "begin_line": 479,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 480,col 5)-(line 480,col 38)",
        "(line 481,col 5)-(line 481,col 36)",
        "(line 482,col 5)-(line 484,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateThrow(com.google.javascript.rhino.Node)",
      "begin_line": 487,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 488,col 5)-(line 488,col 37)",
        "(line 489,col 5)-(line 489,col 29)",
        "(line 490,col 5)-(line 490,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateBreak(com.google.javascript.rhino.Node)",
      "begin_line": 493,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 494,col 5)-(line 494,col 37)",
        "(line 495,col 5)-(line 495,col 36)",
        "(line 496,col 5)-(line 498,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateContinue(com.google.javascript.rhino.Node)",
      "begin_line": 501,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 502,col 5)-(line 502,col 40)",
        "(line 503,col 5)-(line 503,col 36)",
        "(line 504,col 5)-(line 506,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateTry(com.google.javascript.rhino.Node)",
      "begin_line": 509,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 510,col 5)-(line 510,col 35)",
        "(line 511,col 5)-(line 511,col 36)",
        "(line 512,col 5)-(line 512,col 36)",
        "(line 513,col 5)-(line 513,col 37)",
        "(line 515,col 5)-(line 515,col 39)",
        "(line 518,col 5)-(line 518,col 40)",
        "(line 519,col 5)-(line 519,col 43)",
        "(line 520,col 5)-(line 520,col 42)",
        "(line 521,col 5)-(line 524,col 5)",
        "(line 527,col 5)-(line 530,col 5)",
        "(line 532,col 5)-(line 534,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateCatch(com.google.javascript.rhino.Node)",
      "begin_line": 537,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 37)",
        "(line 539,col 5)-(line 539,col 29)",
        "(line 540,col 5)-(line 540,col 36)",
        "(line 541,col 5)-(line 541,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateSwitch(com.google.javascript.rhino.Node)",
      "begin_line": 544,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 545,col 5)-(line 545,col 38)",
        "(line 546,col 5)-(line 546,col 36)",
        "(line 547,col 5)-(line 547,col 42)",
        "(line 548,col 5)-(line 548,col 21)",
        "(line 549,col 5)-(line 554,col 5)",
        "(line 555,col 5)-(line 558,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateSwitchMember(com.google.javascript.rhino.Node)",
      "begin_line": 561,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 562,col 5)-(line 572,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateDefault(com.google.javascript.rhino.Node)",
      "begin_line": 575,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 576,col 5)-(line 576,col 44)",
        "(line 577,col 5)-(line 577,col 29)",
        "(line 578,col 5)-(line 578,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateCase(com.google.javascript.rhino.Node)",
      "begin_line": 581,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 582,col 5)-(line 582,col 36)",
        "(line 583,col 5)-(line 583,col 29)",
        "(line 584,col 5)-(line 584,col 42)",
        "(line 585,col 5)-(line 585,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateOptionalExpression(com.google.javascript.rhino.Node)",
      "begin_line": 588,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 593,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateChildless(com.google.javascript.rhino.Node)",
      "begin_line": 596,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 597,col 5)-(line 597,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateAssignmentExpression(com.google.javascript.rhino.Node)",
      "begin_line": 600,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 601,col 5)-(line 601,col 29)",
        "(line 602,col 5)-(line 602,col 48)",
        "(line 603,col 5)-(line 603,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateAssignmentTarget(com.google.javascript.rhino.Node)",
      "begin_line": 606,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 607,col 5)-(line 616,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateGetProp(com.google.javascript.rhino.Node)",
      "begin_line": 619,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 620,col 5)-(line 620,col 39)",
        "(line 621,col 5)-(line 621,col 29)",
        "(line 622,col 5)-(line 622,col 42)",
        "(line 623,col 5)-(line 623,col 33)",
        "(line 624,col 5)-(line 624,col 41)",
        "(line 625,col 5)-(line 625,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateRegExpLit(com.google.javascript.rhino.Node)",
      "begin_line": 628,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 629,col 5)-(line 629,col 38)",
        "(line 630,col 5)-(line 630,col 36)",
        "(line 631,col 5)-(line 631,col 36)",
        "(line 632,col 5)-(line 634,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateString(com.google.javascript.rhino.Node)",
      "begin_line": 637,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 38)",
        "(line 639,col 5)-(line 639,col 29)",
        "(line 640,col 5)-(line 645,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNumber(com.google.javascript.rhino.Node)",
      "begin_line": 648,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 649,col 5)-(line 649,col 38)",
        "(line 650,col 5)-(line 650,col 29)",
        "(line 651,col 5)-(line 656,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateArrayLit(com.google.javascript.rhino.Node)",
      "begin_line": 659,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 660,col 5)-(line 660,col 40)",
        "(line 661,col 5)-(line 664,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLit(com.google.javascript.rhino.Node)",
      "begin_line": 667,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 668,col 5)-(line 668,col 41)",
        "(line 669,col 5)-(line 671,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLitKey(com.google.javascript.rhino.Node)",
      "begin_line": 674,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 675,col 5)-(line 688,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLitGetKey(com.google.javascript.rhino.Node)",
      "begin_line": 691,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 692,col 5)-(line 692,col 42)",
        "(line 693,col 5)-(line 693,col 29)",
        "(line 694,col 5)-(line 694,col 36)",
        "(line 695,col 5)-(line 695,col 38)",
        "(line 696,col 5)-(line 696,col 41)",
        "(line 698,col 5)-(line 700,col 5)",
        "(line 701,col 5)-(line 701,col 54)",
        "(line 702,col 5)-(line 704,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLitSetKey(com.google.javascript.rhino.Node)",
      "begin_line": 707,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 708,col 5)-(line 708,col 42)",
        "(line 709,col 5)-(line 709,col 29)",
        "(line 710,col 5)-(line 710,col 36)",
        "(line 711,col 5)-(line 711,col 38)",
        "(line 712,col 5)-(line 712,col 41)",
        "(line 714,col 5)-(line 716,col 5)",
        "(line 717,col 5)-(line 717,col 54)",
        "(line 718,col 5)-(line 720,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLitStringKey(com.google.javascript.rhino.Node)",
      "begin_line": 723,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 724,col 5)-(line 724,col 42)",
        "(line 725,col 5)-(line 725,col 29)",
        "(line 726,col 5)-(line 726,col 36)",
        "(line 727,col 5)-(line 727,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLiteralKeyName(com.google.javascript.rhino.Node)",
      "begin_line": 730,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 731,col 5)-(line 740,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateUnaryOp(com.google.javascript.rhino.Node)",
      "begin_line": 743,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 744,col 5)-(line 744,col 29)",
        "(line 745,col 5)-(line 745,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateBinaryOp(com.google.javascript.rhino.Node)",
      "begin_line": 748,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 749,col 5)-(line 749,col 29)",
        "(line 750,col 5)-(line 750,col 42)",
        "(line 751,col 5)-(line 751,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateTrinaryOp(com.google.javascript.rhino.Node)",
      "begin_line": 754,
      "end_line": 760,
      "comment": "",
      "child_ranges": [
        "(line 755,col 5)-(line 755,col 29)",
        "(line 756,col 5)-(line 756,col 35)",
        "(line 757,col 5)-(line 757,col 30)",
        "(line 758,col 5)-(line 758,col 40)",
        "(line 759,col 5)-(line 759,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.violation(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 762,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 763,col 5)-(line 763,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNodeType(int, com.google.javascript.rhino.Node)",
      "begin_line": 766,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 767,col 5)-(line 771,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateChildCount(com.google.javascript.rhino.Node, int)",
      "begin_line": 774,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 775,col 5)-(line 775,col 26)",
        "(line 776,col 5)-(line 782,col 5)",
        "(line 783,col 5)-(line 787,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateMinimumChildCount(com.google.javascript.rhino.Node, int)",
      "begin_line": 790,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 791,col 5)-(line 791,col 26)",
        "(line 792,col 5)-(line 798,col 5)",
        "(line 800,col 5)-(line 804,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateMaximumChildCount(com.google.javascript.rhino.Node, int)",
      "begin_line": 807,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 808,col 5)-(line 808,col 26)",
        "(line 809,col 5)-(line 813,col 5)",
        "(line 814,col 5)-(line 818,col 5)"
      ]
    }
  ]
}