{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/title/Title.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Title",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.AbstractBlock",
        "org.jfree.chart.block.Block",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 90,
      "end_line": 477,
      "comment": "\r\n * The base class for all chart titles.  A chart can have multiple titles,\r\n * appearing at the top, bottom, left or right of the chart.\r\n * \u003cP\u003e\r\n * Concrete implementations of this class will render text and images, and\r\n * hence do the actual work of drawing titles.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_POSITION"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The default title position. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_HORIZONTAL_ALIGNMENT"
      ],
      "begin_line": 100,
      "end_line": 101,
      "comment": " The default horizontal alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VERTICAL_ALIGNMENT"
      ],
      "begin_line": 104,
      "end_line": 105,
      "comment": " The default vertical alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PADDING"
      ],
      "begin_line": 108,
      "end_line": 109,
      "comment": " Default title padding. "
    },
    {
      "type": "field",
      "varNames": [
        "visible"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\r\n     * A flag that controls whether or not the title is visible.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The title position. "
    },
    {
      "type": "field",
      "varNames": [
        "horizontalAlignment"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The horizontal alignment of the title content. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalAlignment"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " The vertical alignment of the title content. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "notify"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\r\n     * A flag that can be used to temporarily disable the listener mechanism.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.Title.Title()",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.Title.Title(org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment)",
      "begin_line": 154,
      "end_line": 161,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     *\r\n     * @param position  the position of the title (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                  permitted).\r\n     * @param horizontalAlignment  the horizontal alignment of the title\r\n     *                             (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param verticalAlignment  the vertical alignment of the title\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 159,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.Title.Title(org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, org.jfree.chart.util.RectangleInsets)",
      "begin_line": 177,
      "end_line": 207,
      "comment": "\r\n     * Creates a new title.\r\n     *\r\n     * @param position  the position of the title (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                  permitted).\r\n     * @param horizontalAlignment  the horizontal alignment of the title (LEFT,\r\n     *                             CENTER or RIGHT, \u003ccode\u003enull\u003c/code\u003e not\r\n     *                             permitted).\r\n     * @param verticalAlignment  the vertical alignment of the title (TOP,\r\n     *                           MIDDLE or BOTTOM, \u003ccode\u003enull\u003c/code\u003e not\r\n     *                           permitted).\r\n     * @param padding  the amount of space to leave around the outside of the\r\n     *                 title (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 28)",
        "(line 200,col 9)-(line 200,col 33)",
        "(line 201,col 9)-(line 201,col 55)",
        "(line 202,col 9)-(line 202,col 51)",
        "(line 203,col 9)-(line 203,col 28)",
        "(line 204,col 9)-(line 204,col 52)",
        "(line 205,col 9)-(line 205,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.isVisible()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Returns a flag that controls whether or not the title should be\r\n     * drawn.  The default value is \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setVisible(boolean)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setVisible(boolean)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\r\n     * Sets a flag that controls whether or not the title should be drawn, and\r\n     * sends a {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @see #isVisible()\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 31)",
        "(line 235,col 9)-(line 235,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.getPosition()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the position of the title.\r\n     *\r\n     * @return The title position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setPosition(org.jfree.chart.util.RectangleEdge)",
      "begin_line": 253,
      "end_line": 261,
      "comment": "\r\n     * Sets the position for the title and sends a {@link TitleChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.getHorizontalAlignment()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Returns the horizontal alignment of the title.\r\n     *\r\n     * @return The horizontal alignment (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setHorizontalAlignment(org.jfree.chart.util.HorizontalAlignment)",
      "begin_line": 279,
      "end_line": 287,
      "comment": "\r\n     * Sets the horizontal alignment for the title and sends a\r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param alignment  the horizontal alignment (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                   permitted).\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 286,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.getVerticalAlignment()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\r\n     * Returns the vertical alignment of the title.\r\n     *\r\n     * @return The vertical alignment (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setVerticalAlignment(org.jfree.chart.util.VerticalAlignment)",
      "begin_line": 305,
      "end_line": 313,
      "comment": "\r\n     * Sets the vertical alignment for the title, and notifies any registered\r\n     * listeners of the change.\r\n     *\r\n     * @param alignment  the new vertical alignment (TOP, MIDDLE or BOTTOM,\r\n     *                   \u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.getNotify()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\r\n     * Returns the flag that indicates whether or not the notification\r\n     * mechanism is enabled.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setNotify(boolean)",
      "begin_line": 332,
      "end_line": 337,
      "comment": "\r\n     * Sets the flag that indicates whether or not the notification mechanism\r\n     * is enabled.  There are certain situations (such as cloning) where you\r\n     * want to turn notification off temporarily.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 27)",
        "(line 334,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 347,
      "end_line": 347,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area allocated for the title (subclasses should not\r\n     *              draw outside this area).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.clone()",
      "begin_line": 361,
      "end_line": 366,
      "comment": "\r\n     * Returns a clone of the title.\r\n     * \u003cP\u003e\r\n     * One situation when this is useful is when editing the title properties -\r\n     * you can edit a clone, and then it is easier to cancel the changes if\r\n     * necessary.\r\n     *\r\n     * @return A clone of the title.\r\n     *\r\n     * @throws CloneNotSupportedException not thrown by this class, but it may\r\n     *         be thrown by subclasses.\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 48)",
        "(line 363,col 9)-(line 363,col 57)",
        "(line 365,col 9)-(line 365,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.addChangeListener(org.jfree.chart.event.TitleChangeListener)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\r\n     * Registers an object for notification of changes to the title.\r\n     *\r\n     * @param listener  the object that is being registered.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.removeChangeListener(org.jfree.chart.event.TitleChangeListener)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Unregisters an object for notification of changes to the chart title.\r\n     *\r\n     * @param listener  the object that is being unregistered.\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.notifyListeners(org.jfree.chart.event.TitleChangeEvent)",
      "begin_line": 393,
      "end_line": 403,
      "comment": "\r\n     * Notifies all registered listeners that the chart title has changed in\r\n     * some way.\r\n     *\r\n     * @param event  an object that contains information about the change to\r\n     *               the title.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.equals(java.lang.Object)",
      "begin_line": 412,
      "end_line": 436,
      "comment": "\r\n     * Tests an object for equality with this title.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 33)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.hashCode()",
      "begin_line": 443,
      "end_line": 450,
      "comment": "\r\n     * Returns a hashcode for the title.\r\n     *\r\n     * @return The hashcode.\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 25)",
        "(line 445,col 9)-(line 445,col 71)",
        "(line 446,col 9)-(line 447,col 69)",
        "(line 448,col 9)-(line 448,col 80)",
        "(line 449,col 9)-(line 449,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.readObject(java.io.ObjectInputStream)",
      "begin_line": 471,
      "end_line": 475,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 35)",
        "(line 474,col 9)-(line 474,col 52)"
      ]
    }
  ]
}