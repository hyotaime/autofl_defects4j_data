{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/PeriodAxisLabelInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeriodAxisLabelInfo",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 381,
      "comment": "\r\n * A record that contains information for one \"band\" of date labels in \r\n * a {@link PeriodAxis}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INSETS"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": " The default insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 85,
      "end_line": 86,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The default label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIVIDER_STROKE"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The default divider stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIVIDER_PAINT"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The default divider paint. "
    },
    {
      "type": "field",
      "varNames": [
        "periodClass"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The subclass of {@link RegularTimePeriod} to use for this band. "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Controls the gaps around the band. "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormat"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The date formatter. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The label font. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "drawDividers"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " A flag that controls whether or not dividers are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "dividerStroke"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The stroke used to draw the dividers. "
    },
    {
      "type": "field",
      "varNames": [
        "dividerPaint"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The paint used to draw the dividers. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.PeriodAxisLabelInfo(java.lang.Class, java.text.DateFormat)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\r\n     * Creates a new instance.\r\n     * \r\n     * @param periodClass  the subclass of {@link RegularTimePeriod} to use \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dateFormat  the date format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 133,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.PeriodAxisLabelInfo(java.lang.Class, java.text.DateFormat, org.jfree.chart.util.RectangleInsets, java.awt.Font, java.awt.Paint, boolean, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 152,
      "end_line": 186,
      "comment": "\r\n     * Creates a new instance.\r\n     * \r\n     * @param periodClass  the subclass of {@link RegularTimePeriod} to use\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dateFormat  the date format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param padding  controls the space around the band (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param labelFont  the label font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param labelPaint  the label paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param drawDividers  a flag that controls whether dividers are drawn.\r\n     * @param dividerStroke  the stroke used to draw the dividers \r\n     *                       (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dividerPaint  the paint used to draw the dividers \r\n     *                      (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 39)",
        "(line 179,col 9)-(line 179,col 37)",
        "(line 180,col 9)-(line 180,col 31)",
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 41)",
        "(line 184,col 9)-(line 184,col 43)",
        "(line 185,col 9)-(line 185,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getPeriodClass()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns the subclass of {@link RegularTimePeriod} that should be used \r\n     * to generate the date labels.\r\n     * \r\n     * @return The class.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getDateFormat()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns the date formatter.\r\n     * \r\n     * @return The date formatter (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getPadding()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the padding for the band.\r\n     * \r\n     * @return The padding.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getLabelFont()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns the label font.\r\n     * \r\n     * @return The label font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getLabelPaint()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Returns the label paint.\r\n     * \r\n     * @return The label paint.\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getDrawDividers()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\r\n     * Returns a flag that controls whether or not dividers are drawn.\r\n     * \r\n     * @return A flag.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getDividerStroke()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\r\n     * Returns the stroke used to draw the dividers.\r\n     * \r\n     * @return The stroke.\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getDividerPaint()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Returns the paint used to draw the dividers.\r\n     * \r\n     * @return The paint.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.createInstance(java.util.Date, java.util.TimeZone)",
      "begin_line": 270,
      "end_line": 284,
      "comment": "\r\n     * Creates a time period that includes the specified millisecond, assuming\r\n     * the given time zone.\r\n     * \r\n     * @param millisecond  the time.\r\n     * @param zone  the time zone.\r\n     * \r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 40)",
        "(line 272,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.equals(java.lang.Object)",
      "begin_line": 293,
      "end_line": 326,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.hashCode()",
      "begin_line": 333,
      "end_line": 338,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 24)",
        "(line 335,col 9)-(line 335,col 50)",
        "(line 336,col 9)-(line 336,col 49)",
        "(line 337,col 9)-(line 337,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.clone()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Returns a clone of the object.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 358,
      "end_line": 363,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 36)",
        "(line 360,col 9)-(line 360,col 60)",
        "(line 361,col 9)-(line 361,col 64)",
        "(line 362,col 9)-(line 362,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.readObject(java.io.ObjectInputStream)",
      "begin_line": 373,
      "end_line": 379,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 35)",
        "(line 376,col 9)-(line 376,col 60)",
        "(line 377,col 9)-(line 377,col 64)",
        "(line 378,col 9)-(line 378,col 62)"
      ]
    }
  ]
}