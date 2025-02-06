{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/TextAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractAnnotation",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 369,
      "comment": "\r\n * A base class for text annotations.  This class records the content but not\r\n * the location of the annotation.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 80,
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
      "end_line": 128,
      "comment": "\r\n     * Creates a text annotation with default settings.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 16)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 25)",
        "(line 123,col 9)-(line 123,col 33)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 46)",
        "(line 126,col 9)-(line 126,col 54)",
        "(line 127,col 9)-(line 127,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getText()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns the text for the annotation.\r\n     *\r\n     * @return The text (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setText(String)\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setText(java.lang.String)",
      "begin_line": 148,
      "end_line": 153,
      "comment": "\r\n     * Sets the text for the annotation.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getText()\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getFont()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the font for the annotation.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setFont(java.awt.Font)",
      "begin_line": 174,
      "end_line": 180,
      "comment": "\r\n     * Sets the font for the annotation and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 25)",
        "(line 179,col 9)-(line 179,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getPaint()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the paint for the annotation.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 201,
      "end_line": 207,
      "comment": "\r\n     * Sets the paint for the annotation and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 27)",
        "(line 206,col 9)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getTextAnchor()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Returns the text anchor.\r\n     *\r\n     * @return The text anchor.\r\n     *\r\n     * @see #setTextAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 229,
      "end_line": 235,
      "comment": "\r\n     * Sets the text anchor (the point on the text bounding rectangle that is\r\n     * aligned to the (x, y) coordinate of the annotation) and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTextAnchor()\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 33)",
        "(line 234,col 9)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getRotationAnchor()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\r\n     * Returns the rotation anchor.\r\n     *\r\n     * @return The rotation anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRotationAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setRotationAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\r\n     * Sets the rotation anchor point and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRotationAnchor()\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 37)",
        "(line 258,col 9)-(line 258,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.getRotationAngle()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Returns the rotation angle in radians.\r\n     *\r\n     * @return The rotation angle.\r\n     *\r\n     * @see #setRotationAngle(double)\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.setRotationAngle(double)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\r\n     * Sets the rotation angle and sends an {@link AnnotationChangeEvent} to\r\n     * all registered listeners.  The angle is measured clockwise in radians.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getRotationAngle()\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 35)",
        "(line 282,col 9)-(line 282,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.equals(java.lang.Object)",
      "begin_line": 292,
      "end_line": 324,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 51)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 322,col 9)-(line 322,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.hashCode()",
      "begin_line": 331,
      "end_line": 341,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 25)",
        "(line 333,col 9)-(line 333,col 52)",
        "(line 334,col 9)-(line 334,col 74)",
        "(line 335,col 9)-(line 335,col 62)",
        "(line 336,col 9)-(line 336,col 64)",
        "(line 337,col 9)-(line 337,col 60)",
        "(line 338,col 9)-(line 338,col 52)",
        "(line 339,col 9)-(line 339,col 58)",
        "(line 340,col 9)-(line 340,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 350,
      "end_line": 353,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 36)",
        "(line 352,col 9)-(line 352,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.TextAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 363,
      "end_line": 367,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 35)",
        "(line 366,col 9)-(line 366,col 55)"
      ]
    }
  ]
}