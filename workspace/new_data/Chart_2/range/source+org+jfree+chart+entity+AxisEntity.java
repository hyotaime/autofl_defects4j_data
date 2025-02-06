{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/entity/AxisEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AxisEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity"
      ],
      "begin_line": 58,
      "end_line": 211,
      "comment": "\n * A class that captures information about an Axis of a chart.\n *\n * @since 1.0.13\n "
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
        "axis"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The axis for the entity. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.AxisEntity.AxisEntity(java.awt.Shape, org.jfree.chart.axis.Axis)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Creates a new axis entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.AxisEntity.AxisEntity(java.awt.Shape, org.jfree.chart.axis.Axis, java.lang.String)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Creates a new axis entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.AxisEntity.AxisEntity(java.awt.Shape, org.jfree.chart.axis.Axis, java.lang.String, java.lang.String)",
      "begin_line": 99,
      "end_line": 107,
      "comment": "\n     * Creates a new axis entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param urlText  the URL text for HTML image maps (\u003ccode\u003enull\u003c/code\u003e\n     *                 permitted).\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.AxisEntity.getAxis()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns the axis that occupies the entity area.\n     *\n     * @return The axis (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.AxisEntity.toString()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Returns a string representation of the chart entity, useful for\n     * debugging.\n     *\n     * @return A string.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 60)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 128,col 9)-(line 128,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.AxisEntity.equals(java.lang.Object)",
      "begin_line": 138,
      "end_line": 159,
      "comment": "\n     * Tests the entity for equality with an arbitrary object.\n     *\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 43)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.AxisEntity.hashCode()",
      "begin_line": 166,
      "end_line": 171,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 24)",
        "(line 168,col 9)-(line 168,col 66)",
        "(line 169,col 9)-(line 169,col 62)",
        "(line 170,col 9)-(line 170,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.AxisEntity.clone()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Returns a clone of the entity.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if there is a problem cloning the\n     *         entity.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.AxisEntity.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 36)",
        "(line 194,col 9)-(line 194,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.AxisEntity.readObject(java.io.ObjectInputStream)",
      "begin_line": 205,
      "end_line": 209,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 35)",
        "(line 208,col 9)-(line 208,col 51)"
      ]
    }
  ]
}