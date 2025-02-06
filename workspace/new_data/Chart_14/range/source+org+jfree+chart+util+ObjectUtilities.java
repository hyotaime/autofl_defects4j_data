{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/ObjectUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 66,
      "end_line": 483,
      "comment": "\n * A collection of useful static utility methods for handling classes and object\n * instantiation.\n "
    },
    {
      "type": "field",
      "varNames": [
        "THREAD_CONTEXT"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * A constant for using the TheadContext as source for the classloader.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CLASS_CONTEXT"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * A constant for using the ClassContext as source for the classloader.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "classLoaderSource"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * By default use the thread context.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "classLoader"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * The custom classloader to be used (if not null).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ObjectUtilities.ObjectUtilities()",
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n     * Default constructor - private.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.getClassLoaderSource()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns the internal configuration entry, whether the classloader of\n     * the thread context or the context classloader should be used.\n     *\n     * @return the classloader source, either THREAD_CONTEXT or CLASS_CONTEXT.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.setClassLoaderSource(java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Defines the internal configuration entry, whether the classloader of\n     * the thread context or the context classloader should be used.\n     * \u003cp/\u003e\n     * This setting can only be defined using the API, there is no safe way\n     * to put this into an external configuration file.\n     *\n     * @param classLoaderSource the classloader source,\n     *                          either THREAD_CONTEXT or CLASS_CONTEXT.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.equal(java.lang.Object, java.lang.Object)",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the two objects are equal OR both \n     * \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param o1 object 1 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param o2 object 2 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.hashCode(java.lang.Object)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "\n     * Returns a hash code for an object, or zero if the object is \n     * \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param object the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @return The object\u0027s hash code (or zero if the object is\n     *         \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 23)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.clone(java.lang.Object)",
      "begin_line": 160,
      "end_line": 188,
      "comment": "\n     * Returns a clone of the specified object, if it can be cloned, otherwise\n     * throws a CloneNotSupportedException.\n     *\n     * @param object the object to clone (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @return A clone of the specified object.\n     * @throws CloneNotSupportedException if the object cannot be cloned.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.deepClone(java.util.Collection)",
      "begin_line": 200,
      "end_line": 223,
      "comment": "\n     * Returns a new collection containing clones of all the items in the\n     * specified collection.\n     *\n     * @param collection the collection (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @return A new collection containing clones of all the items in the \n     *         specified collection.\n     * @throws CloneNotSupportedException if any of the items in the collection\n     *                                    cannot be cloned.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 209,col 9)-(line 210,col 61)",
        "(line 211,col 9)-(line 211,col 23)",
        "(line 212,col 9)-(line 212,col 56)",
        "(line 213,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.setClassLoader(java.lang.ClassLoader)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * Redefines the custom classloader.\n     *\n     * @param classLoader the new classloader or null to use the default.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.getClassLoader()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Returns the custom classloader or null, if no custom classloader is defined.\n     *\n     * @return the custom classloader or null to use the default.\n     ",
      "child_ranges": [
        "(line 241,col 7)-(line 241,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.getClassLoader(java.lang.Class)",
      "begin_line": 254,
      "end_line": 274,
      "comment": "\n     * Returns the classloader, which was responsible for loading the given\n     * class.\n     *\n     * @param c the classloader, either an application class loader or the\n     *          boot loader.\n     * @return the classloader, never null.\n     * @throws SecurityException if the SecurityManager does not allow to grab\n     *                           the context classloader.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 264,col 9)",
        "(line 267,col 9)-(line 267,col 61)",
        "(line 268,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.getResource(java.lang.String, java.lang.Class)",
      "begin_line": 284,
      "end_line": 290,
      "comment": "\n     * Returns the resource specified by the \u003cstrong\u003eabsolute\u003c/strong\u003e name.\n     *\n     * @param name the name of the resource\n     * @param c    the source class\n     * @return the url of the resource or null, if not found.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 49)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.getResourceRelative(java.lang.String, java.lang.Class)",
      "begin_line": 299,
      "end_line": 306,
      "comment": "\n     * Returns the resource specified by the \u003cstrong\u003erelative\u003c/strong\u003e name.\n     *\n     * @param name the name of the resource relative to the given class\n     * @param c    the source class\n     * @return the url of the resource or null, if not found.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 301,col 50)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.convertName(java.lang.String, java.lang.Class)",
      "begin_line": 318,
      "end_line": 337,
      "comment": "\n     * Transform the class-relative resource name into a global name by \n     * appending it to the classes package name. If the name is already a \n     * global name (the name starts with a \"/\"), then the name is returned \n     * unchanged.\n     *\n     * @param name the resource name\n     * @param c    the class which the resource is relative to\n     * @return the tranformed name.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 322,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 44)",
        "(line 330,col 9)-(line 330,col 52)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 60)",
        "(line 336,col 9)-(line 336,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.getResourceAsStream(java.lang.String, java.lang.Class)",
      "begin_line": 347,
      "end_line": 360,
      "comment": "\n     * Returns the inputstream for the resource specified by the\n     * \u003cstrong\u003eabsolute\u003c/strong\u003e name.\n     *\n     * @param name the name of the resource\n     * @param context the source class\n     * @return the url of the resource or null, if not found.\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 51)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.getResourceRelativeAsStream(java.lang.String, java.lang.Class)",
      "begin_line": 370,
      "end_line": 383,
      "comment": "\n     * Returns the inputstream for the resource specified by the\n     * \u003cstrong\u003erelative\u003c/strong\u003e name.\n     *\n     * @param name the name of the resource relative to the given class\n     * @param context the source class\n     * @return the url of the resource or null, if not found.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 59)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.loadAndInstantiate(java.lang.String, java.lang.Class)",
      "begin_line": 393,
      "end_line": 403,
      "comment": "\n     * Tries to create a new instance of the given class. This is a short cut\n     * for the common bean instantiation code.\n     *\n     * @param className the class name as String, never null.\n     * @param source    the source class, from where to get the classloader.\n     * @return the instantiated object or null, if an error occured.\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.loadAndInstantiate(java.lang.String, java.lang.Class, java.lang.Class)",
      "begin_line": 417,
      "end_line": 431,
      "comment": "\n     * Tries to create a new instance of the given class. This is a short cut\n     * for the common bean instantiation code. This method is a type-safe method\n     * and will not instantiate the class unless it is an instance of the given\n     * type.\n     *\n     * @param className the class name as String, never null.\n     * @param source    the source class, from where to get the classloader.\n     * @param type  the type.\n     * \n     * @return the instantiated object or null, if an error occured.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.isJDK14()",
      "begin_line": 438,
      "end_line": 469,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if we are running on JRE 1.4 or later.\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 67)",
        "(line 440,col 9)-(line 451,col 9)",
        "(line 454,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ObjectUtilities.parseVersions(java.lang.String)",
      "begin_line": 471,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 472,col 7)-(line 474,col 7)",
        "(line 476,col 7)-(line 476,col 43)",
        "(line 477,col 7)-(line 477,col 65)",
        "(line 478,col 7)-(line 480,col 7)",
        "(line 481,col 7)-(line 481,col 70)"
      ]
    }
  ]
}