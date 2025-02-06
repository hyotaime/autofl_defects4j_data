{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/PeriodAxisLabelInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeriodAxisLabelInfo",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 385,
      "comment": "\r\n * A record that contains information for one \"band\" of date labels in\r\n * a {@link PeriodAxis}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INSETS"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": " The default insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The default label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIVIDER_STROKE"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The default divider stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIVIDER_PAINT"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The default divider paint. "
    },
    {
      "type": "field",
      "varNames": [
        "periodClass"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The subclass of {@link RegularTimePeriod} to use for this band. "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Controls the gaps around the band. "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormat"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The date formatter. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The label font. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "drawDividers"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " A flag that controls whether or not dividers are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "dividerStroke"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The stroke used to draw the dividers. "
    },
    {
      "type": "field",
      "varNames": [
        "dividerPaint"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The paint used to draw the dividers. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.PeriodAxisLabelInfo(java.lang.Class, java.text.DateFormat)",
      "begin_line": 129,
      "end_line": 135,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param periodClass  the subclass of {@link RegularTimePeriod} to use\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dateFormat  the date format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 134,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.PeriodAxisLabelInfo(java.lang.Class, java.text.DateFormat, org.jfree.chart.util.RectangleInsets, java.awt.Font, java.awt.Paint, boolean, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 153,
      "end_line": 188,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param periodClass  the subclass of {@link RegularTimePeriod} to use\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dateFormat  the date format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param padding  controls the space around the band (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param labelFont  the label font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param labelPaint  the label paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param drawDividers  a flag that controls whether dividers are drawn.\r\n     * @param dividerStroke  the stroke used to draw the dividers\r\n     *                       (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dividerPaint  the paint used to draw the dividers\r\n     *                      (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 39)",
        "(line 181,col 9)-(line 181,col 37)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 183,col 9)-(line 183,col 35)",
        "(line 184,col 9)-(line 184,col 37)",
        "(line 185,col 9)-(line 185,col 41)",
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 187,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getPeriodClass()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the subclass of {@link RegularTimePeriod} that should be used\r\n     * to generate the date labels.\r\n     *\r\n     * @return The class.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getDateFormat()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the date formatter.\r\n     *\r\n     * @return The date formatter (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getPadding()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the padding for the band.\r\n     *\r\n     * @return The padding.\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getLabelFont()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Returns the label font.\r\n     *\r\n     * @return The label font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getLabelPaint()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Returns the label paint.\r\n     *\r\n     * @return The label paint.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getDrawDividers()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\r\n     * Returns a flag that controls whether or not dividers are drawn.\r\n     *\r\n     * @return A flag.\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getDividerStroke()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\r\n     * Returns the stroke used to draw the dividers.\r\n     *\r\n     * @return The stroke.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.getDividerPaint()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\r\n     * Returns the paint used to draw the dividers.\r\n     *\r\n     * @return The paint.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.createInstance(java.util.Date, java.util.TimeZone, java.util.Locale)",
      "begin_line": 275,
      "end_line": 288,
      "comment": "\r\n     * Creates a time period that includes the specified millisecond, assuming\r\n     * the given time zone.\r\n     *\r\n     * @param millisecond  the time.\r\n     * @param zone  the time zone.\r\n     * @param locale  the locale.\r\n     *\r\n     * @return The time period.\r\n     *\r\n     * @since 1.0.13.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 40)",
        "(line 278,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.equals(java.lang.Object)",
      "begin_line": 297,
      "end_line": 330,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.hashCode()",
      "begin_line": 337,
      "end_line": 342,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 24)",
        "(line 339,col 9)-(line 339,col 50)",
        "(line 340,col 9)-(line 340,col 49)",
        "(line 341,col 9)-(line 341,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.clone()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns a clone of the object.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 362,
      "end_line": 367,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 36)",
        "(line 364,col 9)-(line 364,col 60)",
        "(line 365,col 9)-(line 365,col 64)",
        "(line 366,col 9)-(line 366,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxisLabelInfo.readObject(java.io.ObjectInputStream)",
      "begin_line": 377,
      "end_line": 383,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 35)",
        "(line 380,col 9)-(line 380,col 60)",
        "(line 381,col 9)-(line 381,col 64)",
        "(line 382,col 9)-(line 382,col 62)"
      ]
    }
  ]
}