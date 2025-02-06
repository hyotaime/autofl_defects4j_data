{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/deps/SimpleDependencyInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleDependencyInfo",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.deps.DependencyInfo"
      ],
      "begin_line": 30,
      "end_line": 109,
      "comment": "\n * A class to hold JS dependency information for a single .js file.\n *\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "provides"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " A list of provided symbols. "
    },
    {
      "type": "field",
      "varNames": [
        "requires"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " A list of required symbols. "
    },
    {
      "type": "field",
      "varNames": [
        "srcPathRelativeToClosure"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The path of the file relative to closure. "
    },
    {
      "type": "field",
      "varNames": [
        "pathOfDefiningFile"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The path to the file from which we extracted the dependency information."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.SimpleDependencyInfo.SimpleDependencyInfo(java.lang.String, java.lang.String, java.util.List\u003cjava.lang.String\u003e, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 55,
      "end_line": 62,
      "comment": "\n   * Constructs a DependencyInfo object with the given list of provides \u0026\n   * requires. This does *not* copy the given lists, but uses them directly.\n   *\n   * @param srcPathRelativeToClosure The closure-relative path of the file\n   *     associated with this DependencyInfo.\n   * @param pathOfDefiningFile The path to the file from which this dependency\n   *     information was extracted.\n   * @param provides List of provided symbols.\n   * @param requires List of required symbols.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 61)",
        "(line 59,col 5)-(line 59,col 49)",
        "(line 60,col 5)-(line 60,col 29)",
        "(line 61,col 5)-(line 61,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SimpleDependencyInfo.getName()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SimpleDependencyInfo.getPathRelativeToClosureBase()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SimpleDependencyInfo.getProvides()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SimpleDependencyInfo.getRequires()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SimpleDependencyInfo.equals(java.lang.Object)",
      "begin_line": 84,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 88,col 5)",
        "(line 89,col 5)-(line 89,col 59)",
        "(line 90,col 5)-(line 94,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SimpleDependencyInfo.toString()",
      "begin_line": 97,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 101,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.SimpleDependencyInfo.hashCode()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 107,col 54)"
      ]
    }
  ]
}