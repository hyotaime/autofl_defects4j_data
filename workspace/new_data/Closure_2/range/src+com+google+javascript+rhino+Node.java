{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/Node.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 2380,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JSDOC_INFO_PROP",
        "VAR_ARGS_NAME",
        "INCRDECR_PROP",
        "QUOTED_PROP",
        "OPT_ARG_NAME",
        "SYNTHETIC_BLOCK_PROP",
        "EMPTY_BLOCK",
        "ORIGINALNAME_PROP",
        "SIDE_EFFECT_FLAGS",
        "IS_CONSTANT_NAME",
        "IS_NAMESPACE",
        "IS_DISPATCHER",
        "DIRECTIVES",
        "DIRECT_EVAL",
        "FREE_CALL",
        "STATIC_SOURCE_FILE",
        "LENGTH",
        "INPUT_ID",
        "SLASH_V",
        "INFERRED_FUNCTION",
        "LAST_PROP"
      ],
      "begin_line": 67,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DECR_FLAG",
        "POST_FLAG"
      ],
      "begin_line": 107,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.propToString(int)",
      "begin_line": 111,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 112,col 7)-(line 139,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumberNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.Node"
      ],
      "begin_line": 142,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.NumberNode.NumberNode(double)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 26)",
        "(line 148,col 7)-(line 148,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.NumberNode.NumberNode(double, int, int)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 7)-(line 152,col 42)",
        "(line 153,col 7)-(line 153,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NumberNode.getDouble()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 7)-(line 158,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NumberNode.setDouble(double)",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 7)-(line 163,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NumberNode.isEquivalentTo(com.google.javascript.rhino.Node, boolean, boolean)",
      "begin_line": 166,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 168,col 7)-(line 168,col 78)",
        "(line 169,col 7)-(line 176,col 7)",
        "(line 177,col 7)-(line 177,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "number"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "StringNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.Node"
      ],
      "begin_line": 183,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.StringNode.StringNode(int, java.lang.String)",
      "begin_line": 187,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 188,col 7)-(line 188,col 18)",
        "(line 189,col 7)-(line 191,col 7)",
        "(line 192,col 7)-(line 192,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.StringNode.StringNode(int, java.lang.String, int, int)",
      "begin_line": 195,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 196,col 7)-(line 196,col 34)",
        "(line 197,col 7)-(line 199,col 7)",
        "(line 200,col 7)-(line 200,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.getString()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * returns the string content.\n     * @return non null.\n     ",
      "child_ranges": [
        "(line 209,col 7)-(line 209,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.setString(java.lang.String)",
      "begin_line": 216,
      "end_line": 222,
      "comment": "\n     * sets the string content.\n     * @param str the new value.  Non null.\n     ",
      "child_ranges": [
        "(line 218,col 7)-(line 220,col 7)",
        "(line 221,col 7)-(line 221,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.isEquivalentTo(com.google.javascript.rhino.Node, boolean, boolean)",
      "begin_line": 224,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 226,col 7)-(line 227,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.isQuotedString()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * If the property is not defined, this was not a quoted key.  The\n     * QUOTED_PROP int property is only assigned to STRING tokens used as\n     * object lit keys.\n     * @return true if this was a quoted string key in an object literal.\n     ",
      "child_ranges": [
        "(line 238,col 7)-(line 238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.setQuotedString()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * This should only be called for STRING nodes created in object lits.\n     ",
      "child_ranges": [
        "(line 246,col 7)-(line 246,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "str"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PropListItem",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 253,
      "end_line": 259,
      "comment": " PropListItems must be immutable so that they can be shared."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.getType()",
      "begin_line": 254,
      "end_line": 254,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.getNext()",
      "begin_line": 255,
      "end_line": 255,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.chain(com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 256,
      "end_line": 256,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.getObjectValue()",
      "begin_line": 257,
      "end_line": 257,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.getIntValue()",
      "begin_line": 258,
      "end_line": 258,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AbstractPropListItem",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.Node.PropListItem",
        "java.io.Serializable"
      ],
      "begin_line": 261,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propType"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.AbstractPropListItem.AbstractPropListItem(int, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 268,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 269,col 7)-(line 269,col 31)",
        "(line 270,col 7)-(line 270,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AbstractPropListItem.getType()",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 7)-(line 275,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AbstractPropListItem.getNext()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AbstractPropListItem.chain(com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 283,
      "end_line": 284,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ObjectPropListItem",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.Node.AbstractPropListItem"
      ],
      "begin_line": 288,
      "end_line": 318,
      "comment": " A base class for Object storing props"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "objectValue"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.ObjectPropListItem(int, java.lang.Object, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 294,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 295,col 7)-(line 295,col 28)",
        "(line 296,col 7)-(line 296,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.getIntValue()",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 7)-(line 301,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.getObjectValue()",
      "begin_line": 304,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 7)-(line 306,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.toString()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 7)-(line 311,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.chain(com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 7)-(line 316,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IntPropListItem",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.Node.AbstractPropListItem"
      ],
      "begin_line": 321,
      "end_line": 350,
      "comment": " A base class for int storing props"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "intValue"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.IntPropListItem(int, int, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 326,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 28)",
        "(line 328,col 7)-(line 328,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.getIntValue()",
      "begin_line": 331,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 333,col 7)-(line 333,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.getObjectValue()",
      "begin_line": 336,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 7)-(line 338,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.toString()",
      "begin_line": 341,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 7)-(line 343,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.chain(com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 346,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 7)-(line 348,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int)",
      "begin_line": 352,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 20)",
        "(line 354,col 5)-(line 354,col 18)",
        "(line 355,col 5)-(line 355,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node)",
      "begin_line": 358,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 360,col 41)",
        "(line 361,col 5)-(line 362,col 42)",
        "(line 364,col 5)-(line 364,col 20)",
        "(line 365,col 5)-(line 365,col 18)",
        "(line 366,col 5)-(line 366,col 25)",
        "(line 367,col 5)-(line 367,col 22)",
        "(line 368,col 5)-(line 368,col 24)",
        "(line 369,col 5)-(line 369,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 372,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 373,col 5)-(line 374,col 47)",
        "(line 375,col 5)-(line 376,col 48)",
        "(line 377,col 5)-(line 378,col 48)",
        "(line 379,col 5)-(line 380,col 49)",
        "(line 381,col 5)-(line 381,col 20)",
        "(line 382,col 5)-(line 382,col 18)",
        "(line 383,col 5)-(line 383,col 17)",
        "(line 384,col 5)-(line 384,col 17)",
        "(line 385,col 5)-(line 385,col 22)",
        "(line 386,col 5)-(line 386,col 23)",
        "(line 387,col 5)-(line 387,col 22)",
        "(line 388,col 5)-(line 388,col 24)",
        "(line 389,col 5)-(line 389,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 392,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 393,col 5)-(line 393,col 53)",
        "(line 394,col 5)-(line 394,col 51)",
        "(line 395,col 5)-(line 395,col 52)",
        "(line 396,col 5)-(line 396,col 50)",
        "(line 397,col 5)-(line 397,col 54)",
        "(line 398,col 5)-(line 398,col 52)",
        "(line 399,col 5)-(line 399,col 20)",
        "(line 400,col 5)-(line 400,col 18)",
        "(line 401,col 5)-(line 401,col 17)",
        "(line 402,col 5)-(line 402,col 17)",
        "(line 403,col 5)-(line 403,col 20)",
        "(line 404,col 5)-(line 404,col 23)",
        "(line 405,col 5)-(line 405,col 21)",
        "(line 406,col 5)-(line 406,col 22)",
        "(line 407,col 5)-(line 407,col 22)",
        "(line 408,col 5)-(line 408,col 24)",
        "(line 409,col 5)-(line 409,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 412,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 413,col 5)-(line 413,col 53)",
        "(line 414,col 5)-(line 414,col 51)",
        "(line 415,col 5)-(line 415,col 52)",
        "(line 416,col 5)-(line 416,col 50)",
        "(line 417,col 5)-(line 417,col 53)",
        "(line 418,col 5)-(line 418,col 51)",
        "(line 419,col 5)-(line 419,col 54)",
        "(line 420,col 5)-(line 420,col 52)",
        "(line 421,col 5)-(line 421,col 20)",
        "(line 422,col 5)-(line 422,col 18)",
        "(line 423,col 5)-(line 423,col 17)",
        "(line 424,col 5)-(line 424,col 17)",
        "(line 425,col 5)-(line 425,col 20)",
        "(line 426,col 5)-(line 426,col 23)",
        "(line 427,col 5)-(line 427,col 20)",
        "(line 428,col 5)-(line 428,col 22)",
        "(line 429,col 5)-(line 429,col 22)",
        "(line 430,col 5)-(line 430,col 23)",
        "(line 431,col 5)-(line 431,col 22)",
        "(line 432,col 5)-(line 432,col 24)",
        "(line 433,col 5)-(line 433,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, int, int)",
      "begin_line": 436,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 437,col 20)",
        "(line 438,col 5)-(line 438,col 18)",
        "(line 439,col 5)-(line 439,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, int, int)",
      "begin_line": 442,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 443,col 26)",
        "(line 444,col 5)-(line 444,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, int)",
      "begin_line": 447,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 448,col 5)-(line 448,col 32)",
        "(line 449,col 5)-(line 449,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, int)",
      "begin_line": 452,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 454,col 5)-(line 454,col 37)",
        "(line 455,col 5)-(line 455,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, int)",
      "begin_line": 458,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 43)",
        "(line 461,col 5)-(line 461,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node[], int, int)",
      "begin_line": 464,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 29)",
        "(line 466,col 5)-(line 466,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node[])",
      "begin_line": 469,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 470,col 5)-(line 470,col 25)",
        "(line 471,col 5)-(line 471,col 18)",
        "(line 472,col 5)-(line 492,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newNumber(double)",
      "begin_line": 495,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 496,col 5)-(line 496,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newNumber(double, int, int)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 500,col 5)-(line 500,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newString(java.lang.String)",
      "begin_line": 503,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 504,col 5)-(line 504,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newString(int, java.lang.String)",
      "begin_line": 507,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 508,col 5)-(line 508,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newString(java.lang.String, int, int)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 5)-(line 512,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newString(int, java.lang.String, int, int)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 5)-(line 516,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getType()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 5)-(line 520,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setType(int)",
      "begin_line": 523,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 524,col 5)-(line 524,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.hasChildren()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 528,col 5)-(line 528,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getFirstChild()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 5)-(line 532,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getLastChild()",
      "begin_line": 535,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 5)-(line 536,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getNext()",
      "begin_line": 539,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 5)-(line 540,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getChildBefore(com.google.javascript.rhino.Node)",
      "begin_line": 543,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 544,col 5)-(line 546,col 5)",
        "(line 547,col 5)-(line 547,col 19)",
        "(line 548,col 5)-(line 553,col 5)",
        "(line 554,col 5)-(line 554,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getChildAtIndex(int)",
      "begin_line": 557,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 558,col 5)-(line 558,col 19)",
        "(line 559,col 5)-(line 562,col 5)",
        "(line 563,col 5)-(line 563,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getIndexOfChild(com.google.javascript.rhino.Node)",
      "begin_line": 566,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 567,col 5)-(line 567,col 19)",
        "(line 568,col 5)-(line 568,col 14)",
        "(line 569,col 5)-(line 576,col 5)",
        "(line 577,col 5)-(line 577,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getLastSibling()",
      "begin_line": 580,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 581,col 5)-(line 581,col 18)",
        "(line 582,col 5)-(line 584,col 5)",
        "(line 585,col 5)-(line 585,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildToFront(com.google.javascript.rhino.Node)",
      "begin_line": 588,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 589,col 54)",
        "(line 590,col 5)-(line 590,col 52)",
        "(line 591,col 5)-(line 591,col 24)",
        "(line 592,col 5)-(line 592,col 23)",
        "(line 593,col 5)-(line 593,col 18)",
        "(line 594,col 5)-(line 596,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildToBack(com.google.javascript.rhino.Node)",
      "begin_line": 599,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 600,col 5)-(line 600,col 54)",
        "(line 601,col 5)-(line 601,col 52)",
        "(line 602,col 5)-(line 602,col 24)",
        "(line 603,col 5)-(line 603,col 22)",
        "(line 604,col 5)-(line 607,col 5)",
        "(line 608,col 5)-(line 608,col 22)",
        "(line 609,col 5)-(line 609,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildrenToFront(com.google.javascript.rhino.Node)",
      "begin_line": 612,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 613,col 5)-(line 616,col 5)",
        "(line 617,col 5)-(line 617,col 45)",
        "(line 618,col 5)-(line 618,col 25)",
        "(line 619,col 5)-(line 619,col 21)",
        "(line 620,col 5)-(line 622,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildrenToBack(com.google.javascript.rhino.Node)",
      "begin_line": 625,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 626,col 5)-(line 626,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildBefore(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 632,
      "end_line": 647,
      "comment": "\n   * Add \u0027child\u0027 before \u0027node\u0027.\n   ",
      "child_ranges": [
        "(line 633,col 5)-(line 634,col 69)",
        "(line 635,col 5)-(line 636,col 44)",
        "(line 637,col 5)-(line 638,col 52)",
        "(line 639,col 5)-(line 644,col 5)",
        "(line 645,col 5)-(line 645,col 37)",
        "(line 646,col 5)-(line 646,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 652,
      "end_line": 656,
      "comment": "\n   * Add \u0027child\u0027 after \u0027node\u0027.\n   ",
      "child_ranges": [
        "(line 653,col 5)-(line 654,col 44)",
        "(line 655,col 5)-(line 655,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildrenAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 661,
      "end_line": 685,
      "comment": "\n   * Add all children after \u0027node\u0027.\n   ",
      "child_ranges": [
        "(line 662,col 5)-(line 662,col 69)",
        "(line 663,col 5)-(line 666,col 5)",
        "(line 668,col 5)-(line 668,col 49)",
        "(line 669,col 5)-(line 684,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeChild(com.google.javascript.rhino.Node)",
      "begin_line": 690,
      "end_line": 699,
      "comment": "\n   * Detach a child from its parent and siblings.\n   ",
      "child_ranges": [
        "(line 691,col 5)-(line 691,col 38)",
        "(line 692,col 5)-(line 695,col 31)",
        "(line 696,col 5)-(line 696,col 35)",
        "(line 697,col 5)-(line 697,col 22)",
        "(line 698,col 5)-(line 698,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.replaceChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 704,
      "end_line": 725,
      "comment": "\n   * Detaches child from Node and replaces it with newChild.\n   ",
      "child_ranges": [
        "(line 705,col 5)-(line 706,col 44)",
        "(line 707,col 5)-(line 708,col 52)",
        "(line 711,col 5)-(line 711,col 40)",
        "(line 713,col 5)-(line 713,col 31)",
        "(line 714,col 5)-(line 714,col 27)",
        "(line 715,col 5)-(line 720,col 5)",
        "(line 721,col 5)-(line 722,col 24)",
        "(line 723,col 5)-(line 723,col 22)",
        "(line 724,col 5)-(line 724,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.replaceChildAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 727,
      "end_line": 747,
      "comment": "",
      "child_ranges": [
        "(line 728,col 5)-(line 729,col 43)",
        "(line 731,col 5)-(line 732,col 44)",
        "(line 733,col 5)-(line 734,col 52)",
        "(line 737,col 5)-(line 737,col 44)",
        "(line 739,col 5)-(line 739,col 32)",
        "(line 740,col 5)-(line 740,col 31)",
        "(line 741,col 5)-(line 741,col 27)",
        "(line 742,col 5)-(line 742,col 30)",
        "(line 743,col 5)-(line 744,col 24)",
        "(line 745,col 5)-(line 745,col 22)",
        "(line 746,col 5)-(line 746,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.lookupProperty(int)",
      "begin_line": 749,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 751,col 5)-(line 751,col 34)",
        "(line 752,col 5)-(line 754,col 5)",
        "(line 755,col 5)-(line 755,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.clonePropsFrom(com.google.javascript.rhino.Node)",
      "begin_line": 765,
      "end_line": 770,
      "comment": "\n   * Clone the properties from the provided node without copying\n   * the property object.  The receiving node may not have any\n   * existing properties.\n   * @param other The node to clone properties from.\n   * @return this node.\n   ",
      "child_ranges": [
        "(line 766,col 5)-(line 767,col 41)",
        "(line 768,col 5)-(line 768,col 43)",
        "(line 769,col 5)-(line 769,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeProp(int)",
      "begin_line": 772,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 773,col 5)-(line 773,col 61)",
        "(line 774,col 5)-(line 776,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeProp(com.google.javascript.rhino.Node.PropListItem, int)",
      "begin_line": 785,
      "end_line": 798,
      "comment": "\n   * @param item The item to inspect\n   * @param propType The property to look for\n   * @return The replacement list if the property was removed, or\n   *   \u0027item\u0027 otherwise.\n   ",
      "child_ranges": [
        "(line 786,col 5)-(line 797,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getProp(int)",
      "begin_line": 800,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 801,col 5)-(line 801,col 49)",
        "(line 802,col 5)-(line 804,col 5)",
        "(line 805,col 5)-(line 805,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getBooleanProp(int)",
      "begin_line": 808,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 809,col 5)-(line 809,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getIntProp(int)",
      "begin_line": 816,
      "end_line": 822,
      "comment": "\n   * Returns the integer value for the property, or 0 if the property\n   * is not defined.\n   ",
      "child_ranges": [
        "(line 817,col 5)-(line 817,col 49)",
        "(line 818,col 5)-(line 820,col 5)",
        "(line 821,col 5)-(line 821,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getExistingIntProp(int)",
      "begin_line": 824,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 825,col 5)-(line 825,col 49)",
        "(line 826,col 5)-(line 828,col 5)",
        "(line 829,col 5)-(line 829,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.putProp(int, java.lang.Object)",
      "begin_line": 832,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 833,col 5)-(line 833,col 25)",
        "(line 834,col 5)-(line 836,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.putBooleanProp(int, boolean)",
      "begin_line": 839,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 840,col 5)-(line 840,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.putIntProp(int, int)",
      "begin_line": 843,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 844,col 5)-(line 844,col 25)",
        "(line 845,col 5)-(line 847,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.createProp(int, java.lang.Object, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 850,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 851,col 5)-(line 851,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.createProp(int, int, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 854,
      "end_line": 856,
      "comment": "",
      "child_ranges": [
        "(line 855,col 5)-(line 855,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSortedPropTypes()",
      "begin_line": 859,
      "end_line": 873,
      "comment": " Gets all the property types, in sorted order.",
      "child_ranges": [
        "(line 860,col 5)-(line 860,col 18)",
        "(line 861,col 5)-(line 863,col 5)",
        "(line 865,col 5)-(line 865,col 32)",
        "(line 866,col 5)-(line 869,col 5)",
        "(line 871,col 5)-(line 871,col 22)",
        "(line 872,col 5)-(line 872,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getDouble()",
      "begin_line": 876,
      "end_line": 883,
      "comment": " Can only be called when \u003ctt\u003egetType() \u003d\u003d TokenStream.NUMBER\u003c/tt\u003e ",
      "child_ranges": [
        "(line 877,col 5)-(line 882,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setDouble(double)",
      "begin_line": 886,
      "end_line": 893,
      "comment": " Can only be called when \u003ctt\u003egetType() \u003d\u003d TokenStream.NUMBER\u003c/tt\u003e ",
      "child_ranges": [
        "(line 887,col 5)-(line 892,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getString()",
      "begin_line": 896,
      "end_line": 903,
      "comment": " Can only be called when node has String context. ",
      "child_ranges": [
        "(line 897,col 5)-(line 902,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setString(java.lang.String)",
      "begin_line": 906,
      "end_line": 913,
      "comment": " Can only be called when node has String context. ",
      "child_ranges": [
        "(line 907,col 5)-(line 912,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toString()",
      "begin_line": 915,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 917,col 5)-(line 917,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toString(boolean, boolean, boolean)",
      "begin_line": 920,
      "end_line": 927,
      "comment": "",
      "child_ranges": [
        "(line 924,col 5)-(line 924,col 43)",
        "(line 925,col 5)-(line 925,col 59)",
        "(line 926,col 5)-(line 926,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toString(java.lang.StringBuilder, boolean, boolean, boolean)",
      "begin_line": 929,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 934,col 5)-(line 934,col 32)",
        "(line 935,col 5)-(line 951,col 5)",
        "(line 952,col 5)-(line 958,col 5)",
        "(line 960,col 5)-(line 977,col 5)",
        "(line 979,col 5)-(line 987,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toStringTree()",
      "begin_line": 991,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 992,col 5)-(line 992,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toStringTreeImpl()",
      "begin_line": 995,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 996,col 5)-(line 1002,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.appendStringTree(java.lang.Appendable)",
      "begin_line": 1005,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 1006,col 5)-(line 1006,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toStringTreeHelper(com.google.javascript.rhino.Node, int, java.lang.Appendable)",
      "begin_line": 1009,
      "end_line": 1021,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 5)-(line 1013,col 5)",
        "(line 1014,col 5)-(line 1014,col 28)",
        "(line 1015,col 5)-(line 1015,col 20)",
        "(line 1016,col 5)-(line 1020,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 1023,
      "end_line": 1023,
      "comment": " type of the node; Token.NAME for example"
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1024,
      "end_line": 1024,
      "comment": " next sibling"
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 1025,
      "end_line": 1025,
      "comment": " first element of a linked list of children"
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 1026,
      "end_line": 1026,
      "comment": " last element of a linked list of children"
    },
    {
      "type": "field",
      "varNames": [
        "propListHead"
      ],
      "begin_line": 1034,
      "end_line": 1034,
      "comment": "\n   * Linked list of properties. Since vast majority of nodes would have\n   * no more then 2 properties, linked list saves memory and provides\n   * fast lookup. If this does not holds, propListHead can be replaced\n   * by UintMap.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_BITS"
      ],
      "begin_line": 1044,
      "end_line": 1044,
      "comment": "\n   * COLUMN_BITS represents how many of the lower-order bits of\n   * sourcePosition are reserved for storing the column number.\n   * Bits above these store the line number.\n   * This gives us decent position information for everything except\n   * files already passed through a minimizer, where lines might\n   * be longer than 4096 characters.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_COLUMN_NUMBER"
      ],
      "begin_line": 1051,
      "end_line": 1051,
      "comment": "\n   * MAX_COLUMN_NUMBER represents the maximum column number that can\n   * be represented.  JSCompiler\u0027s modifications to Rhino cause all\n   * tokens located beyond the maximum column to MAX_COLUMN_NUMBER.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_MASK"
      ],
      "begin_line": 1058,
      "end_line": 1058,
      "comment": "\n   * COLUMN_MASK stores a value where bits storing the column number\n   * are set, and bits storing the line are not set.  It\u0027s handy for\n   * separating column number from line number.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourcePosition"
      ],
      "begin_line": 1066,
      "end_line": 1066,
      "comment": "\n   * Source position of this node. The position is encoded with the\n   * column number in the low 12 bits of the integer, and the line\n   * number in the rest.  Create some handy constants so we can change this\n   * size if we want.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "jsType"
      ],
      "begin_line": 1068,
      "end_line": 1068,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1070,
      "end_line": 1070,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setStaticSourceFile(com.google.javascript.rhino.jstype.StaticSourceFile)",
      "begin_line": 1075,
      "end_line": 1077,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 5)-(line 1076,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSourceFileForTesting(java.lang.String)",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": " Sets the source file to a non-extern file of the given name. ",
      "child_ranges": [
        "(line 1081,col 5)-(line 1081,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSourceFileName()",
      "begin_line": 1084,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1085,col 5)-(line 1085,col 50)",
        "(line 1086,col 5)-(line 1086,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getStaticSourceFile()",
      "begin_line": 1090,
      "end_line": 1092,
      "comment": " Returns the source file associated with this input. May be null ",
      "child_ranges": [
        "(line 1091,col 5)-(line 1091,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setInputId(com.google.javascript.rhino.InputId)",
      "begin_line": 1097,
      "end_line": 1099,
      "comment": "\n   * @param inputId\n   ",
      "child_ranges": [
        "(line 1098,col 5)-(line 1098,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getInputId()",
      "begin_line": 1104,
      "end_line": 1106,
      "comment": "\n   * @return The Id of the CompilerInput associated with this Node.\n   ",
      "child_ranges": [
        "(line 1105,col 5)-(line 1105,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isFromExterns()",
      "begin_line": 1108,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1109,col 5)-(line 1109,col 50)",
        "(line 1110,col 5)-(line 1110,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getLength()",
      "begin_line": 1113,
      "end_line": 1115,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 5)-(line 1114,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setLength(int)",
      "begin_line": 1117,
      "end_line": 1119,
      "comment": "",
      "child_ranges": [
        "(line 1118,col 5)-(line 1118,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getLineno()",
      "begin_line": 1121,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1122,col 5)-(line 1122,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getCharno()",
      "begin_line": 1125,
      "end_line": 1127,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 5)-(line 1126,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSourceOffset()",
      "begin_line": 1129,
      "end_line": 1139,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 5)-(line 1130,col 50)",
        "(line 1131,col 5)-(line 1133,col 5)",
        "(line 1134,col 5)-(line 1134,col 29)",
        "(line 1135,col 5)-(line 1137,col 5)",
        "(line 1138,col 5)-(line 1138,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSourcePosition()",
      "begin_line": 1141,
      "end_line": 1143,
      "comment": "",
      "child_ranges": [
        "(line 1142,col 5)-(line 1142,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setLineno(int)",
      "begin_line": 1145,
      "end_line": 1151,
      "comment": "",
      "child_ranges": [
        "(line 1146,col 7)-(line 1146,col 31)",
        "(line 1147,col 7)-(line 1149,col 7)",
        "(line 1150,col 7)-(line 1150,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setCharno(int)",
      "begin_line": 1153,
      "end_line": 1155,
      "comment": "",
      "child_ranges": [
        "(line 1154,col 7)-(line 1154,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSourceEncodedPosition(int)",
      "begin_line": 1157,
      "end_line": 1159,
      "comment": "",
      "child_ranges": [
        "(line 1158,col 5)-(line 1158,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSourceEncodedPositionForTree(int)",
      "begin_line": 1161,
      "end_line": 1168,
      "comment": "",
      "child_ranges": [
        "(line 1162,col 5)-(line 1162,col 41)",
        "(line 1164,col 5)-(line 1167,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.mergeLineCharNo(int, int)",
      "begin_line": 1176,
      "end_line": 1184,
      "comment": "\n   * Merges the line number and character number in one integer. The Character\n   * number takes the first 12 bits and the line number takes the rest. If\n   * the character number is greater than \u003ccode\u003e2\u003csup\u003e12\u003c/sup\u003e-1\u003c/code\u003e it is\n   * adjusted to \u003ccode\u003e2\u003csup\u003e12\u003c/sup\u003e-1\u003c/code\u003e.\n   ",
      "child_ranges": [
        "(line 1177,col 5)-(line 1183,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.extractLineno(int)",
      "begin_line": 1190,
      "end_line": 1196,
      "comment": "\n   * Extracts the line number and character number from a merged line char\n   * number (see {@link #mergeLineCharNo(int, int)}).\n   ",
      "child_ranges": [
        "(line 1191,col 5)-(line 1195,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.extractCharno(int)",
      "begin_line": 1202,
      "end_line": 1208,
      "comment": "\n   * Extracts the character number and character number from a merged line\n   * char number (see {@link #mergeLineCharNo(int, int)}).\n   ",
      "child_ranges": [
        "(line 1203,col 5)-(line 1207,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.children()",
      "begin_line": 1222,
      "end_line": 1228,
      "comment": "\n   * \u003cp\u003eReturn an iterable object that iterates over this node\u0027s children.\n   * The iterator does not support the optional operation\n   * {@link Iterator#remove()}.\u003c/p\u003e\n   *\n   * \u003cp\u003eTo iterate over a node\u0027s siblings, one can write\u003c/p\u003e\n   * \u003cpre\u003eNode n \u003d ...;\n   * for (Node child : n.children()) { ...\u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 1223,col 5)-(line 1227,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.siblings()",
      "begin_line": 1239,
      "end_line": 1241,
      "comment": "\n   * \u003cp\u003eReturn an iterable object that iterates over this node\u0027s siblings.\n   * The iterator does not support the optional operation\n   * {@link Iterator#remove()}.\u003c/p\u003e\n   *\n   * \u003cp\u003eTo iterate over a node\u0027s siblings, one can write\u003c/p\u003e\n   * \u003cpre\u003eNode n \u003d ...;\n   * for (Node sibling : n.siblings()) { ...\u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 1240,col 5)-(line 1240,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SiblingNodeIterable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003ccom.google.javascript.rhino.Node\u003e",
        "java.util.Iterator\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1246,
      "end_line": 1295,
      "comment": "\n   * @see Node#siblings()\n   "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 1248,
      "end_line": 1248,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1249,
      "end_line": 1249,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "used"
      ],
      "begin_line": 1250,
      "end_line": 1250,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.SiblingNodeIterable(com.google.javascript.rhino.Node)",
      "begin_line": 1252,
      "end_line": 1256,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 7)-(line 1253,col 25)",
        "(line 1254,col 7)-(line 1254,col 27)",
        "(line 1255,col 7)-(line 1255,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.iterator()",
      "begin_line": 1258,
      "end_line": 1272,
      "comment": "",
      "child_ranges": [
        "(line 1260,col 7)-(line 1271,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.hasNext()",
      "begin_line": 1274,
      "end_line": 1277,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 7)-(line 1276,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.next()",
      "begin_line": 1279,
      "end_line": 1289,
      "comment": "",
      "child_ranges": [
        "(line 1281,col 7)-(line 1283,col 7)",
        "(line 1284,col 7)-(line 1288,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.remove()",
      "begin_line": 1291,
      "end_line": 1294,
      "comment": "",
      "child_ranges": [
        "(line 1293,col 7)-(line 1293,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getPropListHeadForTesting()",
      "begin_line": 1300,
      "end_line": 1302,
      "comment": "",
      "child_ranges": [
        "(line 1301,col 5)-(line 1301,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getParent()",
      "begin_line": 1304,
      "end_line": 1306,
      "comment": "",
      "child_ranges": [
        "(line 1305,col 5)-(line 1305,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getAncestor(int)",
      "begin_line": 1313,
      "end_line": 1320,
      "comment": "\n   * Gets the ancestor node relative to this.\n   *\n   * @param level 0 \u003d this, 1 \u003d the parent, etc.\n   ",
      "child_ranges": [
        "(line 1314,col 5)-(line 1314,col 44)",
        "(line 1315,col 5)-(line 1315,col 21)",
        "(line 1316,col 5)-(line 1318,col 5)",
        "(line 1319,col 5)-(line 1319,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getAncestors()",
      "begin_line": 1325,
      "end_line": 1327,
      "comment": "\n   * Iterates all of the node\u0027s ancestors excluding itself.\n   ",
      "child_ranges": [
        "(line 1326,col 5)-(line 1326,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AncestorIterable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1332,
      "end_line": 1364,
      "comment": "\n   * Iterator to go up the ancestor tree.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "cur"
      ],
      "begin_line": 1333,
      "end_line": 1333,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.AncestorIterable(com.google.javascript.rhino.Node)",
      "begin_line": 1338,
      "end_line": 1340,
      "comment": "\n     * @param cur The node to start.\n     ",
      "child_ranges": [
        "(line 1339,col 7)-(line 1339,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.iterator()",
      "begin_line": 1342,
      "end_line": 1363,
      "comment": "",
      "child_ranges": [
        "(line 1344,col 7)-(line 1362,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.Anonymous-d2ca0a43-c2ae-4142-ae7f-f2fef106dc4f.hasNext()",
      "begin_line": 1345,
      "end_line": 1348,
      "comment": "",
      "child_ranges": [
        "(line 1347,col 11)-(line 1347,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.Anonymous-7e7bb974-28b6-4cd5-925b-ca6a5f844e41.next()",
      "begin_line": 1350,
      "end_line": 1356,
      "comment": "",
      "child_ranges": [
        "(line 1352,col 11)-(line 1352,col 61)",
        "(line 1353,col 11)-(line 1353,col 23)",
        "(line 1354,col 11)-(line 1354,col 32)",
        "(line 1355,col 11)-(line 1355,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.Anonymous-3f856691-913b-43a8-ab3c-0bd0c9c4cb67.remove()",
      "begin_line": 1358,
      "end_line": 1361,
      "comment": "",
      "child_ranges": [
        "(line 1360,col 11)-(line 1360,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.hasOneChild()",
      "begin_line": 1372,
      "end_line": 1374,
      "comment": "\n   * Check for one child more efficiently than by iterating over all the\n   * children as is done with Node.getChildCount().\n   *\n   * @return Whether the node has exactly one child.\n   ",
      "child_ranges": [
        "(line 1373,col 5)-(line 1373,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.hasMoreThanOneChild()",
      "begin_line": 1382,
      "end_line": 1384,
      "comment": "\n   * Check for more than one child more efficiently than by iterating over all\n   * the children as is done with Node.getChildCount().\n   *\n   * @return Whether the node more than one child.\n   ",
      "child_ranges": [
        "(line 1383,col 5)-(line 1383,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getChildCount()",
      "begin_line": 1386,
      "end_line": 1392,
      "comment": "",
      "child_ranges": [
        "(line 1387,col 5)-(line 1387,col 14)",
        "(line 1388,col 5)-(line 1389,col 10)",
        "(line 1391,col 5)-(line 1391,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.hasChild(com.google.javascript.rhino.Node)",
      "begin_line": 1395,
      "end_line": 1402,
      "comment": " Intended for testing and verification only.",
      "child_ranges": [
        "(line 1396,col 5)-(line 1400,col 5)",
        "(line 1401,col 5)-(line 1401,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.checkTreeEquals(com.google.javascript.rhino.Node)",
      "begin_line": 1408,
      "end_line": 1418,
      "comment": "\n   * Checks if the subtree under this node is the same as another subtree.\n   * Returns null if it\u0027s equal, or a message describing the differences.\n   ",
      "child_ranges": [
        "(line 1409,col 7)-(line 1409,col 53)",
        "(line 1410,col 7)-(line 1416,col 7)",
        "(line 1417,col 7)-(line 1417,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.checkTreeEqualsImpl(com.google.javascript.rhino.Node)",
      "begin_line": 1425,
      "end_line": 1444,
      "comment": "\n   * Compare this node to node2 recursively and return the first pair of nodes\n   * that differs doing a preorder depth-first traversal. Package private for\n   * testing. Returns null if the nodes are equivalent.\n   ",
      "child_ranges": [
        "(line 1426,col 5)-(line 1428,col 5)",
        "(line 1430,col 5)-(line 1430,col 28)",
        "(line 1431,col 5)-(line 1431,col 15)",
        "(line 1432,col 5)-(line 1442,col 5)",
        "(line 1443,col 5)-(line 1443,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.checkTreeTypeAwareEqualsImpl(com.google.javascript.rhino.Node)",
      "begin_line": 1451,
      "end_line": 1468,
      "comment": "\n   * Compare this node to node2 recursively and return the first pair of nodes\n   * that differs doing a preorder depth-first traversal. Package private for\n   * testing. Returns null if the nodes are equivalent.\n   ",
      "child_ranges": [
        "(line 1453,col 5)-(line 1455,col 5)",
        "(line 1457,col 5)-(line 1457,col 28)",
        "(line 1458,col 5)-(line 1458,col 15)",
        "(line 1459,col 5)-(line 1466,col 5)",
        "(line 1467,col 5)-(line 1467,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEquivalentTo(com.google.javascript.rhino.Node)",
      "begin_line": 1471,
      "end_line": 1473,
      "comment": " Returns true if this node is equivalent semantically to another ",
      "child_ranges": [
        "(line 1472,col 5)-(line 1472,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEquivalentToTyped(com.google.javascript.rhino.Node)",
      "begin_line": 1479,
      "end_line": 1481,
      "comment": "\n   * Returns true if this node is equivalent semantically to another and\n   * the types are equivalent.\n   ",
      "child_ranges": [
        "(line 1480,col 5)-(line 1480,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEquivalentTo(com.google.javascript.rhino.Node, boolean, boolean)",
      "begin_line": 1489,
      "end_line": 1538,
      "comment": "\n   * @param compareJsType Whether to compare the JSTypes of the nodes.\n   * @param recurse Whether to compare the children of the current node, if\n   *    not only the the count of the children are compared.\n   * @return Whether this node is equivalent semantically to the provided node.\n   ",
      "child_ranges": [
        "(line 1490,col 5)-(line 1494,col 5)",
        "(line 1496,col 5)-(line 1498,col 5)",
        "(line 1500,col 5)-(line 1524,col 5)",
        "(line 1526,col 5)-(line 1535,col 5)",
        "(line 1537,col 5)-(line 1537,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getQualifiedName()",
      "begin_line": 1548,
      "end_line": 1563,
      "comment": "\n   * This function takes a set of GETPROP nodes and produces a string that is\n   * each property separated by dots. If the node ultimately under the left\n   * sub-tree is not a simple name, this is not a valid qualified name.\n   *\n   * @return a null if this is not a qualified name, or a dot-separated string\n   *         of the name and properties.\n   ",
      "child_ranges": [
        "(line 1549,col 5)-(line 1562,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isQualifiedName()",
      "begin_line": 1569,
      "end_line": 1580,
      "comment": "\n   * Returns whether a node corresponds to a simple or a qualified name, such as\n   * \u003ccode\u003ex\u003c/code\u003e or \u003ccode\u003ea.b.c\u003c/code\u003e or \u003ccode\u003ethis.a\u003c/code\u003e.\n   ",
      "child_ranges": [
        "(line 1570,col 5)-(line 1579,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isUnscopedQualifiedName()",
      "begin_line": 1587,
      "end_line": 1596,
      "comment": "\n   * Returns whether a node corresponds to a simple or a qualified name without\n   * a \"this\" reference, such as \u003ccode\u003ea.b.c\u003c/code\u003e, but not \u003ccode\u003ethis.a\u003c/code\u003e\n   * .\n   ",
      "child_ranges": [
        "(line 1588,col 5)-(line 1595,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.detachFromParent()",
      "begin_line": 1605,
      "end_line": 1609,
      "comment": "\n   * Removes this node from its parent. Equivalent to:\n   * node.getParent().removeChild();\n   ",
      "child_ranges": [
        "(line 1606,col 5)-(line 1606,col 45)",
        "(line 1607,col 5)-(line 1607,col 29)",
        "(line 1608,col 5)-(line 1608,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeFirstChild()",
      "begin_line": 1617,
      "end_line": 1623,
      "comment": "\n   * Removes the first child of Node. Equivalent to:\n   * node.removeChild(node.getFirstChild());\n   *\n   * @return The removed Node.\n   ",
      "child_ranges": [
        "(line 1618,col 5)-(line 1618,col 23)",
        "(line 1619,col 5)-(line 1621,col 5)",
        "(line 1622,col 5)-(line 1622,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeChildren()",
      "begin_line": 1628,
      "end_line": 1636,
      "comment": "\n   * @return A Node that is the head of the list of children.\n   ",
      "child_ranges": [
        "(line 1629,col 5)-(line 1629,col 26)",
        "(line 1630,col 5)-(line 1632,col 5)",
        "(line 1633,col 5)-(line 1633,col 17)",
        "(line 1634,col 5)-(line 1634,col 16)",
        "(line 1635,col 5)-(line 1635,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.detachChildren()",
      "begin_line": 1642,
      "end_line": 1651,
      "comment": "\n   * Removes all children from this node and isolates the children from each\n   * other.\n   ",
      "child_ranges": [
        "(line 1643,col 5)-(line 1648,col 5)",
        "(line 1649,col 5)-(line 1649,col 17)",
        "(line 1650,col 5)-(line 1650,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeChildAfter(com.google.javascript.rhino.Node)",
      "begin_line": 1653,
      "end_line": 1665,
      "comment": "",
      "child_ranges": [
        "(line 1654,col 5)-(line 1655,col 45)",
        "(line 1656,col 5)-(line 1657,col 28)",
        "(line 1659,col 5)-(line 1659,col 27)",
        "(line 1660,col 5)-(line 1660,col 27)",
        "(line 1661,col 5)-(line 1661,col 35)",
        "(line 1662,col 5)-(line 1662,col 22)",
        "(line 1663,col 5)-(line 1663,col 24)",
        "(line 1664,col 5)-(line 1664,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.cloneNode()",
      "begin_line": 1670,
      "end_line": 1684,
      "comment": "\n   * @return A detached clone of the Node, specifically excluding its children.\n   ",
      "child_ranges": [
        "(line 1671,col 5)-(line 1671,col 16)",
        "(line 1672,col 5)-(line 1682,col 5)",
        "(line 1683,col 5)-(line 1683,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.cloneTree()",
      "begin_line": 1689,
      "end_line": 1703,
      "comment": "\n   * @return A detached clone of the Node and all its children.\n   ",
      "child_ranges": [
        "(line 1690,col 5)-(line 1690,col 30)",
        "(line 1691,col 5)-(line 1701,col 5)",
        "(line 1702,col 5)-(line 1702,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.copyInformationFrom(com.google.javascript.rhino.Node)",
      "begin_line": 1712,
      "end_line": 1723,
      "comment": " TODO(nicksantos): The semantics of this method are ill-defined. Delete it.",
      "child_ranges": [
        "(line 1713,col 5)-(line 1715,col 5)",
        "(line 1717,col 5)-(line 1720,col 5)",
        "(line 1722,col 5)-(line 1722,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.copyInformationFromForTree(com.google.javascript.rhino.Node)",
      "begin_line": 1731,
      "end_line": 1739,
      "comment": " TODO(nicksantos): The semantics of this method are ill-defined. Delete it.",
      "child_ranges": [
        "(line 1732,col 5)-(line 1732,col 31)",
        "(line 1733,col 5)-(line 1736,col 5)",
        "(line 1738,col 5)-(line 1738,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.useSourceInfoFrom(com.google.javascript.rhino.Node)",
      "begin_line": 1745,
      "end_line": 1750,
      "comment": "\n   * Overwrite all the source information in this node with\n   * that of {@code other}.\n   ",
      "child_ranges": [
        "(line 1746,col 5)-(line 1746,col 65)",
        "(line 1747,col 5)-(line 1747,col 67)",
        "(line 1748,col 5)-(line 1748,col 42)",
        "(line 1749,col 5)-(line 1749,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.srcref(com.google.javascript.rhino.Node)",
      "begin_line": 1752,
      "end_line": 1754,
      "comment": "",
      "child_ranges": [
        "(line 1753,col 5)-(line 1753,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.useSourceInfoFromForTree(com.google.javascript.rhino.Node)",
      "begin_line": 1760,
      "end_line": 1768,
      "comment": "\n   * Overwrite all the source information in this node and its subtree with\n   * that of {@code other}.\n   ",
      "child_ranges": [
        "(line 1761,col 5)-(line 1761,col 29)",
        "(line 1762,col 5)-(line 1765,col 5)",
        "(line 1767,col 5)-(line 1767,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.srcrefTree(com.google.javascript.rhino.Node)",
      "begin_line": 1770,
      "end_line": 1772,
      "comment": "",
      "child_ranges": [
        "(line 1771,col 5)-(line 1771,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.useSourceInfoIfMissingFrom(com.google.javascript.rhino.Node)",
      "begin_line": 1778,
      "end_line": 1789,
      "comment": "\n   * Overwrite all the source information in this node with\n   * that of {@code other} iff the source info is missing.\n   ",
      "child_ranges": [
        "(line 1779,col 5)-(line 1781,col 5)",
        "(line 1783,col 5)-(line 1786,col 5)",
        "(line 1788,col 5)-(line 1788,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.useSourceInfoIfMissingFromForTree(com.google.javascript.rhino.Node)",
      "begin_line": 1795,
      "end_line": 1803,
      "comment": "\n   * Overwrite all the source information in this node and its subtree with\n   * that of {@code other} iff the source info is missing.\n   ",
      "child_ranges": [
        "(line 1796,col 5)-(line 1796,col 38)",
        "(line 1797,col 5)-(line 1800,col 5)",
        "(line 1802,col 5)-(line 1802,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getJSType()",
      "begin_line": 1808,
      "end_line": 1810,
      "comment": "",
      "child_ranges": [
        "(line 1809,col 7)-(line 1809,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setJSType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1812,
      "end_line": 1814,
      "comment": "",
      "child_ranges": [
        "(line 1813,col 7)-(line 1813,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getJsDocBuilderForNode()",
      "begin_line": 1816,
      "end_line": 1818,
      "comment": "",
      "child_ranges": [
        "(line 1817,col 5)-(line 1817,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FileLevelJsDocBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1828,
      "end_line": 1843,
      "comment": "\n   * An inner class that provides back-door access to the license\n   * property of the JSDocInfo property for this node. This is only\n   * meant to be used for top-level script nodes where the\n   * {@link com.google.javascript.jscomp.parsing.JsDocInfoParser} needs to\n   * be able to append directly to the top-level node, not just the\n   * current node.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.FileLevelJsDocBuilder.append(java.lang.String)",
      "begin_line": 1829,
      "end_line": 1842,
      "comment": "",
      "child_ranges": [
        "(line 1830,col 7)-(line 1830,col 43)",
        "(line 1831,col 7)-(line 1835,col 7)",
        "(line 1836,col 7)-(line 1836,col 46)",
        "(line 1837,col 7)-(line 1839,col 7)",
        "(line 1840,col 7)-(line 1840,col 55)",
        "(line 1841,col 7)-(line 1841,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getJSDocInfo()",
      "begin_line": 1850,
      "end_line": 1852,
      "comment": "\n   * Get the {@link JSDocInfo} attached to this node.\n   * @return the information or {@code null} if no JSDoc is attached to this\n   * node\n   ",
      "child_ranges": [
        "(line 1851,col 5)-(line 1851,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 1857,
      "end_line": 1860,
      "comment": "\n   * Sets the {@link JSDocInfo} attached to this node.\n   ",
      "child_ranges": [
        "(line 1858,col 7)-(line 1858,col 37)",
        "(line 1859,col 7)-(line 1859,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setVarArgs(boolean)",
      "begin_line": 1867,
      "end_line": 1869,
      "comment": "\n   * Sets whether this node is a variable length argument node. This\n   * method is meaningful only on {@link Token#NAME} nodes\n   * used to define a {@link Token#FUNCTION}\u0027s argument list.\n   ",
      "child_ranges": [
        "(line 1868,col 5)-(line 1868,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isVarArgs()",
      "begin_line": 1876,
      "end_line": 1878,
      "comment": "\n   * Returns whether this node is a variable length argument node. This\n   * method\u0027s return value is meaningful only on {@link Token#NAME} nodes\n   * used to define a {@link Token#FUNCTION}\u0027s argument list.\n   ",
      "child_ranges": [
        "(line 1877,col 5)-(line 1877,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setOptionalArg(boolean)",
      "begin_line": 1885,
      "end_line": 1887,
      "comment": "\n   * Sets whether this node is an optional argument node. This\n   * method is meaningful only on {@link Token#NAME} nodes\n   * used to define a {@link Token#FUNCTION}\u0027s argument list.\n   ",
      "child_ranges": [
        "(line 1886,col 5)-(line 1886,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isOptionalArg()",
      "begin_line": 1894,
      "end_line": 1896,
      "comment": "\n   * Returns whether this node is an optional argument node. This\n   * method\u0027s return value is meaningful only on {@link Token#NAME} nodes\n   * used to define a {@link Token#FUNCTION}\u0027s argument list.\n   ",
      "child_ranges": [
        "(line 1895,col 5)-(line 1895,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setIsSyntheticBlock(boolean)",
      "begin_line": 1902,
      "end_line": 1904,
      "comment": "\n   * Sets whether this is a synthetic block that should not be considered\n   * a real source block.\n   ",
      "child_ranges": [
        "(line 1903,col 5)-(line 1903,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isSyntheticBlock()",
      "begin_line": 1910,
      "end_line": 1912,
      "comment": "\n   * Returns whether this is a synthetic block that should not be considered\n   * a real source block.\n   ",
      "child_ranges": [
        "(line 1911,col 5)-(line 1911,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setDirectives(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1917,
      "end_line": 1919,
      "comment": "\n   * Sets the ES5 directives on this node.\n   ",
      "child_ranges": [
        "(line 1918,col 5)-(line 1918,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getDirectives()",
      "begin_line": 1924,
      "end_line": 1927,
      "comment": "\n   * Returns the set of ES5 directives for this node.\n   ",
      "child_ranges": [
        "(line 1926,col 5)-(line 1926,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addSuppression(java.lang.String)",
      "begin_line": 1933,
      "end_line": 1938,
      "comment": "\n   * Adds a warning to be suppressed. This is indistinguishable\n   * from having a {@code @suppress} tag in the code.\n   ",
      "child_ranges": [
        "(line 1934,col 5)-(line 1936,col 5)",
        "(line 1937,col 5)-(line 1937,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setWasEmptyNode(boolean)",
      "begin_line": 1944,
      "end_line": 1946,
      "comment": "\n   * Sets whether this is a synthetic block that should not be considered\n   * a real source block.\n   ",
      "child_ranges": [
        "(line 1945,col 5)-(line 1945,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.wasEmptyNode()",
      "begin_line": 1952,
      "end_line": 1954,
      "comment": "\n   * Returns whether this is a synthetic block that should not be considered\n   * a real source block.\n   ",
      "child_ranges": [
        "(line 1953,col 5)-(line 1953,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_GLOBAL_STATE_UNMODIFIED"
      ],
      "begin_line": 1965,
      "end_line": 1965,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_THIS_UNMODIFIED"
      ],
      "begin_line": 1966,
      "end_line": 1966,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_ARGUMENTS_UNMODIFIED"
      ],
      "begin_line": 1967,
      "end_line": 1967,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_NO_THROWS"
      ],
      "begin_line": 1968,
      "end_line": 1968,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_LOCAL_RESULTS"
      ],
      "begin_line": 1969,
      "end_line": 1969,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIDE_EFFECTS_FLAGS_MASK"
      ],
      "begin_line": 1971,
      "end_line": 1971,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIDE_EFFECTS_ALL"
      ],
      "begin_line": 1973,
      "end_line": 1973,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_SIDE_EFFECTS"
      ],
      "begin_line": 1974,
      "end_line": 1978,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSideEffectFlags(int)",
      "begin_line": 1985,
      "end_line": 1992,
      "comment": "\n   * Marks this function or constructor call\u0027s side effect flags.\n   * This property is only meaningful for {@link Token#CALL} and\n   * {@link Token#NEW} nodes.\n   ",
      "child_ranges": [
        "(line 1986,col 5)-(line 1989,col 30)",
        "(line 1991,col 5)-(line 1991,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSideEffectFlags(com.google.javascript.rhino.Node.SideEffectFlags)",
      "begin_line": 1994,
      "end_line": 1996,
      "comment": "",
      "child_ranges": [
        "(line 1995,col 5)-(line 1995,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSideEffectFlags()",
      "begin_line": 2001,
      "end_line": 2003,
      "comment": "\n   * Returns the side effects flags for this node.\n   ",
      "child_ranges": [
        "(line 2002,col 5)-(line 2002,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SideEffectFlags",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 2009,
      "end_line": 2071,
      "comment": "\n   * A helper class for getting and setting the side-effect flags.\n   * @author johnlenz@google.com (John Lenz)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 2010,
      "end_line": 2010,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.SideEffectFlags()",
      "begin_line": 2012,
      "end_line": 2013,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.SideEffectFlags(int)",
      "begin_line": 2015,
      "end_line": 2017,
      "comment": "",
      "child_ranges": [
        "(line 2016,col 7)-(line 2016,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.valueOf()",
      "begin_line": 2019,
      "end_line": 2021,
      "comment": "",
      "child_ranges": [
        "(line 2020,col 7)-(line 2020,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setAllFlags()",
      "begin_line": 2024,
      "end_line": 2026,
      "comment": " All side-effect occur and the returned results are non-local. ",
      "child_ranges": [
        "(line 2025,col 7)-(line 2025,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.clearAllFlags()",
      "begin_line": 2029,
      "end_line": 2031,
      "comment": " No side-effects occur and the returned results are local. ",
      "child_ranges": [
        "(line 2030,col 7)-(line 2030,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.areAllFlagsSet()",
      "begin_line": 2033,
      "end_line": 2035,
      "comment": "",
      "child_ranges": [
        "(line 2034,col 7)-(line 2034,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.clearSideEffectFlags()",
      "begin_line": 2041,
      "end_line": 2043,
      "comment": "\n     * Preserve the return result flag, but clear the others:\n     *   no global state change, no throws, no this change, no arguments change\n     ",
      "child_ranges": [
        "(line 2042,col 7)-(line 2042,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setMutatesGlobalState()",
      "begin_line": 2045,
      "end_line": 2050,
      "comment": "",
      "child_ranges": [
        "(line 2047,col 7)-(line 2047,col 52)",
        "(line 2048,col 7)-(line 2048,col 49)",
        "(line 2049,col 7)-(line 2049,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setThrows()",
      "begin_line": 2052,
      "end_line": 2054,
      "comment": "",
      "child_ranges": [
        "(line 2053,col 7)-(line 2053,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setMutatesThis()",
      "begin_line": 2056,
      "end_line": 2058,
      "comment": "",
      "child_ranges": [
        "(line 2057,col 7)-(line 2057,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setMutatesArguments()",
      "begin_line": 2060,
      "end_line": 2062,
      "comment": "",
      "child_ranges": [
        "(line 2061,col 7)-(line 2061,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setReturnsTainted()",
      "begin_line": 2064,
      "end_line": 2066,
      "comment": "",
      "child_ranges": [
        "(line 2065,col 7)-(line 2065,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.removeFlag(int)",
      "begin_line": 2068,
      "end_line": 2070,
      "comment": "",
      "child_ranges": [
        "(line 2069,col 7)-(line 2069,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isOnlyModifiesThisCall()",
      "begin_line": 2076,
      "end_line": 2082,
      "comment": "\n   * @return Whether the only side-effect is \"modifies this\"\n   ",
      "child_ranges": [
        "(line 2077,col 5)-(line 2081,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNoSideEffectsCall()",
      "begin_line": 2088,
      "end_line": 2090,
      "comment": "\n   * Returns true if this node is a function or constructor call that\n   * has no side effects.\n   ",
      "child_ranges": [
        "(line 2089,col 5)-(line 2089,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isLocalResultCall()",
      "begin_line": 2097,
      "end_line": 2099,
      "comment": "\n   * Returns true if this node is a function or constructor call that\n   * returns a primitive or a local object (an object that has no other\n   * references).\n   ",
      "child_ranges": [
        "(line 2098,col 5)-(line 2098,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.areBitFlagsSet(int, int)",
      "begin_line": 2104,
      "end_line": 2106,
      "comment": "\n   * returns true if all the flags are set in value.\n   ",
      "child_ranges": [
        "(line 2105,col 5)-(line 2105,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isQuotedString()",
      "begin_line": 2111,
      "end_line": 2113,
      "comment": "\n   * This should only be called for STRING nodes children of OBJECTLIT.\n   ",
      "child_ranges": [
        "(line 2112,col 5)-(line 2112,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setQuotedString()",
      "begin_line": 2118,
      "end_line": 2120,
      "comment": "\n   * This should only be called for STRING nodes children of OBJECTLIT.\n   ",
      "child_ranges": [
        "(line 2119,col 5)-(line 2119,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeMismatch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 2122,
      "end_line": 2144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeA"
      ],
      "begin_line": 2123,
      "end_line": 2123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeB"
      ],
      "begin_line": 2124,
      "end_line": 2124,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.NodeMismatch.NodeMismatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2126,
      "end_line": 2129,
      "comment": "",
      "child_ranges": [
        "(line 2127,col 7)-(line 2127,col 25)",
        "(line 2128,col 7)-(line 2128,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NodeMismatch.equals(java.lang.Object)",
      "begin_line": 2131,
      "end_line": 2138,
      "comment": "",
      "child_ranges": [
        "(line 2133,col 7)-(line 2136,col 7)",
        "(line 2137,col 7)-(line 2137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NodeMismatch.hashCode()",
      "begin_line": 2140,
      "end_line": 2143,
      "comment": "",
      "child_ranges": [
        "(line 2142,col 7)-(line 2142,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isAdd()",
      "begin_line": 2149,
      "end_line": 2151,
      "comment": "",
      "child_ranges": [
        "(line 2150,col 5)-(line 2150,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isAnd()",
      "begin_line": 2153,
      "end_line": 2155,
      "comment": "",
      "child_ranges": [
        "(line 2154,col 5)-(line 2154,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isArrayLit()",
      "begin_line": 2157,
      "end_line": 2159,
      "comment": "",
      "child_ranges": [
        "(line 2158,col 5)-(line 2158,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isAssign()",
      "begin_line": 2161,
      "end_line": 2163,
      "comment": "",
      "child_ranges": [
        "(line 2162,col 5)-(line 2162,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isAssignAdd()",
      "begin_line": 2165,
      "end_line": 2167,
      "comment": "",
      "child_ranges": [
        "(line 2166,col 5)-(line 2166,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isBlock()",
      "begin_line": 2169,
      "end_line": 2171,
      "comment": "",
      "child_ranges": [
        "(line 2170,col 5)-(line 2170,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isBreak()",
      "begin_line": 2173,
      "end_line": 2175,
      "comment": "",
      "child_ranges": [
        "(line 2174,col 5)-(line 2174,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isCall()",
      "begin_line": 2177,
      "end_line": 2179,
      "comment": "",
      "child_ranges": [
        "(line 2178,col 5)-(line 2178,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isCase()",
      "begin_line": 2181,
      "end_line": 2183,
      "comment": "",
      "child_ranges": [
        "(line 2182,col 5)-(line 2182,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isCast()",
      "begin_line": 2185,
      "end_line": 2187,
      "comment": "",
      "child_ranges": [
        "(line 2186,col 5)-(line 2186,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isCatch()",
      "begin_line": 2189,
      "end_line": 2191,
      "comment": "",
      "child_ranges": [
        "(line 2190,col 5)-(line 2190,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isComma()",
      "begin_line": 2193,
      "end_line": 2195,
      "comment": "",
      "child_ranges": [
        "(line 2194,col 5)-(line 2194,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isContinue()",
      "begin_line": 2197,
      "end_line": 2199,
      "comment": "",
      "child_ranges": [
        "(line 2198,col 5)-(line 2198,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDebugger()",
      "begin_line": 2201,
      "end_line": 2203,
      "comment": "",
      "child_ranges": [
        "(line 2202,col 5)-(line 2202,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDec()",
      "begin_line": 2205,
      "end_line": 2207,
      "comment": "",
      "child_ranges": [
        "(line 2206,col 5)-(line 2206,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDefaultCase()",
      "begin_line": 2209,
      "end_line": 2211,
      "comment": "",
      "child_ranges": [
        "(line 2210,col 5)-(line 2210,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDelProp()",
      "begin_line": 2213,
      "end_line": 2215,
      "comment": "",
      "child_ranges": [
        "(line 2214,col 5)-(line 2214,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDo()",
      "begin_line": 2217,
      "end_line": 2219,
      "comment": "",
      "child_ranges": [
        "(line 2218,col 5)-(line 2218,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEmpty()",
      "begin_line": 2221,
      "end_line": 2223,
      "comment": "",
      "child_ranges": [
        "(line 2222,col 5)-(line 2222,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isExprResult()",
      "begin_line": 2225,
      "end_line": 2227,
      "comment": "",
      "child_ranges": [
        "(line 2226,col 5)-(line 2226,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isFalse()",
      "begin_line": 2229,
      "end_line": 2231,
      "comment": "",
      "child_ranges": [
        "(line 2230,col 5)-(line 2230,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isFor()",
      "begin_line": 2233,
      "end_line": 2235,
      "comment": "",
      "child_ranges": [
        "(line 2234,col 5)-(line 2234,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isFunction()",
      "begin_line": 2237,
      "end_line": 2239,
      "comment": "",
      "child_ranges": [
        "(line 2238,col 5)-(line 2238,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isGetterDef()",
      "begin_line": 2241,
      "end_line": 2243,
      "comment": "",
      "child_ranges": [
        "(line 2242,col 5)-(line 2242,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isGetElem()",
      "begin_line": 2245,
      "end_line": 2247,
      "comment": "",
      "child_ranges": [
        "(line 2246,col 5)-(line 2246,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isGetProp()",
      "begin_line": 2249,
      "end_line": 2251,
      "comment": "",
      "child_ranges": [
        "(line 2250,col 5)-(line 2250,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isHook()",
      "begin_line": 2253,
      "end_line": 2255,
      "comment": "",
      "child_ranges": [
        "(line 2254,col 5)-(line 2254,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isIf()",
      "begin_line": 2257,
      "end_line": 2259,
      "comment": "",
      "child_ranges": [
        "(line 2258,col 5)-(line 2258,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isIn()",
      "begin_line": 2261,
      "end_line": 2263,
      "comment": "",
      "child_ranges": [
        "(line 2262,col 5)-(line 2262,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isInc()",
      "begin_line": 2265,
      "end_line": 2267,
      "comment": "",
      "child_ranges": [
        "(line 2266,col 5)-(line 2266,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isInstanceOf()",
      "begin_line": 2269,
      "end_line": 2271,
      "comment": "",
      "child_ranges": [
        "(line 2270,col 5)-(line 2270,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isLabel()",
      "begin_line": 2273,
      "end_line": 2275,
      "comment": "",
      "child_ranges": [
        "(line 2274,col 5)-(line 2274,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isLabelName()",
      "begin_line": 2277,
      "end_line": 2279,
      "comment": "",
      "child_ranges": [
        "(line 2278,col 5)-(line 2278,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isName()",
      "begin_line": 2281,
      "end_line": 2283,
      "comment": "",
      "child_ranges": [
        "(line 2282,col 5)-(line 2282,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNE()",
      "begin_line": 2285,
      "end_line": 2287,
      "comment": "",
      "child_ranges": [
        "(line 2286,col 5)-(line 2286,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNew()",
      "begin_line": 2289,
      "end_line": 2291,
      "comment": "",
      "child_ranges": [
        "(line 2290,col 5)-(line 2290,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNot()",
      "begin_line": 2293,
      "end_line": 2295,
      "comment": "",
      "child_ranges": [
        "(line 2294,col 5)-(line 2294,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNull()",
      "begin_line": 2297,
      "end_line": 2299,
      "comment": "",
      "child_ranges": [
        "(line 2298,col 5)-(line 2298,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNumber()",
      "begin_line": 2301,
      "end_line": 2303,
      "comment": "",
      "child_ranges": [
        "(line 2302,col 5)-(line 2302,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isObjectLit()",
      "begin_line": 2305,
      "end_line": 2307,
      "comment": "",
      "child_ranges": [
        "(line 2306,col 5)-(line 2306,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isOr()",
      "begin_line": 2309,
      "end_line": 2311,
      "comment": "",
      "child_ranges": [
        "(line 2310,col 5)-(line 2310,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isParamList()",
      "begin_line": 2313,
      "end_line": 2315,
      "comment": "",
      "child_ranges": [
        "(line 2314,col 5)-(line 2314,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isRegExp()",
      "begin_line": 2317,
      "end_line": 2319,
      "comment": "",
      "child_ranges": [
        "(line 2318,col 5)-(line 2318,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isReturn()",
      "begin_line": 2321,
      "end_line": 2323,
      "comment": "",
      "child_ranges": [
        "(line 2322,col 5)-(line 2322,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isScript()",
      "begin_line": 2325,
      "end_line": 2327,
      "comment": "",
      "child_ranges": [
        "(line 2326,col 5)-(line 2326,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isSetterDef()",
      "begin_line": 2329,
      "end_line": 2331,
      "comment": "",
      "child_ranges": [
        "(line 2330,col 5)-(line 2330,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isString()",
      "begin_line": 2333,
      "end_line": 2335,
      "comment": "",
      "child_ranges": [
        "(line 2334,col 5)-(line 2334,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isStringKey()",
      "begin_line": 2337,
      "end_line": 2339,
      "comment": "",
      "child_ranges": [
        "(line 2338,col 5)-(line 2338,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isSwitch()",
      "begin_line": 2341,
      "end_line": 2343,
      "comment": "",
      "child_ranges": [
        "(line 2342,col 5)-(line 2342,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isThis()",
      "begin_line": 2345,
      "end_line": 2347,
      "comment": "",
      "child_ranges": [
        "(line 2346,col 5)-(line 2346,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isThrow()",
      "begin_line": 2349,
      "end_line": 2351,
      "comment": "",
      "child_ranges": [
        "(line 2350,col 5)-(line 2350,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isTrue()",
      "begin_line": 2353,
      "end_line": 2355,
      "comment": "",
      "child_ranges": [
        "(line 2354,col 5)-(line 2354,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isTry()",
      "begin_line": 2357,
      "end_line": 2359,
      "comment": "",
      "child_ranges": [
        "(line 2358,col 5)-(line 2358,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isTypeOf()",
      "begin_line": 2361,
      "end_line": 2363,
      "comment": "",
      "child_ranges": [
        "(line 2362,col 5)-(line 2362,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isVar()",
      "begin_line": 2365,
      "end_line": 2367,
      "comment": "",
      "child_ranges": [
        "(line 2366,col 5)-(line 2366,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isVoid()",
      "begin_line": 2369,
      "end_line": 2371,
      "comment": "",
      "child_ranges": [
        "(line 2370,col 5)-(line 2370,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isWhile()",
      "begin_line": 2373,
      "end_line": 2375,
      "comment": "",
      "child_ranges": [
        "(line 2374,col 5)-(line 2374,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isWith()",
      "begin_line": 2377,
      "end_line": 2379,
      "comment": "",
      "child_ranges": [
        "(line 2378,col 5)-(line 2378,col 40)"
      ]
    }
  ]
}