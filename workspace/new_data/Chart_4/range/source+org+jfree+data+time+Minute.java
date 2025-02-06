{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/Minute.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Minute",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 496,
      "comment": "\r\n * Represents a minute.  This class is immutable, which is a requirement for\r\n * all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_MINUTE_IN_HOUR"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Useful constant for the first minute in a day. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_MINUTE_IN_HOUR"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Useful constant for the last minute in a day. "
    },
    {
      "type": "field",
      "varNames": [
        "day"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The day. "
    },
    {
      "type": "field",
      "varNames": [
        "hour"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The hour in which the minute falls. "
    },
    {
      "type": "field",
      "varNames": [
        "minute"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The minute. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Constructs a new Minute, based on the system date/time.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute(int, org.jfree.data.time.Hour)",
      "begin_line": 115,
      "end_line": 123,
      "comment": "\r\n     * Constructs a new Minute.\r\n     *\r\n     * @param minute  the minute (0 to 59).\r\n     * @param hour  the hour (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 36)",
        "(line 120,col 9)-(line 120,col 42)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute(java.util.Date)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\r\n     * Constructs a new instance, based on the supplied date/time and\r\n     * the default time zone.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #Minute(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute(java.util.Date, java.util.TimeZone)",
      "begin_line": 144,
      "end_line": 159,
      "comment": "\r\n     * Constructs a new Minute, based on the supplied date/time and timezone.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 55)",
        "(line 153,col 9)-(line 153,col 31)",
        "(line 154,col 9)-(line 154,col 48)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 156,col 9)-(line 156,col 62)",
        "(line 157,col 9)-(line 157,col 39)",
        "(line 158,col 9)-(line 158,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Minute.Minute(int, int, int, int, int)",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\r\n     * Creates a new minute.\r\n     *\r\n     * @param minute  the minute (0-59).\r\n     * @param hour  the hour (0-23).\r\n     * @param day  the day (1-31).\r\n     * @param month  the month (1-12).\r\n     * @param year  the year (1900-9999).\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getDay()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Returns the day.\r\n     *\r\n     * @return The day.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getHour()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns the hour.\r\n     *\r\n     * @return The hour (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getHourValue()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the hour.\r\n     *\r\n     * @return The hour.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getMinute()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the minute.\r\n     *\r\n     * @return The minute.\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getFirstMillisecond()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Returns the first millisecond of the minute.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the minute.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getLastMillisecond()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Returns the last millisecond of the minute.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the minute.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.peg(java.util.Calendar)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 62)",
        "(line 256,col 9)-(line 256,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.previous()",
      "begin_line": 264,
      "end_line": 279,
      "comment": "\r\n     * Returns the minute preceding this one.\r\n     *\r\n     * @return The minute preceding this one.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 22)",
        "(line 266,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.next()",
      "begin_line": 286,
      "end_line": 303,
      "comment": "\r\n     * Returns the minute following this one.\r\n     *\r\n     * @return The minute following this one.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 22)",
        "(line 289,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getSerialIndex()",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\r\n     * Returns a serial index number for the minute.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 69)",
        "(line 312,col 9)-(line 312,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 326,
      "end_line": 339,
      "comment": "\r\n     * Returns the first millisecond of the minute.\r\n     *\r\n     * @param calendar  the calendar which defines the timezone\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 38)",
        "(line 329,col 9)-(line 329,col 44)",
        "(line 330,col 9)-(line 330,col 43)",
        "(line 332,col 9)-(line 332,col 25)",
        "(line 333,col 9)-(line 333,col 66)",
        "(line 334,col 9)-(line 334,col 46)",
        "(line 337,col 9)-(line 337,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.getLastMillisecond(java.util.Calendar)",
      "begin_line": 352,
      "end_line": 365,
      "comment": "\r\n     * Returns the last millisecond of the minute.\r\n     *\r\n     * @param calendar  the calendar / timezone (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     *\r\n     * @return The last millisecond.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 38)",
        "(line 355,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 356,col 43)",
        "(line 358,col 9)-(line 358,col 25)",
        "(line 359,col 9)-(line 359,col 67)",
        "(line 360,col 9)-(line 360,col 48)",
        "(line 363,col 9)-(line 363,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.equals(java.lang.Object)",
      "begin_line": 378,
      "end_line": 393,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     * \u003cP\u003e\r\n     * This method will return true ONLY if the object is a Minute object\r\n     * representing the same minute as this instance.\r\n     *\r\n     * @param obj  the object to compare (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the minute and hour value of this and the\r\n     *      object are the same.\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 35)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.hashCode()",
      "begin_line": 404,
      "end_line": 410,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described\r\n     * by Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 24)",
        "(line 406,col 9)-(line 406,col 43)",
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 51)",
        "(line 409,col 9)-(line 409,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.compareTo(java.lang.Object)",
      "begin_line": 422,
      "end_line": 452,
      "comment": "\r\n     * Returns an integer indicating the order of this Minute object relative\r\n     * to the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 19)",
        "(line 428,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 450,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Minute.parseMinute(java.lang.String)",
      "begin_line": 464,
      "end_line": 494,
      "comment": "\r\n     * Creates a Minute instance by parsing a string.  The string is assumed to\r\n     * be in the format \"YYYY-MM-DD HH:MM\", perhaps with leading or trailing\r\n     * whitespace.\r\n     *\r\n     * @param s  the minute string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e, if the string is not parseable, the minute\r\n     *      otherwise.\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 29)",
        "(line 467,col 9)-(line 467,col 21)",
        "(line 469,col 9)-(line 469,col 65)",
        "(line 470,col 9)-(line 470,col 39)",
        "(line 471,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 22)"
      ]
    }
  ]
}