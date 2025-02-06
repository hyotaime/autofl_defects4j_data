{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/axis/junit/NumberAxisTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberAxisTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 81,
      "end_line": 433,
      "comment": "\n * Tests for the {@link NumberAxis} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.suite()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.NumberAxisTests(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testCloning()",
      "begin_line": 104,
      "end_line": 116,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 47)",
        "(line 106,col 9)-(line 106,col 29)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 29)",
        "(line 114,col 9)-(line 114,col 51)",
        "(line 115,col 9)-(line 115,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testEquals()",
      "begin_line": 121,
      "end_line": 156,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 47)",
        "(line 124,col 9)-(line 124,col 47)",
        "(line 125,col 9)-(line 125,col 34)",
        "(line 128,col 9)-(line 128,col 43)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 43)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 135,col 9)-(line 135,col 35)",
        "(line 136,col 9)-(line 136,col 41)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 140,col 9)-(line 140,col 49)",
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 142,col 49)",
        "(line 143,col 9)-(line 143,col 34)",
        "(line 146,col 9)-(line 146,col 62)",
        "(line 147,col 9)-(line 147,col 35)",
        "(line 148,col 9)-(line 148,col 62)",
        "(line 149,col 9)-(line 149,col 34)",
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testHashCode()",
      "begin_line": 161,
      "end_line": 168,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 47)",
        "(line 163,col 9)-(line 163,col 47)",
        "(line 164,col 9)-(line 164,col 34)",
        "(line 165,col 9)-(line 165,col 31)",
        "(line 166,col 9)-(line 166,col 31)",
        "(line 167,col 9)-(line 167,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testTranslateJava2DToValue()",
      "begin_line": 175,
      "end_line": 196,
      "comment": "\n     * Test the translation of Java2D values to data values.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 43)",
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 178,col 80)",
        "(line 179,col 9)-(line 179,col 75)",
        "(line 180,col 9)-(line 180,col 46)",
        "(line 181,col 9)-(line 181,col 76)",
        "(line 182,col 9)-(line 182,col 46)",
        "(line 183,col 9)-(line 183,col 74)",
        "(line 184,col 9)-(line 184,col 42)",
        "(line 185,col 9)-(line 185,col 77)",
        "(line 186,col 9)-(line 186,col 42)",
        "(line 187,col 9)-(line 187,col 31)",
        "(line 188,col 9)-(line 188,col 75)",
        "(line 189,col 9)-(line 189,col 46)",
        "(line 190,col 9)-(line 190,col 76)",
        "(line 191,col 9)-(line 191,col 46)",
        "(line 192,col 9)-(line 192,col 74)",
        "(line 193,col 9)-(line 193,col 42)",
        "(line 194,col 9)-(line 194,col 77)",
        "(line 195,col 9)-(line 195,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testSerialization()",
      "begin_line": 201,
      "end_line": 222,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 52)",
        "(line 204,col 9)-(line 204,col 29)",
        "(line 206,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testAutoRange1()",
      "begin_line": 228,
      "end_line": 238,
      "comment": "\n     * A simple test for the auto-range calculation looking at a\n     * NumberAxis used as the range axis for a CategoryPlot.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 70)",
        "(line 230,col 9)-(line 230,col 53)",
        "(line 231,col 9)-(line 231,col 53)",
        "(line 232,col 9)-(line 233,col 41)",
        "(line 234,col 9)-(line 234,col 59)",
        "(line 235,col 9)-(line 235,col 59)",
        "(line 236,col 9)-(line 236,col 57)",
        "(line 237,col 9)-(line 237,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testAutoRange2()",
      "begin_line": 245,
      "end_line": 256,
      "comment": "\n     * A simple test for the auto-range calculation looking at a\n     * NumberAxis used as the range axis for a CategoryPlot.  In this\n     * case, the \u0027autoRangeIncludesZero\u0027 flag is set to false.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 70)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 248,col 53)",
        "(line 249,col 9)-(line 250,col 41)",
        "(line 251,col 9)-(line 251,col 59)",
        "(line 252,col 9)-(line 252,col 59)",
        "(line 253,col 9)-(line 253,col 45)",
        "(line 254,col 9)-(line 254,col 58)",
        "(line 255,col 9)-(line 255,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testAutoRange3()",
      "begin_line": 264,
      "end_line": 283,
      "comment": "\n     * A simple test for the auto-range calculation looking at a\n     * NumberAxis used as the range axis for a CategoryPlot.  In this\n     * case, the \u0027autoRangeIncludesZero\u0027 flag is set to false AND the\n     * original dataset is replaced with a new dataset.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 70)",
        "(line 266,col 9)-(line 266,col 53)",
        "(line 267,col 9)-(line 267,col 53)",
        "(line 268,col 9)-(line 269,col 41)",
        "(line 270,col 9)-(line 270,col 59)",
        "(line 271,col 9)-(line 271,col 59)",
        "(line 272,col 9)-(line 272,col 45)",
        "(line 273,col 9)-(line 273,col 58)",
        "(line 274,col 9)-(line 274,col 59)",
        "(line 277,col 9)-(line 277,col 71)",
        "(line 278,col 9)-(line 278,col 54)",
        "(line 279,col 9)-(line 279,col 55)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 281,col 9)-(line 281,col 59)",
        "(line 282,col 9)-(line 282,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testAutoRange4()",
      "begin_line": 289,
      "end_line": 330,
      "comment": "\n     * A check for the interaction between the \u0027autoRangeIncludesZero\u0027 flag\n     * and the base setting in the BarRenderer.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 70)",
        "(line 291,col 9)-(line 291,col 53)",
        "(line 292,col 9)-(line 292,col 53)",
        "(line 293,col 9)-(line 294,col 41)",
        "(line 295,col 9)-(line 295,col 59)",
        "(line 296,col 9)-(line 296,col 59)",
        "(line 297,col 9)-(line 297,col 45)",
        "(line 298,col 9)-(line 298,col 58)",
        "(line 299,col 9)-(line 299,col 40)",
        "(line 300,col 9)-(line 300,col 58)",
        "(line 301,col 9)-(line 301,col 59)",
        "(line 303,col 9)-(line 303,col 39)",
        "(line 304,col 9)-(line 304,col 57)",
        "(line 305,col 9)-(line 305,col 59)",
        "(line 307,col 9)-(line 307,col 44)",
        "(line 308,col 9)-(line 308,col 57)",
        "(line 309,col 9)-(line 309,col 59)",
        "(line 311,col 9)-(line 311,col 39)",
        "(line 312,col 9)-(line 312,col 57)",
        "(line 313,col 9)-(line 313,col 59)",
        "(line 316,col 9)-(line 316,col 71)",
        "(line 317,col 9)-(line 317,col 54)",
        "(line 318,col 9)-(line 318,col 55)",
        "(line 319,col 9)-(line 319,col 34)",
        "(line 320,col 9)-(line 320,col 57)",
        "(line 321,col 9)-(line 321,col 60)",
        "(line 323,col 9)-(line 323,col 40)",
        "(line 324,col 9)-(line 324,col 57)",
        "(line 325,col 9)-(line 325,col 60)",
        "(line 327,col 9)-(line 327,col 45)",
        "(line 328,col 9)-(line 328,col 59)",
        "(line 329,col 9)-(line 329,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testXYAutoRange1()",
      "begin_line": 336,
      "end_line": 350,
      "comment": "\n     * Checks that the auto-range for the domain axis on an XYPlot is\n     * working as expected.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 51)",
        "(line 338,col 9)-(line 338,col 29)",
        "(line 339,col 9)-(line 339,col 29)",
        "(line 340,col 9)-(line 340,col 29)",
        "(line 341,col 9)-(line 341,col 62)",
        "(line 342,col 9)-(line 342,col 34)",
        "(line 343,col 9)-(line 344,col 32)",
        "(line 345,col 9)-(line 345,col 47)",
        "(line 346,col 9)-(line 346,col 60)",
        "(line 347,col 9)-(line 347,col 45)",
        "(line 348,col 9)-(line 348,col 57)",
        "(line 349,col 9)-(line 349,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testXYAutoRange2()",
      "begin_line": 356,
      "end_line": 370,
      "comment": "\n     * Checks that the auto-range for the range axis on an XYPlot is\n     * working as expected.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 51)",
        "(line 358,col 9)-(line 358,col 29)",
        "(line 359,col 9)-(line 359,col 29)",
        "(line 360,col 9)-(line 360,col 29)",
        "(line 361,col 9)-(line 361,col 62)",
        "(line 362,col 9)-(line 362,col 34)",
        "(line 363,col 9)-(line 364,col 32)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 366,col 59)",
        "(line 367,col 9)-(line 367,col 45)",
        "(line 368,col 9)-(line 368,col 57)",
        "(line 369,col 9)-(line 369,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.NumberAxisTests.testSetLowerBound()",
      "begin_line": 419,
      "end_line": 431,
      "comment": "\n     * Some checks for the setLowerBound() method.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 46)",
        "(line 421,col 9)-(line 421,col 33)",
        "(line 422,col 9)-(line 422,col 32)",
        "(line 423,col 9)-(line 423,col 57)",
        "(line 424,col 9)-(line 424,col 33)",
        "(line 425,col 9)-(line 425,col 58)",
        "(line 426,col 9)-(line 426,col 58)"
      ]
    }
  ]
}