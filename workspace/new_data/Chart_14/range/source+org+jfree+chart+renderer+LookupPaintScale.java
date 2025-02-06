{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/LookupPaintScale.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LookupPaintScale",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.PaintScale",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 376,
      "comment": "\r\n * A paint scale that uses a lookup table to associate paint instances\r\n * with data value ranges.\r\n * \r\n * @since 1.0.4\r\n "
    },
    {
      "type": "class_interface",
      "name": "PaintItem",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 157,
      "comment": "\r\n     * Stores the paint for a value.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The value. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.PaintItem(double, java.awt.Paint)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\r\n         * Creates a new instance.\r\n         * \r\n         * @param value  the value.\r\n         * @param paint  the paint.\r\n         ",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 31)",
        "(line 88,col 13)-(line 88,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.compareTo(java.lang.Object)",
      "begin_line": 94,
      "end_line": 105,
      "comment": " (non-Javadoc)\r\n         * @see java.lang.Comparable#compareTo(java.lang.Object)\r\n         ",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 45)",
        "(line 96,col 13)-(line 96,col 35)",
        "(line 97,col 13)-(line 97,col 35)",
        "(line 98,col 13)-(line 100,col 13)",
        "(line 101,col 13)-(line 103,col 13)",
        "(line 104,col 13)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.equals(java.lang.Object)",
      "begin_line": 114,
      "end_line": 129,
      "comment": "\r\n         * Tests this item for equality with an arbitrary object.\r\n         * \r\n         * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n         * \r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 115,col 13)-(line 117,col 13)",
        "(line 118,col 13)-(line 120,col 13)",
        "(line 121,col 13)-(line 121,col 45)",
        "(line 122,col 13)-(line 124,col 13)",
        "(line 125,col 13)-(line 127,col 13)",
        "(line 128,col 13)-(line 128,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\r\n         * Provides serialization support.\r\n         *\r\n         * @param stream  the output stream.\r\n         *\r\n         * @throws IOException  if there is an I/O error.\r\n         ",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 40)",
        "(line 140,col 13)-(line 140,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.readObject(java.io.ObjectInputStream)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\r\n         * Provides serialization support.\r\n         *\r\n         * @param stream  the input stream.\r\n         *\r\n         * @throws IOException  if there is an I/O error.\r\n         * @throws ClassNotFoundException  if there is a classpath problem.\r\n         ",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 39)",
        "(line 154,col 13)-(line 154,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The upper bound. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultPaint"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "lookupTable"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " The lookup table. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.LookupPaintScale()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Creates a new paint scale.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.LookupPaintScale(double, double, java.awt.Paint)",
      "begin_line": 186,
      "end_line": 199,
      "comment": "\r\n     * Creates a new paint scale with the specified default paint.\r\n     * \r\n     * @param lowerBound  the lower bound.\r\n     * @param upperBound  the upper bound.\r\n     * @param defaultPaint  the default paint (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 37)",
        "(line 196,col 9)-(line 196,col 37)",
        "(line 197,col 9)-(line 197,col 41)",
        "(line 198,col 9)-(line 198,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.getDefaultPaint()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns the default paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @return The default paint.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.getLowerBound()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Returns the lower bound.\r\n     * \r\n     * @return The lower bound.\r\n     * \r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.getUpperBound()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Returns the upper bound.\r\n     * \r\n     * @return The upper bound.\r\n     * \r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.add(double, java.awt.Paint)",
      "begin_line": 242,
      "end_line": 251,
      "comment": "\r\n     * Adds an entry to the lookup table.  Any values from \u003ccode\u003en\u003c/code\u003e up\r\n     * to but not including the next value in the table take on the specified\r\n     * \u003ccode\u003epaint\u003c/code\u003e.\r\n     * \r\n     * @param value  the data value.\r\n     * @param paint  the paint.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 53)",
        "(line 244,col 9)-(line 244,col 69)",
        "(line 245,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.getPaint(double)",
      "begin_line": 262,
      "end_line": 303,
      "comment": "\r\n     * Returns the paint associated with the specified value.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @return The paint.\r\n     * \r\n     * @see #getDefaultPaint()\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 44)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 278,col 9)-(line 278,col 61)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 284,col 9)-(line 284,col 20)",
        "(line 285,col 9)-(line 285,col 47)",
        "(line 286,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.equals(java.lang.Object)",
      "begin_line": 313,
      "end_line": 334,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 55)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.clone()",
      "begin_line": 344,
      "end_line": 348,
      "comment": "\r\n     * Returns a clone of the instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *     instance.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 66)",
        "(line 346,col 9)-(line 346,col 70)",
        "(line 347,col 9)-(line 347,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 357,
      "end_line": 360,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 36)",
        "(line 359,col 9)-(line 359,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.readObject(java.io.ObjectInputStream)",
      "begin_line": 370,
      "end_line": 374,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 35)",
        "(line 373,col 9)-(line 373,col 62)"
      ]
    }
  ]
}