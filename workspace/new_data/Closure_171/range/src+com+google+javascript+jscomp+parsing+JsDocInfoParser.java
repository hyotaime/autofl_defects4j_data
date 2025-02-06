{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/parsing/JsDocInfoParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsDocInfoParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 2494,
      "comment": " spreading it across multiple packages."
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jsdocBuilder"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceFile"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "associatedNode"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorReporter"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateNode"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " memory footprint associated with these (similar to IRFactory)."
    },
    {
      "type": "class_interface",
      "name": "ErrorReporterParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser.addParserWarning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 62,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 64,col 7)-(line 66,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser.addParserWarning(java.lang.String, int, int)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 7)-(line 71,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser.addTypeWarning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 74,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 76,col 7)-(line 79,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser.addTypeWarning(java.lang.String, int, int)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 83,col 7)-(line 86,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "fileOverviewJSDocInfo"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The DocInfo with the fileoverview tag for the whole file."
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "annotationNames"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suppressionNames"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifiesAnnotationKeywords"
      ],
      "begin_line": 96,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idGeneratorAnnotationKeywords"
      ],
      "begin_line": 98,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileLevelJsDocBuilder"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.setFileLevelJsDocBuilder(com.google.javascript.rhino.Node.FileLevelJsDocBuilder)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n   * Sets the JsDocBuilder for the file-level (root) node of this parse. The\n   * parser uses the builder to append any preserve annotations it encounters\n   * in JsDoc comments.\n   *\n   * @param fileLevelJsDocBuilder\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.setFileOverviewJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n   * Sets the file overview JSDocInfo, in order to warn about multiple uses of\n   * the @fileoverview tag in a file.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.JsDocInfoParser(com.google.javascript.jscomp.parsing.JsDocTokenStream, com.google.javascript.rhino.head.ast.Comment, com.google.javascript.rhino.Node, com.google.javascript.jscomp.parsing.Config, com.google.javascript.rhino.head.ErrorReporter)",
      "begin_line": 129,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 25)",
        "(line 135,col 5)-(line 135,col 41)",
        "(line 138,col 5)-(line 139,col 54)",
        "(line 141,col 5)-(line 141,col 77)",
        "(line 142,col 5)-(line 145,col 5)",
        "(line 146,col 5)-(line 146,col 50)",
        "(line 147,col 5)-(line 147,col 52)",
        "(line 149,col 5)-(line 149,col 39)",
        "(line 150,col 5)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.getSourceName()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseInlineTypeDoc()",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n   * Parse a description as a {@code @type}.\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 15)",
        "(line 163,col 5)-(line 163,col 50)",
        "(line 164,col 5)-(line 164,col 60)",
        "(line 165,col 5)-(line 168,col 5)",
        "(line 169,col 5)-(line 169,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(java.lang.String)",
      "begin_line": 176,
      "end_line": 191,
      "comment": "\n   * Parses a string containing a JsDoc type declaration, returning the\n   * type if the parsing succeeded or {@code null} if it failed.\n   ",
      "child_ranges": [
        "(line 177,col 5)-(line 182,col 15)",
        "(line 183,col 5)-(line 188,col 41)",
        "(line 190,col 5)-(line 190,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parse()",
      "begin_line": 201,
      "end_line": 224,
      "comment": "\n   * Parses a {@link JSDocInfo} object. This parsing method reads all tokens\n   * returned by the {@link JsDocTokenStream#getJsDocToken()} method until the\n   * {@link JsDocToken#EOC} is returned.\n   *\n   * @return {@code true} if JSDoc information was correctly parsed,\n   *     {@code false} otherwise\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 39)",
        "(line 203,col 5)-(line 203,col 15)",
        "(line 205,col 5)-(line 205,col 30)",
        "(line 208,col 5)-(line 221,col 5)",
        "(line 223,col 5)-(line 223,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseHelperLoop(com.google.javascript.jscomp.parsing.JsDocToken, java.util.List\u003ccom.google.javascript.jscomp.parsing.JsDocInfoParser.ExtendedTypeInfo\u003e)",
      "begin_line": 226,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 270,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAnnotation(com.google.javascript.jscomp.parsing.JsDocToken, java.util.List\u003ccom.google.javascript.jscomp.parsing.JsDocInfoParser.ExtendedTypeInfo\u003e)",
      "begin_line": 273,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 26)",
        "(line 277,col 5)-(line 277,col 36)",
        "(line 278,col 5)-(line 278,col 36)",
        "(line 280,col 5)-(line 280,col 47)",
        "(line 281,col 5)-(line 281,col 64)",
        "(line 282,col 5)-(line 998,col 5)",
        "(line 1000,col 5)-(line 1000,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.recordDescription(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1007,
      "end_line": 1016,
      "comment": "\n   * Records a marker\u0027s description if there is one available and record it in\n   * the current marker.\n   ",
      "child_ranges": [
        "(line 1009,col 5)-(line 1014,col 5)",
        "(line 1015,col 5)-(line 1015,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.checkExtendedTypes(java.util.List\u003ccom.google.javascript.jscomp.parsing.JsDocInfoParser.ExtendedTypeInfo\u003e)",
      "begin_line": 1018,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 5)-(line 1032,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseSuppressTag(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1041,
      "end_line": 1079,
      "comment": "\n   * Parse a {@code @suppress} tag of the form\n   * {@code @suppress\u0026#123;warning1|warning2\u0026#125;}.\n   *\n   * @param token The current token.\n   ",
      "child_ranges": [
        "(line 1042,col 5)-(line 1077,col 5)",
        "(line 1078,col 5)-(line 1078,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseModifiesTag(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1087,
      "end_line": 1126,
      "comment": "\n   * Parse a {@code @modifies} tag of the form\n   * {@code @modifies\u0026#123;this|arguments|param\u0026#125;}.\n   *\n   * @param token The current token.\n   ",
      "child_ranges": [
        "(line 1088,col 5)-(line 1124,col 5)",
        "(line 1125,col 5)-(line 1125,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseIdGeneratorTag(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1135,
      "end_line": 1185,
      "comment": "\n   * Parse a {@code @idgenerator} tag of the form\n   * {@code @idgenerator} or\n   * {@code @idgenerator\u0026#123;consistent\u0026#125;}.\n   *\n   * @param token The current token.\n   ",
      "child_ranges": [
        "(line 1136,col 5)-(line 1136,col 32)",
        "(line 1137,col 5)-(line 1160,col 5)",
        "(line 1162,col 5)-(line 1182,col 5)",
        "(line 1184,col 5)-(line 1184,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1194,
      "end_line": 1196,
      "comment": "\n   * Looks for a type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * @param token The current token.\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1195,col 5)-(line 1195,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken, boolean)",
      "begin_line": 1206,
      "end_line": 1209,
      "comment": "\n   * Looks for a type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * @param token The current token.\n   * @param matchingLC Whether the type expression starts with a \"{\".\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1207,col 5)-(line 1208,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordTypeNameNode(com.google.javascript.jscomp.parsing.JsDocToken, int, int, boolean)",
      "begin_line": 1221,
      "end_line": 1224,
      "comment": "\n   * Looks for a type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * @param token The current token.\n   * @param lineno The line of the type expression.\n   * @param startCharno The starting character position of the type expression.\n   * @param matchingLC Whether the type expression starts with a \"{\".\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1223,col 5)-(line 1223,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordParamTypeNode(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1239,
      "end_line": 1253,
      "comment": "\n   * Looks for a type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * Parameter type expressions are special for two reasons:\n   * \u003col\u003e\n   *   \u003cli\u003eThey must begin with \u0027{\u0027, to distinguish type names from param names.\n   *   \u003cli\u003eThey may end in \u0027\u003d\u0027, to denote optionality.\n   * \u003c/ol\u003e\n   *\n   * @param token The current token.\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1240,col 5)-(line 1240,col 56)",
        "(line 1241,col 5)-(line 1241,col 36)",
        "(line 1242,col 5)-(line 1242,col 41)",
        "(line 1244,col 5)-(line 1244,col 62)",
        "(line 1245,col 5)-(line 1251,col 5)",
        "(line 1252,col 5)-(line 1252,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken, int, int, boolean, boolean)",
      "begin_line": 1268,
      "end_line": 1289,
      "comment": "\n   * Looks for a parameter type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * @param token The current token.\n   * @param lineno The line of the type expression.\n   * @param startCharno The starting character position of the type expression.\n   * @param matchingLC Whether the type expression starts with a \"{\".\n   * @param onlyParseSimpleNames If true, only simple type names are parsed\n   *     (via a call to parseTypeNameAnnotation instead of\n   *     parseTypeExpressionAnnotation).\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1272,col 5)-(line 1272,col 25)",
        "(line 1274,col 5)-(line 1278,col 5)",
        "(line 1280,col 5)-(line 1286,col 5)",
        "(line 1288,col 5)-(line 1288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.toString(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1294,
      "end_line": 1353,
      "comment": "\n   * Converts a JSDoc token to its string representation.\n   ",
      "child_ranges": [
        "(line 1295,col 5)-(line 1352,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.createJSTypeExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1359,
      "end_line": 1362,
      "comment": "\n   * Constructs a new {@code JSTypeExpression}.\n   * @param n A node. May be null.\n   ",
      "child_ranges": [
        "(line 1360,col 5)-(line 1361,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExtractionInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1369,
      "end_line": 1377,
      "comment": "\n   * Tuple for returning both the string extracted and the\n   * new token following a call to any of the extract*Block\n   * methods.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 1370,
      "end_line": 1370,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "token"
      ],
      "begin_line": 1371,
      "end_line": 1371,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo.ExtractionInfo(java.lang.String, com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1373,
      "end_line": 1376,
      "comment": "",
      "child_ranges": [
        "(line 1374,col 7)-(line 1374,col 27)",
        "(line 1375,col 7)-(line 1375,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExtendedTypeInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1382,
      "end_line": 1392,
      "comment": "\n   * Tuple for recording extended types\n   "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 1383,
      "end_line": 1383,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineno"
      ],
      "begin_line": 1384,
      "end_line": 1384,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charno"
      ],
      "begin_line": 1385,
      "end_line": 1385,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtendedTypeInfo.ExtendedTypeInfo(com.google.javascript.rhino.JSTypeExpression, int, int)",
      "begin_line": 1387,
      "end_line": 1391,
      "comment": "",
      "child_ranges": [
        "(line 1388,col 7)-(line 1388,col 23)",
        "(line 1389,col 7)-(line 1389,col 27)",
        "(line 1390,col 7)-(line 1390,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.extractSingleLineBlock()",
      "begin_line": 1401,
      "end_line": 1417,
      "comment": "\n   * Extracts the text found on the current line starting at token. Note that\n   * token \u003d token.info; should be called after this method is used to update\n   * the token properly in the parser.\n   *\n   * @return The extraction information.\n   ",
      "child_ranges": [
        "(line 1404,col 5)-(line 1404,col 20)",
        "(line 1405,col 5)-(line 1405,col 36)",
        "(line 1406,col 5)-(line 1406,col 40)",
        "(line 1408,col 5)-(line 1408,col 49)",
        "(line 1411,col 5)-(line 1414,col 5)",
        "(line 1416,col 5)-(line 1416,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.extractMultilineTextualBlock(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1419,
      "end_line": 1421,
      "comment": "",
      "child_ranges": [
        "(line 1420,col 5)-(line 1420,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.extractMultilineTextualBlock(com.google.javascript.jscomp.parsing.JsDocToken, com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption)",
      "begin_line": 1450,
      "end_line": 1563,
      "comment": "\n   * Extracts the text found on the current line and all subsequent\n   * until either an annotation, end of comment or end of file is reached.\n   * Note that if this method detects an end of line as the first token, it\n   * will quit immediately (indicating that there is no text where it was\n   * expected).  Note that token \u003d info.token; should be called after this\n   * method is used to update the token properly in the parser.\n   *\n   * @param token The start token.\n   * @param option How to handle whitespace.\n   *\n   * @return The extraction information.\n   ",
      "child_ranges": [
        "(line 1454,col 5)-(line 1457,col 5)",
        "(line 1459,col 5)-(line 1459,col 20)",
        "(line 1460,col 5)-(line 1460,col 41)",
        "(line 1461,col 5)-(line 1461,col 45)",
        "(line 1464,col 5)-(line 1464,col 42)",
        "(line 1465,col 5)-(line 1467,col 5)",
        "(line 1469,col 5)-(line 1469,col 48)",
        "(line 1470,col 5)-(line 1470,col 25)",
        "(line 1472,col 5)-(line 1472,col 39)",
        "(line 1473,col 5)-(line 1473,col 19)",
        "(line 1475,col 5)-(line 1475,col 31)",
        "(line 1480,col 5)-(line 1480,col 27)",
        "(line 1482,col 5)-(line 1562,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.extractBlockComment(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1577,
      "end_line": 1622,
      "comment": "\n   * Extracts the top-level block comment from the JsDoc comment, if any.\n   * This method differs from the extractMultilineTextualBlock in that it\n   * terminates under different conditions (it doesn\u0027t have the same\n   * prechecks), it does not first read in the remaining of the current\n   * line and its conditions for ignoring the \"*\" (STAR) are different.\n   *\n   * @param token The starting token.\n   *\n   * @return The extraction information.\n   ",
      "child_ranges": [
        "(line 1578,col 5)-(line 1578,col 48)",
        "(line 1580,col 5)-(line 1580,col 30)",
        "(line 1582,col 5)-(line 1621,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.trimEnd(java.lang.String)",
      "begin_line": 1634,
      "end_line": 1649,
      "comment": "\n   * Trim characters from only the end of a string.\n   * This method will remove all whitespace characters\n   * (defined by Character.isWhitespace(char), in addition to the characters\n   * provided, from the end of the provided string.\n   *\n   * @param s String to be trimmed\n   * @return String with whitespace and characters in extraChars removed\n   *                   from the end.\n   ",
      "child_ranges": [
        "(line 1635,col 5)-(line 1635,col 22)",
        "(line 1636,col 5)-(line 1643,col 5)",
        "(line 1645,col 5)-(line 1647,col 5)",
        "(line 1648,col 5)-(line 1648,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeExpressionAnnotation(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1664,
      "end_line": 1681,
      "comment": "\n   * TypeExpressionAnnotation :\u003d TypeExpression |\n   *     \u0027{\u0027 TopLevelTypeExpression \u0027}\u0027\n   ",
      "child_ranges": [
        "(line 1665,col 5)-(line 1680,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseParamTypeExpressionAnnotation(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1692,
      "end_line": 1727,
      "comment": "\n   * ParamTypeExpressionAnnotation :\u003d\n   *     \u0027{\u0027 OptionalParameterType \u0027}\u0027 |\n   *     \u0027{\u0027 TopLevelTypeExpression \u0027}\u0027 |\n   *     \u0027{\u0027 \u0027...\u0027 TopLevelTypeExpression \u0027}\u0027\n   *\n   * OptionalParameterType :\u003d\n   *     TopLevelTypeExpression \u0027\u003d\u0027\n   ",
      "child_ranges": [
        "(line 1693,col 5)-(line 1693,col 56)",
        "(line 1695,col 5)-(line 1695,col 15)",
        "(line 1697,col 5)-(line 1697,col 28)",
        "(line 1698,col 5)-(line 1698,col 19)",
        "(line 1699,col 5)-(line 1706,col 5)",
        "(line 1708,col 5)-(line 1708,col 55)",
        "(line 1709,col 5)-(line 1724,col 5)",
        "(line 1726,col 5)-(line 1726,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeNameAnnotation(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1732,
      "end_line": 1749,
      "comment": "\n   * TypeNameAnnotation :\u003d TypeName | \u0027{\u0027 TypeName \u0027}\u0027\n   ",
      "child_ranges": [
        "(line 1733,col 5)-(line 1748,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTopLevelTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1757,
      "end_line": 1773,
      "comment": "\n   * TopLevelTypeExpression :\u003d TypeExpression\n   *     | TypeUnionList\n   *\n   * We made this rule up, for the sake of backwards compatibility.\n   ",
      "child_ranges": [
        "(line 1758,col 5)-(line 1758,col 47)",
        "(line 1759,col 5)-(line 1771,col 5)",
        "(line 1772,col 5)-(line 1772,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeExpressionList(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1779,
      "end_line": 1796,
      "comment": "\n   * TypeExpressionList :\u003d TopLevelTypeExpression\n   *     | TopLevelTypeExpression \u0027,\u0027 TypeExpressionList\n   ",
      "child_ranges": [
        "(line 1780,col 5)-(line 1780,col 55)",
        "(line 1781,col 5)-(line 1783,col 5)",
        "(line 1784,col 5)-(line 1784,col 31)",
        "(line 1785,col 5)-(line 1785,col 38)",
        "(line 1786,col 5)-(line 1794,col 5)",
        "(line 1795,col 5)-(line 1795,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1806,
      "end_line": 1849,
      "comment": "\n   * TypeExpression :\u003d BasicTypeExpression\n   *     | \u0027?\u0027 BasicTypeExpression\n   *     | \u0027!\u0027 BasicTypeExpression\n   *     | BasicTypeExpression \u0027?\u0027\n   *     | BasicTypeExpression \u0027!\u0027\n   *     | \u0027?\u0027\n   ",
      "child_ranges": [
        "(line 1807,col 5)-(line 1848,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseBasicTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1855,
      "end_line": 1881,
      "comment": "\n   * BasicTypeExpression :\u003d \u0027*\u0027 | \u0027null\u0027 | \u0027undefined\u0027 | TypeName\n   *     | FunctionType | UnionType | RecordType | ArrayType\n   ",
      "child_ranges": [
        "(line 1856,col 5)-(line 1877,col 5)",
        "(line 1879,col 5)-(line 1879,col 28)",
        "(line 1880,col 5)-(line 1880,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeName(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1887,
      "end_line": 1922,
      "comment": "\n   * TypeName :\u003d NameExpression | NameExpression TypeApplication\n   * TypeApplication :\u003d \u0027.\u003c\u0027 TypeExpressionList \u0027\u003e\u0027\n   ",
      "child_ranges": [
        "(line 1888,col 5)-(line 1890,col 5)",
        "(line 1892,col 5)-(line 1892,col 41)",
        "(line 1893,col 5)-(line 1893,col 36)",
        "(line 1894,col 5)-(line 1894,col 36)",
        "(line 1895,col 5)-(line 1902,col 5)",
        "(line 1904,col 5)-(line 1904,col 64)",
        "(line 1906,col 5)-(line 1920,col 5)",
        "(line 1921,col 5)-(line 1921,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseFunctionType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1929,
      "end_line": 1999,
      "comment": "\n   * FunctionType :\u003d \u0027function\u0027 FunctionSignatureType\n   * FunctionSignatureType :\u003d\n   *    TypeParameters \u0027(\u0027 \u0027this\u0027 \u0027:\u0027 TypeName, ParametersType \u0027)\u0027 ResultType\n   ",
      "child_ranges": [
        "(line 1932,col 5)-(line 1935,col 5)",
        "(line 1937,col 5)-(line 1937,col 48)",
        "(line 1938,col 5)-(line 1938,col 27)",
        "(line 1939,col 5)-(line 1939,col 15)",
        "(line 1940,col 5)-(line 1980,col 5)",
        "(line 1982,col 5)-(line 1984,col 5)",
        "(line 1986,col 5)-(line 1986,col 15)",
        "(line 1987,col 5)-(line 1989,col 5)",
        "(line 1991,col 5)-(line 1991,col 15)",
        "(line 1992,col 5)-(line 1992,col 46)",
        "(line 1993,col 5)-(line 1997,col 5)",
        "(line 1998,col 5)-(line 1998,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseParametersType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2023,
      "end_line": 2087,
      "comment": " order-checking in two places, we just do all of it in type resolution.",
      "child_ranges": [
        "(line 2024,col 5)-(line 2024,col 48)",
        "(line 2025,col 5)-(line 2025,col 30)",
        "(line 2026,col 5)-(line 2026,col 26)",
        "(line 2027,col 5)-(line 2078,col 5)",
        "(line 2080,col 5)-(line 2082,col 5)",
        "(line 2086,col 5)-(line 2086,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseResultType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2092,
      "end_line": 2106,
      "comment": "\n   * ResultType :\u003d \u003cempty\u003e | \u0027:\u0027 void | \u0027:\u0027 TypeExpression\n   ",
      "child_ranges": [
        "(line 2093,col 5)-(line 2093,col 15)",
        "(line 2094,col 5)-(line 2096,col 5)",
        "(line 2098,col 5)-(line 2098,col 19)",
        "(line 2099,col 5)-(line 2099,col 15)",
        "(line 2100,col 5)-(line 2105,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseUnionType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2114,
      "end_line": 2116,
      "comment": "\n   * UnionType :\u003d \u0027(\u0027 TypeUnionList \u0027)\u0027\n   * TypeUnionList :\u003d TypeExpression | TypeExpression \u0027|\u0027 TypeUnionList\n   *\n   * We\u0027ve removed the empty union type.\n   ",
      "child_ranges": [
        "(line 2115,col 5)-(line 2115,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseUnionTypeWithAlternate(com.google.javascript.jscomp.parsing.JsDocToken, com.google.javascript.rhino.Node)",
      "begin_line": 2122,
      "end_line": 2161,
      "comment": "\n   * Create a new union type, with an alternate that has already been\n   * parsed. The alternate may be null.\n   ",
      "child_ranges": [
        "(line 2123,col 5)-(line 2123,col 37)",
        "(line 2124,col 5)-(line 2126,col 5)",
        "(line 2128,col 5)-(line 2128,col 21)",
        "(line 2129,col 5)-(line 2151,col 55)",
        "(line 2153,col 5)-(line 2159,col 5)",
        "(line 2160,col 5)-(line 2160,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseArrayType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2168,
      "end_line": 2202,
      "comment": "\n   * ArrayType :\u003d \u0027[\u0027 ElementTypeList \u0027]\u0027\n   * ElementTypeList :\u003d \u003cempty\u003e | TypeExpression | \u0027...\u0027 TypeExpression\n   *     | TypeExpression \u0027,\u0027 ElementTypeList\n   ",
      "child_ranges": [
        "(line 2169,col 5)-(line 2169,col 35)",
        "(line 2170,col 5)-(line 2170,col 20)",
        "(line 2171,col 5)-(line 2171,col 31)",
        "(line 2173,col 5)-(line 2195,col 38)",
        "(line 2197,col 5)-(line 2199,col 5)",
        "(line 2200,col 5)-(line 2200,col 11)",
        "(line 2201,col 5)-(line 2201,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseRecordType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2207,
      "end_line": 2224,
      "comment": "\n   * RecordType :\u003d \u0027{\u0027 FieldTypeList \u0027}\u0027\n   ",
      "child_ranges": [
        "(line 2208,col 5)-(line 2208,col 40)",
        "(line 2209,col 5)-(line 2209,col 51)",
        "(line 2211,col 5)-(line 2213,col 5)",
        "(line 2215,col 5)-(line 2215,col 15)",
        "(line 2216,col 5)-(line 2218,col 5)",
        "(line 2220,col 5)-(line 2220,col 11)",
        "(line 2222,col 5)-(line 2222,col 45)",
        "(line 2223,col 5)-(line 2223,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseFieldTypeList(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2229,
      "end_line": 2255,
      "comment": "\n   * FieldTypeList :\u003d FieldType | FieldType \u0027,\u0027 FieldTypeList\n   ",
      "child_ranges": [
        "(line 2230,col 5)-(line 2230,col 43)",
        "(line 2232,col 5)-(line 2252,col 19)",
        "(line 2254,col 5)-(line 2254,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseFieldType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2260,
      "end_line": 2288,
      "comment": "\n   * FieldType :\u003d FieldName | FieldName \u0027:\u0027 TypeExpression\n   ",
      "child_ranges": [
        "(line 2261,col 5)-(line 2261,col 43)",
        "(line 2263,col 5)-(line 2265,col 5)",
        "(line 2267,col 5)-(line 2267,col 15)",
        "(line 2268,col 5)-(line 2270,col 5)",
        "(line 2273,col 5)-(line 2273,col 11)",
        "(line 2277,col 5)-(line 2277,col 15)",
        "(line 2278,col 5)-(line 2278,col 54)",
        "(line 2280,col 5)-(line 2282,col 5)",
        "(line 2284,col 5)-(line 2284,col 42)",
        "(line 2285,col 5)-(line 2285,col 40)",
        "(line 2286,col 5)-(line 2286,col 45)",
        "(line 2287,col 5)-(line 2287,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseFieldName(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2294,
      "end_line": 2303,
      "comment": "\n   * FieldName :\u003d NameExpression | StringLiteral | NumberLiteral |\n   * ReservedIdentifier\n   ",
      "child_ranges": [
        "(line 2295,col 5)-(line 2302,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.wrapNode(int, com.google.javascript.rhino.Node)",
      "begin_line": 2305,
      "end_line": 2309,
      "comment": "",
      "child_ranges": [
        "(line 2306,col 5)-(line 2308,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.newNode(int)",
      "begin_line": 2311,
      "end_line": 2314,
      "comment": "",
      "child_ranges": [
        "(line 2312,col 5)-(line 2313,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.newStringNode(java.lang.String)",
      "begin_line": 2316,
      "end_line": 2318,
      "comment": "",
      "child_ranges": [
        "(line 2317,col 5)-(line 2317,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.newStringNode(java.lang.String, int, int)",
      "begin_line": 2320,
      "end_line": 2324,
      "comment": "",
      "child_ranges": [
        "(line 2321,col 5)-(line 2321,col 76)",
        "(line 2322,col 5)-(line 2322,col 28)",
        "(line 2323,col 5)-(line 2323,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.createTemplateNode()",
      "begin_line": 2328,
      "end_line": 2336,
      "comment": " e.g., source-name, between all nodes.",
      "child_ranges": [
        "(line 2330,col 5)-(line 2330,col 36)",
        "(line 2331,col 5)-(line 2334,col 12)",
        "(line 2335,col 5)-(line 2335,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.reportTypeSyntaxWarning(java.lang.String)",
      "begin_line": 2338,
      "end_line": 2341,
      "comment": "",
      "child_ranges": [
        "(line 2339,col 5)-(line 2339,col 75)",
        "(line 2340,col 5)-(line 2340,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.reportGenericTypeSyntaxWarning()",
      "begin_line": 2343,
      "end_line": 2345,
      "comment": "",
      "child_ranges": [
        "(line 2344,col 5)-(line 2344,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.eatTokensUntilEOL()",
      "begin_line": 2351,
      "end_line": 2353,
      "comment": "\n   * Eats tokens until {@link JsDocToken#EOL} included, and switches back the\n   * state to {@link State#SEARCHING_ANNOTATION}.\n   ",
      "child_ranges": [
        "(line 2352,col 5)-(line 2352,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.eatTokensUntilEOL(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2359,
      "end_line": 2368,
      "comment": "\n   * Eats tokens until {@link JsDocToken#EOL} included, and switches back the\n   * state to {@link State#SEARCHING_ANNOTATION}.\n   ",
      "child_ranges": [
        "(line 2360,col 5)-(line 2367,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NO_UNREAD_TOKEN"
      ],
      "begin_line": 2373,
      "end_line": 2373,
      "comment": "\n   * Specific value indicating that the {@link #unreadToken} contains no token.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "unreadToken"
      ],
      "begin_line": 2378,
      "end_line": 2378,
      "comment": "\n   * One token buffer.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.restoreLookAhead(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2381,
      "end_line": 2383,
      "comment": " Restores the lookahead token to the token stream ",
      "child_ranges": [
        "(line 2382,col 5)-(line 2382,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.match(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2389,
      "end_line": 2392,
      "comment": "\n   * Tests whether the next symbol of the token stream matches the specific\n   * token.\n   ",
      "child_ranges": [
        "(line 2390,col 5)-(line 2390,col 25)",
        "(line 2391,col 5)-(line 2391,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.match(com.google.javascript.jscomp.parsing.JsDocToken, com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2398,
      "end_line": 2401,
      "comment": "\n   * Tests that the next symbol of the token stream matches one of the specified\n   * tokens.\n   ",
      "child_ranges": [
        "(line 2399,col 5)-(line 2399,col 25)",
        "(line 2400,col 5)-(line 2400,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.next()",
      "begin_line": 2407,
      "end_line": 2413,
      "comment": "\n   * Gets the next token of the token stream or the buffered token if a matching\n   * was previously made.\n   ",
      "child_ranges": [
        "(line 2408,col 5)-(line 2412,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.current()",
      "begin_line": 2418,
      "end_line": 2422,
      "comment": "\n   * Gets the current token, invalidating it in the process.\n   ",
      "child_ranges": [
        "(line 2419,col 5)-(line 2419,col 31)",
        "(line 2420,col 5)-(line 2420,col 34)",
        "(line 2421,col 5)-(line 2421,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.skipEOLs()",
      "begin_line": 2428,
      "end_line": 2435,
      "comment": "\n   * Skips all EOLs and all empty lines in the JSDoc. Call this method if you\n   * want the JSDoc entry to span multiple lines.\n   ",
      "child_ranges": [
        "(line 2429,col 5)-(line 2434,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.getRemainingJSDocLine()",
      "begin_line": 2440,
      "end_line": 2444,
      "comment": "\n   * Returns the remainder of the line.\n   ",
      "child_ranges": [
        "(line 2441,col 5)-(line 2441,col 51)",
        "(line 2442,col 5)-(line 2442,col 34)",
        "(line 2443,col 5)-(line 2443,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.hasParsedFileOverviewDocInfo()",
      "begin_line": 2450,
      "end_line": 2452,
      "comment": "\n   * Determines whether the parser has been populated with docinfo with a\n   * fileoverview tag.\n   ",
      "child_ranges": [
        "(line 2451,col 5)-(line 2451,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.hasParsedJSDocInfo()",
      "begin_line": 2454,
      "end_line": 2456,
      "comment": "",
      "child_ranges": [
        "(line 2455,col 5)-(line 2455,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.retrieveAndResetParsedJSDocInfo()",
      "begin_line": 2458,
      "end_line": 2460,
      "comment": "",
      "child_ranges": [
        "(line 2459,col 5)-(line 2459,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.getFileOverviewJSDocInfo()",
      "begin_line": 2465,
      "end_line": 2467,
      "comment": "\n   * Gets the fileoverview JSDocInfo, if any.\n   ",
      "child_ranges": [
        "(line 2466,col 5)-(line 2466,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.lookAheadForTypeAnnotation()",
      "begin_line": 2477,
      "end_line": 2493,
      "comment": "\n   * Look ahead for a type annotation by advancing the character stream.\n   * Does not modify the token stream.\n   * This is kind of a hack, and is only necessary because we use the token\n   * stream to parse types, but need the underlying character stream to get\n   * JsDoc descriptions.\n   * @return Whether we found a type annotation.\n   ",
      "child_ranges": [
        "(line 2478,col 5)-(line 2478,col 30)",
        "(line 2479,col 5)-(line 2479,col 10)",
        "(line 2480,col 5)-(line 2490,col 5)",
        "(line 2491,col 5)-(line 2491,col 24)",
        "(line 2492,col 5)-(line 2492,col 21)"
      ]
    }
  ]
}