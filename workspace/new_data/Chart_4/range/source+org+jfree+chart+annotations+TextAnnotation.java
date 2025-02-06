{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/TextAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextAnnotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 357,
      "comment": "\r\n * A base class for text annotations.  This class records the content but not\r\n * the location of the annotation.\r\n "
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
      "end_line": 79,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TEXT_ANCHOR"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The default text anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANCHOR"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The default rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANGLE"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The default rotation angle. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The text anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAnchor"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAngle"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The rotation angle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.TextAnnotation.TextAnnotation(java.lang.String)",
      "begin_line": 116,
      "end_line": 126,
      "comment": "\r\n     * Creates a text annotation with default settings.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 35)",
        "(line 123,col 9)-(line 123,col 46)",
        "(line 124,col 9)-(line 124,col 54)",
        "(line 125,col 9)-(line 125,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getText()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the text for the annotation.\r\n     *\r\n     * @return The text (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setText(String)\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setText(java.lang.String)",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\r\n     * Sets the text for the annotation.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getText()\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getFont()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Returns the font for the annotation.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setFont(java.awt.Font)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\r\n     * Sets the font for the annotation.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getPaint()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Returns the paint for the annotation.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 196,
      "end_line": 201,
      "comment": "\r\n     * Sets the paint for the annotation.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getTextAnchor()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * Returns the text anchor.\r\n     *\r\n     * @return The text anchor.\r\n     *\r\n     * @see #setTextAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 222,
      "end_line": 227,
      "comment": "\r\n     * Sets the text anchor (the point on the text bounding rectangle that is\r\n     * aligned to the (x, y) coordinate of the annotation).\r\n     *\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTextAnchor()\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getRotationAnchor()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the rotation anchor.\r\n     *\r\n     * @return The rotation anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRotationAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setRotationAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\r\n     * Sets the rotation anchor point.\r\n     *\r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRotationAnchor()\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getRotationAngle()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Returns the rotation angle in radians.\r\n     *\r\n     * @return The rotation angle.\r\n     *\r\n     * @see #setRotationAngle(double)\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setRotationAngle(double)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\r\n     * Sets the rotation angle.  The angle is measured clockwise in radians.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getRotationAngle()\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.equals(java.lang.Object)",
      "begin_line": 280,
      "end_line": 312,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 51)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 310,col 9)-(line 310,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.hashCode()",
      "begin_line": 319,
      "end_line": 329,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 25)",
        "(line 321,col 9)-(line 321,col 52)",
        "(line 322,col 9)-(line 322,col 74)",
        "(line 323,col 9)-(line 323,col 62)",
        "(line 324,col 9)-(line 324,col 64)",
        "(line 325,col 9)-(line 325,col 60)",
        "(line 326,col 9)-(line 326,col 52)",
        "(line 327,col 9)-(line 327,col 58)",
        "(line 328,col 9)-(line 328,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 36)",
        "(line 340,col 9)-(line 340,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 351,
      "end_line": 355,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 35)",
        "(line 354,col 9)-(line 354,col 55)"
      ]
    }
  ]
}