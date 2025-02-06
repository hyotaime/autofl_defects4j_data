{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/data/time/junit/MillisecondTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MillisecondTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 76,
      "end_line": 395,
      "comment": "\n * Tests for the {@link Millisecond} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.suite()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.MillisecondTests.MillisecondTests(java.lang.String)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.setUp()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testEqualsSelf()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Check that a {@link Millisecond} instance is equal to itself.\n     *\n     * SourceForge Bug ID: 558850.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 52)",
        "(line 110,col 9)-(line 110,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testEquals()",
      "begin_line": 116,
      "end_line": 128,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 59)",
        "(line 118,col 9)-(line 118,col 40)",
        "(line 119,col 9)-(line 119,col 47)",
        "(line 120,col 9)-(line 120,col 49)",
        "(line 121,col 9)-(line 121,col 59)",
        "(line 122,col 9)-(line 122,col 59)",
        "(line 123,col 9)-(line 123,col 40)",
        "(line 124,col 9)-(line 124,col 47)",
        "(line 125,col 9)-(line 125,col 49)",
        "(line 126,col 9)-(line 126,col 59)",
        "(line 127,col 9)-(line 127,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testDateConstructor1()",
      "begin_line": 135,
      "end_line": 148,
      "comment": "\n     * In GMT, the 4.55:59.123pm on 21 Mar 2002 is\n     * java.util.Date(1016729759123L).  Use this to check the Millisecond\n     * constructor.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 52)",
        "(line 138,col 9)-(line 138,col 49)",
        "(line 139,col 9)-(line 139,col 73)",
        "(line 140,col 9)-(line 140,col 73)",
        "(line 142,col 9)-(line 142,col 47)",
        "(line 143,col 9)-(line 143,col 63)",
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 9)-(line 146,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testDateConstructor2()",
      "begin_line": 155,
      "end_line": 168,
      "comment": "\n     * In Tallinn, the 4.55:59.123pm on 21 Mar 2002 is\n     * java.util.Date(1016722559123L).  Use this to check the Millisecond\n     * constructor.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 63)",
        "(line 158,col 9)-(line 158,col 49)",
        "(line 159,col 9)-(line 159,col 73)",
        "(line 160,col 9)-(line 160,col 73)",
        "(line 162,col 9)-(line 162,col 47)",
        "(line 163,col 9)-(line 163,col 63)",
        "(line 165,col 9)-(line 165,col 47)",
        "(line 166,col 9)-(line 166,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testSerialization()",
      "begin_line": 173,
      "end_line": 195,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 43)",
        "(line 176,col 9)-(line 176,col 30)",
        "(line 178,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testHashcode()",
      "begin_line": 200,
      "end_line": 207,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 70)",
        "(line 202,col 9)-(line 202,col 70)",
        "(line 203,col 9)-(line 203,col 34)",
        "(line 204,col 9)-(line 204,col 34)",
        "(line 205,col 9)-(line 205,col 34)",
        "(line 206,col 9)-(line 206,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.test943985()",
      "begin_line": 213,
      "end_line": 220,
      "comment": "\n     * A test for bug report 943985 - the calculation for the middle\n     * millisecond is incorrect for odd milliseconds.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 64)",
        "(line 215,col 9)-(line 215,col 74)",
        "(line 216,col 9)-(line 216,col 73)",
        "(line 217,col 9)-(line 217,col 52)",
        "(line 218,col 9)-(line 218,col 74)",
        "(line 219,col 9)-(line 219,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testNotCloneable()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * The {@link Millisecond} class is immutable, so should not be\n     * {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 69)",
        "(line 228,col 9)-(line 228,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetFirstMillisecond()",
      "begin_line": 234,
      "end_line": 243,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 43)",
        "(line 236,col 9)-(line 236,col 37)",
        "(line 237,col 9)-(line 237,col 51)",
        "(line 238,col 9)-(line 238,col 67)",
        "(line 239,col 9)-(line 239,col 69)",
        "(line 240,col 9)-(line 240,col 62)",
        "(line 241,col 9)-(line 241,col 33)",
        "(line 242,col 9)-(line 242,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 248,
      "end_line": 263,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 69)",
        "(line 250,col 9)-(line 250,col 68)",
        "(line 251,col 9)-(line 251,col 49)",
        "(line 252,col 9)-(line 252,col 63)",
        "(line 255,col 9)-(line 255,col 29)",
        "(line 256,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 268,
      "end_line": 283,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 69)",
        "(line 270,col 9)-(line 270,col 75)",
        "(line 271,col 9)-(line 271,col 71)",
        "(line 272,col 9)-(line 272,col 69)",
        "(line 275,col 9)-(line 275,col 29)",
        "(line 276,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetLastMillisecond()",
      "begin_line": 288,
      "end_line": 297,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 43)",
        "(line 290,col 9)-(line 290,col 37)",
        "(line 291,col 9)-(line 291,col 51)",
        "(line 292,col 9)-(line 292,col 67)",
        "(line 293,col 9)-(line 293,col 66)",
        "(line 294,col 9)-(line 294,col 53)",
        "(line 295,col 9)-(line 295,col 33)",
        "(line 296,col 9)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 302,
      "end_line": 317,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 67)",
        "(line 304,col 9)-(line 304,col 68)",
        "(line 305,col 9)-(line 305,col 49)",
        "(line 306,col 9)-(line 306,col 62)",
        "(line 309,col 9)-(line 309,col 29)",
        "(line 310,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 322,
      "end_line": 337,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 70)",
        "(line 324,col 9)-(line 324,col 75)",
        "(line 325,col 9)-(line 325,col 71)",
        "(line 326,col 9)-(line 326,col 68)",
        "(line 329,col 9)-(line 329,col 29)",
        "(line 330,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetSerialIndex()",
      "begin_line": 342,
      "end_line": 348,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 66)",
        "(line 344,col 9)-(line 344,col 57)",
        "(line 345,col 9)-(line 345,col 54)",
        "(line 347,col 9)-(line 347,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testNext()",
      "begin_line": 353,
      "end_line": 365,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 70)",
        "(line 355,col 9)-(line 355,col 35)",
        "(line 356,col 9)-(line 356,col 74)",
        "(line 357,col 9)-(line 357,col 73)",
        "(line 358,col 9)-(line 358,col 78)",
        "(line 359,col 9)-(line 359,col 71)",
        "(line 360,col 9)-(line 360,col 64)",
        "(line 361,col 9)-(line 361,col 52)",
        "(line 362,col 9)-(line 362,col 46)",
        "(line 363,col 9)-(line 363,col 59)",
        "(line 364,col 9)-(line 364,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetStart()",
      "begin_line": 370,
      "end_line": 379,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 43)",
        "(line 372,col 9)-(line 372,col 40)",
        "(line 373,col 9)-(line 373,col 58)",
        "(line 374,col 9)-(line 374,col 55)",
        "(line 375,col 9)-(line 375,col 43)",
        "(line 376,col 9)-(line 376,col 69)",
        "(line 377,col 9)-(line 377,col 50)",
        "(line 378,col 9)-(line 378,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MillisecondTests.testGetEnd()",
      "begin_line": 384,
      "end_line": 393,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 43)",
        "(line 386,col 9)-(line 386,col 40)",
        "(line 387,col 9)-(line 387,col 58)",
        "(line 388,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 389,col 43)",
        "(line 390,col 9)-(line 390,col 69)",
        "(line 391,col 9)-(line 391,col 48)",
        "(line 392,col 9)-(line 392,col 33)"
      ]
    }
  ]
}