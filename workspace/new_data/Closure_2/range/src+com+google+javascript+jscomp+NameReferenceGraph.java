{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NameReferenceGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameReferenceGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LinkedDirectedGraph\u003ccom.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference\u003e",
        "com.google.javascript.jscomp.DefinitionProvider"
      ],
      "begin_line": 59,
      "end_line": 406,
      "comment": "\n * A graph represents all the referencing of global names in the program. In\n * other words, it is a call and variable-name graph.\n *\n * \u003cp\u003eThe NameReferenceGraph G for a program P is a directed graph G \u003d (V, E)\n * where:\n *\n * \u003cP\u003eV ({@link Name}) represents all global names in P and E \u003d (v, v\u0027), v and\n * v\u0027 in V ({@link Reference} represents a reference use or definition from the\n * name v to v\u0027 in P.\n *\n * \u003cp\u003eThere are two core results we are trying to compute. The first being able\n * to precisely identify the function body at any given call site with\n * {@link #getReferencesAt(Node)}.\n *\n * \u003cp\u003eThe second result come directly from the previous one. The directed edge\n * provides us with dependency information. If A-\u003eB, B might be needed (in this\n * module) if A is needed (in this module). The converse of the this result is\n * more useful. B is not needed if A is not needed.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "referenceMap"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": " list of possible call edge destinations."
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Given a qualified name, provides the Name object."
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " it calls or reference, we\u0027d point it to UNKNOWN."
    },
    {
      "type": "field",
      "varNames": [
        "MAIN"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Represents the \"main\" global block as well as externs."
    },
    {
      "type": "field",
      "varNames": [
        "WINDOW"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The implicit \"window\" object."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.NameReferenceGraph(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 86,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 22)",
        "(line 88,col 5)-(line 88,col 29)",
        "(line 91,col 5)-(line 91,col 42)",
        "(line 92,col 5)-(line 92,col 29)",
        "(line 93,col 5)-(line 94,col 30)",
        "(line 95,col 5)-(line 95,col 29)",
        "(line 97,col 5)-(line 97,col 43)",
        "(line 98,col 5)-(line 98,col 26)",
        "(line 100,col 5)-(line 100,col 38)",
        "(line 101,col 5)-(line 101,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.defineNameIfNotExists(java.lang.String, boolean)",
      "begin_line": 104,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 23)",
        "(line 106,col 5)-(line 113,col 5)",
        "(line 114,col 5)-(line 114,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(com.google.javascript.rhino.Node)",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n   * Retrieves a list of all possible Names that this site is referring to.\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 122,col 43)",
        "(line 123,col 5)-(line 123,col 46)",
        "(line 124,col 5)-(line 126,col 5)",
        "(line 127,col 5)-(line 127,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 51)",
        "(line 133,col 5)-(line 135,col 5)",
        "(line 137,col 5)-(line 137,col 51)",
        "(line 138,col 5)-(line 143,col 5)",
        "(line 145,col 5)-(line 149,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.getSymbol(java.lang.String)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.createNode(com.google.javascript.jscomp.NameReferenceGraph.Name)",
      "begin_line": 156,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 36)",
        "(line 159,col 5)-(line 159,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.connect(com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference, com.google.javascript.jscomp.NameReferenceGraph.Name)",
      "begin_line": 162,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 34)",
        "(line 165,col 5)-(line 165,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Name",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 171,
      "end_line": 351,
      "comment": "\n   * Represents function or variable names that can be referenced globally.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "qName"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Full name"
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declarations"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " A list (re)declarations"
    },
    {
      "type": "field",
      "varNames": [
        "isExtern"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExported"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAliased"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exposedToCallOrApply"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " becomes aware of those cases."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.Name(java.lang.String, boolean)",
      "begin_line": 196,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 25)",
        "(line 198,col 7)-(line 198,col 31)",
        "(line 199,col 7)-(line 199,col 43)",
        "(line 200,col 7)-(line 200,col 75)",
        "(line 201,col 7)-(line 201,col 72)",
        "(line 202,col 7)-(line 203,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.getType()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 7)-(line 207,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.setType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 7)-(line 211,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.getDeclarations()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 7)-(line 215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.addAssignmentDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 7)-(line 219,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.addFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 7)-(line 223,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.isExtern()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 7)-(line 227,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.markExported()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 7)-(line 231,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.isExported()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 7)-(line 235,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.remove()",
      "begin_line": 239,
      "end_line": 243,
      "comment": " Removes all of the declarations of this name. ",
      "child_ranges": [
        "(line 240,col 7)-(line 242,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.isAliased()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * @return {@code} True if this name has been dereferenced. Removing from\n     *     the program or the module is no longer safe unless further analysis\n     *     can prove otherwise.\n     ",
      "child_ranges": [
        "(line 251,col 7)-(line 251,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.setAliased(boolean)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 7)-(line 255,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.hasSideEffect()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.getQualifiedName()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 7)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.getPropertyName()",
      "begin_line": 270,
      "end_line": 277,
      "comment": "\n     * @return The short property name of this object if it is a property, else\n     *     {@code null}.\n     ",
      "child_ranges": [
        "(line 271,col 7)-(line 271,col 50)",
        "(line 272,col 7)-(line 276,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.isCallable()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.exposedToCallOrApply()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 7)-(line 284,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.markExposedToCallOrApply()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.toString()",
      "begin_line": 291,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 293,col 7)-(line 293,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.hashCode()",
      "begin_line": 296,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.canChangeSignature()",
      "begin_line": 316,
      "end_line": 335,
      "comment": "\n     * Return true if it\u0027s safe to change the signature of the function\n     * references by this name. It is safe to change the signature if the Name\n     * is:\n     * \u003cul\u003e\n     * \u003cli\u003ecallable\u003c/li\u003e\n     * \u003cli\u003enot an extern\u003c/li\u003e\n     * \u003cli\u003enot been aliased\u003c/li\u003e\n     * \u003cli\u003enot been exported\u003c/li\u003e\n     * \u003cli\u003eReferred by call or apply functions\u003c/li\u003e\n     * \u003cli\u003eThe function uses the arguments property\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return true if it\u0027s safe to change the signature of the name.\n     ",
      "child_ranges": [
        "(line 329,col 7)-(line 334,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Name.nameUsesArgumentsProperty()",
      "begin_line": 343,
      "end_line": 350,
      "comment": "\n     * Returns true if the the arguments property is used in any of the function\n     * definition.\n     * Ex. function foo(a,b,c) {return arguments.size;};\n     * @return True is arguments is present in one of the definitions.\n     ",
      "child_ranges": [
        "(line 344,col 7)-(line 348,col 7)",
        "(line 349,col 7)-(line 349,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 357,
      "end_line": 405,
      "comment": "\n   * A reference site for a function or a variable reference. It can be a\n   * reference use or an assignment to that name.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "site"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " The node that references the name."
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Parent pointer."
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isUnknown"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " A.x() reference to someObject.y and B.y MAY be the site."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Reference.Reference(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 371,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 372,col 7)-(line 372,col 23)",
        "(line 373,col 7)-(line 373,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Reference.isUnknown()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 377,col 7)-(line 377,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Reference.setUnknown(boolean)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 7)-(line 381,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Reference.getModule()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 7)-(line 385,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Reference.setModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 7)-(line 389,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Reference.isCall()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 393,col 7)-(line 393,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraph.Reference.getSite()",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Get accessor for retrieving the actual node corresponding to the\n     * reference.\n     *\n     * @return node representing the access/reference/call site\n     ",
      "child_ranges": [
        "(line 403,col 7)-(line 403,col 18)"
      ]
    }
  ]
}