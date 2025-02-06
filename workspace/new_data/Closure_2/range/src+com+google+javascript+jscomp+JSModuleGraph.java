{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/JSModuleGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSModuleGraph",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 497,
      "comment": "\n * A {@link JSModule} dependency graph that assigns a depth to each module and\n * can answer depth-related queries about them. For the purposes of this class,\n * a module\u0027s depth is defined as the number of hops in the longest path from\n * the module to a module with no dependencies.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "modules"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modulesByDepth"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n   * Lists of modules at each depth. \u003ccode\u003emodulesByDepth.get(3)\u003c/code\u003e is a\n   * list of the modules at depth 3, for example.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "dependencyMap"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n   * dependencyMap is a cache of dependencies that makes the dependsOn\n   * function faster.  Each map entry associates a starting\n   * JSModule with the set of JSModules that are transitively dependent on the\n   * starting module.\n   *\n   * If the cache returns null, then the entry hasn\u0027t been filled in for that\n   * module.\n   *\n   * dependencyMap should be filled from leaf to root so that\n   * getTransitiveDepsDeepestFirst can use its results directly.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.JSModuleGraph(com.google.javascript.jscomp.JSModule[])",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n   * Creates a module graph from a list of modules in dependency order.\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.JSModuleGraph(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 89,
      "end_line": 115,
      "comment": "\n   * Creates a module graph from a list of modules in dependency order.\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 92,col 35)",
        "(line 93,col 5)-(line 93,col 54)",
        "(line 94,col 5)-(line 94,col 42)",
        "(line 96,col 5)-(line 114,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getAllModules()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n   * Gets an iterable over all modules in dependency order.\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getModuleCount()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n   * Gets the total number of modules.\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getRootModule()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n   * Gets the root module.\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.toJson()",
      "begin_line": 147,
      "end_line": 174,
      "comment": "\n   * Returns a JSON representation of the JSModuleGraph. Specifically a\n   * JSONArray of \"Modules\" where each module has a\n   * - \"name\"\n   * - \"dependencies\" (list of module names)\n   * - \"transitive-dependencies\" (list of module names, deepest first)\n   * - \"inputs\" (list of file names)\n   * @return List of module JSONObjects.\n   ",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 40)",
        "(line 149,col 5)-(line 172,col 5)",
        "(line 173,col 5)-(line 173,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.dependsOn(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 180,
      "end_line": 188,
      "comment": "\n   * Determines whether this module depends on a given module. Note that a\n   * module never depends on itself, as that dependency would be cyclic.\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 48)",
        "(line 182,col 5)-(line 185,col 5)",
        "(line 187,col 5)-(line 187,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getDeepestCommonDependency(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 199,
      "end_line": 216,
      "comment": "\n   * Finds the deepest common dependency of two modules, not including the two\n   * modules themselves.\n   *\n   * @param m1 A module in this graph\n   * @param m2 A module in this graph\n   * @return The deepest common dep of {@code m1} and {@code m2}, or null if\n   *     they have no common dependencies\n   ",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 32)",
        "(line 201,col 5)-(line 201,col 32)",
        "(line 204,col 5)-(line 214,col 5)",
        "(line 215,col 5)-(line 215,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getDeepestCommonDependencyInclusive(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 227,
      "end_line": 236,
      "comment": "\n   * Finds the deepest common dependency of two modules, including the\n   * modules themselves.\n   *\n   * @param m1 A module in this graph\n   * @param m2 A module in this graph\n   * @return The deepest common dep of {@code m1} and {@code m2}, or null if\n   *     they have no common dependencies\n   ",
      "child_ranges": [
        "(line 229,col 5)-(line 233,col 5)",
        "(line 235,col 5)-(line 235,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getDeepestCommonDependencyInclusive(java.util.Collection\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 239,
      "end_line": 247,
      "comment": " Returns the deepest common dependency of the given modules. ",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 49)",
        "(line 242,col 5)-(line 242,col 31)",
        "(line 243,col 5)-(line 245,col 5)",
        "(line 246,col 5)-(line 246,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getTransitiveDepsDeepestFirst(com.google.javascript.jscomp.JSModule)",
      "begin_line": 257,
      "end_line": 266,
      "comment": "\n   * Creates an iterable over the transitive dependencies of module {@code m}\n   * in a non-increasing depth ordering. The result does not include the module\n   * {@code m}.\n   *\n   * @param m A module in this graph\n   * @return The transitive dependencies of module {@code m}\n   ",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 46)",
        "(line 259,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 262,col 63)",
        "(line 263,col 5)-(line 263,col 21)",
        "(line 264,col 5)-(line 264,col 31)",
        "(line 265,col 5)-(line 265,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.addDeps(java.util.Set\u003ccom.google.javascript.jscomp.JSModule\u003e, com.google.javascript.jscomp.JSModule)",
      "begin_line": 271,
      "end_line": 276,
      "comment": "\n   * Adds a module\u0027s transitive dependencies to a set.\n   ",
      "child_ranges": [
        "(line 272,col 5)-(line 275,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.coalesceDuplicateFiles()",
      "begin_line": 286,
      "end_line": 309,
      "comment": "\n   * Replaces any files that are found multiple times with a single instance in\n   * the closest parent module that is common to all modules where it appears.\n   *\n   * JSCompiler normally errors if you attempt to compile modules containing the\n   * same file.  This method can be used to remove duplicates before compiling\n   * to avoid such an error.\n   ",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 70)",
        "(line 288,col 5)-(line 292,col 5)",
        "(line 294,col 5)-(line 308,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.manageDependencies(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 330,
      "end_line": 339,
      "comment": "\n   * Applies a DependencyOptions in \"dependency sorting\" and \"dependency pruning\"\n   * mode to the given list of inputs. Returns a new list with the files sorted\n   * and removed. This module graph will be updated to reflect the new list.\n   *\n   * If you need more fine-grained dependency management, you should create your\n   * own DependencyOptions and call\n   * {@code manageDependencies(DependencyOptions, List\u003cCompilerInput\u003e)}.\n   *\n   * @param entryPoints The entry points into the program.\n   *     Expressed as JS symbols.\n   * @param inputs The original list of sources. Used to ensure that the sort\n   *     is stable.\n   * @throws CircularDependencyException if there is a circular dependency\n   *     between the provides and requires.\n   * @throws MissingProvideException if an entry point was not provided\n   *     by any of the inputs.\n   * @see DependencyOptions for more info on how this works.\n   ",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 59)",
        "(line 335,col 5)-(line 335,col 42)",
        "(line 336,col 5)-(line 336,col 42)",
        "(line 337,col 5)-(line 337,col 43)",
        "(line 338,col 5)-(line 338,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.manageDependencies(com.google.javascript.jscomp.DependencyOptions, java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 354,
      "end_line": 433,
      "comment": "\n   * Apply the dependency options to the list of sources, returning a new\n   * source list re-ordering and dropping files as necessary.\n   * This module graph will be updated to reflect the new list.\n   *\n   * @param inputs The original list of sources. Used to ensure that the sort\n   *     is stable.\n   * @throws CircularDependencyException if there is a circular dependency\n   *     between the provides and requires.\n   * @throws MissingProvideException if an entry point was not provided\n   *     by any of the inputs.\n   * @see DependencyOptions for more info on how this works.\n   ",
      "child_ranges": [
        "(line 359,col 5)-(line 360,col 54)",
        "(line 361,col 5)-(line 361,col 66)",
        "(line 362,col 5)-(line 377,col 5)",
        "(line 380,col 5)-(line 381,col 78)",
        "(line 384,col 5)-(line 385,col 36)",
        "(line 386,col 5)-(line 390,col 5)",
        "(line 394,col 5)-(line 396,col 5)",
        "(line 400,col 5)-(line 415,col 5)",
        "(line 419,col 5)-(line 424,col 5)",
        "(line 427,col 5)-(line 427,col 54)",
        "(line 428,col 5)-(line 430,col 5)",
        "(line 432,col 5)-(line 432,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.toGraphvizGraph()",
      "begin_line": 435,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 436,col 5)-(line 437,col 37)",
        "(line 438,col 5)-(line 444,col 5)",
        "(line 445,col 5)-(line 445,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InverseDepthComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003ccom.google.javascript.jscomp.JSModule\u003e"
      ],
      "begin_line": 452,
      "end_line": 457,
      "comment": "\n   * A module depth comparator that considers a deeper module to be \"less than\"\n   * a shallower module. Uses module names to consistently break ties.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.InverseDepthComparator.compare(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 455,col 7)-(line 455,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.depthCompare(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 459,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 462,col 5)",
        "(line 463,col 5)-(line 463,col 27)",
        "(line 464,col 5)-(line 464,col 27)",
        "(line 465,col 5)-(line 465,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ModuleDependenceException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException"
      ],
      "begin_line": 474,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 476,
      "end_line": 476,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dependentModule"
      ],
      "begin_line": 479,
      "end_line": 479,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.ModuleDependenceException.ModuleDependenceException(java.lang.String, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 481,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 483,col 7)-(line 483,col 21)",
        "(line 484,col 7)-(line 484,col 27)",
        "(line 485,col 7)-(line 485,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.ModuleDependenceException.getModule()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 7)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.ModuleDependenceException.getDependentModule()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 493,col 7)-(line 493,col 29)"
      ]
    }
  ]
}