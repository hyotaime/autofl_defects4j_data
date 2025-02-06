{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/data/statistics/junit/HistogramDatasetTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HistogramDatasetTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 61,
      "end_line": 220,
      "comment": "\n * Tests for the {@link HistogramDataset} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.suite()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.HistogramDatasetTests(java.lang.String)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.testBins()",
      "begin_line": 86,
      "end_line": 95,
      "comment": "\n     * Some checks that the correct values are assigned to bins.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 73)",
        "(line 88,col 9)-(line 88,col 53)",
        "(line 89,col 9)-(line 89,col 44)",
        "(line 90,col 9)-(line 90,col 55)",
        "(line 91,col 9)-(line 91,col 55)",
        "(line 92,col 9)-(line 92,col 55)",
        "(line 93,col 9)-(line 93,col 55)",
        "(line 94,col 9)-(line 94,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.testEquals()",
      "begin_line": 100,
      "end_line": 111,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 73)",
        "(line 103,col 9)-(line 103,col 53)",
        "(line 104,col 9)-(line 104,col 44)",
        "(line 105,col 9)-(line 105,col 53)",
        "(line 106,col 9)-(line 106,col 44)",
        "(line 108,col 9)-(line 108,col 34)",
        "(line 109,col 9)-(line 109,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.testCloning()",
      "begin_line": 116,
      "end_line": 130,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 73)",
        "(line 118,col 9)-(line 118,col 53)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 35)",
        "(line 121,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 128,col 51)",
        "(line 129,col 9)-(line 129,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.testSerialization()",
      "begin_line": 135,
      "end_line": 157,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 73)",
        "(line 137,col 9)-(line 137,col 53)",
        "(line 138,col 9)-(line 138,col 44)",
        "(line 139,col 9)-(line 139,col 35)",
        "(line 141,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.testGetSeriesKey()",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\n     * A test for a bug reported in the forum where the series name isn\u0027t being\n     * returned correctly.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 73)",
        "(line 165,col 9)-(line 165,col 53)",
        "(line 166,col 9)-(line 166,col 44)",
        "(line 167,col 9)-(line 167,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.testAddSeries()",
      "begin_line": 173,
      "end_line": 184,
      "comment": "\n     * Some checks for the addSeries() method.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 73)",
        "(line 175,col 9)-(line 175,col 52)",
        "(line 176,col 9)-(line 176,col 47)",
        "(line 177,col 9)-(line 177,col 59)",
        "(line 178,col 9)-(line 178,col 57)",
        "(line 179,col 9)-(line 179,col 54)",
        "(line 181,col 9)-(line 181,col 59)",
        "(line 182,col 9)-(line 182,col 57)",
        "(line 183,col 9)-(line 183,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.testBinBoundaries()",
      "begin_line": 189,
      "end_line": 201,
      "comment": "\n     * This test is derived from a reported bug.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 52)",
        "(line 191,col 9)-(line 191,col 24)",
        "(line 192,col 9)-(line 192,col 46)",
        "(line 193,col 9)-(line 193,col 45)",
        "(line 194,col 9)-(line 194,col 52)",
        "(line 195,col 9)-(line 195,col 58)",
        "(line 196,col 9)-(line 196,col 56)",
        "(line 197,col 9)-(line 197,col 56)",
        "(line 198,col 9)-(line 198,col 56)",
        "(line 199,col 9)-(line 199,col 57)",
        "(line 200,col 9)-(line 200,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.junit.HistogramDatasetTests.test1553088()",
      "begin_line": 207,
      "end_line": 218,
      "comment": "\n     * Some checks for bug 1553088.  An IndexOutOfBoundsException is thrown \n     * when a data value is *very* close to the upper limit of the last bin.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 62)",
        "(line 209,col 9)-(line 209,col 52)",
        "(line 210,col 9)-(line 210,col 48)",
        "(line 211,col 9)-(line 211,col 60)",
        "(line 212,col 9)-(line 212,col 58)",
        "(line 213,col 9)-(line 213,col 54)",
        "(line 215,col 9)-(line 215,col 60)",
        "(line 216,col 9)-(line 216,col 57)",
        "(line 217,col 9)-(line 217,col 54)"
      ]
    }
  ]
}