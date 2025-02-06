{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/entity/ChartEntity.java",
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
      "begin_line": 94,
      "end_line": 438,
      "comment": "\r\n * A class that captures information about some component of a chart (a bar,\r\n * line etc).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "area"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The area occupied by the entity (in Java 2D space). "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The tool tip text for the entity. "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The URL text for the entity. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.ChartEntity.ChartEntity(java.awt.Shape)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\r\n     * Creates a new chart entity.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.ChartEntity.ChartEntity(java.awt.Shape, java.lang.String)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\r\n     * Creates a new chart entity.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.ChartEntity.ChartEntity(java.awt.Shape, java.lang.String, java.lang.String)",
      "begin_line": 137,
      "end_line": 144,
      "comment": "\r\n     * Creates a new entity.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipText  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the URL text for HTML image maps (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 25)",
        "(line 142,col 9)-(line 142,col 39)",
        "(line 143,col 9)-(line 143,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getArea()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Returns the area occupied by the entity (in Java 2D space).\r\n     *\r\n     * @return The area (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.setArea(java.awt.Shape)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\r\n     * Sets the area for the entity.\r\n     * \u003cP\u003e\r\n     * This class conveys information about chart entities back to a client.\r\n     * Setting this area doesn\u0027t change the entity (which has already been\r\n     * drawn).\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getToolTipText()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Returns the tool tip text for the entity.  Be aware that this text\r\n     * may have been generated from user supplied data, so for security\r\n     * reasons some form of filtering should be applied before incorporating\r\n     * this text into any HTML output.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.setToolTipText(java.lang.String)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Sets the tool tip text.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getURLText()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Returns the URL text for the entity.  Be aware that this text\r\n     * may have been generated from user supplied data, so some form of\r\n     * filtering should be applied before this \"URL\" is used in any output.\r\n     *\r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.setURLText(java.lang.String)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\r\n     * Sets the URL text.\r\n     *\r\n     * @param text the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getShapeType()",
      "begin_line": 218,
      "end_line": 225,
      "comment": "\r\n     * Returns a string describing the entity area.  This string is intended\r\n     * for use in an AREA tag when generating an image map.\r\n     *\r\n     * @return The shape type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getShapeCoords()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\r\n     * Returns the shape coordinates as a string.\r\n     *\r\n     * @return The shape coordinates (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getRectCoords(java.awt.geom.Rectangle2D)",
      "begin_line": 249,
      "end_line": 266,
      "comment": "\r\n     * Returns a string containing the coordinates (x1, y1, x2, y2) for a given\r\n     * rectangle.  This string is intended for use in an image map.\r\n     *\r\n     * @param rectangle  the rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return Upper left and lower right corner of a rectangle.\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 40)",
        "(line 254,col 9)-(line 254,col 40)",
        "(line 255,col 9)-(line 255,col 49)",
        "(line 256,col 9)-(line 256,col 50)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getPolyCoords(java.awt.Shape)",
      "begin_line": 276,
      "end_line": 300,
      "comment": "\r\n     * Returns a string containing the coordinates for a given shape.  This\r\n     * string is intended for use in an image map.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The coordinates for a given shape as string.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 49)",
        "(line 281,col 9)-(line 281,col 29)",
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 283,col 59)",
        "(line 284,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.getImageMapAreaTag(org.jfree.chart.imagemap.ToolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator)",
      "begin_line": 315,
      "end_line": 346,
      "comment": "\r\n     * Returns an HTML image map tag for this entity.  The returned fragment\r\n     * should be \u003ccode\u003eXHTML 1.0\u003c/code\u003e compliant.\r\n     *\r\n     * @param toolTipTagFragmentGenerator  a generator for the HTML fragment\r\n     *     that will contain the tooltip text (\u003ccode\u003enull\u003c/code\u003e not permitted\r\n     *     if this entity contains tooltip information).\r\n     * @param urlTagFragmentGenerator  a generator for the HTML fragment that\r\n     *     will contain the URL reference (\u003ccode\u003enull\u003c/code\u003e not permitted if\r\n     *     this entity has a URL).\r\n     *\r\n     * @return The HTML tag.\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 46)",
        "(line 320,col 9)-(line 321,col 44)",
        "(line 322,col 9)-(line 323,col 48)",
        "(line 324,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.toString()",
      "begin_line": 354,
      "end_line": 359,
      "comment": "\r\n     * Returns a string representation of the chart entity, useful for\r\n     * debugging.\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 61)",
        "(line 356,col 9)-(line 356,col 33)",
        "(line 357,col 9)-(line 357,col 37)",
        "(line 358,col 9)-(line 358,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.equals(java.lang.Object)",
      "begin_line": 368,
      "end_line": 386,
      "comment": "\r\n     * Tests the entity for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 45)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.hashCode()",
      "begin_line": 393,
      "end_line": 398,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 24)",
        "(line 395,col 9)-(line 395,col 66)",
        "(line 396,col 9)-(line 396,col 62)",
        "(line 397,col 9)-(line 397,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.clone()",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\r\n     * Returns a clone of the entity.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *         entity.\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 419,
      "end_line": 422,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 36)",
        "(line 421,col 9)-(line 421,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.ChartEntity.readObject(java.io.ObjectInputStream)",
      "begin_line": 432,
      "end_line": 436,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 35)",
        "(line 435,col 9)-(line 435,col 54)"
      ]
    }
  ]
}