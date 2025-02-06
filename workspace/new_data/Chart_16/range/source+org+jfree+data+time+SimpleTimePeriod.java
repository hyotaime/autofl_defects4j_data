{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/SimpleTimePeriod.java",
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
      "begin_line": 58,
      "end_line": 199,
      "comment": "\r\n * An arbitrary period of time, measured to millisecond precision using \r\n * \u003ccode\u003ejava.util.Date\u003c/code\u003e.\r\n * \u003cp\u003e\r\n * This class is intentionally immutable (that is, once constructed, you cannot \r\n * alter the start and end attributes).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The start date/time. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The end date/time. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.SimpleTimePeriod.SimpleTimePeriod(long, long)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\r\n     * Creates a new time allocation.\r\n     *\r\n     * @param start  the start date/time in milliseconds.\r\n     * @param end  the end date/time in milliseconds.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.SimpleTimePeriod.SimpleTimePeriod(java.util.Date, java.util.Date)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\r\n     * Creates a new time allocation.\r\n     *\r\n     * @param start  the start date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param end  the end date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 27)",
        "(line 90,col 9)-(line 90,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.getStart()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Returns the start date/time.\r\n     *\r\n     * @return The start date/time (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.getEnd()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the end date/time.\r\n     *\r\n     * @return The end date/time (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.equals(java.lang.Object)",
      "begin_line": 120,
      "end_line": 135,
      "comment": "\r\n     * Tests this time period instance for equality with an arbitrary object.  \r\n     * The object is considered equal if it is an instance of {@link TimePeriod}\r\n     * and it has the same start and end dates.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 43)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.compareTo(java.lang.Object)",
      "begin_line": 148,
      "end_line": 181,
      "comment": "\r\n     * Returns an integer that indicates the relative ordering of two\r\n     * time periods.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return An integer.\r\n     * \r\n     * @throws ClassCastException if \u003ccode\u003eobj\u003c/code\u003e is not an instance of\r\n     *                            {@link TimePeriod}.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 43)",
        "(line 150,col 9)-(line 150,col 39)",
        "(line 151,col 9)-(line 151,col 37)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 42)",
        "(line 155,col 9)-(line 155,col 38)",
        "(line 156,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.SimpleTimePeriod.hashCode()",
      "begin_line": 192,
      "end_line": 197,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here - see:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/\r\n     * developer/Books/effectivejava/Chapter3.pdf\u003c/code\u003e\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 24)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 51)",
        "(line 196,col 9)-(line 196,col 22)"
      ]
    }
  ]
}