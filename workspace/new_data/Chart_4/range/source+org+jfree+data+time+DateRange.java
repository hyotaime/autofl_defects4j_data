{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/DateRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateRange",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.Range",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 171,
      "comment": "\r\n * A range specified in terms of two \u003ccode\u003ejava.util.Date\u003c/code\u003e objects.\r\n * Instances of this class are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerDate"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The lower bound for the range. "
    },
    {
      "type": "field",
      "varNames": [
        "upperDate"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The upper bound for the range. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DateRange.DateRange()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DateRange.DateRange(java.util.Date, java.util.Date)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\r\n     * Constructs a new range.\r\n     *\r\n     * @param lower  the lower bound (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param upper  the upper bound (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 48)",
        "(line 83,col 9)-(line 83,col 41)",
        "(line 84,col 9)-(line 84,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DateRange.DateRange(double, double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\r\n     * Constructs a new range using two values that will be interpreted as\r\n     * \"milliseconds since midnight GMT, 1-Jan-1970\".\r\n     *\r\n     * @param lower  the lower (oldest) date.\r\n     * @param upper  the upper (most recent) date.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 28)",
        "(line 96,col 9)-(line 96,col 38)",
        "(line 97,col 9)-(line 97,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DateRange.DateRange(org.jfree.data.Range)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Constructs a new range that is based on another {@link Range}.  The\r\n     * other range does not have to be a {@link DateRange}.  If it is not, the\r\n     * upper and lower bounds are evaluated as milliseconds since midnight\r\n     * GMT, 1-Jan-1970.\r\n     *\r\n     * @param other  the other range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DateRange.getLowerDate()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Returns the lower (earlier) date for the range.\r\n     *\r\n     * @return The lower date for the range.\r\n     *\r\n     * @see #getLowerMillis()\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DateRange.getLowerMillis()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the lower bound of the range in milliseconds.\r\n     *\r\n     * @return The lower bound.\r\n     *\r\n     * @see #getLowerDate()\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DateRange.getUpperDate()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the upper (later) date for the range.\r\n     *\r\n     * @return The upper date for the range.\r\n     *\r\n     * @see #getUpperMillis()\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DateRange.getUpperMillis()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns the upper bound of the range in milliseconds.\r\n     *\r\n     * @return The upper bound.\r\n     *\r\n     * @see #getUpperDate()\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DateRange.toString()",
      "begin_line": 165,
      "end_line": 169,
      "comment": "\r\n     * Returns a string representing the date range (useful for debugging).\r\n     *\r\n     * @return A string representing the date range.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 57)",
        "(line 167,col 9)-(line 168,col 50)"
      ]
    }
  ]
}