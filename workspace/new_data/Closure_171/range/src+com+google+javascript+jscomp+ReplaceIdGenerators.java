{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ReplaceIdGenerators.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceIdGenerators",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 43,
      "end_line": 464,
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
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_GENERATOR_ID_MAPPING"
      ],
      "begin_line": 60,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_NAME_MAP_FOR_GENERATOR"
      ],
      "begin_line": 65,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerators"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "consistNameMap"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idGeneratorMaps"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousMap"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNIQUE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "UniqueRenamingToken",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.RenamingMap"
      ],
      "begin_line": 81,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.UniqueRenamingToken.get(java.lang.String)",
      "begin_line": 82,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 82,col 49)-(line 82,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ReplaceIdGenerators(com.google.javascript.jscomp.AbstractCompiler, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.RenamingMap\u003e, boolean, java.lang.String)",
      "begin_line": 85,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 29)",
        "(line 90,col 5)-(line 90,col 51)",
        "(line 91,col 5)-(line 91,col 45)",
        "(line 92,col 5)-(line 92,col 46)",
        "(line 93,col 5)-(line 93,col 45)",
        "(line 95,col 5)-(line 95,col 51)",
        "(line 96,col 5)-(line 96,col 62)",
        "(line 97,col 5)-(line 97,col 35)",
        "(line 99,col 5)-(line 114,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameSupplier",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 124,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier.getName(java.lang.String, java.lang.String)",
      "begin_line": 125,
      "end_line": 125,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier.getRenameStrategy()",
      "begin_line": 126,
      "end_line": 126,
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
      "begin_line": 129,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousMappings"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameStrategy"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ObfuscatedNameSuppier.ObfuscatedNameSuppier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy, com.google.common.collect.BiMap\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 134,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 136,col 57)",
        "(line 137,col 7)-(line 138,col 65)",
        "(line 139,col 7)-(line 139,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ObfuscatedNameSuppier.getName(java.lang.String, java.lang.String)",
      "begin_line": 142,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 48)",
        "(line 145,col 7)-(line 147,col 7)",
        "(line 148,col 7)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ObfuscatedNameSuppier.getRenameStrategy()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 7)-(line 153,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PseudoNameSuppier",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier"
      ],
      "begin_line": 157,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameStrategy"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.PseudoNameSuppier.PseudoNameSuppier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 162,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.PseudoNameSuppier.getName(java.lang.String, java.lang.String)",
      "begin_line": 165,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 167,col 7)-(line 169,col 7)",
        "(line 170,col 7)-(line 170,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.PseudoNameSuppier.getRenameStrategy()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 7)-(line 175,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StableNameSupplier",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier"
      ],
      "begin_line": 179,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.StableNameSupplier.getName(java.lang.String, java.lang.String)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.StableNameSupplier.getRenameStrategy()",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 7)-(line 186,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappedNameSupplier",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier"
      ],
      "begin_line": 190,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.MappedNameSupplier.MappedNameSupplier(com.google.javascript.jscomp.RenamingMap)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 7)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.MappedNameSupplier.getName(java.lang.String, java.lang.String)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 7)-(line 199,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.MappedNameSupplier.getRenameStrategy()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 7)-(line 204,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.createNameSupplier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy, com.google.common.collect.BiMap\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 208,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 212,col 44)",
        "(line 213,col 5)-(line 219,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.createNameSupplier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy, com.google.javascript.jscomp.RenamingMap)",
      "begin_line": 222,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 70)",
        "(line 225,col 5)-(line 225,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherGenerators",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 228,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.GatherGenerators.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 232,col 7)-(line 232,col 39)",
        "(line 233,col 7)-(line 235,col 7)",
        "(line 237,col 7)-(line 241,col 46)",
        "(line 242,col 7)-(line 246,col 7)",
        "(line 248,col 7)-(line 248,col 25)",
        "(line 249,col 7)-(line 258,col 7)",
        "(line 260,col 7)-(line 284,col 7)",
        "(line 285,col 7)-(line 285,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 289,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 291,col 67)",
        "(line 292,col 5)-(line 294,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReplaceGenerators",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 297,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ReplaceGenerators.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 298,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 300,col 7)-(line 302,col 7)",
        "(line 304,col 7)-(line 304,col 61)",
        "(line 305,col 7)-(line 305,col 64)",
        "(line 306,col 7)-(line 308,col 7)",
        "(line 310,col 7)-(line 315,col 7)",
        "(line 317,col 7)-(line 325,col 7)",
        "(line 327,col 7)-(line 327,col 45)",
        "(line 329,col 7)-(line 345,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.ReplaceGenerators.getObfuscatedName(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier, java.lang.String)",
      "begin_line": 349,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 351,col 7)-(line 351,col 27)",
        "(line 352,col 7)-(line 352,col 73)",
        "(line 353,col 7)-(line 354,col 80)",
        "(line 355,col 7)-(line 364,col 7)",
        "(line 365,col 7)-(line 365,col 45)",
        "(line 366,col 7)-(line 366,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.getSerializedIdMappings()",
      "begin_line": 375,
      "end_line": 394,
      "comment": "\n   * @return The serialize map of generators and their ids and their\n   *     replacements.\n   ",
      "child_ranges": [
        "(line 376,col 5)-(line 376,col 43)",
        "(line 377,col 5)-(line 392,col 5)",
        "(line 393,col 5)-(line 393,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.parsePreviousResults(java.lang.String)",
      "begin_line": 396,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 409,col 5)",
        "(line 411,col 5)-(line 411,col 69)",
        "(line 412,col 5)-(line 412,col 80)",
        "(line 413,col 5)-(line 413,col 51)",
        "(line 415,col 5)-(line 415,col 16)",
        "(line 416,col 5)-(line 416,col 22)",
        "(line 417,col 5)-(line 447,col 5)",
        "(line 448,col 5)-(line 448,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.reportInvalidLine(java.lang.String, int)",
      "begin_line": 451,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 452,col 5)-(line 453,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGenerators.getIdForGeneratorNode(boolean, com.google.javascript.rhino.Node)",
      "begin_line": 456,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 62)",
        "(line 458,col 5)-(line 462,col 5)"
      ]
    }
  ]
}