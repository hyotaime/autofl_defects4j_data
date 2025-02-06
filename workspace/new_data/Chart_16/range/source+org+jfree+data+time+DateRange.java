{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/DateRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateRange",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.Range",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 141,
      "comment": "\r\n * A range specified in terms of two \u003ccode\u003ejava.util.Date\u003c/code\u003e objects.  \r\n * Instances of this class are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerDate"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The lower bound for the range. "
    },
    {
      "type": "field",
      "varNames": [
        "upperDate"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The upper bound for the range. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DateRange.DateRange()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DateRange.DateRange(java.util.Date, java.util.Date)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\r\n     * Constructs a new range.\r\n     *\r\n     * @param lower  the lower bound (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param upper  the upper bound (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 48)",
        "(line 82,col 9)-(line 82,col 31)",
        "(line 83,col 9)-(line 83,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DateRange.DateRange(double, double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\r\n     * Constructs a new range using two values that will be interpreted as \r\n     * \"milliseconds since midnight GMT, 1-Jan-1970\".\r\n     *\r\n     * @param lower  the lower (oldest) date.\r\n     * @param upper  the upper (most recent) date.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 28)",
        "(line 96,col 9)-(line 96,col 48)",
        "(line 97,col 9)-(line 97,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DateRange.DateRange(org.jfree.data.Range)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Constructs a new range that is based on another {@link Range}.  The \r\n     * other range does not have to be a {@link DateRange}.  If it is not, the \r\n     * upper and lower bounds are evaluated as milliseconds since midnight \r\n     * GMT, 1-Jan-1970.\r\n     *\r\n     * @param other  the other range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DateRange.getLowerDate()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the lower (earlier) date for the range.\r\n     *\r\n     * @return The lower date for the range.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DateRange.getUpperDate()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns the upper (later) date for the range.\r\n     *\r\n     * @return The upper date for the range.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DateRange.toString()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\r\n     * Returns a string representing the date range (useful for debugging).\r\n     * \r\n     * @return A string representing the date range.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 57)",
        "(line 137,col 9)-(line 138,col 46)"
      ]
    }
  ]
}