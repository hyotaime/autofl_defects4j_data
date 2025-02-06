{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/deps/PathUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PathUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 208,
      "comment": "\n * Utility methods for manipulation of UNIX-like paths.\n * NOTE: According to kevinb, equivalent methods will be in the standard library once\n * jsr203 is ready.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "SLASH_MATCHER"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_SLASH_MATCHER"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.PathUtil.PathUtil()",
      "begin_line": 38,
      "end_line": 39,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.PathUtil.collapseDots(java.lang.String)",
      "begin_line": 54,
      "end_line": 78,
      "comment": "\n   * Removes all ../ and ./ entries from within the given path. If there are extra ..s that move\n   * beyond the first directory given, they are removed.\n   *\n   * Examples:\n   *   \"a/b/../c\" results in \"a/c\"\n   *   \"./foo/./../bar\" results in \"bar\"\n   *   \"a/..\" results in \"\"\n   *   \"a/../../foo\" results in \"foo\"\n   *\n   * @param path The path to remove dots from.\n   * @return The path with all dots collapsed.\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 41)",
        "(line 57,col 5)-(line 59,col 5)",
        "(line 61,col 5)-(line 61,col 44)",
        "(line 62,col 5)-(line 62,col 53)",
        "(line 63,col 5)-(line 71,col 5)",
        "(line 74,col 5)-(line 76,col 5)",
        "(line 77,col 5)-(line 77,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.PathUtil.isAbsolute(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n   * Determines if a path is absolute or not by testing for the presence of \"/\"\n   * at the front of the string.\n   *\n   * @param path The path to test\n   * @return true if the path starts with DELIMITER, false otherwise.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.PathUtil.removeExtraneousSlashes(java.lang.String)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n   * Removes extra slashes from a path.  Leading slash is preserved, trailing\n   * slash is stripped, and any runs of more than one slash in the middle is\n   * replaced by a single slash.\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 56)",
        "(line 98,col 5)-(line 100,col 5)",
        "(line 102,col 5)-(line 102,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.PathUtil.makeAbsolute(java.lang.String)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n   * Converts the given path into an absolute one. This prepends the current\n   * working directory and removes all .\u0027s from the path. If an absolute path\n   * is given, it will not be prefixed.\n   *\n   * \u003cp\u003eUnlike File.getAbsolutePath(), this function does remove .\u0027s from the\n   * path and unlike File.getCanonicalPath(), this function does not resolve\n   * symlinks and does not use filesystem calls.\u003c/p\u003e\n   *\n   * @param path The path to make absolute.\n   * @return The path made absolute.\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.PathUtil.makeAbsolute(java.lang.String, java.lang.String)",
      "begin_line": 135,
      "end_line": 140,
      "comment": "\n   * Converts the given path into an absolute one. This prepends the given\n   * rootPath and removes all .\u0027s from the path. If an absolute path is given,\n   * it will not be prefixed.\n   *\n   * \u003cp\u003eUnlike File.getAbsolutePath(), this function does remove .\u0027s from the\n   * path and unlike File.getCanonicalPath(), this function does not resolve\n   * symlinks and does not use filesystem calls.\u003c/p\u003e\n   *\n   * @param rootPath The path to prefix to path if path is not already absolute.\n   * @param path The path to make absolute.\n   * @return The path made absolute.\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 138,col 5)",
        "(line 139,col 5)-(line 139,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.PathUtil.makeRelative(java.lang.String, java.lang.String)",
      "begin_line": 162,
      "end_line": 207,
      "comment": "\n   * Returns targetPath relative to basePath.\n   *\n   * \u003cp\u003ebasePath and targetPath must either both be relative, or both be\n   * absolute paths.\u003c/p\u003e\n   *\n   * \u003cp\u003eThis function is different from makeRelative\n   * in that it is able to add in ../ components and collapse existing ones as well.\u003c/p\u003e\n   *\n   * Examples:\n   *   base\u003d\"some/relative/path\" target\u003d\"some/relative/path/foo\" return\u003d\"foo\"\n   *   base\u003d\"some/relative/path\" target\u003d\"some/relative\" return\u003d\"..\"\n   *   base\u003d\"some/relative/path\" target\u003d\"foo/bar\" return\u003d\"../../../foo/bar\"\n   *   base\u003d\"/some/abs/path\" target\u003d\"/foo/bar\" return\u003d\"../../../foo/bar\"\n   *\n   * @param basePath The path to make targetPath relative to.\n   * @param targetPath The path to make relative.\n   * @return A path relative to targetPath. The returned value will never start\n   *     with a slash.\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 170,col 5)",
        "(line 172,col 5)-(line 172,col 38)",
        "(line 173,col 5)-(line 173,col 42)",
        "(line 174,col 5)-(line 174,col 49)",
        "(line 175,col 5)-(line 175,col 53)",
        "(line 177,col 5)-(line 177,col 15)",
        "(line 178,col 5)-(line 199,col 58)",
        "(line 204,col 5)-(line 206,col 80)"
      ]
    }
  ]
}