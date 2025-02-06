{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/AbstractObjectList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractObjectList",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 294,
      "comment": "\n * A list of objects that can grow as required.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_CAPACITY"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The default initial capacity of the list. "
    },
    {
      "type": "field",
      "varNames": [
        "objects"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Storage for the objects. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The current list size. "
    },
    {
      "type": "field",
      "varNames": [
        "increment"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The default increment. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.AbstractObjectList.AbstractObjectList()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Creates a new list with the default initial capacity.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.AbstractObjectList.AbstractObjectList(int)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Creates a new list.\n     *\n     * @param initialCapacity  the initial capacity.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.AbstractObjectList.AbstractObjectList(int, int)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Creates a new list.\n     * \n     * @param initialCapacity  the initial capacity.\n     * @param increment  the increment.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 51)",
        "(line 97,col 9)-(line 97,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.get(int)",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * Returns the object at the specified index, if there is one, or \n     * \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param index  the object index.\n     *\n     * @return The object or \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 29)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.set(int, java.lang.Object)",
      "begin_line": 122,
      "end_line": 133,
      "comment": "\n     * Sets an object reference (overwriting any existing object).\n     *\n     * @param index  the object index.\n     * @param object  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 37)",
        "(line 132,col 9)-(line 132,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.clear()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Clears the list.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 40)",
        "(line 140,col 9)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.size()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Returns the size of the list.\n     *\n     * @return The size of the list.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.indexOf(java.lang.Object)",
      "begin_line": 160,
      "end_line": 167,
      "comment": "\n     * Returns the index of the specified object, or -1 if the object is not in\n     * the list.\n     *\n     * @param object  the object.\n     *\n     * @return The index or -1.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.equals(java.lang.Object)",
      "begin_line": 176,
      "end_line": 198,
      "comment": "\n     * Tests this list for equality with another object.\n     *\n     * @param obj  the object to test.\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 60)",
        "(line 191,col 9)-(line 191,col 30)",
        "(line 192,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.hashCode()",
      "begin_line": 205,
      "end_line": 222,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return The hashcode.\n     ",
      "child_ranges": [
        "(line 206,col 6)-(line 206,col 22)",
        "(line 207,col 6)-(line 207,col 23)",
        "(line 208,col 6)-(line 208,col 53)",
        "(line 211,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.clone()",
      "begin_line": 233,
      "end_line": 243,
      "comment": "\n     * Clones the list of objects.  The objects in the list are not cloned, so \n     * this is method makes a \u0027shallow\u0027 copy of the list.\n     *\n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if an item in the list does not \n     *         support cloning.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 70)",
        "(line 236,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 252,
      "end_line": 269,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 36)",
        "(line 256,col 9)-(line 256,col 27)",
        "(line 257,col 9)-(line 257,col 31)",
        "(line 258,col 9)-(line 267,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.AbstractObjectList.readObject(java.io.ObjectInputStream)",
      "begin_line": 279,
      "end_line": 292,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 283,col 45)",
        "(line 284,col 9)-(line 284,col 37)",
        "(line 285,col 9)-(line 290,col 9)"
      ]
    }
  ]
}