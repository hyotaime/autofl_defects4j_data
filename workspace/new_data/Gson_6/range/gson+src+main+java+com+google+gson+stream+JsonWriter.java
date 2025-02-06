{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/stream/JsonWriter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable",
        "java.io.Flushable"
      ],
      "begin_line": 130,
      "end_line": 644,
      "comment": "\n * Writes a JSON (\u003ca href\u003d\"http://www.ietf.org/rfc/rfc7159.txt\"\u003eRFC 7159\u003c/a\u003e)\n * encoded value to a stream, one token at a time. The stream includes both\n * literal values (strings, numbers, booleans and nulls) as well as the begin\n * and end delimiters of objects and arrays.\n *\n * \u003ch3\u003eEncoding JSON\u003c/h3\u003e\n * To encode your data as JSON, create a new {@code JsonWriter}. Each JSON\n * document must contain one top-level array or object. Call methods on the\n * writer as you walk the structure\u0027s contents, nesting arrays and objects as\n * necessary:\n * \u003cul\u003e\n *   \u003cli\u003eTo write \u003cstrong\u003earrays\u003c/strong\u003e, first call {@link #beginArray()}.\n *       Write each of the array\u0027s elements with the appropriate {@link #value}\n *       methods or by nesting other arrays and objects. Finally close the array\n *       using {@link #endArray()}.\n *   \u003cli\u003eTo write \u003cstrong\u003eobjects\u003c/strong\u003e, first call {@link #beginObject()}.\n *       Write each of the object\u0027s properties by alternating calls to\n *       {@link #name} with the property\u0027s value. Write property values with the\n *       appropriate {@link #value} method or by nesting other objects or arrays.\n *       Finally close the object using {@link #endObject()}.\n * \u003c/ul\u003e\n *\n * \u003ch3\u003eExample\u003c/h3\u003e\n * Suppose we\u0027d like to encode a stream of messages such as the following: \u003cpre\u003e {@code\n * [\n *   {\n *     \"id\": 912345678901,\n *     \"text\": \"How do I stream JSON in Java?\",\n *     \"geo\": null,\n *     \"user\": {\n *       \"name\": \"json_newb\",\n *       \"followers_count\": 41\n *      }\n *   },\n *   {\n *     \"id\": 912345678902,\n *     \"text\": \"@json_newb just use JsonWriter!\",\n *     \"geo\": [50.454722, -104.606667],\n *     \"user\": {\n *       \"name\": \"jesse\",\n *       \"followers_count\": 2\n *     }\n *   }\n * ]}\u003c/pre\u003e\n * This code encodes the above structure: \u003cpre\u003e   {@code\n *   public void writeJsonStream(OutputStream out, List\u003cMessage\u003e messages) throws IOException {\n *     JsonWriter writer \u003d new JsonWriter(new OutputStreamWriter(out, \"UTF-8\"));\n *     writer.setIndent(\"    \");\n *     writeMessagesArray(writer, messages);\n *     writer.close();\n *   }\n *\n *   public void writeMessagesArray(JsonWriter writer, List\u003cMessage\u003e messages) throws IOException {\n *     writer.beginArray();\n *     for (Message message : messages) {\n *       writeMessage(writer, message);\n *     }\n *     writer.endArray();\n *   }\n *\n *   public void writeMessage(JsonWriter writer, Message message) throws IOException {\n *     writer.beginObject();\n *     writer.name(\"id\").value(message.getId());\n *     writer.name(\"text\").value(message.getText());\n *     if (message.getGeo() !\u003d null) {\n *       writer.name(\"geo\");\n *       writeDoublesArray(writer, message.getGeo());\n *     } else {\n *       writer.name(\"geo\").nullValue();\n *     }\n *     writer.name(\"user\");\n *     writeUser(writer, message.getUser());\n *     writer.endObject();\n *   }\n *\n *   public void writeUser(JsonWriter writer, User user) throws IOException {\n *     writer.beginObject();\n *     writer.name(\"name\").value(user.getName());\n *     writer.name(\"followers_count\").value(user.getFollowersCount());\n *     writer.endObject();\n *   }\n *\n *   public void writeDoublesArray(JsonWriter writer, List\u003cDouble\u003e doubles) throws IOException {\n *     writer.beginArray();\n *     for (Double value : doubles) {\n *       writer.value(value);\n *     }\n *     writer.endArray();\n *   }}\u003c/pre\u003e\n *\n * \u003cp\u003eEach {@code JsonWriter} may be used to write a single JSON stream.\n * Instances of this class are not thread safe. Calls that would result in a\n * malformed JSON string will fail with an {@link IllegalStateException}.\n *\n * @author Jesse Wilson\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "REPLACEMENT_CHARS"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n   * From RFC 7159, \"All Unicode characters may be placed within the\n   * quotation marks except for the characters that must be escaped:\n   * quotation mark, reverse solidus, and the control characters\n   * (U+0000 through U+001F).\"\n   *\n   * We also escape \u0027\\u2028\u0027 and \u0027\\u2029\u0027, which JavaScript interprets as\n   * newline characters. This prevents eval() from failing with a syntax\n   * error. http://code.google.com/p/google-gson/issues/detail?id\u003d341\n   "
    },
    {
      "type": "field",
      "varNames": [
        "HTML_SAFE_REPLACEMENT_CHARS"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The output data, containing at most one top-level array or object. "
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stackSize"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "indent"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": "\n   * A string containing a full set of spaces for a single level of\n   * indentation, or null for no pretty printing.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n   * The name/value separator; either \":\" or \": \".\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lenient"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "htmlSafe"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deferredName"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializeNulls"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.stream.JsonWriter.JsonWriter(java.io.Writer)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "\n   * Creates a new instance that writes a JSON-encoded stream to {@code out}.\n   * For best performance, ensure {@link Writer} is buffered; wrapping in\n   * {@link java.io.BufferedWriter BufferedWriter} if necessary.\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 200,col 5)",
        "(line 201,col 5)-(line 201,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.setIndent(java.lang.String)",
      "begin_line": 212,
      "end_line": 220,
      "comment": "\n   * Sets the indentation string to be repeated for each level of indentation\n   * in the encoded document. If {@code indent.isEmpty()} the encoded document\n   * will be compact. Otherwise the encoded document will be more\n   * human-readable.\n   *\n   * @param indent a string containing only whitespace.\n   ",
      "child_ranges": [
        "(line 213,col 5)-(line 219,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.setLenient(boolean)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n   * Configure this writer to relax its syntax rules. By default, this writer\n   * only emits well-formed JSON as specified by \u003ca\n   * href\u003d\"http://www.ietf.org/rfc/rfc7159.txt\"\u003eRFC 7159\u003c/a\u003e. Setting the writer\n   * to lenient permits the following:\n   * \u003cul\u003e\n   *   \u003cli\u003eTop-level values of any type. With strict writing, the top-level\n   *       value must be an object or an array.\n   *   \u003cli\u003eNumbers may be {@link Double#isNaN() NaNs} or {@link\n   *       Double#isInfinite() infinities}.\n   * \u003c/ul\u003e\n   ",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.isLenient()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n   * Returns true if this writer has relaxed syntax rules.\n   ",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.setHtmlSafe(boolean)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n   * Configure this writer to emit JSON that\u0027s safe for direct inclusion in HTML\n   * and XML documents. This escapes the HTML characters {@code \u003c}, {@code \u003e},\n   * {@code \u0026} and {@code \u003d} before writing them to the stream. Without this\n   * setting, your XML/HTML encoder should replace these characters with the\n   * corresponding escape sequences.\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.isHtmlSafe()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n   * Returns true if this writer writes JSON that\u0027s safe for inclusion in HTML\n   * and XML documents.\n   ",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.setSerializeNulls(boolean)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n   * Sets whether object members are serialized when their value is null.\n   * This has no impact on array elements. The default is true.\n   ",
      "child_ranges": [
        "(line 269,col 5)-(line 269,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.getSerializeNulls()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n   * Returns true if object members are serialized when their value is null.\n   * This has no impact on array elements. The default is true.\n   ",
      "child_ranges": [
        "(line 277,col 5)-(line 277,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.beginArray()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n   * Begins encoding a new array. Each call to this method must be paired with\n   * a call to {@link #endArray}.\n   *\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 24)",
        "(line 288,col 5)-(line 288,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.endArray()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n   * Ends encoding the current array.\n   *\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 297,col 5)-(line 297,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.beginObject()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n   * Begins encoding a new object. Each call to this method must be paired\n   * with a call to {@link #endObject}.\n   *\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 24)",
        "(line 308,col 5)-(line 308,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.endObject()",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n   * Ends encoding the current object.\n   *\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 317,col 5)-(line 317,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.open(int, java.lang.String)",
      "begin_line": 324,
      "end_line": 329,
      "comment": "\n   * Enters a new scope by appending any necessary whitespace and the given\n   * bracket.\n   ",
      "child_ranges": [
        "(line 325,col 5)-(line 325,col 18)",
        "(line 326,col 5)-(line 326,col 16)",
        "(line 327,col 5)-(line 327,col 27)",
        "(line 328,col 5)-(line 328,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.close(int, int, java.lang.String)",
      "begin_line": 335,
      "end_line": 351,
      "comment": "\n   * Closes the current scope by appending any necessary whitespace and the\n   * given bracket.\n   ",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 25)",
        "(line 338,col 5)-(line 340,col 5)",
        "(line 341,col 5)-(line 343,col 5)",
        "(line 345,col 5)-(line 345,col 16)",
        "(line 346,col 5)-(line 348,col 5)",
        "(line 349,col 5)-(line 349,col 28)",
        "(line 350,col 5)-(line 350,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.push(int)",
      "begin_line": 353,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 358,col 5)",
        "(line 359,col 5)-(line 359,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.peek()",
      "begin_line": 365,
      "end_line": 370,
      "comment": "\n   * Returns the value on the top of the stack.\n   ",
      "child_ranges": [
        "(line 366,col 5)-(line 368,col 5)",
        "(line 369,col 5)-(line 369,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.replaceTop(int)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n   * Replace the value on the top of the stack with the given value.\n   ",
      "child_ranges": [
        "(line 376,col 5)-(line 376,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.name(java.lang.String)",
      "begin_line": 385,
      "end_line": 397,
      "comment": "\n   * Encodes the property name.\n   *\n   * @param name the name of the forthcoming value. May not be null.\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 386,col 5)-(line 388,col 5)",
        "(line 389,col 5)-(line 391,col 5)",
        "(line 392,col 5)-(line 394,col 5)",
        "(line 395,col 5)-(line 395,col 24)",
        "(line 396,col 5)-(line 396,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.writeDeferredName()",
      "begin_line": 399,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 400,col 5)-(line 404,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.value(java.lang.String)",
      "begin_line": 413,
      "end_line": 421,
      "comment": "\n   * Encodes {@code value}.\n   *\n   * @param value the literal string value, or null to encode a null literal.\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 414,col 5)-(line 416,col 5)",
        "(line 417,col 5)-(line 417,col 24)",
        "(line 418,col 5)-(line 418,col 18)",
        "(line 419,col 5)-(line 419,col 18)",
        "(line 420,col 5)-(line 420,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.jsonValue(java.lang.String)",
      "begin_line": 430,
      "end_line": 438,
      "comment": "\n   * Writes {@code value} directly to the writer without quoting or\n   * escaping.\n   *\n   * @param value the literal string value, or null to encode a null literal.\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 431,col 5)-(line 433,col 5)",
        "(line 434,col 5)-(line 434,col 24)",
        "(line 435,col 5)-(line 435,col 18)",
        "(line 436,col 5)-(line 436,col 22)",
        "(line 437,col 5)-(line 437,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.nullValue()",
      "begin_line": 445,
      "end_line": 457,
      "comment": "\n   * Encodes {@code null}.\n   *\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 446,col 5)-(line 453,col 5)",
        "(line 454,col 5)-(line 454,col 18)",
        "(line 455,col 5)-(line 455,col 22)",
        "(line 456,col 5)-(line 456,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.value(boolean)",
      "begin_line": 464,
      "end_line": 469,
      "comment": "\n   * Encodes {@code value}.\n   *\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 24)",
        "(line 466,col 5)-(line 466,col 18)",
        "(line 467,col 5)-(line 467,col 40)",
        "(line 468,col 5)-(line 468,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.value(double)",
      "begin_line": 478,
      "end_line": 486,
      "comment": "\n   * Encodes {@code value}.\n   *\n   * @param value a finite value. May not be {@link Double#isNaN() NaNs} or\n   *     {@link Double#isInfinite() infinities}.\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 479,col 5)-(line 481,col 5)",
        "(line 482,col 5)-(line 482,col 24)",
        "(line 483,col 5)-(line 483,col 18)",
        "(line 484,col 5)-(line 484,col 39)",
        "(line 485,col 5)-(line 485,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.value(long)",
      "begin_line": 493,
      "end_line": 498,
      "comment": "\n   * Encodes {@code value}.\n   *\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 494,col 5)-(line 494,col 24)",
        "(line 495,col 5)-(line 495,col 18)",
        "(line 496,col 5)-(line 496,col 36)",
        "(line 497,col 5)-(line 497,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.value(java.lang.Number)",
      "begin_line": 507,
      "end_line": 521,
      "comment": "\n   * Encodes {@code value}.\n   *\n   * @param value a finite value. May not be {@link Double#isNaN() NaNs} or\n   *     {@link Double#isInfinite() infinities}.\n   * @return this writer.\n   ",
      "child_ranges": [
        "(line 508,col 5)-(line 510,col 5)",
        "(line 512,col 5)-(line 512,col 24)",
        "(line 513,col 5)-(line 513,col 37)",
        "(line 514,col 5)-(line 517,col 5)",
        "(line 518,col 5)-(line 518,col 18)",
        "(line 519,col 5)-(line 519,col 23)",
        "(line 520,col 5)-(line 520,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.flush()",
      "begin_line": 527,
      "end_line": 532,
      "comment": "\n   * Ensures all buffered data is written to the underlying {@link Writer}\n   * and flushes that writer.\n   ",
      "child_ranges": [
        "(line 528,col 5)-(line 530,col 5)",
        "(line 531,col 5)-(line 531,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.close()",
      "begin_line": 539,
      "end_line": 547,
      "comment": "\n   * Flushes and closes this writer and the underlying {@link Writer}.\n   *\n   * @throws IOException if the JSON document is incomplete.\n   ",
      "child_ranges": [
        "(line 540,col 5)-(line 540,col 16)",
        "(line 542,col 5)-(line 542,col 25)",
        "(line 543,col 5)-(line 545,col 5)",
        "(line 546,col 5)-(line 546,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.string(java.lang.String)",
      "begin_line": 549,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 87)",
        "(line 551,col 5)-(line 551,col 20)",
        "(line 552,col 5)-(line 552,col 17)",
        "(line 553,col 5)-(line 553,col 32)",
        "(line 554,col 5)-(line 574,col 5)",
        "(line 575,col 5)-(line 577,col 5)",
        "(line 578,col 5)-(line 578,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.newline()",
      "begin_line": 581,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 582,col 5)-(line 584,col 5)",
        "(line 586,col 5)-(line 586,col 20)",
        "(line 587,col 5)-(line 589,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.beforeName()",
      "begin_line": 596,
      "end_line": 605,
      "comment": "\n   * Inserts any necessary separators and whitespace before a name. Also\n   * adjusts the stack to expect the name\u0027s value.\n   ",
      "child_ranges": [
        "(line 597,col 5)-(line 597,col 25)",
        "(line 598,col 5)-(line 602,col 5)",
        "(line 603,col 5)-(line 603,col 14)",
        "(line 604,col 5)-(line 604,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.stream.JsonWriter.beforeValue()",
      "begin_line": 612,
      "end_line": 643,
      "comment": "\n   * Inserts any necessary separators and whitespace before a literal value,\n   * inline array, or inline object. Also adjusts the stack to expect either a\n   * closing bracket or another element.\n   ",
      "child_ranges": [
        "(line 614,col 5)-(line 642,col 5)"
      ]
    }
  ]
}