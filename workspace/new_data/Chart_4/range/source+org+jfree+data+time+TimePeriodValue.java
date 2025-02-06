{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/TimePeriodValue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimePeriodValue",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 192,
      "comment": "\r\n * Represents a time period and an associated value.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The time period. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The value associated with the time period. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValue.TimePeriodValue(org.jfree.data.time.TimePeriod, java.lang.Number)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value associated with the time period.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eperiod\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 29)",
        "(line 75,col 9)-(line 75,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValue.TimePeriodValue(org.jfree.data.time.TimePeriod, double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value associated with the time period.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eperiod\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.getPeriod()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the time period.\r\n     *\r\n     * @return The time period (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.getValue()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setValue(Number)\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.setValue(java.lang.Number)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\r\n     * Sets the value for this data item.\r\n     *\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getValue()\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.equals(java.lang.Object)",
      "begin_line": 129,
      "end_line": 149,
      "comment": "\r\n     * Tests this object for equality with the target object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 64)",
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.hashCode()",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 19)",
        "(line 158,col 9)-(line 158,col 68)",
        "(line 159,col 9)-(line 159,col 80)",
        "(line 160,col 9)-(line 160,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.clone()",
      "begin_line": 171,
      "end_line": 180,
      "comment": "\r\n     * Clones the object.\r\n     * \u003cP\u003e\r\n     * Note: no need to clone the period or value since they are immutable\r\n     * classes.\r\n     *\r\n     * @return A clone.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 28)",
        "(line 173,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValue.toString()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns a string representing this instance, primarily for use in\r\n     * debugging.\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 73)"
      ]
    }
  ]
}