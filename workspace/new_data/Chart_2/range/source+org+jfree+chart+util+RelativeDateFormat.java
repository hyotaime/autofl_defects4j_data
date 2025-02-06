{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/RelativeDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RelativeDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.DateFormat"
      ],
      "begin_line": 64,
      "end_line": 629,
      "comment": "\r\n * A formatter that formats dates to show the elapsed time relative to some\r\n * base date.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "baseMillis"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The base milliseconds for the elapsed time calculation. "
    },
    {
      "type": "field",
      "varNames": [
        "showZeroDays"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * A flag that controls whether or not a zero day count is displayed.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "showZeroHours"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\r\n     * A flag that controls whether or not a zero hour count is displayed.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dayFormatter"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\r\n     * A formatter for the day count (most likely not critical until the\r\n     * day count exceeds 999).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "positivePrefix"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * A prefix prepended to the start of the format if the relative date is\r\n     * positive.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "daySuffix"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\r\n     * A string appended after the day count.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hourFormatter"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\r\n     * A formatter for the hours.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hourSuffix"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\r\n     * A string appended after the hours.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minuteFormatter"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\r\n     * A formatter for the minutes.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minuteSuffix"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\r\n     * A string appended after the minutes.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "secondFormatter"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\r\n     * A formatter for the seconds (and milliseconds).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "secondSuffix"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\r\n     * A string appended after the seconds.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECONDS_IN_ONE_HOUR"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\r\n     * A constant for the number of milliseconds in one hour.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECONDS_IN_ONE_DAY"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\r\n     * A constant for the number of milliseconds in one day.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RelativeDateFormat.RelativeDateFormat()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Creates a new instance with base milliseconds set to zero.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RelativeDateFormat.RelativeDateFormat(java.util.Date)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RelativeDateFormat.RelativeDateFormat(long)",
      "begin_line": 165,
      "end_line": 186,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param baseMillis  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 16)",
        "(line 167,col 9)-(line 167,col 37)",
        "(line 168,col 9)-(line 168,col 34)",
        "(line 169,col 9)-(line 169,col 34)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 171,col 61)",
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 173,col 62)",
        "(line 174,col 9)-(line 174,col 30)",
        "(line 175,col 9)-(line 175,col 64)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 177,col 64)",
        "(line 178,col 9)-(line 178,col 57)",
        "(line 179,col 9)-(line 179,col 57)",
        "(line 180,col 9)-(line 180,col 32)",
        "(line 184,col 9)-(line 184,col 48)",
        "(line 185,col 9)-(line 185,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getBaseMillis()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the base date/time used to calculate the elapsed time for\r\n     * display.\r\n     *\r\n     * @return The base date/time in milliseconds since 1-Jan-1970.\r\n     *\r\n     * @see #setBaseMillis(long)\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setBaseMillis(long)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Sets the base date/time used to calculate the elapsed time for display.\r\n     * This should be specified in milliseconds using the same encoding as\r\n     * \u003ccode\u003ejava.util.Date\u003c/code\u003e.\r\n     *\r\n     * @param baseMillis  the base date/time in milliseconds.\r\n     *\r\n     * @see #getBaseMillis()\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getShowZeroDays()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns the flag that controls whether or not zero day counts are\r\n     * shown in the formatted output.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setShowZeroDays(boolean)\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setShowZeroDays(boolean)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\r\n     * Sets the flag that controls whether or not zero day counts are shown\r\n     * in the formatted output.\r\n     *\r\n     * @param show  the flag.\r\n     *\r\n     * @see #getShowZeroDays()\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getShowZeroHours()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\r\n     * Returns the flag that controls whether or not zero hour counts are\r\n     * shown in the formatted output.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setShowZeroHours(boolean)\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setShowZeroHours(boolean)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\r\n     * Sets the flag that controls whether or not zero hour counts are shown\r\n     * in the formatted output.\r\n     *\r\n     * @param show  the flag.\r\n     *\r\n     * @see #getShowZeroHours()\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getPositivePrefix()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\r\n     * Returns the string that is prepended to the format if the relative time\r\n     * is positive.\r\n     *\r\n     * @return The string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPositivePrefix(String)\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setPositivePrefix(java.lang.String)",
      "begin_line": 289,
      "end_line": 294,
      "comment": "\r\n     * Sets the string that is prepended to the format if the relative time is\r\n     * positive.\r\n     *\r\n     * @param prefix  the prefix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPositivePrefix()\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setDayFormatter(java.text.NumberFormat)",
      "begin_line": 303,
      "end_line": 308,
      "comment": "\r\n     * Sets the formatter for the days.\r\n     *\r\n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getDaySuffix()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\r\n     * Returns the string that is appended to the day count.\r\n     *\r\n     * @return The string.\r\n     *\r\n     * @see #setDaySuffix(String)\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setDaySuffix(java.lang.String)",
      "begin_line": 328,
      "end_line": 333,
      "comment": "\r\n     * Sets the string that is appended to the day count.\r\n     *\r\n     * @param suffix  the suffix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDaySuffix()\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setHourFormatter(java.text.NumberFormat)",
      "begin_line": 342,
      "end_line": 347,
      "comment": "\r\n     * Sets the formatter for the hours.\r\n     *\r\n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getHourSuffix()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\r\n     * Returns the string that is appended to the hour count.\r\n     *\r\n     * @return The string.\r\n     *\r\n     * @see #setHourSuffix(String)\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setHourSuffix(java.lang.String)",
      "begin_line": 367,
      "end_line": 372,
      "comment": "\r\n     * Sets the string that is appended to the hour count.\r\n     *\r\n     * @param suffix  the suffix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getHourSuffix()\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setMinuteFormatter(java.text.NumberFormat)",
      "begin_line": 381,
      "end_line": 386,
      "comment": "\r\n     * Sets the formatter for the minutes.\r\n     *\r\n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getMinuteSuffix()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\r\n     * Returns the string that is appended to the minute count.\r\n     *\r\n     * @return The string.\r\n     *\r\n     * @see #setMinuteSuffix(String)\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setMinuteSuffix(java.lang.String)",
      "begin_line": 406,
      "end_line": 411,
      "comment": "\r\n     * Sets the string that is appended to the minute count.\r\n     *\r\n     * @param suffix  the suffix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getMinuteSuffix()\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.getSecondSuffix()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\r\n     * Returns the string that is appended to the second count.\r\n     *\r\n     * @return The string.\r\n     *\r\n     * @see #setSecondSuffix(String)\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setSecondSuffix(java.lang.String)",
      "begin_line": 431,
      "end_line": 436,
      "comment": "\r\n     * Sets the string that is appended to the second count.\r\n     *\r\n     * @param suffix  the suffix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSecondSuffix()\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.setSecondFormatter(java.text.NumberFormat)",
      "begin_line": 443,
      "end_line": 448,
      "comment": "\r\n     * Sets the formatter for the seconds and milliseconds.\r\n     *\r\n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 460,
      "end_line": 494,
      "comment": "\r\n     * Formats the given date as the amount of elapsed time (relative to the\r\n     * base date specified in the constructor).\r\n     *\r\n     * @param date  the date.\r\n     * @param toAppendTo  the string buffer.\r\n     * @param fieldPosition  the field position.\r\n     *\r\n     * @return The formatted date.\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 44)",
        "(line 463,col 9)-(line 463,col 55)",
        "(line 464,col 9)-(line 464,col 26)",
        "(line 465,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 54)",
        "(line 474,col 9)-(line 474,col 61)",
        "(line 475,col 9)-(line 475,col 56)",
        "(line 476,col 9)-(line 476,col 63)",
        "(line 477,col 9)-(line 477,col 40)",
        "(line 478,col 9)-(line 478,col 47)",
        "(line 479,col 9)-(line 479,col 42)",
        "(line 481,col 9)-(line 481,col 38)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 490,col 37)",
        "(line 491,col 9)-(line 492,col 37)",
        "(line 493,col 9)-(line 493,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\r\n     * Parses the given string (not implemented).\r\n     *\r\n     * @param source  the date string.\r\n     * @param pos  the parse position.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e, as this method has not been implemented.\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.equals(java.lang.Object)",
      "begin_line": 515,
      "end_line": 563,
      "comment": "\r\n     * Tests this formatter for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 59)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.hashCode()",
      "begin_line": 570,
      "end_line": 581,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 25)",
        "(line 572,col 9)-(line 573,col 69)",
        "(line 574,col 9)-(line 574,col 62)",
        "(line 575,col 9)-(line 575,col 57)",
        "(line 576,col 9)-(line 576,col 58)",
        "(line 577,col 9)-(line 577,col 60)",
        "(line 578,col 9)-(line 578,col 60)",
        "(line 579,col 9)-(line 579,col 63)",
        "(line 580,col 9)-(line 580,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.clone()",
      "begin_line": 588,
      "end_line": 593,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 70)",
        "(line 590,col 9)-(line 590,col 70)",
        "(line 591,col 9)-(line 591,col 76)",
        "(line 592,col 9)-(line 592,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RelativeDateFormat.main(java.lang.String[])",
      "begin_line": 600,
      "end_line": 628,
      "comment": "\r\n     * Some test code.\r\n     *\r\n     * @param args  ignored.\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 75)",
        "(line 602,col 9)-(line 602,col 78)",
        "(line 603,col 9)-(line 603,col 42)",
        "(line 605,col 9)-(line 605,col 40)",
        "(line 606,col 9)-(line 606,col 78)",
        "(line 607,col 9)-(line 607,col 53)",
        "(line 608,col 9)-(line 608,col 29)",
        "(line 610,col 9)-(line 610,col 50)",
        "(line 611,col 9)-(line 611,col 55)",
        "(line 612,col 9)-(line 612,col 53)",
        "(line 613,col 9)-(line 613,col 29)",
        "(line 615,col 9)-(line 615,col 53)",
        "(line 616,col 9)-(line 616,col 34)",
        "(line 617,col 9)-(line 617,col 53)",
        "(line 618,col 9)-(line 618,col 29)",
        "(line 620,col 9)-(line 620,col 53)",
        "(line 621,col 9)-(line 621,col 35)",
        "(line 622,col 9)-(line 622,col 30)",
        "(line 623,col 9)-(line 623,col 31)",
        "(line 624,col 9)-(line 624,col 33)",
        "(line 625,col 9)-(line 625,col 32)",
        "(line 626,col 9)-(line 626,col 53)",
        "(line 627,col 9)-(line 627,col 29)"
      ]
    }
  ]
}