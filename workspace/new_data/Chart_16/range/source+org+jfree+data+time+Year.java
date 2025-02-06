{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/Year.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Year",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 379,
      "comment": "\r\n * Represents a year in the range 1900 to 9999.  This class is immutable, which\r\n * is a requirement for all {@link RegularTimePeriod} subclasses.\r\n "
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
        "year"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The year. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Year.Year()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Creates a new \u003ccode\u003eYear\u003c/code\u003e, based on the current system date/time.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Year.Year(int)",
      "begin_line": 96,
      "end_line": 105,
      "comment": "\r\n     * Creates a time period representing a single year.\r\n     *\r\n     * @param year  the year.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Year.Year(java.util.Date)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Creates a new \u003ccode\u003eYear\u003c/code\u003e, based on a particular instant in time, \r\n     * using the default time zone.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Year.Year(java.util.Date, java.util.TimeZone)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\r\n     * Constructs a year, based on a particular instant in time and a time zone.\r\n     *\r\n     * @param time  the time.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 55)",
        "(line 125,col 9)-(line 125,col 31)",
        "(line 126,col 9)-(line 126,col 56)",
        "(line 127,col 9)-(line 127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getYear()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the year.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getFirstMillisecond()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the first millisecond of the year.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the year.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getLastMillisecond()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns the last millisecond of the year.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the year.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.peg(java.util.Calendar)",
      "begin_line": 175,
      "end_line": 178,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 62)",
        "(line 177,col 9)-(line 177,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.previous()",
      "begin_line": 186,
      "end_line": 193,
      "comment": "\r\n     * Returns the year preceding this one.\r\n     *\r\n     * @return The year preceding this one (or \u003ccode\u003enull\u003c/code\u003e if the \r\n     *         current year is 1900).\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.next()",
      "begin_line": 201,
      "end_line": 208,
      "comment": "\r\n     * Returns the year following this one.\r\n     *\r\n     * @return The year following this one (or \u003ccode\u003enull\u003c/code\u003e if the current\r\n     *         year is 9999).\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getSerialIndex()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Returns a serial index number for the year.\r\n     * \u003cP\u003e\r\n     * The implementation simply returns the year number (e.g. 2002).\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 232,
      "end_line": 238,
      "comment": "\r\n     * Returns the first millisecond of the year, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the year.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 62)",
        "(line 234,col 9)-(line 234,col 46)",
        "(line 237,col 9)-(line 237,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.getLastMillisecond(java.util.Calendar)",
      "begin_line": 251,
      "end_line": 257,
      "comment": "\r\n     * Returns the last millisecond of the year, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the year.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 67)",
        "(line 253,col 9)-(line 253,col 48)",
        "(line 256,col 9)-(line 256,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.equals(java.lang.Object)",
      "begin_line": 270,
      "end_line": 283,
      "comment": "\r\n     * Tests the equality of this \u003ccode\u003eYear\u003c/code\u003e object to an arbitrary \r\n     * object.  Returns \u003ccode\u003etrue\u003c/code\u003e if the target is a \u003ccode\u003eYear\u003c/code\u003e\r\n     * instance representing the same year as this object.  In all other cases,\r\n     * returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param object  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the year of this and the object are the \r\n     *         same.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.hashCode()",
      "begin_line": 294,
      "end_line": 299,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     *     /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 24)",
        "(line 296,col 9)-(line 296,col 26)",
        "(line 297,col 9)-(line 297,col 33)",
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.compareTo(java.lang.Object)",
      "begin_line": 311,
      "end_line": 338,
      "comment": "\r\n     * Returns an integer indicating the order of this \u003ccode\u003eYear\u003c/code\u003e object\r\n     * relative to the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 19)",
        "(line 317,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.toString()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Returns a string representing the year..\r\n     *\r\n     * @return A string representing the year.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Year.parseYear(java.lang.String)",
      "begin_line": 359,
      "end_line": 377,
      "comment": "\r\n     * Parses the string argument as a year.\r\n     * \u003cP\u003e\r\n     * The string format is YYYY.\r\n     *\r\n     * @param s  a string representing the year.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the year \r\n     *         otherwise.\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 14)",
        "(line 363,col 9)-(line 368,col 9)",
        "(line 371,col 9)-(line 376,col 9)"
      ]
    }
  ]
}