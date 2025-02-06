{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/panel/CrosshairOverlay.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CrosshairOverlay",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.panel.AbstractOverlay",
        "org.jfree.chart.panel.Overlay",
        "java.beans.PropertyChangeListener",
        "org.jfree.chart.util.PublicCloneable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 595,
      "comment": "\n * An overlay for a {@link ChartPanel} that draws crosshairs on a plot.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "xCrosshairs"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Storage for the crosshairs along the x-axis. "
    },
    {
      "type": "field",
      "varNames": [
        "yCrosshairs"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Storage for the crosshairs along the y-axis. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.CrosshairOverlay()",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 16)",
        "(line 91,col 9)-(line 91,col 53)",
        "(line 92,col 9)-(line 92,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.addDomainCrosshair(org.jfree.chart.plot.Crosshair)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n     * Adds a crosshair against the domain axis and sends an\n     * {@link OverlayChangeEvent} to all registered listeners.\n     *\n     * @param crosshair  the crosshair (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #removeDomainCrosshair(org.jfree.chart.plot.Crosshair)\n     * @see #addRangeCrosshair(org.jfree.chart.plot.Crosshair)\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 40)",
        "(line 109,col 9)-(line 109,col 50)",
        "(line 110,col 9)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.removeDomainCrosshair(org.jfree.chart.plot.Crosshair)",
      "begin_line": 121,
      "end_line": 129,
      "comment": "\n     * Removes a domain axis crosshair and sends an {@link OverlayChangeEvent}\n     * to all registered listeners.\n     *\n     * @param crosshair  the crosshair (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #addDomainCrosshair(org.jfree.chart.plot.Crosshair)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.clearDomainCrosshairs()",
      "begin_line": 135,
      "end_line": 146,
      "comment": "\n     * Clears all the domain crosshairs from the overlay and sends an\n     * {@link OverlayChangeEvent} to all registered listeners.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 48)",
        "(line 140,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.getDomainCrosshairs()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns a new list containing the domain crosshairs for this overlay.\n     *\n     * @return A list of crosshairs.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.addRangeCrosshair(org.jfree.chart.plot.Crosshair)",
      "begin_line": 163,
      "end_line": 170,
      "comment": "\n     * Adds a crosshair against the range axis and sends an\n     * {@link OverlayChangeEvent} to all registered listeners.\n     *\n     * @param crosshair  the crosshair (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 40)",
        "(line 168,col 9)-(line 168,col 50)",
        "(line 169,col 9)-(line 169,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.removeRangeCrosshair(org.jfree.chart.plot.Crosshair)",
      "begin_line": 180,
      "end_line": 188,
      "comment": "\n     * Removes a range axis crosshair and sends an {@link OverlayChangeEvent}\n     * to all registered listeners.\n     *\n     * @param crosshair  the crosshair (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #addRangeCrosshair(org.jfree.chart.plot.Crosshair)\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.clearRangeCrosshairs()",
      "begin_line": 194,
      "end_line": 205,
      "comment": "\n     * Clears all the range crosshairs from the overlay and sends an\n     * {@link OverlayChangeEvent} to all registered listeners.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 47)",
        "(line 199,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.getRangeCrosshairs()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Returns a new list containing the range crosshairs for this overlay.\n     *\n     * @return A list of crosshairs.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.propertyChange(java.beans.PropertyChangeEvent)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Receives a property change event (typically a change in one of the\n     * crosshairs).\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.paintOverlay(java.awt.Graphics2D, org.jfree.chart.ChartPanel)",
      "begin_line": 232,
      "end_line": 271,
      "comment": "\n     * Paints the crosshairs in the layer.\n     *\n     * @param g2  the graphics target.\n     * @param chartPanel  the chart panel.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 39)",
        "(line 234,col 9)-(line 234,col 62)",
        "(line 235,col 9)-(line 235,col 26)",
        "(line 236,col 9)-(line 236,col 49)",
        "(line 237,col 9)-(line 237,col 47)",
        "(line 238,col 9)-(line 238,col 47)",
        "(line 239,col 9)-(line 239,col 59)",
        "(line 240,col 9)-(line 240,col 56)",
        "(line 241,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 46)",
        "(line 255,col 9)-(line 255,col 58)",
        "(line 256,col 9)-(line 256,col 47)",
        "(line 257,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.drawHorizontalCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, org.jfree.chart.plot.Crosshair)",
      "begin_line": 281,
      "end_line": 321,
      "comment": "\n     * Draws a crosshair horizontally across the plot.\n     *\n     * @param g2  the graphics target.\n     * @param dataArea  the data area.\n     * @param y  the y-value in Java2D space.\n     * @param crosshair  the crosshair.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.drawVerticalCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, org.jfree.chart.plot.Crosshair)",
      "begin_line": 331,
      "end_line": 370,
      "comment": "\n     * Draws a crosshair vertically on the plot.\n     *\n     * @param g2  the graphics target.\n     * @param dataArea  the data area.\n     * @param x  the x-value in Java2D space.\n     * @param crosshair  the crosshair.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.calculateLabelPoint(java.awt.geom.Line2D, org.jfree.chart.util.RectangleAnchor, double, double)",
      "begin_line": 382,
      "end_line": 434,
      "comment": "\n     * Calculates the anchor point for a label.\n     *\n     * @param line  the line for the crosshair.\n     * @param anchor  the anchor point.\n     * @param deltaX  the x-offset.\n     * @param deltaY  the y-offset.\n     *\n     * @return The anchor point.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 23)",
        "(line 385,col 9)-(line 385,col 23)",
        "(line 386,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 391,col 56)",
        "(line 392,col 9)-(line 394,col 56)",
        "(line 395,col 9)-(line 397,col 59)",
        "(line 398,col 9)-(line 398,col 42)",
        "(line 401,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.textAlignPtForLabelAnchorV(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 444,
      "end_line": 471,
      "comment": "\n     * Returns the text anchor that is used to align a label to its anchor\n     * point.\n     *\n     * @param anchor  the anchor.\n     *\n     * @return The text alignment point.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 46)",
        "(line 446,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.textAlignPtForLabelAnchorH(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 481,
      "end_line": 508,
      "comment": "\n     * Returns the text anchor that is used to align a label to its anchor\n     * point.\n     *\n     * @param anchor  the anchor.\n     *\n     * @return The text alignment point.\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 46)",
        "(line 483,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.flipAnchorH(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 510,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 40)",
        "(line 512,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.flipAnchorV(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 533,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 40)",
        "(line 535,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.equals(java.lang.Object)",
      "begin_line": 563,
      "end_line": 578,
      "comment": "\n     * Tests this overlay for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 55)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.CrosshairOverlay.clone()",
      "begin_line": 588,
      "end_line": 593,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone of this instance.\n     *\n     * @throws java.lang.CloneNotSupportedException if there is some problem\n     *     with the cloning.\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 66)",
        "(line 590,col 9)-(line 590,col 79)",
        "(line 591,col 9)-(line 591,col 79)",
        "(line 592,col 9)-(line 592,col 21)"
      ]
    }
  ]
}