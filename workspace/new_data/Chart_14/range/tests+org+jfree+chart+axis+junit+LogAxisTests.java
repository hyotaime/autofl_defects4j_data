{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/chart/axis/junit/LogAxisTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogAxisTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 69,
      "end_line": 327,
      "comment": "\n * Tests for the {@link LogAxis} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.suite()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.LogAxisTests(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testCloning()",
      "begin_line": 92,
      "end_line": 104,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 26)",
        "(line 95,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 102,col 51)",
        "(line 103,col 9)-(line 103,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testEquals()",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testHashCode()",
      "begin_line": 136,
      "end_line": 143,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 41)",
        "(line 138,col 9)-(line 138,col 41)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 140,col 31)",
        "(line 141,col 9)-(line 141,col 31)",
        "(line 142,col 9)-(line 142,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testTranslateJava2DToValue()",
      "begin_line": 150,
      "end_line": 171,
      "comment": "\n     * Test the translation of Java2D values to data values.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 37)",
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 153,col 80)",
        "(line 154,col 9)-(line 154,col 75)",
        "(line 155,col 9)-(line 155,col 52)",
        "(line 156,col 9)-(line 156,col 76)",
        "(line 157,col 9)-(line 157,col 52)",
        "(line 158,col 9)-(line 158,col 74)",
        "(line 159,col 9)-(line 159,col 51)",
        "(line 160,col 9)-(line 160,col 77)",
        "(line 161,col 9)-(line 161,col 51)",
        "(line 162,col 9)-(line 162,col 31)",
        "(line 163,col 9)-(line 163,col 75)",
        "(line 164,col 9)-(line 164,col 52)",
        "(line 165,col 9)-(line 165,col 76)",
        "(line 166,col 9)-(line 166,col 52)",
        "(line 167,col 9)-(line 167,col 74)",
        "(line 168,col 9)-(line 168,col 52)",
        "(line 169,col 9)-(line 169,col 77)",
        "(line 170,col 9)-(line 170,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testSerialization()",
      "begin_line": 176,
      "end_line": 197,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 46)",
        "(line 179,col 9)-(line 179,col 26)",
        "(line 181,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testAutoRange1()",
      "begin_line": 203,
      "end_line": 222,
      "comment": "\n     * A simple test for the auto-range calculation looking at a\n     * LogAxis used as the range axis for a CategoryPlot.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 70)",
        "(line 205,col 9)-(line 205,col 53)",
        "(line 206,col 9)-(line 206,col 53)",
        "(line 207,col 9)-(line 216,col 10)",
        "(line 217,col 9)-(line 217,col 59)",
        "(line 218,col 9)-(line 218,col 45)",
        "(line 219,col 9)-(line 219,col 32)",
        "(line 220,col 9)-(line 220,col 57)",
        "(line 221,col 9)-(line 221,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testAutoRange3()",
      "begin_line": 229,
      "end_line": 249,
      "comment": "\n     * A simple test for the auto-range calculation looking at a\n     * NumberAxis used as the range axis for a CategoryPlot.  In this\n     * case, the original dataset is replaced with a new dataset.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 70)",
        "(line 231,col 9)-(line 231,col 53)",
        "(line 232,col 9)-(line 232,col 53)",
        "(line 233,col 9)-(line 235,col 23)",
        "(line 236,col 9)-(line 236,col 59)",
        "(line 237,col 9)-(line 237,col 45)",
        "(line 238,col 9)-(line 238,col 32)",
        "(line 239,col 9)-(line 239,col 71)",
        "(line 240,col 9)-(line 240,col 71)",
        "(line 243,col 9)-(line 243,col 71)",
        "(line 244,col 9)-(line 244,col 54)",
        "(line 245,col 9)-(line 245,col 55)",
        "(line 246,col 9)-(line 246,col 34)",
        "(line 247,col 9)-(line 247,col 71)",
        "(line 248,col 9)-(line 248,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testXYAutoRange1()",
      "begin_line": 255,
      "end_line": 277,
      "comment": "\n     * Checks that the auto-range for the domain axis on an XYPlot is\n     * working as expected.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 51)",
        "(line 257,col 9)-(line 257,col 29)",
        "(line 258,col 9)-(line 258,col 29)",
        "(line 259,col 9)-(line 259,col 29)",
        "(line 260,col 9)-(line 260,col 62)",
        "(line 261,col 9)-(line 261,col 34)",
        "(line 262,col 9)-(line 271,col 10)",
        "(line 272,col 9)-(line 272,col 47)",
        "(line 273,col 9)-(line 273,col 45)",
        "(line 274,col 9)-(line 274,col 32)",
        "(line 275,col 9)-(line 275,col 72)",
        "(line 276,col 9)-(line 276,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testXYAutoRange2()",
      "begin_line": 283,
      "end_line": 305,
      "comment": "\n     * Checks that the auto-range for the range axis on an XYPlot is\n     * working as expected.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 51)",
        "(line 285,col 9)-(line 285,col 29)",
        "(line 286,col 9)-(line 286,col 29)",
        "(line 287,col 9)-(line 287,col 29)",
        "(line 288,col 9)-(line 288,col 62)",
        "(line 289,col 9)-(line 289,col 34)",
        "(line 290,col 9)-(line 299,col 10)",
        "(line 300,col 9)-(line 300,col 47)",
        "(line 301,col 9)-(line 301,col 45)",
        "(line 302,col 9)-(line 302,col 32)",
        "(line 303,col 9)-(line 303,col 72)",
        "(line 304,col 9)-(line 304,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testSetLowerBound()",
      "begin_line": 310,
      "end_line": 318,
      "comment": "\n     * Some checks for the setLowerBound() method.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 40)",
        "(line 312,col 9)-(line 312,col 33)",
        "(line 313,col 9)-(line 313,col 32)",
        "(line 314,col 9)-(line 314,col 57)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 316,col 9)-(line 316,col 58)",
        "(line 317,col 9)-(line 317,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogAxisTests.testTickMarksVisibleDefault()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\n     * Checks the default value for the tickMarksVisible flag.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 47)",
        "(line 325,col 9)-(line 325,col 46)"
      ]
    }
  ]
}