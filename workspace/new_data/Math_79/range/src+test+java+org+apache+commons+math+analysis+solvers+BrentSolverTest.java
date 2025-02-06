{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/analysis/solvers/BrentSolverTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolverTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 385,
      "comment": "\n * Testcase for UnivariateRealSolver.\n * Because Brent-Dekker is guaranteed to converge in less than the default\n * maximum iteration count due to bisection fallback, it is quite hard to\n * debug. I include measured iteration counts plus one in order to detect\n * regressions. On average Brent-Dekker should use 4..5 iterations for the\n * default absolute accuracy of 10E-8 for sinus and the quintic function around\n * zero, and 5..10 iterations for the other zeros.\n *\n * @version $Revision:670469 $ $Date:2008-06-23 10:01:38 +0200 (lun., 23 juin 2008) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolverTest.BrentSolverTest(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolverTest.suite()",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 63)",
        "(line 48,col 9)-(line 48,col 52)",
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolverTest.testDeprecated()",
      "begin_line": 52,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 53)",
        "(line 58,col 9)-(line 58,col 22)",
        "(line 59,col 9)-(line 59,col 57)",
        "(line 61,col 9)-(line 61,col 36)",
        "(line 64,col 9)-(line 64,col 68)",
        "(line 66,col 9)-(line 66,col 52)",
        "(line 68,col 9)-(line 68,col 36)",
        "(line 71,col 9)-(line 71,col 68)",
        "(line 73,col 9)-(line 73,col 52)",
        "(line 74,col 9)-(line 74,col 37)",
        "(line 75,col 9)-(line 75,col 36)",
        "(line 78,col 9)-(line 78,col 68)",
        "(line 80,col 9)-(line 80,col 52)",
        "(line 81,col 9)-(line 81,col 36)",
        "(line 84,col 9)-(line 84,col 68)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolverTest.testSinZero()",
      "begin_line": 90,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 53)",
        "(line 95,col 9)-(line 95,col 22)",
        "(line 96,col 9)-(line 96,col 56)",
        "(line 98,col 9)-(line 98,col 39)",
        "(line 101,col 9)-(line 101,col 68)",
        "(line 103,col 9)-(line 103,col 52)",
        "(line 105,col 9)-(line 105,col 39)",
        "(line 108,col 9)-(line 108,col 68)",
        "(line 110,col 9)-(line 110,col 52)",
        "(line 111,col 9)-(line 111,col 36)",
        "(line 112,col 9)-(line 112,col 39)",
        "(line 115,col 9)-(line 115,col 68)",
        "(line 117,col 9)-(line 117,col 52)",
        "(line 118,col 9)-(line 118,col 39)",
        "(line 121,col 9)-(line 121,col 68)",
        "(line 123,col 9)-(line 123,col 52)",
        "(line 124,col 9)-(line 124,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolverTest.testQuinticZero()",
      "begin_line": 127,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 57)",
        "(line 136,col 9)-(line 136,col 22)",
        "(line 138,col 9)-(line 138,col 56)",
        "(line 141,col 9)-(line 141,col 44)",
        "(line 144,col 9)-(line 144,col 62)",
        "(line 145,col 9)-(line 145,col 52)",
        "(line 148,col 9)-(line 148,col 44)",
        "(line 151,col 9)-(line 151,col 62)",
        "(line 153,col 9)-(line 153,col 52)",
        "(line 155,col 9)-(line 155,col 45)",
        "(line 158,col 9)-(line 158,col 62)",
        "(line 160,col 9)-(line 160,col 52)",
        "(line 162,col 9)-(line 162,col 43)",
        "(line 165,col 9)-(line 165,col 64)",
        "(line 167,col 9)-(line 167,col 52)",
        "(line 169,col 9)-(line 169,col 43)",
        "(line 172,col 9)-(line 172,col 64)",
        "(line 174,col 9)-(line 174,col 52)",
        "(line 176,col 9)-(line 176,col 45)",
        "(line 179,col 9)-(line 179,col 64)",
        "(line 181,col 9)-(line 181,col 52)",
        "(line 184,col 9)-(line 184,col 45)",
        "(line 187,col 9)-(line 187,col 64)",
        "(line 189,col 9)-(line 189,col 52)",
        "(line 191,col 9)-(line 191,col 43)",
        "(line 194,col 9)-(line 194,col 64)",
        "(line 196,col 9)-(line 196,col 52)",
        "(line 198,col 9)-(line 198,col 45)",
        "(line 201,col 9)-(line 201,col 64)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 205,col 9)-(line 205,col 45)",
        "(line 208,col 9)-(line 208,col 64)",
        "(line 210,col 9)-(line 210,col 52)",
        "(line 212,col 9)-(line 212,col 42)",
        "(line 215,col 9)-(line 215,col 64)",
        "(line 217,col 9)-(line 217,col 53)",
        "(line 219,col 9)-(line 219,col 36)",
        "(line 220,col 9)-(line 220,col 44)",
        "(line 223,col 9)-(line 223,col 62)",
        "(line 225,col 9)-(line 225,col 52)",
        "(line 226,col 9)-(line 226,col 44)",
        "(line 229,col 9)-(line 229,col 62)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 232,col 9)-(line 232,col 45)",
        "(line 235,col 9)-(line 235,col 62)",
        "(line 237,col 9)-(line 237,col 52)",
        "(line 238,col 9)-(line 238,col 43)",
        "(line 241,col 9)-(line 241,col 64)",
        "(line 243,col 9)-(line 243,col 52)",
        "(line 244,col 9)-(line 244,col 43)",
        "(line 247,col 9)-(line 247,col 64)",
        "(line 249,col 9)-(line 249,col 52)",
        "(line 250,col 9)-(line 250,col 45)",
        "(line 253,col 9)-(line 253,col 64)",
        "(line 255,col 9)-(line 255,col 52)",
        "(line 256,col 9)-(line 256,col 45)",
        "(line 259,col 9)-(line 259,col 64)",
        "(line 261,col 9)-(line 261,col 53)",
        "(line 262,col 9)-(line 262,col 43)",
        "(line 265,col 9)-(line 265,col 64)",
        "(line 267,col 9)-(line 267,col 52)",
        "(line 268,col 9)-(line 268,col 45)",
        "(line 271,col 9)-(line 271,col 64)",
        "(line 273,col 9)-(line 273,col 53)",
        "(line 276,col 9)-(line 276,col 45)",
        "(line 279,col 9)-(line 279,col 64)",
        "(line 281,col 9)-(line 281,col 52)",
        "(line 282,col 9)-(line 282,col 42)",
        "(line 285,col 9)-(line 285,col 64)",
        "(line 287,col 9)-(line 287,col 53)",
        "(line 289,col 9)-(line 289,col 63)",
        "(line 290,col 9)-(line 290,col 62)",
        "(line 291,col 9)-(line 291,col 63)",
        "(line 292,col 9)-(line 292,col 38)",
        "(line 293,col 9)-(line 293,col 64)",
        "(line 294,col 9)-(line 294,col 38)",
        "(line 295,col 9)-(line 295,col 62)",
        "(line 296,col 9)-(line 296,col 40)",
        "(line 297,col 9)-(line 297,col 62)",
        "(line 298,col 9)-(line 298,col 40)",
        "(line 299,col 9)-(line 299,col 64)",
        "(line 300,col 9)-(line 300,col 40)",
        "(line 301,col 9)-(line 301,col 64)",
        "(line 302,col 9)-(line 302,col 40)",
        "(line 303,col 9)-(line 303,col 62)",
        "(line 304,col 9)-(line 304,col 40)",
        "(line 305,col 9)-(line 305,col 64)",
        "(line 306,col 9)-(line 306,col 40)",
        "(line 307,col 9)-(line 307,col 64)",
        "(line 308,col 9)-(line 308,col 40)",
        "(line 309,col 9)-(line 309,col 61)",
        "(line 310,col 9)-(line 310,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolverTest.testRootEndpoints()",
      "begin_line": 313,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 53)",
        "(line 315,col 9)-(line 315,col 56)",
        "(line 318,col 9)-(line 318,col 52)",
        "(line 319,col 9)-(line 319,col 68)",
        "(line 321,col 9)-(line 321,col 45)",
        "(line 322,col 9)-(line 322,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolverTest.testBadEndpoints()",
      "begin_line": 325,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 53)",
        "(line 327,col 9)-(line 327,col 56)",
        "(line 328,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolverTest.testInitialGuess()",
      "begin_line": 342,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 75)",
        "(line 345,col 9)-(line 345,col 56)",
        "(line 346,col 9)-(line 346,col 22)",
        "(line 349,col 9)-(line 349,col 43)",
        "(line 350,col 9)-(line 350,col 64)",
        "(line 351,col 9)-(line 351,col 52)",
        "(line 352,col 9)-(line 352,col 46)",
        "(line 355,col 9)-(line 362,col 9)",
        "(line 365,col 9)-(line 365,col 27)",
        "(line 366,col 9)-(line 366,col 49)",
        "(line 367,col 9)-(line 367,col 64)",
        "(line 368,col 9)-(line 368,col 60)",
        "(line 371,col 9)-(line 371,col 27)",
        "(line 372,col 9)-(line 372,col 53)",
        "(line 373,col 9)-(line 373,col 64)",
        "(line 374,col 9)-(line 374,col 60)",
        "(line 377,col 9)-(line 377,col 27)",
        "(line 378,col 9)-(line 378,col 48)",
        "(line 379,col 9)-(line 379,col 64)",
        "(line 380,col 9)-(line 380,col 52)",
        "(line 381,col 9)-(line 381,col 43)"
      ]
    }
  ]
}