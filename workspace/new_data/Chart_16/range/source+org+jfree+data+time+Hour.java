{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/Hour.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Hour",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 464,
      "comment": "\r\n * Represents an hour in a specific day.  This class is immutable, which is a \r\n * requirement for all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_HOUR_IN_DAY"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Useful constant for the first hour in the day. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_HOUR_IN_DAY"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Useful constant for the last hour in the day. "
    },
    {
      "type": "field",
      "varNames": [
        "day"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The day. "
    },
    {
      "type": "field",
      "varNames": [
        "hour"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The hour. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Constructs a new Hour, based on the system date/time.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour(int, org.jfree.data.time.Day)",
      "begin_line": 110,
      "end_line": 117,
      "comment": "\r\n     * Constructs a new Hour.\r\n     *\r\n     * @param hour  the hour (in the range 0 to 23).\r\n     * @param day  the day (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 32)",
        "(line 115,col 9)-(line 115,col 23)",
        "(line 116,col 9)-(line 116,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour(int, int, int, int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Creates a new hour.\r\n     * \r\n     * @param hour  the hour (0-23).\r\n     * @param day  the day (1-31).\r\n     * @param month  the month (1-12).\r\n     * @param year  the year (1900-9999).\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour(java.util.Date)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\r\n     * Constructs a new Hour, based on the supplied date/time.\r\n     *\r\n     * @param time  the date-time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour(java.util.Date, java.util.TimeZone)",
      "begin_line": 148,
      "end_line": 160,
      "comment": "\r\n     * Constructs a new Hour, based on the supplied date/time evaluated in the\r\n     * specified time zone.\r\n     *\r\n     * @param time  the date-time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 55)",
        "(line 156,col 9)-(line 156,col 31)",
        "(line 157,col 9)-(line 157,col 62)",
        "(line 158,col 9)-(line 158,col 39)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getHour()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the hour.\r\n     *\r\n     * @return The hour (0 \u003c\u003d hour \u003c\u003d 23).\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getDay()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the day in which this hour falls.\r\n     *\r\n     * @return The day.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getYear()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Returns the year in which this hour falls.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getMonth()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns the month in which this hour falls.\r\n     *\r\n     * @return The month.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getDayOfMonth()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns the day-of-the-month in which this hour falls.\r\n     *\r\n     * @return The day-of-the-month.\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getFirstMillisecond()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Returns the first millisecond of the hour.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the hour.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getLastMillisecond()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Returns the last millisecond of the hour.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the hour.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.peg(java.util.Calendar)",
      "begin_line": 243,
      "end_line": 246,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 62)",
        "(line 245,col 9)-(line 245,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.previous()",
      "begin_line": 253,
      "end_line": 270,
      "comment": "\r\n     * Returns the hour preceding this one.\r\n     *\r\n     * @return The hour preceding this one.\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 20)",
        "(line 256,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.next()",
      "begin_line": 277,
      "end_line": 294,
      "comment": "\r\n     * Returns the hour following this one.\r\n     *\r\n     * @return The hour following this one.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 20)",
        "(line 280,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getSerialIndex()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\r\n     * Returns a serial index number for the hour.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 315,
      "end_line": 323,
      "comment": "\r\n     * Returns the first millisecond of the hour.\r\n     *\r\n     * @param calendar  the calendar/timezone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 38)",
        "(line 317,col 9)-(line 317,col 44)",
        "(line 318,col 9)-(line 318,col 43)",
        "(line 319,col 9)-(line 319,col 56)",
        "(line 320,col 9)-(line 320,col 46)",
        "(line 322,col 9)-(line 322,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getLastMillisecond(java.util.Calendar)",
      "begin_line": 335,
      "end_line": 343,
      "comment": "\r\n     * Returns the last millisecond of the hour.\r\n     *\r\n     * @param calendar  the calendar/timezone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 38)",
        "(line 337,col 9)-(line 337,col 44)",
        "(line 338,col 9)-(line 338,col 43)",
        "(line 339,col 9)-(line 339,col 58)",
        "(line 340,col 9)-(line 340,col 48)",
        "(line 342,col 9)-(line 342,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.equals(java.lang.Object)",
      "begin_line": 356,
      "end_line": 371,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     * \u003cP\u003e\r\n     * This method will return true ONLY if the object is an Hour object\r\n     * representing the same hour as this instance.\r\n     *\r\n     * @param obj  the object to compare (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the hour and day value of the object\r\n     *      is the same as this.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 31)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.hashCode()",
      "begin_line": 382,
      "end_line": 387,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by \r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 24)",
        "(line 384,col 9)-(line 384,col 41)",
        "(line 385,col 9)-(line 385,col 51)",
        "(line 386,col 9)-(line 386,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.compareTo(java.lang.Object)",
      "begin_line": 399,
      "end_line": 429,
      "comment": "\r\n     * Returns an integer indicating the order of this Hour object relative to\r\n     * the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 19)",
        "(line 405,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 427,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.parseHour(java.lang.String)",
      "begin_line": 441,
      "end_line": 462,
      "comment": "\r\n     * Creates an Hour instance by parsing a string.  The string is assumed to\r\n     * be in the format \"YYYY-MM-DD HH\", perhaps with leading or trailing\r\n     * whitespace.\r\n     *\r\n     * @param s  the hour string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the hour \r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 27)",
        "(line 444,col 9)-(line 444,col 21)",
        "(line 446,col 9)-(line 446,col 65)",
        "(line 447,col 9)-(line 447,col 39)",
        "(line 448,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 22)"
      ]
    }
  ]
}