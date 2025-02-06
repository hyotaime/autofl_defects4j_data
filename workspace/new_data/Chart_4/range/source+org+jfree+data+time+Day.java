{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/Day.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Day",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 78,
      "end_line": 468,
      "comment": "\r\n * Represents a single day in the range 1-Jan-1900 to 31-Dec-9999.  This class\r\n * is immutable, which is a requirement for all {@link RegularTimePeriod}\r\n * subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT"
      ],
      "begin_line": 84,
      "end_line": 85,
      "comment": " A standard date formatter. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT_SHORT"
      ],
      "begin_line": 88,
      "end_line": 89,
      "comment": " A date formatter for the default locale. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT_MEDIUM"
      ],
      "begin_line": 92,
      "end_line": 93,
      "comment": " A date formatter for the default locale. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT_LONG"
      ],
      "begin_line": 96,
      "end_line": 97,
      "comment": " A date formatter for the default locale. "
    },
    {
      "type": "field",
      "varNames": [
        "serialDate"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The day (uses SerialDate for convenience). "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Creates a new instance, derived from the system date/time (and assuming\r\n     * the default timezone).\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day(int, int, int)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\r\n     * Constructs a new one day time period.\r\n     *\r\n     * @param day  the day-of-the-month.\r\n     * @param month  the month (1 to 12).\r\n     * @param year  the year (1900 \u003c\u003d year \u003c\u003d 9999).\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 70)",
        "(line 125,col 9)-(line 125,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day(org.jfree.data.time.SerialDate)",
      "begin_line": 133,
      "end_line": 139,
      "comment": "\r\n     * Constructs a new one day time period.\r\n     *\r\n     * @param serialDate  the day (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 37)",
        "(line 138,col 9)-(line 138,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day(java.util.Date)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\r\n     * Constructs a new instance, based on a particular date/time and the\r\n     * default time zone.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #Day(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day(java.util.Date, java.util.TimeZone)",
      "begin_line": 160,
      "end_line": 175,
      "comment": "\r\n     * Constructs a new instance, based on a particular date/time and time zone.\r\n     *\r\n     * @param time  the date/time.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 55)",
        "(line 169,col 9)-(line 169,col 31)",
        "(line 170,col 9)-(line 170,col 52)",
        "(line 171,col 9)-(line 171,col 49)",
        "(line 172,col 9)-(line 172,col 44)",
        "(line 173,col 9)-(line 173,col 61)",
        "(line 174,col 9)-(line 174,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getSerialDate()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the day as a {@link SerialDate}.  Note: the reference that is\r\n     * returned should be an instance of an immutable {@link SerialDate}\r\n     * (otherwise the caller could use the reference to alter the state of\r\n     * this \u003ccode\u003eDay\u003c/code\u003e instance, and \u003ccode\u003eDay\u003c/code\u003e is supposed\r\n     * to be immutable).\r\n     *\r\n     * @return The day as a {@link SerialDate}.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getYear()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns the year.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getMonth()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the month.\r\n     *\r\n     * @return The month.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getDayOfMonth()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Returns the day of the month.\r\n     *\r\n     * @return The day of the month.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getFirstMillisecond()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\r\n     * Returns the first millisecond of the day.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the day.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getLastMillisecond()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\r\n     * Returns the last millisecond of the day.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the day.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.peg(java.util.Calendar)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 62)",
        "(line 255,col 9)-(line 255,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.previous()",
      "begin_line": 263,
      "end_line": 276,
      "comment": "\r\n     * Returns the day preceding this one.\r\n     *\r\n     * @return The day preceding this one.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 19)",
        "(line 266,col 9)-(line 266,col 48)",
        "(line 267,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.next()",
      "begin_line": 285,
      "end_line": 298,
      "comment": "\r\n     * Returns the day following this one, or \u003ccode\u003enull\u003c/code\u003e if some limit\r\n     * has been reached.\r\n     *\r\n     * @return The day following this one, or \u003ccode\u003enull\u003c/code\u003e if some limit\r\n     *         has been reached.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 19)",
        "(line 288,col 9)-(line 288,col 48)",
        "(line 289,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getSerialIndex()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\r\n     * Returns a serial index number for the day.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 320,
      "end_line": 329,
      "comment": "\r\n     * Returns the first millisecond of the day, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  calendar to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The start of the day as milliseconds since 01-01-1970.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 45)",
        "(line 322,col 9)-(line 322,col 47)",
        "(line 323,col 9)-(line 323,col 50)",
        "(line 324,col 9)-(line 324,col 25)",
        "(line 325,col 9)-(line 325,col 52)",
        "(line 326,col 9)-(line 326,col 46)",
        "(line 328,col 9)-(line 328,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getLastMillisecond(java.util.Calendar)",
      "begin_line": 342,
      "end_line": 351,
      "comment": "\r\n     * Returns the last millisecond of the day, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  calendar to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The end of the day as milliseconds since 01-01-1970.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 45)",
        "(line 344,col 9)-(line 344,col 47)",
        "(line 345,col 9)-(line 345,col 50)",
        "(line 346,col 9)-(line 346,col 25)",
        "(line 347,col 9)-(line 347,col 55)",
        "(line 348,col 9)-(line 348,col 48)",
        "(line 350,col 9)-(line 350,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.equals(java.lang.Object)",
      "begin_line": 363,
      "end_line": 377,
      "comment": "\r\n     * Tests the equality of this Day object to an arbitrary object.  Returns\r\n     * true if the target is a Day instance or a SerialDate instance\r\n     * representing the same day as this object. In all other cases,\r\n     * returns false.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A flag indicating whether or not an object is equal to this day.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 29)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.hashCode()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.compareTo(java.lang.Object)",
      "begin_line": 402,
      "end_line": 429,
      "comment": "\r\n     * Returns an integer indicating the order of this Day object relative to\r\n     * the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 19)",
        "(line 408,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 427,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.toString()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\r\n     * Returns a string representing the day.\r\n     *\r\n     * @return A string representing the day.\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.parseDay(java.lang.String)",
      "begin_line": 451,
      "end_line": 466,
      "comment": "\r\n     * Parses the string argument as a day.\r\n     * \u003cP\u003e\r\n     * This method is required to recognise YYYY-MM-DD as a valid format.\r\n     * Anything else, for now, is a bonus.\r\n     *\r\n     * @param s  the date string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string does not contain any parseable\r\n     *      string, the day otherwise.\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 20)"
      ]
    }
  ]
}