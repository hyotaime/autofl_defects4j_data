{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/PlotRenderingInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PlotRenderingInfo",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 290,
      "comment": "\r\n * Stores information about the dimensions of a plot and its subplots.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "owner"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The owner of this info. "
    },
    {
      "type": "field",
      "varNames": [
        "plotArea"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The plot area. "
    },
    {
      "type": "field",
      "varNames": [
        "dataArea"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The data area. "
    },
    {
      "type": "field",
      "varNames": [
        "subplotInfo"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\r\n     * Storage for the plot rendering info objects belonging to the subplots. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.PlotRenderingInfo(org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\r\n     * Creates a new instance.\r\n     * \r\n     * @param owner  the owner (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 27)",
        "(line 91,col 9)-(line 91,col 49)",
        "(line 92,col 9)-(line 92,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.getOwner()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the owner (as specified in the constructor).\r\n     * \r\n     * @return The owner (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.getPlotArea()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * Returns the plot area (in Java2D space).\r\n     * \r\n     * @return The plot area (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlotArea(Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.setPlotArea(java.awt.geom.Rectangle2D)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Sets the plot area.\r\n     * \r\n     * @param area  the plot area (in Java2D space, \u003ccode\u003enull\u003c/code\u003e \r\n     *     permitted but discouraged)\r\n     * \r\n     * @see #getPlotArea()\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.getDataArea()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Returns the plot\u0027s data area (in Java2D space).\r\n     * \r\n     * @return The data area (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataArea(Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.setDataArea(java.awt.geom.Rectangle2D)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\r\n     * Sets the data area.\r\n     * \r\n     * @param area  the data area (in Java2D space, \u003ccode\u003enull\u003c/code\u003e permitted\r\n     *     but discouraged).\r\n     * \r\n     * @see #getDataArea()\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.getSubplotCount()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Returns the number of subplots (possibly zero).\r\n     * \r\n     * @return The subplot count.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.addSubplotInfo(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Adds the info for a subplot.\r\n     * \r\n     * @param info  the subplot info.\r\n     * \r\n     * @see #getSubplotInfo(int)\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.getSubplotInfo(int)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Returns the info for a subplot.\r\n     * \r\n     * @param index  the subplot index.\r\n     * \r\n     * @return The info.\r\n     * \r\n     * @see #addSubplotInfo(PlotRenderingInfo)\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.getSubplotIndex(java.awt.geom.Point2D)",
      "begin_line": 196,
      "end_line": 209,
      "comment": "\r\n     * Returns the index of the subplot that contains the specified\r\n     * (x, y) point (the \"source\" point).  The source point will usually\r\n     * come from a mouse click on a {@link org.jfree.chart.ChartPanel},\r\n     * and this method is then used to determine the subplot that \r\n     * contains the source point.\r\n     * \r\n     * @param source  the source point (in Java2D space, \u003ccode\u003enull\u003c/code\u003e not\r\n     * permitted).\r\n     * \r\n     * @return The subplot index (or -1 if no subplot contains \r\n     *         \u003ccode\u003esource\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 45)",
        "(line 201,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.equals(java.lang.Object)",
      "begin_line": 218,
      "end_line": 236,
      "comment": "\r\n     * Tests this instance for equality against an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 57)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.clone()",
      "begin_line": 245,
      "end_line": 260,
      "comment": "\r\n     * Returns a clone of this object.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 68)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 77)",
        "(line 254,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 269,
      "end_line": 273,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 271,col 58)",
        "(line 272,col 9)-(line 272,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotRenderingInfo.readObject(java.io.ObjectInputStream)",
      "begin_line": 283,
      "end_line": 288,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 35)",
        "(line 286,col 9)-(line 286,col 72)",
        "(line 287,col 9)-(line 287,col 72)"
      ]
    }
  ]
}