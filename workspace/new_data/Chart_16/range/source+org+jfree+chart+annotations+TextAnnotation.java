{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/annotations/TextAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextAnnotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 358,
      "comment": "\r\n * A base class for text annotations.  This class records the content but not \r\n * the location of the annotation.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 79,
      "end_line": 80,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TEXT_ANCHOR"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The default text anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANCHOR"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The default rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANGLE"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The default rotation angle. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The text anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAnchor"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAngle"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The rotation angle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.TextAnnotation.TextAnnotation(java.lang.String)",
      "begin_line": 117,
      "end_line": 127,
      "comment": "\r\n     * Creates a text annotation with default settings.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 25)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 46)",
        "(line 125,col 9)-(line 125,col 54)",
        "(line 126,col 9)-(line 126,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getText()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Returns the text for the annotation.\r\n     *\r\n     * @return The text (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setText(String)\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setText(java.lang.String)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\r\n     * Sets the text for the annotation.\r\n     * \r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getText()\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getFont()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Returns the font for the annotation.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setFont(java.awt.Font)",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\r\n     * Sets the font for the annotation.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getPaint()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the paint for the annotation.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "\r\n     * Sets the paint for the annotation.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getTextAnchor()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns the text anchor.\r\n     * \r\n     * @return The text anchor.\r\n     * \r\n     * @see #setTextAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 223,
      "end_line": 228,
      "comment": "\r\n     * Sets the text anchor (the point on the text bounding rectangle that is \r\n     * aligned to the (x, y) coordinate of the annotation).\r\n     * \r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTextAnchor()\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getRotationAnchor()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the rotation anchor.\r\n     * \r\n     * @return The rotation anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRotationAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setRotationAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\r\n     * Sets the rotation anchor point.\r\n     * \r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRotationAnchor()\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getRotationAngle()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\r\n     * Returns the rotation angle in radians.\r\n     * \r\n     * @return The rotation angle.\r\n     * \r\n     * @see #setRotationAngle(double)\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setRotationAngle(double)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\r\n     * Sets the rotation angle.  The angle is measured clockwise in radians.\r\n     * \r\n     * @param angle  the angle (in radians).\r\n     * \r\n     * @see #getRotationAngle()\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.equals(java.lang.Object)",
      "begin_line": 281,
      "end_line": 313,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 51)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 311,col 9)-(line 311,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.hashCode()",
      "begin_line": 320,
      "end_line": 330,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 25)",
        "(line 322,col 9)-(line 322,col 52)",
        "(line 323,col 9)-(line 323,col 74)",
        "(line 324,col 9)-(line 324,col 62)",
        "(line 325,col 9)-(line 325,col 64)",
        "(line 326,col 9)-(line 326,col 60)",
        "(line 327,col 9)-(line 327,col 52)",
        "(line 328,col 9)-(line 328,col 58)",
        "(line 329,col 9)-(line 329,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 36)",
        "(line 341,col 9)-(line 341,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 352,
      "end_line": 356,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 35)",
        "(line 355,col 9)-(line 355,col 55)"
      ]
    }
  ]
}