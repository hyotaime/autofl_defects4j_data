{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/helper/StringUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 239,
      "comment": "\n * A minimal String utility class. Designed for internal jsoup use only.\n "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 14,
      "end_line": 16,
      "comment": " memoised padding up to 21"
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.join(java.util.Collection, java.lang.String)",
      "begin_line": 24,
      "end_line": 26,
      "comment": "\n     * Join a collection of strings by a separator\n     * @param strings collection of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     ",
      "child_ranges": [
        "(line 25,col 9)-(line 25,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.join(java.util.Iterator, java.lang.String)",
      "begin_line": 34,
      "end_line": 48,
      "comment": "\n     * Join a collection of strings by a separator\n     * @param strings iterator of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 36,col 22)",
        "(line 38,col 9)-(line 38,col 49)",
        "(line 39,col 9)-(line 40,col 25)",
        "(line 42,col 9)-(line 42,col 63)",
        "(line 43,col 9)-(line 46,col 9)",
        "(line 47,col 9)-(line 47,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.padding(int)",
      "begin_line": 55,
      "end_line": 65,
      "comment": "\n     * Returns space padding\n     * @param width amount of padding desired\n     * @return string of spaces * width\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 57,col 68)",
        "(line 59,col 9)-(line 60,col 34)",
        "(line 61,col 9)-(line 61,col 37)",
        "(line 62,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isBlank(java.lang.String)",
      "begin_line": 72,
      "end_line": 82,
      "comment": "\n     * Tests if a string is blank: null, empty, or only whitespace (\" \", \\r\\n, \\t, etc)\n     * @param string string to test\n     * @return if string is blank\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 24)",
        "(line 76,col 9)-(line 76,col 32)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isNumeric(java.lang.String)",
      "begin_line": 89,
      "end_line": 99,
      "comment": "\n     * Tests if a string is numeric, i.e. contains only digit characters\n     * @param string string to test\n     * @return true if only digit chars, false if empty or null or contains non-digit chars\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 25)",
        "(line 93,col 9)-(line 93,col 32)",
        "(line 94,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isWhitespace(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Tests if a code point is \"whitespace\" as defined in the HTML spec. Used for output HTML.\n     * @param c code point to test\n     * @return true if code point is whitespace, false otherwise\n     * @see #isActuallyWhitespace(int)\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isActuallyWhitespace(int)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Tests if a code point is \"whitespace\" as defined by what it looks like. Used for Element.text etc.\n     * @param c code point to test\n     * @return true if code point is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.normaliseWhitespace(java.lang.String)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "\n     * Normalise the whitespace within this string; multiple spaces collapse to a single, and all whitespace characters\n     * (e.g. newline, tab) convert to a simple space\n     * @param string content to normalise\n     * @return normalised string\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 54)",
        "(line 129,col 9)-(line 129,col 54)",
        "(line 130,col 9)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.appendNormalisedWhitespace(java.lang.StringBuilder, java.lang.String, boolean)",
      "begin_line": 139,
      "end_line": 159,
      "comment": "\n     * After normalizing the whitespace within a string, appends it to a string builder.\n     * @param accum builder to append to\n     * @param string string to normalize whitespace within\n     * @param stripLeading set to true if you wish to remove any leading whitespace\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 37)",
        "(line 141,col 9)-(line 141,col 40)",
        "(line 143,col 9)-(line 143,col 34)",
        "(line 144,col 9)-(line 144,col 14)",
        "(line 145,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.in(java.lang.String, java.lang.String...)",
      "begin_line": 161,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.inSorted(java.lang.String, java.lang.String[])",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.resolve(java.net.URL, java.lang.String)",
      "begin_line": 180,
      "end_line": 189,
      "comment": "\n     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.\n     * @param base the existing absolute base URL\n     * @param relUrl the relative URL to resolve. (If it\u0027s already absolute, it will be returned)\n     * @return the resolved absolute URL\n     * @throws MalformedURLException if an error occurred generating the URL\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 183,col 45)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.resolve(java.lang.String, java.lang.String)",
      "begin_line": 197,
      "end_line": 211,
      "comment": "\n     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.\n     * @param baseUrl the existing absolute base URL\n     * @param relUrl the relative URL to resolve. (If it\u0027s already absolute, it will be returned)\n     * @return an absolute URL if one was able to be generated, or the empty string if not\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 17)",
        "(line 199,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.stringBuilder()",
      "begin_line": 218,
      "end_line": 228,
      "comment": "\n     * Maintains a cached StringBuilder, to minimize new StringBuilder GCs. Prevents it from growing to big per thread.\n     * Care must be taken to not grab more than one in the same stack (not locked or mutexed or anything).\n     * @return an empty StringBuilder\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 45)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MaxCachedBuilderSize"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringLocal"
      ],
      "begin_line": 231,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.Anonymous-be9f5815-1124-4b26-b186-1c9f2191b0f4.initialValue()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 59)"
      ]
    }
  ]
}