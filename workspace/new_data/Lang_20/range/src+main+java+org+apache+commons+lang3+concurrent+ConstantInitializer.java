{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/ConstantInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstantInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e"
      ],
      "begin_line": 41,
      "end_line": 128,
      "comment": "\n * \u003cp\u003e\n * A very simple implementation of the {@link ConcurrentInitializer} interface\n * which always returns the same object.\n * \u003c/p\u003e\n * \u003cp\u003e\n * An instance of this class is passed a reference to an object when it is\n * constructed. The {@link #get()} method just returns this object. No\n * synchronization is required.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is useful for instance for unit testing or in cases where a\n * specific object has to be passed to an object which expects a\n * {@link ConcurrentInitializer}.\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n * @param \u003cT\u003e the type of the object managed by this initializer\n "
    },
    {
      "type": "field",
      "varNames": [
        "FMT_TO_STRING"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Constant for the format of the string representation. "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Stores the managed object. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializer.ConstantInitializer(T)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Creates a new instance of {@code ConstantInitializer} and initializes it\n     * with the object to be managed. The {@code get()} method will always\n     * return the object passed here. This class does not place any restrictions\n     * on the object. It may be \u003cb\u003enull\u003c/b\u003e, then {@code get()} will return\n     * \u003cb\u003enull\u003c/b\u003e, too.\n     *\n     * @param obj the object to be managed by this initializer\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializer.getObject()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Directly returns the object that was passed to the constructor. This is\n     * the same object as returned by {@code get()}. However, this method does\n     * not declare that it throws an exception.\n     *\n     * @return the object managed by this initializer\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializer.get()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns the object managed by this initializer. This implementation just\n     * returns the object passed to the constructor.\n     *\n     * @return the object managed by this initializer\n     * @throws ConcurrentException if an error occurs\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializer.hashCode()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Returns a hash code for this object. This implementation returns the hash\n     * code of the managed object.\n     *\n     * @return a hash code for this object\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializer.equals(java.lang.Object)",
      "begin_line": 103,
      "end_line": 114,
      "comment": "\n     * Compares this object with another one. This implementation returns\n     * \u003cb\u003etrue\u003c/b\u003e if and only if the passed in object is an instance of\n     * {@code ConstantInitializer} which refers to an object equals to the\n     * object managed by this instance.\n     *\n     * @param obj the object to compare to\n     * @return a flag whether the objects are equal\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 64)",
        "(line 113,col 9)-(line 113,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializer.toString()",
      "begin_line": 123,
      "end_line": 127,
      "comment": "\n     * Returns a string representation for this object. This string also\n     * contains a string representation of the object managed by this\n     * initializer.\n     *\n     * @return a string for this object\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 126,col 45)"
      ]
    }
  ]
}