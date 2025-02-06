{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/Quarter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Quarter",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 465,
      "comment": "\r\n * Defines a quarter (in a given year).  The range supported is Q1 1900 to \r\n * Q4 9999.  This class is immutable, which is a requirement for all \r\n * {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_QUARTER"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Constant for quarter 1. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_QUARTER"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Constant for quarter 4. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_MONTH_IN_QUARTER"
      ],
      "begin_line": 84,
      "end_line": 87,
      "comment": " The first month in each quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_MONTH_IN_QUARTER"
      ],
      "begin_line": 90,
      "end_line": 93,
      "comment": " The last month in each quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The year in which the quarter falls. "
    },
    {
      "type": "field",
      "varNames": [
        "quarter"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The quarter (1-4). "
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
      "signature": "org.jfree.data.time.Quarter.Quarter()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Constructs a new Quarter, based on the current system date/time.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(int, int)",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\r\n     * Constructs a new quarter.\r\n     *\r\n     * @param year  the year (1900 to 9999).\r\n     * @param quarter  the quarter (1 to 4).\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 33)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(int, org.jfree.data.time.Year)",
      "begin_line": 135,
      "end_line": 142,
      "comment": "\r\n     * Constructs a new quarter.\r\n     *\r\n     * @param quarter  the quarter (1 to 4).\r\n     * @param year  the year (1900 to 9999).\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 43)",
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 141,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(java.util.Date)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Constructs a new Quarter, based on a date/time and the default time zone.\r\n     *\r\n     * @param time  the date/time.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(java.util.Date, java.util.TimeZone)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\r\n     * Constructs a Quarter, based on a date/time and time zone.\r\n     *\r\n     * @param time  the date/time.\r\n     * @param zone  the zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 55)",
        "(line 161,col 9)-(line 161,col 31)",
        "(line 162,col 9)-(line 162,col 53)",
        "(line 163,col 9)-(line 163,col 67)",
        "(line 164,col 9)-(line 164,col 56)",
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getQuarter()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the quarter.\r\n     *\r\n     * @return The quarter.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getYear()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns the year.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getYearValue()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Returns the year.\r\n     * \r\n     * @return The year.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getFirstMillisecond()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * Returns the first millisecond of the quarter.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the quarter.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getLastMillisecond()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns the last millisecond of the quarter.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the quarter.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.peg(java.util.Calendar)",
      "begin_line": 233,
      "end_line": 236,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 62)",
        "(line 235,col 9)-(line 235,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.previous()",
      "begin_line": 244,
      "end_line": 258,
      "comment": "\r\n     * Returns the quarter preceding this one.\r\n     *\r\n     * @return The quarter preceding this one (or \u003ccode\u003enull\u003c/code\u003e if this is \r\n     *     Q1 1900).\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 23)",
        "(line 246,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.next()",
      "begin_line": 265,
      "end_line": 279,
      "comment": "\r\n     * Returns the quarter following this one.\r\n     *\r\n     * @return The quarter following this one (or null if this is Q4 9999).\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 23)",
        "(line 267,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getSerialIndex()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns a serial index number for the quarter.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.equals(java.lang.Object)",
      "begin_line": 301,
      "end_line": 317,
      "comment": "\r\n     * Tests the equality of this Quarter object to an arbitrary object.\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the target is a Quarter instance \r\n     * representing the same quarter as this object.  In all other cases, \r\n     * returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if quarter and year of this and the object are\r\n     *         the same.\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.hashCode()",
      "begin_line": 328,
      "end_line": 333,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 24)",
        "(line 330,col 9)-(line 330,col 44)",
        "(line 331,col 9)-(line 331,col 41)",
        "(line 332,col 9)-(line 332,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.compareTo(java.lang.Object)",
      "begin_line": 345,
      "end_line": 375,
      "comment": "\r\n     * Returns an integer indicating the order of this Quarter object relative\r\n     * to the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 19)",
        "(line 351,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.toString()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Returns a string representing the quarter (e.g. \"Q1/2002\").\r\n     *\r\n     * @return A string representing the quarter.\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 397,
      "end_line": 404,
      "comment": "\r\n     * Returns the first millisecond in the Quarter, evaluated using the\r\n     * supplied calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond in the Quarter.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 65)",
        "(line 399,col 9)-(line 399,col 55)",
        "(line 400,col 9)-(line 400,col 46)",
        "(line 403,col 9)-(line 403,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getLastMillisecond(java.util.Calendar)",
      "begin_line": 417,
      "end_line": 425,
      "comment": "\r\n     * Returns the last millisecond of the Quarter, evaluated using the\r\n     * supplied calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the Quarter.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 64)",
        "(line 419,col 9)-(line 419,col 62)",
        "(line 420,col 9)-(line 420,col 60)",
        "(line 421,col 9)-(line 421,col 48)",
        "(line 424,col 9)-(line 424,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.parseQuarter(java.lang.String)",
      "begin_line": 436,
      "end_line": 463,
      "comment": "\r\n     * Parses the string argument as a quarter.\r\n     * \u003cP\u003e\r\n     * This method should accept the following formats: \"YYYY-QN\" and \"QN-YYYY\",\r\n     * where the \"-\" can be a space, a forward-slash (/), comma or a dash (-).\r\n     * @param s A string representing the quarter.\r\n     *\r\n     * @return The quarter.\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 31)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 449,col 48)",
        "(line 450,col 9)-(line 450,col 45)",
        "(line 451,col 9)-(line 451,col 78)",
        "(line 454,col 9)-(line 454,col 48)",
        "(line 455,col 9)-(line 455,col 48)",
        "(line 456,col 9)-(line 456,col 48)",
        "(line 459,col 9)-(line 459,col 53)",
        "(line 460,col 9)-(line 460,col 52)",
        "(line 461,col 9)-(line 461,col 22)"
      ]
    }
  ]
}