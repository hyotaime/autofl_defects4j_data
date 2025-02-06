{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/SerialDate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerialDate",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable",
        "org.jfree.data.time.MonthConstants"
      ],
      "begin_line": 83,
      "end_line": 1032,
      "comment": "\n *  An abstract class that defines our requirements for manipulating dates,\n *  without tying down a particular implementation.\n *  \u003cP\u003e\n *  Requirement 1 : match at least what Excel does for dates;\n *  Requirement 2 : the date represented by the class is immutable;\n *  \u003cP\u003e\n *  Why not just use java.util.Date?  We will, when it makes sense.  At times,\n *  java.util.Date can be *too* precise - it represents an instant in time,\n *  accurate to 1/1000th of a second (with the date itself depending on the\n *  time-zone).  Sometimes we just want to represent a particular day (e.g. 21\n *  January 2015) without concerning ourselves about the time of day, or the\n *  time-zone, or anything else.  That\u0027s what we\u0027ve defined SerialDate for.\n *  \u003cP\u003e\n *  You can call getInstance() to get a concrete subclass of SerialDate,\n *  without worrying about the exact implementation.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT_SYMBOLS"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": " Date format symbols. "
    },
    {
      "type": "field",
      "varNames": [
        "SERIAL_LOWER_BOUND"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The serial number for 1 January 1900. "
    },
    {
      "type": "field",
      "varNames": [
        "SERIAL_UPPER_BOUND"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The serial number for 31 December 9999. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_YEAR_SUPPORTED"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The lowest year value supported by this date format. "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMUM_YEAR_SUPPORTED"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The highest year value supported by this date format. "
    },
    {
      "type": "field",
      "varNames": [
        "MONDAY"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Useful constant for Monday. Equivalent to java.util.Calendar.MONDAY. "
    },
    {
      "type": "field",
      "varNames": [
        "TUESDAY"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Useful constant for Tuesday. Equivalent to java.util.Calendar.TUESDAY.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "WEDNESDAY"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Useful constant for Wednesday. Equivalent to\n     * java.util.Calendar.WEDNESDAY.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THURSDAY"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Useful constant for Thrusday. Equivalent to java.util.Calendar.THURSDAY.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FRIDAY"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Useful constant for Friday. Equivalent to java.util.Calendar.FRIDAY. "
    },
    {
      "type": "field",
      "varNames": [
        "SATURDAY"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Useful constant for Saturday. Equivalent to java.util.Calendar.SATURDAY.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SUNDAY"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Useful constant for Sunday. Equivalent to java.util.Calendar.SUNDAY. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_DAY_OF_MONTH"
      ],
      "begin_line": 137,
      "end_line": 138,
      "comment": " The number of days in each month in non leap years. "
    },
    {
      "type": "field",
      "varNames": [
        "AGGREGATE_DAYS_TO_END_OF_MONTH"
      ],
      "begin_line": 141,
      "end_line": 142,
      "comment": " The number of days in a (non-leap) year up to the end of each month. "
    },
    {
      "type": "field",
      "varNames": [
        "AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH"
      ],
      "begin_line": 145,
      "end_line": 146,
      "comment": " The number of days in a year up to the end of the preceding month. "
    },
    {
      "type": "field",
      "varNames": [
        "LEAP_YEAR_AGGREGATE_DAYS_TO_END_OF_MONTH"
      ],
      "begin_line": 149,
      "end_line": 150,
      "comment": " The number of days in a leap year up to the end of each month. "
    },
    {
      "type": "field",
      "varNames": [
        "LEAP_YEAR_AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH"
      ],
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * The number of days in a leap year up to the end of the preceding month.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_WEEK_IN_MONTH"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " A useful constant for referring to the first week in a month. "
    },
    {
      "type": "field",
      "varNames": [
        "SECOND_WEEK_IN_MONTH"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " A useful constant for referring to the second week in a month. "
    },
    {
      "type": "field",
      "varNames": [
        "THIRD_WEEK_IN_MONTH"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " A useful constant for referring to the third week in a month. "
    },
    {
      "type": "field",
      "varNames": [
        "FOURTH_WEEK_IN_MONTH"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " A useful constant for referring to the fourth week in a month. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_WEEK_IN_MONTH"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " A useful constant for referring to the last week in a month. "
    },
    {
      "type": "field",
      "varNames": [
        "INCLUDE_NONE"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Useful range constant. "
    },
    {
      "type": "field",
      "varNames": [
        "INCLUDE_FIRST"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Useful range constant. "
    },
    {
      "type": "field",
      "varNames": [
        "INCLUDE_SECOND"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " Useful range constant. "
    },
    {
      "type": "field",
      "varNames": [
        "INCLUDE_BOTH"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Useful range constant. "
    },
    {
      "type": "field",
      "varNames": [
        "PRECEDING"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n     * Useful constant for specifying a day of the week relative to a fixed\n     * date.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NEAREST"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * Useful constant for specifying a day of the week relative to a fixed\n     * date.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOLLOWING"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n     * Useful constant for specifying a day of the week relative to a fixed\n     * date.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " A description for the date. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.SerialDate.SerialDate()",
      "begin_line": 210,
      "end_line": 211,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isValidWeekdayCode(int)",
      "begin_line": 222,
      "end_line": 237,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the supplied integer code represents a\n     * valid day-of-the-week, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param code  the code being checked for validity.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the supplied integer code represents a\n     *         valid day-of-the-week, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.stringToWeekdayCode(java.lang.String)",
      "begin_line": 247,
      "end_line": 267,
      "comment": "\n     * Converts the supplied string to a day of the week.\n     *\n     * @param s  a string representing the day of the week.\n     *\n     * @return \u003ccode\u003e-1\u003c/code\u003e if the string is not convertable, the day of\n     *         the week otherwise.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 250,col 53)",
        "(line 251,col 9)-(line 251,col 72)",
        "(line 253,col 9)-(line 253,col 24)",
        "(line 254,col 9)-(line 254,col 21)",
        "(line 255,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.weekdayCodeToString(int)",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\n     * Returns a string representing the supplied day-of-the-week.\n     * \u003cP\u003e\n     * Need to find a better approach.\n     *\n     * @param weekday  the day of the week.\n     *\n     * @return a string representing the supplied day-of-the-week.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 68)",
        "(line 281,col 9)-(line 281,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getMonths()",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\n     * Returns an array of month names.\n     *\n     * @return an array of month names.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getMonths(boolean)",
      "begin_line": 304,
      "end_line": 313,
      "comment": "\n     * Returns an array of month names.\n     *\n     * @param shortened  a flag indicating that shortened month names should\n     *                   be returned.\n     *\n     * @return an array of month names.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isValidMonthCode(int)",
      "begin_line": 323,
      "end_line": 343,
      "comment": "\n     * Returns true if the supplied integer code represents a valid month.\n     *\n     * @param code  the code being checked for validity.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the supplied integer code represents a\n     *         valid month.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.monthCodeToQuarter(int)",
      "begin_line": 352,
      "end_line": 371,
      "comment": "\n     * Returns the quarter for the specified month.\n     *\n     * @param code  the month code (1-12).\n     *\n     * @return the quarter that the month belongs to.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.monthCodeToString(int)",
      "begin_line": 383,
      "end_line": 387,
      "comment": "\n     * Returns a string representing the supplied month.\n     * \u003cP\u003e\n     * The string returned is the long form of the month name taken from the\n     * default locale.\n     *\n     * @param month  the month.\n     *\n     * @return a string representing the supplied month.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.monthCodeToString(int, boolean)",
      "begin_line": 401,
      "end_line": 421,
      "comment": "\n     * Returns a string representing the supplied month.\n     * \u003cP\u003e\n     * The string returned is the long or short form of the month name taken\n     * from the default locale.\n     *\n     * @param month  the month.\n     * @param shortened  if \u003ccode\u003etrue\u003c/code\u003e return the abbreviation of the\n     *                   month.\n     *\n     * @return a string representing the supplied month.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 410,col 30)",
        "(line 412,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 419,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.stringToMonthCode(java.lang.String)",
      "begin_line": 435,
      "end_line": 467,
      "comment": "\n     * Converts a string to a month code.\n     * \u003cP\u003e\n     * This method will return one of the constants JANUARY, FEBRUARY, ...,\n     * DECEMBER that corresponds to the string.  If the string is not\n     * recognised, this method returns -1.\n     *\n     * @param s  the string to parse.\n     *\n     * @return \u003ccode\u003e-1\u003c/code\u003e if the string is not parseable, the month of the\n     *         year otherwise.\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 78)",
        "(line 438,col 9)-(line 438,col 68)",
        "(line 440,col 9)-(line 440,col 24)",
        "(line 441,col 9)-(line 441,col 21)",
        "(line 444,col 9)-(line 449,col 9)",
        "(line 452,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 465,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isValidWeekInMonthCode(int)",
      "begin_line": 477,
      "end_line": 488,
      "comment": "\n     * Returns true if the supplied integer code represents a valid\n     * week-in-the-month, and false otherwise.\n     *\n     * @param code  the code being checked for validity.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the supplied integer code represents a\n     *         valid week-in-the-month.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isLeapYear(int)",
      "begin_line": 497,
      "end_line": 512,
      "comment": "\n     * Determines whether or not the specified year is a leap year.\n     *\n     * @param yyyy  the year (in the range 1900 to 9999).\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified year is a leap year.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.leapYearCount(int)",
      "begin_line": 524,
      "end_line": 531,
      "comment": "\n     * Returns the number of leap years from 1900 to the specified year\n     * INCLUSIVE.\n     * \u003cP\u003e\n     * Note that 1900 is not a leap year.\n     *\n     * @param yyyy  the year (in the range 1900 to 9999).\n     *\n     * @return the number of leap years from 1900 to the specified year.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 44)",
        "(line 527,col 9)-(line 527,col 48)",
        "(line 528,col 9)-(line 528,col 48)",
        "(line 529,col 9)-(line 529,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.lastDayOfMonth(int, int)",
      "begin_line": 542,
      "end_line": 555,
      "comment": "\n     * Returns the number of the last day of the month, taking into account\n     * leap years.\n     *\n     * @param month  the month.\n     * @param yyyy  the year (in the range 1900 to 9999).\n     *\n     * @return the number of the last day of the month.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 52)",
        "(line 545,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.addDays(int, org.jfree.data.time.SerialDate)",
      "begin_line": 566,
      "end_line": 571,
      "comment": "\n     * Creates a new date by adding the specified number of days to the base\n     * date.\n     *\n     * @param days  the number of days to add (can be negative).\n     * @param base  the base date.\n     *\n     * @return a new date.\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 59)",
        "(line 569,col 9)-(line 569,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.addMonths(int, org.jfree.data.time.SerialDate)",
      "begin_line": 585,
      "end_line": 597,
      "comment": "\n     * Creates a new date by adding the specified number of months to the base\n     * date.\n     * \u003cP\u003e\n     * If the base date is close to the end of the month, the day on the result\n     * may be adjusted slightly:  31 May + 1 month \u003d 30 June.\n     *\n     * @param months  the number of months to add (can be negative).\n     * @param base  the base date.\n     *\n     * @return a new date.\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 589,col 28)",
        "(line 590,col 9)-(line 591,col 32)",
        "(line 592,col 9)-(line 594,col 10)",
        "(line 595,col 9)-(line 595,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.addYears(int, org.jfree.data.time.SerialDate)",
      "begin_line": 608,
      "end_line": 621,
      "comment": "\n     * Creates a new date by adding the specified number of years to the base\n     * date.\n     *\n     * @param years  the number of years to add (can be negative).\n     * @param base  the base date.\n     *\n     * @return A new date.\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 41)",
        "(line 611,col 9)-(line 611,col 42)",
        "(line 612,col 9)-(line 612,col 47)",
        "(line 614,col 9)-(line 614,col 42)",
        "(line 615,col 9)-(line 617,col 10)",
        "(line 619,col 9)-(line 619,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getPreviousDayOfWeek(int, org.jfree.data.time.SerialDate)",
      "begin_line": 633,
      "end_line": 655,
      "comment": "\n     * Returns the latest date that falls on the specified day-of-the-week and\n     * is BEFORE the base date.\n     *\n     * @param targetWeekday  a code for the target day-of-the-week.\n     * @param base  the base date.\n     *\n     * @return the latest date that falls on the specified day-of-the-week and\n     *         is BEFORE the base date.\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 641,col 9)",
        "(line 644,col 9)-(line 644,col 25)",
        "(line 645,col 9)-(line 645,col 48)",
        "(line 646,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 653,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getFollowingDayOfWeek(int, org.jfree.data.time.SerialDate)",
      "begin_line": 667,
      "end_line": 688,
      "comment": "\n     * Returns the earliest date that falls on the specified day-of-the-week\n     * and is AFTER the base date.\n     *\n     * @param targetWeekday  a code for the target day-of-the-week.\n     * @param base  the base date.\n     *\n     * @return the earliest date that falls on the specified day-of-the-week\n     *         and is AFTER the base date.\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 675,col 9)",
        "(line 678,col 9)-(line 678,col 25)",
        "(line 679,col 9)-(line 679,col 48)",
        "(line 680,col 9)-(line 685,col 9)",
        "(line 687,col 9)-(line 687,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getNearestDayOfWeek(int, org.jfree.data.time.SerialDate)",
      "begin_line": 700,
      "end_line": 721,
      "comment": "\n     * Returns the date that falls on the specified day-of-the-week and is\n     * CLOSEST to the base date.\n     *\n     * @param targetDOW  a code for the target day-of-the-week.\n     * @param base  the base date.\n     *\n     * @return the date that falls on the specified day-of-the-week and is\n     *         CLOSEST to the base date.\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 708,col 9)",
        "(line 711,col 9)-(line 711,col 48)",
        "(line 712,col 9)-(line 712,col 52)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getEndOfCurrentMonth(org.jfree.data.time.SerialDate)",
      "begin_line": 730,
      "end_line": 735,
      "comment": "\n     * Rolls the date forward to the last day of the month.\n     *\n     * @param base  the base date.\n     *\n     * @return a new serial date.\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 733,col 10)",
        "(line 734,col 9)-(line 734,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.weekInMonthToString(int)",
      "begin_line": 746,
      "end_line": 758,
      "comment": "\n     * Returns a string corresponding to the week-in-the-month code.\n     * \u003cP\u003e\n     * Need to find a better approach.\n     *\n     * @param count  an integer code representing the week-in-the-month.\n     *\n     * @return a string corresponding to the week-in-the-month code.\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 756,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.relativeToString(int)",
      "begin_line": 769,
      "end_line": 778,
      "comment": "\n     * Returns a string representing the supplied \u0027relative\u0027.\n     * \u003cP\u003e\n     * Need to find a better approach.\n     *\n     * @param relative  a constant representing the \u0027relative\u0027.\n     *\n     * @return a string representing the supplied \u0027relative\u0027.\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 776,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.createInstance(int, int, int)",
      "begin_line": 790,
      "end_line": 793,
      "comment": "\n     * Factory method that returns an instance of some concrete subclass of\n     * {@link SerialDate}.\n     *\n     * @param day  the day (1-31).\n     * @param month  the month (1-12).\n     * @param yyyy  the year (in the range 1900 to 9999).\n     *\n     * @return An instance of {@link SerialDate}.\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.createInstance(int)",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\n     * Factory method that returns an instance of some concrete subclass of\n     * {@link SerialDate}.\n     *\n     * @param serial  the serial number for the day (1 January 1900 \u003d 2).\n     *\n     * @return a instance of SerialDate.\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.createInstance(java.util.Date)",
      "begin_line": 814,
      "end_line": 822,
      "comment": "\n     * Factory method that returns an instance of a subclass of SerialDate.\n     *\n     * @param date  A Java date object.\n     *\n     * @return a instance of SerialDate.\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 67)",
        "(line 817,col 9)-(line 817,col 31)",
        "(line 818,col 9)-(line 820,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.toSerial()",
      "begin_line": 831,
      "end_line": 831,
      "comment": "\n     * Returns the serial number for the date, where 1 January 1900 \u003d 2 (this\n     * corresponds, almost, to the numbering system used in Microsoft Excel for\n     * Windows and Lotus 1-2-3).\n     *\n     * @return the serial number for the date.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.toDate()",
      "begin_line": 839,
      "end_line": 839,
      "comment": "\n     * Returns a java.util.Date.  Since java.util.Date has more precision than\n     * SerialDate, we need to define a convention for the \u0027time of day\u0027.\n     *\n     * @return this as \u003ccode\u003ejava.util.Date\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getDescription()",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n     * Returns the description that is attached to the date.  It is not\n     * required that a date have a description, but for some applications it\n     * is useful.\n     *\n     * @return The description (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.setDescription(java.lang.String)",
      "begin_line": 858,
      "end_line": 860,
      "comment": "\n     * Sets the description for the date.\n     *\n     * @param description  the description for this date (\u003ccode\u003enull\u003c/code\u003e\n     *                     permitted).\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.toString()",
      "begin_line": 867,
      "end_line": 870,
      "comment": "\n     * Converts the date to a string.\n     *\n     * @return  a string representation of the date.\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 869,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getYYYY()",
      "begin_line": 877,
      "end_line": 877,
      "comment": "\n     * Returns the year (assume a valid range of 1900 to 9999).\n     *\n     * @return the year.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getMonth()",
      "begin_line": 884,
      "end_line": 884,
      "comment": "\n     * Returns the month (January \u003d 1, February \u003d 2, March \u003d 3).\n     *\n     * @return the month of the year.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getDayOfMonth()",
      "begin_line": 891,
      "end_line": 891,
      "comment": "\n     * Returns the day of the month.\n     *\n     * @return the day of the month.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getDayOfWeek()",
      "begin_line": 898,
      "end_line": 898,
      "comment": "\n     * Returns the day of the week.\n     *\n     * @return the day of the week.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.compare(org.jfree.data.time.SerialDate)",
      "begin_line": 911,
      "end_line": 911,
      "comment": "\n     * Returns the difference (in days) between this date and the specified\n     * \u0027other\u0027 date.\n     * \u003cP\u003e\n     * The result is positive if this date is after the \u0027other\u0027 date and\n     * negative if it is before the \u0027other\u0027 date.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return the difference between this and the other date.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isOn(org.jfree.data.time.SerialDate)",
      "begin_line": 922,
      "end_line": 922,
      "comment": "\n     * Returns true if this SerialDate represents the same date as the\n     * specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents the same date as\n     *         the specified SerialDate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isBefore(org.jfree.data.time.SerialDate)",
      "begin_line": 933,
      "end_line": 933,
      "comment": "\n     * Returns true if this SerialDate represents an earlier date compared to\n     * the specified SerialDate.\n     *\n     * @param other  The date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents an earlier date\n     *         compared to the specified SerialDate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isOnOrBefore(org.jfree.data.time.SerialDate)",
      "begin_line": 944,
      "end_line": 944,
      "comment": "\n     * Returns true if this SerialDate represents the same date as the\n     * specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003ccode\u003e if this SerialDate represents the same date\n     *         as the specified SerialDate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isAfter(org.jfree.data.time.SerialDate)",
      "begin_line": 955,
      "end_line": 955,
      "comment": "\n     * Returns true if this SerialDate represents the same date as the\n     * specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents the same date\n     *         as the specified SerialDate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isOnOrAfter(org.jfree.data.time.SerialDate)",
      "begin_line": 966,
      "end_line": 966,
      "comment": "\n     * Returns true if this SerialDate represents the same date as the\n     * specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents the same date\n     *         as the specified SerialDate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isInRange(org.jfree.data.time.SerialDate, org.jfree.data.time.SerialDate)",
      "begin_line": 978,
      "end_line": 978,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this {@link SerialDate} is within the\n     * specified range (INCLUSIVE).  The date order of d1 and d2 is not\n     * important.\n     *\n     * @param d1  a boundary date for the range.\n     * @param d2  the other boundary date for the range.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.isInRange(org.jfree.data.time.SerialDate, org.jfree.data.time.SerialDate, int)",
      "begin_line": 992,
      "end_line": 993,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this {@link SerialDate} is within the\n     * specified range (caller specifies whether or not the end-points are\n     * included).  The date order of d1 and d2 is not important.\n     *\n     * @param d1  a boundary date for the range.\n     * @param d2  the other boundary date for the range.\n     * @param include  a code that controls whether or not the start and end\n     *                 dates are included in the range.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getPreviousDayOfWeek(int)",
      "begin_line": 1004,
      "end_line": 1006,
      "comment": "\n     * Returns the latest date that falls on the specified day-of-the-week and\n     * is BEFORE this date.\n     *\n     * @param targetDOW  a code for the target day-of-the-week.\n     *\n     * @return the latest date that falls on the specified day-of-the-week and\n     *         is BEFORE this date.\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getFollowingDayOfWeek(int)",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\n     * Returns the earliest date that falls on the specified day-of-the-week\n     * and is AFTER this date.\n     *\n     * @param targetDOW  a code for the target day-of-the-week.\n     *\n     * @return the earliest date that falls on the specified day-of-the-week\n     *         and is AFTER this date.\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SerialDate.getNearestDayOfWeek(int)",
      "begin_line": 1028,
      "end_line": 1030,
      "comment": "\n     * Returns the nearest date that falls on the specified day-of-the-week.\n     *\n     * @param targetDOW  a code for the target day-of-the-week.\n     *\n     * @return the nearest date that falls on the specified day-of-the-week.\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 52)"
      ]
    }
  ]
}