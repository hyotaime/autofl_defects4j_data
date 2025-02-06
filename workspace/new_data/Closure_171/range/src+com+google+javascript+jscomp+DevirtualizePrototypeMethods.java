{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/DevirtualizePrototypeMethods.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DevirtualizePrototypeMethods",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass",
        "com.google.javascript.jscomp.SpecializationAwareCompilerPass"
      ],
      "begin_line": 66,
      "end_line": 458,
      "comment": "\n * Rewrites prototyped methods calls as static calls that take \"this\"\n * as their first argument.  This transformation simplifies the call\n * graph so smart name removal, cross module code motion and other\n * passes can do more.\n *\n * \u003cp\u003eThis pass should only be used in production code if property\n * and variable renaming are turned on.  Resulting code may also\n * benefit from --collapse_anonymous_functions and\n * --collapse_variable_declarations\n *\n * \u003cp\u003eThis pass only rewrites functions that are part of an objects\n * prototype.  Functions that access the \"arguments\" variable\n * arguments object are not eligible for this optimization.\n *\n * \u003cp\u003eFor example:\n * \u003cpre\u003e\n *     A.prototype.accumulate \u003d function(value) {\n *       this.total +\u003d value; return this.total\n *     }\n *     var total \u003d a.accumulate(2)\n * \u003c/pre\u003e\n *\n * \u003cp\u003ewill be rewritten as:\n *\n * \u003cpre\u003e\n *     var accumulate \u003d function(self, value) {\n *       self.total +\u003d value; return self.total\n *     }\n *     var total \u003d accumulate(a, 2)\n * \u003c/pre\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationState"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.DevirtualizePrototypeMethods(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 76)",
        "(line 84,col 5)-(line 84,col 37)",
        "(line 85,col 5)-(line 85,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 93,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.isCall(com.google.javascript.jscomp.UseSite)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n   * Determines if the name node acts as the function name in a call expression.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 26)",
        "(line 101,col 5)-(line 101,col 35)",
        "(line 102,col 5)-(line 102,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.isPrototypeMethodDefinition(com.google.javascript.rhino.Node)",
      "begin_line": 108,
      "end_line": 162,
      "comment": "\n   * Determines if the current node is a function prototype definition.\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 35)",
        "(line 110,col 5)-(line 112,col 5)",
        "(line 113,col 5)-(line 113,col 36)",
        "(line 114,col 5)-(line 116,col 5)",
        "(line 118,col 5)-(line 161,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.getMethodName(com.google.javascript.rhino.Node)",
      "begin_line": 164,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 171,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.getRewrittenMethodName(java.lang.String)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n   * @returns The new name for a rewritten method.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.rewriteDefinitionIfEligible(com.google.javascript.jscomp.DefinitionSite, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 192,
      "end_line": 224,
      "comment": "\n   * Rewrites method definition and call sites if the method is\n   * defined in the global scope exactly once.\n   *\n   * Definition and use site information is provided by the\n   * {@link SimpleDefinitionFinder} passed in as an argument.\n   *\n   * @param defSite definition site to process.\n   * @param defFinder structure that hold Node -\u003e Definition and\n   * Definition -\u003e [UseSite] maps.\n   ",
      "child_ranges": [
        "(line 194,col 5)-(line 198,col 5)",
        "(line 200,col 5)-(line 200,col 29)",
        "(line 201,col 5)-(line 203,col 5)",
        "(line 205,col 5)-(line 211,col 5)",
        "(line 220,col 5)-(line 221,col 29)",
        "(line 222,col 5)-(line 222,col 43)",
        "(line 223,col 5)-(line 223,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.isEligibleDefinition(com.google.javascript.jscomp.SimpleDefinitionFinder, com.google.javascript.jscomp.DefinitionSite)",
      "begin_line": 239,
      "end_line": 312,
      "comment": "\n   * Determines if a method definition is eligible for rewrite as a\n   * global function.  In order to be eligible for rewrite, the\n   * definition must:\n   *\n   * - Refer to a function that takes a fixed number of arguments.\n   * - Function must not be exported.\n   * - Function must be used at least once.\n   * - Property is never accessed outside a function call context.\n   * - The definition under consideration must be the only possible\n   *   choice at each call site.\n   * - Definition must happen in a module loaded before the first use.\n   ",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 54)",
        "(line 243,col 5)-(line 243,col 54)",
        "(line 248,col 5)-(line 248,col 41)",
        "(line 249,col 5)-(line 253,col 5)",
        "(line 256,col 5)-(line 256,col 41)",
        "(line 257,col 5)-(line 260,col 5)",
        "(line 261,col 5)-(line 261,col 71)",
        "(line 262,col 5)-(line 264,col 5)",
        "(line 266,col 5)-(line 266,col 69)",
        "(line 269,col 5)-(line 271,col 5)",
        "(line 273,col 5)-(line 273,col 58)",
        "(line 275,col 5)-(line 309,col 5)",
        "(line 311,col 5)-(line 311,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.rewriteCallSites(com.google.javascript.jscomp.SimpleDefinitionFinder, com.google.javascript.jscomp.DefinitionsRemover.Definition, java.lang.String)",
      "begin_line": 324,
      "end_line": 344,
      "comment": "\n   * Rewrites object method call sites as calls to global functions\n   * that take \"this\" as their first argument.\n   *\n   * Before:\n   *   o.foo(a, b, c)\n   *\n   * After:\n   *   foo(o, a, b, c)\n   ",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 69)",
        "(line 328,col 5)-(line 343,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.rewriteDefinition(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 356,
      "end_line": 409,
      "comment": "\n   * Rewrites method definitions as global functions that take \"this\"\n   * as their first argument.\n   *\n   * Before:\n   *   a.prototype.b \u003d function(a, b, c) {...}\n   *\n   * After:\n   *   var b \u003d function(self, a, b, c) {...}\n   ",
      "child_ranges": [
        "(line 357,col 5)-(line 357,col 48)",
        "(line 359,col 5)-(line 359,col 35)",
        "(line 361,col 5)-(line 361,col 66)",
        "(line 362,col 5)-(line 362,col 75)",
        "(line 363,col 5)-(line 363,col 71)",
        "(line 365,col 5)-(line 365,col 22)",
        "(line 366,col 5)-(line 393,col 5)",
        "(line 396,col 5)-(line 396,col 42)",
        "(line 397,col 5)-(line 397,col 58)",
        "(line 398,col 5)-(line 399,col 44)",
        "(line 402,col 5)-(line 402,col 44)",
        "(line 403,col 5)-(line 403,col 40)",
        "(line 406,col 5)-(line 406,col 34)",
        "(line 408,col 5)-(line 408,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.fixFunctionType(com.google.javascript.rhino.Node)",
      "begin_line": 417,
      "end_line": 437,
      "comment": "\n   * Creates a new JSType based on the original function type by\n   * adding the original this pointer type to the beginning of the\n   * argument type list and replacing the this pointer type with\n   * NO_TYPE.\n   ",
      "child_ranges": [
        "(line 418,col 5)-(line 418,col 77)",
        "(line 419,col 5)-(line 436,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethods.replaceReferencesToThis(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 443,
      "end_line": 457,
      "comment": "\n   * Replaces references to \"this\" with references to name.  Do not\n   * traverse function boundaries.\n   ",
      "child_ranges": [
        "(line 444,col 5)-(line 446,col 5)",
        "(line 448,col 5)-(line 456,col 5)"
      ]
    }
  ]
}