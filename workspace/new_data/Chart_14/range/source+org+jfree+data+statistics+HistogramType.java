{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/statistics/HistogramType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HistogramType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 147,
      "comment": "\r\n * A class for creating constants to represent the histogram type.  See Bloch\u0027s\r\n * enum tip in \u0027Effective Java\u0027.\r\n "
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
        "FREQUENCY"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": " Frequency histogram. "
    },
    {
      "type": "field",
      "varNames": [
        "RELATIVE_FREQUENCY"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": " Relative frequency. "
    },
    {
      "type": "field",
      "varNames": [
        "SCALE_AREA_TO_1"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": " Scale area to one. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The type name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.HistogramType.HistogramType(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": " \r\n     * Creates a new type.\r\n     * \r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramType.toString()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramType.equals(java.lang.Object)",
      "begin_line": 95,
      "end_line": 116,
      "comment": "\r\n     * Tests this type for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 46)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramType.hashCode()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramType.readResolve()",
      "begin_line": 134,
      "end_line": 145,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     * \r\n     * @return The object.\r\n     * \r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 20)"
      ]
    }
  ]
}