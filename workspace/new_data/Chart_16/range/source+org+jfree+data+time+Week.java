{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/Week.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Week",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 646,
      "comment": "\r\n * A calendar week.  All years are considered to have 53 weeks, numbered from 1 \r\n * to 53, although in many cases the 53rd week is empty.  Most of the time, the\r\n * 1st week of the year *begins* in the previous calendar year, but it always \r\n * finishes in the current year (this behaviour matches the workings of the \r\n * \u003ccode\u003eGregorianCalendar\u003c/code\u003e class).\r\n * \u003cP\u003e\r\n * This class is immutable, which is a requirement for all \r\n * {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_WEEK_IN_YEAR"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Constant for the first week in the year. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_WEEK_IN_YEAR"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Constant for the last week in the year. "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The year in which the week falls. "
    },
    {
      "type": "field",
      "varNames": [
        "week"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The week (1-53). "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Creates a new time period for the week in which the current system \r\n     * date/time falls.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(int, int)",
      "begin_line": 126,
      "end_line": 134,
      "comment": "\r\n     * Creates a time period representing the week in the specified year.\r\n     *\r\n     * @param week  the week (1 to 53).\r\n     * @param year  the year (1900 to 9999).\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 132,col 33)",
        "(line 133,col 9)-(line 133,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(int, org.jfree.data.time.Year)",
      "begin_line": 142,
      "end_line": 150,
      "comment": "\r\n     * Creates a time period representing the week in the specified year.\r\n     *\r\n     * @param week  the week (1 to 53).\r\n     * @param year  the year (1900 to 9999).\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 32)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time \r\n     * falls.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date, java.util.TimeZone)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time \r\n     * falls, calculated relative to the specified time zone.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @deprecated As of 1.0.7, use {@link #Week(Date, TimeZone, Locale)}.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date, java.util.TimeZone, java.util.Locale)",
      "begin_line": 187,
      "end_line": 221,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time \r\n     * falls, calculated relative to the specified time zone.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 63)",
        "(line 198,col 9)-(line 198,col 31)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 204,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getYear()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Returns the year in which the week falls.\r\n     *\r\n     * @return The year (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getYearValue()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the year in which the week falls, as an integer value.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getWeek()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n     * Returns the week.\r\n     *\r\n     * @return The week.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getFirstMillisecond()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Returns the first millisecond of the week.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the week.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getLastMillisecond()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\r\n     * Returns the last millisecond of the week.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the week.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.peg(java.util.Calendar)",
      "begin_line": 286,
      "end_line": 289,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 62)",
        "(line 288,col 9)-(line 288,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.previous()",
      "begin_line": 299,
      "end_line": 320,
      "comment": "\r\n     * Returns the week preceding this one.  This method will return \r\n     * \u003ccode\u003enull\u003c/code\u003e for some lower limit on the range of weeks (currently \r\n     * week 1, 1900).  For week 1 of any year, the previous week is always week \r\n     * 53, but week 53 may not contain any days (you should check for this).\r\n     *\r\n     * @return The preceding week (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 20)",
        "(line 302,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.next()",
      "begin_line": 331,
      "end_line": 356,
      "comment": "\r\n     * Returns the week following this one.  This method will return \r\n     * \u003ccode\u003enull\u003c/code\u003e for some upper limit on the range of weeks (currently \r\n     * week 53, 9999).  For week 52 of any year, the following week is always \r\n     * week 53, but week 53 may not contain any days (you should check for \r\n     * this).\r\n     *\r\n     * @return The following week (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 20)",
        "(line 334,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getSerialIndex()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\r\n     * Returns a serial index number for the week.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 378,
      "end_line": 390,
      "comment": "\r\n     * Returns the first millisecond of the week, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the week.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 49)",
        "(line 380,col 9)-(line 380,col 18)",
        "(line 381,col 9)-(line 381,col 40)",
        "(line 382,col 9)-(line 382,col 48)",
        "(line 383,col 9)-(line 383,col 59)",
        "(line 384,col 9)-(line 384,col 32)",
        "(line 385,col 9)-(line 385,col 34)",
        "(line 386,col 9)-(line 386,col 34)",
        "(line 387,col 9)-(line 387,col 39)",
        "(line 389,col 9)-(line 389,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getLastMillisecond(java.util.Calendar)",
      "begin_line": 403,
      "end_line": 415,
      "comment": "\r\n     * Returns the last millisecond of the week, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the week.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 49)",
        "(line 405,col 9)-(line 405,col 18)",
        "(line 406,col 9)-(line 406,col 40)",
        "(line 407,col 9)-(line 407,col 52)",
        "(line 408,col 9)-(line 408,col 59)",
        "(line 409,col 9)-(line 409,col 32)",
        "(line 410,col 9)-(line 410,col 34)",
        "(line 411,col 9)-(line 411,col 34)",
        "(line 412,col 9)-(line 412,col 39)",
        "(line 414,col 9)-(line 414,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.toString()",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\r\n     * Returns a string representing the week (e.g. \"Week 9, 2002\").\r\n     *\r\n     * TODO: look at internationalisation.\r\n     *\r\n     * @return A string representing the week.\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.equals(java.lang.Object)",
      "begin_line": 438,
      "end_line": 455,
      "comment": "\r\n     * Tests the equality of this Week object to an arbitrary object.  Returns\r\n     * true if the target is a Week instance representing the same week as this\r\n     * object.  In all other cases, returns false.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if week and year of this and object are the \r\n     *         same.\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 31)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.hashCode()",
      "begin_line": 466,
      "end_line": 471,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 24)",
        "(line 468,col 9)-(line 468,col 41)",
        "(line 469,col 9)-(line 469,col 41)",
        "(line 470,col 9)-(line 470,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.compareTo(java.lang.Object)",
      "begin_line": 483,
      "end_line": 513,
      "comment": "\r\n     * Returns an integer indicating the order of this Week object relative to\r\n     * the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 19)",
        "(line 489,col 9)-(line 509,col 9)",
        "(line 511,col 9)-(line 511,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.parseWeek(java.lang.String)",
      "begin_line": 526,
      "end_line": 574,
      "comment": "\r\n     * Parses the string argument as a week.\r\n     * \u003cP\u003e\r\n     * This method is required to accept the format \"YYYY-Wnn\".  It will also\r\n     * accept \"Wnn-YYYY\". Anything else, at the moment, is a bonus.\r\n     *\r\n     * @param s  string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the week \r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 27)",
        "(line 529,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.findSeparator(java.lang.String)",
      "begin_line": 584,
      "end_line": 597,
      "comment": "\r\n     * Finds the first occurrence of \u0027 \u0027, \u0027-\u0027, \u0027,\u0027 or \u0027.\u0027\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return \u003ccode\u003e-1\u003c/code\u003e if none of the characters was found, the\r\n     *      index of the first occurrence otherwise.\r\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 36)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.evaluateAsYear(java.lang.String)",
      "begin_line": 608,
      "end_line": 619,
      "comment": "\r\n     * Creates a year from a string, or returns null (format exceptions\r\n     * suppressed).\r\n     *\r\n     * @param s  string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the year \r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 27)",
        "(line 611,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.stringToWeek(java.lang.String)",
      "begin_line": 628,
      "end_line": 644,
      "comment": "\r\n     * Converts a string to a week.\r\n     *\r\n     * @param s  the string to parse.\r\n     * @return \u003ccode\u003e-1\u003c/code\u003e if the string does not contain a week number,\r\n     *         the number of the week otherwise.\r\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 24)",
        "(line 631,col 9)-(line 631,col 32)",
        "(line 632,col 9)-(line 632,col 21)",
        "(line 633,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 642,col 22)"
      ]
    }
  ]
}