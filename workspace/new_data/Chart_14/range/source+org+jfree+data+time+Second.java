{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/Second.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Second",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 453,
      "comment": "\r\n * Represents a second in a particular day.  This class is immutable, which is \r\n * a requirement for all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_SECOND_IN_MINUTE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Useful constant for the first second in a minute. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_SECOND_IN_MINUTE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Useful constant for the last second in a minute. "
    },
    {
      "type": "field",
      "varNames": [
        "day"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The day. "
    },
    {
      "type": "field",
      "varNames": [
        "hour"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The hour of the day. "
    },
    {
      "type": "field",
      "varNames": [
        "minute"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The minute. "
    },
    {
      "type": "field",
      "varNames": [
        "second"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The second. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " \r\n     * The first millisecond.  We don\u0027t store the last millisecond, because it\r\n     * is always firstMillisecond + 999L.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Constructs a new Second, based on the system date/time.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second(int, org.jfree.data.time.Minute)",
      "begin_line": 112,
      "end_line": 121,
      "comment": "\r\n     * Constructs a new Second.\r\n     *\r\n     * @param second  the second (0 to 24*60*60-1).\r\n     * @param minute  the minute (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 35)",
        "(line 117,col 9)-(line 117,col 49)",
        "(line 118,col 9)-(line 118,col 48)",
        "(line 119,col 9)-(line 119,col 36)",
        "(line 120,col 9)-(line 120,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second(int, int, int, int, int, int)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\r\n     * Creates a new second.\r\n     * \r\n     * @param second  the second (0-59).\r\n     * @param minute  the minute (0-59).\r\n     * @param hour  the hour (0-23).\r\n     * @param day  the day (1-31).\r\n     * @param month  the month (1-12).\r\n     * @param year  the year (1900-9999).\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second(java.util.Date)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Constructs a second.\r\n     *\r\n     * @param time  the time.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second(java.util.Date, java.util.TimeZone)",
      "begin_line": 153,
      "end_line": 161,
      "comment": "\r\n     * Creates a new second based on the supplied time and time zone.\r\n     *\r\n     * @param time  the instant in time.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 55)",
        "(line 155,col 9)-(line 155,col 31)",
        "(line 156,col 9)-(line 156,col 59)",
        "(line 157,col 9)-(line 157,col 59)",
        "(line 158,col 9)-(line 158,col 62)",
        "(line 159,col 9)-(line 159,col 39)",
        "(line 160,col 9)-(line 160,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getSecond()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the second within the minute.\r\n     *\r\n     * @return The second (0 - 59).\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getMinute()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Returns the minute.\r\n     *\r\n     * @return The minute (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getFirstMillisecond()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Returns the first millisecond of the second.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the second.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getLastMillisecond()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the last millisecond of the second.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the second.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.peg(java.util.Calendar)",
      "begin_line": 217,
      "end_line": 219,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.previous()",
      "begin_line": 226,
      "end_line": 240,
      "comment": "\r\n     * Returns the second preceding this one.\r\n     *\r\n     * @return The second preceding this one.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 29)",
        "(line 229,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.next()",
      "begin_line": 247,
      "end_line": 261,
      "comment": "\r\n     * Returns the second following this one.\r\n     *\r\n     * @return The second following this one.\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 29)",
        "(line 250,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getSerialIndex()",
      "begin_line": 268,
      "end_line": 272,
      "comment": "\r\n     * Returns a serial index number for the minute.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 69)",
        "(line 270,col 9)-(line 270,col 57)",
        "(line 271,col 9)-(line 271,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 284,
      "end_line": 293,
      "comment": "\r\n     * Returns the first millisecond of the minute.\r\n     *\r\n     * @param calendar  the calendar/timezone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 38)",
        "(line 286,col 9)-(line 286,col 44)",
        "(line 287,col 9)-(line 287,col 43)",
        "(line 288,col 9)-(line 288,col 25)",
        "(line 289,col 9)-(line 289,col 76)",
        "(line 290,col 9)-(line 290,col 46)",
        "(line 292,col 9)-(line 292,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getLastMillisecond(java.util.Calendar)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\r\n     * Returns the last millisecond of the second.\r\n     *\r\n     * @param calendar  the calendar/timezone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.equals(java.lang.Object)",
      "begin_line": 320,
      "end_line": 341,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     * \u003cP\u003e\r\n     * This method will return true ONLY if the object is a Second object\r\n     * representing the same second as this instance.\r\n     *\r\n     * @param obj  the object to compare (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if second and minute of this and the object \r\n     *         are the same.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 35)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.hashCode()",
      "begin_line": 352,
      "end_line": 359,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 24)",
        "(line 354,col 9)-(line 354,col 43)",
        "(line 355,col 9)-(line 355,col 43)",
        "(line 356,col 9)-(line 356,col 41)",
        "(line 357,col 9)-(line 357,col 51)",
        "(line 358,col 9)-(line 358,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.compareTo(java.lang.Object)",
      "begin_line": 370,
      "end_line": 405,
      "comment": "\r\n     * Returns an integer indicating the order of this Second object relative\r\n     * to the specified\r\n     * object: negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 19)",
        "(line 376,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 403,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.parseSecond(java.lang.String)",
      "begin_line": 416,
      "end_line": 451,
      "comment": "\r\n     * Creates a new instance by parsing a string.  The string is assumed to\r\n     * be in the format \"YYYY-MM-DD HH:MM:SS\", perhaps with leading or trailing\r\n     * whitespace.\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return The second, or \u003ccode\u003enull\u003c/code\u003e if the string is not parseable.\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 29)",
        "(line 419,col 9)-(line 419,col 21)",
        "(line 421,col 9)-(line 421,col 65)",
        "(line 422,col 9)-(line 422,col 39)",
        "(line 423,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 449,col 22)"
      ]
    }
  ]
}