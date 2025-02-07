{
  "filepath": "/tmp/Mockito-18b/test/org/mockitoutil/SimplePerRealmReloadingClassLoader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplePerRealmReloadingClassLoader",
      "is_interface": false,
      "parent_types": [
        "java.net.URLClassLoader"
      ],
      "begin_line": 15,
      "end_line": 118,
      "comment": "\n * Custom classloader to load classes in hierarchic realm.\n *\n * Each class can be reloaded in the realm if the LoadClassPredicate says so.\n "
    },
    {
      "type": "field",
      "varNames": [
        "classHashMap"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reloadClassPredicate"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.SimplePerRealmReloadingClassLoader(org.mockitoutil.SimplePerRealmReloadingClassLoader.ReloadClassPredicate)",
      "begin_line": 20,
      "end_line": 23,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 43)",
        "(line 22,col 9)-(line 22,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.SimplePerRealmReloadingClassLoader(java.lang.ClassLoader, org.mockitoutil.SimplePerRealmReloadingClassLoader.ReloadClassPredicate)",
      "begin_line": 25,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 62)",
        "(line 27,col 9)-(line 27,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.getPossibleClassPathsUrls()",
      "begin_line": 30,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 35,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.obtainClassPath()",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 78)",
        "(line 40,col 9)-(line 40,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.obtainClassPath(java.lang.String)",
      "begin_line": 43,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 61)",
        "(line 45,col 9)-(line 45,col 114)",
        "(line 47,col 9)-(line 51,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.loadClass(java.lang.String)",
      "begin_line": 56,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.saveFoundClass(java.lang.String, java.lang.Class\u003c?\u003e)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.useParentClassLoaderFor(java.lang.String)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.doInRealm(java.lang.String)",
      "begin_line": 82,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 77)",
        "(line 84,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 151)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.doInRealm(java.lang.String, java.lang.Class[], java.lang.Object[])",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 77)",
        "(line 100,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 151)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReloadClassPredicate",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 115,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.SimplePerRealmReloadingClassLoader.ReloadClassPredicate.acceptReloadOf(java.lang.String)",
      "begin_line": 116,
      "end_line": 116,
      "comment": "",
      "child_ranges": []
    }
  ]
}