{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/renderer/category/junit/LineAndShapeRendererTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LineAndShapeRendererTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 69,
      "end_line": 310,
      "comment": "\n * Tests for the {@link LineAndShapeRenderer} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.suite()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.LineAndShapeRendererTests(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.testEquals()",
      "begin_line": 92,
      "end_line": 143,
      "comment": "\n     * Test that the equals() method distinguishes all fields.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 61)",
        "(line 95,col 9)-(line 95,col 61)",
        "(line 96,col 9)-(line 96,col 29)",
        "(line 98,col 9)-(line 98,col 58)",
        "(line 99,col 9)-(line 99,col 35)",
        "(line 100,col 9)-(line 100,col 57)",
        "(line 101,col 9)-(line 101,col 34)",
        "(line 103,col 9)-(line 103,col 42)",
        "(line 104,col 9)-(line 104,col 35)",
        "(line 105,col 9)-(line 105,col 42)",
        "(line 106,col 9)-(line 106,col 34)",
        "(line 108,col 9)-(line 108,col 60)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 110,col 59)",
        "(line 111,col 9)-(line 111,col 34)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 114,col 35)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 116,col 9)-(line 116,col 34)",
        "(line 118,col 9)-(line 118,col 42)",
        "(line 119,col 9)-(line 119,col 35)",
        "(line 120,col 9)-(line 120,col 42)",
        "(line 121,col 9)-(line 121,col 34)",
        "(line 123,col 9)-(line 123,col 38)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 34)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 135,col 9)-(line 135,col 36)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 138,col 9)-(line 138,col 31)",
        "(line 139,col 9)-(line 139,col 35)",
        "(line 140,col 9)-(line 140,col 31)",
        "(line 141,col 9)-(line 141,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.testHashcode()",
      "begin_line": 148,
      "end_line": 155,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 61)",
        "(line 150,col 9)-(line 150,col 61)",
        "(line 151,col 9)-(line 151,col 34)",
        "(line 152,col 9)-(line 152,col 31)",
        "(line 153,col 9)-(line 153,col 31)",
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.testCloning()",
      "begin_line": 160,
      "end_line": 175,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 61)",
        "(line 162,col 9)-(line 162,col 39)",
        "(line 163,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 29)",
        "(line 170,col 9)-(line 170,col 51)",
        "(line 171,col 9)-(line 171,col 34)",
        "(line 173,col 9)-(line 173,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.testPublicCloneable()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Check that this class implements PublicCloneable.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 61)",
        "(line 182,col 9)-(line 182,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.checkIndependence(org.jfree.chart.renderer.category.LineAndShapeRenderer, org.jfree.chart.renderer.category.LineAndShapeRenderer)",
      "begin_line": 193,
      "end_line": 259,
      "comment": "\n     * Checks that the two renderers are equal but independent of one another.\n     *\n     * @param r1  renderer 1.\n     * @param r2  renderer 2.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 202,col 9)-(line 202,col 58)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 57)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 42)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 42)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 60)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 59)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 43)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 43)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 43)",
        "(line 239,col 9)-(line 239,col 42)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 43)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 38)",
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 38)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.testSerialization()",
      "begin_line": 264,
      "end_line": 285,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 61)",
        "(line 267,col 9)-(line 267,col 39)",
        "(line 269,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LineAndShapeRendererTests.testGetLegendItemSeriesIndex()",
      "begin_line": 291,
      "end_line": 308,
      "comment": "\n     * A check for the datasetIndex and seriesIndex fields in the LegendItem\n     * returned by the getLegendItem() method.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 71)",
        "(line 293,col 9)-(line 293,col 44)",
        "(line 294,col 9)-(line 294,col 44)",
        "(line 295,col 9)-(line 295,col 71)",
        "(line 296,col 9)-(line 296,col 44)",
        "(line 297,col 9)-(line 297,col 44)",
        "(line 298,col 9)-(line 298,col 44)",
        "(line 299,col 9)-(line 299,col 60)",
        "(line 300,col 9)-(line 301,col 40)",
        "(line 302,col 9)-(line 302,col 37)",
        "(line 303,col 32)-(line 303,col 52)",
        "(line 304,col 9)-(line 304,col 46)",
        "(line 305,col 9)-(line 305,col 42)",
        "(line 306,col 9)-(line 306,col 46)",
        "(line 307,col 9)-(line 307,col 45)"
      ]
    }
  ]
}