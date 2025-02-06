{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/entity/PlotEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PlotEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity"
      ],
      "begin_line": 58,
      "end_line": 210,
      "comment": "\n * A class that captures information about a plot.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The plot. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.PlotEntity.PlotEntity(java.awt.Shape, org.jfree.chart.plot.Plot)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Creates a new plot entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.PlotEntity.PlotEntity(java.awt.Shape, org.jfree.chart.plot.Plot, java.lang.String)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Creates a new plot entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.PlotEntity.PlotEntity(java.awt.Shape, org.jfree.chart.plot.Plot, java.lang.String, java.lang.String)",
      "begin_line": 99,
      "end_line": 106,
      "comment": "\n     * Creates a new plot entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param urlText  the URL text for HTML image maps (\u003ccode\u003enull\u003c/code\u003e\n     *                 permitted).\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PlotEntity.getPlot()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns the plot that occupies the entity area.\n     *\n     * @return The plot (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PlotEntity.toString()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Returns a string representation of the plot entity, useful for\n     * debugging.\n     *\n     * @return A string.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 60)",
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PlotEntity.equals(java.lang.Object)",
      "begin_line": 137,
      "end_line": 158,
      "comment": "\n     * Tests the entity for equality with an arbitrary object.\n     *\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 43)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PlotEntity.hashCode()",
      "begin_line": 165,
      "end_line": 170,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 24)",
        "(line 167,col 9)-(line 167,col 66)",
        "(line 168,col 9)-(line 168,col 62)",
        "(line 169,col 9)-(line 169,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PlotEntity.clone()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns a clone of the entity.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if there is a problem cloning the\n     *         entity.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PlotEntity.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 36)",
        "(line 193,col 9)-(line 193,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PlotEntity.readObject(java.io.ObjectInputStream)",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 35)",
        "(line 207,col 9)-(line 207,col 51)"
      ]
    }
  ]
}