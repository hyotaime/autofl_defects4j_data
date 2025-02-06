{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/ObjectList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectList",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.AbstractObjectList"
      ],
      "begin_line": 53,
      "end_line": 110,
      "comment": "\n * A list of objects that can grow as required.\n * \u003cp\u003e\n * When cloning, the objects in the list are NOT cloned, only the references. \n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ObjectList.ObjectList()",
      "begin_line": 58,
      "end_line": 59,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ObjectList.ObjectList(int)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Creates a new list.\n     * \n     * @param initialCapacity  the initial capacity.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectList.get(int)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "          \n     * Returns the object at the specified index, if there is one, or \n     * \u003ccode\u003enull\u003c/code\u003e.         \n     *   \n     * @param index  the object index.   \n     *   \n     * @return The object or \u003ccode\u003enull\u003c/code\u003e.          \n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectList.set(int, java.lang.Object)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "          \n     * Sets an object reference (overwriting any existing object).       \n     *   \n     * @param index  the object index.   \n     * @param object  the object (\u003ccode\u003enull\u003c/code\u003e permitted).          \n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectList.indexOf(java.lang.Object)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "          \n     * Returns the index of the specified object, or -1 if the object is not \n     * in the list.        \n     *   \n     * @param object  the object.        \n     *   \n     * @return The index or -1.          \n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 37)"
      ]
    }
  ]
}