{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/util/junit/SerialUtilitiesTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerialUtilitiesTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 73,
      "end_line": 481,
      "comment": "\r\n * Tests for the {@link SerialUtilities} class.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.suite()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\r\n     * Returns the tests as a test suite.\r\n     *\r\n     * @return The test suite.\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.SerialUtilitiesTests(java.lang.String)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Constructs a new set of tests.\r\n     *\r\n     * @param name  the name of the tests.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testIsSerializable()",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\r\n     * Tests the isSerializable(Class) method for some common cases.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 64)",
        "(line 98,col 9)-(line 98,col 74)",
        "(line 99,col 9)-(line 99,col 73)",
        "(line 100,col 9)-(line 100,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testColorSerialization()",
      "begin_line": 107,
      "end_line": 129,
      "comment": "\r\n     * Serialize a \u003ccode\u003eColor\u003c/code\u003e and check that it can be deserialized\r\n     * correctly.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 30)",
        "(line 110,col 9)-(line 110,col 24)",
        "(line 112,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testColorUIResourceSerialization()",
      "begin_line": 135,
      "end_line": 154,
      "comment": "\r\n     * Serialize a \u003ccode\u003eColorUIResource\u003c/code\u003e and check that it can be\r\n     * deserialized correctly.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 137,col 24)",
        "(line 138,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testGradientPaintSerialization()",
      "begin_line": 160,
      "end_line": 193,
      "comment": "\r\n     * Serialize a \u003ccode\u003eGradientPaint\u003c/code\u003e, restore it, and check for\r\n     * equality.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 163,col 43)",
        "(line 164,col 9)-(line 164,col 24)",
        "(line 166,col 9)-(line 180,col 9)",
        "(line 185,col 9)-(line 185,col 47)",
        "(line 186,col 9)-(line 186,col 47)",
        "(line 187,col 9)-(line 187,col 55)",
        "(line 188,col 9)-(line 188,col 55)",
        "(line 189,col 9)-(line 189,col 55)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 191,col 9)-(line 191,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testTexturePaintSerialization()",
      "begin_line": 200,
      "end_line": 225,
      "comment": "\r\n     * Serialize a \u003ccode\u003eTexturePaint\u003c/code\u003e, restore it, and check for\r\n     * equality.  Since this class is not serializable, we expect null as the\r\n     * result.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 52)",
        "(line 205,col 9)-(line 205,col 24)",
        "(line 207,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testLine2DFloatSerialization()",
      "begin_line": 231,
      "end_line": 250,
      "comment": "\r\n     * Serialize a \u003ccode\u003eLine2D.Float\u003c/code\u003e instance, and check that it can be\r\n     * deserialized correctly.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 61)",
        "(line 233,col 9)-(line 233,col 25)",
        "(line 234,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testLine2DDoubleSerialization()",
      "begin_line": 256,
      "end_line": 275,
      "comment": "\r\n     * Serialize a \u003ccode\u003eLine2D.Double\u003c/code\u003e instance and check that it can be\r\n     * deserialized correctly.\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 58)",
        "(line 258,col 9)-(line 258,col 25)",
        "(line 259,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testRectangle2DFloatSerialization()",
      "begin_line": 281,
      "end_line": 300,
      "comment": "\r\n     * Serialize a \u003ccode\u003eRectangle2D.Float\u003c/code\u003e instance, and check that it\r\n     * can be deserialized correctly.\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 71)",
        "(line 283,col 9)-(line 283,col 30)",
        "(line 284,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testRectangle2DDoubleSerialization()",
      "begin_line": 306,
      "end_line": 325,
      "comment": "\r\n     * Serialize a \u003ccode\u003eRectangle2D.Double\u003c/code\u003e instance and check that it\r\n     * can be deserialized correctly.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 68)",
        "(line 308,col 9)-(line 308,col 30)",
        "(line 309,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testArc2DFloatSerialization()",
      "begin_line": 331,
      "end_line": 351,
      "comment": "\r\n     * Serialize an \u003ccode\u003eArc2D.Float\u003c/code\u003e instance and check that it\r\n     * can be deserialized correctly.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 333,col 27)",
        "(line 334,col 9)-(line 334,col 24)",
        "(line 335,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testArc2DDoubleSerialization()",
      "begin_line": 357,
      "end_line": 376,
      "comment": "\r\n     * Serialize an \u003ccode\u003eArc2D.Double\u003c/code\u003e instance and check that it\r\n     * can be deserialized correctly.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 77)",
        "(line 359,col 9)-(line 359,col 24)",
        "(line 360,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testGeneralPathSerialization()",
      "begin_line": 381,
      "end_line": 406,
      "comment": "\r\n     * Some checks for the serialization of a GeneralPath instance.\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 43)",
        "(line 383,col 9)-(line 383,col 30)",
        "(line 384,col 9)-(line 384,col 30)",
        "(line 385,col 9)-(line 385,col 56)",
        "(line 386,col 9)-(line 386,col 42)",
        "(line 387,col 9)-(line 387,col 23)",
        "(line 388,col 9)-(line 388,col 30)",
        "(line 389,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testAttributedStringSerialization1()",
      "begin_line": 411,
      "end_line": 430,
      "comment": "\r\n     * Tests the serialization of an {@link AttributedString}.\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 55)",
        "(line 413,col 9)-(line 413,col 35)",
        "(line 414,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testAttributedStringSerialization2()",
      "begin_line": 435,
      "end_line": 454,
      "comment": "\r\n     * Tests the serialization of an {@link AttributedString}.\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 58)",
        "(line 437,col 9)-(line 437,col 35)",
        "(line 438,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.junit.SerialUtilitiesTests.testAttributedStringSerialization3()",
      "begin_line": 459,
      "end_line": 479,
      "comment": "\r\n     * Tests the serialization of an {@link AttributedString}.\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 58)",
        "(line 461,col 9)-(line 461,col 59)",
        "(line 462,col 9)-(line 462,col 35)",
        "(line 463,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 60)"
      ]
    }
  ]
}