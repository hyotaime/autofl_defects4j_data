{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/data/xy/junit/DefaultTableXYDatasetTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTableXYDatasetTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 64,
      "end_line": 248,
      "comment": "\n * Tests for the {@link DefaultTableXYDataset} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.DefaultTableXYDatasetTests.suite()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.junit.DefaultTableXYDatasetTests.DefaultTableXYDatasetTests(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.DefaultTableXYDatasetTests.testEquals()",
      "begin_line": 87,
      "end_line": 110,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 63)",
        "(line 90,col 9)-(line 90,col 60)",
        "(line 91,col 9)-(line 91,col 25)",
        "(line 92,col 9)-(line 92,col 25)",
        "(line 93,col 9)-(line 93,col 25)",
        "(line 95,col 9)-(line 95,col 63)",
        "(line 96,col 9)-(line 96,col 60)",
        "(line 97,col 9)-(line 97,col 25)",
        "(line 98,col 9)-(line 98,col 25)",
        "(line 99,col 9)-(line 99,col 25)",
        "(line 101,col 9)-(line 101,col 34)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 104,col 9)-(line 104,col 25)",
        "(line 105,col 9)-(line 105,col 35)",
        "(line 107,col 9)-(line 107,col 25)",
        "(line 108,col 9)-(line 108,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.DefaultTableXYDatasetTests.testCloning()",
      "begin_line": 115,
      "end_line": 135,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 63)",
        "(line 117,col 9)-(line 117,col 60)",
        "(line 118,col 9)-(line 118,col 25)",
        "(line 119,col 9)-(line 119,col 25)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 29)",
        "(line 130,col 9)-(line 130,col 51)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 133,col 9)-(line 133,col 25)",
        "(line 134,col 9)-(line 134,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.DefaultTableXYDatasetTests.testPublicCloneable()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * Verify that this class implements {@link PublicCloneable}.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 63)",
        "(line 142,col 9)-(line 142,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.DefaultTableXYDatasetTests.testSerialization()",
      "begin_line": 148,
      "end_line": 174,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 63)",
        "(line 151,col 9)-(line 151,col 60)",
        "(line 152,col 9)-(line 152,col 25)",
        "(line 153,col 9)-(line 153,col 25)",
        "(line 154,col 9)-(line 154,col 25)",
        "(line 156,col 9)-(line 156,col 40)",
        "(line 158,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.DefaultTableXYDatasetTests.testAddSeries()",
      "begin_line": 183,
      "end_line": 218,
      "comment": "\n     * This is a test for bug 1312066 - adding a new series should trigger a\n     * recalculation of the interval width, if it is being automatically\n     * calculated.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 63)",
        "(line 185,col 9)-(line 185,col 30)",
        "(line 186,col 9)-(line 186,col 60)",
        "(line 187,col 9)-(line 187,col 25)",
        "(line 188,col 9)-(line 188,col 25)",
        "(line 189,col 9)-(line 189,col 25)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 191,col 9)-(line 191,col 55)",
        "(line 192,col 9)-(line 192,col 60)",
        "(line 193,col 9)-(line 193,col 60)",
        "(line 194,col 9)-(line 194,col 58)",
        "(line 195,col 9)-(line 195,col 58)",
        "(line 198,col 9)-(line 198,col 60)",
        "(line 199,col 9)-(line 199,col 25)",
        "(line 200,col 9)-(line 200,col 25)",
        "(line 201,col 9)-(line 201,col 25)",
        "(line 203,col 9)-(line 203,col 55)",
        "(line 204,col 9)-(line 204,col 55)",
        "(line 205,col 9)-(line 205,col 55)",
        "(line 206,col 9)-(line 206,col 55)",
        "(line 208,col 9)-(line 208,col 61)",
        "(line 209,col 9)-(line 209,col 61)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 211,col 59)",
        "(line 214,col 9)-(line 214,col 61)",
        "(line 215,col 9)-(line 215,col 61)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.junit.DefaultTableXYDatasetTests.testGetSeries()",
      "begin_line": 223,
      "end_line": 246,
      "comment": "\n     * Some basic checks for the getSeries() method.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 63)",
        "(line 225,col 9)-(line 225,col 60)",
        "(line 226,col 9)-(line 226,col 25)",
        "(line 227,col 9)-(line 227,col 59)",
        "(line 229,col 9)-(line 229,col 29)",
        "(line 230,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 25)",
        "(line 238,col 9)-(line 238,col 21)",
        "(line 239,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 25)"
      ]
    }
  ]
}