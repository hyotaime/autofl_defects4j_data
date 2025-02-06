{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/internal/StringUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 277,
      "comment": "\n * A minimal String utility class. Designed for internal jsoup use only.\n "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 17,
      "end_line": 19,
      "comment": " memoised padding up to 21"
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.join(java.util.Collection, java.lang.String)",
      "begin_line": 27,
      "end_line": 29,
      "comment": "\n     * Join a collection of strings by a separator\n     * @param strings collection of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     ",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.join(java.util.Iterator, java.lang.String)",
      "begin_line": 37,
      "end_line": 51,
      "comment": "\n     * Join a collection of strings by a separator\n     * @param strings iterator of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 39,col 22)",
        "(line 41,col 9)-(line 41,col 49)",
        "(line 42,col 9)-(line 43,col 25)",
        "(line 45,col 9)-(line 45,col 68)",
        "(line 46,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.join(java.lang.String[], java.lang.String)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Join an array of strings by a separator\n     * @param strings collection of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.padding(int)",
      "begin_line": 68,
      "end_line": 78,
      "comment": "\n     * Returns space padding\n     * @param width amount of padding desired\n     * @return string of spaces * width\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 70,col 68)",
        "(line 72,col 9)-(line 73,col 34)",
        "(line 74,col 9)-(line 74,col 37)",
        "(line 75,col 9)-(line 76,col 25)",
        "(line 77,col 9)-(line 77,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.isBlank(java.lang.String)",
      "begin_line": 85,
      "end_line": 95,
      "comment": "\n     * Tests if a string is blank: null, empty, or only whitespace (\" \", \\r\\n, \\t, etc)\n     * @param string string to test\n     * @return if string is blank\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 24)",
        "(line 89,col 9)-(line 89,col 32)",
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.isNumeric(java.lang.String)",
      "begin_line": 102,
      "end_line": 112,
      "comment": "\n     * Tests if a string is numeric, i.e. contains only digit characters\n     * @param string string to test\n     * @return true if only digit chars, false if empty or null or contains non-digit chars\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 104,col 25)",
        "(line 106,col 9)-(line 106,col 32)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.isWhitespace(int)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Tests if a code point is \"whitespace\" as defined in the HTML spec. Used for output HTML.\n     * @param c code point to test\n     * @return true if code point is whitespace, false otherwise\n     * @see #isActuallyWhitespace(int)\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.isActuallyWhitespace(int)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Tests if a code point is \"whitespace\" as defined by what it looks like. Used for Element.text etc.\n     * @param c code point to test\n     * @return true if code point is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.isInvisibleChar(int)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.normaliseWhitespace(java.lang.String)",
      "begin_line": 145,
      "end_line": 149,
      "comment": "\n     * Normalise the whitespace within this string; multiple spaces collapse to a single, and all whitespace characters\n     * (e.g. newline, tab) convert to a simple space\n     * @param string content to normalise\n     * @return normalised string\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 54)",
        "(line 147,col 9)-(line 147,col 54)",
        "(line 148,col 9)-(line 148,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.appendNormalisedWhitespace(java.lang.StringBuilder, java.lang.String, boolean)",
      "begin_line": 157,
      "end_line": 177,
      "comment": "\n     * After normalizing the whitespace within a string, appends it to a string builder.\n     * @param accum builder to append to\n     * @param string string to normalize whitespace within\n     * @param stripLeading set to true if you wish to remove any leading whitespace\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 37)",
        "(line 159,col 9)-(line 159,col 40)",
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 14)",
        "(line 163,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.in(java.lang.String, java.lang.String...)",
      "begin_line": 179,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 40)",
        "(line 181,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.inSorted(java.lang.String, java.lang.String[])",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.resolve(java.net.URL, java.lang.String)",
      "begin_line": 199,
      "end_line": 208,
      "comment": "\n     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.\n     * @param base the existing absolute base URL\n     * @param relUrl the relative URL to resolve. (If it\u0027s already absolute, it will be returned)\n     * @return the resolved absolute URL\n     * @throws MalformedURLException if an error occurred generating the URL\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 202,col 45)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.resolve(java.lang.String, java.lang.String)",
      "begin_line": 216,
      "end_line": 230,
      "comment": "\n     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.\n     * @param baseUrl the existing absolute base URL\n     * @param relUrl the relative URL to resolve. (If it\u0027s already absolute, it will be returned)\n     * @return an absolute URL if one was able to be generated, or the empty string if not\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 17)",
        "(line 218,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "builders"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.borrowBuilder()",
      "begin_line": 242,
      "end_line": 248,
      "comment": "\n     * Maintains cached StringBuilders in a flyweight pattern, to minimize new StringBuilder GCs. The StringBuilder is\n     * prevented from growing too large.\n     * \u003cp\u003e\n     * Care must be taken to release the builder once its work has been completed, with {@see #releaseBuilder}\n     * @return an empty StringBuilder\n     * @\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.StringUtil.releaseBuilder(java.lang.StringBuilder)",
      "begin_line": 256,
      "end_line": 273,
      "comment": "\n     * Release a borrowed builder. Care must be taken not to use the builder after it has been returned, as its\n     * contents may be changed by this method, or by a concurrent thread.\n     * @param sb the StringBuilder to release.\n     * @return the string value of the released String Builder (as an incentive to release it!).\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 29)",
        "(line 258,col 9)-(line 258,col 38)",
        "(line 260,col 9)-(line 263,col 38)",
        "(line 265,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MaxCachedBuilderSize"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MaxIdleBuilders"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    }
  ]
}