{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/IR.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IR",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 623,
      "comment": "\n * An AST construction helper class\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.IR.IR()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.empty()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.function(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 44)",
        "(line 59,col 5)-(line 59,col 51)",
        "(line 60,col 5)-(line 60,col 45)",
        "(line 61,col 5)-(line 61,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.paramList()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.paramList(com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 45)",
        "(line 70,col 5)-(line 70,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.paramList(com.google.javascript.rhino.Node...)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 33)",
        "(line 75,col 5)-(line 78,col 5)",
        "(line 79,col 5)-(line 79,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.paramList(java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 33)",
        "(line 84,col 5)-(line 87,col 5)",
        "(line 88,col 5)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.block()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 39)",
        "(line 93,col 5)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.block(com.google.javascript.rhino.Node)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 51)",
        "(line 98,col 5)-(line 98,col 45)",
        "(line 99,col 5)-(line 99,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.block(com.google.javascript.rhino.Node...)",
      "begin_line": 102,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 25)",
        "(line 104,col 5)-(line 107,col 5)",
        "(line 108,col 5)-(line 108,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.block(java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 111,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 29)",
        "(line 113,col 5)-(line 116,col 5)",
        "(line 117,col 5)-(line 117,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.blockUnchecked(com.google.javascript.rhino.Node)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.script()",
      "begin_line": 124,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 40)",
        "(line 127,col 5)-(line 127,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.script(com.google.javascript.rhino.Node...)",
      "begin_line": 130,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 26)",
        "(line 132,col 5)-(line 135,col 5)",
        "(line 136,col 5)-(line 136,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.script(java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 139,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 30)",
        "(line 141,col 5)-(line 144,col 5)",
        "(line 145,col 5)-(line 145,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.var(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 148,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 67)",
        "(line 150,col 5)-(line 150,col 53)",
        "(line 151,col 5)-(line 151,col 32)",
        "(line 152,col 5)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.var(com.google.javascript.rhino.Node)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 44)",
        "(line 157,col 5)-(line 157,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.returnNode()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.returnNode(com.google.javascript.rhino.Node)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 52)",
        "(line 166,col 5)-(line 166,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.throwNode(com.google.javascript.rhino.Node)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 52)",
        "(line 171,col 5)-(line 171,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.Node)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 52)",
        "(line 176,col 5)-(line 176,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.ifNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 52)",
        "(line 181,col 5)-(line 181,col 45)",
        "(line 182,col 5)-(line 182,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.ifNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 185,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 52)",
        "(line 187,col 5)-(line 187,col 45)",
        "(line 188,col 5)-(line 188,col 49)",
        "(line 189,col 5)-(line 189,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.doNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 192,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 45)",
        "(line 194,col 5)-(line 194,col 52)",
        "(line 195,col 5)-(line 195,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.forIn(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 198,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 72)",
        "(line 200,col 5)-(line 200,col 52)",
        "(line 201,col 5)-(line 201,col 45)",
        "(line 202,col 5)-(line 202,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.forNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 205,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 75)",
        "(line 207,col 5)-(line 207,col 59)",
        "(line 208,col 5)-(line 208,col 59)",
        "(line 209,col 5)-(line 209,col 45)",
        "(line 210,col 5)-(line 210,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.switchNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node...)",
      "begin_line": 213,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 52)",
        "(line 215,col 5)-(line 215,col 51)",
        "(line 216,col 5)-(line 219,col 5)",
        "(line 220,col 5)-(line 220,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.caseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 223,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 52)",
        "(line 225,col 5)-(line 225,col 45)",
        "(line 226,col 5)-(line 226,col 57)",
        "(line 227,col 5)-(line 227,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.defaultCase(com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 45)",
        "(line 232,col 5)-(line 232,col 57)",
        "(line 233,col 5)-(line 233,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.label(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 236,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 49)",
        "(line 239,col 5)-(line 239,col 51)",
        "(line 240,col 5)-(line 240,col 51)",
        "(line 241,col 5)-(line 241,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.labelName(java.lang.String)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 46)",
        "(line 246,col 5)-(line 246,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.tryFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 249,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 48)",
        "(line 251,col 5)-(line 251,col 52)",
        "(line 252,col 5)-(line 252,col 58)",
        "(line 253,col 5)-(line 253,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.tryCatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 256,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 48)",
        "(line 258,col 5)-(line 258,col 50)",
        "(line 259,col 5)-(line 259,col 78)",
        "(line 260,col 5)-(line 260,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.tryCatchFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 263,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 52)",
        "(line 266,col 5)-(line 266,col 48)",
        "(line 267,col 5)-(line 267,col 40)",
        "(line 268,col 5)-(line 268,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.catchNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 271,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 44)",
        "(line 273,col 5)-(line 273,col 45)",
        "(line 274,col 5)-(line 274,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.breakNode()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.breakNode(com.google.javascript.rhino.Node)",
      "begin_line": 281,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 49)",
        "(line 284,col 5)-(line 284,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.continueNode()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.continueNode(com.google.javascript.rhino.Node)",
      "begin_line": 291,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 293,col 49)",
        "(line 294,col 5)-(line 294,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.call(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node...)",
      "begin_line": 300,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 301,col 45)",
        "(line 302,col 5)-(line 305,col 5)",
        "(line 306,col 5)-(line 306,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.newNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node...)",
      "begin_line": 309,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 47)",
        "(line 311,col 5)-(line 314,col 5)",
        "(line 315,col 5)-(line 315,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.name(java.lang.String)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.getprop(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 322,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 323,col 5)-(line 323,col 54)",
        "(line 324,col 5)-(line 324,col 46)",
        "(line 325,col 5)-(line 325,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.getelem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 328,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 54)",
        "(line 330,col 5)-(line 330,col 52)",
        "(line 331,col 5)-(line 331,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 334,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 57)",
        "(line 336,col 5)-(line 336,col 52)",
        "(line 337,col 5)-(line 337,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.hook(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 340,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 341,col 5)-(line 341,col 52)",
        "(line 342,col 5)-(line 342,col 55)",
        "(line 343,col 5)-(line 343,col 56)",
        "(line 344,col 5)-(line 344,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.comma(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 348,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.and(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 351,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.or(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 356,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.not(com.google.javascript.rhino.Node)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.eq(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n   * \"\u003d\u003d\"\n   ",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.sheq(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n   * \"\u003d\u003d\u003d\"\n   ",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.voidNode(com.google.javascript.rhino.Node)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.neg(com.google.javascript.rhino.Node)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 382,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.pos(com.google.javascript.rhino.Node)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.cast(com.google.javascript.rhino.Node)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 390,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.add(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 5)-(line 394,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.sub(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 5)-(line 398,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.objectlit(com.google.javascript.rhino.Node...)",
      "begin_line": 404,
      "end_line": 414,
      "comment": " literals",
      "child_ranges": [
        "(line 405,col 5)-(line 405,col 47)",
        "(line 406,col 5)-(line 412,col 5)",
        "(line 413,col 5)-(line 413,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.propdef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 418,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 51)",
        "(line 420,col 5)-(line 420,col 52)",
        "(line 421,col 5)-(line 421,col 53)",
        "(line 422,col 5)-(line 422,col 34)",
        "(line 423,col 5)-(line 423,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.arraylit(com.google.javascript.rhino.Node...)",
      "begin_line": 426,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 45)",
        "(line 428,col 5)-(line 431,col 5)",
        "(line 432,col 5)-(line 432,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.regexp(com.google.javascript.rhino.Node)",
      "begin_line": 435,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 436,col 5)-(line 436,col 46)",
        "(line 437,col 5)-(line 437,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.regexp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 440,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 441,col 5)-(line 441,col 46)",
        "(line 442,col 5)-(line 442,col 47)",
        "(line 443,col 5)-(line 443,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.string(java.lang.String)",
      "begin_line": 446,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 447,col 5)-(line 447,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.stringKey(java.lang.String)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 5)-(line 451,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.number(double)",
      "begin_line": 454,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 455,col 5)-(line 455,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.thisNode()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 459,col 5)-(line 459,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.trueNode()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 5)-(line 463,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.falseNode()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 5)-(line 467,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.nullNode()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 5)-(line 471,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.binaryOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 476,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 53)",
        "(line 478,col 5)-(line 478,col 53)",
        "(line 479,col 5)-(line 479,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.unaryOp(int, com.google.javascript.rhino.Node)",
      "begin_line": 482,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 483,col 5)-(line 483,col 52)",
        "(line 484,col 5)-(line 484,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)",
      "begin_line": 487,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 5)-(line 488,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.isAssignmentTarget(com.google.javascript.rhino.Node)",
      "begin_line": 491,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.mayBeStatementNoReturn(com.google.javascript.rhino.Node)",
      "begin_line": 503,
      "end_line": 532,
      "comment": "\n   * It isn\u0027t possible to always determine if a detached node is a expression,\n   * so make a best guess.\n   ",
      "child_ranges": [
        "(line 504,col 5)-(line 531,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.mayBeStatement(com.google.javascript.rhino.Node)",
      "begin_line": 538,
      "end_line": 543,
      "comment": "\n   * It isn\u0027t possible to always determine if a detached node is a expression,\n   * so make a best guess.\n   ",
      "child_ranges": [
        "(line 539,col 5)-(line 541,col 5)",
        "(line 542,col 5)-(line 542,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.IR.mayBeExpression(com.google.javascript.rhino.Node)",
      "begin_line": 549,
      "end_line": 622,
      "comment": "\n   * It isn\u0027t possible to always determine if a detached node is a expression,\n   * so make a best guess.\n   ",
      "child_ranges": [
        "(line 550,col 5)-(line 621,col 5)"
      ]
    }
  ]
}