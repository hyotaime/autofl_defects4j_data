{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/RegularTimePeriod.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RegularTimePeriod",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.TimePeriod",
        "java.lang.Comparable",
        "org.jfree.data.time.MonthConstants"
      ],
      "begin_line": 70,
      "end_line": 282,
      "comment": "\r\n * An abstract class representing a unit of time.  Convenient methods are \r\n * provided for calculating the next and previous time periods.  Conversion \r\n * methods are defined that return the first and last milliseconds of the time \r\n * period.  The results from these methods are timezone dependent.\r\n * \u003cP\u003e\r\n * This class is immutable, and all subclasses should be immutable also.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.createInstance(java.lang.Class, java.util.Date, java.util.TimeZone)",
      "begin_line": 83,
      "end_line": 96,
      "comment": "\r\n     * Creates a time period that includes the specified millisecond, assuming \r\n     * the given time zone.\r\n     * \r\n     * @param c  the time period class.\r\n     * @param millisecond  the time.\r\n     * @param zone  the time zone.\r\n     * \r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 40)",
        "(line 86,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.downsize(java.lang.Class)",
      "begin_line": 106,
      "end_line": 131,
      "comment": "\r\n     * Returns a subclass of {@link RegularTimePeriod} that is smaller than\r\n     * the specified class.\r\n     * \r\n     * @param c  a subclass of {@link RegularTimePeriod}.\r\n     * \r\n     * @return A class.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.previous()",
      "begin_line": 139,
      "end_line": 139,
      "comment": "\r\n     * Returns the time period preceding this one, or \u003ccode\u003enull\u003c/code\u003e if some\r\n     * lower limit has been reached.\r\n     *\r\n     * @return The previous time period (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.next()",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\r\n     * Returns the time period following this one, or \u003ccode\u003enull\u003c/code\u003e if some\r\n     * limit has been reached.\r\n     *\r\n     * @return The next time period (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getSerialIndex()",
      "begin_line": 154,
      "end_line": 154,
      "comment": "\r\n     * Returns a serial index number for the time unit.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIME_ZONE"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " \r\n     * The default time zone. \r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.peg(java.util.Calendar)",
      "begin_line": 171,
      "end_line": 171,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getStart()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\r\n     * Returns the date/time that marks the start of the time period.  This \r\n     * method returns a new \u003ccode\u003eDate\u003c/code\u003e instance every time it is called.\r\n     *\r\n     * @return The start date/time.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getEnd()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Returns the date/time that marks the end of the time period.  This \r\n     * method returns a new \u003ccode\u003eDate\u003c/code\u003e instance every time it is called.\r\n     *\r\n     * @return The end date/time.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getFirstMillisecond()",
      "begin_line": 207,
      "end_line": 207,
      "comment": "\r\n     * Returns the first millisecond of the time period.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the time period.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 222,
      "end_line": 222,
      "comment": "\r\n     * Returns the first millisecond of the time period, evaluated using the \r\n     * supplied calendar (which incorporates a timezone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the time period.\r\n     * \r\n     * @throws NullPointerException if \u003ccode\u003ecalendar,/code\u003e is \r\n     *     \u003c/code\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getLastMillisecond(Calendar)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getLastMillisecond()",
      "begin_line": 234,
      "end_line": 234,
      "comment": "\r\n     * Returns the last millisecond of the time period.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the time period.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getLastMillisecond(java.util.Calendar)",
      "begin_line": 246,
      "end_line": 246,
      "comment": "\r\n     * Returns the last millisecond of the time period, evaluated using the \r\n     * supplied calendar (which incorporates a timezone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the time period.\r\n     * \r\n     * @see #getFirstMillisecond(Calendar)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getMiddleMillisecond()",
      "begin_line": 253,
      "end_line": 257,
      "comment": "\r\n     * Returns the millisecond closest to the middle of the time period.\r\n     *\r\n     * @return The middle millisecond.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 40)",
        "(line 255,col 9)-(line 255,col 39)",
        "(line 256,col 9)-(line 256,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.getMiddleMillisecond(java.util.Calendar)",
      "begin_line": 267,
      "end_line": 271,
      "comment": "\r\n     * Returns the millisecond closest to the middle of the time period,\r\n     * evaluated using the supplied calendar (which incorporates a timezone).\r\n     *\r\n     * @param calendar  the calendar.\r\n     *\r\n     * @return The middle millisecond.\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 48)",
        "(line 269,col 9)-(line 269,col 47)",
        "(line 270,col 9)-(line 270,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.RegularTimePeriod.toString()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Returns a string representation of the time period.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 42)"
      ]
    }
  ]
}