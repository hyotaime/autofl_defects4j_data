{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/MonthDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MonthDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.DateFormat"
      ],
      "begin_line": 62,
      "end_line": 310,
      "comment": "\r\n * A formatter that formats dates to show the initial letter(s) of the month\r\n * name and, as an option, the year for the first or last month of each year.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "months"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The symbols used for the months. "
    },
    {
      "type": "field",
      "varNames": [
        "showYear"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Flags that control which months will have the year appended. "
    },
    {
      "type": "field",
      "varNames": [
        "yearFormatter"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The year formatter. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.MonthDateFormat.MonthDateFormat()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\r\n     * Creates a new instance for the default time zone.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.MonthDateFormat.MonthDateFormat(java.util.TimeZone)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Creates a new instance for the specified time zone.\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.MonthDateFormat.MonthDateFormat(java.util.Locale)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Creates a new instance for the specified time zone.\r\n     *\r\n     * @param locale  the locale used to obtain the month\r\n     *                names (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.MonthDateFormat.MonthDateFormat(java.util.TimeZone, int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Creates a new instance for the specified time zone.\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chars  the maximum number of characters to use from the month\r\n     *               names (that are obtained from the date symbols of the\r\n     *               default locale).  If this value is \u003c\u003d 0, the entire\r\n     *               month name is used in each case.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.MonthDateFormat.MonthDateFormat(java.util.Locale, int)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Creates a new instance for the specified time zone.\r\n     *\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chars  the maximum number of characters to use from the month\r\n     *               names (that are obtained from the date symbols of the\r\n     *               default locale).  If this value is \u003c\u003d 0, the entire\r\n     *               month name is used in each case.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.MonthDateFormat.MonthDateFormat(java.util.TimeZone, java.util.Locale, int, boolean, boolean)",
      "begin_line": 142,
      "end_line": 147,
      "comment": "\r\n     * Creates a new formatter.\r\n     *\r\n     * @param zone  the time zone used to extract the month and year from dates\r\n     *              passed to this formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale used to determine the month names\r\n     *                (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chars  the maximum number of characters to use from the month\r\n     *               names, or zero to indicate that the entire month name\r\n     *               should be used.\r\n     * @param showYearForJan  a flag that controls whether or not the year is\r\n     *                        appended to the symbol for the first month of\r\n     *                        each year.\r\n     * @param showYearForDec  a flag that controls whether or not the year is\r\n     *                        appended to the symbol for the last month of\r\n     *                        each year.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.MonthDateFormat.MonthDateFormat(java.util.TimeZone, java.util.Locale, int, boolean[], java.text.DateFormat)",
      "begin_line": 163,
      "end_line": 188,
      "comment": "\r\n     * Creates a new formatter.\r\n     *\r\n     * @param zone  the time zone used to extract the month and year from dates\r\n     *              passed to this formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale used to determine the month names\r\n     *                (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chars  the maximum number of characters to use from the month\r\n     *               names, or zero to indicate that the entire month name\r\n     *               should be used.\r\n     * @param showYear  an array of flags that control whether or not the\r\n     *                  year is displayed for a particular month.\r\n     * @param yearFormatter  the year formatter.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 62)",
        "(line 169,col 9)-(line 169,col 52)",
        "(line 170,col 9)-(line 170,col 37)",
        "(line 171,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 52)",
        "(line 181,col 9)-(line 181,col 33)",
        "(line 182,col 9)-(line 182,col 43)",
        "(line 187,col 9)-(line 187,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MonthDateFormat.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 199,
      "end_line": 208,
      "comment": "\r\n     * Formats the given date.\r\n     *\r\n     * @param date  the date.\r\n     * @param toAppendTo  the string buffer.\r\n     * @param fieldPosition  the field position.\r\n     *\r\n     * @return The formatted date.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 36)",
        "(line 202,col 9)-(line 202,col 54)",
        "(line 203,col 9)-(line 203,col 46)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MonthDateFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Parses the given string (not implemented).\r\n     *\r\n     * @param source  the date string.\r\n     * @param pos  the parse position.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e, as this method has not been implemented.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MonthDateFormat.equals(java.lang.Object)",
      "begin_line": 229,
      "end_line": 250,
      "comment": "\r\n     * Tests this formatter for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MonthDateFormat.main(java.lang.String[])",
      "begin_line": 257,
      "end_line": 309,
      "comment": "\r\n     * Some test code.\r\n     *\r\n     * @param args  ignored.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 64)",
        "(line 259,col 9)-(line 259,col 34)",
        "(line 260,col 9)-(line 260,col 70)",
        "(line 261,col 9)-(line 261,col 70)",
        "(line 262,col 9)-(line 262,col 70)",
        "(line 263,col 9)-(line 263,col 70)",
        "(line 264,col 9)-(line 264,col 70)",
        "(line 265,col 9)-(line 265,col 70)",
        "(line 266,col 9)-(line 266,col 70)",
        "(line 267,col 9)-(line 267,col 70)",
        "(line 268,col 9)-(line 268,col 70)",
        "(line 269,col 9)-(line 269,col 71)",
        "(line 270,col 9)-(line 270,col 71)",
        "(line 271,col 9)-(line 271,col 71)",
        "(line 272,col 9)-(line 272,col 29)",
        "(line 274,col 9)-(line 274,col 53)",
        "(line 275,col 9)-(line 275,col 39)",
        "(line 276,col 9)-(line 276,col 70)",
        "(line 277,col 9)-(line 277,col 70)",
        "(line 278,col 9)-(line 278,col 70)",
        "(line 279,col 9)-(line 279,col 70)",
        "(line 280,col 9)-(line 280,col 70)",
        "(line 281,col 9)-(line 281,col 70)",
        "(line 282,col 9)-(line 282,col 70)",
        "(line 283,col 9)-(line 283,col 70)",
        "(line 284,col 9)-(line 284,col 70)",
        "(line 285,col 9)-(line 285,col 71)",
        "(line 286,col 9)-(line 286,col 71)",
        "(line 287,col 9)-(line 287,col 71)",
        "(line 288,col 9)-(line 288,col 29)",
        "(line 290,col 9)-(line 290,col 52)",
        "(line 291,col 9)-(line 291,col 38)",
        "(line 292,col 9)-(line 292,col 70)",
        "(line 293,col 9)-(line 293,col 70)",
        "(line 294,col 9)-(line 294,col 70)",
        "(line 295,col 9)-(line 295,col 70)",
        "(line 296,col 9)-(line 296,col 70)",
        "(line 297,col 9)-(line 297,col 70)",
        "(line 298,col 9)-(line 298,col 70)",
        "(line 299,col 9)-(line 299,col 70)",
        "(line 300,col 9)-(line 300,col 70)",
        "(line 301,col 9)-(line 301,col 71)",
        "(line 302,col 9)-(line 302,col 71)",
        "(line 303,col 9)-(line 303,col 71)",
        "(line 304,col 9)-(line 304,col 29)",
        "(line 306,col 9)-(line 306,col 60)",
        "(line 307,col 9)-(line 307,col 34)",
        "(line 308,col 9)-(line 308,col 44)"
      ]
    }
  ]
}