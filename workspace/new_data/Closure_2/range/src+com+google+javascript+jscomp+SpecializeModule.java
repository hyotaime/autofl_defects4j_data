{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SpecializeModule.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpecializeModule",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 85,
      "end_line": 753,
      "comment": "\n * Beginnings of an optimization to specialize the initial module at the cost of\n * increasing code in later modules. This is still very experimental.\n *\n * High-level overview:\n *\n * This optimization replaces functions in the initial module with specialized\n * versions that are only safe in the initial module. The original, general,\n * versions of the functions are \"fixed up\" in later modules. This optimization\n * can shrink the initial module significantly but the fixup code in later\n * modules increases overall code size.\n *\n * Implementation approach:\n *\n * We take a ridiculously naive approach: remove the initial module\n * from the rest of the AST, optimize it with existing optimization passes\n * (recording which functions have been specialized), put it back in the AST,\n * and add fixups restoring the general versions of the functions in each module\n * that depends on the initial module.\n *\n * Since it is only safe to specialize functions that can be fixed up, we\n * don\u0027t allow specialization of local functions and functions that\n * are aliased.\n *\n * We currently run three optimizations on the isolated AST: InlineFunctions,\n * DevirtualizePrototypeMethods, and RemoveUnusedPrototypeProperties.\n *\n * These optimizations rely on a coarse-grained name-based analysis to\n * maintain safety properties and thus are likely to see some benefit when\n * applied in isolation.\n *\n * InlineFunctions is truly specializing -- it replaces functions with\n * versions that have calls to other functions inlined into them, while\n * RemoveUnusedPrototypeProperties is really just removing properties that\n * aren\u0027t used in the initial module and adding copies further down in the\n * module graph. It would probably be more elegant to give\n * CrossModuleMethodMotion permission to make copies of methods instead.\n *\n * There are additional passes that might benefit from being made\n * specialization-aware:\n *\n * - OptimizeParameters\n *\n * - Any pass that is too slow to run over the entire AST but might\n *      be acceptable on only the initial module:\n *  - RemoveUnusedNames\n *\n *  - Also, any pass that uses the results of PureFunctionIdentifier to\n *  determine when it is safe to remove code might benefit (e.g. the peephole\n *  passes), since PureFunctionIdentifier relies on SimpleDefinitionFinder,\n *  which would be more precise when running on only the initial module.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializedInputRootsByOriginal"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionInfoBySpecializedFunctionNode"
      ],
      "begin_line": 90,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationState"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationPassFactories"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializeModule(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.PassFactory...)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 29)",
        "(line 100,col 5)-(line 100,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 127,
      "end_line": 165,
      "comment": "\n   * Performs initial module specialization.\n   *\n   * The process is as follows:\n   *\n   * 1) Make a copy of each of the inputs in the initial root and put them\n   * in a fake AST that looks like it is the whole program.\n   *\n   * 2) Run the specializing compiler passes over the fake initial module AST\n   * until it reaches a fixed point, recording which functions are specialized\n   * or removed.\n   *\n   * 3) Replace the original input roots with the specialized input roots\n   *\n   * 4) For each module that directly depends on the initial module, add\n   * fixups for the specialized and removed functions. Right now we add\n   * fixups for for every function that was specialized or removed -- we could\n   * be smarter about this and for each dependent module only add the functions\n   * that it needs.\n   *\n   * 5) Add dummy variables declaring the removed function to the end of\n   * the now-specialized initial module. This is needed to keep\n   * {@link VarCheck} from complaining.\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 58)",
        "(line 132,col 5)-(line 134,col 5)",
        "(line 136,col 5)-(line 136,col 50)",
        "(line 138,col 5)-(line 138,col 51)",
        "(line 140,col 5)-(line 140,col 76)",
        "(line 142,col 5)-(line 142,col 47)",
        "(line 144,col 5)-(line 145,col 42)",
        "(line 147,col 5)-(line 147,col 58)",
        "(line 149,col 5)-(line 150,col 68)",
        "(line 152,col 5)-(line 159,col 46)",
        "(line 162,col 5)-(line 162,col 51)",
        "(line 163,col 5)-(line 163,col 49)",
        "(line 164,col 5)-(line 164,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.createSpecializingPasses()",
      "begin_line": 170,
      "end_line": 185,
      "comment": "\n   * Returns a collection of new instances of specializing passes.\n   ",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 79)",
        "(line 175,col 5)-(line 182,col 5)",
        "(line 184,col 5)-(line 184,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.copyModuleInputs(com.google.javascript.jscomp.JSModule)",
      "begin_line": 195,
      "end_line": 224,
      "comment": "\n   * Creates an AST that consists solely of copies of the input roots for the\n   * passed in module.\n   *\n   * Also records a map in {@link #functionInfoBySpecializedFunctionNode}\n   * of information about the original function keyed on the copies of the\n   * functions to specialized.\n   ",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 62)",
        "(line 199,col 5)-(line 199,col 68)",
        "(line 201,col 5)-(line 201,col 44)",
        "(line 202,col 5)-(line 202,col 52)",
        "(line 204,col 5)-(line 216,col 5)",
        "(line 220,col 5)-(line 220,col 48)",
        "(line 221,col 5)-(line 221,col 68)",
        "(line 223,col 5)-(line 223,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.matchTopLevelFunctions(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 237,
      "end_line": 255,
      "comment": "\n   * Records information about original functions and creates a map from\n   * the specialized functions to this information.\n   *\n   * This information is only recorded for global functions since non-global\n   * functions cannot be inlined.\n   *\n   * @param original An original input root.\n   * @param toBeSpecialized A copy of the input root (the copy to be\n   * specialized)\n   ",
      "child_ranges": [
        "(line 238,col 5)-(line 254,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.Anonymous-21389105-8698-426e-a840-90b72b2581f3.reportMatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 239,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.Anonymous-f5c8f91b-0714-4a29-8009-8110ac168d4c.shouldTraverse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.replaceOriginalModuleInputsWithSpecialized()",
      "begin_line": 265,
      "end_line": 277,
      "comment": "\n   * Replaces the original input roots of the initial module with\n   * their specialized versions.\n   *\n   * (Since {@link JsAst} holds a pointer to original inputs roots, we actually\n   * replace the all the children of the root rather than swapping the\n   * root pointers).\n   ",
      "child_ranges": [
        "(line 266,col 5)-(line 276,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.addDummyVarDeclarationsToInitialModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 289,
      "end_line": 311,
      "comment": "\n   * Adds dummy variable declarations for all the function declarations we\u0027ve\n   * removed to the end of the initial module.\n   *\n   * We do this to make {@link VarCheck} happy, since it requires variables to\n   * be declared before they are used in the whole program AST and doesn\u0027t\n   * like it when they are declared multiple times.\n   *\n   * TODO(dcc): Be smarter about whether we need a VAR here or not.\n   ",
      "child_ranges": [
        "(line 290,col 5)-(line 310,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.addOriginalFunctionVersionsToDependentModules(com.google.javascript.jscomp.JSModule)",
      "begin_line": 322,
      "end_line": 362,
      "comment": "\n   * Adds a copy of the original versions of specialized/removed functions\n   * to each of the dependents of module.\n   *\n   * Currently we add all of these functions to all dependents; it\n   * would be more efficient to only add the functions that could be used.\n   *\n   * TODO(dcc): Only add fixup functions where needed.\n   ",
      "child_ranges": [
        "(line 323,col 5)-(line 361,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.getDirectDependents(com.google.javascript.jscomp.JSModule)",
      "begin_line": 369,
      "end_line": 380,
      "comment": "\n   * Returns a list of modules that directly depend on the given module.\n   *\n   * This probably deserves to be in JSModuleGraph.\n   ",
      "child_ranges": [
        "(line 370,col 5)-(line 370,col 55)",
        "(line 372,col 5)-(line 377,col 5)",
        "(line 379,col 5)-(line 379,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeMatcher",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 388,
      "end_line": 432,
      "comment": "\n   * A simple abstract classes that takes two isomorphic ASTs and walks\n   * each of them together, reporting matches to subclasses.\n   *\n   * This could probably be hardened and moved to NodeUtil\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.NodeMatcher.match(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 397,
      "end_line": 413,
      "comment": "\n     * Calls {@link #reportMatch(Node, Node)} for each pair of matching nodes\n     * from the two ASTs.\n     *\n     * The two ASTs must be isomorphic. Currently no error checking is\n     * performed to ensure that this is the case.\n     ",
      "child_ranges": [
        "(line 400,col 7)-(line 400,col 30)",
        "(line 402,col 7)-(line 411,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.NodeMatcher.reportMatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 423,
      "end_line": 423,
      "comment": "\n     * Subclasses should override to add their own behavior when two nodes\n     * are matched.\n     * @param n1 A node from the AST passed as ast1 in\n     * {@link #match(Node, Node)}.\n     * @param n2 A node from the AST passed as ast1 in\n     * {@link #match(Node, Node)}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.NodeMatcher.shouldTraverse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Subclasses should override to determine whether matching should proceed\n     * under a subtree.\n     ",
      "child_ranges": [
        "(line 430,col 7)-(line 430,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OriginalFunctionInformation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 442,
      "end_line": 541,
      "comment": "\n   * A class that stores information about the original version of a\n   * function that will be/was specialized or removed.\n   *\n   * This class stores:\n   * - how the function was defined\n   * - a copy of the original function\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 443,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAssignFunction"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": "\n     *  a \u003d function() {} if true;\n     *  function a() {} otherwise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "assignHasVar"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalFunctionCopy"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.OriginalFunctionInformation(com.google.javascript.rhino.Node)",
      "begin_line": 455,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 456,col 7)-(line 456,col 56)",
        "(line 458,col 7)-(line 458,col 58)",
        "(line 459,col 7)-(line 459,col 72)",
        "(line 461,col 7)-(line 461,col 57)",
        "(line 463,col 7)-(line 464,col 34)",
        "(line 466,col 7)-(line 467,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.copiedOriginalFunction()",
      "begin_line": 470,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 472,col 7)-(line 472,col 51)",
        "(line 473,col 7)-(line 473,col 60)",
        "(line 475,col 7)-(line 475,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.originalWasDeclaration()",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\n     * Did the original function add its name to scope?\n     * (If so, and specialization removes it, then we\u0027ll have to\n     * add a VAR for it so VarCheck doesn\u0027t complain).\n     ",
      "child_ranges": [
        "(line 484,col 7)-(line 484,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.generateFixupDefinition()",
      "begin_line": 506,
      "end_line": 527,
      "comment": "\n     * Generates a definition of the original function that can be added as\n     * a fixup in the modules that directly depend on the specialized module.\n     *\n     * \u003cPRE\u003e\n     * The trick here is that even if the original function is declared as:\n     *\n     * function foo() {\n     *   // stuff\n     * }\n     *\n     * the fixup will have to be of the form\n     *\n     * foo \u003d function() {\n     *   // stuff\n     * }\n     * \u003c/PRE\u003e\n     *\n     ",
      "child_ranges": [
        "(line 507,col 7)-(line 507,col 51)",
        "(line 509,col 7)-(line 509,col 20)",
        "(line 511,col 7)-(line 521,col 7)",
        "(line 523,col 7)-(line 523,col 58)",
        "(line 524,col 7)-(line 524,col 51)",
        "(line 526,col 7)-(line 526,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.generateDummyDeclaration()",
      "begin_line": 535,
      "end_line": 540,
      "comment": "\n     * Returns a new dummy var declaration for the function with no initial\n     * value:\n     *\n     * var name;\n     ",
      "child_ranges": [
        "(line 536,col 7)-(line 536,col 57)",
        "(line 537,col 7)-(line 537,col 67)",
        "(line 539,col 7)-(line 539,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SpecializationState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 562,
      "end_line": 752,
      "comment": "\n   * A class to hold state during SpecializeModule. An instance of this class\n   * is passed to specialization-aware compiler passes -- they use it to\n   * communicate with SpecializeModule.\n   *\n   * SpecializationAware optimizations are required to keep track of the\n   * functions they remove and the functions that they modify so that the fixups\n   * can be added. However, not all functions can be fixed up.\n   *\n   * Specialization-aware classes *must* call\n   * {@link #reportSpecializedFunction} when a function is modified during\n   * specialization and {@link #reportRemovedFunction} when one is removed.\n   *\n   * Also, when specializing, they must query {@link #canFixupFunction}\n   * before modifying a function.\n   *\n   * This two-way communication, is the reason we don\u0027t use\n   * {@link AstChangeProxy} to report code changes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "specializedFunctions"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": "\n     * The functions that the pass has specialized. These functions will\n     * be fixed up in non-specialized modules to their more general versions.\n     *\n     * This field is also used to determine whether specialization is enabled.\n     * If not null, specialization is enabled, otherwise it is disabled.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removedFunctions"
      ],
      "begin_line": 577,
      "end_line": 577,
      "comment": "\n     * The functions that the pass has removed. These functions will be\n     * redefined in non-specialized modules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removedFunctionToBlock"
      ],
      "begin_line": 579,
      "end_line": 579,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initialModuleAliasAnalysis"
      ],
      "begin_line": 581,
      "end_line": 581,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasChanged"
      ],
      "begin_line": 586,
      "end_line": 586,
      "comment": " Will be true if any new functions have been removed or specialized since\n     * {@link #resetHasChanged}.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.SpecializationState(com.google.javascript.jscomp.SimpleFunctionAliasAnalysis)",
      "begin_line": 588,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 591,col 7)-(line 591,col 67)",
        "(line 593,col 7)-(line 593,col 53)",
        "(line 594,col 7)-(line 594,col 49)",
        "(line 595,col 7)-(line 595,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.hasChanged()",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\n     * Returns true if any new functions have been reported as removed or\n     * specialized since {@link #resetHasChanged()} was last called.\n     ",
      "child_ranges": [
        "(line 603,col 7)-(line 603,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.resetHasChanged()",
      "begin_line": 606,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 607,col 7)-(line 607,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.getSpecializedFunctions()",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Returns the functions specialized by this compiler pass.\n     ",
      "child_ranges": [
        "(line 614,col 7)-(line 614,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.reportSpecializedFunction(com.google.javascript.rhino.Node)",
      "begin_line": 622,
      "end_line": 626,
      "comment": "\n     * Reports that a function has been specialized.\n     *\n     * @param functionNode A specialized AST node with type Token.FUNCTION\n     ",
      "child_ranges": [
        "(line 623,col 7)-(line 625,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.reportSpecializedFunctionContainingNode(com.google.javascript.rhino.Node)",
      "begin_line": 631,
      "end_line": 637,
      "comment": "\n     * Reports that the function containing the node has been specialized.\n     ",
      "child_ranges": [
        "(line 632,col 7)-(line 632,col 57)",
        "(line 634,col 7)-(line 636,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.getRemovedFunctions()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\n     * The functions removed by this compiler pass.\n     ",
      "child_ranges": [
        "(line 643,col 7)-(line 643,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.reportRemovedFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 655,
      "end_line": 663,
      "comment": "\n     * Reports that a function has been removed.\n     *\n     * @param functionNode A removed AST node with type Token.FUNCTION\n     * @param declaringBlock If the function declaration puts a variable in the\n     *    scope, we need to have a VAR statement in the scope where the\n     *    function is declared. Null if the function does not put a name\n     *    in the scope.\n     ",
      "child_ranges": [
        "(line 659,col 7)-(line 662,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.canFixupFunction(com.google.javascript.rhino.Node)",
      "begin_line": 687,
      "end_line": 716,
      "comment": "\n     * Returns true if the function can be fixed up (that is, if it can be\n     * safely removed or specialized).\n     *\n     * \u003cp\u003eIn order to be safely fixed up, a function must be:\n     * \u003cPRE\u003e\n     * - in the global scope\n     * - not aliased in the initial module\n     * - of one of the following forms:\n     *    function f() {}\n     *    var f \u003d function() {}\n     *    f \u003d function(){}\n     *    var ns \u003d {}; ns.f \u003d function() {}\n     *    SomeClass.prototype.foo \u003d function() {};\n     * \u003c/PRE\u003e\n     *\n     * \u003cp\u003eAnonymous functions cannot be safely fixed up, nor can functions\n     * that have been aliased.\n     *\n     * \u003cp\u003eSome functions declared as object literals could be safely fixed up,\n     * however we do not currently support this.\n     ",
      "child_ranges": [
        "(line 688,col 7)-(line 688,col 61)",
        "(line 690,col 7)-(line 693,col 7)",
        "(line 695,col 7)-(line 698,col 7)",
        "(line 700,col 7)-(line 700,col 45)",
        "(line 701,col 7)-(line 701,col 39)",
        "(line 703,col 7)-(line 706,col 7)",
        "(line 708,col 7)-(line 713,col 7)",
        "(line 715,col 7)-(line 715,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.canFixupSpecializedFunctionContainingNode(com.google.javascript.rhino.Node)",
      "begin_line": 723,
      "end_line": 731,
      "comment": "\n     * Returns true if the function containing n can be fixed up.\n     * Also returns true if n is in the global scope -- since it is always safe\n     * to specialize the global scope.\n     ",
      "child_ranges": [
        "(line 724,col 7)-(line 724,col 54)",
        "(line 725,col 7)-(line 730,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.nodeIsInGlobalScope(com.google.javascript.rhino.Node)",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\n     * Returns true if a node is in the global scope; false otherwise.\n     ",
      "child_ranges": [
        "(line 737,col 7)-(line 737,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.containingFunction(com.google.javascript.rhino.Node)",
      "begin_line": 743,
      "end_line": 751,
      "comment": "\n     * Returns the function containing the node, or null if none exists.\n     ",
      "child_ranges": [
        "(line 744,col 7)-(line 748,col 7)",
        "(line 750,col 7)-(line 750,col 18)"
      ]
    }
  ]
}