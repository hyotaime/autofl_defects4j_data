{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/Week.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Week",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 91,
      "end_line": 652,
      "comment": "\r\n * A calendar week.  All years are considered to have 53 weeks, numbered from 1\r\n * to 53, although in many cases the 53rd week is empty.  Most of the time, the\r\n * 1st week of the year *begins* in the previous calendar year, but it always\r\n * finishes in the current year (this behaviour matches the workings of the\r\n * \u003ccode\u003eGregorianCalendar\u003c/code\u003e class).\r\n * \u003cP\u003e\r\n * This class is immutable, which is a requirement for all\r\n * {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_WEEK_IN_YEAR"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Constant for the first week in the year. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_WEEK_IN_YEAR"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Constant for the last week in the year. "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The year in which the week falls. "
    },
    {
      "type": "field",
      "varNames": [
        "week"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The week (1-53). "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\r\n     * Creates a new time period for the week in which the current system\r\n     * date/time falls.\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(int, int)",
      "begin_line": 128,
      "end_line": 136,
      "comment": "\r\n     * Creates a time period representing the week in the specified year.\r\n     *\r\n     * @param week  the week (1 to 53).\r\n     * @param year  the year (1900 to 9999).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 33)",
        "(line 135,col 9)-(line 135,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(int, org.jfree.data.time.Year)",
      "begin_line": 144,
      "end_line": 152,
      "comment": "\r\n     * Creates a time period representing the week in the specified year.\r\n     *\r\n     * @param week  the week (1 to 53).\r\n     * @param year  the year (1900 to 9999).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 32)",
        "(line 150,col 9)-(line 150,col 43)",
        "(line 151,col 9)-(line 151,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time\r\n     * falls, using the default time zone and locale (the locale can affect the\r\n     * day-of-the-week that marks the beginning of the week, as well as the\r\n     * minimal number of days in the first week of the year).\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #Week(Date, TimeZone, Locale)\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date, java.util.TimeZone)",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time\r\n     * falls, calculated relative to the specified time zone.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #Week(Date, TimeZone, Locale)}.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date, java.util.TimeZone, java.util.Locale)",
      "begin_line": 193,
      "end_line": 227,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time\r\n     * falls, calculated relative to the specified time zone.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 63)",
        "(line 204,col 9)-(line 204,col 31)",
        "(line 209,col 9)-(line 209,col 59)",
        "(line 210,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getYear()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n     * Returns the year in which the week falls.\r\n     *\r\n     * @return The year (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getYearValue()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the year in which the week falls, as an integer value.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getWeek()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns the week.\r\n     *\r\n     * @return The week.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getFirstMillisecond()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the first millisecond of the week.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the week.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getLastMillisecond()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\r\n     * Returns the last millisecond of the week.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the week.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.peg(java.util.Calendar)",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 62)",
        "(line 294,col 9)-(line 294,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.previous()",
      "begin_line": 305,
      "end_line": 326,
      "comment": "\r\n     * Returns the week preceding this one.  This method will return\r\n     * \u003ccode\u003enull\u003c/code\u003e for some lower limit on the range of weeks (currently\r\n     * week 1, 1900).  For week 1 of any year, the previous week is always week\r\n     * 53, but week 53 may not contain any days (you should check for this).\r\n     *\r\n     * @return The preceding week (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 20)",
        "(line 308,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.next()",
      "begin_line": 337,
      "end_line": 362,
      "comment": "\r\n     * Returns the week following this one.  This method will return\r\n     * \u003ccode\u003enull\u003c/code\u003e for some upper limit on the range of weeks (currently\r\n     * week 53, 9999).  For week 52 of any year, the following week is always\r\n     * week 53, but week 53 may not contain any days (you should check for\r\n     * this).\r\n     *\r\n     * @return The following week (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 20)",
        "(line 340,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getSerialIndex()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\r\n     * Returns a serial index number for the week.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 384,
      "end_line": 396,
      "comment": "\r\n     * Returns the first millisecond of the week, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the week.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 49)",
        "(line 386,col 9)-(line 386,col 18)",
        "(line 387,col 9)-(line 387,col 40)",
        "(line 388,col 9)-(line 388,col 48)",
        "(line 389,col 9)-(line 389,col 59)",
        "(line 390,col 9)-(line 390,col 32)",
        "(line 391,col 9)-(line 391,col 34)",
        "(line 392,col 9)-(line 392,col 34)",
        "(line 393,col 9)-(line 393,col 39)",
        "(line 395,col 9)-(line 395,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getLastMillisecond(java.util.Calendar)",
      "begin_line": 409,
      "end_line": 421,
      "comment": "\r\n     * Returns the last millisecond of the week, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the week.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 49)",
        "(line 411,col 9)-(line 411,col 18)",
        "(line 412,col 9)-(line 412,col 40)",
        "(line 413,col 9)-(line 413,col 52)",
        "(line 414,col 9)-(line 414,col 59)",
        "(line 415,col 9)-(line 415,col 32)",
        "(line 416,col 9)-(line 416,col 34)",
        "(line 417,col 9)-(line 417,col 34)",
        "(line 418,col 9)-(line 418,col 39)",
        "(line 420,col 9)-(line 420,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.toString()",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\r\n     * Returns a string representing the week (e.g. \"Week 9, 2002\").\r\n     *\r\n     * TODO: look at internationalisation.\r\n     *\r\n     * @return A string representing the week.\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.equals(java.lang.Object)",
      "begin_line": 444,
      "end_line": 461,
      "comment": "\r\n     * Tests the equality of this Week object to an arbitrary object.  Returns\r\n     * true if the target is a Week instance representing the same week as this\r\n     * object.  In all other cases, returns false.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if week and year of this and object are the\r\n     *         same.\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 31)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.hashCode()",
      "begin_line": 472,
      "end_line": 477,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 24)",
        "(line 474,col 9)-(line 474,col 41)",
        "(line 475,col 9)-(line 475,col 41)",
        "(line 476,col 9)-(line 476,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.compareTo(java.lang.Object)",
      "begin_line": 489,
      "end_line": 519,
      "comment": "\r\n     * Returns an integer indicating the order of this Week object relative to\r\n     * the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 19)",
        "(line 495,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 517,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.parseWeek(java.lang.String)",
      "begin_line": 532,
      "end_line": 580,
      "comment": "\r\n     * Parses the string argument as a week.\r\n     * \u003cP\u003e\r\n     * This method is required to accept the format \"YYYY-Wnn\".  It will also\r\n     * accept \"Wnn-YYYY\". Anything else, at the moment, is a bonus.\r\n     *\r\n     * @param s  string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the week\r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 27)",
        "(line 535,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.findSeparator(java.lang.String)",
      "begin_line": 590,
      "end_line": 603,
      "comment": "\r\n     * Finds the first occurrence of \u0027 \u0027, \u0027-\u0027, \u0027,\u0027 or \u0027.\u0027\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return \u003ccode\u003e-1\u003c/code\u003e if none of the characters was found, the\r\n     *      index of the first occurrence otherwise.\r\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 36)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.evaluateAsYear(java.lang.String)",
      "begin_line": 614,
      "end_line": 625,
      "comment": "\r\n     * Creates a year from a string, or returns null (format exceptions\r\n     * suppressed).\r\n     *\r\n     * @param s  string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the year\r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 27)",
        "(line 617,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.stringToWeek(java.lang.String)",
      "begin_line": 634,
      "end_line": 650,
      "comment": "\r\n     * Converts a string to a week.\r\n     *\r\n     * @param s  the string to parse.\r\n     * @return \u003ccode\u003e-1\u003c/code\u003e if the string does not contain a week number,\r\n     *         the number of the week otherwise.\r\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 24)",
        "(line 637,col 9)-(line 637,col 32)",
        "(line 638,col 9)-(line 638,col 21)",
        "(line 639,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 22)"
      ]
    }
  ]
}