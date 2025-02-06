{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/Day.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Day",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 464,
      "comment": "\r\n * Represents a single day in the range 1-Jan-1900 to 31-Dec-9999.  This class \r\n * is immutable, which is a requirement for all {@link RegularTimePeriod} \r\n * subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": " A standard date formatter. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT_SHORT"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": " A date formatter for the default locale. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT_MEDIUM"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": " A date formatter for the default locale. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT_LONG"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": " A date formatter for the default locale. "
    },
    {
      "type": "field",
      "varNames": [
        "serialDate"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The day (uses SerialDate for convenience). "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * Creates a new instance, derived from the system date/time (and assuming \r\n     * the default timezone).\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day(int, int, int)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\r\n     * Constructs a new one day time period.\r\n     *\r\n     * @param day  the day-of-the-month.\r\n     * @param month  the month (1 to 12).\r\n     * @param year  the year (1900 \u003c\u003d year \u003c\u003d 9999).\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 70)",
        "(line 124,col 9)-(line 124,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day(org.jfree.data.time.SerialDate)",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\r\n     * Constructs a new one day time period.\r\n     *\r\n     * @param serialDate  the day (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 37)",
        "(line 137,col 9)-(line 137,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day(java.util.Date)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\r\n     * Constructs a new instance, based on a particular date/time and the \r\n     * default time zone.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Day.Day(java.util.Date, java.util.TimeZone)",
      "begin_line": 157,
      "end_line": 171,
      "comment": "\r\n     * Constructs a new instance, based on a particular date/time and time zone.\r\n     *\r\n     * @param time  the date/time.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 55)",
        "(line 165,col 9)-(line 165,col 31)",
        "(line 166,col 9)-(line 166,col 52)",
        "(line 167,col 9)-(line 167,col 49)",
        "(line 168,col 9)-(line 168,col 44)",
        "(line 169,col 9)-(line 169,col 61)",
        "(line 170,col 9)-(line 170,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getSerialDate()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns the day as a {@link SerialDate}.  Note: the reference that is \r\n     * returned should be an instance of an immutable {@link SerialDate} \r\n     * (otherwise the caller could use the reference to alter the state of \r\n     * this \u003ccode\u003eDay\u003c/code\u003e instance, and \u003ccode\u003eDay\u003c/code\u003e is supposed\r\n     * to be immutable).\r\n     *\r\n     * @return The day as a {@link SerialDate}.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getYear()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Returns the year.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getMonth()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the month.\r\n     *\r\n     * @return The month.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getDayOfMonth()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns the day of the month.\r\n     *\r\n     * @return The day of the month.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getFirstMillisecond()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Returns the first millisecond of the day.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the day.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getLastMillisecond()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the last millisecond of the day.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the day.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.peg(java.util.Calendar)",
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
      "signature": "org.jfree.data.time.Day.previous()",
      "begin_line": 259,
      "end_line": 272,
      "comment": "\r\n     * Returns the day preceding this one.\r\n     *\r\n     * @return The day preceding this one.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 19)",
        "(line 262,col 9)-(line 262,col 48)",
        "(line 263,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.next()",
      "begin_line": 281,
      "end_line": 294,
      "comment": "\r\n     * Returns the day following this one, or \u003ccode\u003enull\u003c/code\u003e if some limit \r\n     * has been reached.\r\n     *\r\n     * @return The day following this one, or \u003ccode\u003enull\u003c/code\u003e if some limit \r\n     *         has been reached.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 19)",
        "(line 284,col 9)-(line 284,col 48)",
        "(line 285,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getSerialIndex()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\r\n     * Returns a serial index number for the day.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 316,
      "end_line": 325,
      "comment": "\r\n     * Returns the first millisecond of the day, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  calendar to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The start of the day as milliseconds since 01-01-1970.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 45)",
        "(line 318,col 9)-(line 318,col 47)",
        "(line 319,col 9)-(line 319,col 50)",
        "(line 320,col 9)-(line 320,col 25)",
        "(line 321,col 9)-(line 321,col 52)",
        "(line 322,col 9)-(line 322,col 46)",
        "(line 324,col 9)-(line 324,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.getLastMillisecond(java.util.Calendar)",
      "begin_line": 338,
      "end_line": 347,
      "comment": "\r\n     * Returns the last millisecond of the day, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  calendar to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The end of the day as milliseconds since 01-01-1970.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 45)",
        "(line 340,col 9)-(line 340,col 47)",
        "(line 341,col 9)-(line 341,col 50)",
        "(line 342,col 9)-(line 342,col 25)",
        "(line 343,col 9)-(line 343,col 55)",
        "(line 344,col 9)-(line 344,col 48)",
        "(line 346,col 9)-(line 346,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.equals(java.lang.Object)",
      "begin_line": 359,
      "end_line": 373,
      "comment": "\r\n     * Tests the equality of this Day object to an arbitrary object.  Returns\r\n     * true if the target is a Day instance or a SerialDate instance\r\n     * representing the same day as this object. In all other cases,\r\n     * returns false.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A flag indicating whether or not an object is equal to this day.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 29)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.hashCode()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.compareTo(java.lang.Object)",
      "begin_line": 398,
      "end_line": 425,
      "comment": "\r\n     * Returns an integer indicating the order of this Day object relative to\r\n     * the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 19)",
        "(line 404,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 423,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.toString()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Returns a string representing the day.\r\n     *\r\n     * @return A string representing the day.\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Day.parseDay(java.lang.String)",
      "begin_line": 447,
      "end_line": 462,
      "comment": "\r\n     * Parses the string argument as a day.\r\n     * \u003cP\u003e\r\n     * This method is required to recognise YYYY-MM-DD as a valid format.\r\n     * Anything else, for now, is a bonus.\r\n     *\r\n     * @param s  the date string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string does not contain any parseable\r\n     *      string, the day otherwise.\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 20)"
      ]
    }
  ]
}