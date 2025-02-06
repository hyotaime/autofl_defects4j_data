{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/Millisecond.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Millisecond",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 417,
      "comment": "\r\n * Represents a millisecond.  This class is immutable, which is a requirement \r\n * for all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_MILLISECOND_IN_SECOND"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " A constant for the first millisecond in a second. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_MILLISECOND_IN_SECOND"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " A constant for the last millisecond in a second. "
    },
    {
      "type": "field",
      "varNames": [
        "day"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The day. "
    },
    {
      "type": "field",
      "varNames": [
        "hour"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The hour in the day. "
    },
    {
      "type": "field",
      "varNames": [
        "minute"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The minute. "
    },
    {
      "type": "field",
      "varNames": [
        "second"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The second. "
    },
    {
      "type": "field",
      "varNames": [
        "millisecond"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\r\n     * The pegged millisecond. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Constructs a millisecond based on the current system time.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond(int, org.jfree.data.time.Second)",
      "begin_line": 110,
      "end_line": 117,
      "comment": "\r\n     * Constructs a millisecond.\r\n     *\r\n     * @param millisecond  the millisecond (0-999).\r\n     * @param second  the second.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 112,col 48)",
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 114,col 61)",
        "(line 115,col 9)-(line 115,col 47)",
        "(line 116,col 9)-(line 116,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond(int, int, int, int, int, int, int)",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\r\n     * Creates a new millisecond.\r\n     * \r\n     * @param millisecond  the millisecond (0-999).\r\n     * @param second  the second (0-59).\r\n     * @param minute  the minute (0-59).\r\n     * @param hour  the hour (0-23).\r\n     * @param day  the day (1-31).\r\n     * @param month  the month (1-12).\r\n     * @param year  the year (1900-9999).\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond(java.util.Date)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Constructs a millisecond.\r\n     *\r\n     * @param time  the time.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Millisecond.Millisecond(java.util.Date, java.util.TimeZone)",
      "begin_line": 152,
      "end_line": 161,
      "comment": "\r\n     * Creates a millisecond.\r\n     *\r\n     * @param time  the instant in time.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 55)",
        "(line 154,col 9)-(line 154,col 31)",
        "(line 155,col 9)-(line 155,col 62)",
        "(line 156,col 9)-(line 156,col 59)",
        "(line 157,col 9)-(line 157,col 59)",
        "(line 158,col 9)-(line 158,col 62)",
        "(line 159,col 9)-(line 159,col 39)",
        "(line 160,col 9)-(line 160,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getSecond()",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\r\n     * Returns the second.\r\n     *\r\n     * @return The second.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getMillisecond()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Returns the millisecond.\r\n     *\r\n     * @return The millisecond.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getFirstMillisecond()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Returns the first millisecond of the second.  This will be determined \r\n     * relative to the time zone specified in the constructor, or in the \r\n     * calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the second.\r\n     * \r\n     * @see #getLastMillisecond()\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getLastMillisecond()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * Returns the last millisecond of the second.  This will be \r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the \r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the second.\r\n     * \r\n     * @see #getFirstMillisecond()\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.peg(java.util.Calendar)",
      "begin_line": 219,
      "end_line": 221,
      "comment": " \r\n     * Recalculates the start date/time and end date/time for this time period \r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     * \r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.previous()",
      "begin_line": 228,
      "end_line": 243,
      "comment": "\r\n     * Returns the millisecond preceding this one.\r\n     *\r\n     * @return The millisecond preceding this one.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 40)",
        "(line 232,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.next()",
      "begin_line": 250,
      "end_line": 264,
      "comment": "\r\n     * Returns the millisecond following this one.\r\n     *\r\n     * @return The millisecond following this one.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 40)",
        "(line 253,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getSerialIndex()",
      "begin_line": 271,
      "end_line": 276,
      "comment": "\r\n     * Returns a serial index number for the millisecond.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 69)",
        "(line 273,col 9)-(line 273,col 57)",
        "(line 274,col 9)-(line 274,col 59)",
        "(line 275,col 9)-(line 275,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.equals(java.lang.Object)",
      "begin_line": 289,
      "end_line": 313,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     * \u003cP\u003e\r\n     * This method will return true ONLY if the object is a Millisecond object\r\n     * representing the same millisecond as this instance.\r\n     *\r\n     * @param obj  the object to compare\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if milliseconds and seconds of this and object\r\n     *      are the same.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 45)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.hashCode()",
      "begin_line": 324,
      "end_line": 329,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by \r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hashcode.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 24)",
        "(line 326,col 9)-(line 326,col 48)",
        "(line 327,col 9)-(line 327,col 54)",
        "(line 328,col 9)-(line 328,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.compareTo(java.lang.Object)",
      "begin_line": 341,
      "end_line": 380,
      "comment": "\r\n     * Returns an integer indicating the order of this Millisecond object\r\n     * relative to the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param obj  the object to compare\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 19)",
        "(line 344,col 9)-(line 344,col 24)",
        "(line 348,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 392,
      "end_line": 401,
      "comment": "\r\n     * Returns the first millisecond of the time period.\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the time period.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 38)",
        "(line 394,col 9)-(line 394,col 44)",
        "(line 395,col 9)-(line 395,col 43)",
        "(line 396,col 9)-(line 396,col 25)",
        "(line 397,col 9)-(line 397,col 76)",
        "(line 398,col 9)-(line 398,col 61)",
        "(line 400,col 9)-(line 400,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Millisecond.getLastMillisecond(java.util.Calendar)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\r\n     * Returns the last millisecond of the time period.\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the time period.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 45)"
      ]
    }
  ]
}