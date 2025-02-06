{
  "filepath": "/tmp/Chart-16b/tests/org/jfree/chart/renderer/category/junit/LevelRendererTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevelRendererTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 65,
      "end_line": 237,
      "comment": "\n * Tests for the {@link LevelRenderer} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.suite()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.LevelRendererTests(java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.testEquals()",
      "begin_line": 88,
      "end_line": 104,
      "comment": "\n     * Test that the equals() method distinguishes all fields.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 47)",
        "(line 90,col 9)-(line 90,col 47)",
        "(line 91,col 9)-(line 91,col 34)",
        "(line 92,col 9)-(line 92,col 34)",
        "(line 94,col 9)-(line 94,col 32)",
        "(line 95,col 9)-(line 95,col 35)",
        "(line 96,col 9)-(line 96,col 32)",
        "(line 97,col 9)-(line 97,col 34)",
        "(line 99,col 9)-(line 99,col 38)",
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 102,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.testHashcode()",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 47)",
        "(line 111,col 9)-(line 111,col 47)",
        "(line 112,col 9)-(line 112,col 34)",
        "(line 113,col 9)-(line 113,col 31)",
        "(line 114,col 9)-(line 114,col 31)",
        "(line 115,col 9)-(line 115,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.testCloning()",
      "begin_line": 121,
      "end_line": 138,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 47)",
        "(line 123,col 9)-(line 123,col 32)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 125,col 32)",
        "(line 126,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 29)",
        "(line 133,col 9)-(line 133,col 51)",
        "(line 134,col 9)-(line 134,col 34)",
        "(line 136,col 9)-(line 136,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.checkIndependence(org.jfree.chart.renderer.category.LevelRenderer, org.jfree.chart.renderer.category.LevelRenderer)",
      "begin_line": 148,
      "end_line": 161,
      "comment": "\n     * Checks that the two renderers are equal but independent of one another.\n     * \n     * @param r1  renderer 1.\n     * @param r2  renderer 2.\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 35)",
        "(line 154,col 9)-(line 154,col 30)",
        "(line 155,col 9)-(line 155,col 36)",
        "(line 156,col 9)-(line 156,col 30)",
        "(line 157,col 9)-(line 157,col 35)",
        "(line 159,col 9)-(line 159,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.testSerialization()",
      "begin_line": 166,
      "end_line": 188,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 47)",
        "(line 169,col 9)-(line 169,col 32)",
        "(line 171,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.testDrawWithNullInfo()",
      "begin_line": 194,
      "end_line": 212,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e info object to make sure that \n     * no exceptions are thrown (particularly by code in the renderer).\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 32)",
        "(line 196,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.LevelRendererTests.testGetLegendItemSeriesIndex()",
      "begin_line": 218,
      "end_line": 235,
      "comment": "\n     * A check for the datasetIndex and seriesIndex fields in the LegendItem\n     * returned by the getLegendItem() method.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 71)",
        "(line 220,col 9)-(line 220,col 44)",
        "(line 221,col 9)-(line 221,col 44)",
        "(line 222,col 9)-(line 222,col 71)",
        "(line 223,col 9)-(line 223,col 44)",
        "(line 224,col 9)-(line 224,col 44)",
        "(line 225,col 9)-(line 225,col 44)",
        "(line 226,col 9)-(line 226,col 46)",
        "(line 227,col 9)-(line 228,col 40)",
        "(line 229,col 9)-(line 229,col 37)",
        "(line 230,col 32)-(line 230,col 52)",
        "(line 231,col 9)-(line 231,col 46)",
        "(line 232,col 9)-(line 232,col 42)",
        "(line 233,col 9)-(line 233,col 46)",
        "(line 234,col 9)-(line 234,col 45)"
      ]
    }
  ]
}