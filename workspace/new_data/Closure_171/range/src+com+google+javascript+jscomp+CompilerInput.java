{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CompilerInput.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompilerInput",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceAst",
        "com.google.javascript.jscomp.deps.DependencyInfo"
      ],
      "begin_line": 40,
      "end_line": 364,
      "comment": "\n * A class for the internal representation of an input to the compiler.\n * Wraps a {@link SourceAst} and maintain state such as module for the input and\n * whether the input is an extern. Also calculates provided and required types.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Info about where the file lives."
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ast"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The AST."
    },
    {
      "type": "field",
      "varNames": [
        "provides"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Provided and required symbols."
    },
    {
      "type": "field",
      "varNames": [
        "requires"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatedDependencyInfoFromSource"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " We do not want to persist this across serialized state."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceAst)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceAst, boolean)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceAst, java.lang.String, boolean)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceAst, com.google.javascript.rhino.InputId, boolean)",
      "begin_line": 73,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 19)",
        "(line 75,col 5)-(line 75,col 22)",
        "(line 79,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerInput.CompilerInput(com.google.javascript.jscomp.SourceFile, boolean)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getInputId()",
      "begin_line": 93,
      "end_line": 96,
      "comment": " Returns a name for this input. Must be unique across all inputs. ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getName()",
      "begin_line": 99,
      "end_line": 102,
      "comment": " Returns a name for this input. Must be unique across all inputs. ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getAst()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getPathRelativeToClosureBase()",
      "begin_line": 109,
      "end_line": 113,
      "comment": " Gets the path relative to closure-base, if one is available. ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getAstRoot(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 115,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 41)",
        "(line 119,col 5)-(line 122,col 5)",
        "(line 123,col 5)-(line 123,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.clearAst()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getSourceFile()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.setSourceFile(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getSourceAst()",
      "begin_line": 142,
      "end_line": 144,
      "comment": " Returns the SourceAst object on which this input is based. ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.setCompiler(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 147,
      "end_line": 149,
      "comment": " Sets an abstract compiler for doing parsing. ",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.checkErrorManager()",
      "begin_line": 151,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 60)",
        "(line 154,col 5)-(line 155,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getRequires()",
      "begin_line": 159,
      "end_line": 170,
      "comment": " Gets a list of types depended on by this input. ",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 24)",
        "(line 162,col 5)-(line 169,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getProvides()",
      "begin_line": 173,
      "end_line": 184,
      "comment": " Gets a list of types provided by this input. ",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 24)",
        "(line 176,col 5)-(line 183,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.addProvide(java.lang.String)",
      "begin_line": 188,
      "end_line": 191,
      "comment": " there is better support for discovering non-closure dependencies.",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 18)",
        "(line 190,col 5)-(line 190,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.addRequire(java.lang.String)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 18)",
        "(line 195,col 5)-(line 195,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.removeRequire(java.lang.String)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 18)",
        "(line 200,col 5)-(line 200,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.regenerateDependencyInfoIfNecessary()",
      "begin_line": 206,
      "end_line": 251,
      "comment": "\n   * Regenerates the provides/requires if we need to do so.\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 250,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DepsFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 253,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "provides"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requires"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 256,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.DepsFinder.visitTree(com.google.javascript.rhino.Node)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 7)-(line 260,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.DepsFinder.visitSubtree(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 263,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 264,col 7)-(line 281,col 7)",
        "(line 283,col 7)-(line 286,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getLine(int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n   * Gets the source line for the indicated line number.\n   *\n   * @param lineNumber the line number, 1 being the first line of the file.\n   * @return The line indicated. Does not include the newline at the end\n   *     of the file. Returns {@code null} if it does not exist,\n   *     or if there was an IO exception.\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getRegion(int)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n   * Get a region around the indicated line number. The exact definition of a\n   * region is implementation specific, but it must contain the line indicated\n   * by the line number. A region must not start or end by a carriage return.\n   *\n   * @param lineNumber the line number, 1 being the first line of the file.\n   * @return The line indicated. Returns {@code null} if it does not exist,\n   *     or if there was an IO exception.\n   ",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getCode()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 5)-(line 316,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getModule()",
      "begin_line": 320,
      "end_line": 322,
      "comment": " Returns the module to which the input belongs. ",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.setModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 325,
      "end_line": 330,
      "comment": " Sets the module to which the input belongs. ",
      "child_ranges": [
        "(line 327,col 5)-(line 328,col 72)",
        "(line 329,col 5)-(line 329,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.overrideModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 333,
      "end_line": 335,
      "comment": " Overrides the module to which the input belongs. ",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.isExtern()",
      "begin_line": 337,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 340,col 5)",
        "(line 341,col 5)-(line 341,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.setIsExtern(boolean)",
      "begin_line": 344,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 347,col 5)",
        "(line 348,col 5)-(line 348,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getLineOffset(int)",
      "begin_line": 351,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.getNumLines()",
      "begin_line": 356,
      "end_line": 358,
      "comment": " @return The number of lines in this input. ",
      "child_ranges": [
        "(line 357,col 5)-(line 357,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerInput.toString()",
      "begin_line": 360,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 5)-(line 362,col 21)"
      ]
    }
  ]
}