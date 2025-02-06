{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/dial/DialPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialPointer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialLayer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 652,
      "comment": "\n * A base class for the pointer in a {@link DialPlot}.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The needle radius. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetIndex"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * The dataset index for the needle.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialPointer.DialPointer()",
      "begin_line": 87,
      "end_line": 89,
      "comment": " \n     * Creates a new \u003ccode\u003eDialPointer\u003c/code\u003e instance.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialPointer.DialPointer(int)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Creates a new pointer for the specified dataset.\n     * \n     * @param datasetIndex  the dataset index.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 26)",
        "(line 98,col 9)-(line 98,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.getDatasetIndex()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Returns the dataset index that the pointer maps to.\n     * \n     * @return The dataset index.\n     * \n     * @see #getDatasetIndex()\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.setDatasetIndex(int)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * Sets the dataset index for the pointer and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param index  the index.\n     * \n     * @see #getDatasetIndex()\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.getRadius()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns the radius of the pointer, as a percentage of the dial\u0027s\n     * framing rectangle.\n     * \n     * @return The radius.\n     * \n     * @see #setRadius(double)\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.setRadius(double)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Sets the radius of the pointer and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param radius  the radius.\n     * \n     * @see #getRadius()\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 29)",
        "(line 147,col 9)-(line 147,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.isClippedToWindow()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be \n     * clipped within the dial window.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.equals(java.lang.Object)",
      "begin_line": 167,
      "end_line": 182,
      "comment": "\n     * Checks this instance for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 45)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.hashCode()",
      "begin_line": 189,
      "end_line": 193,
      "comment": "\n     * Returns a hash code.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 24)",
        "(line 191,col 9)-(line 191,col 61)",
        "(line 192,col 9)-(line 192,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.clone()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Returns a clone of the pointer.\n     * \n     * @return a clone.\n     * \n     * @throws CloneNotSupportedException if one of the attributes cannot\n     *     be cloned.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pin",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.DialPointer"
      ],
      "begin_line": 210,
      "end_line": 386,
      "comment": "\n     * A dial pointer that draws a thin line (like a pin).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " The stroke. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.Pin()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n         * Creates a new instance.\n         ",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.Pin(int)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\n         * Creates a new instance.\n         * \n         * @param datasetIndex  the dataset index.\n         ",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 32)",
        "(line 235,col 13)-(line 235,col 35)",
        "(line 236,col 13)-(line 237,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.getPaint()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n         * Returns the paint.\n         * \n         * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n         * \n         * @see #setPaint(Paint)\n         ",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.setPaint(java.awt.Paint)",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\n         * Sets the paint and sends a {@link DialLayerChangeEvent} to all \n         * registered listeners.\n         * \n         * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n         * \n         * @see #getPaint()\n         ",
      "child_ranges": [
        "(line 260,col 13)-(line 262,col 13)",
        "(line 263,col 13)-(line 263,col 31)",
        "(line 264,col 13)-(line 264,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.getStroke()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n         * Returns the stroke.\n         * \n         * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n         * \n         * @see #setStroke(Stroke)\n         ",
      "child_ranges": [
        "(line 275,col 13)-(line 275,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.setStroke(java.awt.Stroke)",
      "begin_line": 286,
      "end_line": 292,
      "comment": "\n         * Sets the stroke and sends a {@link DialLayerChangeEvent} to all \n         * registered listeners.\n         * \n         * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n         * \n         * @see #getStroke()\n         ",
      "child_ranges": [
        "(line 287,col 13)-(line 289,col 13)",
        "(line 290,col 13)-(line 290,col 33)",
        "(line 291,col 13)-(line 291,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 302,
      "end_line": 320,
      "comment": "\n         * Draws the pointer.\n         * \n         * @param g2  the graphics target.\n         * @param plot  the plot.\n         * @param frame  the dial\u0027s reference frame.\n         * @param view  the dial\u0027s view.\n         ",
      "child_ranges": [
        "(line 305,col 13)-(line 305,col 36)",
        "(line 306,col 13)-(line 306,col 38)",
        "(line 307,col 13)-(line 308,col 46)",
        "(line 310,col 13)-(line 310,col 60)",
        "(line 311,col 13)-(line 311,col 73)",
        "(line 312,col 13)-(line 312,col 53)",
        "(line 314,col 13)-(line 314,col 72)",
        "(line 315,col 13)-(line 315,col 43)",
        "(line 317,col 13)-(line 318,col 62)",
        "(line 319,col 13)-(line 319,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.equals(java.lang.Object)",
      "begin_line": 329,
      "end_line": 344,
      "comment": "\n         * Tests this pointer for equality with an arbitrary object.\n         * \n         * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n         * \n         * @return A boolean.\n         ",
      "child_ranges": [
        "(line 330,col 13)-(line 332,col 13)",
        "(line 333,col 13)-(line 335,col 13)",
        "(line 336,col 13)-(line 336,col 57)",
        "(line 337,col 13)-(line 339,col 13)",
        "(line 340,col 13)-(line 342,col 13)",
        "(line 343,col 13)-(line 343,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.hashCode()",
      "begin_line": 351,
      "end_line": 356,
      "comment": "\n         * Returns a hash code for this instance.\n         * \n         * @return A hash code.\n         ",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 42)",
        "(line 353,col 13)-(line 353,col 64)",
        "(line 354,col 13)-(line 354,col 65)",
        "(line 355,col 13)-(line 355,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 365,
      "end_line": 369,
      "comment": "\n         * Provides serialization support.\n         *\n         * @param stream  the output stream.\n         *\n         * @throws IOException  if there is an I/O error.\n         ",
      "child_ranges": [
        "(line 366,col 13)-(line 366,col 40)",
        "(line 367,col 13)-(line 367,col 59)",
        "(line 368,col 13)-(line 368,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pin.readObject(java.io.ObjectInputStream)",
      "begin_line": 379,
      "end_line": 384,
      "comment": "\n         * Provides serialization support.\n         *\n         * @param stream  the input stream.\n         *\n         * @throws IOException  if there is an I/O error.\n         * @throws ClassNotFoundException  if there is a classpath problem.\n         ",
      "child_ranges": [
        "(line 381,col 13)-(line 381,col 39)",
        "(line 382,col 13)-(line 382,col 59)",
        "(line 383,col 13)-(line 383,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pointer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.DialPointer"
      ],
      "begin_line": 391,
      "end_line": 650,
      "comment": "\n     * A dial pointer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "widthRadius"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": "\n         * The radius that defines the width of the pointer at the base.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " \n         * The fill paint.\n         * \n         * @since 1.0.8\n         "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 413,
      "end_line": 413,
      "comment": " \n         * The outline paint.\n         * \n         * @since 1.0.8\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.Pointer()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n         * Creates a new instance.\n         ",
      "child_ranges": [
        "(line 419,col 13)-(line 419,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.Pointer(int)",
      "begin_line": 427,
      "end_line": 432,
      "comment": "\n         * Creates a new instance.\n         * \n         * @param datasetIndex  the dataset index.\n         ",
      "child_ranges": [
        "(line 428,col 13)-(line 428,col 32)",
        "(line 429,col 13)-(line 429,col 36)",
        "(line 430,col 13)-(line 430,col 40)",
        "(line 431,col 13)-(line 431,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.getWidthRadius()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n         * Returns the width radius.\n         * \n         * @return The width radius.\n         * \n         * @see #setWidthRadius(double)\n         ",
      "child_ranges": [
        "(line 442,col 13)-(line 442,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.setWidthRadius(double)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\n         * Sets the width radius and sends a {@link DialLayerChangeEvent} to \n         * all registered listeners.\n         * \n         * @param radius  the radius\n         * \n         * @see #getWidthRadius()\n         ",
      "child_ranges": [
        "(line 454,col 13)-(line 454,col 38)",
        "(line 455,col 13)-(line 455,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.getFillPaint()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n         * Returns the fill paint.\n         * \n         * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n         * \n         * @see #setFillPaint(Paint)\n         * \n         * @since 1.0.8\n         ",
      "child_ranges": [
        "(line 468,col 13)-(line 468,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.setFillPaint(java.awt.Paint)",
      "begin_line": 481,
      "end_line": 487,
      "comment": "\n         * Sets the fill paint and sends a {@link DialLayerChangeEvent} to all \n         * registered listeners.\n         * \n         * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n         * \n         * @see #getFillPaint()\n         * \n         * @since 1.0.8\n         ",
      "child_ranges": [
        "(line 482,col 13)-(line 484,col 13)",
        "(line 485,col 13)-(line 485,col 35)",
        "(line 486,col 13)-(line 486,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.getOutlinePaint()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\n         * Returns the outline paint.\n         * \n         * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n         * \n         * @see #setOutlinePaint(Paint)\n         * \n         * @since 1.0.8\n         ",
      "child_ranges": [
        "(line 499,col 13)-(line 499,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.setOutlinePaint(java.awt.Paint)",
      "begin_line": 512,
      "end_line": 518,
      "comment": "\n         * Sets the outline paint and sends a {@link DialLayerChangeEvent} to \n         * all registered listeners.\n         * \n         * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n         * \n         * @see #getOutlinePaint()\n         * \n         * @since 1.0.8\n         ",
      "child_ranges": [
        "(line 513,col 13)-(line 515,col 13)",
        "(line 516,col 13)-(line 516,col 38)",
        "(line 517,col 13)-(line 517,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 528,
      "end_line": 579,
      "comment": "\n         * Draws the pointer.\n         * \n         * @param g2  the graphics target.\n         * @param plot  the plot.\n         * @param frame  the dial\u0027s reference frame.\n         * @param view  the dial\u0027s view.\n         ",
      "child_ranges": [
        "(line 531,col 13)-(line 531,col 36)",
        "(line 532,col 13)-(line 532,col 48)",
        "(line 533,col 13)-(line 534,col 46)",
        "(line 535,col 13)-(line 536,col 56)",
        "(line 537,col 13)-(line 537,col 60)",
        "(line 538,col 13)-(line 538,col 73)",
        "(line 539,col 13)-(line 539,col 53)",
        "(line 541,col 13)-(line 541,col 76)",
        "(line 542,col 13)-(line 542,col 45)",
        "(line 543,col 13)-(line 544,col 32)",
        "(line 545,col 13)-(line 545,col 47)",
        "(line 546,col 13)-(line 546,col 45)",
        "(line 547,col 13)-(line 548,col 32)",
        "(line 549,col 13)-(line 549,col 47)",
        "(line 551,col 13)-(line 551,col 47)",
        "(line 552,col 13)-(line 552,col 62)",
        "(line 553,col 13)-(line 553,col 62)",
        "(line 554,col 13)-(line 554,col 62)",
        "(line 555,col 13)-(line 555,col 62)",
        "(line 556,col 13)-(line 556,col 27)",
        "(line 557,col 13)-(line 557,col 40)",
        "(line 558,col 13)-(line 558,col 24)",
        "(line 560,col 13)-(line 560,col 43)",
        "(line 561,col 13)-(line 562,col 64)",
        "(line 563,col 13)-(line 563,col 26)",
        "(line 565,col 13)-(line 565,col 35)",
        "(line 566,col 13)-(line 566,col 26)",
        "(line 568,col 13)-(line 568,col 35)",
        "(line 569,col 13)-(line 569,col 26)",
        "(line 571,col 13)-(line 571,col 35)",
        "(line 572,col 13)-(line 572,col 26)",
        "(line 574,col 13)-(line 574,col 35)",
        "(line 575,col 13)-(line 575,col 26)",
        "(line 577,col 13)-(line 577,col 35)",
        "(line 578,col 13)-(line 578,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.equals(java.lang.Object)",
      "begin_line": 588,
      "end_line": 607,
      "comment": "\n         * Tests this pointer for equality with an arbitrary object.\n         * \n         * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n         * \n         * @return A boolean.\n         ",
      "child_ranges": [
        "(line 589,col 13)-(line 591,col 13)",
        "(line 592,col 13)-(line 594,col 13)",
        "(line 595,col 13)-(line 595,col 65)",
        "(line 597,col 13)-(line 599,col 13)",
        "(line 600,col 13)-(line 602,col 13)",
        "(line 603,col 13)-(line 605,col 13)",
        "(line 606,col 13)-(line 606,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.hashCode()",
      "begin_line": 614,
      "end_line": 620,
      "comment": "\n         * Returns a hash code for this instance.\n         * \n         * @return A hash code.\n         ",
      "child_ranges": [
        "(line 615,col 13)-(line 615,col 42)",
        "(line 616,col 13)-(line 616,col 70)",
        "(line 617,col 13)-(line 617,col 68)",
        "(line 618,col 13)-(line 618,col 71)",
        "(line 619,col 13)-(line 619,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 629,
      "end_line": 633,
      "comment": "\n         * Provides serialization support.\n         *\n         * @param stream  the output stream.\n         *\n         * @throws IOException  if there is an I/O error.\n         ",
      "child_ranges": [
        "(line 630,col 13)-(line 630,col 40)",
        "(line 631,col 13)-(line 631,col 63)",
        "(line 632,col 13)-(line 632,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPointer.Pointer.readObject(java.io.ObjectInputStream)",
      "begin_line": 643,
      "end_line": 648,
      "comment": "\n         * Provides serialization support.\n         *\n         * @param stream  the input stream.\n         *\n         * @throws IOException  if there is an I/O error.\n         * @throws ClassNotFoundException  if there is a classpath problem.\n         ",
      "child_ranges": [
        "(line 645,col 13)-(line 645,col 39)",
        "(line 646,col 13)-(line 646,col 63)",
        "(line 647,col 13)-(line 647,col 66)"
      ]
    }
  ]
}