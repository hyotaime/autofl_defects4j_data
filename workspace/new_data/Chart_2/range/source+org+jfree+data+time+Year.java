{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/Year.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Year",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 410,
      "comment": "\r\n * Represents a year in the range -9999 to 9999.  This class is immutable,\r\n * which is a requirement for all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_YEAR"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\r\n     * The minimum year value.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMUM_YEAR"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\r\n     * The maximum year value.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The year. "
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
      "signature": "org.jfree.data.time.Year.Year()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Creates a new \u003ccode\u003eYear\u003c/code\u003e, based on the current system date/time.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Year.Year(int)",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\r\n     * Creates a time period representing a single year.\r\n     *\r\n     * @param year  the year.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 120,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Year.Year(java.util.Date)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Creates a new \u003ccode\u003eYear\u003c/code\u003e, based on a particular instant in time,\r\n     * using the default time zone.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #Year(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Year.Year(java.util.Date, java.util.TimeZone)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Constructs a year, based on a particular instant in time and a time zone.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone.\r\n     *\r\n     * @deprecated Since 1.0.12, use {@link #Year(Date, TimeZone, Locale)}\r\n     *     instead.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Year.Year(java.util.Date, java.util.TimeZone, java.util.Locale)",
      "begin_line": 158,
      "end_line": 163,
      "comment": "\r\n     * Creates a new \u003ccode\u003eYear\u003c/code\u003e instance, for the specified time zone\r\n     * and locale.\r\n     *\r\n     * @param time  the current time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone.\r\n     * @param locale  the locale.\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 63)",
        "(line 160,col 9)-(line 160,col 31)",
        "(line 161,col 9)-(line 161,col 56)",
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getYear()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\r\n     * Returns the year.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getFirstMillisecond()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the first millisecond of the year.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the year.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getLastMillisecond()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the last millisecond of the year.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the year.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.peg(java.util.Calendar)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 62)",
        "(line 212,col 9)-(line 212,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.previous()",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\r\n     * Returns the year preceding this one.\r\n     *\r\n     * @return The year preceding this one (or \u003ccode\u003enull\u003c/code\u003e if the\r\n     *         current year is -9999).\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.next()",
      "begin_line": 236,
      "end_line": 243,
      "comment": "\r\n     * Returns the year following this one.\r\n     *\r\n     * @return The year following this one (or \u003ccode\u003enull\u003c/code\u003e if the current\r\n     *         year is 9999).\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getSerialIndex()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns a serial index number for the year.\r\n     * \u003cP\u003e\r\n     * The implementation simply returns the year number (e.g. 2002).\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 267,
      "end_line": 273,
      "comment": "\r\n     * Returns the first millisecond of the year, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the year.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 62)",
        "(line 269,col 9)-(line 269,col 46)",
        "(line 272,col 9)-(line 272,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getLastMillisecond(java.util.Calendar)",
      "begin_line": 286,
      "end_line": 292,
      "comment": "\r\n     * Returns the last millisecond of the year, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the year.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 67)",
        "(line 288,col 9)-(line 288,col 48)",
        "(line 291,col 9)-(line 291,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.equals(java.lang.Object)",
      "begin_line": 305,
      "end_line": 314,
      "comment": "\r\n     * Tests the equality of this \u003ccode\u003eYear\u003c/code\u003e object to an arbitrary\r\n     * object.  Returns \u003ccode\u003etrue\u003c/code\u003e if the target is a \u003ccode\u003eYear\u003c/code\u003e\r\n     * instance representing the same year as this object.  In all other cases,\r\n     * returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the year of this and the object are the\r\n     *         same.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 31)",
        "(line 313,col 9)-(line 313,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.hashCode()",
      "begin_line": 325,
      "end_line": 330,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     *     /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 24)",
        "(line 327,col 9)-(line 327,col 26)",
        "(line 328,col 9)-(line 328,col 33)",
        "(line 329,col 9)-(line 329,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.compareTo(java.lang.Object)",
      "begin_line": 342,
      "end_line": 369,
      "comment": "\r\n     * Returns an integer indicating the order of this \u003ccode\u003eYear\u003c/code\u003e object\r\n     * relative to the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 19)",
        "(line 348,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.toString()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\r\n     * Returns a string representing the year..\r\n     *\r\n     * @return A string representing the year.\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.parseYear(java.lang.String)",
      "begin_line": 390,
      "end_line": 408,
      "comment": "\r\n     * Parses the string argument as a year.\r\n     * \u003cP\u003e\r\n     * The string format is YYYY.\r\n     *\r\n     * @param s  a string representing the year.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the year\r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 14)",
        "(line 394,col 9)-(line 399,col 9)",
        "(line 402,col 9)-(line 407,col 9)"
      ]
    }
  ]
}