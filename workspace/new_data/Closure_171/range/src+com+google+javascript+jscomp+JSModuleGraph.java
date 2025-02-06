{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/JSModuleGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSModuleGraph",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 550,
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
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getModulesByName()",
      "begin_line": 127,
      "end_line": 133,
      "comment": "\n   * Gets all modules indexed by name.\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 53)",
        "(line 129,col 5)-(line 131,col 5)",
        "(line 132,col 5)-(line 132,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getModuleCount()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n   * Gets the total number of modules.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getRootModule()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n   * Gets the root module.\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.toJson()",
      "begin_line": 158,
      "end_line": 185,
      "comment": "\n   * Returns a JSON representation of the JSModuleGraph. Specifically a\n   * JSONArray of \"Modules\" where each module has a\n   * - \"name\"\n   * - \"dependencies\" (list of module names)\n   * - \"transitive-dependencies\" (list of module names, deepest first)\n   * - \"inputs\" (list of file names)\n   * @return List of module JSONObjects.\n   ",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 40)",
        "(line 160,col 5)-(line 183,col 5)",
        "(line 184,col 5)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.dependsOn(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 191,
      "end_line": 199,
      "comment": "\n   * Determines whether this module depends on a given module. Note that a\n   * module never depends on itself, as that dependency would be cyclic.\n   ",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 48)",
        "(line 193,col 5)-(line 196,col 5)",
        "(line 198,col 5)-(line 198,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getDeepestCommonDependency(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 210,
      "end_line": 227,
      "comment": "\n   * Finds the deepest common dependency of two modules, not including the two\n   * modules themselves.\n   *\n   * @param m1 A module in this graph\n   * @param m2 A module in this graph\n   * @return The deepest common dep of {@code m1} and {@code m2}, or null if\n   *     they have no common dependencies\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 32)",
        "(line 212,col 5)-(line 212,col 32)",
        "(line 215,col 5)-(line 225,col 5)",
        "(line 226,col 5)-(line 226,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getDeepestCommonDependencyInclusive(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 238,
      "end_line": 247,
      "comment": "\n   * Finds the deepest common dependency of two modules, including the\n   * modules themselves.\n   *\n   * @param m1 A module in this graph\n   * @param m2 A module in this graph\n   * @return The deepest common dep of {@code m1} and {@code m2}, or null if\n   *     they have no common dependencies\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 244,col 5)",
        "(line 246,col 5)-(line 246,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getDeepestCommonDependencyInclusive(java.util.Collection\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 250,
      "end_line": 258,
      "comment": " Returns the deepest common dependency of the given modules. ",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 49)",
        "(line 253,col 5)-(line 253,col 31)",
        "(line 254,col 5)-(line 256,col 5)",
        "(line 257,col 5)-(line 257,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.getTransitiveDepsDeepestFirst(com.google.javascript.jscomp.JSModule)",
      "begin_line": 268,
      "end_line": 277,
      "comment": "\n   * Creates an iterable over the transitive dependencies of module {@code m}\n   * in a non-increasing depth ordering. The result does not include the module\n   * {@code m}.\n   *\n   * @param m A module in this graph\n   * @return The transitive dependencies of module {@code m}\n   ",
      "child_ranges": [
        "(line 269,col 5)-(line 269,col 46)",
        "(line 270,col 5)-(line 272,col 5)",
        "(line 273,col 5)-(line 273,col 63)",
        "(line 274,col 5)-(line 274,col 21)",
        "(line 275,col 5)-(line 275,col 31)",
        "(line 276,col 5)-(line 276,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.addDeps(java.util.Set\u003ccom.google.javascript.jscomp.JSModule\u003e, com.google.javascript.jscomp.JSModule)",
      "begin_line": 282,
      "end_line": 287,
      "comment": "\n   * Adds a module\u0027s transitive dependencies to a set.\n   ",
      "child_ranges": [
        "(line 283,col 5)-(line 286,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.coalesceDuplicateFiles()",
      "begin_line": 297,
      "end_line": 320,
      "comment": "\n   * Replaces any files that are found multiple times with a single instance in\n   * the closest parent module that is common to all modules where it appears.\n   *\n   * JSCompiler normally errors if you attempt to compile modules containing the\n   * same file.  This method can be used to remove duplicates before compiling\n   * to avoid such an error.\n   ",
      "child_ranges": [
        "(line 298,col 5)-(line 298,col 70)",
        "(line 299,col 5)-(line 303,col 5)",
        "(line 305,col 5)-(line 319,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.manageDependencies(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 341,
      "end_line": 352,
      "comment": "\n   * Applies a DependencyOptions in \"dependency sorting\" and \"dependency pruning\"\n   * mode to the given list of inputs. Returns a new list with the files sorted\n   * and removed. This module graph will be updated to reflect the new list.\n   *\n   * If you need more fine-grained dependency management, you should create your\n   * own DependencyOptions and call\n   * {@code manageDependencies(DependencyOptions, List\u003cCompilerInput\u003e)}.\n   *\n   * @param entryPoints The entry points into the program.\n   *     Expressed as JS symbols.\n   * @param inputs The original list of sources. Used to ensure that the sort\n   *     is stable.\n   * @throws CircularDependencyException if there is a circular dependency\n   *     between the provides and requires.\n   * @throws MissingProvideException if an entry point was not provided\n   *     by any of the inputs.\n   * @see DependencyOptions for more info on how this works.\n   ",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 59)",
        "(line 348,col 5)-(line 348,col 42)",
        "(line 349,col 5)-(line 349,col 42)",
        "(line 350,col 5)-(line 350,col 43)",
        "(line 351,col 5)-(line 351,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.manageDependencies(com.google.javascript.jscomp.DependencyOptions, java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 367,
      "end_line": 432,
      "comment": "\n   * Apply the dependency options to the list of sources, returning a new\n   * source list re-ordering and dropping files as necessary.\n   * This module graph will be updated to reflect the new list.\n   *\n   * @param inputs The original list of sources. Used to ensure that the sort\n   *     is stable.\n   * @throws CircularDependencyException if there is a circular dependency\n   *     between the provides and requires.\n   * @throws MissingProvideException if an entry point was not provided\n   *     by any of the inputs.\n   * @see DependencyOptions for more info on how this works.\n   ",
      "child_ranges": [
        "(line 373,col 5)-(line 374,col 54)",
        "(line 375,col 5)-(line 376,col 36)",
        "(line 379,col 5)-(line 380,col 78)",
        "(line 383,col 5)-(line 384,col 36)",
        "(line 385,col 5)-(line 389,col 5)",
        "(line 393,col 5)-(line 395,col 5)",
        "(line 399,col 5)-(line 414,col 5)",
        "(line 418,col 5)-(line 423,col 5)",
        "(line 426,col 5)-(line 426,col 54)",
        "(line 427,col 5)-(line 429,col 5)",
        "(line 431,col 5)-(line 431,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.createEntryPointInputs(com.google.javascript.jscomp.DependencyOptions, java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e, com.google.javascript.jscomp.deps.SortedDependencies\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 434,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 66)",
        "(line 440,col 5)-(line 440,col 61)",
        "(line 442,col 5)-(line 478,col 5)",
        "(line 479,col 5)-(line 479,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.toGraphvizGraph()",
      "begin_line": 482,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 483,col 5)-(line 484,col 37)",
        "(line 485,col 5)-(line 491,col 5)",
        "(line 492,col 5)-(line 492,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InverseDepthComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003ccom.google.javascript.jscomp.JSModule\u003e"
      ],
      "begin_line": 499,
      "end_line": 504,
      "comment": "\n   * A module depth comparator that considers a deeper module to be \"less than\"\n   * a shallower module. Uses module names to consistently break ties.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.InverseDepthComparator.compare(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 500,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 502,col 7)-(line 502,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.depthCompare(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 506,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 507,col 5)-(line 509,col 5)",
        "(line 510,col 5)-(line 510,col 27)",
        "(line 511,col 5)-(line 511,col 27)",
        "(line 512,col 5)-(line 512,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ModuleDependenceException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException"
      ],
      "begin_line": 520,
      "end_line": 541,
      "comment": "\n   * Exception class for declaring when the modules being fed into a\n   * JSModuleGraph as input aren\u0027t in dependence order, and so can\u0027t be\n   * processed for caching of various dependency-related queries.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dependentModule"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.ModuleDependenceException.ModuleDependenceException(java.lang.String, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 527,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 529,col 7)-(line 529,col 21)",
        "(line 530,col 7)-(line 530,col 27)",
        "(line 531,col 7)-(line 531,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.ModuleDependenceException.getModule()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 7)-(line 535,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.ModuleDependenceException.getDependentModule()",
      "begin_line": 538,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 539,col 7)-(line 539,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MissingModuleException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 544,
      "end_line": 548,
      "comment": " Another exception class "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JSModuleGraph.MissingModuleException.MissingModuleException(java.lang.String)",
      "begin_line": 545,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 7)-(line 546,col 24)"
      ]
    }
  ]
}