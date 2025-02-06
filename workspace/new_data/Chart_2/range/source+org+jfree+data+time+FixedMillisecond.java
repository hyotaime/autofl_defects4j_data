{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/FixedMillisecond.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedMillisecond",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 290,
      "comment": "\r\n * Wrapper for a \u003ccode\u003ejava.util.Date\u003c/code\u003e object that allows it to be used\r\n * as a {@link RegularTimePeriod}.  This class is immutable, which is a\r\n * requirement for all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.FixedMillisecond.FixedMillisecond()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Constructs a millisecond based on the current system time.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.FixedMillisecond.FixedMillisecond(long)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Constructs a millisecond.\r\n     *\r\n     * @param millisecond  the millisecond (same encoding as java.util.Date).\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.FixedMillisecond.FixedMillisecond(java.util.Date)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Constructs a millisecond.\r\n     *\r\n     * @param time  the time.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getTime()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the date/time.\r\n     *\r\n     * @return The date/time.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.peg(java.util.Calendar)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * This method is overridden to do nothing.\r\n     *\r\n     * @param calendar  ignored\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.previous()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\r\n     * Returns the millisecond preceding this one.\r\n     *\r\n     * @return The millisecond preceding this one.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 40)",
        "(line 122,col 9)-(line 122,col 27)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.next()",
      "begin_line": 134,
      "end_line": 141,
      "comment": "\r\n     * Returns the millisecond following this one.\r\n     *\r\n     * @return The millisecond following this one.\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 40)",
        "(line 136,col 9)-(line 136,col 27)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.equals(java.lang.Object)",
      "begin_line": 150,
      "end_line": 159,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     *\r\n     * @param object  the object to compare\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.hashCode()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Returns a hash code for this object instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.compareTo(java.lang.Object)",
      "begin_line": 179,
      "end_line": 218,
      "comment": "\r\n     * Returns an integer indicating the order of this Millisecond object\r\n     * relative to the specified\r\n     * object: negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1    the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 19)",
        "(line 182,col 9)-(line 182,col 24)",
        "(line 186,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getFirstMillisecond()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\r\n     * Returns the first millisecond of the time period.\r\n     *\r\n     * @return The first millisecond of the time period.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the first millisecond of the time period.\r\n     *\r\n     * @param calendar  the calendar.\r\n     *\r\n     * @return The first millisecond of the time period.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getLastMillisecond()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n     * Returns the last millisecond of the time period.\r\n     *\r\n     * @return The last millisecond of the time period.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getLastMillisecond(java.util.Calendar)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Returns the last millisecond of the time period.\r\n     *\r\n     * @param calendar  the calendar.\r\n     *\r\n     * @return The last millisecond of the time period.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getMiddleMillisecond()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the millisecond closest to the middle of the time period.\r\n     *\r\n     * @return The millisecond closest to the middle of the time period.\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getMiddleMillisecond(java.util.Calendar)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\r\n     * Returns the millisecond closest to the middle of the time period.\r\n     *\r\n     * @param calendar  the calendar.\r\n     *\r\n     * @return The millisecond closest to the middle of the time period.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getSerialIndex()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns a serial index number for the millisecond.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 25)"
      ]
    }
  ]
}