{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/Minute.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Minute",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 491,
      "comment": "\r\n * Represents a minute.  This class is immutable, which is a requirement for \r\n * all {@link RegularTimePeriod} subclasses.\r\n "
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
        "FIRST_MINUTE_IN_HOUR"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Useful constant for the first minute in a day. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_MINUTE_IN_HOUR"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Useful constant for the last minute in a day. "
    },
    {
      "type": "field",
      "varNames": [
        "day"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The day. "
    },
    {
      "type": "field",
      "varNames": [
        "hour"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The hour in which the minute falls. "
    },
    {
      "type": "field",
      "varNames": [
        "minute"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The minute. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Constructs a new Minute, based on the system date/time.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute(int, org.jfree.data.time.Hour)",
      "begin_line": 114,
      "end_line": 122,
      "comment": "\r\n     * Constructs a new Minute.\r\n     *\r\n     * @param minute  the minute (0 to 59).\r\n     * @param hour  the hour (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 36)",
        "(line 119,col 9)-(line 119,col 42)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute(java.util.Date)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\r\n     * Constructs a new Minute, based on the supplied date/time.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute(java.util.Date, java.util.TimeZone)",
      "begin_line": 140,
      "end_line": 154,
      "comment": "\r\n     * Constructs a new Minute, based on the supplied date/time and timezone.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 55)",
        "(line 148,col 9)-(line 148,col 31)",
        "(line 149,col 9)-(line 149,col 48)",
        "(line 150,col 9)-(line 150,col 33)",
        "(line 151,col 9)-(line 151,col 62)",
        "(line 152,col 9)-(line 152,col 39)",
        "(line 153,col 9)-(line 153,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute(int, int, int, int, int)",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\r\n     * Creates a new minute.\r\n     * \r\n     * @param minute  the minute (0-59).\r\n     * @param hour  the hour (0-23).\r\n     * @param day  the day (1-31).\r\n     * @param month  the month (1-12).\r\n     * @param year  the year (1900-9999).\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getDay()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns the day.\r\n     * \r\n     * @return The day.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getHour()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the hour.\r\n     *\r\n     * @return The hour (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getHourValue()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the hour.\r\n     * \r\n     * @return The hour.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getMinute()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns the minute.\r\n     *\r\n     * @return The minute.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getFirstMillisecond()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Returns the first millisecond of the minute.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the minute.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getLastMillisecond()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the last millisecond of the minute.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the minute.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.peg(java.util.Calendar)",
      "begin_line": 249,
      "end_line": 252,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 62)",
        "(line 251,col 9)-(line 251,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.previous()",
      "begin_line": 259,
      "end_line": 274,
      "comment": "\r\n     * Returns the minute preceding this one.\r\n     *\r\n     * @return The minute preceding this one.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 22)",
        "(line 261,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.next()",
      "begin_line": 281,
      "end_line": 298,
      "comment": "\r\n     * Returns the minute following this one.\r\n     *\r\n     * @return The minute following this one.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 22)",
        "(line 284,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getSerialIndex()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\r\n     * Returns a serial index number for the minute.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 69)",
        "(line 307,col 9)-(line 307,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 321,
      "end_line": 334,
      "comment": "\r\n     * Returns the first millisecond of the minute.\r\n     *\r\n     * @param calendar  the calendar which defines the timezone \r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 38)",
        "(line 324,col 9)-(line 324,col 44)",
        "(line 325,col 9)-(line 325,col 43)",
        "(line 327,col 9)-(line 327,col 25)",
        "(line 328,col 9)-(line 328,col 66)",
        "(line 329,col 9)-(line 329,col 46)",
        "(line 332,col 9)-(line 332,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getLastMillisecond(java.util.Calendar)",
      "begin_line": 347,
      "end_line": 360,
      "comment": "\r\n     * Returns the last millisecond of the minute.\r\n     *\r\n     * @param calendar  the calendar / timezone (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     *\r\n     * @return The last millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 38)",
        "(line 350,col 9)-(line 350,col 44)",
        "(line 351,col 9)-(line 351,col 43)",
        "(line 353,col 9)-(line 353,col 25)",
        "(line 354,col 9)-(line 354,col 67)",
        "(line 355,col 9)-(line 355,col 48)",
        "(line 358,col 9)-(line 358,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.equals(java.lang.Object)",
      "begin_line": 373,
      "end_line": 388,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     * \u003cP\u003e\r\n     * This method will return true ONLY if the object is a Minute object\r\n     * representing the same minute as this instance.\r\n     *\r\n     * @param obj  the object to compare (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the minute and hour value of this and the\r\n     *      object are the same.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 35)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.hashCode()",
      "begin_line": 399,
      "end_line": 405,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described \r\n     * by Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 24)",
        "(line 401,col 9)-(line 401,col 43)",
        "(line 402,col 9)-(line 402,col 41)",
        "(line 403,col 9)-(line 403,col 51)",
        "(line 404,col 9)-(line 404,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.compareTo(java.lang.Object)",
      "begin_line": 417,
      "end_line": 447,
      "comment": "\r\n     * Returns an integer indicating the order of this Minute object relative\r\n     * to the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 19)",
        "(line 423,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 445,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.parseMinute(java.lang.String)",
      "begin_line": 459,
      "end_line": 489,
      "comment": "\r\n     * Creates a Minute instance by parsing a string.  The string is assumed to\r\n     * be in the format \"YYYY-MM-DD HH:MM\", perhaps with leading or trailing\r\n     * whitespace.\r\n     *\r\n     * @param s  the minute string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e, if the string is not parseable, the minute\r\n     *      otherwise.\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 29)",
        "(line 462,col 9)-(line 462,col 21)",
        "(line 464,col 9)-(line 464,col 65)",
        "(line 465,col 9)-(line 465,col 39)",
        "(line 466,col 9)-(line 485,col 9)",
        "(line 487,col 9)-(line 487,col 22)"
      ]
    }
  ]
}