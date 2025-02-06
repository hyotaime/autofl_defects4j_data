{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/SymbolTable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SymbolTable",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticSymbolTable\u003ccom.google.javascript.jscomp.SymbolTable.Symbol, com.google.javascript.jscomp.SymbolTable.Reference\u003e"
      ],
      "begin_line": 95,
      "end_line": 1654,
      "comment": "\n * A symbol table for people that want to use Closure Compiler as an indexer.\n *\n * Contains an index of all the symbols in the code within a compilation\n * job. The API is designed for people who want to visit all the symbols, rather\n * than people who want to lookup a specific symbol by a certain key.\n *\n * We can use this to combine different types of symbol tables. For example,\n * one class might have a {@code StaticSymbolTable} of all variable references,\n * and another class might have a {@code StaticSymbolTable} of all type names\n * in JSDoc comments. This class allows you to combine them into a unified\n * index.\n *\n * Most passes build their own \"partial\" symbol table that implements the same\n * interface (StaticSymbolTable, StaticSlot, and friends). Individual compiler\n * passes usually need more or less metadata about the certainty of symbol\n * information. Building a complete symbol table with all the necessary metadata\n * for all passes would be too slow. However, as long as these \"partial\" symbol\n * tables implement the proper interfaces, we should be able to add them to this\n * symbol table to make it more complete.\n *\n * If clients want fast lookup, they should build their own wrapper around\n * this symbol table that indexes symbols or references by the desired lookup\n * key.\n *\n * By design, when this symbol table creates symbols for types, it tries\n * to mimic the symbol table you would get in an OO language. For example,\n * the \"type Foo\" and \"the constructor that creates objects of type Foo\"\n * are the same symbol. The types of \"Foo.prototype\" and \"new Foo()\" also\n * have the same symbol. Although JSCompiler internally treats these as\n * distinct symbols, we assume that most clients will not care about\n * the distinction.\n *\n * @see #addSymbolsFrom For more information on how to write plugins for this\n *    symbol table.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GLOBAL_THIS"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n   * The name we use for the JavaScript built-in Global object.  It\u0027s\n   * anonymous in JavaScript, so we have to give it an invalid identifier\n   * to avoid conflicts with user-defined property names.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "symbols"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n   * All symbols in the program, uniquely identified by the node where\n   * they\u0027re declared and their name.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "scopes"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n   * All syntactic scopes in the program, uniquely identified by the node where\n   * they\u0027re declared.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "docInfos"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n   * All JSDocInfo in the program.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "globalScope"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolTable(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n   * Clients should get a symbol table by asking the compiler at the end\n   * of a compilation job.\n   ",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getReferences(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getReferenceList(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getAllSymbols()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getAllSymbolsSorted()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\n   * Get the symbols in their natural ordering.\n   * Always returns a mutable list.\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 70)",
        "(line 156,col 5)-(line 156,col 64)",
        "(line 157,col 5)-(line 157,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getNaturalSymbolOrdering()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n   * Gets the \u0027natural\u0027 ordering of symbols.\n   *\n   * Right now, we only guarantee that symbols in the global scope will come\n   * before symbols in local scopes. After that, the order is deterministic but\n   * undefined.\n   ",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getScope(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getAllJSDocInfo()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.declareInferredSymbol(com.google.javascript.jscomp.SymbolTable.SymbolScope, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n   * Declare a symbol after the main symbol table was constructed.\n   * Throws an exception if you try to declare a symbol twice.\n   ",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getEnclosingScope(com.google.javascript.rhino.Node)",
      "begin_line": 194,
      "end_line": 207,
      "comment": "\n   * Gets the scope that contains the given node.\n   * If {@code n} is a function name, we return the scope that contains the\n   * function, not the function itself.\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 33)",
        "(line 196,col 5)-(line 199,col 5)",
        "(line 201,col 5)-(line 205,col 5)",
        "(line 206,col 5)-(line 206,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getParameterInFunction(com.google.javascript.jscomp.SymbolTable.Symbol, java.lang.String)",
      "begin_line": 222,
      "end_line": 231,
      "comment": "\n   * If {@code sym} is a function, try to find a Symbol for\n   * a parameter with the given name.\n   *\n   * Returns null if we couldn\u0027t find one.\n   *\n   * Notice that this just makes a best effort, and may not be able\n   * to find parameters for non-conventional function definitions.\n   * For example, we would not be able to find \"y\" in this code:\n   * \u003ccode\u003e\n   * var x \u003d x() ? function(y) {} : function(y) {};\n   * \u003c/code\u003e\n   ",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 48)",
        "(line 224,col 5)-(line 229,col 5)",
        "(line 230,col 5)-(line 230,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getScopeInFunction(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 233,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 46)",
        "(line 235,col 5)-(line 237,col 5)",
        "(line 239,col 5)-(line 239,col 41)",
        "(line 240,col 5)-(line 242,col 5)",
        "(line 244,col 5)-(line 244,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getSymbolForScope(com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 252,
      "end_line": 257,
      "comment": "\n   * All local scopes are associated with a function, and some functions\n   * are associated with a symbol. Returns the symbol associated with the given\n   * scope.\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 255,col 5)",
        "(line 256,col 5)-(line 256,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.findSymbolForScope(com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 265,
      "end_line": 278,
      "comment": "\n   * Find the symbol associated with the given scope.\n   * Notice that we won\u0027t always be able to figure out this association\n   * dynamically, so sometimes we\u0027ll just create the association when we\n   * create the scope.\n   ",
      "child_ranges": [
        "(line 266,col 5)-(line 266,col 40)",
        "(line 267,col 5)-(line 269,col 5)",
        "(line 271,col 5)-(line 273,col 5)",
        "(line 275,col 5)-(line 276,col 42)",
        "(line 277,col 5)-(line 277,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getAllSymbolsForTypeOf(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n   * Get all symbols associated with the type of the given symbol.\n   *\n   * For example, given a variable x declared as\n   * /* @type {Array|Date} /\n   * var x \u003d f();\n   * this will return the constructors for Array and Date.\n   ",
      "child_ranges": [
        "(line 289,col 5)-(line 289,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getGlobalScope()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n   * Returns the global scope.\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getSymbolDeclaredBy(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 302,
      "end_line": 306,
      "comment": "\n   * Gets the symbol for the given constructor or interface.\n   ",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 69)",
        "(line 304,col 5)-(line 304,col 51)",
        "(line 305,col 5)-(line 305,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getSymbolDeclaredBy(com.google.javascript.rhino.jstype.EnumType)",
      "begin_line": 311,
      "end_line": 314,
      "comment": "\n   * Gets the symbol for the given enum.\n   ",
      "child_ranges": [
        "(line 312,col 5)-(line 313,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getSymbolForInstancesOf(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 320,
      "end_line": 326,
      "comment": "\n   * Gets the symbol for the prototype if this is the symbol for a constructor\n   * or interface.\n   ",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 44)",
        "(line 322,col 5)-(line 324,col 5)",
        "(line 325,col 5)-(line 325,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getSymbolForInstancesOf(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 331,
      "end_line": 335,
      "comment": "\n   * Gets the symbol for the prototype of the given constructor or interface.\n   ",
      "child_ranges": [
        "(line 332,col 5)-(line 332,col 69)",
        "(line 333,col 5)-(line 333,col 41)",
        "(line 334,col 5)-(line 334,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getSymbolForName(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 337,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 340,col 5)",
        "(line 342,col 5)-(line 343,col 48)",
        "(line 347,col 5)-(line 347,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getAllSymbolsForType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 356,
      "end_line": 376,
      "comment": "\n   * Gets all symbols associated with the given type.\n   * For union types, this may be multiple symbols.\n   * For instance types, this will return the constructor of\n   * that instance.\n   ",
      "child_ranges": [
        "(line 357,col 5)-(line 359,col 5)",
        "(line 361,col 5)-(line 361,col 50)",
        "(line 362,col 5)-(line 372,col 5)",
        "(line 373,col 5)-(line 373,col 55)",
        "(line 374,col 5)-(line 375,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getSymbolForTypeHelper(com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 389,
      "end_line": 422,
      "comment": "\n   * Gets all symbols associated with the given type.\n   * If there is more that one symbol associated with the given type,\n   * return null.\n   * @param type The type.\n   * @param linkToCtor If true, we should link instance types back\n   *     to their constructor function. If false, we should link\n   *     instance types back to their prototype. See the comments\n   *     at the top of this file for more information on how\n   *     our internal type system is more granular than Symbols.\n   ",
      "child_ranges": [
        "(line 390,col 5)-(line 392,col 5)",
        "(line 394,col 5)-(line 421,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.toDebugString()",
      "begin_line": 424,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 425,col 5)-(line 425,col 48)",
        "(line 426,col 5)-(line 428,col 5)",
        "(line 429,col 5)-(line 429,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.toDebugString(java.lang.StringBuilder, com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 432,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 433,col 5)-(line 433,col 37)",
        "(line 434,col 5)-(line 450,col 5)",
        "(line 452,col 5)-(line 452,col 21)",
        "(line 453,col 5)-(line 460,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.addScopes(java.util.Collection\u003cS\u003e)",
      "begin_line": 467,
      "end_line": 472,
      "comment": "\n   * Make sure all the given scopes in {@code otherSymbolTable}\n   * are in this symbol table.\n   ",
      "child_ranges": [
        "(line 469,col 5)-(line 471,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.findScopes(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 475,
      "end_line": 488,
      "comment": " Finds all the scopes and adds them to this symbol table. ",
      "child_ranges": [
        "(line 476,col 5)-(line 487,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Anonymous-5fcd0388-8d9f-4a5e-82ff-52e7f2940e2f.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Anonymous-0e404c6f-51a3-4bc1-8942-87e1863b41cf.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 485,
      "end_line": 486,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getAllScopes()",
      "begin_line": 491,
      "end_line": 493,
      "comment": " Gets all the scopes in this symbol table. ",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.addAnonymousFunctions()",
      "begin_line": 500,
      "end_line": 511,
      "comment": "\n   * Finds anonymous functions in local scopes, and gives them names\n   * and symbols. They will show up as local variables with names\n   * \"function%0\", \"function%1\", etc.\n   ",
      "child_ranges": [
        "(line 501,col 5)-(line 501,col 72)",
        "(line 502,col 5)-(line 506,col 5)",
        "(line 508,col 5)-(line 510,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.addAnonymousFunctionsInScope(com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 513,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 514,col 5)-(line 514,col 42)",
        "(line 515,col 5)-(line 531,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.addSymbolsFrom(com.google.javascript.rhino.jstype.StaticSymbolTable\u003cS, R\u003e)",
      "begin_line": 545,
      "end_line": 578,
      "comment": "\n   * Make sure all the symbols and references in {@code otherSymbolTable}\n   * are in this symbol table.\n   *\n   * Uniqueness of symbols and references is determined by the associated\n   * node.\n   *\n   * If multiple symbol tables are mixed in, we do not check for consistency\n   * between symbol tables. The first symbol we see dictates the type\n   * information for that symbol.\n   ",
      "child_ranges": [
        "(line 547,col 5)-(line 577,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.isAnySymbolDeclared(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 584,
      "end_line": 595,
      "comment": "\n   * Checks if any symbol is already declared at the given node and scope\n   * for the given name. If so, returns it.\n   ",
      "child_ranges": [
        "(line 586,col 5)-(line 586,col 45)",
        "(line 587,col 5)-(line 593,col 5)",
        "(line 594,col 5)-(line 594,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.findBestDeclToAdd(com.google.javascript.rhino.jstype.StaticSymbolTable\u003cS, R\u003e, S)",
      "begin_line": 598,
      "end_line": 613,
      "comment": " Helper for addSymbolsFrom, to determine the best declaration spot. ",
      "child_ranges": [
        "(line 601,col 5)-(line 601,col 57)",
        "(line 602,col 5)-(line 604,col 5)",
        "(line 606,col 5)-(line 610,col 5)",
        "(line 612,col 5)-(line 612,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.isGoodRefToAdd(com.google.javascript.rhino.jstype.StaticReference\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 619,
      "end_line": 624,
      "comment": "\n   * Helper for addSymbolsFrom, to determine whether a reference is\n   * acceptable. A reference must be in the normal source tree.\n   ",
      "child_ranges": [
        "(line 620,col 5)-(line 623,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.copySymbolTo(com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e, com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 626,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 627,col 5)-(line 627,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.copySymbolTo(com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 630,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 633,col 5)-(line 633,col 41)",
        "(line 634,col 5)-(line 636,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.addSymbol(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.jscomp.SymbolTable.SymbolScope, com.google.javascript.rhino.Node)",
      "begin_line": 639,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 642,col 5)-(line 642,col 60)",
        "(line 643,col 5)-(line 643,col 64)",
        "(line 644,col 5)-(line 646,col 74)",
        "(line 648,col 5)-(line 648,col 56)",
        "(line 649,col 5)-(line 651,col 71)",
        "(line 652,col 5)-(line 652,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.declareSymbol(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.jscomp.SymbolTable.SymbolScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 655,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 658,col 5)-(line 658,col 69)",
        "(line 659,col 5)-(line 659,col 30)",
        "(line 660,col 5)-(line 660,col 62)",
        "(line 661,col 5)-(line 661,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.removeSymbol(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 664,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 665,col 5)-(line 665,col 36)",
        "(line 666,col 5)-(line 668,col 5)",
        "(line 669,col 5)-(line 671,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.fillNamespaceReferences()",
      "begin_line": 681,
      "end_line": 730,
      "comment": "\n   * Not all symbol tables record references to \"namespace\" objects.\n   * For example, if you have:\n   * goog.dom.DomHelper \u003d function() {};\n   * The symbol table may not record that as a reference to \"goog.dom\",\n   * because that would be redundant.\n   ",
      "child_ranges": [
        "(line 682,col 5)-(line 729,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.fillPropertyScopes()",
      "begin_line": 732,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 734,col 5)-(line 734,col 46)",
        "(line 742,col 5)-(line 746,col 5)",
        "(line 757,col 5)-(line 758,col 62)",
        "(line 759,col 5)-(line 761,col 5)",
        "(line 763,col 5)-(line 763,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.needsPropertyScope(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 766,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 767,col 5)-(line 767,col 53)",
        "(line 768,col 5)-(line 770,col 5)",
        "(line 773,col 5)-(line 775,col 5)",
        "(line 781,col 5)-(line 783,col 5)",
        "(line 786,col 5)-(line 790,col 5)",
        "(line 792,col 5)-(line 792,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.pruneOrphanedNames()",
      "begin_line": 807,
      "end_line": 829,
      "comment": "\n   * Removes symbols where the namespace they\u0027re on has been removed.\n   *\n   * After filling property scopes, we may have two symbols represented\n   * in different ways. For example, \"A.superClass_.foo\" and B.prototype.foo\".\n   *\n   * This resolves that ambiguity by pruning the duplicates.\n   * If we have a lexical symbol with a constructor in its property\n   * chain, then we assume there\u0027s also a property path to this symbol.\n   * In other words, we can remove \"A.superClass_.foo\" because it\u0027s rooted\n   * at \"A\", and we built a property scope for \"A\" above.\n   ",
      "child_ranges": [
        "(line 808,col 5)-(line 828,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.fillPropertySymbols(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 856,
      "end_line": 859,
      "comment": "\n   * Create symbols and references for all properties of types in\n   * this symbol table.\n   *\n   * This gets a little bit tricky, because of the way this symbol table\n   * conflates \"type Foo\" and \"the constructor of type Foo\". So if you\n   * have:\n   *\n   * \u003ccode\u003e\n   * SymbolTable symbolTable \u003d for(\"var x \u003d new Foo();\");\n   * Symbol x \u003d symbolTable.getGlobalScope().getSlot(\"x\");\n   * Symbol type \u003d symbolTable.getAllSymbolsForType(x.getType()).get(0);\n   * \u003c/code\u003e\n   *\n   * Then type.getPropertyScope() will have the properties of the\n   * constructor \"Foo\". To get the properties of instances of \"Foo\",\n   * you will need to call:\n   *\n   * \u003ccode\u003e\n   * Symbol instance \u003d symbolTable.getSymbolForInstancesOf(type);\n   * \u003c/code\u003e\n   *\n   * As described at the top of this file, notice that \"new Foo()\" and\n   * \"Foo.prototype\" are represented by the same symbol.\n   ",
      "child_ranges": [
        "(line 858,col 5)-(line 858,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.fillJSDocInfo(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 862,
      "end_line": 914,
      "comment": " Index JSDocInfo. ",
      "child_ranges": [
        "(line 864,col 5)-(line 866,col 60)",
        "(line 869,col 5)-(line 913,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.createPropertyScopeFor(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 926,
      "end_line": 1003,
      "comment": "\n   * Build a property scope for the given symbol. Any properties of the symbol\n   * will be added to the property scope.\n   *\n   * It is important that property scopes are created in order from the leaves\n   * up to the root, so this should only be called from #fillPropertyScopes.\n   * If you try to create a property scope for a parent before its leaf,\n   * then the leaf will get cut and re-added to the parent property scope,\n   * and weird things will happen.\n   ",
      "child_ranges": [
        "(line 931,col 5)-(line 933,col 5)",
        "(line 935,col 5)-(line 935,col 43)",
        "(line 936,col 5)-(line 936,col 78)",
        "(line 937,col 5)-(line 939,col 5)",
        "(line 941,col 5)-(line 941,col 45)",
        "(line 942,col 5)-(line 948,col 5)",
        "(line 950,col 5)-(line 950,col 35)",
        "(line 951,col 5)-(line 951,col 60)",
        "(line 952,col 5)-(line 961,col 5)",
        "(line 963,col 5)-(line 963,col 76)",
        "(line 964,col 5)-(line 1002,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.fillThisReferences(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1008,
      "end_line": 1011,
      "comment": "\n   * Fill in references to \"this\" variables.\n   ",
      "child_ranges": [
        "(line 1010,col 5)-(line 1010,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.createScopeFrom(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1017,
      "end_line": 1047,
      "comment": "\n   * Given a scope from another symbol table, returns the {@code SymbolScope}\n   * rooted at the same node. Creates one if it doesn\u0027t exist yet.\n   ",
      "child_ranges": [
        "(line 1018,col 5)-(line 1018,col 51)",
        "(line 1019,col 5)-(line 1019,col 53)",
        "(line 1020,col 5)-(line 1045,col 5)",
        "(line 1046,col 5)-(line 1046,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Symbol",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.SimpleSlot"
      ],
      "begin_line": 1050,
      "end_line": 1154,
      "comment": " A symbol-table entry "
    },
    {
      "type": "field",
      "varNames": [
        "references"
      ],
      "begin_line": 1053,
      "end_line": 1053,
      "comment": " (and so the declaration always comes first)."
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 1055,
      "end_line": 1055,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyScope"
      ],
      "begin_line": 1057,
      "end_line": 1057,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declaration"
      ],
      "begin_line": 1059,
      "end_line": 1059,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "docInfo"
      ],
      "begin_line": 1061,
      "end_line": 1061,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "docScope"
      ],
      "begin_line": 1064,
      "end_line": 1064,
      "comment": " A scope for symbols that are only documented in JSDoc."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.Symbol(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 1066,
      "end_line": 1069,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 7)-(line 1067,col 34)",
        "(line 1068,col 7)-(line 1068,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.getDeclaration()",
      "begin_line": 1071,
      "end_line": 1074,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 7)-(line 1073,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.getFunctionType()",
      "begin_line": 1076,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1077,col 7)-(line 1077,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.defineReferenceAt(com.google.javascript.rhino.Node)",
      "begin_line": 1080,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1081,col 7)-(line 1081,col 43)",
        "(line 1082,col 7)-(line 1085,col 7)",
        "(line 1086,col 7)-(line 1086,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.setDeclaration(com.google.javascript.jscomp.SymbolTable.Reference)",
      "begin_line": 1090,
      "end_line": 1093,
      "comment": " Sets the declaration node. May only be called once. ",
      "child_ranges": [
        "(line 1091,col 7)-(line 1091,col 57)",
        "(line 1092,col 7)-(line 1092,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.inGlobalScope()",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1096,col 7)-(line 1096,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.inExterns()",
      "begin_line": 1099,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 7)-(line 1100,col 36)",
        "(line 1101,col 7)-(line 1101,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.getDeclarationNode()",
      "begin_line": 1104,
      "end_line": 1106,
      "comment": "",
      "child_ranges": [
        "(line 1105,col 7)-(line 1105,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.getSourceFileName()",
      "begin_line": 1108,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1109,col 7)-(line 1109,col 36)",
        "(line 1110,col 7)-(line 1110,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.getPropertyScope()",
      "begin_line": 1113,
      "end_line": 1115,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 7)-(line 1114,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.setPropertyScope(com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 1117,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1118,col 7)-(line 1118,col 33)",
        "(line 1119,col 7)-(line 1121,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.getJSDocInfo()",
      "begin_line": 1124,
      "end_line": 1127,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 7)-(line 1126,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.setJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 1129,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 7)-(line 1130,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.isProperty()",
      "begin_line": 1134,
      "end_line": 1136,
      "comment": " Whether this is a property of another variable. ",
      "child_ranges": [
        "(line 1135,col 7)-(line 1135,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.isLexicalVariable()",
      "begin_line": 1139,
      "end_line": 1141,
      "comment": " Whether this is a variable in a lexical scope. ",
      "child_ranges": [
        "(line 1140,col 7)-(line 1140,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.isDocOnlyParameter()",
      "begin_line": 1144,
      "end_line": 1146,
      "comment": " Whether this is a variable that\u0027s only in JSDoc. ",
      "child_ranges": [
        "(line 1145,col 7)-(line 1145,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Symbol.toString()",
      "begin_line": 1148,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1150,col 7)-(line 1150,col 36)",
        "(line 1151,col 7)-(line 1151,col 50)",
        "(line 1152,col 7)-(line 1152,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.SimpleReference\u003ccom.google.javascript.jscomp.SymbolTable.Symbol\u003e"
      ],
      "begin_line": 1157,
      "end_line": 1161,
      "comment": " Reference "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SymbolTable.Reference.Reference(com.google.javascript.jscomp.SymbolTable.Symbol, com.google.javascript.rhino.Node)",
      "begin_line": 1158,
      "end_line": 1160,
      "comment": "",
      "child_ranges": [
        "(line 1159,col 7)-(line 1159,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SymbolScope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 1164,
      "end_line": 1292,
      "comment": " Scope of a symbol "
    },
    {
      "type": "field",
      "varNames": [
        "rootNode"
      ],
      "begin_line": 1165,
      "end_line": 1165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1166,
      "end_line": 1166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeOfThis"
      ],
      "begin_line": 1167,
      "end_line": 1167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ownSymbols"
      ],
      "begin_line": 1168,
      "end_line": 1168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopeDepth"
      ],
      "begin_line": 1169,
      "end_line": 1169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "innerAnonFunctionsWithNames"
      ],
      "begin_line": 1172,
      "end_line": 1172,
      "comment": " The number of inner anonymous functions that we\u0027ve given names to."
    },
    {
      "type": "field",
      "varNames": [
        "mySymbol"
      ],
      "begin_line": 1175,
      "end_line": 1175,
      "comment": " The symbol associated with a property scope or doc scope."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.SymbolScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.SymbolTable.SymbolScope, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 1177,
      "end_line": 1187,
      "comment": "",
      "child_ranges": [
        "(line 1182,col 7)-(line 1182,col 31)",
        "(line 1183,col 7)-(line 1183,col 27)",
        "(line 1184,col 7)-(line 1184,col 35)",
        "(line 1185,col 7)-(line 1185,col 74)",
        "(line 1186,col 7)-(line 1186,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getSymbolForScope()",
      "begin_line": 1189,
      "end_line": 1191,
      "comment": "",
      "child_ranges": [
        "(line 1190,col 7)-(line 1190,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.setSymbolForScope(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 1193,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 7)-(line 1194,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getIndexOfSymbol(com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 1198,
      "end_line": 1201,
      "comment": " Gets a unique index for the symbol in this scope. ",
      "child_ranges": [
        "(line 1199,col 7)-(line 1200,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getRootNode()",
      "begin_line": 1203,
      "end_line": 1206,
      "comment": "",
      "child_ranges": [
        "(line 1205,col 7)-(line 1205,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getParentScope()",
      "begin_line": 1208,
      "end_line": 1211,
      "comment": "",
      "child_ranges": [
        "(line 1210,col 7)-(line 1210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getQualifiedSlot(java.lang.String)",
      "begin_line": 1217,
      "end_line": 1232,
      "comment": "\n     * Get the slot for a fully-qualified name (e.g., \"a.b.c\") by trying\n     * to find property scopes at each part of the path.\n     ",
      "child_ranges": [
        "(line 1218,col 7)-(line 1218,col 43)",
        "(line 1219,col 7)-(line 1221,col 7)",
        "(line 1223,col 7)-(line 1223,col 38)",
        "(line 1224,col 7)-(line 1229,col 7)",
        "(line 1231,col 7)-(line 1231,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getSlot(java.lang.String)",
      "begin_line": 1234,
      "end_line": 1246,
      "comment": "",
      "child_ranges": [
        "(line 1236,col 7)-(line 1236,col 36)",
        "(line 1237,col 7)-(line 1239,col 7)",
        "(line 1241,col 7)-(line 1241,col 69)",
        "(line 1242,col 7)-(line 1244,col 7)",
        "(line 1245,col 7)-(line 1245,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getOwnSlot(java.lang.String)",
      "begin_line": 1248,
      "end_line": 1251,
      "comment": "",
      "child_ranges": [
        "(line 1250,col 7)-(line 1250,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getTypeOfThis()",
      "begin_line": 1253,
      "end_line": 1256,
      "comment": "",
      "child_ranges": [
        "(line 1255,col 7)-(line 1255,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.isGlobalScope()",
      "begin_line": 1258,
      "end_line": 1260,
      "comment": "",
      "child_ranges": [
        "(line 1259,col 7)-(line 1259,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.isDocScope()",
      "begin_line": 1266,
      "end_line": 1269,
      "comment": "\n     * Returns whether this is a doc scope. A doc scope is a table for symbols\n     * that are documented solely within a JSDoc comment.\n     ",
      "child_ranges": [
        "(line 1267,col 7)-(line 1268,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.isPropertyScope()",
      "begin_line": 1271,
      "end_line": 1273,
      "comment": "",
      "child_ranges": [
        "(line 1272,col 7)-(line 1272,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.isLexicalScope()",
      "begin_line": 1275,
      "end_line": 1277,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 7)-(line 1276,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.getScopeDepth()",
      "begin_line": 1279,
      "end_line": 1281,
      "comment": "",
      "child_ranges": [
        "(line 1280,col 7)-(line 1280,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.SymbolScope.toString()",
      "begin_line": 1283,
      "end_line": 1291,
      "comment": "",
      "child_ranges": [
        "(line 1285,col 7)-(line 1285,col 29)",
        "(line 1286,col 7)-(line 1290,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyRefCollector",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 1294,
      "end_line": 1416,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1297,
      "end_line": 1297,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SymbolTable.PropertyRefCollector.PropertyRefCollector(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1299,
      "end_line": 1301,
      "comment": "",
      "child_ranges": [
        "(line 1300,col 7)-(line 1300,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.PropertyRefCollector.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1303,
      "end_line": 1309,
      "comment": "",
      "child_ranges": [
        "(line 1305,col 7)-(line 1308,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.PropertyRefCollector.maybeDefineReference(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 1311,
      "end_line": 1323,
      "comment": "",
      "child_ranges": [
        "(line 1315,col 7)-(line 1321,col 7)",
        "(line 1322,col 7)-(line 1322,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.PropertyRefCollector.tryDefineLexicalQualifiedNameRef(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 1326,
      "end_line": 1335,
      "comment": " Try to find the symbol by its fully qualified name.",
      "child_ranges": [
        "(line 1327,col 7)-(line 1333,col 7)",
        "(line 1334,col 7)-(line 1334,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.PropertyRefCollector.tryRemoveLexicalQualifiedNameRef(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 1339,
      "end_line": 1348,
      "comment": " If the symbol has no references left, remove it completely.",
      "child_ranges": [
        "(line 1340,col 7)-(line 1347,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.PropertyRefCollector.maybeDefineTypedReference(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1350,
      "end_line": 1375,
      "comment": "",
      "child_ranges": [
        "(line 1352,col 7)-(line 1373,col 7)",
        "(line 1374,col 7)-(line 1374,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.PropertyRefCollector.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1377,
      "end_line": 1415,
      "comment": "",
      "child_ranges": [
        "(line 1386,col 7)-(line 1414,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ThisRefCollector",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 1418,
      "end_line": 1515,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1421,
      "end_line": 1421,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thisStack"
      ],
      "begin_line": 1429,
      "end_line": 1429,
      "comment": " with some symbol for \u0027this\u0027."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SymbolTable.ThisRefCollector.ThisRefCollector(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1431,
      "end_line": 1433,
      "comment": "",
      "child_ranges": [
        "(line 1432,col 7)-(line 1432,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.ThisRefCollector.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1435,
      "end_line": 1441,
      "comment": "",
      "child_ranges": [
        "(line 1437,col 7)-(line 1440,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.ThisRefCollector.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 1443,
      "end_line": 1494,
      "comment": "",
      "child_ranges": [
        "(line 1445,col 7)-(line 1445,col 27)",
        "(line 1446,col 7)-(line 1491,col 7)",
        "(line 1493,col 7)-(line 1493,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.ThisRefCollector.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 1496,
      "end_line": 1499,
      "comment": "",
      "child_ranges": [
        "(line 1498,col 7)-(line 1498,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.ThisRefCollector.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1501,
      "end_line": 1514,
      "comment": "",
      "child_ranges": [
        "(line 1503,col 7)-(line 1505,col 7)",
        "(line 1507,col 7)-(line 1507,col 58)",
        "(line 1508,col 7)-(line 1513,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JSDocInfoCollector",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 1518,
      "end_line": 1587,
      "comment": " Collects references to types in JSDocInfo. "
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 1520,
      "end_line": 1520,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SymbolTable.JSDocInfoCollector.JSDocInfoCollector(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 1522,
      "end_line": 1524,
      "comment": "",
      "child_ranges": [
        "(line 1523,col 7)-(line 1523,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.JSDocInfoCollector.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1526,
      "end_line": 1538,
      "comment": "",
      "child_ranges": [
        "(line 1527,col 7)-(line 1537,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.JSDocInfoCollector.visitTypeNode(com.google.javascript.jscomp.SymbolTable.SymbolScope, com.google.javascript.rhino.Node)",
      "begin_line": 1540,
      "end_line": 1554,
      "comment": "",
      "child_ranges": [
        "(line 1541,col 7)-(line 1548,col 7)",
        "(line 1550,col 7)-(line 1553,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.JSDocInfoCollector.lookupPossiblyDottedName(com.google.javascript.jscomp.SymbolTable.SymbolScope, java.lang.String)",
      "begin_line": 1557,
      "end_line": 1586,
      "comment": " TODO(peterhal): @template types.",
      "child_ranges": [
        "(line 1559,col 7)-(line 1559,col 47)",
        "(line 1560,col 7)-(line 1560,col 27)",
        "(line 1561,col 7)-(line 1561,col 39)",
        "(line 1562,col 7)-(line 1575,col 7)",
        "(line 1577,col 7)-(line 1584,col 7)",
        "(line 1585,col 7)-(line 1585,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sourceNameOrdering"
      ],
      "begin_line": 1590,
      "end_line": 1591,
      "comment": " Comparators"
    },
    {
      "type": "field",
      "varNames": [
        "nodeOrdering"
      ],
      "begin_line": 1593,
      "end_line": 1606,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Anonymous-098267f3-387c-4481-bcb5-c9b1cce6bc26.compare(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1594,
      "end_line": 1605,
      "comment": "",
      "child_ranges": [
        "(line 1596,col 7)-(line 1597,col 56)",
        "(line 1598,col 7)-(line 1600,col 7)",
        "(line 1604,col 7)-(line 1604,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lexicalScopeOrdering"
      ],
      "begin_line": 1608,
      "end_line": 1616,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Anonymous-5883bee4-425b-4722-ac51-f03a4459382c.compare(com.google.javascript.jscomp.SymbolTable.SymbolScope, com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 1610,
      "end_line": 1615,
      "comment": "",
      "child_ranges": [
        "(line 1612,col 7)-(line 1613,col 66)",
        "(line 1614,col 7)-(line 1614,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "symbolOrdering"
      ],
      "begin_line": 1618,
      "end_line": 1634,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.Anonymous-66f6ffed-605e-4d48-bf25-559cb70e2128.compare(com.google.javascript.jscomp.SymbolTable.Symbol, com.google.javascript.jscomp.SymbolTable.Symbol)",
      "begin_line": 1619,
      "end_line": 1633,
      "comment": "",
      "child_ranges": [
        "(line 1621,col 7)-(line 1621,col 39)",
        "(line 1622,col 7)-(line 1622,col 39)",
        "(line 1625,col 7)-(line 1625,col 79)",
        "(line 1626,col 7)-(line 1628,col 7)",
        "(line 1632,col 7)-(line 1632,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SymbolTable.getLexicalScopeDepth(com.google.javascript.jscomp.SymbolTable.SymbolScope)",
      "begin_line": 1644,
      "end_line": 1653,
      "comment": "\n   * For a lexical scope, just returns the normal scope depth.\n   *\n   * For a property scope, returns the number of scopes we have to search\n   *     to find the nearest lexical scope, plus that lexical scope\u0027s depth.\n   *\n   * For a doc info scope, returns 0.\n   ",
      "child_ranges": [
        "(line 1645,col 5)-(line 1652,col 5)"
      ]
    }
  ]
}