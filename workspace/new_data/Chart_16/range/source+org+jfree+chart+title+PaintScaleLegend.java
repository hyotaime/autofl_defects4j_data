{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/title/PaintScaleLegend.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PaintScaleLegend",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.Title",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 77,
      "end_line": 657,
      "comment": "\r\n * A legend that shows a range of values and their associated colors, driven\r\n * by an underlying {@link PaintScale} implementation.\r\n * \r\n * @since 1.0.4\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The paint scale (never \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "axis"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The value axis (never \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "axisLocation"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " \r\n     * The axis location (handles both orientations, never \r\n     * \u003ccode\u003enull\u003c/code\u003e). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The offset between the axis and the paint strip (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "stripWidth"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The thickness of the paint strip (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "stripOutlineVisible"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " \r\n     * A flag that controls whether or not an outline is drawn around the\r\n     * paint strip.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stripOutlinePaint"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The paint used to draw an outline around the paint strip. "
    },
    {
      "type": "field",
      "varNames": [
        "stripOutlineStroke"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The stroke used to draw an outline around the paint strip. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The background paint (never \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.PaintScaleLegend.PaintScaleLegend(org.jfree.chart.renderer.PaintScale, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 118,
      "end_line": 131,
      "comment": "\r\n     * Creates a new instance.\r\n     * \r\n     * @param scale  the scale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 27)",
        "(line 123,col 9)-(line 123,col 25)",
        "(line 124,col 9)-(line 124,col 56)",
        "(line 125,col 9)-(line 125,col 30)",
        "(line 126,col 9)-(line 126,col 31)",
        "(line 127,col 9)-(line 127,col 41)",
        "(line 128,col 9)-(line 128,col 44)",
        "(line 129,col 9)-(line 129,col 56)",
        "(line 130,col 9)-(line 130,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getScale()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the scale used to convert values to colors.\r\n     * \r\n     * @return The scale (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setScale(PaintScale)\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setScale(org.jfree.chart.renderer.PaintScale)",
      "begin_line": 152,
      "end_line": 158,
      "comment": "\r\n     * Sets the scale and sends a {@link TitleChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param scale  the scale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getScale()\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 27)",
        "(line 157,col 9)-(line 157,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getAxis()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the axis for the paint scale.\r\n     * \r\n     * @return The axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 179,
      "end_line": 185,
      "comment": "\r\n     * Sets the axis for the paint scale and sends a {@link TitleChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxis()\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 25)",
        "(line 184,col 9)-(line 184,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getAxisLocation()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns the axis location.\r\n     * \r\n     * @return The axis location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 206,
      "end_line": 212,
      "comment": "\r\n     * Sets the axis location and sends a {@link TitleChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 37)",
        "(line 211,col 9)-(line 211,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getAxisOffset()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns the offset between the axis and the paint strip.\r\n     * \r\n     * @return The offset between the axis and the paint strip.\r\n     * \r\n     * @see #setAxisOffset(double)\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setAxisOffset(double)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "\r\n     * Sets the offset between the axis and the paint strip and sends a \r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 33)",
        "(line 233,col 9)-(line 233,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getStripWidth()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the width of the paint strip, in Java2D units.\r\n     * \r\n     * @return The width of the paint strip.\r\n     * \r\n     * @see #setStripWidth(double)\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setStripWidth(double)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\r\n     * Sets the width of the paint strip and sends a {@link TitleChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param width  the width.\r\n     * \r\n     * @see #getStripWidth()\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 32)",
        "(line 257,col 9)-(line 257,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.isStripOutlineVisible()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Returns the flag that controls whether or not an outline is drawn \r\n     * around the paint strip.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setStripOutlineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setStripOutlineVisible(boolean)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\r\n     * Sets the flag that controls whether or not an outline is drawn around\r\n     * the paint strip, and sends a {@link TitleChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isStripOutlineVisible()\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 43)",
        "(line 283,col 9)-(line 283,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getStripOutlinePaint()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\r\n     * Returns the paint used to draw the outline of the paint strip.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setStripOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setStripOutlinePaint(java.awt.Paint)",
      "begin_line": 305,
      "end_line": 311,
      "comment": "\r\n     * Sets the paint used to draw the outline of the paint strip, and sends\r\n     * a {@link TitleChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getStripOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 310,col 9)-(line 310,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getStripOutlineStroke()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\r\n     * Returns the stroke used to draw the outline around the paint strip.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setStripOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setStripOutlineStroke(java.awt.Stroke)",
      "begin_line": 332,
      "end_line": 338,
      "comment": "\r\n     * Sets the stroke used to draw the outline around the paint strip and \r\n     * sends a {@link TitleChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getStripOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 41)",
        "(line 337,col 9)-(line 337,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getBackgroundPaint()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Returns the background paint.\r\n     * \r\n     * @return The background paint.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 355,
      "end_line": 358,
      "comment": "\r\n     * Sets the background paint and sends a {@link TitleChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 37)",
        "(line 357,col 9)-(line 357,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 369,
      "end_line": 410,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and \r\n     * returns the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 65)",
        "(line 371,col 9)-(line 371,col 61)",
        "(line 372,col 9)-(line 372,col 62)",
        "(line 373,col 9)-(line 373,col 34)",
        "(line 374,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 409,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.arrangeRR(java.awt.Graphics2D, org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 423,
      "end_line": 452,
      "comment": "\r\n     * Returns the content size for the title.  This will reflect the fact that\r\n     * a text title positioned on the left or right of a chart will be rotated\r\n     * 90 degrees.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param widthRange  the width range.\r\n     * @param heightRange  the height range.\r\n     * \r\n     * @return The content size.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 47)",
        "(line 427,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\r\n     * Draws the legend within the specified area.\r\n     * \r\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param area  the drawing area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SUBDIVISIONS"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": " \r\n     * The number of subdivisions to use when drawing the paint strip.  Maybe\r\n     * this need to be user controllable? \r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 479,
      "end_line": 582,
      "comment": "\r\n     * Draws the legend within the specified area.\r\n     * \r\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param area  the drawing area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param params  drawing parameters (ignored here).\r\n     * \r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 56)",
        "(line 482,col 9)-(line 482,col 36)",
        "(line 483,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 36)",
        "(line 488,col 9)-(line 488,col 44)",
        "(line 489,col 9)-(line 489,col 37)",
        "(line 490,col 9)-(line 490,col 48)",
        "(line 491,col 9)-(line 491,col 75)",
        "(line 492,col 9)-(line 492,col 49)",
        "(line 495,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.equals(java.lang.Object)",
      "begin_line": 591,
      "end_line": 625,
      "comment": "\r\n     * Tests this legend for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 55)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 634,
      "end_line": 639,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 36)",
        "(line 636,col 9)-(line 636,col 65)",
        "(line 637,col 9)-(line 637,col 67)",
        "(line 638,col 9)-(line 638,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.readObject(java.io.ObjectInputStream)",
      "begin_line": 649,
      "end_line": 655,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 35)",
        "(line 652,col 9)-(line 652,col 65)",
        "(line 653,col 9)-(line 653,col 67)",
        "(line 654,col 9)-(line 654,col 69)"
      ]
    }
  ]
}