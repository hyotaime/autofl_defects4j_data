{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 99,
      "end_line": 670,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LevenbergMarquardtOptimizerTest(java.lang.String)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTrivial()",
      "begin_line": 106,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 108,col 76)",
        "(line 109,col 9)-(line 109,col 82)",
        "(line 110,col 9)-(line 111,col 96)",
        "(line 112,col 9)-(line 112,col 53)",
        "(line 113,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 58)",
        "(line 122,col 9)-(line 122,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testQRColumnsPermutation()",
      "begin_line": 125,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 62)",
        "(line 131,col 9)-(line 131,col 82)",
        "(line 132,col 9)-(line 133,col 105)",
        "(line 134,col 9)-(line 134,col 53)",
        "(line 135,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 138,col 58)",
        "(line 139,col 9)-(line 139,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testNoDependency()",
      "begin_line": 143,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 151,col 58)",
        "(line 152,col 9)-(line 152,col 82)",
        "(line 153,col 9)-(line 155,col 66)",
        "(line 156,col 9)-(line 156,col 53)",
        "(line 157,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testOneSet()",
      "begin_line": 162,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 82)",
        "(line 170,col 9)-(line 171,col 108)",
        "(line 172,col 9)-(line 172,col 53)",
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 175,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTwoSets()",
      "begin_line": 179,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 32)",
        "(line 181,col 9)-(line 188,col 66)",
        "(line 190,col 9)-(line 190,col 82)",
        "(line 191,col 9)-(line 193,col 66)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 59)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 197,col 9)-(line 197,col 59)",
        "(line 198,col 9)-(line 198,col 59)",
        "(line 199,col 9)-(line 199,col 69)",
        "(line 200,col 9)-(line 200,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testNonInversible()",
      "begin_line": 204,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 210,col 37)",
        "(line 212,col 9)-(line 212,col 82)",
        "(line 213,col 9)-(line 213,col 104)",
        "(line 214,col 9)-(line 214,col 80)",
        "(line 215,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testIllConditioned()",
      "begin_line": 226,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 232,col 44)",
        "(line 233,col 9)-(line 233,col 82)",
        "(line 234,col 9)-(line 236,col 60)",
        "(line 237,col 9)-(line 237,col 53)",
        "(line 238,col 9)-(line 238,col 59)",
        "(line 239,col 9)-(line 239,col 59)",
        "(line 240,col 9)-(line 240,col 59)",
        "(line 241,col 9)-(line 241,col 59)",
        "(line 243,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 251,col 60)",
        "(line 252,col 9)-(line 252,col 53)",
        "(line 253,col 9)-(line 253,col 60)",
        "(line 254,col 9)-(line 254,col 60)",
        "(line 255,col 9)-(line 255,col 60)",
        "(line 256,col 9)-(line 256,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 260,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 266,col 43)",
        "(line 268,col 9)-(line 268,col 82)",
        "(line 269,col 9)-(line 270,col 45)",
        "(line 271,col 9)-(line 271,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 275,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 282,col 54)",
        "(line 284,col 9)-(line 284,col 82)",
        "(line 285,col 9)-(line 287,col 66)",
        "(line 288,col 9)-(line 288,col 53)",
        "(line 289,col 9)-(line 289,col 61)",
        "(line 290,col 9)-(line 290,col 61)",
        "(line 291,col 9)-(line 291,col 61)",
        "(line 292,col 9)-(line 292,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testRedundantEquations()",
      "begin_line": 296,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 301,col 43)",
        "(line 303,col 9)-(line 303,col 82)",
        "(line 304,col 9)-(line 306,col 54)",
        "(line 307,col 9)-(line 307,col 53)",
        "(line 308,col 9)-(line 308,col 61)",
        "(line 309,col 9)-(line 309,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentEquations()",
      "begin_line": 313,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 318,col 43)",
        "(line 320,col 9)-(line 320,col 82)",
        "(line 321,col 9)-(line 321,col 101)",
        "(line 322,col 9)-(line 322,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentSizes()",
      "begin_line": 326,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 328,col 93)",
        "(line 329,col 9)-(line 329,col 82)",
        "(line 331,col 9)-(line 332,col 102)",
        "(line 333,col 9)-(line 333,col 53)",
        "(line 334,col 9)-(line 334,col 57)",
        "(line 335,col 9)-(line 335,col 57)",
        "(line 337,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 361,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 37)",
        "(line 363,col 9)-(line 363,col 38)",
        "(line 364,col 9)-(line 364,col 38)",
        "(line 365,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 38)",
        "(line 367,col 9)-(line 367,col 38)",
        "(line 368,col 9)-(line 368,col 73)",
        "(line 369,col 9)-(line 369,col 72)",
        "(line 370,col 9)-(line 370,col 72)",
        "(line 371,col 9)-(line 371,col 35)",
        "(line 372,col 9)-(line 372,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double, int, double, double, double, boolean)",
      "begin_line": 375,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFitting()",
      "begin_line": 398,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 37)",
        "(line 400,col 9)-(line 400,col 38)",
        "(line 401,col 9)-(line 401,col 38)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 404,col 38)",
        "(line 405,col 9)-(line 405,col 82)",
        "(line 406,col 9)-(line 408,col 64)",
        "(line 409,col 9)-(line 409,col 52)",
        "(line 410,col 9)-(line 410,col 60)",
        "(line 411,col 9)-(line 411,col 40)",
        "(line 412,col 9)-(line 412,col 83)",
        "(line 413,col 9)-(line 413,col 103)",
        "(line 414,col 9)-(line 414,col 75)",
        "(line 415,col 9)-(line 415,col 64)",
        "(line 416,col 9)-(line 416,col 64)",
        "(line 417,col 9)-(line 417,col 52)",
        "(line 418,col 9)-(line 418,col 46)",
        "(line 419,col 9)-(line 419,col 46)",
        "(line 420,col 9)-(line 420,col 52)",
        "(line 421,col 9)-(line 421,col 46)",
        "(line 422,col 9)-(line 422,col 60)",
        "(line 423,col 9)-(line 423,col 46)",
        "(line 424,col 9)-(line 424,col 46)",
        "(line 427,col 9)-(line 427,col 45)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 52)",
        "(line 432,col 9)-(line 432,col 33)",
        "(line 433,col 9)-(line 433,col 53)",
        "(line 434,col 9)-(line 434,col 34)",
        "(line 435,col 9)-(line 435,col 85)",
        "(line 436,col 9)-(line 436,col 41)",
        "(line 437,col 9)-(line 437,col 47)",
        "(line 438,col 9)-(line 438,col 48)",
        "(line 439,col 9)-(line 439,col 52)",
        "(line 440,col 9)-(line 440,col 47)",
        "(line 441,col 9)-(line 441,col 51)",
        "(line 442,col 9)-(line 442,col 46)",
        "(line 443,col 9)-(line 443,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 447,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 37)",
        "(line 449,col 9)-(line 479,col 10)",
        "(line 480,col 9)-(line 480,col 52)",
        "(line 481,col 9)-(line 481,col 33)",
        "(line 482,col 9)-(line 482,col 53)",
        "(line 483,col 9)-(line 483,col 34)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 82)",
        "(line 488,col 9)-(line 488,col 91)",
        "(line 489,col 9)-(line 490,col 83)",
        "(line 491,col 9)-(line 491,col 103)",
        "(line 492,col 9)-(line 492,col 52)",
        "(line 493,col 9)-(line 493,col 60)",
        "(line 494,col 9)-(line 494,col 57)",
        "(line 495,col 9)-(line 495,col 67)",
        "(line 496,col 9)-(line 496,col 56)",
        "(line 497,col 9)-(line 497,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMath199()",
      "begin_line": 500,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 515,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 519,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 523,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 524,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 56)",
        "(line 526,col 13)-(line 526,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 529,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 530,col 13)-(line 530,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 533,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 534,col 13)-(line 539,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 535,
      "end_line": 535,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.Anonymous-3fc04168-1e24-4da9-a6ad-95f2d584437b.value(double[])",
      "begin_line": 536,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 21)-(line 537,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 544,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Circle()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 13)-(line 551,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 554,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 13)-(line 555,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getN()",
      "begin_line": 558,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 559,col 13)-(line 559,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 562,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 563,col 13)-(line 563,col 25)",
        "(line 564,col 13)-(line 566,col 13)",
        "(line 567,col 13)-(line 567,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 570,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 572,col 13)-(line 572,col 34)",
        "(line 573,col 13)-(line 573,col 75)",
        "(line 576,col 13)-(line 576,col 28)",
        "(line 577,col 13)-(line 577,col 28)",
        "(line 578,col 13)-(line 582,col 13)",
        "(line 583,col 13)-(line 583,col 22)",
        "(line 584,col 13)-(line 584,col 22)",
        "(line 587,col 13)-(line 587,col 51)",
        "(line 588,col 13)-(line 593,col 13)",
        "(line 595,col 13)-(line 595,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.value(double[])",
      "begin_line": 599,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 602,col 13)-(line 602,col 83)",
        "(line 603,col 13)-(line 603,col 46)",
        "(line 605,col 13)-(line 605,col 59)",
        "(line 606,col 13)-(line 608,col 13)",
        "(line 610,col 13)-(line 610,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian()",
      "begin_line": 614,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 615,col 13)-(line 620,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 616,
      "end_line": 616,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Anonymous-c03ab4ab-bb62-4e5a-a369-d0a94f89d9c9.value(double[])",
      "begin_line": 617,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 618,col 21)-(line 618,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 625,
      "end_line": 668,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 628,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 631,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 632,col 13)-(line 632,col 40)",
        "(line 633,col 13)-(line 633,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 636,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 637,col 13)-(line 637,col 26)",
        "(line 638,col 13)-(line 638,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian(double[])",
      "begin_line": 641,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 642,col 13)-(line 642,col 58)",
        "(line 643,col 13)-(line 647,col 13)",
        "(line 648,col 13)-(line 648,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.value(double[])",
      "begin_line": 651,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 652,col 13)-(line 652,col 51)",
        "(line 653,col 13)-(line 655,col 13)",
        "(line 656,col 13)-(line 656,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian()",
      "begin_line": 659,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 660,col 13)-(line 665,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 661,
      "end_line": 661,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-0579d40d-855c-49a9-bd25-0ee29b85593a.value(double[])",
      "begin_line": 662,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 663,col 21)-(line 663,col 43)"
      ]
    }
  ]
}