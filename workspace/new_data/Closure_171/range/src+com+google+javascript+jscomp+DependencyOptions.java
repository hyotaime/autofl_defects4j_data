{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/DependencyOptions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DependencyOptions",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 140,
      "comment": "\n * Options for how to manage dependencies between input files.\n *\n * Dependency information is usually pulled out from the JS code by\n * looking for primitive dependency functions (like Closure Library\u0027s\n * goog.provide/goog.require). Analysis of this dependency information is\n * controlled by {@code CodingConvention}, which lets you define those\n * dependency primitives.\n *\n * This options class determines how we use that dependency information\n * to change how code is built.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sortDependencies"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pruneDependencies"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dropMoochers"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryPoints"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.setDependencySorting(boolean)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n   * Enables or disables dependency sorting mode.\n   *\n   * If true, we will sort the input files based on dependency information\n   * in them. Otherwise, we will use the order of files specified\n   * on the command-line.\n   * @return this for easy building.\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 36)",
        "(line 57,col 5)-(line 57,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.setDependencyPruning(boolean)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n   * Enables or disables dependency pruning mode.\n   *\n   * In dependency pruning mode, we will look for all files that provide a\n   * symbol. Unless that file is a transitive dependency of a file that\n   * we\u0027re using, we will remove it from the compilation job.\n   *\n   * This does not affect how we handle files that do not provide symbols.\n   * See setMoocherDropping for information on how these are handled.\n   *\n   * @return this for easy chaining.\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 37)",
        "(line 74,col 5)-(line 74,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.setMoocherDropping(boolean)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n   * Enables or disables moocher dropping mode.\n   *\n   * A \u0027moocher\u0027 is a file that does not provide any symbols (though they\n   * may require symbols). This is usually because they don\u0027t want to\n   * tie themselves to a particular dependency system (e.g., Closure\u0027s\n   * goog.provide, CommonJS modules). So they rely on other people to\n   * manage dependencies on them.\n   *\n   * If true, we drop these files when we prune dependencies.\n   * If false, we always keep these files an anything they depend on.\n   * The default is false.\n   *\n   * Notice that this option only makes sense if dependency pruning is on,\n   * and a set of entry points is specified.\n   *\n   * @return this for easy chaining.\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 32)",
        "(line 97,col 5)-(line 97,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.setEntryPoints(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n   * Adds a collection of symbols to always keep.\n   *\n   * In dependency pruning mode, we will automatically keep all the\n   * transitive dependencies of these symbols.\n   *\n   * The syntactic form of a symbol depends on the type of dependency\n   * primitives we\u0027re using. For example, goog.provide(\u0027foo.bar\u0027)\n   * provides the symbol \u0027foo.bar\u0027.\n   *\n   * Entry points can be scoped to a module by specifying \u0027mod2:foo.bar\u0027.\n   *\n   * @return this for easy chaining.\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 24)",
        "(line 116,col 5)-(line 116,col 32)",
        "(line 117,col 5)-(line 117,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.needsManagement()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " Returns whether re-ordering of files is needed. ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.shouldSortDependencies()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.shouldPruneDependencies()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.shouldDropMoochers()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DependencyOptions.getEntryPoints()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 23)"
      ]
    }
  ]
}