{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/DateTickUnit.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateTickUnit",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.TickUnit",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 437,
      "comment": "\r\n * A tick unit for use by subclasses of {@link DateAxis}. Instances of this \r\n * class are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "YEAR"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " A constant for years. "
    },
    {
      "type": "field",
      "varNames": [
        "MONTH"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " A constant for months. "
    },
    {
      "type": "field",
      "varNames": [
        "DAY"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " A constant for days. "
    },
    {
      "type": "field",
      "varNames": [
        "HOUR"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " A constant for hours. "
    },
    {
      "type": "field",
      "varNames": [
        "MINUTE"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " A constant for minutes. "
    },
    {
      "type": "field",
      "varNames": [
        "SECOND"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " A constant for seconds. "
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECOND"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " A constant for milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "unit"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The unit. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The unit count. "
    },
    {
      "type": "field",
      "varNames": [
        "rollUnit"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The roll unit. "
    },
    {
      "type": "field",
      "varNames": [
        "rollCount"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The roll count. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The date formatter. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTickUnit.DateTickUnit(int, int)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Creates a new date tick unit.  The dates will be formatted using a \r\n     * SHORT format for the default locale.\r\n     *\r\n     * @param unit  the unit.\r\n     * @param count  the unit count.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTickUnit.DateTickUnit(int, int, java.text.DateFormat)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\r\n     * Creates a new date tick unit.  You can specify the units using one of \r\n     * the constants YEAR, MONTH, DAY, HOUR, MINUTE, SECOND or MILLISECOND.  \r\n     * In addition, you can specify a unit count, and a date format.\r\n     *\r\n     * @param unit  the unit.\r\n     * @param count  the unit count.\r\n     * @param formatter  the date formatter (defaults to DateFormat.SHORT).\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTickUnit.DateTickUnit(int, int, int, int, java.text.DateFormat)",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\r\n     * Creates a new unit.\r\n     *\r\n     * @param unit  the unit.\r\n     * @param count  the count.\r\n     * @param rollUnit  the roll unit.\r\n     * @param rollCount  the roll count.\r\n     * @param formatter  the date formatter (defaults to DateFormat.SHORT).\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 61)",
        "(line 147,col 9)-(line 147,col 25)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getUnit()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the date unit.  This will be one of the constants \r\n     * \u003ccode\u003eYEAR\u003c/code\u003e, \u003ccode\u003eMONTH\u003c/code\u003e, \u003ccode\u003eDAY\u003c/code\u003e, \r\n     * \u003ccode\u003eHOUR\u003c/code\u003e, \u003ccode\u003eMINUTE\u003c/code\u003e, \u003ccode\u003eSECOND\u003c/code\u003e or \r\n     * \u003ccode\u003eMILLISECOND\u003c/code\u003e, defined by this class.  Note that these \r\n     * constants do NOT correspond to those defined in Java\u0027s \r\n     * \u003ccode\u003eCalendar\u003c/code\u003e class.\r\n     *\r\n     * @return The date unit.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getCount()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the unit count.\r\n     *\r\n     * @return The unit count.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getRollUnit()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns the roll unit.  This is the amount by which the tick advances if\r\n     * it is \"hidden\" when displayed on a segmented date axis.  Typically the \r\n     * roll will be smaller than the regular tick unit (for example, a 7 day \r\n     * tick unit might use a 1 day roll).\r\n     *\r\n     * @return The roll unit.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getRollCount()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\r\n     * Returns the roll count.\r\n     *\r\n     * @return The roll count.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.valueToString(double)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\r\n     * Formats a value.\r\n     *\r\n     * @param milliseconds  date in milliseconds since 01-01-1970.\r\n     *\r\n     * @return The formatted date.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.dateToString(java.util.Date)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Formats a date using the tick unit\u0027s formatter.\r\n     *\r\n     * @param date  the date.\r\n     *\r\n     * @return The formatted date.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.addToDate(java.util.Date)",
      "begin_line": 232,
      "end_line": 237,
      "comment": "\r\n     * Calculates a new date by adding this unit to the base date.\r\n     *\r\n     * @param base  the base date.\r\n     *\r\n     * @return A new date one unit after the base date.\r\n     * \r\n     * @see #addToDate(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 51)",
        "(line 234,col 9)-(line 234,col 31)",
        "(line 235,col 9)-(line 235,col 62)",
        "(line 236,col 9)-(line 236,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.addToDate(java.util.Date, java.util.TimeZone)",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\r\n     * Calculates a new date by adding this unit to the base date.\r\n     *\r\n     * @param base  the base date.\r\n     * @param zone  the time zone for the date calculation.\r\n     *\r\n     * @return A new date one unit after the base date.\r\n     * \r\n     * @since 1.0.6\r\n     * @see #addToDate(Date)\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 55)",
        "(line 252,col 9)-(line 252,col 31)",
        "(line 253,col 9)-(line 253,col 62)",
        "(line 254,col 9)-(line 254,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.rollDate(java.util.Date)",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\r\n     * Rolls the date forward by the amount specified by the roll unit and \r\n     * count.\r\n     *\r\n     * @param base  the base date.\r\n\r\n     * @return The rolled date.\r\n     * \r\n     * @see #rollDate(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 51)",
        "(line 269,col 9)-(line 269,col 31)",
        "(line 270,col 9)-(line 270,col 70)",
        "(line 271,col 9)-(line 271,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.rollDate(java.util.Date, java.util.TimeZone)",
      "begin_line": 286,
      "end_line": 291,
      "comment": "\r\n     * Rolls the date forward by the amount specified by the roll unit and \r\n     * count.\r\n     *\r\n     * @param base  the base date.\r\n     * @param zone  the time zone.\r\n     * \r\n     * @return The rolled date.\r\n     * \r\n     * @since 1.0.6\r\n     * @see #rollDate(Date)\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 288,col 31)",
        "(line 289,col 9)-(line 289,col 70)",
        "(line 290,col 9)-(line 290,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getCalendarField()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\r\n     * Returns a field code that can be used with the \u003ccode\u003eCalendar\u003c/code\u003e \r\n     * class.\r\n     *\r\n     * @return The field code.\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getCalendarField(int)",
      "begin_line": 313,
      "end_line": 334,
      "comment": "\r\n     * Returns a field code (that can be used with the Calendar class) for a \r\n     * given \u0027unit\u0027 code.  The \u0027unit\u0027 is one of:  {@link #YEAR}, {@link #MONTH},\r\n     * {@link #DAY}, {@link #HOUR}, {@link #MINUTE}, {@link #SECOND} and \r\n     * {@link #MILLISECOND}.\r\n     *\r\n     * @param tickUnit  the unit.\r\n     *\r\n     * @return The field code.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getMillisecondCount(int, int)",
      "begin_line": 348,
      "end_line": 375,
      "comment": "\r\n     * Returns the (approximate) number of milliseconds for the given unit and \r\n     * unit count.\r\n     * \u003cP\u003e\r\n     * This value is an approximation some of the time (e.g. months are \r\n     * assumed to have 31 days) but this shouldn\u0027t matter.\r\n     *\r\n     * @param unit  the unit.\r\n     * @param count  the unit count.\r\n     *\r\n     * @return The number of milliseconds.\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.equals(java.lang.Object)",
      "begin_line": 384,
      "end_line": 405,
      "comment": "\r\n     * Tests this unit for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 47)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.hashCode()",
      "begin_line": 412,
      "end_line": 418,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 24)",
        "(line 414,col 9)-(line 414,col 41)",
        "(line 415,col 9)-(line 415,col 42)",
        "(line 416,col 9)-(line 416,col 57)",
        "(line 417,col 9)-(line 417,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "units"
      ],
      "begin_line": 423,
      "end_line": 424,
      "comment": "\r\n     * Strings for use by the toString() method.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.toString()",
      "begin_line": 432,
      "end_line": 435,
      "comment": "\r\n     * Returns a string representation of this instance, primarily used for\r\n     * debugging purposes.\r\n     *\r\n     * @return A string representation of this instance.\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 434,col 35)"
      ]
    }
  ]
}