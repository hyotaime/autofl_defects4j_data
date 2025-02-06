{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/RelativeDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RelativeDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.DateFormat"
      ],
      "begin_line": 62,
      "end_line": 558,
      "comment": "\r\n * A formatter that formats dates to show the elapsed time relative to some\r\n * base date.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "baseMillis"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The base milliseconds for the elapsed time calculation. "
    },
    {
      "type": "field",
      "varNames": [
        "showZeroDays"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\r\n     * A flag that controls whether or not a zero day count is displayed.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "showZeroHours"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * A flag that controls whether or not a zero hour count is displayed.\r\n     * \r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dayFormatter"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " \r\n     * A formatter for the day count (most likely not critical until the\r\n     * day count exceeds 999). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "positivePrefix"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\r\n     * A prefix prepended to the start of the format if the relative date is \r\n     * positive.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "daySuffix"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\r\n     * A string appended after the day count.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hourSuffix"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\r\n     * A string appended after the hours.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minuteSuffix"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\r\n     * A string appended after the minutes.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "secondFormatter"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\r\n     * A formatter for the seconds (and milliseconds).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "secondSuffix"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\r\n     * A string appended after the seconds.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECONDS_IN_ONE_HOUR"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\r\n     * A constant for the number of milliseconds in one hour.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECONDS_IN_ONE_DAY"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\r\n     * A constant for the number of milliseconds in one day.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RelativeDateFormat.RelativeDateFormat()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RelativeDateFormat.RelativeDateFormat(java.util.Date)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Creates a new instance.\r\n     * \r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RelativeDateFormat.RelativeDateFormat(long)",
      "begin_line": 149,
      "end_line": 168,
      "comment": "\r\n     * Creates a new instance.\r\n     * \r\n     * @param baseMillis  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 16)",
        "(line 151,col 9)-(line 151,col 37)",
        "(line 152,col 9)-(line 152,col 34)",
        "(line 153,col 9)-(line 153,col 34)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 155,col 9)-(line 155,col 55)",
        "(line 156,col 9)-(line 156,col 29)",
        "(line 157,col 9)-(line 157,col 30)",
        "(line 158,col 9)-(line 158,col 32)",
        "(line 159,col 9)-(line 159,col 64)",
        "(line 160,col 9)-(line 160,col 57)",
        "(line 161,col 9)-(line 161,col 57)",
        "(line 162,col 9)-(line 162,col 32)",
        "(line 166,col 9)-(line 166,col 48)",
        "(line 167,col 9)-(line 167,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getBaseMillis()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the base date/time used to calculate the elapsed time for \r\n     * display.\r\n     * \r\n     * @return The base date/time in milliseconds since 1-Jan-1970.\r\n     * \r\n     * @see #setBaseMillis(long)\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setBaseMillis(long)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Sets the base date/time used to calculate the elapsed time for display.  \r\n     * This should be specified in milliseconds using the same encoding as\r\n     * \u003ccode\u003ejava.util.Date\u003c/code\u003e.\r\n     * \r\n     * @param baseMillis  the base date/time in milliseconds.\r\n     * \r\n     * @see #getBaseMillis()\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getShowZeroDays()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns the flag that controls whether or not zero day counts are \r\n     * shown in the formatted output.\r\n     * \r\n     * @return The flag.\r\n     * \r\n     * @see #setShowZeroDays(boolean)\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setShowZeroDays(boolean)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Sets the flag that controls whether or not zero day counts are shown\r\n     * in the formatted output.\r\n     * \r\n     * @param show  the flag.\r\n     * \r\n     * @see #getShowZeroDays()\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getShowZeroHours()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the flag that controls whether or not zero hour counts are \r\n     * shown in the formatted output.\r\n     * \r\n     * @return The flag.\r\n     * \r\n     * @see #setShowZeroHours(boolean)\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setShowZeroHours(boolean)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Sets the flag that controls whether or not zero hour counts are shown\r\n     * in the formatted output.\r\n     * \r\n     * @param show  the flag.\r\n     * \r\n     * @see #getShowZeroHours()\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getPositivePrefix()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Returns the string that is prepended to the format if the relative time\r\n     * is positive.\r\n     * \r\n     * @return The string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPositivePrefix(String)\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setPositivePrefix(java.lang.String)",
      "begin_line": 271,
      "end_line": 276,
      "comment": "\r\n     * Sets the string that is prepended to the format if the relative time is \r\n     * positive.\r\n     * \r\n     * @param prefix  the prefix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPositivePrefix()\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getDaySuffix()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\r\n     * Returns the string that is appended to the day count.\r\n     * \r\n     * @return The string.\r\n     * \r\n     * @see #setDaySuffix(String)\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setDaySuffix(java.lang.String)",
      "begin_line": 296,
      "end_line": 301,
      "comment": "\r\n     * Sets the string that is appended to the day count.\r\n     * \r\n     * @param suffix  the suffix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDaySuffix()\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getHourSuffix()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns the string that is appended to the hour count.\r\n     * \r\n     * @return The string.\r\n     * \r\n     * @see #setHourSuffix(String)\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setHourSuffix(java.lang.String)",
      "begin_line": 321,
      "end_line": 326,
      "comment": "\r\n     * Sets the string that is appended to the hour count.\r\n     * \r\n     * @param suffix  the suffix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getHourSuffix()\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getMinuteSuffix()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\r\n     * Returns the string that is appended to the minute count.\r\n     * \r\n     * @return The string.\r\n     * \r\n     * @see #setMinuteSuffix(String)\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setMinuteSuffix(java.lang.String)",
      "begin_line": 346,
      "end_line": 351,
      "comment": "\r\n     * Sets the string that is appended to the minute count.\r\n     * \r\n     * @param suffix  the suffix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getMinuteSuffix()\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getSecondSuffix()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n     * Returns the string that is appended to the second count.\r\n     * \r\n     * @return The string.\r\n     * \r\n     * @see #setSecondSuffix(String)\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setSecondSuffix(java.lang.String)",
      "begin_line": 371,
      "end_line": 376,
      "comment": "\r\n     * Sets the string that is appended to the second count.\r\n     * \r\n     * @param suffix  the suffix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSecondSuffix()\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setSecondFormatter(java.text.NumberFormat)",
      "begin_line": 383,
      "end_line": 388,
      "comment": "\r\n     * Sets the formatter for the seconds and milliseconds.\r\n     * \r\n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 400,
      "end_line": 432,
      "comment": "\r\n     * Formats the given date as the amount of elapsed time (relative to the\r\n     * base date specified in the constructor).\r\n     * \r\n     * @param date  the date.\r\n     * @param toAppendTo  the string buffer.\r\n     * @param fieldPosition  the field position.\r\n     * \r\n     * @return The formatted date.\r\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 44)",
        "(line 403,col 9)-(line 403,col 55)",
        "(line 404,col 9)-(line 404,col 26)",
        "(line 405,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 54)",
        "(line 414,col 9)-(line 414,col 61)",
        "(line 415,col 9)-(line 415,col 56)",
        "(line 416,col 9)-(line 416,col 63)",
        "(line 417,col 9)-(line 417,col 40)",
        "(line 418,col 9)-(line 418,col 47)",
        "(line 419,col 9)-(line 419,col 42)",
        "(line 421,col 9)-(line 421,col 38)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 71)",
        "(line 429,col 9)-(line 430,col 37)",
        "(line 431,col 9)-(line 431,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\r\n     * Parses the given string (not implemented).\r\n     * \r\n     * @param source  the date string.\r\n     * @param pos  the parse position.\r\n     * \r\n     * @return \u003ccode\u003enull\u003c/code\u003e, as this method has not been implemented.\r\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.equals(java.lang.Object)",
      "begin_line": 453,
      "end_line": 492,
      "comment": "\r\n     * Tests this formatter for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 59)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.hashCode()",
      "begin_line": 499,
      "end_line": 510,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 25)",
        "(line 501,col 9)-(line 502,col 69)",
        "(line 503,col 9)-(line 503,col 62)",
        "(line 504,col 9)-(line 504,col 57)",
        "(line 505,col 9)-(line 505,col 58)",
        "(line 506,col 9)-(line 506,col 60)",
        "(line 507,col 9)-(line 507,col 60)",
        "(line 508,col 9)-(line 508,col 63)",
        "(line 509,col 9)-(line 509,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.clone()",
      "begin_line": 517,
      "end_line": 522,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     * \r\n     * @return A clone.\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 70)",
        "(line 519,col 9)-(line 519,col 70)",
        "(line 520,col 9)-(line 520,col 76)",
        "(line 521,col 9)-(line 521,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.main(java.lang.String[])",
      "begin_line": 529,
      "end_line": 557,
      "comment": "\r\n     * Some test code.\r\n     * \r\n     * @param args  ignored.\r\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 75)",
        "(line 531,col 9)-(line 531,col 78)",
        "(line 532,col 9)-(line 532,col 42)",
        "(line 534,col 9)-(line 534,col 40)",
        "(line 535,col 9)-(line 535,col 78)",
        "(line 536,col 9)-(line 536,col 53)",
        "(line 537,col 9)-(line 537,col 29)",
        "(line 539,col 9)-(line 539,col 50)",
        "(line 540,col 9)-(line 540,col 55)",
        "(line 541,col 9)-(line 541,col 53)",
        "(line 542,col 9)-(line 542,col 29)",
        "(line 544,col 9)-(line 544,col 53)",
        "(line 545,col 9)-(line 545,col 34)",
        "(line 546,col 9)-(line 546,col 53)",
        "(line 547,col 9)-(line 547,col 29)",
        "(line 549,col 9)-(line 549,col 53)",
        "(line 550,col 9)-(line 550,col 35)",
        "(line 551,col 9)-(line 551,col 30)",
        "(line 552,col 9)-(line 552,col 31)",
        "(line 553,col 9)-(line 553,col 33)",
        "(line 554,col 9)-(line 554,col 32)",
        "(line 555,col 9)-(line 555,col 53)",
        "(line 556,col 9)-(line 556,col 29)"
      ]
    }
  ]
}