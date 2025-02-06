{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/deps/SortedDependencies.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SortedDependencies",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 301,
      "comment": "\n * A sorted list of inputs with dependency information. Uses a stable\n * topological sort to make sure that an input always comes after its\n * dependencies.\n *\n * Also exposes other information about the inputs, like which inputs\n * do not provide symbols.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "inputs"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sortedList"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " A topologically sorted list of the inputs."
    },
    {
      "type": "field",
      "varNames": [
        "noProvides"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A list of all the inputs that do not have provides."
    },
    {
      "type": "field",
      "varNames": [
        "provideMap"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.SortedDependencies(java.util.List\u003cINPUT\u003e)",
      "begin_line": 64,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 45)",
        "(line 67,col 5)-(line 67,col 38)",
        "(line 70,col 5)-(line 79,col 5)",
        "(line 82,col 5)-(line 82,col 62)",
        "(line 83,col 5)-(line 90,col 5)",
        "(line 93,col 5)-(line 93,col 53)",
        "(line 101,col 5)-(line 107,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.getInputProviding(java.lang.String)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n   * Return the input that gives us the given symbol.\n   * @throws MissingProvideException An exception if there is no\n   *     input for this symbol.\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 119,col 5)",
        "(line 120,col 5)-(line 120,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.maybeGetInputProviding(java.lang.String)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n   * Return the input that gives us the given symbol, or null.\n   ",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.findCycle(java.util.List\u003cINPUT\u003e, com.google.common.collect.Multimap\u003cINPUT, INPUT\u003e)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n   * Returns the first circular dependency found. Expressed as a list of\n   * items in reverse dependency order (the second element depends on the\n   * first, etc.).\n   ",
      "child_ranges": [
        "(line 137,col 5)-(line 138,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.findCycle(INPUT, java.util.Set\u003cINPUT\u003e, com.google.common.collect.Multimap\u003cINPUT, INPUT\u003e, java.util.Set\u003cINPUT\u003e)",
      "begin_line": 141,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 162,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.findRequireInSubGraphOrFail(INPUT, java.util.Set\u003cINPUT\u003e)",
      "begin_line": 165,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 171,col 5)",
        "(line 172,col 5)-(line 172,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.cycleToString(java.util.List\u003cINPUT\u003e)",
      "begin_line": 178,
      "end_line": 185,
      "comment": "\n   * @param cycle A cycle in reverse-dependency order.\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 48)",
        "(line 180,col 5)-(line 182,col 5)",
        "(line 183,col 5)-(line 183,col 32)",
        "(line 184,col 5)-(line 184,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.getSortedList()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.getSortedDependenciesOf(java.util.List\u003cINPUT\u003e)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n   * Gets all the dependencies of the given roots. The inputs must be returned\n   * in a stable order. In other words, if A comes before B, and A does not\n   * transitively depend on B, then A must also come before B in the returned\n   * list.\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.getDependenciesOf(java.util.List\u003cINPUT\u003e, boolean)",
      "begin_line": 210,
      "end_line": 233,
      "comment": "\n   * Gets all the dependencies of the given roots. The inputs must be returned\n   * in a stable order. In other words, if A comes before B, and A does not\n   * transitively depend on B, then A must also come before B in the returned\n   * list.\n   *\n   * @param sorted If true, get them in topologically sorted order. If false,\n   *     get them in the original order they were passed to the compiler.\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 59)",
        "(line 212,col 5)-(line 212,col 44)",
        "(line 213,col 5)-(line 213,col 57)",
        "(line 214,col 5)-(line 224,col 5)",
        "(line 226,col 5)-(line 226,col 67)",
        "(line 227,col 5)-(line 231,col 5)",
        "(line 232,col 5)-(line 232,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.getInputsWithoutProvides()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.topologicalStableSort(java.util.List\u003cT\u003e, com.google.common.collect.Multimap\u003cT, T\u003e)",
      "begin_line": 239,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 245,col 5)",
        "(line 247,col 5)-(line 247,col 60)",
        "(line 248,col 5)-(line 250,col 5)",
        "(line 252,col 5)-(line 259,col 7)",
        "(line 260,col 5)-(line 260,col 42)",
        "(line 262,col 5)-(line 262,col 49)",
        "(line 263,col 5)-(line 263,col 60)",
        "(line 264,col 5)-(line 264,col 44)",
        "(line 267,col 5)-(line 273,col 5)",
        "(line 276,col 5)-(line 285,col 5)",
        "(line 287,col 5)-(line 287,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.Anonymous-fc6ab70c-0676-44ca-9cf8-97e563855b22.compare(T, T)",
      "begin_line": 254,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 257,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CircularDependencyException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 290,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException.CircularDependencyException(java.lang.String)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 7)-(line 292,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MissingProvideException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 296,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException.MissingProvideException(java.lang.String)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 21)"
      ]
    }
  ]
}