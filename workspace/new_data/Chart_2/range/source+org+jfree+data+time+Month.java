{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/Month.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Month",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 79,
      "end_line": 545,
      "comment": "\r\n * Represents a single month.  This class is immutable, which is a requirement\r\n * for all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "month"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The month (1-12). "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The year in which the month falls. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Constructs a new Month, based on the current system time.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(int, int)",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\r\n     * Constructs a new month instance.\r\n     *\r\n     * @param month  the month (in the range 1 to 12).\r\n     * @param year  the year.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 27)",
        "(line 114,col 9)-(line 114,col 25)",
        "(line 115,col 9)-(line 115,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(int, org.jfree.data.time.Year)",
      "begin_line": 124,
      "end_line": 131,
      "comment": "\r\n     * Constructs a new month instance.\r\n     *\r\n     * @param month  the month (in the range 1 to 12).\r\n     * @param year  the year.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 27)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(java.util.Date)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Constructs a new \u003ccode\u003eMonth\u003c/code\u003e instance, based on a date/time and\r\n     * the default time zone.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #Month(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(java.util.Date, java.util.TimeZone)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Constructs a new \u003ccode\u003eMonth\u003c/code\u003e instance, based on a date/time and\r\n     * a time zone.  The first and last millisecond values are initially\r\n     * pegged to the given time zone also.\r\n     *\r\n     * @param time  the date/time.\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @deprecated Since 1.0.12, use {@link #Month(Date, TimeZone, Locale)}\r\n     *     instead.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Month.Month(java.util.Date, java.util.TimeZone, java.util.Locale)",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\r\n     * Creates a new \u003ccode\u003eMonth\u003c/code\u003e instance, based on the specified time,\r\n     * zone and locale.\r\n     *\r\n     * @param time  the current time.\r\n     * @param zone  the time zone.\r\n     * @param locale  the locale.\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 63)",
        "(line 172,col 9)-(line 172,col 31)",
        "(line 173,col 9)-(line 173,col 54)",
        "(line 174,col 9)-(line 174,col 48)",
        "(line 175,col 9)-(line 175,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getYear()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns the year in which the month falls.\r\n     *\r\n     * @return The year in which the month falls (as a Year object).\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getYearValue()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the year in which the month falls.\r\n     *\r\n     * @return The year in which the month falls (as an int).\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getMonth()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Returns the month.  Note that 1\u003dJAN, 2\u003dFEB, ...\r\n     *\r\n     * @return The month.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getFirstMillisecond()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns the first millisecond of the month.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the month.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getLastMillisecond()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the last millisecond of the month.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the month.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.peg(java.util.Calendar)",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 62)",
        "(line 243,col 9)-(line 243,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.previous()",
      "begin_line": 254,
      "end_line": 268,
      "comment": "\r\n     * Returns the month preceding this one.  Note that the returned\r\n     * {@link Month} is \"pegged\" using the default time-zone, irrespective of\r\n     * the time-zone used to peg of the current month (which is not recorded\r\n     * anywhere).  See the {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The month preceding this one.\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 21)",
        "(line 256,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.next()",
      "begin_line": 278,
      "end_line": 292,
      "comment": "\r\n     * Returns the month following this one.  Note that the returned\r\n     * {@link Month} is \"pegged\" using the default time-zone, irrespective of\r\n     * the time-zone used to peg of the current month (which is not recorded\r\n     * anywhere).  See the {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The month following this one.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 21)",
        "(line 280,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getSerialIndex()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\r\n     * Returns a serial index number for the month.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.toString()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns a string representing the month (e.g. \"January 2002\").\r\n     * \u003cP\u003e\r\n     * To do: look at internationalisation.\r\n     *\r\n     * @return A string representing the month.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.equals(java.lang.Object)",
      "begin_line": 324,
      "end_line": 339,
      "comment": "\r\n     * Tests the equality of this Month object to an arbitrary object.\r\n     * Returns true if the target is a Month instance representing the same\r\n     * month as this object.  In all other cases, returns false.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if month and year of this and object are the\r\n     *         same.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 33)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.hashCode()",
      "begin_line": 350,
      "end_line": 355,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 24)",
        "(line 352,col 9)-(line 352,col 42)",
        "(line 353,col 9)-(line 353,col 41)",
        "(line 354,col 9)-(line 354,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.compareTo(java.lang.Object)",
      "begin_line": 366,
      "end_line": 396,
      "comment": "\r\n     * Returns an integer indicating the order of this Month object relative to\r\n     * the specified\r\n     * object: negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 19)",
        "(line 372,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 409,
      "end_line": 415,
      "comment": "\r\n     * Returns the first millisecond of the month, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the month.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 60)",
        "(line 411,col 9)-(line 411,col 46)",
        "(line 414,col 9)-(line 414,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.getLastMillisecond(java.util.Calendar)",
      "begin_line": 428,
      "end_line": 435,
      "comment": "\r\n     * Returns the last millisecond of the month, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the month.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 67)",
        "(line 430,col 9)-(line 430,col 65)",
        "(line 431,col 9)-(line 431,col 48)",
        "(line 434,col 9)-(line 434,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.parseMonth(java.lang.String)",
      "begin_line": 447,
      "end_line": 500,
      "comment": "\r\n     * Parses the string argument as a month.  This method is required to\r\n     * accept the format \"YYYY-MM\".  It will also accept \"MM-YYYY\". Anything\r\n     * else, at the moment, is a bonus.\r\n     *\r\n     * @param s  the string to parse (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the month\r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 28)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 21)",
        "(line 454,col 9)-(line 454,col 39)",
        "(line 455,col 9)-(line 455,col 22)",
        "(line 456,col 9)-(line 456,col 28)",
        "(line 459,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 18)",
        "(line 483,col 9)-(line 483,col 18)",
        "(line 484,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 40)",
        "(line 499,col 9)-(line 499,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.findSeparator(java.lang.String)",
      "begin_line": 511,
      "end_line": 523,
      "comment": "\r\n     * Finds the first occurrence of \u0027-\u0027, or if that character is not found,\r\n     * the first occurrence of \u0027,\u0027, or the first occurrence of \u0027 \u0027 or \u0027.\u0027\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return The position of the separator character, or \u003ccode\u003e-1\u003c/code\u003e if\r\n     *     none of the characters were found.\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 36)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Month.evaluateAsYear(java.lang.String)",
      "begin_line": 534,
      "end_line": 543,
      "comment": "\r\n     * Creates a year from a string, or returns \u003ccode\u003enull\u003c/code\u003e (format\r\n     * exceptions suppressed).\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the year\r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 27)",
        "(line 536,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 22)"
      ]
    }
  ]
}