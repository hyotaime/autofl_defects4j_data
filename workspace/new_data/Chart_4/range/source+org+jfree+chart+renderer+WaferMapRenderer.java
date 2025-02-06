{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/WaferMapRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WaferMapRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.AbstractRenderer"
      ],
      "begin_line": 67,
      "end_line": 385,
      "comment": "\r\n * A renderer for wafer map plots.  Provides color managment facilities.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "paintIndex"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " paint index "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " plot "
    },
    {
      "type": "field",
      "varNames": [
        "paintLimit"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " paint limit "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT_LIMIT"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " default paint limit "
    },
    {
      "type": "field",
      "varNames": [
        "POSITION_INDEX"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " default multivalue paint calculation "
    },
    {
      "type": "field",
      "varNames": [
        "VALUE_INDEX"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The default value index. "
    },
    {
      "type": "field",
      "varNames": [
        "paintIndexMethod"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " paint index method "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.WaferMapRenderer()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.WaferMapRenderer(int, int)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param paintLimit  the paint limit.\r\n     * @param paintIndexMethod  the paint index method.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.WaferMapRenderer(java.lang.Integer, java.lang.Integer)",
      "begin_line": 113,
      "end_line": 131,
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param paintLimit  the paint limit.\r\n     * @param paintIndexMethod  the paint index method.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)",
        "(line 116,col 9)-(line 116,col 40)",
        "(line 118,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.isMethodValid(int)",
      "begin_line": 140,
      "end_line": 146,
      "comment": "\r\n     * Verifies that the passed paint index method is valid.\r\n     *\r\n     * @param method  the method.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003c/code\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.getDrawingSupplier()",
      "begin_line": 153,
      "end_line": 160,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 38)",
        "(line 155,col 9)-(line 155,col 35)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.getPlot()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the plot.\r\n     *\r\n     * @return The plot.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.setPlot(org.jfree.chart.plot.WaferMapPlot)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\r\n     * Sets the plot and build the paint index.\r\n     *\r\n     * @param plot  the plot.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 25)",
        "(line 178,col 9)-(line 178,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.getChipColor(java.lang.Number)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns the paint for a given chip value.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The paint.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.getPaintIndex(java.lang.Number)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Returns the paint index for a given chip value.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The paint index.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.makePaintIndex()",
      "begin_line": 207,
      "end_line": 235,
      "comment": "\r\n     * Builds a map of chip values to paint colors.\r\n     * paintlimit is the maximum allowed number of colors.\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 54)",
        "(line 212,col 9)-(line 212,col 44)",
        "(line 213,col 9)-(line 213,col 44)",
        "(line 214,col 9)-(line 214,col 50)",
        "(line 215,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.makePositionIndex(java.util.Set)",
      "begin_line": 243,
      "end_line": 258,
      "comment": "\r\n     * Builds the paintindex by assigning colors based on the number\r\n     * of unique values: totalvalues/totalcolors.\r\n     *\r\n     * @param uniqueValues  the set of unique values.\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 10)",
        "(line 247,col 9)-(line 247,col 22)",
        "(line 248,col 9)-(line 248,col 22)",
        "(line 249,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.makeValueIndex(java.lang.Number, java.lang.Number, java.util.Set)",
      "begin_line": 268,
      "end_line": 284,
      "comment": "\r\n     * Builds the paintindex by assigning colors evenly across the range\r\n     * of values:  maxValue-minValue/totalcolors\r\n     *\r\n     * @param max  the maximum value.\r\n     * @param min  the minumum value.\r\n     * @param uniqueValues  the unique values.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 66)",
        "(line 270,col 9)-(line 270,col 56)",
        "(line 271,col 9)-(line 271,col 22)",
        "(line 272,col 9)-(line 272,col 56)",
        "(line 273,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.getLegendCollection()",
      "begin_line": 292,
      "end_line": 340,
      "comment": "\r\n     * Builds the list of legend entries.  called by getLegendItems in\r\n     * WaferMapPlot to populate the plot legend.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 65)",
        "(line 294,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.getMinPaintValue(java.lang.Integer)",
      "begin_line": 350,
      "end_line": 361,
      "comment": "\r\n     * Returns the minimum chip value assigned to a color\r\n     * in the paintIndex\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 51)",
        "(line 352,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.WaferMapRenderer.getMaxPaintValue(java.lang.Integer)",
      "begin_line": 371,
      "end_line": 382,
      "comment": "\r\n     * Returns the maximum chip value assigned to a color\r\n     * in the paintIndex\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The value\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 51)",
        "(line 373,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 36)"
      ]
    }
  ]
}