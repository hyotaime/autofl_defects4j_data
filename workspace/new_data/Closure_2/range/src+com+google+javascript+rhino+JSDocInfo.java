{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/JSDocInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSDocInfo",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1544,
      "comment": "\n * \u003cp\u003eJSDoc information describing JavaScript code. JSDoc is represented as a\n * unified object with fields for each JSDoc annotation, even though some\n * combinations are incorrect. For instance, if a JSDoc describes an enum,\n * it cannot have information about a return type. This implementation\n * takes advantage of such incompatibilities to reuse fields for multiple\n * purposes, reducing memory consumption.\u003c/p\u003e\n *\n * \u003cp\u003eConstructing {@link JSDocInfo} objects is simplified by\n * {@link JSDocInfoBuilder} which provides early incompatibility detection.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LazilyInitializedInfo",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 87,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseType"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Function information"
    },
    {
      "type": "field",
      "varNames": [
        "extendedInterfaces"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "implementedInterfaces"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thrownTypes"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateTypeNames"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Other information"
    },
    {
      "type": "field",
      "varNames": [
        "meaning"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deprecated"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "license"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suppressions"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifies"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lendsName"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LazilyInitializedDocumentation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 108,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceComment"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "markers"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "throwsDescriptions"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockDescription"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileOverview"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnDescription"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "authors"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sees"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "StringPosition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.SourcePosition\u003cjava.lang.String\u003e"
      ],
      "begin_line": 127,
      "end_line": 128,
      "comment": "\n   * A piece of information (found in a marker) which contains a position\n   * with a string.\n   "
    },
    {
      "type": "class_interface",
      "name": "TrimmedStringPosition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.JSDocInfo.StringPosition"
      ],
      "begin_line": 134,
      "end_line": 142,
      "comment": "\n   * A piece of information (found in a marker) which contains a position\n   * with a string that has no leading or trailing whitespace.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition.setItem(java.lang.String)",
      "begin_line": 135,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 139,col 55)",
        "(line 140,col 7)-(line 140,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NamePosition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n   * A piece of information (found in a marker) which contains a position\n   * with a name node.\n   "
    },
    {
      "type": "class_interface",
      "name": "TypePosition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 154,
      "end_line": 165,
      "comment": "\n   * A piece of information (found in a marker) which contains a position\n   * with a type expression syntax tree.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "brackets"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.TypePosition.hasBrackets()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " Returns whether the type has curly braces around it. ",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.TypePosition.setHasBrackets(boolean)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 7)-(line 163,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Marker",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 177,
      "end_line": 244,
      "comment": "\n   * Defines a class for containing the parsing information\n   * for this JSDocInfo. For each annotation found in the\n   * JsDoc, a marker will be created indicating the annotation\n   * itself, the name of the annotation (if any; for example,\n   * a @param has a name, but a @return does not), the\n   * textual description found on that annotation and, if applicable,\n   * the type declaration. All this information is only collected\n   * if documentation collection is turned on.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameNode"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getAnnotation()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Gets the position information for the annotation name. (e.g., \"param\")\n     ",
      "child_ranges": [
        "(line 188,col 7)-(line 188,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setAnnotation(com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 7)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getName()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Gets the position information for the name found\n     * in a @param tag.\n     * @deprecated Use #getNameNode\n     ",
      "child_ranges": [
        "(line 202,col 7)-(line 202,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setName(com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 7)-(line 206,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getNameNode()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Gets the position information for the name found\n     * in an @param tag.\n     ",
      "child_ranges": [
        "(line 214,col 7)-(line 214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setNameNode(com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 7)-(line 218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getDescription()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Gets the position information for the description found\n     * in a block tag.\n     ",
      "child_ranges": [
        "(line 226,col 7)-(line 226,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setDescription(com.google.javascript.rhino.JSDocInfo.StringPosition)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 7)-(line 230,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getType()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Gets the position information for the type expression found\n     * in some block tags, like \"@param\" and \"@return\".\n     ",
      "child_ranges": [
        "(line 238,col 7)-(line 238,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setType(com.google.javascript.rhino.JSDocInfo.TypePosition)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 7)-(line 242,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "info"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "documentation"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "associatedNode"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " The Node this JSDoc is associated with."
    },
    {
      "type": "field",
      "varNames": [
        "visibility"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitset"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n   * The {@link #isConstant()}, {@link #isConstructor()}, {@link #isInterface},\n   * {@link #isHidden()} and {@link #shouldPreserveTry()} flags as well as\n   * whether the {@link #type} field stores a value for {@link #getType()},\n   * {@link #getReturnType()} or {@link #getEnumParameterType()}.\n   *\n   * @see #setFlag(boolean, int)\n   * @see #getFlag(int)\n   * @see #setType(JSTypeExpression, int)\n   * @see #getType(int)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n   * The type for {@link #getType()}, {@link #getReturnType()} or\n   * {@link #getEnumParameterType()}. The knowledge of which one is recorded is\n   * stored in the {@link #bitset} field.\n   *\n   * @see #setType(JSTypeExpression, int)\n   * @see #getType(int)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "thisType"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": "\n   * The type for {@link #getThisType()}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "includeDocumentation"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": "\n   * Whether to include documentation.\n   *\n   * @see JSDocInfo.LazilyInitializedDocumentation\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_FLAGS"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Mask all the boolean annotation types"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_CONSTANT"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": " @const"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_CONSTRUCTOR"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " @constructor"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_DEFINE"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " @define"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_HIDDEN"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " @hidden"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_PRESERVETRY"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " @preserveTry"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOCHECK"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " @notypecheck"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_OVERRIDE"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " @override"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOALIAS"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " @noalias"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_DEPRECATED"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " @deprecated"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_INTERFACE"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " @interface"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_EXPORT"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " @export"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOSHADOW"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " @noshadow"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_FILEOVERVIEW"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " @fileoverview"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_IMPLICITCAST"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " @implicitCast"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOSIDEEFFECTS"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " @nosideeffects"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_EXTERNS"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " @externs"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_JAVADISPATCH"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " @javadispatch"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOCOMPILE"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " @nocompile"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_CONSISTIDGEN"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " @consistentIdGenerator"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_IDGEN"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " @idGenerator"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_EXPOSE"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " @expose"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_STRUCT"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " @struct"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_DICT"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " @dict"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_STALBEIDGEN"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " @stableIdGenerator"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_TYPEFIELD"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " 1110..."
    },
    {
      "type": "field",
      "varNames": [
        "TYPEFIELD_TYPE"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " 0010..."
    },
    {
      "type": "field",
      "varNames": [
        "TYPEFIELD_RETURN"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " 0100..."
    },
    {
      "type": "field",
      "varNames": [
        "TYPEFIELD_ENUM"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " 0110..."
    },
    {
      "type": "field",
      "varNames": [
        "TYPEFIELD_TYPEDEF"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " 1000..."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.JSDocInfo.JSDocInfo(boolean)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n   * Creates a {@link JSDocInfo} object. This object should be created using\n   * a {@link JSDocInfoBuilder}.\n   ",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.JSDocInfo.JSDocInfo()",
      "begin_line": 339,
      "end_line": 339,
      "comment": " Visible for testing.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setConsistentIdGenerator(boolean)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 5)-(line 342,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setStableIdGenerator(boolean)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setConstant(boolean)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setConstructor(boolean)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setStruct()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDict()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 5)-(line 362,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDefine(boolean)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setHidden(boolean)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 370,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoCheck(boolean)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setShouldPreserveTry(boolean)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setOverride(boolean)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 382,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoAlias(boolean)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDeprecated(boolean)",
      "begin_line": 390,
      "end_line": 392,
      "comment": " Visible for testing.",
      "child_ranges": [
        "(line 391,col 5)-(line 391,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setInterface(boolean)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setExport(boolean)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 5)-(line 399,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setExpose(boolean)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 5)-(line 403,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoShadow(boolean)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 407,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setIdGenerator(boolean)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 5)-(line 411,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setImplicitCast(boolean)",
      "begin_line": 414,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoSideEffects(boolean)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setExterns(boolean)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 423,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setJavaDispatch(boolean)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoCompile(boolean)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 5)-(line 431,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setFlag(boolean, int)",
      "begin_line": 434,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 435,col 5)-(line 439,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isConsistentIdGenerator()",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\n   * @return whether the {@code @consistentIdGenerator} is present on\n   * this {@link JSDocInfo}\n   ",
      "child_ranges": [
        "(line 447,col 5)-(line 447,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isStableIdGenerator()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n   * @return whether the {@code @stableIdGenerator} is present on this {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 454,col 5)-(line 454,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isConstant()",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n   * Returns whether the {@code @const} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 462,col 5)-(line 462,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isConstructor()",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n   * Returns whether the {@code @constructor} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 470,col 5)-(line 470,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.makesStructs()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n   * Returns whether the {@code @struct} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.makesDicts()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n   * Returns whether the {@code @dict} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 486,col 5)-(line 486,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isDefine()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n   * Returns whether the {@code @define} annotation is present on this\n   * {@link JSDocInfo}. If this annotation is present, then the\n   * {@link #getType()} method will retrieve the define type.\n   ",
      "child_ranges": [
        "(line 495,col 5)-(line 495,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isHidden()",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n   * Returns whether the {@code @hidden} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 503,col 5)-(line 503,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoTypeCheck()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n   * Returns whether the {@code @nocheck} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 511,col 5)-(line 511,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.shouldPreserveTry()",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n   * Returns whether the {@code @preserveTry} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 519,col 5)-(line 519,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isOverride()",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n   * Returns whether the {@code @override} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 527,col 5)-(line 527,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoAlias()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n   * Returns whether the {@code @noalias} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 535,col 5)-(line 535,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isDeprecated()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\n   * Returns whether the {@code @deprecated} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 543,col 5)-(line 543,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isInterface()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\n   * Returns whether the {@code @interface} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 551,col 5)-(line 551,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isExport()",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n   * Returns whether the {@code @export} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 559,col 5)-(line 559,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isExpose()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n   * Returns whether the {@code @expose} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 567,col 5)-(line 567,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoShadow()",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n   * Returns whether the {@code @noshadow} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 575,col 5)-(line 575,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isIdGenerator()",
      "begin_line": 582,
      "end_line": 584,
      "comment": "\n   * @return whether the {@code @idGenerator} is present on\n   * this {@link JSDocInfo}\n   ",
      "child_ranges": [
        "(line 583,col 5)-(line 583,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isImplicitCast()",
      "begin_line": 590,
      "end_line": 592,
      "comment": "\n   * Returns whether the {@code @implicitCast} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 591,col 5)-(line 591,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoSideEffects()",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\n   * Returns whether the {@code @nosideeffects} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 599,col 5)-(line 599,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isExterns()",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n   * Returns whether the {@code @externs} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 607,col 5)-(line 607,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isJavaDispatch()",
      "begin_line": 614,
      "end_line": 616,
      "comment": "\n   * Returns whether the {@code @javadispatch} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 615,col 5)-(line 615,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoCompile()",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\n   * Returns whether the {@code @nocompile} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 623,col 5)-(line 623,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.containsDeclaration()",
      "begin_line": 629,
      "end_line": 646,
      "comment": "\n   * @return Whether there is declaration present on this {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 630,col 5)-(line 645,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getFlag(int)",
      "begin_line": 648,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 649,col 5)-(line 649,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)",
      "begin_line": 653,
      "end_line": 655,
      "comment": " Visible for testing.",
      "child_ranges": [
        "(line 654,col 5)-(line 654,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.lazyInitInfo()",
      "begin_line": 657,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 658,col 5)-(line 660,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.lazyInitDocumentation()",
      "begin_line": 667,
      "end_line": 677,
      "comment": "\n   * Lazily initializes the documentation information object, but only\n   * if the JSDocInfo was told to keep such information around.\n   ",
      "child_ranges": [
        "(line 668,col 5)-(line 670,col 5)",
        "(line 672,col 5)-(line 674,col 5)",
        "(line 676,col 5)-(line 676,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addMarker()",
      "begin_line": 683,
      "end_line": 695,
      "comment": "\n   * Adds a marker to the documentation (if it exists) and\n   * returns the marker. Returns null otherwise.\n   ",
      "child_ranges": [
        "(line 684,col 5)-(line 686,col 5)",
        "(line 688,col 5)-(line 690,col 5)",
        "(line 692,col 5)-(line 692,col 33)",
        "(line 693,col 5)-(line 693,col 38)",
        "(line 694,col 5)-(line 694,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDeprecationReason(java.lang.String)",
      "begin_line": 702,
      "end_line": 711,
      "comment": "\n   * Sets the deprecation reason.\n   *\n   * @param reason The deprecation reason\n   ",
      "child_ranges": [
        "(line 703,col 5)-(line 703,col 19)",
        "(line 705,col 5)-(line 707,col 5)",
        "(line 709,col 5)-(line 709,col 29)",
        "(line 710,col 5)-(line 710,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addSuppression(java.lang.String)",
      "begin_line": 716,
      "end_line": 723,
      "comment": "\n   * Add a suppressed warning.\n   ",
      "child_ranges": [
        "(line 717,col 5)-(line 717,col 19)",
        "(line 719,col 5)-(line 721,col 5)",
        "(line 722,col 5)-(line 722,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setSuppressions(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 729,
      "end_line": 738,
      "comment": "\n   * Sets suppressed warnings.\n   * @param suppressions A list of suppressed warning types.\n   ",
      "child_ranges": [
        "(line 730,col 5)-(line 730,col 19)",
        "(line 732,col 5)-(line 734,col 5)",
        "(line 736,col 5)-(line 736,col 37)",
        "(line 737,col 5)-(line 737,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addModifies(java.lang.String)",
      "begin_line": 743,
      "end_line": 750,
      "comment": "\n   * Add modifies values.\n   ",
      "child_ranges": [
        "(line 744,col 5)-(line 744,col 19)",
        "(line 746,col 5)-(line 748,col 5)",
        "(line 749,col 5)-(line 749,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setModifies(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 756,
      "end_line": 765,
      "comment": "\n   * Sets modifies values.\n   * @param modifies A list of modifies types.\n   ",
      "child_ranges": [
        "(line 757,col 5)-(line 757,col 19)",
        "(line 759,col 5)-(line 761,col 5)",
        "(line 763,col 5)-(line 763,col 29)",
        "(line 764,col 5)-(line 764,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentVersion(java.lang.String)",
      "begin_line": 770,
      "end_line": 781,
      "comment": "\n   * Documents the version.\n   ",
      "child_ranges": [
        "(line 771,col 5)-(line 773,col 5)",
        "(line 775,col 5)-(line 777,col 5)",
        "(line 779,col 5)-(line 779,col 36)",
        "(line 780,col 5)-(line 780,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentReference(java.lang.String)",
      "begin_line": 786,
      "end_line": 797,
      "comment": "\n   * Documents a reference (i.e. adds a \"see\" reference to the list).\n   ",
      "child_ranges": [
        "(line 787,col 5)-(line 789,col 5)",
        "(line 791,col 5)-(line 793,col 5)",
        "(line 795,col 5)-(line 795,col 38)",
        "(line 796,col 5)-(line 796,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentAuthor(java.lang.String)",
      "begin_line": 802,
      "end_line": 813,
      "comment": "\n   * Documents the author (i.e. adds it to the author list).\n   ",
      "child_ranges": [
        "(line 803,col 5)-(line 805,col 5)",
        "(line 807,col 5)-(line 809,col 5)",
        "(line 811,col 5)-(line 811,col 38)",
        "(line 812,col 5)-(line 812,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentThrows(com.google.javascript.rhino.JSTypeExpression, java.lang.String)",
      "begin_line": 818,
      "end_line": 834,
      "comment": "\n   * Documents the throws (i.e. adds it to the throws list).\n   ",
      "child_ranges": [
        "(line 819,col 5)-(line 821,col 5)",
        "(line 823,col 5)-(line 826,col 5)",
        "(line 828,col 5)-(line 831,col 5)",
        "(line 833,col 5)-(line 833,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentParam(java.lang.String, java.lang.String)",
      "begin_line": 844,
      "end_line": 859,
      "comment": "\n   * Documents a parameter. Parameters are described using the {@code @param}\n   * annotation.\n   *\n   * @param parameter the parameter\u0027s name\n   * @param description the parameter\u0027s description\n   ",
      "child_ranges": [
        "(line 845,col 5)-(line 847,col 5)",
        "(line 849,col 5)-(line 851,col 5)",
        "(line 853,col 5)-(line 858,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentBlock(java.lang.String)",
      "begin_line": 866,
      "end_line": 877,
      "comment": "\n   * Documents the block-level comment/description.\n   *\n   * @param description the description\n   ",
      "child_ranges": [
        "(line 867,col 5)-(line 869,col 5)",
        "(line 871,col 5)-(line 873,col 5)",
        "(line 875,col 5)-(line 875,col 49)",
        "(line 876,col 5)-(line 876,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentFileOverview(java.lang.String)",
      "begin_line": 884,
      "end_line": 896,
      "comment": "\n   * Documents the fileoverview comment/description.\n   *\n   * @param description the description\n   ",
      "child_ranges": [
        "(line 885,col 5)-(line 885,col 37)",
        "(line 886,col 5)-(line 888,col 5)",
        "(line 890,col 5)-(line 892,col 5)",
        "(line 894,col 5)-(line 894,col 45)",
        "(line 895,col 5)-(line 895,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentReturn(java.lang.String)",
      "begin_line": 904,
      "end_line": 915,
      "comment": "\n   * Documents the return value. Return value is described using the\n   * {@code @return} annotation.\n   *\n   * @param description the return value\u0027s description\n   ",
      "child_ranges": [
        "(line 905,col 5)-(line 907,col 5)",
        "(line 909,col 5)-(line 911,col 5)",
        "(line 913,col 5)-(line 913,col 50)",
        "(line 914,col 5)-(line 914,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.declareParam(com.google.javascript.rhino.JSTypeExpression, java.lang.String)",
      "begin_line": 925,
      "end_line": 936,
      "comment": "\n   * Declares a parameter. Parameters are described using the {@code @param}\n   * annotation.\n   *\n   * @param jsType the parameter\u0027s type, it may be {@code null} when the\n   *     {@code @param} annotation did not specify a type.\n   * @param parameter the parameter\u0027s name\n   ",
      "child_ranges": [
        "(line 926,col 5)-(line 926,col 19)",
        "(line 927,col 5)-(line 929,col 5)",
        "(line 930,col 5)-(line 935,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.declareTemplateTypeNames(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 944,
      "end_line": 953,
      "comment": "\n   * Declares a template type name. Template type names are described using the\n   * {@code @template} annotation.\n   *\n   * @param templateTypeNames the template type name.\n   ",
      "child_ranges": [
        "(line 945,col 5)-(line 945,col 19)",
        "(line 947,col 5)-(line 949,col 5)",
        "(line 951,col 5)-(line 951,col 69)",
        "(line 952,col 5)-(line 952,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.declareThrows(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 960,
      "end_line": 969,
      "comment": "\n   * Declares that the method throws a given type.\n   *\n   * @param jsType The type that can be thrown by the method.\n   ",
      "child_ranges": [
        "(line 961,col 5)-(line 961,col 19)",
        "(line 963,col 5)-(line 965,col 5)",
        "(line 967,col 5)-(line 967,col 33)",
        "(line 968,col 5)-(line 968,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getVisibility()",
      "begin_line": 976,
      "end_line": 978,
      "comment": "\n   * Gets the visibility specified by {@code @private}, {@code @protected} or\n   * {@code @public} annotation. If no visibility is specified, visibility\n   * is inherited from the base class.\n   ",
      "child_ranges": [
        "(line 977,col 5)-(line 977,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getParameterType(java.lang.String)",
      "begin_line": 986,
      "end_line": 991,
      "comment": "\n   * Gets the parameter type.\n   * @param parameter the parameter\u0027s name\n   * @return the parameter\u0027s type or {@code null} if this parameter is not\n   *     defined or has a {@code null} type\n   ",
      "child_ranges": [
        "(line 987,col 5)-(line 989,col 5)",
        "(line 990,col 5)-(line 990,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasParameter(java.lang.String)",
      "begin_line": 996,
      "end_line": 1001,
      "comment": "\n   * Returns whether the parameter is defined.\n   ",
      "child_ranges": [
        "(line 997,col 5)-(line 999,col 5)",
        "(line 1000,col 5)-(line 1000,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasParameterType(java.lang.String)",
      "begin_line": 1009,
      "end_line": 1011,
      "comment": "\n   * Returns whether the parameter has an attached type.\n   *\n   * @return {@code true} if the parameter has an attached type, {@code false}\n   *     if the parameter has no attached type or does not exist.\n   ",
      "child_ranges": [
        "(line 1010,col 5)-(line 1010,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getParameterNames()",
      "begin_line": 1020,
      "end_line": 1025,
      "comment": "\n   * Returns the set of names of the defined parameters. The iteration order\n   * of the returned set is not the order in which parameters are defined.\n   *\n   * @return the set of names of the defined parameters. The returned set is\n   *     immutable.\n   ",
      "child_ranges": [
        "(line 1021,col 5)-(line 1023,col 5)",
        "(line 1024,col 5)-(line 1024,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getParameterCount()",
      "begin_line": 1030,
      "end_line": 1035,
      "comment": "\n   * Gets the number of parameters defined.\n   ",
      "child_ranges": [
        "(line 1031,col 5)-(line 1033,col 5)",
        "(line 1034,col 5)-(line 1034,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1037,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 5)-(line 1038,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setReturnType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1041,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 5)-(line 1042,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setEnumParameterType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 5)-(line 1046,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setTypedefType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1049,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1050,col 5)-(line 1050,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setType(com.google.javascript.rhino.JSTypeExpression, int)",
      "begin_line": 1053,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1054,col 5)-(line 1058,col 5)",
        "(line 1059,col 5)-(line 1059,col 47)",
        "(line 1060,col 5)-(line 1060,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getThrownTypes()",
      "begin_line": 1066,
      "end_line": 1071,
      "comment": "\n   * Returns the list of thrown types.\n   ",
      "child_ranges": [
        "(line 1067,col 5)-(line 1069,col 5)",
        "(line 1070,col 5)-(line 1070,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasType()",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": "\n   * Returns whether a type, specified using the {@code @type} annotation, is\n   * present on this JSDoc.\n   ",
      "child_ranges": [
        "(line 1078,col 5)-(line 1078,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasEnumParameterType()",
      "begin_line": 1085,
      "end_line": 1087,
      "comment": "\n   * Returns whether an enum parameter type, specified using the {@code @enum}\n   * annotation, is present on this JSDoc.\n   ",
      "child_ranges": [
        "(line 1086,col 5)-(line 1086,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasTypedefType()",
      "begin_line": 1093,
      "end_line": 1095,
      "comment": "\n   * Returns whether a typedef parameter type, specified using the\n   * {@code @typedef} annotation, is present on this JSDoc.\n   ",
      "child_ranges": [
        "(line 1094,col 5)-(line 1094,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasReturnType()",
      "begin_line": 1101,
      "end_line": 1103,
      "comment": "\n   * Returns whether this {@link JSDocInfo} contains a type for {@code @return}\n   * annotation.\n   ",
      "child_ranges": [
        "(line 1102,col 5)-(line 1102,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasType(int)",
      "begin_line": 1105,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 5)-(line 1106,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getType()",
      "begin_line": 1112,
      "end_line": 1114,
      "comment": "\n   * Gets the type specified by the {@code @type} annotation.\n   ",
      "child_ranges": [
        "(line 1113,col 5)-(line 1113,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getReturnType()",
      "begin_line": 1119,
      "end_line": 1121,
      "comment": "\n   * Gets the return type specified by the {@code @return} annotation.\n   ",
      "child_ranges": [
        "(line 1120,col 5)-(line 1120,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getEnumParameterType()",
      "begin_line": 1126,
      "end_line": 1128,
      "comment": "\n   * Gets the enum parameter type specified by the {@code @enum} annotation.\n   ",
      "child_ranges": [
        "(line 1127,col 5)-(line 1127,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getTypedefType()",
      "begin_line": 1133,
      "end_line": 1135,
      "comment": "\n   * Gets the typedef type specified by the {@code @type} annotation.\n   ",
      "child_ranges": [
        "(line 1134,col 5)-(line 1134,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getType(int)",
      "begin_line": 1137,
      "end_line": 1143,
      "comment": "",
      "child_ranges": [
        "(line 1138,col 5)-(line 1142,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getThisType()",
      "begin_line": 1148,
      "end_line": 1150,
      "comment": "\n   * Gets the type specified by the {@code @this} annotation.\n   ",
      "child_ranges": [
        "(line 1149,col 5)-(line 1149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setThisType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1155,
      "end_line": 1157,
      "comment": "\n   * Sets the type specified by the {@code @this} annotation.\n   ",
      "child_ranges": [
        "(line 1156,col 5)-(line 1156,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasThisType()",
      "begin_line": 1163,
      "end_line": 1165,
      "comment": "\n   * Returns whether this {@link JSDocInfo} contains a type for {@code @this}\n   * annotation.\n   ",
      "child_ranges": [
        "(line 1164,col 5)-(line 1164,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setBaseType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1167,
      "end_line": 1170,
      "comment": "",
      "child_ranges": [
        "(line 1168,col 5)-(line 1168,col 19)",
        "(line 1169,col 5)-(line 1169,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getBaseType()",
      "begin_line": 1175,
      "end_line": 1177,
      "comment": "\n   * Gets the base type specified by the {@code @extends} annotation.\n   ",
      "child_ranges": [
        "(line 1176,col 5)-(line 1176,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getDescription()",
      "begin_line": 1182,
      "end_line": 1184,
      "comment": "\n   * Gets the description specified by the {@code @desc} annotation.\n   ",
      "child_ranges": [
        "(line 1183,col 5)-(line 1183,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDescription(java.lang.String)",
      "begin_line": 1186,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1187,col 5)-(line 1187,col 19)",
        "(line 1188,col 5)-(line 1188,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getMeaning()",
      "begin_line": 1202,
      "end_line": 1204,
      "comment": "\n   * Gets the meaning specified by the {@code @meaning} annotation.\n   *\n   * In localization systems, two messages with the same content but\n   * different \"meanings\" may be translated differently. By default, we\n   * use the name of the variable that the message is initialized to as\n   * the \"meaning\" of the message.\n   *\n   * But some code generators (like Closure Templates) inject their own\n   * meaning with the jsdoc {@code @meaning} annotation.\n   ",
      "child_ranges": [
        "(line 1203,col 5)-(line 1203,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setMeaning(java.lang.String)",
      "begin_line": 1206,
      "end_line": 1209,
      "comment": "",
      "child_ranges": [
        "(line 1207,col 5)-(line 1207,col 19)",
        "(line 1208,col 5)-(line 1208,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getLendsName()",
      "begin_line": 1219,
      "end_line": 1221,
      "comment": "\n   * Gets the name we\u0027re lending to in a {@code @lends} annotation.\n   *\n   * In many reflection APIs, you pass an anonymous object to a function,\n   * and that function mixes the anonymous object into another object.\n   * The {@code @lends} annotation allows the type system to track\n   * those property assignments.\n   ",
      "child_ranges": [
        "(line 1220,col 5)-(line 1220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setLendsName(java.lang.String)",
      "begin_line": 1223,
      "end_line": 1226,
      "comment": "",
      "child_ranges": [
        "(line 1224,col 5)-(line 1224,col 19)",
        "(line 1225,col 5)-(line 1225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getLicense()",
      "begin_line": 1231,
      "end_line": 1233,
      "comment": "\n   * Gets the description specified by the {@code @license} annotation.\n   ",
      "child_ranges": [
        "(line 1232,col 5)-(line 1232,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setLicense(java.lang.String)",
      "begin_line": 1242,
      "end_line": 1245,
      "comment": "",
      "child_ranges": [
        "(line 1243,col 5)-(line 1243,col 19)",
        "(line 1244,col 5)-(line 1244,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.toString()",
      "begin_line": 1247,
      "end_line": 1250,
      "comment": "",
      "child_ranges": [
        "(line 1249,col 5)-(line 1249,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasBaseType()",
      "begin_line": 1256,
      "end_line": 1258,
      "comment": "\n   * Returns whether this {@link JSDocInfo} contains a type for {@code @extends}\n   * annotation.\n   ",
      "child_ranges": [
        "(line 1257,col 5)-(line 1257,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addImplementedInterface(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1264,
      "end_line": 1274,
      "comment": "\n   * Adds an implemented interface. Returns whether the interface was added. If\n   * the interface was already present in the list, it won\u0027t get added again.\n   ",
      "child_ranges": [
        "(line 1265,col 5)-(line 1265,col 19)",
        "(line 1266,col 5)-(line 1268,col 5)",
        "(line 1269,col 5)-(line 1271,col 5)",
        "(line 1272,col 5)-(line 1272,col 50)",
        "(line 1273,col 5)-(line 1273,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getImplementedInterfaces()",
      "begin_line": 1282,
      "end_line": 1287,
      "comment": "\n   * Returns the types specified by the {@code @implements} annotation.\n   *\n   * @return An immutable list of JSTypeExpression objects that can\n   *    be resolved to types.\n   ",
      "child_ranges": [
        "(line 1283,col 5)-(line 1285,col 5)",
        "(line 1286,col 5)-(line 1286,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getImplementedInterfaceCount()",
      "begin_line": 1293,
      "end_line": 1298,
      "comment": "\n   * Gets the number of interfaces specified by the {@code @implements}\n   * annotation.\n   ",
      "child_ranges": [
        "(line 1294,col 5)-(line 1296,col 5)",
        "(line 1297,col 5)-(line 1297,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addExtendedInterface(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1305,
      "end_line": 1315,
      "comment": "\n   * Adds an extended interface (for interface only).\n   * Returns whether the type was added.\n   * if the type was already present in the list, it won\u0027t get added again.\n   ",
      "child_ranges": [
        "(line 1306,col 5)-(line 1306,col 19)",
        "(line 1307,col 5)-(line 1309,col 5)",
        "(line 1310,col 5)-(line 1312,col 5)",
        "(line 1313,col 5)-(line 1313,col 38)",
        "(line 1314,col 5)-(line 1314,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getExtendedInterfaces()",
      "begin_line": 1323,
      "end_line": 1328,
      "comment": "\n   * Returns the interfaces extended by an interface\n   *\n   * @return An immutable list of JSTypeExpression objects that can\n   *    be resolved to types.\n   ",
      "child_ranges": [
        "(line 1324,col 5)-(line 1326,col 5)",
        "(line 1327,col 5)-(line 1327,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getExtendedInterfacesCount()",
      "begin_line": 1333,
      "end_line": 1338,
      "comment": "\n   * Gets the number of extended interfaces specified\n   ",
      "child_ranges": [
        "(line 1334,col 5)-(line 1336,col 5)",
        "(line 1337,col 5)-(line 1337,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getDeprecationReason()",
      "begin_line": 1343,
      "end_line": 1345,
      "comment": "\n   * Returns the deprecation reason or null if none specified.\n   ",
      "child_ranges": [
        "(line 1344,col 5)-(line 1344,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getSuppressions()",
      "begin_line": 1350,
      "end_line": 1353,
      "comment": "\n   * Returns the set of suppressed warnings.\n   ",
      "child_ranges": [
        "(line 1351,col 5)-(line 1351,col 71)",
        "(line 1352,col 5)-(line 1352,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getModifies()",
      "begin_line": 1358,
      "end_line": 1361,
      "comment": "\n   * Returns the set of sideeffect notations.\n   ",
      "child_ranges": [
        "(line 1359,col 5)-(line 1359,col 63)",
        "(line 1360,col 5)-(line 1360,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasDescriptionForParameter(java.lang.String)",
      "begin_line": 1367,
      "end_line": 1373,
      "comment": "\n   * Returns whether a description exists for the parameter with the specified\n   * name.\n   ",
      "child_ranges": [
        "(line 1368,col 5)-(line 1370,col 5)",
        "(line 1372,col 5)-(line 1372,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getDescriptionForParameter(java.lang.String)",
      "begin_line": 1379,
      "end_line": 1385,
      "comment": "\n   * Returns the description for the parameter with the given name, if its\n   * exists.\n   ",
      "child_ranges": [
        "(line 1380,col 5)-(line 1382,col 5)",
        "(line 1384,col 5)-(line 1384,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getAuthors()",
      "begin_line": 1390,
      "end_line": 1392,
      "comment": "\n   * Returns the list of authors or null if none.\n   ",
      "child_ranges": [
        "(line 1391,col 5)-(line 1391,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getReferences()",
      "begin_line": 1397,
      "end_line": 1399,
      "comment": "\n   * Returns the list of references or null if none.\n   ",
      "child_ranges": [
        "(line 1398,col 5)-(line 1398,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getVersion()",
      "begin_line": 1404,
      "end_line": 1406,
      "comment": "\n   * Returns the version or null if none.\n   ",
      "child_ranges": [
        "(line 1405,col 5)-(line 1405,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getReturnDescription()",
      "begin_line": 1411,
      "end_line": 1413,
      "comment": "\n   * Returns the description of the returned object or null if none specified.\n   ",
      "child_ranges": [
        "(line 1412,col 5)-(line 1412,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getBlockDescription()",
      "begin_line": 1418,
      "end_line": 1420,
      "comment": "\n   * Returns the block-level description or null if none specified.\n   ",
      "child_ranges": [
        "(line 1419,col 5)-(line 1419,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasFileOverview()",
      "begin_line": 1425,
      "end_line": 1427,
      "comment": "\n   * Returns whether this has a fileoverview flag.\n   ",
      "child_ranges": [
        "(line 1426,col 5)-(line 1426,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getFileOverview()",
      "begin_line": 1432,
      "end_line": 1434,
      "comment": "\n   * Returns the file overview or null if none specified.\n   ",
      "child_ranges": [
        "(line 1433,col 5)-(line 1433,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getAssociatedNode()",
      "begin_line": 1436,
      "end_line": 1438,
      "comment": "",
      "child_ranges": [
        "(line 1437,col 5)-(line 1437,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setAssociatedNode(com.google.javascript.rhino.Node)",
      "begin_line": 1447,
      "end_line": 1449,
      "comment": "\n   * Sets the node associated with this JSDoc.\n   * Notice that many nodes may have pointer to the same JSDocInfo\n   * object (because we propagate it across the type graph). But there\n   * is only one canonical \"owner\" node of the JSDocInfo, which corresponds\n   * to its original place in the syntax tree.\n   ",
      "child_ranges": [
        "(line 1448,col 5)-(line 1448,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getSourceName()",
      "begin_line": 1452,
      "end_line": 1455,
      "comment": " Gets the name of the source file that contains this JSDoc. ",
      "child_ranges": [
        "(line 1453,col 5)-(line 1454,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getMarkers()",
      "begin_line": 1458,
      "end_line": 1461,
      "comment": " Gets the list of all markers for the documentation in this JSDoc. ",
      "child_ranges": [
        "(line 1459,col 5)-(line 1460,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getTemplateTypeNames()",
      "begin_line": 1464,
      "end_line": 1469,
      "comment": " Gets the template type name. ",
      "child_ranges": [
        "(line 1465,col 5)-(line 1467,col 5)",
        "(line 1468,col 5)-(line 1468,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getTypeNodes()",
      "begin_line": 1478,
      "end_line": 1524,
      "comment": "\n   * Returns a collection of all type nodes that are a part of this JSDocInfo.\n   * This includes @type, @this, @extends, @implements, @param, @throws,\n   * and @return.  Any future type specific JSDoc should make sure to add the\n   * appropriate nodes here.\n   * @return collection of all type nodes\n   ",
      "child_ranges": [
        "(line 1479,col 5)-(line 1479,col 44)",
        "(line 1481,col 5)-(line 1483,col 5)",
        "(line 1485,col 5)-(line 1487,col 5)",
        "(line 1489,col 5)-(line 1521,col 5)",
        "(line 1523,col 5)-(line 1523,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasModifies()",
      "begin_line": 1526,
      "end_line": 1528,
      "comment": "",
      "child_ranges": [
        "(line 1527,col 5)-(line 1527,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getOriginalCommentString()",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "\n   * Returns the original JSDoc comment string. Returns null unless\n   * parseJsDocDocumentation is enabled via the ParserConfig.\n   ",
      "child_ranges": [
        "(line 1535,col 5)-(line 1535,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setOriginalCommentString(java.lang.String)",
      "begin_line": 1538,
      "end_line": 1543,
      "comment": "",
      "child_ranges": [
        "(line 1539,col 5)-(line 1541,col 5)",
        "(line 1542,col 5)-(line 1542,col 48)"
      ]
    }
  ]
}