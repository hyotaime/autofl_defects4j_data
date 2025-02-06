{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/StringEscapeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringEscapeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 860,
      "comment": "\n * \u003cp\u003eEscapes and unescapes \u003ccode\u003eString\u003c/code\u003es for\n * Java, Java Script, HTML, XML, and SQL.\u003c/p\u003e\n *\n * @author Apache Jakarta Turbine\n * @author Purple Technology\n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author Antony Riley\n * @author Helge Tesgaard\n * @author \u003ca href\u003d\"sean@boohai.com\"\u003eSean Brown\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Phil Steitz\n * @author Pete Gieser\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CSV_DELIMITER"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE_STR"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_SEARCH_CHARS"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.StringEscapeUtils.StringEscapeUtils()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eStringEscapeUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eInstead, the class should be used as:\n     * \u003cpre\u003eStringEscapeUtils.escapeJava(\"foo\");\u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 59,col 7)-(line 59,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJava(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using Java String rules.\u003c/p\u003e\n     *\n     * \u003cp\u003eDeals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and JavaScript strings\n     * is that in JavaScript, a single quote must be escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param str  String to escape values in, may be null\n     * @return String with escaped values, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJava(java.io.Writer, java.lang.String)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using Java String rules to\n     * a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #escapeJava(java.lang.String)\n     * @param out  Writer to write escaped string into\n     * @param str  String to escape values in, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(java.lang.String)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using JavaScript String rules.\u003c/p\u003e\n     * \u003cp\u003eEscapes any values it finds into their JavaScript String form.\n     * Deals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and JavaScript strings\n     * is that in JavaScript, a single quote must be escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\\\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param str  String to escape values in, may be null\n     * @return String with escaped values, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(java.io.Writer, java.lang.String)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using JavaScript String rules\n     * to a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #escapeJavaScript(java.lang.String)\n     * @param out  Writer to write escaped string into\n     * @param str  String to escape values in, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     *",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(java.lang.String, boolean)",
      "begin_line": 153,
      "end_line": 166,
      "comment": "\n     * \u003cp\u003eWorker method for the {@link #escapeJavaScript(String)} method.\u003c/p\u003e\n     * \n     * @param str String to escape values in, may be null\n     * @param escapeSingleQuotes escapes single quotes if \u003ccode\u003etrue\u003c/code\u003e\n     * @return the escaped string\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(java.io.Writer, java.lang.String, boolean)",
      "begin_line": 176,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eWorker method for the {@link #escapeJavaScript(String)} method.\u003c/p\u003e\n     * \n     * @param out write to receieve the escaped string\n     * @param str String to escape values in, may be null\n     * @param escapeSingleQuote escapes single quotes if \u003ccode\u003etrue\u003c/code\u003e\n     * @throws IOException if an IOException occurs\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 15)",
        "(line 184,col 9)-(line 184,col 26)",
        "(line 185,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.hex(char)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * \u003cp\u003eReturns an upper case hexadecimal \u003ccode\u003eString\u003c/code\u003e for the given\n     * character.\u003c/p\u003e\n     * \n     * @param ch The character to convert.\n     * @return An upper case hexadecimal \u003ccode\u003eString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJava(java.lang.String)",
      "begin_line": 273,
      "end_line": 286,
      "comment": "\n     * \u003cp\u003eUnescapes any Java literals found in the \u003ccode\u003eString\u003c/code\u003e.\n     * For example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027n\u0027\u003c/code\u003e into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e\n     * is preceded by another \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJava(java.io.Writer, java.lang.String)",
      "begin_line": 303,
      "end_line": 385,
      "comment": "\n     * \u003cp\u003eUnescapes any Java literals found in the \u003ccode\u003eString\u003c/code\u003e to a\n     * \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027n\u0027\u003c/code\u003e into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e\n     * is preceded by another \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @param out  the \u003ccode\u003eWriter\u003c/code\u003e used to output unescaped characters\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 30)",
        "(line 311,col 9)-(line 311,col 51)",
        "(line 312,col 9)-(line 312,col 33)",
        "(line 313,col 9)-(line 313,col 34)",
        "(line 314,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(java.lang.String)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * \u003cp\u003eUnescapes any JavaScript literals found in the \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and \u003ccode\u003e\u0027n\u0027\u003c/code\u003e\n     * into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e is preceded by another\n     * \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @see #unescapeJava(String)\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return A new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(java.io.Writer, java.lang.String)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n     * \u003cp\u003eUnescapes any JavaScript literals found in the \u003ccode\u003eString\u003c/code\u003e to a\n     * \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and \u003ccode\u003e\u0027n\u0027\u003c/code\u003e\n     * into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e is preceded by another\n     * \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #unescapeJava(Writer,String)\n     * @param out  the \u003ccode\u003eWriter\u003c/code\u003e used to output unescaped characters\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeHtml(java.lang.String)",
      "begin_line": 450,
      "end_line": 464,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using HTML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * For example:\n     * \u003c/p\u003e \n     * \u003cp\u003e\u003ccode\u003e\"bread\" \u0026 \"butter\"\u003c/code\u003e\u003c/p\u003e\n     * becomes:\n     * \u003cp\u003e\n     * \u003ccode\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports all known HTML 4.0 entities, including funky accents.\n     * Note that the commonly used apostrophe escape character (\u0026amp;apos;)\n     * is not a legal entity and so is not supported). \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * \n     * @see #unescapeHtml(String)\n     * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeHtml(java.io.Writer, java.lang.String)",
      "begin_line": 495,
      "end_line": 503,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using HTML entities and writes\n     * them to a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * For example:\n     * \u003c/p\u003e \n     * \u003ccode\u003e\"bread\" \u0026 \"butter\"\u003c/code\u003e\n     * \u003cp\u003ebecomes:\u003c/p\u003e\n     * \u003ccode\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/code\u003e.\n     *\n     * \u003cp\u003eSupports all known HTML 4.0 entities, including funky accents.\n     * Note that the commonly used apostrophe escape character (\u0026amp;apos;)\n     * is not a legal entity and so is not supported). \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the escaped string, not null\n     * @param string  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from\n     *                                       calls to the {@link Writer#write(int)} methods.\n     * \n     * @see #escapeHtml(String)\n     * @see #unescapeHtml(String)\n     * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeHtml(java.lang.String)",
      "begin_line": 522,
      "end_line": 536,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports HTML 4.0 entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, the string \"\u0026amp;lt;Fran\u0026amp;ccedil;ais\u0026amp;gt;\"\n     * will become \"\u0026lt;Fran\u0026ccedil;ais\u0026gt;\"\u003c/p\u003e\n     *\n     * \u003cp\u003eIf an entity is unrecognized, it is left alone, and inserted\n     * verbatim into the result string. e.g. \"\u0026amp;gt;\u0026amp;zzzz;x\" will\n     * become \"\u0026gt;\u0026amp;zzzz;x\".\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #escapeHtml(Writer, String)\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeHtml(java.io.Writer, java.lang.String)",
      "begin_line": 556,
      "end_line": 564,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports HTML 4.0 entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, the string \"\u0026amp;lt;Fran\u0026amp;ccedil;ais\u0026amp;gt;\"\n     * will become \"\u0026lt;Fran\u0026ccedil;ais\u0026gt;\"\u003c/p\u003e\n     *\n     * \u003cp\u003eIf an entity is unrecognized, it is left alone, and inserted\n     * verbatim into the result string. e.g. \"\u0026amp;gt;\u0026amp;zzzz;x\" will\n     * become \"\u0026gt;\u0026amp;zzzz;x\".\u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param string  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if an IOException occurs\n     * @see #escapeHtml(String)\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeXml(java.io.Writer, java.lang.String)",
      "begin_line": 586,
      "end_line": 594,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using XML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example: \u003ctt\u003e\"bread\" \u0026 \"butter\"\u003c/tt\u003e \u003d\u003e\n     * \u003ctt\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that unicode characters greater than 0x7f are currently escaped to \n     *    their numerical \\\\u equivalent. This may change in future releases. \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if there is a problem writing\n     * @see #unescapeXml(java.lang.String)\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeXml(java.lang.String)",
      "begin_line": 613,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using XML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example: \u003ctt\u003e\"bread\" \u0026 \"butter\"\u003c/tt\u003e \u003d\u003e\n     * \u003ctt\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that unicode characters greater than 0x7f are currently escaped to \n     *    their numerical \\\\u equivalent. This may change in future releases. \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #unescapeXml(java.lang.String)\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeXml(java.io.Writer, java.lang.String)",
      "begin_line": 638,
      "end_line": 646,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing XML entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes.\u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that numerical \\\\u unicode codes are unescaped to their respective \n     *    unicode characters. This may change in future releases. \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if there is a problem writing\n     * @see #escapeXml(String)\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeXml(java.lang.String)",
      "begin_line": 663,
      "end_line": 668,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing XML entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes.\u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that numerical \\\\u unicode codes are unescaped to their respective \n     *    unicode characters. This may change in future releases. \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #escapeXml(String)\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeSql(java.lang.String)",
      "begin_line": 689,
      "end_line": 694,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e to be suitable to pass to\n     * an SQL query.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003cpre\u003estatement.executeQuery(\"SELECT * FROM MOVIES WHERE TITLE\u003d\u0027\" + \n     *   StringEscapeUtils.escapeSql(\"McHale\u0027s Navy\") + \n     *   \"\u0027\");\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAt present, this method only turns single-quotes into doubled single-quotes\n     * (\u003ccode\u003e\"McHale\u0027s Navy\"\u003c/code\u003e \u003d\u003e \u003ccode\u003e\"McHale\u0027\u0027s Navy\"\u003c/code\u003e). It does not\n     * handle the cases of percent (%) or underscore (_) for use in LIKE clauses.\u003c/p\u003e\n     *\n     * see http://www.jguru.com/faq/view.jsp?EID\u003d8881\n     * @param str  the string to escape, may be null\n     * @return a new String, escaped for SQL, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeCsv(java.lang.String)",
      "begin_line": 720,
      "end_line": 733,
      "comment": "\n     * \u003cp\u003eReturns a \u003ccode\u003eString\u003c/code\u003e value for a CSV column enclosed in double quotes,\n     * if required.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value contains a comma, newline or double quote, then the\n     *    String value is returned enclosed in double quotes.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote characters in the value are escaped with another double quote.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value does not contain a comma, newline or double quote, then the\n     *    String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param str the input CSV column String, may be null\n     * @return the input String, enclosed in double quotes if the value contains a comma,\n     * newline or double quote, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeCsv(java.io.Writer, java.lang.String)",
      "begin_line": 758,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003eWrites a \u003ccode\u003eString\u003c/code\u003e value for a CSV column enclosed in double quotes,\n     * if required.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value contains a comma, newline or double quote, then the\n     *    String value is written enclosed in double quotes.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote characters in the value are escaped with another double quote.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value does not contain a comma, newline or double quote, then the\n     *    String value is written unchanged (null values are ignored).\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param str the input CSV column String, may be null\n     * @param out Writer to write input string to, enclosed in double quotes if it contains\n     * a comma, newline or double quote\n     * @throws IOException if error occurs on underlying Writer\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 765,col 29)",
        "(line 766,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 773,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeCsv(java.lang.String)",
      "begin_line": 798,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eReturns a \u003ccode\u003eString\u003c/code\u003e value for an unescaped CSV column. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is enclosed in double quotes, and contains a comma, newline \n     *    or double quote, then quotes are removed. \n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote escaped characters (a pair of double quotes) are unescaped \n     *    to just one double quote. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is not enclosed in double quotes, or is and does not contain a \n     *    comma, newline or double quote, then the String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param str the input CSV column String, may be null\n     * @return the input String, with enclosing double quotes removed and embedded double \n     * quotes unescaped, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 810,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeCsv(java.io.Writer, java.lang.String)",
      "begin_line": 836,
      "end_line": 858,
      "comment": "\n     * \u003cp\u003eReturns a \u003ccode\u003eString\u003c/code\u003e value for an unescaped CSV column. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is enclosed in double quotes, and contains a comma, newline \n     *    or double quote, then quotes are removed. \n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote escaped characters (a pair of double quotes) are unescaped \n     *    to just one double quote. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is not enclosed in double quotes, or is and does not contain a \n     *    comma, newline or double quote, then the String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param str the input CSV column String, may be null\n     * @param out Writer to write the input String to, with enclosing double quotes \n     * removed and embedded double quotes unescaped, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @throws IOException if error occurs on underlying Writer\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 847,col 9)",
        "(line 850,col 9)-(line 850,col 62)",
        "(line 852,col 9)-(line 855,col 9)",
        "(line 857,col 9)-(line 857,col 23)"
      ]
    }
  ]
}