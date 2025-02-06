{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/data/junit/ComparableObjectSeriesTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparableObjectSeriesTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 61,
      "end_line": 251,
      "comment": "\n * Tests for the {@link ComparableObjectSeries} class.\n "
    },
    {
      "type": "class_interface",
      "name": "MyComparableObjectSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.ComparableObjectSeries"
      ],
      "begin_line": 63,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.MyComparableObjectSeries.MyComparableObjectSeries(java.lang.Comparable)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n         * Creates a new instance.\n         * \n         * @param key  the series key.\n         ",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.MyComparableObjectSeries.MyComparableObjectSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n         * Creates a new instance.\n         * \n         * @param key  the series key.\n         * @param autoSort  automatically sort by x-value?\n         * @param allowDuplicateXValues  allow duplicate values?\n         ",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.MyComparableObjectSeries.add(java.lang.Comparable, java.lang.Object)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.MyComparableObjectSeries.remove(java.lang.Comparable)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.suite()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.ComparableObjectSeriesTests(java.lang.String)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.testConstructor1()",
      "begin_line": 113,
      "end_line": 131,
      "comment": "\n     * Some checks for the constructor.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 69)",
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 116,col 40)",
        "(line 117,col 9)-(line 117,col 50)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 120,col 66)",
        "(line 123,col 9)-(line 123,col 29)",
        "(line 124,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.testEquals()",
      "begin_line": 136,
      "end_line": 177,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 72)",
        "(line 138,col 9)-(line 138,col 72)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 140,col 34)",
        "(line 143,col 9)-(line 143,col 47)",
        "(line 144,col 9)-(line 144,col 35)",
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 9)-(line 146,col 34)",
        "(line 149,col 9)-(line 149,col 60)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 151,col 60)",
        "(line 152,col 9)-(line 152,col 34)",
        "(line 155,col 9)-(line 155,col 61)",
        "(line 156,col 9)-(line 156,col 35)",
        "(line 157,col 9)-(line 157,col 61)",
        "(line 158,col 9)-(line 158,col 34)",
        "(line 161,col 9)-(line 161,col 38)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 163,col 38)",
        "(line 164,col 9)-(line 164,col 34)",
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 168,col 35)",
        "(line 169,col 9)-(line 169,col 38)",
        "(line 170,col 9)-(line 170,col 34)",
        "(line 173,col 9)-(line 173,col 34)",
        "(line 174,col 9)-(line 174,col 35)",
        "(line 175,col 9)-(line 175,col 34)",
        "(line 176,col 9)-(line 176,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.testCloning()",
      "begin_line": 182,
      "end_line": 195,
      "comment": "\n     * Some checks for the clone() method.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 72)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 185,col 43)",
        "(line 186,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 29)",
        "(line 193,col 9)-(line 193,col 51)",
        "(line 194,col 9)-(line 194,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.testSerialization()",
      "begin_line": 200,
      "end_line": 219,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 72)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 203,col 9)-(line 203,col 43)",
        "(line 204,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.junit.ComparableObjectSeriesTests.testHashCode()",
      "begin_line": 224,
      "end_line": 249,
      "comment": "\n     * Some simple checks for the hashCode() method.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 75)",
        "(line 226,col 9)-(line 226,col 75)",
        "(line 227,col 9)-(line 227,col 29)",
        "(line 228,col 9)-(line 228,col 51)",
        "(line 230,col 9)-(line 230,col 25)",
        "(line 231,col 9)-(line 231,col 25)",
        "(line 232,col 9)-(line 232,col 29)",
        "(line 233,col 9)-(line 233,col 51)",
        "(line 235,col 9)-(line 235,col 26)",
        "(line 236,col 9)-(line 236,col 26)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 238,col 9)-(line 238,col 51)",
        "(line 240,col 9)-(line 240,col 25)",
        "(line 241,col 9)-(line 241,col 25)",
        "(line 242,col 9)-(line 242,col 29)",
        "(line 243,col 9)-(line 243,col 51)",
        "(line 245,col 9)-(line 245,col 25)",
        "(line 246,col 9)-(line 246,col 25)",
        "(line 247,col 9)-(line 247,col 29)",
        "(line 248,col 9)-(line 248,col 51)"
      ]
    }
  ]
}