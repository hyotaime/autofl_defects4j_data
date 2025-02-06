{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ReplaceIdGenerators.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceIdGenerators",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 43,
      "end_line": 390,
      "comment": "\n * Replaces calls to id generators with ids.\n *\n * Use this to get unique and short ids.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "NON_GLOBAL_ID_GENERATOR_CALL"
      ],
      "begin_line": 44,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONDITIONAL_ID_GENERATOR_CALL"
      ],
      "begin_line": 49,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONFLICTING_GENERATOR_TYPE"
      ],
      "begin_line": 54,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_GENERATOR_ID_MAPPING"
      ],
      "begin_line": 59,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerators"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "consistNameMap"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idGeneratorMaps"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousMap"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ReplaceIdGenerators(com.google.javascript.jscomp.AbstractCompiler, java.util.Set\u003cjava.lang.String\u003e, boolean, java.lang.String)",
      "begin_line": 73,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 29)",
        "(line 78,col 5)-(line 78,col 51)",
        "(line 79,col 5)-(line 79,col 45)",
        "(line 80,col 5)-(line 80,col 46)",
        "(line 81,col 5)-(line 81,col 45)",
        "(line 83,col 5)-(line 83,col 51)",
        "(line 84,col 5)-(line 84,col 62)",
        "(line 85,col 5)-(line 85,col 35)",
        "(line 87,col 5)-(line 93,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameSupplier",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 102,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier.getName(java.lang.String, java.lang.String)",
      "begin_line": 103,
      "end_line": 103,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier.getRenameStrategy()",
      "begin_line": 104,
      "end_line": 104,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ObfuscatedNameSuppier",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier"
      ],
      "begin_line": 107,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousMappings"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameStrategy"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ObfuscatedNameSuppier.ObfuscatedNameSuppier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy, com.google.common.collect.BiMap\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 114,col 7)-(line 114,col 57)",
        "(line 115,col 7)-(line 116,col 65)",
        "(line 117,col 7)-(line 117,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ObfuscatedNameSuppier.getName(java.lang.String, java.lang.String)",
      "begin_line": 120,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 122,col 7)-(line 122,col 48)",
        "(line 123,col 7)-(line 125,col 7)",
        "(line 126,col 7)-(line 126,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ObfuscatedNameSuppier.getRenameStrategy()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 131,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PseudoNameSuppier",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier"
      ],
      "begin_line": 135,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameStrategy"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.PseudoNameSuppier.PseudoNameSuppier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.PseudoNameSuppier.getName(java.lang.String, java.lang.String)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 145,col 7)-(line 147,col 7)",
        "(line 148,col 7)-(line 148,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.PseudoNameSuppier.getRenameStrategy()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 7)-(line 153,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StableNameSupplier",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier"
      ],
      "begin_line": 157,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.StableNameSupplier.getName(java.lang.String, java.lang.String)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 7)-(line 160,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.StableNameSupplier.getRenameStrategy()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.createNameSupplier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy, com.google.common.collect.BiMap\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 168,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 172,col 44)",
        "(line 173,col 5)-(line 179,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherGenerators",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 182,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.GatherGenerators.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 184,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 186,col 7)-(line 186,col 39)",
        "(line 187,col 7)-(line 189,col 7)",
        "(line 191,col 7)-(line 194,col 46)",
        "(line 195,col 7)-(line 199,col 7)",
        "(line 201,col 7)-(line 201,col 25)",
        "(line 202,col 7)-(line 211,col 7)",
        "(line 213,col 7)-(line 223,col 7)",
        "(line 224,col 7)-(line 224,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 228,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 67)",
        "(line 231,col 5)-(line 233,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReplaceGenerators",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 236,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ReplaceGenerators.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 237,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 239,col 7)-(line 241,col 7)",
        "(line 243,col 7)-(line 243,col 61)",
        "(line 244,col 7)-(line 244,col 64)",
        "(line 245,col 7)-(line 247,col 7)",
        "(line 249,col 7)-(line 254,col 7)",
        "(line 256,col 7)-(line 264,col 7)",
        "(line 266,col 7)-(line 266,col 44)",
        "(line 269,col 7)-(line 271,col 7)",
        "(line 273,col 7)-(line 273,col 73)",
        "(line 274,col 7)-(line 274,col 27)",
        "(line 276,col 7)-(line 276,col 35)",
        "(line 277,col 7)-(line 278,col 78)",
        "(line 279,col 7)-(line 288,col 7)",
        "(line 290,col 7)-(line 290,col 48)",
        "(line 291,col 7)-(line 291,col 45)",
        "(line 293,col 7)-(line 293,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.getSerializedIdMappings()",
      "begin_line": 301,
      "end_line": 320,
      "comment": "\n   * @return The serialize map of generators and their ids and their\n   *     replacements.\n   ",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 43)",
        "(line 303,col 5)-(line 318,col 5)",
        "(line 319,col 5)-(line 319,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.parsePreviousResults(java.lang.String)",
      "begin_line": 322,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 333,col 5)-(line 335,col 5)",
        "(line 337,col 5)-(line 337,col 69)",
        "(line 338,col 5)-(line 338,col 80)",
        "(line 339,col 5)-(line 339,col 51)",
        "(line 341,col 5)-(line 341,col 16)",
        "(line 342,col 5)-(line 342,col 22)",
        "(line 343,col 5)-(line 373,col 5)",
        "(line 374,col 5)-(line 374,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.reportInvalidLine(java.lang.String, int)",
      "begin_line": 377,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 378,col 5)-(line 379,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.getIdForGeneratorNode(boolean, com.google.javascript.rhino.Node)",
      "begin_line": 382,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 383,col 5)-(line 383,col 43)",
        "(line 384,col 5)-(line 388,col 5)"
      ]
    }
  ]
}