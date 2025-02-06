{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/title/Title.java",
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
      "begin_line": 89,
      "end_line": 440,
      "comment": "\r\n * The base class for all chart titles.  A chart can have multiple titles, \r\n * appearing at the top, bottom, left or right of the chart.\r\n * \u003cP\u003e\r\n * Concrete implementations of this class will render text and images, and \r\n * hence do the actual work of drawing titles.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_POSITION"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The default title position. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_HORIZONTAL_ALIGNMENT"
      ],
      "begin_line": 99,
      "end_line": 100,
      "comment": " The default horizontal alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VERTICAL_ALIGNMENT"
      ],
      "begin_line": 103,
      "end_line": 104,
      "comment": " The default vertical alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PADDING"
      ],
      "begin_line": 107,
      "end_line": 108,
      "comment": " Default title padding. "
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The title position. "
    },
    {
      "type": "field",
      "varNames": [
        "horizontalAlignment"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The horizontal alignment of the title content. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalAlignment"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The vertical alignment of the title content. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "notify"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " \r\n     * A flag that can be used to temporarily disable the listener mechanism. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.Title.Title()",
      "begin_line": 130,
      "end_line": 134,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.Title.Title(org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment)",
      "begin_line": 146,
      "end_line": 153,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     *\r\n     * @param position  the position of the title (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                  permitted).\r\n     * @param horizontalAlignment  the horizontal alignment of the title \r\n     *                             (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param verticalAlignment  the vertical alignment of the title \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 151,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.Title.Title(org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, org.jfree.chart.util.RectangleInsets)",
      "begin_line": 169,
      "end_line": 198,
      "comment": "\r\n     * Creates a new title.\r\n     *\r\n     * @param position  the position of the title (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                  permitted).\r\n     * @param horizontalAlignment  the horizontal alignment of the title (LEFT,\r\n     *                             CENTER or RIGHT, \u003ccode\u003enull\u003c/code\u003e not \r\n     *                             permitted).\r\n     * @param verticalAlignment  the vertical alignment of the title (TOP, \r\n     *                           MIDDLE or BOTTOM, \u003ccode\u003enull\u003c/code\u003e not \r\n     *                           permitted).\r\n     * @param padding  the amount of space to leave around the outside of the \r\n     *                 title (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 33)",
        "(line 192,col 9)-(line 192,col 55)",
        "(line 193,col 9)-(line 193,col 51)",
        "(line 194,col 9)-(line 194,col 28)",
        "(line 195,col 9)-(line 195,col 52)",
        "(line 196,col 9)-(line 196,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.getPosition()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the position of the title.\r\n     *\r\n     * @return The title position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setPosition(org.jfree.chart.util.RectangleEdge)",
      "begin_line": 215,
      "end_line": 223,
      "comment": "\r\n     * Sets the position for the title and sends a {@link TitleChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.getHorizontalAlignment()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Returns the horizontal alignment of the title.\r\n     *\r\n     * @return The horizontal alignment (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setHorizontalAlignment(org.jfree.chart.util.HorizontalAlignment)",
      "begin_line": 241,
      "end_line": 249,
      "comment": "\r\n     * Sets the horizontal alignment for the title and sends a \r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param alignment  the horizontal alignment (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                   permitted).\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.getVerticalAlignment()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\r\n     * Returns the vertical alignment of the title.\r\n     *\r\n     * @return The vertical alignment (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setVerticalAlignment(org.jfree.chart.util.VerticalAlignment)",
      "begin_line": 267,
      "end_line": 275,
      "comment": "\r\n     * Sets the vertical alignment for the title, and notifies any registered\r\n     * listeners of the change.\r\n     *\r\n     * @param alignment  the new vertical alignment (TOP, MIDDLE or BOTTOM, \r\n     *                   \u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.getNotify()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Returns the flag that indicates whether or not the notification \r\n     * mechanism is enabled.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.setNotify(boolean)",
      "begin_line": 294,
      "end_line": 299,
      "comment": "\r\n     * Sets the flag that indicates whether or not the notification mechanism\r\n     * is enabled.  There are certain situations (such as cloning) where you\r\n     * want to turn notification off temporarily.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 27)",
        "(line 296,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 309,
      "end_line": 309,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area allocated for the title (subclasses should not\r\n     *              draw outside this area).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.clone()",
      "begin_line": 323,
      "end_line": 329,
      "comment": "\r\n     * Returns a clone of the title.\r\n     * \u003cP\u003e\r\n     * One situation when this is useful is when editing the title properties -\r\n     * you can edit a clone, and then it is easier to cancel the changes if\r\n     * necessary.\r\n     *\r\n     * @return A clone of the title.\r\n     *\r\n     * @throws CloneNotSupportedException not thrown by this class, but it may \r\n     *         be thrown by subclasses.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 48)",
        "(line 326,col 9)-(line 326,col 57)",
        "(line 328,col 9)-(line 328,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.addChangeListener(org.jfree.chart.event.TitleChangeListener)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\r\n     * Registers an object for notification of changes to the title.\r\n     *\r\n     * @param listener  the object that is being registered.\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.removeChangeListener(org.jfree.chart.event.TitleChangeListener)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Unregisters an object for notification of changes to the chart title.\r\n     *\r\n     * @param listener  the object that is being unregistered.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.notifyListeners(org.jfree.chart.event.TitleChangeEvent)",
      "begin_line": 356,
      "end_line": 366,
      "comment": "\r\n     * Notifies all registered listeners that the chart title has changed in \r\n     * some way.\r\n     *\r\n     * @param event  an object that contains information about the change to \r\n     *               the title.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.equals(java.lang.Object)",
      "begin_line": 375,
      "end_line": 399,
      "comment": "\r\n     * Tests an object for equality with this title.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 33)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.hashCode()",
      "begin_line": 406,
      "end_line": 413,
      "comment": "\r\n     * Returns a hashcode for the title.\r\n     * \r\n     * @return The hashcode.\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 25)",
        "(line 408,col 9)-(line 408,col 71)",
        "(line 409,col 9)-(line 410,col 69)",
        "(line 411,col 9)-(line 411,col 80)",
        "(line 412,col 9)-(line 412,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.Title.readObject(java.io.ObjectInputStream)",
      "begin_line": 434,
      "end_line": 438,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 35)",
        "(line 437,col 9)-(line 437,col 52)"
      ]
    }
  ]
}