{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/RenamePropertiesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenamePropertiesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 26,
      "end_line": 416,
      "comment": "\n * {@link RenameProperties} tests.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 28,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameProperties"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useAffinity"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevUsedPropertyMap"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.RenamePropertiesTest()",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 19)",
        "(line 44,col 5)-(line 44,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.tearDown()",
      "begin_line": 47,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 21)",
        "(line 51,col 5)-(line 51,col 31)",
        "(line 52,col 5)-(line 52,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.getNumRepetitions()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPrototypeProperties()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 64,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPrototypePropertiesAsObjLitKeys1()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 69,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPrototypePropertiesAsObjLitKeys2()",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 53)",
        "(line 75,col 5)-(line 75,col 57)",
        "(line 77,col 5)-(line 78,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPrototypePropertiesAsObjLitKeys3()",
      "begin_line": 81,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 54)",
        "(line 84,col 5)-(line 84,col 58)",
        "(line 86,col 5)-(line 87,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testMixedQuotedAndUnquotedObjLitKeys1()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testMixedQuotedAndUnquotedObjLitKeys2()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testQuotedPrototypeProperty()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testOverlappingOriginalAndGeneratedNames()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 106,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testRenamePropertiesWithLeadingUnderscores()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 111,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPropertyAddedToObject()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 116,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPropertyAddedToFunction()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 121,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPropertyOfObjectOfUnknownType()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 126,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testSetPropertyOfThis()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 131,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testReadPropertyOfThis()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 136,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testObjectLiteralInLocalScope()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 141,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testIncorrectAttemptToAccessQuotedProperty()",
      "begin_line": 144,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 147,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testSetQuotedPropertyOfThis()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testExternedPropertyName()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 156,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testExternedPropertyNameDefinedByObjectLiteral()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 161,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testAvoidingConflictsBetweenQuotedAndUnquotedPropertyNames()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 166,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testSamePropertyNameQuotedAndUnquoted()",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 171,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testStaticAndInstanceMethodWithSameName()",
      "begin_line": 174,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 178,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testRenamePropertiesFunctionCall1()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 183,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testRenamePropertiesFunctionCall2()",
      "begin_line": 186,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 191,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testRemoveRenameFunctionStubs1()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 196,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testRemoveRenameFunctionStubs2()",
      "begin_line": 199,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 202,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testGeneratePseudoNames()",
      "begin_line": 205,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 31)",
        "(line 207,col 5)-(line 208,col 50)",
        "(line 209,col 5)-(line 209,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testModules()",
      "begin_line": 212,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 213,col 5)-(line 214,col 73)",
        "(line 216,col 5)-(line 217,col 73)",
        "(line 219,col 5)-(line 220,col 73)",
        "(line 222,col 5)-(line 222,col 42)",
        "(line 223,col 5)-(line 223,col 58)",
        "(line 225,col 5)-(line 225,col 42)",
        "(line 226,col 5)-(line 226,col 58)",
        "(line 228,col 5)-(line 228,col 42)",
        "(line 229,col 5)-(line 229,col 58)",
        "(line 231,col 5)-(line 231,col 70)",
        "(line 232,col 5)-(line 232,col 52)",
        "(line 234,col 5)-(line 234,col 41)",
        "(line 235,col 5)-(line 235,col 31)",
        "(line 237,col 5)-(line 239,col 45)",
        "(line 241,col 5)-(line 243,col 45)",
        "(line 251,col 5)-(line 253,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPropertyAffinity()",
      "begin_line": 256,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 23)",
        "(line 260,col 5)-(line 267,col 56)",
        "(line 269,col 5)-(line 276,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPropertyAffinityOff()",
      "begin_line": 279,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 280,col 5)-(line 280,col 24)",
        "(line 281,col 5)-(line 288,col 56)",
        "(line 290,col 5)-(line 297,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPrototypePropertiesStable()",
      "begin_line": 300,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 311,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPrototypePropertiesAsObjLitKeysStable()",
      "begin_line": 314,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 319,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testMixedQuotedAndUnquotedObjLitKeysStable()",
      "begin_line": 322,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 323,col 5)-(line 329,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testOverlappingOriginalAndGeneratedNamesStable()",
      "begin_line": 332,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 333,col 5)-(line 339,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testStableWithTrickyExternsChanges()",
      "begin_line": 342,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 343,col 5)-(line 344,col 73)",
        "(line 345,col 5)-(line 345,col 60)",
        "(line 346,col 5)-(line 346,col 41)",
        "(line 347,col 5)-(line 351,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testRenamePropertiesWithLeadingUnderscoresStable()",
      "begin_line": 354,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 359,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testPropertyAddedToObjectStable()",
      "begin_line": 362,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 363,col 5)-(line 366,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testAvoidingConflictsBetQuotedAndUnquotedPropertyNamesStable()",
      "begin_line": 369,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 374,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testRenamePropertiesFunctionCallStable()",
      "begin_line": 377,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 378,col 5)-(line 388,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.testStableRenaming(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 391,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 393,col 5)-(line 393,col 28)",
        "(line 394,col 5)-(line 394,col 60)",
        "(line 395,col 5)-(line 395,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.compileModules(java.lang.String, com.google.javascript.jscomp.JSModule[])",
      "begin_line": 398,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 399,col 5)-(line 399,col 70)",
        "(line 401,col 5)-(line 401,col 52)",
        "(line 402,col 5)-(line 402,col 67)",
        "(line 404,col 5)-(line 404,col 39)",
        "(line 405,col 5)-(line 406,col 78)",
        "(line 407,col 5)-(line 407,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePropertiesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 410,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 412,col 5)-(line 414,col 50)"
      ]
    }
  ]
}