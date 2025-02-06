{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/Hour.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Hour",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 480,
      "comment": "\r\n * Represents an hour in a specific day.  This class is immutable, which is a\r\n * requirement for all {@link RegularTimePeriod} subclasses.\r\n "
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
        "FIRST_HOUR_IN_DAY"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Useful constant for the first hour in the day. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_HOUR_IN_DAY"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Useful constant for the last hour in the day. "
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
      "comment": " The hour. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Constructs a new Hour, based on the system date/time.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour(int, org.jfree.data.time.Day)",
      "begin_line": 111,
      "end_line": 118,
      "comment": "\r\n     * Constructs a new Hour.\r\n     *\r\n     * @param hour  the hour (in the range 0 to 23).\r\n     * @param day  the day (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 32)",
        "(line 116,col 9)-(line 116,col 23)",
        "(line 117,col 9)-(line 117,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour(int, int, int, int)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Creates a new hour.\r\n     *\r\n     * @param hour  the hour (0-23).\r\n     * @param day  the day (1-31).\r\n     * @param month  the month (1-12).\r\n     * @param year  the year (1900-9999).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour(java.util.Date)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\r\n     * Constructs a new instance, based on the supplied date/time and\r\n     * the default time zone.\r\n     *\r\n     * @param time  the date-time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #Hour(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Hour.Hour(java.util.Date, java.util.TimeZone)",
      "begin_line": 152,
      "end_line": 165,
      "comment": "\r\n     * Constructs a new instance, based on the supplied date/time evaluated\r\n     * in the specified time zone.\r\n     *\r\n     * @param time  the date-time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 55)",
        "(line 161,col 9)-(line 161,col 31)",
        "(line 162,col 9)-(line 162,col 62)",
        "(line 163,col 9)-(line 163,col 39)",
        "(line 164,col 9)-(line 164,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getHour()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns the hour.\r\n     *\r\n     * @return The hour (0 \u003c\u003d hour \u003c\u003d 23).\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getDay()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\r\n     * Returns the day in which this hour falls.\r\n     *\r\n     * @return The day.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getYear()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns the year in which this hour falls.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getMonth()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Returns the month in which this hour falls.\r\n     *\r\n     * @return The month.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getDayOfMonth()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\r\n     * Returns the day-of-the-month in which this hour falls.\r\n     *\r\n     * @return The day-of-the-month.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getFirstMillisecond()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the first millisecond of the hour.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the hour.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getLastMillisecond()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the last millisecond of the hour.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the hour.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.peg(java.util.Calendar)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 62)",
        "(line 250,col 9)-(line 250,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.previous()",
      "begin_line": 258,
      "end_line": 275,
      "comment": "\r\n     * Returns the hour preceding this one.\r\n     *\r\n     * @return The hour preceding this one.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 20)",
        "(line 261,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.next()",
      "begin_line": 282,
      "end_line": 299,
      "comment": "\r\n     * Returns the hour following this one.\r\n     *\r\n     * @return The hour following this one.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 20)",
        "(line 285,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getSerialIndex()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\r\n     * Returns a serial index number for the hour.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 320,
      "end_line": 328,
      "comment": "\r\n     * Returns the first millisecond of the hour.\r\n     *\r\n     * @param calendar  the calendar/timezone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 38)",
        "(line 322,col 9)-(line 322,col 44)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 324,col 56)",
        "(line 325,col 9)-(line 325,col 46)",
        "(line 327,col 9)-(line 327,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.getLastMillisecond(java.util.Calendar)",
      "begin_line": 340,
      "end_line": 348,
      "comment": "\r\n     * Returns the last millisecond of the hour.\r\n     *\r\n     * @param calendar  the calendar/timezone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 38)",
        "(line 342,col 9)-(line 342,col 44)",
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 344,col 58)",
        "(line 345,col 9)-(line 345,col 48)",
        "(line 347,col 9)-(line 347,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.equals(java.lang.Object)",
      "begin_line": 361,
      "end_line": 376,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     * \u003cP\u003e\r\n     * This method will return true ONLY if the object is an Hour object\r\n     * representing the same hour as this instance.\r\n     *\r\n     * @param obj  the object to compare (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the hour and day value of the object\r\n     *      is the same as this.\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 31)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.toString()",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\r\n     * Returns a string representation of this instance, for debugging\r\n     * purposes.\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 385,col 6)-(line 386,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.hashCode()",
      "begin_line": 398,
      "end_line": 403,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 24)",
        "(line 400,col 9)-(line 400,col 41)",
        "(line 401,col 9)-(line 401,col 51)",
        "(line 402,col 9)-(line 402,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.compareTo(java.lang.Object)",
      "begin_line": 415,
      "end_line": 445,
      "comment": "\r\n     * Returns an integer indicating the order of this Hour object relative to\r\n     * the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 19)",
        "(line 421,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Hour.parseHour(java.lang.String)",
      "begin_line": 457,
      "end_line": 478,
      "comment": "\r\n     * Creates an Hour instance by parsing a string.  The string is assumed to\r\n     * be in the format \"YYYY-MM-DD HH\", perhaps with leading or trailing\r\n     * whitespace.\r\n     *\r\n     * @param s  the hour string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the hour\r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 27)",
        "(line 460,col 9)-(line 460,col 21)",
        "(line 462,col 9)-(line 462,col 65)",
        "(line 463,col 9)-(line 463,col 39)",
        "(line 464,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 476,col 22)"
      ]
    }
  ]
}