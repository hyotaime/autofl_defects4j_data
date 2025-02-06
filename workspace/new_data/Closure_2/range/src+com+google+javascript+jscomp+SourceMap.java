{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SourceMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMap",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 209,
      "comment": "\n * Collects information mapping the generated (compiled) source back to\n * its original source for debugging purposes.\n *\n * @see CodeConsumer\n * @see CodeGenerator\n * @see CodePrinter\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.Format.getInstance()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 10)-(line 49,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.Format.getInstance()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 54,col 10)-(line 55,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.Format.getInstance()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 10)-(line 61,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.Format.getInstance()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 10)-(line 67,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.Format.getInstance()",
      "begin_line": 70,
      "end_line": 70,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.DetailLevel.apply(com.google.javascript.rhino.Node)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.DetailLevel.apply(com.google.javascript.rhino.Node)",
      "begin_line": 87,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 94,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocationMapping",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 99,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacement"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SourceMap.LocationMapping.LocationMapping(java.lang.String, java.lang.String)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 7)-(line 103,col 27)",
        "(line 104,col 7)-(line 104,col 37)"
      ]
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
        "prefixMappings"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceLocationFixupCache"
      ],
      "begin_line": 110,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SourceMap.SourceMap(com.google.debugging.sourcemap.SourceMapGenerator)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.addMapping(com.google.javascript.rhino.Node, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 117,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 49)",
        "(line 126,col 5)-(line 128,col 5)",
        "(line 130,col 5)-(line 130,col 49)",
        "(line 132,col 5)-(line 132,col 72)",
        "(line 138,col 5)-(line 138,col 27)",
        "(line 139,col 5)-(line 142,col 5)",
        "(line 144,col 5)-(line 147,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.fixupSourceLocation(java.lang.String)",
      "begin_line": 154,
      "end_line": 180,
      "comment": "\n   * @param sourceFile The source file location to fixup.\n   * @return a remapped source file.\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 157,col 5)",
        "(line 159,col 5)-(line 159,col 60)",
        "(line 160,col 5)-(line 162,col 5)",
        "(line 165,col 5)-(line 171,col 5)",
        "(line 174,col 5)-(line 176,col 5)",
        "(line 178,col 5)-(line 178,col 52)",
        "(line 179,col 5)-(line 179,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.appendTo(java.lang.Appendable, java.lang.String)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.reset()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 22)",
        "(line 188,col 5)-(line 188,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.setStartingPosition(int, int)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.setWrapperPrefix(java.lang.String)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.validate(boolean)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceMap.setPrefixMappings(java.util.List\u003ccom.google.javascript.jscomp.SourceMap.LocationMapping\u003e)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n   * @param sourceMapLocationMappings\n   ",
      "child_ranges": [
        "(line 207,col 6)-(line 207,col 53)"
      ]
    }
  ]
}