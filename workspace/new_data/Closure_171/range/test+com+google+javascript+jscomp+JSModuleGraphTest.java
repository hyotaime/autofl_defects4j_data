{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/JSModuleGraphTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSModuleGraphTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 352,
      "comment": "\n * Tests for {@link JSModuleGraph}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "A"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "B"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "C"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "F"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " For resolving dependencies only."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.setUp()",
      "begin_line": 48,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 18)",
        "(line 51,col 5)-(line 51,col 23)",
        "(line 52,col 5)-(line 52,col 23)",
        "(line 53,col 5)-(line 53,col 23)",
        "(line 54,col 5)-(line 54,col 23)",
        "(line 55,col 5)-(line 55,col 23)",
        "(line 56,col 5)-(line 56,col 23)",
        "(line 57,col 5)-(line 57,col 23)",
        "(line 58,col 5)-(line 58,col 23)",
        "(line 59,col 5)-(line 59,col 65)",
        "(line 60,col 5)-(line 60,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testModuleDepth()",
      "begin_line": 63,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 59)",
        "(line 65,col 5)-(line 65,col 59)",
        "(line 66,col 5)-(line 66,col 59)",
        "(line 67,col 5)-(line 67,col 59)",
        "(line 68,col 5)-(line 68,col 59)",
        "(line 69,col 5)-(line 69,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testDeepestCommonDep()",
      "begin_line": 72,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 39)",
        "(line 74,col 5)-(line 74,col 39)",
        "(line 75,col 5)-(line 75,col 39)",
        "(line 76,col 5)-(line 76,col 39)",
        "(line 77,col 5)-(line 77,col 39)",
        "(line 78,col 5)-(line 78,col 39)",
        "(line 79,col 5)-(line 79,col 36)",
        "(line 80,col 5)-(line 80,col 36)",
        "(line 81,col 5)-(line 81,col 36)",
        "(line 82,col 5)-(line 82,col 36)",
        "(line 83,col 5)-(line 83,col 36)",
        "(line 84,col 5)-(line 84,col 36)",
        "(line 85,col 5)-(line 85,col 36)",
        "(line 86,col 5)-(line 86,col 36)",
        "(line 87,col 5)-(line 87,col 36)",
        "(line 88,col 5)-(line 88,col 36)",
        "(line 89,col 5)-(line 89,col 36)",
        "(line 90,col 5)-(line 90,col 36)",
        "(line 91,col 5)-(line 91,col 36)",
        "(line 92,col 5)-(line 92,col 36)",
        "(line 93,col 5)-(line 93,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testDeepestCommonDepInclusive()",
      "begin_line": 96,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 45)",
        "(line 98,col 5)-(line 98,col 45)",
        "(line 99,col 5)-(line 99,col 45)",
        "(line 100,col 5)-(line 100,col 45)",
        "(line 101,col 5)-(line 101,col 45)",
        "(line 102,col 5)-(line 102,col 45)",
        "(line 103,col 5)-(line 103,col 45)",
        "(line 104,col 5)-(line 104,col 45)",
        "(line 105,col 5)-(line 105,col 45)",
        "(line 106,col 5)-(line 106,col 45)",
        "(line 107,col 5)-(line 107,col 45)",
        "(line 108,col 5)-(line 108,col 45)",
        "(line 109,col 5)-(line 109,col 45)",
        "(line 110,col 5)-(line 110,col 45)",
        "(line 111,col 5)-(line 111,col 45)",
        "(line 112,col 5)-(line 112,col 45)",
        "(line 113,col 5)-(line 113,col 45)",
        "(line 114,col 5)-(line 114,col 45)",
        "(line 115,col 5)-(line 115,col 45)",
        "(line 116,col 5)-(line 116,col 45)",
        "(line 117,col 5)-(line 117,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testGetTransitiveDepsDeepestFirst()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 40)",
        "(line 122,col 5)-(line 122,col 43)",
        "(line 123,col 5)-(line 123,col 43)",
        "(line 124,col 5)-(line 124,col 46)",
        "(line 125,col 5)-(line 125,col 49)",
        "(line 126,col 5)-(line 126,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testCoalesceDuplicateFiles()",
      "begin_line": 129,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 43)",
        "(line 132,col 5)-(line 132,col 43)",
        "(line 133,col 5)-(line 133,col 43)",
        "(line 135,col 5)-(line 135,col 43)",
        "(line 136,col 5)-(line 136,col 43)",
        "(line 138,col 5)-(line 138,col 43)",
        "(line 139,col 5)-(line 139,col 43)",
        "(line 141,col 5)-(line 141,col 35)",
        "(line 143,col 5)-(line 143,col 42)",
        "(line 144,col 5)-(line 144,col 57)",
        "(line 145,col 5)-(line 145,col 57)",
        "(line 146,col 5)-(line 146,col 42)",
        "(line 147,col 5)-(line 147,col 42)",
        "(line 148,col 5)-(line 148,col 57)",
        "(line 149,col 5)-(line 149,col 42)",
        "(line 150,col 5)-(line 150,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testManageDependencies1()",
      "begin_line": 153,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 63)",
        "(line 155,col 5)-(line 156,col 44)",
        "(line 158,col 5)-(line 158,col 32)",
        "(line 159,col 5)-(line 159,col 32)",
        "(line 160,col 5)-(line 160,col 20)",
        "(line 161,col 5)-(line 161,col 38)",
        "(line 163,col 5)-(line 165,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testManageDependencies2()",
      "begin_line": 168,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 63)",
        "(line 170,col 5)-(line 171,col 48)",
        "(line 173,col 5)-(line 173,col 32)",
        "(line 174,col 5)-(line 174,col 32)",
        "(line 175,col 5)-(line 175,col 32)",
        "(line 176,col 5)-(line 176,col 32)",
        "(line 178,col 5)-(line 180,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testManageDependencies3()",
      "begin_line": 183,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 63)",
        "(line 185,col 5)-(line 185,col 59)",
        "(line 186,col 5)-(line 186,col 42)",
        "(line 187,col 5)-(line 187,col 42)",
        "(line 188,col 5)-(line 188,col 40)",
        "(line 189,col 5)-(line 189,col 62)",
        "(line 190,col 5)-(line 191,col 28)",
        "(line 195,col 5)-(line 195,col 20)",
        "(line 196,col 5)-(line 196,col 20)",
        "(line 197,col 5)-(line 197,col 38)",
        "(line 198,col 5)-(line 198,col 20)",
        "(line 200,col 5)-(line 202,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testManageDependencies4()",
      "begin_line": 205,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 34)",
        "(line 207,col 5)-(line 207,col 59)",
        "(line 208,col 5)-(line 208,col 42)",
        "(line 210,col 5)-(line 210,col 54)",
        "(line 213,col 5)-(line 213,col 33)",
        "(line 214,col 5)-(line 214,col 33)",
        "(line 215,col 5)-(line 215,col 33)",
        "(line 216,col 5)-(line 216,col 33)",
        "(line 218,col 5)-(line 219,col 28)",
        "(line 221,col 5)-(line 221,col 38)",
        "(line 222,col 5)-(line 222,col 32)",
        "(line 223,col 5)-(line 223,col 32)",
        "(line 224,col 5)-(line 224,col 32)",
        "(line 226,col 5)-(line 229,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testNoFiles()",
      "begin_line": 232,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 59)",
        "(line 234,col 5)-(line 234,col 42)",
        "(line 236,col 5)-(line 236,col 54)",
        "(line 237,col 5)-(line 238,col 28)",
        "(line 239,col 5)-(line 239,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.testToJson()",
      "begin_line": 242,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 243,col 39)",
        "(line 244,col 5)-(line 244,col 38)",
        "(line 245,col 5)-(line 251,col 5)",
        "(line 252,col 5)-(line 252,col 44)",
        "(line 253,col 5)-(line 253,col 43)",
        "(line 254,col 5)-(line 254,col 71)",
        "(line 255,col 5)-(line 256,col 60)",
        "(line 257,col 5)-(line 257,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.setUpManageDependenciesTest()",
      "begin_line": 260,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 54)",
        "(line 263,col 5)-(line 263,col 50)",
        "(line 264,col 5)-(line 264,col 54)",
        "(line 265,col 5)-(line 265,col 50)",
        "(line 267,col 5)-(line 267,col 54)",
        "(line 268,col 5)-(line 268,col 56)",
        "(line 270,col 5)-(line 270,col 54)",
        "(line 271,col 5)-(line 271,col 54)",
        "(line 273,col 5)-(line 273,col 50)",
        "(line 274,col 5)-(line 274,col 50)",
        "(line 276,col 5)-(line 276,col 33)",
        "(line 277,col 5)-(line 277,col 33)",
        "(line 278,col 5)-(line 278,col 33)",
        "(line 279,col 5)-(line 279,col 33)",
        "(line 281,col 5)-(line 283,col 5)",
        "(line 284,col 5)-(line 284,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.assertInputs(com.google.javascript.jscomp.JSModule, java.lang.String...)",
      "begin_line": 287,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 290,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.sourceNames(java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 293,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 51)",
        "(line 295,col 5)-(line 297,col 5)",
        "(line 298,col 5)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.code(java.lang.String, java.util.List\u003cjava.lang.String\u003e, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 301,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 21)",
        "(line 304,col 5)-(line 306,col 5)",
        "(line 307,col 5)-(line 309,col 5)",
        "(line 310,col 5)-(line 310,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.provides(java.lang.String...)",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 5)-(line 314,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.requires(java.lang.String...)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 5)-(line 318,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.assertDeepestCommonDepInclusive(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 321,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 323,col 5)-(line 323,col 57)",
        "(line 324,col 5)-(line 324,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.assertDeepestCommonDep(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 327,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 58)",
        "(line 330,col 5)-(line 330,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.assertDeepestCommonDepOneWay(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule, boolean)",
      "begin_line": 333,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 337,col 49)",
        "(line 338,col 5)-(line 344,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraphTest.assertTransitiveDepsDeepestFirst(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule...)",
      "begin_line": 347,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 348,col 71)",
        "(line 349,col 5)-(line 350,col 77)"
      ]
    }
  ]
}