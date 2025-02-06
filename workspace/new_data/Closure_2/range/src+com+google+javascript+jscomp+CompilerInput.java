{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CompilerInput.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompilerInput",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceAst",
        "com.google.javascript.jscomp.deps.DependencyInfo"
      ],
      "begin_line": 39,
      "end_line": 363,
      "comment": "\n * A class for the internal representation of an input to the compiler.\n * Wraps a {@link SourceAst} and maintain state such as module for the input and\n * whether the input is an extern. Also calculates provided and required types.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Info about where the file lives."
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ast"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The AST."
    },
    {
      "type": "field",
      "varNames": [
        "provides"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Provided and required symbols."
    },
    {
      "type": "field",
      "varNames": [
        "requires"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatedDependencyInfoFromSource"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " We do not want to persist this across serialized state."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceAst)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceAst, boolean)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceAst, java.lang.String, boolean)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceAst, com.google.javascript.rhino.InputId, boolean)",
      "begin_line": 72,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 19)",
        "(line 74,col 5)-(line 74,col 22)",
        "(line 78,col 5)-(line 80,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceFile, boolean)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getInputId()",
      "begin_line": 92,
      "end_line": 95,
      "comment": " Returns a name for this input. Must be unique across all inputs. ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getName()",
      "begin_line": 98,
      "end_line": 101,
      "comment": " Returns a name for this input. Must be unique across all inputs. ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getAst()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getPathRelativeToClosureBase()",
      "begin_line": 108,
      "end_line": 112,
      "comment": " Gets the path relative to closure-base, if one is available. ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getAstRoot(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 114,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 41)",
        "(line 118,col 5)-(line 121,col 5)",
        "(line 122,col 5)-(line 122,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.clearAst()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getSourceFile()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.setSourceFile(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getSourceAst()",
      "begin_line": 141,
      "end_line": 143,
      "comment": " Returns the SourceAst object on which this input is based. ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.setCompiler(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 146,
      "end_line": 148,
      "comment": " Sets an abstract compiler for doing parsing. ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.checkErrorManager()",
      "begin_line": 150,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 152,col 60)",
        "(line 153,col 5)-(line 154,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getRequires()",
      "begin_line": 158,
      "end_line": 169,
      "comment": " Gets a list of types depended on by this input. ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 24)",
        "(line 161,col 5)-(line 168,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getProvides()",
      "begin_line": 172,
      "end_line": 183,
      "comment": " Gets a list of types provided by this input. ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 24)",
        "(line 175,col 5)-(line 182,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.addProvide(java.lang.String)",
      "begin_line": 187,
      "end_line": 190,
      "comment": " there is better support for discovering non-closure dependencies.",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 18)",
        "(line 189,col 5)-(line 189,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.addRequire(java.lang.String)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 18)",
        "(line 194,col 5)-(line 194,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.removeRequire(java.lang.String)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 18)",
        "(line 199,col 5)-(line 199,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.regenerateDependencyInfoIfNecessary()",
      "begin_line": 205,
      "end_line": 250,
      "comment": "\n   * Regenerates the provides/requires if we need to do so.\n   ",
      "child_ranges": [
        "(line 208,col 5)-(line 249,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DepsFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 252,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "provides"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requires"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 255,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.DepsFinder.visitTree(com.google.javascript.rhino.Node)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.DepsFinder.visitSubtree(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 262,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 263,col 7)-(line 280,col 7)",
        "(line 282,col 7)-(line 285,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getLine(int)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n   * Gets the source line for the indicated line number.\n   *\n   * @param lineNumber the line number, 1 being the first line of the file.\n   * @return The line indicated. Does not include the newline at the end\n   *     of the file. Returns {@code null} if it does not exist,\n   *     or if there was an IO exception.\n   ",
      "child_ranges": [
        "(line 298,col 5)-(line 298,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getRegion(int)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n   * Get a region around the indicated line number. The exact definition of a\n   * region is implementation specific, but it must contain the line indicated\n   * by the line number. A region must not start or end by a carriage return.\n   *\n   * @param lineNumber the line number, 1 being the first line of the file.\n   * @return The line indicated. Returns {@code null} if it does not exist,\n   *     or if there was an IO exception.\n   ",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getCode()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getModule()",
      "begin_line": 319,
      "end_line": 321,
      "comment": " Returns the module to which the input belongs. ",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.setModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 324,
      "end_line": 329,
      "comment": " Sets the module to which the input belongs. ",
      "child_ranges": [
        "(line 326,col 5)-(line 327,col 72)",
        "(line 328,col 5)-(line 328,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.overrideModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 332,
      "end_line": 334,
      "comment": " Overrides the module to which the input belongs. ",
      "child_ranges": [
        "(line 333,col 5)-(line 333,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.isExtern()",
      "begin_line": 336,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 337,col 5)-(line 339,col 5)",
        "(line 340,col 5)-(line 340,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.setIsExtern(boolean)",
      "begin_line": 343,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 344,col 5)-(line 346,col 5)",
        "(line 347,col 5)-(line 347,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getLineOffset(int)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getNumLines()",
      "begin_line": 355,
      "end_line": 357,
      "comment": " @return The number of lines in this input. ",
      "child_ranges": [
        "(line 356,col 5)-(line 356,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.toString()",
      "begin_line": 359,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 21)"
      ]
    }
  ]
}