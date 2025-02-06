{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/StringEscapeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringEscapeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 687,
      "comment": "\n * \u003cp\u003eEscapes and unescapes \u003ccode\u003eString\u003c/code\u003es for\n * Java, Java Script, HTML, XML, and SQL.\u003c/p\u003e\n *\n * @author Apache Jakarta Turbine\n * @author Purple Technology\n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author Antony Riley\n * @author Helge Tesgaard\n * @author \u003ca href\u003d\"sean@boohai.com\"\u003eSean Brown\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Phil Steitz\n * @author Pete Gieser\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.StringEscapeUtils.StringEscapeUtils()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eStringEscapeUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eInstead, the class should be used as:\n     * \u003cpre\u003eStringEscapeUtils.escapeJava(\"foo\");\u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 54,col 7)-(line 54,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJava(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using Java String rules.\u003c/p\u003e\n     *\n     * \u003cp\u003eDeals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and JavaScript strings\n     * is that in JavaScript, a single quote must be escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param str  String to escape values in, may be null\n     * @return String with escaped values, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJava(java.io.Writer, java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using Java String rules to\n     * a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #escapeJava(java.lang.String)\n     * @param out  Writer to write escaped string into\n     * @param str  String to escape values in, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(java.lang.String)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using JavaScript String rules.\u003c/p\u003e\n     * \u003cp\u003eEscapes any values it finds into their JavaScript String form.\n     * Deals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and JavaScript strings\n     * is that in JavaScript, a single quote must be escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\\\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param str  String to escape values in, may be null\n     * @return String with escaped values, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(java.io.Writer, java.lang.String)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using JavaScript String rules\n     * to a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #escapeJavaScript(java.lang.String)\n     * @param out  Writer to write escaped string into\n     * @param str  String to escape values in, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     *",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(java.lang.String, boolean)",
      "begin_line": 148,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eWorker method for the {@link #escapeJavaScript(String)} method.\u003c/p\u003e\n     * \n     * @param str String to escape values in, may be null\n     * @param escapeSingleQuotes escapes single quotes if \u003ccode\u003etrue\u003c/code\u003e\n     * @return the escaped string\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(java.io.Writer, java.lang.String, boolean)",
      "begin_line": 171,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eWorker method for the {@link #escapeJavaScript(String)} method.\u003c/p\u003e\n     * \n     * @param out write to receieve the escaped string\n     * @param str String to escape values in, may be null\n     * @param escapeSingleQuote escapes single quotes if \u003ccode\u003etrue\u003c/code\u003e\n     * @throws IOException if an IOException occurs\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 15)",
        "(line 179,col 9)-(line 179,col 26)",
        "(line 180,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.hex(char)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * \u003cp\u003eReturns an upper case hexadecimal \u003ccode\u003eString\u003c/code\u003e for the given\n     * character.\u003c/p\u003e\n     * \n     * @param ch The character to convert.\n     * @return An upper case hexadecimal \u003ccode\u003eString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJava(java.lang.String)",
      "begin_line": 264,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003eUnescapes any Java literals found in the \u003ccode\u003eString\u003c/code\u003e.\n     * For example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027n\u0027\u003c/code\u003e into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e\n     * is preceded by another \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJava(java.io.Writer, java.lang.String)",
      "begin_line": 294,
      "end_line": 376,
      "comment": "\n     * \u003cp\u003eUnescapes any Java literals found in the \u003ccode\u003eString\u003c/code\u003e to a\n     * \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027n\u0027\u003c/code\u003e into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e\n     * is preceded by another \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @param out  the \u003ccode\u003eWriter\u003c/code\u003e used to output unescaped characters\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 30)",
        "(line 302,col 9)-(line 302,col 51)",
        "(line 303,col 9)-(line 303,col 33)",
        "(line 304,col 9)-(line 304,col 34)",
        "(line 305,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(java.lang.String)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eUnescapes any JavaScript literals found in the \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and \u003ccode\u003e\u0027n\u0027\u003c/code\u003e\n     * into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e is preceded by another\n     * \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @see #unescapeJava(String)\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return A new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(java.io.Writer, java.lang.String)",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\n     * \u003cp\u003eUnescapes any JavaScript literals found in the \u003ccode\u003eString\u003c/code\u003e to a\n     * \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and \u003ccode\u003e\u0027n\u0027\u003c/code\u003e\n     * into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e is preceded by another\n     * \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #unescapeJava(Writer,String)\n     * @param out  the \u003ccode\u003eWriter\u003c/code\u003e used to output unescaped characters\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeHtml(java.lang.String)",
      "begin_line": 441,
      "end_line": 455,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using HTML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * For example:\n     * \u003c/p\u003e \n     * \u003cp\u003e\u003ccode\u003e\"bread\" \u0026 \"butter\"\u003c/code\u003e\u003c/p\u003e\n     * becomes:\n     * \u003cp\u003e\n     * \u003ccode\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports all known HTML 4.0 entities, including funky accents.\n     * Note that the commonly used apostrophe escape character (\u0026amp;apos;)\n     * is not a legal entity and so is not supported). \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * \n     * @see #unescapeHtml(String)\n     * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeHtml(java.io.Writer, java.lang.String)",
      "begin_line": 486,
      "end_line": 494,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using HTML entities and writes\n     * them to a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * For example:\n     * \u003c/p\u003e \n     * \u003ccode\u003e\"bread\" \u0026 \"butter\"\u003c/code\u003e\n     * \u003cp\u003ebecomes:\u003c/p\u003e\n     * \u003ccode\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/code\u003e.\n     *\n     * \u003cp\u003eSupports all known HTML 4.0 entities, including funky accents.\n     * Note that the commonly used apostrophe escape character (\u0026amp;apos;)\n     * is not a legal entity and so is not supported). \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the escaped string, not null\n     * @param string  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from\n     *                                       calls to the {@link Writer#write(int)} methods.\n     * \n     * @see #escapeHtml(String)\n     * @see #unescapeHtml(String)\n     * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeHtml(java.lang.String)",
      "begin_line": 513,
      "end_line": 527,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports HTML 4.0 entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, the string \"\u0026amp;lt;Fran\u0026amp;ccedil;ais\u0026amp;gt;\"\n     * will become \"\u0026lt;Fran\u0026ccedil;ais\u0026gt;\"\u003c/p\u003e\n     *\n     * \u003cp\u003eIf an entity is unrecognized, it is left alone, and inserted\n     * verbatim into the result string. e.g. \"\u0026amp;gt;\u0026amp;zzzz;x\" will\n     * become \"\u0026gt;\u0026amp;zzzz;x\".\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #escapeHtml(Writer, String)\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeHtml(java.io.Writer, java.lang.String)",
      "begin_line": 547,
      "end_line": 555,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports HTML 4.0 entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, the string \"\u0026amp;lt;Fran\u0026amp;ccedil;ais\u0026amp;gt;\"\n     * will become \"\u0026lt;Fran\u0026ccedil;ais\u0026gt;\"\u003c/p\u003e\n     *\n     * \u003cp\u003eIf an entity is unrecognized, it is left alone, and inserted\n     * verbatim into the result string. e.g. \"\u0026amp;gt;\u0026amp;zzzz;x\" will\n     * become \"\u0026gt;\u0026amp;zzzz;x\".\u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param string  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if an IOException occurs\n     * @see #escapeHtml(String)\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeXml(java.io.Writer, java.lang.String)",
      "begin_line": 577,
      "end_line": 585,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using XML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example: \u003ctt\u003e\"bread\" \u0026 \"butter\"\u003c/tt\u003e \u003d\u003e\n     * \u003ctt\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that unicode characters greater than 0x7f are currently escaped to \n     *    their numerical \\\\u equivalent. This may change in future releases. \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if there is a problem writing\n     * @see #unescapeXml(java.lang.String)\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeXml(java.lang.String)",
      "begin_line": 604,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using XML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example: \u003ctt\u003e\"bread\" \u0026 \"butter\"\u003c/tt\u003e \u003d\u003e\n     * \u003ctt\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that unicode characters greater than 0x7f are currently escaped to \n     *    their numerical \\\\u equivalent. This may change in future releases. \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #unescapeXml(java.lang.String)\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 608,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeXml(java.io.Writer, java.lang.String)",
      "begin_line": 629,
      "end_line": 637,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing XML entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes.\u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that numerical \\\\u unicode codes are unescaped to their respective \n     *    unicode characters. This may change in future releases. \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if there is a problem writing\n     * @see #escapeXml(String)\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeXml(java.lang.String)",
      "begin_line": 654,
      "end_line": 659,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing XML entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes.\u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that numerical \\\\u unicode codes are unescaped to their respective \n     *    unicode characters. This may change in future releases. \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #escapeXml(String)\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeSql(java.lang.String)",
      "begin_line": 680,
      "end_line": 685,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e to be suitable to pass to\n     * an SQL query.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003cpre\u003estatement.executeQuery(\"SELECT * FROM MOVIES WHERE TITLE\u003d\u0027\" + \n     *   StringEscapeUtils.escapeSql(\"McHale\u0027s Navy\") + \n     *   \"\u0027\");\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAt present, this method only turns single-quotes into doubled single-quotes\n     * (\u003ccode\u003e\"McHale\u0027s Navy\"\u003c/code\u003e \u003d\u003e \u003ccode\u003e\"McHale\u0027\u0027s Navy\"\u003c/code\u003e). It does not\n     * handle the cases of percent (%) or underscore (_) for use in LIKE clauses.\u003c/p\u003e\n     *\n     * see http://www.jguru.com/faq/view.jsp?EID\u003d8881\n     * @param str  the string to escape, may be null\n     * @return a new String, escaped for SQL, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 51)"
      ]
    }
  ]
}