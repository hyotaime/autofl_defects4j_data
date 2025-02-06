{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/entity/ChartEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartEntity",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 95,
      "end_line": 434,
      "comment": "\r\n * A class that captures information about some component of a chart (a bar, \r\n * line etc).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "area"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The area occupied by the entity (in Java 2D space). "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The tool tip text for the entity. "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The URL text for the entity. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.ChartEntity.ChartEntity(java.awt.Shape)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\r\n     * Creates a new chart entity.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.ChartEntity.ChartEntity(java.awt.Shape, java.lang.String)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\r\n     * Creates a new chart entity.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.ChartEntity.ChartEntity(java.awt.Shape, java.lang.String, java.lang.String)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\r\n     * Creates a new entity.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text for HTML image maps (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 permitted).\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 25)",
        "(line 143,col 9)-(line 143,col 39)",
        "(line 144,col 9)-(line 144,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getArea()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the area occupied by the entity (in Java 2D space).\r\n     *\r\n     * @return The area (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.setArea(java.awt.Shape)",
      "begin_line": 165,
      "end_line": 170,
      "comment": "\r\n     * Sets the area for the entity.\r\n     * \u003cP\u003e\r\n     * This class conveys information about chart entities back to a client.\r\n     * Setting this area doesn\u0027t change the entity (which has already been\r\n     * drawn).\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getToolTipText()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Returns the tool tip text for the entity.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.setToolTipText(java.lang.String)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Sets the tool tip text.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getURLText()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns the URL text for the entity.\r\n     *\r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.setURLText(java.lang.String)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Sets the URL text.\r\n     *\r\n     * @param text the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getShapeType()",
      "begin_line": 214,
      "end_line": 221,
      "comment": "\r\n     * Returns a string describing the entity area.  This string is intended\r\n     * for use in an AREA tag when generating an image map.\r\n     *\r\n     * @return The shape type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getShapeCoords()",
      "begin_line": 228,
      "end_line": 235,
      "comment": "\r\n     * Returns the shape coordinates as a string.\r\n     *\r\n     * @return The shape coordinates (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getRectCoords(java.awt.geom.Rectangle2D)",
      "begin_line": 245,
      "end_line": 262,
      "comment": "\r\n     * Returns a string containing the coordinates (x1, y1, x2, y2) for a given\r\n     * rectangle.  This string is intended for use in an image map.\r\n     *\r\n     * @param rectangle  the rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return Upper left and lower right corner of a rectangle.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 40)",
        "(line 250,col 9)-(line 250,col 40)",
        "(line 251,col 9)-(line 251,col 49)",
        "(line 252,col 9)-(line 252,col 50)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 261,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getPolyCoords(java.awt.Shape)",
      "begin_line": 272,
      "end_line": 296,
      "comment": "\r\n     * Returns a string containing the coordinates for a given shape.  This\r\n     * string is intended for use in an image map.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The coordinates for a given shape as string.\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 49)",
        "(line 277,col 9)-(line 277,col 29)",
        "(line 278,col 9)-(line 278,col 38)",
        "(line 279,col 9)-(line 279,col 59)",
        "(line 280,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getImageMapAreaTag(org.jfree.chart.imagemap.ToolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator)",
      "begin_line": 311,
      "end_line": 342,
      "comment": "\r\n     * Returns an HTML image map tag for this entity.  The returned fragment\r\n     * should be \u003ccode\u003eXHTML 1.0\u003c/code\u003e compliant.\r\n     *\r\n     * @param toolTipTagFragmentGenerator  a generator for the HTML fragment\r\n     *     that will contain the tooltip text (\u003ccode\u003enull\u003c/code\u003e not permitted \r\n     *     if this entity contains tooltip information).\r\n     * @param urlTagFragmentGenerator  a generator for the HTML fragment that\r\n     *     will contain the URL reference (\u003ccode\u003enull\u003c/code\u003e not permitted if \r\n     *     this entity has a URL).\r\n     * \r\n     * @return The HTML tag.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 46)",
        "(line 316,col 9)-(line 317,col 44)",
        "(line 318,col 9)-(line 319,col 48)",
        "(line 320,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.toString()",
      "begin_line": 350,
      "end_line": 355,
      "comment": "\r\n     * Returns a string representation of the chart entity, useful for \r\n     * debugging.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 61)",
        "(line 352,col 9)-(line 352,col 33)",
        "(line 353,col 9)-(line 353,col 37)",
        "(line 354,col 9)-(line 354,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.equals(java.lang.Object)",
      "begin_line": 364,
      "end_line": 382,
      "comment": "\r\n     * Tests the entity for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 45)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.hashCode()",
      "begin_line": 389,
      "end_line": 394,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 24)",
        "(line 391,col 9)-(line 391,col 66)",
        "(line 392,col 9)-(line 392,col 62)",
        "(line 393,col 9)-(line 393,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.clone()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\r\n     * Returns a clone of the entity.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning the \r\n     *         entity.\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 415,
      "end_line": 418,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 36)",
        "(line 417,col 9)-(line 417,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.readObject(java.io.ObjectInputStream)",
      "begin_line": 428,
      "end_line": 432,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 35)",
        "(line 431,col 9)-(line 431,col 54)"
      ]
    }
  ]
}