{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/Node.java",
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
      "end_line": 2448,
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
        "CHANGE_TIME",
        "REFLECTED_OBJECT",
        "LAST_PROP"
      ],
      "begin_line": 67,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DECR_FLAG",
        "POST_FLAG"
      ],
      "begin_line": 109,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.propToString(int)",
      "begin_line": 113,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 114,col 7)-(line 143,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumberNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.Node"
      ],
      "begin_line": 146,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.NumberNode.NumberNode(double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 151,col 7)-(line 151,col 26)",
        "(line 152,col 7)-(line 152,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.NumberNode.NumberNode(double, int, int)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 7)-(line 156,col 42)",
        "(line 157,col 7)-(line 157,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NumberNode.getDouble()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 162,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NumberNode.setDouble(double)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 7)-(line 167,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NumberNode.isEquivalentTo(com.google.javascript.rhino.Node, boolean, boolean, boolean)",
      "begin_line": 170,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 173,col 7)-(line 173,col 80)",
        "(line 174,col 7)-(line 181,col 7)",
        "(line 182,col 7)-(line 182,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "number"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "StringNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.Node"
      ],
      "begin_line": 188,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.StringNode.StringNode(int, java.lang.String)",
      "begin_line": 192,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 193,col 7)-(line 193,col 18)",
        "(line 194,col 7)-(line 196,col 7)",
        "(line 197,col 7)-(line 197,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.StringNode.StringNode(int, java.lang.String, int, int)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 201,col 7)-(line 201,col 34)",
        "(line 202,col 7)-(line 204,col 7)",
        "(line 205,col 7)-(line 205,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.getString()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * returns the string content.\n     * @return non null.\n     ",
      "child_ranges": [
        "(line 214,col 7)-(line 214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.setString(java.lang.String)",
      "begin_line": 221,
      "end_line": 227,
      "comment": "\n     * sets the string content.\n     * @param str the new value.  Non null.\n     ",
      "child_ranges": [
        "(line 223,col 7)-(line 225,col 7)",
        "(line 226,col 7)-(line 226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.isEquivalentTo(com.google.javascript.rhino.Node, boolean, boolean, boolean)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 232,col 7)-(line 233,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.isQuotedString()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * If the property is not defined, this was not a quoted key.  The\n     * QUOTED_PROP int property is only assigned to STRING tokens used as\n     * object lit keys.\n     * @return true if this was a quoted string key in an object literal.\n     ",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.StringNode.setQuotedString()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * This should only be called for STRING nodes created in object lits.\n     ",
      "child_ranges": [
        "(line 252,col 7)-(line 252,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "str"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PropListItem",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 259,
      "end_line": 265,
      "comment": " PropListItems must be immutable so that they can be shared."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.getType()",
      "begin_line": 260,
      "end_line": 260,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.getNext()",
      "begin_line": 261,
      "end_line": 261,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.chain(com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 262,
      "end_line": 262,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.getObjectValue()",
      "begin_line": 263,
      "end_line": 263,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.PropListItem.getIntValue()",
      "begin_line": 264,
      "end_line": 264,
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
      "begin_line": 267,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propType"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.AbstractPropListItem.AbstractPropListItem(int, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 275,col 7)-(line 275,col 31)",
        "(line 276,col 7)-(line 276,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AbstractPropListItem.getType()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 7)-(line 281,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AbstractPropListItem.getNext()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 7)-(line 286,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AbstractPropListItem.chain(com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 289,
      "end_line": 290,
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
      "begin_line": 294,
      "end_line": 324,
      "comment": " A base class for Object storing props"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "objectValue"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.ObjectPropListItem(int, java.lang.Object, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 301,col 7)-(line 301,col 28)",
        "(line 302,col 7)-(line 302,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.getIntValue()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 7)-(line 307,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.getObjectValue()",
      "begin_line": 310,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 7)-(line 312,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.toString()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 317,col 7)-(line 317,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.ObjectPropListItem.chain(com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 320,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 7)-(line 322,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IntPropListItem",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.Node.AbstractPropListItem"
      ],
      "begin_line": 327,
      "end_line": 356,
      "comment": " A base class for int storing props"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "intValue"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.IntPropListItem(int, int, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 332,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 333,col 7)-(line 333,col 28)",
        "(line 334,col 7)-(line 334,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.getIntValue()",
      "begin_line": 337,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 7)-(line 339,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.getObjectValue()",
      "begin_line": 342,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 344,col 7)-(line 344,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.toString()",
      "begin_line": 347,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 349,col 7)-(line 349,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.IntPropListItem.chain(com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 352,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 7)-(line 354,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int)",
      "begin_line": 358,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 20)",
        "(line 360,col 5)-(line 360,col 18)",
        "(line 361,col 5)-(line 361,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node)",
      "begin_line": 364,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 366,col 41)",
        "(line 367,col 5)-(line 368,col 42)",
        "(line 370,col 5)-(line 370,col 20)",
        "(line 371,col 5)-(line 371,col 18)",
        "(line 372,col 5)-(line 372,col 25)",
        "(line 373,col 5)-(line 373,col 22)",
        "(line 374,col 5)-(line 374,col 24)",
        "(line 375,col 5)-(line 375,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 378,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 379,col 5)-(line 380,col 47)",
        "(line 381,col 5)-(line 382,col 48)",
        "(line 383,col 5)-(line 384,col 48)",
        "(line 385,col 5)-(line 386,col 49)",
        "(line 387,col 5)-(line 387,col 20)",
        "(line 388,col 5)-(line 388,col 18)",
        "(line 389,col 5)-(line 389,col 17)",
        "(line 390,col 5)-(line 390,col 17)",
        "(line 391,col 5)-(line 391,col 22)",
        "(line 392,col 5)-(line 392,col 23)",
        "(line 393,col 5)-(line 393,col 22)",
        "(line 394,col 5)-(line 394,col 24)",
        "(line 395,col 5)-(line 395,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 398,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 399,col 5)-(line 399,col 53)",
        "(line 400,col 5)-(line 400,col 51)",
        "(line 401,col 5)-(line 401,col 52)",
        "(line 402,col 5)-(line 402,col 50)",
        "(line 403,col 5)-(line 403,col 54)",
        "(line 404,col 5)-(line 404,col 52)",
        "(line 405,col 5)-(line 405,col 20)",
        "(line 406,col 5)-(line 406,col 18)",
        "(line 407,col 5)-(line 407,col 17)",
        "(line 408,col 5)-(line 408,col 17)",
        "(line 409,col 5)-(line 409,col 20)",
        "(line 410,col 5)-(line 410,col 23)",
        "(line 411,col 5)-(line 411,col 21)",
        "(line 412,col 5)-(line 412,col 22)",
        "(line 413,col 5)-(line 413,col 22)",
        "(line 414,col 5)-(line 414,col 24)",
        "(line 415,col 5)-(line 415,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 418,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 53)",
        "(line 420,col 5)-(line 420,col 51)",
        "(line 421,col 5)-(line 421,col 52)",
        "(line 422,col 5)-(line 422,col 50)",
        "(line 423,col 5)-(line 423,col 53)",
        "(line 424,col 5)-(line 424,col 51)",
        "(line 425,col 5)-(line 425,col 54)",
        "(line 426,col 5)-(line 426,col 52)",
        "(line 427,col 5)-(line 427,col 20)",
        "(line 428,col 5)-(line 428,col 18)",
        "(line 429,col 5)-(line 429,col 17)",
        "(line 430,col 5)-(line 430,col 17)",
        "(line 431,col 5)-(line 431,col 20)",
        "(line 432,col 5)-(line 432,col 23)",
        "(line 433,col 5)-(line 433,col 20)",
        "(line 434,col 5)-(line 434,col 22)",
        "(line 435,col 5)-(line 435,col 22)",
        "(line 436,col 5)-(line 436,col 23)",
        "(line 437,col 5)-(line 437,col 22)",
        "(line 438,col 5)-(line 438,col 24)",
        "(line 439,col 5)-(line 439,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, int, int)",
      "begin_line": 442,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 443,col 20)",
        "(line 444,col 5)-(line 444,col 18)",
        "(line 445,col 5)-(line 445,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, int, int)",
      "begin_line": 448,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 449,col 5)-(line 449,col 26)",
        "(line 450,col 5)-(line 450,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, int)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 454,col 5)-(line 454,col 32)",
        "(line 455,col 5)-(line 455,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, int)",
      "begin_line": 458,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 37)",
        "(line 461,col 5)-(line 461,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, int)",
      "begin_line": 464,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 466,col 5)-(line 466,col 43)",
        "(line 467,col 5)-(line 467,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node[], int, int)",
      "begin_line": 470,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 471,col 5)-(line 471,col 29)",
        "(line 472,col 5)-(line 472,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.Node(int, com.google.javascript.rhino.Node[])",
      "begin_line": 475,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 476,col 5)-(line 476,col 25)",
        "(line 477,col 5)-(line 477,col 18)",
        "(line 478,col 5)-(line 498,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newNumber(double)",
      "begin_line": 501,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 502,col 5)-(line 502,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newNumber(double, int, int)",
      "begin_line": 505,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 506,col 5)-(line 506,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newString(java.lang.String)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 510,col 5)-(line 510,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newString(int, java.lang.String)",
      "begin_line": 513,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 514,col 5)-(line 514,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newString(java.lang.String, int, int)",
      "begin_line": 517,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 518,col 5)-(line 518,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.newString(int, java.lang.String, int, int)",
      "begin_line": 521,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getType()",
      "begin_line": 525,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 526,col 5)-(line 526,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setType(int)",
      "begin_line": 529,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 530,col 5)-(line 530,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.hasChildren()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 5)-(line 534,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getFirstChild()",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getLastChild()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 5)-(line 542,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getNext()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 5)-(line 546,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getChildBefore(com.google.javascript.rhino.Node)",
      "begin_line": 549,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 550,col 5)-(line 552,col 5)",
        "(line 553,col 5)-(line 553,col 19)",
        "(line 554,col 5)-(line 559,col 5)",
        "(line 560,col 5)-(line 560,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getChildAtIndex(int)",
      "begin_line": 563,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 564,col 5)-(line 564,col 19)",
        "(line 565,col 5)-(line 568,col 5)",
        "(line 569,col 5)-(line 569,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getIndexOfChild(com.google.javascript.rhino.Node)",
      "begin_line": 572,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 573,col 5)-(line 573,col 19)",
        "(line 574,col 5)-(line 574,col 14)",
        "(line 575,col 5)-(line 582,col 5)",
        "(line 583,col 5)-(line 583,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getLastSibling()",
      "begin_line": 586,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 587,col 5)-(line 587,col 18)",
        "(line 588,col 5)-(line 590,col 5)",
        "(line 591,col 5)-(line 591,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildToFront(com.google.javascript.rhino.Node)",
      "begin_line": 594,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 595,col 5)-(line 595,col 54)",
        "(line 596,col 5)-(line 596,col 52)",
        "(line 597,col 5)-(line 597,col 24)",
        "(line 598,col 5)-(line 598,col 23)",
        "(line 599,col 5)-(line 599,col 18)",
        "(line 600,col 5)-(line 602,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildToBack(com.google.javascript.rhino.Node)",
      "begin_line": 605,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 606,col 5)-(line 606,col 54)",
        "(line 607,col 5)-(line 607,col 52)",
        "(line 608,col 5)-(line 608,col 24)",
        "(line 609,col 5)-(line 609,col 22)",
        "(line 610,col 5)-(line 613,col 5)",
        "(line 614,col 5)-(line 614,col 22)",
        "(line 615,col 5)-(line 615,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildrenToFront(com.google.javascript.rhino.Node)",
      "begin_line": 618,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 619,col 5)-(line 622,col 5)",
        "(line 623,col 5)-(line 623,col 45)",
        "(line 624,col 5)-(line 624,col 25)",
        "(line 625,col 5)-(line 625,col 21)",
        "(line 626,col 5)-(line 628,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildrenToBack(com.google.javascript.rhino.Node)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 632,col 5)-(line 632,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildBefore(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 638,
      "end_line": 653,
      "comment": "\n   * Add \u0027child\u0027 before \u0027node\u0027.\n   ",
      "child_ranges": [
        "(line 639,col 5)-(line 640,col 69)",
        "(line 641,col 5)-(line 642,col 44)",
        "(line 643,col 5)-(line 644,col 52)",
        "(line 645,col 5)-(line 650,col 5)",
        "(line 651,col 5)-(line 651,col 37)",
        "(line 652,col 5)-(line 652,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 658,
      "end_line": 662,
      "comment": "\n   * Add \u0027child\u0027 after \u0027node\u0027.\n   ",
      "child_ranges": [
        "(line 659,col 5)-(line 660,col 44)",
        "(line 661,col 5)-(line 661,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addChildrenAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 667,
      "end_line": 691,
      "comment": "\n   * Add all children after \u0027node\u0027.\n   ",
      "child_ranges": [
        "(line 668,col 5)-(line 668,col 69)",
        "(line 669,col 5)-(line 672,col 5)",
        "(line 674,col 5)-(line 674,col 49)",
        "(line 675,col 5)-(line 690,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeChild(com.google.javascript.rhino.Node)",
      "begin_line": 696,
      "end_line": 708,
      "comment": "\n   * Detach a child from its parent and siblings.\n   ",
      "child_ranges": [
        "(line 697,col 5)-(line 697,col 38)",
        "(line 698,col 5)-(line 702,col 5)",
        "(line 703,col 5)-(line 705,col 5)",
        "(line 706,col 5)-(line 706,col 22)",
        "(line 707,col 5)-(line 707,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.replaceChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 713,
      "end_line": 735,
      "comment": "\n   * Detaches child from Node and replaces it with newChild.\n   ",
      "child_ranges": [
        "(line 714,col 5)-(line 715,col 44)",
        "(line 716,col 5)-(line 717,col 52)",
        "(line 720,col 5)-(line 720,col 40)",
        "(line 722,col 5)-(line 722,col 31)",
        "(line 723,col 5)-(line 723,col 27)",
        "(line 724,col 5)-(line 729,col 5)",
        "(line 730,col 5)-(line 732,col 5)",
        "(line 733,col 5)-(line 733,col 22)",
        "(line 734,col 5)-(line 734,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.replaceChildAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 737,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 738,col 5)-(line 739,col 43)",
        "(line 741,col 5)-(line 742,col 44)",
        "(line 743,col 5)-(line 744,col 52)",
        "(line 747,col 5)-(line 747,col 44)",
        "(line 749,col 5)-(line 749,col 32)",
        "(line 750,col 5)-(line 750,col 31)",
        "(line 751,col 5)-(line 751,col 27)",
        "(line 752,col 5)-(line 752,col 30)",
        "(line 753,col 5)-(line 755,col 5)",
        "(line 756,col 5)-(line 756,col 22)",
        "(line 757,col 5)-(line 757,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.lookupProperty(int)",
      "begin_line": 760,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 762,col 5)-(line 762,col 34)",
        "(line 763,col 5)-(line 765,col 5)",
        "(line 766,col 5)-(line 766,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.clonePropsFrom(com.google.javascript.rhino.Node)",
      "begin_line": 776,
      "end_line": 781,
      "comment": "\n   * Clone the properties from the provided node without copying\n   * the property object.  The receiving node may not have any\n   * existing properties.\n   * @param other The node to clone properties from.\n   * @return this node.\n   ",
      "child_ranges": [
        "(line 777,col 5)-(line 778,col 41)",
        "(line 779,col 5)-(line 779,col 43)",
        "(line 780,col 5)-(line 780,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeProp(int)",
      "begin_line": 783,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 784,col 5)-(line 784,col 61)",
        "(line 785,col 5)-(line 787,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeProp(com.google.javascript.rhino.Node.PropListItem, int)",
      "begin_line": 796,
      "end_line": 809,
      "comment": "\n   * @param item The item to inspect\n   * @param propType The property to look for\n   * @return The replacement list if the property was removed, or\n   *   \u0027item\u0027 otherwise.\n   ",
      "child_ranges": [
        "(line 797,col 5)-(line 808,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getProp(int)",
      "begin_line": 811,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 812,col 5)-(line 812,col 49)",
        "(line 813,col 5)-(line 815,col 5)",
        "(line 816,col 5)-(line 816,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getBooleanProp(int)",
      "begin_line": 819,
      "end_line": 821,
      "comment": "",
      "child_ranges": [
        "(line 820,col 5)-(line 820,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getIntProp(int)",
      "begin_line": 827,
      "end_line": 833,
      "comment": "\n   * Returns the integer value for the property, or 0 if the property\n   * is not defined.\n   ",
      "child_ranges": [
        "(line 828,col 5)-(line 828,col 49)",
        "(line 829,col 5)-(line 831,col 5)",
        "(line 832,col 5)-(line 832,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getExistingIntProp(int)",
      "begin_line": 835,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 836,col 5)-(line 836,col 49)",
        "(line 837,col 5)-(line 839,col 5)",
        "(line 840,col 5)-(line 840,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.putProp(int, java.lang.Object)",
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
      "signature": "com.google.javascript.rhino.Node.putBooleanProp(int, boolean)",
      "begin_line": 850,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 851,col 5)-(line 851,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.putIntProp(int, int)",
      "begin_line": 854,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 855,col 5)-(line 855,col 25)",
        "(line 856,col 5)-(line 858,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.createProp(int, java.lang.Object, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 861,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 862,col 5)-(line 862,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.createProp(int, int, com.google.javascript.rhino.Node.PropListItem)",
      "begin_line": 865,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 866,col 5)-(line 866,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSortedPropTypes()",
      "begin_line": 870,
      "end_line": 884,
      "comment": " Gets all the property types, in sorted order.",
      "child_ranges": [
        "(line 871,col 5)-(line 871,col 18)",
        "(line 872,col 5)-(line 874,col 5)",
        "(line 876,col 5)-(line 876,col 32)",
        "(line 877,col 5)-(line 880,col 5)",
        "(line 882,col 5)-(line 882,col 22)",
        "(line 883,col 5)-(line 883,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getDouble()",
      "begin_line": 887,
      "end_line": 894,
      "comment": " Can only be called when \u003ctt\u003egetType() \u003d\u003d TokenStream.NUMBER\u003c/tt\u003e ",
      "child_ranges": [
        "(line 888,col 5)-(line 893,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setDouble(double)",
      "begin_line": 900,
      "end_line": 907,
      "comment": "\n   * Can only be called when \u003ctt\u003egetType() \u003d\u003d Token.NUMBER\u003c/tt\u003e\n   * @param value value to set.\n   ",
      "child_ranges": [
        "(line 901,col 5)-(line 906,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getString()",
      "begin_line": 910,
      "end_line": 917,
      "comment": " Can only be called when node has String context. ",
      "child_ranges": [
        "(line 911,col 5)-(line 916,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setString(java.lang.String)",
      "begin_line": 923,
      "end_line": 930,
      "comment": "\n   * Can only be called for a Token.STRING or Token.NAME.\n   * @param value the value to set.\n   ",
      "child_ranges": [
        "(line 924,col 5)-(line 929,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toString()",
      "begin_line": 932,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 934,col 5)-(line 934,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toString(boolean, boolean, boolean)",
      "begin_line": 937,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 941,col 5)-(line 941,col 43)",
        "(line 942,col 5)-(line 942,col 59)",
        "(line 943,col 5)-(line 943,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toString(java.lang.StringBuilder, boolean, boolean, boolean)",
      "begin_line": 946,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 951,col 5)-(line 951,col 32)",
        "(line 952,col 5)-(line 968,col 5)",
        "(line 969,col 5)-(line 975,col 5)",
        "(line 977,col 5)-(line 994,col 5)",
        "(line 996,col 5)-(line 1004,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toStringTree()",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 5)-(line 1009,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toStringTreeImpl()",
      "begin_line": 1012,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 1013,col 5)-(line 1019,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.appendStringTree(java.lang.Appendable)",
      "begin_line": 1022,
      "end_line": 1024,
      "comment": "",
      "child_ranges": [
        "(line 1023,col 5)-(line 1023,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.toStringTreeHelper(com.google.javascript.rhino.Node, int, java.lang.Appendable)",
      "begin_line": 1026,
      "end_line": 1038,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 5)-(line 1030,col 5)",
        "(line 1031,col 5)-(line 1031,col 28)",
        "(line 1032,col 5)-(line 1032,col 20)",
        "(line 1033,col 5)-(line 1037,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 1040,
      "end_line": 1040,
      "comment": " type of the node; Token.NAME for example"
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1041,
      "end_line": 1041,
      "comment": " next sibling"
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 1042,
      "end_line": 1042,
      "comment": " first element of a linked list of children"
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 1043,
      "end_line": 1043,
      "comment": " last element of a linked list of children"
    },
    {
      "type": "field",
      "varNames": [
        "propListHead"
      ],
      "begin_line": 1051,
      "end_line": 1051,
      "comment": "\n   * Linked list of properties. Since vast majority of nodes would have\n   * no more then 2 properties, linked list saves memory and provides\n   * fast lookup. If this does not holds, propListHead can be replaced\n   * by UintMap.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_BITS"
      ],
      "begin_line": 1061,
      "end_line": 1061,
      "comment": "\n   * COLUMN_BITS represents how many of the lower-order bits of\n   * sourcePosition are reserved for storing the column number.\n   * Bits above these store the line number.\n   * This gives us decent position information for everything except\n   * files already passed through a minimizer, where lines might\n   * be longer than 4096 characters.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_COLUMN_NUMBER"
      ],
      "begin_line": 1068,
      "end_line": 1068,
      "comment": "\n   * MAX_COLUMN_NUMBER represents the maximum column number that can\n   * be represented.  JSCompiler\u0027s modifications to Rhino cause all\n   * tokens located beyond the maximum column to MAX_COLUMN_NUMBER.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_MASK"
      ],
      "begin_line": 1075,
      "end_line": 1075,
      "comment": "\n   * COLUMN_MASK stores a value where bits storing the column number\n   * are set, and bits storing the line are not set.  It\u0027s handy for\n   * separating column number from line number.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourcePosition"
      ],
      "begin_line": 1083,
      "end_line": 1083,
      "comment": "\n   * Source position of this node. The position is encoded with the\n   * column number in the low 12 bits of the integer, and the line\n   * number in the rest.  Create some handy constants so we can change this\n   * size if we want.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "jsType"
      ],
      "begin_line": 1085,
      "end_line": 1085,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1087,
      "end_line": 1087,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setStaticSourceFile(com.google.javascript.rhino.jstype.StaticSourceFile)",
      "begin_line": 1092,
      "end_line": 1094,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 5)-(line 1093,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSourceFileForTesting(java.lang.String)",
      "begin_line": 1097,
      "end_line": 1099,
      "comment": " Sets the source file to a non-extern file of the given name. ",
      "child_ranges": [
        "(line 1098,col 5)-(line 1098,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSourceFileName()",
      "begin_line": 1101,
      "end_line": 1104,
      "comment": "",
      "child_ranges": [
        "(line 1102,col 5)-(line 1102,col 50)",
        "(line 1103,col 5)-(line 1103,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getStaticSourceFile()",
      "begin_line": 1107,
      "end_line": 1109,
      "comment": " Returns the source file associated with this input. May be null ",
      "child_ranges": [
        "(line 1108,col 5)-(line 1108,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setInputId(com.google.javascript.rhino.InputId)",
      "begin_line": 1114,
      "end_line": 1116,
      "comment": "\n   * @param inputId\n   ",
      "child_ranges": [
        "(line 1115,col 5)-(line 1115,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getInputId()",
      "begin_line": 1121,
      "end_line": 1123,
      "comment": "\n   * @return The Id of the CompilerInput associated with this Node.\n   ",
      "child_ranges": [
        "(line 1122,col 5)-(line 1122,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isFromExterns()",
      "begin_line": 1125,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 5)-(line 1126,col 50)",
        "(line 1127,col 5)-(line 1127,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getLength()",
      "begin_line": 1130,
      "end_line": 1132,
      "comment": "",
      "child_ranges": [
        "(line 1131,col 5)-(line 1131,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setLength(int)",
      "begin_line": 1134,
      "end_line": 1136,
      "comment": "",
      "child_ranges": [
        "(line 1135,col 5)-(line 1135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getLineno()",
      "begin_line": 1138,
      "end_line": 1140,
      "comment": "",
      "child_ranges": [
        "(line 1139,col 5)-(line 1139,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getCharno()",
      "begin_line": 1142,
      "end_line": 1144,
      "comment": "",
      "child_ranges": [
        "(line 1143,col 5)-(line 1143,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSourceOffset()",
      "begin_line": 1146,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1147,col 5)-(line 1147,col 50)",
        "(line 1148,col 5)-(line 1150,col 5)",
        "(line 1151,col 5)-(line 1151,col 29)",
        "(line 1152,col 5)-(line 1154,col 5)",
        "(line 1155,col 5)-(line 1155,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSourcePosition()",
      "begin_line": 1158,
      "end_line": 1160,
      "comment": "",
      "child_ranges": [
        "(line 1159,col 5)-(line 1159,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setLineno(int)",
      "begin_line": 1162,
      "end_line": 1168,
      "comment": "",
      "child_ranges": [
        "(line 1163,col 7)-(line 1163,col 31)",
        "(line 1164,col 7)-(line 1166,col 7)",
        "(line 1167,col 7)-(line 1167,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setCharno(int)",
      "begin_line": 1170,
      "end_line": 1172,
      "comment": "",
      "child_ranges": [
        "(line 1171,col 7)-(line 1171,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSourceEncodedPosition(int)",
      "begin_line": 1174,
      "end_line": 1176,
      "comment": "",
      "child_ranges": [
        "(line 1175,col 5)-(line 1175,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSourceEncodedPositionForTree(int)",
      "begin_line": 1178,
      "end_line": 1185,
      "comment": "",
      "child_ranges": [
        "(line 1179,col 5)-(line 1179,col 41)",
        "(line 1181,col 5)-(line 1184,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.mergeLineCharNo(int, int)",
      "begin_line": 1193,
      "end_line": 1201,
      "comment": "\n   * Merges the line number and character number in one integer. The Character\n   * number takes the first 12 bits and the line number takes the rest. If\n   * the character number is greater than \u003ccode\u003e2\u003csup\u003e12\u003c/sup\u003e-1\u003c/code\u003e it is\n   * adjusted to \u003ccode\u003e2\u003csup\u003e12\u003c/sup\u003e-1\u003c/code\u003e.\n   ",
      "child_ranges": [
        "(line 1194,col 5)-(line 1200,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.extractLineno(int)",
      "begin_line": 1207,
      "end_line": 1213,
      "comment": "\n   * Extracts the line number and character number from a merged line char\n   * number (see {@link #mergeLineCharNo(int, int)}).\n   ",
      "child_ranges": [
        "(line 1208,col 5)-(line 1212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.extractCharno(int)",
      "begin_line": 1219,
      "end_line": 1225,
      "comment": "\n   * Extracts the character number and character number from a merged line\n   * char number (see {@link #mergeLineCharNo(int, int)}).\n   ",
      "child_ranges": [
        "(line 1220,col 5)-(line 1224,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.children()",
      "begin_line": 1239,
      "end_line": 1245,
      "comment": "\n   * \u003cp\u003eReturn an iterable object that iterates over this node\u0027s children.\n   * The iterator does not support the optional operation\n   * {@link Iterator#remove()}.\u003c/p\u003e\n   *\n   * \u003cp\u003eTo iterate over a node\u0027s siblings, one can write\u003c/p\u003e\n   * \u003cpre\u003eNode n \u003d ...;\n   * for (Node child : n.children()) { ...\u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 1240,col 5)-(line 1244,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.siblings()",
      "begin_line": 1256,
      "end_line": 1258,
      "comment": "\n   * \u003cp\u003eReturn an iterable object that iterates over this node\u0027s siblings.\n   * The iterator does not support the optional operation\n   * {@link Iterator#remove()}.\u003c/p\u003e\n   *\n   * \u003cp\u003eTo iterate over a node\u0027s siblings, one can write\u003c/p\u003e\n   * \u003cpre\u003eNode n \u003d ...;\n   * for (Node sibling : n.siblings()) { ...\u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 1257,col 5)-(line 1257,col 41)"
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
      "begin_line": 1263,
      "end_line": 1312,
      "comment": "\n   * @see Node#siblings()\n   "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 1265,
      "end_line": 1265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1266,
      "end_line": 1266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "used"
      ],
      "begin_line": 1267,
      "end_line": 1267,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.SiblingNodeIterable(com.google.javascript.rhino.Node)",
      "begin_line": 1269,
      "end_line": 1273,
      "comment": "",
      "child_ranges": [
        "(line 1270,col 7)-(line 1270,col 25)",
        "(line 1271,col 7)-(line 1271,col 27)",
        "(line 1272,col 7)-(line 1272,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.iterator()",
      "begin_line": 1275,
      "end_line": 1289,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 7)-(line 1288,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.hasNext()",
      "begin_line": 1291,
      "end_line": 1294,
      "comment": "",
      "child_ranges": [
        "(line 1293,col 7)-(line 1293,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.next()",
      "begin_line": 1296,
      "end_line": 1306,
      "comment": "",
      "child_ranges": [
        "(line 1298,col 7)-(line 1300,col 7)",
        "(line 1301,col 7)-(line 1305,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SiblingNodeIterable.remove()",
      "begin_line": 1308,
      "end_line": 1311,
      "comment": "",
      "child_ranges": [
        "(line 1310,col 7)-(line 1310,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getPropListHeadForTesting()",
      "begin_line": 1317,
      "end_line": 1319,
      "comment": "",
      "child_ranges": [
        "(line 1318,col 5)-(line 1318,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getParent()",
      "begin_line": 1321,
      "end_line": 1323,
      "comment": "",
      "child_ranges": [
        "(line 1322,col 5)-(line 1322,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getAncestor(int)",
      "begin_line": 1330,
      "end_line": 1337,
      "comment": "\n   * Gets the ancestor node relative to this.\n   *\n   * @param level 0 \u003d this, 1 \u003d the parent, etc.\n   ",
      "child_ranges": [
        "(line 1331,col 5)-(line 1331,col 44)",
        "(line 1332,col 5)-(line 1332,col 21)",
        "(line 1333,col 5)-(line 1335,col 5)",
        "(line 1336,col 5)-(line 1336,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getAncestors()",
      "begin_line": 1342,
      "end_line": 1344,
      "comment": "\n   * Iterates all of the node\u0027s ancestors excluding itself.\n   ",
      "child_ranges": [
        "(line 1343,col 5)-(line 1343,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AncestorIterable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1349,
      "end_line": 1383,
      "comment": "\n   * Iterator to go up the ancestor tree.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "cur"
      ],
      "begin_line": 1350,
      "end_line": 1350,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.AncestorIterable(com.google.javascript.rhino.Node)",
      "begin_line": 1355,
      "end_line": 1357,
      "comment": "\n     * @param cur The node to start.\n     ",
      "child_ranges": [
        "(line 1356,col 7)-(line 1356,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.iterator()",
      "begin_line": 1359,
      "end_line": 1382,
      "comment": "",
      "child_ranges": [
        "(line 1361,col 7)-(line 1381,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.Anonymous-2d7a533f-5f9b-4dc4-91fa-b045ebae85f6.hasNext()",
      "begin_line": 1362,
      "end_line": 1365,
      "comment": "",
      "child_ranges": [
        "(line 1364,col 11)-(line 1364,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.Anonymous-de5ccfd1-5a93-45ed-9d11-be0821cf7ac0.next()",
      "begin_line": 1367,
      "end_line": 1375,
      "comment": "",
      "child_ranges": [
        "(line 1369,col 11)-(line 1371,col 11)",
        "(line 1372,col 11)-(line 1372,col 23)",
        "(line 1373,col 11)-(line 1373,col 32)",
        "(line 1374,col 11)-(line 1374,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.AncestorIterable.Anonymous-d3792f9f-6fc9-4593-8024-5caf762bb6ed.remove()",
      "begin_line": 1377,
      "end_line": 1380,
      "comment": "",
      "child_ranges": [
        "(line 1379,col 11)-(line 1379,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.hasOneChild()",
      "begin_line": 1391,
      "end_line": 1393,
      "comment": "\n   * Check for one child more efficiently than by iterating over all the\n   * children as is done with Node.getChildCount().\n   *\n   * @return Whether the node has exactly one child.\n   ",
      "child_ranges": [
        "(line 1392,col 5)-(line 1392,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.hasMoreThanOneChild()",
      "begin_line": 1401,
      "end_line": 1403,
      "comment": "\n   * Check for more than one child more efficiently than by iterating over all\n   * the children as is done with Node.getChildCount().\n   *\n   * @return Whether the node more than one child.\n   ",
      "child_ranges": [
        "(line 1402,col 5)-(line 1402,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getChildCount()",
      "begin_line": 1405,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1406,col 5)-(line 1406,col 14)",
        "(line 1407,col 5)-(line 1409,col 5)",
        "(line 1410,col 5)-(line 1410,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.hasChild(com.google.javascript.rhino.Node)",
      "begin_line": 1414,
      "end_line": 1421,
      "comment": " Intended for testing and verification only.",
      "child_ranges": [
        "(line 1415,col 5)-(line 1419,col 5)",
        "(line 1420,col 5)-(line 1420,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.checkTreeEquals(com.google.javascript.rhino.Node)",
      "begin_line": 1427,
      "end_line": 1437,
      "comment": "\n   * Checks if the subtree under this node is the same as another subtree.\n   * Returns null if it\u0027s equal, or a message describing the differences.\n   ",
      "child_ranges": [
        "(line 1428,col 7)-(line 1428,col 53)",
        "(line 1429,col 7)-(line 1435,col 7)",
        "(line 1436,col 7)-(line 1436,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.checkTreeEqualsImpl(com.google.javascript.rhino.Node)",
      "begin_line": 1444,
      "end_line": 1463,
      "comment": "\n   * Compare this node to node2 recursively and return the first pair of nodes\n   * that differs doing a preorder depth-first traversal. Package private for\n   * testing. Returns null if the nodes are equivalent.\n   ",
      "child_ranges": [
        "(line 1445,col 5)-(line 1447,col 5)",
        "(line 1449,col 5)-(line 1449,col 28)",
        "(line 1450,col 5)-(line 1450,col 15)",
        "(line 1451,col 5)-(line 1461,col 5)",
        "(line 1462,col 5)-(line 1462,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.checkTreeTypeAwareEqualsImpl(com.google.javascript.rhino.Node)",
      "begin_line": 1470,
      "end_line": 1487,
      "comment": "\n   * Compare this node to node2 recursively and return the first pair of nodes\n   * that differs doing a preorder depth-first traversal. Package private for\n   * testing. Returns null if the nodes are equivalent.\n   ",
      "child_ranges": [
        "(line 1472,col 5)-(line 1474,col 5)",
        "(line 1476,col 5)-(line 1476,col 28)",
        "(line 1477,col 5)-(line 1477,col 15)",
        "(line 1478,col 5)-(line 1485,col 5)",
        "(line 1486,col 5)-(line 1486,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEquivalentTo(com.google.javascript.rhino.Node)",
      "begin_line": 1490,
      "end_line": 1492,
      "comment": " Returns true if this node is equivalent semantically to another ",
      "child_ranges": [
        "(line 1491,col 5)-(line 1491,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEquivalentToShallow(com.google.javascript.rhino.Node)",
      "begin_line": 1495,
      "end_line": 1497,
      "comment": " Checks equivalence without going into inner functions ",
      "child_ranges": [
        "(line 1496,col 5)-(line 1496,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEquivalentToTyped(com.google.javascript.rhino.Node)",
      "begin_line": 1503,
      "end_line": 1505,
      "comment": "\n   * Returns true if this node is equivalent semantically to another and\n   * the types are equivalent.\n   ",
      "child_ranges": [
        "(line 1504,col 5)-(line 1504,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEquivalentTo(com.google.javascript.rhino.Node, boolean, boolean, boolean)",
      "begin_line": 1514,
      "end_line": 1565,
      "comment": "\n   * @param compareJsType Whether to compare the JSTypes of the nodes.\n   * @param recur Whether to compare the children of the current node, if\n   *    not only the the count of the children are compared.\n   * @param shallow If true, the method doesn\u0027t recur into inner functions.\n   * @return Whether this node is equivalent semantically to the provided node.\n   ",
      "child_ranges": [
        "(line 1516,col 5)-(line 1520,col 5)",
        "(line 1522,col 5)-(line 1524,col 5)",
        "(line 1526,col 5)-(line 1550,col 5)",
        "(line 1552,col 5)-(line 1562,col 5)",
        "(line 1564,col 5)-(line 1564,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getQualifiedName()",
      "begin_line": 1575,
      "end_line": 1590,
      "comment": "\n   * This function takes a set of GETPROP nodes and produces a string that is\n   * each property separated by dots. If the node ultimately under the left\n   * sub-tree is not a simple name, this is not a valid qualified name.\n   *\n   * @return a null if this is not a qualified name, or a dot-separated string\n   *         of the name and properties.\n   ",
      "child_ranges": [
        "(line 1576,col 5)-(line 1589,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isQualifiedName()",
      "begin_line": 1596,
      "end_line": 1607,
      "comment": "\n   * Returns whether a node corresponds to a simple or a qualified name, such as\n   * \u003ccode\u003ex\u003c/code\u003e or \u003ccode\u003ea.b.c\u003c/code\u003e or \u003ccode\u003ethis.a\u003c/code\u003e.\n   ",
      "child_ranges": [
        "(line 1597,col 5)-(line 1606,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isUnscopedQualifiedName()",
      "begin_line": 1614,
      "end_line": 1623,
      "comment": "\n   * Returns whether a node corresponds to a simple or a qualified name without\n   * a \"this\" reference, such as \u003ccode\u003ea.b.c\u003c/code\u003e, but not \u003ccode\u003ethis.a\u003c/code\u003e\n   * .\n   ",
      "child_ranges": [
        "(line 1615,col 5)-(line 1622,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.detachFromParent()",
      "begin_line": 1632,
      "end_line": 1636,
      "comment": "\n   * Removes this node from its parent. Equivalent to:\n   * node.getParent().removeChild();\n   ",
      "child_ranges": [
        "(line 1633,col 5)-(line 1633,col 45)",
        "(line 1634,col 5)-(line 1634,col 29)",
        "(line 1635,col 5)-(line 1635,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeFirstChild()",
      "begin_line": 1644,
      "end_line": 1650,
      "comment": "\n   * Removes the first child of Node. Equivalent to:\n   * node.removeChild(node.getFirstChild());\n   *\n   * @return The removed Node.\n   ",
      "child_ranges": [
        "(line 1645,col 5)-(line 1645,col 23)",
        "(line 1646,col 5)-(line 1648,col 5)",
        "(line 1649,col 5)-(line 1649,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeChildren()",
      "begin_line": 1655,
      "end_line": 1663,
      "comment": "\n   * @return A Node that is the head of the list of children.\n   ",
      "child_ranges": [
        "(line 1656,col 5)-(line 1656,col 26)",
        "(line 1657,col 5)-(line 1659,col 5)",
        "(line 1660,col 5)-(line 1660,col 17)",
        "(line 1661,col 5)-(line 1661,col 16)",
        "(line 1662,col 5)-(line 1662,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.detachChildren()",
      "begin_line": 1669,
      "end_line": 1678,
      "comment": "\n   * Removes all children from this node and isolates the children from each\n   * other.\n   ",
      "child_ranges": [
        "(line 1670,col 5)-(line 1675,col 5)",
        "(line 1676,col 5)-(line 1676,col 17)",
        "(line 1677,col 5)-(line 1677,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.removeChildAfter(com.google.javascript.rhino.Node)",
      "begin_line": 1680,
      "end_line": 1694,
      "comment": "",
      "child_ranges": [
        "(line 1681,col 5)-(line 1682,col 45)",
        "(line 1683,col 5)-(line 1684,col 28)",
        "(line 1686,col 5)-(line 1686,col 27)",
        "(line 1687,col 5)-(line 1687,col 27)",
        "(line 1688,col 5)-(line 1690,col 5)",
        "(line 1691,col 5)-(line 1691,col 22)",
        "(line 1692,col 5)-(line 1692,col 24)",
        "(line 1693,col 5)-(line 1693,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.cloneNode()",
      "begin_line": 1699,
      "end_line": 1713,
      "comment": "\n   * @return A detached clone of the Node, specifically excluding its children.\n   ",
      "child_ranges": [
        "(line 1700,col 5)-(line 1700,col 16)",
        "(line 1701,col 5)-(line 1711,col 5)",
        "(line 1712,col 5)-(line 1712,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.cloneTree()",
      "begin_line": 1718,
      "end_line": 1732,
      "comment": "\n   * @return A detached clone of the Node and all its children.\n   ",
      "child_ranges": [
        "(line 1719,col 5)-(line 1719,col 30)",
        "(line 1720,col 5)-(line 1730,col 5)",
        "(line 1731,col 5)-(line 1731,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.copyInformationFrom(com.google.javascript.rhino.Node)",
      "begin_line": 1741,
      "end_line": 1752,
      "comment": " TODO(nicksantos): The semantics of this method are ill-defined. Delete it.",
      "child_ranges": [
        "(line 1742,col 5)-(line 1744,col 5)",
        "(line 1746,col 5)-(line 1749,col 5)",
        "(line 1751,col 5)-(line 1751,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.copyInformationFromForTree(com.google.javascript.rhino.Node)",
      "begin_line": 1760,
      "end_line": 1768,
      "comment": " TODO(nicksantos): The semantics of this method are ill-defined. Delete it.",
      "child_ranges": [
        "(line 1761,col 5)-(line 1761,col 31)",
        "(line 1762,col 5)-(line 1765,col 5)",
        "(line 1767,col 5)-(line 1767,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.useSourceInfoFrom(com.google.javascript.rhino.Node)",
      "begin_line": 1774,
      "end_line": 1779,
      "comment": "\n   * Overwrite all the source information in this node with\n   * that of {@code other}.\n   ",
      "child_ranges": [
        "(line 1775,col 5)-(line 1775,col 65)",
        "(line 1776,col 5)-(line 1776,col 67)",
        "(line 1777,col 5)-(line 1777,col 42)",
        "(line 1778,col 5)-(line 1778,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.srcref(com.google.javascript.rhino.Node)",
      "begin_line": 1781,
      "end_line": 1783,
      "comment": "",
      "child_ranges": [
        "(line 1782,col 5)-(line 1782,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.useSourceInfoFromForTree(com.google.javascript.rhino.Node)",
      "begin_line": 1789,
      "end_line": 1797,
      "comment": "\n   * Overwrite all the source information in this node and its subtree with\n   * that of {@code other}.\n   ",
      "child_ranges": [
        "(line 1790,col 5)-(line 1790,col 29)",
        "(line 1791,col 5)-(line 1794,col 5)",
        "(line 1796,col 5)-(line 1796,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.srcrefTree(com.google.javascript.rhino.Node)",
      "begin_line": 1799,
      "end_line": 1801,
      "comment": "",
      "child_ranges": [
        "(line 1800,col 5)-(line 1800,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.useSourceInfoIfMissingFrom(com.google.javascript.rhino.Node)",
      "begin_line": 1807,
      "end_line": 1818,
      "comment": "\n   * Overwrite all the source information in this node with\n   * that of {@code other} iff the source info is missing.\n   ",
      "child_ranges": [
        "(line 1808,col 5)-(line 1810,col 5)",
        "(line 1812,col 5)-(line 1815,col 5)",
        "(line 1817,col 5)-(line 1817,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.useSourceInfoIfMissingFromForTree(com.google.javascript.rhino.Node)",
      "begin_line": 1824,
      "end_line": 1832,
      "comment": "\n   * Overwrite all the source information in this node and its subtree with\n   * that of {@code other} iff the source info is missing.\n   ",
      "child_ranges": [
        "(line 1825,col 5)-(line 1825,col 38)",
        "(line 1826,col 5)-(line 1829,col 5)",
        "(line 1831,col 5)-(line 1831,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getJSType()",
      "begin_line": 1837,
      "end_line": 1839,
      "comment": "",
      "child_ranges": [
        "(line 1838,col 7)-(line 1838,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setJSType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1841,
      "end_line": 1843,
      "comment": "",
      "child_ranges": [
        "(line 1842,col 7)-(line 1842,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getJsDocBuilderForNode()",
      "begin_line": 1845,
      "end_line": 1847,
      "comment": "",
      "child_ranges": [
        "(line 1846,col 5)-(line 1846,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FileLevelJsDocBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1857,
      "end_line": 1872,
      "comment": "\n   * An inner class that provides back-door access to the license\n   * property of the JSDocInfo property for this node. This is only\n   * meant to be used for top-level script nodes where the\n   * {@link com.google.javascript.jscomp.parsing.JsDocInfoParser} needs to\n   * be able to append directly to the top-level node, not just the\n   * current node.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.FileLevelJsDocBuilder.append(java.lang.String)",
      "begin_line": 1858,
      "end_line": 1871,
      "comment": "",
      "child_ranges": [
        "(line 1859,col 7)-(line 1859,col 43)",
        "(line 1860,col 7)-(line 1864,col 7)",
        "(line 1865,col 7)-(line 1865,col 46)",
        "(line 1866,col 7)-(line 1868,col 7)",
        "(line 1869,col 7)-(line 1869,col 55)",
        "(line 1870,col 7)-(line 1870,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getJSDocInfo()",
      "begin_line": 1879,
      "end_line": 1881,
      "comment": "\n   * Get the {@link JSDocInfo} attached to this node.\n   * @return the information or {@code null} if no JSDoc is attached to this\n   * node\n   ",
      "child_ranges": [
        "(line 1880,col 5)-(line 1880,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 1886,
      "end_line": 1889,
      "comment": "\n   * Sets the {@link JSDocInfo} attached to this node.\n   ",
      "child_ranges": [
        "(line 1887,col 7)-(line 1887,col 37)",
        "(line 1888,col 7)-(line 1888,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setChangeTime(int)",
      "begin_line": 1892,
      "end_line": 1894,
      "comment": " This node was last changed at {@code time} ",
      "child_ranges": [
        "(line 1893,col 5)-(line 1893,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getChangeTime()",
      "begin_line": 1897,
      "end_line": 1899,
      "comment": " Returns the time of the last change for this node ",
      "child_ranges": [
        "(line 1898,col 5)-(line 1898,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setVarArgs(boolean)",
      "begin_line": 1906,
      "end_line": 1908,
      "comment": "\n   * Sets whether this node is a variable length argument node. This\n   * method is meaningful only on {@link Token#NAME} nodes\n   * used to define a {@link Token#FUNCTION}\u0027s argument list.\n   ",
      "child_ranges": [
        "(line 1907,col 5)-(line 1907,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isVarArgs()",
      "begin_line": 1915,
      "end_line": 1917,
      "comment": "\n   * Returns whether this node is a variable length argument node. This\n   * method\u0027s return value is meaningful only on {@link Token#NAME} nodes\n   * used to define a {@link Token#FUNCTION}\u0027s argument list.\n   ",
      "child_ranges": [
        "(line 1916,col 5)-(line 1916,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setOptionalArg(boolean)",
      "begin_line": 1924,
      "end_line": 1926,
      "comment": "\n   * Sets whether this node is an optional argument node. This\n   * method is meaningful only on {@link Token#NAME} nodes\n   * used to define a {@link Token#FUNCTION}\u0027s argument list.\n   ",
      "child_ranges": [
        "(line 1925,col 5)-(line 1925,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isOptionalArg()",
      "begin_line": 1933,
      "end_line": 1935,
      "comment": "\n   * Returns whether this node is an optional argument node. This\n   * method\u0027s return value is meaningful only on {@link Token#NAME} nodes\n   * used to define a {@link Token#FUNCTION}\u0027s argument list.\n   ",
      "child_ranges": [
        "(line 1934,col 5)-(line 1934,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setIsSyntheticBlock(boolean)",
      "begin_line": 1941,
      "end_line": 1943,
      "comment": "\n   * Sets whether this is a synthetic block that should not be considered\n   * a real source block.\n   ",
      "child_ranges": [
        "(line 1942,col 5)-(line 1942,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isSyntheticBlock()",
      "begin_line": 1949,
      "end_line": 1951,
      "comment": "\n   * Returns whether this is a synthetic block that should not be considered\n   * a real source block.\n   ",
      "child_ranges": [
        "(line 1950,col 5)-(line 1950,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setDirectives(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1956,
      "end_line": 1958,
      "comment": "\n   * Sets the ES5 directives on this node.\n   ",
      "child_ranges": [
        "(line 1957,col 5)-(line 1957,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getDirectives()",
      "begin_line": 1963,
      "end_line": 1966,
      "comment": "\n   * Returns the set of ES5 directives for this node.\n   ",
      "child_ranges": [
        "(line 1965,col 5)-(line 1965,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.addSuppression(java.lang.String)",
      "begin_line": 1972,
      "end_line": 1977,
      "comment": "\n   * Adds a warning to be suppressed. This is indistinguishable\n   * from having a {@code @suppress} tag in the code.\n   ",
      "child_ranges": [
        "(line 1973,col 5)-(line 1975,col 5)",
        "(line 1976,col 5)-(line 1976,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setWasEmptyNode(boolean)",
      "begin_line": 1983,
      "end_line": 1985,
      "comment": "\n   * Sets whether this is a synthetic block that should not be considered\n   * a real source block.\n   ",
      "child_ranges": [
        "(line 1984,col 5)-(line 1984,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.wasEmptyNode()",
      "begin_line": 1991,
      "end_line": 1993,
      "comment": "\n   * Returns whether this is a synthetic block that should not be considered\n   * a real source block.\n   ",
      "child_ranges": [
        "(line 1992,col 5)-(line 1992,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_GLOBAL_STATE_UNMODIFIED"
      ],
      "begin_line": 2004,
      "end_line": 2004,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_THIS_UNMODIFIED"
      ],
      "begin_line": 2005,
      "end_line": 2005,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_ARGUMENTS_UNMODIFIED"
      ],
      "begin_line": 2006,
      "end_line": 2006,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_NO_THROWS"
      ],
      "begin_line": 2007,
      "end_line": 2007,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_LOCAL_RESULTS"
      ],
      "begin_line": 2008,
      "end_line": 2008,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIDE_EFFECTS_FLAGS_MASK"
      ],
      "begin_line": 2010,
      "end_line": 2010,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIDE_EFFECTS_ALL"
      ],
      "begin_line": 2012,
      "end_line": 2012,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_SIDE_EFFECTS"
      ],
      "begin_line": 2013,
      "end_line": 2017,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSideEffectFlags(int)",
      "begin_line": 2024,
      "end_line": 2031,
      "comment": "\n   * Marks this function or constructor call\u0027s side effect flags.\n   * This property is only meaningful for {@link Token#CALL} and\n   * {@link Token#NEW} nodes.\n   ",
      "child_ranges": [
        "(line 2025,col 5)-(line 2028,col 30)",
        "(line 2030,col 5)-(line 2030,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setSideEffectFlags(com.google.javascript.rhino.Node.SideEffectFlags)",
      "begin_line": 2033,
      "end_line": 2035,
      "comment": "",
      "child_ranges": [
        "(line 2034,col 5)-(line 2034,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.getSideEffectFlags()",
      "begin_line": 2040,
      "end_line": 2042,
      "comment": "\n   * Returns the side effects flags for this node.\n   ",
      "child_ranges": [
        "(line 2041,col 5)-(line 2041,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SideEffectFlags",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 2048,
      "end_line": 2117,
      "comment": "\n   * A helper class for getting and setting the side-effect flags.\n   * @author johnlenz@google.com (John Lenz)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 2049,
      "end_line": 2049,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.SideEffectFlags()",
      "begin_line": 2051,
      "end_line": 2052,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.SideEffectFlags(int)",
      "begin_line": 2054,
      "end_line": 2056,
      "comment": "",
      "child_ranges": [
        "(line 2055,col 7)-(line 2055,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.valueOf()",
      "begin_line": 2058,
      "end_line": 2060,
      "comment": "",
      "child_ranges": [
        "(line 2059,col 7)-(line 2059,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setAllFlags()",
      "begin_line": 2063,
      "end_line": 2066,
      "comment": " All side-effect occur and the returned results are non-local. ",
      "child_ranges": [
        "(line 2064,col 7)-(line 2064,col 36)",
        "(line 2065,col 7)-(line 2065,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.clearAllFlags()",
      "begin_line": 2069,
      "end_line": 2072,
      "comment": " No side-effects occur and the returned results are local. ",
      "child_ranges": [
        "(line 2070,col 7)-(line 2070,col 61)",
        "(line 2071,col 7)-(line 2071,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.areAllFlagsSet()",
      "begin_line": 2074,
      "end_line": 2076,
      "comment": "",
      "child_ranges": [
        "(line 2075,col 7)-(line 2075,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.clearSideEffectFlags()",
      "begin_line": 2082,
      "end_line": 2084,
      "comment": "\n     * Preserve the return result flag, but clear the others:\n     *   no global state change, no throws, no this change, no arguments change\n     ",
      "child_ranges": [
        "(line 2083,col 7)-(line 2083,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setMutatesGlobalState()",
      "begin_line": 2086,
      "end_line": 2092,
      "comment": "",
      "child_ranges": [
        "(line 2088,col 7)-(line 2088,col 52)",
        "(line 2089,col 7)-(line 2089,col 49)",
        "(line 2090,col 7)-(line 2090,col 44)",
        "(line 2091,col 7)-(line 2091,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setThrows()",
      "begin_line": 2094,
      "end_line": 2097,
      "comment": "",
      "child_ranges": [
        "(line 2095,col 7)-(line 2095,col 38)",
        "(line 2096,col 7)-(line 2096,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setMutatesThis()",
      "begin_line": 2099,
      "end_line": 2102,
      "comment": "",
      "child_ranges": [
        "(line 2100,col 7)-(line 2100,col 44)",
        "(line 2101,col 7)-(line 2101,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setMutatesArguments()",
      "begin_line": 2104,
      "end_line": 2107,
      "comment": "",
      "child_ranges": [
        "(line 2105,col 7)-(line 2105,col 49)",
        "(line 2106,col 7)-(line 2106,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.setReturnsTainted()",
      "begin_line": 2109,
      "end_line": 2112,
      "comment": "",
      "child_ranges": [
        "(line 2110,col 7)-(line 2110,col 42)",
        "(line 2111,col 7)-(line 2111,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.SideEffectFlags.removeFlag(int)",
      "begin_line": 2114,
      "end_line": 2116,
      "comment": "",
      "child_ranges": [
        "(line 2115,col 7)-(line 2115,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isOnlyModifiesThisCall()",
      "begin_line": 2122,
      "end_line": 2128,
      "comment": "\n   * @return Whether the only side-effect is \"modifies this\"\n   ",
      "child_ranges": [
        "(line 2123,col 5)-(line 2127,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isOnlyModifiesArgumentsCall()",
      "begin_line": 2133,
      "end_line": 2139,
      "comment": "\n   * @return Whether the only side-effect is \"modifies arguments\"\n   ",
      "child_ranges": [
        "(line 2134,col 5)-(line 2138,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNoSideEffectsCall()",
      "begin_line": 2145,
      "end_line": 2147,
      "comment": "\n   * Returns true if this node is a function or constructor call that\n   * has no side effects.\n   ",
      "child_ranges": [
        "(line 2146,col 5)-(line 2146,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isLocalResultCall()",
      "begin_line": 2154,
      "end_line": 2156,
      "comment": "\n   * Returns true if this node is a function or constructor call that\n   * returns a primitive or a local object (an object that has no other\n   * references).\n   ",
      "child_ranges": [
        "(line 2155,col 5)-(line 2155,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.mayMutateArguments()",
      "begin_line": 2159,
      "end_line": 2161,
      "comment": " Returns true if this is a new/call that may mutate its arguments. ",
      "child_ranges": [
        "(line 2160,col 5)-(line 2160,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.mayMutateGlobalStateOrThrow()",
      "begin_line": 2164,
      "end_line": 2167,
      "comment": " Returns true if this is a new/call that may mutate global state or throw. ",
      "child_ranges": [
        "(line 2165,col 5)-(line 2166,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.areBitFlagsSet(int, int)",
      "begin_line": 2172,
      "end_line": 2174,
      "comment": "\n   * returns true if all the flags are set in value.\n   ",
      "child_ranges": [
        "(line 2173,col 5)-(line 2173,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isQuotedString()",
      "begin_line": 2179,
      "end_line": 2181,
      "comment": "\n   * This should only be called for STRING nodes children of OBJECTLIT.\n   ",
      "child_ranges": [
        "(line 2180,col 5)-(line 2180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.setQuotedString()",
      "begin_line": 2186,
      "end_line": 2188,
      "comment": "\n   * This should only be called for STRING nodes children of OBJECTLIT.\n   ",
      "child_ranges": [
        "(line 2187,col 5)-(line 2187,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeMismatch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 2190,
      "end_line": 2212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeA"
      ],
      "begin_line": 2191,
      "end_line": 2191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeB"
      ],
      "begin_line": 2192,
      "end_line": 2192,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.Node.NodeMismatch.NodeMismatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2194,
      "end_line": 2197,
      "comment": "",
      "child_ranges": [
        "(line 2195,col 7)-(line 2195,col 25)",
        "(line 2196,col 7)-(line 2196,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NodeMismatch.equals(java.lang.Object)",
      "begin_line": 2199,
      "end_line": 2206,
      "comment": "",
      "child_ranges": [
        "(line 2201,col 7)-(line 2204,col 7)",
        "(line 2205,col 7)-(line 2205,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.NodeMismatch.hashCode()",
      "begin_line": 2208,
      "end_line": 2211,
      "comment": "",
      "child_ranges": [
        "(line 2210,col 7)-(line 2210,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isAdd()",
      "begin_line": 2217,
      "end_line": 2219,
      "comment": "",
      "child_ranges": [
        "(line 2218,col 5)-(line 2218,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isAnd()",
      "begin_line": 2221,
      "end_line": 2223,
      "comment": "",
      "child_ranges": [
        "(line 2222,col 5)-(line 2222,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isArrayLit()",
      "begin_line": 2225,
      "end_line": 2227,
      "comment": "",
      "child_ranges": [
        "(line 2226,col 5)-(line 2226,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isAssign()",
      "begin_line": 2229,
      "end_line": 2231,
      "comment": "",
      "child_ranges": [
        "(line 2230,col 5)-(line 2230,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isAssignAdd()",
      "begin_line": 2233,
      "end_line": 2235,
      "comment": "",
      "child_ranges": [
        "(line 2234,col 5)-(line 2234,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isBlock()",
      "begin_line": 2237,
      "end_line": 2239,
      "comment": "",
      "child_ranges": [
        "(line 2238,col 5)-(line 2238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isBreak()",
      "begin_line": 2241,
      "end_line": 2243,
      "comment": "",
      "child_ranges": [
        "(line 2242,col 5)-(line 2242,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isCall()",
      "begin_line": 2245,
      "end_line": 2247,
      "comment": "",
      "child_ranges": [
        "(line 2246,col 5)-(line 2246,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isCase()",
      "begin_line": 2249,
      "end_line": 2251,
      "comment": "",
      "child_ranges": [
        "(line 2250,col 5)-(line 2250,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isCast()",
      "begin_line": 2253,
      "end_line": 2255,
      "comment": "",
      "child_ranges": [
        "(line 2254,col 5)-(line 2254,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isCatch()",
      "begin_line": 2257,
      "end_line": 2259,
      "comment": "",
      "child_ranges": [
        "(line 2258,col 5)-(line 2258,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isComma()",
      "begin_line": 2261,
      "end_line": 2263,
      "comment": "",
      "child_ranges": [
        "(line 2262,col 5)-(line 2262,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isContinue()",
      "begin_line": 2265,
      "end_line": 2267,
      "comment": "",
      "child_ranges": [
        "(line 2266,col 5)-(line 2266,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDebugger()",
      "begin_line": 2269,
      "end_line": 2271,
      "comment": "",
      "child_ranges": [
        "(line 2270,col 5)-(line 2270,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDec()",
      "begin_line": 2273,
      "end_line": 2275,
      "comment": "",
      "child_ranges": [
        "(line 2274,col 5)-(line 2274,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDefaultCase()",
      "begin_line": 2277,
      "end_line": 2279,
      "comment": "",
      "child_ranges": [
        "(line 2278,col 5)-(line 2278,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDelProp()",
      "begin_line": 2281,
      "end_line": 2283,
      "comment": "",
      "child_ranges": [
        "(line 2282,col 5)-(line 2282,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isDo()",
      "begin_line": 2285,
      "end_line": 2287,
      "comment": "",
      "child_ranges": [
        "(line 2286,col 5)-(line 2286,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isEmpty()",
      "begin_line": 2289,
      "end_line": 2291,
      "comment": "",
      "child_ranges": [
        "(line 2290,col 5)-(line 2290,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isExprResult()",
      "begin_line": 2293,
      "end_line": 2295,
      "comment": "",
      "child_ranges": [
        "(line 2294,col 5)-(line 2294,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isFalse()",
      "begin_line": 2297,
      "end_line": 2299,
      "comment": "",
      "child_ranges": [
        "(line 2298,col 5)-(line 2298,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isFor()",
      "begin_line": 2301,
      "end_line": 2303,
      "comment": "",
      "child_ranges": [
        "(line 2302,col 5)-(line 2302,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isFunction()",
      "begin_line": 2305,
      "end_line": 2307,
      "comment": "",
      "child_ranges": [
        "(line 2306,col 5)-(line 2306,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isGetterDef()",
      "begin_line": 2309,
      "end_line": 2311,
      "comment": "",
      "child_ranges": [
        "(line 2310,col 5)-(line 2310,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isGetElem()",
      "begin_line": 2313,
      "end_line": 2315,
      "comment": "",
      "child_ranges": [
        "(line 2314,col 5)-(line 2314,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isGetProp()",
      "begin_line": 2317,
      "end_line": 2319,
      "comment": "",
      "child_ranges": [
        "(line 2318,col 5)-(line 2318,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isHook()",
      "begin_line": 2321,
      "end_line": 2323,
      "comment": "",
      "child_ranges": [
        "(line 2322,col 5)-(line 2322,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isIf()",
      "begin_line": 2325,
      "end_line": 2327,
      "comment": "",
      "child_ranges": [
        "(line 2326,col 5)-(line 2326,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isIn()",
      "begin_line": 2329,
      "end_line": 2331,
      "comment": "",
      "child_ranges": [
        "(line 2330,col 5)-(line 2330,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isInc()",
      "begin_line": 2333,
      "end_line": 2335,
      "comment": "",
      "child_ranges": [
        "(line 2334,col 5)-(line 2334,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isInstanceOf()",
      "begin_line": 2337,
      "end_line": 2339,
      "comment": "",
      "child_ranges": [
        "(line 2338,col 5)-(line 2338,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isLabel()",
      "begin_line": 2341,
      "end_line": 2343,
      "comment": "",
      "child_ranges": [
        "(line 2342,col 5)-(line 2342,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isLabelName()",
      "begin_line": 2345,
      "end_line": 2347,
      "comment": "",
      "child_ranges": [
        "(line 2346,col 5)-(line 2346,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isName()",
      "begin_line": 2349,
      "end_line": 2351,
      "comment": "",
      "child_ranges": [
        "(line 2350,col 5)-(line 2350,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNE()",
      "begin_line": 2353,
      "end_line": 2355,
      "comment": "",
      "child_ranges": [
        "(line 2354,col 5)-(line 2354,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNew()",
      "begin_line": 2357,
      "end_line": 2359,
      "comment": "",
      "child_ranges": [
        "(line 2358,col 5)-(line 2358,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNot()",
      "begin_line": 2361,
      "end_line": 2363,
      "comment": "",
      "child_ranges": [
        "(line 2362,col 5)-(line 2362,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNull()",
      "begin_line": 2365,
      "end_line": 2367,
      "comment": "",
      "child_ranges": [
        "(line 2366,col 5)-(line 2366,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isNumber()",
      "begin_line": 2369,
      "end_line": 2371,
      "comment": "",
      "child_ranges": [
        "(line 2370,col 5)-(line 2370,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isObjectLit()",
      "begin_line": 2373,
      "end_line": 2375,
      "comment": "",
      "child_ranges": [
        "(line 2374,col 5)-(line 2374,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isOr()",
      "begin_line": 2377,
      "end_line": 2379,
      "comment": "",
      "child_ranges": [
        "(line 2378,col 5)-(line 2378,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isParamList()",
      "begin_line": 2381,
      "end_line": 2383,
      "comment": "",
      "child_ranges": [
        "(line 2382,col 5)-(line 2382,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isRegExp()",
      "begin_line": 2385,
      "end_line": 2387,
      "comment": "",
      "child_ranges": [
        "(line 2386,col 5)-(line 2386,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isReturn()",
      "begin_line": 2389,
      "end_line": 2391,
      "comment": "",
      "child_ranges": [
        "(line 2390,col 5)-(line 2390,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isScript()",
      "begin_line": 2393,
      "end_line": 2395,
      "comment": "",
      "child_ranges": [
        "(line 2394,col 5)-(line 2394,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isSetterDef()",
      "begin_line": 2397,
      "end_line": 2399,
      "comment": "",
      "child_ranges": [
        "(line 2398,col 5)-(line 2398,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isString()",
      "begin_line": 2401,
      "end_line": 2403,
      "comment": "",
      "child_ranges": [
        "(line 2402,col 5)-(line 2402,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isStringKey()",
      "begin_line": 2405,
      "end_line": 2407,
      "comment": "",
      "child_ranges": [
        "(line 2406,col 5)-(line 2406,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isSwitch()",
      "begin_line": 2409,
      "end_line": 2411,
      "comment": "",
      "child_ranges": [
        "(line 2410,col 5)-(line 2410,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isThis()",
      "begin_line": 2413,
      "end_line": 2415,
      "comment": "",
      "child_ranges": [
        "(line 2414,col 5)-(line 2414,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isThrow()",
      "begin_line": 2417,
      "end_line": 2419,
      "comment": "",
      "child_ranges": [
        "(line 2418,col 5)-(line 2418,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isTrue()",
      "begin_line": 2421,
      "end_line": 2423,
      "comment": "",
      "child_ranges": [
        "(line 2422,col 5)-(line 2422,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isTry()",
      "begin_line": 2425,
      "end_line": 2427,
      "comment": "",
      "child_ranges": [
        "(line 2426,col 5)-(line 2426,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isTypeOf()",
      "begin_line": 2429,
      "end_line": 2431,
      "comment": "",
      "child_ranges": [
        "(line 2430,col 5)-(line 2430,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isVar()",
      "begin_line": 2433,
      "end_line": 2435,
      "comment": "",
      "child_ranges": [
        "(line 2434,col 5)-(line 2434,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isVoid()",
      "begin_line": 2437,
      "end_line": 2439,
      "comment": "",
      "child_ranges": [
        "(line 2438,col 5)-(line 2438,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isWhile()",
      "begin_line": 2441,
      "end_line": 2443,
      "comment": "",
      "child_ranges": [
        "(line 2442,col 5)-(line 2442,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.Node.isWith()",
      "begin_line": 2445,
      "end_line": 2447,
      "comment": "",
      "child_ranges": [
        "(line 2446,col 5)-(line 2446,col 40)"
      ]
    }
  ]
}