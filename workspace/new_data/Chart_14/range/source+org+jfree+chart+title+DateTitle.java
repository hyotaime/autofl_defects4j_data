{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/title/DateTitle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateTitle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.TextTitle",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 179,
      "comment": "\r\n * A chart title that displays the date.\r\n * \u003cp\u003e\r\n * Keep in mind that a chart can have several titles, and that they can appear \r\n * at the top, left, right or bottom of the chart - a \u003ccode\u003eDateTitle\u003c/code\u003e \r\n * will commonly appear at the bottom of a chart, although you can place it \r\n * anywhere.\r\n * \u003cP\u003e\r\n * By specifying the locale, dates are formatted to the correct standard for\r\n * the given locale. For example, a date would appear as \"January 17, 2000\" in\r\n * the US, but \"17 January 2000\" in most European locales.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.DateTitle.DateTitle()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Creates a new chart title that displays the current date in the default\r\n     * (LONG) format for the locale, positioned to the bottom right of the \r\n     * chart.\r\n     * \u003cP\u003e\r\n     * The color will be black in 12 point, plain Helvetica font (maps to Arial\r\n     * on Win32 systems without Helvetica).\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.DateTitle.DateTitle(int)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\r\n     * Creates a new chart title that displays the current date with the \r\n     * specified style (for the default locale).\r\n     * \u003cP\u003e\r\n     * The date style should be one of:  \u003ccode\u003eSHORT\u003c/code\u003e, \r\n     * \u003ccode\u003eMEDIUM\u003c/code\u003e, \u003ccode\u003eLONG\u003c/code\u003e or \u003ccode\u003eFULL\u003c/code\u003e \r\n     * (defined in \u003ccode\u003ejava.util.DateFormat\u003ccode\u003e).\r\n     *\r\n     * @param style  the date style.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.DateTitle.DateTitle(int, java.util.Locale, java.awt.Font, java.awt.Paint)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "\r\n     * Creates a new chart title that displays the current date.\r\n     * \u003cp\u003e\r\n     * The date style should be one of:  \u003ccode\u003eSHORT\u003c/code\u003e, \r\n     * \u003ccode\u003eMEDIUM\u003c/code\u003e, \u003ccode\u003eLONG\u003c/code\u003e or \u003ccode\u003eFULL\u003c/code\u003e (defined \r\n     * in \u003ccode\u003ejava.util.DateFormat\u003ccode\u003e).\r\n     * \u003cP\u003e\r\n     * For the locale, you can use \u003ccode\u003eLocale.getDefault()\u003c/code\u003e for the \r\n     * default locale.\r\n     *\r\n     * @param style  the date style.\r\n     * @param locale  the locale.\r\n     * @param font  the font.\r\n     * @param paint  the text color.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.DateTitle.DateTitle(int, java.util.Locale, java.awt.Font, java.awt.Paint, org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, org.jfree.chart.util.RectangleInsets)",
      "begin_line": 152,
      "end_line": 160,
      "comment": "\r\n     * Creates a new chart title that displays the current date.\r\n     * \u003cp\u003e\r\n     * The date style should be one of:  \u003ccode\u003eSHORT\u003c/code\u003e, \r\n     * \u003ccode\u003eMEDIUM\u003c/code\u003e, \u003ccode\u003eLONG\u003c/code\u003e or \u003ccode\u003eFULL\u003c/code\u003e (defined \r\n     * in \u003ccode\u003ejava.util.DateFormat\u003ccode\u003e).\r\n     * \u003cP\u003e\r\n     * For the locale, you can use \u003ccode\u003eLocale.getDefault()\u003c/code\u003e for the \r\n     * default locale.\r\n     *\r\n     * @param style  the date style.\r\n     * @param locale  the locale.\r\n     * @param font  the font (not null).\r\n     * @param paint  the text color (not null).\r\n     * @param position  the relative location of this title (use constants in \r\n     *                  Title).\r\n     * @param horizontalAlignment  the horizontal text alignment of this title \r\n     *                             (use constants in Title).\r\n     * @param verticalAlignment  the vertical text alignment of this title (use\r\n     *                           constants in Title).\r\n     * @param padding  determines the blank space around the outside of the \r\n     *                 title (not null).\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.DateTitle.setDateFormat(int, java.util.Locale)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Set the format of the date.\r\n     * \u003cP\u003e\r\n     * The date style should be one of:  \u003ccode\u003eSHORT\u003c/code\u003e, \r\n     * \u003ccode\u003eMEDIUM\u003c/code\u003e, \u003ccode\u003eLONG\u003c/code\u003e or \u003ccode\u003eFULL\u003c/code\u003e (defined \r\n     * in \u003ccode\u003ejava.util.DateFormat\u003ccode\u003e).\r\n     * \u003cP\u003e\r\n     * For the locale, you can use \u003ccode\u003eLocale.getDefault()\u003c/code\u003e for the \r\n     * default locale.\r\n     *\r\n     * @param style  the date style.\r\n     * @param locale  the locale.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 78)"
      ]
    }
  ]
}