{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/general/DatasetGroup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetGroup",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 120,
      "comment": "\r\n * A class that is used to group datasets (currently not used for any specific\r\n * purpose).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The group id. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetGroup.DatasetGroup()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\r\n     * Constructs a new group.\r\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 64,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetGroup.DatasetGroup(java.lang.String)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\r\n     * Creates a new group with the specified id.\r\n     * \r\n     * @param id  the identification for the group.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetGroup.getID()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns the identification string for this group.\r\n     * \r\n     * @return The identification string.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetGroup.clone()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Clones the group.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException not by this class.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetGroup.equals(java.lang.Object)",
      "begin_line": 106,
      "end_line": 118,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 47)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    }
  ]
}