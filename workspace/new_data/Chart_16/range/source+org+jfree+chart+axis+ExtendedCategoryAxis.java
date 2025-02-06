{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/ExtendedCategoryAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedCategoryAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.CategoryAxis"
      ],
      "begin_line": 70,
      "end_line": 256,
      "comment": "\r\n * An extended version of the {@link CategoryAxis} class that supports \r\n * sublabels on the axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "sublabels"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Storage for the sublabels. "
    },
    {
      "type": "field",
      "varNames": [
        "sublabelFont"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The sublabel font. "
    },
    {
      "type": "field",
      "varNames": [
        "sublabelPaint"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The sublabel paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.ExtendedCategoryAxis(java.lang.String)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\r\n     * Creates a new axis.\r\n     * \r\n     * @param label  the axis label.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 21)",
        "(line 88,col 9)-(line 88,col 39)",
        "(line 89,col 9)-(line 89,col 66)",
        "(line 90,col 9)-(line 90,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.getSubLabelFont()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the font for the sublabels.\r\n     * \r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSubLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.setSubLabelFont(java.awt.Font)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\r\n     * Sets the font for the sublabels and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSubLabelFont()\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 33)",
        "(line 117,col 9)-(line 117,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.getSubLabelPaint()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns the paint for the sublabels.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSubLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.setSubLabelPaint(java.awt.Paint)",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\r\n     * Sets the paint for the sublabels and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSubLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.addSubLabel(java.lang.Comparable, java.lang.String)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Adds a sublabel for a category.\r\n     * \r\n     * @param category  the category.\r\n     * @param label  the label.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.createLabel(java.lang.Comparable, float, org.jfree.chart.util.RectangleEdge, java.awt.Graphics2D)",
      "begin_line": 168,
      "end_line": 188,
      "comment": "\r\n     * Overrides the default behaviour by adding the sublabel to the text \r\n     * block that is used for the category label.\r\n     * \r\n     * @param category  the category.\r\n     * @param width  the width (not used yet).\r\n     * @param edge  the location of the axis.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return A label.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 71)",
        "(line 171,col 9)-(line 171,col 57)",
        "(line 172,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.equals(java.lang.Object)",
      "begin_line": 197,
      "end_line": 215,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 63)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.clone()",
      "begin_line": 224,
      "end_line": 228,
      "comment": "\r\n     * Returns a clone of this axis.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 74)",
        "(line 226,col 9)-(line 226,col 54)",
        "(line 227,col 9)-(line 227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)",
        "(line 239,col 9)-(line 239,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 250,
      "end_line": 254,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 63)"
      ]
    }
  ]
}