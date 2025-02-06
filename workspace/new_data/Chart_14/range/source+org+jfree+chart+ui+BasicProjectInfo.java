{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/ui/BasicProjectInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicProjectInfo",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.ui.Library"
      ],
      "begin_line": 52,
      "end_line": 304,
      "comment": "\n * Basic project info.\n "
    },
    {
      "type": "class_interface",
      "name": "OptionalLibraryHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 132,
      "comment": "\n     * A helper class, which simplifies the loading of optional library\n     * implementations. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "libraryClass"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "library"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.OptionalLibraryHolder(java.lang.String)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "\n         * Creates a new instance.\n         * \n         * @param libraryClass  the library class.\n         ",
      "child_ranges": [
        "(line 68,col 13)-(line 71,col 13)",
        "(line 72,col 13)-(line 72,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.OptionalLibraryHolder(org.jfree.chart.ui.Library)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "\n         * Creates a new instance.\n         * \n         * @param library  the library (\u003ccode\u003enull\u003c/code\u003e not permitted).\n         ",
      "child_ranges": [
        "(line 81,col 11)-(line 83,col 11)",
        "(line 84,col 11)-(line 84,col 33)",
        "(line 85,col 11)-(line 85,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.getLibraryClass()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n         * Returns the library class.\n         * \n         * @return The library class.\n         ",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.getLibrary()",
      "begin_line": 102,
      "end_line": 107,
      "comment": "\n         * Returns the library.\n         * \n         * @return The library.\n         ",
      "child_ranges": [
        "(line 103,col 13)-(line 105,col 13)",
        "(line 106,col 13)-(line 106,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.loadLibrary(java.lang.String)",
      "begin_line": 109,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 110,col 13)-(line 112,col 13)",
        "(line 113,col 13)-(line 129,col 13)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "copyright"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The project copyright statement. "
    },
    {
      "type": "field",
      "varNames": [
        "libraries"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " A list of libraries used by the project. "
    },
    {
      "type": "field",
      "varNames": [
        "optionalLibraries"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.BasicProjectInfo()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 41)",
        "(line 147,col 9)-(line 147,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.BasicProjectInfo(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 158,
      "end_line": 165,
      "comment": "\n     * Creates a new library reference.\n     *\n     * @param name    the name.\n     * @param version the version.\n     * @param licence the licence.\n     * @param info    the web address or other info.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 15)",
        "(line 161,col 9)-(line 161,col 22)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 164,col 9)-(line 164,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.BasicProjectInfo(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 176,
      "end_line": 181,
      "comment": "\n     * Creates a new project info instance.\n     * \n     * @param name  the project name.\n     * @param version  the project version.\n     * @param info  the project info (web site for example).\n     * @param copyright  the copyright statement.\n     * @param licenceName  the license name.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 47)",
        "(line 180,col 9)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.getCopyright()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the copyright statement.\n     *\n     * @return The copyright statement.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.setCopyright(java.lang.String)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Sets the project copyright statement.\n     *\n     * @param copyright  the project copyright statement.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.setInfo(java.lang.String)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Sets the project info string (for example, this could be the project URL).\n     * \n     * @param info  the info string.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.setLicenceName(java.lang.String)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Sets the license name.\n     * \n     * @param licence  the license name.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.setName(java.lang.String)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Sets the project name.\n     * \n     * @param name  the project name.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.setVersion(java.lang.String)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Sets the project version number.\n     * \n     * @param version  the version number.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.getLibraries()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * Returns a list of libraries used by the project.\n     *\n     * @return the list of libraries.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 244,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.addLibrary(org.jfree.chart.ui.Library)",
      "begin_line": 252,
      "end_line": 257,
      "comment": "\n     * Adds a library.\n     * \n     * @param library  the library.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.getOptionalLibraries()",
      "begin_line": 264,
      "end_line": 275,
      "comment": "\n     * Returns a list of optional libraries used by the project.\n     *\n     * @return the list of libraries.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 46)",
        "(line 266,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.addOptionalLibrary(java.lang.String)",
      "begin_line": 282,
      "end_line": 288,
      "comment": "\n     * Adds an optional library.\n     *\n     * @param libraryClass  the library.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 287,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.BasicProjectInfo.addOptionalLibrary(org.jfree.chart.ui.Library)",
      "begin_line": 298,
      "end_line": 303,
      "comment": "\n     * Adds an optional library. These libraries will be booted, if they define\n     * a boot class. A missing class is considered non-fatal and it is assumed\n     * that the programm knows how to handle that.\n     *\n     * @param library  the library.\n     ",
      "child_ranges": [
        "(line 299,col 7)-(line 301,col 7)",
        "(line 302,col 7)-(line 302,col 69)"
      ]
    }
  ]
}