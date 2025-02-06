{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ReplaceCssNamesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceCssNamesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 35,
      "end_line": 314,
      "comment": "\n * Tests for ReplaceCssNames.java.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "useReplacementMap"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Whether to pass the map of replacements as opposed to null "
    },
    {
      "type": "field",
      "varNames": [
        "replacementMap"
      ],
      "begin_line": 40,
      "end_line": 49,
      "comment": " Map of replacements to use during the test. "
    },
    {
      "type": "field",
      "varNames": [
        "replacementMapFull"
      ],
      "begin_line": 51,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renamingMap"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cssNames"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.ReplaceCssNamesTest()",
      "begin_line": 66,
      "end_line": 67,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 69,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 75,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.Anonymous-a3c5e947-e766-4e9d-942a-200148eb844e.getCssRenamingMap()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.getPartialMap()",
      "begin_line": 78,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 83,col 6)",
        "(line 84,col 5)-(line 84,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.Anonymous-ce9a5476-82a4-49df-a73b-520b8bd48546.get(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.getFullMap()",
      "begin_line": 87,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 92,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.Anonymous-4fdbba29-9135-4872-b9de-295f889fa6e0.get(java.lang.String)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.setUp()",
      "begin_line": 95,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 18)",
        "(line 98,col 5)-(line 98,col 38)",
        "(line 99,col 5)-(line 99,col 33)",
        "(line 100,col 5)-(line 100,col 29)",
        "(line 101,col 5)-(line 101,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.getNumRepetitions()",
      "begin_line": 104,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testDoNotUseReplacementMap()",
      "begin_line": 111,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 30)",
        "(line 113,col 5)-(line 114,col 41)",
        "(line 115,col 5)-(line 116,col 55)",
        "(line 117,col 5)-(line 118,col 41)",
        "(line 119,col 5)-(line 127,col 17)",
        "(line 128,col 5)-(line 128,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testOneArgWithUnknownStringLiterals()",
      "begin_line": 131,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 133,col 60)",
        "(line 134,col 5)-(line 135,col 63)",
        "(line 136,col 5)-(line 137,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testOneArgWithSimpleStringLiterals()",
      "begin_line": 140,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 142,col 24)",
        "(line 143,col 5)-(line 144,col 31)",
        "(line 145,col 5)-(line 146,col 26)",
        "(line 147,col 5)-(line 152,col 17)",
        "(line 153,col 5)-(line 153,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testOneArgWithCompositeClassNames()",
      "begin_line": 156,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 158,col 28)",
        "(line 159,col 5)-(line 160,col 35)",
        "(line 161,col 5)-(line 162,col 28)",
        "(line 163,col 5)-(line 171,col 17)",
        "(line 172,col 5)-(line 172,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testOneArgWithCompositeClassNamesFull()",
      "begin_line": 175,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 31)",
        "(line 178,col 5)-(line 179,col 24)",
        "(line 180,col 5)-(line 181,col 26)",
        "(line 182,col 5)-(line 183,col 24)",
        "(line 184,col 5)-(line 185,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testOneArgWithCompositeClassNamesWithUnknownParts()",
      "begin_line": 188,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 190,col 71)",
        "(line 191,col 5)-(line 193,col 39)",
        "(line 194,col 5)-(line 195,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testTwoArgsWithStringLiterals()",
      "begin_line": 198,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 200,col 48)",
        "(line 201,col 5)-(line 202,col 62)",
        "(line 203,col 5)-(line 204,col 48)",
        "(line 205,col 5)-(line 206,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testTwoArsWithVariableFirstArg()",
      "begin_line": 209,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 211,col 37)",
        "(line 212,col 5)-(line 213,col 50)",
        "(line 214,col 5)-(line 215,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testTwoArgsWithVariableFirstArgFull()",
      "begin_line": 218,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 31)",
        "(line 221,col 5)-(line 222,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testZeroArguments()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 227,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testManyArguments()",
      "begin_line": 230,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 232,col 53)",
        "(line 233,col 5)-(line 234,col 53)",
        "(line 235,col 5)-(line 236,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testNonStringArgument()",
      "begin_line": 239,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 241,col 55)",
        "(line 242,col 5)-(line 243,col 55)",
        "(line 244,col 5)-(line 245,col 55)",
        "(line 246,col 5)-(line 247,col 55)",
        "(line 248,col 5)-(line 249,col 55)",
        "(line 250,col 5)-(line 251,col 55)",
        "(line 253,col 5)-(line 254,col 55)",
        "(line 255,col 5)-(line 256,col 55)",
        "(line 257,col 5)-(line 258,col 55)",
        "(line 259,col 5)-(line 260,col 55)",
        "(line 261,col 5)-(line 262,col 55)",
        "(line 263,col 5)-(line 264,col 55)",
        "(line 265,col 5)-(line 266,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testNoSymbolMapStripsCallAndDoesntIssueWarnings()",
      "begin_line": 269,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 80)",
        "(line 271,col 5)-(line 271,col 39)",
        "(line 272,col 5)-(line 275,col 6)",
        "(line 276,col 5)-(line 276,col 39)",
        "(line 277,col 5)-(line 277,col 46)",
        "(line 278,col 5)-(line 278,col 30)",
        "(line 279,col 5)-(line 279,col 73)",
        "(line 280,col 5)-(line 280,col 33)",
        "(line 281,col 5)-(line 281,col 73)",
        "(line 282,col 5)-(line 282,col 75)",
        "(line 283,col 5)-(line 283,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.Anonymous-4248bc4a-a50f-42c6-a682-0183ae05c425.printSummary()",
      "begin_line": 273,
      "end_line": 273,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.Anonymous-83a3ca84-e4ac-4170-b3a8-7b851af7ec96.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 274,
      "end_line": 274,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testWhitelistByPart()",
      "begin_line": 286,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 60)",
        "(line 288,col 5)-(line 289,col 27)",
        "(line 290,col 5)-(line 291,col 31)",
        "(line 293,col 5)-(line 294,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testWhitelistByWhole()",
      "begin_line": 297,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 298,col 55)",
        "(line 299,col 5)-(line 299,col 31)",
        "(line 300,col 5)-(line 301,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNamesTest.testWhitelistWithDashes()",
      "begin_line": 304,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 305,col 5)-(line 305,col 57)",
        "(line 306,col 5)-(line 307,col 23)",
        "(line 308,col 5)-(line 309,col 23)",
        "(line 310,col 5)-(line 311,col 35)"
      ]
    }
  ]
}