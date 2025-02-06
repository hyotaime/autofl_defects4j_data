{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/axis/junit/LogAxisTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogAxisTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 70,
      "end_line": 325,
      "comment": "\n * Tests for the {@link LogAxis} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.suite()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.LogAxisTests(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testCloning()",
      "begin_line": 93,
      "end_line": 105,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 26)",
        "(line 96,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 29)",
        "(line 103,col 9)-(line 103,col 51)",
        "(line 104,col 9)-(line 104,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testEquals()",
      "begin_line": 110,
      "end_line": 129,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 34)",
        "(line 115,col 9)-(line 115,col 24)",
        "(line 116,col 9)-(line 116,col 35)",
        "(line 117,col 9)-(line 117,col 24)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 123,col 34)",
        "(line 125,col 9)-(line 125,col 32)",
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 127,col 32)",
        "(line 128,col 9)-(line 128,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testHashCode()",
      "begin_line": 134,
      "end_line": 141,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 41)",
        "(line 136,col 9)-(line 136,col 41)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 138,col 9)-(line 138,col 31)",
        "(line 139,col 9)-(line 139,col 31)",
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testTranslateJava2DToValue()",
      "begin_line": 148,
      "end_line": 169,
      "comment": "\n     * Test the translation of Java2D values to data values.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 37)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 151,col 80)",
        "(line 152,col 9)-(line 152,col 75)",
        "(line 153,col 9)-(line 153,col 52)",
        "(line 154,col 9)-(line 154,col 76)",
        "(line 155,col 9)-(line 155,col 52)",
        "(line 156,col 9)-(line 156,col 74)",
        "(line 157,col 9)-(line 157,col 51)",
        "(line 158,col 9)-(line 158,col 77)",
        "(line 159,col 9)-(line 159,col 51)",
        "(line 160,col 9)-(line 160,col 31)",
        "(line 161,col 9)-(line 161,col 75)",
        "(line 162,col 9)-(line 162,col 52)",
        "(line 163,col 9)-(line 163,col 76)",
        "(line 164,col 9)-(line 164,col 52)",
        "(line 165,col 9)-(line 165,col 74)",
        "(line 166,col 9)-(line 166,col 52)",
        "(line 167,col 9)-(line 167,col 77)",
        "(line 168,col 9)-(line 168,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testSerialization()",
      "begin_line": 174,
      "end_line": 195,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 177,col 26)",
        "(line 179,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testAutoRange1()",
      "begin_line": 201,
      "end_line": 220,
      "comment": "\n     * A simple test for the auto-range calculation looking at a\n     * LogAxis used as the range axis for a CategoryPlot.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 70)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 205,col 9)-(line 214,col 10)",
        "(line 215,col 9)-(line 215,col 59)",
        "(line 216,col 9)-(line 216,col 45)",
        "(line 217,col 9)-(line 217,col 32)",
        "(line 218,col 9)-(line 218,col 57)",
        "(line 219,col 9)-(line 219,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testAutoRange3()",
      "begin_line": 227,
      "end_line": 247,
      "comment": "\n     * A simple test for the auto-range calculation looking at a\n     * NumberAxis used as the range axis for a CategoryPlot.  In this\n     * case, the original dataset is replaced with a new dataset.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 70)",
        "(line 229,col 9)-(line 229,col 53)",
        "(line 230,col 9)-(line 230,col 53)",
        "(line 231,col 9)-(line 233,col 23)",
        "(line 234,col 9)-(line 234,col 59)",
        "(line 235,col 9)-(line 235,col 45)",
        "(line 236,col 9)-(line 236,col 32)",
        "(line 237,col 9)-(line 237,col 71)",
        "(line 238,col 9)-(line 238,col 71)",
        "(line 241,col 9)-(line 241,col 71)",
        "(line 242,col 9)-(line 242,col 54)",
        "(line 243,col 9)-(line 243,col 55)",
        "(line 244,col 9)-(line 244,col 34)",
        "(line 245,col 9)-(line 245,col 71)",
        "(line 246,col 9)-(line 246,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testXYAutoRange1()",
      "begin_line": 253,
      "end_line": 275,
      "comment": "\n     * Checks that the auto-range for the domain axis on an XYPlot is\n     * working as expected.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 51)",
        "(line 255,col 9)-(line 255,col 29)",
        "(line 256,col 9)-(line 256,col 29)",
        "(line 257,col 9)-(line 257,col 29)",
        "(line 258,col 9)-(line 258,col 62)",
        "(line 259,col 9)-(line 259,col 34)",
        "(line 260,col 9)-(line 269,col 10)",
        "(line 270,col 9)-(line 270,col 47)",
        "(line 271,col 9)-(line 271,col 45)",
        "(line 272,col 9)-(line 272,col 32)",
        "(line 273,col 9)-(line 273,col 72)",
        "(line 274,col 9)-(line 274,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testXYAutoRange2()",
      "begin_line": 281,
      "end_line": 303,
      "comment": "\n     * Checks that the auto-range for the range axis on an XYPlot is\n     * working as expected.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 51)",
        "(line 283,col 9)-(line 283,col 29)",
        "(line 284,col 9)-(line 284,col 29)",
        "(line 285,col 9)-(line 285,col 29)",
        "(line 286,col 9)-(line 286,col 62)",
        "(line 287,col 9)-(line 287,col 34)",
        "(line 288,col 9)-(line 297,col 10)",
        "(line 298,col 9)-(line 298,col 47)",
        "(line 299,col 9)-(line 299,col 45)",
        "(line 300,col 9)-(line 300,col 32)",
        "(line 301,col 9)-(line 301,col 72)",
        "(line 302,col 9)-(line 302,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testSetLowerBound()",
      "begin_line": 308,
      "end_line": 316,
      "comment": "\n     * Some checks for the setLowerBound() method.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 40)",
        "(line 310,col 9)-(line 310,col 33)",
        "(line 311,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 312,col 57)",
        "(line 313,col 9)-(line 313,col 33)",
        "(line 314,col 9)-(line 314,col 58)",
        "(line 315,col 9)-(line 315,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testTickMarksVisibleDefault()",
      "begin_line": 321,
      "end_line": 324,
      "comment": "\n     * Checks the default value for the tickMarksVisible flag.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 47)",
        "(line 323,col 9)-(line 323,col 46)"
      ]
    }
  ]
}