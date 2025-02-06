{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/FixedMillisecond.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedMillisecond",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 289,
      "comment": "\r\n * Wrapper for a \u003ccode\u003ejava.util.Date\u003c/code\u003e object that allows it to be used \r\n * as a {@link RegularTimePeriod}.  This class is immutable, which is a \r\n * requirement for all {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.FixedMillisecond.FixedMillisecond()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Constructs a millisecond based on the current system time.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.FixedMillisecond.FixedMillisecond(long)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Constructs a millisecond.\r\n     *\r\n     * @param millisecond  the millisecond (same encoding as java.util.Date).\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.FixedMillisecond.FixedMillisecond(java.util.Date)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Constructs a millisecond.\r\n     *\r\n     * @param time  the time.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getTime()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Returns the date/time.\r\n     *\r\n     * @return The date/time.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.peg(java.util.Calendar)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * This method is overridden to do nothing.\r\n     * \r\n     * @param calendar  ignored\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.previous()",
      "begin_line": 119,
      "end_line": 126,
      "comment": "\r\n     * Returns the millisecond preceding this one.\r\n     *\r\n     * @return The millisecond preceding this one.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 40)",
        "(line 121,col 9)-(line 121,col 37)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.next()",
      "begin_line": 133,
      "end_line": 140,
      "comment": "\r\n     * Returns the millisecond following this one.\r\n     *\r\n     * @return The millisecond following this one.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 40)",
        "(line 135,col 9)-(line 135,col 37)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.equals(java.lang.Object)",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\r\n     * Tests the equality of this object against an arbitrary Object.\r\n     *\r\n     * @param object  the object to compare\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.hashCode()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Returns a hash code for this object instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.compareTo(java.lang.Object)",
      "begin_line": 178,
      "end_line": 217,
      "comment": "\r\n     * Returns an integer indicating the order of this Millisecond object\r\n     * relative to the specified\r\n     * object: negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1    the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 19)",
        "(line 181,col 9)-(line 181,col 24)",
        "(line 185,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getFirstMillisecond()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the first millisecond of the time period.\r\n     *\r\n     * @return The first millisecond of the time period.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the first millisecond of the time period.\r\n     *\r\n     * @param calendar  the calendar.\r\n     *\r\n     * @return The first millisecond of the time period.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getLastMillisecond()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\r\n     * Returns the last millisecond of the time period.\r\n     *\r\n     * @return The last millisecond of the time period.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getLastMillisecond(java.util.Calendar)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\r\n     * Returns the last millisecond of the time period.\r\n     *\r\n     * @param calendar  the calendar.\r\n     *\r\n     * @return The last millisecond of the time period.\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getMiddleMillisecond()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\r\n     * Returns the millisecond closest to the middle of the time period.\r\n     *\r\n     * @return The millisecond closest to the middle of the time period.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getMiddleMillisecond(java.util.Calendar)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns the millisecond closest to the middle of the time period.\r\n     *\r\n     * @param calendar  the calendar.\r\n     *\r\n     * @return The millisecond closest to the middle of the time period.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.FixedMillisecond.getSerialIndex()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\r\n     * Returns a serial index number for the millisecond.\r\n     *\r\n     * @return The serial index number.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 35)"
      ]
    }
  ]
}