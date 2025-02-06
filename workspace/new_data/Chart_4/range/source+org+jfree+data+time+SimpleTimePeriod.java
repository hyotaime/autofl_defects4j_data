{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/SimpleTimePeriod.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleTimePeriod",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.TimePeriod",
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 222,
      "comment": "\r\n * An arbitrary period of time, measured to millisecond precision using\r\n * \u003ccode\u003ejava.util.Date\u003c/code\u003e.\r\n * \u003cp\u003e\r\n * This class is intentionally immutable (that is, once constructed, you cannot\r\n * alter the start and end attributes).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The start date/time. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The end date/time. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.SimpleTimePeriod.SimpleTimePeriod(long, long)",
      "begin_line": 76,
      "end_line": 82,
      "comment": "\r\n     * Creates a new time allocation.\r\n     *\r\n     * @param start  the start date/time in milliseconds.\r\n     * @param end  the end date/time in milliseconds.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 27)",
        "(line 81,col 9)-(line 81,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.SimpleTimePeriod.SimpleTimePeriod(java.util.Date, java.util.Date)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Creates a new time allocation.\r\n     *\r\n     * @param start  the start date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param end  the end date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.getStart()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Returns the start date/time.\r\n     *\r\n     * @return The start date/time (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.getStartMillis()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Returns the start date/time in milliseconds.\r\n     *\r\n     * @return The start.\r\n     *\r\n     * @since 1.0.10.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.getEnd()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Returns the end date/time.\r\n     *\r\n     * @return The end date/time (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.getEndMillis()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the end date/time in milliseconds.\r\n     *\r\n     * @return The end.\r\n     *\r\n     * @since 1.0.10.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.equals(java.lang.Object)",
      "begin_line": 143,
      "end_line": 158,
      "comment": "\r\n     * Tests this time period instance for equality with an arbitrary object.\r\n     * The object is considered equal if it is an instance of {@link TimePeriod}\r\n     * and it has the same start and end dates.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 43)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.compareTo(java.lang.Object)",
      "begin_line": 171,
      "end_line": 204,
      "comment": "\r\n     * Returns an integer that indicates the relative ordering of two\r\n     * time periods.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return An integer.\r\n     *\r\n     * @throws ClassCastException if \u003ccode\u003eobj\u003c/code\u003e is not an instance of\r\n     *                            {@link TimePeriod}.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 43)",
        "(line 173,col 9)-(line 173,col 39)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 175,col 38)",
        "(line 176,col 9)-(line 176,col 44)",
        "(line 177,col 9)-(line 177,col 42)",
        "(line 178,col 9)-(line 178,col 38)",
        "(line 179,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.hashCode()",
      "begin_line": 215,
      "end_line": 220,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here - see:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/\r\n     * developer/Books/effectivejava/Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 24)",
        "(line 217,col 9)-(line 217,col 48)",
        "(line 218,col 9)-(line 218,col 46)",
        "(line 219,col 9)-(line 219,col 22)"
      ]
    }
  ]
}