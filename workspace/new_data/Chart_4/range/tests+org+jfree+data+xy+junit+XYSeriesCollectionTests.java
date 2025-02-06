{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/data/xy/junit/XYSeriesCollectionTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYSeriesCollectionTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 67,
      "end_line": 385,
      "comment": "\n * Tests for the {@link XYSeriesCollection} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.suite()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.XYSeriesCollectionTests(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testConstructor()",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\n     * Some checks for the constructor.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 59)",
        "(line 94,col 9)-(line 94,col 47)",
        "(line 95,col 9)-(line 95,col 60)",
        "(line 96,col 9)-(line 96,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testEquals()",
      "begin_line": 102,
      "end_line": 134,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 45)",
        "(line 104,col 9)-(line 104,col 25)",
        "(line 105,col 9)-(line 105,col 57)",
        "(line 106,col 9)-(line 106,col 25)",
        "(line 107,col 9)-(line 107,col 45)",
        "(line 108,col 9)-(line 108,col 25)",
        "(line 109,col 9)-(line 109,col 57)",
        "(line 110,col 9)-(line 110,col 25)",
        "(line 111,col 9)-(line 111,col 34)",
        "(line 112,col 9)-(line 112,col 34)",
        "(line 114,col 9)-(line 114,col 51)",
        "(line 115,col 9)-(line 115,col 35)",
        "(line 116,col 9)-(line 116,col 51)",
        "(line 117,col 9)-(line 117,col 34)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 120,col 35)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 34)",
        "(line 124,col 9)-(line 124,col 43)",
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 126,col 43)",
        "(line 127,col 9)-(line 127,col 34)",
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 131,col 30)",
        "(line 132,col 9)-(line 132,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testCloning()",
      "begin_line": 139,
      "end_line": 158,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 141,col 25)",
        "(line 142,col 9)-(line 142,col 57)",
        "(line 143,col 9)-(line 143,col 25)",
        "(line 144,col 9)-(line 144,col 37)",
        "(line 145,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 29)",
        "(line 152,col 9)-(line 152,col 51)",
        "(line 153,col 9)-(line 153,col 34)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testPublicCloneable()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Verify that this class implements {@link PublicCloneable}.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 57)",
        "(line 165,col 9)-(line 165,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testSerialization()",
      "begin_line": 171,
      "end_line": 193,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 45)",
        "(line 173,col 9)-(line 173,col 25)",
        "(line 174,col 9)-(line 174,col 57)",
        "(line 175,col 9)-(line 175,col 25)",
        "(line 176,col 9)-(line 176,col 37)",
        "(line 178,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.test1170825()",
      "begin_line": 198,
      "end_line": 211,
      "comment": "\n     * A test for bug report 1170825.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 46)",
        "(line 200,col 9)-(line 200,col 62)",
        "(line 201,col 9)-(line 201,col 30)",
        "(line 202,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testGetSeries()",
      "begin_line": 216,
      "end_line": 239,
      "comment": "\n     * Some basic checks for the getSeries() method.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 56)",
        "(line 218,col 9)-(line 218,col 41)",
        "(line 219,col 9)-(line 219,col 24)",
        "(line 220,col 9)-(line 220,col 52)",
        "(line 222,col 9)-(line 222,col 29)",
        "(line 223,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 25)",
        "(line 231,col 9)-(line 231,col 21)",
        "(line 232,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testGetSeriesByKey()",
      "begin_line": 244,
      "end_line": 267,
      "comment": "\n     * Some checks for the getSeries(Comparable) method.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 56)",
        "(line 246,col 9)-(line 246,col 41)",
        "(line 247,col 9)-(line 247,col 24)",
        "(line 248,col 9)-(line 248,col 55)",
        "(line 250,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 259,col 9)-(line 259,col 21)",
        "(line 260,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testRemoveSeries()",
      "begin_line": 272,
      "end_line": 297,
      "comment": "\n     * Some basic checks for the removeSeries() method.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 56)",
        "(line 274,col 9)-(line 274,col 41)",
        "(line 275,col 9)-(line 275,col 24)",
        "(line 276,col 9)-(line 276,col 26)",
        "(line 277,col 9)-(line 277,col 44)",
        "(line 278,col 9)-(line 278,col 24)",
        "(line 280,col 9)-(line 280,col 29)",
        "(line 281,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 25)",
        "(line 289,col 9)-(line 289,col 21)",
        "(line 290,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testIndexOf()",
      "begin_line": 302,
      "end_line": 323,
      "comment": "\n     * Some tests for the indexOf() method.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 41)",
        "(line 304,col 9)-(line 304,col 41)",
        "(line 305,col 9)-(line 305,col 62)",
        "(line 306,col 9)-(line 306,col 46)",
        "(line 307,col 9)-(line 307,col 46)",
        "(line 309,col 9)-(line 309,col 30)",
        "(line 310,col 9)-(line 310,col 45)",
        "(line 311,col 9)-(line 311,col 46)",
        "(line 313,col 9)-(line 313,col 30)",
        "(line 314,col 9)-(line 314,col 45)",
        "(line 315,col 9)-(line 315,col 45)",
        "(line 317,col 9)-(line 317,col 33)",
        "(line 318,col 9)-(line 318,col 46)",
        "(line 319,col 9)-(line 319,col 45)",
        "(line 321,col 9)-(line 321,col 42)",
        "(line 322,col 9)-(line 322,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testGetDomainBounds()",
      "begin_line": 328,
      "end_line": 353,
      "comment": "\n     * Some checks for the getDomainBounds() method.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 62)",
        "(line 330,col 9)-(line 330,col 49)",
        "(line 331,col 9)-(line 331,col 22)",
        "(line 332,col 9)-(line 332,col 42)",
        "(line 333,col 9)-(line 333,col 22)",
        "(line 335,col 9)-(line 335,col 45)",
        "(line 336,col 9)-(line 336,col 34)",
        "(line 337,col 9)-(line 337,col 43)",
        "(line 338,col 9)-(line 338,col 22)",
        "(line 339,col 9)-(line 339,col 42)",
        "(line 340,col 9)-(line 340,col 22)",
        "(line 342,col 9)-(line 342,col 29)",
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 344,col 45)",
        "(line 345,col 9)-(line 345,col 42)",
        "(line 346,col 9)-(line 346,col 45)",
        "(line 348,col 9)-(line 348,col 31)",
        "(line 349,col 9)-(line 349,col 43)",
        "(line 350,col 9)-(line 350,col 46)",
        "(line 351,col 9)-(line 351,col 42)",
        "(line 352,col 9)-(line 352,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.XYSeriesCollectionTests.testGetRangeBounds()",
      "begin_line": 358,
      "end_line": 383,
      "comment": "\n     * Some checks for the getRangeBounds() method.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 62)",
        "(line 360,col 9)-(line 360,col 48)",
        "(line 361,col 9)-(line 361,col 22)",
        "(line 362,col 9)-(line 362,col 41)",
        "(line 363,col 9)-(line 363,col 22)",
        "(line 365,col 9)-(line 365,col 45)",
        "(line 366,col 9)-(line 366,col 34)",
        "(line 367,col 9)-(line 367,col 42)",
        "(line 368,col 9)-(line 368,col 22)",
        "(line 369,col 9)-(line 369,col 41)",
        "(line 370,col 9)-(line 370,col 22)",
        "(line 372,col 9)-(line 372,col 29)",
        "(line 373,col 9)-(line 373,col 42)",
        "(line 374,col 9)-(line 374,col 45)",
        "(line 375,col 9)-(line 375,col 41)",
        "(line 376,col 9)-(line 376,col 45)",
        "(line 378,col 9)-(line 378,col 31)",
        "(line 379,col 9)-(line 379,col 42)",
        "(line 380,col 9)-(line 380,col 46)",
        "(line 381,col 9)-(line 381,col 41)",
        "(line 382,col 9)-(line 382,col 46)"
      ]
    }
  ]
}