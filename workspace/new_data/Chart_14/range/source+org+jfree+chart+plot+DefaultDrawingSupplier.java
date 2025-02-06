{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/DefaultDrawingSupplier.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultDrawingSupplier",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.DrawingSupplier",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 547,
      "comment": "\r\n * A default implementation of the {@link DrawingSupplier} interface.  All\r\n * {@link Plot} instances have a new instance of this class installed by \r\n * default.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT_SEQUENCE"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": " The default fill paint sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_PAINT_SEQUENCE"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": " The default outline paint sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILL_PAINT_SEQUENCE"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": " The default fill paint sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STROKE_SEQUENCE"
      ],
      "begin_line": 95,
      "end_line": 97,
      "comment": " The default stroke sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_STROKE_SEQUENCE"
      ],
      "begin_line": 100,
      "end_line": 102,
      "comment": " The default outline stroke sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SHAPE_SEQUENCE"
      ],
      "begin_line": 105,
      "end_line": 106,
      "comment": " The default shape sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "paintSequence"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The paint sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "paintIndex"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The current paint index. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaintSequence"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The outline paint sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaintIndex"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The current outline paint index. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintSequence"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The fill paint sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintIndex"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The current fill paint index. "
    },
    {
      "type": "field",
      "varNames": [
        "strokeSequence"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The stroke sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "strokeIndex"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The current stroke index. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStrokeSequence"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The outline stroke sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStrokeIndex"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The current outline stroke index. "
    },
    {
      "type": "field",
      "varNames": [
        "shapeSequence"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The shape sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "shapeIndex"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The current shape index. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.DefaultDrawingSupplier()",
      "begin_line": 148,
      "end_line": 156,
      "comment": "\r\n     * Creates a new supplier, with default sequences for fill paint, outline \r\n     * paint, stroke and shapes.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 154,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.DefaultDrawingSupplier(java.awt.Paint[], java.awt.Paint[], java.awt.Stroke[], java.awt.Stroke[], java.awt.Shape[])",
      "begin_line": 167,
      "end_line": 180,
      "comment": "\r\n     * Creates a new supplier.\r\n     *\r\n     * @param paintSequence  the fill paint sequence.\r\n     * @param outlinePaintSequence  the outline paint sequence.\r\n     * @param strokeSequence  the stroke sequence.\r\n     * @param outlineStrokeSequence  the outline stroke sequence.\r\n     * @param shapeSequence  the shape sequence.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 43)",
        "(line 174,col 9)-(line 174,col 61)",
        "(line 175,col 9)-(line 175,col 57)",
        "(line 176,col 9)-(line 176,col 45)",
        "(line 177,col 9)-(line 177,col 59)",
        "(line 178,col 9)-(line 178,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.DefaultDrawingSupplier(java.awt.Paint[], java.awt.Paint[], java.awt.Paint[], java.awt.Stroke[], java.awt.Stroke[], java.awt.Shape[])",
      "begin_line": 194,
      "end_line": 205,
      "comment": "\r\n     * Creates a new supplier.\r\n     *\r\n     * @param paintSequence  the paint sequence.\r\n     * @param fillPaintSequence  the fill paint sequence.\r\n     * @param outlinePaintSequence  the outline paint sequence.\r\n     * @param strokeSequence  the stroke sequence.\r\n     * @param outlineStrokeSequence  the outline stroke sequence.\r\n     * @param shapeSequence  the shape sequence.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 43)",
        "(line 200,col 9)-(line 200,col 51)",
        "(line 201,col 9)-(line 201,col 57)",
        "(line 202,col 9)-(line 202,col 45)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 204,col 9)-(line 204,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.getNextPaint()",
      "begin_line": 212,
      "end_line": 217,
      "comment": "\r\n     * Returns the next paint in the sequence.\r\n     *\r\n     * @return The paint.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 214,col 78)",
        "(line 215,col 9)-(line 215,col 26)",
        "(line 216,col 9)-(line 216,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.getNextOutlinePaint()",
      "begin_line": 224,
      "end_line": 229,
      "comment": "\r\n     * Returns the next outline paint in the sequence.\r\n     *\r\n     * @return The paint.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 226,col 75)",
        "(line 227,col 9)-(line 227,col 33)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.getNextFillPaint()",
      "begin_line": 238,
      "end_line": 243,
      "comment": "\r\n     * Returns the next fill paint in the sequence.\r\n     *\r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 240,col 49)",
        "(line 241,col 9)-(line 241,col 30)",
        "(line 242,col 9)-(line 242,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.getNextStroke()",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\r\n     * Returns the next stroke in the sequence.\r\n     *\r\n     * @return The stroke.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 252,col 63)",
        "(line 253,col 9)-(line 253,col 27)",
        "(line 254,col 9)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.getNextOutlineStroke()",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\r\n     * Returns the next outline stroke in the sequence.\r\n     *\r\n     * @return The stroke.\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 264,col 77)",
        "(line 265,col 9)-(line 265,col 34)",
        "(line 266,col 9)-(line 266,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.getNextShape()",
      "begin_line": 274,
      "end_line": 279,
      "comment": "\r\n     * Returns the next shape in the sequence.\r\n     *\r\n     * @return The shape.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 276,col 61)",
        "(line 277,col 9)-(line 277,col 26)",
        "(line 278,col 9)-(line 278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes()",
      "begin_line": 287,
      "end_line": 337,
      "comment": "\r\n     * Creates an array of standard shapes to display for the items in series \r\n     * on charts.\r\n     *\r\n     * @return The array of shapes.\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 39)",
        "(line 291,col 9)-(line 291,col 26)",
        "(line 292,col 9)-(line 292,col 34)",
        "(line 293,col 9)-(line 293,col 29)",
        "(line 294,col 9)-(line 294,col 29)",
        "(line 297,col 9)-(line 297,col 71)",
        "(line 299,col 9)-(line 299,col 69)",
        "(line 302,col 9)-(line 302,col 47)",
        "(line 303,col 9)-(line 303,col 49)",
        "(line 304,col 9)-(line 304,col 53)",
        "(line 307,col 9)-(line 307,col 52)",
        "(line 308,col 9)-(line 308,col 52)",
        "(line 309,col 9)-(line 309,col 53)",
        "(line 312,col 9)-(line 312,col 79)",
        "(line 315,col 9)-(line 315,col 48)",
        "(line 316,col 9)-(line 316,col 50)",
        "(line 317,col 9)-(line 317,col 53)",
        "(line 320,col 9)-(line 320,col 77)",
        "(line 323,col 9)-(line 323,col 50)",
        "(line 324,col 9)-(line 324,col 47)",
        "(line 325,col 9)-(line 325,col 53)",
        "(line 328,col 9)-(line 328,col 79)",
        "(line 331,col 9)-(line 331,col 49)",
        "(line 332,col 9)-(line 332,col 48)",
        "(line 333,col 9)-(line 333,col 53)",
        "(line 335,col 9)-(line 335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.equals(java.lang.Object)",
      "begin_line": 346,
      "end_line": 392,
      "comment": "\r\n     * Tests this object for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 67)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.equalShapes(java.awt.Shape[], java.awt.Shape[])",
      "begin_line": 402,
      "end_line": 418,
      "comment": "\r\n     * A utility method for testing the equality of two arrays of shapes.\r\n     * \r\n     * @param s1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param s2  the second array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 427,
      "end_line": 460,
      "comment": "\r\n     * Handles serialization.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 36)",
        "(line 430,col 9)-(line 430,col 51)",
        "(line 431,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 65)",
        "(line 437,col 9)-(line 437,col 43)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 442,col 53)",
        "(line 443,col 9)-(line 443,col 37)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 448,col 67)",
        "(line 449,col 9)-(line 449,col 44)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 51)",
        "(line 455,col 9)-(line 455,col 36)",
        "(line 456,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.readObject(java.io.ObjectInputStream)",
      "begin_line": 470,
      "end_line": 504,
      "comment": "\r\n     * Restores a serialized object.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     * @throws ClassNotFoundException if there is a problem loading a class.\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 35)",
        "(line 474,col 9)-(line 474,col 42)",
        "(line 475,col 9)-(line 475,col 51)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 49)",
        "(line 481,col 9)-(line 481,col 65)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 486,col 43)",
        "(line 487,col 9)-(line 487,col 54)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 50)",
        "(line 493,col 9)-(line 493,col 68)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 498,col 42)",
        "(line 499,col 9)-(line 499,col 51)",
        "(line 500,col 9)-(line 502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.intArray(double, double, double)",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\r\n     * Helper method to avoid lots of explicit casts in getShape().  Returns\r\n     * an array containing the provided doubles cast to ints.\r\n     *\r\n     * @param a  x\r\n     * @param b  y\r\n     * @param c  z\r\n     *\r\n     * @return int[3] with converted params.\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.intArray(double, double, double, double)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\r\n     * Helper method to avoid lots of explicit casts in getShape().  Returns\r\n     * an array containing the provided doubles cast to ints.\r\n     *\r\n     * @param a  x\r\n     * @param b  y\r\n     * @param c  z\r\n     * @param d  t\r\n     *\r\n     * @return int[4] with converted params.\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DefaultDrawingSupplier.clone()",
      "begin_line": 543,
      "end_line": 546,
      "comment": "\r\n     * Returns a clone.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if a component of the supplier does \r\n     *                                    not support cloning.\r\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 78)",
        "(line 545,col 9)-(line 545,col 21)"
      ]
    }
  ]
}