{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/DateTickUnit.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateTickUnit",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.TickUnit",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 402,
      "comment": "\r\n * A tick unit for use by subclasses of {@link DateAxis}.  Instances of this\r\n * class are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "unitType"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\r\n     * The units.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The unit count. "
    },
    {
      "type": "field",
      "varNames": [
        "rollUnitType"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\r\n     * The roll unit type.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rollCount"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The roll count. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The date formatter. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTickUnit.DateTickUnit(org.jfree.chart.axis.DateTickUnitType, int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Creates a new date tick unit.\r\n     *\r\n     * @param unitType  the unit type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param multiple  the multiple (of the unit type, must be \u003e 0).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTickUnit.DateTickUnit(org.jfree.chart.axis.DateTickUnitType, int, java.text.DateFormat)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\r\n     * Creates a new date tick unit.\r\n     *\r\n     * @param unitType  the unit type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param multiple  the multiple (of the unit type, must be \u003e 0).\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTickUnit.DateTickUnit(org.jfree.chart.axis.DateTickUnitType, int, org.jfree.chart.axis.DateTickUnitType, int, java.text.DateFormat)",
      "begin_line": 136,
      "end_line": 154,
      "comment": "\r\n     * Creates a new unit.\r\n     *\r\n     * @param unitType  the unit.\r\n     * @param multiple  the multiple.\r\n     * @param rollUnitType  the roll unit.\r\n     * @param rollMultiple  the roll multiple.\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 68)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 30)",
        "(line 151,col 9)-(line 151,col 41)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 153,col 9)-(line 153,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getUnitType()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns the unit type.\r\n     *\r\n     * @return The unit type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getMultiple()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns the unit multiple.\r\n     *\r\n     * @return The unit multiple (always \u003e 0).\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getRollUnitType()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns the roll unit type.\r\n     *\r\n     * @return The roll unit type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getRollMultiple()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns the roll unit multiple.\r\n     *\r\n     * @return The roll unit multiple.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.valueToString(double)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Formats a value.\r\n     *\r\n     * @param milliseconds  date in milliseconds since 01-01-1970.\r\n     *\r\n     * @return The formatted date.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.dateToString(java.util.Date)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Formats a date using the tick unit\u0027s formatter.\r\n     *\r\n     * @param date  the date.\r\n     *\r\n     * @return The formatted date.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.addToDate(java.util.Date, java.util.TimeZone)",
      "begin_line": 230,
      "end_line": 239,
      "comment": "\r\n     * Calculates a new date by adding this unit to the base date.\r\n     *\r\n     * @param base  the base date.\r\n     * @param zone  the time zone for the date calculation.\r\n     *\r\n     * @return A new date one unit after the base date.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 55)",
        "(line 236,col 9)-(line 236,col 31)",
        "(line 237,col 9)-(line 237,col 67)",
        "(line 238,col 9)-(line 238,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.rollDate(java.util.Date)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Rolls the date forward by the amount specified by the roll unit and\r\n     * count.\r\n     *\r\n     * @param base  the base date.\r\n\r\n     * @return The rolled date.\r\n     *\r\n     * @see #rollDate(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.rollDate(java.util.Date, java.util.TimeZone)",
      "begin_line": 266,
      "end_line": 275,
      "comment": "\r\n     * Rolls the date forward by the amount specified by the roll unit and\r\n     * count.\r\n     *\r\n     * @param base  the base date.\r\n     * @param zone  the time zone.\r\n     *\r\n     * @return The rolled date.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 55)",
        "(line 272,col 9)-(line 272,col 31)",
        "(line 273,col 9)-(line 273,col 75)",
        "(line 274,col 9)-(line 274,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getCalendarField()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Returns a field code that can be used with the \u003ccode\u003eCalendar\u003c/code\u003e\r\n     * class.\r\n     *\r\n     * @return The field code.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.getMillisecondCount(org.jfree.chart.axis.DateTickUnitType, int)",
      "begin_line": 301,
      "end_line": 329,
      "comment": "\r\n     * Returns the (approximate) number of milliseconds for the given unit and\r\n     * unit count.\r\n     * \u003cP\u003e\r\n     * This value is an approximation some of the time (e.g. months are\r\n     * assumed to have 31 days) but this shouldn\u0027t matter.\r\n     *\r\n     * @param unit  the unit.\r\n     * @param count  the unit count.\r\n     *\r\n     * @return The number of milliseconds.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.notNull(java.text.DateFormat)",
      "begin_line": 339,
      "end_line": 346,
      "comment": "\r\n     * A utility method to put a default in place if a null formatter is\r\n     * supplied.\r\n     *\r\n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The formatter if it is not null, otherwise a default.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.equals(java.lang.Object)",
      "begin_line": 355,
      "end_line": 376,
      "comment": "\r\n     * Tests this unit for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.hashCode()",
      "begin_line": 383,
      "end_line": 389,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 24)",
        "(line 385,col 9)-(line 385,col 56)",
        "(line 386,col 9)-(line 386,col 42)",
        "(line 387,col 9)-(line 387,col 57)",
        "(line 388,col 9)-(line 388,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnit.toString()",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\r\n     * Returns a string representation of this instance, primarily used for\r\n     * debugging purposes.\r\n     *\r\n     * @return A string representation of this instance.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 399,col 35)"
      ]
    }
  ]
}