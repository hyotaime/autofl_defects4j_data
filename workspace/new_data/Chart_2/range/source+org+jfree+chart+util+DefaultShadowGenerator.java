{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/DefaultShadowGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultShadowGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.ShadowGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 324,
      "comment": "\n * A default implementation of the {@link ShadowGenerator} interface, based on\n * code in a\n * \u003ca href\u003d\"http://www.jroller.com/gfx/entry/fast_or_good_drop_shadows\"\u003eblog\n * post by Romain Guy\u003c/a\u003e.\n *\n * @since 1.0.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "shadowSize"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The shadow size. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowColor"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The shadow color. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowOpacity"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The shadow opacity. "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The shadow offset angle (in radians). "
    },
    {
      "type": "field",
      "varNames": [
        "distance"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The shadow offset distance (in Java2D units). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.DefaultShadowGenerator()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Creates a new instance with default attributes.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.DefaultShadowGenerator(int, java.awt.Color, float, int, double)",
      "begin_line": 90,
      "end_line": 100,
      "comment": "\n     * Creates a new instance with the specified attributes.\n     *\n     * @param size  the shadow size.\n     * @param color  the shadow color.\n     * @param opacity  the shadow opacity.\n     * @param distance  the shadow offset distance.\n     * @param angle  the shadow offset angle (in radians).\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 31)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 37)",
        "(line 98,col 9)-(line 98,col 33)",
        "(line 99,col 9)-(line 99,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.getShadowSize()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Returns the shadow size.\n     *\n     * @return The shadow size.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.getShadowColor()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the shadow color.\n     *\n     * @return The shadow color (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.getShadowOpacity()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns the shadow opacity.\n     *\n     * @return The shadow opacity.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.getDistance()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns the shadow offset distance.\n     *\n     * @return The shadow offset distance (in Java2D units).\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.getAngle()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Returns the shadow offset angle (in radians).\n     *\n     * @return The angle (in radians).\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.calculateOffsetX()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Calculates the x-offset for drawing the shadow image relative to the\n     * source.\n     *\n     * @return The x-offset.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.calculateOffsetY()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Calculates the y-offset for drawing the shadow image relative to the\n     * source.\n     *\n     * @return The y-offset.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.createDropShadow(java.awt.image.BufferedImage)",
      "begin_line": 175,
      "end_line": 186,
      "comment": "\n     * Creates and returns an image containing the drop shadow for the\n     * specified source image.\n     *\n     * @param source  the source image.\n     *\n     * @return A new image containing the shadow.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 179,col 45)",
        "(line 181,col 9)-(line 181,col 49)",
        "(line 182,col 9)-(line 182,col 59)",
        "(line 183,col 9)-(line 183,col 21)",
        "(line 184,col 9)-(line 184,col 29)",
        "(line 185,col 9)-(line 185,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.applyShadow(java.awt.image.BufferedImage)",
      "begin_line": 193,
      "end_line": 275,
      "comment": "\n     * Applies a shadow to the image.\n     *\n     * @param image  the image.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 40)",
        "(line 195,col 9)-(line 195,col 42)",
        "(line 197,col 9)-(line 197,col 41)",
        "(line 198,col 9)-(line 198,col 38)",
        "(line 199,col 9)-(line 199,col 26)",
        "(line 200,col 9)-(line 200,col 37)",
        "(line 201,col 9)-(line 201,col 26)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 204,col 9)-(line 204,col 58)",
        "(line 206,col 9)-(line 206,col 45)",
        "(line 207,col 9)-(line 207,col 27)",
        "(line 209,col 9)-(line 209,col 17)",
        "(line 211,col 9)-(line 211,col 89)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 54)",
        "(line 217,col 9)-(line 244,col 9)",
        "(line 247,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.equals(java.lang.Object)",
      "begin_line": 284,
      "end_line": 308,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return The object.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.DefaultShadowGenerator.hashCode()",
      "begin_line": 315,
      "end_line": 322,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 63)",
        "(line 317,col 9)-(line 317,col 62)",
        "(line 318,col 9)-(line 318,col 64)",
        "(line 319,col 9)-(line 319,col 59)",
        "(line 320,col 9)-(line 320,col 56)",
        "(line 321,col 9)-(line 321,col 20)"
      ]
    }
  ]
}