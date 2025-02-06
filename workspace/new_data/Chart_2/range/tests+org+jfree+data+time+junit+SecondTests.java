{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/data/time/junit/SecondTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 74,
      "end_line": 374,
      "comment": "\n * Tests for the {@link Second} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.suite()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.SecondTests.SecondTests(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.setUp()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testEqualsSelf()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Test that a Second instance is equal to itself.\n     *\n     * SourceForge Bug ID: 558850.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 37)",
        "(line 108,col 9)-(line 108,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testEquals()",
      "begin_line": 114,
      "end_line": 124,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 59)",
        "(line 116,col 9)-(line 116,col 40)",
        "(line 117,col 9)-(line 117,col 47)",
        "(line 118,col 9)-(line 118,col 49)",
        "(line 119,col 9)-(line 119,col 59)",
        "(line 120,col 9)-(line 120,col 40)",
        "(line 121,col 9)-(line 121,col 47)",
        "(line 122,col 9)-(line 122,col 49)",
        "(line 123,col 9)-(line 123,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testDateConstructor1()",
      "begin_line": 130,
      "end_line": 143,
      "comment": "\n     * In GMT, the 4.55:59pm on 21 Mar 2002 is java.util.Date(1016729759000L).\n     * Use this to check the Second constructor.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 52)",
        "(line 133,col 9)-(line 133,col 49)",
        "(line 134,col 9)-(line 134,col 63)",
        "(line 135,col 9)-(line 135,col 63)",
        "(line 137,col 9)-(line 137,col 41)",
        "(line 138,col 9)-(line 138,col 63)",
        "(line 140,col 9)-(line 140,col 41)",
        "(line 141,col 9)-(line 141,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testDateConstructor2()",
      "begin_line": 149,
      "end_line": 162,
      "comment": "\n     * In Chicago, the 4.55:59pm on 21 Mar 2002 is\n     * java.util.Date(1016751359000L). Use this to check the Second constructor.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 64)",
        "(line 152,col 9)-(line 152,col 49)",
        "(line 153,col 9)-(line 153,col 63)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 156,col 9)-(line 156,col 41)",
        "(line 157,col 9)-(line 157,col 63)",
        "(line 159,col 9)-(line 159,col 41)",
        "(line 160,col 9)-(line 160,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testSerialization()",
      "begin_line": 167,
      "end_line": 189,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 33)",
        "(line 170,col 9)-(line 170,col 25)",
        "(line 172,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testHashcode()",
      "begin_line": 194,
      "end_line": 201,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 54)",
        "(line 196,col 9)-(line 196,col 54)",
        "(line 197,col 9)-(line 197,col 34)",
        "(line 198,col 9)-(line 198,col 31)",
        "(line 199,col 9)-(line 199,col 31)",
        "(line 200,col 9)-(line 200,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testNotCloneable()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * The {@link Second} class is immutable, so should not be\n     * {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 53)",
        "(line 209,col 9)-(line 209,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetFirstMillisecond()",
      "begin_line": 215,
      "end_line": 224,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 43)",
        "(line 217,col 9)-(line 217,col 37)",
        "(line 218,col 9)-(line 218,col 51)",
        "(line 219,col 9)-(line 219,col 67)",
        "(line 220,col 9)-(line 220,col 54)",
        "(line 221,col 9)-(line 221,col 62)",
        "(line 222,col 9)-(line 222,col 33)",
        "(line 223,col 9)-(line 223,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 229,
      "end_line": 244,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 54)",
        "(line 231,col 9)-(line 231,col 68)",
        "(line 232,col 9)-(line 232,col 49)",
        "(line 233,col 9)-(line 233,col 63)",
        "(line 236,col 9)-(line 236,col 29)",
        "(line 237,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 249,
      "end_line": 264,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 54)",
        "(line 251,col 9)-(line 251,col 75)",
        "(line 252,col 9)-(line 252,col 71)",
        "(line 253,col 9)-(line 253,col 69)",
        "(line 256,col 9)-(line 256,col 29)",
        "(line 257,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetLastMillisecond()",
      "begin_line": 269,
      "end_line": 278,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 271,col 37)",
        "(line 272,col 9)-(line 272,col 51)",
        "(line 273,col 9)-(line 273,col 67)",
        "(line 274,col 9)-(line 274,col 51)",
        "(line 275,col 9)-(line 275,col 53)",
        "(line 276,col 9)-(line 276,col 33)",
        "(line 277,col 9)-(line 277,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 283,
      "end_line": 298,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 52)",
        "(line 285,col 9)-(line 285,col 68)",
        "(line 286,col 9)-(line 286,col 49)",
        "(line 287,col 9)-(line 287,col 62)",
        "(line 290,col 9)-(line 290,col 29)",
        "(line 291,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 303,
      "end_line": 318,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 55)",
        "(line 305,col 9)-(line 305,col 75)",
        "(line 306,col 9)-(line 306,col 71)",
        "(line 307,col 9)-(line 307,col 68)",
        "(line 310,col 9)-(line 310,col 29)",
        "(line 311,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetSerialIndex()",
      "begin_line": 323,
      "end_line": 328,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 51)",
        "(line 325,col 9)-(line 325,col 54)",
        "(line 326,col 9)-(line 326,col 44)",
        "(line 327,col 9)-(line 327,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testNext()",
      "begin_line": 333,
      "end_line": 344,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 55)",
        "(line 335,col 9)-(line 335,col 30)",
        "(line 336,col 9)-(line 336,col 62)",
        "(line 337,col 9)-(line 337,col 61)",
        "(line 338,col 9)-(line 338,col 66)",
        "(line 339,col 9)-(line 339,col 59)",
        "(line 340,col 9)-(line 340,col 52)",
        "(line 341,col 9)-(line 341,col 40)",
        "(line 342,col 9)-(line 342,col 49)",
        "(line 343,col 9)-(line 343,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetStart()",
      "begin_line": 349,
      "end_line": 358,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 43)",
        "(line 351,col 9)-(line 351,col 40)",
        "(line 352,col 9)-(line 352,col 58)",
        "(line 353,col 9)-(line 353,col 55)",
        "(line 354,col 9)-(line 354,col 41)",
        "(line 355,col 9)-(line 355,col 54)",
        "(line 356,col 9)-(line 356,col 50)",
        "(line 357,col 9)-(line 357,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.SecondTests.testGetEnd()",
      "begin_line": 363,
      "end_line": 372,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 43)",
        "(line 365,col 9)-(line 365,col 40)",
        "(line 366,col 9)-(line 366,col 58)",
        "(line 367,col 9)-(line 367,col 55)",
        "(line 368,col 9)-(line 368,col 43)",
        "(line 369,col 9)-(line 369,col 54)",
        "(line 370,col 9)-(line 370,col 48)",
        "(line 371,col 9)-(line 371,col 33)"
      ]
    }
  ]
}