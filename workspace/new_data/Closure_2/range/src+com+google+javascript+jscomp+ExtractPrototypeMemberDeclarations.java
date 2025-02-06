{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ExtractPrototypeMemberDeclarations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtractPrototypeMemberDeclarations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 85,
      "end_line": 366,
      "comment": "\n * When there are multiple prototype member declarations to the same class,\n * use a temp variable to alias the prototype object.\n *\n * Example:\n *\n * \u003cpre\u003e\n * function B() { ... }                 \\\n * B.prototype.foo \u003d function() { ... }  \\___ {@link ExtractionInstance}\n * ...                                   /\n * B.prototype.bar \u003d function() { ... } /\n *          ^---------------------------------{@link PrototypeMemberDeclaration}\n * \u003c/pre\u003e\n * \u003cp\u003ebecomes\n * \u003cpre\u003e\n * function B() { ... }\n * x \u003d B.prototype;\n * x.foo \u003d function() { ... }\n * ...\n * x.bar \u003d function() { ... }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e Works almost like a redundant load elimination but limited to only\n * recognizing the class prototype declaration idiom. First it only works within\n * a basic block because we avoided {@link DataFlowAnalysis} for compilation\n * performance. Secondly, we can avoid having to compute how long to\n * sub-expressing has to be. Example:\n * \u003cpre\u003e\n * a.b.c.d \u003d ...\n * a.b.c \u003d ...\n * a.b \u003d ...\n * a.b.c \u003d ...\n * \u003c/pre\u003e\n * \u003cp\u003e Further more, we only introduce one temp variable to hold a single\n * prototype at a time. So all the {@link PrototypeMemberDeclaration}\n * to be extracted must be in a single line. We call this a single\n * {@link ExtractionInstance}.\n *\n * \u003cp\u003eAlternatively, for users who do not want a global variable to be\n * introduced, we will create an anonymous function instead.\n * \u003cpre\u003e\n * function B() { ... }\n * (function (x) {\n *   x.foo \u003d function() { ... }\n *   ...\n *   x.bar \u003d function() { ... }\n * )(B.prototype)\n * \u003c/pre\u003e\n *\n * The RHS of the declarations can have side effects, however, one good way to\n * break this is the following:\n * \u003cpre\u003e\n * function B() { ... }\n * B.prototype.foo \u003d (function() { B.prototype \u003d somethingElse(); return 0 })();\n * ...\n * \u003c/pre\u003e\n * Such logic is highly unlikely and we will assume that it never occurs.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeAlias"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " object. Of cause, we assume that it\u0027ll be renamed by RenameVars."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalOverhead"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "perExtractionOverhead"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "perMemberOverhead"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.Pattern.Pattern(int, int, int)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 125,col 7)-(line 125,col 43)",
        "(line 126,col 7)-(line 126,col 57)",
        "(line 127,col 7)-(line 127,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractPrototypeMemberDeclarations(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.Pattern)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 29)",
        "(line 133,col 5)-(line 133,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 136,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 69)",
        "(line 139,col 5)-(line 139,col 59)",
        "(line 140,col 5)-(line 143,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.doExtraction(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.GatherExtractionInfo)",
      "begin_line": 150,
      "end_line": 165,
      "comment": "\n   * Declares the temp variable to point to prototype objects and iterates\n   * through all ExtractInstance and performs extraction there.\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 160,col 5)",
        "(line 162,col 5)-(line 164,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.extractInstance(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance)",
      "begin_line": 172,
      "end_line": 211,
      "comment": "\n   * At a given ExtractionInstance, stores and prototype object in the temp\n   * variable and rewrite each member declaration to assign to the temp variable\n   * instead.\n   ",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 72)",
        "(line 174,col 5)-(line 174,col 48)",
        "(line 175,col 5)-(line 205,col 5)",
        "(line 208,col 5)-(line 210,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.replacePrototypeMemberDeclaration(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration)",
      "begin_line": 217,
      "end_line": 244,
      "comment": "\n   * Replaces a member declaration to an assignment to the temp prototype\n   * object.\n   ",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 50)",
        "(line 221,col 5)-(line 221,col 42)",
        "(line 222,col 5)-(line 225,col 27)",
        "(line 231,col 5)-(line 231,col 65)",
        "(line 232,col 5)-(line 232,col 69)",
        "(line 234,col 5)-(line 234,col 27)",
        "(line 236,col 5)-(line 238,col 5)",
        "(line 240,col 5)-(line 241,col 59)",
        "(line 243,col 5)-(line 243,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherExtractionInfo",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 249,
      "end_line": 290,
      "comment": "\n   * Collects all the possible extraction instances in a node traversal.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "instances"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalDelta"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.GatherExtractionInfo.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 254,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 257,col 7)-(line 259,col 7)",
        "(line 261,col 7)-(line 280,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.GatherExtractionInfo.shouldExtract()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * @return \u003c@code true\u003e if the sum of all the extraction instance gain\n     * outweighs the overhead of the temp variable declaration.\n     ",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExtractionInstance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 292,
      "end_line": 329,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declarations"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance.ExtractionInstance(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration, com.google.javascript.rhino.Node)",
      "begin_line": 297,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 27)",
        "(line 299,col 7)-(line 299,col 29)",
        "(line 300,col 7)-(line 300,col 72)",
        "(line 302,col 7)-(line 319,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance.isFavorable()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * @return {@code true} if extracting all the declarations at this instance\n     * will overweight the overhead of aliasing the prototype object.\n     ",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrototypeMemberDeclaration",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 336,
      "end_line": 365,
      "comment": "\n   * Abstraction for a prototype member declaration.\n   *\n   * \u003cp\u003e{@code a.b.c.prototype.d \u003d ....}\n   "
    },
    {
      "type": "field",
      "varNames": [
        "memberName"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "qualifiedClassName"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lhs"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration.PrototypeMemberDeclaration(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 342,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 343,col 7)-(line 343,col 21)",
        "(line 344,col 7)-(line 344,col 63)",
        "(line 345,col 7)-(line 345,col 23)",
        "(line 346,col 7)-(line 347,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration.isSameClass(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 7)-(line 351,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration.extractDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 358,
      "end_line": 364,
      "comment": "\n     * @return A prototype member declaration representation if there is one\n     * else it returns {@code null}.\n     ",
      "child_ranges": [
        "(line 359,col 7)-(line 361,col 7)",
        "(line 362,col 7)-(line 362,col 51)",
        "(line 363,col 7)-(line 363,col 52)"
      ]
    }
  ]
}