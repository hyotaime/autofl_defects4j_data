{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/Rotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Rotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 157,
      "comment": "\n * Represents a direction of rotation (\u003ccode\u003eCLOCKWISE\u003c/code\u003e or \n * \u003ccode\u003eANTICLOCKWISE\u003c/code\u003e).\n * @author David Gilbert\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "CLOCKWISE"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " Clockwise. "
    },
    {
      "type": "field",
      "varNames": [
        "ANTICLOCKWISE"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " The reverse order renders the primary dataset first. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The name. "
    },
    {
      "type": "field",
      "varNames": [
        "factor"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " \n     * The factor (-1.0 for \u003ccode\u003eCLOCKWISE\u003c/code\u003e and 1.0 for \n     * \u003ccode\u003eANTICLOCKWISE\u003c/code\u003e). \n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.Rotation.Rotation(java.lang.String, double)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     * @param factor  the rotation factor.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Rotation.toString()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return the string (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Rotation.getFactor()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns the rotation factor, which is -1.0 for \u003ccode\u003eCLOCKWISE\u003c/code\u003e \n     * and 1.0 for \u003ccode\u003eANTICLOCKWISE\u003c/code\u003e.\n     * \n     * @return the rotation factor.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Rotation.equals(java.lang.Object)",
      "begin_line": 113,
      "end_line": 128,
      "comment": "\n     * Compares this object for equality with an other object.\n     * Implementation note: This simply compares the factor instead\n     * of the name.\n     *\n     * @param o the other object\n     * @return true or false\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 47)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Rotation.hashCode()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 63)",
        "(line 137,col 9)-(line 137,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Rotation.readResolve()",
      "begin_line": 147,
      "end_line": 155,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     * \n     * @return the object.\n     * \n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 20)"
      ]
    }
  ]
}