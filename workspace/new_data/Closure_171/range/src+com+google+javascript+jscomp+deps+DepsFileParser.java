{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/deps/DepsFileParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DepsFileParser",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.deps.JsFileLineParser"
      ],
      "begin_line": 42,
      "end_line": 174,
      "comment": "\n * A parser that can extract dependency information from existing deps.js files.\n *\n * \u003cp\u003eSee //javascript/closure/deps.js for an example file.\u003c/p\u003e\n *\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "depMatcher"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": "\n   * Pattern for matching JavaScript string literals. The group is:\n   * goog.addDependency({1});\n   "
    },
    {
      "type": "field",
      "varNames": [
        "depArgsMatch"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n   * Pattern for matching the args of a goog.addDependency(). The group is:\n   * goog.addDependency({1}, {2}, {3});\n   "
    },
    {
      "type": "field",
      "varNames": [
        "depInfos"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n   * The dependency information extracted from the current file.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "pathTranslator"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Translates paths in different build systems. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParser.DepsFileParser(com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n   * Constructor\n   *\n   * @param errorManager Handles parse errors.\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParser.DepsFileParser(com.google.common.base.Function\u003cjava.lang.String, java.lang.String\u003e, com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n   * @param pathTranslator Translates paths in different build systems.\n   * @param errorManager Handles parse errors.\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 24)",
        "(line 84,col 5)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParser.parseFile(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n   * Parses the given file and returns a list of dependency information that it\n   * contained.\n   *\n   * @param filePath Path to the file to parse.\n   * @return A list of DependencyInfo objects.\n   * @throws IOException Thrown if the file could not be read.\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParser.parseFile(java.lang.String, java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n   * Parses the given file and returns a list of dependency information that it\n   * contained.\n   * It uses the passed in fileContents instead of reading the file.\n   *\n   * @param filePath Path to the file to parse.\n   * @param fileContents The contents to parse.\n   * @return A list of DependencyInfo objects.\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParser.parseFileReader(java.lang.String, java.io.Reader)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n   * Parses the file from the given reader and returns a list of\n   * dependency information that it contained.\n   *\n   * @param filePath Path to the file to parse.\n   * @param reader A reader for the file.\n   * @return A list of DependencyInfo objects.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 36)",
        "(line 123,col 5)-(line 123,col 44)",
        "(line 124,col 5)-(line 124,col 30)",
        "(line 125,col 5)-(line 125,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParser.parseLine(java.lang.String)",
      "begin_line": 136,
      "end_line": 173,
      "comment": "\n   * Extracts dependency information from lines that look like\n   *   goog.addDependency(\u0027pathRelativeToClosure\u0027, [\u0027provides\u0027], [\u0027requires\u0027]);\n   * Adds the dependencies to depInfos.\n   *\n   * @throws ParseException Thrown if the given line has a malformed\n   *     goog.addDependency().\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 36)",
        "(line 142,col 5)-(line 169,col 5)",
        "(line 171,col 5)-(line 172,col 50)"
      ]
    }
  ]
}