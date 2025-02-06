{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ByPathWarningsGuard.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ByPathWarningsGuard",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.WarningsGuard"
      ],
      "begin_line": 41,
      "end_line": 112,
      "comment": "\n * An implementation of a {@link WarningsGuard} that can modify the\n * {@link CheckLevel} based on the file that caused the warning, and whether\n * this file matches a set of paths (specified either as include or exclude\n * of path name parts).\n *\n * \u003cp\u003eFor example:\n * \u003cpre\u003e\n * List\u003cString\u003e paths \u003d new ArrayList\u003cString\u003e();\n * paths.add(\"foo\");\n * WarningsGuard guard \u003d\n *     ByPathWarningsGuard.forPath(paths, CheckLevel.ERROR, 1);\n * \u003c/pre\u003e\n *\n * This guard will convert any warning that came from a file that contains \"foo\"\n * in its path to an error.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paths"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "include"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "priority"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ByPathWarningsGuard.ByPathWarningsGuard(java.util.List\u003cjava.lang.String\u003e, boolean, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 57,
      "end_line": 68,
      "comment": "\n   * Constructs a new instance. The priority is determined by the\n   * {@link CheckLevel}: ERROR have Priority.STRICT, and OFF have priority\n   * FILTER_BY_PATH.\n   *\n   * Use {@link #forPath} or {@link #exceptPath} to actually create a new\n   * instance.\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 47)",
        "(line 60,col 5)-(line 61,col 62)",
        "(line 62,col 5)-(line 62,col 23)",
        "(line 63,col 5)-(line 63,col 27)",
        "(line 64,col 5)-(line 64,col 23)",
        "(line 65,col 5)-(line 67,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ByPathWarningsGuard.forPath(java.util.List\u003cjava.lang.String\u003e, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n   * @param paths Paths for matching.\n   * @param level The {@link CheckLevel} to apply on affected files.\n   * @return a new {@link ByPathWarningsGuard} that would affect any file in the\n   *     given set of paths.\n   ",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ByPathWarningsGuard.exceptPath(java.util.List\u003cjava.lang.String\u003e, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n   * @param paths Paths for matching.\n   * @param level The {@link CheckLevel} to apply on affected files.\n   * @return a new {@link ByPathWarningsGuard} that would affect any file not\n   *     in the given set of paths.\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ByPathWarningsGuard.level(com.google.javascript.jscomp.JSError)",
      "begin_line": 92,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 46)",
        "(line 95,col 5)-(line 95,col 54)",
        "(line 96,col 5)-(line 104,col 5)",
        "(line 105,col 5)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ByPathWarningsGuard.getPriority()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 20)"
      ]
    }
  ]
}