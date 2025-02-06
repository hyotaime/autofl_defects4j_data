{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/JSDocInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSDocInfo",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1595,
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
      "end_line": 108,
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
      "type": "field",
      "varNames": [
        "ngInject"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wizaction"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LazilyInitializedDocumentation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 110,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceComment"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "markers"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "throwsDescriptions"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockDescription"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileOverview"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnDescription"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "authors"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sees"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "StringPosition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.SourcePosition\u003cjava.lang.String\u003e"
      ],
      "begin_line": 129,
      "end_line": 130,
      "comment": "\n   * A piece of information (found in a marker) which contains a position\n   * with a string.\n   "
    },
    {
      "type": "class_interface",
      "name": "TrimmedStringPosition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.JSDocInfo.StringPosition"
      ],
      "begin_line": 136,
      "end_line": 144,
      "comment": "\n   * A piece of information (found in a marker) which contains a position\n   * with a string that has no leading or trailing whitespace.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition.setItem(java.lang.String)",
      "begin_line": 137,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 141,col 55)",
        "(line 142,col 7)-(line 142,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NamePosition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n   * A piece of information (found in a marker) which contains a position\n   * with a name node.\n   "
    },
    {
      "type": "class_interface",
      "name": "TypePosition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 156,
      "end_line": 167,
      "comment": "\n   * A piece of information (found in a marker) which contains a position\n   * with a type expression syntax tree.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "brackets"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.TypePosition.hasBrackets()",
      "begin_line": 160,
      "end_line": 162,
      "comment": " Returns whether the type has curly braces around it. ",
      "child_ranges": [
        "(line 161,col 7)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.TypePosition.setHasBrackets(boolean)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Marker",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 179,
      "end_line": 246,
      "comment": "\n   * Defines a class for containing the parsing information\n   * for this JSDocInfo. For each annotation found in the\n   * JsDoc, a marker will be created indicating the annotation\n   * itself, the name of the annotation (if any; for example,\n   * a @param has a name, but a @return does not), the\n   * textual description found on that annotation and, if applicable,\n   * the type declaration. All this information is only collected\n   * if documentation collection is turned on.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameNode"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getAnnotation()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Gets the position information for the annotation name. (e.g., \"param\")\n     ",
      "child_ranges": [
        "(line 190,col 7)-(line 190,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setAnnotation(com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 7)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getName()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Gets the position information for the name found\n     * in a @param tag.\n     * @deprecated Use #getNameNode\n     ",
      "child_ranges": [
        "(line 204,col 7)-(line 204,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setName(com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 7)-(line 208,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getNameNode()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Gets the position information for the name found\n     * in an @param tag.\n     ",
      "child_ranges": [
        "(line 216,col 7)-(line 216,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setNameNode(com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 7)-(line 220,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getDescription()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Gets the position information for the description found\n     * in a block tag.\n     ",
      "child_ranges": [
        "(line 228,col 7)-(line 228,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setDescription(com.google.javascript.rhino.JSDocInfo.StringPosition)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 7)-(line 232,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.getType()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Gets the position information for the type expression found\n     * in some block tags, like \"@param\" and \"@return\".\n     ",
      "child_ranges": [
        "(line 240,col 7)-(line 240,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.Marker.setType(com.google.javascript.rhino.JSDocInfo.TypePosition)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "info"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "documentation"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "associatedNode"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " The Node this JSDoc is associated with."
    },
    {
      "type": "field",
      "varNames": [
        "visibility"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitset"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": "\n   * The {@link #isConstant()}, {@link #isConstructor()}, {@link #isInterface},\n   * {@link #isHidden()} and {@link #shouldPreserveTry()} flags as well as\n   * whether the {@link #type} field stores a value for {@link #getType()},\n   * {@link #getReturnType()} or {@link #getEnumParameterType()}.\n   *\n   * @see #setFlag(boolean, int)\n   * @see #getFlag(int)\n   * @see #setType(JSTypeExpression, int)\n   * @see #getType(int)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": "\n   * The type for {@link #getType()}, {@link #getReturnType()} or\n   * {@link #getEnumParameterType()}. The knowledge of which one is recorded is\n   * stored in the {@link #bitset} field.\n   *\n   * @see #setType(JSTypeExpression, int)\n   * @see #getType(int)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "thisType"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": "\n   * The type for {@link #getThisType()}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "includeDocumentation"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": "\n   * Whether to include documentation.\n   *\n   * @see JSDocInfo.LazilyInitializedDocumentation\n   "
    },
    {
      "type": "field",
      "varNames": [
        "originalCommentPosition"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n   * Position of the original comment.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_FLAGS"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " Mask all the boolean annotation types"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_CONSTANT"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " @const"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_CONSTRUCTOR"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " @constructor"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_DEFINE"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " @define"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_HIDDEN"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " @hidden"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_PRESERVETRY"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " @preserveTry"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOCHECK"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " @notypecheck"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_OVERRIDE"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " @override"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOALIAS"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " @noalias"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_DEPRECATED"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " @deprecated"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_INTERFACE"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " @interface"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_EXPORT"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " @export"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOSHADOW"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " @noshadow"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_FILEOVERVIEW"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " @fileoverview"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_IMPLICITCAST"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " @implicitCast"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOSIDEEFFECTS"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " @nosideeffects"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_EXTERNS"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " @externs"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_JAVADISPATCH"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " @javadispatch"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NOCOMPILE"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " @nocompile"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_CONSISTIDGEN"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " @consistentIdGenerator"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_IDGEN"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " @idGenerator"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_EXPOSE"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " @expose"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_STRUCT"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " @struct"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_DICT"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " @dict"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_STALBEIDGEN"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " @stableIdGenerator"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_MAPPEDIDGEN"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " @idGenerator {mapped}"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_TYPEFIELD"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " 1110..."
    },
    {
      "type": "field",
      "varNames": [
        "TYPEFIELD_TYPE"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " 0010..."
    },
    {
      "type": "field",
      "varNames": [
        "TYPEFIELD_RETURN"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " 0100..."
    },
    {
      "type": "field",
      "varNames": [
        "TYPEFIELD_ENUM"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": " 0110..."
    },
    {
      "type": "field",
      "varNames": [
        "TYPEFIELD_TYPEDEF"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " 1000..."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.JSDocInfo.JSDocInfo(boolean)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n   * Creates a {@link JSDocInfo} object. This object should be created using\n   * a {@link JSDocInfoBuilder}.\n   ",
      "child_ranges": [
        "(line 343,col 5)-(line 343,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.JSDocInfo.JSDocInfo()",
      "begin_line": 347,
      "end_line": 347,
      "comment": " Visible for testing.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setConsistentIdGenerator(boolean)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setStableIdGenerator(boolean)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setMappedIdGenerator(boolean)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setConstant(boolean)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 5)-(line 362,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setConstructor(boolean)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setStruct()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 370,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDict()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDefine(boolean)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setHidden(boolean)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 382,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoCheck(boolean)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setShouldPreserveTry(boolean)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 390,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setOverride(boolean)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 5)-(line 394,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoAlias(boolean)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 5)-(line 398,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDeprecated(boolean)",
      "begin_line": 402,
      "end_line": 404,
      "comment": " Visible for testing.",
      "child_ranges": [
        "(line 403,col 5)-(line 403,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setInterface(boolean)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 407,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setExport(boolean)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 5)-(line 411,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setExpose(boolean)",
      "begin_line": 414,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoShadow(boolean)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setIdGenerator(boolean)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 423,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setImplicitCast(boolean)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoSideEffects(boolean)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 5)-(line 431,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setExterns(boolean)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 435,col 5)-(line 435,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setJavaDispatch(boolean)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNoCompile(boolean)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 443,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setFlag(boolean, int)",
      "begin_line": 446,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 447,col 5)-(line 451,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isConsistentIdGenerator()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n   * @return whether the {@code @consistentIdGenerator} is present on\n   * this {@link JSDocInfo}\n   ",
      "child_ranges": [
        "(line 459,col 5)-(line 459,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isStableIdGenerator()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n   * @return whether the {@code @stableIdGenerator} is present on this {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 466,col 5)-(line 466,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isMappedIdGenerator()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n   * @return whether the {@code @stableIdGenerator} is present on this {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 473,col 5)-(line 473,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isConstant()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n   * Returns whether the {@code @const} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 481,col 5)-(line 481,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isConstructor()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n   * Returns whether the {@code @constructor} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 489,col 5)-(line 489,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.makesStructs()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n   * Returns whether the {@code @struct} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 497,col 5)-(line 497,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.makesDicts()",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n   * Returns whether the {@code @dict} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 505,col 5)-(line 505,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isDefine()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n   * Returns whether the {@code @define} annotation is present on this\n   * {@link JSDocInfo}. If this annotation is present, then the\n   * {@link #getType()} method will retrieve the define type.\n   ",
      "child_ranges": [
        "(line 514,col 5)-(line 514,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isHidden()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n   * Returns whether the {@code @hidden} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoTypeCheck()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n   * Returns whether the {@code @nocheck} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 530,col 5)-(line 530,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.shouldPreserveTry()",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n   * Returns whether the {@code @preserveTry} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isOverride()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\n   * Returns whether the {@code @override} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 546,col 5)-(line 546,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoAlias()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n   * Returns whether the {@code @noalias} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 554,col 5)-(line 554,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isDeprecated()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n   * Returns whether the {@code @deprecated} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 562,col 5)-(line 562,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isInterface()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n   * Returns whether the {@code @interface} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 570,col 5)-(line 570,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isExport()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n   * Returns whether the {@code @export} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 578,col 5)-(line 578,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isExpose()",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n   * Returns whether the {@code @expose} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 586,col 5)-(line 586,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoShadow()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n   * Returns whether the {@code @noshadow} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 594,col 5)-(line 594,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isIdGenerator()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n   * @return whether the {@code @idGenerator} is present on\n   * this {@link JSDocInfo}\n   ",
      "child_ranges": [
        "(line 602,col 5)-(line 602,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isImplicitCast()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n   * Returns whether the {@code @implicitCast} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 610,col 5)-(line 610,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoSideEffects()",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\n   * Returns whether the {@code @nosideeffects} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 618,col 5)-(line 618,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isExterns()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\n   * Returns whether the {@code @externs} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 626,col 5)-(line 626,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isJavaDispatch()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\n   * Returns whether the {@code @javadispatch} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 634,col 5)-(line 634,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNoCompile()",
      "begin_line": 641,
      "end_line": 643,
      "comment": "\n   * Returns whether the {@code @nocompile} annotation is present on this\n   * {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 642,col 5)-(line 642,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.containsDeclaration()",
      "begin_line": 648,
      "end_line": 665,
      "comment": "\n   * @return Whether there is declaration present on this {@link JSDocInfo}.\n   ",
      "child_ranges": [
        "(line 649,col 5)-(line 664,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getFlag(int)",
      "begin_line": 667,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 668,col 5)-(line 668,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)",
      "begin_line": 672,
      "end_line": 674,
      "comment": " Visible for testing.",
      "child_ranges": [
        "(line 673,col 5)-(line 673,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.lazyInitInfo()",
      "begin_line": 676,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 677,col 5)-(line 679,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.lazyInitDocumentation()",
      "begin_line": 686,
      "end_line": 696,
      "comment": "\n   * Lazily initializes the documentation information object, but only\n   * if the JSDocInfo was told to keep such information around.\n   ",
      "child_ranges": [
        "(line 687,col 5)-(line 689,col 5)",
        "(line 691,col 5)-(line 693,col 5)",
        "(line 695,col 5)-(line 695,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addMarker()",
      "begin_line": 702,
      "end_line": 714,
      "comment": "\n   * Adds a marker to the documentation (if it exists) and\n   * returns the marker. Returns null otherwise.\n   ",
      "child_ranges": [
        "(line 703,col 5)-(line 705,col 5)",
        "(line 707,col 5)-(line 709,col 5)",
        "(line 711,col 5)-(line 711,col 33)",
        "(line 712,col 5)-(line 712,col 38)",
        "(line 713,col 5)-(line 713,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDeprecationReason(java.lang.String)",
      "begin_line": 721,
      "end_line": 730,
      "comment": "\n   * Sets the deprecation reason.\n   *\n   * @param reason The deprecation reason\n   ",
      "child_ranges": [
        "(line 722,col 5)-(line 722,col 19)",
        "(line 724,col 5)-(line 726,col 5)",
        "(line 728,col 5)-(line 728,col 29)",
        "(line 729,col 5)-(line 729,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addSuppression(java.lang.String)",
      "begin_line": 735,
      "end_line": 742,
      "comment": "\n   * Add a suppressed warning.\n   ",
      "child_ranges": [
        "(line 736,col 5)-(line 736,col 19)",
        "(line 738,col 5)-(line 740,col 5)",
        "(line 741,col 5)-(line 741,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setSuppressions(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 748,
      "end_line": 757,
      "comment": "\n   * Sets suppressed warnings.\n   * @param suppressions A list of suppressed warning types.\n   ",
      "child_ranges": [
        "(line 749,col 5)-(line 749,col 19)",
        "(line 751,col 5)-(line 753,col 5)",
        "(line 755,col 5)-(line 755,col 37)",
        "(line 756,col 5)-(line 756,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addModifies(java.lang.String)",
      "begin_line": 762,
      "end_line": 769,
      "comment": "\n   * Add modifies values.\n   ",
      "child_ranges": [
        "(line 763,col 5)-(line 763,col 19)",
        "(line 765,col 5)-(line 767,col 5)",
        "(line 768,col 5)-(line 768,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setModifies(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 775,
      "end_line": 784,
      "comment": "\n   * Sets modifies values.\n   * @param modifies A list of modifies types.\n   ",
      "child_ranges": [
        "(line 776,col 5)-(line 776,col 19)",
        "(line 778,col 5)-(line 780,col 5)",
        "(line 782,col 5)-(line 782,col 29)",
        "(line 783,col 5)-(line 783,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentVersion(java.lang.String)",
      "begin_line": 789,
      "end_line": 800,
      "comment": "\n   * Documents the version.\n   ",
      "child_ranges": [
        "(line 790,col 5)-(line 792,col 5)",
        "(line 794,col 5)-(line 796,col 5)",
        "(line 798,col 5)-(line 798,col 36)",
        "(line 799,col 5)-(line 799,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentReference(java.lang.String)",
      "begin_line": 805,
      "end_line": 816,
      "comment": "\n   * Documents a reference (i.e. adds a \"see\" reference to the list).\n   ",
      "child_ranges": [
        "(line 806,col 5)-(line 808,col 5)",
        "(line 810,col 5)-(line 812,col 5)",
        "(line 814,col 5)-(line 814,col 38)",
        "(line 815,col 5)-(line 815,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentAuthor(java.lang.String)",
      "begin_line": 821,
      "end_line": 832,
      "comment": "\n   * Documents the author (i.e. adds it to the author list).\n   ",
      "child_ranges": [
        "(line 822,col 5)-(line 824,col 5)",
        "(line 826,col 5)-(line 828,col 5)",
        "(line 830,col 5)-(line 830,col 38)",
        "(line 831,col 5)-(line 831,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentThrows(com.google.javascript.rhino.JSTypeExpression, java.lang.String)",
      "begin_line": 837,
      "end_line": 853,
      "comment": "\n   * Documents the throws (i.e. adds it to the throws list).\n   ",
      "child_ranges": [
        "(line 838,col 5)-(line 840,col 5)",
        "(line 842,col 5)-(line 845,col 5)",
        "(line 847,col 5)-(line 850,col 5)",
        "(line 852,col 5)-(line 852,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentParam(java.lang.String, java.lang.String)",
      "begin_line": 863,
      "end_line": 878,
      "comment": "\n   * Documents a parameter. Parameters are described using the {@code @param}\n   * annotation.\n   *\n   * @param parameter the parameter\u0027s name\n   * @param description the parameter\u0027s description\n   ",
      "child_ranges": [
        "(line 864,col 5)-(line 866,col 5)",
        "(line 868,col 5)-(line 870,col 5)",
        "(line 872,col 5)-(line 877,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentBlock(java.lang.String)",
      "begin_line": 885,
      "end_line": 896,
      "comment": "\n   * Documents the block-level comment/description.\n   *\n   * @param description the description\n   ",
      "child_ranges": [
        "(line 886,col 5)-(line 888,col 5)",
        "(line 890,col 5)-(line 892,col 5)",
        "(line 894,col 5)-(line 894,col 49)",
        "(line 895,col 5)-(line 895,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentFileOverview(java.lang.String)",
      "begin_line": 903,
      "end_line": 915,
      "comment": "\n   * Documents the fileoverview comment/description.\n   *\n   * @param description the description\n   ",
      "child_ranges": [
        "(line 904,col 5)-(line 904,col 37)",
        "(line 905,col 5)-(line 907,col 5)",
        "(line 909,col 5)-(line 911,col 5)",
        "(line 913,col 5)-(line 913,col 45)",
        "(line 914,col 5)-(line 914,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.documentReturn(java.lang.String)",
      "begin_line": 923,
      "end_line": 934,
      "comment": "\n   * Documents the return value. Return value is described using the\n   * {@code @return} annotation.\n   *\n   * @param description the return value\u0027s description\n   ",
      "child_ranges": [
        "(line 924,col 5)-(line 926,col 5)",
        "(line 928,col 5)-(line 930,col 5)",
        "(line 932,col 5)-(line 932,col 50)",
        "(line 933,col 5)-(line 933,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.declareParam(com.google.javascript.rhino.JSTypeExpression, java.lang.String)",
      "begin_line": 944,
      "end_line": 955,
      "comment": "\n   * Declares a parameter. Parameters are described using the {@code @param}\n   * annotation.\n   *\n   * @param jsType the parameter\u0027s type, it may be {@code null} when the\n   *     {@code @param} annotation did not specify a type.\n   * @param parameter the parameter\u0027s name\n   ",
      "child_ranges": [
        "(line 945,col 5)-(line 945,col 19)",
        "(line 946,col 5)-(line 948,col 5)",
        "(line 949,col 5)-(line 954,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.declareTemplateTypeNames(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 963,
      "end_line": 972,
      "comment": "\n   * Declares a template type name. Template type names are described using the\n   * {@code @template} annotation.\n   *\n   * @param templateTypeNames the template type name.\n   ",
      "child_ranges": [
        "(line 964,col 5)-(line 964,col 19)",
        "(line 966,col 5)-(line 968,col 5)",
        "(line 970,col 5)-(line 970,col 69)",
        "(line 971,col 5)-(line 971,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.declareThrows(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 979,
      "end_line": 988,
      "comment": "\n   * Declares that the method throws a given type.\n   *\n   * @param jsType The type that can be thrown by the method.\n   ",
      "child_ranges": [
        "(line 980,col 5)-(line 980,col 19)",
        "(line 982,col 5)-(line 984,col 5)",
        "(line 986,col 5)-(line 986,col 33)",
        "(line 987,col 5)-(line 987,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getVisibility()",
      "begin_line": 995,
      "end_line": 997,
      "comment": "\n   * Gets the visibility specified by {@code @private}, {@code @protected} or\n   * {@code @public} annotation. If no visibility is specified, visibility\n   * is inherited from the base class.\n   ",
      "child_ranges": [
        "(line 996,col 5)-(line 996,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getParameterType(java.lang.String)",
      "begin_line": 1005,
      "end_line": 1010,
      "comment": "\n   * Gets the parameter type.\n   * @param parameter the parameter\u0027s name\n   * @return the parameter\u0027s type or {@code null} if this parameter is not\n   *     defined or has a {@code null} type\n   ",
      "child_ranges": [
        "(line 1006,col 5)-(line 1008,col 5)",
        "(line 1009,col 5)-(line 1009,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasParameter(java.lang.String)",
      "begin_line": 1015,
      "end_line": 1020,
      "comment": "\n   * Returns whether the parameter is defined.\n   ",
      "child_ranges": [
        "(line 1016,col 5)-(line 1018,col 5)",
        "(line 1019,col 5)-(line 1019,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasParameterType(java.lang.String)",
      "begin_line": 1028,
      "end_line": 1030,
      "comment": "\n   * Returns whether the parameter has an attached type.\n   *\n   * @return {@code true} if the parameter has an attached type, {@code false}\n   *     if the parameter has no attached type or does not exist.\n   ",
      "child_ranges": [
        "(line 1029,col 5)-(line 1029,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getParameterNames()",
      "begin_line": 1039,
      "end_line": 1044,
      "comment": "\n   * Returns the set of names of the defined parameters. The iteration order\n   * of the returned set is not the order in which parameters are defined.\n   *\n   * @return the set of names of the defined parameters. The returned set is\n   *     immutable.\n   ",
      "child_ranges": [
        "(line 1040,col 5)-(line 1042,col 5)",
        "(line 1043,col 5)-(line 1043,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getParameterCount()",
      "begin_line": 1049,
      "end_line": 1054,
      "comment": "\n   * Gets the number of parameters defined.\n   ",
      "child_ranges": [
        "(line 1050,col 5)-(line 1052,col 5)",
        "(line 1053,col 5)-(line 1053,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 5)-(line 1057,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setReturnType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1060,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 5)-(line 1061,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setEnumParameterType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 5)-(line 1065,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setTypedefType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1068,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1069,col 5)-(line 1069,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setType(com.google.javascript.rhino.JSTypeExpression, int)",
      "begin_line": 1072,
      "end_line": 1080,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 5)-(line 1077,col 5)",
        "(line 1078,col 5)-(line 1078,col 47)",
        "(line 1079,col 5)-(line 1079,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getThrownTypes()",
      "begin_line": 1085,
      "end_line": 1090,
      "comment": "\n   * Returns the list of thrown types.\n   ",
      "child_ranges": [
        "(line 1086,col 5)-(line 1088,col 5)",
        "(line 1089,col 5)-(line 1089,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasType()",
      "begin_line": 1096,
      "end_line": 1098,
      "comment": "\n   * Returns whether a type, specified using the {@code @type} annotation, is\n   * present on this JSDoc.\n   ",
      "child_ranges": [
        "(line 1097,col 5)-(line 1097,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasEnumParameterType()",
      "begin_line": 1104,
      "end_line": 1106,
      "comment": "\n   * Returns whether an enum parameter type, specified using the {@code @enum}\n   * annotation, is present on this JSDoc.\n   ",
      "child_ranges": [
        "(line 1105,col 5)-(line 1105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasTypedefType()",
      "begin_line": 1112,
      "end_line": 1114,
      "comment": "\n   * Returns whether a typedef parameter type, specified using the\n   * {@code @typedef} annotation, is present on this JSDoc.\n   ",
      "child_ranges": [
        "(line 1113,col 5)-(line 1113,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasReturnType()",
      "begin_line": 1120,
      "end_line": 1122,
      "comment": "\n   * Returns whether this {@link JSDocInfo} contains a type for {@code @return}\n   * annotation.\n   ",
      "child_ranges": [
        "(line 1121,col 5)-(line 1121,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasType(int)",
      "begin_line": 1124,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 5)-(line 1125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getType()",
      "begin_line": 1131,
      "end_line": 1133,
      "comment": "\n   * Gets the type specified by the {@code @type} annotation.\n   ",
      "child_ranges": [
        "(line 1132,col 5)-(line 1132,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getReturnType()",
      "begin_line": 1138,
      "end_line": 1140,
      "comment": "\n   * Gets the return type specified by the {@code @return} annotation.\n   ",
      "child_ranges": [
        "(line 1139,col 5)-(line 1139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getEnumParameterType()",
      "begin_line": 1145,
      "end_line": 1147,
      "comment": "\n   * Gets the enum parameter type specified by the {@code @enum} annotation.\n   ",
      "child_ranges": [
        "(line 1146,col 5)-(line 1146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getTypedefType()",
      "begin_line": 1152,
      "end_line": 1154,
      "comment": "\n   * Gets the typedef type specified by the {@code @type} annotation.\n   ",
      "child_ranges": [
        "(line 1153,col 5)-(line 1153,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getType(int)",
      "begin_line": 1156,
      "end_line": 1162,
      "comment": "",
      "child_ranges": [
        "(line 1157,col 5)-(line 1161,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getThisType()",
      "begin_line": 1167,
      "end_line": 1169,
      "comment": "\n   * Gets the type specified by the {@code @this} annotation.\n   ",
      "child_ranges": [
        "(line 1168,col 5)-(line 1168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setThisType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1174,
      "end_line": 1176,
      "comment": "\n   * Sets the type specified by the {@code @this} annotation.\n   ",
      "child_ranges": [
        "(line 1175,col 5)-(line 1175,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasThisType()",
      "begin_line": 1182,
      "end_line": 1184,
      "comment": "\n   * Returns whether this {@link JSDocInfo} contains a type for {@code @this}\n   * annotation.\n   ",
      "child_ranges": [
        "(line 1183,col 5)-(line 1183,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setBaseType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1186,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1187,col 5)-(line 1187,col 19)",
        "(line 1188,col 5)-(line 1188,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getBaseType()",
      "begin_line": 1194,
      "end_line": 1196,
      "comment": "\n   * Gets the base type specified by the {@code @extends} annotation.\n   ",
      "child_ranges": [
        "(line 1195,col 5)-(line 1195,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getDescription()",
      "begin_line": 1201,
      "end_line": 1203,
      "comment": "\n   * Gets the description specified by the {@code @desc} annotation.\n   ",
      "child_ranges": [
        "(line 1202,col 5)-(line 1202,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setDescription(java.lang.String)",
      "begin_line": 1205,
      "end_line": 1208,
      "comment": "",
      "child_ranges": [
        "(line 1206,col 5)-(line 1206,col 19)",
        "(line 1207,col 5)-(line 1207,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getMeaning()",
      "begin_line": 1221,
      "end_line": 1223,
      "comment": "\n   * Gets the meaning specified by the {@code @meaning} annotation.\n   *\n   * In localization systems, two messages with the same content but\n   * different \"meanings\" may be translated differently. By default, we\n   * use the name of the variable that the message is initialized to as\n   * the \"meaning\" of the message.\n   *\n   * But some code generators (like Closure Templates) inject their own\n   * meaning with the jsdoc {@code @meaning} annotation.\n   ",
      "child_ranges": [
        "(line 1222,col 5)-(line 1222,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setMeaning(java.lang.String)",
      "begin_line": 1225,
      "end_line": 1228,
      "comment": "",
      "child_ranges": [
        "(line 1226,col 5)-(line 1226,col 19)",
        "(line 1227,col 5)-(line 1227,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getLendsName()",
      "begin_line": 1238,
      "end_line": 1240,
      "comment": "\n   * Gets the name we\u0027re lending to in a {@code @lends} annotation.\n   *\n   * In many reflection APIs, you pass an anonymous object to a function,\n   * and that function mixes the anonymous object into another object.\n   * The {@code @lends} annotation allows the type system to track\n   * those property assignments.\n   ",
      "child_ranges": [
        "(line 1239,col 5)-(line 1239,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setLendsName(java.lang.String)",
      "begin_line": 1242,
      "end_line": 1245,
      "comment": "",
      "child_ranges": [
        "(line 1243,col 5)-(line 1243,col 19)",
        "(line 1244,col 5)-(line 1244,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isNgInject()",
      "begin_line": 1250,
      "end_line": 1252,
      "comment": "\n   * Returns whether JSDoc is annotated with {@code @ngInject} annotation.\n   ",
      "child_ranges": [
        "(line 1251,col 5)-(line 1251,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setNgInject(boolean)",
      "begin_line": 1254,
      "end_line": 1257,
      "comment": "",
      "child_ranges": [
        "(line 1255,col 5)-(line 1255,col 19)",
        "(line 1256,col 5)-(line 1256,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.isWizaction()",
      "begin_line": 1262,
      "end_line": 1264,
      "comment": "\n   * Returns whether JSDoc is annotated with {@code @wizaction} annotation.\n   ",
      "child_ranges": [
        "(line 1263,col 5)-(line 1263,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setWizaction(boolean)",
      "begin_line": 1266,
      "end_line": 1269,
      "comment": "",
      "child_ranges": [
        "(line 1267,col 5)-(line 1267,col 19)",
        "(line 1268,col 5)-(line 1268,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getLicense()",
      "begin_line": 1274,
      "end_line": 1276,
      "comment": "\n   * Gets the description specified by the {@code @license} annotation.\n   ",
      "child_ranges": [
        "(line 1275,col 5)-(line 1275,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setLicense(java.lang.String)",
      "begin_line": 1285,
      "end_line": 1288,
      "comment": "",
      "child_ranges": [
        "(line 1286,col 5)-(line 1286,col 19)",
        "(line 1287,col 5)-(line 1287,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.toString()",
      "begin_line": 1290,
      "end_line": 1293,
      "comment": "",
      "child_ranges": [
        "(line 1292,col 5)-(line 1292,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasBaseType()",
      "begin_line": 1299,
      "end_line": 1301,
      "comment": "\n   * Returns whether this {@link JSDocInfo} contains a type for {@code @extends}\n   * annotation.\n   ",
      "child_ranges": [
        "(line 1300,col 5)-(line 1300,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addImplementedInterface(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1307,
      "end_line": 1317,
      "comment": "\n   * Adds an implemented interface. Returns whether the interface was added. If\n   * the interface was already present in the list, it won\u0027t get added again.\n   ",
      "child_ranges": [
        "(line 1308,col 5)-(line 1308,col 19)",
        "(line 1309,col 5)-(line 1311,col 5)",
        "(line 1312,col 5)-(line 1314,col 5)",
        "(line 1315,col 5)-(line 1315,col 50)",
        "(line 1316,col 5)-(line 1316,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getImplementedInterfaces()",
      "begin_line": 1325,
      "end_line": 1330,
      "comment": "\n   * Returns the types specified by the {@code @implements} annotation.\n   *\n   * @return An immutable list of JSTypeExpression objects that can\n   *    be resolved to types.\n   ",
      "child_ranges": [
        "(line 1326,col 5)-(line 1328,col 5)",
        "(line 1329,col 5)-(line 1329,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getImplementedInterfaceCount()",
      "begin_line": 1336,
      "end_line": 1341,
      "comment": "\n   * Gets the number of interfaces specified by the {@code @implements}\n   * annotation.\n   ",
      "child_ranges": [
        "(line 1337,col 5)-(line 1339,col 5)",
        "(line 1340,col 5)-(line 1340,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.addExtendedInterface(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 1348,
      "end_line": 1358,
      "comment": "\n   * Adds an extended interface (for interface only).\n   * Returns whether the type was added.\n   * if the type was already present in the list, it won\u0027t get added again.\n   ",
      "child_ranges": [
        "(line 1349,col 5)-(line 1349,col 19)",
        "(line 1350,col 5)-(line 1352,col 5)",
        "(line 1353,col 5)-(line 1355,col 5)",
        "(line 1356,col 5)-(line 1356,col 38)",
        "(line 1357,col 5)-(line 1357,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getExtendedInterfaces()",
      "begin_line": 1366,
      "end_line": 1371,
      "comment": "\n   * Returns the interfaces extended by an interface\n   *\n   * @return An immutable list of JSTypeExpression objects that can\n   *    be resolved to types.\n   ",
      "child_ranges": [
        "(line 1367,col 5)-(line 1369,col 5)",
        "(line 1370,col 5)-(line 1370,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getExtendedInterfacesCount()",
      "begin_line": 1376,
      "end_line": 1381,
      "comment": "\n   * Gets the number of extended interfaces specified\n   ",
      "child_ranges": [
        "(line 1377,col 5)-(line 1379,col 5)",
        "(line 1380,col 5)-(line 1380,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getDeprecationReason()",
      "begin_line": 1386,
      "end_line": 1388,
      "comment": "\n   * Returns the deprecation reason or null if none specified.\n   ",
      "child_ranges": [
        "(line 1387,col 5)-(line 1387,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getSuppressions()",
      "begin_line": 1393,
      "end_line": 1396,
      "comment": "\n   * Returns the set of suppressed warnings.\n   ",
      "child_ranges": [
        "(line 1394,col 5)-(line 1394,col 71)",
        "(line 1395,col 5)-(line 1395,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getModifies()",
      "begin_line": 1401,
      "end_line": 1404,
      "comment": "\n   * Returns the set of sideeffect notations.\n   ",
      "child_ranges": [
        "(line 1402,col 5)-(line 1402,col 63)",
        "(line 1403,col 5)-(line 1403,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasDescriptionForParameter(java.lang.String)",
      "begin_line": 1410,
      "end_line": 1416,
      "comment": "\n   * Returns whether a description exists for the parameter with the specified\n   * name.\n   ",
      "child_ranges": [
        "(line 1411,col 5)-(line 1413,col 5)",
        "(line 1415,col 5)-(line 1415,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getDescriptionForParameter(java.lang.String)",
      "begin_line": 1422,
      "end_line": 1428,
      "comment": "\n   * Returns the description for the parameter with the given name, if its\n   * exists.\n   ",
      "child_ranges": [
        "(line 1423,col 5)-(line 1425,col 5)",
        "(line 1427,col 5)-(line 1427,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getAuthors()",
      "begin_line": 1433,
      "end_line": 1435,
      "comment": "\n   * Returns the list of authors or null if none.\n   ",
      "child_ranges": [
        "(line 1434,col 5)-(line 1434,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getReferences()",
      "begin_line": 1440,
      "end_line": 1442,
      "comment": "\n   * Returns the list of references or null if none.\n   ",
      "child_ranges": [
        "(line 1441,col 5)-(line 1441,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getVersion()",
      "begin_line": 1447,
      "end_line": 1449,
      "comment": "\n   * Returns the version or null if none.\n   ",
      "child_ranges": [
        "(line 1448,col 5)-(line 1448,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getReturnDescription()",
      "begin_line": 1454,
      "end_line": 1456,
      "comment": "\n   * Returns the description of the returned object or null if none specified.\n   ",
      "child_ranges": [
        "(line 1455,col 5)-(line 1455,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getBlockDescription()",
      "begin_line": 1461,
      "end_line": 1463,
      "comment": "\n   * Returns the block-level description or null if none specified.\n   ",
      "child_ranges": [
        "(line 1462,col 5)-(line 1462,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasFileOverview()",
      "begin_line": 1468,
      "end_line": 1470,
      "comment": "\n   * Returns whether this has a fileoverview flag.\n   ",
      "child_ranges": [
        "(line 1469,col 5)-(line 1469,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getFileOverview()",
      "begin_line": 1475,
      "end_line": 1477,
      "comment": "\n   * Returns the file overview or null if none specified.\n   ",
      "child_ranges": [
        "(line 1476,col 5)-(line 1476,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getAssociatedNode()",
      "begin_line": 1479,
      "end_line": 1481,
      "comment": "",
      "child_ranges": [
        "(line 1480,col 5)-(line 1480,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setAssociatedNode(com.google.javascript.rhino.Node)",
      "begin_line": 1490,
      "end_line": 1492,
      "comment": "\n   * Sets the node associated with this JSDoc.\n   * Notice that many nodes may have pointer to the same JSDocInfo\n   * object (because we propagate it across the type graph). But there\n   * is only one canonical \"owner\" node of the JSDocInfo, which corresponds\n   * to its original place in the syntax tree.\n   ",
      "child_ranges": [
        "(line 1491,col 5)-(line 1491,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getSourceName()",
      "begin_line": 1495,
      "end_line": 1498,
      "comment": " Gets the name of the source file that contains this JSDoc. ",
      "child_ranges": [
        "(line 1496,col 5)-(line 1497,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getMarkers()",
      "begin_line": 1501,
      "end_line": 1504,
      "comment": " Gets the list of all markers for the documentation in this JSDoc. ",
      "child_ranges": [
        "(line 1502,col 5)-(line 1503,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getTemplateTypeNames()",
      "begin_line": 1507,
      "end_line": 1512,
      "comment": " Gets the template type name. ",
      "child_ranges": [
        "(line 1508,col 5)-(line 1510,col 5)",
        "(line 1511,col 5)-(line 1511,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getTypeNodes()",
      "begin_line": 1521,
      "end_line": 1567,
      "comment": "\n   * Returns a collection of all type nodes that are a part of this JSDocInfo.\n   * This includes @type, @this, @extends, @implements, @param, @throws,\n   * and @return.  Any future type specific JSDoc should make sure to add the\n   * appropriate nodes here.\n   * @return collection of all type nodes\n   ",
      "child_ranges": [
        "(line 1522,col 5)-(line 1522,col 44)",
        "(line 1524,col 5)-(line 1526,col 5)",
        "(line 1528,col 5)-(line 1530,col 5)",
        "(line 1532,col 5)-(line 1564,col 5)",
        "(line 1566,col 5)-(line 1566,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.hasModifies()",
      "begin_line": 1569,
      "end_line": 1571,
      "comment": "",
      "child_ranges": [
        "(line 1570,col 5)-(line 1570,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getOriginalCommentString()",
      "begin_line": 1577,
      "end_line": 1579,
      "comment": "\n   * Returns the original JSDoc comment string. Returns null unless\n   * parseJsDocDocumentation is enabled via the ParserConfig.\n   ",
      "child_ranges": [
        "(line 1578,col 5)-(line 1578,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setOriginalCommentString(java.lang.String)",
      "begin_line": 1581,
      "end_line": 1586,
      "comment": "",
      "child_ranges": [
        "(line 1582,col 5)-(line 1584,col 5)",
        "(line 1585,col 5)-(line 1585,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.getOriginalCommentPosition()",
      "begin_line": 1588,
      "end_line": 1590,
      "comment": "",
      "child_ranges": [
        "(line 1589,col 5)-(line 1589,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSDocInfo.setOriginalCommentPosition(int)",
      "begin_line": 1592,
      "end_line": 1594,
      "comment": "",
      "child_ranges": [
        "(line 1593,col 5)-(line 1593,col 39)"
      ]
    }
  ]
}