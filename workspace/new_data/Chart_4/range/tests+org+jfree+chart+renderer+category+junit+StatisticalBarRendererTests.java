{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/renderer/category/junit/StatisticalBarRendererTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalBarRendererTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 71,
      "end_line": 309,
      "comment": "\n * Tests for the {@link StatisticalBarRenderer} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.suite()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.StatisticalBarRendererTests(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testEquals()",
      "begin_line": 94,
      "end_line": 108,
      "comment": "\n     * Check that the equals() method distinguishes all fields.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 65)",
        "(line 96,col 9)-(line 96,col 65)",
        "(line 97,col 9)-(line 97,col 29)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 101,col 45)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 104,col 9)-(line 104,col 58)",
        "(line 105,col 9)-(line 105,col 35)",
        "(line 106,col 9)-(line 106,col 58)",
        "(line 107,col 9)-(line 107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testHashcode()",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 65)",
        "(line 115,col 9)-(line 115,col 65)",
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 31)",
        "(line 118,col 9)-(line 118,col 31)",
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testCloning()",
      "begin_line": 125,
      "end_line": 137,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 65)",
        "(line 127,col 9)-(line 127,col 41)",
        "(line 128,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 29)",
        "(line 135,col 9)-(line 135,col 51)",
        "(line 136,col 9)-(line 136,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testPublicCloneable()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * Check that this class implements PublicCloneable.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 65)",
        "(line 144,col 9)-(line 144,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testSerialization()",
      "begin_line": 150,
      "end_line": 171,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 65)",
        "(line 153,col 9)-(line 153,col 41)",
        "(line 155,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullInfo()",
      "begin_line": 177,
      "end_line": 197,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e info object to make sure that\n     * no exceptions are thrown (particularly by code in the renderer).\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 32)",
        "(line 179,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullMeanVertical()",
      "begin_line": 204,
      "end_line": 224,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e mean value to make sure that\n     * no exceptions are thrown (particularly by code in the renderer).  See\n     * bug report 1779941.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 32)",
        "(line 206,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullMeanHorizontal()",
      "begin_line": 231,
      "end_line": 252,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e mean value to make sure that\n     * no exceptions are thrown (particularly by code in the renderer).  See\n     * bug report 1779941.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 32)",
        "(line 233,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullDeviationVertical()",
      "begin_line": 259,
      "end_line": 279,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e standard deviation to make sure\n     * that no exceptions are thrown (particularly by code in the renderer).\n     * See bug report 1779941.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 32)",
        "(line 261,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullDeviationHorizontal()",
      "begin_line": 286,
      "end_line": 307,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e standard deviation to make sure\n     * that no exceptions are thrown (particularly by code in the renderer).\n     * See bug report 1779941.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 32)",
        "(line 288,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 28)"
      ]
    }
  ]
}