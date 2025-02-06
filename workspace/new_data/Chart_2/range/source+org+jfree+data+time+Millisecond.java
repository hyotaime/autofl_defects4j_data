{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/Millisecond.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Millisecond",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 427,
      "comment": "\r\n * Represents a millisecond.  This class is immutable, which is a requirement\r\n * for all {@link RegularTimePeriod} subclasses.\r\n "
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
        "FIRST_MILLISECOND_IN_SECOND"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " A constant for the first millisecond in a second. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_MILLISECOND_IN_SECOND"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " A constant for the last millisecond in a second. "
    },
    {
      "type": "field",
      "varNames": [
        "day"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The day. "
    },
    {
      "type": "field",
      "varNames": [
        "hour"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The hour in the day. "
    },
    {
      "type": "field",
      "varNames": [
        "minute"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The minute. "
    },
    {
      "type": "field",
      "varNames": [
        "second"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The second. "
    },
    {
      "type": "field",
      "varNames": [
        "millisecond"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\r\n     * The pegged millisecond.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Constructs a millisecond based on the current system time.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond(int, org.jfree.data.time.Second)",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\r\n     * Constructs a millisecond.\r\n     *\r\n     * @param millisecond  the millisecond (0-999).\r\n     * @param second  the second.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 39)",
        "(line 116,col 9)-(line 116,col 48)",
        "(line 117,col 9)-(line 117,col 60)",
        "(line 118,col 9)-(line 118,col 61)",
        "(line 119,col 9)-(line 119,col 47)",
        "(line 120,col 9)-(line 120,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond(int, int, int, int, int, int, int)",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\r\n     * Creates a new millisecond.\r\n     *\r\n     * @param millisecond  the millisecond (0-999).\r\n     * @param second  the second (0-59).\r\n     * @param minute  the minute (0-59).\r\n     * @param hour  the hour (0-23).\r\n     * @param day  the day (1-31).\r\n     * @param month  the month (1-12).\r\n     * @param year  the year (1900-9999).\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond(java.util.Date)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Constructs a new millisecond using the default time zone.\r\n     *\r\n     * @param time  the time.\r\n     *\r\n     * @see #Millisecond(Date, TimeZone)\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond(java.util.Date, java.util.TimeZone)",
      "begin_line": 158,
      "end_line": 168,
      "comment": "\r\n     * Creates a millisecond.\r\n     *\r\n     * @param time  the instant in time.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 55)",
        "(line 161,col 9)-(line 161,col 31)",
        "(line 162,col 9)-(line 162,col 62)",
        "(line 163,col 9)-(line 163,col 59)",
        "(line 164,col 9)-(line 164,col 59)",
        "(line 165,col 9)-(line 165,col 62)",
        "(line 166,col 9)-(line 166,col 39)",
        "(line 167,col 9)-(line 167,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getSecond()",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\r\n     * Returns the second.\r\n     *\r\n     * @return The second.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getMillisecond()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the millisecond.\r\n     *\r\n     * @return The millisecond.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getFirstMillisecond()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the first millisecond of the second.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the second.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getLastMillisecond()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the last millisecond of the second.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the second.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.peg(java.util.Calendar)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.previous()",
      "begin_line": 235,
      "end_line": 250,
      "comment": "\r\n     * Returns the millisecond preceding this one.\r\n     *\r\n     * @return The millisecond preceding this one.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 40)",
        "(line 239,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.next()",
      "begin_line": 257,
      "end_line": 271,
      "comment": "\r\n     * Returns the millisecond following this one.\r\n     *\r\n     * @return The millisecond following this one.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 40)",
        "(line 260,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getSerialIndex()",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\r\n     * Returns a serial index number for the millisecond.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 69)",
        "(line 280,col 9)-(line 280,col 57)",
        "(line 281,col 9)-(line 281,col 59)",
        "(line 282,col 9)-(line 282,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.equals(java.lang.Object)",
      "begin_line": 296,
      "end_line": 320,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     * \u003cP\u003e\r\n     * This method will return true ONLY if the object is a Millisecond object\r\n     * representing the same millisecond as this instance.\r\n     *\r\n     * @param obj  the object to compare\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if milliseconds and seconds of this and object\r\n     *      are the same.\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 45)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.hashCode()",
      "begin_line": 331,
      "end_line": 336,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hashcode.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 24)",
        "(line 333,col 9)-(line 333,col 48)",
        "(line 334,col 9)-(line 334,col 54)",
        "(line 335,col 9)-(line 335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.compareTo(java.lang.Object)",
      "begin_line": 348,
      "end_line": 390,
      "comment": "\r\n     * Returns an integer indicating the order of this Millisecond object\r\n     * relative to the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param obj  the object to compare\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 19)",
        "(line 351,col 9)-(line 351,col 24)",
        "(line 355,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 388,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 402,
      "end_line": 411,
      "comment": "\r\n     * Returns the first millisecond of the time period.\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the time period.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 404,col 44)",
        "(line 405,col 9)-(line 405,col 43)",
        "(line 406,col 9)-(line 406,col 25)",
        "(line 407,col 9)-(line 407,col 76)",
        "(line 408,col 9)-(line 408,col 61)",
        "(line 410,col 9)-(line 410,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getLastMillisecond(java.util.Calendar)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\r\n     * Returns the last millisecond of the time period.\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the time period.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 45)"
      ]
    }
  ]
}