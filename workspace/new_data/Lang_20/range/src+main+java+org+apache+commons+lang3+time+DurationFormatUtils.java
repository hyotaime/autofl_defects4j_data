{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DurationFormatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 662,
      "comment": "\n * \u003cp\u003eDuration formatting utilities and constants. The following table describes the tokens \n * used in the pattern language for formatting. \u003c/p\u003e\n * \u003ctable border\u003d\"1\"\u003e\n *  \u003ctr\u003e\u003cth\u003echaracter\u003c/th\u003e\u003cth\u003eduration element\u003c/th\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003ey\u003c/td\u003e\u003ctd\u003eyears\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eM\u003c/td\u003e\u003ctd\u003emonths\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003ed\u003c/td\u003e\u003ctd\u003edays\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eH\u003c/td\u003e\u003ctd\u003ehours\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003em\u003c/td\u003e\u003ctd\u003eminutes\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003es\u003c/td\u003e\u003ctd\u003eseconds\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eS\u003c/td\u003e\u003ctd\u003emilliseconds\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.DurationFormatUtils()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * \u003cp\u003eDurationFormatUtils instances should NOT be constructed in standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO_EXTENDED_FORMAT_PATTERN"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003ePattern used with \u003ccode\u003eFastDateFormat\u003c/code\u003e and \u003ccode\u003eSimpleDateFormat\u003c/code\u003e\n     * for the ISO8601 period format used in durations.\u003c/p\u003e\n     * \n     * @see org.apache.commons.lang3.time.FastDateFormat\n     * @see java.text.SimpleDateFormat\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(long)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is ISO8601-like:\n     * \u003ci\u003eH\u003c/i\u003e:\u003ci\u003em\u003c/i\u003e:\u003ci\u003es\u003c/i\u003e.\u003ci\u003eS\u003c/i\u003e.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @return the formatted duration, not null\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(long)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is the ISO8601 period format.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * ISO format pattern, such as P7D6TH5M4.321S.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @return the formatted duration, not null\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(long, java.lang.String)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format, and padding with zeros and \n     * using the default timezone.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @param format  the way in which to format the duration, not null\n     * @return the formatted duration, not null\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(long, java.lang.String, boolean)",
      "begin_line": 122,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional and \n     * the timezone may be specified.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @param format  the way in which to format the duration, not null\n     * @param padWithZeros  whether to pad the left hand side of numbers with 0\u0027s\n     * @return the formatted duration, not null\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 38)",
        "(line 126,col 9)-(line 126,col 29)",
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 128,col 29)",
        "(line 129,col 9)-(line 129,col 29)",
        "(line 130,col 9)-(line 130,col 29)",
        "(line 132,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(long, boolean, boolean)",
      "begin_line": 166,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003eFormats an elapsed time into a plurialization correct string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the elapsed time to report in milliseconds\n     * @param suppressLeadingZeroElements  suppresses leading 0 elements\n     * @param suppressTrailingZeroElements  suppresses trailing 0 elements\n     * @return the formatted text in days/hours/minutes/seconds, not null\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 103)",
        "(line 175,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 34)",
        "(line 212,col 9)-(line 212,col 80)",
        "(line 213,col 9)-(line 213,col 80)",
        "(line 214,col 9)-(line 214,col 76)",
        "(line 215,col 9)-(line 215,col 74)",
        "(line 216,col 9)-(line 216,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(long, long)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is the ISO8601 period format.\u003c/p\u003e\n     * \n     * @param startMillis  the start of the duration to format\n     * @param endMillis  the end of the duration to format\n     * @return the formatted duration, not null\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(long, long, java.lang.String)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional.\n     * \n     * @param startMillis  the start of the duration\n     * @param endMillis  the end of the duration\n     * @param format  the way in which to format the duration, not null\n     * @return the formatted duration, not null\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(long, long, java.lang.String, boolean, java.util.TimeZone)",
      "begin_line": 269,
      "end_line": 397,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional and \n     * the timezone may be specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eWhen calculating the difference between months/days, it chooses to \n     * calculate months first. So when working out the number of months and \n     * days between January 15th and March 10th, it choose 1 month and \n     * 23 days gained by choosing January-\u003eFebruary \u003d 1 month and then \n     * calculating days forwards, and not the 1 month and 26 days gained by \n     * choosing March -\u003e February \u003d 1 month and then calculating days \n     * backwards. \u003c/p\u003e\n     *\n     * \u003cp\u003eFor more control, the \u003ca href\u003d\"http://joda-time.sf.net/\"\u003eJoda-Time\u003c/a\u003e\n     * library is recommended.\u003c/p\u003e\n     * \n     * @param startMillis  the start of the duration\n     * @param endMillis  the end of the duration\n     * @param format  the way in which to format the duration, not null\n     * @param padWithZeros  whether to pad the left hand side of numbers with 0\u0027s\n     * @param timezone  the millis are defined in\n     * @return the formatted duration, not null\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 38)",
        "(line 282,col 9)-(line 282,col 56)",
        "(line 283,col 9)-(line 283,col 45)",
        "(line 284,col 9)-(line 284,col 54)",
        "(line 285,col 9)-(line 285,col 41)",
        "(line 288,col 9)-(line 288,col 91)",
        "(line 289,col 9)-(line 289,col 76)",
        "(line 290,col 9)-(line 290,col 76)",
        "(line 291,col 9)-(line 291,col 84)",
        "(line 292,col 9)-(line 292,col 85)",
        "(line 293,col 9)-(line 293,col 73)",
        "(line 294,col 9)-(line 294,col 70)",
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 373,col 9)",
        "(line 379,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.format(org.apache.commons.lang3.time.DurationFormatUtils.Token[], int, int, int, int, int, int, int, boolean)",
      "begin_line": 414,
      "end_line": 467,
      "comment": "\n     * \u003cp\u003eThe internal method to do the formatting.\u003c/p\u003e\n     * \n     * @param tokens  the tokens\n     * @param years  the number of years\n     * @param months  the number of months\n     * @param days  the number of days\n     * @param hours  the number of hours\n     * @param minutes  the number of minutes\n     * @param seconds  the number of seconds\n     * @param milliseconds  the number of millis\n     * @param padWithZeros  whether to pad\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 49)",
        "(line 417,col 9)-(line 417,col 42)",
        "(line 418,col 9)-(line 418,col 31)",
        "(line 419,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "M"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "H"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 474,
      "end_line": 474,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "S"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.lexx(java.lang.String)",
      "begin_line": 483,
      "end_line": 537,
      "comment": "\n     * Parses a classic date format string into Tokens\n     *\n     * @param format  the format to parse, not null\n     * @return array of Token[]\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 44)",
        "(line 485,col 9)-(line 485,col 67)",
        "(line 487,col 9)-(line 487,col 34)",
        "(line 488,col 9)-(line 488,col 35)",
        "(line 489,col 9)-(line 489,col 30)",
        "(line 490,col 9)-(line 490,col 30)",
        "(line 491,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 543,
      "end_line": 660,
      "comment": "\n     * Element that is parsed from the format pattern.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(org.apache.commons.lang3.time.DurationFormatUtils.Token[], java.lang.Object)",
      "begin_line": 552,
      "end_line": 560,
      "comment": "\n         * Helper method to determine if a set of tokens contain a value\n         *\n         * @param tokens set to look in\n         * @param value to look for\n         * @return boolean \u003ccode\u003etrue\u003c/code\u003e if contained\n         ",
      "child_ranges": [
        "(line 553,col 13)-(line 553,col 35)",
        "(line 554,col 13)-(line 558,col 13)",
        "(line 559,col 13)-(line 559,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 562,
      "end_line": 562,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 563,
      "end_line": 563,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.Token(java.lang.Object)",
      "begin_line": 570,
      "end_line": 573,
      "comment": "\n         * Wraps a token around a value. A value would be something like a \u0027Y\u0027.\n         *\n         * @param value to wrap\n         ",
      "child_ranges": [
        "(line 571,col 13)-(line 571,col 31)",
        "(line 572,col 13)-(line 572,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.Token(java.lang.Object, int)",
      "begin_line": 582,
      "end_line": 585,
      "comment": "\n         * Wraps a token around a repeated number of a value, for example it would \n         * store \u0027yyyy\u0027 as a value for y and a count of 4.\n         *\n         * @param value to wrap\n         * @param count to wrap\n         ",
      "child_ranges": [
        "(line 583,col 13)-(line 583,col 31)",
        "(line 584,col 13)-(line 584,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.increment()",
      "begin_line": 590,
      "end_line": 592,
      "comment": "\n         * Adds another one of the value\n         ",
      "child_ranges": [
        "(line 591,col 13)-(line 591,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.getCount()",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\n         * Gets the current number of values represented\n         *\n         * @return int number of values represented\n         ",
      "child_ranges": [
        "(line 600,col 13)-(line 600,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.getValue()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n         * Gets the particular value this token represents.\n         * \n         * @return Object value\n         ",
      "child_ranges": [
        "(line 609,col 13)-(line 609,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.equals(java.lang.Object)",
      "begin_line": 618,
      "end_line": 637,
      "comment": "\n         * Supports equality of this Token to another Token.\n         *\n         * @param obj2 Object to consider equality of\n         * @return boolean \u003ccode\u003etrue\u003c/code\u003e if equal\n         ",
      "child_ranges": [
        "(line 620,col 13)-(line 635,col 13)",
        "(line 636,col 13)-(line 636,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.hashCode()",
      "begin_line": 646,
      "end_line": 649,
      "comment": "\n         * Returns a hash code for the token equal to the \n         * hash code for the token\u0027s value. Thus \u0027TT\u0027 and \u0027TTTT\u0027 \n         * will have the same hash code. \n         *\n         * @return The hash code for the token\n         ",
      "child_ranges": [
        "(line 648,col 13)-(line 648,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.toString()",
      "begin_line": 656,
      "end_line": 659,
      "comment": "\n         * Represents this token as a String.\n         *\n         * @return String representation of the token\n         ",
      "child_ranges": [
        "(line 658,col 13)-(line 658,col 73)"
      ]
    }
  ]
}