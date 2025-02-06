{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SourceFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceFile",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticSourceFile",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 536,
      "comment": "\n * An abstract representation of a source file that provides access to\n * language-neutral features. The source file can be loaded from various\n * locations, such as from disk or from a preloaded string.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Generator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 51,
      "comment": " A JavaScript source code provider.  The value should\n   * be cached so that the source text stays consistent throughout a single\n   * compile. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Generator.getCode()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "SOURCE_EXCERPT_REGION_LENGTH"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n   * Number of lines in the region returned by {@link #getRegion(int)}.\n   * This length must be odd.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExternFile"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalPath"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " from a Jar, it could be the path to the Jar."
    },
    {
      "type": "field",
      "varNames": [
        "lineOffsets"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Source Line Information"
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SourceFile.SourceFile(java.lang.String)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\n   * Construct a new abstract source file.\n   *\n   * @param fileName The file name of the source file. It does not necessarily\n   *     need to correspond to a real path. But it should be unique. Will\n   *     appear in warning messages emitted by the compiler.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 84,col 5)",
        "(line 85,col 5)-(line 85,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getLineOffset(int)",
      "begin_line": 88,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 22)",
        "(line 91,col 5)-(line 95,col 5)",
        "(line 96,col 5)-(line 96,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getNumLines()",
      "begin_line": 100,
      "end_line": 103,
      "comment": " @return The number of lines in this source file. ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 22)",
        "(line 102,col 5)-(line 102,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.findLineOffsets()",
      "begin_line": 106,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 109,col 5)",
        "(line 110,col 5)-(line 120,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getCode()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n   * Gets all the code in this source file.\n   * @throws IOException\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getCodeReader()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n   * Gets a reader for the code in this source file.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getCodeNoCache()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.setCode(java.lang.String)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getOriginalPath()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.setOriginalPath(java.lang.String)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.clearCachedSource()",
      "begin_line": 163,
      "end_line": 166,
      "comment": " contents after the compile is a fine thing to do.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.hasSourceInMemory()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getName()",
      "begin_line": 173,
      "end_line": 176,
      "comment": " Returns a unique name for the source file. ",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.isExtern()",
      "begin_line": 179,
      "end_line": 182,
      "comment": " Returns whether this is an extern. ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.setIsExtern(boolean)",
      "begin_line": 185,
      "end_line": 187,
      "comment": " Sets that this is an extern. ",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getLineOfOffset(int)",
      "begin_line": 189,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 22)",
        "(line 192,col 5)-(line 192,col 58)",
        "(line 193,col 5)-(line 198,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getColumnOfOffset(int)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 39)",
        "(line 204,col 5)-(line 204,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getLine(int)",
      "begin_line": 215,
      "end_line": 248,
      "comment": "\n   * Gets the source line for the indicated line number.\n   *\n   * @param lineNumber the line number, 1 being the first line of the file.\n   * @return The line indicated. Does not include the newline at the end\n   *     of the file. Returns {@code null} if it does not exist,\n   *     or if there was an IO exception.\n   ",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 22)",
        "(line 217,col 5)-(line 219,col 5)",
        "(line 221,col 5)-(line 223,col 5)",
        "(line 225,col 5)-(line 225,col 42)",
        "(line 226,col 5)-(line 226,col 19)",
        "(line 227,col 5)-(line 234,col 5)",
        "(line 236,col 5)-(line 247,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.getRegion(int)",
      "begin_line": 259,
      "end_line": 299,
      "comment": "\n   * Get a region around the indicated line number. The exact definition of a\n   * region is implementation specific, but it must contain the line indicated\n   * by the line number. A region must not start or end by a carriage return.\n   *\n   * @param lineNumber the line number, 1 being the first line of the file.\n   * @return The line indicated. Returns {@code null} if it does not exist,\n   *     or if there was an IO exception.\n   ",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 19)",
        "(line 261,col 5)-(line 265,col 5)",
        "(line 266,col 5)-(line 266,col 16)",
        "(line 267,col 5)-(line 268,col 65)",
        "(line 269,col 5)-(line 275,col 5)",
        "(line 276,col 5)-(line 276,col 18)",
        "(line 277,col 5)-(line 277,col 28)",
        "(line 278,col 5)-(line 284,col 5)",
        "(line 285,col 5)-(line 287,col 5)",
        "(line 288,col 5)-(line 298,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.toString()",
      "begin_line": 301,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromFile(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromFile(java.lang.String)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromFile(java.io.File, java.nio.charset.Charset)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromFile(java.io.File)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromCode(java.lang.String, java.lang.String)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 5)-(line 323,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromCode(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 326,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 328,col 5)-(line 329,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 332,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromInputStream(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 337,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 340,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromReader(java.lang.String, java.io.Reader)",
      "begin_line": 343,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.fromGenerator(java.lang.String, com.google.javascript.jscomp.SourceFile.Generator)",
      "begin_line": 348,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.builder()",
      "begin_line": 354,
      "end_line": 356,
      "comment": " Create a new builder for source files. ",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 364,
      "end_line": 409,
      "comment": "\n   * A builder interface for source files.\n   *\n   * Allows users to customize the Charset, and the original path of\n   * the source file (if it differs from the path on disk).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalPath"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.Builder()",
      "begin_line": 368,
      "end_line": 368,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.withCharset(java.nio.charset.Charset)",
      "begin_line": 371,
      "end_line": 374,
      "comment": " Set the charset to use when reading from an input stream or file. ",
      "child_ranges": [
        "(line 372,col 7)-(line 372,col 29)",
        "(line 373,col 7)-(line 373,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.withOriginalPath(java.lang.String)",
      "begin_line": 377,
      "end_line": 380,
      "comment": " Set the original path to use. ",
      "child_ranges": [
        "(line 378,col 7)-(line 378,col 39)",
        "(line 379,col 7)-(line 379,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.buildFromFile(java.lang.String)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 383,col 7)-(line 383,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.buildFromFile(java.io.File)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 387,col 7)-(line 387,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.buildFromCode(java.lang.String, java.lang.String)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 7)-(line 391,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.buildFromInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 394,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 396,col 7)-(line 397,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.buildFromReader(java.lang.String, java.io.Reader)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 7)-(line 402,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Builder.buildFromGenerator(java.lang.String, com.google.javascript.jscomp.SourceFile.Generator)",
      "begin_line": 405,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 7)-(line 407,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Preloaded",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceFile"
      ],
      "begin_line": 418,
      "end_line": 426,
      "comment": "\n   * A source file where the code has been preloaded.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SourceFile.Preloaded.Preloaded(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 421,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 422,col 7)-(line 422,col 22)",
        "(line 423,col 7)-(line 423,col 42)",
        "(line 424,col 7)-(line 424,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Generated",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceFile"
      ],
      "begin_line": 432,
      "end_line": 460,
      "comment": "\n   * A source file where the code will be dynamically generated\n   * from the injected interface.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SourceFile.Generated.Generated(java.lang.String, java.lang.String, com.google.javascript.jscomp.SourceFile.Generator)",
      "begin_line": 437,
      "end_line": 441,
      "comment": " Not private, so that LazyInput can extend it.",
      "child_ranges": [
        "(line 438,col 7)-(line 438,col 22)",
        "(line 439,col 7)-(line 439,col 42)",
        "(line 440,col 7)-(line 440,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Generated.getCode()",
      "begin_line": 443,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 445,col 7)-(line 445,col 42)",
        "(line 447,col 7)-(line 450,col 7)",
        "(line 451,col 7)-(line 451,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.Generated.clearCachedSource()",
      "begin_line": 456,
      "end_line": 459,
      "comment": " regenerate it if we ever need it again.",
      "child_ranges": [
        "(line 458,col 7)-(line 458,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnDisk",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceFile"
      ],
      "begin_line": 467,
      "end_line": 535,
      "comment": "\n   * A source file where the code is only read into memory if absolutely\n   * necessary. We will try to delay loading the code into memory as long as\n   * possible.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputCharset"
      ],
      "begin_line": 474,
      "end_line": 474,
      "comment": " Default input file format for JSCompiler has always been UTF_8."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SourceFile.OnDisk.OnDisk(java.io.File, java.lang.String, java.nio.charset.Charset)",
      "begin_line": 476,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 477,col 7)-(line 477,col 28)",
        "(line 478,col 7)-(line 478,col 23)",
        "(line 479,col 7)-(line 479,col 42)",
        "(line 480,col 7)-(line 482,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.OnDisk.getCode()",
      "begin_line": 485,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 487,col 7)-(line 487,col 42)",
        "(line 489,col 7)-(line 492,col 7)",
        "(line 493,col 7)-(line 493,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.OnDisk.getCodeReader()",
      "begin_line": 499,
      "end_line": 507,
      "comment": "\n     * Gets a reader for the code in this source file.\n     ",
      "child_ranges": [
        "(line 501,col 7)-(line 506,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.OnDisk.clearCachedSource()",
      "begin_line": 511,
      "end_line": 514,
      "comment": " if we need it again.",
      "child_ranges": [
        "(line 513,col 7)-(line 513,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.OnDisk.setCharset(java.nio.charset.Charset)",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\n     * Store the Charset specification as the string version of the name,\n     * rather than the Charset itself.  This allows us to serialize the\n     * SourceFile class.\n     * @param c charset to use when reading the input.\n     ",
      "child_ranges": [
        "(line 523,col 7)-(line 523,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceFile.OnDisk.getCharset()",
      "begin_line": 532,
      "end_line": 534,
      "comment": "\n     * Get the Charset specifying how we\u0027re supposed to read the file\n     * in off disk and into UTF-16.  This is stored as a strong to allow\n     * SourceFile to be serialized.\n     * @return Charset object representing charset to use.\n     ",
      "child_ranges": [
        "(line 533,col 7)-(line 533,col 43)"
      ]
    }
  ]
}