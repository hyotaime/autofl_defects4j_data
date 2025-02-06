{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/tuple/Pair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cL, R\u003e",
        "java.lang.Comparable\u003corg.apache.commons.lang3.tuple.Pair\u003cL, R\u003e\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 177,
      "comment": "\n * \u003cp\u003eA pair consisting of two elements.\u003c/p\u003e\n * \n * \u003cp\u003eThis class is an abstract implementation defining the basic API.\n * It refers to the elements as \u0027left\u0027 and \u0027right\u0027. It also implements the\n * {@code Map.Entry} interface where the key is \u0027left\u0027 and the value is \u0027right\u0027.\u003c/p\u003e\n * \n * \u003cp\u003eSubclass implementations may be mutable or immutable.\n * However, there is no restriction on the type of the stored objects that may be stored.\n * If mutable objects are stored in the pair, then the pair itself effectively becomes mutable.\u003c/p\u003e\n *\n * @param \u003cL\u003e the left element type\n * @param \u003cR\u003e the right element type\n *\n * @since Lang 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.of(L, R)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * \u003cp\u003eObtains an immutable pair of from two objects inferring the generic types.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis factory allows the pair to be created using inference to\n     * obtain the generic types.\u003c/p\u003e\n     * \n     * @param \u003cL\u003e the left element type\n     * @param \u003cR\u003e the right element type\n     * @param left  the left element, may be null\n     * @param right  the right element, may be null\n     * @return a pair formed from the two parameters, not null\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.getLeft()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * \u003cp\u003eGets the left element from this pair.\u003c/p\u003e\n     * \n     * \u003cp\u003eWhen treated as a key-value pair, this is the key.\u003c/p\u003e\n     * \n     * @return the left element, may be null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.getRight()",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * \u003cp\u003eGets the right element from this pair.\u003c/p\u003e\n     * \n     * \u003cp\u003eWhen treated as a key-value pair, this is the value.\u003c/p\u003e\n     * \n     * @return the right element, may be null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.getKey()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * \u003cp\u003eGets the key from this pair.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method implements the {@code Map.Entry} interface returning the\n     * left element as the key.\u003c/p\u003e\n     * \n     * @return the left element as the key, may be null\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.getValue()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003eGets the value from this pair.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method implements the {@code Map.Entry} interface returning the\n     * right element as the value.\u003c/p\u003e\n     * \n     * @return the right element as the value, may be null\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.compareTo(org.apache.commons.lang3.tuple.Pair\u003cL, R\u003e)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * \u003cp\u003eCompares the pair based on the left element followed by the right element.\n     * The types must be {@code Comparable}.\u003c/p\u003e\n     * \n     * @param other  the other pair, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 116,col 7)-(line 117,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.equals(java.lang.Object)",
      "begin_line": 126,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003eCompares this pair to another based on the two elements.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to, null returns false\n     * @return true if the elements of the pair are equal\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.hashCode()",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eReturns a suitable hash code.\n     * The hash code follows the definition in {@code Map.Entry}.\u003c/p\u003e\n     * \n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 149,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.toString()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eReturns a String representation of this pair using the format {@code ($left,$right)}.\u003c/p\u003e\n     * \n     * @return a string describing this object, not null\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.Pair.toString(java.lang.String)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eFormats the receiver using the given format.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis uses {@link Formattable} to perform the formatting. Two variables may\n     * be used to embed the left and right elements. Use {@code %1$s} for the left\n     * element (key) and {@code %2$s} for the right element (value).\n     * The default format used by {@code toString()} is {@code (%1$s,%2$s)}.\u003c/p\u003e\n     * \n     * @param format  the format string, optionally containing {@code %1$s} and {@code %2$s}, not null\n     * @return the formatted string, not null\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 60)"
      ]
    }
  ]
}