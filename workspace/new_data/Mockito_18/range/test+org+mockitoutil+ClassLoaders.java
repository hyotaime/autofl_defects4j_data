{
  "filepath": "/tmp/Mockito-18b/test/org/mockitoutil/ClassLoaders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassLoaders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.ClassLoaders.ClassLoaders()",
      "begin_line": 21,
      "end_line": 21,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.isolatedClassLoader()",
      "begin_line": 23,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.excludingClassLoader()",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.inMemoryClassLoader()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.in(java.lang.ClassLoader)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.jdkClassLoader()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.systemClassLoader()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.currentClassLoader()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.build()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "IsolatedURLClassLoaderBuilder",
      "is_interface": false,
      "parent_types": [
        "org.mockitoutil.ClassLoaders"
      ],
      "begin_line": 53,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "privateCopyPrefixes"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeSourceUrls"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.IsolatedURLClassLoaderBuilder.withPrivateCopyOf(java.lang.String...)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 64)",
        "(line 59,col 13)-(line 59,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.IsolatedURLClassLoaderBuilder.withCodeSourceUrls(java.lang.String...)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 53)",
        "(line 64,col 13)-(line 64,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.IsolatedURLClassLoaderBuilder.withCodeSourceUrlOf(java.lang.Class\u003c?\u003e...)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 70,col 13)",
        "(line 71,col 13)-(line 71,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.IsolatedURLClassLoaderBuilder.withCurrentCodeSourceUrls()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 80)",
        "(line 76,col 13)-(line 76,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.IsolatedURLClassLoaderBuilder.build()",
      "begin_line": 79,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 84,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalIsolatedURLClassLoader",
      "is_interface": false,
      "parent_types": [
        "java.net.URLClassLoader"
      ],
      "begin_line": 88,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "privateCopyPrefixes"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.ClassLoaders.LocalIsolatedURLClassLoader.LocalIsolatedURLClassLoader(java.lang.ClassLoader, java.net.URL[], java.util.ArrayList\u003cjava.lang.String\u003e)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 37)",
        "(line 93,col 13)-(line 93,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.LocalIsolatedURLClassLoader.findClass(java.lang.String)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 72)",
        "(line 99,col 13)-(line 99,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.LocalIsolatedURLClassLoader.classShouldBePrivate(java.lang.String)",
      "begin_line": 102,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 105,col 13)",
        "(line 106,col 13)-(line 106,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExcludingURLClassLoaderBuilder",
      "is_interface": false,
      "parent_types": [
        "org.mockitoutil.ClassLoaders"
      ],
      "begin_line": 110,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "privateCopyPrefixes"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeSourceUrls"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ExcludingURLClassLoaderBuilder.without(java.lang.String...)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 64)",
        "(line 116,col 13)-(line 116,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ExcludingURLClassLoaderBuilder.withCodeSourceUrls(java.lang.String...)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 53)",
        "(line 121,col 13)-(line 121,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ExcludingURLClassLoaderBuilder.withCodeSourceUrlOf(java.lang.Class\u003c?\u003e...)",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 127,col 13)",
        "(line 128,col 13)-(line 128,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ExcludingURLClassLoaderBuilder.withCurrentCodeSourceUrls()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 80)",
        "(line 133,col 13)-(line 133,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ExcludingURLClassLoaderBuilder.build()",
      "begin_line": 136,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 141,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalExcludingURLClassLoader",
      "is_interface": false,
      "parent_types": [
        "java.net.URLClassLoader"
      ],
      "begin_line": 145,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "privateCopyPrefixes"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.ClassLoaders.LocalExcludingURLClassLoader.LocalExcludingURLClassLoader(java.lang.ClassLoader, java.net.URL[], java.util.ArrayList\u003cjava.lang.String\u003e)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 37)",
        "(line 150,col 13)-(line 150,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.LocalExcludingURLClassLoader.findClass(java.lang.String)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 142)",
        "(line 156,col 13)-(line 156,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.LocalExcludingURLClassLoader.classShouldBePrivate(java.lang.String)",
      "begin_line": 159,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 162,col 13)",
        "(line 163,col 13)-(line 163,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InMemoryClassLoaderBuilder",
      "is_interface": false,
      "parent_types": [
        "org.mockitoutil.ClassLoaders"
      ],
      "begin_line": 167,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inMemoryClassObjects"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoaderBuilder.withParent(java.lang.ClassLoader)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 33)",
        "(line 172,col 13)-(line 172,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoaderBuilder.withClassDefinition(java.lang.String, byte[])",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 60)",
        "(line 177,col 13)-(line 177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoaderBuilder.build()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 181,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InMemoryClassLoader",
      "is_interface": false,
      "parent_types": [
        "java.lang.ClassLoader"
      ],
      "begin_line": 185,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SCHEME"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inMemoryClassObjects"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoader.InMemoryClassLoader(java.lang.ClassLoader, java.util.Map\u003cjava.lang.String, byte[]\u003e)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 26)",
        "(line 191,col 13)-(line 191,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoader.findClass(java.lang.String)",
      "begin_line": 194,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 68)",
        "(line 196,col 13)-(line 198,col 13)",
        "(line 199,col 13)-(line 199,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoader.getResources(java.lang.String)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoader.inMemoryOnly()",
      "begin_line": 207,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 68)",
        "(line 209,col 13)-(line 224,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "memHandler"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "it"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoader.Anonymous-281699a2-d23b-48e8-9cc1-20d8d2b4fdc1.hasMoreElements()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 21)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.InMemoryClassLoader.Anonymous-589cef2f-a434-4cf1-8e7b-2935c4eae2b3.nextElement()",
      "begin_line": 217,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 218,col 21)-(line 222,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MemHandler",
      "is_interface": false,
      "parent_types": [
        "java.net.URLStreamHandler"
      ],
      "begin_line": 228,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inMemoryClassLoader"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.ClassLoaders.MemHandler.MemHandler(org.mockitoutil.ClassLoaders.InMemoryClassLoader)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.MemHandler.openConnection(java.net.URL)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MemURLConnection",
      "is_interface": false,
      "parent_types": [
        "java.net.URLConnection"
      ],
      "begin_line": 240,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inMemoryClassLoader"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "qualifiedName"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.ClassLoaders.MemHandler.MemURLConnection.MemURLConnection(java.net.URL, org.mockitoutil.ClassLoaders.InMemoryClassLoader)",
      "begin_line": 243,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 244,col 17)-(line 244,col 27)",
        "(line 245,col 17)-(line 245,col 63)",
        "(line 246,col 17)-(line 246,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.MemHandler.MemURLConnection.connect()",
      "begin_line": 248,
      "end_line": 249,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.MemHandler.MemURLConnection.getInputStream()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 17)-(line 253,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.obtainClassPathOf(java.lang.String)",
      "begin_line": 258,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 61)",
        "(line 260,col 9)-(line 260,col 92)",
        "(line 262,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.pathsToURLs(java.lang.String...)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.pathsToURLs(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 273,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 72)",
        "(line 275,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.pathToUrl(java.lang.String)",
      "begin_line": 282,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReachableClassesFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 290,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classLoader"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "qualifiedNameSubstring"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.ClassLoaders.ReachableClassesFinder.ReachableClassesFinder(java.lang.ClassLoader)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ReachableClassesFinder.omit(java.lang.String...)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 86)",
        "(line 300,col 13)-(line 300,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ReachableClassesFinder.listOwnedClasses()",
      "begin_line": 303,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 66)",
        "(line 306,col 13)-(line 306,col 56)",
        "(line 307,col 13)-(line 317,col 13)",
        "(line 318,col 13)-(line 318,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ReachableClassesFinder.addFromFileBasedClassLoader(java.util.Set\u003cjava.lang.String\u003e, java.net.URI)",
      "begin_line": 321,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 322,col 13)-(line 322,col 38)",
        "(line 323,col 13)-(line 323,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ReachableClassesFinder.addFromInMemoryBasedClassLoader(java.util.Set\u003cjava.lang.String\u003e, java.net.URI)",
      "begin_line": 326,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 63)",
        "(line 328,col 13)-(line 330,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ReachableClassesFinder.findClassQualifiedNames(java.io.File, java.io.File, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 334,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 349,col 13)",
        "(line 350,col 13)-(line 350,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ReachableClassesFinder.excludes(java.lang.String, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 353,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 354,col 13)-(line 356,col 13)",
        "(line 357,col 13)-(line 357,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoaders.ReachableClassesFinder.classNameFor(java.io.File, java.io.File)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 114)",
        "(line 362,col 13)-(line 362,col 74)"
      ]
    }
  ]
}