{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/stream/JsonReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 190,
      "end_line": 1625,
      "comment": "\n * Reads a JSON (\u003ca href\u003d\"http://www.ietf.org/rfc/rfc7159.txt\"\u003eRFC 7159\u003c/a\u003e)\n * encoded value as a stream of tokens. This stream includes both literal\n * values (strings, numbers, booleans, and nulls) as well as the begin and\n * end delimiters of objects and arrays. The tokens are traversed in\n * depth-first order, the same order that they appear in the JSON document.\n * Within JSON objects, name/value pairs are represented by a single token.\n *\n * \u003ch3\u003eParsing JSON\u003c/h3\u003e\n * To create a recursive descent parser for your own JSON streams, first create\n * an entry point method that creates a {@code JsonReader}.\n *\n * \u003cp\u003eNext, create handler methods for each structure in your JSON text. You\u0027ll\n * need a method for each object type and for each array type.\n * \u003cul\u003e\n *   \u003cli\u003eWithin \u003cstrong\u003earray handling\u003c/strong\u003e methods, first call {@link\n *       #beginArray} to consume the array\u0027s opening bracket. Then create a\n *       while loop that accumulates values, terminating when {@link #hasNext}\n *       is false. Finally, read the array\u0027s closing bracket by calling {@link\n *       #endArray}.\n *   \u003cli\u003eWithin \u003cstrong\u003eobject handling\u003c/strong\u003e methods, first call {@link\n *       #beginObject} to consume the object\u0027s opening brace. Then create a\n *       while loop that assigns values to local variables based on their name.\n *       This loop should terminate when {@link #hasNext} is false. Finally,\n *       read the object\u0027s closing brace by calling {@link #endObject}.\n * \u003c/ul\u003e\n * \u003cp\u003eWhen a nested object or array is encountered, delegate to the\n * corresponding handler method.\n *\n * \u003cp\u003eWhen an unknown name is encountered, strict parsers should fail with an\n * exception. Lenient parsers should call {@link #skipValue()} to recursively\n * skip the value\u0027s nested tokens, which may otherwise conflict.\n *\n * \u003cp\u003eIf a value may be null, you should first check using {@link #peek()}.\n * Null literals can be consumed using either {@link #nextNull()} or {@link\n * #skipValue()}.\n *\n * \u003ch3\u003eExample\u003c/h3\u003e\n * Suppose we\u0027d like to parse a stream of messages such as the following: \u003cpre\u003e {@code\n * [\n *   {\n *     \"id\": 912345678901,\n *     \"text\": \"How do I read a JSON stream in Java?\",\n *     \"geo\": null,\n *     \"user\": {\n *       \"name\": \"json_newb\",\n *       \"followers_count\": 41\n *      }\n *   },\n *   {\n *     \"id\": 912345678902,\n *     \"text\": \"@json_newb just use JsonReader!\",\n *     \"geo\": [50.454722, -104.606667],\n *     \"user\": {\n *       \"name\": \"jesse\",\n *       \"followers_count\": 2\n *     }\n *   }\n * ]}\u003c/pre\u003e\n * This code implements the parser for the above structure: \u003cpre\u003e   {@code\n *\n *   public List\u003cMessage\u003e readJsonStream(InputStream in) throws IOException {\n *     JsonReader reader \u003d new JsonReader(new InputStreamReader(in, \"UTF-8\"));\n *     try {\n *       return readMessagesArray(reader);\n *     } finally {\n *       reader.close();\n *     }\n *   }\n *\n *   public List\u003cMessage\u003e readMessagesArray(JsonReader reader) throws IOException {\n *     List\u003cMessage\u003e messages \u003d new ArrayList\u003cMessage\u003e();\n *\n *     reader.beginArray();\n *     while (reader.hasNext()) {\n *       messages.add(readMessage(reader));\n *     }\n *     reader.endArray();\n *     return messages;\n *   }\n *\n *   public Message readMessage(JsonReader reader) throws IOException {\n *     long id \u003d -1;\n *     String text \u003d null;\n *     User user \u003d null;\n *     List\u003cDouble\u003e geo \u003d null;\n *\n *     reader.beginObject();\n *     while (reader.hasNext()) {\n *       String name \u003d reader.nextName();\n *       if (name.equals(\"id\")) {\n *         id \u003d reader.nextLong();\n *       } else if (name.equals(\"text\")) {\n *         text \u003d reader.nextString();\n *       } else if (name.equals(\"geo\") \u0026\u0026 reader.peek() !\u003d JsonToken.NULL) {\n *         geo \u003d readDoublesArray(reader);\n *       } else if (name.equals(\"user\")) {\n *         user \u003d readUser(reader);\n *       } else {\n *         reader.skipValue();\n *       }\n *     }\n *     reader.endObject();\n *     return new Message(id, text, user, geo);\n *   }\n *\n *   public List\u003cDouble\u003e readDoublesArray(JsonReader reader) throws IOException {\n *     List\u003cDouble\u003e doubles \u003d new ArrayList\u003cDouble\u003e();\n *\n *     reader.beginArray();\n *     while (reader.hasNext()) {\n *       doubles.add(reader.nextDouble());\n *     }\n *     reader.endArray();\n *     return doubles;\n *   }\n *\n *   public User readUser(JsonReader reader) throws IOException {\n *     String username \u003d null;\n *     int followersCount \u003d -1;\n *\n *     reader.beginObject();\n *     while (reader.hasNext()) {\n *       String name \u003d reader.nextName();\n *       if (name.equals(\"name\")) {\n *         username \u003d reader.nextString();\n *       } else if (name.equals(\"followers_count\")) {\n *         followersCount \u003d reader.nextInt();\n *       } else {\n *         reader.skipValue();\n *       }\n *     }\n *     reader.endObject();\n *     return new User(username, followersCount);\n *   }}\u003c/pre\u003e\n *\n * \u003ch3\u003eNumber Handling\u003c/h3\u003e\n * This reader permits numeric values to be read as strings and string values to\n * be read as numbers. For example, both elements of the JSON array {@code\n * [1, \"1\"]} may be read using either {@link #nextInt} or {@link #nextString}.\n * This behavior is intended to prevent lossy numeric conversions: double is\n * JavaScript\u0027s only numeric type and very large values like {@code\n * 9007199254740993} cannot be represented exactly on that platform. To minimize\n * precision loss, extremely large values should be written and read as strings\n * in JSON.\n *\n * \u003ca name\u003d\"nonexecuteprefix\"/\u003e\u003ch3\u003eNon-Execute Prefix\u003c/h3\u003e\n * Web servers that serve private data using JSON may be vulnerable to \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/JSON#Cross-site_request_forgery\"\u003eCross-site\n * request forgery\u003c/a\u003e attacks. In such an attack, a malicious site gains access\n * to a private JSON file by executing it with an HTML {@code \u003cscript\u003e} tag.\n *\n * \u003cp\u003ePrefixing JSON files with \u003ccode\u003e\")]}\u0027\\n\"\u003c/code\u003e makes them non-executable\n * by {@code \u003cscript\u003e} tags, disarming the attack. Since the prefix is malformed\n * JSON, strict parsing fails when it is encountered. This class permits the\n * non-execute prefix when {@link #setLenient(boolean) lenient parsing} is\n * enabled.\n *\n * \u003cp\u003eEach {@code JsonReader} may be used to read a single JSON stream. Instances\n * of this class are not thread safe.\n *\n * @author Jesse Wilson\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "NON_EXECUTE_PREFIX"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " The only non-execute prefix this parser permits "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_INCOMPLETE_INTEGER"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_NONE"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_BEGIN_OBJECT"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_END_OBJECT"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_BEGIN_ARRAY"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_END_ARRAY"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_TRUE"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_FALSE"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_NULL"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_SINGLE_QUOTED"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_DOUBLE_QUOTED"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_UNQUOTED"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_BUFFERED"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " When this is returned, the string value is stored in peekedString. "
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_SINGLE_QUOTED_NAME"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_DOUBLE_QUOTED_NAME"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_UNQUOTED_NAME"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_LONG"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " When this is returned, the integer value is stored in peekedLong. "
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_NUMBER"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PEEKED_EOF"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_CHAR_NONE"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " State machine when parsing numbers "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_CHAR_SIGN"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_CHAR_DIGIT"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_CHAR_DECIMAL"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_CHAR_FRACTION_DIGIT"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_CHAR_EXP_E"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_CHAR_EXP_SIGN"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_CHAR_EXP_DIGIT"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " The input JSON. "
    },
    {
      "type": "field",
      "varNames": [
        "lenient"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " True to accept non-spec compliant JSON "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": "\n   * Use a manual buffer to easily read and unread upcoming characters, and\n   * also so we can create strings without an intermediate StringBuilder.\n   * We decode literals directly out of this buffer, so it must be at least as\n   * long as the longest token that can be reported as a number.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineNumber"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineStart"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "peeked"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "peekedLong"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n   * A peeked value that was composed entirely of digits with an optional\n   * leading dash. Positive values may not have a leading 0.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "peekedNumberLength"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": "\n   * The number of characters in a peeked number literal. Increment \u0027pos\u0027 by\n   * this after reading a number.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "peekedString"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": "\n   * A peeked string that should be parsed on the next double, long or string.\n   * This is populated before a numeric value is parsed and used if that parsing\n   * fails.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": "\n   * The nesting stack. Using a manual array rather than an ArrayList saves 20%.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "stackSize"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pathNames"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": "\n   * The path members. It corresponds directly to stack: At indices where the\n   * stack contains an object (EMPTY_OBJECT, DANGLING_NAME or NONEMPTY_OBJECT),\n   * pathNames contains the name at this scope. Where it contains an array\n   * (EMPTY_ARRAY, NONEMPTY_ARRAY) pathIndices contains the current index in\n   * that array. Otherwise the value is undefined, and we take advantage of that\n   * by incrementing pathIndices when doing so isn\u0027t useful.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "pathIndices"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.stream.JsonReader.JsonReader(java.io.Reader)",
      "begin_line": 289,
      "end_line": 294,
      "comment": "\n   * Creates a new instance that reads a JSON-encoded stream from {@code in}.\n   ",
      "child_ranges": [
        "(line 290,col 5)-(line 292,col 5)",
        "(line 293,col 5)-(line 293,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.setLenient(boolean)",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n   * Configure this parser to be liberal in what it accepts. By default,\n   * this parser is strict and only accepts JSON as specified by \u003ca\n   * href\u003d\"http://www.ietf.org/rfc/rfc4627.txt\"\u003eRFC 4627\u003c/a\u003e. Setting the\n   * parser to lenient causes it to ignore the following syntax errors:\n   *\n   * \u003cul\u003e\n   *   \u003cli\u003eStreams that start with the \u003ca href\u003d\"#nonexecuteprefix\"\u003enon-execute\n   *       prefix\u003c/a\u003e, \u003ccode\u003e\")]}\u0027\\n\"\u003c/code\u003e.\n   *   \u003cli\u003eStreams that include multiple top-level values. With strict parsing,\n   *       each stream must contain exactly one top-level value.\n   *   \u003cli\u003eTop-level values of any type. With strict parsing, the top-level\n   *       value must be an object or an array.\n   *   \u003cli\u003eNumbers may be {@link Double#isNaN() NaNs} or {@link\n   *       Double#isInfinite() infinities}.\n   *   \u003cli\u003eEnd of line comments starting with {@code //} or {@code #} and\n   *       ending with a newline character.\n   *   \u003cli\u003eC-style comments starting with {@code /*} and ending with\n   *       {@code *}{@code /}. Such comments may not be nested.\n   *   \u003cli\u003eNames that are unquoted or {@code \u0027single quoted\u0027}.\n   *   \u003cli\u003eStrings that are unquoted or {@code \u0027single quoted\u0027}.\n   *   \u003cli\u003eArray elements separated by {@code ;} instead of {@code ,}.\n   *   \u003cli\u003eUnnecessary array separators. These are interpreted as if null\n   *       was the omitted value.\n   *   \u003cli\u003eNames and values separated by {@code \u003d} or {@code \u003d\u003e} instead of\n   *       {@code :}.\n   *   \u003cli\u003eName/value pairs separated by {@code ;} instead of {@code ,}.\n   * \u003c/ul\u003e\n   ",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.isLenient()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n   * Returns true if this parser is liberal in what it accepts.\n   ",
      "child_ranges": [
        "(line 333,col 5)-(line 333,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.beginArray()",
      "begin_line": 340,
      "end_line": 353,
      "comment": "\n   * Consumes the next token from the JSON stream and asserts that it is the\n   * beginning of a new array.\n   ",
      "child_ranges": [
        "(line 341,col 5)-(line 341,col 19)",
        "(line 342,col 5)-(line 344,col 5)",
        "(line 345,col 5)-(line 352,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.endArray()",
      "begin_line": 359,
      "end_line": 372,
      "comment": "\n   * Consumes the next token from the JSON stream and asserts that it is the\n   * end of the current array.\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 19)",
        "(line 361,col 5)-(line 363,col 5)",
        "(line 364,col 5)-(line 371,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.beginObject()",
      "begin_line": 378,
      "end_line": 390,
      "comment": "\n   * Consumes the next token from the JSON stream and asserts that it is the\n   * beginning of a new object.\n   ",
      "child_ranges": [
        "(line 379,col 5)-(line 379,col 19)",
        "(line 380,col 5)-(line 382,col 5)",
        "(line 383,col 5)-(line 389,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.endObject()",
      "begin_line": 396,
      "end_line": 410,
      "comment": "\n   * Consumes the next token from the JSON stream and asserts that it is the\n   * end of the current object.\n   ",
      "child_ranges": [
        "(line 397,col 5)-(line 397,col 19)",
        "(line 398,col 5)-(line 400,col 5)",
        "(line 401,col 5)-(line 409,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.hasNext()",
      "begin_line": 415,
      "end_line": 421,
      "comment": "\n   * Returns true if the current array or object has another element.\n   ",
      "child_ranges": [
        "(line 416,col 5)-(line 416,col 19)",
        "(line 417,col 5)-(line 419,col 5)",
        "(line 420,col 5)-(line 420,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.peek()",
      "begin_line": 426,
      "end_line": 463,
      "comment": "\n   * Returns the type of the next token without consuming it.\n   ",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 19)",
        "(line 428,col 5)-(line 430,col 5)",
        "(line 432,col 5)-(line 462,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.doPeek()",
      "begin_line": 465,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 466,col 5)-(line 466,col 41)",
        "(line 467,col 5)-(line 551,col 5)",
        "(line 553,col 5)-(line 553,col 36)",
        "(line 554,col 5)-(line 581,col 5)",
        "(line 583,col 5)-(line 583,col 31)",
        "(line 584,col 5)-(line 586,col 5)",
        "(line 588,col 5)-(line 588,col 26)",
        "(line 589,col 5)-(line 591,col 5)",
        "(line 593,col 5)-(line 595,col 5)",
        "(line 597,col 5)-(line 597,col 19)",
        "(line 598,col 5)-(line 598,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.peekKeyword()",
      "begin_line": 601,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 603,col 5)-(line 603,col 25)",
        "(line 604,col 5)-(line 604,col 19)",
        "(line 605,col 5)-(line 605,col 24)",
        "(line 606,col 5)-(line 606,col 16)",
        "(line 607,col 5)-(line 621,col 5)",
        "(line 624,col 5)-(line 624,col 34)",
        "(line 625,col 5)-(line 633,col 5)",
        "(line 635,col 5)-(line 638,col 5)",
        "(line 641,col 5)-(line 641,col 18)",
        "(line 642,col 5)-(line 642,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.peekNumber()",
      "begin_line": 645,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 647,col 5)-(line 647,col 32)",
        "(line 648,col 5)-(line 648,col 16)",
        "(line 649,col 5)-(line 649,col 18)",
        "(line 651,col 5)-(line 651,col 19)",
        "(line 652,col 5)-(line 652,col 29)",
        "(line 653,col 5)-(line 653,col 30)",
        "(line 654,col 5)-(line 654,col 32)",
        "(line 656,col 5)-(line 656,col 14)",
        "(line 658,col 5)-(line 732,col 5)",
        "(line 735,col 5)-(line 745,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.isLiteral(char)",
      "begin_line": 748,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 749,col 5)-(line 770,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextName()",
      "begin_line": 780,
      "end_line": 799,
      "comment": "\n   * Returns the next token, a {@link com.google.gson.stream.JsonToken#NAME property name}, and\n   * consumes it.\n   *\n   * @throws java.io.IOException if the next token in the stream is not a property\n   *     name.\n   ",
      "child_ranges": [
        "(line 781,col 5)-(line 781,col 19)",
        "(line 782,col 5)-(line 784,col 5)",
        "(line 785,col 5)-(line 785,col 18)",
        "(line 786,col 5)-(line 795,col 5)",
        "(line 796,col 5)-(line 796,col 25)",
        "(line 797,col 5)-(line 797,col 38)",
        "(line 798,col 5)-(line 798,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextString()",
      "begin_line": 809,
      "end_line": 836,
      "comment": "\n   * Returns the {@link com.google.gson.stream.JsonToken#STRING string} value of the next token,\n   * consuming it. If the next token is a number, this method will return its\n   * string form.\n   *\n   * @throws IllegalStateException if the next token is not a string or if\n   *     this reader is closed.\n   ",
      "child_ranges": [
        "(line 810,col 5)-(line 810,col 19)",
        "(line 811,col 5)-(line 813,col 5)",
        "(line 814,col 5)-(line 814,col 18)",
        "(line 815,col 5)-(line 832,col 5)",
        "(line 833,col 5)-(line 833,col 25)",
        "(line 834,col 5)-(line 834,col 33)",
        "(line 835,col 5)-(line 835,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextBoolean()",
      "begin_line": 845,
      "end_line": 861,
      "comment": "\n   * Returns the {@link com.google.gson.stream.JsonToken#BOOLEAN boolean} value of the next token,\n   * consuming it.\n   *\n   * @throws IllegalStateException if the next token is not a boolean or if\n   *     this reader is closed.\n   ",
      "child_ranges": [
        "(line 846,col 5)-(line 846,col 19)",
        "(line 847,col 5)-(line 849,col 5)",
        "(line 850,col 5)-(line 858,col 5)",
        "(line 859,col 5)-(line 860,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextNull()",
      "begin_line": 870,
      "end_line": 882,
      "comment": "\n   * Consumes the next token from the JSON stream and asserts that it is a\n   * literal null.\n   *\n   * @throws IllegalStateException if the next token is not null or if this\n   *     reader is closed.\n   ",
      "child_ranges": [
        "(line 871,col 5)-(line 871,col 19)",
        "(line 872,col 5)-(line 874,col 5)",
        "(line 875,col 5)-(line 881,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextDouble()",
      "begin_line": 893,
      "end_line": 927,
      "comment": "\n   * Returns the {@link com.google.gson.stream.JsonToken#NUMBER double} value of the next token,\n   * consuming it. If the next token is a string, this method will attempt to\n   * parse it as a double using {@link Double#parseDouble(String)}.\n   *\n   * @throws IllegalStateException if the next token is not a literal value.\n   * @throws NumberFormatException if the next literal value cannot be parsed\n   *     as a double, or is non-finite.\n   ",
      "child_ranges": [
        "(line 894,col 5)-(line 894,col 19)",
        "(line 895,col 5)-(line 897,col 5)",
        "(line 899,col 5)-(line 903,col 5)",
        "(line 905,col 5)-(line 915,col 5)",
        "(line 917,col 5)-(line 917,col 29)",
        "(line 918,col 5)-(line 918,col 53)",
        "(line 919,col 5)-(line 922,col 5)",
        "(line 923,col 5)-(line 923,col 24)",
        "(line 924,col 5)-(line 924,col 25)",
        "(line 925,col 5)-(line 925,col 33)",
        "(line 926,col 5)-(line 926,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextLong()",
      "begin_line": 939,
      "end_line": 984,
      "comment": "\n   * Returns the {@link com.google.gson.stream.JsonToken#NUMBER long} value of the next token,\n   * consuming it. If the next token is a string, this method will attempt to\n   * parse it as a long. If the next token\u0027s numeric value cannot be exactly\n   * represented by a Java {@code long}, this method throws.\n   *\n   * @throws IllegalStateException if the next token is not a literal value.\n   * @throws NumberFormatException if the next literal value cannot be parsed\n   *     as a number, or exactly represented as a long.\n   ",
      "child_ranges": [
        "(line 940,col 5)-(line 940,col 19)",
        "(line 941,col 5)-(line 943,col 5)",
        "(line 945,col 5)-(line 949,col 5)",
        "(line 951,col 5)-(line 971,col 5)",
        "(line 973,col 5)-(line 973,col 29)",
        "(line 974,col 5)-(line 974,col 55)",
        "(line 975,col 5)-(line 975,col 34)",
        "(line 976,col 5)-(line 979,col 5)",
        "(line 980,col 5)-(line 980,col 24)",
        "(line 981,col 5)-(line 981,col 25)",
        "(line 982,col 5)-(line 982,col 33)",
        "(line 983,col 5)-(line 983,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextQuotedValue(char)",
      "begin_line": 996,
      "end_line": 1031,
      "comment": "\n   * Returns the string up to but not including {@code quote}, unescaping any\n   * character escape sequences encountered along the way. The opening quote\n   * should have already been read. This consumes the closing quote, but does\n   * not include it in the returned string.\n   *\n   * @param quote either \u0027 or \".\n   * @throws NumberFormatException if any unicode escape sequences are\n   *     malformed.\n   ",
      "child_ranges": [
        "(line 998,col 5)-(line 998,col 32)",
        "(line 999,col 5)-(line 999,col 48)",
        "(line 1000,col 5)-(line 1030,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextUnquotedValue()",
      "begin_line": 1036,
      "end_line": 1096,
      "comment": "\n   * Returns an unquoted value as a string.\n   ",
      "child_ranges": [
        "(line 1038,col 5)-(line 1038,col 33)",
        "(line 1039,col 5)-(line 1039,col 14)",
        "(line 1041,col 5)-(line 1085,col 5)",
        "(line 1087,col 5)-(line 1087,col 18)",
        "(line 1088,col 5)-(line 1093,col 5)",
        "(line 1094,col 5)-(line 1094,col 13)",
        "(line 1095,col 5)-(line 1095,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.skipQuotedValue(char)",
      "begin_line": 1098,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 5)-(line 1100,col 32)",
        "(line 1101,col 5)-(line 1121,col 28)",
        "(line 1122,col 5)-(line 1122,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.skipUnquotedValue()",
      "begin_line": 1125,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 5)-(line 1152,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextInt()",
      "begin_line": 1165,
      "end_line": 1216,
      "comment": "\n   * Returns the {@link com.google.gson.stream.JsonToken#NUMBER int} value of the next token,\n   * consuming it. If the next token is a string, this method will attempt to\n   * parse it as an int. If the next token\u0027s numeric value cannot be exactly\n   * represented by a Java {@code int}, this method throws.\n   *\n   * @throws IllegalStateException if the next token is not a literal value.\n   * @throws NumberFormatException if the next literal value cannot be parsed\n   *     as a number, or exactly represented as an int.\n   ",
      "child_ranges": [
        "(line 1166,col 5)-(line 1166,col 19)",
        "(line 1167,col 5)-(line 1169,col 5)",
        "(line 1171,col 5)-(line 1171,col 15)",
        "(line 1172,col 5)-(line 1181,col 5)",
        "(line 1183,col 5)-(line 1203,col 5)",
        "(line 1205,col 5)-(line 1205,col 29)",
        "(line 1206,col 5)-(line 1206,col 55)",
        "(line 1207,col 5)-(line 1207,col 28)",
        "(line 1208,col 5)-(line 1211,col 5)",
        "(line 1212,col 5)-(line 1212,col 24)",
        "(line 1213,col 5)-(line 1213,col 25)",
        "(line 1214,col 5)-(line 1214,col 33)",
        "(line 1215,col 5)-(line 1215,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.close()",
      "begin_line": 1221,
      "end_line": 1226,
      "comment": "\n   * Closes this JSON reader and the underlying {@link java.io.Reader}.\n   ",
      "child_ranges": [
        "(line 1222,col 5)-(line 1222,col 25)",
        "(line 1223,col 5)-(line 1223,col 32)",
        "(line 1224,col 5)-(line 1224,col 18)",
        "(line 1225,col 5)-(line 1225,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.skipValue()",
      "begin_line": 1233,
      "end_line": 1267,
      "comment": "\n   * Skips the next value recursively. If it is an object or array, all nested\n   * elements are skipped. This method is intended for use when the JSON token\n   * stream contains unrecognized or unhandled values.\n   ",
      "child_ranges": [
        "(line 1234,col 5)-(line 1234,col 18)",
        "(line 1235,col 5)-(line 1263,col 25)",
        "(line 1265,col 5)-(line 1265,col 33)",
        "(line 1266,col 5)-(line 1266,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.push(int)",
      "begin_line": 1269,
      "end_line": 1282,
      "comment": "",
      "child_ranges": [
        "(line 1270,col 5)-(line 1280,col 5)",
        "(line 1281,col 5)-(line 1281,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.fillBuffer(int)",
      "begin_line": 1289,
      "end_line": 1316,
      "comment": "\n   * Returns true once {@code limit - pos \u003e\u003d minimum}. If the data is\n   * exhausted before that many characters are available, this returns\n   * false.\n   ",
      "child_ranges": [
        "(line 1290,col 5)-(line 1290,col 32)",
        "(line 1291,col 5)-(line 1291,col 21)",
        "(line 1292,col 5)-(line 1297,col 5)",
        "(line 1299,col 5)-(line 1299,col 12)",
        "(line 1300,col 5)-(line 1300,col 14)",
        "(line 1301,col 5)-(line 1314,col 5)",
        "(line 1315,col 5)-(line 1315,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.getLineNumber()",
      "begin_line": 1318,
      "end_line": 1320,
      "comment": "",
      "child_ranges": [
        "(line 1319,col 5)-(line 1319,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.getColumnNumber()",
      "begin_line": 1322,
      "end_line": 1324,
      "comment": "",
      "child_ranges": [
        "(line 1323,col 5)-(line 1323,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.nextNonWhitespace(boolean)",
      "begin_line": 1332,
      "end_line": 1420,
      "comment": "\n   * Returns the next character in the stream that is neither whitespace nor a\n   * part of a comment. When this returns, the returned character is always at\n   * {@code buffer[pos-1]}; this means the caller can always push back the\n   * returned character by decrementing {@code pos}.\n   ",
      "child_ranges": [
        "(line 1341,col 5)-(line 1341,col 32)",
        "(line 1342,col 5)-(line 1342,col 16)",
        "(line 1343,col 5)-(line 1343,col 18)",
        "(line 1344,col 5)-(line 1413,col 5)",
        "(line 1414,col 5)-(line 1419,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.checkLenient()",
      "begin_line": 1422,
      "end_line": 1426,
      "comment": "",
      "child_ranges": [
        "(line 1423,col 5)-(line 1425,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.skipToEndOfLine()",
      "begin_line": 1433,
      "end_line": 1444,
      "comment": "\n   * Advances the position until after the next newline character. If the line\n   * is terminated by \"\\r\\n\", the \u0027\\n\u0027 must be consumed as whitespace by the\n   * caller.\n   ",
      "child_ranges": [
        "(line 1434,col 5)-(line 1443,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.skipTo(java.lang.String)",
      "begin_line": 1449,
      "end_line": 1465,
      "comment": "\n   * @param toFind a string to search for. Must not contain a newline.\n   ",
      "child_ranges": [
        "(line 1450,col 5)-(line 1463,col 5)",
        "(line 1464,col 5)-(line 1464,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.toString()",
      "begin_line": 1467,
      "end_line": 1470,
      "comment": "",
      "child_ranges": [
        "(line 1468,col 5)-(line 1469,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.getPath()",
      "begin_line": 1476,
      "end_line": 1501,
      "comment": "\n   * Returns a \u003ca href\u003d\"http://goessner.net/articles/JsonPath/\"\u003eJsonPath\u003c/a\u003e to\n   * the current location in the JSON value.\n   ",
      "child_ranges": [
        "(line 1477,col 5)-(line 1477,col 59)",
        "(line 1478,col 5)-(line 1499,col 5)",
        "(line 1500,col 5)-(line 1500,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.readEscapeCharacter()",
      "begin_line": 1512,
      "end_line": 1567,
      "comment": "\n   * Unescapes the character identified by the character or characters that\n   * immediately follow a backslash. The backslash \u0027\\\u0027 should have already\n   * been read. This supports both unicode escapes \"u000A\" and two-character\n   * escapes \"\\n\".\n   *\n   * @throws NumberFormatException if any unicode escape sequences are\n   *     malformed.\n   ",
      "child_ranges": [
        "(line 1513,col 5)-(line 1515,col 5)",
        "(line 1517,col 5)-(line 1517,col 33)",
        "(line 1518,col 5)-(line 1566,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.syntaxError(java.lang.String)",
      "begin_line": 1573,
      "end_line": 1576,
      "comment": "\n   * Throws a new IO exception with the given message and a context snippet\n   * with this reader\u0027s content.\n   ",
      "child_ranges": [
        "(line 1574,col 5)-(line 1575,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.consumeNonExecutePrefix()",
      "begin_line": 1581,
      "end_line": 1598,
      "comment": "\n   * Consumes the non-execute prefix if it exists.\n   ",
      "child_ranges": [
        "(line 1583,col 5)-(line 1583,col 28)",
        "(line 1584,col 5)-(line 1584,col 10)",
        "(line 1586,col 5)-(line 1588,col 5)",
        "(line 1590,col 5)-(line 1594,col 5)",
        "(line 1597,col 5)-(line 1597,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonReader.Anonymous-187f8915-ce15-488a-b076-26620ad46110.promoteNameToValue(com.google.gson.stream.JsonReader)",
      "begin_line": 1602,
      "end_line": 1622,
      "comment": "",
      "child_ranges": [
        "(line 1603,col 9)-(line 1606,col 9)",
        "(line 1607,col 9)-(line 1607,col 30)",
        "(line 1608,col 9)-(line 1610,col 9)",
        "(line 1611,col 9)-(line 1621,col 9)"
      ]
    }
  ]
}