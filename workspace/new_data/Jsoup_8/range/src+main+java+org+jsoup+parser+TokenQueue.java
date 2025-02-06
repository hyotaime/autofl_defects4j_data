{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/parser/TokenQueue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TokenQueue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 399,
      "comment": "\n * A character queue with parsing helpers.\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "field",
      "varNames": [
        "queue"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESC"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": " escape char for chomp balanced."
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.TokenQueue.TokenQueue(java.lang.String)",
      "begin_line": 20,
      "end_line": 23,
      "comment": "\n     Create a new TokenQueue.\n     @param data string of data to back queue.\n     ",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 31)",
        "(line 22,col 9)-(line 22,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.isEmpty()",
      "begin_line": 29,
      "end_line": 31,
      "comment": "\n     * Is the queue empty?\n     * @return true if no data left in queue.\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.remainingLength()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.peek()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Retrieves but does not remove the first character from the queue.\n     * @return First character, or null if empty.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.addFirst(java.lang.Character)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     Add a character to the start of the queue (will be the next character retrieved).\n     @param c character to add\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.addFirst(java.lang.String)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     Add a string to the start of the queue.\n     @param seq string to add.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 43)",
        "(line 60,col 9)-(line 60,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matches(java.lang.String)",
      "begin_line": 68,
      "end_line": 78,
      "comment": "\n     * Tests if the next characters on the queue match the sequence. Case insensitive.\n     * @param seq String to check queue for.\n     * @return true if the next characters match.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 33)",
        "(line 70,col 9)-(line 71,col 25)",
        "(line 73,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesCS(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Case sensitive match test.\n     * @param seq\n     * @return\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesAny(java.lang.String...)",
      "begin_line": 95,
      "end_line": 101,
      "comment": "\n     Tests if the next characters match any of the sequences. Case insensitive.\n     @param seq\n     @return\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesAny(char...)",
      "begin_line": 103,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 25)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesStartTag()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchChomp(java.lang.String)",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\n     * Tests if the queue matches the sequence (as with match), and if they do, removes the matched string from the\n     * queue.\n     * @param seq String to search for, and if found, remove from queue.\n     * @return true if found and removed, false if not found.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesWhitespace()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     Tests if queue starts with a whitespace character.\n     @return if starts with whitespace\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesWord()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     Test if the queue matches a word character (letter or digit).\n     @return if matches a word character\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.advance()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Drops the next character off the queue.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consume()",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * Consume one character off queue.\n     * @return first character on queue.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 40)",
        "(line 163,col 9)-(line 163,col 14)",
        "(line 164,col 9)-(line 164,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consume(java.lang.String)",
      "begin_line": 174,
      "end_line": 182,
      "comment": "\n     * Consumes the supplied sequence of the queue. If the queue does not start with the supplied sequence, will\n     * throw an illegal state exception -- but you should be running match() against that condition.\n     \u003cp\u003e\n     Case insensitive.\n     * @param seq sequence to remove from head of queue.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 176,col 85)",
        "(line 177,col 9)-(line 177,col 31)",
        "(line 178,col 9)-(line 179,col 89)",
        "(line 181,col 9)-(line 181,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeTo(java.lang.String)",
      "begin_line": 189,
      "end_line": 198,
      "comment": "\n     * Pulls a string off the queue, up to but exclusive of the match sequence, or to the queue running out.\n     * @param seq String to end on (and not include in return, but leave on queue). \u003cb\u003eCase sensitive.\u003c/b\u003e\n     * @return The matched data consumed from queue.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 45)",
        "(line 191,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeToIgnoreCase(java.lang.String)",
      "begin_line": 200,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 24)",
        "(line 202,col 9)-(line 202,col 43)",
        "(line 203,col 9)-(line 203,col 74)",
        "(line 204,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 50)",
        "(line 219,col 9)-(line 219,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeToAny(java.lang.String...)",
      "begin_line": 229,
      "end_line": 237,
      "comment": " is is a case sensitive time...",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 24)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 50)",
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompTo(java.lang.String)",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\n     * Pulls a string off the queue (like consumeTo), and then pulls off the matched string (but does not return it).\n     * \u003cp\u003e\n     * If the queue runs out of characters before finding the seq, will return as much as it can (and queue will go\n     * isEmpty() \u003d\u003d true).\n     * @param seq String to match up to, and not include in return, and to pull off queue. \u003cb\u003eCase sensitive.\u003c/b\u003e\n     * @return Data matched from queue.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 37)",
        "(line 249,col 9)-(line 249,col 24)",
        "(line 250,col 9)-(line 250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompToIgnoreCase(java.lang.String)",
      "begin_line": 253,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 47)",
        "(line 255,col 9)-(line 255,col 24)",
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompBalanced(java.lang.Character, java.lang.Character)",
      "begin_line": 268,
      "end_line": 288,
      "comment": "\n     * Pulls a balanced string off the queue. E.g. if queue is \"(one (two) three) four\", (,) will return \"one (two) three\",\n     * and leave \" four\" on the queue. Unbalanced openers and closers can be escaped (with \\). Those escapes will be left\n     * in the returned string, which is suitable for regexes (where we need to preserve the escape), but unsuitable for\n     * contains text strings; use unescape for that.\n     * @param open opener\n     * @param close closer\n     * @return data matched from the queue\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 50)",
        "(line 270,col 9)-(line 270,col 22)",
        "(line 271,col 9)-(line 271,col 30)",
        "(line 273,col 9)-(line 286,col 28)",
        "(line 287,col 9)-(line 287,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.unescape(java.lang.String)",
      "begin_line": 295,
      "end_line": 308,
      "comment": "\n     * Unescaped a \\ escaped string.\n     * @param in backslash escaped string\n     * @return unescaped string\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 48)",
        "(line 297,col 9)-(line 297,col 30)",
        "(line 298,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeWhitespace()",
      "begin_line": 313,
      "end_line": 320,
      "comment": "\n     * Pulls the next run of whitespace characters of the queue.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 29)",
        "(line 315,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeWord()",
      "begin_line": 326,
      "end_line": 331,
      "comment": "\n     * Retrieves the next run of word type (letter or digit) off the queue.\n     * @return String of word characters from queue, or empty string if none.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 24)",
        "(line 328,col 9)-(line 329,col 18)",
        "(line 330,col 9)-(line 330,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeTagName()",
      "begin_line": 338,
      "end_line": 344,
      "comment": "\n     * Consume an tag name off the queue (word or :, _, -)\n     * \n     * @return tag name\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 24)",
        "(line 340,col 9)-(line 341,col 18)",
        "(line 343,col 9)-(line 343,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeElementSelector()",
      "begin_line": 351,
      "end_line": 357,
      "comment": "\n     * Consume a CSS element selector (tag name, but | instead of : for namespaces, to not conflict with :pseudo selects).\n     * \n     * @return tag name\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 24)",
        "(line 353,col 9)-(line 354,col 18)",
        "(line 356,col 9)-(line 356,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeCssIdentifier()",
      "begin_line": 364,
      "end_line": 370,
      "comment": "\n     Consume a CSS identifier (ID or class) off the queue (letter, digit, -, _)\n     http://www.w3.org/TR/CSS2/syndata.html#value-def-identifier\n     @return identifier\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 24)",
        "(line 366,col 9)-(line 367,col 18)",
        "(line 369,col 9)-(line 369,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeAttributeKey()",
      "begin_line": 376,
      "end_line": 382,
      "comment": "\n     Consume an attribute key off the queue (letter, digit, -, _, :\")\n     @return attribute key\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 24)",
        "(line 378,col 9)-(line 379,col 18)",
        "(line 381,col 9)-(line 381,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.remainder()",
      "begin_line": 388,
      "end_line": 394,
      "comment": "\n     Consume and return whatever is left on the queue.\n     @return remained of queue.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 50)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.toString()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 36)"
      ]
    }
  ]
}