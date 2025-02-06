{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/ExtendedCategoryAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedCategoryAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.CategoryAxis"
      ],
      "begin_line": 70,
      "end_line": 259,
      "comment": "\r\n * An extended version of the {@link CategoryAxis} class that supports\r\n * sublabels on the axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "sublabels"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Storage for the sublabels. "
    },
    {
      "type": "field",
      "varNames": [
        "sublabelFont"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The sublabel font. "
    },
    {
      "type": "field",
      "varNames": [
        "sublabelPaint"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The sublabel paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.ExtendedCategoryAxis(java.lang.String)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\r\n     * Creates a new axis.\r\n     *\r\n     * @param label  the axis label.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 21)",
        "(line 91,col 9)-(line 91,col 39)",
        "(line 92,col 9)-(line 92,col 63)",
        "(line 93,col 9)-(line 93,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.getSubLabelFont()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Returns the font for the sublabels.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSubLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.setSubLabelFont(java.awt.Font)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\r\n     * Sets the font for the sublabels and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSubLabelFont()\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 120,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.getSubLabelPaint()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the paint for the sublabels.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSubLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.setSubLabelPaint(java.awt.Paint)",
      "begin_line": 142,
      "end_line": 148,
      "comment": "\r\n     * Sets the paint for the sublabels and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSubLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 35)",
        "(line 147,col 9)-(line 147,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.addSubLabel(java.lang.Comparable, java.lang.String)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Adds a sublabel for a category.\r\n     *\r\n     * @param category  the category.\r\n     * @param label  the label.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.createLabel(java.lang.Comparable, float, org.jfree.chart.util.RectangleEdge, java.awt.Graphics2D)",
      "begin_line": 171,
      "end_line": 191,
      "comment": "\r\n     * Overrides the default behaviour by adding the sublabel to the text\r\n     * block that is used for the category label.\r\n     *\r\n     * @param category  the category.\r\n     * @param width  the width (not used yet).\r\n     * @param edge  the location of the axis.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return A label.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 71)",
        "(line 174,col 9)-(line 174,col 57)",
        "(line 175,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.equals(java.lang.Object)",
      "begin_line": 200,
      "end_line": 218,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 63)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.clone()",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\r\n     * Returns a clone of this axis.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 74)",
        "(line 229,col 9)-(line 229,col 54)",
        "(line 230,col 9)-(line 230,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 36)",
        "(line 242,col 9)-(line 242,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ExtendedCategoryAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 253,
      "end_line": 257,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 35)",
        "(line 256,col 9)-(line 256,col 63)"
      ]
    }
  ]
}