{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/tuple/MutablePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutablePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.tuple.Pair\u003cL, R\u003e"
      ],
      "begin_line": 30,
      "end_line": 123,
      "comment": "\n * \u003cp\u003eA mutable pair consisting of two {@code Object} elements.\u003c/p\u003e\n * \n * \u003cp\u003eNot #ThreadSafe#\u003c/p\u003e\n *\n * @param \u003cL\u003e the left element type\n * @param \u003cR\u003e the right element type\n *\n * @since Lang 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Left object "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Right object "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutablePair.of(L, R)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * \u003cp\u003eObtains an immutable pair of from two objects inferring the generic types.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis factory allows the pair to be created using inference to\n     * obtain the generic types.\u003c/p\u003e\n     * \n     * @param \u003cL\u003e the left element type\n     * @param \u003cR\u003e the right element type\n     * @param left  the left element, may be null\n     * @param right  the right element, may be null\n     * @return a pair formed from the two parameters, not null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.tuple.MutablePair.MutablePair()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Create a new pair instance of two nulls.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.tuple.MutablePair.MutablePair(L, R)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Create a new pair instance.\n     *\n     * @param left  the left value, may be null\n     * @param right  the right value, may be null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutablePair.getLeft()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutablePair.setLeft(L)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Sets the left element of the pair.\n     * \n     * @param left  the new value of the left element, may be null\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutablePair.getRight()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutablePair.setRight(R)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Sets the right element of the pair.\n     * \n     * @param right  the new value of the right element, may be null\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutablePair.setValue(R)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Sets the {@code Map.Entry} value.\n     * This sets the right element of the pair.\n     * \n     * @param value  the right value to set, not null\n     * @return the old value for the right element\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 30)",
        "(line 119,col 9)-(line 119,col 24)",
        "(line 120,col 9)-(line 120,col 22)"
      ]
    }
  ]
}