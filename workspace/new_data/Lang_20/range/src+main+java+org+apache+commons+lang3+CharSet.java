{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/CharSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSet",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 278,
      "comment": "\n * \u003cp\u003eA set of characters.\u003c/p\u003e\n *\n * \u003cp\u003eInstances are immutable, but instances of subclasses may not be.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Required for serialization support. Lang version 2.0. \n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " \n     * A CharSet defining no characters. \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_ALPHA"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " \n     * A CharSet defining ASCII alphabetic characters \"a-zA-Z\".\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_ALPHA_LOWER"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " \n     * A CharSet defining ASCII alphabetic characters \"a-z\".\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_ALPHA_UPPER"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " \n     * A CharSet defining ASCII alphabetic characters \"A-Z\".\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_NUMERIC"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " \n     * A CharSet defining ASCII alphabetic characters \"0-9\".\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COMMON"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * A Map of the common cases used in the factory.\n     * Subclasses can add more common patterns if desired\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "set"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The set of CharRange objects. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.getInstance(java.lang.String...)",
      "begin_line": 138,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eFactory method to create a new CharSet using a special syntax.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code null} or empty string (\"\")\n     * - set containing no characters\u003c/li\u003e\n     *  \u003cli\u003eSingle character, such as \"a\"\n     *  - set containing just that character\u003c/li\u003e\n     *  \u003cli\u003eMulti character, such as \"a-e\"\n     *  - set containing characters from one character to the other\u003c/li\u003e\n     *  \u003cli\u003eNegated, such as \"^a\" or \"^a-e\"\n     *  - set containing all characters except those defined\u003c/li\u003e\n     *  \u003cli\u003eCombinations, such as \"abe-g\"\n     *  - set containing all the characters from the individual sets\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eThe matching order is:\u003c/p\u003e\n     * \u003col\u003e\n     *  \u003cli\u003eNegated multi character range, such as \"^a-e\"\n     *  \u003cli\u003eOrdinary multi character range, such as \"a-e\"\n     *  \u003cli\u003eNegated single character, such as \"^a\"\n     *  \u003cli\u003eOrdinary single character, such as \"a\"\n     * \u003c/ol\u003e\n     * \u003cp\u003eMatching works left to right. Once a match is found the\n     * search starts again from the next character.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the same range is defined twice using the same syntax, only\n     * one range will be kept.\n     * Thus, \"a-ca-c\" creates only one range of \"a-c\".\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the start and end of a range are in the wrong order,\n     * they are reversed. Thus \"a-e\" is the same as \"e-a\".\n     * As a result, \"a-ee-a\" would create only one range,\n     * as the \"a-e\" and \"e-a\" are the same.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe set of characters represented is the union of the specified ranges.\u003c/p\u003e\n     *\n     * \u003cp\u003eAll CharSet objects returned by this method will be immutable.\u003c/p\u003e\n     *\n     * @param setStrs  Strings to merge into the set, may be null\n     * @return a CharSet instance\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharSet.CharSet(java.lang.String...)",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003eConstructs a new CharSet using the set syntax.\n     * Each string is merged in with the set.\u003c/p\u003e\n     *\n     * @param set  Strings to merge into the initial set\n     * @throws NullPointerException if set is {@code null}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 16)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 162,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.add(java.lang.String)",
      "begin_line": 173,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eAdd a set definition string to the {@code CharSet}.\u003c/p\u003e\n     *\n     * @param str  set definition string\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 31)",
        "(line 179,col 9)-(line 179,col 20)",
        "(line 180,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.getCharRanges()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "public",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.contains(char)",
      "begin_line": 223,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eDoes the {@code CharSet} contain the specified\n     * character {@code ch}.\u003c/p\u003e\n     *\n     * @param ch  the character to check for\n     * @return {@code true} if the set contains the characters\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.equals(java.lang.Object)",
      "begin_line": 245,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eCompares two {@code CharSet} objects, returning true if they represent\n     * exactly the same set of characters defined in the same way.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe two sets {@code abc} and {@code a-c} are \u003ci\u003enot\u003c/i\u003e\n     * equal according to this method.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 38)",
        "(line 254,col 9)-(line 254,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.hashCode()",
      "begin_line": 263,
      "end_line": 266,
      "comment": "\n     * \u003cp\u003eGets a hash code compatible with the equals method.\u003c/p\u003e\n     *\n     * @return a suitable hash code\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.toString()",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eGets a string representation of the set.\u003c/p\u003e\n     *\n     * @return string representation of the set\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 30)"
      ]
    }
  ]
}