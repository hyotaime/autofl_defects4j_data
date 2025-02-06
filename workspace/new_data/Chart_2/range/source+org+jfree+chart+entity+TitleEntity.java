{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/entity/TitleEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TitleEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity"
      ],
      "begin_line": 57,
      "end_line": 210,
      "comment": "\n * A class that captures information about a Title of a chart.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "title"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The Title for the entity. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.TitleEntity.TitleEntity(java.awt.Shape, org.jfree.chart.title.Title)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Creates a new chart entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.TitleEntity.TitleEntity(java.awt.Shape, org.jfree.chart.title.Title, java.lang.String)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Creates a new chart entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.TitleEntity.TitleEntity(java.awt.Shape, org.jfree.chart.title.Title, java.lang.String, java.lang.String)",
      "begin_line": 98,
      "end_line": 106,
      "comment": "\n     * Creates a new entity.\n     *\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param urlText  the URL text for HTML image maps (\u003ccode\u003enull\u003c/code\u003e\n     *                 permitted).\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.TitleEntity.getTitle()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns the title that occupies the entity area.\n     *\n     * @return The title (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.TitleEntity.toString()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Returns a string representation of the chart entity, useful for\n     * debugging.\n     *\n     * @return A string.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 61)",
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.TitleEntity.equals(java.lang.Object)",
      "begin_line": 137,
      "end_line": 158,
      "comment": "\n     * Tests the entity for equality with an arbitrary object.\n     *\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 45)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.TitleEntity.hashCode()",
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
      "signature": "org.jfree.chart.entity.TitleEntity.clone()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns a clone of the entity.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if there is a problem cloning the\n     *         entity.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.TitleEntity.writeObject(java.io.ObjectOutputStream)",
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
      "signature": "org.jfree.chart.entity.TitleEntity.readObject(java.io.ObjectInputStream)",
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