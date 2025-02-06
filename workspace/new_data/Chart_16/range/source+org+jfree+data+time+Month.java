{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/Month.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Month",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 517,
      "comment": "\r\n * Represents a single month.  This class is immutable, which is a requirement\r\n * for all {@link RegularTimePeriod} subclasses.\r\n "
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
        "month"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The month (1-12). "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The year in which the month falls. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Constructs a new Month, based on the current system time.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(int, int)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\r\n     * Constructs a new month instance.\r\n     *\r\n     * @param month  the month (in the range 1 to 12).\r\n     * @param year  the year.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 27)",
        "(line 108,col 9)-(line 108,col 25)",
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(int, org.jfree.data.time.Year)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\r\n     * Constructs a new month instance.\r\n     *\r\n     * @param month  the month (in the range 1 to 12).\r\n     * @param year  the year.\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 27)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(java.util.Date)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Constructs a new \u003ccode\u003eMonth\u003c/code\u003e instance, based on a date/time and \r\n     * the default time zone.\r\n     *\r\n     * @param time  the date/time.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(java.util.Date, java.util.TimeZone)",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\r\n     * Constructs a new \u003ccode\u003eMonth\u003c/code\u003e instance, based on a date/time and \r\n     * a time zone.  The first and last millisecond values are initially\r\n     * pegged to the given time zone also.\r\n     *\r\n     * @param time  the date/time.\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 55)",
        "(line 147,col 9)-(line 147,col 31)",
        "(line 148,col 9)-(line 148,col 54)",
        "(line 149,col 9)-(line 149,col 48)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getYear()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\r\n     * Returns the year in which the month falls.\r\n     *\r\n     * @return The year in which the month falls (as a Year object).\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getYearValue()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the year in which the month falls.\r\n     *\r\n     * @return The year in which the month falls (as an int).\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getMonth()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the month.  Note that 1\u003dJAN, 2\u003dFEB, ...\r\n     *\r\n     * @return The month.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getFirstMillisecond()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns the first millisecond of the month.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the month.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getLastMillisecond()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the last millisecond of the month.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the month.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.peg(java.util.Calendar)",
      "begin_line": 216,
      "end_line": 219,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 62)",
        "(line 218,col 9)-(line 218,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.previous()",
      "begin_line": 226,
      "end_line": 240,
      "comment": "\r\n     * Returns the month preceding this one.\r\n     *\r\n     * @return The month preceding this one.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 21)",
        "(line 228,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.next()",
      "begin_line": 247,
      "end_line": 261,
      "comment": "\r\n     * Returns the month following this one.\r\n     *\r\n     * @return The month following this one.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 21)",
        "(line 249,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getSerialIndex()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Returns a serial index number for the month.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.toString()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns a string representing the month (e.g. \"January 2002\").\r\n     * \u003cP\u003e\r\n     * To do: look at internationalisation.\r\n     *\r\n     * @return A string representing the month.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.equals(java.lang.Object)",
      "begin_line": 293,
      "end_line": 309,
      "comment": "\r\n     * Tests the equality of this Month object to an arbitrary object.\r\n     * Returns true if the target is a Month instance representing the same\r\n     * month as this object.  In all other cases, returns false.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if month and year of this and object are the \r\n     *         same.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.hashCode()",
      "begin_line": 320,
      "end_line": 325,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 24)",
        "(line 322,col 9)-(line 322,col 42)",
        "(line 323,col 9)-(line 323,col 41)",
        "(line 324,col 9)-(line 324,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.compareTo(java.lang.Object)",
      "begin_line": 336,
      "end_line": 366,
      "comment": "\r\n     * Returns an integer indicating the order of this Month object relative to\r\n     * the specified\r\n     * object: negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 19)",
        "(line 342,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 379,
      "end_line": 385,
      "comment": "\r\n     * Returns the first millisecond of the month, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the month.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 60)",
        "(line 381,col 9)-(line 381,col 46)",
        "(line 384,col 9)-(line 384,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getLastMillisecond(java.util.Calendar)",
      "begin_line": 398,
      "end_line": 405,
      "comment": "\r\n     * Returns the last millisecond of the month, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the month.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 67)",
        "(line 400,col 9)-(line 400,col 65)",
        "(line 401,col 9)-(line 401,col 48)",
        "(line 404,col 9)-(line 404,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.parseMonth(java.lang.String)",
      "begin_line": 418,
      "end_line": 470,
      "comment": "\r\n     * Parses the string argument as a month.\r\n     * \u003cP\u003e\r\n     * This method is required to accept the format \"YYYY-MM\".  It will also\r\n     * accept \"MM-YYYY\". Anything else, at the moment, is a bonus.\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the month \r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 28)",
        "(line 421,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.findSeparator(java.lang.String)",
      "begin_line": 480,
      "end_line": 493,
      "comment": "\r\n     * Finds the first occurrence of \u0027 \u0027, \u0027-\u0027, \u0027,\u0027 or \u0027.\u0027\r\n     *\r\n     * @param s  the string to parse.\r\n     * \r\n     * @return \u003ccode\u003e-1\u003c/code\u003e if none of the characters where found, the\r\n     *      position of the first occurence otherwise.\r\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 36)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.evaluateAsYear(java.lang.String)",
      "begin_line": 504,
      "end_line": 515,
      "comment": "\r\n     * Creates a year from a string, or returns null (format exceptions \r\n     * suppressed).\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the year \r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 27)",
        "(line 507,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 22)"
      ]
    }
  ]
}