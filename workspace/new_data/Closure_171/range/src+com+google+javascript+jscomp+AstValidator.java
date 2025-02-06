{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AstValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AstValidator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 28,
      "end_line": 821,
      "comment": "\n * This class walks the AST and validates that the structure is correct.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "class_interface",
      "name": "ViolationHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 40,
      "comment": " Violation handler "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.ViolationHandler.handleViolation(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 39,
      "end_line": 39,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "violationHandler"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstValidator.AstValidator(com.google.javascript.jscomp.AstValidator.ViolationHandler)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstValidator.AstValidator()",
      "begin_line": 48,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 55,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.Anonymous-7acc01ab-76f2-4ef4-a8d1-d769e97f27cc.handleViolation(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 53,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 58,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 62,col 5)",
        "(line 63,col 5)-(line 65,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateRoot(com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 37)",
        "(line 70,col 5)-(line 70,col 27)",
        "(line 71,col 5)-(line 71,col 29)",
        "(line 72,col 5)-(line 72,col 40)",
        "(line 73,col 5)-(line 73,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateCodeRoot(com.google.javascript.rhino.Node)",
      "begin_line": 76,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 37)",
        "(line 78,col 5)-(line 78,col 27)",
        "(line 79,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateScript(com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 38)",
        "(line 86,col 5)-(line 86,col 29)",
        "(line 87,col 5)-(line 87,col 26)",
        "(line 88,col 5)-(line 90,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateStatement(com.google.javascript.rhino.Node)",
      "begin_line": 93,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 152,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateExpression(com.google.javascript.rhino.Node)",
      "begin_line": 155,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 275,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateBlock(com.google.javascript.rhino.Node)",
      "begin_line": 278,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 37)",
        "(line 280,col 5)-(line 282,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateSyntheticBlock(com.google.javascript.rhino.Node)",
      "begin_line": 285,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 37)",
        "(line 287,col 5)-(line 287,col 27)",
        "(line 288,col 5)-(line 290,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateIsSynthetic(com.google.javascript.rhino.Node)",
      "begin_line": 293,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 296,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateHasSourceName(com.google.javascript.rhino.Node)",
      "begin_line": 299,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 46)",
        "(line 301,col 5)-(line 303,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateHasInputId(com.google.javascript.rhino.Node)",
      "begin_line": 306,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 37)",
        "(line 308,col 5)-(line 310,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateLabel(com.google.javascript.rhino.Node)",
      "begin_line": 313,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 314,col 5)-(line 314,col 37)",
        "(line 315,col 5)-(line 315,col 29)",
        "(line 316,col 5)-(line 316,col 41)",
        "(line 317,col 5)-(line 317,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateLabelName(com.google.javascript.rhino.Node)",
      "begin_line": 320,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 42)",
        "(line 322,col 5)-(line 322,col 30)",
        "(line 323,col 5)-(line 323,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNonEmptyString(com.google.javascript.rhino.Node)",
      "begin_line": 326,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 29)",
        "(line 328,col 5)-(line 330,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNonNullString(com.google.javascript.rhino.Node)",
      "begin_line": 333,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 336,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateName(com.google.javascript.rhino.Node)",
      "begin_line": 339,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 36)",
        "(line 341,col 5)-(line 341,col 30)",
        "(line 342,col 5)-(line 342,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateOptionalName(com.google.javascript.rhino.Node)",
      "begin_line": 345,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 36)",
        "(line 347,col 5)-(line 347,col 29)",
        "(line 348,col 5)-(line 348,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateFunctionStatement(com.google.javascript.rhino.Node)",
      "begin_line": 351,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 40)",
        "(line 353,col 5)-(line 353,col 29)",
        "(line 354,col 5)-(line 354,col 36)",
        "(line 355,col 5)-(line 355,col 45)",
        "(line 356,col 5)-(line 356,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateFunctionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 359,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 40)",
        "(line 361,col 5)-(line 361,col 29)",
        "(line 362,col 5)-(line 362,col 44)",
        "(line 363,col 5)-(line 363,col 45)",
        "(line 364,col 5)-(line 364,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateParameters(com.google.javascript.rhino.Node)",
      "begin_line": 367,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 368,col 5)-(line 368,col 42)",
        "(line 369,col 5)-(line 371,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateCall(com.google.javascript.rhino.Node)",
      "begin_line": 374,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 36)",
        "(line 376,col 5)-(line 376,col 36)",
        "(line 377,col 5)-(line 379,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNew(com.google.javascript.rhino.Node)",
      "begin_line": 382,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 383,col 5)-(line 383,col 35)",
        "(line 384,col 5)-(line 384,col 36)",
        "(line 385,col 5)-(line 387,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateVar(com.google.javascript.rhino.Node)",
      "begin_line": 390,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 391,col 5)-(line 391,col 35)",
        "(line 392,col 5)-(line 392,col 41)",
        "(line 393,col 5)-(line 402,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateFor(com.google.javascript.rhino.Node)",
      "begin_line": 405,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 406,col 5)-(line 406,col 35)",
        "(line 407,col 5)-(line 407,col 36)",
        "(line 408,col 5)-(line 408,col 36)",
        "(line 409,col 5)-(line 420,col 5)",
        "(line 421,col 5)-(line 421,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateVarOrOptionalExpression(com.google.javascript.rhino.Node)",
      "begin_line": 424,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 425,col 5)-(line 429,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateVarOrAssignmentTarget(com.google.javascript.rhino.Node)",
      "begin_line": 432,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 433,col 5)-(line 439,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateWith(com.google.javascript.rhino.Node)",
      "begin_line": 442,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 443,col 36)",
        "(line 444,col 5)-(line 444,col 29)",
        "(line 445,col 5)-(line 445,col 42)",
        "(line 446,col 5)-(line 446,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateWhile(com.google.javascript.rhino.Node)",
      "begin_line": 449,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 37)",
        "(line 451,col 5)-(line 451,col 29)",
        "(line 452,col 5)-(line 452,col 42)",
        "(line 453,col 5)-(line 453,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateDo(com.google.javascript.rhino.Node)",
      "begin_line": 456,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 34)",
        "(line 458,col 5)-(line 458,col 29)",
        "(line 459,col 5)-(line 459,col 37)",
        "(line 460,col 5)-(line 460,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateIf(com.google.javascript.rhino.Node)",
      "begin_line": 463,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 464,col 5)-(line 464,col 34)",
        "(line 465,col 5)-(line 465,col 36)",
        "(line 466,col 5)-(line 466,col 36)",
        "(line 467,col 5)-(line 467,col 42)",
        "(line 468,col 5)-(line 468,col 40)",
        "(line 469,col 5)-(line 471,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateExprStmt(com.google.javascript.rhino.Node)",
      "begin_line": 474,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 475,col 5)-(line 475,col 43)",
        "(line 476,col 5)-(line 476,col 29)",
        "(line 477,col 5)-(line 477,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateReturn(com.google.javascript.rhino.Node)",
      "begin_line": 480,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 481,col 5)-(line 481,col 38)",
        "(line 482,col 5)-(line 482,col 36)",
        "(line 483,col 5)-(line 485,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateThrow(com.google.javascript.rhino.Node)",
      "begin_line": 488,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 489,col 5)-(line 489,col 37)",
        "(line 490,col 5)-(line 490,col 29)",
        "(line 491,col 5)-(line 491,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateBreak(com.google.javascript.rhino.Node)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 495,col 5)-(line 495,col 37)",
        "(line 496,col 5)-(line 496,col 36)",
        "(line 497,col 5)-(line 499,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateContinue(com.google.javascript.rhino.Node)",
      "begin_line": 502,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 503,col 5)-(line 503,col 40)",
        "(line 504,col 5)-(line 504,col 36)",
        "(line 505,col 5)-(line 507,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateTry(com.google.javascript.rhino.Node)",
      "begin_line": 510,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 511,col 5)-(line 511,col 35)",
        "(line 512,col 5)-(line 512,col 36)",
        "(line 513,col 5)-(line 513,col 36)",
        "(line 514,col 5)-(line 514,col 37)",
        "(line 516,col 5)-(line 516,col 39)",
        "(line 519,col 5)-(line 519,col 40)",
        "(line 520,col 5)-(line 520,col 43)",
        "(line 521,col 5)-(line 521,col 42)",
        "(line 522,col 5)-(line 525,col 5)",
        "(line 528,col 5)-(line 531,col 5)",
        "(line 533,col 5)-(line 535,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateCatch(com.google.javascript.rhino.Node)",
      "begin_line": 538,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 539,col 5)-(line 539,col 37)",
        "(line 540,col 5)-(line 540,col 29)",
        "(line 541,col 5)-(line 541,col 36)",
        "(line 542,col 5)-(line 542,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateSwitch(com.google.javascript.rhino.Node)",
      "begin_line": 545,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 546,col 5)-(line 546,col 38)",
        "(line 547,col 5)-(line 547,col 36)",
        "(line 548,col 5)-(line 548,col 42)",
        "(line 549,col 5)-(line 549,col 21)",
        "(line 550,col 5)-(line 555,col 5)",
        "(line 556,col 5)-(line 559,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateSwitchMember(com.google.javascript.rhino.Node)",
      "begin_line": 562,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 563,col 5)-(line 573,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateDefault(com.google.javascript.rhino.Node)",
      "begin_line": 576,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 577,col 5)-(line 577,col 44)",
        "(line 578,col 5)-(line 578,col 29)",
        "(line 579,col 5)-(line 579,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateCase(com.google.javascript.rhino.Node)",
      "begin_line": 582,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 583,col 5)-(line 583,col 36)",
        "(line 584,col 5)-(line 584,col 29)",
        "(line 585,col 5)-(line 585,col 42)",
        "(line 586,col 5)-(line 586,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateOptionalExpression(com.google.javascript.rhino.Node)",
      "begin_line": 589,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 590,col 5)-(line 594,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateChildless(com.google.javascript.rhino.Node)",
      "begin_line": 597,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 5)-(line 598,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateAssignmentExpression(com.google.javascript.rhino.Node)",
      "begin_line": 601,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 602,col 5)-(line 602,col 29)",
        "(line 603,col 5)-(line 603,col 48)",
        "(line 604,col 5)-(line 604,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateAssignmentTarget(com.google.javascript.rhino.Node)",
      "begin_line": 607,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 608,col 5)-(line 617,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateGetProp(com.google.javascript.rhino.Node)",
      "begin_line": 620,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 621,col 5)-(line 621,col 39)",
        "(line 622,col 5)-(line 622,col 29)",
        "(line 623,col 5)-(line 623,col 42)",
        "(line 624,col 5)-(line 624,col 33)",
        "(line 625,col 5)-(line 625,col 41)",
        "(line 626,col 5)-(line 626,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateRegExpLit(com.google.javascript.rhino.Node)",
      "begin_line": 629,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 630,col 5)-(line 630,col 38)",
        "(line 631,col 5)-(line 631,col 36)",
        "(line 632,col 5)-(line 632,col 36)",
        "(line 633,col 5)-(line 635,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateString(com.google.javascript.rhino.Node)",
      "begin_line": 638,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 639,col 5)-(line 639,col 38)",
        "(line 640,col 5)-(line 640,col 29)",
        "(line 641,col 5)-(line 646,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNumber(com.google.javascript.rhino.Node)",
      "begin_line": 649,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 650,col 5)-(line 650,col 38)",
        "(line 651,col 5)-(line 651,col 29)",
        "(line 652,col 5)-(line 657,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateArrayLit(com.google.javascript.rhino.Node)",
      "begin_line": 660,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 661,col 5)-(line 661,col 40)",
        "(line 662,col 5)-(line 665,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLit(com.google.javascript.rhino.Node)",
      "begin_line": 668,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 669,col 5)-(line 669,col 41)",
        "(line 670,col 5)-(line 672,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLitKey(com.google.javascript.rhino.Node)",
      "begin_line": 675,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 676,col 5)-(line 689,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLitGetKey(com.google.javascript.rhino.Node)",
      "begin_line": 692,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 693,col 5)-(line 693,col 42)",
        "(line 694,col 5)-(line 694,col 29)",
        "(line 695,col 5)-(line 695,col 36)",
        "(line 696,col 5)-(line 696,col 38)",
        "(line 697,col 5)-(line 697,col 41)",
        "(line 699,col 5)-(line 701,col 5)",
        "(line 702,col 5)-(line 702,col 54)",
        "(line 703,col 5)-(line 705,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLitSetKey(com.google.javascript.rhino.Node)",
      "begin_line": 708,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 709,col 5)-(line 709,col 42)",
        "(line 710,col 5)-(line 710,col 29)",
        "(line 711,col 5)-(line 711,col 36)",
        "(line 712,col 5)-(line 712,col 38)",
        "(line 713,col 5)-(line 713,col 41)",
        "(line 715,col 5)-(line 717,col 5)",
        "(line 718,col 5)-(line 718,col 54)",
        "(line 719,col 5)-(line 721,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLitStringKey(com.google.javascript.rhino.Node)",
      "begin_line": 724,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 725,col 5)-(line 725,col 42)",
        "(line 726,col 5)-(line 726,col 29)",
        "(line 727,col 5)-(line 727,col 36)",
        "(line 728,col 5)-(line 728,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateObjectLiteralKeyName(com.google.javascript.rhino.Node)",
      "begin_line": 731,
      "end_line": 742,
      "comment": "",
      "child_ranges": [
        "(line 732,col 5)-(line 741,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateUnaryOp(com.google.javascript.rhino.Node)",
      "begin_line": 744,
      "end_line": 747,
      "comment": "",
      "child_ranges": [
        "(line 745,col 5)-(line 745,col 29)",
        "(line 746,col 5)-(line 746,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateBinaryOp(com.google.javascript.rhino.Node)",
      "begin_line": 749,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 750,col 5)-(line 750,col 29)",
        "(line 751,col 5)-(line 751,col 42)",
        "(line 752,col 5)-(line 752,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateTrinaryOp(com.google.javascript.rhino.Node)",
      "begin_line": 755,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 756,col 5)-(line 756,col 29)",
        "(line 757,col 5)-(line 757,col 35)",
        "(line 758,col 5)-(line 758,col 30)",
        "(line 759,col 5)-(line 759,col 40)",
        "(line 760,col 5)-(line 760,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.violation(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 763,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 764,col 5)-(line 764,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateNodeType(int, com.google.javascript.rhino.Node)",
      "begin_line": 767,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 768,col 5)-(line 772,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateChildCount(com.google.javascript.rhino.Node, int)",
      "begin_line": 775,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 776,col 5)-(line 776,col 26)",
        "(line 777,col 5)-(line 783,col 5)",
        "(line 784,col 5)-(line 788,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateMinimumChildCount(com.google.javascript.rhino.Node, int)",
      "begin_line": 791,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 792,col 5)-(line 792,col 26)",
        "(line 793,col 5)-(line 799,col 5)",
        "(line 801,col 5)-(line 805,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstValidator.validateMaximumChildCount(com.google.javascript.rhino.Node, int)",
      "begin_line": 808,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 809,col 5)-(line 809,col 26)",
        "(line 810,col 5)-(line 814,col 5)",
        "(line 815,col 5)-(line 819,col 5)"
      ]
    }
  ]
}