{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/SpreadsheetDate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpreadsheetDate",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.SerialDate"
      ],
      "begin_line": 80,
      "end_line": 460,
      "comment": "\n * Represents a date using an integer, in a similar fashion to the\n * implementation in Microsoft Excel.  The range of dates supported is\n * 1-Jan-1900 to 31-Dec-9999.\n * \u003cP\u003e\n * Be aware that there is a deliberate bug in Excel that recognises the year\n * 1900 as a leap year when in fact it is not a leap year. You can find more\n * information on the Microsoft website in article Q181370:\n * \u003cP\u003e\n * http://support.microsoft.com/support/kb/articles/Q181/3/70.asp\n * \u003cP\u003e\n * Excel uses the convention that 1-Jan-1900 \u003d 1.  This class uses the\n * convention 1-Jan-1900 \u003d 2.\n * The result is that the day number in this class will be different to the\n * Excel figure for January and February 1900...but then Excel adds in an extra\n * day (29-Feb-1900 which does not actually exist!) and from that point forward\n * the day numbers will match.\n *\n * @author David Gilbert\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serial"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " \n     * The day number (1-Jan-1900 \u003d 2, 2-Jan-1900 \u003d 3, ..., 31-Dec-9999 \u003d \n     * 2958465). \n     "
    },
    {
      "type": "field",
      "varNames": [
        "day"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The day of the month (1 to 28, 29, 30 or 31 depending on the month). "
    },
    {
      "type": "field",
      "varNames": [
        "month"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The month of the year (1 to 12). "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The year (1900 to 9999). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.SpreadsheetDate.SpreadsheetDate(int, int, int)",
      "begin_line": 107,
      "end_line": 138,
      "comment": "\n     * Creates a new date instance.\n     *\n     * @param day  the day (in the range 1 to 28/29/30/31).\n     * @param month  the month (in the range 1 to 12).\n     * @param year  the year (in the range 1900 to 9999).\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 133,col 9)",
        "(line 136,col 9)-(line 136,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.SpreadsheetDate.SpreadsheetDate(int)",
      "begin_line": 146,
      "end_line": 201,
      "comment": "\n     * Standard constructor - creates a new date object representing the\n     * specified day number (which should be in the range 2 to 2958465.\n     *\n     * @param serial  the serial number for the day (range: 2 to 2958465).\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 154,col 9)",
        "(line 158,col 7)-(line 158,col 56)",
        "(line 160,col 7)-(line 160,col 56)",
        "(line 161,col 7)-(line 161,col 68)",
        "(line 162,col 7)-(line 162,col 43)",
        "(line 164,col 7)-(line 164,col 58)",
        "(line 166,col 7)-(line 176,col 7)",
        "(line 178,col 7)-(line 178,col 50)",
        "(line 180,col 7)-(line 181,col 53)",
        "(line 183,col 7)-(line 186,col 7)",
        "(line 189,col 7)-(line 189,col 17)",
        "(line 190,col 7)-(line 190,col 56)",
        "(line 191,col 7)-(line 194,col 7)",
        "(line 195,col 7)-(line 195,col 26)",
        "(line 198,col 7)-(line 199,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.toSerial()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Returns the serial number for the date, where 1 January 1900 \u003d 2\n     * (this corresponds, almost, to the numbering system used in Microsoft\n     * Excel for Windows and Lotus 1-2-3).\n     *\n     * @return The serial number of this date.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.toDate()",
      "begin_line": 219,
      "end_line": 223,
      "comment": "\n     * Returns a \u003ccode\u003ejava.util.Date\u003c/code\u003e equivalent to this date.\n     *\n     * @return The date.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 57)",
        "(line 221,col 9)-(line 221,col 74)",
        "(line 222,col 9)-(line 222,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.getYYYY()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns the year (assume a valid range of 1900 to 9999).\n     *\n     * @return The year.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.getMonth()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Returns the month (January \u003d 1, February \u003d 2, March \u003d 3).\n     *\n     * @return The month of the year.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.getDayOfMonth()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Returns the day of the month.\n     *\n     * @return The day of the month.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.getDayOfWeek()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns a code representing the day of the week.\n     * \u003cP\u003e\n     * The codes are defined in the {@link SerialDate} class as: \n     * \u003ccode\u003eSUNDAY\u003c/code\u003e, \u003ccode\u003eMONDAY\u003c/code\u003e, \u003ccode\u003eTUESDAY\u003c/code\u003e, \n     * \u003ccode\u003eWEDNESDAY\u003c/code\u003e, \u003ccode\u003eTHURSDAY\u003c/code\u003e, \u003ccode\u003eFRIDAY\u003c/code\u003e, and \n     * \u003ccode\u003eSATURDAY\u003c/code\u003e.\n     *\n     * @return A code representing the day of the week.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.equals(java.lang.Object)",
      "begin_line": 277,
      "end_line": 287,
      "comment": "\n     * Tests the equality of this date with an arbitrary object.\n     * \u003cP\u003e\n     * This method will return true ONLY if the object is an instance of the\n     * {@link SerialDate} base class, and it represents the same day as this\n     * {@link SpreadsheetDate}.\n     *\n     * @param object  the object to compare (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.hashCode()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Returns a hash code for this object instance.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.compare(org.jfree.data.time.SerialDate)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Returns the difference (in days) between this date and the specified \n     * \u0027other\u0027 date.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return The difference (in days) between this date and the specified \n     *         \u0027other\u0027 date.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.compareTo(java.lang.Object)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Implements the method required by the Comparable interface.\n     * \n     * @param other  the other object (usually another SerialDate).\n     * \n     * @return A negative integer, zero, or a positive integer as this object \n     *         is less than, equal to, or greater than the specified object.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.isOn(org.jfree.data.time.SerialDate)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Returns true if this SerialDate represents the same date as the\n     * specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents the same date as\n     *         the specified SerialDate.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.isBefore(org.jfree.data.time.SerialDate)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Returns true if this SerialDate represents an earlier date compared to\n     * the specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents an earlier date\n     *         compared to the specified SerialDate.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.isOnOrBefore(org.jfree.data.time.SerialDate)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Returns true if this SerialDate represents the same date as the\n     * specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents the same date\n     *         as the specified SerialDate.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.isAfter(org.jfree.data.time.SerialDate)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Returns true if this SerialDate represents the same date as the\n     * specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents the same date\n     *         as the specified SerialDate.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.isOnOrAfter(org.jfree.data.time.SerialDate)",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Returns true if this SerialDate represents the same date as the\n     * specified SerialDate.\n     *\n     * @param other  the date being compared to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate represents the same date as\n     *         the specified SerialDate.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.isInRange(org.jfree.data.time.SerialDate, org.jfree.data.time.SerialDate)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this {@link SerialDate} is within the \n     * specified range (INCLUSIVE).  The date order of d1 and d2 is not \n     * important.\n     *\n     * @param d1  a boundary date for the range.\n     * @param d2  the other boundary date for the range.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.isInRange(org.jfree.data.time.SerialDate, org.jfree.data.time.SerialDate, int)",
      "begin_line": 415,
      "end_line": 435,
      "comment": "\n     * Returns true if this SerialDate is within the specified range (caller\n     * specifies whether or not the end-points are included).  The order of d1\n     * and d2 is not important.\n     *\n     * @param d1  one boundary date for the range.\n     * @param d2  a second boundary date for the range.\n     * @param include  a code that controls whether or not the start and end \n     *                 dates are included in the range.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this SerialDate is within the specified \n     *         range.\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 37)",
        "(line 418,col 9)-(line 418,col 37)",
        "(line 419,col 9)-(line 419,col 43)",
        "(line 420,col 9)-(line 420,col 41)",
        "(line 422,col 9)-(line 422,col 33)",
        "(line 423,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SpreadsheetDate.calcSerial(int, int, int)",
      "begin_line": 448,
      "end_line": 458,
      "comment": "\n     * Calculate the serial number from the day, month and year.\n     * \u003cP\u003e\n     * 1-Jan-1900 \u003d 2.\n     *\n     * @param d  the day.\n     * @param m  the month.\n     * @param y  the year.\n     *\n     * @return the serial number from the day, month and year.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 76)",
        "(line 450,col 9)-(line 450,col 72)",
        "(line 451,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 25)",
        "(line 457,col 9)-(line 457,col 32)"
      ]
    }
  ]
}