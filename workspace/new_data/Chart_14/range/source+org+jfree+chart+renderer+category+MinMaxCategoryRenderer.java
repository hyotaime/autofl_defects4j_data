{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/MinMaxCategoryRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinMaxCategoryRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer"
      ],
      "begin_line": 99,
      "end_line": 565,
      "comment": "\r\n * Renderer for drawing min max plot. This renderer draws all the series under \r\n * the same category in the same x position using \u003ccode\u003eobjectIcon\u003c/code\u003e and \r\n * a line from the maximum value to the minimum value.\r\n * \u003cp\u003e\r\n * For use with the {@link org.jfree.chart.plot.CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plotLines"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " A flag indicating whether or not lines are drawn between XY points. "
    },
    {
      "type": "field",
      "varNames": [
        "groupPaint"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " \r\n     * The paint of the line between the minimum value and the maximum value.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "groupStroke"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " \r\n     * The stroke of the line between the minimum value and the maximum value.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minIcon"
      ],
      "begin_line": 118,
      "end_line": 119,
      "comment": " The icon used to indicate the minimum value."
    },
    {
      "type": "field",
      "varNames": [
        "maxIcon"
      ],
      "begin_line": 122,
      "end_line": 123,
      "comment": " The icon used to indicate the maximum value."
    },
    {
      "type": "field",
      "varNames": [
        "objectIcon"
      ],
      "begin_line": 126,
      "end_line": 127,
      "comment": " The icon used to indicate the values."
    },
    {
      "type": "field",
      "varNames": [
        "lastCategory"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The last category. "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The minimum. "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The maximum. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.MinMaxCategoryRenderer()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.isDrawLines()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Gets whether or not lines are drawn between category points.\r\n     *\r\n     * @return boolean true if line will be drawn between sequenced categories,\r\n     *         otherwise false.\r\n     *         \r\n     * @see #setDrawLines(boolean)\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setDrawLines(boolean)",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\r\n     * Sets the flag that controls whether or not lines are drawn to connect\r\n     * the items within a series and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param draw  the new value of the flag.\r\n     * \r\n     * @see #isDrawLines()\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getGroupPaint()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns the paint used to draw the line between the minimum and maximum\r\n     * value items in each category.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setGroupPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupPaint(java.awt.Paint)",
      "begin_line": 195,
      "end_line": 201,
      "comment": "\r\n     * Sets the paint used to draw the line between the minimum and maximum\r\n     * value items in each category and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getGroupPaint()\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 32)",
        "(line 200,col 9)-(line 200,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getGroupStroke()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns the stroke used to draw the line between the minimum and maximum\r\n     * value items in each category.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setGroupStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupStroke(java.awt.Stroke)",
      "begin_line": 222,
      "end_line": 228,
      "comment": "\r\n     * Sets the stroke of the line between the minimum value and the maximum \r\n     * value and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param stroke the new stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 34)",
        "(line 227,col 9)-(line 227,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getObjectIcon()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the icon drawn for each data item.\r\n     *\r\n     * @return The icon (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setObjectIcon(Icon)\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setObjectIcon(javax.swing.Icon)",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\r\n     * Sets the icon drawn for each data item.\r\n     *\r\n     * @param icon  the icon.\r\n     * \r\n     * @see #getObjectIcon()\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 31)",
        "(line 253,col 9)-(line 253,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getMaxIcon()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the icon displayed for the maximum value data item within each\r\n     * category.\r\n     *\r\n     * @return The icon (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setMaxIcon(Icon)\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMaxIcon(javax.swing.Icon)",
      "begin_line": 277,
      "end_line": 283,
      "comment": "\r\n     * Sets the icon displayed for the maximum value data item within each\r\n     * category and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param icon  the icon (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getMaxIcon()\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 28)",
        "(line 282,col 9)-(line 282,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getMinIcon()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\r\n     * Returns the icon displayed for the minimum value data item within each\r\n     * category.\r\n     *\r\n     * @return The icon (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setMinIcon(Icon)\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMinIcon(javax.swing.Icon)",
      "begin_line": 306,
      "end_line": 312,
      "comment": "\r\n     * Sets the icon displayed for the minimum value data item within each\r\n     * category and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param icon  the icon (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getMinIcon()\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 28)",
        "(line 311,col 9)-(line 311,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 328,
      "end_line": 421,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 53)",
        "(line 335,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.equals(java.lang.Object)",
      "begin_line": 433,
      "end_line": 451,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.  The icon fields\r\n     * are NOT included in the test, so this implementation is a little weak.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 67)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon(java.awt.Shape, java.awt.Paint, java.awt.Paint)",
      "begin_line": 462,
      "end_line": 492,
      "comment": "\r\n     * Returns an icon.\r\n     *\r\n     * @param shape  the shape.\r\n     * @param fillPaint  the fill paint.\r\n     * @param outlinePaint  the outline paint.\r\n     *\r\n     * @return The icon.\r\n     ",
      "child_ranges": [
        "(line 465,col 7)-(line 465,col 48)",
        "(line 466,col 7)-(line 466,col 50)",
        "(line 467,col 7)-(line 467,col 54)",
        "(line 468,col 7)-(line 491,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-ab81dc8c-e89a-4159-a4ed-5f7ff5455018.paintIcon(java.awt.Component, java.awt.Graphics, int, int)",
      "begin_line": 469,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 470,col 15)-(line 470,col 45)",
        "(line 471,col 15)-(line 471,col 73)",
        "(line 472,col 15)-(line 475,col 15)",
        "(line 476,col 15)-(line 479,col 15)",
        "(line 480,col 15)-(line 480,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-9437e8c5-7cbc-4ac8-9be5-25d84effafb6.getIconWidth()",
      "begin_line": 483,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 13)-(line 484,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-74fda2fe-e89a-4604-a62c-5cc9cb24c6bb.getIconHeight()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 13)-(line 488,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon(java.awt.Shape, boolean, boolean)",
      "begin_line": 503,
      "end_line": 529,
      "comment": "\r\n     * Returns an icon from a shape.\r\n     *\r\n     * @param shape  the shape.\r\n     * @param fill  the fill flag.\r\n     * @param outline  the outline flag.\r\n     *\r\n     * @return The icon.\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 50)",
        "(line 506,col 9)-(line 506,col 52)",
        "(line 507,col 9)-(line 507,col 56)",
        "(line 508,col 9)-(line 528,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-2f014b13-8bbe-4071-a08b-f3891996f94f.paintIcon(java.awt.Component, java.awt.Graphics, int, int)",
      "begin_line": 509,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 510,col 17)-(line 510,col 47)",
        "(line 511,col 17)-(line 511,col 75)",
        "(line 512,col 17)-(line 514,col 17)",
        "(line 515,col 17)-(line 517,col 17)",
        "(line 518,col 17)-(line 518,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-07576d2c-f6e9-4e8c-a189-4cac25e16bbb.getIconWidth()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 17)-(line 522,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-15cb0171-bf3c-4101-82f7-686e1a851aa5.getIconHeight()",
      "begin_line": 525,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 526,col 17)-(line 526,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 538,
      "end_line": 542,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 36)",
        "(line 540,col 9)-(line 540,col 62)",
        "(line 541,col 9)-(line 541,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 552,
      "end_line": 563,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 35)",
        "(line 555,col 9)-(line 555,col 62)",
        "(line 556,col 9)-(line 556,col 60)",
        "(line 558,col 9)-(line 559,col 48)",
        "(line 560,col 9)-(line 561,col 48)",
        "(line 562,col 9)-(line 562,col 79)"
      ]
    }
  ]
}