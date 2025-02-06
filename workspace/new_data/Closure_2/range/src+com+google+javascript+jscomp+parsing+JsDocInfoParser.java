{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/parsing/JsDocInfoParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsDocInfoParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 2401,
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
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser.addParserWarning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 64,col 7)-(line 65,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser.addParserWarning(java.lang.String, int, int)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 70,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser.addTypeWarning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 73,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 75,col 7)-(line 78,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser.addTypeWarning(java.lang.String, int, int)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 82,col 7)-(line 85,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "fileOverviewJSDocInfo"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The DocInfo with the fileoverview tag for the whole file."
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "annotationNames"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suppressionNames"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifiesAnnotationKeywords"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileLevelJsDocBuilder"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.setFileLevelJsDocBuilder(com.google.javascript.rhino.Node.FileLevelJsDocBuilder)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n   * Sets the JsDocBuilder for the file-level (root) node of this parse. The\n   * parser uses the builder to append any preserve annotations it encounters\n   * in JsDoc comments.\n   *\n   * @param fileLevelJsDocBuilder\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.setFileOverviewJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n   * Sets the file overview JSDocInfo, in order to warn about multiple uses of\n   * the @fileoverview tag in a file.\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.JsDocInfoParser(com.google.javascript.jscomp.parsing.JsDocTokenStream, com.google.javascript.rhino.head.ast.Comment, com.google.javascript.rhino.Node, com.google.javascript.jscomp.parsing.Config, com.google.javascript.rhino.head.ErrorReporter)",
      "begin_line": 126,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 25)",
        "(line 132,col 5)-(line 132,col 41)",
        "(line 135,col 5)-(line 136,col 54)",
        "(line 138,col 5)-(line 138,col 77)",
        "(line 139,col 5)-(line 141,col 5)",
        "(line 142,col 5)-(line 142,col 50)",
        "(line 143,col 5)-(line 143,col 52)",
        "(line 145,col 5)-(line 145,col 39)",
        "(line 146,col 5)-(line 146,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.getSourceName()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(java.lang.String)",
      "begin_line": 157,
      "end_line": 172,
      "comment": "\n   * Parses a string containing a JsDoc type declaration, returning the\n   * type if the parsing succeeded or {@code null} if it failed.\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 163,col 15)",
        "(line 164,col 5)-(line 169,col 41)",
        "(line 171,col 5)-(line 171,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parse()",
      "begin_line": 182,
      "end_line": 991,
      "comment": "\n   * Parses a {@link JSDocInfo} object. This parsing method reads all tokens\n   * returned by the {@link JsDocTokenStream#getJsDocToken()} method until the\n   * {@link JsDocToken#EOC} is returned.\n   *\n   * @return {@code true} if JSDoc information was correctly parsed,\n   *     {@code false} otherwise\n   ",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 15)",
        "(line 184,col 5)-(line 184,col 15)",
        "(line 187,col 5)-(line 187,col 26)",
        "(line 189,col 5)-(line 189,col 39)",
        "(line 190,col 5)-(line 190,col 15)",
        "(line 192,col 5)-(line 192,col 30)",
        "(line 194,col 5)-(line 194,col 64)",
        "(line 197,col 5)-(line 210,col 5)",
        "(line 213,col 5)-(line 990,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.checkExtendedTypes(java.util.List\u003ccom.google.javascript.jscomp.parsing.JsDocInfoParser.ExtendedTypeInfo\u003e)",
      "begin_line": 993,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 994,col 5)-(line 1007,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseSuppressTag(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1016,
      "end_line": 1054,
      "comment": "\n   * Parse a {@code @suppress} tag of the form\n   * {@code @suppress\u0026#123;warning1|warning2\u0026#125;}.\n   *\n   * @param token The current token.\n   ",
      "child_ranges": [
        "(line 1017,col 5)-(line 1052,col 5)",
        "(line 1053,col 5)-(line 1053,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseModifiesTag(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1062,
      "end_line": 1101,
      "comment": "\n   * Parse a {@code @modifies} tag of the form\n   * {@code @modifies\u0026#123;this|arguments|param\u0026#125;}.\n   *\n   * @param token The current token.\n   ",
      "child_ranges": [
        "(line 1063,col 5)-(line 1099,col 5)",
        "(line 1100,col 5)-(line 1100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1110,
      "end_line": 1112,
      "comment": "\n   * Looks for a type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * @param token The current token.\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1111,col 5)-(line 1111,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken, boolean)",
      "begin_line": 1122,
      "end_line": 1125,
      "comment": "\n   * Looks for a type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * @param token The current token.\n   * @param matchingLC Whether the type expression starts with a \"{\".\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1123,col 5)-(line 1124,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordTypeNameNode(com.google.javascript.jscomp.parsing.JsDocToken, int, int, boolean)",
      "begin_line": 1137,
      "end_line": 1140,
      "comment": "\n   * Looks for a type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * @param token The current token.\n   * @param lineno The line of the type expression.\n   * @param startCharno The starting character position of the type expression.\n   * @param matchingLC Whether the type expression starts with a \"{\".\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1139,col 5)-(line 1139,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordParamTypeNode(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1155,
      "end_line": 1169,
      "comment": "\n   * Looks for a type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * Parameter type expressions are special for two reasons:\n   * \u003col\u003e\n   *   \u003cli\u003eThey must begin with \u0027{\u0027, to distinguish type names from param names.\n   *   \u003cli\u003eThey may end in \u0027\u003d\u0027, to denote optionality.\n   * \u003c/ol\u003e\n   *\n   * @param token The current token.\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1156,col 5)-(line 1156,col 56)",
        "(line 1157,col 5)-(line 1157,col 36)",
        "(line 1158,col 5)-(line 1158,col 41)",
        "(line 1160,col 5)-(line 1160,col 62)",
        "(line 1161,col 5)-(line 1167,col 5)",
        "(line 1168,col 5)-(line 1168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken, int, int, boolean, boolean)",
      "begin_line": 1184,
      "end_line": 1205,
      "comment": "\n   * Looks for a parameter type expression at the current token and if found,\n   * returns it. Note that this method consumes input.\n   *\n   * @param token The current token.\n   * @param lineno The line of the type expression.\n   * @param startCharno The starting character position of the type expression.\n   * @param matchingLC Whether the type expression starts with a \"{\".\n   * @param onlyParseSimpleNames If true, only simple type names are parsed\n   *     (via a call to parseTypeNameAnnotation instead of\n   *     parseTypeExpressionAnnotation).\n   * @return The type expression found or null if none.\n   ",
      "child_ranges": [
        "(line 1188,col 5)-(line 1188,col 25)",
        "(line 1190,col 5)-(line 1194,col 5)",
        "(line 1196,col 5)-(line 1202,col 5)",
        "(line 1204,col 5)-(line 1204,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.toString(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1210,
      "end_line": 1269,
      "comment": "\n   * Converts a JSDoc token to its string representation.\n   ",
      "child_ranges": [
        "(line 1211,col 5)-(line 1268,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.createJSTypeExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1275,
      "end_line": 1278,
      "comment": "\n   * Constructs a new {@code JSTypeExpression}.\n   * @param n A node. May be null.\n   ",
      "child_ranges": [
        "(line 1276,col 5)-(line 1277,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExtractionInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1285,
      "end_line": 1293,
      "comment": "\n   * Tuple for returning both the string extracted and the\n   * new token following a call to any of the extract*Block\n   * methods.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 1286,
      "end_line": 1286,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "token"
      ],
      "begin_line": 1287,
      "end_line": 1287,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo.ExtractionInfo(java.lang.String, com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1289,
      "end_line": 1292,
      "comment": "",
      "child_ranges": [
        "(line 1290,col 7)-(line 1290,col 27)",
        "(line 1291,col 7)-(line 1291,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExtendedTypeInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1298,
      "end_line": 1308,
      "comment": "\n   * Tuple for recording extended types\n   "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 1299,
      "end_line": 1299,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineno"
      ],
      "begin_line": 1300,
      "end_line": 1300,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charno"
      ],
      "begin_line": 1301,
      "end_line": 1301,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtendedTypeInfo.ExtendedTypeInfo(com.google.javascript.rhino.JSTypeExpression, int, int)",
      "begin_line": 1303,
      "end_line": 1307,
      "comment": "",
      "child_ranges": [
        "(line 1304,col 7)-(line 1304,col 23)",
        "(line 1305,col 7)-(line 1305,col 27)",
        "(line 1306,col 7)-(line 1306,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.extractSingleLineBlock()",
      "begin_line": 1317,
      "end_line": 1333,
      "comment": "\n   * Extracts the text found on the current line starting at token. Note that\n   * token \u003d token.info; should be called after this method is used to update\n   * the token properly in the parser.\n   *\n   * @return The extraction information.\n   ",
      "child_ranges": [
        "(line 1320,col 5)-(line 1320,col 20)",
        "(line 1321,col 5)-(line 1321,col 36)",
        "(line 1322,col 5)-(line 1322,col 40)",
        "(line 1324,col 5)-(line 1324,col 56)",
        "(line 1327,col 5)-(line 1330,col 5)",
        "(line 1332,col 5)-(line 1332,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.extractMultilineTextualBlock(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1335,
      "end_line": 1337,
      "comment": "",
      "child_ranges": [
        "(line 1336,col 5)-(line 1336,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.extractMultilineTextualBlock(com.google.javascript.jscomp.parsing.JsDocToken, com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption)",
      "begin_line": 1366,
      "end_line": 1479,
      "comment": "\n   * Extracts the text found on the current line and all subsequent\n   * until either an annotation, end of comment or end of file is reached.\n   * Note that if this method detects an end of line as the first token, it\n   * will quit immediately (indicating that there is no text where it was\n   * expected).  Note that token \u003d info.token; should be called after this\n   * method is used to update the token properly in the parser.\n   *\n   * @param token The start token.\n   * @param option How to handle whitespace.\n   *\n   * @return The extraction information.\n   ",
      "child_ranges": [
        "(line 1370,col 5)-(line 1373,col 5)",
        "(line 1375,col 5)-(line 1375,col 20)",
        "(line 1376,col 5)-(line 1376,col 41)",
        "(line 1377,col 5)-(line 1377,col 45)",
        "(line 1380,col 5)-(line 1380,col 49)",
        "(line 1381,col 5)-(line 1383,col 5)",
        "(line 1385,col 5)-(line 1385,col 48)",
        "(line 1386,col 5)-(line 1386,col 25)",
        "(line 1388,col 5)-(line 1388,col 39)",
        "(line 1389,col 5)-(line 1389,col 19)",
        "(line 1391,col 5)-(line 1391,col 31)",
        "(line 1396,col 5)-(line 1396,col 27)",
        "(line 1398,col 5)-(line 1478,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.extractBlockComment(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1493,
      "end_line": 1538,
      "comment": "\n   * Extracts the top-level block comment from the JsDoc comment, if any.\n   * This method differs from the extractMultilineTextualBlock in that it\n   * terminates under different conditions (it doesn\u0027t have the same\n   * prechecks), it does not first read in the remaining of the current\n   * line and its conditions for ignoring the \"*\" (STAR) are different.\n   *\n   * @param token The starting token.\n   *\n   * @return The extraction information.\n   ",
      "child_ranges": [
        "(line 1494,col 5)-(line 1494,col 48)",
        "(line 1496,col 5)-(line 1496,col 30)",
        "(line 1498,col 5)-(line 1537,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.trimEnd(java.lang.String)",
      "begin_line": 1550,
      "end_line": 1565,
      "comment": "\n   * Trim characters from only the end of a string.\n   * This method will remove all whitespace characters\n   * (defined by Character.isWhitespace(char), in addition to the characters\n   * provided, from the end of the provided string.\n   *\n   * @param s String to be trimmed\n   * @return String with whitespace and characters in extraChars removed\n   *                   from the end.\n   ",
      "child_ranges": [
        "(line 1551,col 5)-(line 1551,col 22)",
        "(line 1552,col 5)-(line 1559,col 5)",
        "(line 1561,col 5)-(line 1563,col 5)",
        "(line 1564,col 5)-(line 1564,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeExpressionAnnotation(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1580,
      "end_line": 1597,
      "comment": "\n   * TypeExpressionAnnotation :\u003d TypeExpression |\n   *     \u0027{\u0027 TopLevelTypeExpression \u0027}\u0027\n   ",
      "child_ranges": [
        "(line 1581,col 5)-(line 1596,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseParamTypeExpressionAnnotation(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1608,
      "end_line": 1643,
      "comment": "\n   * ParamTypeExpressionAnnotation :\u003d\n   *     \u0027{\u0027 OptionalParameterType \u0027}\u0027 |\n   *     \u0027{\u0027 TopLevelTypeExpression \u0027}\u0027 |\n   *     \u0027{\u0027 \u0027...\u0027 TopLevelTypeExpression \u0027}\u0027\n   *\n   * OptionalParameterType :\u003d\n   *     TopLevelTypeExpression \u0027\u003d\u0027\n   ",
      "child_ranges": [
        "(line 1609,col 5)-(line 1609,col 56)",
        "(line 1611,col 5)-(line 1611,col 15)",
        "(line 1613,col 5)-(line 1613,col 28)",
        "(line 1614,col 5)-(line 1614,col 19)",
        "(line 1615,col 5)-(line 1622,col 5)",
        "(line 1624,col 5)-(line 1624,col 55)",
        "(line 1625,col 5)-(line 1640,col 5)",
        "(line 1642,col 5)-(line 1642,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeNameAnnotation(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1648,
      "end_line": 1665,
      "comment": "\n   * TypeNameAnnotation :\u003d TypeName | \u0027{\u0027 TypeName \u0027}\u0027\n   ",
      "child_ranges": [
        "(line 1649,col 5)-(line 1664,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTopLevelTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1673,
      "end_line": 1689,
      "comment": "\n   * TopLevelTypeExpression :\u003d TypeExpression\n   *     | TypeUnionList\n   *\n   * We made this rule up, for the sake of backwards compatibility.\n   ",
      "child_ranges": [
        "(line 1674,col 5)-(line 1674,col 47)",
        "(line 1675,col 5)-(line 1687,col 5)",
        "(line 1688,col 5)-(line 1688,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeExpressionList(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1695,
      "end_line": 1712,
      "comment": "\n   * TypeExpressionList :\u003d TopLevelTypeExpression\n   *     | TopLevelTypeExpression \u0027,\u0027 TypeExpressionList\n   ",
      "child_ranges": [
        "(line 1696,col 5)-(line 1696,col 55)",
        "(line 1697,col 5)-(line 1699,col 5)",
        "(line 1700,col 5)-(line 1700,col 31)",
        "(line 1701,col 5)-(line 1701,col 38)",
        "(line 1702,col 5)-(line 1710,col 5)",
        "(line 1711,col 5)-(line 1711,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1722,
      "end_line": 1765,
      "comment": "\n   * TypeExpression :\u003d BasicTypeExpression\n   *     | \u0027?\u0027 BasicTypeExpression\n   *     | \u0027!\u0027 BasicTypeExpression\n   *     | BasicTypeExpression \u0027?\u0027\n   *     | BasicTypeExpression \u0027!\u0027\n   *     | \u0027?\u0027\n   ",
      "child_ranges": [
        "(line 1723,col 5)-(line 1764,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseBasicTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1771,
      "end_line": 1797,
      "comment": "\n   * BasicTypeExpression :\u003d \u0027*\u0027 | \u0027null\u0027 | \u0027undefined\u0027 | TypeName\n   *     | FunctionType | UnionType | RecordType | ArrayType\n   ",
      "child_ranges": [
        "(line 1772,col 5)-(line 1793,col 5)",
        "(line 1795,col 5)-(line 1795,col 28)",
        "(line 1796,col 5)-(line 1796,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeName(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1803,
      "end_line": 1838,
      "comment": "\n   * TypeName :\u003d NameExpression | NameExpression TypeApplication\n   * TypeApplication :\u003d \u0027.\u003c\u0027 TypeExpressionList \u0027\u003e\u0027\n   ",
      "child_ranges": [
        "(line 1804,col 5)-(line 1806,col 5)",
        "(line 1808,col 5)-(line 1808,col 41)",
        "(line 1809,col 5)-(line 1809,col 36)",
        "(line 1810,col 5)-(line 1810,col 36)",
        "(line 1811,col 5)-(line 1818,col 5)",
        "(line 1820,col 5)-(line 1820,col 64)",
        "(line 1822,col 5)-(line 1836,col 5)",
        "(line 1837,col 5)-(line 1837,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseFunctionType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1845,
      "end_line": 1915,
      "comment": "\n   * FunctionType :\u003d \u0027function\u0027 FunctionSignatureType\n   * FunctionSignatureType :\u003d\n   *    TypeParameters \u0027(\u0027 \u0027this\u0027 \u0027:\u0027 TypeName, ParametersType \u0027)\u0027 ResultType\n   ",
      "child_ranges": [
        "(line 1848,col 5)-(line 1851,col 5)",
        "(line 1853,col 5)-(line 1853,col 48)",
        "(line 1854,col 5)-(line 1854,col 27)",
        "(line 1855,col 5)-(line 1855,col 15)",
        "(line 1856,col 5)-(line 1896,col 5)",
        "(line 1898,col 5)-(line 1900,col 5)",
        "(line 1902,col 5)-(line 1902,col 15)",
        "(line 1903,col 5)-(line 1905,col 5)",
        "(line 1907,col 5)-(line 1907,col 15)",
        "(line 1908,col 5)-(line 1908,col 46)",
        "(line 1909,col 5)-(line 1913,col 5)",
        "(line 1914,col 5)-(line 1914,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseParametersType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 1939,
      "end_line": 2003,
      "comment": " order-checking in two places, we just do all of it in type resolution.",
      "child_ranges": [
        "(line 1940,col 5)-(line 1940,col 48)",
        "(line 1941,col 5)-(line 1941,col 30)",
        "(line 1942,col 5)-(line 1942,col 26)",
        "(line 1943,col 5)-(line 1994,col 5)",
        "(line 1996,col 5)-(line 1998,col 5)",
        "(line 2002,col 5)-(line 2002,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseResultType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2008,
      "end_line": 2022,
      "comment": "\n   * ResultType :\u003d \u003cempty\u003e | \u0027:\u0027 void | \u0027:\u0027 TypeExpression\n   ",
      "child_ranges": [
        "(line 2009,col 5)-(line 2009,col 15)",
        "(line 2010,col 5)-(line 2012,col 5)",
        "(line 2014,col 5)-(line 2014,col 19)",
        "(line 2015,col 5)-(line 2015,col 15)",
        "(line 2016,col 5)-(line 2021,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseUnionType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2030,
      "end_line": 2032,
      "comment": "\n   * UnionType :\u003d \u0027(\u0027 TypeUnionList \u0027)\u0027\n   * TypeUnionList :\u003d TypeExpression | TypeExpression \u0027|\u0027 TypeUnionList\n   *\n   * We\u0027ve removed the empty union type.\n   ",
      "child_ranges": [
        "(line 2031,col 5)-(line 2031,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseUnionTypeWithAlternate(com.google.javascript.jscomp.parsing.JsDocToken, com.google.javascript.rhino.Node)",
      "begin_line": 2038,
      "end_line": 2077,
      "comment": "\n   * Create a new union type, with an alternate that has already been\n   * parsed. The alternate may be null.\n   ",
      "child_ranges": [
        "(line 2039,col 5)-(line 2039,col 37)",
        "(line 2040,col 5)-(line 2042,col 5)",
        "(line 2044,col 5)-(line 2044,col 21)",
        "(line 2045,col 5)-(line 2067,col 55)",
        "(line 2069,col 5)-(line 2075,col 5)",
        "(line 2076,col 5)-(line 2076,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseArrayType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2084,
      "end_line": 2118,
      "comment": "\n   * ArrayType :\u003d \u0027[\u0027 ElementTypeList \u0027]\u0027\n   * ElementTypeList :\u003d \u003cempty\u003e | TypeExpression | \u0027...\u0027 TypeExpression\n   *     | TypeExpression \u0027,\u0027 ElementTypeList\n   ",
      "child_ranges": [
        "(line 2085,col 5)-(line 2085,col 35)",
        "(line 2086,col 5)-(line 2086,col 20)",
        "(line 2087,col 5)-(line 2087,col 31)",
        "(line 2089,col 5)-(line 2111,col 38)",
        "(line 2113,col 5)-(line 2115,col 5)",
        "(line 2116,col 5)-(line 2116,col 11)",
        "(line 2117,col 5)-(line 2117,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseRecordType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2123,
      "end_line": 2140,
      "comment": "\n   * RecordType :\u003d \u0027{\u0027 FieldTypeList \u0027}\u0027\n   ",
      "child_ranges": [
        "(line 2124,col 5)-(line 2124,col 40)",
        "(line 2125,col 5)-(line 2125,col 51)",
        "(line 2127,col 5)-(line 2129,col 5)",
        "(line 2131,col 5)-(line 2131,col 15)",
        "(line 2132,col 5)-(line 2134,col 5)",
        "(line 2136,col 5)-(line 2136,col 11)",
        "(line 2138,col 5)-(line 2138,col 45)",
        "(line 2139,col 5)-(line 2139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseFieldTypeList(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2145,
      "end_line": 2171,
      "comment": "\n   * FieldTypeList :\u003d FieldType | FieldType \u0027,\u0027 FieldTypeList\n   ",
      "child_ranges": [
        "(line 2146,col 5)-(line 2146,col 43)",
        "(line 2148,col 5)-(line 2168,col 19)",
        "(line 2170,col 5)-(line 2170,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseFieldType(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2176,
      "end_line": 2204,
      "comment": "\n   * FieldType :\u003d FieldName | FieldName \u0027:\u0027 TypeExpression\n   ",
      "child_ranges": [
        "(line 2177,col 5)-(line 2177,col 43)",
        "(line 2179,col 5)-(line 2181,col 5)",
        "(line 2183,col 5)-(line 2183,col 15)",
        "(line 2184,col 5)-(line 2186,col 5)",
        "(line 2189,col 5)-(line 2189,col 11)",
        "(line 2193,col 5)-(line 2193,col 15)",
        "(line 2194,col 5)-(line 2194,col 54)",
        "(line 2196,col 5)-(line 2198,col 5)",
        "(line 2200,col 5)-(line 2200,col 42)",
        "(line 2201,col 5)-(line 2201,col 40)",
        "(line 2202,col 5)-(line 2202,col 45)",
        "(line 2203,col 5)-(line 2203,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.parseFieldName(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2210,
      "end_line": 2219,
      "comment": "\n   * FieldName :\u003d NameExpression | StringLiteral | NumberLiteral |\n   * ReservedIdentifier\n   ",
      "child_ranges": [
        "(line 2211,col 5)-(line 2218,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.wrapNode(int, com.google.javascript.rhino.Node)",
      "begin_line": 2221,
      "end_line": 2225,
      "comment": "",
      "child_ranges": [
        "(line 2222,col 5)-(line 2224,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.newNode(int)",
      "begin_line": 2227,
      "end_line": 2230,
      "comment": "",
      "child_ranges": [
        "(line 2228,col 5)-(line 2229,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.newStringNode(java.lang.String)",
      "begin_line": 2232,
      "end_line": 2234,
      "comment": "",
      "child_ranges": [
        "(line 2233,col 5)-(line 2233,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.newStringNode(java.lang.String, int, int)",
      "begin_line": 2236,
      "end_line": 2240,
      "comment": "",
      "child_ranges": [
        "(line 2237,col 5)-(line 2237,col 76)",
        "(line 2238,col 5)-(line 2238,col 28)",
        "(line 2239,col 5)-(line 2239,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.createTemplateNode()",
      "begin_line": 2244,
      "end_line": 2252,
      "comment": " e.g., source-name, between all nodes.",
      "child_ranges": [
        "(line 2246,col 5)-(line 2246,col 36)",
        "(line 2247,col 5)-(line 2250,col 12)",
        "(line 2251,col 5)-(line 2251,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.reportTypeSyntaxWarning(java.lang.String)",
      "begin_line": 2254,
      "end_line": 2257,
      "comment": "",
      "child_ranges": [
        "(line 2255,col 5)-(line 2255,col 75)",
        "(line 2256,col 5)-(line 2256,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.reportGenericTypeSyntaxWarning()",
      "begin_line": 2259,
      "end_line": 2261,
      "comment": "",
      "child_ranges": [
        "(line 2260,col 5)-(line 2260,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.eatTokensUntilEOL()",
      "begin_line": 2267,
      "end_line": 2269,
      "comment": "\n   * Eats tokens until {@link JsDocToken#EOL} included, and switches back the\n   * state to {@link State#SEARCHING_ANNOTATION}.\n   ",
      "child_ranges": [
        "(line 2268,col 5)-(line 2268,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.eatTokensUntilEOL(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2275,
      "end_line": 2284,
      "comment": "\n   * Eats tokens until {@link JsDocToken#EOL} included, and switches back the\n   * state to {@link State#SEARCHING_ANNOTATION}.\n   ",
      "child_ranges": [
        "(line 2276,col 5)-(line 2283,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NO_UNREAD_TOKEN"
      ],
      "begin_line": 2289,
      "end_line": 2289,
      "comment": "\n   * Specific value indicating that the {@link #unreadToken} contains no token.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "unreadToken"
      ],
      "begin_line": 2294,
      "end_line": 2294,
      "comment": "\n   * One token buffer.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.restoreLookAhead(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2297,
      "end_line": 2299,
      "comment": " Restores the lookahead token to the token stream ",
      "child_ranges": [
        "(line 2298,col 5)-(line 2298,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.match(com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2305,
      "end_line": 2308,
      "comment": "\n   * Tests whether the next symbol of the token stream matches the specific\n   * token.\n   ",
      "child_ranges": [
        "(line 2306,col 5)-(line 2306,col 25)",
        "(line 2307,col 5)-(line 2307,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.match(com.google.javascript.jscomp.parsing.JsDocToken, com.google.javascript.jscomp.parsing.JsDocToken)",
      "begin_line": 2314,
      "end_line": 2317,
      "comment": "\n   * Tests that the next symbol of the token stream matches one of the specified\n   * tokens.\n   ",
      "child_ranges": [
        "(line 2315,col 5)-(line 2315,col 25)",
        "(line 2316,col 5)-(line 2316,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.next()",
      "begin_line": 2323,
      "end_line": 2329,
      "comment": "\n   * Gets the next token of the token stream or the buffered token if a matching\n   * was previously made.\n   ",
      "child_ranges": [
        "(line 2324,col 5)-(line 2328,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.current()",
      "begin_line": 2334,
      "end_line": 2338,
      "comment": "\n   * Gets the current token, invalidating it in the process.\n   ",
      "child_ranges": [
        "(line 2335,col 5)-(line 2335,col 31)",
        "(line 2336,col 5)-(line 2336,col 34)",
        "(line 2337,col 5)-(line 2337,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.skipEOLs()",
      "begin_line": 2344,
      "end_line": 2351,
      "comment": "\n   * Skips all EOLs and all empty lines in the JSDoc. Call this method if you\n   * want the JSDoc entry to span multiple lines.\n   ",
      "child_ranges": [
        "(line 2345,col 5)-(line 2350,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.hasParsedFileOverviewDocInfo()",
      "begin_line": 2357,
      "end_line": 2359,
      "comment": "\n   * Determines whether the parser has been populated with docinfo with a\n   * fileoverview tag.\n   ",
      "child_ranges": [
        "(line 2358,col 5)-(line 2358,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.hasParsedJSDocInfo()",
      "begin_line": 2361,
      "end_line": 2363,
      "comment": "",
      "child_ranges": [
        "(line 2362,col 5)-(line 2362,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.retrieveAndResetParsedJSDocInfo()",
      "begin_line": 2365,
      "end_line": 2367,
      "comment": "",
      "child_ranges": [
        "(line 2366,col 5)-(line 2366,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.getFileOverviewJSDocInfo()",
      "begin_line": 2372,
      "end_line": 2374,
      "comment": "\n   * Gets the fileoverview JSDocInfo, if any.\n   ",
      "child_ranges": [
        "(line 2373,col 5)-(line 2373,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocInfoParser.lookAheadForTypeAnnotation()",
      "begin_line": 2384,
      "end_line": 2400,
      "comment": "\n   * Look ahead for a type annotation by advancing the character stream.\n   * Does not modify the token stream.\n   * This is kind of a hack, and is only necessary because we use the token\n   * stream to parse types, but need the underlying character stream to get\n   * JsDoc descriptions.\n   * @return Whether we found a type annotation.\n   ",
      "child_ranges": [
        "(line 2385,col 5)-(line 2385,col 30)",
        "(line 2386,col 5)-(line 2386,col 10)",
        "(line 2387,col 5)-(line 2397,col 5)",
        "(line 2398,col 5)-(line 2398,col 24)",
        "(line 2399,col 5)-(line 2399,col 21)"
      ]
    }
  ]
}