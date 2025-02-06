{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/TokenQueue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TokenQueue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 404,
      "comment": "\n * A character queue with parsing helpers.\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "field",
      "varNames": [
        "queue"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESC"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": " escape char for chomp balanced."
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.TokenQueue.TokenQueue(java.lang.String)",
      "begin_line": 21,
      "end_line": 24,
      "comment": "\n     Create a new TokenQueue.\n     @param data string of data to back queue.\n     ",
      "child_ranges": [
        "(line 22,col 9)-(line 22,col 31)",
        "(line 23,col 9)-(line 23,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.isEmpty()",
      "begin_line": 30,
      "end_line": 32,
      "comment": "\n     * Is the queue empty?\n     * @return true if no data left in queue.\n     ",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.remainingLength()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.peek()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Retrieves but does not remove the first character from the queue.\n     * @return First character, or 0 if empty.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.addFirst(java.lang.Character)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     Add a character to the start of the queue (will be the next character retrieved).\n     @param c character to add\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.addFirst(java.lang.String)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     Add a string to the start of the queue.\n     @param seq string to add.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 43)",
        "(line 61,col 9)-(line 61,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matches(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Tests if the next characters on the queue match the sequence. Case insensitive.\n     * @param seq String to check queue for.\n     * @return true if the next characters match.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesCS(java.lang.String)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Case sensitive match test.\n     * @param seq string to case sensitively check for\n     * @return true if matched, false if not\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesAny(java.lang.String...)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     Tests if the next characters match any of the sequences. Case insensitive.\n     @param seq list of strings to case insensitively check for\n     @return true of any matched, false if none did\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesAny(char...)",
      "begin_line": 96,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 98,col 25)",
        "(line 100,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesStartTag()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchChomp(java.lang.String)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\n     * Tests if the queue matches the sequence (as with match), and if they do, removes the matched string from the\n     * queue.\n     * @param seq String to search for, and if found, remove from queue.\n     * @return true if found and removed, false if not found.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesWhitespace()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     Tests if queue starts with a whitespace character.\n     @return if starts with whitespace\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesWord()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     Test if the queue matches a word character (letter or digit).\n     @return if matches a word character\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.advance()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Drops the next character off the queue.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consume()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Consume one character off queue.\n     * @return first character on queue.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consume(java.lang.String)",
      "begin_line": 165,
      "end_line": 173,
      "comment": "\n     * Consumes the supplied sequence of the queue. If the queue does not start with the supplied sequence, will\n     * throw an illegal state exception -- but you should be running match() against that condition.\n     \u003cp\u003e\n     Case insensitive.\n     * @param seq sequence to remove from head of queue.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 85)",
        "(line 168,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 170,col 89)",
        "(line 172,col 9)-(line 172,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeTo(java.lang.String)",
      "begin_line": 180,
      "end_line": 189,
      "comment": "\n     * Pulls a string off the queue, up to but exclusive of the match sequence, or to the queue running out.\n     * @param seq String to end on (and not include in return, but leave on queue). \u003cb\u003eCase sensitive.\u003c/b\u003e\n     * @return The matched data consumed from queue.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 45)",
        "(line 182,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeToIgnoreCase(java.lang.String)",
      "begin_line": 191,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 24)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 194,col 9)-(line 194,col 74)",
        "(line 195,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeToAny(java.lang.String...)",
      "begin_line": 222,
      "end_line": 229,
      "comment": " is is a case sensitive time...",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 24)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompTo(java.lang.String)",
      "begin_line": 239,
      "end_line": 243,
      "comment": "\n     * Pulls a string off the queue (like consumeTo), and then pulls off the matched string (but does not return it).\n     * \u003cp\u003e\n     * If the queue runs out of characters before finding the seq, will return as much as it can (and queue will go\n     * isEmpty() \u003d\u003d true).\n     * @param seq String to match up to, and not include in return, and to pull off queue. \u003cb\u003eCase sensitive.\u003c/b\u003e\n     * @return Data matched from queue.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 37)",
        "(line 241,col 9)-(line 241,col 24)",
        "(line 242,col 9)-(line 242,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompToIgnoreCase(java.lang.String)",
      "begin_line": 245,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 47)",
        "(line 247,col 9)-(line 247,col 24)",
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompBalanced(char, char)",
      "begin_line": 260,
      "end_line": 293,
      "comment": "\n     * Pulls a balanced string off the queue. E.g. if queue is \"(one (two) three) four\", (,) will return \"one (two) three\",\n     * and leave \" four\" on the queue. Unbalanced openers and closers can be quoted (with \u0027 or \") or escaped (with \\). Those escapes will be left\n     * in the returned string, which is suitable for regexes (where we need to preserve the escape), but unsuitable for\n     * contains text strings; use unescape for that.\n     * @param open opener\n     * @param close closer\n     * @return data matched from the queue\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 23)",
        "(line 262,col 9)-(line 262,col 21)",
        "(line 263,col 9)-(line 263,col 22)",
        "(line 264,col 9)-(line 264,col 22)",
        "(line 265,col 9)-(line 265,col 32)",
        "(line 267,col 9)-(line 287,col 28)",
        "(line 288,col 9)-(line 288,col 73)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.unescape(java.lang.String)",
      "begin_line": 300,
      "end_line": 313,
      "comment": "\n     * Unescape a \\ escaped string.\n     * @param in backslash escaped string\n     * @return unescaped string\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 55)",
        "(line 302,col 9)-(line 302,col 22)",
        "(line 303,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeWhitespace()",
      "begin_line": 319,
      "end_line": 326,
      "comment": "\n     * Pulls the next run of whitespace characters of the queue.\n     * @return Whether consuming whitespace or not\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 29)",
        "(line 321,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeWord()",
      "begin_line": 332,
      "end_line": 337,
      "comment": "\n     * Retrieves the next run of word type (letter or digit) off the queue.\n     * @return String of word characters from queue, or empty string if none.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 24)",
        "(line 334,col 9)-(line 335,col 18)",
        "(line 336,col 9)-(line 336,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeTagName()",
      "begin_line": 344,
      "end_line": 350,
      "comment": "\n     * Consume an tag name off the queue (word or :, _, -)\n     * \n     * @return tag name\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 24)",
        "(line 346,col 9)-(line 347,col 18)",
        "(line 349,col 9)-(line 349,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeElementSelector()",
      "begin_line": 357,
      "end_line": 363,
      "comment": "\n     * Consume a CSS element selector (tag name, but | instead of : for namespaces (or *| for wildcard namespace), to not conflict with :pseudo selects).\n     * \n     * @return tag name\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 24)",
        "(line 359,col 9)-(line 360,col 18)",
        "(line 362,col 9)-(line 362,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeCssIdentifier()",
      "begin_line": 370,
      "end_line": 376,
      "comment": "\n     Consume a CSS identifier (ID or class) off the queue (letter, digit, -, _)\n     http://www.w3.org/TR/CSS2/syndata.html#value-def-identifier\n     @return identifier\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 24)",
        "(line 372,col 9)-(line 373,col 18)",
        "(line 375,col 9)-(line 375,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeAttributeKey()",
      "begin_line": 382,
      "end_line": 388,
      "comment": "\n     Consume an attribute key off the queue (letter, digit, -, _, :\")\n     @return attribute key\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 24)",
        "(line 384,col 9)-(line 385,col 18)",
        "(line 387,col 9)-(line 387,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.remainder()",
      "begin_line": 394,
      "end_line": 398,
      "comment": "\n     Consume and return whatever is left on the queue.\n     @return remained of queue.\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 70)",
        "(line 396,col 9)-(line 396,col 29)",
        "(line 397,col 9)-(line 397,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.toString()",
      "begin_line": 400,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 36)"
      ]
    }
  ]
}