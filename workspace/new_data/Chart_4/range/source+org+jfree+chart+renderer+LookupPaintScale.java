{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/LookupPaintScale.java",
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
      "begin_line": 67,
      "end_line": 383,
      "comment": "\r\n * A paint scale that uses a lookup table to associate paint instances\r\n * with data value ranges.\r\n *\r\n * @since 1.0.4\r\n "
    },
    {
      "type": "class_interface",
      "name": "PaintItem",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 161,
      "comment": "\r\n     * Stores the paint for a value.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The value. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.PaintItem(double, java.awt.Paint)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\r\n         * Creates a new instance.\r\n         *\r\n         * @param value  the value.\r\n         * @param paint  the paint.\r\n         ",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 31)",
        "(line 92,col 13)-(line 92,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.compareTo(java.lang.Object)",
      "begin_line": 98,
      "end_line": 109,
      "comment": " (non-Javadoc)\r\n         * @see java.lang.Comparable#compareTo(java.lang.Object)\r\n         ",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 45)",
        "(line 100,col 13)-(line 100,col 35)",
        "(line 101,col 13)-(line 101,col 35)",
        "(line 102,col 13)-(line 104,col 13)",
        "(line 105,col 13)-(line 107,col 13)",
        "(line 108,col 13)-(line 108,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.equals(java.lang.Object)",
      "begin_line": 118,
      "end_line": 133,
      "comment": "\r\n         * Tests this item for equality with an arbitrary object.\r\n         *\r\n         * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n         *\r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 119,col 13)-(line 121,col 13)",
        "(line 122,col 13)-(line 124,col 13)",
        "(line 125,col 13)-(line 125,col 45)",
        "(line 126,col 13)-(line 128,col 13)",
        "(line 129,col 13)-(line 131,col 13)",
        "(line 132,col 13)-(line 132,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\r\n         * Provides serialization support.\r\n         *\r\n         * @param stream  the output stream.\r\n         *\r\n         * @throws IOException  if there is an I/O error.\r\n         ",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 40)",
        "(line 144,col 13)-(line 144,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.PaintItem.readObject(java.io.ObjectInputStream)",
      "begin_line": 155,
      "end_line": 159,
      "comment": "\r\n         * Provides serialization support.\r\n         *\r\n         * @param stream  the input stream.\r\n         *\r\n         * @throws IOException  if there is an I/O error.\r\n         * @throws ClassNotFoundException  if there is a classpath problem.\r\n         ",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 39)",
        "(line 158,col 13)-(line 158,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The upper bound. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultPaint"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "lookupTable"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " The lookup table. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.LookupPaintScale()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\r\n     * Creates a new paint scale.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.LookupPaintScale(double, double, java.awt.Paint)",
      "begin_line": 193,
      "end_line": 206,
      "comment": "\r\n     * Creates a new paint scale with the specified default paint.\r\n     *\r\n     * @param lowerBound  the lower bound.\r\n     * @param upperBound  the upper bound.\r\n     * @param defaultPaint  the default paint (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 37)",
        "(line 203,col 9)-(line 203,col 37)",
        "(line 204,col 9)-(line 204,col 41)",
        "(line 205,col 9)-(line 205,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.getDefaultPaint()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Returns the default paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @return The default paint.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.getLowerBound()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the lower bound.\r\n     *\r\n     * @return The lower bound.\r\n     *\r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.getUpperBound()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\r\n     * Returns the upper bound.\r\n     *\r\n     * @return The upper bound.\r\n     *\r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.add(double, java.awt.Paint)",
      "begin_line": 249,
      "end_line": 258,
      "comment": "\r\n     * Adds an entry to the lookup table.  Any values from \u003ccode\u003en\u003c/code\u003e up\r\n     * to but not including the next value in the table take on the specified\r\n     * \u003ccode\u003epaint\u003c/code\u003e.\r\n     *\r\n     * @param value  the data value.\r\n     * @param paint  the paint.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 53)",
        "(line 251,col 9)-(line 251,col 69)",
        "(line 252,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.getPaint(double)",
      "begin_line": 269,
      "end_line": 310,
      "comment": "\r\n     * Returns the paint associated with the specified value.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #getDefaultPaint()\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 44)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 285,col 9)-(line 285,col 61)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 291,col 9)-(line 291,col 20)",
        "(line 292,col 9)-(line 292,col 47)",
        "(line 293,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.equals(java.lang.Object)",
      "begin_line": 320,
      "end_line": 341,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 55)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.clone()",
      "begin_line": 351,
      "end_line": 355,
      "comment": "\r\n     * Returns a clone of the instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *     instance.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 66)",
        "(line 353,col 9)-(line 353,col 70)",
        "(line 354,col 9)-(line 354,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 36)",
        "(line 366,col 9)-(line 366,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.LookupPaintScale.readObject(java.io.ObjectInputStream)",
      "begin_line": 377,
      "end_line": 381,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 35)",
        "(line 380,col 9)-(line 380,col 62)"
      ]
    }
  ]
}