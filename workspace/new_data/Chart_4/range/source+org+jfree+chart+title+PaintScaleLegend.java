{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/title/PaintScaleLegend.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PaintScaleLegend",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.Title",
        "org.jfree.chart.event.AxisChangeListener",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 82,
      "end_line": 737,
      "comment": "\r\n * A legend that shows a range of values and their associated colors, driven\r\n * by an underlying {@link PaintScale} implementation.\r\n *\r\n * @since 1.0.4\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The paint scale (never \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "axis"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The value axis (never \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "axisLocation"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\r\n     * The axis location (handles both orientations, never\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The offset between the axis and the paint strip (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "stripWidth"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The thickness of the paint strip (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "stripOutlineVisible"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\r\n     * A flag that controls whether or not an outline is drawn around the\r\n     * paint strip.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stripOutlinePaint"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The paint used to draw an outline around the paint strip. "
    },
    {
      "type": "field",
      "varNames": [
        "stripOutlineStroke"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The stroke used to draw an outline around the paint strip. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The background paint (never \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "subdivisions"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\r\n     * The number of subdivisions for the scale when rendering.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.PaintScaleLegend.PaintScaleLegend(org.jfree.chart.renderer.PaintScale, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 134,
      "end_line": 150,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param scale  the scale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 25)",
        "(line 140,col 9)-(line 140,col 42)",
        "(line 141,col 9)-(line 141,col 56)",
        "(line 142,col 9)-(line 142,col 30)",
        "(line 143,col 9)-(line 143,col 73)",
        "(line 144,col 9)-(line 144,col 31)",
        "(line 145,col 9)-(line 145,col 40)",
        "(line 146,col 9)-(line 146,col 44)",
        "(line 147,col 9)-(line 147,col 56)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getScale()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Returns the scale used to convert values to colors.\r\n     *\r\n     * @return The scale (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setScale(PaintScale)\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setScale(org.jfree.chart.renderer.PaintScale)",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\r\n     * Sets the scale and sends a {@link TitleChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param scale  the scale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getScale()\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 27)",
        "(line 176,col 9)-(line 176,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getAxis()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the axis for the paint scale.\r\n     *\r\n     * @return The axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 198,
      "end_line": 206,
      "comment": "\r\n     * Sets the axis for the paint scale and sends a {@link TitleChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxis()\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 45)",
        "(line 203,col 9)-(line 203,col 25)",
        "(line 204,col 9)-(line 204,col 42)",
        "(line 205,col 9)-(line 205,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getAxisLocation()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns the axis location.\r\n     *\r\n     * @return The axis location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 227,
      "end_line": 233,
      "comment": "\r\n     * Sets the axis location and sends a {@link TitleChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 37)",
        "(line 232,col 9)-(line 232,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getAxisOffset()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Returns the offset between the axis and the paint strip.\r\n     *\r\n     * @return The offset between the axis and the paint strip.\r\n     *\r\n     * @see #setAxisOffset(double)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setAxisOffset(double)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\r\n     * Sets the offset between the axis and the paint strip and sends a\r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 254,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getStripWidth()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the width of the paint strip, in Java2D units.\r\n     *\r\n     * @return The width of the paint strip.\r\n     *\r\n     * @see #setStripWidth(double)\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setStripWidth(double)",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\r\n     * Sets the width of the paint strip and sends a {@link TitleChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param width  the width.\r\n     *\r\n     * @see #getStripWidth()\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 32)",
        "(line 278,col 9)-(line 278,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.isStripOutlineVisible()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\r\n     * Returns the flag that controls whether or not an outline is drawn\r\n     * around the paint strip.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setStripOutlineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setStripOutlineVisible(boolean)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\r\n     * Sets the flag that controls whether or not an outline is drawn around\r\n     * the paint strip, and sends a {@link TitleChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isStripOutlineVisible()\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 43)",
        "(line 304,col 9)-(line 304,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getStripOutlinePaint()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\r\n     * Returns the paint used to draw the outline of the paint strip.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setStripOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setStripOutlinePaint(java.awt.Paint)",
      "begin_line": 326,
      "end_line": 332,
      "comment": "\r\n     * Sets the paint used to draw the outline of the paint strip, and sends\r\n     * a {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getStripOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 39)",
        "(line 331,col 9)-(line 331,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getStripOutlineStroke()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\r\n     * Returns the stroke used to draw the outline around the paint strip.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setStripOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setStripOutlineStroke(java.awt.Stroke)",
      "begin_line": 353,
      "end_line": 359,
      "comment": "\r\n     * Sets the stroke used to draw the outline around the paint strip and\r\n     * sends a {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getStripOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 41)",
        "(line 358,col 9)-(line 358,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getBackgroundPaint()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the background paint.\r\n     *\r\n     * @return The background paint.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 376,
      "end_line": 379,
      "comment": "\r\n     * Sets the background paint and sends a {@link TitleChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 37)",
        "(line 378,col 9)-(line 378,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.getSubdivisionCount()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\r\n     * Returns the number of subdivisions used to draw the scale.\r\n     *\r\n     * @return The subdivision count.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.setSubdivisionCount(int)",
      "begin_line": 400,
      "end_line": 406,
      "comment": "\r\n     * Sets the subdivision count and sends a {@link TitleChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param count  the count.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 34)",
        "(line 405,col 9)-(line 405,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.axisChanged(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 416,
      "end_line": 420,
      "comment": "\r\n     * Receives notification of an axis change event and responds by firing\r\n     * a title change event.\r\n     *\r\n     * @param event  the event.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 419,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 431,
      "end_line": 472,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 65)",
        "(line 433,col 9)-(line 433,col 61)",
        "(line 434,col 9)-(line 434,col 62)",
        "(line 435,col 9)-(line 435,col 34)",
        "(line 436,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 471,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.arrangeRR(java.awt.Graphics2D, org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 485,
      "end_line": 514,
      "comment": "\r\n     * Returns the content size for the title.  This will reflect the fact that\r\n     * a text title positioned on the left or right of a chart will be rotated\r\n     * 90 degrees.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param widthRange  the width range.\r\n     * @param heightRange  the height range.\r\n     *\r\n     * @return The content size.\r\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 47)",
        "(line 489,col 9)-(line 513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\r\n     * Draws the legend within the specified area.\r\n     *\r\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param area  the drawing area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 535,
      "end_line": 659,
      "comment": "\r\n     * Draws the legend within the specified area.\r\n     *\r\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param area  the drawing area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param params  drawing parameters (ignored here).\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 56)",
        "(line 538,col 9)-(line 538,col 36)",
        "(line 539,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 36)",
        "(line 544,col 9)-(line 544,col 44)",
        "(line 545,col 9)-(line 545,col 37)",
        "(line 546,col 9)-(line 546,col 48)",
        "(line 547,col 9)-(line 547,col 80)",
        "(line 548,col 9)-(line 548,col 49)",
        "(line 550,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.equals(java.lang.Object)",
      "begin_line": 668,
      "end_line": 705,
      "comment": "\r\n     * Tests this legend for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 55)",
        "(line 673,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 714,
      "end_line": 719,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 36)",
        "(line 716,col 9)-(line 716,col 65)",
        "(line 717,col 9)-(line 717,col 67)",
        "(line 718,col 9)-(line 718,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.PaintScaleLegend.readObject(java.io.ObjectInputStream)",
      "begin_line": 729,
      "end_line": 735,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 35)",
        "(line 732,col 9)-(line 732,col 65)",
        "(line 733,col 9)-(line 733,col 67)",
        "(line 734,col 9)-(line 734,col 69)"
      ]
    }
  ]
}