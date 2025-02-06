{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/junit/ChartPanelTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartPanelTests",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.jfree.chart.event.ChartChangeListener",
        "org.jfree.chart.ChartMouseListener"
      ],
      "begin_line": 69,
      "end_line": 355,
      "comment": "\n * Tests for the {@link ChartPanel} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chartChangeEvents"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Receives a chart change event and stores it in a list for later\n     * inspection.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.suite()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.ChartPanelTests.ChartPanelTests(java.lang.String)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.testConstructor1()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Test that the constructor will accept a null chart.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 48)",
        "(line 107,col 9)-(line 107,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.testSetChart()",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Test that it is possible to set the panel\u0027s chart to null.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 56)",
        "(line 115,col 9)-(line 115,col 49)",
        "(line 116,col 9)-(line 116,col 29)",
        "(line 117,col 9)-(line 117,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.testGetListeners()",
      "begin_line": 123,
      "end_line": 155,
      "comment": "\n     * Check the behaviour of the getListeners() method.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 44)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 77)",
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 130,col 9)-(line 130,col 56)",
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 132,col 41)",
        "(line 133,col 9)-(line 133,col 61)",
        "(line 134,col 9)-(line 134,col 42)",
        "(line 137,col 9)-(line 137,col 29)",
        "(line 138,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 25)",
        "(line 147,col 9)-(line 147,col 21)",
        "(line 148,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.chartMouseClicked(org.jfree.chart.ChartMouseEvent)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Ignores a mouse click event.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.chartMouseMoved(org.jfree.chart.ChartMouseEvent)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Ignores a mouse move event.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_zoom()",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\n     * Checks that a call to the zoom() method generates just one\n     * ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 58)",
        "(line 181,col 9)-(line 182,col 77)",
        "(line 183,col 9)-(line 183,col 49)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 185,col 39)",
        "(line 186,col 9)-(line 186,col 63)",
        "(line 187,col 9)-(line 187,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_zoomInBoth()",
      "begin_line": 194,
      "end_line": 203,
      "comment": "\n     * Checks that a call to the zoomInBoth() method generates just one\n     * ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 58)",
        "(line 196,col 9)-(line 197,col 77)",
        "(line 198,col 9)-(line 198,col 49)",
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 200,col 39)",
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 202,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_zoomOutBoth()",
      "begin_line": 209,
      "end_line": 218,
      "comment": "\n     * Checks that a call to the zoomOutBoth() method generates just one\n     * ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 58)",
        "(line 211,col 9)-(line 212,col 77)",
        "(line 213,col 9)-(line 213,col 49)",
        "(line 214,col 9)-(line 214,col 38)",
        "(line 215,col 9)-(line 215,col 39)",
        "(line 216,col 9)-(line 216,col 36)",
        "(line 217,col 9)-(line 217,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_restoreAutoBounds()",
      "begin_line": 224,
      "end_line": 233,
      "comment": "\n     * Checks that a call to the restoreAutoBounds() method generates just one\n     * ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 58)",
        "(line 226,col 9)-(line 227,col 77)",
        "(line 228,col 9)-(line 228,col 49)",
        "(line 229,col 9)-(line 229,col 38)",
        "(line 230,col 9)-(line 230,col 39)",
        "(line 231,col 9)-(line 231,col 34)",
        "(line 232,col 9)-(line 232,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_zoomInDomain()",
      "begin_line": 239,
      "end_line": 250,
      "comment": "\n     * Checks that a call to the zoomInDomain() method, for a plot with more\n     * than one domain axis, generates just one ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 58)",
        "(line 241,col 9)-(line 242,col 77)",
        "(line 243,col 9)-(line 243,col 47)",
        "(line 244,col 9)-(line 244,col 52)",
        "(line 245,col 9)-(line 245,col 49)",
        "(line 246,col 9)-(line 246,col 38)",
        "(line 247,col 9)-(line 247,col 39)",
        "(line 248,col 9)-(line 248,col 37)",
        "(line 249,col 9)-(line 249,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_zoomInRange()",
      "begin_line": 256,
      "end_line": 267,
      "comment": "\n     * Checks that a call to the zoomInRange() method, for a plot with more\n     * than one range axis, generates just one ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 58)",
        "(line 258,col 9)-(line 259,col 77)",
        "(line 260,col 9)-(line 260,col 47)",
        "(line 261,col 9)-(line 261,col 51)",
        "(line 262,col 9)-(line 262,col 49)",
        "(line 263,col 9)-(line 263,col 38)",
        "(line 264,col 9)-(line 264,col 39)",
        "(line 265,col 9)-(line 265,col 36)",
        "(line 266,col 9)-(line 266,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_zoomOutDomain()",
      "begin_line": 273,
      "end_line": 284,
      "comment": "\n     * Checks that a call to the zoomOutDomain() method, for a plot with more\n     * than one domain axis, generates just one ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 58)",
        "(line 275,col 9)-(line 276,col 77)",
        "(line 277,col 9)-(line 277,col 47)",
        "(line 278,col 9)-(line 278,col 52)",
        "(line 279,col 9)-(line 279,col 49)",
        "(line 280,col 9)-(line 280,col 38)",
        "(line 281,col 9)-(line 281,col 39)",
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 283,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_zoomOutRange()",
      "begin_line": 290,
      "end_line": 301,
      "comment": "\n     * Checks that a call to the zoomOutRange() method, for a plot with more\n     * than one range axis, generates just one ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 58)",
        "(line 292,col 9)-(line 293,col 77)",
        "(line 294,col 9)-(line 294,col 47)",
        "(line 295,col 9)-(line 295,col 51)",
        "(line 296,col 9)-(line 296,col 49)",
        "(line 297,col 9)-(line 297,col 38)",
        "(line 298,col 9)-(line 298,col 39)",
        "(line 299,col 9)-(line 299,col 37)",
        "(line 300,col 9)-(line 300,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_restoreAutoDomainBounds()",
      "begin_line": 307,
      "end_line": 318,
      "comment": "\n     * Checks that a call to the restoreAutoDomainBounds() method, for a plot\n     * with more than one range axis, generates just one ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 58)",
        "(line 309,col 9)-(line 310,col 77)",
        "(line 311,col 9)-(line 311,col 47)",
        "(line 312,col 9)-(line 312,col 52)",
        "(line 313,col 9)-(line 313,col 49)",
        "(line 314,col 9)-(line 314,col 38)",
        "(line 315,col 9)-(line 315,col 39)",
        "(line 316,col 9)-(line 316,col 40)",
        "(line 317,col 9)-(line 317,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.test2502355_restoreAutoRangeBounds()",
      "begin_line": 324,
      "end_line": 335,
      "comment": "\n     * Checks that a call to the restoreAutoRangeBounds() method, for a plot\n     * with more than one range axis, generates just one ChartChangeEvent.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 58)",
        "(line 326,col 9)-(line 327,col 77)",
        "(line 328,col 9)-(line 328,col 47)",
        "(line 329,col 9)-(line 329,col 51)",
        "(line 330,col 9)-(line 330,col 49)",
        "(line 331,col 9)-(line 331,col 38)",
        "(line 332,col 9)-(line 332,col 39)",
        "(line 333,col 9)-(line 333,col 39)",
        "(line 334,col 9)-(line 334,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ChartPanelTests.testSetMouseWheelEnabled()",
      "begin_line": 341,
      "end_line": 341,
      "comment": "\n     * In version 1.0.13 there is a bug where enabling the mouse wheel handler\n     * twice would in fact disable it.\n     ",
      "child_ranges": []
    }
  ]
}