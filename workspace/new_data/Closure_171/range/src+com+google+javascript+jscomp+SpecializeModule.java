{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/SpecializeModule.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpecializeModule",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 86,
      "end_line": 751,
      "comment": "\n * Beginnings of an optimization to specialize the initial module at the cost of\n * increasing code in later modules. This is still very experimental.\n *\n * High-level overview:\n *\n * This optimization replaces functions in the initial module with specialized\n * versions that are only safe in the initial module. The original, general,\n * versions of the functions are \"fixed up\" in later modules. This optimization\n * can shrink the initial module significantly but the fixup code in later\n * modules increases overall code size.\n *\n * Implementation approach:\n *\n * We take a ridiculously naive approach: remove the initial module\n * from the rest of the AST, optimize it with existing optimization passes\n * (recording which functions have been specialized), put it back in the AST,\n * and add fixups restoring the general versions of the functions in each module\n * that depends on the initial module.\n *\n * Since it is only safe to specialize functions that can be fixed up, we\n * don\u0027t allow specialization of local functions and functions that\n * are aliased.\n *\n * We currently run three optimizations on the isolated AST: InlineFunctions,\n * DevirtualizePrototypeMethods, and RemoveUnusedPrototypeProperties.\n *\n * These optimizations rely on a coarse-grained name-based analysis to\n * maintain safety properties and thus are likely to see some benefit when\n * applied in isolation.\n *\n * InlineFunctions is truly specializing -- it replaces functions with\n * versions that have calls to other functions inlined into them, while\n * RemoveUnusedPrototypeProperties is really just removing properties that\n * aren\u0027t used in the initial module and adding copies further down in the\n * module graph. It would probably be more elegant to give\n * CrossModuleMethodMotion permission to make copies of methods instead.\n *\n * There are additional passes that might benefit from being made\n * specialization-aware:\n *\n * - OptimizeParameters\n *\n * - Any pass that is too slow to run over the entire AST but might\n *      be acceptable on only the initial module:\n *  - RemoveUnusedNames\n *\n *  - Also, any pass that uses the results of PureFunctionIdentifier to\n *  determine when it is safe to remove code might benefit (e.g. the peephole\n *  passes), since PureFunctionIdentifier relies on SimpleDefinitionFinder,\n *  which would be more precise when running on only the initial module.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializedInputRootsByOriginal"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionInfoBySpecializedFunctionNode"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationState"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationPassFactories"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializeModule(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.PassFactory...)",
      "begin_line": 98,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 29)",
        "(line 101,col 5)-(line 101,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 166,
      "comment": "\n   * Performs initial module specialization.\n   *\n   * The process is as follows:\n   *\n   * 1) Make a copy of each of the inputs in the initial root and put them\n   * in a fake AST that looks like it is the whole program.\n   *\n   * 2) Run the specializing compiler passes over the fake initial module AST\n   * until it reaches a fixed point, recording which functions are specialized\n   * or removed.\n   *\n   * 3) Replace the original input roots with the specialized input roots\n   *\n   * 4) For each module that directly depends on the initial module, add\n   * fixups for the specialized and removed functions. Right now we add\n   * fixups for for every function that was specialized or removed -- we could\n   * be smarter about this and for each dependent module only add the functions\n   * that it needs.\n   *\n   * 5) Add dummy variables declaring the removed function to the end of\n   * the now-specialized initial module. This is needed to keep\n   * {@link VarCheck} from complaining.\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 58)",
        "(line 133,col 5)-(line 135,col 5)",
        "(line 137,col 5)-(line 137,col 50)",
        "(line 139,col 5)-(line 139,col 51)",
        "(line 141,col 5)-(line 141,col 76)",
        "(line 143,col 5)-(line 143,col 47)",
        "(line 145,col 5)-(line 146,col 42)",
        "(line 148,col 5)-(line 148,col 58)",
        "(line 150,col 5)-(line 151,col 68)",
        "(line 153,col 5)-(line 160,col 46)",
        "(line 163,col 5)-(line 163,col 51)",
        "(line 164,col 5)-(line 164,col 49)",
        "(line 165,col 5)-(line 165,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.createSpecializingPasses()",
      "begin_line": 171,
      "end_line": 186,
      "comment": "\n   * Returns a collection of new instances of specializing passes.\n   ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 79)",
        "(line 176,col 5)-(line 183,col 5)",
        "(line 185,col 5)-(line 185,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.copyModuleInputs(com.google.javascript.jscomp.JSModule)",
      "begin_line": 196,
      "end_line": 225,
      "comment": "\n   * Creates an AST that consists solely of copies of the input roots for the\n   * passed in module.\n   *\n   * Also records a map in {@link #functionInfoBySpecializedFunctionNode}\n   * of information about the original function keyed on the copies of the\n   * functions to specialized.\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 62)",
        "(line 200,col 5)-(line 200,col 68)",
        "(line 202,col 5)-(line 202,col 44)",
        "(line 203,col 5)-(line 203,col 52)",
        "(line 205,col 5)-(line 217,col 5)",
        "(line 221,col 5)-(line 221,col 48)",
        "(line 222,col 5)-(line 222,col 68)",
        "(line 224,col 5)-(line 224,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.matchTopLevelFunctions(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 238,
      "end_line": 256,
      "comment": "\n   * Records information about original functions and creates a map from\n   * the specialized functions to this information.\n   *\n   * This information is only recorded for global functions since non-global\n   * functions cannot be inlined.\n   *\n   * @param original An original input root.\n   * @param toBeSpecialized A copy of the input root (the copy to be\n   * specialized)\n   ",
      "child_ranges": [
        "(line 239,col 5)-(line 255,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.Anonymous-7cbecaed-a6b5-400a-a8f8-50bba954a845.reportMatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 240,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.Anonymous-552b9438-4d51-49d1-817b-f436795b4a6d.shouldTraverse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.replaceOriginalModuleInputsWithSpecialized()",
      "begin_line": 266,
      "end_line": 276,
      "comment": "\n   * Replaces the original input roots of the initial module with\n   * their specialized versions.\n   *\n   * (Since {@link JsAst} holds a pointer to original inputs roots, we actually\n   * replace the all the children of the root rather than swapping the\n   * root pointers).\n   ",
      "child_ranges": [
        "(line 267,col 5)-(line 275,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.addDummyVarDeclarationsToInitialModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 288,
      "end_line": 309,
      "comment": "\n   * Adds dummy variable declarations for all the function declarations we\u0027ve\n   * removed to the end of the initial module.\n   *\n   * We do this to make {@link VarCheck} happy, since it requires variables to\n   * be declared before they are used in the whole program AST and doesn\u0027t\n   * like it when they are declared multiple times.\n   *\n   * TODO(dcc): Be smarter about whether we need a VAR here or not.\n   ",
      "child_ranges": [
        "(line 289,col 5)-(line 308,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.addOriginalFunctionVersionsToDependentModules(com.google.javascript.jscomp.JSModule)",
      "begin_line": 320,
      "end_line": 360,
      "comment": "\n   * Adds a copy of the original versions of specialized/removed functions\n   * to each of the dependents of module.\n   *\n   * Currently we add all of these functions to all dependents; it\n   * would be more efficient to only add the functions that could be used.\n   *\n   * TODO(dcc): Only add fixup functions where needed.\n   ",
      "child_ranges": [
        "(line 321,col 5)-(line 359,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.getDirectDependents(com.google.javascript.jscomp.JSModule)",
      "begin_line": 367,
      "end_line": 378,
      "comment": "\n   * Returns a list of modules that directly depend on the given module.\n   *\n   * This probably deserves to be in JSModuleGraph.\n   ",
      "child_ranges": [
        "(line 368,col 5)-(line 368,col 55)",
        "(line 370,col 5)-(line 375,col 5)",
        "(line 377,col 5)-(line 377,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeMatcher",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 386,
      "end_line": 430,
      "comment": "\n   * A simple abstract classes that takes two isomorphic ASTs and walks\n   * each of them together, reporting matches to subclasses.\n   *\n   * This could probably be hardened and moved to NodeUtil\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.NodeMatcher.match(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 395,
      "end_line": 411,
      "comment": "\n     * Calls {@link #reportMatch(Node, Node)} for each pair of matching nodes\n     * from the two ASTs.\n     *\n     * The two ASTs must be isomorphic. Currently no error checking is\n     * performed to ensure that this is the case.\n     ",
      "child_ranges": [
        "(line 398,col 7)-(line 398,col 30)",
        "(line 400,col 7)-(line 409,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.NodeMatcher.reportMatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 421,
      "end_line": 421,
      "comment": "\n     * Subclasses should override to add their own behavior when two nodes\n     * are matched.\n     * @param n1 A node from the AST passed as ast1 in\n     * {@link #match(Node, Node)}.\n     * @param n2 A node from the AST passed as ast1 in\n     * {@link #match(Node, Node)}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.NodeMatcher.shouldTraverse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Subclasses should override to determine whether matching should proceed\n     * under a subtree.\n     ",
      "child_ranges": [
        "(line 428,col 7)-(line 428,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OriginalFunctionInformation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 440,
      "end_line": 539,
      "comment": "\n   * A class that stores information about the original version of a\n   * function that will be/was specialized or removed.\n   *\n   * This class stores:\n   * - how the function was defined\n   * - a copy of the original function\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAssignFunction"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": "\n     *  a \u003d function() {} if true;\n     *  function a() {} otherwise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "assignHasVar"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalFunctionCopy"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.OriginalFunctionInformation(com.google.javascript.rhino.Node)",
      "begin_line": 453,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 454,col 7)-(line 454,col 56)",
        "(line 456,col 7)-(line 456,col 58)",
        "(line 457,col 7)-(line 457,col 72)",
        "(line 459,col 7)-(line 459,col 57)",
        "(line 461,col 7)-(line 462,col 34)",
        "(line 464,col 7)-(line 465,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.copiedOriginalFunction()",
      "begin_line": 468,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 470,col 7)-(line 470,col 51)",
        "(line 471,col 7)-(line 471,col 60)",
        "(line 473,col 7)-(line 473,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.originalWasDeclaration()",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Did the original function add its name to scope?\n     * (If so, and specialization removes it, then we\u0027ll have to\n     * add a VAR for it so VarCheck doesn\u0027t complain).\n     ",
      "child_ranges": [
        "(line 482,col 7)-(line 482,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.generateFixupDefinition()",
      "begin_line": 504,
      "end_line": 525,
      "comment": "\n     * Generates a definition of the original function that can be added as\n     * a fixup in the modules that directly depend on the specialized module.\n     *\n     * \u003cPRE\u003e\n     * The trick here is that even if the original function is declared as:\n     *\n     * function foo() {\n     *   // stuff\n     * }\n     *\n     * the fixup will have to be of the form\n     *\n     * foo \u003d function() {\n     *   // stuff\n     * }\n     * \u003c/PRE\u003e\n     *\n     ",
      "child_ranges": [
        "(line 505,col 7)-(line 505,col 51)",
        "(line 507,col 7)-(line 507,col 20)",
        "(line 509,col 7)-(line 519,col 7)",
        "(line 521,col 7)-(line 521,col 58)",
        "(line 522,col 7)-(line 522,col 51)",
        "(line 524,col 7)-(line 524,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation.generateDummyDeclaration()",
      "begin_line": 533,
      "end_line": 538,
      "comment": "\n     * Returns a new dummy var declaration for the function with no initial\n     * value:\n     *\n     * var name;\n     ",
      "child_ranges": [
        "(line 534,col 7)-(line 534,col 57)",
        "(line 535,col 7)-(line 535,col 67)",
        "(line 537,col 7)-(line 537,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SpecializationState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 560,
      "end_line": 750,
      "comment": "\n   * A class to hold state during SpecializeModule. An instance of this class\n   * is passed to specialization-aware compiler passes -- they use it to\n   * communicate with SpecializeModule.\n   *\n   * SpecializationAware optimizations are required to keep track of the\n   * functions they remove and the functions that they modify so that the fixups\n   * can be added. However, not all functions can be fixed up.\n   *\n   * Specialization-aware classes *must* call\n   * {@link #reportSpecializedFunction} when a function is modified during\n   * specialization and {@link #reportRemovedFunction} when one is removed.\n   *\n   * Also, when specializing, they must query {@link #canFixupFunction}\n   * before modifying a function.\n   *\n   * This two-way communication, is the reason we don\u0027t use\n   * {@link AstChangeProxy} to report code changes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "specializedFunctions"
      ],
      "begin_line": 569,
      "end_line": 569,
      "comment": "\n     * The functions that the pass has specialized. These functions will\n     * be fixed up in non-specialized modules to their more general versions.\n     *\n     * This field is also used to determine whether specialization is enabled.\n     * If not null, specialization is enabled, otherwise it is disabled.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removedFunctions"
      ],
      "begin_line": 575,
      "end_line": 575,
      "comment": "\n     * The functions that the pass has removed. These functions will be\n     * redefined in non-specialized modules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removedFunctionToBlock"
      ],
      "begin_line": 577,
      "end_line": 577,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initialModuleAliasAnalysis"
      ],
      "begin_line": 579,
      "end_line": 579,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasChanged"
      ],
      "begin_line": 584,
      "end_line": 584,
      "comment": " Will be true if any new functions have been removed or specialized since\n     * {@link #resetHasChanged}.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.SpecializationState(com.google.javascript.jscomp.SimpleFunctionAliasAnalysis)",
      "begin_line": 586,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 589,col 7)-(line 589,col 67)",
        "(line 591,col 7)-(line 591,col 53)",
        "(line 592,col 7)-(line 592,col 49)",
        "(line 593,col 7)-(line 593,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.hasChanged()",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\n     * Returns true if any new functions have been reported as removed or\n     * specialized since {@link #resetHasChanged()} was last called.\n     ",
      "child_ranges": [
        "(line 601,col 7)-(line 601,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.resetHasChanged()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 605,col 7)-(line 605,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.getSpecializedFunctions()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * Returns the functions specialized by this compiler pass.\n     ",
      "child_ranges": [
        "(line 612,col 7)-(line 612,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.reportSpecializedFunction(com.google.javascript.rhino.Node)",
      "begin_line": 620,
      "end_line": 624,
      "comment": "\n     * Reports that a function has been specialized.\n     *\n     * @param functionNode A specialized AST node with type Token.FUNCTION\n     ",
      "child_ranges": [
        "(line 621,col 7)-(line 623,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.reportSpecializedFunctionContainingNode(com.google.javascript.rhino.Node)",
      "begin_line": 629,
      "end_line": 635,
      "comment": "\n     * Reports that the function containing the node has been specialized.\n     ",
      "child_ranges": [
        "(line 630,col 7)-(line 630,col 57)",
        "(line 632,col 7)-(line 634,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.getRemovedFunctions()",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\n     * The functions removed by this compiler pass.\n     ",
      "child_ranges": [
        "(line 641,col 7)-(line 641,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.reportRemovedFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 653,
      "end_line": 661,
      "comment": "\n     * Reports that a function has been removed.\n     *\n     * @param functionNode A removed AST node with type Token.FUNCTION\n     * @param declaringBlock If the function declaration puts a variable in the\n     *    scope, we need to have a VAR statement in the scope where the\n     *    function is declared. Null if the function does not put a name\n     *    in the scope.\n     ",
      "child_ranges": [
        "(line 657,col 7)-(line 660,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.canFixupFunction(com.google.javascript.rhino.Node)",
      "begin_line": 685,
      "end_line": 714,
      "comment": "\n     * Returns true if the function can be fixed up (that is, if it can be\n     * safely removed or specialized).\n     *\n     * \u003cp\u003eIn order to be safely fixed up, a function must be:\n     * \u003cPRE\u003e\n     * - in the global scope\n     * - not aliased in the initial module\n     * - of one of the following forms:\n     *    function f() {}\n     *    var f \u003d function() {}\n     *    f \u003d function(){}\n     *    var ns \u003d {}; ns.f \u003d function() {}\n     *    SomeClass.prototype.foo \u003d function() {};\n     * \u003c/PRE\u003e\n     *\n     * \u003cp\u003eAnonymous functions cannot be safely fixed up, nor can functions\n     * that have been aliased.\n     *\n     * \u003cp\u003eSome functions declared as object literals could be safely fixed up,\n     * however we do not currently support this.\n     ",
      "child_ranges": [
        "(line 686,col 7)-(line 686,col 61)",
        "(line 688,col 7)-(line 691,col 7)",
        "(line 693,col 7)-(line 696,col 7)",
        "(line 698,col 7)-(line 698,col 45)",
        "(line 699,col 7)-(line 699,col 39)",
        "(line 701,col 7)-(line 704,col 7)",
        "(line 706,col 7)-(line 711,col 7)",
        "(line 713,col 7)-(line 713,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.canFixupSpecializedFunctionContainingNode(com.google.javascript.rhino.Node)",
      "begin_line": 721,
      "end_line": 729,
      "comment": "\n     * Returns true if the function containing n can be fixed up.\n     * Also returns true if n is in the global scope -- since it is always safe\n     * to specialize the global scope.\n     ",
      "child_ranges": [
        "(line 722,col 7)-(line 722,col 54)",
        "(line 723,col 7)-(line 728,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.nodeIsInGlobalScope(com.google.javascript.rhino.Node)",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n     * Returns true if a node is in the global scope; false otherwise.\n     ",
      "child_ranges": [
        "(line 735,col 7)-(line 735,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModule.SpecializationState.containingFunction(com.google.javascript.rhino.Node)",
      "begin_line": 741,
      "end_line": 749,
      "comment": "\n     * Returns the function containing the node, or null if none exists.\n     ",
      "child_ranges": [
        "(line 742,col 7)-(line 746,col 7)",
        "(line 748,col 7)-(line 748,col 18)"
      ]
    }
  ]
}