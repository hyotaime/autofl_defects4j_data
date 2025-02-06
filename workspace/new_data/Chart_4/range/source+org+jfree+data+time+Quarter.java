{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/Quarter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Quarter",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 488,
      "comment": "\r\n * Defines a quarter (in a given year).  The range supported is Q1 1900 to\r\n * Q4 9999.  This class is immutable, which is a requirement for all\r\n * {@link RegularTimePeriod} subclasses.\r\n "
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
        "FIRST_QUARTER"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Constant for quarter 1. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_QUARTER"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Constant for quarter 4. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_MONTH_IN_QUARTER"
      ],
      "begin_line": 87,
      "end_line": 90,
      "comment": " The first month in each quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_MONTH_IN_QUARTER"
      ],
      "begin_line": 93,
      "end_line": 96,
      "comment": " The last month in each quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The year in which the quarter falls. "
    },
    {
      "type": "field",
      "varNames": [
        "quarter"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The quarter (1-4). "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Constructs a new Quarter, based on the current system date/time.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(int, int)",
      "begin_line": 123,
      "end_line": 130,
      "comment": "\r\n     * Constructs a new quarter.\r\n     *\r\n     * @param year  the year (1900 to 9999).\r\n     * @param quarter  the quarter (1 to 4).\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 38)",
        "(line 129,col 9)-(line 129,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(int, org.jfree.data.time.Year)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\r\n     * Constructs a new quarter.\r\n     *\r\n     * @param quarter  the quarter (1 to 4).\r\n     * @param year  the year (1900 to 9999).\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 43)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 144,col 9)-(line 144,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(java.util.Date)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Constructs a new instance, based on a date/time and the default time\r\n     * zone.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #Quarter(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(java.util.Date, java.util.TimeZone)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Constructs a Quarter, based on a date/time and time zone.\r\n     *\r\n     * @param time  the date/time.\r\n     * @param zone  the zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @deprecated Since 1.0.12, use {@link #Quarter(Date, TimeZone, Locale)}\r\n     *     instead.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Quarter.Quarter(java.util.Date, java.util.TimeZone, java.util.Locale)",
      "begin_line": 182,
      "end_line": 189,
      "comment": "\r\n     * Creates a new \u003ccode\u003eQuarter\u003c/code\u003e instance, using the specified\r\n     * zone and locale.\r\n     *\r\n     * @param time  the current time.\r\n     * @param zone  the time zone.\r\n     * @param locale  the locale.\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 63)",
        "(line 184,col 9)-(line 184,col 31)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 186,col 9)-(line 186,col 67)",
        "(line 187,col 9)-(line 187,col 56)",
        "(line 188,col 9)-(line 188,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getQuarter()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the quarter.\r\n     *\r\n     * @return The quarter.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getYear()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the year.\r\n     *\r\n     * @return The year.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getYearValue()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Returns the year.\r\n     *\r\n     * @return The year.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getFirstMillisecond()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Returns the first millisecond of the quarter.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the quarter.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getLastMillisecond()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\r\n     * Returns the last millisecond of the quarter.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the quarter.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.peg(java.util.Calendar)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 62)",
        "(line 258,col 9)-(line 258,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.previous()",
      "begin_line": 267,
      "end_line": 281,
      "comment": "\r\n     * Returns the quarter preceding this one.\r\n     *\r\n     * @return The quarter preceding this one (or \u003ccode\u003enull\u003c/code\u003e if this is\r\n     *     Q1 1900).\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 23)",
        "(line 269,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.next()",
      "begin_line": 288,
      "end_line": 302,
      "comment": "\r\n     * Returns the quarter following this one.\r\n     *\r\n     * @return The quarter following this one (or null if this is Q4 9999).\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 23)",
        "(line 290,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getSerialIndex()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\r\n     * Returns a serial index number for the quarter.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.equals(java.lang.Object)",
      "begin_line": 324,
      "end_line": 340,
      "comment": "\r\n     * Tests the equality of this Quarter object to an arbitrary object.\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the target is a Quarter instance\r\n     * representing the same quarter as this object.  In all other cases,\r\n     * returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if quarter and year of this and the object are\r\n     *         the same.\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 338,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.hashCode()",
      "begin_line": 351,
      "end_line": 356,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 24)",
        "(line 353,col 9)-(line 353,col 44)",
        "(line 354,col 9)-(line 354,col 41)",
        "(line 355,col 9)-(line 355,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.compareTo(java.lang.Object)",
      "begin_line": 368,
      "end_line": 398,
      "comment": "\r\n     * Returns an integer indicating the order of this Quarter object relative\r\n     * to the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 19)",
        "(line 374,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.toString()",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\r\n     * Returns a string representing the quarter (e.g. \"Q1/2002\").\r\n     *\r\n     * @return A string representing the quarter.\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 420,
      "end_line": 427,
      "comment": "\r\n     * Returns the first millisecond in the Quarter, evaluated using the\r\n     * supplied calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond in the Quarter.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 65)",
        "(line 422,col 9)-(line 422,col 55)",
        "(line 423,col 9)-(line 423,col 46)",
        "(line 426,col 9)-(line 426,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.getLastMillisecond(java.util.Calendar)",
      "begin_line": 440,
      "end_line": 448,
      "comment": "\r\n     * Returns the last millisecond of the Quarter, evaluated using the\r\n     * supplied calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the Quarter.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 64)",
        "(line 442,col 9)-(line 442,col 62)",
        "(line 443,col 9)-(line 443,col 60)",
        "(line 444,col 9)-(line 444,col 48)",
        "(line 447,col 9)-(line 447,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Quarter.parseQuarter(java.lang.String)",
      "begin_line": 459,
      "end_line": 486,
      "comment": "\r\n     * Parses the string argument as a quarter.\r\n     * \u003cP\u003e\r\n     * This method should accept the following formats: \"YYYY-QN\" and \"QN-YYYY\",\r\n     * where the \"-\" can be a space, a forward-slash (/), comma or a dash (-).\r\n     * @param s A string representing the quarter.\r\n     *\r\n     * @return The quarter.\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 31)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 48)",
        "(line 473,col 9)-(line 473,col 45)",
        "(line 474,col 9)-(line 474,col 78)",
        "(line 477,col 9)-(line 477,col 48)",
        "(line 478,col 9)-(line 478,col 48)",
        "(line 479,col 9)-(line 479,col 48)",
        "(line 482,col 9)-(line 482,col 53)",
        "(line 483,col 9)-(line 483,col 52)",
        "(line 484,col 9)-(line 484,col 22)"
      ]
    }
  ]
}