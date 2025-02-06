{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/GlobalVarReferenceMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GlobalVarReferenceMapTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 197,
      "comment": "\n * Unit-tests for the GlobalVarReferenceMap class.\n *\n * @author bashir@google.com (Bashir Sadjad)\n "
    },
    {
      "type": "field",
      "varNames": [
        "INPUT1"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INPUT2"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INPUT3"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTERN1"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalMap"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalScope"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scriptRoot"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR1"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " (in second input and first extern)"
    },
    {
      "type": "field",
      "varNames": [
        "VAR2"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR3"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var1Refs"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var2Refs"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var3Refs"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var1In1Ref"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var1In2Ref"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var1In3Ref"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var2In1Ref"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var2In3Ref"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var3In2Ref"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var3In1Ext"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMapTest.setUp()",
      "begin_line": 73,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 18)",
        "(line 76,col 5)-(line 76,col 66)",
        "(line 77,col 5)-(line 78,col 32)",
        "(line 79,col 5)-(line 79,col 66)",
        "(line 80,col 5)-(line 80,col 69)",
        "(line 81,col 5)-(line 81,col 67)",
        "(line 82,col 5)-(line 82,col 69)",
        "(line 86,col 5)-(line 86,col 65)",
        "(line 87,col 5)-(line 87,col 70)",
        "(line 88,col 5)-(line 88,col 65)",
        "(line 89,col 5)-(line 89,col 70)",
        "(line 90,col 5)-(line 90,col 65)",
        "(line 91,col 5)-(line 91,col 70)",
        "(line 92,col 5)-(line 92,col 58)",
        "(line 93,col 5)-(line 93,col 58)",
        "(line 94,col 5)-(line 94,col 58)",
        "(line 95,col 5)-(line 95,col 51)",
        "(line 96,col 5)-(line 96,col 47)",
        "(line 97,col 5)-(line 97,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMapTest.testUpdateGlobalVarReferences_ResetReferences()",
      "begin_line": 101,
      "end_line": 112,
      "comment": " Tests whether the global variable references are set/reset properly. ",
      "child_ranges": [
        "(line 103,col 5)-(line 111,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMapTest.testUpdateGlobalVarReferences_UpdateScriptNoRef()",
      "begin_line": 115,
      "end_line": 127,
      "comment": " Removes all variable references in second script. ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 64)",
        "(line 117,col 5)-(line 117,col 57)",
        "(line 118,col 5)-(line 118,col 75)",
        "(line 119,col 5)-(line 119,col 55)",
        "(line 120,col 5)-(line 120,col 55)",
        "(line 121,col 5)-(line 121,col 44)",
        "(line 122,col 5)-(line 122,col 69)",
        "(line 123,col 5)-(line 123,col 69)",
        "(line 124,col 5)-(line 124,col 55)",
        "(line 125,col 5)-(line 125,col 44)",
        "(line 126,col 5)-(line 126,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMapTest.testUpdateGlobalVarReferences_UpdateScriptNewRefs()",
      "begin_line": 130,
      "end_line": 163,
      "comment": " Changes variable references in second script. ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 64)",
        "(line 133,col 5)-(line 133,col 64)",
        "(line 134,col 5)-(line 134,col 55)",
        "(line 135,col 5)-(line 135,col 63)",
        "(line 137,col 5)-(line 137,col 64)",
        "(line 138,col 5)-(line 138,col 55)",
        "(line 139,col 5)-(line 139,col 63)",
        "(line 141,col 5)-(line 141,col 64)",
        "(line 142,col 5)-(line 142,col 55)",
        "(line 143,col 5)-(line 143,col 63)",
        "(line 145,col 5)-(line 145,col 57)",
        "(line 146,col 5)-(line 146,col 57)",
        "(line 147,col 5)-(line 147,col 57)",
        "(line 148,col 5)-(line 148,col 57)",
        "(line 149,col 5)-(line 149,col 75)",
        "(line 150,col 5)-(line 150,col 44)",
        "(line 151,col 5)-(line 151,col 69)",
        "(line 152,col 5)-(line 152,col 56)",
        "(line 153,col 5)-(line 153,col 69)",
        "(line 154,col 5)-(line 154,col 55)",
        "(line 155,col 5)-(line 155,col 44)",
        "(line 156,col 5)-(line 156,col 69)",
        "(line 157,col 5)-(line 157,col 56)",
        "(line 158,col 5)-(line 158,col 69)",
        "(line 159,col 5)-(line 159,col 55)",
        "(line 160,col 5)-(line 160,col 44)",
        "(line 161,col 5)-(line 161,col 69)",
        "(line 162,col 5)-(line 162,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMapTest.testUpdateGlobalVarReferences_UpdateScriptNewVar()",
      "begin_line": 166,
      "end_line": 178,
      "comment": " Changes variable references in second script. ",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 64)",
        "(line 168,col 5)-(line 168,col 31)",
        "(line 169,col 5)-(line 169,col 66)",
        "(line 170,col 5)-(line 170,col 64)",
        "(line 171,col 5)-(line 171,col 55)",
        "(line 172,col 5)-(line 172,col 63)",
        "(line 173,col 5)-(line 173,col 57)",
        "(line 174,col 5)-(line 174,col 57)",
        "(line 175,col 5)-(line 175,col 75)",
        "(line 176,col 5)-(line 176,col 44)",
        "(line 177,col 5)-(line 177,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMapTest.testUpdateReferencesWithGlobalScope()",
      "begin_line": 180,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 57)",
        "(line 182,col 5)-(line 182,col 56)",
        "(line 183,col 5)-(line 184,col 52)",
        "(line 185,col 5)-(line 187,col 5)",
        "(line 188,col 5)-(line 188,col 61)",
        "(line 189,col 5)-(line 191,col 5)",
        "(line 192,col 5)-(line 192,col 61)",
        "(line 193,col 5)-(line 195,col 5)"
      ]
    }
  ]
}