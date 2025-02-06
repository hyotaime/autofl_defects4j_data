{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/TimePeriodValue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimePeriodValue",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 181,
      "comment": "\r\n * Represents a time period and an associated value.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The time period. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The value associated with the time period. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValue.TimePeriodValue(org.jfree.data.time.TimePeriod, java.lang.Number)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value associated with the time period.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eperiod\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 29)",
        "(line 74,col 9)-(line 74,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValue.TimePeriodValue(org.jfree.data.time.TimePeriod, double)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value associated with the time period.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eperiod\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.getPeriod()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Returns the time period.\r\n     *\r\n     * @return The time period (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.getValue()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setValue(Number)\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.setValue(java.lang.Number)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Sets the value for this data item.\r\n     *\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getValue()\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.equals(java.lang.Object)",
      "begin_line": 128,
      "end_line": 148,
      "comment": "\r\n     * Tests this object for equality with the target object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 64)",
        "(line 138,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.hashCode()",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 19)",
        "(line 157,col 9)-(line 157,col 68)",
        "(line 158,col 9)-(line 158,col 80)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.clone()",
      "begin_line": 170,
      "end_line": 179,
      "comment": "\r\n     * Clones the object.\r\n     * \u003cP\u003e\r\n     * Note: no need to clone the period or value since they are immutable \r\n     * classes.\r\n     *\r\n     * @return A clone.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 28)",
        "(line 172,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 21)"
      ]
    }
  ]
}