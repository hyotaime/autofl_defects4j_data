{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/chart/renderer/category/junit/StatisticalBarRendererTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalBarRendererTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 67,
      "end_line": 292,
      "comment": "\n * Tests for the {@link StatisticalBarRenderer} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.suite()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.StatisticalBarRendererTests(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testEquals()",
      "begin_line": 90,
      "end_line": 99,
      "comment": "\n     * Check that the equals() method distinguishes all fields.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 65)",
        "(line 92,col 9)-(line 92,col 65)",
        "(line 93,col 9)-(line 93,col 29)",
        "(line 95,col 9)-(line 95,col 45)",
        "(line 96,col 9)-(line 96,col 35)",
        "(line 97,col 9)-(line 97,col 45)",
        "(line 98,col 9)-(line 98,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testHashcode()",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 65)",
        "(line 106,col 9)-(line 106,col 65)",
        "(line 107,col 9)-(line 107,col 34)",
        "(line 108,col 9)-(line 108,col 31)",
        "(line 109,col 9)-(line 109,col 31)",
        "(line 110,col 9)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testCloning()",
      "begin_line": 116,
      "end_line": 128,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 65)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 29)",
        "(line 126,col 9)-(line 126,col 51)",
        "(line 127,col 9)-(line 127,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testSerialization()",
      "begin_line": 133,
      "end_line": 154,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 65)",
        "(line 136,col 9)-(line 136,col 41)",
        "(line 138,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullInfo()",
      "begin_line": 160,
      "end_line": 180,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e info object to make sure that \n     * no exceptions are thrown (particularly by code in the renderer).\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 32)",
        "(line 162,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullMeanVertical()",
      "begin_line": 187,
      "end_line": 207,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e mean value to make sure that \n     * no exceptions are thrown (particularly by code in the renderer).  See\n     * bug report 1779941.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 32)",
        "(line 189,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullMeanHorizontal()",
      "begin_line": 214,
      "end_line": 235,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e mean value to make sure that \n     * no exceptions are thrown (particularly by code in the renderer).  See\n     * bug report 1779941.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 32)",
        "(line 216,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullDeviationVertical()",
      "begin_line": 242,
      "end_line": 262,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e standard deviation to make sure \n     * that no exceptions are thrown (particularly by code in the renderer).  \n     * See bug report 1779941.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 32)",
        "(line 244,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests.testDrawWithNullDeviationHorizontal()",
      "begin_line": 269,
      "end_line": 290,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e standard deviation to make sure \n     * that no exceptions are thrown (particularly by code in the renderer).  \n     * See bug report 1779941.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 32)",
        "(line 271,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 28)"
      ]
    }
  ]
}