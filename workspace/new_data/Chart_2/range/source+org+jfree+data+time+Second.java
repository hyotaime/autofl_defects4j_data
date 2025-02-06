{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/Second.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Second",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 458,
      "comment": "\r\n * Represents a second in a particular day.  This class is immutable, which is\r\n * a requirement for all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_SECOND_IN_MINUTE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Useful constant for the first second in a minute. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_SECOND_IN_MINUTE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Useful constant for the last second in a minute. "
    },
    {
      "type": "field",
      "varNames": [
        "day"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The day. "
    },
    {
      "type": "field",
      "varNames": [
        "hour"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The hour of the day. "
    },
    {
      "type": "field",
      "varNames": [
        "minute"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The minute. "
    },
    {
      "type": "field",
      "varNames": [
        "second"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The second. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\r\n     * The first millisecond.  We don\u0027t store the last millisecond, because it\r\n     * is always firstMillisecond + 999L.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Constructs a new Second, based on the system date/time.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second(int, org.jfree.data.time.Minute)",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\r\n     * Constructs a new Second.\r\n     *\r\n     * @param second  the second (0 to 24*60*60-1).\r\n     * @param minute  the minute (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 35)",
        "(line 118,col 9)-(line 118,col 49)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 36)",
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second(int, int, int, int, int, int)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\r\n     * Creates a new second.\r\n     *\r\n     * @param second  the second (0-59).\r\n     * @param minute  the minute (0-59).\r\n     * @param hour  the hour (0-23).\r\n     * @param day  the day (1-31).\r\n     * @param month  the month (1-12).\r\n     * @param year  the year (1900-9999).\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second(java.util.Date)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Constructs a new instance from the specified date/time and the default\r\n     * time zone..\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #Second(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Second.Second(java.util.Date, java.util.TimeZone)",
      "begin_line": 157,
      "end_line": 166,
      "comment": "\r\n     * Creates a new second based on the supplied time and time zone.\r\n     *\r\n     * @param time  the instant in time.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 55)",
        "(line 160,col 9)-(line 160,col 31)",
        "(line 161,col 9)-(line 161,col 59)",
        "(line 162,col 9)-(line 162,col 59)",
        "(line 163,col 9)-(line 163,col 62)",
        "(line 164,col 9)-(line 164,col 39)",
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getSecond()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the second within the minute.\r\n     *\r\n     * @return The second (0 - 59).\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getMinute()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns the minute.\r\n     *\r\n     * @return The minute (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getFirstMillisecond()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the first millisecond of the second.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the second.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getLastMillisecond()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * Returns the last millisecond of the second.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the second.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.peg(java.util.Calendar)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.previous()",
      "begin_line": 231,
      "end_line": 245,
      "comment": "\r\n     * Returns the second preceding this one.\r\n     *\r\n     * @return The second preceding this one.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 29)",
        "(line 234,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.next()",
      "begin_line": 252,
      "end_line": 266,
      "comment": "\r\n     * Returns the second following this one.\r\n     *\r\n     * @return The second following this one.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 29)",
        "(line 255,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getSerialIndex()",
      "begin_line": 273,
      "end_line": 277,
      "comment": "\r\n     * Returns a serial index number for the minute.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 69)",
        "(line 275,col 9)-(line 275,col 57)",
        "(line 276,col 9)-(line 276,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 289,
      "end_line": 298,
      "comment": "\r\n     * Returns the first millisecond of the minute.\r\n     *\r\n     * @param calendar  the calendar/timezone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 38)",
        "(line 291,col 9)-(line 291,col 44)",
        "(line 292,col 9)-(line 292,col 43)",
        "(line 293,col 9)-(line 293,col 25)",
        "(line 294,col 9)-(line 294,col 76)",
        "(line 295,col 9)-(line 295,col 46)",
        "(line 297,col 9)-(line 297,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.getLastMillisecond(java.util.Calendar)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns the last millisecond of the second.\r\n     *\r\n     * @param calendar  the calendar/timezone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.equals(java.lang.Object)",
      "begin_line": 325,
      "end_line": 346,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     * \u003cP\u003e\r\n     * This method will return true ONLY if the object is a Second object\r\n     * representing the same second as this instance.\r\n     *\r\n     * @param obj  the object to compare (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if second and minute of this and the object\r\n     *         are the same.\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 35)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.hashCode()",
      "begin_line": 357,
      "end_line": 364,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 24)",
        "(line 359,col 9)-(line 359,col 43)",
        "(line 360,col 9)-(line 360,col 43)",
        "(line 361,col 9)-(line 361,col 41)",
        "(line 362,col 9)-(line 362,col 51)",
        "(line 363,col 9)-(line 363,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.compareTo(java.lang.Object)",
      "begin_line": 375,
      "end_line": 410,
      "comment": "\r\n     * Returns an integer indicating the order of this Second object relative\r\n     * to the specified\r\n     * object: negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 19)",
        "(line 381,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 408,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Second.parseSecond(java.lang.String)",
      "begin_line": 421,
      "end_line": 456,
      "comment": "\r\n     * Creates a new instance by parsing a string.  The string is assumed to\r\n     * be in the format \"YYYY-MM-DD HH:MM:SS\", perhaps with leading or trailing\r\n     * whitespace.\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return The second, or \u003ccode\u003enull\u003c/code\u003e if the string is not parseable.\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 29)",
        "(line 424,col 9)-(line 424,col 21)",
        "(line 426,col 9)-(line 426,col 65)",
        "(line 427,col 9)-(line 427,col 39)",
        "(line 428,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 22)"
      ]
    }
  ]
}